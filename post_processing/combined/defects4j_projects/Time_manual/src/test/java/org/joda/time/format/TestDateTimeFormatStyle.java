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

import java.text.DateFormat;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for DateTimeFormat styles.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeFormatStyle extends TestCase {

    private static final Locale UK = Locale.UK;
    private static final Locale US = Locale.US;
    private static final Locale FRANCE = Locale.FRANCE;
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
        return new TestSuite(TestDateTimeFormatStyle.class);
    }

    public TestDateTimeFormatStyle(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(UK);
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

public void test_appendFixedDecimal67() { 
     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); 
     bld.appendFixedDecimal(DateTimeFieldType.year(), 4); 
     DateTimeFormatter f = bld.toFormatter(); 
     assertEquals("2007", f.print(new DateTime("2007-01-01"))); 
     assertEquals("0123", f.print(new DateTime("123-01-01"))); 
     assertEquals("0001", f.print(new DateTime("1-2-3"))); 
     assertEquals("99999", f.print(new DateTime("99999-2-3"))); 
     assertEquals("-0099", f.print(new DateTime("-99-2-3"))); 
     assertEquals("0000", f.print(new DateTime("0-2-3"))); 
     assertEquals(2001, f.parseDateTime("2001").getYear()); 
     try { 
         f.parseDateTime("-2001"); 
         fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     try { 
         f.parseDateTime("200"); 
         fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     try { 
         f.parseDateTime("20016"); 
         fail(); 
     } catch (IllegalArgumentException e) { 
     } 
     bld = new DateTimeFormatterBuilder(); 
     bld.appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2); 
     bld.appendLiteral(':'); 
     bld.appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2); 
     bld.appendLiteral(':'); 
     bld.appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2); 
     f = bld.toFormatter(); 
     assertEquals("01:02:34", f.print(new DateTime("T1:2:34"))); 
     DateTime dt = f.parseDateTime("01:02:34"); [


public void testForStyle_mediumTime322() throws Exception { 
     DateTimeFormatter f = DateTimeFormat.mediumTime(); 
     DateTimeFormatter g = DateTimeFormat.forStyle("-M"); 
     assertSame(g, f); 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     String expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, UK).format(dt.toDate()); 
     assertEquals(expect, f.print(dt)); 
     expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, US).format(dt.toDate()); 
     assertEquals(expect, f.withLocale(US).print(dt)); 
     expect = DateFormat.getTimeInstance(DateFormat.MEDIUM, FRANCE).format(dt.toDate()); 
     assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }


