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
public void testPropertySetDayOfYear13() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.dayOfYear().set(4); 
     assertEquals("2004-01-19T00:00:00.000Z", test.toString()); 
 }
public void testParse_noFormatter104() throws Throwable { 
     assertEquals(new LocalDate(2010, 6, 30, ISOChronology.getInstance(LONDON)), LocalDate.parse("2010-06-30")); 
     assertEquals(new LocalDate(2010, 1, 2), LocalDate.parse("2010-002")); 
 }
public void testSetDayOfYear_int2105() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 5, 6, 7, 8); 
     try { 
         test.setDayOfYear(366); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals("2002-06-09T05:06:07.008+01:00", test.toString()); 
 }
@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP106() { 
     YearMonthDay ymd = new YearMonthDay(2005, 6, 9); 
     assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     TimeOfDay tod = new TimeOfDay(12, 20, 30, 0); 
     assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     Partial year = new Partial(DateTimeFieldType.year(), 2005); 
     assertEquals(true, DateTimeUtils.isContiguous(year)); 
     Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12); 
     assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     try { 
         DateTimeUtils.isContiguous((ReadablePartial) null); 
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
