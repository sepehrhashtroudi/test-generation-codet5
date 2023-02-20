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
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for LocalTime.
 *
 * @author Stephen Colebourne
 */
public class TestLocalTime_Basics extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);

    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;

//    private long TEST_TIME1 =
//        1L * DateTimeConstants.MILLIS_PER_HOUR
//        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
//        + 3L * DateTimeConstants.MILLIS_PER_SECOND
//        + 4L;

    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    private DateTimeZone zone = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestLocalTime_Basics.class);
    }

    public TestLocalTime_Basics(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
    }

    //-----------------------------------------------------------------------

@SuppressWarnings("deprecation") 
 public void testEqualsHashCode31() { 
     LocalTime test1 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     LocalTime test2 = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     assertEquals(true, test1.equals(test2)); 
     assertEquals(true, test2.equals(test1)); 
     assertEquals(true, test1.equals(test1)); 
     assertEquals(true, test2.equals(test2)); 
     assertEquals(true, test1.hashCode() == test2.hashCode()); 
     assertEquals(true, test1.hashCode() == test1.hashCode()); 
     assertEquals(true, test2.hashCode() == test2.hashCode()); 
     LocalTime test3 = new LocalTime(15, 20, 30, 40); 
     assertEquals(false, test1.equals(test3)); 
     assertEquals(false, test2.equals(test3)); 
     assertEquals(false, test3.equals(test1)); 
     assertEquals(false, test3.equals(test2)); 
     assertEquals(false, test1.hashCode() == test3.hashCode()); 
     assertEquals(false, test2.hashCode() == test3.hashCode()); 
     assertEquals(false, test1.equals("Hello")); 
     assertEquals(true, test1.equals(new TimeOfDay(10, 20, 30, 40, COPTIC_UTC))); 
     assertEquals(true, test1.hashCode() == new TimeOfDay(10, 20, 30, 40, COPTIC_UTC).hashCode()); 
     assertEquals(true, test1.equals(new MockInstant())); 
     assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); 
 } 


