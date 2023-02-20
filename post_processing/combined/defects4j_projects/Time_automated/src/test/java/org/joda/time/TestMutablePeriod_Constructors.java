/*
 *  Copyright 2001-2005 Stephen Colebourne
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
 * This class is a JUnit test for MutableDuration.
 *
 * @author Stephen Colebourne
 */
public class TestMutablePeriod_Constructors extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
        return new TestSuite(TestMutablePeriod_Constructors.class);
    }

    public TestMutablePeriod_Constructors(String name) {
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
public void testMutablePeriod56() { 
     Period test = new Period(1, 2, 3, 4, 5, 6, 7, 8); 
     MutablePeriod result = test.toMutablePeriod(); 
     assertEquals(test, result); 
 }
public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth166() throws Throwable { 
     LocalDate dt1 = new LocalDate(2004, 12, 29); 
     LocalDate dt2 = new LocalDate(2005, 2, 28); 
     Period test = new Period(dt1, dt2); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }
public void testConstructor_RI_RI4266() throws Throwable { 
     DateTime dt1 = new DateTime(2005, 7, 17, 1, 1, 1, 1); 
     DateTime dt2 = null; 
     Period test = new Period(dt1, dt2); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(-3, test.getYears()); 
     assertEquals(-1, test.getMonths()); 
     assertEquals(-1, test.getWeeks()); 
     assertEquals(-1, test.getDays()); 
     assertEquals(-1, test.getHours()); 
     assertEquals(-1, test.getMinutes()); 
     assertEquals(-1, test.getSeconds()); 
     assertEquals(-1, test.getMillis()); 
 }
public void testSetDays267() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setDays(10); 
     assertEquals(10, test.getDays()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setDays(-10); 
     assertEquals(-10, test.getDays()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setDays(0); 
     assertEquals(0, test.getDays()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setDays(5); 
     assertEquals(5, test.getDays()); 
 }
public void testSetYears269() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setYears(10); 
     assertEquals(10, test.getYears()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setYears(-10); 
     assertEquals(-10, test.getYears()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setYears(0); 
     assertEquals(0, test.getYears()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setYears(1); 
     assertEquals(1, test.getYears()); 
     test = new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 1, PeriodType.millis()); 
     try { 
         test.setYears(1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }
public void testConstructor_long_long_Chronology2270() throws Throwable { 
     DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0, CopticChronology.getInstance()); 
     DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1, CopticChronology.getInstance()); 
     MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis(), (Chronology) null); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(1, test.getYears()); 
     assertEquals(1, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(1, test.getDays()); 
     assertEquals(1, test.getHours()); 
     assertEquals(1, test.getMinutes()); 
     assertEquals(1, test.getSeconds()); 
     assertEquals(1, test.getMillis()); 
 }
public void testSetHours271() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setHours(10); 
     assertEquals(10, test.getHours()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setHours(-10); 
     assertEquals(-10, test.getHours()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setHours(0); 
     assertEquals(0, test.getHours()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setHours(5); 
     assertEquals(5, test.getHours()); 
 }
public void testSetSeconds272() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setSeconds(10); 
     assertEquals(10, test.getSeconds()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setSeconds(-10); 
     assertEquals(-10, test.getSeconds()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setSeconds(0); 
     assertEquals(0, test.getSeconds()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setSeconds(5); 
     assertEquals(5, test.getSeconds()); 
 }
public void testSetMinutes274() { 
     MutablePeriod test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setMinutes(10); 
     assertEquals(10, test.getMinutes()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setMinutes(-10); 
     assertEquals(-10, test.getMinutes()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setMinutes(0); 
     assertEquals(0, test.getMinutes()); 
     test = new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8); 
     test.setMinutes(5); 
     assertEquals(5, test.getMinutes()); 
 }
public void testParse_noFormatter293() throws Throwable { 
     assertEquals(new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8), MutablePeriod.parse("P1Y2M3W4DT5H6M7.008S")); 
     assertEquals(new MutablePeriod(1, 2, 3, 4, 5, 6, 7, 8), MutablePeriod.parse("P1DT5H6M7.008S")); 
 }
public void testToMutablePeriod294() { 
     Period test = new Period(123L); 
     MutablePeriod result = test.toMutablePeriod(); 
     assertEquals(test, result); 
 }
public void testParse_noFormatter295() throws Throwable { 
     assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), MutablePeriod.parse("P1Y2M3W4DT5H6M7.008S")); 
     assertEquals(new Period(1, 2, 3, 4, 5, 6, 7, 8), MutablePeriod.parse("P1DT5H6M7.008S")); 
 }
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (PeriodType)
     */
    

    

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
    /**
     * Test constructor (Object)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object,PeriodType)
     */
    

    

    

    

    //-----------------------------------------------------------------------
    

    

}
