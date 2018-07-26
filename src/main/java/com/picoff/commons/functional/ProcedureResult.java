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

package com.picoff.commons.functional;

import java.util.function.Consumer;

public class ProcedureResult {
    private static final ProcedureResult PROCEDURE_RESULT_SUCCESS = new ProcedureResult();

    private final Throwable cause;
    private final boolean failed;

    public ProcedureResult() {
        this.cause = null;
        this.failed = false;
    }

    public ProcedureResult(final Throwable cause) {
        this.cause = cause;
        this.failed = true;
    }

    public static <T> ProcedureResult success() {
        return PROCEDURE_RESULT_SUCCESS;
    }

    public static ProcedureResult failure(final Throwable t) {
        return new ProcedureResult(t);
    }

    public boolean failed() {
        return failed;
    }

    public boolean succeeded() {
        return !failed;
    }

    public ProcedureResult ifFailed(final Consumer<Throwable> failureConsumer) {
        if (failed) {
            failureConsumer.accept(cause);
        }
        return this;
    }

    public ProcedureResult ifSucceeded(final Procedure procedure) {
        if (!failed) {
            procedure.invoke();
        }
        return this;
    }

    public Throwable getCause() {
        return cause;
    }
}
