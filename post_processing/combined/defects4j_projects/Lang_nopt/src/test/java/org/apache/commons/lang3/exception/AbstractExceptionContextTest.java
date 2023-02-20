/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.exception;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.tuple.Pair;


/**
 * Abstract test of an ExceptionContext implementation.
 */
public abstract class AbstractExceptionContextTest<T extends ExceptionContext & Serializable> {

    protected static final String TEST_MESSAGE_2 = "This is monotonous";
    protected static final String TEST_MESSAGE = "Test Message";
    protected T exceptionContext;

    protected static class ObjectWithFaultyToString {
        @Override
        public String toString() {
            throw new RuntimeException("Crap");
        }
    }


    @Before
    public void setUp() throws Exception {
        exceptionContext
            .addContextValue("test1", null)
            .addContextValue("test2", "some value")
            .addContextValue("test Date", new Date())
            .addContextValue("test Nbr", Integer.valueOf(5))
            .addContextValue("test Poorly written obj", new ObjectWithFaultyToString());
    }

@Test
public void testGetContextEntries1091() { ContextedException e = new ContextedException(); e.addContextValue("key1", "value1"); e.addContextValue("key2", "value2"); e.addContextValue("key3", "value3"); List<Pair<String, Object>> pairs = e.getContextEntries(); assertEquals(3, pairs.size()); assertEquals("key1", pairs.get(0).getKey()); assertEquals("value1", pairs.get(0).getValue()); assertEquals("value2", pairs.get(1).getKey()); assertEquals("value3", pairs.get(1).getValue()); }
@Test
public void testGetContextEntries1094() { ContextedRuntimeException e = new ContextedRuntimeException(); e.addContextValue("key1", "value1"); e.addContextValue("key2", "value2"); e.addContextValue("key3", "value3"); List<Pair<String, Object>> entries = e.getContextEntries(); assertEquals(3, entries.size()); assertEquals("key1", entries.get(0).getKey()); assertEquals("value1", entries.get(0).getValue()); assertEquals("value2", entries.get(1).getKey()); assertEquals("value3", entries.get(1).getValue()); }
@Test
public void testGetContextEntries1097() { ContextedRuntimeException e = new ContextedRuntimeException(); e.setContextValue("key1", "value1"); e.setContextValue("key2", "value2"); List<Pair<String, Object>> contextEntries = e.getContextEntries(); assertEquals(2, contextEntries.size()); assertEquals("key1", contextEntries.get(0).getKey()); assertEquals("value1", contextEntries.get(0).getValue()); assertEquals("value2", contextEntries.get(1).getKey()); assertEquals("value2", contextEntries.get(1).getValue()); }
    

    

    

    

    

    
    
    
}
