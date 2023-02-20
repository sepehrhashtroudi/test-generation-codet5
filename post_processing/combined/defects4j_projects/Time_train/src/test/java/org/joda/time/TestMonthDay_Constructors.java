/*
 *  Copyright 2001-2010 Stephen Colebourne
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

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for MonthDay. Based on {@link TestYearMonth_Constuctors} 
 */
public class TestMonthDay_Constructors extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestMonthDay_Constructors.class);
    }

    public TestMonthDay_Constructors(String name) {
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

public void testFactory_FromCalendarFields8() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     MonthDay expected = new MonthDay(2, 3); 
     assertEquals(expected, MonthDay.fromCalendarFields(cal)); 
     try { 
         MonthDay.fromCalendarFields(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_Object114() throws Throwable { 
     Date date = new Date(TEST_TIME1); 
     MonthDay test = new MonthDay(date); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(4, test.getMonthOfYear()); 
     assertEquals(6, test.getDayOfMonth()); 
 } 


public void testConstructor933() throws Throwable { 
     MonthDay test = new MonthDay(); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(test, MonthDay.now()); 
 } 


public void testConstructor_long_nullChronology1218() throws Throwable { 
     MonthDay test = new MonthDay(TEST_TIME1, null); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(4, test.getMonthOfYear()); 
     assertEquals(6, test.getDayOfMonth()); 
 } 


public void testFactory_FromDateFields1230() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     MonthDay expected = new MonthDay(2, 3); 
     assertEquals(expected, MonthDay.fromDateFields(cal.getTime())); 
     try { 
         MonthDay.fromDateFields(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_DateTimeZone1461() throws Throwable { 
     DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     MonthDay test = new MonthDay(LONDON); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(30, test.getDayOfMonth()); 
     assertEquals(test, MonthDay.now(LONDON)); 
     test = new MonthDay(PARIS); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(7, test.getMonthOfYear()); 
     assertEquals(1, test.getDayOfMonth()); 
     assertEquals(test, MonthDay.now(PARIS)); 
 } 


public void testConstructor_int_int_nullChronology1503() throws Throwable { 
     MonthDay test = new MonthDay(6, 30, null); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(30, test.getDayOfMonth()); 
 } 


public void testConstructor_Chronology1627() throws Throwable { 
     MonthDay test = new MonthDay(GREGORIAN_PARIS); 
     assertEquals(GREGORIAN_UTC, test.getChronology()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(test, MonthDay.now(GREGORIAN_PARIS)); 
 } 


public void testConstructor_Object_Chronology1630() throws Throwable { 
     Date date = new Date(TEST_TIME1); 
     MonthDay test = new MonthDay(date, GREGORIAN_PARIS); 
     assertEquals(GREGORIAN_UTC, test.getChronology()); 
     assertEquals(4, test.getMonthOfYear()); 
     assertEquals(6, test.getDayOfMonth()); 
 } 

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    /**
     * Test constructor (DateTimeZone)
     */
    

    /**
     * Test constructor (DateTimeZone=null)
     */
    

    /**
     * Test constructor (Chronology)
     */
    

    /**
     * Test constructor (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object=null, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology=null)
     */
    

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int)
     */
    

    /**
     * Test constructor (int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, Chronology=null)
     */
    

}
