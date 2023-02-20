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
package org.joda.time.chrono.gj;

import java.util.Random;

import junit.framework.TestCase;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeField;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * Tests either the Julian or Gregorian chronology from org.joda.time.chrono.gj
 * against the implementations in this package. It tests all the date fields
 * against their principal methods.
 * <p>
 * Randomly generated values are fed into the DateTimeField methods and the
 * results are compared between the two chronologies. If any result doesn't
 * match, an error report is generated and the program exits. Each time this
 * test program is run, the pseudo random number generator is seeded with the
 * same value. This ensures consistent results between test runs.
 * <p>
 * The main method accepts three optional arguments: iterations, mode, seed. By
 * default, iterations is set to 1,000,000. The test will take several minutes
 * to run, depending on the computer's performance. Every 5 seconds a progress
 * message is printed.
 * <p>
 * The mode can be either 'g' for proleptic gregorian (the default) or 'j' for
 * proleptic julian. To override the default random number generator seed, pass
 * in a third argument which accepts a long signed integer.
 *
 * @author Brian S O'Neill
 */
public class MainTest extends TestCase {
    public static final int GREGORIAN_MODE = 0;
    public static final int JULIAN_MODE = 1;

    private static final long MILLIS_PER_YEAR = (long)365.2425 * 24 * 60 * 60 * 1000;
    private static final long _1000_YEARS = 1000 * MILLIS_PER_YEAR;
    private static final long _500_YEARS = 500 * MILLIS_PER_YEAR;
    private static final long MAX_MILLIS = (10000 - 1970) * MILLIS_PER_YEAR;
    private static final long MIN_MILLIS = (-10000 - 1970) * MILLIS_PER_YEAR;

    // Show progess reports every 5 seconds.
    private static final long UPDATE_INTERVAL = 5000;

    /**
     * Arguments: iterations [mode [seed]]
     */
    public static void main(String[] args) throws Exception {
        int iterations = 1000000;
        int mode = GREGORIAN_MODE;
        long seed = 1345435247779935L;

        if (args.length > 0) {
            iterations = Integer.parseInt(args[0]);
            if (args.length > 1) {
                if (args[1].startsWith("g")) {
                    mode = GREGORIAN_MODE;
                } else if (args[1].startsWith("j")) {
                    mode = JULIAN_MODE;
                } else {
                    throw new IllegalArgumentException
                        ("Unknown mode: " + args[1]);
                }
                if (args.length > 2) {
                    seed = Long.parseLong(args[2]);
                }
            }
        }

        new MainTest(iterations, mode, seed).testChronology();
    }

    //-----------------------------------------------------------------------
    private final int iIterations;
    private final int iMode;
    private final long iSeed;
    private final Chronology iTest;
    private final Chronology iActual;

    /**
     * @param iterations number of test iterations to perform
     * @param mode GREGORIAN_MODE or JULIAN_MODE,0=Gregorian, 1=Julian
     * @param seed seed for random number generator
     */
    public MainTest(int iterations, int mode, long seed) {
        super("testChronology");
        iIterations = iterations;
        iMode = mode;
        iSeed = seed;
        if (mode == GREGORIAN_MODE) {
            iTest = new TestGregorianChronology();
            iActual = GregorianChronology.getInstanceUTC();
        } else {
            iTest = new TestJulianChronology();
            iActual = JulianChronology.getInstanceUTC();
        }
    }

