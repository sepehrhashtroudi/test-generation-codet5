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

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Sets extends TestCase {
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
        return new TestSuite(TestMutableDateTime_Sets.class);
    }

    public TestMutableDateTime_Sets(String name) {
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

public void testSetMonthOfYear_int_dstOverlapSummer_addZero59() { 
     MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     test.setMonthOfYear(10); 
     assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 } 


public void testSetWeekyear_int165() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.setWeekyear(2001); 
     assertEquals("2001-06-10T05:06:07.008+01:00", test.toString()); 
 } 


public void testSetMinuteOfHour_int2402() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     try { 
         test.setMinuteOfHour(60); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 } 


public void testSetTime_int_int_int2419() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     try { 
         test.setTime(60, 6, 7, 8); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals(TEST_TIME1, test.getMillis()); 
 } 


public void testSetDateTime_int_int_int_int_int_int_int1443() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     test.setDateTime(2010, 12, 3, 5, 6, 7, 8); 
     assertEquals(2010, test.getYear()); 
     assertEquals(12, test.getMonthOfYear()); 
     assertEquals(3, test.getDayOfMonth()); 
     assertEquals(5, test.getHourOfDay()); 
     assertEquals(6, test.getMinuteOfHour()); 
     assertEquals(7, test.getSecondOfMinute()); 
     assertEquals(8, test.getMillisOfSecond()); 
 } 


public void testSetDate_int_int_int1495() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     test.setDate(2010, 12, 3); 
     assertEquals(2010, test.getYear()); 
     assertEquals(12, test.getMonthOfYear()); 
     assertEquals(3, test.getDayOfMonth()); 
     assertEquals(12, test.getHourOfDay()); 
     assertEquals(24, test.getMinuteOfHour()); 
     assertEquals(48, test.getSecondOfMinute()); 
     assertEquals(501, test.getMillisOfSecond()); 
 } 


public void testSetDayOfMonth_int_dstOverlapSummer_addZero567() { 
     MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     test.setDayOfMonth(30); 
     assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 } 


public void testSetDate_RI_same590() { 
     MutableDateTime setter = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     MutableDateTime test = new MutableDateTime(2010, 12, 3, 2, 24, 48, 501, DateTimeZone.forID("America/Los_Angeles")); 
     test.setDate(setter); 
     assertEquals(2010, test.getYear()); 
     assertEquals(12, test.getMonthOfYear()); 
     assertEquals(3, test.getDayOfMonth()); 
     assertEquals(2, test.getHourOfDay()); 
     assertEquals(24, test.getMinuteOfHour()); 
     assertEquals(48, test.getSecondOfMinute()); 
     assertEquals(501, test.getMillisOfSecond()); 
 } 


public void testSetZoneRetainFields_DateTimeZone2635() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     test.setZoneRetainFields(null); 
     assertEquals(TEST_TIME1, test.getMillis()); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 } 


public void testSetDayOfYear_int2713() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     try { 
         test.setDayOfYear(366); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 } 


public void testSetDayOfYear_int_dstOverlapWinter_addZero716() { 
     MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     test.addHours(1); 
     assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     test.setDayOfYear(303); 
     assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 } 


public void testSetZoneRetainFields_DateTimeZone1779() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     test.setZoneRetainFields(PARIS); 
     assertEquals(TEST_TIME1 - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
 } 


public void testSetDate_int_int_int2788() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     try { 
         test.setDate(2010, 13, 3); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals(TEST_TIME1, test.getMillis()); 
 } 


public void testSet_DateTimeFieldType_int2985() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     try { 
         test.set(null, 0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals(TEST_TIME1, test.getMillis()); 
 } 


public void testSetDayOfWeek_int11014() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.setDayOfWeek(5); 
     assertEquals("2002-06-07T05:06:07.008+01:00", test.toString()); 
 } 


public void testSetTime_int_int_int_int11051() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     test.setTime(5, 6, 7, 8); 
     assertEquals(2002, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(5, test.getHourOfDay()); 
     assertEquals(6, test.getMinuteOfHour()); 
     assertEquals(7, test.getSecondOfMinute()); 
     assertEquals(8, test.getMillisOfSecond()); 
 } 


public void testSetYear_int11108() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.setYear(2010); 
     assertEquals("2010-06-09T05:06:07.008+01:00", test.toString()); 
 } 


public void testSetMilliOfDay_int21181() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     try { 
         test.setMillisOfDay(24 * 60 * 60 * 1000); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 } 


public void testSetHourOfDay_int21208() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     try { 
         test.setHourOfDay(24); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 } 


public void testSetMinuteOfDay_int11305() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.setMinuteOfDay(13); 
     assertEquals("2002-06-09T00:13:07.008+01:00", test.toString()); 
 } 


public void testSetMonthOfYear_int_dstOverlapWinter_addZero1338() { 
     MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     test.addHours(1); 
     assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     test.setMonthOfYear(10); 
     assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 } 


public void testSetSecondOfDay_int11384() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.setSecondOfDay(13); 
     assertEquals("2002-06-09T00:00:13.008+01:00", test.toString()); 
 } 


public void testSetMilliOfSecond_int21494() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     try { 
         test.setMillisOfSecond(1000); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 } 


public void testSetMillis_RI11595() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1, BuddhistChronology.getInstance()); 
     test.setMillis(new Instant(TEST_TIME2)); 
     assertEquals(TEST_TIME2, test.getMillis()); 
     assertEquals(BuddhistChronology.getInstance(), test.getChronology()); 
 } 


public void testSetZoneRetainFields_DateTimeZone31596() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance(PARIS)); 
     test.setZoneRetainFields(null); 
     assertEquals(TEST_TIME1 + DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
 } 


public void testSet_DateTimeFieldType_int31677() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     try { 
         test.set(DateTimeFieldType.monthOfYear(), 13); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals(TEST_TIME1, test.getMillis()); 
 } 


public void testSetDayOfMonth_int_dstOverlapWinter_addZero1714() { 
     MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     test.addHours(1); 
     assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     test.setDayOfMonth(30); 
     assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 } 


public void testSetZone_DateTimeZone11739() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     test.setZone(PARIS); 
     assertEquals(TEST_TIME1, test.getMillis()); 
     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
 } 


public void testSetSecondOfMinute_int11746() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.setSecondOfMinute(13); 
     assertEquals("2002-06-09T05:06:13.008+01:00", test.toString()); 
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
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

}
