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

package com.picoff.commons.pipeline;


import com.picoff.commons.functional.ProcedureResult;
import com.picoff.commons.functional.ProcedureResultHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BasicSequentialPipeline<T> implements EventPipeline<T> {
    private final List<PipelineStage> stages = new ArrayList<>();
    private final EventPipeline<T> failurePipeline;

    public BasicSequentialPipeline(final EventPipeline<T> failurePipeline) {
        this.failurePipeline = failurePipeline;
    }

    public BasicSequentialPipeline() {
        this.failurePipeline = null;
    }

    @Override
    public EventPipeline then(final PipelineStage pipelineStage) {
        stages.add(pipelineStage);
        return this;
    }

    @Override
    public void clear() {
        stages.clear();
    }

    @Override
    public EventPipeline submit(final T subject, final ProcedureResultHandler onTransitComplete) {
        if (stages.isEmpty()) {
            onTransitComplete.fail("No stages defined");
            return this;
        }

        final PipelineContext<T> context = new PipelineContext<>(
            subject,
            result -> handleComplete(subject, onTransitComplete, result)
        );

        final AtomicInteger stage = new AtomicInteger(-1);
        process(context, stage, result -> handleResult(context, stage, result));

        return this;
    }

    private void handleComplete(
        final T subject,
        final ProcedureResultHandler onTransitComplete,
        final ProcedureResult result
    ) {
        if (result.failed()) {
            if (failurePipeline == null) {
                onTransitComplete.handle(result);
            } else {
                failurePipeline.submit(subject, onTransitComplete);
            }
        } else {
            onTransitComplete.handle(result);
        }
    }

    private void handleResult(final PipelineContext context, final AtomicInteger stage, final ProcedureResult result) {
        if (result.succeeded()) {
            process(context, stage, nextResult -> handleResult(context, stage, nextResult));
        } else {
            context.getOnCompleteHandler().handle(result);
        }
    }

    private void process(
        final PipelineContext context,
        final AtomicInteger stage,
        final ProcedureResultHandler onCompleteHandler
    ) {
        final int i = stage.incrementAndGet();

        if (stages.size() == i) {
            context.getOnCompleteHandler().succeed();
            return;
        }

        try {
            stages.get(i).process(context, result -> {
                if (context.isInterrupted()) {
                    context.getOnCompleteHandler().handle(result);
                    return;
                }

                onCompleteHandler.handle(result);
            });
        } catch (final Throwable t) {
            onCompleteHandler.fail(t);
        }
    }
}