    //-----------------------------------------------------------------------
    /**
     * Main junit test
     */

public void testID1() { 
     DateTimeZone tz = buildAmericaLosAngeles(); 
     assertEquals("America/Los_Angeles", tz.getID()); 
     assertEquals(false, tz.isFixed()); 
 }


public void testMonth68() { 
     aDateTime = getADate("2002-04-30T00:00:00"); 
     bDateTime = getADate("2002-05-01T00:00:00"); 
     assertEquals("MONTHM1a", -1, cMonth.compare(aDateTime, bDateTime)); 
     assertEquals("MONTHP1a", 1, cMonth.compare(bDateTime, aDateTime)); 
     aDateTime = getADate("1900-01-01T00:00:00"); 
     bDateTime = getADate("1899-12-31T00:00:00"); 
     assertEquals("MONTHM1b", -1, cMonth.compare(aDateTime, bDateTime)); 
     assertEquals("MONTHP1b", 1, cMonth.compare(bDateTime, aDateTime)); 
 }


public void test_roundCeiling_long69() { 
     LocalDate date = new LocalDate(2002, 6, 9, COPTIC_PARIS); 
     assertEquals(0L, date.roundCeiling(0L)); 
     assertEquals(60L, date.roundCeiling(29L)); 
     assertEquals(60L, date.roundCeiling(30L)); 
     assertEquals(60L, date.roundCeiling(31L)); 
     assertEquals(60L, date.roundCeiling(60L)); 
 }


public void testSampleDate70() { 
     DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, ISO_UTC).withChronology(COPTIC_UTC); 
     assertEquals(CopticChronology.AM, dt.getEra()); 
     assertEquals(18, dt.getCenturyOfEra()); 
     assertEquals(20, dt.getYearOfCentury()); 
     assertEquals(1720, dt.getYearOfEra()); 
     assertEquals(1720, dt.getYear()); 
     Property fld = dt.year(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     assertEquals(new DateTime(1721, 10, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(1)); 
     assertEquals(10, dt.getMonthOfYear()); 
     fld = dt.monthOfYear(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(13, fld.getMaximumValue()); 
     assertEquals(13, fld.getMaximumValueOverall()); 
     assertEquals(new DateTime(1721, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addToCopy(4)); 
     assertEquals(new DateTime(1720, 1, 2, 0, 0, 0, 0, COPTIC_UTC), fld.addWrapFieldToCopy(4)); 
     assertEquals(2, dt.getDayOfMonth()); 
     fld = dt.dayOfMonth(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals


public void testPlusYears_int71() { 
     DateTime test = new DateTime(2002, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     DateTime result = test.plusYears(1); 
     DateTime expected = new DateTime(2003, 5, 3, 1, 2, 3, 4, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.plusYears(0); 
     assertSame(test, result); 
 }


public void testCutoverAddWeeks72() { 
     testAdd("1582-01-01", DurationFieldType.weeks(), 1, "1582-01-08"); 
     testAdd("1583-01-01", DurationFieldType.weeks(), 1, "1583-01-08"); 
     testAdd("1582-10-01", DurationFieldType.weeks(), 2, "1582-10-25"); 
     testAdd("1582-W01-1", DurationFieldType.weeks(), 51, "1583-W01-1"); 
 }


public void testPropertyLeapMonth73() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertEquals(true, test.monthOfYear().isLeap()); 
     assertEquals(1, test.monthOfYear().getLeapAmount()); 
     assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     test = new DateTime(2004, 2, 9, 0, 0, 0, 0); 
     assertEquals(false, test.monthOfYear().isLeap()); 
     assertEquals(0, test.monthOfYear().getLeapAmount()); 
     assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     test = new DateTime(2003, 6, 9, 0, 0, 0, 0); 
     assertEquals(false, test.monthOfYear().isLeap()); 
     assertEquals(0, test.monthOfYear().getLeapAmount()); 
     assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     test = new DateTime(2003, 2, 9, 0, 0, 0, 0); 
     assertEquals(false, test.monthOfYear().isLeap()); 
     assertEquals(0, test.monthOfYear().getLeapAmount()); 
     assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
 }


public void testConstructor_long_long174() throws Throwable { 
     DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     MutablePeriod test = new MutablePeriod(dt1.getMillis(), dt2.getMillis()); 
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


public void testPropertyAddWrapFieldYear75() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime copy = test.year().addWrapFieldToCopy(9); 
     assertEquals("2004-06-09T00:00:00.000+01:00", test.toString()); 
     assertEquals("2013-06-09T00:00:00.000+01:00", copy.toString()); 
     copy = test.year().addWrapFieldToCopy(0); 
     assertEquals(2004, copy.getYear()); 
     copy = test.year().addWrapFieldToCopy(292278993 - 2004 + 1); 
     assertEquals(-292275054, copy.getYear()); 
     copy = test.year().addWrapFieldToCopy(-292275054 - 2004 - 1); 
     assertEquals(292278993, copy.getYear()); 
 }


public void testFormat_weekDateTime76() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004-W24-3T10:20:30.040Z", ISODateTimeFormat.weekDateTime().print(dt)); 
     dt = dt.withZone(LONDON); 
     assertEquals("2004-W24-3T11:20:30.040+01:00", ISODateTimeFormat.weekDateTime().print(dt)); 
     dt = dt.withZone(PARIS); 
     assertEquals("2004-W24-3T12:20:30.040+02:00", ISODateTimeFormat.weekDateTime().print(dt)); 
 }


public void testDurationMonth77() { 
     DateTime dt11 = new DateTime(1999, 11, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     DateTime dt12 = new DateTime(1999, 12, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     DateTime dt13 = new DateTime(1999, 13, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     DateTime dt01 = new DateTime(2000, 1, 2, 0, 0, 0, 0, ETHIOPIC_UTC); 
     DurationField fld = dt11.monthOfYear().getDurationField(); 
     assertEquals(ETHIOPIC_UTC.months(), fld); 
     assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1, dt11.getMillis())); 
     assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2, dt11.getMillis())); 
     assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(3, dt11.getMillis())); 
     assertEquals((3L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(4, dt11.getMillis())); 
     assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1)); 
     assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2)); 
     assertEquals(13L * 30L * MILLIS_PER_DAY, fld.getMillis(13)); 
     assertEquals(1L * 30L * MILLIS_PER_DAY, fld.getMillis(1L, dt11.getMillis())); 
     assertEquals(2L * 30L * MILLIS_PER_DAY, fld.getMillis(2L, dt11.getMillis())); 
     assertEquals((2L * 30L + 6L) * MILLIS_PER_DAY, fld.getMillis(


public void testPropertyAddMonth78() { 
     YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     YearMonthDay copy = test.monthOfYear().addToCopy(6); 
     check(test, 1972, 6, 9); 
     check(copy, 1972, 12, 9); 
     copy = test.monthOfYear().addToCopy(7); 
     check(copy, 1973, 1, 9); 
     copy = test.monthOfYear().addToCopy(-5); 
     check(copy, 1972, 1, 9); 
     copy = test.monthOfYear().addToCopy(-6); 
     check(copy, 1971, 12, 9); 
     test = new YearMonthDay(1972, 1, 31); 
     copy = test.monthOfYear().addToCopy(1); 
     check(copy, 1972, 2, 29); 
     copy = test.monthOfYear().addToCopy(2); 
     check(copy, 1972, 3, 31); 
     copy = test.monthOfYear().addToCopy(3); 
     check(copy, 1972, 4, 30); 
     test = new YearMonthDay(1971, 1, 31); 
     copy = test.monthOfYear().addToCopy(1); 
     check(copy, 1971, 2, 28); 
 }


public void testPropertyLeapYear79() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertEquals(true, test.year().isLeap()); 
     assertEquals(1, test.year().getLeapAmount()); 
     assertEquals(test.getChronology().days(), test.year().getLeapDurationField()); 
     test = new DateTime(2003, 6, 9, 0, 0, 0, 0); 
     assertEquals(false, test.year().isLeap()); 
     assertEquals(0, test.year().getLeapAmount()); 
     assertEquals(test.getChronology().days(), test.year().getLeapDurationField()); 
 }


public void testPropertyLeapMonthOfYear80() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertEquals(true, test.monthOfYear().isLeap()); 
     assertEquals(1, test.monthOfYear().getLeapAmount()); 
     assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     test = new MutableDateTime(2004, 2, 9, 0, 0, 0, 0); 
     assertEquals(false, test.monthOfYear().isLeap()); 
     assertEquals(0, test.monthOfYear().getLeapAmount()); 
     assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     test = new MutableDateTime(2003, 6, 9, 0, 0, 0, 0); 
     assertEquals(false, test.monthOfYear().isLeap()); 
     assertEquals(0, test.monthOfYear().getLeapAmount()); 
     assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
     test = new MutableDateTime(2003, 2, 9, 0, 0, 0, 0); 
     assertEquals(false, test.monthOfYear().isLeap()); 
     assertEquals(0, test.monthOfYear().getLeapAmount()); 
     assertEquals(test.getChronology().days(), test.monthOfYear().getLeapDurationField()); 
 }


public void testCutoverAddYears81() { 
     testAdd("1582-01-01", DurationFieldType.years(), 1, "1583-01-01"); 
     testAdd("1582-02-15", DurationFieldType.years(), 1, "1583-02-15"); 
     testAdd("1582-02-28", DurationFieldType.years(), 1, "1583-02-28"); 
     testAdd("1582-03-01", DurationFieldType.years(), 1, "1583-03-01"); 
     testAdd("1582-09-30", DurationFieldType.years(), 1, "1583-09-30"); 
     testAdd("1582-10-01", DurationFieldType.years(), 1, "1583-10-01"); 
     testAdd("1582-10-04", DurationFieldType.years(), 1, "1583-10-04"); 
     testAdd("1582-10-15", DurationFieldType.years(), 1, "1583-10-15"); 
     testAdd("1582-10-16", DurationFieldType.years(), 1, "1583-10-16"); 
     testAdd("1580-01-01", DurationFieldType.years(), 4, "1584-01-01"); 
     testAdd("1580-02-29", DurationFieldType.years(), 4, "1584-02-29"); 
     testAdd("1580-10-01", DurationFieldType.years(), 4, "1584-10-01"); 
     testAdd("1580-10-10", DurationFieldType.years(), 4, "1584-10-10"); 
     testAdd("1580-10-15", DurationFieldType.years(), 4, "1584-10-15"); 
     testAdd("1580-12-31", DurationFieldType.years(), 4, "1584-12-31"); 
 }


public void testPropertyAddWrapFieldToCopyMilli82() { 
     LocalDateTime test = new LocalDateTime(2005, 6, 9, 10, 20, 30, 40); 
     LocalDateTime copy = test.millisOfSecond().addWrapFieldToCopy(9); 
     check(test, 2005, 6, 9, 10, 20, 30, 40); 
     check(copy, 2005, 6, 9, 10, 20, 30, 49); 
     copy = test.millisOfSecond().addWrapFieldToCopy(995); 
     check(copy, 2005, 6, 9, 10, 20, 30, 35); 
     copy = test.millisOfSecond().addWrapFieldToCopy(-47); 
     check(copy, 2005, 6, 9, 10, 20, 30, 993); 
 }

    

    //-----------------------------------------------------------------------
    private void testFields(long millis, int value, long millis2) {
        testField(iTest.year(), iActual.year(), millis, value, millis2);
        testField(iTest.monthOfYear(), iActual.monthOfYear(), millis, value, millis2);
        testField(iTest.dayOfMonth(), iActual.dayOfMonth(), millis, value, millis2);
        testField(iTest.weekyear(), iActual.weekyear(), millis, value, millis2);
        testField(iTest.weekOfWeekyear(),
                  iActual.weekOfWeekyear(), millis, value, millis2);
        testField(iTest.dayOfWeek(), iActual.dayOfWeek(), millis, value, millis2);
        testField(iTest.dayOfYear(), iActual.dayOfYear(), millis, value, millis2);
    }

    private void testField(DateTimeField fieldA, DateTimeField fieldB, long millis,
                           int value, long millis2)
    {
        int a, b;
        long x, y;
        boolean m, n;

        // get test
        a = fieldA.get(millis);
        b = fieldB.get(millis);
        testValue(fieldA, fieldB, "get", millis, a, b);

        // getMaximumValue test
        // Restrict this test to the fields that matter.
        Class fieldClass = fieldA.getClass();
        if (fieldClass == TestGJDayOfYearField.class ||
            fieldClass == TestGJDayOfMonthField.class ||
            fieldClass == TestGJWeekOfWeekyearField.class) {
            
            a = fieldA.getMaximumValue(millis);
            b = fieldB.getMaximumValue(millis);
            testValue(fieldA, fieldB, "getMaximumValue", millis, a, b);
        }

        // set test
        a = getWrappedValue
            (value, fieldA.getMinimumValue(millis), fieldA.getMaximumValue(millis));
        b = getWrappedValue
            (value, fieldB.getMinimumValue(millis), fieldB.getMaximumValue(millis));
        if (iMode == JULIAN_MODE && a == 0
            && (fieldA.getName().equals("year") || fieldA.getName().equals("weekyear"))) {
            // Exclude setting Julian year of zero.
        } else {
            x = fieldA.set(millis, a);
            y = fieldB.set(millis, b);
            testMillis(fieldA, fieldB, "set", millis, x, y, a, b);
        }

        // roundFloor test
        x = fieldA.roundFloor(millis);
        y = fieldB.roundFloor(millis);
        testMillis(fieldA, fieldB, "roundFloor", millis, x, y);

        // roundCeiling test
        x = fieldA.roundCeiling(millis);
        y = fieldB.roundCeiling(millis);
        testMillis(fieldA, fieldB, "roundCeiling", millis, x, y);

        // roundHalfFloor test
        x = fieldA.roundHalfFloor(millis);
        y = fieldB.roundHalfFloor(millis);
        testMillis(fieldA, fieldB, "roundHalfFloor", millis, x, y);

        // roundHalfEven test
        x = fieldA.roundHalfEven(millis);
        y = fieldB.roundHalfEven(millis);
        testMillis(fieldA, fieldB, "roundHalfEven", millis, x, y);

        // remainder test
        x = fieldA.remainder(millis);
        y = fieldB.remainder(millis);
        testMillis(fieldA, fieldB, "remainder", millis, x, y);

        // add test
        x = fieldA.add(millis, value);
        y = fieldB.add(millis, value);
        testMillis(fieldA, fieldB, "add", millis, x, y);

        // addWrapField test
        x = fieldA.addWrapField(millis, value);
        y = fieldB.addWrapField(millis, value);
        testMillis(fieldA, fieldB, "addWrapField", millis, x, y);

        // getDifference test
        x = fieldA.getDifference(millis, millis2);
        y = fieldB.getDifference(millis, millis2);
        try {
            testValue(fieldA, fieldB, "getDifference", millis, x, y);
        } catch (RuntimeException e) {
            System.out.println("Test datetime 2: " + makeDatetime(millis2));
            throw e;
        }

        // isLeap test
        m = fieldA.isLeap(millis);
        n = fieldB.isLeap(millis);
        testBoolean(fieldA, fieldB, "isLeap", millis, m, n);

        // getLeapAmount test
        a = fieldA.getLeapAmount(millis);
        b = fieldB.getLeapAmount(millis);
        testValue(fieldA, fieldB, "getLeapAmount", millis, a, b);
    }

    private int getWrappedValue(int value, int minValue, int maxValue) {
        if (minValue >= maxValue) {
            throw new IllegalArgumentException("MIN > MAX");
        }

        int wrapRange = maxValue - minValue + 1;
        value -= minValue;

        if (value >= 0) {
            return (value % wrapRange) + minValue;
        }

        int remByRange = (-value) % wrapRange;

        if (remByRange == 0) {
            return 0 + minValue;
        }
        return (wrapRange - remByRange) + minValue;
    }

    private void testValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {
        if (valueA != valueB) {
            failValue(fieldA, fieldB, method, millis, valueA, valueB);
        }
    }

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {
        if (millisA != millisB) {
            failMillis(fieldA, fieldB, method, millis, millisA, millisB);
        }
    }

    private void testMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {
        if (millisA != millisB) {
            failMillis(fieldA, fieldB, method, millis, millisA, millisB, valueA, valueB);
        }
    }

    private void testBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {
        if (boolA != boolB) {
            failBoolean(fieldA, fieldB, method, millis, boolA, boolB);
        }
    }

    private void failValue(DateTimeField fieldA, DateTimeField fieldB,
                           String method, long millis, long valueA, long valueB) {
        System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        System.out.println("Datetime: " + makeDatetime(millis));
        System.out.println("Millis from 1970: " + millis);
        System.out.println(valueA + " != " + valueB);
        throw new RuntimeException();
    }

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB) {
        System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        System.out.println("Datetime: " + makeDatetime(millis));
        System.out.println("Millis from 1970: " + millis);
        System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        System.out.println(millisA + " != " + millisB);
        System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        throw new RuntimeException();
    }

