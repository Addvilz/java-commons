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

package com.picoff.commons.functional;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class CompositeProcedureHandler implements ProcedureResultHandler {
    private final AtomicInteger pendingResults;
    private final ProcedureResultHandler handler;
    private final AtomicBoolean isComplete = new AtomicBoolean(false);

    public CompositeProcedureHandler(
        final int pendingResults,
        final ProcedureResultHandler handler
    ) {
        this.pendingResults = new AtomicInteger(pendingResults);
        this.handler = handler;
    }

    @Override
    public void handle(final ProcedureResult result) {
        if (isComplete.get()) {
            // Any subsequent calls after procedure handler is complete are discarded
            return;
        }

        if (result.failed()) {
            synchronized (isComplete) {
                isComplete.set(true);
            }
            handler.handle(result);
            return;
        }

        final int i = pendingResults.decrementAndGet();

        if (0 == i) {
            synchronized (isComplete) {
                isComplete.set(true);
            }
            handler.succeed();
        }
    }
}
