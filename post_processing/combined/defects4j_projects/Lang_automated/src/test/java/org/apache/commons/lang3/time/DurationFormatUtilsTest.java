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

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * TestCase for DurationFormatUtils.
 * 
 */
public class DurationFormatUtilsTest {

    // -----------------------------------------------------------------------
@Test
public void testBugzilla38401120() { 
     assertEqualDuration("0000/00/30 16:00:00 000", new int[] { 2006, 0, 26, 18, 47, 34 }, new int[] { 2006, 1, 26, 10, 47, 34 }, "yyyy/MM/dd HH:mm:ss SSS"); 
 }
    

    // -----------------------------------------------------------------------
    

    /**
     * Tests that "1 <unit>s" gets converted to "1 <unit>" but that "11 <unit>s" is left alone.
     */
    

    

    

    

    

    

    


    // http://issues.apache.org/bugzilla/show_bug.cgi?id=38401
    

    // https://issues.apache.org/jira/browse/LANG-281
    

    

    // Testing the under a day range in DurationFormatUtils.formatPeriod
    

    // Attempting to test edge cases in DurationFormatUtils.formatPeriod
    
    
    
    
    private static final int FOUR_YEARS = 365 * 3 + 366;
    
    // Takes a minute to run, so generally turned off
//    public void testBrutally() {
//        Calendar c = Calendar.getInstance();
//        c.set(2004, 0, 1, 0, 0, 0);
//        for (int i=0; i < FOUR_YEARS; i++) {
//            bruteForce(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH), "d", Calendar.DAY_OF_MONTH );
//            c.add(Calendar.DAY_OF_MONTH, 1);
//        }
//    }        
    
    private void bruteForce(final int year, final int month, final int day, final String format, final int calendarType) {
        final String msg = year + "-" + month + "-" + day + " to ";
        final Calendar c = Calendar.getInstance();
        c.set(year, month, day, 0, 0, 0);
        final int[] array1 = new int[] { year, month, day, 0, 0, 0 };
        final int[] array2 = new int[] { year, month, day, 0, 0, 0 };
        for (int i=0; i < FOUR_YEARS; i++) {
            array2[0] = c.get(Calendar.YEAR);
            array2[1] = c.get(Calendar.MONTH);
            array2[2] = c.get(Calendar.DAY_OF_MONTH);
            final String tmpMsg = msg + array2[0] + "-" + array2[1] + "-" + array2[2] + " at ";
            assertEqualDuration( tmpMsg + i, Integer.toString(i), array1, array2, format );
            c.add(calendarType, 1);
        }
    }

    private void assertEqualDuration(final String expected, final int[] start, final int[] end, final String format) {
        assertEqualDuration(null, expected, start, end, format);
    }
    private void assertEqualDuration(final String message, final String expected, final int[] start, final int[] end, final String format) {
        final Calendar cal1 = Calendar.getInstance();
        cal1.set(start[0], start[1], start[2], start[3], start[4], start[5]);
        cal1.set(Calendar.MILLISECOND, 0);
        final Calendar cal2 = Calendar.getInstance();
        cal2.set(end[0], end[1], end[2], end[3], end[4], end[5]);
        cal2.set(Calendar.MILLISECOND, 0);
        final long milli1 = cal1.getTime().getTime();
        final long milli2 = cal2.getTime().getTime();
        final String result = DurationFormatUtils.formatPeriod(milli1, milli2, format);
        if (message == null) {
            assertEquals(expected, result);
        } else {
            assertEquals(message, expected, result);
        }
    }

    private void assertArrayEquals(final DurationFormatUtils.Token[] obj1, final DurationFormatUtils.Token[] obj2) {
        assertEquals("Arrays are unequal length. ", obj1.length, obj2.length);
        for (int i = 0; i < obj1.length; i++) {
            assertTrue("Index " + i + " not equal, " + obj1[i] + " vs " + obj2[i], obj1[i].equals(obj2[i]));
        }
    }

}
