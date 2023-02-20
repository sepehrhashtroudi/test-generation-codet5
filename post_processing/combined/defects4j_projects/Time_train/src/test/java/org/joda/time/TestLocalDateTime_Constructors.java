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
 * This class is a Junit unit test for LocalDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDateTime_Constructors extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_UTC = GregorianChronology.getInstanceUTC();
    private static final Chronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final Chronology GREGORIAN_MOSCOW = GregorianChronology.getInstance(MOSCOW);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final int OFFSET_PARIS = PARIS.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    private static final int OFFSET_MOSCOW = MOSCOW.getOffset(0L) / DateTimeConstants.MILLIS_PER_HOUR;
    
    private long MILLIS_OF_DAY =
        10L * DateTimeConstants.MILLIS_PER_HOUR
        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
        + 30L * DateTimeConstants.MILLIS_PER_SECOND
        + 40L;
    private long TEST_TIME_NOW =
        (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + MILLIS_OF_DAY;

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
        return new TestSuite(TestLocalDateTime_Constructors.class);
    }

    public TestLocalDateTime_Constructors(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(MOSCOW);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
    }

    //-----------------------------------------------------------------------

public void testConstructor_nullDateTimeZone647() throws Throwable { 
     LocalDateTime test = new LocalDateTime((DateTimeZone) null); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
 } 


public void testParse_noFormatter769() throws Throwable { 
     assertEquals(new LocalDateTime(2010, 6, 30, 1, 20), LocalDateTime.parse("2010-06-30T01:20")); 
     assertEquals(new LocalDateTime(2010, 1, 2, 14, 50, 30, 432), LocalDateTime.parse("2010-002T14:50:30.432")); 
 } 


public void testConstructor823() throws Throwable { 
     LocalDateTime test = new LocalDateTime(); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
     assertEquals(test, LocalDateTime.now()); 
 } 


public void testFactory_fromDateFields_before1970827() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     LocalDateTime expected = new LocalDateTime(1969, 2, 3, 4, 5, 6, 7); 
     assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime())); 
 } 


public void testConstructor_ObjectStringEx6906() throws Throwable { 
     try { 
         new LocalDateTime("10:20:30.040+14:00"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_nullObject1011() throws Throwable { 
     LocalDateTime test = new LocalDateTime((Object) null); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(10 + OFFSET_MOSCOW, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
 } 


public void testConstructor_long_nullDateTimeZone1077() throws Throwable { 
     LocalDateTime test = new LocalDateTime(TEST_TIME1, (DateTimeZone) null); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(4, test.getMonthOfYear()); 
     assertEquals(6, test.getDayOfMonth()); 
     assertEquals(12 + OFFSET_MOSCOW, test.getHourOfDay()); 
     assertEquals(24, test.getMinuteOfHour()); 
     assertEquals(0, test.getSecondOfMinute()); 
     assertEquals(0, test.getMillisOfSecond()); 
 } 


public void testConstructor_ObjectLocalDateTime1190() throws Throwable { 
     LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC); 
     LocalDateTime test = new LocalDateTime(dt); 
     assertEquals(BUDDHIST_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(5, test.getMonthOfYear()); 
     assertEquals(6, test.getDayOfMonth()); 
     assertEquals(10, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
 } 


public void testConstructor_DateTimeZone1223() throws Throwable { 
     DateTime dt = new DateTime(2005, 6, 8, 23, 59, 0, 0, LONDON); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     LocalDateTime test = new LocalDateTime(LONDON); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(2005, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(8, test.getDayOfMonth()); 
     assertEquals(23, test.getHourOfDay()); 
     assertEquals(59, test.getMinuteOfHour()); 
     assertEquals(0, test.getSecondOfMinute()); 
     assertEquals(0, test.getMillisOfSecond()); 
     assertEquals(test, LocalDateTime.now(LONDON)); 
     test = new LocalDateTime(PARIS); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(2005, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(0, test.getHourOfDay()); 
     assertEquals(59, test.getMinuteOfHour()); 
     assertEquals(0, test.getSecondOfMinute()); 
     assertEquals(0, test.getMillisOfSecond()); 
     assertEquals(test, LocalDateTime.now(PARIS)); 
 } 


public void testConstructor_Chronology1284() throws Throwable { 
     LocalDateTime test = new LocalDateTime(GREGORIAN_PARIS); 
     assertEquals(GREGORIAN_UTC, test.getChronology()); 
     assertEquals(1970, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(10 + OFFSET_PARIS, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
     assertEquals(test, LocalDateTime.now(GREGORIAN_PARIS)); 
 } 


public void testConstructor_int_int_int_int_int_int1404() throws Throwable { 
     LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30); 
     assertEquals(ISO_UTC, test.getChronology()); 
     assertEquals(2005, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(10, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(0, test.getMillisOfSecond()); 
 } 


public void testFactory_fromDateFields_after19701531() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); 
     cal.set(Calendar.MILLISECOND, 7); 
     LocalDateTime expected = new LocalDateTime(1970, 2, 3, 4, 5, 6, 7); 
     assertEquals(expected, LocalDateTime.fromDateFields(cal.getTime())); 
 } 


public void testConstructor_ObjectLocalDate1728() throws Throwable { 
     LocalDate date = new LocalDate(1970, 5, 6); 
     try { 
         new LocalDateTime(date); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testFactory_fromDateFields_null1768() throws Exception { 
     try { 
         LocalDateTime.fromDateFields((Date) null); 
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
    

    

    

}
