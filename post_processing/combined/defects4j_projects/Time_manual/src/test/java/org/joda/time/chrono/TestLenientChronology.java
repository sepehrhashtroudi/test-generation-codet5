/*
 *  Copyright 2001-2007 Stephen Colebourne
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
package org.joda.time.chrono;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;

/**
 *
 * @author Brian S O'Neill
 * @author Blair Martin
 */
public class TestLenientChronology extends TestCase {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestLenientChronology.class);
    }

    public TestLenientChronology(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------

public void testWith130() { 
     Partial test = createHourMinPartial(); 
     Partial result = test.with(DateTimeFieldType.hourOfDay(), 15); 
     check(test, 10, 20); 
     check(result, 15, 20); 
 }


public void testSerializedGJChronology34() throws Exception { 
     GJChronology test = GJChronology.getInstance(TOKYO); 
     loadAndCompare(test, "GJChronology", true); 
     inlineCompare(test, true); 
 }


public void testMinus_RP199() { 
     LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     LocalDate result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     LocalDate expected = new LocalDate(2001, 3, 26, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minus((ReadablePeriod) null); 
     assertSame(test, result); 
 }


public void testSerializedLocalDateBuddhist200() throws Exception { 
     LocalDate test = new LocalDate(BuddhistChronology.getInstanceUTC()); 
     loadAndCompare(test, "LocalDateBuddhist", false); 
     inlineCompare(test, false); 
 }


public void testParseMutableDateTime_offsetParsed201() { 
     MutableDateTime expect = null; 
     expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z")); 
     expect = new MutableDateTime(2004, 6, 9, 6, 20, 30, 0, DateTimeZone.forOffsetHours(-4)); 
     assertEquals(expect, g.withOffsetParsed().parseMutableDateTime("2004-06-09T06:20:30-04:00")); 
     expect = new MutableDateTime(2004, 6, 9, 10, 20, 30, 0, UTC); 
     assertEquals(expect, g.withZone(PARIS).withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z")); 
     expect = new MutableDateTime(2004, 6, 9, 12, 20, 30, 0, PARIS); 
     assertEquals(expect, g.withOffsetParsed().withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z")); 
 }


public void testIsSupported_DateTimeFieldType202() { 
     LocalDateTime test = new LocalDateTime(); 
     assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     try { 
         test.isSupported(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     assertEquals(


public void testPropertyEqualsHashCodeLenient203() { 
     LocalDate test1 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     LocalDate test2 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }


public void test_plusYears_negativeToPositive204() { 
     LocalDate date = new LocalDate(-3, 6, 30, GJ_CHRONOLOGY); 
     LocalDate expected = new LocalDate(2, 6, 30, GJ_CHRONOLOGY); 
     assertEquals(expected, date.plusYears(4)); 
 }


public void testMinusMinutes_int205() { 
     LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     LocalTime result = test.minusMinutes(1); 
     LocalTime expected = new LocalTime(1, 1, 3, 4, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusMinutes(0); 
     assertSame(test, result); 
 }


public void testRemainder_long206() { 
     DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     DateMidnight result = test.remainder(1L); 
     assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     assertEquals(ISO_UTC, result.getChronology()); 
     test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS); 
     result = test.remainder(1L); 
     assertEquals(TEST_TIME1_PARIS, test.getMillis()); 
     assertEquals(TEST_TIME1_LONDON, result.getMillis()); 
     assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     test = new DateMidnight(TEST_TIME1_UTC); 
     result = test.remainder((ReadablePartial) null); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(ISO_DEFAULT, result.getChronology()); 
     test = new DateMidnight(TEST_TIME1_UTC); 
     result = test.remainder((ReadableInstant) null); 
     assertSame(test, result); 
 }


public void test_centuries207() throws Exception { 
     final JulianChronology julian = JulianChronology.getInstance(); 
     assertEquals("eras", julian.eras().getName()); 
     assertEquals("centuries", julian.centuries().getName()); 
     assertEquals("years", julian.years().getName()); 
     assertEquals("weekyears", julian.weekyears().getName()); 
     assertEquals("months", julian.months().getName()); 
     assertEquals("weeks", julian.weeks().getName()); 
     assertEquals("days", julian.days().getName()); 
     assertEquals("halfdays", julian.halfdays().getName()); 
     assertEquals("hours", julian.hours().getName()); 
     assertEquals("minutes", julian.minutes().getName()); 
     assertEquals("seconds", julian.seconds().getName()); 
     assertEquals("millis", julian.millis().getName()); 
     assertEquals(false, julian.eras().isSupported()); 
     assertEquals(true, julian.centuries().isSupported()); 
     assertEquals(true, julian.years().isSupported()); 
     assertEquals(true, julian.weekyears().isSupported()); 
     assertEquals(true, julian.months().isSupported()); 
     assertEquals(true, julian.weeks().isSupported()); 
     assertEquals(true, julian.days().isSupported()); 
     assertEquals(true, julian.halfdays().isSupported()); 
     assertEquals(true, julian.hours().isSupported()); 
     assertEquals(true, julian.minutes().isSupported()); 
     assertEquals(true, julian.seconds().isSupported()); 
     assertEquals(true, julian.millis().isSupported()); 
     assertEquals(false, julian.centuries().isPrecise()); 
     assertEquals(false, julian.years().isPrecise()); 
     assertEquals(false, julian.weekyears().isPrecise()); 
     assertEquals(false, julian.months().isPrecise()); 
     assertEquals(false, julian.


public void testWithChronologyRetainFields_DateTimeZone208() { 
     DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     DateMidnight result = test.withChronologyRetainFields(PARIS); 
     assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     assertEquals(ISO_PARIS, result.getChronology()); 
     test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS); 
     result = test.withChronologyRetainFields(null); 
     assertEquals(TEST_TIME1_PARIS, test.getMillis()); 
     assertEquals(TEST_TIME1_LONDON, result.getMillis()); 
     assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     test = new DateMidnight(TEST_TIME1_UTC); 
     result = test.withChronologyRetainFields(LONDON); 
     assertSame(test, result); 
     test = new DateMidnight(TEST_TIME1_UTC); 
     result = test.withChronologyRetainFields(null); 
     assertSame(test, result); 
     test = new DateMidnight(TEST_TIME1_UTC, new MockNullZoneChronology()); 
     result = test.withChronologyRetainFields(LONDON); 
     assertSame(test, result); 
 }


public void testConstructor_RI_RP3209() throws Throwable { 
     DateTime dt = new DateTime(TEST_TIME_NOW, ISOChronology.getInstanceUTC()); 
     Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard()); 
     long result = TEST_TIME_NOW; 
     result = ISOChronology.getInstanceUTC().months().add(result, 6); 
     result = ISOChronology.getInstanceUTC().days().add(result, 3); 
     result = ISOChronology.getInstanceUTC().hours().add(result, 1); 
     MutableInterval test = new MutableInterval(dt, dur); 
     assertEquals(dt.getMillis(), test.getStartMillis()); 
     assertEquals(result, test.getEndMillis()); 
 }


public void test_centuries210() { 
     assertEquals(DurationFieldType.centuries(), DurationFieldType.centuries()); 
     assertEquals("centuries", DurationFieldType.centuries().getName()); 
     assertEquals(DurationFieldType.years(), DurationFieldType.centuries().getDurationType()); 
     assertEquals(DurationFieldType.months(), DurationFieldType.centuries().getRangeDurationType()); 
     assertEquals(DurationFieldType.weekyears(), DurationFieldType.centuries().getRangeDurationType()); 
     assertEquals(DurationFieldType.weeks(), DurationFieldType.centuries().getRangeDurationType()); 
     assertEquals(DurationFieldType.days(), DurationFieldType.centuries().getRangeDurationType()); 
     assertEquals(DurationFieldType.hours(), DurationFieldType.centuries().getRangeDurationType()); 
     assertEquals(DurationFieldType.minutes(), DurationFieldType.centuries().getRangeDurationType()); 
     assertEqualsDurationFieldType.seconds(), DurationFieldType.centuries().getRangeDurationType()); 
     assertEqualsDurationFieldType.millis(), DurationFieldType.centuries().getRangeDurationType()); 
     assertEquals(DurationFieldType.halfdays(), DurationFieldType.centuries().getRangeDurationType()); 
     assertEquals(DurationFieldType.hours(), DurationFieldType.centuries().getRangeDurationType()); 
     assertEquals(DurationFieldType.minutes(), DurationFieldType.centuries().getRangeDurationType()); 
     assertEquals(DurationFieldType.seconds(), DurationFieldType.centuries().getRangeDurationType()); 
     assertEquals(DurationFieldType.millis(), DurationFieldType.centuries().getRangeDurationType()); 
     try { 
         DurationFieldType.months().getRangeDurationValue(); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         DurationFieldType.months().getRangeDurationValue(); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void test_centuryOfEra211() { 
     assertEquals(DateTimeFieldType.centuryOfEra(), DateTimeFieldType.centuryOfEra()); 
     assertEquals("centuryOfEra", DateTimeFieldType.centuryOfEra().getName()); 
     assertEquals(DurationFieldType.centuries(), DateTimeFieldType.centuryOfEra().getDurationType()); 
     assertEquals(DurationFieldType.eras(), DateTimeFieldType.centuryOfEra().getRangeDurationType()); 
     assertEquals(CopticChronology.getInstanceUTC().centuryOfEra(), DateTimeFieldType.centuryOfEra().getField(CopticChronology.getInstanceUTC())); 
     assertEquals(CopticChronology.getInstanceUTC().centuryOfEra().isSupported(), DateTimeFieldType.centuryOfEra().isSupported(CopticChronology.getInstanceUTC())); 
     assertSerialization(DateTimeFieldType.centuryOfEra()); 
 }


public void testToStandardSeconds212() { 
     Period test = new Period(0, 0, 0, 0, 0, 0, 7, 8); 
     assertEquals(7, test.toStandardSeconds().getSeconds()); 
     test = new Period(0, 0, 0, 0, 0, 1, 3, 0); 
     assertEquals(63, test.toStandardSeconds().getSeconds()); 
     test = new Period(0, 0, 0, 0, 0, 0, 0, 1000); 
     assertEquals(1, test.toStandardSeconds().getSeconds()); 
     test = new Period(0, 0, 0, 0, 0, Integer.MAX_VALUE, 0); 
     assertEquals(Integer.MAX_VALUE, test.toStandardSeconds().getSeconds()); 
     test = new Period(0, 0, 0, 0, 0, 0, 20, Integer.MAX_VALUE); 
     long expected = 20; 
     expected += ((long) Integer.MAX_VALUE) / DateTimeConstants.MILLIS_PER_SECOND; 
     assertEquals(expected, test.toStandardSeconds().getSeconds()); 
     test = new Period(0, 0, 0, 0, 0, 0, Integer.MAX_VALUE, 1000); 
     try { 
         test.toStandardSeconds(); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 }


public void testConstructor_RI_RP3213() throws Throwable { 
     DateTime dt = new DateTime(TEST_TIME_NOW, ISOChronology.getInstanceUTC()); 
     Period dur = new Period(0, 6, 0, 3, 1, 0, 0, 0, PeriodType.standard()); 
     long result = TEST_TIME_NOW; 
     result = ISOChronology.getInstanceUTC().months().add(result, 6); 
     result = ISOChronology.getInstanceUTC().weeks().add(result, 3); 
     result = ISOChronology.getInstanceUTC().days().add(result, 1); 
     MutableInterval test = new MutableInterval(dt, dur); 
     assertEquals(dt.getMillis(), test.getStartMillis()); 
     assertEquals(result, test.getEndMillis()); 
 }


public void test_yearOfCentury214() { 
     DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.yearOfCentury(), DateTimeFieldType.monthOfYear() }; 
     int[] values = new int[] { 2005, 6 }; 
     List types = new ArrayList(Arrays.asList(fields)); 
     DateTimeFormatter f = ISODateTimeFormat.yearOfCentury().withLocale(Locale.UK); 
     assertEquals(3, types.size()); 
     assertEquals(0, types.size()); 
     types = new ArrayList(Arrays.asList(fields)); 
     f = ISODateTimeFormat.yearOfCentury().withLocale(Locale.FRENCH); 
     assertEquals(0, types.size()); 
     types = new ArrayList(Arrays.asList(fields)); 
     f = ISODateTimeFormat.yearOfCentury().withLocale(Locale.FRENCH); 
     assertEquals(0, types.size()); 
     types = new ArrayList(Arrays.asList(fields)); 
     try { 
         ISODateTimeFormat.yearOfCentury().withLocale(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     types = new ArrayList(Arrays.asList(fields)); 
     try { 
         ISODateTimeFormat.yearOfCentury().withLocale(Locale.FRENCH); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //------------------------ Bug ------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //------------------------ Bug [1755161] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    

    

    

    

    

}
