/*
 *  Copyright 2001-2009 Stephen Colebourne
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
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestInstant_Basics extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
        return new TestSuite(TestInstant_Basics.class);
    }

    public TestInstant_Basics(String name) {
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

public void testToDateTime_DateTimeZone296() { 
     Instant test = new Instant(TEST_TIME1); 
     DateTime result = test.toDateTime(LONDON); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(ISOChronology.getInstance(LONDON), result.getChronology()); 
     test = new Instant(TEST_TIME1); 
     result = test.toDateTime(PARIS); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(ISOChronology.getInstance(PARIS), result.getChronology()); 
     test = new Instant(TEST_TIME1); 
     result = test.toDateTime((DateTimeZone) null); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 }


public void testConstructor297() throws Throwable { 
     Instant test = new Instant(); 
     assertEquals(ISOChronology.getInstanceUTC(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 }


public void test_yearOfEra298() throws Exception { 
     assertEquals(DateTimeFieldType.yearOfEra(), DateTimeFieldType.yearOfEra()); 
     assertEquals("yearOfEra", DateTimeFieldType.yearOfEra().getName()); 
     assertEquals(DurationFieldType.years(), DateTimeFieldType.yearOfEra().getDurationType()); 
     assertEquals(DurationFieldType.eras(), DateTimeFieldType.yearOfEra().getRangeDurationType()); 
     assertEquals(CopticChronology.getInstanceUTC().yearOfEra(), DateTimeFieldType.yearOfEra().getField(CopticChronology.getInstanceUTC())); 
     assertEquals(CopticChronology.getInstanceUTC().yearOfEra().isSupported(), DateTimeFieldType.yearOfEra().isSupported(CopticChronology.getInstanceUTC())); 
     assertSerialization(DateTimeFieldType.yearOfEra()); 
 }


public void testGet_DateTimeFieldType299() { 
     Instant test = new Instant(); 
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
         test.get((DateTimeFieldType

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInstant extends AbstractInstant {
        public String toString() {
            return null;
        }
        public long getMillis() {
            return TEST_TIME1;
        }
        public Chronology getChronology() {
            return ISOChronology.getInstanceUTC();
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
    

}
