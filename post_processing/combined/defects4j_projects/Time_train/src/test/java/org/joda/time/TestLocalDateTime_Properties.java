/*
 *  Copyright 2001-2010 Stephen Colebourne
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
package org.joda.time;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.CopticChronology;

/**
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Properties extends TestCase {

    private static final CopticChronology COPTIC_UTC = CopticChronology.getInstanceUTC();

    private int MILLIS_OF_DAY =
        (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L);
    private long TEST_TIME_NOW =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + MILLIS_OF_DAY;
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 4L * DateTimeConstants.MILLIS_PER_HOUR
        + 5L * DateTimeConstants.MILLIS_PER_MINUTE
        + 6L * DateTimeConstants.MILLIS_PER_SECOND
        + 7L;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestLocalDateTime_Properties.class);
    }

    public TestLocalDateTime_Properties(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
        systemDefaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.ENGLISH);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
        Locale.setDefault(systemDefaultLocale);
        systemDefaultLocale = null;
    }

    //-----------------------------------------------------------------------

public void testPropertyRoundHour82() { 
     LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20); 
     check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     test = new LocalDateTime(2005, 6, 9, 10, 40); 
     check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     test = new LocalDateTime(2005, 6, 9, 10, 30); 
     check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 10, 0, 0, 0); 
     test = new LocalDateTime(2005, 6, 9, 11, 30); 
     check(test.hourOfDay().roundCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0); 
     check(test.hourOfDay().roundFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     check(test.hourOfDay().roundHalfCeilingCopy(), 2005, 6, 9, 12, 0, 0, 0); 
     check(test.hourOfDay().roundHalfFloorCopy(), 2005, 6, 9, 11, 0, 0, 0); 
     check(test.hourOfDay().roundHalfEvenCopy(), 2005, 6, 9, 12, 0, 0, 0); 
 } 


public void testPropertySetTextSecond291() { 
     LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     LocalDateTime copy = test.secondOfMinute().setCopy("12"); 
     check(test, 2005, 6, 9, 10, 20, 30, 40); 
     check(copy, 2005, 6, 9, 10, 20, 12, 40); 
 } 


public void testPropertyAddToCopyMonth366() { 
     LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     LocalDateTime copy = test.monthOfYear().addToCopy(6); 
     check(test, 1972, 6, 9, 10, 20, 30, 40); 
     check(copy, 1972, 12, 9, 10, 20, 30, 40); 
     copy = test.monthOfYear().addToCopy(7); 
     check(copy, 1973, 1, 9, 10, 20, 30, 40); 
     copy = test.monthOfYear().addToCopy(-5); 
     check(copy, 1972, 1, 9, 10, 20, 30, 40); 
     copy = test.monthOfYear().addToCopy(-6); 
     check(copy, 1971, 12, 9, 10, 20, 30, 40); 
     test = new LocalDateTime(1972, 1, 31, 10, 20, 30, 40); 
     copy = test.monthOfYear().addToCopy(1); 
     check(copy, 1972, 2, 29, 10, 20, 30, 40); 
     copy = test.monthOfYear().addToCopy(2); 
     check(copy, 1972, 3, 31, 10, 20, 30, 40); 
     copy = test.monthOfYear().addToCopy(3); 
     check(copy, 1972, 4, 30, 10, 20, 30, 40); 
     test = new LocalDateTime(1971, 1, 31, 10, 20, 30, 40); 
     copy = test.monthOfYear().addToCopy(1); 
     check(copy, 1971, 2, 28, 10, 20, 30, 40); 
 } 


public void testPropertyGetMonth367() { 
     LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     assertEquals("monthOfYear", test.monthOfYear().getName()); 
     assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     assertSame(test, test.monthOfYear().getLocalDateTime()); 
     assertEquals(6, test.monthOfYear().get()); 
     assertEquals("6", test.monthOfYear().getAsString()); 
     assertEquals("June", test.monthOfYear().getAsText()); 
     assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40); 
     assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 } 


public void testPropertyWithMaxMinValueHour515() { 
     LocalDateTime test = new LocalDateTime(2005, 6, 9, 0, 20, 30, 40); 
     check(test.hourOfDay().withMaximumValue(), 2005, 6, 9, 23, 20, 30, 40); 
     check(test.hourOfDay().withMinimumValue(), 2005, 6, 9, 0, 20, 30, 40); 
 } 


public void testPropertyAddWrapFieldToCopyMilli568() { 
     LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     LocalDateTime copy = test.millisOfSecond().addWrapFieldToCopy(9); 
     check(test, 2005, 6, 9, 10, 20, 30, 40); 
     check(copy, 2005, 6, 9, 10, 20, 30, 49); 
     copy = test.millisOfSecond().addWrapFieldToCopy(995); 
     check(copy, 2005, 6, 9, 10, 20, 30, 35); 
     copy = test.millisOfSecond().addWrapFieldToCopy(-47); 
     check(copy, 2005, 6, 9, 10, 20, 30, 993); 
 } 


public void testPropertyCompareToDay730() { 
     LocalDateTime test1 = new LocalDateTime(TEST_TIME1); 
     LocalDateTime test2 = new LocalDateTime(TEST_TIME2); 
     assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0); 
     assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0); 
     assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0); 
     try { 
         test1.dayOfMonth().compareTo((ReadablePartial) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     DateTime dt1 = new DateTime(TEST_TIME1); 
     DateTime dt2 = new DateTime(TEST_TIME2); 
     assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0); 
     assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0); 
     assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0); 
     try { 
         test1.dayOfMonth().compareTo((ReadableInstant) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testPropertyGetMinute766() { 
     LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     assertSame(test, test.minuteOfHour().getLocalDateTime()); 
     assertEquals(20, test.minuteOfHour().get()); 
     assertEquals("20", test.minuteOfHour().getAsString()); 
     assertEquals("20", test.minuteOfHour().getAsText()); 
     assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     assertEquals("20", test.minuteOfHour().getAsShortText()); 
     assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 } 


public void testPropertyHashCode1249() { 
     LocalDateTime test1 = new LocalDateTime(2005, 11, 8, 10, 20, 30, 40); 
     LocalDateTime test2 = new LocalDateTime(2005, 11, 9, 10, 20, 30, 40); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); 
     assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); 
 } 


public void testPropertyGetMilli1422() { 
     LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField()); 
     assertEquals("millisOfSecond", test.millisOfSecond().getName()); 
     assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString()); 
     assertSame(test, test.millisOfSecond().getLocalDateTime()); 
     assertEquals(40, test.millisOfSecond().get()); 
     assertEquals("40", test.millisOfSecond().getAsString()); 
     assertEquals("40", test.millisOfSecond().getAsText()); 
     assertEquals("40", test.millisOfSecond().getAsText(Locale.FRENCH)); 
     assertEquals("40", test.millisOfSecond().getAsShortText()); 
     assertEquals("40", test.millisOfSecond().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField()); 
     assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField()); 
     assertEquals(3, test.millisOfSecond().getMaximumTextLength(null)); 
     assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null)); 
 } 


public void testPropertySetCopyYear1536() { 
     LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     LocalDateTime copy = test.year().setCopy(12); 
     check(test, 1972, 6, 9, 10, 20, 30, 40); 
     check(copy, 12, 6, 9, 10, 20, 30, 40); 
 } 

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDateTime test, int year, int month, int day, int hour, int min, int sec, int mil) {
        assertEquals(year, test.getYear());
        assertEquals(month, test.getMonthOfYear());
        assertEquals(day, test.getDayOfMonth());
        assertEquals(hour, test.getHourOfDay());
        assertEquals(min, test.getMinuteOfHour());
        assertEquals(sec, test.getSecondOfMinute());
        assertEquals(mil, test.getMillisOfSecond());
    }
}
