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
public void testCreateIfAbsent5() { final ConcurrentMap<String, String> map = new ConcurrentHashMap<String, String>(); final String key = "test"; final String value = ConcurrentUtils.createIfAbsent(map, key, null); assertNull(value); value = ConcurrentUtils.createIfAbsentUnchecked(map, key, new ConcurrentInitializer<String>() { @Override public String get() { return "test"; } }); assertEquals("test", value); value = ConcurrentUtils.createIfAbsentUnchecked(map, key, new ConcurrentInitializer<String>() { @Override public String get() { return "test2"; } }); assertEquals("test2", value); value = ConcurrentUtils.create
@Test
public void testCreateIfAbsent147() { final ConcurrentMap<String, String> map = new ConcurrentHashMap<String, String>(); final String key = "test"; final String value = ConcurrentUtils.createIfAbsentUnchecked(map, key, null); assertNull(value); map.put(key, value); value = ConcurrentUtils.createIfAbsentUnchecked(map, key, new ConcurrentInitializer<String>() { @Override public String get() { return "test"; } }); assertEquals("test", value); value = ConcurrentUtils.createIfAbsentUnchecked(map, key, new ConcurrentInitializer<String>() { @Override public String get() { return "test2"; } }); assertEquals("test
@Test
public void createIfAbsentTest() { final ConcurrentMap<String, String> map = new ConcurrentHashMap<String, String>(); final String key = "test"; final String value1 = ConcurrentUtils.createIfAbsent(map, key, new ConcurrentInitializer<String>() { @Override public String get() { return value1; } }); String value2 = ConcurrentUtils.createIfAbsent(map, key, new ConcurrentInitializer<String>() { @Override public String get() { return value2; } }); String value3 = ConcurrentUtils.createIfAbsent(map, key, new ConcurrentInitializer<String>() { @Override public String get() { return value3; } }); String value4 = ConcurrentUtils.
@Test
public void testCreateIfAbsent148() { final ConcurrentMap<String, String> map = new ConcurrentHashMap<String, String>(); final String key1 = "key1"; final String value1 = ConcurrentUtils.createIfAbsent(map, key1, null); assertNull(value1); final String key2 = "key2"; final String value2 = ConcurrentUtils.createIfAbsent(map, key2, null); assertEquals(value2, value1); }
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
