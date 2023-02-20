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

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Properties extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    
    private DateTimeZone zone = null;
    private static final DateTimeFieldType[] TYPES = new DateTimeFieldType[] {
        DateTimeFieldType.hourOfDay(),
        DateTimeFieldType.minuteOfHour(),
        DateTimeFieldType.secondOfMinute(),
        DateTimeFieldType.millisOfSecond()
    };
    private static final int[] VALUES = new int[] {10, 20, 30, 40};
    private static final int[] VALUES1 = new int[] {1, 2, 3, 4};
    private static final int[] VALUES2 = new int[] {5, 6, 7, 8};

//    private long TEST_TIME_NOW =
//        10L * DateTimeConstants.MILLIS_PER_HOUR
//        + 20L * DateTimeConstants.MILLIS_PER_MINUTE
//        + 30L * DateTimeConstants.MILLIS_PER_SECOND
//        + 40L;
//        
    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestPartial_Properties.class);
    }

    public TestPartial_Properties(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
    }

    protected void tearDown() throws Exception {
        DateTimeZone.setDefault(zone);
        zone = null;
    }

    //-----------------------------------------------------------------------

public void testPropertyWithMinimumValueHour43() { 
     Partial test = new Partial(TYPES, VALUES); 
     Partial copy = test.property(DateTimeFieldType.hourOfDay()).withMinimumValue(); 
     check(test, 10, 20, 30, 40); 
     check(copy, 0, 20, 30, 40); 
 } 


public void testPropertyAddMinute913() { 
     Partial test = new Partial(TYPES, VALUES); 
     Partial copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(9); 
     check(test, 10, 20, 30, 40); 
     check(copy, 10, 29, 30, 40); 
     copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(39); 
     check(copy, 10, 59, 30, 40); 
     copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(40); 
     check(copy, 11, 0, 30, 40); 
     copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(1 * 60 + 45); 
     check(copy, 12, 5, 30, 40); 
     copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 39); 
     check(copy, 23, 59, 30, 40); 
     try { 
         test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 40); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     check(test, 10, 20, 30, 40); 
     copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-9); 
     check(copy, 10, 11, 30, 40); 
     copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-19); 
     check(copy, 10, 1, 30, 40); 
     copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-20); 
     check(copy, 10, 0, 30, 40); 
     copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-21); 
     check(copy, 9, 59, 30, 40); 
     copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 20)); 
     check(copy, 0, 0, 30, 40); 
     try { 
         test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 21)); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     check(test, 10, 20, 30, 40); 
 } 


public void testPropertyAddWrapFieldHour1036() { 
     Partial test = new Partial(TYPES, VALUES); 
     Partial copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(9); 
     check(test, 10, 20, 30, 40); 
     check(copy, 19, 20, 30, 40); 
     copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(0); 
     check(copy, 10, 20, 30, 40); 
     copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(18); 
     check(copy, 4, 20, 30, 40); 
     copy = test.property(DateTimeFieldType.hourOfDay()).addWrapFieldToCopy(-15); 
     check(copy, 19, 20, 30, 40); 
 } 


public void testPropertyGetMinute1102() { 
     Partial test = new Partial(TYPES, VALUES); 
     assertSame(test.getChronology().minuteOfHour(), test.property(DateTimeFieldType.minuteOfHour()).getField()); 
     assertEquals("minuteOfHour", test.property(DateTimeFieldType.minuteOfHour()).getName()); 
     assertEquals("Property[minuteOfHour]", test.property(DateTimeFieldType.minuteOfHour()).toString()); 
     assertSame(test, test.property(DateTimeFieldType.minuteOfHour()).getReadablePartial()); 
     assertSame(test, test.property(DateTimeFieldType.minuteOfHour()).getPartial()); 
     assertEquals(20, test.property(DateTimeFieldType.minuteOfHour()).get()); 
     assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsString()); 
     assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsText()); 
     assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsText(Locale.FRENCH)); 
     assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsShortText()); 
     assertEquals("20", test.property(DateTimeFieldType.minuteOfHour()).getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().minutes(), test.property(DateTimeFieldType.minuteOfHour()).getDurationField()); 
     assertEquals(test.getChronology().hours(), test.property(DateTimeFieldType.minuteOfHour()).getRangeDurationField()); 
     assertEquals(2, test.property(DateTimeFieldType.minuteOfHour()).getMaximumTextLength(null)); 
     assertEquals(2, test.property(DateTimeFieldType.minuteOfHour()).getMaximumShortTextLength(null)); 
 } 


public void testPropertyWithMaximumValueHour1152() { 
     Partial test = new Partial(TYPES, VALUES); 
     Partial copy = test.property(DateTimeFieldType.hourOfDay()).withMaximumValue(); 
     check(test, 10, 20, 30, 40); 
     check(copy, 23, 20, 30, 40); 
 } 


public void testPropertySetTextMinute1242() { 
     Partial test = new Partial(TYPES, VALUES); 
     Partial copy = test.property(DateTimeFieldType.minuteOfHour()).setCopy("12"); 
     check(test, 10, 20, 30, 40); 
     check(copy, 10, 12, 30, 40); 
 } 

    

    

//    public void testPropertyAddHour() {
//        Partial test = new Partial(TYPES, VALUES);
//        Partial copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(9);
//        check(test, 10, 20, 30, 40);
//        check(copy, 19, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(0);
//        check(copy, 10, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(13);
//        check(copy, 23, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(14);
//        check(copy, 0, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(-10);
//        check(copy, 0, 20, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.hourOfDay()).addToCopy(-11);
//        check(copy, 23, 20, 30, 40);
//    }
//
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

//    public void testPropertyAddMinute() {
//        Partial test = new Partial(TYPES, VALUES);
//        Partial copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(9);
//        check(test, 10, 20, 30, 40);
//        check(copy, 10, 29, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(39);
//        check(copy, 10, 59, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(40);
//        check(copy, 11, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(1 * 60 + 45);
//        check(copy, 12, 5, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 39);
//        check(copy, 23, 59, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(13 * 60 + 40);
//        check(copy, 0, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-9);
//        check(copy, 10, 11, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-19);
//        check(copy, 10, 1, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-20);
//        check(copy, 10, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-21);
//        check(copy, 9, 59, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 20));
//        check(copy, 0, 0, 30, 40);
//        
//        copy = test.property(DateTimeFieldType.minuteOfHour()).addToCopy(-(10 * 60 + 21));
//        check(copy, 23, 59, 30, 40);
//    }

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(Partial test, int hour, int min, int sec, int milli) {
        assertEquals(hour, test.get(DateTimeFieldType.hourOfDay()));
        assertEquals(min, test.get(DateTimeFieldType.minuteOfHour()));
        assertEquals(sec, test.get(DateTimeFieldType.secondOfMinute()));
        assertEquals(milli, test.get(DateTimeFieldType.millisOfSecond()));
    }
}
