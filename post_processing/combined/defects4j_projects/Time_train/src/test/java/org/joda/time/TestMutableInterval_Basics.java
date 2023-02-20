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
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Instant.
 *
 * @author Stephen Colebourne
 */
public class TestMutableInterval_Basics extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    
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
        return new TestSuite(TestMutableInterval_Basics.class);
    }

    public TestMutableInterval_Basics(String name) {
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

public void testCopy139() { 
     MutableInterval test = new MutableInterval(123L, 456L, COPTIC_PARIS); 
     MutableInterval cloned = test.copy(); 
     assertEquals(test, cloned); 
     assertNotSame(test, cloned); 
 } 


public void testOverlaps_RInterval329() { 
     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     assertEquals(false, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1))); 
     assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1))); 
     assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1 + 1))); 
     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); 
     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + 1, TEST_TIME1 + 1))); 
     assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2))); 
     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2))); 
     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2))); 
     assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2))); 
     assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2))); 
     assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2 + 1))); 
     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1))); 
     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 + 1))); 
     assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2 + 1))); 
     assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2 + 1))); 
     assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 - 1))); 
     assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1))); 
     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); 
     assertEquals(true, test.overlaps((ReadableInterval) null)); 
     MutableInterval empty = new MutableInterval(TEST_TIME1, TEST_TIME1); 
     assertEquals(false, empty.overlaps(empty)); 
     assertEquals(false, empty.overlaps(test)); 
     assertEquals(false, test.overlaps(empty)); 
 } 


public void testToMutableInterval11191() { 
     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     MutableInterval result = test.toMutableInterval(); 
     assertEquals(test, result); 
     assertNotSame(test, result); 
 } 


public void testToInterval11233() { 
     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); 
     Interval result = test.toInterval(); 
     assertEquals(test, result); 
 } 


public void testEqualsHashCode1368() { 
     MutableInterval test1 = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     MutableInterval test2 = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     assertEquals(true, test1.equals(test2)); 
     assertEquals(true, test2.equals(test1)); 
     assertEquals(true, test1.equals(test1)); 
     assertEquals(true, test2.equals(test2)); 
     assertEquals(true, test1.hashCode() == test2.hashCode()); 
     assertEquals(true, test1.hashCode() == test1.hashCode()); 
     assertEquals(true, test2.hashCode() == test2.hashCode()); 
     MutableInterval test3 = new MutableInterval(TEST_TIME_NOW, TEST_TIME2); 
     assertEquals(false, test1.equals(test3)); 
     assertEquals(false, test2.equals(test3)); 
     assertEquals(false, test3.equals(test1)); 
     assertEquals(false, test3.equals(test2)); 
     assertEquals(false, test1.hashCode() == test3.hashCode()); 
     assertEquals(false, test2.hashCode() == test3.hashCode()); 
     MutableInterval test4 = new MutableInterval(TEST_TIME1, TEST_TIME2, GJChronology.getInstance()); 
     assertEquals(true, test4.equals(test4)); 
     assertEquals(false, test1.equals(test4)); 
     assertEquals(false, test2.equals(test4)); 
     assertEquals(false, test4.equals(test1)); 
     assertEquals(false, test4.equals(test2)); 
     assertEquals(false, test1.hashCode() == test4.hashCode()); 
     assertEquals(false, test2.hashCode() == test4.hashCode()); 
     MutableInterval test5 = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     assertEquals(true, test1.equals(test5)); 
     assertEquals(true, test2.equals(test5)); 
     assertEquals(false, test3.equals(test5)); 
     assertEquals(true, test5.equals(test1)); 
     assertEquals(true, test5.equals(test2)); 
     assertEquals(false, test5.equals(test3)); 
     assertEquals(true, test1.hashCode() == test5.hashCode()); 
     assertEquals(true, test2.hashCode() == test5.hashCode()); 
     assertEquals(false, test3.hashCode() == test5.hashCode()); 
     assertEquals(false, test1.equals("Hello")); 
     assertEquals(true, test1.equals(new MockInterval())); 
     assertEquals(false, test1.equals(new DateTime(TEST_TIME1))); 
 } 


public void testIsBefore_RI1401() { 
     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     assertEquals(false, test.isBefore(new Instant(TEST_TIME1 - 1))); 
     assertEquals(false, test.isBefore(new Instant(TEST_TIME1))); 
     assertEquals(false, test.isBefore(new Instant(TEST_TIME1 + 1))); 
     assertEquals(false, test.isBefore(new Instant(TEST_TIME2 - 1))); 
     assertEquals(true, test.isBefore(new Instant(TEST_TIME2))); 
     assertEquals(true, test.isBefore(new Instant(TEST_TIME2 + 1))); 
     assertEquals(false, test.isBefore((ReadableInstant) null)); 
 } 


public void testIsBefore_RInterval1487() { 
     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1))); 
     assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1))); 
     assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1))); 
     assertEquals(false, test.isBefore(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE))); 
     assertEquals(true, test.isBefore(new Interval(TEST_TIME2, Long.MAX_VALUE))); 
     assertEquals(true, test.isBefore(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE))); 
     assertEquals(false, test.isBefore((ReadableInterval) null)); 
 } 


public void testIsAfter_RInterval1554() { 
     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); 
     assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1))); 
     assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1))); 
     assertEquals(false, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1))); 
     assertEquals(false, test.isAfter(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE))); 
     assertEquals(false, test.isAfter(new Interval(TEST_TIME2, Long.MAX_VALUE))); 
     assertEquals(false, test.isAfter(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE))); 
     assertEquals(false, test.isAfter((ReadableInterval) null)); 
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
    
    


}
