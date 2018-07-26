/*
 * Copyright (c) 2018 Picoff Ventures and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.picoff.commons.exec;

import com.picoff.commons.functional.Handler;
import com.picoff.commons.functional.ProcedureResultHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
import java.util.stream.Collectors;

public class BasicAsyncExecutor implements AsyncExecutor {
    private static final Logger LOGGER = LoggerFactory.getLogger(BasicAsyncExecutor.class);
    private static final Object O = new Object();
    private static final RejectedExecutionException CAUSE_REJECTED = new RejectedExecutionException();
    private static final long TICK_PARK_NANOS = TimeUnit.MILLISECONDS.toNanos(100);

    static {
        CAUSE_REJECTED.setStackTrace(new StackTraceElement[0]);
    }

    private final ThreadFactory threadFactory;
    private final BlockingQueue<AsyncTask> tasks;
    private final WeakHashMap<Thread, Object> workers = new WeakHashMap<>();
    private final AtomicBoolean shutdown = new AtomicBoolean(false);
    private final AtomicInteger threadId = new AtomicInteger();
    private final Thread monitor;
    private final String poolPrefix;
    private long windDownScale = TimeUnit.MILLISECONDS.toNanos(100);
    private long windDownDelay = TimeUnit.MICROSECONDS.toNanos(500);

    public BasicAsyncExecutor(
        final int poolSize,
        final BlockingQueue<AsyncTask> tasks,
        final String poolPrefix
    ) {
        this.poolPrefix = poolPrefix;

        this.threadFactory = runnable -> {
            final Thread thread = new AsyncReferenceThread(runnable, this);
            thread.setDaemon(true);
            thread.setName(String.format(poolPrefix, threadId.incrementAndGet()));
            return thread;
        };

        this.tasks = tasks;

        if (workers.size() < poolSize) {
            spawnWorkers(poolSize);
        }

        this.monitor = new AsyncReferenceThread(() -> monitorWorker(poolSize), this);
        this.monitor.start();

        Runtime.getRuntime().addShutdownHook(new Thread(this::signalShutdown));
    }

    private void monitorWorker(final int poolSize) {
        while (true) {
            // Collect the dead
            final List<Thread> collect = workers.keySet()
                .stream()
                .filter(worker -> !worker.isAlive())
                .collect(Collectors.toList());

            collect.forEach(workers::remove);

            if (workers.size() < poolSize) {
                spawnWorkers(poolSize);
            }

            LockSupport.parkNanos(TICK_PARK_NANOS);

            if (shutdown.get() || monitor.isInterrupted()) {
                monitor.interrupt();
                return;
            }
        }
    }

    private void spawnWorkers(final int coreSize) {
        for (int i = 0; i < coreSize; i++) {
            final Thread thread = threadFactory.newThread(this::workerWork);
            thread.setUncaughtExceptionHandler(this::handleThreadException);
            thread.start();
            workers.put(thread, O);
        }
    }

    private void handleThreadException(final Thread thread, final Throwable throwable) {
        LOGGER.error(String.format(
            "Uncaught exception in async executor worker thread %s", thread.getName()
        ), throwable);
    }

    private void workerWork() {
        long windDownGate = System.nanoTime();

        while (true) {
            final AsyncTask task = tasks.poll();

            if (null == task) {
                long parkTime = System.nanoTime() > windDownGate ? windDownDelay : 1;
                LockSupport.parkNanos(parkTime);
                continue;
            }

            windDownGate = System.nanoTime() + windDownScale;

            try {
                task.run();
            } catch (final Throwable t) {
                try {
                    task.onComplete.fail(t);
                } catch (final Throwable tt) {
                    tt.printStackTrace();
                    // LOG
                }
            }

            if (shutdown.get() || Thread.currentThread().isInterrupted()) {
                // Park for N nanos, look at the head of the queue, return gracefully if queue is empty.
                LockSupport.parkNanos(1000);

                if (null == tasks.peek()) {
                    return;
                }
            }
        }
    }

    @Override
    public void signalShutdown() {
        if (shutdown.get()) {
            return;
        }
        LOGGER.info("Gracefully shutting down executor {}", this.toString());
        shutdown.set(true);
    }

    @Override
    public void submit(
        final Handler<ProcedureResultHandler> worker,
        final ProcedureResultHandler resultHandler
    ) {
        if (shutdown.get()) {
            resultHandler.fail(CAUSE_REJECTED);
            return;
        }

        final AsyncTask asyncTask = new AsyncTask(worker, resultHandler);

        if (!tasks.offer(asyncTask)) {
            resultHandler.fail(CAUSE_REJECTED);
        }
    }

    public Thread getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return String.format("BasicAsyncExecutor{poolPrefix='%s'}", poolPrefix);
    }
}
