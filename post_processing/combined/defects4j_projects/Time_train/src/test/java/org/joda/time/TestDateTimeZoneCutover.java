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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.tz.DateTimeZoneBuilder;

/**
 * This class is a JUnit test for DateTimeZone.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeZoneCutover extends TestCase {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestDateTimeZoneCutover.class);
    }

    public TestDateTimeZoneCutover(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    // The behaviour of getOffsetFromLocal is defined in its javadoc
    // However, this definition doesn't work for all DateTimeField operations
    
    /** Mock zone simulating Asia/Gaza cutover at midnight 2007-04-01 */
    private static long CUTOVER_GAZA = 1175378400000L;
    private static int OFFSET_GAZA = 7200000;  // +02:00
    private static final DateTimeZone MOCK_GAZA = new MockZone(CUTOVER_GAZA, OFFSET_GAZA, 3600);

    //-----------------------------------------------------------------------

public void test_MutableDateTime_withZoneRetainFields_Gaza77() { 
     MutableDateTime dt = new MutableDateTime(2007, 4, 1, 0, 0, 0, 0, DateTimeZone.UTC); 
     assertEquals("2007-04-01T00:00:00.000Z", dt.toString()); 
     dt.setZoneRetainFields(MOCK_GAZA); 
     assertEquals("2007-04-01T01:00:00.000+03:00", dt.toString()); 
 } 


public void testBug2182444_usCentral95() { 
     Chronology chronUSCentral = GregorianChronology.getInstance(DateTimeZone.forID("US/Central")); 
     Chronology chronUTC = GregorianChronology.getInstance(DateTimeZone.UTC); 
     DateTime usCentralStandardInUTC = new DateTime(2008, 11, 2, 7, 0, 0, 0, chronUTC); 
     DateTime usCentralDaylightInUTC = new DateTime(2008, 11, 2, 6, 0, 0, 0, chronUTC); 
     assertTrue("Should be standard time", chronUSCentral.getZone().isStandardOffset(usCentralStandardInUTC.getMillis())); 
     assertFalse("Should be daylight time", chronUSCentral.getZone().isStandardOffset(usCentralDaylightInUTC.getMillis())); 
     DateTime usCentralStandardInUSCentral = usCentralStandardInUTC.toDateTime(chronUSCentral); 
     DateTime usCentralDaylightInUSCentral = usCentralDaylightInUTC.toDateTime(chronUSCentral); 
     assertEquals(1, usCentralStandardInUSCentral.getHourOfDay()); 
     assertEquals(usCentralStandardInUSCentral.getHourOfDay(), usCentralDaylightInUSCentral.getHourOfDay()); 
     assertTrue(usCentralStandardInUSCentral.getMillis() != usCentralDaylightInUSCentral.getMillis()); 
     assertEquals(usCentralStandardInUSCentral, usCentralStandardInUSCentral.withHourOfDay(1)); 
     assertEquals(usCentralStandardInUSCentral.getMillis() + 3, usCentralStandardInUSCentral.withMillisOfSecond(3).getMillis()); 
     assertEquals(usCentralDaylightInUSCentral, usCentralDaylightInUSCentral.withHourOfDay(1)); 
     assertEquals(usCentralDaylightInUSCentral.getMillis() + 3, usCentralDaylightInUSCentral.withMillisOfSecond(3).getMillis()); 
 } 


