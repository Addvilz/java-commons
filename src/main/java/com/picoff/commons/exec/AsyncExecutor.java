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

import java.util.concurrent.BlockingQueue;

/**
 * An object that executes submitted worker tasks asynchronously.
 */
@FunctionalInterface
public interface AsyncExecutor {
    /**
     * Submit given invokable to be executed in the context of this executor.
     *
     * @param worker        Workload invokable to execute.
     * @param resultHandler Callback handler to receive the result when workload has been executed.
     */
    void submit(
        final Handler<ProcedureResultHandler> worker,
        final ProcedureResultHandler resultHandler
    );

    /**
     * Signal the executor to shutdown, if possible - gracefully, including executing all the tasks
     * remaining in the execution queue, if any.
     */
    default void signalShutdown() {
        //NO-OP
    }

    default AsyncExecutor create(
        final int poolSize,
        final BlockingQueue<AsyncTask> tasks,
        final String poolPrefix
    ) {
        return new BasicAsyncExecutor(poolSize, tasks, poolPrefix);
    }
}
