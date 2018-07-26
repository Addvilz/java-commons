/*
 * Copyright (c) 2018 Picoff Ventures and contributors
 *
 * This source file is part of Geoste Server public API product.
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

public class AsyncTask implements Runnable {
    final ProcedureResultHandler onComplete;
    private final Handler<ProcedureResultHandler> handler;

    AsyncTask(
        final Handler<ProcedureResultHandler> handler,
        final ProcedureResultHandler onComplete
    ) {
        this.handler = handler;
        this.onComplete = onComplete;
    }

    @Override
    public void run() {
        try {
            handler.handle(onComplete);
        } catch (final Throwable t) {
            onComplete.fail(t);
        }
    }
}