public void test_DateTime_JustAfterLastEverOverlap165() { 
     DateTimeZone zone = new DateTimeZoneBuilder().setStandardOffset(-3 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("SUMMER", 1 * DateTimeConstants.MILLIS_PER_HOUR, 2000, 2008, 'w', 4, 10, 0, true, 23 * DateTimeConstants.MILLIS_PER_HOUR).addRecurringSavings("WINTER", 0, 2000, 2008, 'w', 8, 10, 0, true, 0 * DateTimeConstants.MILLIS_PER_HOUR).toDateTimeZone("Zone", false); 
     LocalDate date = new LocalDate(2008, 8, 10); 
     assertEquals("2008-08-10", date.toString()); 
     DateTime dt = date.toDateTimeAtStartOfDay(zone); 
     assertEquals("2008-08-10T00:00:00.000-03:00", dt.toString()); 
 } 


public void testBug3476684_adjustOffset_springGap201() { 
     final DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo"); 
     DateTime base = new DateTime(2011, 10, 15, 22, 15, zone); 
     DateTime baseBefore = base.plusHours(1); 
     DateTime baseAfter = base.plusHours(2); 
     assertSame(base, base.withEarlierOffsetAtOverlap()); 
     assertSame(base, base.withLaterOffsetAtOverlap()); 
     assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap()); 
     assertEquals(baseBefore, baseBefore.withLaterOffsetAtOverlap()); 
     assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap()); 
     assertEquals(baseAfter, baseAfter.withEarlierOffsetAtOverlap()); 
 } 


public void test_DateTime_minusHour_NewYork_Autumn261() { 
     DateTime dt = new DateTime(2007, 11, 4, 8, 0, 0, 0, ZONE_NEW_YORK); 
     assertEquals("2007-11-04T08:00:00.000-05:00", dt.toString()); 
     DateTime minus6 = dt.minusHours(6); 
     assertEquals("2007-11-04T02:00:00.000-05:00", minus6.toString()); 
     DateTime minus7 = dt.minusHours(7); 
     assertEquals("2007-11-04T01:00:00.000-05:00", minus7.toString()); 
     DateTime minus8 = dt.minusHours(8); 
     assertEquals("2007-11-04T01:00:00.000-04:00", minus8.toString()); 
     DateTime minus9 = dt.minusHours(9); 
     assertEquals("2007-11-04T00:00:00.000-04:00", minus9.toString()); 
 } 


public void testWithMinuteOfHourInDstChange_mockZone275() { 
     DateTime cutover = new DateTime(2010, 10, 31, 1, 15, DateTimeZone.forOffsetHoursMinutes(0, 30)); 
     assertEquals("2010-10-31T01:15:00.000+00:30", cutover.toString()); 
     DateTimeZone halfHourZone = new MockZone(cutover.getMillis(), 3600000, -1800); 
     DateTime pre = new DateTime(2010, 10, 31, 1, 0, halfHourZone); 
     assertEquals("2010-10-31T01:00:00.000+01:00", pre.toString()); 
     DateTime post = new DateTime(2010, 10, 31, 1, 59, halfHourZone); 
     assertEquals("2010-10-31T01:59:00.000+00:30", post.toString()); 
     DateTime testPre1 = pre.withMinuteOfHour(30); 
     assertEquals("2010-10-31T01:30:00.000+01:00", testPre1.toString()); 
     DateTime testPre2 = pre.withMinuteOfHour(50); 
     assertEquals("2010-10-31T01:50:00.000+00:30", testPre2.toString()); 
     DateTime testPost1 = post.withMinuteOfHour(30); 
     assertEquals("2010-10-31T01:30:00.000+00:30", testPost1.toString()); 
     DateTime testPost2 = post.withMinuteOfHour(10); 
     assertEquals("2010-10-31T01:10:00.000+01:00", testPost2.toString()); 
 } 


public void test_DateTime_withDay_Turk420() { 
     DateTime dt = new DateTime(2007, 4, 2, 0, 0, 0, 0, MOCK_TURK); 
     assertEquals("2007-04-02T00:00:00.000-04:00", dt.toString()); 
     DateTime res = dt.withDayOfMonth(1); 
     assertEquals("2007-04-01T01:00:00.000-04:00", res.toString()); 
 } 


