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
package org.smartparam.manager.json;

import com.jayway.jsonassert.JsonAssert;
import org.smartparam.editor.model.simple.SimpleParameter;
import org.smartparam.engine.core.parameter.Parameter;
import org.smartparam.manager.audit.diff.ParameterDiff;
import org.smartparam.manager.json.integration.SerializerTest;
import org.testng.annotations.Test;

/**
 *
 * @author Adam Dubiel
 */
public class ParameterDiffSerializerTest extends SerializerTest {

    @Test
    public void shouldSerializeParameterDiff() {
        // given
        Parameter previous = new SimpleParameter();
        Parameter current = new SimpleParameter();
        ParameterDiff diff = new ParameterDiff(previous, current);

        // when
        String json = serialize(diff);

        // then
        JsonAssert.with(json).assertNotNull("$.previous")
                .assertNotNull("$.current");
    }

}
