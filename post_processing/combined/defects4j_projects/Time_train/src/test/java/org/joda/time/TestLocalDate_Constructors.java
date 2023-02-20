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
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Constructors extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_ROUNDED =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;

    private DateTimeZone zone = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestLocalDate_Constructors.class);
    }

    public TestLocalDate_Constructors(String name) {
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

public void testConstructor_long1_Chronology210() throws Throwable { 
     LocalDate test = new LocalDate(TEST_TIME1, GREGORIAN_PARIS); 
     assertEquals(GREGORIAN_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(4, test.getMonthOfYear()); 
     assertEquals(6, test.getDayOfMonth()); 
 } 


public void testConstructor_nullObject_nullDateTimeZone299() throws Throwable { 
     LocalDate test = new LocalDate((Object) null, (DateTimeZone) null); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
 } 


public void testConstructor_ObjectString2453() throws Throwable { 
     LocalDate test = new LocalDate("1972-037"); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1972, test.getYear()); 
     assertEquals(2, test.getMonthOfYear()); 
     assertEquals(6, test.getDayOfMonth()); 
 } 


public void testFactory_fromCalendarFields771() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     LocalDate expected = new LocalDate(1970, 2, 3); 
     assertEquals(expected, LocalDate.fromCalendarFields(cal)); 
 } 


public void testFactory_fromDateFields_before1970924() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     LocalDate expected = new LocalDate(1969, 2, 3); 
     assertEquals(expected, LocalDate.fromDateFields(cal.getTime())); 
 } 


public void testConstructor_DateTimeZone1201() throws Throwable { 
     DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     LocalDate test = new LocalDate(LONDON); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(2005, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(8, test.getDayOfMonth()); 
     assertEquals(test, LocalDate.now(LONDON)); 
     test = new LocalDate(PARIS); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(2005, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(test, LocalDate.now(PARIS)); 
 } 


public void testConstructor_nullDateTimeZone1231() throws Throwable { 
     DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     LocalDate test = new LocalDate((DateTimeZone) null); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(2005, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(8, test.getDayOfMonth()); 
 } 


public void testConstructor_Chronology1269() throws Throwable { 
     LocalDate test = new LocalDate(GREGORIAN_PARIS); 
     assertEquals(GREGORIAN_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(test, LocalDate.now(GREGORIAN_PARIS)); 
 } 


public void testFactory_fromDateFields_null1337() throws Exception { 
     try { 
         LocalDate.fromDateFields((Date) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor1639() throws Throwable { 
     LocalDate test = new LocalDate(); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(test, LocalDate.now()); 
 } 


public void testFactory_fromCalendarFields_null1745() throws Exception { 
     try { 
         LocalDate.fromCalendarFields((Calendar) null); 
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
    

    

    

}