    private void failMillis(DateTimeField fieldA, DateTimeField fieldB,
                            String method, long millis, long millisA, long millisB,
                            int valueA, int valueB) {
        System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        System.out.println("Datetime: " + makeDatetime(millis));
        System.out.println("Millis from 1970: " + millis);
        System.out.println(makeDatetime(millisA) + " != " + makeDatetime(millisB));
        System.out.println(millisA + " != " + millisB);
        System.out.println("Original value as reported by first field: " +
                           fieldA.get(millis));
        System.out.println("Original value as reported by second field: " +
                           fieldB.get(millis));
        System.out.println("First new value as reported by first field: " +
                           fieldA.get(millisA));
        System.out.println("First new value as reported by second field: " +
                           fieldB.get(millisA));
        System.out.println("Second new value as reported by first field: " +
                           fieldA.get(millisB));
        System.out.println("Second new value as reported by second field: " +
                           fieldB.get(millisB));
        System.out.println("Value to set for first field: " + valueA);
        System.out.println("Value to set for second field: " + valueB);
        throw new RuntimeException();
    }

    private void failBoolean(DateTimeField fieldA, DateTimeField fieldB,
                             String method, long millis, boolean boolA, boolean boolB) {
        System.out.println("Failure on " + makeName(fieldA, fieldB) + "." + method);
        System.out.println(fieldA.getClass().getName() + "\n\tvs. "
                           + fieldB.getClass().getName());
        System.out.println("Datetime: " + makeDatetime(millis));
        System.out.println("Millis from 1970: " + millis);
        System.out.println(boolA + " != " + boolB);
        throw new RuntimeException();
    }

