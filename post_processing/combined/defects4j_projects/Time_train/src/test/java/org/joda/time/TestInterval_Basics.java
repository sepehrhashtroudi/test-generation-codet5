/*
 *  Copyright 2001-2011 Stephen Colebourne
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
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInterval;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.LenientChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Basics extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private Interval interval37;
    private Interval interval33;

    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestInterval_Basics.class);
    }

    public TestInterval_Basics(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(PARIS);
        TimeZone.setDefault(PARIS.toTimeZone());
        Locale.setDefault(Locale.FRANCE);
        interval37 = new Interval(3, 7);
        interval33 = new Interval(3, 3);
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

public void testContains_RInterval_zeroDuration84() { 
     assertEquals(false, interval33.contains(interval33)); 
     assertEquals(false, interval33.contains(interval37)); 
     assertEquals(true, interval37.contains(interval33)); 
     assertEquals(false, interval33.contains(new Interval(1, 2))); 
     assertEquals(false, interval33.contains(new Interval(8, 9))); 
     assertEquals(false, interval33.contains(new Interval(1, 9))); 
     DateTimeUtils.setCurrentMillisFixed(2); 
     assertEquals(false, interval33.contains((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(3); 
     assertEquals(false, interval33.contains((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(4); 
     assertEquals(false, interval33.contains((ReadableInterval) null)); 
 } 


public void testWithPeriodBeforeEnd1168() throws Throwable { 
     DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS); 
     Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     Interval base = new Interval(dt, dt); 
     Interval test = base.withPeriodBeforeEnd(dur); 
     assertEquals(new Interval(dur, dt), test); 
 } 


public void testWithDurationAfterStart2224() throws Throwable { 
     Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     Interval test = base.withDurationAfterStart(null); 
     assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test); 
 } 


public void testWithDurationAfterStart4227() throws Throwable { 
     Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     Interval test = base.withDurationAfterStart(base.toDuration()); 
     assertSame(base, test); 
 } 


public void testEqualsHashCodeStrict255() { 
     Interval test1 = new Interval(new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)), new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS))); 
     Interval test2 = new Interval(new DateTime(TEST_TIME1, LenientChronology.getInstance(COPTIC_PARIS)), new DateTime(TEST_TIME2, LenientChronology.getInstance(COPTIC_PARIS))); 
     assertEquals(true, test1.equals(test2)); 
     assertEquals(true, test2.equals(test1)); 
     assertEquals(true, test1.equals(test1)); 
     assertEquals(true, test2.equals(test2)); 
     assertEquals(true, test1.hashCode() == test2.hashCode()); 
     assertEquals(true, test1.hashCode() == test1.hashCode()); 
     assertEquals(true, test2.hashCode() == test2.hashCode()); 
 } 


public void testWithEndInstant_RI3357() { 
     Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     Interval test = base.withEnd(null); 
     assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test); 
 } 


public void testIsBefore_RI_null365() { 
     DateTimeUtils.setCurrentMillisFixed(2); 
     assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(3); 
     assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(4); 
     assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(6); 
     assertEquals(false, interval37.isBefore((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(7); 
     assertEquals(true, interval37.isBefore((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(8); 
     assertEquals(true, interval37.isBefore((ReadableInstant) null)); 
 } 


public void testToString565() { 
     DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.UTC); 
     DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.UTC); 
     Interval test = new Interval(dt1, dt2); 
     assertEquals("2004-06-09T07:08:09.010Z/2005-08-13T12:14:16.018Z", test.toString()); 
 } 


public void testWithChronology3605() { 
     Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     Interval test = base.withChronology(COPTIC_PARIS); 
     assertSame(base, test); 
 } 


public void testOverlap_RInterval_null652() { 
     DateTimeUtils.setCurrentMillisFixed(2); 
     assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(3); 
     assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(4); 
     assertEquals(new Interval(4, 4), interval37.overlap((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(6); 
     assertEquals(new Interval(6, 6), interval37.overlap((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(7); 
     assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(8); 
     assertEquals(null, interval37.overlap((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(3); 
     assertEquals(null, interval33.overlap((ReadableInterval) null)); 
 } 


public void testAbuts_RInterval_null686() { 
     DateTimeUtils.setCurrentMillisFixed(2); 
     assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(3); 
     assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(4); 
     assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(6); 
     assertEquals(false, interval37.abuts((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(7); 
     assertEquals(true, interval37.abuts((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(8); 
     assertEquals(false, interval37.abuts((ReadableInterval) null)); 
 } 


public void testContains_RI_null720() { 
     DateTimeUtils.setCurrentMillisFixed(2); 
     assertEquals(false, interval37.contains((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(3); 
     assertEquals(true, interval37.contains((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(4); 
     assertEquals(true, interval37.contains((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(6); 
     assertEquals(true, interval37.contains((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(7); 
     assertEquals(false, interval37.contains((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(8); 
     assertEquals(false, interval37.contains((ReadableInstant) null)); 
 } 


public void testWithPeriodAfterStart1760() throws Throwable { 
     DateTime dt = new DateTime(TEST_TIME_NOW, COPTIC_PARIS); 
     Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     Interval base = new Interval(dt, dt); 
     Interval test = base.withPeriodAfterStart(dur); 
     assertEquals(new Interval(dt, dur), test); 
 } 


public void testWithStartInstant_RI2762() { 
     Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     try { 
         test.withStart(new Instant(TEST_TIME2 + 1)); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testWithChronology2768() { 
     Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     Interval test = base.withChronology(null); 
     assertEquals(new Interval(TEST_TIME1, TEST_TIME2, ISOChronology.getInstance()), test); 
 } 


public void testGap_RInterval_zone893() { 
     Interval testA = new Interval(new DateTime(3, LONDON), new DateTime(7, LONDON)); 
     assertEquals(ISOChronology.getInstance(LONDON), testA.getChronology()); 
     Interval testB = new Interval(new DateTime(1, MOSCOW), new DateTime(2, MOSCOW)); 
     assertEquals(ISOChronology.getInstance(MOSCOW), testB.getChronology()); 
     Interval resultAB = testA.gap(testB); 
     assertEquals(ISOChronology.getInstance(LONDON), resultAB.getChronology()); 
     Interval resultBA = testB.gap(testA); 
     assertEquals(ISOChronology.getInstance(MOSCOW), resultBA.getChronology()); 
 } 


public void testWithDurationBeforeEnd1934() throws Throwable { 
     Duration dur = new Duration(TEST_TIME_NOW - TEST_TIME1); 
     Interval base = new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS); 
     Interval test = base.withDurationBeforeEnd(dur); 
     assertEquals(new Interval(TEST_TIME1, TEST_TIME_NOW, COPTIC_PARIS), test); 
 } 


public void testWithEndMillis_long3942() { 
     Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     Interval test = base.withEndMillis(TEST_TIME2); 
     assertSame(base, test); 
 } 


public void testIsBefore_RInterval_null987() { 
     DateTimeUtils.setCurrentMillisFixed(2); 
     assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(3); 
     assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(4); 
     assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(6); 
     assertEquals(false, interval37.isBefore((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(7); 
     assertEquals(true, interval37.isBefore((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(8); 
     assertEquals(true, interval37.isBefore((ReadableInterval) null)); 
 } 


public void testWithPeriodBeforeEnd2995() throws Throwable { 
     Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     Interval test = base.withPeriodBeforeEnd(null); 
     assertEquals(new Interval(TEST_TIME2, TEST_TIME2, COPTIC_PARIS), test); 
 } 


public void testToInterval11080() { 
     Interval test = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     Interval result = test.toInterval(); 
     assertSame(test, result); 
 } 


public void testIsAfter_RInterval_null1112() { 
     DateTimeUtils.setCurrentMillisFixed(2); 
     assertEquals(true, interval37.isAfter((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(3); 
     assertEquals(true, interval37.isAfter((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(4); 
     assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(6); 
     assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(7); 
     assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(8); 
     assertEquals(false, interval37.isAfter((ReadableInterval) null)); 
 } 


public void testIsAfterNow1139() { 
     DateTimeUtils.setCurrentMillisFixed(2); 
     assertEquals(true, interval37.isAfterNow()); 
     DateTimeUtils.setCurrentMillisFixed(3); 
     assertEquals(false, interval37.isAfterNow()); 
     DateTimeUtils.setCurrentMillisFixed(4); 
     assertEquals(false, interval37.isAfterNow()); 
     DateTimeUtils.setCurrentMillisFixed(6); 
     assertEquals(false, interval37.isAfterNow()); 
     DateTimeUtils.setCurrentMillisFixed(7); 
     assertEquals(false, interval37.isAfterNow()); 
     DateTimeUtils.setCurrentMillisFixed(8); 
     assertEquals(false, interval37.isAfterNow()); 
 } 


public void testToPeriod_PeriodType11146() { 
     DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS); 
     DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS); 
     Interval base = new Interval(dt1, dt2); 
     Period test = base.toPeriod(null); 
     Period expected = new Period(dt1, dt2, PeriodType.standard()); 
     assertEquals(expected, test); 
 } 


public void testWithStartMillis_long21235() { 
     Interval test = new Interval(TEST_TIME1, TEST_TIME2); 
     try { 
         test.withStartMillis(TEST_TIME2 + 1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testContains_RI_zeroDuration1299() { 
     assertEquals(false, interval33.contains(new Instant(2))); 
     assertEquals(false, interval33.contains(new Instant(3))); 
     assertEquals(false, interval33.contains(new Instant(4))); 
 } 


public void testGap_RInterval_null1428() { 
     DateTimeUtils.setCurrentMillisFixed(2); 
     assertEquals(new Interval(2, 3), interval37.gap((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(3); 
     assertEquals(null, interval37.gap((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(4); 
     assertEquals(null, interval37.gap((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(6); 
     assertEquals(null, interval37.gap((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(7); 
     assertEquals(null, interval37.gap((ReadableInterval) null)); 
     DateTimeUtils.setCurrentMillisFixed(8); 
     assertEquals(new Interval(7, 8), interval37.gap((ReadableInterval) null)); 
 } 


public void testIsEqual_RI1434() { 
     assertEquals(false, interval37.isEqual(interval33)); 
     assertEquals(true, interval37.isEqual(interval37)); 
 } 


public void testIsAfter_RI1495() { 
     assertEquals(true, interval37.isAfter(new Instant(2))); 
     assertEquals(false, interval37.isAfter(new Instant(3))); 
     assertEquals(false, interval37.isAfter(new Instant(4))); 
     assertEquals(false, interval37.isAfter(new Instant(5))); 
     assertEquals(false, interval37.isAfter(new Instant(6))); 
     assertEquals(false, interval37.isAfter(new Instant(7))); 
     assertEquals(false, interval37.isAfter(new Instant(8))); 
 } 


public void testGetDuration21535() { 
     Interval test = new Interval(TEST_TIME1, TEST_TIME1); 
     assertSame(Duration.ZERO, test.toDuration()); 
 } 


public void testWithPeriodAfterStart21537() throws Throwable { 
     Interval base = new Interval(TEST_TIME_NOW, TEST_TIME2, COPTIC_PARIS); 
     Interval test = base.withPeriodAfterStart(null); 
     assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW, COPTIC_PARIS), test); 
 } 


public void testToPeriod1584() { 
     DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS); 
     DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS); 
     Interval base = new Interval(dt1, dt2); 
     Period test = base.toPeriod(); 
     Period expected = new Period(dt1, dt2, PeriodType.standard()); 
     assertEquals(expected, test); 
 } 


public void testToPeriod_PeriodType21707() { 
     DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10); 
     DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18); 
     Interval base = new Interval(dt1, dt2); 
     Period test = base.toPeriod(PeriodType.yearWeekDayTime()); 
     Period expected = new Period(dt1, dt2, PeriodType.yearWeekDayTime()); 
     assertEquals(expected, test); 
 } 


public void testWithStartMillis_long31751() { 
     Interval base = new Interval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     Interval test = base.withStartMillis(TEST_TIME1); 
     assertSame(base, test); 
 } 


public void testIsAfter_RI_null1765() { 
     DateTimeUtils.setCurrentMillisFixed(2); 
     assertEquals(true, interval37.isAfter((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(3); 
     assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(4); 
     assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(6); 
     assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(7); 
     assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
     DateTimeUtils.setCurrentMillisFixed(8); 
     assertEquals(false, interval37.isAfter((ReadableInstant) null)); 
 } 

    

    //-----------------------------------------------------------------------
    

    

    

    

    class MockInterval extends AbstractInterval {
        public MockInterval() {
            super();
        }
        public Chronology getChronology() {
            return ISOChronology.getInstance();
        }
        public long getStartMillis() {
            return TEST_TIME1;
        }
        public long getEndMillis() {
            return TEST_TIME2;
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
    

    

    

}
