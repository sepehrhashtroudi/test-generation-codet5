/*
 *  Copyright 2001-2006 Stephen Colebourne
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

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;

/**
 * This class is a Junit unit test for DateTime Formating.
 *
 * @author Stephen Colebourne
 * @author Fredrik Borgh
 */
public class TestDateTimeFormat extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

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
        return new TestSuite(TestDateTimeFormat.class);
    }

    public TestDateTimeFormat(String name) {
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

public void testForStyle_mediumDateTime7() throws Exception { 
     DateTimeFormatter f = DateTimeFormat.mediumDateTime(); 
     DateTimeFormatter g = DateTimeFormat.forStyle("MM"); 
     assertSame(g, f); 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, UK).format(dt.toDate()); 
     assertEquals(expect, f.print(dt)); 
     expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, US).format(dt.toDate()); 
     assertEquals(expect, f.withLocale(US).print(dt)); 
     expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }


public void testFormat_weekyearOfEra_twoDigit47() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "04", f.print(dt)); 
     dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals(dt.toString(), "23", f.print(dt)); 
     f = f.withZoneUTC(); 
     DateTime expect = null; 
     expect = new DateTime(2003, 12, 29, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("04")); 
     expect = new DateTime(1922, 1, 2, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("22")); 
     expect = new DateTime(2021, 1, 4, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("21")); 
     try { 
         f.parseDateTime("-"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         f.parseDateTime("+"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     f = f.withPivotYear(new Integer(2050)); 
     expect = new DateTime(2000, 1, 3, 0, 0, 0, 0, DateTimeZone.UTC); 
     assertEquals(expect, f.parseDateTime("00")); 
     expect = new DateTime(2098, 12, 29, 0, 0, 0, 0, DateTimeZone.UTC); 
     assertEquals(expect, f.parseDateTime("99")); 
     f = new DateTimeFormatterBuilder().appendTwoDigitWeekyear(2000).toFormatter(); 
     f = f.withZoneUTC(); [EOL


public void testToString_String_Locale61() { 
     DateTime test = new DateTime(TEST_TIME_NOW); 
     assertEquals("Sun 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     assertEquals("dim. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, Locale.ENGLISH)); 
     assertEquals("Sun 9/6", test.toString("EEE d/M", null)); 
     assertEquals("2002-06-09T01:00:00.000+01:00", test.toString(null, null)); 
 }


public void testFormat_clockhourOfHalfday92() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("K").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "10", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "6", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "7", f.print(dt)); 
     dt = new DateTime(2004, 6, 9, 0, 0, 0, 0, UTC); 
     assertEquals(dt.toString(), "0", f.print(dt)); 
 }


public void testFormat_year_twoDigit275() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "04", f.print(dt)); 
     dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals(dt.toString(), "23", f.print(dt)); 
     f = f.withZoneUTC(); 
     DateTime expect = null; 
     expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("04")); 
     expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("22")); 
     expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("21")); 
     try { 
         f.parseDateTime("-"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         f.parseDateTime("+"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     f = f.withPivotYear(new Integer(2050)); 
     expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("00")); 
     expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("99")); 
     f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000).toFormatter(); 
     f = f.withZoneUTC(); 
     try { 



public void test_remainder_long276() { 
     BaseDateTimeField field = new MockPreciseDurationDateTimeField(); 
     assertEquals(0L, field.remainder(0L)); 
     assertEquals(29L, field.remainder(29L)); 
     assertEquals(30L, field.remainder(30L)); 
     assertEquals(31L, field.remainder(31L)); 
     assertEquals(0L, field.remainder(60L)); 
 }


public void testFormat_yearOfEra277() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("Y").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "2004", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "2004", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "2004", f.print(dt)); 
     dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals(dt.toString(), "124", f.print(dt)); 
 }


public void testWithZoneRetainFields_DateTimeZone278() { 
     DateTime test = new DateTime(TEST_TIME1); 
     DateTime result = test.withZoneRetainFields(PARIS); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(ISO_PARIS, result.getChronology()); 
     test = new DateTime(TEST_TIME1); 
     result = test.withZoneRetainFields(LONDON); 
     assertSame(test, result); 
     test = new DateTime(TEST_TIME1); 
     result = test.withZoneRetainFields(null); 
     assertSame(test, result); 
     test = new DateTime(TEST_TIME1, GREGORIAN_PARIS); 
     result = test.withZoneRetainFields(null); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     test = new DateTime(TEST_TIME1, new MockNullZoneChronology()); 
     result = test.withZoneRetainFields(LONDON); 
     assertSame(test, result); 
 }


