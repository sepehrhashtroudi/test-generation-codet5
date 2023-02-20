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
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Basics extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
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
        return new TestSuite(TestPartial_Basics.class);
    }

    public TestPartial_Basics(String name) {
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

public void testToString258() { 
     Partial test = new Partial(); 
     assertEquals("[]", test.toString()); 
 } 


public void testWith160() { 
     Partial test = createHourMinPartial(); 
     Partial result = test.with(DateTimeFieldType.hourOfDay(), 15); 
     check(test, 10, 20); 
     check(result, 15, 20); 
 } 


public void testGetFormatter181() { 
     Partial test = new Partial(DateTimeFieldType.year(), 2005); 
     assertEquals("2005", test.getFormatter().print(test)); 
     test = test.with(DateTimeFieldType.monthOfYear(), 6); 
     assertEquals("2005-06", test.getFormatter().print(test)); 
     test = test.with(DateTimeFieldType.dayOfMonth(), 25); 
     assertEquals("2005-06-25", test.getFormatter().print(test)); 
     test = test.without(DateTimeFieldType.monthOfYear()); 
     assertEquals("2005--25", test.getFormatter().print(test)); 
 } 


public void testGetFieldTypes182() { 
     Partial test = createHourMinPartial(); 
     DateTimeFieldType[] fields = test.getFieldTypes(); 
     assertEquals(2, fields.length); 
     assertSame(DateTimeFieldType.hourOfDay(), fields[0]); 
     assertSame(DateTimeFieldType.minuteOfHour(), fields[1]); 
     assertNotSame(test.getFieldTypes(), test.getFieldTypes()); 
 } 


public void testMinus_RP215() { 
     Partial test = createHourMinPartial(BUDDHIST_LONDON); 
     Partial result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); 
     check(test, 10, 20); 
     check(result, 9, 19); 
     result = test.minus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


public void testWithFieldAddWrapped8251() { 
     Partial test = createHourMinPartial(0, 0, ISO_UTC); 
     Partial result = test.withFieldAddWrapped(DurationFieldType.minutes(), -1); 
     check(test, 0, 0); 
     check(result, 23, 59); 
     test = createHourMinPartial(0, 0, ISO_UTC); 
     result = test.withFieldAddWrapped(DurationFieldType.hours(), -1); 
     check(test, 0, 0); 
     check(result, 23, 0); 
 } 


public void testToString_String292() { 
     Partial test = createHourMinPartial(); 
     assertEquals("\ufffd\ufffd\ufffd\ufffd 10", test.toString("yyyy HH")); 
     assertEquals("10:20", test.toString((String) null)); 
 } 


public void testSerialization324() throws Exception { 
     Partial test = createHourMinPartial(COPTIC_PARIS); 
     ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     ObjectOutputStream oos = new ObjectOutputStream(baos); 
     oos.writeObject(test); 
     byte[] bytes = baos.toByteArray(); 
     oos.close(); 
     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     ObjectInputStream ois = new ObjectInputStream(bais); 
     Partial result = (Partial) ois.readObject(); 
     ois.close(); 
     assertEquals(test, result); 
     assertTrue(Arrays.equals(test.getValues(), result.getValues())); 
     assertTrue(Arrays.equals(test.getFields(), result.getFields())); 
     assertEquals(test.getChronology(), result.getChronology()); 
 } 


public void testWith3f327() { 
     Partial test = new Partial(DateTimeFieldType.halfdayOfDay(), 0); 
     Partial result = test.with(DateTimeFieldType.era(), 1); 
     assertEquals(2, result.size()); 
     assertEquals(1, result.get(DateTimeFieldType.era())); 
     assertEquals(0, result.get(DateTimeFieldType.halfdayOfDay())); 
     assertEquals(0, result.indexOf(DateTimeFieldType.era())); 
     assertEquals(1, result.indexOf(DateTimeFieldType.halfdayOfDay())); 
 } 


public void testWith4377() { 
     Partial test = createHourMinPartial(); 
     Partial result = test.with(DateTimeFieldType.hourOfDay(), 10); 
     assertSame(test, result); 
 } 


public void testGetFormatter3440() { 
     Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5); 
     assertEquals("-W-5", test.getFormatter().print(test)); 
     test = test.with(DateTimeFieldType.dayOfMonth(), 13); 
     assertEquals("---13", test.getFormatter().print(test)); 
 } 


public void testWith_argHasNoRange627() { 
     Partial test = new Partial(DateTimeFieldType.hourOfDay(), 1); 
     Partial result = test.with(DateTimeFieldType.year(), 10); 
     assertEquals(2, result.size()); 
     assertEquals(0, result.indexOf(DateTimeFieldType.year())); 
     assertEquals(1, result.indexOf(DateTimeFieldType.hourOfDay())); 
 } 


public void testToString5670() { 
     Partial test = new Partial(DateTimeFieldType.era(), 1); 
     assertEquals("[era=1]", test.toString()); 
     test = test.with(DateTimeFieldType.halfdayOfDay(), 0); 
     assertEquals("[era=1, halfdayOfDay=0]", test.toString()); 
 } 


public void testWithFieldAdded4795() { 
     Partial test = createHourMinPartial(); 
     Partial result = test.withFieldAdded(DurationFieldType.hours(), 0); 
     assertSame(test, result); 
 } 


