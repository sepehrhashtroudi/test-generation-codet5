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

public void testToDate_autumnDST28() { 
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


public void testIsSupported_DateTimeFieldType36() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
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
     assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
     DateTimeFieldType d = new DateTimeFieldType("hours") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() { 
             return DurationFieldType.hours(); 
         } 
  
         public DurationFieldType getRangeDurationType() { 
             return null; 
         } 
  
         public DateTimeField getField(Chronology chronology) { 
             return chronology.hourOfDay(); 
         } 
     }; 
     assertEquals(false, test.isSupported(d)); 
     d = new DateTimeFieldType("hourOfYear") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDuration


public void testPropertyAddToCopyMonth215() { 
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


public void testIsEqual_LocalDateTime216() { 
     LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     assertEquals(true, test1.isEqual(test1a)); 
     assertEquals(true, test1a.isEqual(test1)); 
     assertEquals(true, test1.isEqual(test1)); 
     assertEquals(true, test1a.isEqual(test1a)); 
     LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40); 
     assertEquals(false, test1.isEqual(test2)); 
     assertEquals(false, test2.isEqual(test1)); 
     LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC); 
     assertEquals(false, test1.isEqual(test3)); 
     assertEquals(false, test3.isEqual(test1)); 
     assertEquals(true, test3.isEqual(test2)); 
     try { 
         new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isEqual(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void testIsEqual_LocalDateTime217() { 
     LocalDateTime test1 = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     LocalDateTime test1a = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     assertEquals(true, test1.isEqual(test1a)); 
     assertEquals(true, test1a.isEqual(test1)); 
     assertEquals(true, test1.isEqual(test1)); 
     assertEquals(true, test1a.isEqual(test1a)); 
     LocalDateTime test2 = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40); 
     assertEquals(false, test1.isEqual(test2)); 
     assertEquals(false, test2.isEqual(test1)); 
     LocalDateTime test3 = new LocalDateTime(2005, 7, 9, 10, 20, 30, 40, GREGORIAN_UTC); 
     assertEquals(false, test1.isEqual(test3)); 
     assertEquals(false, test3.isEqual(test1)); 
     assertEquals(true, test3.isEqual(test2)); 
     try { 
         new LocalDateTime(2005, 7, 9, 10, 20, 30, 40).isEqual(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void test_millisOfDay225() throws Exception { 
     assertEquals(DateTimeFieldType.millisOfDay(), DateTimeFieldType.millisOfDay()); 
     assertEquals("millisOfDay", DateTimeFieldType.millisOfDay().getName()); 
     assertEquals(DurationFieldType.millis(), DateTimeFieldType.millisOfDay().getDurationType()); 
     assertEquals(DurationFieldType.seconds(), DateTimeFieldType.millisOfDay().getRangeDurationType()); 
     assertEquals(CopticChronology.getInstanceUTC().millisOfDay(), DateTimeFieldType.millisOfDay().getField(CopticChronology.getInstanceUTC())); 
     assertEquals(CopticChronology.getInstanceUTC().millisOfDay().isSupported(), DateTimeFieldType.millisOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     assertSerialization(DateTimeFieldType.millisOfDay()); 
 }


public void testIsSupported_DateTimeFieldType226() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
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
     assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
     DateTimeFieldType d = new DateTimeFieldType("hours") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() { 
             return DurationFieldType.hours(); 
         } 
  
         public DurationFieldType getRangeDurationType() { 
             return null; 
         } 
  
         public DateTimeField getField(Chronology chronology) { 
             return chronology.hourOfDay(); 
         } 
     }; 
     assertEquals(false, test.isSupported(d)); 
     d = new DateTimeFieldType("hourOfYear") { 
  



public void test_dayOfMonth227() throws Exception { 
     assertEquals(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth()); 
     assertEquals("dayOfMonth", DateTimeFieldType.dayOfMonth().getName()); 
     assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfMonth().getDurationType()); 
     assertEquals(DurationFieldType.months(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     assertEquals(DurationFieldType.weeks(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     assertEquals(DurationFieldType.weeks(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     assertEquals(DurationFieldType.hours(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     assertEquals(DurationFieldType.minutes(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     assertEquals(DurationFieldType.seconds(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     assertEquals(DurationFieldType.millis(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     assertEquals(CopticChronology.getInstanceUTC().dayOfMonth(), DateTimeFieldType.dayOfMonth().getField(CopticChronology.getInstanceUTC())); 
     assertEquals(CopticChronology.getInstanceUTC().dayOfMonth().isSupported(), DateTimeFieldType.dayOfMonth().isSupported(CopticChronology.getInstanceUTC())); 
     assertSerialization(DateTimeFieldType.dayOfMonth()); 
 }


public void testIsSupported_DateTimeFieldType228() { 
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
     try { 
         test.isSupported(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void test_dayOfMonth229() throws Exception { 
     assertEquals(DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfMonth()); 
     assertEquals("dayOfMonth", DateTimeFieldType.dayOfMonth().getName()); 
     assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfMonth().getDurationType()); 
     assertEquals(DurationFieldType.months(), DateTimeFieldType.dayOfMonth().getRangeDurationType()); 
     assertEquals(CopticChronology.getInstanceUTC().dayOfMonth(), DateTimeFieldType.dayOfMonth().getField(CopticChronology.getInstanceUTC())); 
     assertEquals(CopticChronology.getInstanceUTC().dayOfMonth().isSupported(), DateTimeFieldType.dayOfMonth().isSupported(CopticChronology.getInstanceUTC())); 
     assertSerialization(DateTimeFieldType.dayOfMonth()); 
 }


public void test_year230() throws Exception { 
     assertEquals(DateTimeFieldType.year(), DateTimeFieldType.year()); 
     assertEquals("year", DateTimeFieldType.year().getName()); 
     assertEquals(DurationFieldType.years(), DateTimeFieldType.year().getDurationType()); 
     assertEquals(null, DateTimeFieldType.year().getRangeDurationType()); 
     assertEquals(CopticChronology.getInstanceUTC().year(), DateTimeFieldType.year().getField(CopticChronology.getInstanceUTC())); 
     assertEquals(CopticChronology.getInstanceUTC().year().isSupported(), DateTimeFieldType.year().isSupported(CopticChronology.getInstanceUTC())); 
     assertSerialization(DateTimeFieldType.year()); 
 }


public void test_dayOfYear231() throws Exception { 
     assertEquals(DateTimeFieldType.dayOfYear(), DateTimeFieldType.dayOfYear()); 
     assertEquals("dayOfYear", DateTimeFieldType.dayOfYear().getName()); 
     assertEquals(DurationFieldType.days(), DateTimeFieldType.dayOfYear().getDurationType()); 
     assertEquals(DurationFieldType.years(), DateTimeFieldType.dayOfYear().getRangeDurationType()); 
     assertEquals(CopticChronology.getInstanceUTC().dayOfYear(), DateTimeFieldType.dayOfYear().getField(CopticChronology.getInstanceUTC())); 
     assertEquals(CopticChronology.getInstanceUTC().dayOfYear().isSupported(), DateTimeFieldType.dayOfYear().isSupported(CopticChronology.getInstanceUTC())); 
     assertSerialization(DateTimeFieldType.dayOfYear()); 
 }


public void test_year232() throws Exception { 
     assertEquals(DateTimeFieldType.year(), DateTimeFieldType.year()); 
     assertEquals("year", DateTimeFieldType.year().getName()); 
     assertEquals(DurationFieldType.years(), DateTimeFieldType.year().getDurationType()); 
     assertEquals(DurationFieldType.months(), DateTimeFieldType.year().getRangeDurationType()); 
     assertEquals(DurationFieldType.weeks(), DateTimeFieldType.year().getRangeDurationType()); 
     assertEquals(DurationFieldType.weeks(), DateTimeFieldType.year().getRangeDurationType()); 
     assertEquals(DurationFieldType.days(), DateTimeFieldType.year().getMaximumTextLength(null)); 
     assertEquals(DurationFieldType.days(), DateTimeFieldType.year().getMaximumShortTextLength(null)); 
 }


public void test_hourOfDay233() throws Exception { 
     assertEquals(DateTimeFieldType.hourOfDay(), DateTimeFieldType.hourOfDay()); 
     assertEquals("hourOfDay", DateTimeFieldType.hourOfDay().getName()); 
     assertEquals(DurationFieldType.hours(), DateTimeFieldType.hourOfDay().getDurationType()); 
     assertEquals(DurationFieldType.days(), DateTimeFieldType.hourOfDay().getRangeDurationType()); 
     assertEquals(CopticChronology.getInstanceUTC().hourOfDay(), DateTimeFieldType.hourOfDay().getField(CopticChronology.getInstanceUTC())); 
     assertEquals(CopticChronology.getInstanceUTC().hourOfDay().isSupported(), DateTimeFieldType.hourOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     assertSerialization(DateTimeFieldType.hourOfDay()); 
 }


public void testIsSupported_DateTimeFieldType234() { 
     LocalDateTime test = new LocalDateTime(); 
     assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfEra())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     try { 
         test.isSupported(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void test_monthOfYear235() throws Exception { 
     assertEquals(DateTimeFieldType.monthOfYear(), DateTimeFieldType.monthOfYear()); 
     assertEquals("monthOfYear", DateTimeFieldType.monthOfYear().getName()); 
     assertEquals(DurationFieldType.months(), DateTimeFieldType.monthOfYear().getDurationType()); 
     assertEquals(DurationFieldType.years(), DateTimeFieldType.monthOfYear().getRangeDurationType()); 
     assertEquals(CopticChronology.getInstanceUTC().monthOfYear(), DateTimeFieldType.monthOfYear().getField(CopticChronology.getInstanceUTC())); 
     assertEquals(CopticChronology.getInstanceUTC().monthOfYear().isSupported(), DateTimeFieldType.monthOfYear().isSupported(CopticChronology.getInstanceUTC())); 
     assertSerialization(DateTimeFieldType.monthOfYear()); 
 }


public void test_minuteOfDay236() throws Exception { 
     assertEquals(DateTimeFieldType.minuteOfDay(), DateTimeFieldType.minuteOfDay()); 
     assertEquals("minuteOfDay", DateTimeFieldType.minuteOfDay().getName()); 
     assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfDay().getDurationType()); 
     assertEquals(DurationFieldType.days(), DateTimeFieldType.minuteOfDay().getRangeDurationType()); 
     assertEquals(CopticChronology.getInstanceUTC().minuteOfDay(), DateTimeFieldType.minuteOfDay().getField(CopticChronology.getInstanceUTC())); 
     assertEquals(CopticChronology.getInstanceUTC().minuteOfDay().isSupported(), DateTimeFieldType.minuteOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     assertSerialization(DateTimeFieldType.minuteOfDay()); 
 }


public void test_minuteOfHour237() throws Exception { 
     assertEquals(DateTimeFieldType.minuteOfHour(), DateTimeFieldType.minuteOfHour()); 
     assertEquals("minuteOfHour", DateTimeFieldType.minuteOfHour().getName()); 
     assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfHour().getDurationType()); 
     assertEquals(DurationFieldType.hours(), DateTimeFieldType.minuteOfHour().getRangeDurationType()); 
     assertEquals(CopticChronology.getInstanceUTC().minuteOfHour(), DateTimeFieldType.minuteOfHour().getField(CopticChronology.getInstanceUTC())); 
     assertEquals(CopticChronology.getInstanceUTC().minuteOfHour().isSupported(), DateTimeFieldType.minuteOfHour().isSupported(CopticChronology.getInstanceUTC())); 
     assertSerialization(DateTimeFieldType.minuteOfHour()); 
 }


public void test_monthOfYear238() throws Exception { 
     assertEquals(DateTimeFieldType.monthOfYear(), DateTimeFieldType.monthOfYear()); 
     assertEquals("monthOfYear", DateTimeFieldType.monthOfYear().getName()); 
     assertEquals(DurationFieldType.months(), DateTimeFieldType.monthOfYear().getDurationType()); 
     assertEquals(DurationFieldType.weeks(), DateTimeFieldType.monthOfYear().getRangeDurationType()); 
     assertEquals(CopticChronology.getInstanceUTC().monthOfYear(), DateTimeFieldType.monthOfYear().getField(CopticChronology.getInstanceUTC())); 
     assertEquals(CopticChronology.getInstanceUTC().monthOfYear().isSupported(), DateTimeFieldType.monthOfYear().isSupported(CopticChronology.getInstanceUTC())); 
     assertSerialization(DateTimeFieldType.monthOfYear()); 
 }


public void testGet_DateTimeFieldType239() { 
     LocalDateTime test = new LocalDateTime(); 
     assertEquals(1970, test.get(DateTimeFieldType.year())); 
     assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     assertEquals(2, test.get(DateTimeFieldType.dayOfWeek())); 
     assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear())); 
     assertEquals(1970, test.get(DateTimeFieldType.weekyear())); 
     try { 
         test.get(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.get(DateTimeFieldType.hourOfDay()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void testSerializedDateTimeFieldType240() throws Exception { 
     DateTimeFieldType test = DateTimeFieldType.clockhourOfDay(); 
     loadAndCompare(test, "DateTimeFieldType", true); 
     inlineCompare(test, true); 
 }


public void test_minuteOfDay241() throws Exception { 
     assertEquals(DateTimeFieldType.minuteOfDay(), DateTimeFieldType.minuteOfDay()); 
     assertEquals("minuteOfDay", DateTimeFieldType.minuteOfDay().getName()); 
     assertEquals(DurationFieldType.minutes(), DateTimeFieldType.minuteOfDay().getDurationType()); 
     assertEquals(DurationFieldType.seconds(), DateTimeFieldType.minuteOfDay().getRangeDurationType()); 
     assertEquals(CopticChronology.getInstanceUTC().minuteOfDay(), DateTimeFieldType.minuteOfDay().getField(CopticChronology.getInstanceUTC())); 
     assertEquals(CopticChronology.getInstanceUTC().minuteOfDay().isSupported(), DateTimeFieldType.minuteOfDay().isSupported(CopticChronology.getInstanceUTC())); 
     assertSerialization(DateTimeFieldType.minuteOfDay()); 
 }


public void testIsSupported_DateTimeFieldType242() { 
     LocalDateTime test = new LocalDateTime(); 
     assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
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
     try { 
         test.isSupported(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void testIsSupported_DateTimeFieldType243() { 
     LocalDateTime test = new LocalDateTime(); 
     assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
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
     try { 
         test.isSupported(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.isSupported((DateTimeFieldType) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
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
