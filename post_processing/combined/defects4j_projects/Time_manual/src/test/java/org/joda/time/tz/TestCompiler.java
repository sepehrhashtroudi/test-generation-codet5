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
package org.joda.time.tz;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.ZoneInfoCompiler.DateTimeOfYear;

/**
 * Test cases for ZoneInfoCompiler.
 *
 * @author Brian S O'Neill
 */
public class TestCompiler extends TestCase {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestCompiler.class);
    }

    static final String AMERICA_LOS_ANGELES_FILE =
        "# Rules for building just America/Los_Angeles time zone.\n" + 
        "\n" + 
        "Rule    US  1918    1919    -   Mar lastSun 2:00    1:00    D\n" + 
        "Rule    US  1918    1919    -   Oct lastSun 2:00    0   S\n" + 
        "Rule    US  1942    only    -   Feb 9   2:00    1:00    W # War\n" + 
        "Rule    US  1945    only    -   Aug 14  23:00u  1:00    P # Peace\n" + 
        "Rule    US  1945    only    -   Sep 30  2:00    0   S\n" + 
        "Rule    US  1967    max -   Oct lastSun 2:00    0   S\n" + 
        "Rule    US  1967    1973    -   Apr lastSun 2:00    1:00    D\n" + 
        "Rule    US  1974    only    -   Jan 6   2:00    1:00    D\n" + 
        "Rule    US  1975    only    -   Feb 23  2:00    1:00    D\n" + 
        "Rule    US  1976    1986    -   Apr lastSun 2:00    1:00    D\n" + 
        "Rule    US  1987    max -   Apr Sun>=1  2:00    1:00    D\n" + 
        "\n" + 
        "Rule    CA  1948    only    -   Mar 14  2:00    1:00    D\n" + 
        "Rule    CA  1949    only    -   Jan  1  2:00    0   S\n" + 
        "Rule    CA  1950    1966    -   Apr lastSun 2:00    1:00    D\n" + 
        "Rule    CA  1950    1961    -   Sep lastSun 2:00    0   S\n" + 
        "Rule    CA  1962    1966    -   Oct lastSun 2:00    0   S\n" + 
        "\n" + 
        "Zone America/Los_Angeles -7:52:58 - LMT 1883 Nov 18 12:00\n" + 
        "            -8:00   US  P%sT    1946\n" + 
        "            -8:00   CA  P%sT    1967\n" + 
        "            -8:00   US  P%sT";

    private DateTimeZone originalDateTimeZone = null;

    public TestCompiler(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        originalDateTimeZone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
    }

    protected void tearDown() throws Exception {
        DateTimeZone.setDefault(originalDateTimeZone);
    }

    //-----------------------------------------------------------------------

public void test_printParseOffset17() { 
     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneOffset("Z", true, 2, 2); 
     DateTimeFormatter f = bld.toFormatter(); 
     DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, TOKYO); 
     assertEquals("2007-03-04 12:30 +09:00", f.print(dt)); 
     assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.parseDateTime("2007-03-04 12:30 +09:00")); 
     assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00")); 
     assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00")); 
 }


public void testFixed60() throws IOException { 
     DateTimeZoneBuilder builder = new DateTimeZoneBuilder().setStandardOffset(3600000).setFixedSavings("LMT", 0); 
     DateTimeZone tz = builder.toDateTimeZone("Test", true); 
     for (int i = 0; i < 2; i++) { 
         assertEquals("Test", tz.getID()); 
         assertEquals(true, tz.isFixed()); 
         assertEquals(3600000, tz.getOffset(0)); 
         assertEquals(3600000, tz.getStandardOffset(0)); 
         assertEquals(3600000, tz.nextTransition(0)); 
         assertEquals(0, tz.previousTransition(0)); 
         tz = testSerialization(builder, "Test"); 
     } 
 }


