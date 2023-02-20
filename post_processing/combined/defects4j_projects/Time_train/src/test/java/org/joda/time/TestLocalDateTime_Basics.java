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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Basics extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final GJChronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);

//    private long TEST_TIME1 =
//        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 12L * DateTimeConstants.MILLIS_PER_HOUR
//        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//
//    private long TEST_TIME2 =
//        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 14L * DateTimeConstants.MILLIS_PER_HOUR
//        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private int MILLIS_OF_DAY_UTC =
        (int) (10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L);

    private long TEST_TIME_NOW_UTC =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY + MILLIS_OF_DAY_UTC;

    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestLocalDateTime_Basics.class);
    }

    public TestLocalDateTime_Basics(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
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

public void testToDate_autumnDST88() { 
     LocalDateTime base = new LocalDateTime(2007, 10, 2, 0, 20, 30, 0); 
     SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     TimeZone currentZone = TimeZone.getDefault(); 
     try { 
         TimeZone.setDefault(testZone); 
         Date test = base.toDate(); 
         check(base, 2007, 10, 2, 0, 20, 30, 0); 
         assertEquals("Tue Oct 02 00:20:30 GMT+02:00 2007", test.toString()); 
     } finally { 
         TimeZone.setDefault(currentZone); 
     } 
 } 


public void testMinusMonths_int98() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.minusMonths(1); 
     LocalDateTime expected = new LocalDateTime(2002, 4, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusMonths(0); 
     assertSame(test, result); 
 } 


public void testIsBefore_LocalDateTime101() { 
     LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     assertEquals(false, test1.isBefore(test1a)); 
     assertEquals(false, test1a.isBefore(test1)); 
     assertEquals(false, test1.isBefore(test1)); 
     assertEquals(false, test1a.isBefore(test1a)); 
     LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40); 
     assertEquals(true, test1.isBefore(test2)); 
     assertEquals(false, test2.isBefore(test1)); 
     LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC); 
     assertEquals(true, test1.isBefore(test3)); 
     assertEquals(false, test3.isBefore(test1)); 
     assertEquals(false, test3.isBefore(test2)); 
     try { 
         new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isBefore(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testMinusSeconds_int128() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.minusSeconds(1); 
     LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 29, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusSeconds(0); 
     assertSame(test, result); 
 } 


public void testMinusDays_int130() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.minusDays(1); 
     LocalDateTime expected = new LocalDateTime(2002, 5, 2, 10, 20, 30, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusDays(0); 
     assertSame(test, result); 
 } 


public void testPlusWeeks_int149() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.plusWeeks(1); 
     LocalDateTime expected = new LocalDateTime(2002, 5, 10, 10, 20, 30, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusWeeks(0); 
     assertSame(test, result); 
 } 


public void testProperty220() { 
     LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40, GJ_UTC); 
     assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     try { 
         test.property(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalDateTime()); 
 } 


public void testWithers246() { 
     LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC); 
     check(test.withYear(2000), 2000, 6, 9, 10, 20, 30, 40); 
     check(test.withMonthOfYear(2), 1970, 2, 9, 10, 20, 30, 40); 
     check(test.withDayOfMonth(2), 1970, 6, 2, 10, 20, 30, 40); 
     check(test.withDayOfYear(6), 1970, 1, 6, 10, 20, 30, 40); 
     check(test.withDayOfWeek(6), 1970, 6, 13, 10, 20, 30, 40); 
     check(test.withWeekOfWeekyear(6), 1970, 2, 3, 10, 20, 30, 40); 
     check(test.withWeekyear(1971), 1971, 6, 15, 10, 20, 30, 40); 
     check(test.withYearOfCentury(60), 1960, 6, 9, 10, 20, 30, 40); 
     check(test.withCenturyOfEra(21), 2070, 6, 9, 10, 20, 30, 40); 
     check(test.withYearOfEra(1066), 1066, 6, 9, 10, 20, 30, 40); 
     check(test.withEra(DateTimeConstants.BC), -1970, 6, 9, 10, 20, 30, 40); 
     check(test.withHourOfDay(6), 1970, 6, 9, 6, 20, 30, 40); 
     check(test.withMinuteOfHour(6), 1970, 6, 9, 10, 6, 30, 40); 
     check(test.withSecondOfMinute(6), 1970, 6, 9, 10, 20, 6, 40); 
     check(test.withMillisOfSecond(6), 1970, 6, 9, 10, 20, 30, 6); 
     check(test.withMillisOfDay(61234), 1970, 6, 9, 0, 1, 1, 234); 
     try { 
         test.withMonthOfYear(0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.withMonthOfYear(13); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testMinus_RP295() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     LocalDateTime expected = new LocalDateTime(2001, 3, 26, 9, 19, 29, 39, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


public void testToString_String_Locale311() { 
     LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40); 
     assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     assertEquals("1970-06-09T10:20:30.040", test.toString(null, Locale.ENGLISH)); 
     assertEquals("Tue 9/6", test.toString("EEE d/M", null)); 
     assertEquals("1970-06-09T10:20:30.040", test.toString(null, null)); 
 } 


public void testMinusMinutes_int369() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.minusMinutes(1); 
     LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 19, 30, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusMinutes(0); 
     assertSame(test, result); 
 } 


public void testToLocalTime375() { 
     LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); 
     LocalTime expected = new LocalTime(6, 7, 8, 9, COPTIC_LONDON); 
     assertEquals(expected, base.toLocalTime()); 
 } 


public void testGetters379() { 
     LocalDateTime test = new LocalDateTime(1970, 6, 9, 10, 20, 30, 40, GJ_UTC); 
     assertEquals(1970, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(160, test.getDayOfYear()); 
     assertEquals(2, test.getDayOfWeek()); 
     assertEquals(24, test.getWeekOfWeekyear()); 
     assertEquals(1970, test.getWeekyear()); 
     assertEquals(70, test.getYearOfCentury()); 
     assertEquals(20, test.getCenturyOfEra()); 
     assertEquals(1970, test.getYearOfEra()); 
     assertEquals(DateTimeConstants.AD, test.getEra()); 
     assertEquals(10, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
     assertEquals(MILLIS_OF_DAY_UTC, test.getMillisOfDay()); 
 } 


public void testPlusDays_int386() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.plusDays(1); 
     LocalDateTime expected = new LocalDateTime(2002, 5, 4, 10, 20, 30, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusDays(0); 
     assertSame(test, result); 
 } 


public void testToString_String423() { 
     LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40); 
     assertEquals("2002 10", test.toString("yyyy HH")); 
     assertEquals("2002-06-09T10:20:30.040", test.toString((String) null)); 
 } 


public void testToDate_springDST445() { 
     LocalDateTime base = new LocalDateTime(2007, 4, 2, 0, 20, 0, 0); 
     SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     TimeZone currentZone = TimeZone.getDefault(); 
     try { 
         TimeZone.setDefault(testZone); 
         Date test = base.toDate(); 
         check(base, 2007, 4, 2, 0, 20, 0, 0); 
         assertEquals("Mon Apr 02 01:00:00 GMT+02:00 2007", test.toString()); 
     } finally { 
         TimeZone.setDefault(currentZone); 
     } 
 } 


public void testMinusWeeks_int581() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.minusWeeks(1); 
     LocalDateTime expected = new LocalDateTime(2002, 4, 26, 10, 20, 30, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusWeeks(0); 
     assertSame(test, result); 
 } 


public void testWithFieldAdded_DurationFieldType_int_1610() { 
     LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 6); 
     assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test); 
     assertEquals(new LocalDateTime(2010, 6, 9, 10, 20, 30, 40), result); 
 } 


