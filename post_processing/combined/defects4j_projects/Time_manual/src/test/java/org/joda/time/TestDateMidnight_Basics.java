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

public void testWithDurationAdded_long_int14() { 
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


public void testEra16() { 
     assertEquals(1, CopticChronology.AM); 
     try { 
         new DateTime(-1, 13, 5, 0, 0, 0, 0, COPTIC_UTC); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void testMinusYears_int41() { 
     DateMidnight test = new DateMidnight(2002, 5, 3, BUDDHIST_DEFAULT); 
     DateMidnight result = test.minusYears(1); 
     DateMidnight expected = new DateMidnight(2001, 5, 3, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.minusYears(0); 
     assertSame(test, result); 
 }


public void testGetPeriodType107() { 
     Period test = new Period(0L); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
 }


public void testMinus_RD108() { 
     DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     DateMidnight result = test.minus(new Duration(123456789L)); 
     DateMidnight expected = new DateMidnight(test.getMillis() - 123456789L, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.minus((ReadableDuration) null); 
     assertSame(test, result); 
 }


public void testWithMillis_long109() { 
     DateMidnight test = new DateMidnight(TEST_TIME1_UTC); 
     DateMidnight result = test.withMillis(TEST_TIME1_LONDON); 
     assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
     assertEquals(TEST_TIME1_PARIS, result.getMillis()); 
     assertEquals(ISO_PARIS, result.getChronology()); 
     test = new DateMidnight(TEST_TIME1_UTC, GREGORIAN_PARIS); 
     result = test.withMillis(TEST_TIME1_UTC); 
     assertEquals(TEST_TIME1_PARIS, test.getMillis()); 
     assertEquals(TEST_TIME1_LONDON - DateTimeConstants.MILLIS_PER_DAY, result.getMillis()); 
     assertEquals(GREGORIAN_DEFAULT, result.getChronology()); 
     test = new DateMidnight(TEST_TIME1_UTC); 
     result = test.withMillis(TEST_TIME1_UTC); 
     assertSame(test, result); 
     test = new DateMidnight(TEST_TIME1_UTC); 
     result = test.withMillis(TEST_TIME1_UTC); 
     assertSame(test, result); 
     test = new DateMidnight(TEST_TIME1_UTC, new MockNullZoneChronology()); 
     result = test.withMillis(TEST_TIME1_UTC); 
     assertSame(test, result); 
 }


public void testToDurationTo110() { 
     Period test = new Period(123L); 
     assertEquals(new Duration(123L), test.toDurationTo(new Instant(123L))); 
 }


public void testWithPeriodBeforeEnd2111() throws Throwable { 
     Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     Interval test = base.withPeriodBeforeEnd(null); 
     assertEquals(new Interval(TEST_TIME2, TEST_TIME2, COPTIC_PARIS), test); 
 }


public void testEqualsHashCode112() { 
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


public void testEqualsHashCode113() { 
     MonthDay test1 = new MonthDay(10, 6, COPTIC_PARIS); 
     MonthDay test2 = new MonthDay(10, 6, COPTIC_PARIS); 
     assertEquals(true, test1.equals(test2)); 
     assertEquals(true, test2.equals(test1)); 
     assertEquals(true, test1.equals(test1)); 
     assertEquals(true, test2.equals(test2)); 
     assertEquals(true, test1.hashCode() == test2.hashCode()); 
     assertEquals(true, test1.hashCode() == test1.hashCode()); 
     assertEquals(true, test2.hashCode() == test2.hashCode()); 
     MonthDay test3 = new MonthDay(10, 6); 
     assertEquals(false, test1.equals(test3)); 
     assertEquals(false, test2.equals(test3)); 
     assertEquals(false, test3.equals(test1)); 
     assertEquals(false, test3.equals(test2)); 
     assertEquals(false, test1.hashCode() == test3.hashCode()); 
     assertEquals(false, test2.hashCode() == test3.hashCode()); 
     assertEquals(false, test1.equals("Hello")); 
     assertEquals(true, test1.equals(new MockMD())); 
     assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 }


public void testPlus_RD114() { 
     DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     DateMidnight result = test.plus(new Duration(123456789L)); 
     DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.plus((ReadableDuration) null); 
     assertSame(test, result); 
 }


public void testBug3476684_adjustOffset_springGap115() { 
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


public void testWithDurationAdded_RD_int116() { 
     DateMidnight test = new DateMidnight(TEST_TIME1_UTC, BUDDHIST_DEFAULT); 
     DateMidnight result = test.withDurationAdded(new Duration(123456789L), 1); 
     DateMidnight expected = new DateMidnight(test.getMillis() + 123456789L, BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.withDurationAdded(null, 1); 
     assertSame(test, result); 
     result = test.withDurationAdded(new Duration(123456789L), 0); 
     assertSame(test, result); 
     result = test.withDurationAdded(new Duration(123456789L), 2); 
     expected = new DateMidnight(test.getMillis() + (2L * 123456789L), BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
     result = test.withDurationAdded(new Duration(123456789L), -3); 
     expected = new DateMidnight(test.getMillis() - (3L * 123456789L), BUDDHIST_DEFAULT); 
     assertEquals(expected, result); 
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