public void testWithFieldAddWrapped5814() { 
     Partial test = createHourMinPartial(); 
     try { 
         test.withFieldAddWrapped(DurationFieldType.days(), 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     check(test, 10, 20); 
 } 


public void testWithField2858() { 
     Partial test = createHourMinPartial(); 
     try { 
         test.withField(null, 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     check(test, 10, 20); 
 } 


public void testWith21062() { 
     Partial test = createHourMinPartial(); 
     try { 
         test.with(null, 6); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     check(test, 10, 20); 
 } 


public void testWithFieldAdded11070() { 
     Partial test = createHourMinPartial(); 
     Partial result = test.withFieldAdded(DurationFieldType.hours(), 6); 
     assertEquals(createHourMinPartial(), test); 
     check(test, 10, 20); 
     check(result, 16, 20); 
 } 


public void testWithChronologyRetainFields_sameChrono1073() { 
     Partial base = createHourMinPartial(COPTIC_PARIS); 
     Partial test = base.withChronologyRetainFields(COPTIC_TOKYO); 
     assertSame(base, test); 
 } 


public void testPlus_RP1193() { 
     Partial test = createHourMinPartial(BUDDHIST_LONDON); 
     Partial result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     check(test, 10, 20); 
     check(result, 15, 26); 
     result = test.plus((ReadablePeriod) null); 
     assertSame(test, result); 
 } 


@SuppressWarnings("deprecation") 
 public void testCompareTo1257() { 
     Partial test1 = createHourMinPartial(); 
     Partial test1a = createHourMinPartial(); 
     assertEquals(0, test1.compareTo(test1a)); 
     assertEquals(0, test1a.compareTo(test1)); 
     assertEquals(0, test1.compareTo(test1)); 
     assertEquals(0, test1a.compareTo(test1a)); 
     Partial test2 = createHourMinPartial2(ISO_UTC); 
     assertEquals(-1, test1.compareTo(test2)); 
     assertEquals(+1, test2.compareTo(test1)); 
     Partial test3 = createHourMinPartial2(COPTIC_UTC); 
     assertEquals(-1, test1.compareTo(test3)); 
     assertEquals(+1, test3.compareTo(test1)); 
     assertEquals(0, test3.compareTo(test2)); 
     assertEquals(0, new TimeOfDay(10, 20, 30, 40).compareTo(createTODPartial(ISO_UTC))); 
     try { 
         test1.compareTo(null); 
         fail(); 
     } catch (NullPointerException ex) { 
     } 
     try { 
         test1.compareTo(new YearMonthDay()); 
         fail(); 
     } catch (ClassCastException ex) { 
     } 
     try { 
         createTODPartial(ISO_UTC).without(DateTimeFieldType.hourOfDay()).compareTo(new YearMonthDay()); 
         fail(); 
     } catch (ClassCastException ex) { 
     } 
 } 


public void testWithFieldAddWrapped41280() { 
     Partial test = createHourMinPartial(); 
     Partial result = test.withFieldAddWrapped(DurationFieldType.hours(), 0); 
     assertSame(test, result); 
 } 


public void testWithChronologyRetainFields_Chrono1307() { 
     Partial base = createHourMinPartial(COPTIC_PARIS); 
     Partial test = base.withChronologyRetainFields(BUDDHIST_TOKYO); 
     check(base, 10, 20); 
     assertEquals(COPTIC_UTC, base.getChronology()); 
     check(test, 10, 20); 
     assertEquals(BUDDHIST_UTC, test.getChronology()); 
 } 


public void testWithField11309() { 
     Partial test = createHourMinPartial(); 
     Partial result = test.withField(DateTimeFieldType.hourOfDay(), 15); 
     check(test, 10, 20); 
     check(result, 15, 20); 
 } 


public void testWithout21354() { 
     Partial test = createHourMinPartial(); 
     Partial result = test.without((DateTimeFieldType) null); 
     check(test, 10, 20); 
     check(result, 10, 20); 
 } 


public void testToString41381() { 
     Partial test = new Partial(DateTimeFieldType.dayOfWeek(), 5); 
     assertEquals("-W-5", test.toString()); 
     test = test.with(DateTimeFieldType.dayOfMonth(), 13); 
     assertEquals("[dayOfMonth=13, dayOfWeek=5]", test.toString()); 
 } 


public void testWithField41406() { 
     Partial test = createHourMinPartial(); 
     Partial result = test.withField(DateTimeFieldType.hourOfDay(), 10); 
     assertSame(test, result); 
 } 


public void testToString_String_Locale1522() { 
     Partial test = createHourMinPartial(); 
     assertEquals("10 20", test.toString("H m", Locale.ENGLISH)); 
     assertEquals("10:20", test.toString(null, Locale.ENGLISH)); 
     assertEquals("10 20", test.toString("H m", null)); 
     assertEquals("10:20", test.toString(null, null)); 
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
    private Partial createHourMinPartial() {
        return createHourMinPartial(ISO_UTC);
    }

    private Partial createHourMinPartial(Chronology chrono) {
        return createHourMinPartial(10, 20, chrono);
    }

    private Partial createHourMinPartial2(Chronology chrono) {
        return createHourMinPartial(15, 20, chrono);
    }

    private Partial createHourMinPartial(int hour, int min, Chronology chrono) {
        return new Partial(
            new DateTimeFieldType[] {DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour()},
            new int[] {hour, min},
            chrono);
    }

    private Partial createTODPartial(Chronology chrono) {
        return new Partial(
            new DateTimeFieldType[] {
                    DateTimeFieldType.hourOfDay(), DateTimeFieldType.minuteOfHour(),
                    DateTimeFieldType.secondOfMinute(), DateTimeFieldType.millisOfSecond()},
            new int[] {10, 20, 30, 40},
            chrono);
    }

    private void check(Partial test, int hour, int min) {
        assertEquals(test.toString(), hour, test.get(DateTimeFieldType.hourOfDay()));
        assertEquals(test.toString(), min, test.get(DateTimeFieldType.minuteOfHour()));
    }
}
