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
package org.smartparam.manager.json.vendor.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonassert.JsonAssert;
import org.smartparam.editor.model.simple.SimpleLevelKey;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

/**
 *
 * @author Adam Dubiel
 */
public class LevelKeySerializerTest extends JacksonTest {

    @Test
    public void shouldSerializeLevelKeyAsPlainStringWithValue() throws JsonProcessingException {
        // given
        ObjectMapper mapper = jackson(new LevelKeySerializer());

        // when
        String json = mapper.writeValueAsString(new SimpleLevelKey("testKeyValue"));

        // then
        JsonAssert.with(json).assertThat("$", equalTo("testKeyValue"));
    }

}
