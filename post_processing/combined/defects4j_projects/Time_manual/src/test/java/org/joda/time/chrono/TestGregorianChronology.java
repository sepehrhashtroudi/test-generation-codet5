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
package org.joda.time.chrono;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for GregorianChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGregorianChronology extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
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
        return new TestSuite(TestGregorianChronology.class);
    }

    public TestGregorianChronology(String name) {
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

public void testFactory_Zone_int15() { 
     GregorianChronology chrono = GregorianChronology.getInstance(TOKYO, 2); 
     assertEquals(TOKYO, chrono.getZone()); 
     assertEquals(2, chrono.getMinimumDaysInFirstWeek()); 
     try { 
         GregorianChronology.getInstance(TOKYO, 0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         GregorianChronology.getInstance(TOKYO, 8); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void testWithZoneRetainFields_DateTimeZone117() { 
     DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     DateMidnight result = test.withZoneRetainFields(PARIS); 
     assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     assertEquals(ISO_PARIS, result.getChronology()); 
     test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS); 
     result = test.withZoneRetainFields(null); 
     assertEquals(TEST_TIME1_PARIS, test.getMillis()); 
     assertEquals(TEST_TIME1_LONDON, result.getMillis()); 
     assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     test = new DateMidnight(TEST_TIME1_UTC); 
     result = test.withZoneRetainFields(LONDON); 
     assertSame(test, result); 
     test = new DateMidnight(TEST_TIME1_UTC); 
     result = test.withZoneRetainFields(null); 
     assertSame(test, result); 
     test = new DateMidnight(TEST_TIME1_UTC, new MockNullZoneChronology()); 
     result = test.withZoneRetainFields(LONDON); 
     assertSame(test, result); 
 }


public void testSerializedGregorianChronology118() throws Exception { 
     GregorianChronology test = GregorianChronology.getInstance(PARIS); 
     loadAndCompare(test, "GregorianChronology", true); 
     inlineCompare(test, true); 
 }


public void testPropertyAddDayOfMonth119() { 
     MonthDay test = new MonthDay(4, 6); 
     MonthDay copy = test.dayOfMonth().addToCopy(6); 
     check(test, 4, 6); 
     check(copy, 4, 10); 
     copy = test.dayOfMonth().addToCopy(7); 
     check(copy, 4, 13); 
     copy = test.dayOfMonth().addToCopy(-5); 
     check(copy, 4, 1); 
     copy = test.dayOfMonth().addToCopy(-6); 
     check(copy, 3, 31); 
 }


public void testParseInto_monthDay_feb29_tokyo120() { 
     DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK); 
     MutableDateTime result = new MutableDateTime(2004, 1, 9, 12, 20, 30, 0, TOKYO); 
     assertEquals(4, f.parseInto(result, "2 29", 0)); 
     assertEquals(new MutableDateTime(2004, 2, 29, 12, 20, 30, 0, TOKYO), result); 
 }


public void testWithers121() { 
     MonthDay test = new MonthDay(10, 6); 
     check(test.withMonthOfYear(5), 5, 6); 
     check(test.withDayOfMonth(2), 10, 2); 
     try { 
         test.withMonthOfYear(0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.withMonthOfYear(13); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void testPropertyEqualsHashCodeLenient122() { 
     DateTime test1 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS)); 
     DateTime test2 = new DateTime(1970, 6, 9, 0, 0, 0, 0, LenientChronology.getInstance(COPTIC_PARIS)); 
     assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }


public void testMinusWeeks_int123() { 
     DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     DateMidnight result = test.minusWeeks(1); 
     DateMidnight expected = new DateMidnight(2002, 4, 26, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.minusWeeks(0); 
     assertSame(test, result); 
 }


public void testSerialization124() throws Exception { 
     LocalDate test = new LocalDate(1972, 6, 9, COPTIC_PARIS); 
     ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     ObjectOutputStream oos = new ObjectOutputStream(baos); 
     oos.writeObject(test); 
     byte[] bytes = baos.toByteArray(); 
     oos.close(); 
     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     ObjectInputStream ois = new ObjectInputStream(bais); 
     LocalDate result = (LocalDate) ois.readObject(); 
     ois.close(); 
     assertEquals(test, result); 
     assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     assertEquals(test.getChronology(), result.getChronology()); 
 }


public void testPropertyEqualsHashCodeStrict125() { 
     YearMonth test1 = new YearMonth(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     YearMonth test2 = new YearMonth(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }


public void testBasicComps3126() { 
     Date aDateTime = new Date(System.currentTimeMillis()); 
     Date bDateTime = new Date(aDateTime.getTime()); 
     assertEquals("MILLIS", 0, cMillis.compare(aDateTime, bDateTime)); 
     assertEquals("SECOND", 0, cSecond.compare(aDateTime, bDateTime)); 
     assertEquals("MINUTE", 0, cMinute.compare(aDateTime, bDateTime)); 
     assertEquals("HOUR", 0, cHour.compare(aDateTime, bDateTime)); 
     assertEquals("DOW", 0, cDayOfWeek.compare(aDateTime, bDateTime)); 
     assertEquals("DOM", 0, cDayOfMonth.compare(aDateTime, bDateTime)); 
     assertEquals("DOY", 0, cDayOfYear.compare(aDateTime, bDateTime)); 
     assertEquals("WOW", 0, cWeekOfWeekyear.compare(aDateTime, bDateTime)); 
     assertEquals("WY", 0, cWeekyear.compare(aDateTime, bDateTime)); 
     assertEquals("MONTH", 0, cMonth.compare(aDateTime, bDateTime)); 
     assertEquals("YEAR", 0, cYear.compare(aDateTime, bDateTime)); 
     assertEquals("DATE", 0, cDate.compare(aDateTime, bDateTime)); 
     assertEquals("TIME", 0, cTime.compare(aDateTime, bDateTime)); 
 }


public void testForFields_datetime_YH127() { 
     DateTimeFieldType[] fields = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.hourOfDay() }; 
     int[] values = new int[] { 2005, 12 }; 
     List types = new ArrayList(Arrays.asList(fields)); 
     DateTimeFormatter f = ISODateTimeFormat.forFields(types, true, false); 
     assertEquals("2005T12", f.print(new Partial(fields, values))); 
     assertEquals(0, types.size()); 
     types = new ArrayList(Arrays.asList(fields)); 
     f = ISODateTimeFormat.forFields(types, false, false); 
     assertEquals("2005T12", f.print(new Partial(fields, values))); 
     assertEquals(0, types.size()); 
     types = new ArrayList(Arrays.asList(fields)); 
     try { 
         ISODateTimeFormat.forFields(types, true, true); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     types = new ArrayList(Arrays.asList(fields)); 
     try { 
         ISODateTimeFormat.forFields(types, false, true); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void testEquality128() { 
     assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO)); 
     assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(LONDON)); 
     assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(PARIS)); 
     assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC()); 
     assertSame(GregorianChronology.getInstance(), GregorianChronology.getInstance(LONDON)); 
 }


public void testPropertyGetMonth129() { 
     YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     assertEquals("monthOfYear", test.monthOfYear().getName()); 
     assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     assertSame(test, test.monthOfYear().getLocalDateTime()); 
     assertEquals(6, test.monthOfYear().get()); 
     assertEquals("6", test.monthOfYear().getAsString()); 
     assertEquals("June", test.monthOfYear().getAsText()); 
     assertEquals("June", test.monthOfYear().getField().getAsText(6, Locale.ENGLISH)); 
     assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     assertEquals("juin", test.monthOfYear().getField().getAsText(6, Locale.FRENCH)); 
     assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     assertEquals("Jun", test.monthOfYear().getField().getAsShortText(6, Locale.ENGLISH)); 
     assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     assertEquals("juin", test.monthOfYear().getField().getAsShortText(6, Locale.FRENCH)); 
     assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     test = new YearMonthDay(1972, 7, 9); 
     assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     assertEquals("ju


public void testPropertyEqualsHashCodeStrict130() { 
     Partial test1 = new Partial(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     Partial test2 = new Partial(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }


public void testSetMonthOfYear_int_dstOverlapSummer_addZero131() { 
     MutableDateTime test = new MutableDateTime(2011, 10, 30, 2, 30, 0, 0, DateTimeZone.forID("Europe/Berlin")); 
     assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
     test.setMonthOfYear(10); 
     assertEquals("2011-10-30T02:30:00.000+02:00", test.toString()); 
 }

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

}
