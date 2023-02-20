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
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 * This class is a Junit unit test for PeriodFormat.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormatParsing extends TestCase {

    private static final Period PERIOD = new Period(1, 2, 3, 4, 5, 6, 7, 8);
    private static final Period EMPTY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0);
    private static final Period YEAR_DAY_PERIOD = new Period(1, 0, 0, 4, 5, 6, 7, 8, PeriodType.yearDayTime());
    private static final Period EMPTY_YEAR_DAY_PERIOD = new Period(0, 0, 0, 0, 0, 0, 0, 0, PeriodType.yearDayTime());
    private static final Period TIME_PERIOD = new Period(0, 0, 0, 0, 5, 6, 7, 8);
    private static final Period DATE_PERIOD = new Period(1, 2, 3, 4, 0, 0, 0, 0);

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    // 2002-06-09
    private long TEST_TIME_NOW = (y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestPeriodFormatParsing.class);
    }

    public TestPeriodFormatParsing(String name) {
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

public void testToPeriod40() { 
     Period test = new Period(123L); 
     Period result = test.toPeriod(); 
     assertSame(test, result); 
 }


public void testSetPeriod_RP3256() { 
     MutablePeriod test = new MutablePeriod(100L, PeriodType.millis()); 
     test.setPeriod(new MutablePeriod(0, 0, 0, 0, 0, 0, 0, 18)); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(18, test.getMillis()); 
 }


public void testConstructor_4int1257() throws Throwable { 
     Period test = new Period(5, 6, 7, 8); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(5, test.getHours()); 
     assertEquals(6, test.getMinutes()); 
     assertEquals(7, test.getSeconds()); 
     assertEquals(8, test.getMillis()); 
 }


public void testConstructor_Object_PeriodType_Chronology4258() throws Throwable { 
     long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     Long base = new Long(length); 
     Period test = new Period(base, (PeriodType) null, (Chronology) null); 
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


public void testToString259() { 
     long length = (365L + 2L * 30L + 3L * 7L + 4L) * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 845L; 
     Duration test = new Duration(length); 
     assertEquals("PT" + (length / 1000) + "." + (length % 1000) + "S", test.toString()); 
     assertEquals("PT0S", new Duration(0L).toString()); 
     assertEquals("PT10S", new Duration(10000L).toString()); 
     assertEquals("PT1S", new Duration(1000L).toString()); 
     assertEquals("PT12.345S", new Duration(12345L).toString()); 
     assertEquals("PT-12.345S", new Duration(-12345L).toString()); 
     assertEquals("PT-1.123S", new Duration(-1123L).toString()); 
     assertEquals("PT-0.123S", new Duration(-123L).toString()); 
     assertEquals("PT-0.012S", new Duration(-12L).toString()); 
     assertEquals("PT-0.001S", new Duration(-1L).toString()); 
 }


public void testConstructor_Object3260() throws Throwable { 
     Period test = new Period((Object) null); 
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


public void testConstructor_Object_PeriodType2261() throws Throwable { 
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


public void testConstructor_Object_PeriodType_Chronology4262() throws Throwable { 
     long length = 4 * DateTimeConstants.MILLIS_PER_DAY + 5 * DateTimeConstants.MILLIS_PER_HOUR + 6 * DateTimeConstants.MILLIS_PER_MINUTE + 7 * DateTimeConstants.MILLIS_PER_SECOND + 8; 
     Duration test = new Duration(length); 
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

    
// Defects4J: flaky method
//     public void testParseStandard1() {
//         PeriodFormatter parser = PeriodFormat.getDefault();
//         Period p = parser.parsePeriod("6 years, 3 months and 2 days");
//         assertEquals(new Period(6, 3, 0, 2, 0, 0, 0, 0), p);
//     }

    

}
