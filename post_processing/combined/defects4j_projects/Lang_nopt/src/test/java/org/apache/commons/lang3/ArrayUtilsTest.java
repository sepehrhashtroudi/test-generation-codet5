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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.ArrayUtils}.
 *
 * @version $Id$
 */
public class ArrayUtilsTest  {

    //-----------------------------------------------------------------------
@Test
public void nullToEmpty() { Short[] array = null; Short[] array2 = ArrayUtils.nullToEmpty(array); assertEquals(array.length, array2.length); for (int i = 0; i < array.length; i++) { assertEquals(array[i], array2[i]); } }
@Test
public void nullToEmpty() { Byte[] array = null; assertEquals(array.length, ArrayUtils.nullToEmpty(array).length); for (int i = 0; i < array.length; i++) { assertEquals(array[i], ArrayUtils.nullToEmpty(array)[i]); } }
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void assertIsEquals(final Object array1, final Object array2, final Object array3) {
        assertTrue(ArrayUtils.isEquals(array1, array1));
        assertTrue(ArrayUtils.isEquals(array2, array2));
        assertTrue(ArrayUtils.isEquals(array3, array3));
        assertFalse(ArrayUtils.isEquals(array1, array2));
        assertFalse(ArrayUtils.isEquals(array2, array1));
        assertFalse(ArrayUtils.isEquals(array1, array3));
        assertFalse(ArrayUtils.isEquals(array3, array1));
        assertFalse(ArrayUtils.isEquals(array1, array2));
        assertFalse(ArrayUtils.isEquals(array2, array1));
    }

    
    
    //-----------------------------------------------------------------------
    /**
     * Tests generic array creation with parameters of same type.
     */
    

    /**
     * Tests generic array creation with general return type.
     */
    

    /**
     * Tests generic array creation with parameters of common base type.
     */
    

    /**
     * Tests generic array creation with generic type.
     */
    

    /**
     * Tests generic empty array creation with generic type.
     */
    

    /**
     * Tests indirect generic empty array creation with generic type.
     */
    

    private static <T> T[] toArrayPropagatingType(final T... items)
    {
        return ArrayUtils.toArray(items);
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
    

    

    

    

    
    
    //-----------------------------------------------------------------------
    

    

    

    

    
    
    // testToPrimitive/Object for boolean
    //  -----------------------------------------------------------------------
    

    

    

    // testToPrimitive/Object for byte
    //  -----------------------------------------------------------------------
    

    

    
    
    // testToPrimitive/Object for byte
    //  -----------------------------------------------------------------------
    

    

    

    // testToPrimitive/Object for short
    //  -----------------------------------------------------------------------
    

    

    

    //  testToPrimitive/Object for int
    //  -----------------------------------------------------------------------
     

     
     
    

    

    //  testToPrimitive/Object for long
    //  -----------------------------------------------------------------------
     

     
     
    

    //  testToPrimitive/Object for float
    //  -----------------------------------------------------------------------
     

     
     
    

    //  testToPrimitive/Object for double
    //  -----------------------------------------------------------------------
     

     
     
    

    //-----------------------------------------------------------------------
    /**
     * Test for {@link ArrayUtils#isEmpty(java.lang.Object[])}.
     */
    

    /**
     * Tests for {@link ArrayUtils#isEmpty(long[])},
     * {@link ArrayUtils#isEmpty(int[])},
     * {@link ArrayUtils#isEmpty(short[])},
     * {@link ArrayUtils#isEmpty(char[])},
     * {@link ArrayUtils#isEmpty(byte[])},
     * {@link ArrayUtils#isEmpty(double[])},
     * {@link ArrayUtils#isEmpty(float[])} and
     * {@link ArrayUtils#isEmpty(boolean[])}.
     */
    
    
   /**
     * Test for {@link ArrayUtils#isNotEmpty(java.lang.Object[])}.
     */
    

   /**
     * Tests for {@link ArrayUtils#isNotEmpty(long[])},
     * {@link ArrayUtils#isNotEmpty(int[])},
     * {@link ArrayUtils#isNotEmpty(short[])},
     * {@link ArrayUtils#isNotEmpty(char[])},
     * {@link ArrayUtils#isNotEmpty(byte[])},
     * {@link ArrayUtils#isNotEmpty(double[])},
     * {@link ArrayUtils#isNotEmpty(float[])} and
     * {@link ArrayUtils#isNotEmpty(boolean[])}.
     */
    
    // ------------------------------------------------------------------------
    

}
