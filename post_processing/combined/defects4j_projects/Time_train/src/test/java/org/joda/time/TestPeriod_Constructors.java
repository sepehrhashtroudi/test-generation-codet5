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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a JUnit test for Duration.
 *
 * @author Stephen Colebourne
 */
public class TestPeriod_Constructors extends TestCase {
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
            
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestPeriod_Constructors.class);
    }

    public TestPeriod_Constructors(String name) {
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

@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP251() throws Throwable { 
     YearMonthDay dt1 = new YearMonthDay(2004, 6, 9); 
     YearMonthDay dt2 = new YearMonthDay(2005, 5, 17); 
     Period test = new Period(dt1, dt2); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(0, test.getYears()); 
     assertEquals(11, test.getMonths()); 
     assertEquals(1, test.getWeeks()); 
     assertEquals(1, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(0, test.getMillis()); 
 } 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference152() throws Throwable { 
     YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfMonth() }; 
     Partial end = new Partial(types, new int[] { 2004, 6, 7 }); 
     Period test = Period.fieldDifference(start, end); 
     assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     assertEquals(-1, test.getYears()); 
     assertEquals(2, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(-2, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(0, test.getMillis()); 
 } 


public void testConstructor_RD_RI2115() throws Throwable { 
     DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     Duration dur = null; 
     Period test = new Period(dur, dt1); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(0, test.getMillis()); 
 } 


public void testConstructor_Object3120() throws Throwable { 
     Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime())); 
     assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(1, test.getHours()); 
     assertEquals(2, test.getMinutes()); 
     assertEquals(3, test.getSeconds()); 
     assertEquals(4, test.getMillis()); 
 } 


public void testConstructor1157() throws Throwable { 
     Period test = new Period(); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(0, test.getMillis()); 
 } 


public void testConstructor_long_PeriodType_Chronology4190() throws Throwable { 
     long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     Period test = new Period(length, (PeriodType) null, (Chronology) null); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals((4 * 24) + 5, test.getHours()); 
     assertEquals(6, test.getMinutes()); 
     assertEquals(7, test.getSeconds()); 
     assertEquals(8, test.getMillis()); 
 } 


public void testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths216() throws Throwable { 
     DateTime dt1 = new DateTime(2004, 12, 28, 0, 0); 
     DateTime dt2 = new DateTime(2005, 2, 28, 0, 0); 
     Period test = new Period(dt1, dt2); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 } 


public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths290() throws Throwable { 
     LocalDate dt1 = new LocalDate(2004, 12, 28); 
     LocalDate dt2 = new LocalDate(2005, 2, 28); 
     Period test = new Period(dt1, dt2); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 } 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference3396() throws Throwable { 
     YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     TimeOfDay endTime = new TimeOfDay(12, 30, 40, 0); 
     try { 
         Period.fieldDifference(start, endTime); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_RP_RP_PeriodType8469() throws Throwable { 
     Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 12); 
     Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14); 
     try { 
         new Period(dt1, dt2, PeriodType.standard()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_RD_RI_PeriodType1560() throws Throwable { 
     DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     Duration dur = new Interval(dt1, dt2).toDuration(); 
     Period test = new Period(dur, dt2, PeriodType.yearDayTime()); 
     assertEquals(PeriodType.yearDayTime(), test.getPeriodType()); 
     assertEquals(1, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(31, test.getDays()); 
     assertEquals(1, test.getHours()); 
     assertEquals(1, test.getMinutes()); 
     assertEquals(1, test.getSeconds()); 
     assertEquals(1, test.getMillis()); 
 } 


public void testConstructor_RI_RI4691() throws Throwable { 
     DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     DateTime dt2 = null; 
     Period test = new Period(dt1, dt2); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(-3, test.getYears()); 
     assertEquals(-1, test.getMonths()); 
     assertEquals(-1, test.getWeeks()); 
     assertEquals(-1, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(-1, test.getMinutes()); 
     assertEquals(-1, test.getSeconds()); 
     assertEquals(-1, test.getMillis()); 
 } 


public void testConstructor_Object_PeriodType1700() throws Throwable { 
     Period test = new Period("P1Y2M3D", PeriodType.yearMonthDayTime()); 
     assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     assertEquals(1, test.getYears()); 
     assertEquals(2, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(3, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(0, test.getMillis()); 
 } 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference4867() throws Throwable { 
     DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear(), DateTimeFieldType.dayOfWeek() }; 
     YearMonthDay start = new YearMonthDay(2005, 4, 9); 
     Partial end = new Partial(types, new int[] { 1, 2, 3 }); 
     try { 
         Period.fieldDifference(start, end); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_long_long2940() throws Throwable { 
     DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime dt2 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     Period test = new Period(dt1.getMillis(), dt2.getMillis()); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(1, test.getYears()); 
     assertEquals(1, test.getMonths()); 
     assertEquals(1, test.getWeeks()); 
     assertEquals(1, test.getDays()); 
     assertEquals(1, test.getHours()); 
     assertEquals(1, test.getMinutes()); 
     assertEquals(1, test.getSeconds()); 
     assertEquals(1, test.getMillis()); 
 } 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP_PeriodType21088() throws Throwable { 
     YearMonthDay dt1 = new YearMonthDay(2004, 6, 9); 
     YearMonthDay dt2 = new YearMonthDay(2005, 5, 17); 
     Period test = new Period(dt1, dt2, PeriodType.yearMonthDay()); 
     assertEquals(PeriodType.yearMonthDay(), test.getPeriodType()); 
     assertEquals(0, test.getYears()); 
     assertEquals(11, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(8, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(0, test.getMillis()); 
 } 


public void testConstructor_Object_PeriodType31120() throws Throwable { 
     Period test = new Period(new Period(0, 0, 0, 0, 1, 2, 3, 4, PeriodType.dayTime()), PeriodType.yearMonthDayTime()); 
     assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(1, test.getHours()); 
     assertEquals(2, test.getMinutes()); 
     assertEquals(3, test.getSeconds()); 
     assertEquals(4, test.getMillis()); 
 } 


public void testConstructor_RP_RP_PeriodType71166() throws Throwable { 
     Partial dt1 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.monthOfYear(), 12); 
     Partial dt2 = new Partial().with(DateTimeFieldType.year(), 2005).with(DateTimeFieldType.hourOfDay(), 14); 
     try { 
         new Period(dt1, dt2, PeriodType.standard()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_long_long_PeriodType21336() throws Throwable { 
     DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime dt2 = new DateTime(2004, 7, 10, 1, 1, 1, 1); 
     Period test = new Period(dt1.getMillis(), dt2.getMillis(), PeriodType.dayTime()); 
     assertEquals(PeriodType.dayTime(), test.getPeriodType()); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(31, test.getDays()); 
     assertEquals(1, test.getHours()); 
     assertEquals(1, test.getMinutes()); 
     assertEquals(1, test.getSeconds()); 
     assertEquals(1, test.getMillis()); 
 } 


public void testFactoryFieldDifference51339() throws Throwable { 
     DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.dayOfMonth(), DateTimeFieldType.dayOfWeek() }; 
     Partial start = new Partial(types, new int[] { 1, 2, 3 }); 
     Partial end = new Partial(types, new int[] { 1, 2, 3 }); 
     try { 
         Period.fieldDifference(start, end); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


@SuppressWarnings("deprecation") 
 public void testFactoryFieldDifference21360() throws Throwable { 
     YearMonthDay ymd = new YearMonthDay(2005, 4, 9); 
     try { 
         Period.fieldDifference(ymd, (ReadablePartial) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         Period.fieldDifference((ReadablePartial) null, ymd); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP41444() throws Throwable { 
     YearMonthDay dt1 = new YearMonthDay(2005, 7, 17); 
     YearMonthDay dt2 = null; 
     try { 
         new Period(dt1, dt2); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


@SuppressWarnings("deprecation") 
 public void testConstructor_RP_RP_PeriodType61475() throws Throwable { 
     YearMonthDay dt1 = new YearMonthDay(2005, 7, 17); 
     TimeOfDay dt2 = new TimeOfDay(10, 20, 30, 40); 
     try { 
         new Period(dt1, dt2, PeriodType.standard()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_long_Chronology21520() throws Throwable { 
     long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     Period test = new Period(length, ISOChronology.getInstanceUTC()); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(4, test.getDays()); 
     assertEquals(5, test.getHours()); 
     assertEquals(6, test.getMinutes()); 
     assertEquals(7, test.getSeconds()); 
     assertEquals(8, test.getMillis()); 
 } 


public void testConstructor_Object_PeriodType21570() throws Throwable { 
     Period test = new Period((Object) null, PeriodType.yearMonthDayTime()); 
     assertEquals(PeriodType.yearMonthDayTime(), test.getPeriodType()); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(0, test.getMillis()); 
 } 


public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth11578() throws Throwable { 
     LocalDate dt1 = new LocalDate(2004, 12, 29); 
     LocalDate dt2 = new LocalDate(2005, 2, 28); 
     Period test = new Period(dt1, dt2); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 } 


public void testConstructor_RI_RD21634() throws Throwable { 
     DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     Duration dur = null; 
     Period test = new Period(dt1, dur); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(0, test.getMillis()); 
 } 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (4ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (8ints)
     */
    

    

    

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
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

}
