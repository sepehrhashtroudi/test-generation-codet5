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

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Constructors extends TestCase {

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
        return new TestSuite(TestYearMonthDay_Constructors.class);
    }

    public TestYearMonthDay_Constructors(String name) {
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

public void testFactory_FromCalendarFields63() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     YearMonthDay expected = new YearMonthDay(1970, 2, 3); 
     assertEquals(expected, YearMonthDay.fromCalendarFields(cal)); 
     try { 
         YearMonthDay.fromCalendarFields(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_ObjectStringEx2106() throws Throwable { 
     try { 
         new YearMonthDay("T10:20:30.040+14:00"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_Object_Chronology398() throws Throwable { 
     Date date = new Date(TEST_TIME1); 
     YearMonthDay test = new YearMonthDay(date, GREGORIAN_PARIS); 
     assertEquals(GREGORIAN_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(4, test.getMonthOfYear()); 
     assertEquals(6, test.getDayOfMonth()); 
 } 


public void testFactory_FromDateFields774() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     YearMonthDay expected = new YearMonthDay(1970, 2, 3); 
     assertEquals(expected, YearMonthDay.fromDateFields(cal.getTime())); 
     try { 
         YearMonthDay.fromDateFields(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_DateTimeZone852() throws Throwable { 
     DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     YearMonthDay test = new YearMonthDay(LONDON); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(2005, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(8, test.getDayOfMonth()); 
     test = new YearMonthDay(PARIS); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(2005, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
 } 


public void testConstructor_ObjectString31457() throws Throwable { 
     YearMonthDay test = new YearMonthDay("1972-12-03T10:20:30.040"); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1972, test.getYear()); 
     assertEquals(12, test.getMonthOfYear()); 
     assertEquals(3, test.getDayOfMonth()); 
 } 

    

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
     * Test constructor (int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    

}
