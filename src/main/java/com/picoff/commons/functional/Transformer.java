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

@FunctionalInterface
public interface Transformer<T, S> {
    /**
     * Semantic version of Function, with premise that every invocation of transformTo produces a new instance of
     * S given the parameter T.
     *
     * @param value Input value
     * @return Output value
     */
    S transformTo(final T value);
}
