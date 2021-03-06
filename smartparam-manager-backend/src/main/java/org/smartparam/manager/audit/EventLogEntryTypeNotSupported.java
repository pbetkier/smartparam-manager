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

import org.smartparam.engine.core.exception.SmartParamException;

/**
 *
 * @author Adam Dubiel
 */
@SuppressWarnings("serial")
public class EventLogEntryTypeNotSupported extends SmartParamException {

    EventLogEntryTypeNotSupported(EventLogRepository repository,
            EventLogEntryFactory factory,
            Class<? extends EventLogEntry> unsuppportedEventLogClass) {
        super("ENTRY_LOG_TYPE_NOT_SUPPORTED", String.format("Event log repository %s does not support event logs of "
                + "type %s produced by %s.", repository.getClass().getSimpleName(), unsuppportedEventLogClass.getSimpleName(), factory.getClass().getSimpleName()));
    }

}
