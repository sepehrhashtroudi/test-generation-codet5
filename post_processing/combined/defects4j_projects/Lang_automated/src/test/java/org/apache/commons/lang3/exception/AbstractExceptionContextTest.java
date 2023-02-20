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
public void testGetContextLabels102() { 
     assertEquals(5, exceptionContext.getContextEntries().size()); 
     exceptionContext.addContextValue("test2", "different value"); 
     final Set<String> labels = exceptionContext.getContextLabels(); 
     assertEquals(6, exceptionContext.getContextEntries().size()); 
     assertEquals(5, labels.size()); 
     assertTrue(labels.contains("test1")); 
     assertTrue(labels.contains("test2")); 
     assertTrue(labels.contains("test Date")); 
     assertTrue(labels.contains("test Nbr")); 
 }
@Test
public void testGetContextValues431() { 
     exceptionContext.addContextValue("test2", "different value"); 
     assertEquals(exceptionContext.getContextValues("test1"), Collections.singletonList(null)); 
     assertEquals(exceptionContext.getContextValues("test2"), Arrays.asList("some value", "different value")); 
     exceptionContext.setContextValue("test2", "another"); 
     assertTrue(exceptionContext.getFirstContextValue("test2").equals("another")); 
 }
    

    

    

    

    

    
    
    
}
