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

import com.picoff.commons.functional.ProcedureResultHandler;

public class PipelineContext<T> {
    private volatile T event;
    private final ProcedureResultHandler onComplete;
    private boolean interrupted;

    PipelineContext(
        final T event, final ProcedureResultHandler onComplete
    ) {
        this.event = event;
        this.onComplete = onComplete;
    }

    public T getEvent() {
        return event;
    }

    public PipelineContext<T> replaceEvent(final T event) {
        this.event = event;
        return this;
    }

    ProcedureResultHandler getOnCompleteHandler() {
        return onComplete;
    }

    public void interrupt() {
        this.interrupted = true;
    }

    public void interrupt(final boolean state) {
        this.interrupted = state;
    }

    public boolean isInterrupted() {
        return interrupted;
    }
}
