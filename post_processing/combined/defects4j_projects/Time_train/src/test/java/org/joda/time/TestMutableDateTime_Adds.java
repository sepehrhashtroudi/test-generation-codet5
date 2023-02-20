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

import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Adds extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

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
        return new TestSuite(TestMutableDateTime_Adds.class);
    }

    public TestMutableDateTime_Adds(String name) {
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

public void testAdd_DurationFieldType_int354() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     try { 
         test.add((DurationFieldType) null, 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals(TEST_TIME1, test.getMillis()); 
 } 


public void testAdd_RD2373() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     test.add((ReadableDuration) null); 
     assertEquals(TEST_TIME1, test.getMillis()); 
 } 


public void testAddSeconds_int_dstOverlapWinter_addZero862() { 
     MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     test.addHours(1); 
     assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     test.addSeconds(0); 
     assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 } 


public void testAdd_long1882() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     test.add(123456L); 
     assertEquals(TEST_TIME1 + 123456L, test.getMillis()); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 } 


public void testAddWeekyears_int1909() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.addWeekyears(-1); 
     assertEquals("2001-06-10T05:06:07.008+01:00", test.toString()); 
 } 


public void testAdd_DurationFieldType_int11000() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     test.add(DurationFieldType.years(), 8); 
     assertEquals(2010, test.getYear()); 
 } 


public void testAdd_RP_int11042() { 
     Period d = new Period(0, 0, 0, 0, 0, 0, 1, 2); 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     test.add(d, -2); 
     assertEquals(TEST_TIME1 - (2L * 1002L), test.getMillis()); 
 } 


public void testAddYears_int11210() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.addYears(8); 
     assertEquals("2010-06-09T05:06:07.008+01:00", test.toString()); 
 } 


public void testAddDays_int11254() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.addDays(17); 
     assertEquals("2002-06-26T05:06:07.008+01:00", test.toString()); 
 } 


public void testAddMonths_int_dstOverlapSummer_addZero1311() { 
     MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     test.addMonths(0); 
     assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 } 


public void testAddMillis_int_dstOverlapWinter_addZero1382() { 
     MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     test.addHours(1); 
     assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
     test.addMillis(0); 
     assertEquals("2011-10-30T02:30:00.000+01:00", test.toString()); 
 } 


public void testAddMinutes_int11416() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.addMinutes(13); 
     assertEquals("2002-06-09T05:19:07.008+01:00", test.toString()); 
 } 


public void testAdd_RD_int11480() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     test.add(new Duration(123456L), -2); 
     assertEquals(TEST_TIME1 - (2L * 123456L), test.getMillis()); 
 } 


public void testAddWeeks_int_dstOverlapSummer_addZero1491() { 
     MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     test.addWeeks(0); 
     assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 } 


public void testAddWeeks_int11564() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.addWeeks(-21); 
     assertEquals("2002-01-13T05:06:07.008Z", test.toString()); 
 } 


public void testAddDays_int_dstOverlapSummer_addZero1572() { 
     MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     test.addDays(0); 
     assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 } 


public void testAddSeconds_int11621() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.addSeconds(13); 
     assertEquals("2002-06-09T05:06:20.008+01:00", test.toString()); 
 } 


public void testAddMonths_int11647() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.addMonths(6); 
     assertEquals("2002-12-09T05:06:07.008Z", test.toString()); 
 } 


public void testAdd_RP21678() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     test.add((ReadablePeriod) null); 
     assertEquals(TEST_TIME1, test.getMillis()); 
 } 


public void testAddMillis_int11743() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     test.addMillis(13); 
     assertEquals("2002-06-09T05:06:07.021+01:00", test.toString()); 
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
    

    

    

}
