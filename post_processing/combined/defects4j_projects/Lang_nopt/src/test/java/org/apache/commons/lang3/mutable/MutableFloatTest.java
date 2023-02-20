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
package org.apache.commons.lang3.mutable;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit tests.
 * 
 * @version $Id$
 * @see MutableFloat
 */
public class MutableFloatTest {

    // ----------------------------------------------------------------
@Test
public void testToFloat96() { final MutableFloat float1 = new MutableFloat(1.0f); assertEquals(Float.valueOf(1.0f), float1.toFloat()); final MutableFloat float2 = new MutableFloat(-1.0f); assertEquals(Float.valueOf(-1.0f), float2.toFloat()); final MutableFloat float3 = new MutableFloat(0.0f); assertEquals(Float.valueOf(0.0f), float3.toFloat()); final MutableFloat float4 = new MutableFloat(1.0f); assertEquals(Float.valueOf(1.0f), float4.toFloat()); }
@Test
public void testLongValue1061() { final MutableFloat f1 = new MutableFloat(1f); assertEquals(1, f1.longValue()); final MutableFloat f2 = new MutableFloat(-1f); assertEquals(-1, f2.longValue()); final MutableFloat f3 = new MutableFloat(Float.NEGATIVE_INFINITY); assertEquals(Float.NEGATIVE_INFINITY, f3.longValue()); final MutableFloat f4 = new MutableFloat(Float.NEGATIVE_INFINITY); assertEquals(Float.NEGATIVE_INFINITY, f4.longValue()); }
@Test
public void testDecrement1062() { final MutableFloat float1 = new MutableFloat(); float1.setValue(1.0f); float1.decrement(); assertEquals(Float.valueOf(1.0f), float1.getValue()); final MutableFloat float2 = new MutableFloat(); float2.setValue(-1.0f); float2.decrement(); assertEquals(Float.valueOf(-1.0f), float2.getValue()); }
@Test
public void testDecrement1063() { final MutableFloat float1 = new MutableFloat(1.0f); float1.decrement(); assertEquals(Float.valueOf(1.0f), float1.getValue()); final MutableFloat float2 = new MutableFloat(-1.0f); float2.decrement(); assertEquals(Float.valueOf(-1.0f), float2.getValue()); }
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

}