public void testFormat_year_twoDigit279() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("yy").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "04", f.print(dt)); 
     dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals(dt.toString(), "23", f.print(dt)); 
     f = f.withZoneUTC(); 
     DateTime expect = null; 
     expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("04")); 
     expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("22")); 
     expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("21")); 
     try { 
         f.parseDateTime("-"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         f.parseDateTime("+"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     f = f.withPivotYear(new Integer(2050)); 
     expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("00")); 
     expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("99")); 
     f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000).toFormatter(); 
     f = f.withZoneUTC(); [EOL


public void testWithChronologyRetainFields_DateTimeZone280() { 
     DateTime test = new DateTime(TEST_TIME1); 
     DateTime result = test.withChronologyRetainFields(PARIS); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(ISO_PARIS, result.getChronology()); 
     test = new DateTime(TEST_TIME1); 
     result = test.withChronologyRetainFields(LONDON); 
     assertSame(test, result); 
     test = new DateTime(TEST_TIME1); 
     result = test.withChronologyRetainFields(null); 
     assertSame(test, result); 
     test = new DateTime(TEST_TIME1, GREGORIAN_PARIS); 
     result = test.withChronologyRetainFields(null); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     test = new DateTime(TEST_TIME1, new MockNullZoneChronology()); 
     result = test.withChronologyRetainFields(LONDON); 
     assertSame(test, result); 
 }


public void testWithChronology_Chronology281() { 
     DateTime test = new DateTime(TEST_TIME1); 
     DateTime result = test.withChronology(GREGORIAN_PARIS); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(GREGORIAN_PARIS, result.getChronology()); 
     test = new DateTime(TEST_TIME1, GREGORIAN_PARIS); 
     result = test.withChronology(null); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(ISO_DEFAULT, result.getChronology()); 
     test = new DateTime(TEST_TIME1); 
     result = test.withChronology(null); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(ISO_DEFAULT, result.getChronology()); 
     test = new DateTime(TEST_TIME1, new MockNullZoneChronology()); 
     result = test.withChronology(GREGORIAN_PARIS); 
     assertSame(test, result); 
 }


public void testFormat_shortYearOfEra_twoDigit282() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("xx").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "04", f.print(dt)); 
     dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals(dt.toString(), "23", f.print(dt)); 
     f = f.withZoneUTC(); 
     DateTime expect = null; 
     expect = new DateTime(2004, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("04")); 
     expect = new DateTime(1922, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("22")); 
     expect = new DateTime(2021, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("21")); 
     try { 
         f.parseDateTime("-"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         f.parseDateTime("+"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     f = f.withPivotYear(new Integer(2050)); 
     expect = new DateTime(2000, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("00")); 
     expect = new DateTime(2099, 1, 1, 0, 0, 0, 0, UTC); 
     assertEquals(expect, f.parseDateTime("99")); 
     f = new DateTimeFormatterBuilder().appendTwoDigitYear(2000).toFormatter(); 
     f = f.withZoneUTC(); [EOL


public void testToDateTimeToday_Zone283() { 
     TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     DateTime test = base.toDateTimeToday(TOKYO); 
     check(base, 10, 20, 30, 40); 
     DateTime expected = new DateTime(dt.getMillis(), COPTIC_TOKYO); 
     expected = expected.hourOfDay().setCopy(10); 
     expected = expected.minuteOfHour().setCopy(20); 
     expected = expected.secondOfMinute().setCopy(30); 
     expected = expected.millisOfSecond().setCopy(40); 
     assertEquals(expected, test); 
 }


public void testPropertyGetEra307() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertSame(test.getChronology().era(), test.era().getField()); 
     assertEquals("era", test.era().getName()); 
     assertEquals("Property[era]", test.era().toString()); 
     assertSame(test, test.era().getDateTime()); 
     assertEquals(1, test.era().get()); 
     assertEquals("1", test.era().getAsString()); 
     assertEquals("AD", test.era().getAsText()); 
     assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH)); 
     assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH)); 
     assertEquals("AD", test.era().getAsShortText()); 
     assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH)); 
     assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     assertEquals(null, test.era().getRangeDurationField()); 
     assertEquals(2, test.era().getMaximumTextLength(null)); 
     assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 }


