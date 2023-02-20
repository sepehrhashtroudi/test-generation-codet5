/*
 *  Copyright 2001-2005 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.field;

import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for PreciseDurationDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestPreciseDurationDateTimeField extends TestCase {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestPreciseDurationDateTimeField.class);
    }

    public TestPreciseDurationDateTimeField(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------

public void test_convertText189() { 
     BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     assertEquals(0, field.convertText("0", null)); 
     assertEquals(29, field.convertText("29", null)); 
     try { 
         field.convertText("2A", null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         field.convertText(null, null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void test_set_RP_int_intarray_int307() { 
     BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     int[] values = new int[] { 10, 20, 30, 40 }; 
     int[] expected = new int[] { 10, 20, 30, 40 }; 
     int[] result = field.set(new TimeOfDay(), 2, values, 30); 
     assertEquals(true, Arrays.equals(result, expected)); 
     values = new int[] { 10, 20, 30, 40 }; 
     expected = new int[] { 10, 20, 29, 40 }; 
     result = field.set(new TimeOfDay(), 2, values, 29); 
     assertEquals(true, Arrays.equals(result, expected)); 
     values = new int[] { 10, 20, 30, 40 }; 
     expected = new int[] { 10, 20, 30, 40 }; 
     try { 
         field.set(new TimeOfDay(), 2, values, 60); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals(true, Arrays.equals(values, expected)); 
     values = new int[] { 10, 20, 30, 40 }; 
     expected = new int[] { 10, 20, 30, 40 }; 
     try { 
         field.set(new TimeOfDay(), 2, values, -1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals(true, Arrays.equals(values, expected)); 
 } 


public void test_remainder_long308() { 
     BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     assertEquals(0L, field.remainder(0L)); 
     assertEquals(29L, field.remainder(29L)); 
     assertEquals(30L, field.remainder(30L)); 
     assertEquals(31L, field.remainder(31L)); 
     assertEquals(0L, field.remainder(60L)); 
 } 


public void test_roundFloor_long547() { 
     BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     assertEquals(-120L, field.roundFloor(-61L)); 
     assertEquals(-60L, field.roundFloor(-60L)); 
     assertEquals(-60L, field.roundFloor(-59L)); 
     assertEquals(-60L, field.roundFloor(-1L)); 
     assertEquals(0L, field.roundFloor(0L)); 
     assertEquals(0L, field.roundFloor(1L)); 
     assertEquals(0L, field.roundFloor(29L)); 
     assertEquals(0L, field.roundFloor(30L)); 
     assertEquals(0L, field.roundFloor(31L)); 
     assertEquals(60L, field.roundFloor(60L)); 
 } 


public void test_isLenient708() { 
     BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     assertEquals(false, field.isLenient()); 
 } 


public void test_roundCeiling_long724() { 
     BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     assertEquals(-60L, field.roundCeiling(-61L)); 
     assertEquals(-60L, field.roundCeiling(-60L)); 
     assertEquals(0L, field.roundCeiling(-59L)); 
     assertEquals(0L, field.roundCeiling(-1L)); 
     assertEquals(0L, field.roundCeiling(0L)); 
     assertEquals(60L, field.roundCeiling(1L)); 
     assertEquals(60L, field.roundCeiling(29L)); 
     assertEquals(60L, field.roundCeiling(30L)); 
     assertEquals(60L, field.roundCeiling(31L)); 
     assertEquals(60L, field.roundCeiling(60L)); 
 } 


public void test_set_long_int818() { 
     BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     assertEquals(0, field.set(120L, 0)); 
     assertEquals(29 * 60, field.set(120L, 29)); 
 } 


public void test_constructor1727() { 
     BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     try { 
         field = new MockPreciseDurationDateTimeField(null, null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         field = new MockPreciseDurationDateTimeField(DateTimeFieldType.minuteOfHour(), new MockImpreciseDurationField(DurationFieldType.minutes())); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         field = new MockPreciseDurationDateTimeField(DateTimeFieldType.minuteOfHour(), new MockZeroDurationField(DurationFieldType.minutes())); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void test_add_long_int1740() { 
     MockCountingDurationField.add_int = 0; 
     BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     assertEquals(61, field.add(1L, 1)); 
     assertEquals(1, MockCountingDurationField.add_int); 
 } 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //------------------------------------------------------------------------
//    public abstract DurationField getDurationField();
//
//    public abstract DurationField getRangeDurationField();

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //------------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    static class MockPreciseDurationDateTimeField extends PreciseDurationDateTimeField {
        protected MockPreciseDurationDateTimeField() {
            super(DateTimeFieldType.secondOfMinute(),
                new MockCountingDurationField(DurationFieldType.seconds()));
        }
        protected MockPreciseDurationDateTimeField(DateTimeFieldType type, DurationField dur) {
            super(type, dur);
        }
        public int get(long instant) {
            return (int) (instant / 60L);
        }
        public DurationField getRangeDurationField() {
            return new MockCountingDurationField(DurationFieldType.minutes());
        }
        public int getMaximumValue() {
            return 59;
        }
    }

    static class MockStandardBaseDateTimeField extends MockPreciseDurationDateTimeField {
        protected MockStandardBaseDateTimeField() {
            super();
        }
        public DurationField getDurationField() {
            return ISOChronology.getInstanceUTC().seconds();
        }
        public DurationField getRangeDurationField() {
            return ISOChronology.getInstanceUTC().minutes();
        }
    }

    //-----------------------------------------------------------------------
    static class MockCountingDurationField extends BaseDurationField {
        static int add_int = 0;
        static int add_long = 0;
        static int difference_long = 0;
        
        protected MockCountingDurationField(DurationFieldType type) {
            super(type);
        }
        public boolean isPrecise() {
            return true;
        }
        public long getUnitMillis() {
            return 60;
        }
        public long getValueAsLong(long duration, long instant) {
            return 0;
        }
        public long getMillis(int value, long instant) {
            return 0;
        }
        public long getMillis(long value, long instant) {
            return 0;
        }
        public long add(long instant, int value) {
            add_int++;
            return instant + (value * 60L);
        }
        public long add(long instant, long value) {
            add_long++;
            return instant + (value * 60L);
        }
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
            difference_long++;
            return 30;
        }
    }

    //-----------------------------------------------------------------------
    static class MockZeroDurationField extends BaseDurationField {
        protected MockZeroDurationField(DurationFieldType type) {
            super(type);
        }
        public boolean isPrecise() {
            return true;
        }
        public long getUnitMillis() {
            return 0;  // this is zero
        }
        public long getValueAsLong(long duration, long instant) {
            return 0;
        }
        public long getMillis(int value, long instant) {
            return 0;
        }
        public long getMillis(long value, long instant) {
            return 0;
        }
        public long add(long instant, int value) {
            return 0;
        }
        public long add(long instant, long value) {
            return 0;
        }
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
            return 0;
        }
    }

    //-----------------------------------------------------------------------
    static class MockImpreciseDurationField extends BaseDurationField {
        protected MockImpreciseDurationField(DurationFieldType type) {
            super(type);
        }
        public boolean isPrecise() {
            return false;  // this is false
        }
        public long getUnitMillis() {
            return 0;
        }
        public long getValueAsLong(long duration, long instant) {
            return 0;
        }
        public long getMillis(int value, long instant) {
            return 0;
        }
        public long getMillis(long value, long instant) {
            return 0;
        }
        public long add(long instant, int value) {
            return 0;
        }
        public long add(long instant, long value) {
            return 0;
        }
        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
            return 0;
        }
    }

}
