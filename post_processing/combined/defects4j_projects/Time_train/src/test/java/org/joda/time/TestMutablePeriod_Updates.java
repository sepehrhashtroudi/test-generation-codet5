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
package org.joda.time;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Updates extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestMutablePeriod_Updates.class);
    }

    public TestMutablePeriod_Updates(String name) {
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

public void testSetPeriod_long245() { 
     MutablePeriod test = new MutablePeriod(); 
     test.setPeriod((4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals((450 * 24) + 5, test.getHours()); 
     assertEquals(6, test.getMinutes()); 
     assertEquals(7, test.getSeconds()); 
     assertEquals(8, test.getMillis()); 
 } 


public void testSetPeriod_RInterval269() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setPeriod((ReadableInterval) null); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(0, test.getMillis()); 
 } 


public void testAdd_RInterval1138() { 
     MutablePeriod test = new MutablePeriod(100L); 
     test.add(new Interval(100L, 200L)); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(200, test.getMillis()); 
 } 


public void testMergePeriod_RP3176() { 
     MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     test.mergePeriod(new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 18)); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(18, test.getMillis()); 
 } 


public void testSetPeriod_RD3226() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setPeriod((ReadableDuration) null); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(0, test.getMillis()); 
 } 


public void testAddYears233() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addYears(10); 
     assertEquals(11, test.getYears()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addYears(-10); 
     assertEquals(-9, test.getYears()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addYears(0); 
     assertEquals(1, test.getYears()); 
 } 


public void testSetWeeks277() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setWeeks(10); 
     assertEquals(10, test.getWeeks()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setWeeks(-10); 
     assertEquals(-10, test.getWeeks()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setWeeks(0); 
     assertEquals(0, test.getWeeks()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setWeeks(3); 
     assertEquals(3, test.getWeeks()); 
 } 


public void testSetYears338() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setYears(10); 
     assertEquals(10, test.getYears()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setYears(-10); 
     assertEquals(-10, test.getYears()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setYears(0); 
     assertEquals(0, test.getYears()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setYears(1); 
     assertEquals(1, test.getYears()); 
     test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     try { 
         test.setYears(1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testSetPeriod_long_long_NoMinutes427() { 
     MutablePeriod test = new MutablePeriod(PeriodType.standard().withMinutesRemoved()); 
     DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     test.setPeriod(dt1.getMillis(), dt2.getMillis()); 
     assertEquals(1, test.getYears()); 
     assertEquals(1, test.getMonths()); 
     assertEquals(1, test.getWeeks()); 
     assertEquals(1, test.getDays()); 
     assertEquals(1, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(61, test.getSeconds()); 
     assertEquals(1, test.getMillis()); 
 } 


public void testSetHours442() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setHours(10); 
     assertEquals(10, test.getHours()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setHours(-10); 
     assertEquals(-10, test.getHours()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setHours(0); 
     assertEquals(0, test.getHours()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setHours(5); 
     assertEquals(5, test.getHours()); 
 } 


public void testAddMinutes531() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addMinutes(10); 
     assertEquals(16, test.getMinutes()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addMinutes(-10); 
     assertEquals(-4, test.getMinutes()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addMinutes(0); 
     assertEquals(6, test.getMinutes()); 
 } 


public void testAdd_long_Chronology1550() { 
     MutablePeriod test = new MutablePeriod(100L); 
     test.add(100L, ISOChronology.getInstance()); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(200, test.getMillis()); 
 } 


public void testAdd_long1554() { 
     MutablePeriod test = new MutablePeriod(100L); 
     test.add(100L); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(200, test.getMillis()); 
 } 


public void testAddDays556() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addDays(10); 
     assertEquals(14, test.getDays()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addDays(-10); 
     assertEquals(-6, test.getDays()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addDays(0); 
     assertEquals(4, test.getDays()); 
 } 


public void testSetPeriod_RInterval1577() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     test.setPeriod(new Interval(dt1, dt2)); 
     assertEquals(1, test.getYears()); 
     assertEquals(1, test.getMonths()); 
     assertEquals(1, test.getWeeks()); 
     assertEquals(1, test.getDays()); 
     assertEquals(1, test.getHours()); 
     assertEquals(1, test.getMinutes()); 
     assertEquals(1, test.getSeconds()); 
     assertEquals(1, test.getMillis()); 
 } 


public void testSet_Field853() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.set(DurationFieldType.years(), 10); 
     assertEquals(10, test.getYears()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     try { 
         test.set(null, 10); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testAddHours888() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addHours(10); 
     assertEquals(15, test.getHours()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addHours(-10); 
     assertEquals(-5, test.getHours()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addHours(0); 
     assertEquals(5, test.getHours()); 
 } 


public void testAddSeconds970() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addSeconds(10); 
     assertEquals(17, test.getSeconds()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addSeconds(-10); 
     assertEquals(-3, test.getSeconds()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addSeconds(0); 
     assertEquals(7, test.getSeconds()); 
 } 


public void testAdd_RD31087() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.add((ReadableDuration) null); 
     assertEquals(1, test.getYears()); 
     assertEquals(2, test.getMonths()); 
     assertEquals(3, test.getWeeks()); 
     assertEquals(4, test.getDays()); 
     assertEquals(5, test.getHours()); 
     assertEquals(6, test.getMinutes()); 
     assertEquals(7, test.getSeconds()); 
     assertEquals(8, test.getMillis()); 
 } 


public void testAdd_8ints11109() { 
     MutablePeriod test = new MutablePeriod(100L); 
     test.add(1, 2, 3, 4, 5, 6, 7, 8); 
     assertEquals(1, test.getYears()); 
     assertEquals(2, test.getMonths()); 
     assertEquals(3, test.getWeeks()); 
     assertEquals(4, test.getDays()); 
     assertEquals(5, test.getHours()); 
     assertEquals(6, test.getMinutes()); 
     assertEquals(7, test.getSeconds()); 
     assertEquals(108, test.getMillis()); 
 } 


public void testSetPeriod_RI_RI21127() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     DateTime dt2 = new DateTime(2003, 7, 17, 14, 16, 18, 20); 
     test.setPeriod(dt2, dt1); 
     assertEquals(-1, test.getYears()); 
     assertEquals(-1, test.getMonths()); 
     assertEquals(-1, test.getWeeks()); 
     assertEquals(-1, test.getDays()); 
     assertEquals(-1, test.getHours()); 
     assertEquals(-1, test.getMinutes()); 
     assertEquals(-1, test.getSeconds()); 
     assertEquals(-1, test.getMillis()); 
 } 


public void testSetPeriod_8ints21391() { 
     MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     try { 
         test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(100, test.getMillis()); 
 } 


public void testClear1408() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.clear(); 
     assertEquals(new MutablePeriod(), test); 
     test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime()); 
     test.clear(); 
     assertEquals(new MutablePeriod(PeriodType.yearMonthDayTime()), test); 
 } 


public void testSetPeriod_8ints11449() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setPeriod(11, 12, 13, 14, 15, 16, 17, 18); 
     assertEquals(11, test.getYears()); 
     assertEquals(12, test.getMonths()); 
     assertEquals(13, test.getWeeks()); 
     assertEquals(14, test.getDays()); 
     assertEquals(15, test.getHours()); 
     assertEquals(16, test.getMinutes()); 
     assertEquals(17, test.getSeconds()); 
     assertEquals(18, test.getMillis()); 
 } 


public void testSetPeriod_RI_RI31511() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     DateTime dt1 = new DateTime(2002, 6, 9, 13, 15, 17, 19); 
     test.setPeriod(dt1, dt1); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(0, test.getMillis()); 
 } 


public void testAddWeeks1542() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addWeeks(10); 
     assertEquals(13, test.getWeeks()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addWeeks(-10); 
     assertEquals(-7, test.getWeeks()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addWeeks(0); 
     assertEquals(3, test.getWeeks()); 
 } 


public void testAdd_Field1557() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.add(DurationFieldType.years(), 10); 
     assertEquals(11, test.getYears()); 
     test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     test.add(DurationFieldType.years(), 0); 
     assertEquals(0, test.getYears()); 
     assertEquals(1, test.getMillis()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     try { 
         test.add(null, 0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     try { 
         test.add(null, 10); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testAddMillis1591() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addMillis(10); 
     assertEquals(18, test.getMillis()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addMillis(-10); 
     assertEquals(-2, test.getMillis()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addMillis(0); 
     assertEquals(8, test.getMillis()); 
 } 


public void testSetPeriod_long11593() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setPeriod(100L); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(100, test.getMillis()); 
 } 


public void testAddMonths1699() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addMonths(10); 
     assertEquals(12, test.getMonths()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addMonths(-10); 
     assertEquals(-8, test.getMonths()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.addMonths(0); 
     assertEquals(2, test.getMonths()); 
 } 


public void testMergePeriod_RP51704() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.mergePeriod((ReadablePeriod) null); 
     assertEquals(1, test.getYears()); 
     assertEquals(2, test.getMonths()); 
     assertEquals(3, test.getWeeks()); 
     assertEquals(4, test.getDays()); 
     assertEquals(5, test.getHours()); 
     assertEquals(6, test.getMinutes()); 
     assertEquals(7, test.getSeconds()); 
     assertEquals(8, test.getMillis()); 
 } 


public void testAdd_RP41710() { 
     MutablePeriod test = new MutablePeriod(1, 2, 0, 4, 5, 6, 7, 8, PeriodType.yearMonthDayTime()); 
     try { 
         test.add(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals(1, test.getYears()); 
     assertEquals(2, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(4, test.getDays()); 
     assertEquals(5, test.getHours()); 
     assertEquals(6, test.getMinutes()); 
     assertEquals(7, test.getSeconds()); 
     assertEquals(8, test.getMillis()); 
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
    

    

//    public void testSetPeriod_long3() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    public void testSetPeriod_long4() {
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType());
//        test.setPeriod(
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(12, test.getWeeks());
//        assertEquals(1, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//    }
//
//    public void testSetPeriod_long_NoYears() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withYearsRemoved());
//        test.setPeriod(ms);
//        assertEquals(0, test.getYears());
//        assertEquals(15, test.getMonths()); // totalDays=365+85=450=15*30
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMonths() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMonthsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoWeeks() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearWeekType().withWeeksRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(0, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(85, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoDays() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withDaysRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(0, test.getDays());
//        assertEquals(5 + 25 * 24, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoHours() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withHoursRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(0, test.getHours());
//        assertEquals(6 + 5 * 60, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMinutes() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMinutesRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(0, test.getMinutes());
//        assertEquals(7 + 6 * 60, test.getSeconds());
//        assertEquals(8, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoSeconds() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withSecondsRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(0, test.getSeconds());
//        assertEquals(8 + 7 * 1000, test.getMillis());
//        assertEquals(ms, test.toDurationMillis());
//    }
//
//    public void testSetPeriod_long_NoMillis() {
//        long ms =
//            (4L + (3L * 7L) + (2L * 30L) + 365L) * DateTimeConstants.MILLIS_PER_DAY +
//            5L * DateTimeConstants.MILLIS_PER_HOUR +
//            6L * DateTimeConstants.MILLIS_PER_MINUTE +
//            7L * DateTimeConstants.MILLIS_PER_SECOND + 8L;
//        MutablePeriod test = new MutablePeriod(PeriodType.getPreciseYearMonthType().withMillisRemoved());
//        test.setPeriod(ms);
//        assertEquals(1, test.getYears());
//        assertEquals(2, test.getMonths());
//        assertEquals(0, test.getWeeks());
//        assertEquals(25, test.getDays());
//        assertEquals(5, test.getHours());
//        assertEquals(6, test.getMinutes());
//        assertEquals(7, test.getSeconds());
//        assertEquals(0, test.getMillis());
//        assertEquals(ms - 8, test.toDurationMillis());
//    }

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}
