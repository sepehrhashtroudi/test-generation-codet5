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
package org.joda.time;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.EthiopicChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;
import org.joda.time.chrono.JulianChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.LimitChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.chrono.ZonedChronology;

/**
 * This class is a Junit unit test for Chronology.
 *
 * @author Stephen Colebourne
 */
public class TestChronology extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

//    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
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
        return new TestSuite(TestChronology.class);
    }

    public TestChronology(String name) {
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

public void test_setHourOfDay21() { 
     Chronology zone = StrictChronology.getInstance(ISOChronology.getInstanceUTC()); 
     DateTime dt = new DateTime(2007, 1, 1, 0, 0, 0, 0, zone); 
     assertEquals("2007-01-01T00:00:00.000Z", dt.toString()); 
     dt = dt.withHourOfDay(24); 
     assertEquals("2007-01-02T00:00:00.000Z", dt.toString()); 
     dt = dt.withHourOfDay(-1); 
     assertEquals("2007-01-01T23:00:00.000Z", dt.toString()); 
 }


public void testPropertyEqualsHashCodeStrict179() { 
     YearMonthDay test1 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     YearMonthDay test2 = new YearMonthDay(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }


public void test_setHourOfDay180() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     TimeOfDay copy = test.hourOfDay().setCopy(12); 
     check(test, 10, 20, 30, 40); 
     check(copy, 12, 20, 30, 40); 
     try { 
         test.hourOfDay().setCopy(13); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.hourOfDay().setCopy(0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void testToString181() { 
     assertEquals("ZonedChronology[Europe/London]", ZonedChronology.getInstance(LONDON).toString()); 
     assertEquals("ZonedChronology[Asia/Tokyo]", ZonedChronology.getInstance(TOKYO).toString()); 
     assertEquals("ZonedChronology[Europe/London]", ZonedChronology.getInstance().toString()); 
     assertEquals("ZonedChronology[UTC]", ZonedChronology.getInstanceUTC().toString()); 
 }


public void testPropertyEqualsHashCodeLenient182() { 
     YearMonthDay test1 = new YearMonthDay(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     YearMonthDay test2 = new YearMonthDay(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 }


public void test_setHourOfDay183() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     TimeOfDay copy = test.hourOfDay().setCopy(12); 
     check(test, 10, 20, 30, 40); 
     check(copy, 12, 20, 30, 40); 
     try { 
         test.hourOfDay().setCopy(60); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.hourOfDay().setCopy(-1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
