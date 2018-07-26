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

public class Result<T> {
    private final T result;
    private final Throwable cause;
    private final boolean failed;

    public Result(final T result) {
        this.result = result;
        this.cause = null;
        this.failed = false;
    }

    public Result(final Throwable cause) {
        this.result = null;
        this.cause = cause;
        this.failed = true;
    }

    public static <T> Result<T> success(final T result) {
        return new Result<>(result);
    }

    public static <T> Result<T> failure(final Throwable t) {
        return new Result<>(t);
    }

    public boolean failed() {
        return failed;
    }

    public boolean succeeded() {
        return !failed;
    }

    public Result<T> ifFailed(final Consumer<Throwable> failureConsumer) {
        if (failed) {
            failureConsumer.accept(cause);
        }
        return this;
    }

    public Result<T> ifSucceeded(final Consumer<T> successConsumer) {
        if (!failed) {
            successConsumer.accept(result);
        }
        return this;
    }

    public Result<T> ifSucceededNull(final Procedure procedure) {
        if (!failed && null == result) {
            procedure.invoke();
        }
        return this;
    }

    public T getResult() {
        return result;
    }

    public Throwable getCause() {
        return cause;
    }
}
