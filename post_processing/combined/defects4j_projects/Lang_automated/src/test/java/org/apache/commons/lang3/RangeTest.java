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
import static org.junit.Assert.fail;

import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Tests the methods in the {@link org.apache.commons.lang3.Range} class.
 * </p>
 * 
 * @version $Id$
 */
@SuppressWarnings("boxing")
public class RangeTest {

    private Range<Byte> byteRange;
    private Range<Byte> byteRange2;
    private Range<Byte> byteRange3;

    private Range<Integer> intRange;
    private Range<Long> longRange;
    private Range<Float> floatRange;
    private Range<Double> doubleRange;

    @SuppressWarnings("cast") // intRange
    @Before
    public void setUp() {
        byteRange   = Range.between((byte) 0, (byte) 5);
        byteRange2  = Range.between((byte) 0, (byte) 5);
        byteRange3  = Range.between((byte) 0, (byte) 10);

        intRange    = Range.between((int) 10, (int) 20);
        longRange   = Range.between((long) 10, (long) 20);
        floatRange  = Range.between((float) 10, (float) 20);
        doubleRange = Range.between((double) 10, (double) 20);
    }

    //-----------------------------------------------------------------------
@Test
public void testBetween73() { 
     final Comparator<Integer> c = new Comparator<Integer>() { 
  
         @Override 
         public int compare(final Integer o1, final Integer o2) { 
             return 0; 
         } 
     }; 
     Range<Integer> ri = Range.between(10, 20); 
     assertFalse("should not contain null", ri.contains(null)); 
     assertTrue("should contain 10", ri.contains(10)); 
     assertFalse("should not contain 11", ri.contains(11)); 
     ri = Range.between(10, 20); 
     assertFalse("should not contain null", ri.contains(null)); 
     assertTrue("should contain 10", ri.contains(10)); 
     assertTrue("should contain 11", ri.contains(11)); 
 }
@Test
public void testIsBeforeRange96() { 
     assertFalse(intRange.isBeforeRange(null)); 
     assertTrue(intRange.isBeforeRange(Range.between(12, 18))); 
     assertFalse(intRange.isBeforeRange(Range.between(32, 45))); 
     assertFalse(intRange.isBeforeRange(Range.between(2, 8))); 
     assertFalse(intRange.isBeforeRange(Range.between(10, 20))); 
     assertFalse(intRange.isBeforeRange(Range.between(9, 14))); 
     assertFalse(intRange.isBeforeRange(Range.between(16, 21))); 
     assertFalse(intRange.isBeforeRange(Range.between(10, 19))); 
     assertTrue(intRange.isBeforeRange(Range.between(10, 21))); 
     assertFalse(intRange.isBeforeRange(Range.between(11, 20))); 
     assertFalse(intRange.isBeforeRange(Range.between(9, 20))); 
     assertFalse(intRange.isBeforeRange(Range.between(-11, -18))); 
 }
@Test
public void testComparableConstructors379() { 
     final Comparable c = new Comparable() { 
  
         @Override 
         public int compareTo(final Object other) { 
             return 1; 
         } 
     }; 
     final Range r1 = Range.is(c); 
     final Range r2 = Range.between(c, c); 
     assertEquals(true, r1.isNaturalOrdering()); 
     assertEquals(true, r2.isNaturalOrdering()); 
 }
@Test
public void testBetween380() { 
     assertEquals(Range.between(12, 18), Range.between(12, 18)); 
     assertEquals(Range.between(10, 20), Range.between(10, 20)); 
     assertEquals(Range.between(15, 25), Range.between(15, 25)); 
     assertEquals(Range.between(20, 25), Range.between(20, 25)); 
     assertEquals(Range.between(15, 25), Range.between(15, 25)); 
     assertEquals(Range.between(21, 25), Range.between(21, 25)); 
     assertEquals(Range.between(10, 20), Range.between(10, 20)); 
 }
@Test
public void testFormatDurationWords381() { 
     assertEquals("between(50 seconds, 75 seconds)", intRange.toString("50 seconds")); 
     assertEquals("between(50 seconds, 75 seconds)", longRange.toString("50 seconds")); 
     assertEquals("between(50 seconds, 75 seconds)", floatRange.toString("50 seconds")); 
     assertEquals("between(50 seconds, 75 seconds)", doubleRange.toString("50 seconds")); 
     assertEquals("between(50 seconds, 75 seconds)", floatRange.toString("50 seconds")); 
     assertEquals("between(50 seconds, 75 seconds)", doubleRange.toString("50 seconds")); 
 }
@Test
public void testFormatDurationWords383() { 
     assertEquals("between(50 seconds, 75 seconds)", intRange.toString("yyyy-MM-dd hh a mm:ss")); 
     assertEquals("between(50 seconds, 75 seconds)", longRange.toString("yyyy-MM-dd KK a mm:ss")); 
     assertEquals("between(50 seconds, 75 seconds)", floatRange.toString("50 seconds")); 
     assertEquals("between(50 seconds, 75 seconds)", doubleRange.toString("50 seconds")); 
     assertEquals("between(50 seconds, 75 seconds)", floatRange.toString("50 seconds")); 
     assertEquals("between(50 seconds, 75 seconds)", doubleRange.toString("50 seconds")); 
 }
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
