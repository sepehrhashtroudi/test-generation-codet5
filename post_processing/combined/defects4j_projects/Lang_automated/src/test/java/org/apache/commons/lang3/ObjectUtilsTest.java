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
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.exception.CloneFailedException;
import org.apache.commons.lang3.mutable.MutableObject;
import org.apache.commons.lang3.text.StrBuilder;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.ObjectUtils}.
 *
 * @version $Id$
 */
public class ObjectUtilsTest {
    private static final String FOO = "foo";
    private static final String BAR = "bar";

    //-----------------------------------------------------------------------
@Test
public void testHashCode50() { 
     assertEquals(null, ObjectUtils.hashCode(null)); 
     assertEquals(Byte.MIN_VALUE, ObjectUtils.hashCode(Byte.MIN_VALUE)); 
     assertEquals(Byte.MAX_VALUE, ObjectUtils.hashCode(Byte.MAX_VALUE)); 
     try { 
         ObjectUtils.hashCode(0); 
         fail("Expected IllegalArgumentException"); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         ObjectUtils.hashCode(1); 
         fail("Expected IllegalArgumentException"); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         ObjectUtils.hashCode(Byte.MIN_VALUE); 
         fail("Expected IllegalArgumentException"); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         ObjectUtils.hashCode(Byte.MAX_VALUE); 
         fail("Expected IllegalArgumentException"); 
     } catch (final IllegalArgumentException iae) { 
     } 
 }
@Test
public void testHashCode289() { 
     assertEquals(ObjectUtils.hashCode(null), ObjectUtils.hashCode(null)); 
     final Object o1 = new Object(); 
     final Object o2 = new Object(); 
     assertEquals(o1.hashCode(), ObjectUtils.hashCode(o1)); 
     assertEquals(o2.hashCode(), ObjectUtils.hashCode(o2)); 
     final Object o3 = new Object(); 
     assertEquals(o3.hashCode(), ObjectUtils.hashCode(o3)); 
     assertEquals(o3.hashCode(), ObjectUtils.hashCode(o3)); 
 }
@Test
public void testHashCode293() { 
     assertEquals(Boolean.TRUE, ObjectUtils.hashCode(new Boolean[] { Boolean.TRUE })); 
     assertEquals(Boolean.FALSE, ObjectUtils.hashCode(new Object[] { Boolean.TRUE })); 
     assertEquals(Boolean.TRUE, ObjectUtils.hashCode(new Object[] { Boolean.FALSE })); 
     assertEquals(Boolean.FALSE, ObjectUtils.hashCode(new Object[] { Boolean.TRUE, Boolean.FALSE })); 
     assertEquals(Boolean.TRUE, ObjectUtils.hashCode(new Object[] { Boolean.TRUE, null })); 
     assertEquals(Boolean.TRUE, ObjectUtils.hashCode(new Object[] { null, Boolean.FALSE })); 
 }
@Test
public void testHashCode294() { 
     assertEquals(null, ObjectUtils.hashCode(null)); 
     assertEquals(Byte.MIN_VALUE, ObjectUtils.hashCode(Byte.MIN_VALUE)); 
     assertEquals(Byte.MAX_VALUE, ObjectUtils.hashCode(Byte.MAX_VALUE)); 
     try { 
         ObjectUtils.hashCode(0); 
         fail("Expected IllegalArgumentException"); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         ObjectUtils.hashCode(1); 
         fail("Expected IllegalArgumentException"); 
     } catch (final IllegalArgumentException iae) { 
     } 
     try { 
         ObjectUtils.hashCode(Byte.MIN_VALUE); 
         fail("Expected IllegalArgumentException"); 
     } catch (final IllegalArgumentException iae) { 
     } 
     assertEquals(Byte.MIN_VALUE, ObjectUtils.hashCode(0)); 
     assertEquals(Byte.MAX_VALUE, ObjectUtils.hashCode(Byte.MAX_VALUE)); 
 }
@Test
public void testHashCode295() { 
     assertEquals(null, ObjectUtils.hashCode(null)); 
     final long l1 = System.currentTimeMillis(); 
     final int h1 = (int) (l1 ^ l1 >> 32); 
     assertEquals(l1, ObjectUtils.hashCode(l1)); 
     final long l2 = System.currentTimeMillis(); 
     final int h2 = (int) (l2 ^ l2 >> 32); 
     assertEquals(l2, ObjectUtils.hashCode(l2)); 
     final float[] array1 = new float[] { 1, 2, 3 }; 
     final float[] array2 = new float[] { 2, 3, 4 }; 
     assertEquals(array1.length, ObjectUtils.hashCode(array1)); 
     assertEquals(array1[0], ObjectUtils.hashCode(array1)); 
     assertEquals(array1[1], ObjectUtils.hashCode(array2)); 
     final float[] array3 = new float[] { 1, 2, 3, 4 }; 
     assertEquals(array3.length, ObjectUtils.hashCode(array3)); 
     assertEquals(array3[0], ObjectUtils.hashCode(array3)); 
     assertEquals(array3[1], ObjectUtils.hashCode(array3)); 
     assertEquals(array3[2], ObjectUtils.hashCode(array3)); 
     final float[] array4 = new float[] { 1, 2, 3, 4 }; 
     assertEquals(array4.length, ObjectUtils.hashCode(array4)); 
     assertEquals(array4[0], ObjectUtils.hashCode(array4)); 
     assertEquals(array4[1], ObjectUtils.hashCode(array1)); 
     assertEquals(array4[2], ObjectUtils.hashCode(array2)); 
     assertEquals(array3[3], ObjectUtils.hashCode(array3)); 
     assertEquals(array4, ObjectUtils.hashCode(array4));
}

@Test
public void testHashCode296() { 
     assertEquals(null, ObjectUtils.hashCode((short[]) null)); 
     assertEquals(Boolean.TRUE, ObjectUtils.hashCode(Boolean.TRUE)); 
     final short[] array1 = new short[] { 1, 2, 3 }; 
     final short[] array2 = new short[] { 4, 6 }; 
     assertTrue(ObjectUtils.hashCode(array1) == ObjectUtils.hashCode(array1)); 
     assertTrue(ObjectUtils.hashCode(array2) == ObjectUtils.hashCode(array2)); 
     final short[] array3 = new short[] { 1, 2, 3, 4 }; 
     final short[] array4 = new short[] { 1, 2, 3, 4 }; 
     assertTrue(ObjectUtils.hashCode(array3) == ObjectUtils.hashCode(array3)); 
     assertTrue(ObjectUtils.hashCode(array3) == ObjectUtils.hashCode(array4)); 
     final Object[] arrayA = new Object[] { 1, 2, 3, 4 }; 
     final Object[] arrayB = new Object[] { 1, 2, 3, 4 }; 
     assertTrue(ObjectUtils.hashCode(arrayB) == ObjectUtils.hashCode(arrayA)); 
 }
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

//    /**
//     * Show that java.util.Date and java.sql.Timestamp are apples and oranges.
//     * Prompted by an email discussion. 
//     * 
//     * The behavior is different b/w Sun Java 1.3.1_10 and 1.4.2_03.
//     */
//    public void testDateEqualsJava() {
//        long now = 1076957313284L; // Feb 16, 2004 10:49... PST
//        java.util.Date date = new java.util.Date(now);
//        java.sql.Timestamp realTimestamp = new java.sql.Timestamp(now);
//        java.util.Date timestamp = realTimestamp;
//        // sanity check 1:
//        assertEquals(284000000, realTimestamp.getNanos());
//        assertEquals(1076957313284L, date.getTime());
//        //
//        // On Sun 1.3.1_10:
//        //junit.framework.AssertionFailedError: expected:<1076957313284> but was:<1076957313000>
//        //
//        //assertEquals(1076957313284L, timestamp.getTime());
//        //
//        //junit.framework.AssertionFailedError: expected:<1076957313284> but was:<1076957313000>
//        //
//        //assertEquals(1076957313284L, realTimestamp.getTime());
//        // sanity check 2:        
//        assertEquals(date.getDay(), realTimestamp.getDay());
//        assertEquals(date.getHours(), realTimestamp.getHours());
//        assertEquals(date.getMinutes(), realTimestamp.getMinutes());
//        assertEquals(date.getMonth(), realTimestamp.getMonth());
//        assertEquals(date.getSeconds(), realTimestamp.getSeconds());
//        assertEquals(date.getTimezoneOffset(), realTimestamp.getTimezoneOffset());
//        assertEquals(date.getYear(), realTimestamp.getYear());
//        //
//        // Time values are == and equals() on Sun 1.4.2_03 but NOT on Sun 1.3.1_10:
//        //
//        //assertFalse("Sanity check failed: date.getTime() == timestamp.getTime()", date.getTime() == timestamp.getTime());
//        //assertFalse("Sanity check failed: timestamp.equals(date)", timestamp.equals(date));
//        //assertFalse("Sanity check failed: date.equals(timestamp)", date.equals(timestamp));
//        // real test:
//        //assertFalse("java.util.Date and java.sql.Timestamp should be equal", ObjectUtils.equals(date, timestamp));
//    }
    
    
    
    
    
    
    
    

    
            
    

    

    

    