public void testBug2182444_ausNSW446() { 
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
     assertEquals(australiaNSWStandardInAustraliaNSW.getMillis() + 3, australiaNSWStandardInAustraliaNSW.withMillisOfSecond(3).getMillis()); 
     assertEquals(australiaNSWDaylightInAusraliaNSW, australiaNSWDaylightInAusraliaNSW.withHourOfDay(2)); 
     assertEquals(australiaNSWDaylightInAusraliaNSW.getMillis() + 3, australiaNSWDaylightInAusraliaNSW.withMillisOfSecond(3).getMillis()); 
 } 


public void testPlusMillisInDstChange533() { 
     DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS); 
     assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString()); 
     DateTime test = dateTime.plusMillis(1); 
     assertEquals("2010-10-31T02:30:10.124+02:00", test.toString()); 
 } 


public void testPlusSecondsInDstChange583() { 
     DateTime dateTime = new DateTime("2010-10-31T02:30:10.123+02:00", ZONE_PARIS); 
     assertEquals("2010-10-31T02:30:10.123+02:00", dateTime.toString()); 
     DateTime test = dateTime.plusSeconds(1); 
     assertEquals("2010-10-31T02:30:11.123+02:00", test.toString()); 
 } 


public void testWithMillisOfSecondInDstChange_NewYork_summer628() { 
     DateTime dateTime = new DateTime("2007-11-04T01:30:00.123-04:00", ZONE_NEW_YORK); 
     assertEquals("2007-11-04T01:30:00.123-04:00", dateTime.toString()); 
     DateTime test = dateTime.withMillisOfSecond(0); 
     assertEquals("2007-11-04T01:30:00.000-04:00", test.toString()); 
 } 


public void test_DateTime_roundCeiling_day_NewYork_Spring_postCutover674() { 
     DateTime dt = new DateTime(2007, 3, 11, 3, 30, 0, 0, ZONE_NEW_YORK); 
     assertEquals("2007-03-11T03:30:00.000-04:00", dt.toString()); 
     DateTime rounded = dt.dayOfMonth().roundCeilingCopy(); 
     assertEquals("2007-03-12T00:00:00.000-04:00", rounded.toString()); 
 } 


public void testBug3192457_adjustOffset692() { 
     final DateTimeZone zone = DateTimeZone.forID("Europe/Paris"); 
     DateTime base = new DateTime(2007, 10, 28, 3, 15, zone); 
     DateTime baseBefore = base.minusHours(2); 
     DateTime baseAfter = base.minusHours(1); 
     assertSame(base, base.withEarlierOffsetAtOverlap()); 
     assertSame(base, base.withLaterOffsetAtOverlap()); 
     assertSame(baseBefore, baseBefore.withEarlierOffsetAtOverlap()); 
     assertEquals(baseAfter, baseBefore.withLaterOffsetAtOverlap()); 
     assertSame(baseAfter, baseAfter.withLaterOffsetAtOverlap()); 
     assertEquals(baseBefore, baseAfter.withEarlierOffsetAtOverlap()); 
 } 


public void test_DateTime_parse_Turk832() { 
     try { 
         new DateTime("2007-04-01T00:00", MOCK_TURK); 
         fail(); 
     } catch (IllegalInstantException ex) { 
         assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0); 
     } 
 } 


public void test_DateTime_setHourForward_Moscow_Spring911() { 
     DateTime dt = new DateTime(2007, 3, 25, 0, 0, 0, 0, ZONE_MOSCOW); 
     assertEquals("2007-03-25T00:00:00.000+03:00", dt.toString()); 
     try { 
         dt.hourOfDay().setCopy(2); 
         fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 } 


public void test_DateTime_plusDayMidGap_Turk1003() { 
     DateTime dt = new DateTime(2007, 3, 31, 0, 30, 0, 0, MOCK_TURK); 
     assertEquals("2007-03-31T00:30:00.000-05:00", dt.toString()); 
     DateTime plus1 = dt.plusDays(1); 
     assertEquals("2007-04-01T01:30:00.000-04:00", plus1.toString()); 
     DateTime plus2 = dt.plusDays(2); 
     assertEquals("2007-04-02T00:30:00.000-04:00", plus2.toString()); 
 } 


public void test_DateTime_setHourAcross_NewYork_Spring1043() { 
     DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK); 
     assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString()); 
     DateTime res = dt.hourOfDay().setCopy(4); 
     assertEquals("2007-03-11T04:00:00.000-04:00", res.toString()); 
 } 


