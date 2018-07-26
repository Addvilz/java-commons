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

/**
 * Exception designed to indicate generic failure in async context, while carrying only the message
 * describing the error, without stacktrace.
 */
public class AnonymousThrowable extends Throwable {
    private static final long serialVersionUID = 4390977565552377608L;

    public AnonymousThrowable(final String message) {
        super(message, null, false, false);
    }
}
