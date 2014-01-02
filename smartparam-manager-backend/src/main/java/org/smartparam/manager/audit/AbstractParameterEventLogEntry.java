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
import org.smartparam.manager.Action;
import org.smartparam.manager.authz.UserProfile;

/**
 *
 * @author Adam Dubiel
 */
public abstract class AbstractParameterEventLogEntry implements ParameterEventLogEntry {

    private final long timestamp;

    private final RepositoryName repository;

    private final Action action;

    private final UserProfile responsible;

    private final ParameterKey parameterKey;

    private final Object eventDetails;

    private final String serializedEventDetails;

    protected AbstractParameterEventLogEntry(long timestamp,
            RepositoryName repository, Action action, UserProfile responsible,
            ParameterKey parameterKey,
            Object eventDetails, String serializedEventDetails) {
        this.timestamp = timestamp;
        this.repository = repository;
        this.action = action;
        this.responsible = responsible;
        this.parameterKey = parameterKey;
        this.eventDetails = eventDetails;
        this.serializedEventDetails = serializedEventDetails;
    }

    @Override
    public long timestamp() {
        return timestamp;
    }

    @Override
    public RepositoryName repository() {
        return repository;
    }

    @Override
    public Action action() {
        return action;
    }

    @Override
    public UserProfile responsible() {
        return responsible;
    }

    @Override
    public ParameterKey parameter() {
        return parameterKey;
    }

    @Override
    public Object eventDetails() {
        return eventDetails;
    }

    @Override
    public String serializedEventDetails() {
        return serializedEventDetails;
    }

}
