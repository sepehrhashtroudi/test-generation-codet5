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
package org.apache.commons.lang3.concurrent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * Test class for {@link ConcurrentUtils}.
 *
 * @version $Id$
 */
public class ConcurrentUtilsTest {
    /**
     * Tests creating a ConcurrentException with a runtime exception as cause.
     */
    

    /**
     * Tests creating a ConcurrentException with an error as cause.
     */
    

    /**
     * Tests creating a ConcurrentException with null as cause.
     */
    

    /**
     * Tries to create a ConcurrentRuntimeException with a runtime as cause.
     */
    

    /**
     * Tries to create a ConcurrentRuntimeException with an error as cause.
     */
    

    /**
     * Tries to create a ConcurrentRuntimeException with null as cause.
     */
    

    /**
     * Tests extractCause() for a null exception.
     */
    

    /**
     * Tests extractCause() if the cause of the passed in exception is null.
     */
    

    /**
     * Tests extractCause() if the cause is an error.
     */
    

    /**
     * Tests extractCause() if the cause is an unchecked exception.
     */
    

    /**
@Test
public void testCreateIfAbsentKeyNotPresent7() throws ConcurrentException { 
     @SuppressWarnings("unchecked") 
     final ConcurrentInitializer<Integer> init = EasyMock.createMock(ConcurrentInitializer.class); 
     final String key = "testKey"; 
     final Integer value = 42; 
     EasyMock.expect(init.get()).andReturn(value); 
     EasyMock.replay(init); 
     final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<String, Integer>(); 
     assertEquals("Wrong result", value, ConcurrentUtils.createIfAbsent(map, key, init)); 
     assertEquals("Wrong value in map", value, map.get(key)); 
     EasyMock.verify(init); 
 }
     * Tests extractCause() if the cause is a checked exception.
     */
    

    /**
     * Tests extractCauseUnchecked() for a null exception.
     */
    

    /**
     * Tests extractCauseUnchecked() if the cause of the passed in exception is null.
     */
    

    /**
     * Tests extractCauseUnchecked() if the cause is an error.
     */
    

    /**
     * Tests extractCauseUnchecked() if the cause is an unchecked exception.
     */
    

    /**
     * Tests extractCauseUnchecked() if the cause is a checked exception.
     */
    

    /**
     * Tests handleCause() if the cause is an error.
     */
    

    /**
     * Tests handleCause() if the cause is an unchecked exception.
     */
    

    /**
     * Tests handleCause() if the cause is a checked exception.
     */
    

    /**
     * Tests handleCause() for a null parameter or a null cause. In this case
     * the method should do nothing. We can only test that no exception is
     * thrown.
     */
    

    /**
     * Tests handleCauseUnchecked() if the cause is an error.
     */
    

    /**
     * Tests handleCauseUnchecked() if the cause is an unchecked exception.
     */
    

    /**
     * Tests handleCauseUnchecked() if the cause is a checked exception.
     */
    

    /**
     * Tests handleCauseUnchecked() for a null parameter or a null cause. In
     * this case the method should do nothing. We can only test that no
     * exception is thrown.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests initialize() for a null argument.
     */
    

    /**
     * Tests a successful initialize() operation.
     */
    

    /**
     * Tests initializeUnchecked() for a null argument.
     */
    

    /**
     * Tests a successful initializeUnchecked() operation.
     */
    

    /**
     * Tests whether exceptions are correctly handled by initializeUnchecked().
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests constant future.
     */
    

    /**
     * Tests constant future.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests putIfAbsent() if the map contains the key in question.
     */
    

    /**
     * Tests putIfAbsent() if the map does not contain the key in question.
     */
    

    /**
     * Tests putIfAbsent() if a null map is passed in.
     */
    

    /**
     * Tests createIfAbsent() if the key is found in the map.
     */
    

    /**
     * Tests createIfAbsent() if the map does not contain the key in question.
     */
    

    /**
     * Tests createIfAbsent() if a null map is passed in.
     */
    

    /**
     * Tests createIfAbsent() if a null initializer is passed in.
     */
    

    /**
     * Tests createIfAbsentUnchecked() if no exception is thrown.
     */
    

    /**
     * Tests createIfAbsentUnchecked() if an exception is thrown.
     */
    
}