public void testForID_String132() { 
     Map<String, String> map = new LinkedHashMap<String, String>(); 
     map.put("GMT", "UTC"); 
     map.put("WET", "WET"); 
     map.put("CET", "CET"); 
     map.put("MET", "CET"); 
     map.put("ECT", "CET"); 
     map.put("EET", "EET"); 
     map.put("MIT", "Pacific/Apia"); 
     map.put("HST", "Pacific/Honolulu"); 
     map.put("AST", "America/Anchorage"); 
     map.put("PST", "America/Los_Angeles"); 
     map.put("MST", "America/Denver"); 
     map.put("PNT", "America/Phoenix"); 
     map.put("CST", "America/Chicago"); 
     map.put("EST", "America/New_York"); 
     map.put("IET", "America/Indiana/Indianapolis"); 
     map.put("PRT", "America/Puerto_Rico"); 
     map.put("CNT", "America/St_Johns"); 
     map.put("AGT", "America/Argentina/Buenos_Aires"); 
     map.put("BET", "America/Sao_Paulo"); 
     map.put("ART", "Africa/Cairo"); 
     map.put("CAT", "Africa/Harare"); 
     map.put("EAT", "Africa/Addis_Ababa"); 
     map.put("NET", "Asia/Yerevan"); 
     map.put("PLT", "Asia/Karachi"); 
     map.put("IST", "Asia/Kolkata"); 
     map.


public void test_2400_last133() { 
     StringTokenizer st = new StringTokenizer("Mar lastSun 24:00"); 
     DateTimeOfYear test = new DateTimeOfYear(st); 
     assertEquals(4, test.iMonthOfYear); 
     assertEquals(1, test.iDayOfMonth); 
     assertEquals(1, test.iDayOfWeek); 
     assertEquals(0, test.iMillisOfDay); 
     assertEquals(false, test.iAdvanceDayOfWeek); 
 }


public void test_getOffsetFromLocal_Moscow_Autumn_overlap_mins134() { 
     for (int min = 0; min < 60; min++) { 
         if (min < 10) { 
             doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:0" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } else { 
             doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } 
     } 
 }


public void testPrint_writerMethods135() throws Exception { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     CharArrayWriter out = new CharArrayWriter(); 
     f.printTo(out, dt); 
     assertEquals("Wed 2004-06-09T10:20:30Z", out.toString()); 
     out = new CharArrayWriter(); 
     f.printTo(out, dt.getMillis()); 
     assertEquals("Wed 2004-06-09T11:20:30+01:00", out.toString()); 
     out = new CharArrayWriter(); 
     ISODateTimeFormat.yearMonthDay().printTo(out, dt.toYearMonthDay()); 
     assertEquals("2004-06-09", out.toString()); 
     out = new CharArrayWriter(); 
     try { 
         ISODateTimeFormat.yearMonthDay().printTo(out, (ReadablePartial) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void testFixed136() throws IOException { 
     DateTimeZoneBuilder builder = new DateTimeZoneBuilder().setStandardOffset(3600000).setFixedSavings("LMT", 0); 
     DateTimeZone tz = builder.toDateTimeZone("Test", true); 
     for (int i = 0; i < 2; i++) { 
         assertEquals("Test", tz.getID()); 
         assertEquals(true, tz.isFixed()); 
         assertEquals(3600000, tz.getOffset(0)); 
         assertEquals(3600000, tz.getStandardOffset(0)); 
         assertEquals(3600000, tz.nextTransition(0)); 
         assertEquals(3600000, tz.previousTransition(0)); 
         tz = testSerialization(builder, "Test"); 
     } 
 }


public void testProvider_badClassName137() { 
     try { 
         System.setProperty("org.joda.time.DateTimeZone.Provider", "xxx"); 
         DateTimeZone.setProvider(null); 
     } catch (RuntimeException ex) { 
         assertEquals(ZoneInfoProvider.class, DateTimeZone.getProvider().getClass()); 
     } finally { 
         System.getProperties().remove("org.joda.time.DateTimeZone.Provider"); 
         DateTimeZone.setProvider(null); 
     } 
 }


public void test_DateTime_nextTransition138() { 
     DateTime dt = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); 
     assertEquals(dt.getMillis(), new DateTime(2004, 6, 9, 0, 0, 0, 0).getMillis()); [


public void testPatchedNameKeysLondon139() throws Exception { 
     DateTimeZone zone = DateTimeZone.forID("Europe/London"); 
     DateTime now = new DateTime(2007, 1, 1, 0, 0, 0, 0); 
     String str1 = zone.getName(now.getMillis()); 
     String str2 = zone.getName(now.plusMonths(6).getMillis()); 
     assertEquals(false, str1.equals(str2)); 
 }


public void testFixed140() throws IOException { 
     DateTimeZoneBuilder builder = new DateTimeZoneBuilder().setStandardOffset(3600000).setFixedSavings("LMT", 0); 
     DateTimeZone tz = builder.toDateTimeZone("Test", true); 
     for (int i = 0; i < 2; i++) { 
         assertEquals("Test", tz.getID()); 
         assertEquals(true, tz.isFixed()); 
         assertEquals(3600000, tz.getOffset(0)); 
         assertEquals(3600000, tz.getStandardOffset(0)); 
         assertEquals(0, tz.nextTransition(0)); 
         assertEquals(0, tz.previousTransition(0)); 
         tz = testSerialization(builder, "Test"); 
     } 
 }


public void testBasicComps3141() { 
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
 }


public void test_setHourOfDay142() { 
     Chronology zone = LenientChronology.getInstance(ISOChronology.getInstanceUTC()); 
     DateTime dt = new DateTime(2007, 1, 1, 0, 0, 0, 0, zone); 
     assertEquals("2007-01-01T00:00:00.000Z", dt.toString()); 
     dt = dt.withHourOfDay(24); 
     assertEquals("2007-01-02T00:00:00.000Z", dt.toString()); 
     dt = dt.withHourOfDay(-1); 
     assertEquals("2007-01-01T23:00:00.000Z", dt.toString()); 
 }


public void testIsLocalDateTimeGap_Berlin143() { 
     DateTimeZone zone = DateTimeZone.forID("Europe/Berlin"); 
     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 0))); 
     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 1, 59, 59, 99))); 
     assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 0))); 
     assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 30))); 
     assertEquals(true, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 2, 59, 59, 99))); 
     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 3, 0))); 
     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 3, 25, 4, 0))); 
     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 1, 30))); 
     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 2, 30))); 
     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 10, 28, 3, 30))); 
     assertEquals(false, zone.isLocalDateTimeGap(new LocalDateTime(2007, 12, 24, 12, 34))); 
 }


