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

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.Partial;
import org.joda.time.TimeOfDay;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for ISOChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestISOChronology extends TestCase {

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
        return new TestSuite(TestISOChronology.class);
    }

    public TestISOChronology(String name) {
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

public void testPartialDayOfYearAdd27() { 
     Partial start = new Partial().with(DateTimeFieldType.year(), 2000).with(DateTimeFieldType.dayOfYear(), 366); 
     Partial end = new Partial().with(DateTimeFieldType.year(), 2004).with(DateTimeFieldType.dayOfYear(), 366); 
     assertEquals(end, start.withFieldAdded(DurationFieldType.days(), 365 + 365 + 365 + 366)); 
     assertEquals(start, end.withFieldAdded(DurationFieldType.days(), -(365 + 365 + 365 + 366))); 
 } 


public void testDurationFields480() { 
     final ISOChronology iso = ISOChronology.getInstance(); 
     assertEquals("eras", iso.eras().getName()); 
     assertEquals("centuries", iso.centuries().getName()); 
     assertEquals("years", iso.years().getName()); 
     assertEquals("weekyears", iso.weekyears().getName()); 
     assertEquals("months", iso.months().getName()); 
     assertEquals("weeks", iso.weeks().getName()); 
     assertEquals("days", iso.days().getName()); 
     assertEquals("halfdays", iso.halfdays().getName()); 
     assertEquals("hours", iso.hours().getName()); 
     assertEquals("minutes", iso.minutes().getName()); 
     assertEquals("seconds", iso.seconds().getName()); 
     assertEquals("millis", iso.millis().getName()); 
     assertEquals(false, iso.eras().isSupported()); 
     assertEquals(true, iso.centuries().isSupported()); 
     assertEquals(true, iso.years().isSupported()); 
     assertEquals(true, iso.weekyears().isSupported()); 
     assertEquals(true, iso.months().isSupported()); 
     assertEquals(true, iso.weeks().isSupported()); 
     assertEquals(true, iso.days().isSupported()); 
     assertEquals(true, iso.halfdays().isSupported()); 
     assertEquals(true, iso.hours().isSupported()); 
     assertEquals(true, iso.minutes().isSupported()); 
     assertEquals(true, iso.seconds().isSupported()); 
     assertEquals(true, iso.millis().isSupported()); 
     assertEquals(false, iso.centuries().isPrecise()); 
     assertEquals(false, iso.years().isPrecise()); 
     assertEquals(false, iso.weekyears().isPrecise()); 
     assertEquals(false, iso.months().isPrecise()); 
     assertEquals(false, iso.weeks().isPrecise()); 
     assertEquals(false, iso.days().isPrecise()); 
     assertEquals(false, iso.halfdays().isPrecise()); 
     assertEquals(true, iso.hours().isPrecise()); 
     assertEquals(true, iso.minutes().isPrecise()); 
     assertEquals(true, iso.seconds().isPrecise()); 
     assertEquals(true, iso.millis().isPrecise()); 
     final ISOChronology isoUTC = ISOChronology.getInstanceUTC(); 
     assertEquals(false, isoUTC.centuries().isPrecise()); 
     assertEquals(false, isoUTC.years().isPrecise()); 
     assertEquals(false, isoUTC.weekyears().isPrecise()); 
     assertEquals(false, isoUTC.months().isPrecise()); 
     assertEquals(true, isoUTC.weeks().isPrecise()); 
     assertEquals(true, isoUTC.days().isPrecise()); 
     assertEquals(true, isoUTC.halfdays().isPrecise()); 
     assertEquals(true, isoUTC.hours().isPrecise()); 
     assertEquals(true, isoUTC.minutes().isPrecise()); 
     assertEquals(true, isoUTC.seconds().isPrecise()); 
     assertEquals(true, isoUTC.millis().isPrecise()); 
     final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     final ISOChronology isoGMT = ISOChronology.getInstance(gmt); 
     assertEquals(false, isoGMT.centuries().isPrecise()); 
     assertEquals(false, isoGMT.years().isPrecise()); 
     assertEquals(false, isoGMT.weekyears().isPrecise()); 
     assertEquals(false, isoGMT.months().isPrecise()); 
     assertEquals(true, isoGMT.weeks().isPrecise()); 
     assertEquals(true, isoGMT.days().isPrecise()); 
     assertEquals(true, isoGMT.halfdays().isPrecise()); 
     assertEquals(true, isoGMT.hours().isPrecise()); 
     assertEquals(true, isoGMT.minutes().isPrecise()); 
     assertEquals(true, isoGMT.seconds().isPrecise()); 
     assertEquals(true, isoGMT.millis().isPrecise()); 
     final DateTimeZone offset = DateTimeZone.forOffsetHours(1); 
     final ISOChronology isoOffset1 = ISOChronology.getInstance(offset); 
     assertEquals(false, isoOffset1.centuries().isPrecise()); 
     assertEquals(false, isoOffset1.years().isPrecise()); 
     assertEquals(false, isoOffset1.weekyears().isPrecise()); 
     assertEquals(false, isoOffset1.months().isPrecise()); 
     assertEquals(true, isoOffset1.weeks().isPrecise()); 
     assertEquals(true, isoOffset1.days().isPrecise()); 
     assertEquals(true, isoOffset1.halfdays().isPrecise()); 
     assertEquals(true, isoOffset1.hours().isPrecise()); 
     assertEquals(true, isoOffset1.minutes().isPrecise()); 
     assertEquals(true, isoOffset1.seconds().isPrecise()); 
     assertEquals(true, isoOffset1.millis().isPrecise()); 
 } 


public void testMinYear538() { 
     final ISOChronology chrono = ISOChronology.getInstanceUTC(); 
     final int minYear = chrono.year().getMinimumValue(); 
     DateTime start = new DateTime(minYear, 1, 1, 0, 0, 0, 0, chrono); 
     DateTime end = new DateTime(minYear, 12, 31, 23, 59, 59, 999, chrono); 
     assertTrue(start.getMillis() < 0); 
     assertTrue(end.getMillis() > start.getMillis()); 
     assertEquals(minYear, start.getYear()); 
     assertEquals(minYear, end.getYear()); 
     long delta = end.getMillis() - start.getMillis(); 
     long expectedDelta = (start.year().isLeap() ? 366L : 365L) * DateTimeConstants.MILLIS_PER_DAY - 1; 
     assertEquals(expectedDelta, delta); 
     assertEquals(start, new DateTime(minYear + "-01-01T00:00:00.000Z", chrono)); 
     assertEquals(end, new DateTime(minYear + "-12-31T23:59:59.999Z", chrono)); 
     try { 
         start.minusYears(1); 
         fail(); 
     } catch (IllegalFieldValueException e) { 
     } 
     try { 
         end.minusYears(1); 
         fail(); 
     } catch (IllegalFieldValueException e) { 
     } 
     assertEquals(minYear - 1, chrono.year().get(Long.MIN_VALUE)); 
 } 


public void testToString637() { 
     assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance(LONDON).toString()); 
     assertEquals("ISOChronology[Asia/Tokyo]", ISOChronology.getInstance(TOKYO).toString()); 
     assertEquals("ISOChronology[Europe/London]", ISOChronology.getInstance().toString()); 
     assertEquals("ISOChronology[UTC]", ISOChronology.getInstanceUTC().toString()); 
 } 


