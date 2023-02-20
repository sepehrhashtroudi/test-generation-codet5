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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for DateMidnight.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestDateMidnight_Basics extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone NEWYORK = DateTimeZone.forID("America/New_York");

    // the default time zone is set to LONDON in setUp()
    // we have to hard code LONDON here (instead of ISOChronology.getInstance() etc.)
    // as TestAll sets up a different time zone for better all-round testing
    private static final ISOChronology ISO_DEFAULT = ISOChronology.getInstance(LONDON);
    private static final ISOChronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final GJChronology GJ_DEFAULT = GJChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_DEFAULT = GregorianChronology.getInstance(LONDON);
    private static final GregorianChronology GREGORIAN_PARIS = GregorianChronology.getInstance(PARIS);
    private static final BuddhistChronology BUDDHIST_DEFAULT = BuddhistChronology.getInstance(LONDON);
    private static final CopticChronology COPTIC_DEFAULT = CopticChronology.getInstance(LONDON);

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW_UTC =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME_NOW_LONDON =
            TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_HOUR;
//    private long TEST_TIME_NOW_PARIS =
//            TEST_TIME_NOW_UTC - 2*DateTimeConstants.MILLIS_PER_HOUR;
            
    // 2002-04-05
    private long TEST_TIME1_UTC =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_LONDON =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME1_PARIS =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - 2*DateTimeConstants.MILLIS_PER_HOUR;
        
    // 2003-05-06
    private long TEST_TIME2_UTC =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2_LONDON =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME2_PARIS =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestDateMidnight_Basics.class);
    }

    public TestDateMidnight_Basics(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
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

public void testPlusDays_int44() { 
     DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     DateMidnight result = test.plusDays(1); 
     DateMidnight expected = new DateMidnight(2002, 5, 4, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.plusDays(0); 
     assertSame(test, result); 
 } 


public void testWithers76() { 
     DateMidnight test = new DateMidnight(1970, 6, 9, GJ_DEFAULT); 
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


public void testEqualsHashCode93() { 
     DateMidnight test1 = new DateMidnight(TEST_TIME1_UTC); 
     DateMidnight test2 = new DateMidnight(TEST_TIME1_UTC); 
     assertEquals(true, test1.equals(test2)); 
     assertEquals(true, test2.equals(test1)); 
     assertEquals(true, test1.equals(test1)); 
     assertEquals(true, test2.equals(test2)); 
     assertEquals(true, test1.hashCode() == test2.hashCode()); 
     assertEquals(true, test1.hashCode() == test1.hashCode()); 
     assertEquals(true, test2.hashCode() == test2.hashCode()); 
     DateMidnight test3 = new DateMidnight(TEST_TIME2_UTC); 
     assertEquals(false, test1.equals(test3)); 
     assertEquals(false, test2.equals(test3)); 
     assertEquals(false, test3.equals(test1)); 
     assertEquals(false, test3.equals(test2)); 
     assertEquals(false, test1.hashCode() == test3.hashCode()); 
     assertEquals(false, test2.hashCode() == test3.hashCode()); 
     assertEquals(false, test1.equals("Hello")); 
     assertEquals(true, test1.equals(new MockInstant())); 
     assertEquals(false, test1.equals(new DateMidnight(TEST_TIME1_UTC, GREGORIAN_DEFAULT))); 
 } 


public void testMinus_RP135() { 
     DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     DateMidnight result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     DateMidnight expected = new DateMidnight(2001, 3, 25, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.minus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


public void testWithZoneRetainFields_DateTimeZone181() { 
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


public void testPlusYears_int205() { 
     DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     DateMidnight result = test.plusYears(1); 
     DateMidnight expected = new DateMidnight(2003, 5, 3, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.plusYears(0); 
     assertSame(test, result); 
 } 


public void testPlusMonths_int280() { 
     DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     DateMidnight result = test.plusMonths(1); 
     DateMidnight expected = new DateMidnight(2002, 6, 3, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.plusMonths(0); 
     assertSame(test, result); 
 } 


public void testWithFieldAdded2451() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     try { 
         test.withFieldAdded(null, 0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testMinus_RD477() { 
     DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     DateMidnight result = test.minus(new Duration(123456789L)); 
     DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.minus((ReadableDuration) null); 
     assertSame(test, result); 
 } 


public void testWithFieldAdded4490() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 0); 
     assertSame(test, result); 
 } 


public void testMinusWeeks_int541() { 
     DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     DateMidnight result = test.minusWeeks(1); 
     DateMidnight expected = new DateMidnight(2002, 4, 26, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.minusWeeks(0); 
     assertSame(test, result); 
 } 


public void testMinusDays_int543() { 
     DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     DateMidnight result = test.minusDays(1); 
     DateMidnight expected = new DateMidnight(2002, 5, 2, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.minusDays(0); 
     assertSame(test, result); 
 } 


public void testWithFieldAdded1552() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     DateMidnight result = test.withFieldAdded(DurationFieldType.years(), 6); 
     assertEquals(new DateMidnight(2004, 6, 9), test); 
     assertEquals(new DateMidnight(2010, 6, 9), result); 
 } 


public void testPlus_RP573() { 
     DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     DateMidnight result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     DateMidnight expected = new DateMidnight(2003, 7, 28, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.plus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


public void testPlusWeeks_int579() { 
     DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     DateMidnight result = test.plusWeeks(1); 
     DateMidnight expected = new DateMidnight(2002, 5, 10, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.plusWeeks(0); 
     assertSame(test, result); 
 } 


public void testWithDurationAdded_long_int698() { 
     DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     DateMidnight result = test.withDurationAdded(123456789L, 1); 
     DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.withDurationAdded(123456789L, 0); 
     assertSame(test, result); 
     result = test.withDurationAdded(123456789L, 2); 
     expected = new DateMidnight(test.getMillis() + (2L * 123456789L), BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.withDurationAdded(123456789L, -3); 
     expected = new DateMidnight(test.getMillis() - (3L * 123456789L), BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
 } 


public void testProperty728() { 
     DateMidnight test = new DateMidnight(); 
     assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     assertEquals(test.dayOfWeek(), test.property(DateTimeFieldType.dayOfWeek())); 
     assertEquals(test.weekOfWeekyear(), test.property(DateTimeFieldType.weekOfWeekyear())); 
     assertEquals(test.property(DateTimeFieldType.millisOfSecond()), test.property(DateTimeFieldType.millisOfSecond())); 
     DateTimeFieldType bad = new DateTimeFieldType("bad") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() { 
             return DurationFieldType.weeks(); 
         } 
  
         public DurationFieldType getRangeDurationType() { 
             return null; 
         } 
  
         public DateTimeField getField(Chronology chronology) { 
             return UnsupportedDateTimeField.getInstance(this, UnsupportedDurationField.getInstance(getDurationType())); 
         } 
     }; 
     try { 
         test.property(bad); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.property(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testToInterval840() { 
     DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     Interval test = base.toInterval(); 
     DateMidnight end = base.plus(Period.days(1)); 
     assertEquals(new Interval(base, end), test); 
 } 


public void testWithField2917() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     try { 
         test.withField(null, 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testWithChronology_Chronology1045() { 
     DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     DateMidnight result = test.withChronology(GREGORIAN_PARIS); 
     assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     assertEquals(GREGORIAN_PARIS, result.getChronology()); 
     test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS); 
     result = test.withChronology(null); 
     assertEquals(TEST_TIME1_PARIS, test.getMillis()); 
     assertEquals(TEST_TIME1_LONDON - DateTimeConstants.MILLIS_PER_DAY, result.getMillis()); 
     assertEquals(ISO_DEFAULT, result.getChronology()); 
     test = new DateMidnight(TEST_TIME1_UTC); 
     result = test.withChronology(null); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(ISO_DEFAULT, result.getChronology()); 
     test = new DateMidnight(TEST_TIME1_UTC); 
     result = test.withChronology(ISO_DEFAULT); 
     assertSame(test, result); 
 } 


public void testMinusMonths_int1122() { 
     DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     DateMidnight result = test.minusMonths(1); 
     DateMidnight expected = new DateMidnight(2002, 4, 3, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.minusMonths(0); 
     assertSame(test, result); 
 } 


public void testWithFields_RPartial1197() { 
     DateMidnight test = new DateMidnight(2004, 5, 6); 
     DateMidnight result = test.withFields(new YearMonthDay(2003, 4, 5)); 
     DateMidnight expected = new DateMidnight(2003, 4, 5); 
     assertEquals(expected, result); 
     test = new DateMidnight(TEST_TIME1_UTC); 
     result = test.withFields(null); 
     assertSame(test, result); 
 } 


public void testToYearMonthDay1224() { 
     DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     YearMonthDay test = base.toYearMonthDay(); 
     assertEquals(new YearMonthDay(TEST_TIME1_UTC, COPTIC_DEFAULT), test); 
 } 


public void testGet_DateTimeFieldType1332() { 
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
         test.get((DateTimeFieldType) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testToCalendar_Locale1346() { 
     DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     Calendar result = test.toCalendar(null); 
     assertEquals(test.getMillis(), result.getTime().getTime()); 
     assertEquals(TimeZone.getTimeZone("Europe/London"), result.getTimeZone()); 
     test = new DateMidnight(TEST_TIME1_UTC, PARIS); 
     result = test.toCalendar(null); 
     assertEquals(test.getMillis(), result.getTime().getTime()); 
     assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone()); 
     test = new DateMidnight(TEST_TIME1_UTC, PARIS); 
     result = test.toCalendar(Locale.UK); 
     assertEquals(test.getMillis(), result.getTime().getTime()); 
     assertEquals(TimeZone.getTimeZone("Europe/Paris"), result.getTimeZone()); 
 } 


public void testMinus_long1349() { 
     DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     DateMidnight result = test.minus(123456789L); 
     DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
 } 


public void testToLocalDate1655() { 
     DateMidnight base = new DateMidnight(TEST_TIME1_UTC, COPTIC_DEFAULT); 
     LocalDate test = base.toLocalDate(); 
     assertEquals(new LocalDate(TEST_TIME1_UTC, COPTIC_DEFAULT), test); 
 } 


public void testPlus_long1680() { 
     DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     DateMidnight result = test.plus(123456789L); 
     DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
 } 


public void testWithField11682() { 
     DateMidnight test = new DateMidnight(2004, 6, 9); 
     DateMidnight result = test.withField(DateTimeFieldType.year(), 2006); 
     assertEquals(new DateMidnight(2004, 6, 9), test); 
     assertEquals(new DateMidnight(2006, 6, 9), result); 
 } 

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    
    
    class MockInstant extends AbstractInstant {
        public String toString() {
            return null;
        }
        public long getMillis() {
            return TEST_TIME1_LONDON;
        }
        public Chronology getChronology() {
            return ISO_DEFAULT;
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
    private void check(DateMidnight test, int year, int month, int day) {
        assertEquals(year, test.getYear());
        assertEquals(month, test.getMonthOfYear());
        assertEquals(day, test.getDayOfMonth());
    }

}
