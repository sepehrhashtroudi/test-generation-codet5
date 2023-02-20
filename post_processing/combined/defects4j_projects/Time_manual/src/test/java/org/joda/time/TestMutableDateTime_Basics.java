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
import org.joda.time.chrono.BaseChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.UnsupportedDateTimeField;
import org.joda.time.field.UnsupportedDurationField;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a JUnit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Basics extends TestCase {
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
        return new TestSuite(TestMutableDateTime_Basics.class);
    }

    public TestMutableDateTime_Basics(String name) {
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

public void testSetDateTime_int_int_int_int_int_int_int19() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     test.setDateTime(2010, 12, 3, 5, 6, 7, 8); 
     assertEquals(2010, test.getYear()); 
     assertEquals(12, test.getMonthOfYear()); 
     assertEquals(3, test.getDayOfMonth()); 
     assertEquals(5, test.getHourOfDay()); 
     assertEquals(6, test.getMinuteOfHour()); 
     assertEquals(7, test.getSecondOfMinute()); 
     assertEquals(8, test.getMillisOfSecond()); 
 }


public void testIsBefore_LocalDateTime49() { 
     LocalDateTime test1 = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     LocalDateTime test1a = new LocalDateTime(2005, 6, 2, 10, 20, 30, 40); 
     assertEquals(false, test1.isBefore(test1a)); 
     assertEquals(false, test1a.isBefore(test1)); 
     assertEquals(false, test1.isBefore(test1)); 
     assertEquals(false, test1a.isBefore(test1a)); 
     LocalDateTime test2 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40); 
     assertEquals(true, test1.isBefore(test2)); 
     assertEquals(false, test2.isBefore(test1)); 
     LocalDateTime test3 = new LocalDateTime(2005, 7, 2, 10, 20, 30, 40, GREGORIAN_UTC); 
     assertEquals(true, test1.isBefore(test3)); 
     assertEquals(false, test3.isBefore(test1)); 
     assertEquals(false, test3.isBefore(test2)); 
     try { 
         new LocalDateTime(2005, 7, 2, 10, 20, 30, 40).isBefore(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void testSampleDate297() { 
     DateTime dt = new DateTime(2005, 11, 26, 0, 0, 0, 0, ISO_UTC); 
     dt = dt.withChronology(ISLAMIC_UTC); 
     assertEquals(IslamicChronology.AH, dt.getEra()); 
     assertEquals(15, dt.getCenturyOfEra()); 
     assertEquals(26, dt.getYearOfCentury()); 
     assertEquals(1426, dt.getYearOfEra()); 
     assertEquals(1426, dt.getYear()); 
     Property fld = dt.year(); 
     assertEquals(true, fld.isLeap()); 
     assertEquals(1, fld.getLeapAmount()); 
     assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     assertEquals(10, dt.getMonthOfYear()); 
     fld = dt.monthOfYear(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(DurationFieldType.days(), fld.getLeapDurationField().getType()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(12, fld.getMaximumValue()); 
     assertEquals(12, fld.getMaximumValueOverall()); 
     assertEquals(24, dt.getDayOfMonth()); 
     fld = dt.dayOfMonth(); 
     assertEquals(false, fld.isLeap()); 
     assertEquals(0, fld.getLeapAmount()); 
     assertEquals(null, fld.getLeapDurationField()); 
     assertEquals(1, fld.getMinimumValue()); 
     assertEquals(1, fld.getMinimumValueOverall()); 
     assertEquals(29, fld.getMaximumValue()); 
     assertEquals(30, fld.getMaximumValueOverall()); 
     assertEquals(DateTimeConstants.SATURDAY, dt.get

    

    //-----------------------------------------------------------------------
    

    

    

    
    
    class MockInstant extends AbstractInstant {
        public String toString() {
            return null;
        }
        public long getMillis() {
            return TEST_TIME1;
        }
        public Chronology getChronology() {
            return ISOChronology.getInstance();
        }
    }

    class MockEqualsChronology extends BaseChronology {
        private static final long serialVersionUID = 1L;
        public boolean equals(Object obj) {
            return obj instanceof MockEqualsChronology;
        }
        public DateTimeZone getZone() {
            return null;
        }
        public Chronology withUTC() {
            return this;
        }
        public Chronology withZone(DateTimeZone zone) {
            return this;
        }
        public String toString() {
            return "";
        }
    }

    
    
    
    
    
    
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