    /**
     * Tests {@link ObjectUtils#compare(Comparable, Comparable, boolean)}.
     */
    

    

    

    

    

    

    

    

    

    /**
     * Tests {@link ObjectUtils#clone(Object)} with a cloneable object.
     */
    

    /**
     * Tests {@link ObjectUtils#clone(Object)} with a not cloneable object.
     */
    

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an uncloneable object.
     */
    

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an object array.
     */
    

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an array of primitives.
     */
    

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with a cloneable object.
     */
    

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with a not cloneable object.
     */
    

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with an uncloneable object.
     */
    

    

    /**
     * String that is cloneable.
     */
    static final class CloneableString extends MutableObject<String> implements Cloneable {
        private static final long serialVersionUID = 1L;
        CloneableString(final String s) {
            super(s);
        }

        @Override
        public CloneableString clone() throws CloneNotSupportedException {
            return (CloneableString)super.clone();
        }
    }

    /**
     * String that is not cloneable.
     */
    static final class UncloneableString extends MutableObject<String> implements Cloneable {
        private static final long serialVersionUID = 1L;
        UncloneableString(final String s) {
            super(s);
        }
    }

    static final class NonComparableCharSequence implements CharSequence {
        final String value;

        /**
         * Create a new NonComparableCharSequence instance.
         *
         * @param value
         */
        public NonComparableCharSequence(final String value) {
            super();
            Validate.notNull(value);
            this.value = value;
        }

        @Override
        public char charAt(final int arg0) {
            return value.charAt(arg0);
        }

        @Override
        public int length() {
            return value.length();
        }

        @Override
        public CharSequence subSequence(final int arg0, final int arg1) {
            return value.subSequence(arg0, arg1);
        }

        @Override
        public String toString() {
            return value;
        }
    }

    static final class CharSequenceComparator implements Comparator<CharSequence> {

        @Override
        public int compare(final CharSequence o1, final CharSequence o2) {
            return o1.toString().compareTo(o2.toString());
        }

    }
}
