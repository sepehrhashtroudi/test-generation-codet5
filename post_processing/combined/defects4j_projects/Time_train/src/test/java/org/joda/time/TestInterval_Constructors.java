/*
 *  Copyright 2001-2006 Stephen Colebourne
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
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.IntervalConverter;

/**
 * This class is a JUnit test for Interval.
 *
 * @author Stephen Colebourne
 */
public class TestInterval_Constructors extends TestCase {
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
            
//    // 2002-04-05
//    private long TEST_TIME1 =
//            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 12L * DateTimeConstants.MILLIS_PER_HOUR
//            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
//        
//    // 2003-05-06
//    private long TEST_TIME2 =
//            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
//            + 14L * DateTimeConstants.MILLIS_PER_HOUR
//            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestInterval_Constructors.class);
    }

    public TestInterval_Constructors(String name) {
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

public void testConstructor_RI_RP6325() throws Throwable { 
     DateTime dt = new DateTime(TEST_TIME_NOW); 
     Interval test = new Interval(dt, (ReadablePeriod) null); 
     assertEquals(dt.getMillis(), test.getStartMillis()); 
     assertEquals(dt.getMillis(), test.getEndMillis()); 
 } 


public void testConstructor_RD_RI3599() throws Throwable { 
     DateTime dt = new DateTime(TEST_TIME_NOW); 
     Interval test = new Interval((ReadableDuration) null, dt); 
     assertEquals(dt.getMillis(), test.getStartMillis()); 
     assertEquals(dt.getMillis(), test.getEndMillis()); 
 } 


public void testConstructor_long_long2646() throws Throwable { 
     DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     Interval test = new Interval(dt1.getMillis(), dt1.getMillis()); 
     assertEquals(dt1.getMillis(), test.getStartMillis()); 
     assertEquals(dt1.getMillis(), test.getEndMillis()); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 } 


public void testConstructor_Object4759() throws Throwable { 
     MockInterval base = new MockInterval(); 
     Interval test = new Interval(base); 
     assertEquals(base.getStartMillis(), test.getStartMillis()); 
     assertEquals(base.getEndMillis(), test.getEndMillis()); 
 } 


public void testConstructor_RI_RD4807() throws Throwable { 
     long result = TEST_TIME_NOW; 
     result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     Duration dur = new Duration(result - TEST_TIME_NOW); 
     Interval test = new Interval((ReadableInstant) null, dur); 
     assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     assertEquals(result, test.getEndMillis()); 
 } 


public void testConstructor_RI_RP71027() throws Throwable { 
     Period dur = new Period(0, 6, 0, 0, 1, 0, 0, 0); 
     long result = TEST_TIME_NOW; 
     result = ISOChronology.getInstance().monthOfYear().add(result, 6); 
     result = ISOChronology.getInstance().hourOfDay().add(result, 1); 
     Interval test = new Interval((ReadableInstant) null, dur); 
     assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     assertEquals(result, test.getEndMillis()); 
 } 


public void testConstructor_long_long_nullZone1132() throws Throwable { 
     DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     Interval test = new Interval(dt1.getMillis(), dt2.getMillis(), (DateTimeZone) null); 
     assertEquals(dt1.getMillis(), test.getStartMillis()); 
     assertEquals(dt2.getMillis(), test.getEndMillis()); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 } 


public void testConstructor_Object61323() throws Throwable { 
     IntervalConverter oldConv = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 0L)); 
     IntervalConverter conv = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) { 
             return false; 
         } 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) { 
             interval.setChronology(chrono); 
             interval.setInterval(1234L, 5678L); 
         } 
  
         public Class<?> getSupportedType() { 
             return ReadableInterval.class; 
         } 
     }; 
     try { 
         ConverterManager.getInstance().addIntervalConverter(conv); 
         Interval base = new Interval(-1000L, 1000L); 
         Interval test = new Interval(base); 
         assertEquals(1234L, test.getStartMillis()); 
         assertEquals(5678L, test.getEndMillis()); 
     } finally { 
         ConverterManager.getInstance().addIntervalConverter(oldConv); 
     } 
 } 


public void testConstructor_RP_RI81530() throws Throwable { 
     DateTime dt = new DateTime(TEST_TIME_NOW); 
     Period dur = new Period(0, 0, 0, 0, 0, 0, 0, -1); 
     try { 
         new Interval(dur, dt); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testConstructor_Object_Chronology21636() throws Throwable { 
     DateTime dt1 = new DateTime(2004, 6, 9, 0, 0, 0, 0); 
     DateTime dt2 = new DateTime(2005, 7, 10, 1, 1, 1, 1); 
     Interval base = new Interval(dt1, dt2); 
     Interval test = new Interval(base, null); 
     assertEquals(dt1.getMillis(), test.getStartMillis()); 
     assertEquals(dt2.getMillis(), test.getEndMillis()); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
 } 


public void testConstructor_RI_RI31654() throws Throwable { 
     Interval test = new Interval((ReadableInstant) null, (ReadableInstant) null); 
     assertEquals(TEST_TIME_NOW, test.getStartMillis()); 
     assertEquals(TEST_TIME_NOW, test.getEndMillis()); 
 } 


public void testParse_noFormatter1752() throws Throwable { 
     DateTime start = new DateTime(2010, 6, 30, 12, 30, ISOChronology.getInstance(PARIS)); 
     DateTime end = new DateTime(2010, 7, 1, 14, 30, ISOChronology.getInstance(PARIS)); 
     assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/2010-07-01T14:30")); 
     assertEquals(new Interval(start, end), Interval.parse("2010-06-30T12:30/P1DT2H")); 
     assertEquals(new Interval(start, end), Interval.parse("P1DT2H/2010-07-01T14:30")); 
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
    

    

    

    

    

    

    class MockInterval implements ReadableInterval {
        public Chronology getChronology() {
            return ISOChronology.getInstance();
        }
        public long getStartMillis() {
            return 1234L;
        }
        public DateTime getStart() {
            return new DateTime(1234L);
        }
        public long getEndMillis() {
            return 5678L;
        }
        public DateTime getEnd() {
            return new DateTime(5678L);
        }
        public long toDurationMillis() {
            return (5678L - 1234L);
        }
        public Duration toDuration() {
            return new Duration(5678L - 1234L);
        }
        public boolean contains(long millisInstant) {
            return false;
        }
        public boolean containsNow() {
            return false;
        }
        public boolean contains(ReadableInstant instant) {
            return false;
        }
        public boolean contains(ReadableInterval interval) {
            return false;
        }
        public boolean overlaps(ReadableInterval interval) {
            return false;
        }
        public boolean isBefore(ReadableInstant instant) {
            return false;
        }
        public boolean isBefore(ReadableInterval interval) {
            return false;
        }
        public boolean isAfter(ReadableInstant instant) {
            return false;
        }
        public boolean isAfter(ReadableInterval interval) {
            return false;
        }
        public Interval toInterval() {
            return null;
        }
        public MutableInterval toMutableInterval() {
            return null;
        }
        public Period toPeriod() {
            return null;
        }
        public Period toPeriod(PeriodType type) {
            return null;
        }
    }

    //-----------------------------------------------------------------------
    

    

}