public void testToDateTime_RI144() { 
     TimeOfDay base = new TimeOfDay(10, 20, 30, 40, COPTIC_PARIS); 
     DateTime dt = new DateTime(0L); 
     assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString()); 
     DateTime test = base.toDateTime(dt); 
     check(base, 10, 20, 30, 40); 
     assertEquals("1970-01-01T01:00:00.000+01:00", dt.toString()); 
     assertEquals("1970-01-01T10:20:30.040+01:00", test.toString()); 
 }


public void test_DateTime_withZoneRetainFields_Gaza145() { 
     DateTime dt = new DateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC); 
     assertEquals("2007-04-01T00:00:00.000Z", dt.toString()); 
     dt = dt.withZoneRetainFields(MOCK_GAZA); 
     assertEquals("2007-04-01T01:00:00.000+03:00", dt.toString()); 
 }


public void testNameProvider146() { 
     try { 
         assertNotNull(DateTimeZone.getNameProvider()); 
         NameProvider provider = DateTimeZone.getNameProvider(); 
         DateTimeZone.setNameProvider(null); 
         assertEquals(provider.getClass(), DateTimeZone.getNameProvider().getClass()); 
         provider = new MockOKButNullNameProvider(); 
         DateTimeZone.setNameProvider(provider); 
         assertSame(provider, DateTimeZone.getNameProvider()); 
         assertEquals("+00:00", DateTimeZone.UTC.getShortName(TEST_TIME_SUMMER)); 
         assertEquals("+00:00", DateTimeZone.UTC.getName(TEST_TIME_SUMMER)); 
     } finally { 
         DateTimeZone.setNameProvider(null); 
     } 
     try { 
         System.setProperty("org.joda.time.DateTimeZone.NameProvider", "org.joda.time.tz.DefaultNameProvider"); 
         DateTimeZone.setNameProvider(null); 
         assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } finally { 
         System.getProperties().remove("org.joda.time.DateTimeZone.NameProvider"); 
         DateTimeZone.setNameProvider(null); 
         assertEquals(DefaultNameProvider.class, DateTimeZone.getNameProvider().getClass()); 
     } 
 }


public void testFormat_weekDateTime147() { 
     DateTime dt = new DateTime(2004, 6, 9, 10, 20, 30, 40, UTC); 
     DateTimeFormatter f = DateTimeFormat.forPattern("x").withLocale(Locale.UK); 
     assertEquals(dt.toString(), "2004", f.print(dt)); 
     dt = dt.withZone(NEWYORK); 
     assertEquals(dt.toString(), "2004", f.print(dt)); 
     dt = dt.withZone(TOKYO); 
     assertEquals(dt.toString(), "2004", f.print(dt)); 
     dt = new DateTime(-123, 6, 9, 10, 20, 30, 40, UTC); 
     assertEquals(dt.toString(), "-123", f.print(dt)); 
 }