public void testIsSupported_DurationFieldType661() { 
     LocalDateTime test = new LocalDateTime(); 
     assertEquals(false, test.isSupported(DurationFieldType.eras())); 
     assertEquals(true, test.isSupported(DurationFieldType.centuries())); 
     assertEquals(true, test.isSupported(DurationFieldType.years())); 
     assertEquals(true, test.isSupported(DurationFieldType.months())); 
     assertEquals(true, test.isSupported(DurationFieldType.weekyears())); 
     assertEquals(true, test.isSupported(DurationFieldType.weeks())); 
     assertEquals(true, test.isSupported(DurationFieldType.days())); 
     assertEquals(true, test.isSupported(DurationFieldType.hours())); 
     assertEquals(true, test.isSupported(DurationFieldType.minutes())); 
     assertEquals(true, test.isSupported(DurationFieldType.seconds())); 
     assertEquals(true, test.isSupported(DurationFieldType.millis())); 
     assertEquals(true, test.isSupported(DurationFieldType.halfdays())); 
     assertEquals(false, test.isSupported((DurationFieldType) null)); 
 } 


public void testPlusMonths_int679() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.plusMonths(1); 
     LocalDateTime expected = new LocalDateTime(2002, 6, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusMonths(0); 
     assertSame(test, result); 
 } 


