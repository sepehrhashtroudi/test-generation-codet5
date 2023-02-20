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
import java.util.Arrays;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for YearMonth.
 *
 * @author Stephen Colebourne
 */
public class TestYearMonth_Basics extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
//    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
//    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
//    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
//    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
//    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;

    private DateTimeZone zone = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestYearMonth_Basics.class);
    }

    public TestYearMonth_Basics(String name) {
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

public void testToInterval174() { 
     YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     Interval test = base.toInterval(); 
     check(base, 2005, 6); 
     DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON); 
     DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON); 
     Interval expected = new Interval(start, end); 
     assertEquals(expected, test); 
 } 


public void testMinusMonths_int180() { 
     YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     YearMonth result = test.minusMonths(1); 
     YearMonth expected = new YearMonth(2002, 4, BuddhistChronology.getInstance()); 
     assertEquals(expected, result); 
     result = test.minusMonths(0); 
     assertSame(test, result); 
 } 


public void testPlusYears_int212() { 
     YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     YearMonth result = test.plusYears(1); 
     YearMonth expected = new YearMonth(2003, 5, BuddhistChronology.getInstance()); 
     assertEquals(expected, result); 
     result = test.plusYears(0); 
     assertSame(test, result); 
 } 


public void testMinus_RP254() { 
     YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     YearMonth result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     YearMonth expected = new YearMonth(2001, 4, BuddhistChronology.getInstance()); 
     assertEquals(expected, result); 
     result = test.minus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


public void testSerialization310() throws Exception { 
     YearMonth test = new YearMonth(1972, 6, COPTIC_PARIS); 
     ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     ObjectOutputStream oos = new ObjectOutputStream(baos); 
     oos.writeObject(test); 
     byte[] bytes = baos.toByteArray(); 
     oos.close(); 
     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     ObjectInputStream ois = new ObjectInputStream(bais); 
     YearMonth result = (YearMonth) ois.readObject(); 
     ois.close(); 
     assertEquals(test, result); 
     assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     assertEquals(test.getChronology(), result.getChronology()); 
 } 


public void testToString_String_Locale444() { 
     YearMonth test = new YearMonth(2002, 6); 
     assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.ENGLISH)); 
     assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.FRENCH)); 
     assertEquals("2002-06", test.toString(null, Locale.ENGLISH)); 
     assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", null)); 
     assertEquals("2002-06", test.toString(null, null)); 
 } 


public void testWithChronologyRetainFields_sameChrono487() { 
     YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     YearMonth test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     assertSame(base, test); 
 } 


