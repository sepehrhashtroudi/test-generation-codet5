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
import org.joda.time.DateMidnight;
import org.joda.time.DateTimeConstants;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.YearMonthDay;

/**
 * This class is a Junit unit test for GregorianChronology.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestGregorianChronology extends TestCase {

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
        return new TestSuite(TestGregorianChronology.class);
    }

    public TestGregorianChronology(String name) {
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

public void testFactory_Zone_int34() { 
     GregorianChronology chrono = GregorianChronology.getInstance(TOKYO, 2); 
     assertEquals(TOKYO, chrono.getZone()); 
     assertEquals(2, chrono.getMinimumDaysInFirstWeek()); 
     try { 
         GregorianChronology.getInstance(TOKYO, 0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         GregorianChronology.getInstance(TOKYO, 8); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testToString387() { 
     assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance(LONDON).toString()); 
     assertEquals("GregorianChronology[Asia/Tokyo]", GregorianChronology.getInstance(TOKYO).toString()); 
     assertEquals("GregorianChronology[Europe/London]", GregorianChronology.getInstance().toString()); 
     assertEquals("GregorianChronology[UTC]", GregorianChronology.getInstanceUTC().toString()); 
     assertEquals("GregorianChronology[UTC,mdfw=2]", GregorianChronology.getInstance(DateTimeZone.UTC, 2).toString()); 
 } 


public void testWithZone428() { 
     assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO).withZone(TOKYO)); 
     assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(LONDON)); 
     assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(TOKYO).withZone(PARIS)); 
     assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(null)); 
     assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance().withZone(PARIS)); 
     assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstanceUTC().withZone(PARIS)); 
 } 


public void testEquality470() { 
     assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO)); 
     assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(LONDON)); 
     assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(PARIS)); 
     assertSame(GregorianChronology.getInstanceUTC(), GregorianChronology.getInstanceUTC()); 
     assertSame(GregorianChronology.getInstance(), GregorianChronology.getInstance(LONDON)); 
 } 


public void testFactory_Zone819() { 
     assertEquals(TOKYO, GregorianChronology.getInstance(TOKYO).getZone()); 
     assertEquals(PARIS, GregorianChronology.getInstance(PARIS).getZone()); 
     assertEquals(LONDON, GregorianChronology.getInstance(null).getZone()); 
     assertSame(GregorianChronology.class, GregorianChronology.getInstance(TOKYO).getClass()); 
 } 

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

}