public void testMinusYears_int732() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.minusYears(1); 
     LocalDateTime expected = new LocalDateTime(2001, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusYears(0); 
     assertSame(test, result); 
 } 


public void testPlusMillis_int739() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.plusMillis(1); 
     LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 41, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusMillis(0); 
     assertSame(test, result); 
 } 


public void testMinusMillis_int847() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.minusMillis(1); 
     LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 30, 39, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusMillis(0); 
     assertSame(test, result); 
 } 


public void testWithDate866() { 
     LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     LocalDateTime result = test.withDate(2006, 2, 1); 
     check(test, 2004, 6, 9, 10, 20, 30, 40); 
     check(result, 2006, 2, 1, 10, 20, 30, 40); 
 } 


public void testWithField_DateTimeFieldType_int_2932() { 
     LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     try { 
         test.withField(null, 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testPlusYears_int991() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.plusYears(1); 
     LocalDateTime expected = new LocalDateTime(2003, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusYears(0); 
     assertSame(test, result); 
 } 


public void testWithTime1041() { 
     LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     LocalDateTime result = test.withTime(9, 8, 7, 6); 
     check(test, 2004, 6, 9, 10, 20, 30, 40); 
     check(result, 2004, 6, 9, 9, 8, 7, 6); 
 } 


public void testPlusHours_int1046() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.plusHours(1); 
     LocalDateTime expected = new LocalDateTime(2002, 5, 3, 11, 20, 30, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusHours(0); 
     assertSame(test, result); 
 } 


public void testWithField_DateTimeFieldType_int_31078() { 
     LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     LocalDateTime result = test.withField(DateTimeFieldType.year(), 2004); 
     assertEquals(new LocalDateTime(2004, 6, 9, 10, 20, 30, 40), test); 
     assertSame(test, result); 
 } 


public void testGetFieldTypes1113() { 
     LocalDateTime test = new LocalDateTime(COPTIC_PARIS); 
     DateTimeFieldType[] fields = test.getFieldTypes(); 
     assertSame(DateTimeFieldType.year(), fields[0]); 
     assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     assertSame(DateTimeFieldType.dayOfMonth(), fields[2]); 
     assertSame(DateTimeFieldType.millisOfDay(), fields[3]); 
     assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 } 


public void testPlus_RP1131() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8)); 
     LocalDateTime expected = new LocalDateTime(2003, 7, 29, 15, 26, 37, 48, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


public void testGetField_int1167() { 
     LocalDateTime test = new LocalDateTime(COPTIC_PARIS); 
     assertSame(COPTIC_UTC.year(), test.getField(0)); 
     assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     assertSame(COPTIC_UTC.dayOfMonth(), test.getField(2)); 
     assertSame(COPTIC_UTC.millisOfDay(), test.getField(3)); 
     try { 
         test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     try { 
         test.getField(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 } 


public void testIsSupported_DateTimeFieldType1186() { 
     LocalDateTime test = new LocalDateTime(); 
     assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
 } 


public void testPlusSeconds_int1283() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.plusSeconds(1); 
     LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 20, 31, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusSeconds(0); 
     assertSame(test, result); 
 } 


public void testToString_DTFormatter1342() { 
     LocalDateTime test = new LocalDateTime(2002, 6, 9, 10, 20, 30, 40); 
     assertEquals("2002 10", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     assertEquals("2002-06-09T10:20:30.040", test.toString((DateTimeFormatter) null)); 
 } 


public void testPlusMinutes_int1429() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.plusMinutes(1); 
     LocalDateTime expected = new LocalDateTime(2002, 5, 3, 10, 21, 30, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusMinutes(0); 
     assertSame(test, result); 
 } 


public void testGetValue_int1443() { 
     LocalDateTime test = new LocalDateTime(ISO_UTC); 
     assertEquals(1970, test.getValue(0)); 
     assertEquals(6, test.getValue(1)); 
     assertEquals(9, test.getValue(2)); 
     assertEquals(MILLIS_OF_DAY_UTC, test.getValue(3)); 
     try { 
         test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     try { 
         test.getValue(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 } 


public void testMinusHours_int1525() { 
     LocalDateTime test = new LocalDateTime(2002, 5, 3, 10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalDateTime result = test.minusHours(1); 
     LocalDateTime expected = new LocalDateTime(2002, 5, 3, 9, 20, 30, 40, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusHours(0); 
     assertSame(test, result); 
 } 


public void testToDateTime1528() { 
     LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); 
     DateTime test = base.toDateTime(); 
     check(base, 2005, 6, 9, 6, 7, 8, 9); 
     DateTime expected = new DateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_LONDON); 
     assertEquals(expected, test); 
 } 


public void testWithFieldAdded_DurationFieldType_int_21590() { 
     LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     try { 
         test.withFieldAdded(null, 0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testToLocalDate1646() { 
     LocalDateTime base = new LocalDateTime(2005, 6, 9, 6, 7, 8, 9, COPTIC_PARIS); 
     LocalDate expected = new LocalDate(2005, 6, 9, COPTIC_LONDON); 
     assertEquals(expected, base.toLocalDate()); 
 } 


public void testToDate_summer_Zone1653() { 
     LocalDateTime base = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40, COPTIC_PARIS); 
     Date test = base.toDate(TimeZone.getDefault()); 
     check(base, 2005, 7, 9, 10, 20, 30, 40); 
     GregorianCalendar gcal = new GregorianCalendar(); 
     gcal.clear(); 
     gcal.set(Calendar.YEAR, 2005); 
     gcal.set(Calendar.MONTH, Calendar.JULY); 
     gcal.set(Calendar.DAY_OF_MONTH, 9); 
     gcal.set(Calendar.HOUR_OF_DAY, 10); 
     gcal.set(Calendar.MINUTE, 20); 
     gcal.set(Calendar.SECOND, 30); 
     gcal.set(Calendar.MILLISECOND, 40); 
     assertEquals(gcal.getTime(), test); 
 } 


public void testWithFieldAdded_DurationFieldType_int_41726() { 
     LocalDateTime test = new LocalDateTime(2004, 6, 9, 10, 20, 30, 40); 
     LocalDateTime result = test.withFieldAdded(DurationFieldType.years(), 0); 
     assertSame(test, result); 
 } 

    

    

    

    

    

    

    

    

    

    

    
    
    class MockInstant extends MockPartial {
        public Chronology getChronology() {
            return COPTIC_UTC;
        }
        public DateTimeField[] getFields() {
            return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
                COPTIC_UTC.millisOfDay(),
            };
        }
        public int[] getValues() {
            return new int[] {1970, 6, 9, MILLIS_OF_DAY_UTC};
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