public void testPropertyGetMonth308() { 
     LocalDateTime test = new LocalDateTime(1972, 6, 9, 10, 20, 30, 40); 
     assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     assertEquals("monthOfYear", test.monthOfYear().getName()); 
     assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     assertSame(test, test.monthOfYear().getLocalDateTime()); 
     assertEquals(6, test.monthOfYear().get()); 
     assertEquals("6", test.monthOfYear().getAsString()); 
     assertEquals("June", test.monthOfYear().getAsText()); 
     assertEquals("juin", test.monthOfYear().getAsText(Locale.FRENCH)); 
     assertEquals("Jun", test.monthOfYear().getAsShortText()); 
     assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     test = new LocalDateTime(1972, 7, 9, 10, 20, 30, 40); 
     assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }


public void testFormatParse_textMonthAtEnd_France_withSpecifiedDefault309() { 
     DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM").withLocale(Locale.FRANCE).withZoneUTC().withDefaultYear(1980); 
     String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     assertEquals("23 juin", str); 
     DateTime date = dateFormatter.parseDateTime(str); 
     check(date, 1980, 6, 23); 
 }


public void testPropertyGetEra310() { 
     DateTime test = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertSame(test.getChronology().era(), test.era().getField()); 
     assertEquals("era", test.era().getName()); 
     assertEquals("Property[era]", test.era().toString()); 
     assertSame(test, test.era().getDateTime()); 
     assertEquals(1, test.era().get()); 
     assertEquals("1", test.era().getAsString()); 
     assertEquals("AD", test.era().getAsText()); 
     assertEquals("AD", test.era().getField().getAsText(1, Locale.ENGLISH)); 
     assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     assertEquals("ap. J.-C.", test.era().getField().getAsText(1, Locale.FRENCH)); 
     assertEquals("AD", test.era().getAsShortText()); 
     assertEquals("AD", test.era().getField().getAsShortText(1, Locale.ENGLISH)); 
     assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     assertEquals("AD", test.era().getAsShortText(Locale.FRENCH)); 
     assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     assertEquals("ap. J.-C.", test.era().getField().getAsShortText(1, Locale.FRENCH)); 
     assertEquals("ap. J.-C.", test.


public void testPrinterParserMethods311() { 
     DateTimeFormatter f2 = new DateTimeFormatter(f.getPrinter(), f.getParser()); 
     assertEquals(f.getPrinter(), f2.getPrinter()); 
     assertEquals(f.getParser(), f2.getParser()); 
     assertEquals(f.getPrinter(), f2.getPrinter()); 
     assertEquals(f.getParser(), f2.getParser()); 
     assertEquals(true, f2.isPrinter()); 
     assertEquals(true, f2.isParser()); 
     assertNotNull(f2.print(0L)); 
     assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z")); 
     f2 = new DateTimeFormatter(f.getPrinter(), null); 
     assertEquals(f.getPrinter(), f2.getPrinter()); 
     assertEquals(null, f2.getParser()); 
     assertEquals(true, f2.isPrinter()); 
     assertEquals(false, f2.isParser()); 
     assertNotNull(f2.print(0L)); 
     try { 
         f2.parseDateTime("Thu 1970-01-01T00:00:00Z"); 
         fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     f2 = new DateTimeFormatter(null, f.getParser()); 
     assertEquals(null, f2.getPrinter()); 
     assertEquals(f.getParser(), f2.getParser()); 
     assertEquals(false, f2.isPrinter()); 
     assertEquals(true, f2.isParser()); 
     try { 
         f2.print(0L); 
         fail(); 
     } catch (UnsupportedOperationException ex) { 
     } 
     assertNotNull(f2.parseDateTime("Thu 1970-01-01T00:00:00Z")); 
 }


public void testParseInto_monthDay_feb29_tokyo_startOfYear312() { 
     DateTimeFormatter f = DateTimeFormat.forPattern("M d").withLocale(Locale.UK); 
     MutableDateTime result = new MutableDateTime(2004, 1, 1, 0, 0, 0, 0, TOKYO); 
     assertEquals(4, f.parseInto(result, "2 29", 0)); 
     assertEquals(new MutableDateTime(2004, 2, 29, 0, 0, 0, 0, TOKYO), result); 
 }


public void testPropertyGetDayOfWeek313() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField()); 
     assertEquals("dayOfWeek", test.dayOfWeek().getName()); 
     assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString()); 
     assertSame(test, test.dayOfWeek().getDateMidnight()); 
     assertEquals(3, test.dayOfWeek().get()); 
     assertEquals("Wednesday", test.dayOfWeek().getAsText()); 
     assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH)); 
     assertEquals("Wed", test.dayOfWeek().getAsShortText()); 
     assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField()); 
     assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField()); 
     assertEquals(9, test.dayOfWeek().getMaximumTextLength(null)); 
     assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH)); 
     assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null)); 
     assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH)); 
     assertEquals(1, test.dayOfWeek().getMinimumValue()); 
     assertEquals(1, test.dayOfWeek().getMinimumValueOverall()); 
     assertEquals(7, test.dayOfWeek().getMaximumValue()); 
     assertEquals(7, test.dayOfWeek().getMaximumValueOverall()); 
     assertEquals(false, test.dayOfWeek().isLeap()); 
     assertEquals(0, test.dayOfWeek().getLeapAmount()); 
     assertEquals(null, test.dayOfWeek().getLeapDurationField()); 
 }