public void test_DateTime_parse_Gaza1140() { 
     try { 
         new DateTime("2007-04-01T00:00", MOCK_GAZA); 
         fail(); 
     } catch (IllegalInstantException ex) { 
         assertEquals(true, ex.getMessage().indexOf("Illegal instant due to time zone offset transition") >= 0); 
     } 
 } 


public void test_LocalDate_toDateMidnight_Gaza1169() { 
     LocalDate date = new LocalDate(2007, 4, 1); 
     try { 
         date.toDateMidnight(MOCK_GAZA); 
         fail(); 
     } catch (IllegalInstantException ex) { 
         assertEquals(true, ex.getMessage().startsWith("Illegal instant due to time zone offset transition")); 
     } 
 } 


public void test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover1370() { 
     DateTime dt = new DateTime(2007, 3, 11, 1, 30, 0, 0, ZONE_NEW_YORK); 
     assertEquals("2007-03-11T01:30:00.000-05:00", dt.toString()); 
     DateTime rounded = dt.hourOfDay().roundCeilingCopy(); 
     assertEquals("2007-03-11T03:00:00.000-04:00", rounded.toString()); 
 } 


public void test_LocalDate_new_Turk1442() { 
     LocalDate date1 = new LocalDate(CUTOVER_TURK, MOCK_TURK); 
     assertEquals("2007-04-01", date1.toString()); 
     LocalDate date2 = new LocalDate(CUTOVER_TURK - 1, MOCK_TURK); 
     assertEquals("2007-03-31", date2.toString()); 
 } 


public void test_DateTime_setHourForward_NewYork_Spring1482() { 
     DateTime dt = new DateTime(2007, 3, 11, 0, 0, 0, 0, ZONE_NEW_YORK); 
     assertEquals("2007-03-11T00:00:00.000-05:00", dt.toString()); 
     try { 
         dt.hourOfDay().setCopy(2); 
         fail(); 
     } catch (IllegalFieldValueException ex) { 
     } 
 } 


public void test_getOffsetFromLocal_Moscow_Autumn_overlap_mins1589() { 
     for (int min = 0; min < 60; min++) { 
         if (min < 10) { 
             doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:0" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } else { 
             doTest_getOffsetFromLocal(10, 28, 2, min, "2007-10-28T02:" + min + ":00.000+04:00", ZONE_MOSCOW); 
         } 
     } 
 } 


public void testPeriod1718() { 
     DateTime a = new DateTime("2010-10-31T02:00:00.000+02:00", ZONE_PARIS); 
     DateTime b = new DateTime("2010-10-31T02:01:00.000+02:00", ZONE_PARIS); 
     Period period = new Period(a, b, PeriodType.standard()); 
     assertEquals("PT1M", period.toString()); 
 } 

    

    

    private void doTest_getOffsetFromLocal_Gaza(int days, int hour, int min, String expected) {
        DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        int offset = MOCK_GAZA.getOffsetFromLocal(dt.getMillis());
        DateTime res = new DateTime(dt.getMillis() - offset, MOCK_GAZA);
        assertEquals(res.toString(), expected, res.toString());
    }

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    //------------------------ Bug [1710316] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    

    

    private void doTest_getOffsetFromLocal_Turk(int days, int hour, int min, String expected) {
        DateTime dt = new DateTime(2007, 4, 1, hour, min, 0, 0, DateTimeZone.UTC).plusDays(days);
        int offset = MOCK_TURK.getOffsetFromLocal(dt.getMillis());
        DateTime res = new DateTime(dt.getMillis() - offset, MOCK_TURK);
        assertEquals(res.toString(), expected, res.toString());
    }

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    /** America/New_York cutover from 01:59 to 03:00 on 2007-03-11 */
    private static long CUTOVER_NEW_YORK_SPRING = 1173596400000L;  // 2007-03-11T03:00:00.000-04:00
    private static final DateTimeZone ZONE_NEW_YORK = DateTimeZone.forID("America/New_York");
