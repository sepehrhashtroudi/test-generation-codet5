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
public void testFormatParse_textMonthAtEnd_France_withSpecifiedDefault309() { 
     DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("dd MMM").withLocale(Locale.FRANCE).withZoneUTC().withDefaultYear(1980); 
     String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     assertEquals("23 juin", str); 
     DateTime date = dateFormatter.parseDateTime(str); 
     check(date, 1980, 6, 23); 
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
