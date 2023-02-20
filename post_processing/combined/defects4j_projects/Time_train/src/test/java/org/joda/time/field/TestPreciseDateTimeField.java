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
 * This class is a Junit unit test for PreciseDateTimeField.
 *
 * @author Stephen Colebourne
 */
public class TestPreciseDateTimeField extends TestCase {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestPreciseDateTimeField.class);
    }

    public TestPreciseDateTimeField(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------

public void test_constructor193() { 
     BaseDateTimeField field = new PreciseDateTimeField(DateTimeFieldType.secondOfMinute(), ISOChronology.getInstanceUTC().millis(), ISOChronology.getInstanceUTC().hours()); 
     assertEquals(DateTimeFieldType.secondOfMinute(), field.getType()); 
     try { 
         field = new PreciseDateTimeField(null, null, null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), new MockImpreciseDurationField(DurationFieldType.minutes()), ISOChronology.getInstanceUTC().hours()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), ISOChronology.getInstanceUTC().hours(), new MockImpreciseDurationField(DurationFieldType.minutes())); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), ISOChronology.getInstanceUTC().hours(), ISOChronology.getInstanceUTC().hours()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         field = new PreciseDateTimeField(DateTimeFieldType.minuteOfHour(), new MockZeroDurationField(DurationFieldType.minutes()), ISOChronology.getInstanceUTC().hours()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void test_getMaximumValue601() { 
     BaseDateTimeField field = new MockPreciseDateTimeField(); 
     assertEquals(59, field.getMaximumValue()); 
 } 


public void test_addWrapField_long_int1066() { 
     BaseDateTimeField field = new MockPreciseDateTimeField(); 
     assertEquals(29 * 60L, field.addWrapField(60L * 29, 0)); 
     assertEquals(59 * 60L, field.addWrapField(60L * 29, 30)); 
     assertEquals(0 * 60L, field.addWrapField(60L * 29, 31)); 
 } 


public void test_getRange1083() { 
     PreciseDateTimeField field = new MockPreciseDateTimeField(); 
     assertEquals(60, field.getRange()); 
 } 


public void test_set_long_String1115() { 
     BaseDateTimeField field = new MockPreciseDateTimeField(); 
     assertEquals(0, field.set(0L, "0")); 
     assertEquals(29 * 60, field.set(0L, "29")); 
 } 


public void test_getAsShortText_long_Locale1275() { 
     BaseDateTimeField field = new MockPreciseDateTimeField(); 
     assertEquals("29", field.getAsShortText(60L * 29, Locale.ENGLISH)); 
     assertEquals("29", field.getAsShortText(60L * 29, null)); 
 } 


public void test_add_RP_int_intarray_int1703() { 
     int[] values = new int[] { 10, 20, 30, 40 }; 
     int[] expected = new int[] { 10, 20, 30, 40 }; 
     BaseDateTimeField field = new MockStandardDateTimeField(); 
     int[] result = field.add(new TimeOfDay(), 2, values, 0); 
     assertEquals(true, Arrays.equals(expected, result)); 
     values = new int[] { 10, 20, 30, 40 }; 
     expected = new int[] { 10, 20, 31, 40 }; 
     result = field.add(new TimeOfDay(), 2, values, 1); 
     assertEquals(true, Arrays.equals(expected, result)); 
     values = new int[] { 10, 20, 30, 40 }; 
     expected = new int[] { 10, 21, 0, 40 }; 
     result = field.add(new TimeOfDay(), 2, values, 30); 
     assertEquals(true, Arrays.equals(expected, result)); 
     values = new int[] { 23, 59, 30, 40 }; 
     try { 
         field.add(new TimeOfDay(), 2, values, 30); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     values = new int[] { 10, 20, 30, 40 }; 
     expected = new int[] { 10, 20, 29, 40 }; 
     result = field.add(new TimeOfDay(), 2, values, -1); 
     assertEquals(true, Arrays.equals(expected, result)); 
     values = new int[] { 10, 20, 30, 40 }; 
     expected = new int[] { 10, 19, 59, 40 }; 
     result = field.add(new TimeOfDay(), 2, values, -31); 
     assertEquals(true, Arrays.equals(expected, result)); 
     values = new int[] { 0, 0, 30, 40 }; 
     try { 
         field.add(new TimeOfDay(), 2, values, -31); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
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
    static class MockPreciseDateTimeField extends PreciseDateTimeField {
        protected MockPreciseDateTimeField() {
            super(DateTimeFieldType.secondOfMinute(),
                new MockCountingDurationField(DurationFieldType.seconds(), 60),
                new MockCountingDurationField(DurationFieldType.minutes(), 60 * 60));
        }
        protected MockPreciseDateTimeField(
                DateTimeFieldType type, DurationField dur, DurationField range) {
            super(type, dur, range);
        }
    }

    static class MockStandardDateTimeField extends MockPreciseDateTimeField {
        protected MockStandardDateTimeField() {
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
        int unit;
        
        protected MockCountingDurationField(DurationFieldType type, int unit) {
            super(type);
            this.unit = unit;
        }
        public boolean isPrecise() {
            return true;
        }
        public long getUnitMillis() {
            return unit;
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
