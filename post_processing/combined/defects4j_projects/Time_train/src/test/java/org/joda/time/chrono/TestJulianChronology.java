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

import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for JulianChronology.
 *
 * @author Stephen Colebourne
 */
public class TestJulianChronology extends TestCase {

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
        return new TestSuite(TestJulianChronology.class);
    }

    public TestJulianChronology(String name) {
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

public void testToString274() { 
     assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance(LONDON).toString()); 
     assertEquals("JulianChronology[Asia/Tokyo]", JulianChronology.getInstance(TOKYO).toString()); 
     assertEquals("JulianChronology[Europe/London]", JulianChronology.getInstance().toString()); 
     assertEquals("JulianChronology[UTC]", JulianChronology.getInstanceUTC().toString()); 
     assertEquals("JulianChronology[UTC,mdfw=2]", JulianChronology.getInstance(DateTimeZone.UTC, 2).toString()); 
 } 


public void testDurationFields350() { 
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
     assertEquals(false, julian.weeks().isPrecise()); 
     assertEquals(false, julian.days().isPrecise()); 
     assertEquals(false, julian.halfdays().isPrecise()); 
     assertEquals(true, julian.hours().isPrecise()); 
     assertEquals(true, julian.minutes().isPrecise()); 
     assertEquals(true, julian.seconds().isPrecise()); 
     assertEquals(true, julian.millis().isPrecise()); 
     final JulianChronology julianUTC = JulianChronology.getInstanceUTC(); 
     assertEquals(false, julianUTC.centuries().isPrecise()); 
     assertEquals(false, julianUTC.years().isPrecise()); 
     assertEquals(false, julianUTC.weekyears().isPrecise()); 
     assertEquals(false, julianUTC.months().isPrecise()); 
     assertEquals(true, julianUTC.weeks().isPrecise()); 
     assertEquals(true, julianUTC.days().isPrecise()); 
     assertEquals(true, julianUTC.halfdays().isPrecise()); 
     assertEquals(true, julianUTC.hours().isPrecise()); 
     assertEquals(true, julianUTC.minutes().isPrecise()); 
     assertEquals(true, julianUTC.seconds().isPrecise()); 
     assertEquals(true, julianUTC.millis().isPrecise()); 
     final DateTimeZone gmt = DateTimeZone.forID("Etc/GMT"); 
     final JulianChronology julianGMT = JulianChronology.getInstance(gmt); 
     assertEquals(false, julianGMT.centuries().isPrecise()); 
     assertEquals(false, julianGMT.years().isPrecise()); 
     assertEquals(false, julianGMT.weekyears().isPrecise()); 
     assertEquals(false, julianGMT.months().isPrecise()); 
     assertEquals(true, julianGMT.weeks().isPrecise()); 
     assertEquals(true, julianGMT.days().isPrecise()); 
     assertEquals(true, julianGMT.halfdays().isPrecise()); 
     assertEquals(true, julianGMT.hours().isPrecise()); 
     assertEquals(true, julianGMT.minutes().isPrecise()); 
     assertEquals(true, julianGMT.seconds().isPrecise()); 
     assertEquals(true, julianGMT.millis().isPrecise()); 
 } 


public void testWithZone358() { 
     assertSame(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO).withZone(TOKYO)); 
     assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(LONDON)); 
     assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(TOKYO).withZone(PARIS)); 
     assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(null)); 
     assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance().withZone(PARIS)); 
     assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstanceUTC().withZone(PARIS)); 
 } 


public void testFactory_Zone_int701() { 
     JulianChronology chrono = JulianChronology.getInstance(TOKYO, 2); 
     assertEquals(TOKYO, chrono.getZone()); 
     assertEquals(2, chrono.getMinimumDaysInFirstWeek()); 
     try { 
         JulianChronology.getInstance(TOKYO, 0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         JulianChronology.getInstance(TOKYO, 8); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testFactory_Zone1365() { 
     assertEquals(TOKYO, JulianChronology.getInstance(TOKYO).getZone()); 
     assertEquals(PARIS, JulianChronology.getInstance(PARIS).getZone()); 
     assertEquals(LONDON, JulianChronology.getInstance(null).getZone()); 
     assertSame(JulianChronology.class, JulianChronology.getInstance(TOKYO).getClass()); 
 } 

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

}
