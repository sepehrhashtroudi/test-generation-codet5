/*
 *  Copyright 2001-2013 Stephen Colebourne
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Basics extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final int OFFSET = 1;
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestTimeOfDay_Basics.class);
    }

    public TestTimeOfDay_Basics(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
    }

    //-----------------------------------------------------------------------

public void testWithers121() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     check(test.withHourOfDay(6), 6, 20, 30, 40); 
     check(test.withMinuteOfHour(6), 10, 6, 30, 40); 
     check(test.withSecondOfMinute(6), 10, 20, 6, 40); 
     check(test.withMillisOfSecond(6), 10, 20, 30, 6); 
     try { 
         test.withHourOfDay(-1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.withHourOfDay(24); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testToDateTime_RI146() { 
     TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     DateTime dt = new DateTime(0L); 
     assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString()); 
     DateTime test = base.toDateTime(dt); 
     check(base, 10, 20, 30, 40); 
     assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString()); 
     assertEquals("1970-01-01T10:20:30.040+01:00", test.toString()); 
 } 


public void testMinus_RP312() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance()); 
     TimeOfDay result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     TimeOfDay expected = new TimeOfDay(9, 19, 29, 39, BuddhistChronology.getInstance()); 
     assertEquals(expected, result); 
     result = test.minus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


public void testToDateTimeToday_Zone463() { 
     TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     DateTime test = base.toDateTimeToday(TOKYO); 
     check(base, 10, 20, 30, 40); 
     DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO); 
     expected = expected.hourOfDay().setCopy(10); 
     expected = expected.minuteOfHour().setCopy(20); 
     expected = expected.secondOfMinute().setCopy(30); 
     expected = expected.millisOfSecond().setCopy(40); 
     assertEquals(expected, test); 
 } 


public void testWithField4496() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 10); 
     assertSame(test, result); 
 } 


public void testWithChronologyRetainFields_Chrono542() { 
     TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     TimeOfDay test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     check(base, 10, 20, 30, 40); 
     assertEquals(COPTIC_UTC, base.getChronology()); 
     check(test, 10, 20, 30, 40); 
     assertEquals(BUDDHIST_UTC, test.getChronology()); 
 } 


public void testPlusMillis_int643() { 
     TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     TimeOfDay result = test.plusMillis(1); 
     TimeOfDay expected = new TimeOfDay(1, 2, 3, 5, BuddhistChronology.getInstance()); 
     assertEquals(expected, result); 
     result = test.plusMillis(0); 
     assertSame(test, result); 
 } 


public void testMinusMinutes_int839() { 
     TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     TimeOfDay result = test.minusMinutes(1); 
     TimeOfDay expected = new TimeOfDay(1, 1, 3, 4, BuddhistChronology.getInstance()); 
     assertEquals(expected, result); 
     result = test.minusMinutes(0); 
     assertSame(test, result); 
 } 


public void testMinusMillis_int848() { 
     TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     TimeOfDay result = test.minusMillis(1); 
     TimeOfDay expected = new TimeOfDay(1, 2, 3, 3, BuddhistChronology.getInstance()); 
     assertEquals(expected, result); 
     result = test.minusMillis(0); 
     assertSame(test, result); 
 } 


public void testGetField900() { 
     TimeOfDay test = new TimeOfDay(COPTIC_PARIS); 
     assertSame(CopticChronology.getInstanceUTC().hourOfDay(), test.getField(0)); 
     assertSame(CopticChronology.getInstanceUTC().minuteOfHour(), test.getField(1)); 
     assertSame(CopticChronology.getInstanceUTC().secondOfMinute(), test.getField(2)); 
     assertSame(CopticChronology.getInstanceUTC().millisOfSecond(), test.getField(3)); 
     try { 
         test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     try { 
         test.getField(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 } 


public void testToString907() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     assertEquals("T10:20:30.040", test.toString()); 
 } 


public void testMinusSeconds_int922() { 
     TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     TimeOfDay result = test.minusSeconds(1); 
     TimeOfDay expected = new TimeOfDay(1, 2, 2, 4, BuddhistChronology.getInstance()); 
     assertEquals(expected, result); 
     result = test.minusSeconds(0); 
     assertSame(test, result); 
 } 


public void testPlus_RP948() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40, BuddhistChronology.getInstance()); 
     TimeOfDay result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     TimeOfDay expected = new TimeOfDay(15, 26, 37, 48, BuddhistChronology.getInstance()); 
     assertEquals(expected, result); 
     result = test.plus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


public void testProperty1034() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     try { 
         test.property(DateTimeFieldType.millisOfDay()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.property(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testWithFieldAdded31098() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     try { 
         test.withFieldAdded(null, 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testWithField11177() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     TimeOfDay result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     assertEquals(new TimeOfDay(10, 20, 30, 40), test); 
     assertEquals(new TimeOfDay(15, 20, 30, 40), result); 
 } 


public void testToString_String1306() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     assertEquals("T10:20:30.040", test.toString((String) null)); 
 } 


public void testWithField31310() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     try { 
         test.withField(DateTimeFieldType.dayOfMonth(), 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testToDateTimeToday1436() { 
     TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     DateTime test = base.toDateTimeToday(); 
     check(base, 10, 20, 30, 40); 
     DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     expected = expected.hourOfDay().setCopy(10); 
     expected = expected.minuteOfHour().setCopy(20); 
     expected = expected.secondOfMinute().setCopy(30); 
     expected = expected.millisOfSecond().setCopy(40); 
     assertEquals(expected, test); 
 } 


public void testPlusSeconds_int1438() { 
     TimeOfDay test = new TimeOfDay(1, 2, 3, 4, BuddhistChronology.getInstance()); 
     TimeOfDay result = test.plusSeconds(1); 
     TimeOfDay expected = new TimeOfDay(1, 2, 4, 4, BuddhistChronology.getInstance()); 
     assertEquals(expected, result); 
     result = test.plusSeconds(0); 
     assertSame(test, result); 
 } 


public void testToLocalTime1500() { 
     TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_UTC); 
     LocalTime test = base.toLocalTime(); 
     assertEquals(new LocalTime(10, 20, 30, 40, COPTIC_UTC), test); 
 } 


public void testWithChronologyRetainFields_sameChrono1662() { 
     TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     TimeOfDay test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     assertSame(base, test); 
 } 


public void testGetFieldTypes1674() { 
     TimeOfDay test = new TimeOfDay(COPTIC_PARIS); 
     DateTimeFieldType[] fields = test.getFieldTypes(); 
     assertSame(DateTimeFieldType.hourOfDay(), fields[0]); 
     assertSame(DateTimeFieldType.minuteOfHour(), fields[1]); 
     assertSame(DateTimeFieldType.secondOfMinute(), fields[2]); 
     assertSame(DateTimeFieldType.millisOfSecond(), fields[3]); 
     assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 } 

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {
            return CopticChronology.getInstanceUTC();
        }
        public DateTimeField[] getFields() {
            return new DateTimeField[] {
                CopticChronology.getInstanceUTC().hourOfDay(),
                CopticChronology.getInstanceUTC().minuteOfHour(),
                CopticChronology.getInstanceUTC().secondOfMinute(),
                CopticChronology.getInstanceUTC().millisOfSecond(),
            };
        }
        public int[] getValues() {
            return new int[] {10, 20, 30, 40};
        }
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
    

    

    // Removed as too complex
//    /**
//     * Merges two partial together, taking account of the different chronologies.
//     *
//     * @param main  the main partial
//     * @param base  the partial to use as a base to merge on top of
//     * @param instant  the instant to start from and to use for missing fields
//     * @return the merged instant
//     */
//    public long merge(ReadablePartial main, ReadablePartial base, long instant) {
//        DateTimeZone zone = main.getChronology().getZone();
//        instant = base.getChronology().withZone(zone).set(base, instant);
//        return set(main, instant);
//    }
//
//    //-----------------------------------------------------------------------
//    /**
//     * Converts this object to a DateTime using a YearMonthDay to fill in the
//     * missing fields and using the default time zone.
//     * This instance is immutable and unaffected by this method call.
//     * <p>
//     * The resulting chronology is determined by the chronology of this
//     * TimeOfDay plus the time zone.
//     * <p>
//     * This method makes use of the chronology of the specified YearMonthDay
//     * in the calculation. This can be significant when mixing chronologies.
//     * If the YearMonthDay is in the same chronology as this instance the
//     * method will perform exactly as you might expect.
//     * <p>
//     * If the chronologies differ, then both this TimeOfDay and the YearMonthDay
//     * are converted to the destination chronology and then merged. As a result
//     * it may be the case that the year, monthOfYear and dayOfMonth fields on
//     * the result are different from the values returned by the methods on the
//     * YearMonthDay.
//     * <p>
//     * See {@link DateTime#withFields(ReadablePartial)} for an algorithm that
//     * ignores the chronology.
//     *
//     * @param date  the date to use, null means today
//     * @return the DateTime instance
//     */
//    public DateTime toDateTime(YearMonthDay date) {
//        return toDateTime(date, null);
//    }
//
//    /**
//     * Converts this object to a DateTime using a YearMonthDay to fill in the
//     * missing fields.
//     * This instance is immutable and unaffected by this method call.
//     * <p>
//     * The resulting chronology is determined by the chronology of this
//     * TimeOfDay plus the time zone.
//     * <p>
//     * This method makes use of the chronology of the specified YearMonthDay
//     * in the calculation. This can be significant when mixing chronologies.
//     * If the YearMonthDay is in the same chronology as this instance the
//     * method will perform exactly as you might expect.
//     * <p>
//     * If the chronologies differ, then both this TimeOfDay and the YearMonthDay
//     * are converted to the destination chronology and then merged. As a result
//     * it may be the case that the year, monthOfYear and dayOfMonth fields on
//     * the result are different from the values returned by the methods on the
//     * YearMonthDay.
//     * <p>
//     * See {@link DateTime#withFields(ReadablePartial)} for an algorithm that
//     * ignores the chronology and just assigns the fields.
//     *
//     * @param date  the date to use, null means today
//     * @param zone  the zone to get the DateTime in, null means default
//     * @return the DateTime instance
//     */
//    public DateTime toDateTime(YearMonthDay date, DateTimeZone zone) {
//        Chronology chrono = getChronology().withZone(zone);
//        if (date == null) {
//            DateTime dt = new DateTime(chrono);
//            return dt.withFields(this);
//        } else {
//            long millis = chrono.merge(this, date, DateTimeUtils.currentTimeMillis());
//            return new DateTime(millis, chrono);
//        }
//    }
//
//    //-----------------------------------------------------------------------
//    public void testToDateTime_YMD() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_TOKYO);
//        
//        DateTime test = base.toDateTime(ymd);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(LONDON), COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    public void testToDateTime_nullYMD() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        
//        DateTime test = base.toDateTime((YearMonthDay) null);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    //-----------------------------------------------------------------------
//    public void testToDateTime_YMD_Zone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_LONDON);
//        
//        DateTime test = base.toDateTime(ymd, TOKYO);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(TOKYO), COPTIC_TOKYO);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    public void testToDateTime_YMD_nullZone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        YearMonthDay ymd = new YearMonthDay(new DateMidnight(2004, 6, 9), BUDDHIST_LONDON);
//        
//        DateTime test = base.toDateTime(ymd, null);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(ymd.toDateMidnight(LONDON), COPTIC_LONDON);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }
//
//    public void testToDateTime_nullYMD_Zone() {
//        TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); // PARIS irrelevant
//        
//        DateTime test = base.toDateTime((YearMonthDay) null, TOKYO);
//        check(base, 10, 20, 30, 40);
//        DateTime expected = new DateTime(COPTIC_TOKYO);
//        expected = expected.hourOfDay().setCopy(10);
//        expected = expected.minuteOfHour().setCopy(20);
//        expected = expected.secondOfMinute().setCopy(30);
//        expected = expected.millisOfSecond().setCopy(40);
//        assertEquals(expected, test);
//    }

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {
        assertEquals(hour, test.getHourOfDay());
        assertEquals(min, test.getMinuteOfHour());
        assertEquals(sec, test.getSecondOfMinute());
        assertEquals(milli, test.getMillisOfSecond());
    }
}
