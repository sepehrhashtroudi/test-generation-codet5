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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;

/**
 * This class is a Junit unit test for EthiopicChronology.
 *
 * @author Stephen Colebourne
 */
public class TestEthiopicChronology extends TestCase {

    private static final int MILLIS_PER_DAY = DateTimeConstants.MILLIS_PER_DAY;

    private static long SKIP = 1 * MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology ETHIOPIC_UTC = EthiopicChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        SKIP = 1 * MILLIS_PER_DAY;
        return new TestSuite(TestEthiopicChronology.class);
    }

    public TestEthiopicChronology(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(Locale.UK);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalTimeZone = null;
        originalLocale = null;
    }

    //-----------------------------------------------------------------------

public void testDurationFields228() { 
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
     assertEquals(false, ethiopic.years().isPrecise()); 
     assertEquals(false, ethiopic.weekyears().isPrecise()); 
     assertEquals(false, ethiopic.months().isPrecise()); 
     assertEquals(false, ethiopic.weeks().isPrecise()); 
     assertEquals(false, ethiopic.days().isPrecise()); 
     assertEquals(false, ethiopic.halfdays().isPrecise()); 
     assertEquals(true, ethiopic.hours().isPrecise()); 
     assertEquals(true, ethiopic.minutes().isPrecise()); 
     assertEquals(true, ethiopic.seconds().isPrecise()); 
     assertEquals(true, ethiopic.millis().isPrecise()); 
     final EthiopicChronology ethiopicUTC = EthiopicChronology.getInstanceUTC(); 
     assertEquals(false, ethiopicUTC.centuries().isPrecise()); 
     assertEquals(false, ethiopicUTC.years().isPrecise()); 
     assertEquals(false, ethiopicUTC.weekyears().isPrecise()); 
     assertEquals(false, ethiopicUTC.months().isPrecise()); 
     assertEquals(true, ethiopicUTC.weeks().isPrecise()); 
     assertEquals(true, ethiopicUTC.days().isPrecise()); 
     assertEquals(true, ethiopicUTC.halfdays().isPrecise()); 
     assertEquals(true, ethiopicUTC.hours().isPrecise()); 
     assertEquals(true, ethiopicUTC.minutes().isPrecise()); 
     assertEquals(true, ethiopicUTC.seconds().isPrecise()); 
     assertEquals(true, ethiopicUTC.millis().isPrecise()); 
     final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     final EthiopicChronology ethiopicGMT = EthiopicChronology.getInstance(gmt); 
     assertEquals(false, ethiopicGMT.centuries().isPrecise()); 
     assertEquals(false, ethiopicGMT.years().isPrecise()); 
     assertEquals(false, ethiopicGMT.weekyears().isPrecise()); 
     assertEquals(false, ethiopicGMT.months().isPrecise()); 
     assertEquals(true, ethiopicGMT.weeks().isPrecise()); 
     assertEquals(true, ethiopicGMT.days().isPrecise()); 
     assertEquals(true, ethiopicGMT.halfdays().isPrecise()); 
     assertEquals(true, ethiopicGMT.hours().isPrecise()); 
     assertEquals(true, ethiopicGMT.minutes().isPrecise()); 
     assertEquals(true, ethiopicGMT.seconds().isPrecise()); 
     assertEquals(true, ethiopicGMT.millis().isPrecise()); 
 } 


public void testWithUTC569() { 
     assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(LONDON).withUTC()); 
     assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance(TOKYO).withUTC()); 
     assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstanceUTC().withUTC()); 
     assertSame(EthiopicChronology.getInstanceUTC(), EthiopicChronology.getInstance().withUTC()); 
 } 


public void testWithZone790() { 
     assertSame(EthiopicChronology.getInstance(TOKYO), EthiopicChronology.getInstance(TOKYO).withZone(TOKYO)); 
     assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(LONDON)); 
     assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance(TOKYO).withZone(PARIS)); 
     assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(null)); 
     assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance().withZone(PARIS)); 
     assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstanceUTC().withZone(PARIS)); 
 } 