public void testWithChronologyRetainFields_invalidInNewChrono488() { 
     YearMonth base = new YearMonth(2005, 13, COPTIC_UTC); 
     try { 
         base.withChronologyRetainFields(ISO_UTC); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testIsAfter_YM763() { 
     YearMonth test1 = new YearMonth(2005, 6); 
     YearMonth test1a = new YearMonth(2005, 6); 
     assertEquals(false, test1.isAfter(test1a)); 
     assertEquals(false, test1a.isAfter(test1)); 
     assertEquals(false, test1.isAfter(test1)); 
     assertEquals(false, test1a.isAfter(test1a)); 
     YearMonth test2 = new YearMonth(2005, 7); 
     assertEquals(false, test1.isAfter(test2)); 
     assertEquals(true, test2.isAfter(test1)); 
     YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); 
     assertEquals(false, test1.isAfter(test3)); 
     assertEquals(true, test3.isAfter(test1)); 
     assertEquals(false, test3.isAfter(test2)); 
     try { 
         new YearMonth(2005, 7).isAfter(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testWithers767() { 
     YearMonth test = new YearMonth(1970, 6); 
     check(test.withYear(2000), 2000, 6); 
     check(test.withMonthOfYear(2), 1970, 2); 
     try { 
         test.withMonthOfYear(0); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.withMonthOfYear(13); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testToString783() { 
     YearMonth test = new YearMonth(2002, 6); 
     assertEquals("2002-06", test.toString()); 
 } 


public void testWithField_same877() { 
     YearMonth test = new YearMonth(2004, 6); 
     YearMonth result = test.withField(DateTimeFieldType.year(), 2004); 
     assertEquals(new YearMonth(2004, 6), test); 
     assertSame(test, result); 
 } 


public void testCompareTo1017() { 
     YearMonth test1 = new YearMonth(2005, 6); 
     YearMonth test1a = new YearMonth(2005, 6); 
     assertEquals(0, test1.compareTo(test1a)); 
     assertEquals(0, test1a.compareTo(test1)); 
     assertEquals(0, test1.compareTo(test1)); 
     assertEquals(0, test1a.compareTo(test1a)); 
     YearMonth test2 = new YearMonth(2005, 7); 
     assertEquals(-1, test1.compareTo(test2)); 
     assertEquals(+1, test2.compareTo(test1)); 
     YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); 
     assertEquals(-1, test1.compareTo(test3)); 
     assertEquals(+1, test3.compareTo(test1)); 
     assertEquals(0, test3.compareTo(test2)); 
     DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; 
     int[] values = new int[] { 2005, 6 }; 
     Partial p = new Partial(types, values); 
     assertEquals(0, test1.compareTo(p)); 
     try { 
         test1.compareTo(null); 
         fail(); 
     } catch (NullPointerException ex) { 
     } 
     try { 
         test1.compareTo(new LocalTime()); 
         fail(); 
     } catch (ClassCastException ex) { 
     } 
     Partial partial = new Partial().with(DateTimeFieldType.centuryOfEra(), 1).with(DateTimeFieldType.halfdayOfDay(), 0).with(DateTimeFieldType.dayOfMonth(), 9); 
     try { 
         new YearMonth(1970, 6).compareTo(partial); 
         fail(); 
     } catch (ClassCastException ex) { 
     } 
 } 


public void testToString_String1147() { 
     YearMonth test = new YearMonth(2002, 6); 
     assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH")); 
     assertEquals("2002-06", test.toString((String) null)); 
 } 


public void testMinusYears_int1157() { 
     YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     YearMonth result = test.minusYears(1); 
     YearMonth expected = new YearMonth(2001, 5, BuddhistChronology.getInstance()); 
     assertEquals(expected, result); 
     result = test.minusYears(0); 
     assertSame(test, result); 
 } 


public void testGetFieldTypes1178() { 
     YearMonth test = new YearMonth(COPTIC_PARIS); 
     DateTimeFieldType[] fields = test.getFieldTypes(); 
     assertEquals(2, fields.length); 
     assertSame(DateTimeFieldType.year(), fields[0]); 
     assertSame(DateTimeFieldType.monthOfYear(), fields[1]); 
     assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 } 


public void testWithField1453() { 
     YearMonth test = new YearMonth(2004, 6); 
     YearMonth result = test.withField(DateTimeFieldType.year(), 2006); 
     assertEquals(new YearMonth(2004, 6), test); 
     assertEquals(new YearMonth(2006, 6), result); 
 } 


public void testProperty1496() { 
     YearMonth test = new YearMonth(2005, 6); 
     assertEquals(test.year(), test.property(DateTimeFieldType.year())); 
     assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); 
     try { 
         test.property(DateTimeFieldType.millisOfDay()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.property(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testGetField1576() { 
     YearMonth test = new YearMonth(COPTIC_PARIS); 
     assertSame(COPTIC_UTC.year(), test.getField(0)); 
     assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); 
     try { 
         test.getField(-1); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
     try { 
         test.getField(2); 
     } catch (IndexOutOfBoundsException ex) { 
     } 
 } 


public void testPlus_RP1649() { 
     YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); 
     YearMonth result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     YearMonth expected = new YearMonth(2003, 7, BuddhistChronology.getInstance()); 
     assertEquals(expected, result); 
     result = test.plus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


public void testWithChronologyRetainFields_nullChrono1766() { 
     YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); 
     YearMonth test = base.withChronologyRetainFields(null); 
     check(base, 2005, 6); 
     assertEquals(COPTIC_UTC, base.getChronology()); 
     check(test, 2005, 6); 
     assertEquals(ISO_UTC, test.getChronology()); 
 } 

    

    

    

    

    

    

    

    

    

    
    
    class MockYM extends MockPartial {
        public Chronology getChronology() {
            return COPTIC_UTC;
        }
        public DateTimeField[] getFields() {
            return new DateTimeField[] {
                COPTIC_UTC.year(),
                COPTIC_UTC.monthOfYear(),
            };
        }
        public int[] getValues() {
            return new int[] {1970, 6};
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
    

    //-----------------------------------------------------------------------
    private void check(YearMonth test, int year, int month) {
        assertEquals(year, test.getYear());
        assertEquals(month, test.getMonthOfYear());
    }
}
