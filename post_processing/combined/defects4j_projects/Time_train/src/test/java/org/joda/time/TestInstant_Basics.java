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

public void testPlus_long68() { 
     Instant test = new Instant(TEST_TIME1); 
     Instant result = test.plus(123456789L); 
     Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     assertEquals(expected, result); 
 } 


public void testToMutableDateTimeISO87() { 
     Instant test = new Instant(TEST_TIME1); 
     MutableDateTime result = test.toMutableDateTimeISO(); 
     assertSame(MutableDateTime.class, result.getClass()); 
     assertSame(ISOChronology.class, result.getChronology().getClass()); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 } 


public void testToDateTime_DateTimeZone393() { 
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


public void testIsEqual_RI416() { 
     Instant test1 = new Instant(TEST_TIME1); 
     Instant test1a = new Instant(TEST_TIME1); 
     assertEquals(true, test1.isEqual(test1a)); 
     assertEquals(true, test1a.isEqual(test1)); 
     assertEquals(true, test1.isEqual(test1)); 
     assertEquals(true, test1a.isEqual(test1a)); 
     Instant test2 = new Instant(TEST_TIME2); 
     assertEquals(false, test1.isEqual(test2)); 
     assertEquals(false, test2.isEqual(test1)); 
     DateTime test3 = new DateTime(TEST_TIME2, GregorianChronology.getInstance(PARIS)); 
     assertEquals(false, test1.isEqual(test3)); 
     assertEquals(false, test3.isEqual(test1)); 
     assertEquals(true, test3.isEqual(test2)); 
     assertEquals(false, test2.isEqual(new MockInstant())); 
     assertEquals(true, test1.isEqual(new MockInstant())); 
     assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqual(null)); 
     assertEquals(true, new Instant(TEST_TIME_NOW).isEqual(null)); 
     assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqual(null)); 
 } 


public void testMinus_RD485() { 
     Instant test = new Instant(TEST_TIME1); 
     Instant result = test.minus(new Duration(123456789L)); 
     Instant expected = new Instant(TEST_TIME1 - 123456789L); 
     assertEquals(expected, result); 
     result = test.minus((ReadableDuration) null); 
     assertSame(test, result); 
 } 


public void testGet_DateTimeField587() { 
     Instant test = new Instant(); 
     assertEquals(1, test.get(ISOChronology.getInstance().era())); 
     assertEquals(20, test.get(ISOChronology.getInstance().centuryOfEra())); 
     assertEquals(2, test.get(ISOChronology.getInstance().yearOfCentury())); 
     assertEquals(2002, test.get(ISOChronology.getInstance().yearOfEra())); 
     assertEquals(2002, test.get(ISOChronology.getInstance().year())); 
     assertEquals(6, test.get(ISOChronology.getInstance().monthOfYear())); 
     assertEquals(9, test.get(ISOChronology.getInstance().dayOfMonth())); 
     assertEquals(2002, test.get(ISOChronology.getInstance().weekyear())); 
     assertEquals(23, test.get(ISOChronology.getInstance().weekOfWeekyear())); 
     assertEquals(7, test.get(ISOChronology.getInstance().dayOfWeek())); 
     assertEquals(160, test.get(ISOChronology.getInstance().dayOfYear())); 
     assertEquals(0, test.get(ISOChronology.getInstance().halfdayOfDay())); 
     assertEquals(1, test.get(ISOChronology.getInstance().hourOfHalfday())); 
     assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfDay())); 
     assertEquals(1, test.get(ISOChronology.getInstance().clockhourOfHalfday())); 
     assertEquals(1, test.get(ISOChronology.getInstance().hourOfDay())); 
     assertEquals(0, test.get(ISOChronology.getInstance().minuteOfHour())); 
     assertEquals(60, test.get(ISOChronology.getInstance().minuteOfDay())); 
     assertEquals(0, test.get(ISOChronology.getInstance().secondOfMinute())); 
     assertEquals(60 * 60, test.get(ISOChronology.getInstance().secondOfDay())); 
     assertEquals(0, test.get(ISOChronology.getInstance().millisOfSecond())); 
     assertEquals(60 * 60 * 1000, test.get(ISOChronology.getInstance().millisOfDay())); 
     try { 
         test.get((DateTimeField) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testIsBeforeNow657() { 
     assertEquals(true, new Instant(TEST_TIME_NOW - 1).isBeforeNow()); 
     assertEquals(false, new Instant(TEST_TIME_NOW).isBeforeNow()); 
     assertEquals(false, new Instant(TEST_TIME_NOW + 1).isBeforeNow()); 
 } 


public void testToMutableDateTime_Chronology756() { 
     Instant test = new Instant(TEST_TIME1); 
     MutableDateTime result = test.toMutableDateTime(ISOChronology.getInstance()); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(ISOChronology.getInstance(), result.getChronology()); 
     test = new Instant(TEST_TIME1); 
     result = test.toMutableDateTime(GregorianChronology.getInstance(PARIS)); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(GregorianChronology.getInstance(PARIS), result.getChronology()); 
     test = new Instant(TEST_TIME1); 
     result = test.toMutableDateTime((Chronology) null); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 } 


public void testPlus_RD1064() { 
     Instant test = new Instant(TEST_TIME1); 
     Instant result = test.plus(new Duration(123456789L)); 
     Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     assertEquals(expected, result); 
     result = test.plus((ReadableDuration) null); 
     assertSame(test, result); 
 } 


public void testMinus_long1092() { 
     Instant test = new Instant(TEST_TIME1); 
     Instant result = test.minus(123456789L); 
     Instant expected = new Instant(TEST_TIME1 - 123456789L); 
     assertEquals(expected, result); 
 } 


public void testIsEqualNow1379() { 
     assertEquals(false, new Instant(TEST_TIME_NOW - 1).isEqualNow()); 
     assertEquals(true, new Instant(TEST_TIME_NOW).isEqualNow()); 
     assertEquals(false, new Instant(TEST_TIME_NOW + 1).isEqualNow()); 
 } 


public void testToInstant1385() { 
     Instant test = new Instant(TEST_TIME1); 
     Instant result = test.toInstant(); 
     assertSame(test, result); 
 } 


public void testWithDurationAdded_long_int1541() { 
     Instant test = new Instant(TEST_TIME1); 
     Instant result = test.withDurationAdded(123456789L, 1); 
     Instant expected = new Instant(TEST_TIME1 + 123456789L); 
     assertEquals(expected, result); 
     result = test.withDurationAdded(123456789L, 0); 
     assertSame(test, result); 
     result = test.withDurationAdded(123456789L, 2); 
     expected = new Instant(TEST_TIME1 + (2L * 123456789L)); 
     assertEquals(expected, result); 
     result = test.withDurationAdded(123456789L, -3); 
     expected = new Instant(TEST_TIME1 - (3L * 123456789L)); 
     assertEquals(expected, result); 
 } 


public void testToDateTimeISO1569() { 
     Instant test = new Instant(TEST_TIME1); 
     DateTime result = test.toDateTimeISO(); 
     assertSame(DateTime.class, result.getClass()); 
     assertSame(ISOChronology.class, result.getChronology().getClass()); 
     assertEquals(test.getMillis(), result.getMillis()); 
     assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 } 


public void testToDateTime1693() { 
     Instant test = new Instant(TEST_TIME1); 
     DateTime result = test.toDateTime(); 
     assertEquals(TEST_TIME1, result.getMillis()); 
     assertEquals(ISOChronology.getInstance(), result.getChronology()); 
 } 

    

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