public void testFormat_dayOfWeekText314() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("e").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "3", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "3", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "3", f.print(dt)); 
 }


public void testAddNumerals315() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.add("13", 1); 
     assertEquals("13", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.add("14", 2); 
     assertEquals("14", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.add("15", 3); 
     assertEquals("15", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.add("16", 2); 
     assertEquals("16", test.toString()); 
 }


public void testAddNumerals316() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals("2004-06-09T10:20:30.040", test.toString()); 
     test.addNumerals("12"); 
     assertEquals("2004-06-09T12:20:30.040", test.toString()); 
 }


public void testFormat_monthOfYearText317() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("MMM").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "Jun", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "Jun", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "Jun", f.print(dt)); 
     f = f.withLocale(Locale.FRENCH); 
     assertEquals(dt.toString(), "juin", f.print(dt)); 
 }


public void test_forPattern_long320() throws Exception { 
     DateTimeFormatter f = DateTimeFormat.longDate(); 
     DateTimeFormatter g = DateTimeFormat.forPattern("yyyy"); 
     assertSame(g, f); 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     String expect = DateFormat.getDateInstance(DateFormat.LONG, UK).format(dt.toDate()); 
     assertEquals(expect, f.print(dt)); 
     expect = DateFormat.getDateInstance(DateFormat.LONG, US).format(dt.toDate()); 
     assertEquals(expect, f.withLocale(US).print(dt)); 
     expect = DateFormat.getDateInstance(DateFormat.LONG, FRANCE).format(dt.toDate()); 
     assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
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
    
// Defects4J: flaky method
//     public void testFormat_zoneText() {
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
//         DateTimeFormatter f = DateTimeFormat.forPattern("z").withLocale(Locale.UK);
//         assertEquals(dt.toString(), "UTC", f.print(dt));
//         
//         dt = dt.withZone(NEWYORK);
//         assertEquals(dt.toString(), "EDT", f.print(dt));
//         
//         dt = dt.withZone(TOKYO);
//         assertEquals(dt.toString(), "JST", f.print(dt));
//     }

    
// Defects4J: flaky method
//     public void testFormat_zoneLongText() {
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC);
//         DateTimeFormatter f = DateTimeFormat.forPattern("zzzz").withLocale(Locale.UK);
//         assertEquals(dt.toString(), "Coordinated Universal Time", f.print(dt));
//         
//         dt = dt.withZone(NEWYORK);
//         assertEquals(dt.toString(), "Eastern Daylight Time", f.print(dt));
//         
//         dt = dt.withZone(TOKYO);
//         assertEquals(dt.toString(), "Japan Standard Time", f.print(dt));
//     }

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
    private void check(DateTime test, int hour, int min, int sec) {
        assertEquals(hour, test.getYear());
        assertEquals(min, test.getMonthOfYear());
        assertEquals(sec, test.getDayOfMonth());
    }

}