public void testDurationFields323() { 
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
     assertEquals(false, julian.weeks().is


public void testForStyle_longDate324() throws Exception { 
     DateTimeFormatter f = DateTimeFormat.longDate(); 
     DateTimeFormatter g = DateTimeFormat.forStyle("L-"); 
     assertSame(g, f); 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     String expect = DateFormat.getDateInstance(DateFormat.LONG, UK).format(dt.toDate()); 
     assertEquals(expect, f.print(dt)); 
     expect = DateFormat.getDateInstance(DateFormat.LONG, US).format(dt.toDate()); 
     assertEquals(expect, f.withLocale(US).print(dt)); 
     expect = DateFormat.getDateInstance(DateFormat.LONG, FRANCE).format(dt.toDate()); 
     assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }


public void testFormat_hourOfHalfday325() { 
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


public void testGet_DateTimeFieldType326() { 
     DateMidnight test = new DateMidnight(); 
     assertEquals(1, test.get(DateTimeFieldType.era())); 
     assertEquals(20, test.get(DateTimeFieldType.centuryOfEra())); 
     assertEquals(2, test.get(DateTimeFieldType.yearOfCentury())); 
     assertEquals(2002, test.get(DateTimeFieldType.yearOfEra())); 
     assertEquals(2002, test.get(DateTimeFieldType.year())); 
     assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     assertEquals(2002, test.get(DateTimeFieldType.weekyear())); 
     assertEquals(23, test.get(DateTimeFieldType.weekOfWeekyear())); 
     assertEquals(7, test.get(DateTimeFieldType.dayOfWeek())); 
     assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     assertEquals(0, test.get(DateTimeFieldType.halfdayOfDay())); 
     assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     assertEquals(0, test.get(DateTimeFieldType.hourOfDay())); 
     assertEquals(0, test.get(DateTimeFieldType.minuteOfHour())); 
     assertEquals(0, test.get(DateTimeFieldType.minuteOfDay())); 
     assertEquals(0, test.get(DateTimeFieldType.secondOfMinute())); 
     assertEquals(0, test.get(DateTimeFieldType.secondOfDay())); 
     assertEquals(0, test.get(DateTimeFieldType.millisOfSecond())); 
     assertEquals(0, test.get(DateTimeFieldType.millisOfDay())); 
     try { 
         test.get((DateTimeFieldType


public void testFormat_halfdayOfDayText327() { 
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


public void testForStyle_shortDateTime328() throws Exception { 
     DateTimeFormatter f = DateTimeFormat.shortDateTime(); 
     DateTimeFormatter g = DateTimeFormat.forStyle("S-"); 
     assertSame(g, f); 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, UK).format(dt.toDate()); 
     assertEquals(expect, f.print(dt)); 
     expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, US).format(dt.toDate()); 
     assertEquals(expect, f.withLocale(US).print(dt)); 
     expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
     if (TimeZone.getDefault() instanceof SimpleTimeZone) { 
     } else { 
         DateTime date = new DateTime(DateFormat.getDateTimeInstance(DateFormat.SHORT, FRANCE).parse(expect)); 
         assertEquals(date, f.withLocale(FRANCE).parseDateTime(expect)); 
     } 
 }


public void testFormat_shortBasicParse329() { 
     DateTime dt = new DateTime(2004, 3, 9, 0, 0, 0, 0); 
     DateTimeFormatter f = DateTimeFormat.forPattern("yyMMdd"); 
     assertEquals(dt, f.parseDateTime("040309")); 
     try { 
         assertEquals(dt, f.parseDateTime("20040309")); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     f = DateTimeFormat.forPattern("yy/MM/dd"); 
     assertEquals(dt, f.parseDateTime("04/03/09")); 
     assertEquals(dt, f.parseDateTime("2004/03/09")); 
 }


public void testFormatParse_textHalfdayAM_France330() { 
     DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendClockhourOfHalfday(2).appendLiteral('-').appendHalfdayOfDayText().appendLiteral('-').appendYear(4, 4).toFormatter().withLocale(Locale.FRANCE).withZoneUTC(); 
     String str = new DateTime(2007, 6, 23, 18, 0, 0, 0, UTC).toString(dateFormatter); 
     assertEquals("$06-PM-2007", str); 
     DateTime date = dateFormatter.parseDateTime(str); 
     check(date, 2007, 1, 1); 
 }


public void testForStyle_shortDate331() throws Exception { 
     DateTimeFormatter f = DateTimeFormat.shortDate(); 
     DateTimeFormatter g = DateTimeFormat.forStyle("S-"); 
     assertSame(g, f); 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0); 
     String expect = DateFormat.getDateInstance(DateFormat.SHORT, UK).format(dt.toDate()); 
     assertEquals(expect, f.print(dt)); 
     expect = DateFormat.getDateInstance(DateFormat.SHORT, US).format(dt.toDate()); 
     assertEquals(expect, f.withLocale(US).print(dt)); 
     expect = DateFormat.getDateInstance(DateFormat.SHORT, FRANCE).format(dt.toDate()); 
     assertEquals(expect, f.withLocale(FRANCE).print(dt)); 
 }

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_longTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.longTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("-L");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getTimeInstance(DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_longDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.longDateTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("LL");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_fullTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.fullTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("-F");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getTimeInstance(DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getTimeInstance(DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_fullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.fullDateTime();
//         DateTimeFormatter g = DateTimeFormat.forStyle("FF");
//         assertSame(g, f);
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_shortLongDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("SL");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_shortFullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("SF");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    //-----------------------------------------------------------------------
    

    
// Defects4J: flaky method
//     public void testForStyle_mediumLongDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("ML");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

    
// Defects4J: flaky method
//     public void testForStyle_mediumFullDateTime() throws Exception {
//         DateTimeFormatter f = DateTimeFormat.forStyle("MF");
//         DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 0);
//         String expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, UK).format(dt.toDate());
//         assertEquals(expect, f.print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, US).format(dt.toDate());
//         assertEquals(expect, f.withLocale(US).print(dt));
//         expect = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.FULL, FRANCE).format(dt.toDate());
//         assertEquals(expect, f.withLocale(FRANCE).print(dt));
//     }

}