//  DateTime x = new DateTime(2007, 1, 1, 0, 0, 0, 0, ZONE_NEW_YORK);
//  System.out.println(ZONE_NEW_YORK.nextTransition(x.getMillis()));
//  DateTime y = new DateTime(ZONE_NEW_YORK.nextTransition(x.getMillis()), ZONE_NEW_YORK);
//  System.out.println(y);

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    /** America/New_York cutover from 01:59 to 01:00 on 2007-11-04 */
    private static long CUTOVER_NEW_YORK_AUTUMN = 1194156000000L;  // 2007-11-04T01:00:00.000-05:00

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    /** Europe/Moscow cutover from 01:59 to 03:00 on 2007-03-25 */
    private static long CUTOVER_MOSCOW_SPRING = 1174777200000L;  // 2007-03-25T03:00:00.000+04:00
    private static final DateTimeZone ZONE_MOSCOW = DateTimeZone.forID("Europe/Moscow");

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    /** America/New_York cutover from 02:59 to 02:00 on 2007-10-28 */
    private static long CUTOVER_MOSCOW_AUTUMN = 1193526000000L;  // 2007-10-28T02:00:00.000+03:00

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    /** America/Guatemala cutover from 23:59 to 23:00 on 2006-09-30 */
    private static long CUTOVER_GUATEMALA_AUTUMN = 1159678800000L; // 2006-09-30T23:00:00.000-06:00
    private static final DateTimeZone ZONE_GUATEMALA = DateTimeZone.forID("America/Guatemala");

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------

    

//    public void test_toDateMidnight_SaoPaolo() {
//        // RFE: 1684259
//        DateTimeZone zone = DateTimeZone.forID("America/Sao_Paulo");
//        LocalDate baseDate = new LocalDate(2006, 11, 5);
//        DateMidnight dm = baseDate.toDateMidnight(zone);
//        assertEquals("2006-11-05T00:00:00.000-03:00", dm.toString());
//        DateTime dt = baseDate.toDateTimeAtMidnight(zone);
//        assertEquals("2006-11-05T00:00:00.000-03:00", dt.toString());
//    }

    //-----------------------------------------------------------------------
    private static final DateTimeZone ZONE_PARIS = DateTimeZone.forID("Europe/Paris");

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-------------------------------------------------------------------------
    

    

    

    // ensure Summer time picked
    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, String expected, DateTimeZone zone) {
        doTest_getOffsetFromLocal(2007, month, day, hour, min, 0, 0, expected, zone);
    }

    private void doTest_getOffsetFromLocal(int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {
        doTest_getOffsetFromLocal(2007, month, day, hour, min, sec, milli, expected, zone);
    }

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, String expected, DateTimeZone zone) {
        doTest_getOffsetFromLocal(year, month, day, hour, min, 0, 0, expected, zone);
    }

    private void doTest_getOffsetFromLocal(int year, int month, int day, int hour, int min, int sec, int milli, String expected, DateTimeZone zone) {
        DateTime dt = new DateTime(year, month, day, hour, min, sec, milli, DateTimeZone.UTC);
        int offset = zone.getOffsetFromLocal(dt.getMillis());
        DateTime res = new DateTime(dt.getMillis() - offset, zone);
        assertEquals(res.toString(), expected, res.toString());
    }

}
