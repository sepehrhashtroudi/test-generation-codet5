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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Constructors extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final ISOChronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final int OFFSET = 1;
    
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
        return new TestSuite(TestTimeOfDay_Constructors.class);
    }

    public TestTimeOfDay_Constructors(String name) {
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

public void testConstructor_ObjectString215() throws Throwable { 
     TimeOfDay test = new TimeOfDay("10:20:30.040+04:00"); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(10 + OFFSET - 4, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
 } 


public void testFactoryMillisOfDay_long139() throws Throwable { 
     TimeOfDay test = TimeOfDay.fromMillisOfDay(TEST_TIME1); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1, test.getHourOfDay()); 
     assertEquals(2, test.getMinuteOfHour()); 
     assertEquals(3, test.getSecondOfMinute()); 
     assertEquals(4, test.getMillisOfSecond()); 
 } 


public void testFactory_FromDateFields_after1970603() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     TimeOfDay expected = new TimeOfDay(4, 5, 6, 7); 
     assertEquals(expected, TimeOfDay.fromDateFields(cal.getTime())); 
 } 


public void testConstructor_long2_Chronology614() throws Throwable { 
     TimeOfDay test = new TimeOfDay(TEST_TIME2, JulianChronology.getInstance()); 
     assertEquals(JulianChronology.getInstanceUTC(), test.getChronology()); 
     assertEquals(5 + OFFSET, test.getHourOfDay()); 
     assertEquals(6, test.getMinuteOfHour()); 
     assertEquals(7, test.getSecondOfMinute()); 
     assertEquals(8, test.getMillisOfSecond()); 
 } 


public void testConstructor_int_int_int626() throws Throwable { 
     TimeOfDay test = new TimeOfDay(10, 20, 30); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(10, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(0, test.getMillisOfSecond()); 
     try { 
         new TimeOfDay(-1, 20, 30); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new TimeOfDay(24, 20, 30); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new TimeOfDay(10, -1, 30); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new TimeOfDay(10, 60, 30); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new TimeOfDay(10, 20, -1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new TimeOfDay(10, 20, 60); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor2_Object_Chronology630() throws Throwable { 
     TimeOfDay test = new TimeOfDay("T10:20"); 
     assertEquals(10, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(0, test.getSecondOfMinute()); 
     assertEquals(0, test.getMillisOfSecond()); 
     try { 
         new TimeOfDay("T1020"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_ObjectString1897() throws Throwable { 
     TimeOfDay test = new TimeOfDay("10:20:30.040"); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(10, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
 } 


public void testFactory_FromCalendarFields1019() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     TimeOfDay expected = new TimeOfDay(4, 5, 6, 7); 
     assertEquals(expected, TimeOfDay.fromCalendarFields(cal)); 
     try { 
         TimeOfDay.fromCalendarFields(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_int_int_int_nullChronology1032() throws Throwable { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, null); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(10, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(0, test.getMillisOfSecond()); 
 } 


public void testConstructor_Object_nullChronology1330() throws Throwable { 
     Date date = new Date(TEST_TIME1); 
     TimeOfDay test = new TimeOfDay(date, null); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1 + OFFSET, test.getHourOfDay()); 
     assertEquals(2, test.getMinuteOfHour()); 
     assertEquals(3, test.getSecondOfMinute()); 
     assertEquals(4, test.getMillisOfSecond()); 
 } 


public void testConstructor_int_int1378() throws Throwable { 
     TimeOfDay test = new TimeOfDay(10, 20); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(10, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(0, test.getSecondOfMinute()); 
     assertEquals(0, test.getMillisOfSecond()); 
     try { 
         new TimeOfDay(-1, 20); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new TimeOfDay(24, 20); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new TimeOfDay(10, -1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new TimeOfDay(10, 60); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testFactory_FromDateFields_null1394() throws Exception { 
     try { 
         TimeOfDay.fromDateFields(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_DateTimeZone1420() throws Throwable { 
     DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     TimeOfDay test = new TimeOfDay(LONDON); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(23, test.getHourOfDay()); 
     assertEquals(59, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
     test = new TimeOfDay(PARIS); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(0, test.getHourOfDay()); 
     assertEquals(59, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
 } 


public void testConstructor1462() throws Throwable { 
     TimeOfDay test = new TimeOfDay(); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(10 + OFFSET, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
 } 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test factory (long)
     */
    

    /**
     * Test factory (long, Chronology)
     */
    

    /**
     * Test factory (long, Chronology=null)
     */
    

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
    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object=null)
     */
    

    /**
     * Test constructor (Object)
     */
    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object, Chronology)
     */
    

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
     * Test constructor (int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    

    /**
     * Test constructor (int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    

    /**
     * Test constructor (int, int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, int, Chronology=null)
     */
    

}