    private String makeName(DateTimeField fieldA, DateTimeField fieldB) {
        if (fieldA.getName().equals(fieldB.getName())) {
            return fieldA.getName();
        } else {
            return fieldA.getName() + "/" + fieldB.getName();
        }
    }

    private String makeDatetime(long millis) {
        return makeDatetime(millis, iActual);
    }

    private String makeDatetime(long millis, Chronology chrono) {
        return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString() + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }

    private String makeDate(long millis) {
        return makeDate(millis, iActual);
    }

    private String makeDate(long millis, Chronology chrono) {
        return chrono.dayOfWeek().getAsShortText(millis) + " "
            + new DateTime(millis, chrono).toString("yyyy-MM-dd") + " / " +
            chrono.weekyear().get(millis) + "-W" + chrono.weekOfWeekyear().get(millis) +
            "-" + chrono.dayOfWeek().get(millis);
    }

    //-----------------------------------------------------------------------
    private static long randomMillis(Random rnd) {
        long millis = rnd.nextLong();
        if (millis >= 0) {
            millis = millis % MAX_MILLIS;
        } else {
            millis = millis % -MIN_MILLIS;
        }
        return millis;
    }

    private static void dump(Chronology chrono, long millis) {
        System.out.println("year:           " + chrono.year().get(millis));
        System.out.println("monthOfYear:    " + chrono.monthOfYear().get(millis));
        System.out.println("dayOfMonth:     " + chrono.dayOfMonth().get(millis));
        System.out.println("weekyear:       " + chrono.weekyear().get(millis));
        System.out.println("weekOfWeekyear: " + chrono.weekOfWeekyear().get(millis));
        System.out.println("dayOfWeek:      " + chrono.dayOfWeek().get(millis));
        System.out.println("dayOfYear:      " + chrono.dayOfYear().get(millis));
    }

}
