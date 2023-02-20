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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalDate.
 *
 * @author Stephen Colebourne
 */
public class TestLocalDate_Basics extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
//    private static final int OFFSET = 1;
    private static final GJChronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
//    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
//    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();

    /** Mock zone simulating Asia/Gaza cutover at midnight 2007-04-01 */
    private static long CUTOVER_GAZA = 1175378400000L;
    private static int OFFSET_GAZA = 7200000;  // +02:00
    private static final DateTimeZone MOCK_GAZA = new MockZone(CUTOVER_GAZA, OFFSET_GAZA, 3600);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
//    private long TEST_TIME1 =
//        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 12L * DateTimeConstants.MILLIS_PER_HOUR
//        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    private long TEST_TIME2 =
//        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
//        + 14L * DateTimeConstants.MILLIS_PER_HOUR
//        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestLocalDate_Basics.class);
    }

    public TestLocalDate_Basics(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
        systemDefaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.ENGLISH);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
        Locale.setDefault(systemDefaultLocale);
        systemDefaultLocale = null;
    }

    //-----------------------------------------------------------------------

public void testWithFieldAdded_DurationFieldType_int_14() { 
     LocalDate test = new LocalDate(2004, 6, 9); 
     LocalDate result = test.withFieldAdded(DurationFieldType.years(), 6); 
     assertEquals(new LocalDate(2004, 6, 9), test); 
     assertEquals(new LocalDate(2010, 6, 9), result); 
 } 


public void testToDateTimeAtStartOfDay5() { 
     LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     DateTime test = base.toDateTimeAtStartOfDay(); 
     check(base, 2005, 6, 9); 
     assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 } 


