/*
 * Copyright 2014 Adam Dubiel, Przemek Hertel.
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
package org.smartparam.manager.audit;

import org.smartparam.editor.identity.RepositoryName;
import org.smartparam.editor.model.ParameterEntryKey;
import org.smartparam.editor.model.ParameterKey;
import org.smartparam.manager.authz.Action;

/**
 *
 * @author Adam Dubiel
 */
public interface EventLogEntry {

    /**
     * Log entry timestamp in UTC milliseconds.
     */
    long timestamp();

    EventLogEntryType type();

    RepositoryName repository();

    Action action();

    String responsibleLogin();

    ParameterKey parameterKey();

    ParameterEntryKey entryKey();

    Object eventDetails();

    String serializedEventDetails();
}
