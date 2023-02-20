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

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;

/**
 * This class is a Junit unit test for BuddhistChronology.
 *
 * @author Stephen Colebourne
 */
public class TestBuddhistChronology extends TestCase {

    private static int SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
    
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    private static final Chronology JULIAN_UTC = JulianChronology.getInstanceUTC();
    private static final Chronology GJ_UTC = GJChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();

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
        SKIP = 1 * DateTimeConstants.MILLIS_PER_DAY;
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestBuddhistChronology.class);
    }

    public TestBuddhistChronology(String name) {
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

public void testTimeFields64() { 
     final BuddhistChronology buddhist = BuddhistChronology.getInstance(); 
     assertEquals("halfdayOfDay", buddhist.halfdayOfDay().getName()); 
     assertEquals("clockhourOfHalfday", buddhist.clockhourOfHalfday().getName()); 
     assertEquals("hourOfHalfday", buddhist.hourOfHalfday().getName()); 
     assertEquals("clockhourOfDay", buddhist.clockhourOfDay().getName()); 
     assertEquals("hourOfDay", buddhist.hourOfDay().getName()); 
     assertEquals("minuteOfDay", buddhist.minuteOfDay().getName()); 
     assertEquals("minuteOfHour", buddhist.minuteOfHour().getName()); 
     assertEquals("secondOfDay", buddhist.secondOfDay().getName()); 
     assertEquals("secondOfMinute", buddhist.secondOfMinute().getName()); 
     assertEquals("millisOfDay", buddhist.millisOfDay().getName()); 
     assertEquals("millisOfSecond", buddhist.millisOfSecond().getName()); 
     assertEquals(true, buddhist.halfdayOfDay().isSupported()); 
     assertEquals(true, buddhist.clockhourOfHalfday().isSupported()); 
     assertEquals(true, buddhist.hourOfHalfday().isSupported()); 
     assertEquals(true, buddhist.clockhourOfDay().isSupported()); 
     assertEquals(true, buddhist.hourOfDay().isSupported()); 
     assertEquals(true, buddhist.minuteOfDay().isSupported()); 
     assertEquals(true, buddhist.minuteOfHour().isSupported()); 
     assertEquals(true, buddhist.secondOfDay().isSupported()); 
     assertEquals(true, buddhist.secondOfMinute().isSupported()); 
     assertEquals(true, buddhist.millisOfDay().isSupported()); 
     assertEquals(true, buddhist.millisOfSecond().isSupported()); 
 }

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

}