public void testWithers79() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     check(test.withHourOfDay(6), 6, 20, 30, 40); 
     check(test.withMinuteOfHour(6), 10, 6, 30, 40); 
     check(test.withSecondOfMinute(6), 10, 20, 6, 40); 
     check(test.withMillisOfSecond(6), 10, 20, 30, 6); 
     check(test.withMillisOfDay(61234), 0, 1, 1, 234); 
     try { 
         test.withHourOfDay(-1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.withHourOfDay(24); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testWithFieldAdded_DurationFieldType_int_8148() { 
     LocalTime test = new LocalTime(0, 0, 0, 0); 
     LocalTime result = test.withFieldAdded(DurationFieldType.millis(), -1); 
     assertEquals(new LocalTime(23, 59, 59, 999), result); 
     test = new LocalTime(0, 0, 0, 0); 
     result = test.withFieldAdded(DurationFieldType.seconds(), -1); 
     assertEquals(new LocalTime(23, 59, 59, 0), result); 
     test = new LocalTime(0, 0, 0, 0); 
     result = test.withFieldAdded(DurationFieldType.minutes(), -1); 
     assertEquals(new LocalTime(23, 59, 0, 0), result); 
     test = new LocalTime(0, 0, 0, 0); 
     result = test.withFieldAdded(DurationFieldType.hours(), -1); 
     assertEquals(new LocalTime(23, 0, 0, 0), result); 
 } 


public void testToString_String154() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     assertEquals("10:20:30.040", test.toString((String) null)); 
 } 


public void testMinusSeconds_int271() { 
     LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     LocalTime result = test.minusSeconds(1); 
     LocalTime expected = new LocalTime(1, 2, 2, 4, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusSeconds(0); 
     assertSame(test, result); 
 } 


public void testWithFieldAdded_DurationFieldType_int_1301() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     assertEquals(new LocalTime(10, 20, 30, 40), test); 
     assertEquals(new LocalTime(16, 20, 30, 40), result); 
 } 


public void testProperty391() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     assertEquals(test.hourOfDay(), test.property(DateTimeFieldType.hourOfDay())); 
     assertEquals(test.minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour())); 
     assertEquals(test.secondOfMinute(), test.property(DateTimeFieldType.secondOfMinute())); 
     assertEquals(test.millisOfSecond(), test.property(DateTimeFieldType.millisOfSecond())); 
     assertEquals(test.millisOfDay(), test.property(DateTimeFieldType.millisOfDay())); 
     assertEquals(test, test.property(DateTimeFieldType.minuteOfDay()).getLocalTime()); 
     assertEquals(test, test.property(DateTimeFieldType.secondOfDay()).getLocalTime()); 
     assertEquals(test, test.property(DateTimeFieldType.millisOfDay()).getLocalTime()); 
     assertEquals(test, test.property(DateTimeFieldType.hourOfHalfday()).getLocalTime()); 
     assertEquals(test, test.property(DateTimeFieldType.halfdayOfDay()).getLocalTime()); 
     assertEquals(test, test.property(DateTimeFieldType.clockhourOfHalfday()).getLocalTime()); 
     assertEquals(test, test.property(DateTimeFieldType.clockhourOfDay()).getLocalTime()); 
     try { 
         test.property(DateTimeFieldType.dayOfWeek()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.property(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testToString_String_Locale401() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     assertEquals("10:20:30.040", test.toString(null, Locale.ENGLISH)); 
     assertEquals("10 20", test.toString("H m", null)); 
     assertEquals("10:20:30.040", test.toString(null, null)); 
 } 


public void testIsEqual_LocalTime523() { 
     LocalTime test1 = new LocalTime(10, 20, 30, 40); 
     LocalTime test1a = new LocalTime(10, 20, 30, 40); 
     assertEquals(true, test1.isEqual(test1a)); 
     assertEquals(true, test1a.isEqual(test1)); 
     assertEquals(true, test1.isEqual(test1)); 
     assertEquals(true, test1a.isEqual(test1a)); 
     LocalTime test2 = new LocalTime(10, 20, 35, 40); 
     assertEquals(false, test1.isEqual(test2)); 
     assertEquals(false, test2.isEqual(test1)); 
     LocalTime test3 = new LocalTime(10, 20, 35, 40, GregorianChronology.getInstanceUTC()); 
     assertEquals(false, test1.isEqual(test3)); 
     assertEquals(false, test3.isEqual(test1)); 
     assertEquals(true, test3.isEqual(test2)); 
     try { 
         new LocalTime(10, 20, 35, 40).isEqual(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testMinusMillis_int559() { 
     LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     LocalTime result = test.minusMillis(1); 
     LocalTime expected = new LocalTime(1, 2, 3, 3, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusMillis(0); 
     assertSame(test, result); 
 } 


public void testMinusMinutes_int564() { 
     LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     LocalTime result = test.minusMinutes(1); 
     LocalTime expected = new LocalTime(1, 1, 3, 4, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusMinutes(0); 
     assertSame(test, result); 
 } 


public void testToDateTimeToday_nullZone694() { 
     LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     DateTime test = base.toDateTimeToday((DateTimeZone) null); 
     check(base, 10, 20, 30, 40); 
     DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     expected = expected.hourOfDay().setCopy(10); 
     expected = expected.minuteOfHour().setCopy(20); 
     expected = expected.secondOfMinute().setCopy(30); 
     expected = expected.millisOfSecond().setCopy(40); 
     assertEquals(expected, test); 
 } 


public void testPlusMillis_int731() { 
     LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     LocalTime result = test.plusMillis(1); 
     LocalTime expected = new LocalTime(1, 2, 3, 5, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusMillis(0); 
     assertSame(test, result); 
 } 


public void testToString_DTFormatter744() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString(DateTimeFormat.forPattern("yyyy HH"))); 
     assertEquals("10:20:30.040", test.toString((DateTimeFormatter) null)); 
 } 


public void testMinusHours_int761() { 
     LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     LocalTime result = test.minusHours(1); 
     LocalTime expected = new LocalTime(0, 2, 3, 4, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minusHours(0); 
     assertSame(test, result); 
 } 


public void testWithField_DateTimeFieldType_int_1806() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     LocalTime result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     assertEquals(new LocalTime(10, 20, 30, 40), test); 
     assertEquals(new LocalTime(15, 20, 30, 40), result); 
 } 


public void testSerialization921() throws Exception { 
     LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     ObjectOutputStream oos = new ObjectOutputStream(baos); 
     oos.writeObject(test); 
     byte[] bytes = baos.toByteArray(); 
     oos.close(); 
     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     ObjectInputStream ois = new ObjectInputStream(bais); 
     LocalTime result = (LocalTime) ois.readObject(); 
     ois.close(); 
     assertEquals(test, result); 
     assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     assertEquals(test.getChronology(), result.getChronology()); 
 } 


public void testPlus_RP931() { 
     LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalTime result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     LocalTime expected = new LocalTime(15, 26, 37, 48, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


public void testPlusSeconds_int981() { 
     LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     LocalTime result = test.plusSeconds(1); 
     LocalTime expected = new LocalTime(1, 2, 4, 4, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusSeconds(0); 
     assertSame(test, result); 
 } 


public void testIsSupported_DateTimeFieldType992() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.hourOfHalfday())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.halfdayOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfHalfday())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.clockhourOfDay())); 
     assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     assertEquals(false, test.isSupported((DateTimeFieldType) null)); 
     DateTimeFieldType d = new DateTimeFieldType("hours") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() { 
             return DurationFieldType.hours(); 
         } 
  
         public DurationFieldType getRangeDurationType() { 
             return null; 
         } 
  
         public DateTimeField getField(Chronology chronology) { 
             return chronology.hourOfDay(); 
         } 
     }; 
     assertEquals(false, test.isSupported(d)); 
     d = new DateTimeFieldType("hourOfYear") { 
  
         private static final long serialVersionUID = 1L; 
  
         public DurationFieldType getDurationType() { 
             return DurationFieldType.hours(); 
         } 
  
         public DurationFieldType getRangeDurationType() { 
             return DurationFieldType.years(); 
         } 
  
         public DateTimeField getField(Chronology chronology) { 
             return chronology.hourOfDay(); 
         } 
     }; 
     assertEquals(false, test.isSupported(d)); 
 } 


public void testToDateTimeTodayDefaultZone1023() { 
     LocalTime base = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     DateTime dt = new DateTime(2004, 6, 9, 6, 7, 8, 9); 
     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); 
     DateTime test = base.toDateTimeToday(); 
     check(base, 10, 20, 30, 40); 
     DateTime expected = new DateTime(dt.getMillis(), COPTIC_LONDON); 
     expected = expected.hourOfDay().setCopy(10); 
     expected = expected.minuteOfHour().setCopy(20); 
     expected = expected.secondOfMinute().setCopy(30); 
     expected = expected.millisOfSecond().setCopy(40); 
     assertEquals(expected, test); 
 } 


public void testGetValue_int1074() { 
     LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_PARIS); 
     assertEquals(10, test.getValue(0)); 
     assertEquals(20, test.getValue(1)); 
     assertEquals(30, test.getValue(2)); 
     assertEquals(40, test.getValue(3)); 
     try { 
         test.getValue(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     try { 
         test.getValue(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 } 


public void testGet_DateTimeFieldType1228() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     assertEquals(10, test.get(DateTimeFieldType.hourOfDay())); 
     assertEquals(20, test.get(DateTimeFieldType.minuteOfHour())); 
     assertEquals(30, test.get(DateTimeFieldType.secondOfMinute())); 
     assertEquals(40, test.get(DateTimeFieldType.millisOfSecond())); 
     assertEquals(TEST_TIME_NOW / 60000, test.get(DateTimeFieldType.minuteOfDay())); 
     assertEquals(TEST_TIME_NOW / 1000, test.get(DateTimeFieldType.secondOfDay())); 
     assertEquals(TEST_TIME_NOW, test.get(DateTimeFieldType.millisOfDay())); 
     assertEquals(10, test.get(DateTimeFieldType.hourOfHalfday())); 
     assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay())); 
     test = new LocalTime(12, 30); 
     assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     assertEquals(12, test.get(DateTimeFieldType.clockhourOfDay())); 
     assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay())); 
     test = new LocalTime(14, 30); 
     assertEquals(2, test.get(DateTimeFieldType.hourOfHalfday())); 
     assertEquals(2, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     assertEquals(14, test.get(DateTimeFieldType.clockhourOfDay())); 
     assertEquals(DateTimeConstants.PM, test.get(DateTimeFieldType.halfdayOfDay())); 
     test = new LocalTime(0, 30); 
     assertEquals(0, test.get(DateTimeFieldType.hourOfHalfday())); 
     assertEquals(12, test.get(DateTimeFieldType.clockhourOfHalfday())); 
     assertEquals(24, test.get(DateTimeFieldType.clockhourOfDay())); 
     assertEquals(DateTimeConstants.AM, test.get(DateTimeFieldType.halfdayOfDay())); 
     try { 
         test.get(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.get(DateTimeFieldType.dayOfMonth()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testIsSupported_DurationFieldType1286() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     assertEquals(true, test.isSupported(DurationFieldType.hours())); 
     assertEquals(true, test.isSupported(DurationFieldType.minutes())); 
     assertEquals(true, test.isSupported(DurationFieldType.seconds())); 
     assertEquals(true, test.isSupported(DurationFieldType.millis())); 
     assertEquals(true, test.isSupported(DurationFieldType.halfdays())); 
     assertEquals(false, test.isSupported(DurationFieldType.days())); 
     assertEquals(false, test.isSupported((DurationFieldType) null)); 
 } 


public void testGetField_int1343() { 
     LocalTime test = new LocalTime(10, 20, 30, 40, COPTIC_UTC); 
     assertSame(COPTIC_UTC.hourOfDay(), test.getField(0)); 
     assertSame(COPTIC_UTC.minuteOfHour(), test.getField(1)); 
     assertSame(COPTIC_UTC.secondOfMinute(), test.getField(2)); 
     assertSame(COPTIC_UTC.millisOfSecond(), test.getField(3)); 
     try { 
         test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     try { 
         test.getField(5); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 } 


public void testPlusHours_int1344() { 
     LocalTime test = new LocalTime(1, 2, 3, 4, BUDDHIST_LONDON); 
     LocalTime result = test.plusHours(1); 
     LocalTime expected = new LocalTime(2, 2, 3, 4, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plusHours(0); 
     assertSame(test, result); 
 } 


public void testWithFieldAdded_DurationFieldType_int_51390() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     try { 
         test.withFieldAdded(DurationFieldType.days(), 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testGetters1448() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     assertEquals(10, test.getHourOfDay()); 
     assertEquals(20, test.getMinuteOfHour()); 
     assertEquals(30, test.getSecondOfMinute()); 
     assertEquals(40, test.getMillisOfSecond()); 
     assertEquals(TEST_TIME_NOW, test.getMillisOfDay()); 
 } 


public void testMinus_RP1532() { 
     LocalTime test = new LocalTime(10, 20, 30, 40, BUDDHIST_LONDON); 
     LocalTime result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     LocalTime expected = new LocalTime(9, 19, 29, 39, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.minus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


public void testWithField_DateTimeFieldType_int_31540() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     try { 
         test.withField(DateTimeFieldType.dayOfMonth(), 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testWithFieldAdded_DurationFieldType_int_41603() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     LocalTime result = test.withFieldAdded(DurationFieldType.hours(), 0); 
     assertSame(test, result); 
 } 


public void testWithFieldAdded_DurationFieldType_int_31609() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     try { 
         test.withFieldAdded(null, 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testWithField_DateTimeFieldType_int_21719() { 
     LocalTime test = new LocalTime(10, 20, 30, 40); 
     try { 
         test.withField(null, 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 

    

    

    

    

    

    

    

    

    

    

    

    class MockInstant extends MockPartial {
        public Chronology getChronology() {
            return COPTIC_UTC;
        }
        public DateTimeField[] getFields() {
            return new DateTimeField[] {
                COPTIC_UTC.hourOfDay(),
                COPTIC_UTC.minuteOfHour(),
                COPTIC_UTC.secondOfMinute(),
                COPTIC_UTC.millisOfSecond(),
            };
        }
        public int[] getValues() {
            return new int[] {10, 20, 30, 40};
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
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private void check(LocalTime test, int hour, int min, int sec, int milli) {
        assertEquals(hour, test.getHourOfDay());
        assertEquals(min, test.getMinuteOfHour());
        assertEquals(sec, test.getSecondOfMinute());
        assertEquals(milli, test.getMillisOfSecond());
    }
}
