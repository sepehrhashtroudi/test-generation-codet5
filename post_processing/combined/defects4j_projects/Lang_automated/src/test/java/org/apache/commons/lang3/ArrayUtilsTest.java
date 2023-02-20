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
public void testToObject_byte15() { 
     final byte[] b = null; 
     assertArrayEquals(null, ArrayUtils.toObject(b)); 
     assertSame(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, ArrayUtils.toObject(new byte[0])); 
     assertTrue(Arrays.equals(new Byte[] { Byte.valueOf(Byte.MIN_VALUE), Byte.valueOf(Byte.MAX_VALUE), Byte.valueOf((byte) 9999999) }, ArrayUtils.toObject(new byte[] { Byte.MIN_VALUE, Byte.MAX_VALUE, (byte) 9999999 }))); 
 }
@Test
public void testToPrimitive_double_double33() { 
     final Double[] l = null; 
     assertEquals(null, ArrayUtils.toPrimitive(l, Double.MIN_VALUE)); 
     assertSame(ArrayUtils.EMPTY_DOUBLE_ARRAY, ArrayUtils.toPrimitive(new Double[0], 1)); 
     assertTrue(Arrays.equals(new double[] { Double.MIN_VALUE, Double.MAX_VALUE, 9999999 }, ArrayUtils.toPrimitive(new Double[] { Double.valueOf(Double.MIN_VALUE), Double.valueOf(Double.MAX_VALUE), Double.valueOf(9999999) }, 1))); 
     assertTrue(Arrays.equals(new double[] { Double.MIN_VALUE, Double.MAX_VALUE, 9999999 }, ArrayUtils.toPrimitive(new Double[] { Double.valueOf(Double.MIN_VALUE), null, Double.valueOf(9999999) }, Double.MAX_VALUE))); 
 }
@SuppressWarnings("cast")
@Test
public void testIndexOfFloat43() { 
     float[] array = null; 
     assertEquals(-1, ArrayUtils.indexOf(array, (float) 0)); 
     array = new float[0]; 
     assertEquals(-1, ArrayUtils.indexOf(array, (float) 0)); 
     array = new float[] { 0, 1, 2, 3, 0 }; 
     assertEquals(0, ArrayUtils.indexOf(array, (float) 0)); 
     assertEquals(1, ArrayUtils.indexOf(array, (float) 1)); 
     assertEquals(2, ArrayUtils.indexOf(array, (float) 2)); 
     assertEquals(3, ArrayUtils.indexOf(array, (float) 3)); 
     assertEquals(3, ArrayUtils.indexOf(array, (float) 3, -1)); 
     assertEquals(-1, ArrayUtils.indexOf(array, (float) 99)); 
 }
@Test
public void testNullToEmptyShortObject54() { 
     assertArrayEquals(ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Short[]) null)); 
     final Short[] original = new Short[] { 1, 2 }; 
     assertArrayEquals(original, ArrayUtils.nullToEmpty(original)); 
     final Short[] empty = new Short[] {}; 
     final Short[] result = ArrayUtils.nullToEmpty(empty); 
     assertArrayEquals(ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY, result); 
     assertTrue(empty != result); 
 }
@Test
public void testNullToEmptyByteObject58() { 
     assertArrayEquals(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Byte[]) null)); 
     final Byte[] original = new Byte[] { 2, 3 }; 
     assertArrayEquals(original, ArrayUtils.nullToEmpty(original)); 
     final Byte[] empty = new Byte[] {}; 
     final Byte[] result = ArrayUtils.nullToEmpty(empty); 
     assertArrayEquals(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, result); 
     assertTrue(empty != result); 
 }
@Test
public void testToPrimitive_long_long66() { 
     final Long[] l = null; 
     assertEquals(null, ArrayUtils.toPrimitive(l, Long.MIN_VALUE)); 
     assertSame(ArrayUtils.EMPTY_LONG_ARRAY, ArrayUtils.toPrimitive(new Long[0], 1)); 
     assertTrue(Arrays.equals(new long[] { Long.MIN_VALUE, Long.MAX_VALUE, 9999999 }, ArrayUtils.toPrimitive(new Long[] { Long.valueOf(Long.MIN_VALUE), Long.valueOf(Long.MAX_VALUE), Long.valueOf(9999999) }, 1))); 
     assertTrue(Arrays.equals(new long[] { Long.MIN_VALUE, Long.MAX_VALUE, 9999999 }, ArrayUtils.toPrimitive(new Long[] { Long.valueOf(Long.MIN_VALUE), null, Long.valueOf(9999999) }, Long.MAX_VALUE))); 
 }
