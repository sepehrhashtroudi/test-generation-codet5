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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Constructors extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEW_YORK = DateTimeZone.forID("America/New_York");
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final JulianChronology JULIAN_LONDON = JulianChronology.getInstance(LONDON);
    private static final JulianChronology JULIAN_PARIS = JulianChronology.getInstance(PARIS);
    private static final JulianChronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final int OFFSET_LONDON = LONDON.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    private static final int OFFSET_PARIS = PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;

    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;

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
        return new TestSuite(TestLocalTime_Constructors.class);
    }

    public TestLocalTime_Constructors(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
        java.util.TimeZone.setDefault(LONDON.toTimeZone());
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        java.util.TimeZone.setDefault(zone.toTimeZone());
        zone = null;
    }

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */

public void testFactoryMillisOfDay_long217() throws Throwable { 
     LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1, test.getHourOfDay()); 
     assertEquals(2, test.getMinuteOfHour()); 
     assertEquals(3, test.getSecondOfMinute()); 
     assertEquals(4, test.getMillisOfSecond()); 
 } 


public void testParse_formatter253() throws Throwable { 
     DateTimeFormatter f = DateTimeFormat.forPattern("HH mm").withChronology(ISOChronology.getInstance(PARIS)); 
     assertEquals(new LocalTime(13, 30), LocalTime.parse("13 30", f)); 
 } 


public void testConstructor725() throws Throwable { 
     LocalTime test = new LocalTime(); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
     assertEquals(test, LocalTime.now()); 
 } 


public void testFactory_FromCalendarFields_Calendar735() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     LocalTime expected = new LocalTime(4, 5, 6, 7); 
     assertEquals(expected, LocalTime.fromCalendarFields(cal)); 
     try { 
         LocalTime.fromCalendarFields((Calendar) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_ObjectString_DateTimeZoneNewYork749() throws Throwable { 
     LocalTime test = new LocalTime("04:20", NEW_YORK); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(4, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
 } 


public void testConstructor_ObjectLocalTime786() throws Throwable { 
     LocalTime time = new LocalTime(10, 20, 30, 40, BUDDHIST_UTC); 
     LocalTime test = new LocalTime(time); 
     assertEquals(BUDDHIST_UTC, test.getChronology()); 
     assertEquals(10, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
 } 


public void testConstructor_Chronology844() throws Throwable { 
     LocalTime test = new LocalTime(JULIAN_LONDON); 
     assertEquals(JULIAN_UTC, test.getChronology()); 
     assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
     assertEquals(test, LocalTime.now(JULIAN_LONDON)); 
 } 


public void testFactory_FromDateFields_after19701099() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     LocalTime expected = new LocalTime(4, 5, 6, 7); 
     assertEquals(expected, LocalTime.fromDateFields(cal.getTime())); 
 } 


public void testConstructor_long_DateTimeZone_21327() throws Throwable { 
     DateTime dt = new DateTime(2007, 6, 9, 1, 2, 3, 4, PARIS); 
     DateTime dtUTC = new DateTime(1970, 1, 1, 1, 2, 3, 4, DateTimeZone.UTC); 
     LocalTime test = new LocalTime(dt.getMillis(), PARIS); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1, test.getHourOfDay()); 
     assertEquals(2, test.getMinuteOfHour()); 
     assertEquals(3, test.getSecondOfMinute()); 
     assertEquals(4, test.getMillisOfSecond()); 
     assertEquals(dtUTC.getMillis(), test.getLocalMillis()); 
 } 


public void testParse_noFormatter1446() throws Throwable { 
     assertEquals(new LocalTime(1, 20), LocalTime.parse("01:20")); 
     assertEquals(new LocalTime(14, 50, 30, 432), LocalTime.parse("14:50:30.432")); 
 } 


public void testConstructor_DateTimeZone1450() throws Throwable { 
     DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     LocalTime test = new LocalTime(LONDON); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(23, test.getHourOfDay()); 
     assertEquals(59, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
     assertEquals(test, LocalTime.now(LONDON)); 
     test = new LocalTime(PARIS); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(0, test.getHourOfDay()); 
     assertEquals(59, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
     assertEquals(test, LocalTime.now(PARIS)); 
 } 


public void testFactory_FromDateFields_null1648() throws Exception { 
     try { 
         LocalTime.fromDateFields((Date) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
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
    

    

    

    

    

}
