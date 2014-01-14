/*
 * Copyright 2013 Adam Dubiel, Przemek Hertel.
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
package org.smartparam.manager.json.vendor.jason;

import org.smartparam.manager.json.vendor.gson.*;
import org.jasonjson.core.JsonElement;
import org.jasonjson.core.JsonPrimitive;
import org.jasonjson.core.JsonSerializationContext;
import org.jasonjson.core.JsonSerializer;
import java.lang.reflect.Type;
import org.smartparam.editor.identity.RepositoryName;

/**
 *
 * @author Adam Dubiel
 */
public class RepositoryNameSerializer implements JsonSerializer<RepositoryName> {

    @Override
    public JsonElement serialize(RepositoryName name, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(name.name());
    }

}