@Test
public void testNullToEmptyLongObject76() { 
     assertArrayEquals(ArrayUtils.EMPTY_LONG_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Long[]) null)); 
     final Long[] original = new Long[] { 1L, 2L }; 
     assertArrayEquals(original, ArrayUtils.nullToEmpty(original)); 
     final Long[] empty = new Long[] {}; 
     final Long[] result = ArrayUtils.nullToEmpty(empty); 
     assertArrayEquals(ArrayUtils.EMPTY_LONG_OBJECT_ARRAY, result); 
     assertTrue(empty != result); 
 }
@Test
public void testIndexOfBoolean101() { 
     boolean[] array = null; 
     assertEquals(-1, ArrayUtils.indexOf(array, true)); 
     array = new boolean[0]; 
     assertEquals(-1, ArrayUtils.indexOf(array, true)); 
     array = new boolean[] { true, false, true }; 
     assertEquals(2, ArrayUtils.indexOf(array, true)); 
     assertEquals(1, ArrayUtils.indexOf(array, false)); 
     array = new boolean[] { true, true }; 
     assertEquals(-1, ArrayUtils.indexOf(array, false)); 
 }
@Test
@SuppressWarnings("cast") 
 public void testRemoveElementLongArray118() { 
     long[] array; 
     array = ArrayUtils.removeElement((long[]) null, (long) 1); 
     assertNull(array); 
     array = ArrayUtils.removeElement(ArrayUtils.EMPTY_LONG_ARRAY, (long) 1); 
     assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array)); 
     assertEquals(Long.TYPE, array.getClass().getComponentType()); 
     array = ArrayUtils.removeElement(new long[] { 1 }, (long) 1); 
     assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array)); 
     assertEquals(Long.TYPE, array.getClass().getComponentType()); 
     array = ArrayUtils.removeElement(new long[] { 1, 2 }, (long) 1); 
     assertTrue(Arrays.equals(new long[] { 2 }, array)); 
     assertEquals(Long.TYPE, array.getClass().getComponentType()); 
     array = ArrayUtils.removeElement(new long[] { 1, 2, 1 }, (long) 1); 
     assertTrue(Arrays.equals(new long[] { 2, 1 }, array)); 
     assertEquals(Long.TYPE, array.getClass().getComponentType()); 
 }
@Test
public void testLastIndexOfShortWithStartIndex125() { 
     short[] array = null; 
     assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 0, 2)); 
     array = new short[] { 0, 1, 2, 3, 0 }; 
     assertEquals(0, ArrayUtils.lastIndexOf(array, (short) 0, 2)); 
     assertEquals(1, ArrayUtils.lastIndexOf(array, (short) 1, 2)); 
     assertEquals(2, ArrayUtils.lastIndexOf(array, (short) 2, 2)); 
     assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 3, 2)); 
     assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 3, -1)); 
     assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 99)); 
     assertEquals(4, ArrayUtils.lastIndexOf(array, (short) 0, 88)); 
 }
@SuppressWarnings("cast")
@Test
public void testIndexOfFloat262() { 
     float[] array = null; 
     assertEquals(-1, ArrayUtils.indexOf(array, (float) 0)); 
     array = new float[0]; 
     assertEquals(-1, ArrayUtils.indexOf(array, (float) 0)); 
     array = new float[] { 0, 1, 2, 3, 0 }; 
     assertEquals(0, ArrayUtils.indexOf(array, (float) 0)); 
     assertEquals(1, ArrayUtils.indexOf(array, (float) 1)); 
     assertEquals(2, ArrayUtils.indexOf(array, (float) 2)); 
     assertEquals(3, ArrayUtils.indexOf(array, (float) 3)); 
     assertEquals(-1, ArrayUtils.indexOf(array, (float) 99)); 
 }
@Test
public void testNullToEmptyByteObject347() { 
     assertArrayEquals(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Byte[]) null)); 
     final Byte[] original = new Byte[] { 1, 2 }; 
     assertArrayEquals(original, ArrayUtils.nullToEmpty(original)); 
     final Byte[] empty = new Byte[] {}; 
     final Byte[] result = ArrayUtils.nullToEmpty(empty); 
     assertArrayEquals(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, result); 
     assertTrue(empty != result); 
 }