public void testFactory_Zone1563() { 
     assertEquals(TOKYO, ISOChronology.getInstance(TOKYO).getZone()); 
     assertEquals(PARIS, ISOChronology.getInstance(PARIS).getZone()); 
     assertEquals(LONDON, ISOChronology.getInstance(null).getZone()); 
     assertSame(ISOChronology.class, ISOChronology.getInstance(TOKYO).getClass()); 
 } 


public void testWithZone1607() { 
     assertSame(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO).withZone(TOKYO)); 
     assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(LONDON)); 
     assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(TOKYO).withZone(PARIS)); 
     assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(null)); 
     assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance().withZone(PARIS)); 
     assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstanceUTC().withZone(PARIS)); 
 } 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    private void testAdd(String start, DurationFieldType type, int amt, String end) {
        DateTime dtStart = new DateTime(start, ISOChronology.getInstanceUTC());
        DateTime dtEnd = new DateTime(end, ISOChronology.getInstanceUTC());
        assertEquals(dtEnd, dtStart.withFieldAdded(type, amt));
        assertEquals(dtStart, dtEnd.withFieldAdded(type, -amt));

        DurationField field = type.getField(ISOChronology.getInstanceUTC());
        int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
        assertEquals(amt, diff);
        
        if (type == DurationFieldType.years() ||
            type == DurationFieldType.months() ||
            type == DurationFieldType.days()) {
            YearMonthDay ymdStart = new YearMonthDay(start, ISOChronology.getInstanceUTC());
            YearMonthDay ymdEnd = new YearMonthDay(end, ISOChronology.getInstanceUTC());
            assertEquals(ymdEnd, ymdStart.withFieldAdded(type, amt));
            assertEquals(ymdStart, ymdEnd.withFieldAdded(type, -amt));
        }
    }

    

    

    

}
