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

public void testDurationFields193() { 
     final EthiopicChronology ethiopic = EthiopicChronology.getInstance(); 
     assertEquals("eras", ethiopic.eras().getName()); 
     assertEquals("centuries", ethiopic.centuries().getName()); 
     assertEquals("years", ethiopic.years().getName()); 
     assertEquals("weekyears", ethiopic.weekyears().getName()); 
     assertEquals("months", ethiopic.months().getName()); 
     assertEquals("weeks", ethiopic.weeks().getName()); 
     assertEquals("days", ethiopic.days().getName()); 
     assertEquals("halfdays", ethiopic.halfdays().getName()); 
     assertEquals("hours", ethiopic.hours().getName()); 
     assertEquals("minutes", ethiopic.minutes().getName()); 
     assertEquals("seconds", ethiopic.seconds().getName()); 
     assertEquals("millis", ethiopic.millis().getName()); 
     assertEquals(false, ethiopic.eras().isSupported()); 
     assertEquals(true, ethiopic.centuries().isSupported()); 
     assertEquals(true, ethiopic.years().isSupported()); 
     assertEquals(true, ethiopic.weekyears().isSupported()); 
     assertEquals(true, ethiopic.months().isSupported()); 
     assertEquals(true, ethiopic.weeks().isSupported()); 
     assertEquals(true, ethiopic.days().isSupported()); 
     assertEquals(true, ethiopic.halfdays().isSupported()); 
     assertEquals(true, ethiopic.hours().isSupported()); 
     assertEquals(true, ethiopic.minutes().isSupported()); 
     assertEquals(true, ethiopic.seconds().isSupported()); 
     assertEquals(true, ethiopic.millis().isSupported()); 
     assertEquals(false, ethiopic.centuries().isPrecise()); 
     assertEquals(false,


public void testBug2182444_usCentral194() { 
     Chronology chronUSCentral = GregorianChronology.getInstance(DateTimeZone.forID("US/Central")); 
     Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC); 
     DateTime usCentralStandardInUTC = new DateTime(2008, 11, 2, 7, 0, 0, 0, chronUTC); 
     DateTime usCentralDaylightInUTC = new DateTime(2008, 11, 2, 6, 0, 0, 0, chronUTC); 
     assertTrue("Should be standard time", chronUSCentral.getZone().isStandardOffset(usCentralStandardInUTC.getMillis())); 
     assertFalse("Should be daylight time", chronUSCentral.getZone().isStandardOffset(usCentralDaylightInUTC.getMillis())); 
     DateTime usCentralStandardInUSCentral = usCentralStandardInUTC.toDateTime(chronUSCentral); 
     DateTime usCentralDaylightInUSCentral = usCentralDaylightInUTC.toDateTime(chronUSCentral); 
     assertEquals(1, usCentralStandardInUSCentral.getHourOfDay()); 
     assertEquals(usCentralStandardInUSCentral.getHourOfDay(), usCentralDaylightInUSCentral.getHourOfDay()); 
     assertTrue(usCentralStandardInUSCentral.getMillis() != usCentralDaylightInUSCentral.getMillis()); 
     assertEquals(usCentralStandardInUSCentral, usCentralStandardInUSCentral.withHourOfDay(1)); 
     assertEquals(usCentralStandardInUSCentral.getMillis() + 3, usCentralStandardInUSCentral.withMillisOfSecond(3).getMillis()); 
     assertEquals(usCentralDaylightInUSCentral, usCentralDaylightInUSCentral.withHourOfDay(1)); 
     assertEquals(usCentralDaylightInUSCentral.getMillis() + 3, usCentralDaylightInUSCentral.withMillisOfSecond(3).getMillis


public void testDurationFields195() { 
     final CopticChronology coptic = CopticChronology.getInstance(); 
     assertEquals("eras", coptic.eras().getName()); 
     assertEquals("centuries", coptic.centuries().getName()); 
     assertEquals("years", coptic.years().getName()); 
     assertEquals("weekyears", coptic.weekyears().getName()); 
     assertEquals("months", coptic.months().getName()); 
     assertEquals("weeks", coptic.weeks().getName()); 
     assertEquals("days", coptic.days().getName()); 
     assertEquals("halfdays", coptic.halfdays().getName()); 
     assertEquals("hours", coptic.hours().getName()); 
     assertEquals("minutes", coptic.minutes().getName()); 
     assertEquals("seconds", coptic.seconds().getName()); 
     assertEquals("millis", coptic.millis().getName()); 
     assertEquals(false, coptic.eras().isSupported()); 
     assertEquals(true, coptic.centuries().isSupported()); 
     assertEquals(true, coptic.years().isSupported()); 
     assertEquals(true, coptic.weekyears().isSupported()); 
     assertEquals(true, coptic.months().isSupported()); 
     assertEquals(true, coptic.weeks().isSupported()); 
     assertEquals(true, coptic.days().isSupported()); 
     assertEquals(true, coptic.halfdays().isSupported()); 
     assertEquals(true, coptic.hours().isSupported()); 
     assertEquals(true, coptic.minutes().isSupported()); 
     assertEquals(true, coptic.seconds().isSupported()); 
     assertEquals(true, coptic.millis().isSupported()); 
     assertEquals(false, coptic.centuries().isPrecise()); 
     assertEquals(false, coptic.years().isPrecise()); 
     assertEquals(false, coptic.weekyears().isPrecise());


public void test_getMaximumShortTextLength_Locale196() { 
     OffsetDateTimeField field = new MockOffsetDateTimeField(); 
     assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH)); 
 }


public void testToInterval197() { 
     YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     Interval test = base.toInterval(); 
     check(base, 2005, 6); 
     DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON); 
     DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON); 
     Interval expected = new Interval(start, end); 
     assertEquals(expected, test); 
 }


public void testSkipDateTimeField198() { 
     DateTimeField field = new SkipDateTimeField(ISOChronology.getInstanceUTC(), ISOChronology.getInstanceUTC().year(), 1970); 
     try { 
         field.set(0, 1970); 
         fail(); 
     } catch (IllegalFieldValueException e) { 
         assertEquals(DateTimeFieldType.year(), e.getDateTimeFieldType()); 
         assertEquals(null, e.getDurationFieldType()); 
         assertEquals("year", e.getFieldName()); 
         assertEquals(new Integer(1970), e.getIllegalNumberValue()); 
         assertEquals(null, e.getIllegalStringValue()); 
         assertEquals("1970", e.getIllegalValueAsString()); 
         assertEquals(null, e.getLowerBound()); 
         assertEquals(null, e.getUpperBound()); 
     } 
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