@Test
public void testContainsBoolean429() { 
     boolean[] array = null; 
     assertFalse(ArrayUtils.contains(array, true)); 
     array = new boolean[] { true, false, true }; 
     assertTrue(ArrayUtils.contains(array, true)); 
     assertTrue(ArrayUtils.contains(array, false)); 
     array = new boolean[] { true, true }; 
     assertFalse(ArrayUtils.contains(array, false)); 
     array = new boolean[] { true, false, true }; 
     assertFalse(ArrayUtils.contains(array, false)); 
 }
@Test
public void testIndexOfBoolean430() { 
     boolean[] array = null; 
     assertEquals(-1, ArrayUtils.indexOf(array, true)); 
     array = new boolean[0]; 
     assertEquals(-1, ArrayUtils.indexOf(array, true)); 
     array = new boolean[] { true, false, true }; 
     assertEquals(0, ArrayUtils.indexOf(array, true)); 
     assertEquals(1, ArrayUtils.indexOf(array, false)); 
     array = new boolean[] { true, true }; 
     assertEquals(-1, ArrayUtils.indexOf(array, false)); 
 }
@Test
public void testToStringIfNull479() { 
     final String nullArray = null; 
     final String expected = "null"; 
     assertEquals(expected, ArrayUtils.toString(nullArray, null)); 
     assertEquals(expected, ArrayUtils.toString(nullArray, "0")); 
     assertEquals(expected, ArrayUtils.toString(new Object[0], null)); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "0" }, null)); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, "0")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, "0")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, null)); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, "0")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, "1")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, null)); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, "0")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "2", "3" }, "1")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "2", "3" }, "2")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "3", "4" }, null)); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, "0")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, "1")); 
 }
@Test
public void testOSMatchesName483() { 
     String osName = null; 
     assertFalse(SystemUtils.isOSNameMatch(osName, "Windows")); 
     osName = ""; 
     assertFalse(SystemUtils.isOSNameMatch(osName, "Windows")); 
     osName = "Windows 95"; 
     assertTrue(SystemUtils.isOSNameMatch(osName, "Windows")); 
     osName = "Windows NT"; 
     assertTrue(SystemUtils.isOSNameMatch(osName, "Windows")); 
     osName = "OS/2"; 
     assertFalse(SystemUtils.isOSNameMatch(osName, "Windows")); 
 }
@Test
public void testToStringIfNull484() { 
     final String nullArray = null; 
     final String expected = "null"; 
     assertEquals(expected, ArrayUtils.toString(nullArray, null)); 
     assertEquals(expected, ArrayUtils.toString(nullArray, "0")); 
     assertEquals(expected, ArrayUtils.toString(new Object[0], null)); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "0" }, null)); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, "0")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, "0")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, null)); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, "0")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, "1")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, null)); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, "0")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "2", "3" }, "1")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "2", "3" }, "2")); 
     assertEquals(expected, ArrayUtils.toString(new Object[] { "1", "2", "3" }, "1")); 
 }
@Test
public void testToString_Object494() { 
     final Object[] array = new Object[] { "0", "1", "2", "3", null, "0" }; 
     assertEquals("0:1:2:3", ArrayUtils.toString(array, null)); 
     assertEquals("0:1:2:3", ArrayUtils.toString(array, "")); 
     assertEquals("0:1:2:3", ArrayUtils.toString(array, "0")); 
     assertEquals("1:2:3", ArrayUtils.toString(array, "1")); 
     assertEquals("2:3", ArrayUtils.toString(array, "2")); 
     assertEquals("3", ArrayUtils.toString(array, "3")); 
     assertEquals("null", ArrayUtils.toString(null, null)); 
     assertEquals("", ArrayUtils.toString(array, "")); 
 }
@Test
public void testOSMatchesNameAndVersion495() { 
     String osName = null; 
     String osVersion = null; 
     assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
     osName = ""; 
     osVersion = ""; 
     assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
     osName = "Windows 95"; 
     osVersion = "4.0"; 
     assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
     osName = "Windows 95"; 
     osVersion = "4.1"; 
     assertTrue(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
     osName = "Windows 98"; 
     osVersion = "4.1"; 
     assertTrue(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
     osName = "Windows NT"; 
     osVersion = "4.0"; 
     assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
     osName = "OS/2"; 
     osVersion = "4.0"; 
     assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1")); 
 }
    
    
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
