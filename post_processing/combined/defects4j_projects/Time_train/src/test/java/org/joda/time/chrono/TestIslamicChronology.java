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
import org.joda.time.DurationFieldType;
import org.joda.time.DateTime.Property;

/**
 * This class is a Junit unit test for IslamicChronology.
 *
 * @author Stephen Colebourne
 */
public class TestIslamicChronology extends TestCase {

    private static long SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology ISLAMIC_UTC = IslamicChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        return new TestSuite(TestIslamicChronology.class);
    }

    public TestIslamicChronology(String name) {
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

public void testSampleDate2156() { 
     DateTime dt = new DateTime(2005, 11, 26, 0, 0, 0, 0, ISO_UTC); 
     dt = dt.withChronology(ISLAMIC_UTC); 
     assertEquals(IslamicChronology.AH, dt.getEra()); 
     assertEquals(15, dt.getCenturyOfEra()); 
     assertEquals(26, dt.getYearOfCentury()); 
     assertEquals(1426, dt.getYearOfEra()); 
     assertEquals(1426, dt.getYear()); 
     Property fld = dt.year(); 
     assertEquals(true, fld.isLeap()); 
     assertEquals(1, fld.getLeapAmount()); 
     assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     assertEquals(10, dt.getMonthOfYear()); 
     fld = dt.monthOfYear(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(12, fld.getMaximumValue()); 
     assertEquals(12, fld.getMaximumValueOverall()); 
     assertEquals(24, dt.getDayOfMonth()); 
     fld = dt.dayOfMonth(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(null, fld.getLeapDurationField()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(29, fld.getMaximumValue()); 
     assertEquals(30, fld.getMaximumValueOverall()); 
     assertEquals(DateTimeConstants.SATURDAY, dt.getDayOfWeek()); 
     fld = dt.dayOfWeek(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(null, fld.getLeapDurationField()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(7, fld.getMaximumValue()); 
     assertEquals(7, fld.getMaximumValueOverall()); 
     assertEquals(5 * 30 + 4 * 29 + 24, dt.getDayOfYear()); 
     fld = dt.dayOfYear(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(null, fld.getLeapDurationField()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(355, fld.getMaximumValue()); 
     assertEquals(355, fld.getMaximumValueOverall()); 
     assertEquals(0, dt.getHourOfDay()); 
     assertEquals(0, dt.getMinuteOfHour()); 
     assertEquals(0, dt.getSecondOfMinute()); 
     assertEquals(0, dt.getMillisOfSecond()); 
 } 


public void testSampleDateWithZone351() { 
     DateTime dt = new DateTime(2005, 11, 26, 12, 0, 0, 0, PARIS).withChronology(ISLAMIC_UTC); 
     assertEquals(IslamicChronology.AH, dt.getEra()); 
     assertEquals(1426, dt.getYear()); 
     assertEquals(10, dt.getMonthOfYear()); 
     assertEquals(24, dt.getDayOfMonth()); 
     assertEquals(11, dt.getHourOfDay()); 
     assertEquals(0, dt.getMinuteOfHour()); 
     assertEquals(0, dt.getSecondOfMinute()); 
     assertEquals(0, dt.getMillisOfSecond()); 
 } 


public void testCalendar364() { 
     if (TestAll.FAST) { 
         return; 
     } 
     System.out.println("\nTestIslamicChronology.testCalendar"); 
     DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC); 
     long millis = epoch.getMillis(); 
     long end = new DateTime(3000, 1, 1, 0, 0, 0, 0, ISO_UTC).getMillis(); 
     DateTimeField dayOfWeek = ISLAMIC_UTC.dayOfWeek(); 
     DateTimeField dayOfYear = ISLAMIC_UTC.dayOfYear(); 
     DateTimeField dayOfMonth = ISLAMIC_UTC.dayOfMonth(); 
     DateTimeField monthOfYear = ISLAMIC_UTC.monthOfYear(); 
     DateTimeField year = ISLAMIC_UTC.year(); 
     DateTimeField yearOfEra = ISLAMIC_UTC.yearOfEra(); 
     DateTimeField era = ISLAMIC_UTC.era(); 
     int expectedDOW = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC).getDayOfWeek(); 
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
         int dayOfYearLen = dayOfYear.getMaximumValue(millis); 
         int monthLen = dayOfMonth.getMaximumValue(millis); 
         if (monthValue < 1 || monthValue > 12) { 
             fail("Bad month: " + millis); 
         } 
         assertEquals(1, era.get(millis)); 
         assertEquals("AH", era.getAsText(millis)); 
         assertEquals("AH", era.getAsShortText(millis)); 
         assertEquals(expectedDOY, doyValue); 
         assertEquals(expectedMonth, monthValue); 
         assertEquals(expectedDay, dayValue); 
         assertEquals(expectedDOW, dowValue); 
         assertEquals(expectedYear, yearValue); 
         assertEquals(expectedYear, yearOfEraValue); 
         boolean leap = ((11 * yearValue + 14) % 30) < 11; 
         assertEquals(leap, year.isLeap(millis)); 
         switch(monthValue) { 
             case 1: 
             case 3: 
             case 5: 
             case 7: 
             case 9: 
             case 11: 
                 assertEquals(30, monthLen); 
                 break; 
             case 2: 
             case 4: 
             case 6: 
             case 8: 
             case 10: 
                 assertEquals(29, monthLen); 
                 break; 
             case 12: 
                 assertEquals((leap ? 30 : 29), monthLen); 
                 break; 
         } 
         assertEquals((leap ? 355 : 354), dayOfYearLen); 
         expectedDOW = (((expectedDOW + 1) - 1) % 7) + 1; 
         expectedDay++; 
         expectedDOY++; 
         if (expectedDay > monthLen) { 
             expectedDay = 1; 
             expectedMonth++; 
             if (expectedMonth == 13) { 
                 expectedMonth = 1; 
                 expectedDOY = 1; 
                 expectedYear++; 
             } 
         } 
         millis += SKIP; 
     } 
 } 


public void testSampleDate1429() { 
     DateTime dt = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC); 
     dt = dt.withChronology(ISLAMIC_UTC); 
     assertEquals(IslamicChronology.AH, dt.getEra()); 
     assertEquals(14, dt.getCenturyOfEra()); 
     assertEquals(64, dt.getYearOfCentury()); 
     assertEquals(1364, dt.getYearOfEra()); 
     assertEquals(1364, dt.getYear()); 
     Property fld = dt.year(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     assertEquals(new DateTime(1365, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     assertEquals(12, dt.getMonthOfYear()); 
     fld = dt.monthOfYear(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(12, fld.getMaximumValue()); 
     assertEquals(12, fld.getMaximumValueOverall()); 
     assertEquals(new DateTime(1365, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     assertEquals(new DateTime(1364, 1, 6, 0, 0, 0, 0, ISLAMIC_UTC), fld.addWrapFieldToCopy(1)); 
     assertEquals(6, dt.getDayOfMonth()); 
     fld = dt.dayOfMonth(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(null, fld.getLeapDurationField()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(29, fld.getMaximumValue()); 
     assertEquals(30, fld.getMaximumValueOverall()); 
     assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     assertEquals(DateTimeConstants.MONDAY, dt.getDayOfWeek()); 
     fld = dt.dayOfWeek(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(null, fld.getLeapDurationField()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(7, fld.getMaximumValue()); 
     assertEquals(7, fld.getMaximumValueOverall()); 
     assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     assertEquals(6 * 30 + 5 * 29 + 6, dt.getDayOfYear()); 
     fld = dt.dayOfYear(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(null, fld.getLeapDurationField()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(354, fld.getMaximumValue()); 
     assertEquals(355, fld.getMaximumValueOverall()); 
     assertEquals(new DateTime(1364, 12, 7, 0, 0, 0, 0, ISLAMIC_UTC), fld.addToCopy(1)); 
     assertEquals(0, dt.getHourOfDay()); 
     assertEquals(0, dt.getMinuteOfHour()); 
     assertEquals(0, dt.getSecondOfMinute()); 
     assertEquals(0, dt.getMillisOfSecond()); 
 } 


public void testFactory509() { 
     assertEquals(LONDON, IslamicChronology.getInstance().getZone()); 
     assertSame(IslamicChronology.class, IslamicChronology.getInstance().getClass()); 
 } 


public void testEpoch511() { 
     DateTime epoch = new DateTime(1, 1, 1, 0, 0, 0, 0, ISLAMIC_UTC); 
     DateTime expectedEpoch = new DateTime(622, 7, 16, 0, 0, 0, 0, JULIAN_UTC); 
     assertEquals(expectedEpoch.getMillis(), epoch.getMillis()); 
 } 


public void testFieldConstructor782() { 
     DateTime date = new DateTime(1364, 12, 6, 0, 0, 0, 0, ISLAMIC_UTC); 
     DateTime expectedDate = new DateTime(1945, 11, 12, 0, 0, 0, 0, ISO_UTC); 
     assertEquals(expectedDate.getMillis(), date.getMillis()); 
 } 


public void testToString812() { 
     assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance(LONDON).toString()); 
     assertEquals("IslamicChronology[Asia/Tokyo]", IslamicChronology.getInstance(TOKYO).toString()); 
     assertEquals("IslamicChronology[Europe/London]", IslamicChronology.getInstance().toString()); 
     assertEquals("IslamicChronology[UTC]", IslamicChronology.getInstanceUTC().toString()); 
 } 


public void testWithZone1143() { 
     assertSame(IslamicChronology.getInstance(TOKYO), IslamicChronology.getInstance(TOKYO).withZone(TOKYO)); 
     assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(LONDON)); 
     assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance(TOKYO).withZone(PARIS)); 
     assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(null)); 
     assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance().withZone(PARIS)); 
     assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstanceUTC().withZone(PARIS)); 
 } 


public void testSampleDate31150() { 
     DateTime dt = new DateTime(1426, 12, 24, 0, 0, 0, 0, ISLAMIC_UTC); 
     assertEquals(IslamicChronology.AH, dt.getEra()); 
     assertEquals(1426, dt.getYear()); 
     Property fld = dt.year(); 
     assertEquals(true, fld.isLeap()); 
     assertEquals(1, fld.getLeapAmount()); 
     assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     assertEquals(12, dt.getMonthOfYear()); 
     fld = dt.monthOfYear(); 
     assertEquals(true, fld.isLeap()); 
     assertEquals(1, fld.getLeapAmount()); 
     assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(12, fld.getMaximumValue()); 
     assertEquals(12, fld.getMaximumValueOverall()); 
     assertEquals(24, dt.getDayOfMonth()); 
     fld = dt.dayOfMonth(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(null, fld.getLeapDurationField()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(30, fld.getMaximumValue()); 
     assertEquals(30, fld.getMaximumValueOverall()); 
     assertEquals(DateTimeConstants.TUESDAY, dt.getDayOfWeek()); 
     fld = dt.dayOfWeek(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(null, fld.getLeapDurationField()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(7, fld.getMaximumValue()); 
     assertEquals(7, fld.getMaximumValueOverall()); 
     assertEquals(6 * 30 + 5 * 29 + 24, dt.getDayOfYear()); 
     fld = dt.dayOfYear(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(null, fld.getLeapDurationField()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(355, fld.getMaximumValue()); 
     assertEquals(355, fld.getMaximumValueOverall()); 
     assertEquals(0, dt.getHourOfDay()); 
     assertEquals(0, dt.getMinuteOfHour()); 
     assertEquals(0, dt.getSecondOfMinute()); 
     assertEquals(0, dt.getMillisOfSecond()); 
 } 


public void testFactoryUTC1585() { 
     assertEquals(DateTimeZone.UTC, IslamicChronology.getInstanceUTC().getZone()); 
     assertSame(IslamicChronology.class, IslamicChronology.getInstanceUTC().getClass()); 
 } 


public void testFactory_Zone1638() { 
     assertEquals(TOKYO, IslamicChronology.getInstance(TOKYO).getZone()); 
     assertEquals(PARIS, IslamicChronology.getInstance(PARIS).getZone()); 
     assertEquals(LONDON, IslamicChronology.getInstance(null).getZone()); 
     assertSame(IslamicChronology.class, IslamicChronology.getInstance(TOKYO).getClass()); 
 } 


public void testWithUTC1705() { 
     assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(LONDON).withUTC()); 
     assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance(TOKYO).withUTC()); 
     assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstanceUTC().withUTC()); 
     assertSame(IslamicChronology.getInstanceUTC(), IslamicChronology.getInstance().withUTC()); 
 } 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /**
     * Tests era, year, monthOfYear, dayOfMonth and dayOfWeek.
     */
    

    

    

    

    

    

    

    

    

}
