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
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.BooleanUtils}.
 *
 * @version $Id$
 */
public class BooleanUtilsTest {

    //-----------------------------------------------------------------------
@Test(expected = IllegalArgumentException.class) 
 public void testXor_primitive_nullInput38() { 
     BooleanUtils.xor((boolean[]) null); 
 }
@Test
public void testXor_primitive_validInput_2items253() { 
     assertTrue("False result for (true, true)", BooleanUtils.xor(new boolean[] { true, true })); 
     assertTrue("True result for (false, false)", !BooleanUtils.xor(new boolean[] { false, false })); 
     assertTrue("False result for (true, false)", BooleanUtils.xor(new boolean[] { true, false })); 
     assertTrue("False result for (false, true)", BooleanUtils.xor(new boolean[] { false, true })); 
 }
@Test
public void testXor_primitive_validInput_2items254() { 
     assertTrue("False result for (true, true)", BooleanUtils.xor(new boolean[] { true, true })); 
     assertTrue("True result for (false, false)", !BooleanUtils.xor(new boolean[] { false, false })); 
     assertTrue("True result for (true, false)", !BooleanUtils.xor(new boolean[] { true, false })); 
     assertTrue("False result for (false, true)", BooleanUtils.xor(new boolean[] { false, true })); 
 }
@Test(expected = IllegalArgumentException.class) 
 public void testXor_primitive_emptyInput255() { 
     BooleanUtils.xor(new boolean[] {}); 
 }
@Test(expected = IllegalArgumentException.class) 
 public void testXor_object_nullElementInput256() { 
     BooleanUtils.xor(new Boolean[] { null }); 
 }
@Test
public void testXor_object_validInput_2items257() { 
     assertTrue("True result for (false, false, true)", !BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE, Boolean.TRUE }).booleanValue()); 
     assertTrue("True result for (false, true, false)", !BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.TRUE, Boolean.FALSE }).booleanValue()); 
     assertTrue("True result for (true, false, false)", !BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE, Boolean.FALSE }).booleanValue()); 
     assertTrue("False result for (true, true, true)", BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE, Boolean.TRUE }).booleanValue()); 
     assertTrue("True result for (false, false)", !BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE, Boolean.FALSE }).booleanValue()); 
     assertTrue("True result for (true, true, false)", !BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE, Boolean.FALSE }).booleanValue()); 
     assertTrue("True result for (true, false, true)", !BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE, Boolean.TRUE }).booleanValue()); 
     assertTrue("True result for (false, true, true)", !BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.TRUE, Boolean.TRUE }).booleanValue()); 
 }
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    
    
    
    
    
    
    //-----------------------------------------------------------------------
    

    
    
    

    

    
    
    //-----------------------------------------------------------------------
    

    
    
    

    

    

    //-----------------------------------------------------------------------
    
    
    
    
    
    
    //-----------------------------------------------------------------------
    
    
    
    
    
    
    
    
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    
    
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    
    
    
    
    
    
    
    
    //-----------------------------------------------------------------------
    
    
    
    
    
    
    
    
    //  testXor
    //  -----------------------------------------------------------------------
    

    

    

    

    

    
    
    

    

    

    //  testAnd
    //  -----------------------------------------------------------------------
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //  testOr
    //  -----------------------------------------------------------------------
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
