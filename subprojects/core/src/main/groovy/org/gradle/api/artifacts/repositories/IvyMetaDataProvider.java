/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.api.artifacts.repositories;

import org.gradle.api.Incubating;

/**
 * A meta-data provider that uses the Ivy module descriptor ({@code ivy.xml}) to determine the meta-data for module versions and artifacts.
 */
@Incubating
public interface IvyMetaDataProvider {
    /**
     * Returns true if dynamic resolve mode should be used for Ivy modules. When enabled, the {@code revConstraint} attribute for each dependency declaration
     * is used in preference to the {@code rev} attributes. When disabled (the default), the {@code rev} attribute is always used.
     */
    boolean isDynamicResolveMode();

    /**
     * Specifies whether dynamic resolve mode should be used for Ivy modules. When enabled, the {@code revConstraint} attribute for each dependency declaration
     * is used in preference to the {@code rev} attributes. When disabled (the default), the {@code rev} attribute is always used.
     */
    void setDynamicResolveMode(boolean mode);
}