public void test_printParseZoneParis148() { 
     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd HH:mm ").appendTimeZoneId(); 
     DateTimeFormatter f = bld.toFormatter(); 
     DateTime dt = new DateTime(2007, 3, 4, 12, 30, 0, PARIS); 
     assertEquals("2007-03-04 12:30 Europe/Paris", f.print(dt)); 
     assertEquals(dt, f.parseDateTime("2007-03-04 12:30 Europe/Paris")); 
     assertEquals(dt, f.withOffsetParsed().parseDateTime("2007-03-04 12:30 Europe/Paris")); 
 }


public void test_add_RInterval1149() { 
     MutablePeriod test = new MutablePeriod(100L); 
     test.add(new Interval(100L, 200L)); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(200, test.getMillis()); 
 }


public void testBug2182444_ausNSW150() { 
     Chronology chronAusNSW = GregorianChronology.getInstance(DateTimeZone.forID("Australia/NSW")); 
     Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC); 
     DateTime australiaNSWStandardInUTC = new DateTime(2008, 4, 5, 16, 0, 0, 0, chronUTC); 
     DateTime australiaNSWDaylightInUTC = new DateTime(2008, 4, 5, 15, 0, 0, 0, chronUTC); 
     assertTrue("Should be standard time", chronAusNSW.getZone().isStandardOffset(australiaNSWStandardInUTC.getMillis())); 
     assertFalse("Should be daylight time", chronAusNSW.getZone().isStandardOffset(australiaNSWDaylightInUTC.getMillis())); 
     DateTime australiaNSWStandardInAustraliaNSW = australiaNSWStandardInUTC.toDateTime(chronAusNSW); 
     DateTime australiaNSWDaylightInAusraliaNSW = australiaNSWDaylightInUTC.toDateTime(chronAusNSW); 
     assertEquals(2, australiaNSWStandardInAustraliaNSW.getHourOfDay()); 
     assertEquals(australiaNSWStandardInAustraliaNSW.getHourOfDay(), australiaNSWDaylightInAusraliaNSW.getHourOfDay()); 
     assertTrue(australiaNSWStandardInAustraliaNSW.getMillis() != australiaNSWDaylightInAusraliaNSW.getMillis()); 
     assertEquals(australiaNSWStandardInAustraliaNSW, australiaNSWStandardInAustraliaNSW.withHourOfDay(2)); 
     assertEquals(australiaNSWStandardInAustraliaNSW.getMillis() + 3, australiaNSWStandard


public void test_DateTime_JustAfterLastEverOverlap151() { 
     DateTimeZone zone = new DateTimeZoneBuilder().setStandardOffset(-3 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("SUMMER", 1 * DateTimeConstants.MILLIS_PER_HOUR, 2000, 2008, 'w', 4, 10, 0, true, 23 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("WINTER", 0, 2000, 2008, 'w', 8, 10, 0, true, 0 * DateTimeConstants.MILLIS_PER_HOUR).toDateTimeZone("Zone", false); 
     LocalDate date = new LocalDate(2008, 8, 10); 
     assertEquals("2008-08-10", date.toString()); 
     DateTime dt = date.toDateTimeAtStartOfDay(zone); 
     assertEquals("2008-08-10T00:00:00.000-03:00", dt.toString()); 
 }


public void testAddRecurringSavings_same302() { 
     DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     assertSame(zone, DateTimeZone.forID("Europe/Paris")); 
     DateTimeZone zone2 = DateTimeZone.forID("Europe/London"); 
     assertSame(zone, zone2); 
     zone = DateTimeZone.forID("UTC"); 
     assertSame(zone, zone2); 
     zone = DateTimeZone.forID("+00:00"); 
     assertSame(zone, zone); 
     zone = DateTimeZone.forID("+00"); 
     assertSame(zone, zone); 
     zone = DateTimeZone.forID("+01:23"); 
     assertEquals("+01:23", zone.getID()); 
     assertEquals(DateTimeConstants.MILLIS_PER_HOUR + (23L * DateTimeConstants.MILLIS_PER_MINUTE), zone.getOffset(TEST_TIME_SUMMER)); 
     zone = DateTimeZone.forID("-02:00"); 
     assertEquals("-02:00", zone.getID()); 
     assertEquals((-2L * DateTimeConstants.MILLIS_PER_HOUR), zone.getOffset(TEST_TIME_SUMMER)); 
     zone = DateTimeZone.forID("-07:05:34.0"); 
     assertEquals("-07:05:34", zone.getID()); 
     assertEquals((-7L * DateTimeConstants.MILLIS_PER_HOUR) + (-5L * DateTimeConstants.MILLIS_PER_MINUTE) + (-34L * DateTimeConstants.MILLIS_PER_SECOND), zone.getOffset(TEST_TIME_SUMMER)); 
     try { 
         DateTimeZone.addRecurringSavings("SST", 1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         DateTimeZone.addRecurringSavings("europe/Paris", 1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 



public void test_BasicComps3303() { 
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
 }


public void testForID_String_old304() { 
     Map<String, String> map = new LinkedHashMap<String, String>(); 
     map.put("GMT", "UTC"); 
     map.put("WET", "WET"); 
     map.put("CET", "CET"); 
     map.put("MET", "CET"); 
     map.put("ECT", "CET"); 
     map.put("EET", "EET"); 
     map.put("MIT", "Pacific/Apia"); 
     map.put("HST", "Pacific/Honolulu"); 
     map.put("AST", "America/Anchorage"); 
     map.put("PST", "America/Los_Angeles"); 
     map.put("MST", "America/Denver"); 
     map.put("PNT", "America/Phoenix"); 
     map.put("CST", "America/Chicago"); 
     map.put("EST", "America/New_York"); 
     map.put("IET", "America/Indiana/Indianapolis"); 
     map.put("PRT", "America/Puerto_Rico"); 
     map.put("CNT", "America/St_Johns"); 
     map.put("AGT", "America/Argentina/Buenos_Aires"); 
     map.put("BET", "America/Sao_Paulo"); 
     map.put("ART", "Africa/Cairo"); 
     map.put("CAT", "Africa/Harare"); 
     map.put("EAT", "Africa/Addis_Ababa"); 
     map.put("NET", "Asia/Yerevan"); 
     map.put("PLT", "Asia/Karachi"); 
     map.put("IST", "Asia/Kolkata"); 
     map.


public void test_addFixedDecimal305() { 
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


public void testAddCutover_RInterval1306() { 
     MutablePeriod test = new MutablePeriod(100L); 
     test.addCutover(new Interval(100L, 200L)); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(200, test.getMillis()); 
 }

    

    private DateTimeZoneBuilder getTestDataTimeZoneBuilder() {
         return new DateTimeZoneBuilder()
             .addCutover(1601, 'w', 1, 1, 1, false, 7200000)
             .setStandardOffset(3600000)
             .addRecurringSavings("", 3600000, 1601, Integer.MAX_VALUE, 'w', 3, -1, 1, false, 7200000)
             .addRecurringSavings("", 0, 1601, Integer.MAX_VALUE, 'w', 10, -1, 1, false, 10800000);
    }    

    //-----------------------------------------------------------------------
    

    private Provider compileAndLoad(String data) throws Exception {
        File tempDir = createDataFile(data);
        File destDir = makeTempDir();

        ZoneInfoCompiler.main(new String[] {
            "-src", tempDir.getAbsolutePath(),
            "-dst", destDir.getAbsolutePath(),
            "tzdata"
        });

        // Mark all files to be deleted on exit.
        deleteOnExit(destDir);

        return new ZoneInfoProvider(destDir);
    }

    private File createDataFile(String data) throws IOException {
        File tempDir = makeTempDir();

        File tempFile = new File(tempDir, "tzdata");
        tempFile.deleteOnExit();

        InputStream in = new ByteArrayInputStream(data.getBytes("UTF-8"));

        FileOutputStream out = new FileOutputStream(tempFile);
        byte[] buf = new byte[1000];
        int amt;
        while ((amt = in.read(buf)) > 0) {
            out.write(buf, 0, amt);
        }
        out.close();
        in.close();

        return tempDir;
    }

    private File makeTempDir() {
        File tempDir = new File(System.getProperty("java.io.tmpdir"));
        tempDir = new File(tempDir, "joda-test-" + (new java.util.Random().nextInt() & 0xffffff));
        tempDir.mkdirs();
        tempDir.deleteOnExit();
        return tempDir;
    }

    private void deleteOnExit(File tempFile) {
        tempFile.deleteOnExit();
        if (tempFile.isDirectory()) {
            File[] files = tempFile.listFiles();
            for (int i=0; i<files.length; i++) {
                deleteOnExit(files[i]);
            }
        }
    }

    //-----------------------------------------------------------------------
    

    

    

    

    

    

}