public void testCalendar800() { 
     if (TestAll.FAST) { 
         return; 
     } 
     System.out.println("\nTestEthiopicChronology.testCalendar"); 
     DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ETHIOPIC_UTC); 
     long millis = epoch.getMillis(); 
     long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis(); 
     DateTimeField dayOfWeek = ETHIOPIC_UTC.dayOfWeek(); 
     DateTimeField dayOfYear = ETHIOPIC_UTC.dayOfYear(); 
     DateTimeField dayOfMonth = ETHIOPIC_UTC.dayOfMonth(); 
     DateTimeField monthOfYear = ETHIOPIC_UTC.monthOfYear(); 
     DateTimeField year = ETHIOPIC_UTC.year(); 
     DateTimeField yearOfEra = ETHIOPIC_UTC.yearOfEra(); 
     DateTimeField era = ETHIOPIC_UTC.era(); 
     int expectedDOW = new DateTime(8, 8, 29, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek(); 
     int expectedDOY = 1; 
     int expectedDay = 1; 
     int expectedMonth = 1; 
     int expectedYear = 1; 
     while (millis < end) { 
         int dowValue = dayOfWeek.get(millis); 
         int doyValue = dayOfYear.get(millis); 
         int dayValue = dayOfMonth.get(millis); 
         int monthValue = monthOfYear.get(millis); 
         int yearValue = year.get(millis); 
         int yearOfEraValue = yearOfEra.get(millis); 
         int monthLen = dayOfMonth.getMaximumValue(millis); 
         if (monthValue < 1 || monthValue > 13) { 
             fail("Bad month: " + millis); 
         } 
         assertEquals(1, era.get(millis)); 
         assertEquals("EE", era.getAsText(millis)); 
         assertEquals("EE", era.getAsShortText(millis)); 
         assertEquals(expectedYear, yearValue); 
         assertEquals(expectedYear, yearOfEraValue); 
         assertEquals(expectedMonth, monthValue); 
         assertEquals(expectedDay, dayValue); 
         assertEquals(expectedDOW, dowValue); 
         assertEquals(expectedDOY, doyValue); 
         assertEquals(yearValue % 4 == 3, year.isLeap(millis)); 
         if (monthValue == 13) { 
             assertEquals(yearValue % 4 == 3, monthOfYear.isLeap(millis)); 
             if (yearValue % 4 == 3) { 
                 assertEquals(6, monthLen); 
             } else { 
                 assertEquals(5, monthLen); 
             } 
         } else { 
             assertEquals(30, monthLen); 
         } 
         expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1; 
         expectedDay++; 
         expectedDOY++; 
         if (expectedDay == 31 && expectedMonth < 13) { 
             expectedDay = 1; 
             expectedMonth++; 
         } else if (expectedMonth == 13) { 
             if (expectedYear % 4 == 3 && expectedDay == 7) { 
                 expectedDay = 1; 
                 expectedMonth = 1; 
                 expectedYear++; 
                 expectedDOY = 1; 
             } else if (expectedYear % 4 != 3 && expectedDay == 6) { 
                 expectedDay = 1; 
                 expectedMonth = 1; 
                 expectedYear++; 
                 expectedDOY = 1; 
             } 
         } 
         millis += SKIP; 
     } 
 } 


public void testSampleDateWithZone938() { 
     DateTime dt = new DateTime(2004, 6, 9, 12, 0, 0, 0, PARIS).withChronology(ETHIOPIC_UTC); 
     assertEquals(EthiopicChronology.EE, dt.getEra()); 
     assertEquals(1996, dt.getYear()); 
     assertEquals(1996, dt.getYearOfEra()); 
     assertEquals(10, dt.getMonthOfYear()); 
     assertEquals(2, dt.getDayOfMonth()); 
     assertEquals(10, dt.getHourOfDay()); 
     assertEquals(0, dt.getMinuteOfHour()); 
     assertEquals(0, dt.getSecondOfMinute()); 
     assertEquals(0, dt.getMillisOfSecond()); 
 } 


public void testDurationMonth1427() { 
     DateTime dt11 = new DateTime(1999, 11, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     DateTime dt12 = new DateTime(1999, 12, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     DateTime dt13 = new DateTime(1999, 13, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     DateTime dt01 = new DateTime(2000, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     DurationField fld = dt11.monthOfYear().getDurationField(); 
     assertEquals(ETHIOPIC_UTC.months(), fld); 
     assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis())); 
     assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis())); 
     assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis())); 
     assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis())); 
     assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1)); 
     assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2)); 
     assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13)); 
     assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis())); 
     assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis())); 
     assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3L, dt11.getMillis())); 
     assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4L, dt11.getMillis())); 
     assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L)); 
     assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L)); 
     assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13L)); 
     assertEquals(0, fld.getValue(1L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     assertEquals(1, fld.getValue(1L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     assertEquals(1, fld.getValue(2L * 30L * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY, dt11.getMillis())); 
     assertEquals(2, fld.getValue(2L * 30L * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     assertEquals(2, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     assertEquals(3, fld.getValue((2L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     assertEquals(3, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY - 1L, dt11.getMillis())); 
     assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY, dt11.getMillis())); 
     assertEquals(4, fld.getValue((3L * 30L + 6L) * MILLIS_PER_DAY + 1L, dt11.getMillis())); 
     assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1)); 
     assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2)); 
     assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3)); 
     assertEquals(dt12.getMillis(), fld.add(dt11.getMillis(), 1L)); 
     assertEquals(dt13.getMillis(), fld.add(dt11.getMillis(), 2L)); 
     assertEquals(dt01.getMillis(), fld.add(dt11.getMillis(), 3L)); 
 } 


public void testFactory_Zone1447() { 
     assertEquals(TOKYO, EthiopicChronology.getInstance(TOKYO).getZone()); 
     assertEquals(PARIS, EthiopicChronology.getInstance(PARIS).getZone()); 
     assertEquals(LONDON, EthiopicChronology.getInstance(null).getZone()); 
     assertSame(EthiopicChronology.class, EthiopicChronology.getInstance(TOKYO).getClass()); 
 } 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

}
