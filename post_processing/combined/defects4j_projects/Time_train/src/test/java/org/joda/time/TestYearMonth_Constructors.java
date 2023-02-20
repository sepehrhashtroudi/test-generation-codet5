/*
 *  Copyright 2001-2009 Stephen Colebourne
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
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Constructors extends TestCase {

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
        return new TestSuite(TestYearMonth_Constructors.class);
    }

    public TestYearMonth_Constructors(String name) {
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

public void testFactory_FromDateFields137() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     YearMonth expected = new YearMonth(1970, 2); 
     assertEquals(expected, YearMonth.fromDateFields(cal.getTime())); 
     try { 
         YearMonth.fromDateFields(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testParse_formatter214() throws Throwable { 
     DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--MM").withChronology(ISOChronology.getInstance(PARIS)); 
     assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010--06", f)); 
 } 


public void testConstructor_Object624() throws Throwable { 
     Date date = new Date(TEST_TIME1); 
     YearMonth test = new YearMonth(date); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(4, test.getMonthOfYear()); 
 } 


public void testConstructor_Chronology772() throws Throwable { 
     YearMonth test = new YearMonth(GREGORIAN_PARIS); 
     assertEquals(GREGORIAN_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(test, YearMonth.now(GREGORIAN_PARIS)); 
 } 


public void testConstructor_nullChronology815() throws Throwable { 
     YearMonth test = new YearMonth((Chronology) null); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
 } 


public void testConstructor885() throws Throwable { 
     YearMonth test = new YearMonth(); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(test, YearMonth.now()); 
 } 


public void testParse_noFormatter964() throws Throwable { 
     assertEquals(new YearMonth(2010, 6), YearMonth.parse("2010-06-30")); 
     assertEquals(new YearMonth(2010, 1), YearMonth.parse("2010-002")); 
 } 


public void testConstructor_Object_nullChronology990() throws Throwable { 
     Date date = new Date(TEST_TIME1); 
     YearMonth test = new YearMonth(date, null); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(4, test.getMonthOfYear()); 
 } 


public void testFactory_FromCalendarFields1116() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     YearMonth expected = new YearMonth(1970, 2); 
     assertEquals(expected, YearMonth.fromCalendarFields(cal)); 
     try { 
         YearMonth.fromCalendarFields(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_long1_Chronology1303() throws Throwable { 
     YearMonth test = new YearMonth(TEST_TIME1, GREGORIAN_PARIS); 
     assertEquals(GREGORIAN_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(4, test.getMonthOfYear()); 
 } 


public void testConstructor_DateTimeZone1359() throws Throwable { 
     DateTime dt = new DateTime(2005, 6, 30, 23, 59, 0, 0, LONDON); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     YearMonth test = new YearMonth(LONDON); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(2005, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(test, YearMonth.now(LONDON)); 
     test = new YearMonth(PARIS); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(2005, test.getYear()); 
     assertEquals(7, test.getMonthOfYear()); 
     assertEquals(test, YearMonth.now(PARIS)); 
 } 


public void testConstructor_int_int_Chronology1463() throws Throwable { 
     YearMonth test = new YearMonth(1970, 6, GREGORIAN_PARIS); 
     assertEquals(GREGORIAN_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     try { 
         new YearMonth(Integer.MIN_VALUE, 6, GREGORIAN_PARIS); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new YearMonth(Integer.MAX_VALUE, 6, GREGORIAN_PARIS); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new YearMonth(1970, 0, GREGORIAN_PARIS); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new YearMonth(1970, 13, GREGORIAN_PARIS); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
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
