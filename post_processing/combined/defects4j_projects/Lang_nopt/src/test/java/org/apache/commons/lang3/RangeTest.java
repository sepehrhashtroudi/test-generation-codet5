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
public void testGetters955() { Range<Integer> range = Range.between(0, 10); assertEquals(0, range.getMinimum().intValue()); assertEquals(10, range.getMaximum().intValue()); assertTrue(range.contains(0)); assertTrue(range.contains(10)); assertFalse(range.contains(0)); assertFalse(range.contains(10)); assertFalse(range.contains(10)); assertFalse(range.contains(10)); assertFalse(range.contains(10)); assertFalse(range.contains(10)); assertFalse(range.contains(10)); assertFalse(range.contains(10)); assertFalse(range.contains(10));
}

@Test(expected = IllegalArgumentException.class) public void nullElement() { Range<Integer> range = Range.between(Integer.valueOf(0), Integer.valueOf(10)); assertEquals(Integer.valueOf(0), range.getMinimum()); assertEquals(Integer.valueOf(10), range.getMaximum()); assertTrue(range.contains(Integer.valueOf(0))); assertTrue(range.contains(Integer.valueOf(10))); assertFalse(range.contains(Integer.valueOf(10))); assertFalse(range.contains(Integer.valueOf(10))); assertFalse(range.contains(Integer.valueOf(10))); }
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