public void testSerialization9() throws Exception { 
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


public void testPlus_RP38() { 
     LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     LocalDate result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8)); 
     LocalDate expected = new LocalDate(2003, 7, 28, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


public void testPlusWeeks_int64() { 
     LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     LocalDate result = test.plusWeeks(1); 
     LocalDate expected = new LocalDate(2002, 5, 10, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusWeeks(0); 
     assertSame(test, result); 
 } 


public void testMinus_RP100() { 
     LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     LocalDate result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     LocalDate expected = new LocalDate(2001, 3, 26, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


public void testToString_DTFormatter105() { 
     LocalDate test = new LocalDate(2002, 6, 9); 
     assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     assertEquals("2002-06-09", test.toString((DateTimeFormatter) null)); 
 } 


public void testToInterval_Zone117() { 
     LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     Interval test = base.toInterval(TOKYO); 
     check(base, 2005, 6, 9); 
     DateTime start = base.toDateTimeAtStartOfDay(TOKYO); 
     DateTime end = start.plus(Period.days(1)); 
     Interval expected = new Interval(start, end); 
     assertEquals(expected, test); 
 } 


public void testMinusDays_int150() { 
     LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     LocalDate result = test.minusDays(1); 
     LocalDate expected = new LocalDate(2002, 5, 2, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusDays(0); 
     assertSame(test, result); 
 } 


public void testPlusYears_int208() { 
     LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     LocalDate result = test.plusYears(1); 
     LocalDate expected = new LocalDate(2003, 5, 3, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusYears(0); 
     assertSame(test, result); 
 } 


public void testWithers269() { 
     LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC); 
     check(test.withYear(2000), 2000, 6, 9); 
     check(test.withMonthOfYear(2), 1970, 2, 9); 
     check(test.withDayOfMonth(2), 1970, 6, 2); 
     check(test.withDayOfYear(6), 1970, 1, 6); 
     check(test.withDayOfWeek(6), 1970, 6, 13); 
     check(test.withWeekOfWeekyear(6), 1970, 2, 3); 
     check(test.withWeekyear(1971), 1971, 6, 15); 
     check(test.withYearOfCentury(60), 1960, 6, 9); 
     check(test.withCenturyOfEra(21), 2070, 6, 9); 
     check(test.withYearOfEra(1066), 1066, 6, 9); 
     check(test.withEra(DateTimeConstants.BC), -1970, 6, 9); 
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


public void testGet_DateTimeFieldType343() { 
     LocalDate test = new LocalDate(); 
     assertEquals(1970, test.get(DateTimeFieldType.year())); 
     assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); 
     assertEquals(9, test.get(DateTimeFieldType.dayOfMonth())); 
     assertEquals(2, test.get(DateTimeFieldType.dayOfWeek())); 
     assertEquals(160, test.get(DateTimeFieldType.dayOfYear())); 
     assertEquals(24, test.get(DateTimeFieldType.weekOfWeekyear())); 
     assertEquals(1970, test.get(DateTimeFieldType.weekyear())); 
     try { 
         test.get(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.get(DateTimeFieldType.hourOfDay()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testToString_String392() { 
     LocalDate test = new LocalDate(2002, 6, 9); 
     assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH")); 
     assertEquals("2002-06-09", test.toString((String) null)); 
 } 


public void testToDate_autumnDST410() { 
     LocalDate base = new LocalDate(2007, 10, 2); 
     SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000); 
     TimeZone currentZone = TimeZone.getDefault(); 
     try { 
         TimeZone.setDefault(testZone); 
         Date test = base.toDate(); 
         check(base, 2007, 10, 2); 
         assertEquals("Tue Oct 02 00:00:00 GMT+02:00 2007", test.toString()); 
     } finally { 
         TimeZone.setDefault(currentZone); 
     } 
 } 


public void testGetters414() { 
     LocalDate test = new LocalDate(1970, 6, 9, GJ_UTC); 
     assertEquals(1970, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     assertEquals(160, test.getDayOfYear()); 
     assertEquals(2, test.getDayOfWeek()); 
     assertEquals(24, test.getWeekOfWeekyear()); 
     assertEquals(1970, test.getWeekyear()); 
     assertEquals(70, test.getYearOfCentury()); 
     assertEquals(20, test.getCenturyOfEra()); 
     assertEquals(1970, test.getYearOfEra()); 
     assertEquals(DateTimeConstants.AD, test.getEra()); 
 } 


public void testWithField_DateTimeFieldType_int_1418() { 
     LocalDate test = new LocalDate(2004, 6, 9); 
     LocalDate result = test.withField(DateTimeFieldType.year(), 2006); 
     assertEquals(new LocalDate(2004, 6, 9), test); 
     assertEquals(new LocalDate(2006, 6, 9), result); 
 } 


public void testMinusMonths_int424() { 
     LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     LocalDate result = test.minusMonths(1); 
     LocalDate expected = new LocalDate(2002, 4, 3, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusMonths(0); 
     assertSame(test, result); 
 } 


public void testIsSupported_DurationFieldType464() { 
     LocalDate test = new LocalDate(1970, 6, 9); 
     assertEquals(false, test.isSupported(DurationFieldType.eras())); 
     assertEquals(true, test.isSupported(DurationFieldType.centuries())); 
     assertEquals(true, test.isSupported(DurationFieldType.years())); 
     assertEquals(true, test.isSupported(DurationFieldType.months())); 
     assertEquals(true, test.isSupported(DurationFieldType.weekyears())); 
     assertEquals(true, test.isSupported(DurationFieldType.weeks())); 
     assertEquals(true, test.isSupported(DurationFieldType.days())); 
     assertEquals(false, test.isSupported(DurationFieldType.hours())); 
     assertEquals(false, test.isSupported((DurationFieldType) null)); 
 } 


public void testProperty535() { 
     LocalDate test = new LocalDate(2005, 6, 9, GJ_UTC); 
     assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     assertEquals(test.dayOfMonth(), test.property(DateTimeFieldType.dayOfMonth())); 
     assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     assertEquals(test.dayOfYear(), test.property(DateTimeFieldType.dayOfYear())); 
     assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     assertEquals(test.weekyear(), test.property(DateTimeFieldType.weekyear())); 
     assertEquals(test.yearOfCentury(), test.property(DateTimeFieldType.yearOfCentury())); 
     assertEquals(test.yearOfEra(), test.property(DateTimeFieldType.yearOfEra())); 
     assertEquals(test.centuryOfEra(), test.property(DateTimeFieldType.centuryOfEra())); 
     assertEquals(test.era(), test.property(DateTimeFieldType.era())); 
     try { 
         test.property(DateTimeFieldType.millisOfDay()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.property(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testIsEqual_LocalDate553() { 
     LocalDate test1 = new LocalDate(2005, 6, 2); 
     LocalDate test1a = new LocalDate(2005, 6, 2); 
     assertEquals(true, test1.isEqual(test1a)); 
     assertEquals(true, test1a.isEqual(test1)); 
     assertEquals(true, test1.isEqual(test1)); 
     assertEquals(true, test1a.isEqual(test1a)); 
     LocalDate test2 = new LocalDate(2005, 7, 2); 
     assertEquals(false, test1.isEqual(test2)); 
     assertEquals(false, test2.isEqual(test1)); 
     LocalDate test3 = new LocalDate(2005, 7, 2, GregorianChronology.getInstanceUTC()); 
     assertEquals(false, test1.isEqual(test3)); 
     assertEquals(false, test3.isEqual(test1)); 
     assertEquals(true, test3.isEqual(test2)); 
     try { 
         new LocalDate(2005, 7, 2).isEqual(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


@SuppressWarnings("deprecation") 
 public void testToDateTimeAtMidnight615() { 
     LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     DateTime test = base.toDateTimeAtMidnight(); 
     check(base, 2005, 6, 9); 
     assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 } 


public void testToDate_springDST_2Hour40Savings618() { 
     LocalDate base = new LocalDate(2007, 4, 2); 
     SimpleTimeZone testZone = new SimpleTimeZone(3600000, "NoMidnight", Calendar.APRIL, 2, 0, 0, Calendar.OCTOBER, 2, 0, 3600000, (3600000 / 6) * 16); 
     TimeZone currentZone = TimeZone.getDefault(); 
     try { 
         TimeZone.setDefault(testZone); 
         Date test = base.toDate(); 
         check(base, 2007, 4, 2); 
         assertEquals("Mon Apr 02 02:40:00 GMT+03:40 2007", test.toString()); 
     } finally { 
         TimeZone.setDefault(currentZone); 
     } 
 } 


public void testGetValues650() { 
     LocalDate test = new LocalDate(); 
     int[] values = test.getValues(); 
     assertEquals(1970, values[0]); 
     assertEquals(6, values[1]); 
     assertEquals(9, values[2]); 
     assertNotSame(test.getValues(), test.getValues()); 
 } 


public void testWithFieldAdded_DurationFieldType_int_5671() { 
     LocalDate test = new LocalDate(2004, 6, 9); 
     try { 
         test.withFieldAdded(DurationFieldType.hours(), 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testMinusWeeks_int695() { 
     LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     LocalDate result = test.minusWeeks(1); 
     LocalDate expected = new LocalDate(2002, 4, 26, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusWeeks(0); 
     assertSame(test, result); 
 } 


public void testWithField_DateTimeFieldType_int_3753() { 
     LocalDate test = new LocalDate(2004, 6, 9); 
     try { 
         test.withField(DateTimeFieldType.hourOfDay(), 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testEqualsHashCodeStrict773() { 
     LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     assertEquals(true, test1.equals(test2)); 
     assertEquals(true, test2.equals(test1)); 
     assertEquals(true, test1.equals(test1)); 
     assertEquals(true, test2.equals(test2)); 
     assertEquals(true, test1.hashCode() == test2.hashCode()); 
     assertEquals(true, test1.hashCode() == test1.hashCode()); 
     assertEquals(true, test2.hashCode() == test2.hashCode()); 
 } 


public void testToDateTime_LocalTime859() { 
     LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     DateTime test = base.toDateTime(tod); 
     check(base, 2005, 6, 9); 
     DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     assertEquals(expected, test); 
 } 


public void testToDateTimeAtCurrentTime878() { 
     LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     DateTime test = base.toDateTimeAtCurrentTime(); 
     check(base, 2005, 6, 9); 
     DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     expected = expected.year().setCopy(2005); 
     expected = expected.monthOfYear().setCopy(6); 
     expected = expected.dayOfMonth().setCopy(9); 
     assertEquals(expected, test); 
 } 


public void testGetFieldType_int1048() { 
     LocalDate test = new LocalDate(COPTIC_PARIS); 
     assertSame(DateTimeFieldType.year(), test.getFieldType(0)); 
     assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1)); 
     assertSame(DateTimeFieldType.dayOfMonth(), test.getFieldType(2)); 
     try { 
         test.getFieldType(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     try { 
         test.getFieldType(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 } 


public void testToDateTime_LocalTime_nullZone1056() { 
     LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     DateTime test = base.toDateTime(tod, null); 
     check(base, 2005, 6, 9); 
     DateTime expected = new DateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_LONDON); 
     assertEquals(expected, test); 
 } 


public void testWithField_DateTimeFieldType_int_21174() { 
     LocalDate test = new LocalDate(2004, 6, 9); 
     try { 
         test.withField(null, 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


@SuppressWarnings("deprecation") 
 public void testToDateMidnight1182() { 
     LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     DateMidnight test = base.toDateMidnight(); 
     check(base, 2005, 6, 9); 
     assertEquals(new DateMidnight(2005, 6, 9, COPTIC_LONDON), test); 
 } 


public void testToString_String_Locale1194() { 
     LocalDate test = new LocalDate(1970, 6, 9); 
     assertEquals("Tue 9/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     assertEquals("mar. 9/6", test.toString("EEE d/M", Locale.FRENCH)); 
     assertEquals("1970-06-09", test.toString(null, Locale.ENGLISH)); 
     assertEquals("Tue 9/6", test.toString("EEE d/M", null)); 
     assertEquals("1970-06-09", test.toString(null, null)); 
 } 


public void testWithFieldAdded_DurationFieldType_int_21225() { 
     LocalDate test = new LocalDate(2004, 6, 9); 
     try { 
         test.withFieldAdded(null, 0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testToLocalDateTime_wrongChronologyLocalTime1238() { 
     LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_PARIS); 
     try { 
         base.toLocalDateTime(tod); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testPlusDays_int1252() { 
     LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     LocalDate result = test.plusDays(1); 
     LocalDate expected = new LocalDate(2002, 5, 4, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusDays(0); 
     assertSame(test, result); 
 } 


public void testPlusMonths_int1256() { 
     LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     LocalDate result = test.plusMonths(1); 
     LocalDate expected = new LocalDate(2002, 6, 3, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusMonths(0); 
     assertSame(test, result); 
 } 


public void testToDateTime_nullRI1270() { 
     LocalDate base = new LocalDate(2005, 6, 9); 
     DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     DateTime test = base.toDateTime((ReadableInstant) null); 
     check(base, 2005, 6, 9); 
     DateTime expected = dt; 
     expected = expected.year().setCopy(2005); 
     expected = expected.monthOfYear().setCopy(6); 
     expected = expected.dayOfMonth().setCopy(9); 
     assertEquals(expected, test); 
 } 


public void testIsSupported_DateTimeFieldType1276() { 
     LocalDate test = new LocalDate(COPTIC_PARIS); 
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
     assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); 
     assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
 } 


public void testToInterval1281() { 
     LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     Interval test = base.toInterval(); 
     check(base, 2005, 6, 9); 
     DateTime start = base.toDateTimeAtStartOfDay(); 
     DateTime end = start.plus(Period.days(1)); 
     Interval expected = new Interval(start, end); 
     assertEquals(expected, test); 
 } 


public void testToLocalDateTime_LocalTime1357() { 
     LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     LocalTime tod = new LocalTime(12, 13, 14, 15, COPTIC_TOKYO); 
     LocalDateTime test = base.toLocalDateTime(tod); 
     check(base, 2005, 6, 9); 
     LocalDateTime expected = new LocalDateTime(2005, 6, 9, 12, 13, 14, 15, COPTIC_UTC); 
     assertEquals(expected, test); 
 } 


public void testGetValue_int1471() { 
     LocalDate test = new LocalDate(); 
     assertEquals(1970, test.getValue(0)); 
     assertEquals(6, test.getValue(1)); 
     assertEquals(9, test.getValue(2)); 
     try { 
         test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     try { 
         test.getValue(3); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 } 


public void testToLocalDateTime_nullLocalTime1601() { 
     LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     try { 
         base.toLocalDateTime((LocalTime) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testToDate_winter1665() { 
     LocalDate base = new LocalDate(2005, 1, 9, COPTIC_PARIS); 
     Date test = base.toDate(); 
     check(base, 2005, 1, 9); 
     GregorianCalendar gcal = new GregorianCalendar(); 
     gcal.clear(); 
     gcal.set(Calendar.YEAR, 2005); 
     gcal.set(Calendar.MONTH, Calendar.JANUARY); 
     gcal.set(Calendar.DAY_OF_MONTH, 9); 
     assertEquals(gcal.getTime(), test); 
 } 


public void testToDateTime_wrongChronoLocalTime_Zone1763() { 
     LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     LocalTime tod = new LocalTime(12, 13, 14, 15, BUDDHIST_TOKYO); 
     try { 
         base.toDateTime(tod, LONDON); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 

    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {
            return COPTIC_UTC;
        }
        public DateTimeField[] getFields() {
            return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
                COPTIC_UTC.dayOfMonth(),
            };
        }
        public int[] getValues() {
            return new int[] {1970, 6, 9};
        }
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
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int hour, int min, int sec) {
        assertEquals(hour, test.getYear());
        assertEquals(min, test.getMonthOfYear());
        assertEquals(sec, test.getDayOfMonth());
    }
}
