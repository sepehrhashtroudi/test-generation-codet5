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

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for TimeOfDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestTimeOfDay_Properties extends TestCase {

    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
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
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestTimeOfDay_Properties.class);
    }

    public TestTimeOfDay_Properties(String name) {
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

public void testPropertySetMinute83() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     TimeOfDay copy = test.minuteOfHour().setCopy(12); 
     check(test, 10, 20, 30, 40); 
     check(copy, 10, 12, 30, 40); 
     try { 
         test.minuteOfHour().setCopy(60); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.minuteOfHour().setCopy(-1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testPropertyAddNoWrapMilli91() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     TimeOfDay copy = test.millisOfSecond().addNoWrapToCopy(9); 
     check(test, 10, 20, 30, 40); 
     check(copy, 10, 20, 30, 49); 
     copy = test.millisOfSecond().addNoWrapToCopy(959); 
     check(copy, 10, 20, 30, 999); 
     copy = test.millisOfSecond().addNoWrapToCopy(960); 
     check(copy, 10, 20, 31, 0); 
     copy = test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 959); 
     check(copy, 23, 59, 59, 999); 
     try { 
         test.millisOfSecond().addNoWrapToCopy(13 * 60 * 60 * 1000 + 39 * 60 * 1000 + 29 * 1000 + 960); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     check(test, 10, 20, 30, 40); 
     copy = test.millisOfSecond().addNoWrapToCopy(-9); 
     check(copy, 10, 20, 30, 31); 
     copy = test.millisOfSecond().addNoWrapToCopy(-40); 
     check(copy, 10, 20, 30, 0); 
     copy = test.millisOfSecond().addNoWrapToCopy(-41); 
     check(copy, 10, 20, 29, 999); 
     copy = test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 40)); 
     check(copy, 0, 0, 0, 0); 
     try { 
         test.millisOfSecond().addNoWrapToCopy(-(10 * 60 * 60 * 1000 + 20 * 60 * 1000 + 30 * 1000 + 41)); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     check(test, 10, 20, 30, 40); 
 } 


public void testPropertyAddHour127() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     TimeOfDay copy = test.hourOfDay().addToCopy(9); 
     check(test, 10, 20, 30, 40); 
     check(copy, 19, 20, 30, 40); 
     copy = test.hourOfDay().addToCopy(0); 
     check(copy, 10, 20, 30, 40); 
     copy = test.hourOfDay().addToCopy(13); 
     check(copy, 23, 20, 30, 40); 
     copy = test.hourOfDay().addToCopy(14); 
     check(copy, 0, 20, 30, 40); 
     copy = test.hourOfDay().addToCopy(-10); 
     check(copy, 0, 20, 30, 40); 
     copy = test.hourOfDay().addToCopy(-11); 
     check(copy, 23, 20, 30, 40); 
 } 


public void testPropertyWithMaximumValueHour204() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     TimeOfDay copy = test.hourOfDay().withMaximumValue(); 
     check(test, 10, 20, 30, 40); 
     check(copy, 23, 20, 30, 40); 
 } 


public void testPropertyGetMinute435() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     assertSame(test, test.minuteOfHour().getReadablePartial()); 
     assertSame(test, test.minuteOfHour().getTimeOfDay()); 
     assertEquals(20, test.minuteOfHour().get()); 
     assertEquals("20", test.minuteOfHour().getAsString()); 
     assertEquals("20", test.minuteOfHour().getAsText()); 
     assertEquals("20", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     assertEquals("20", test.minuteOfHour().getAsShortText()); 
     assertEquals("20", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 } 


public void testPropertyWithMinimumValueHour831() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     TimeOfDay copy = test.hourOfDay().withMinimumValue(); 
     check(test, 10, 20, 30, 40); 
     check(copy, 0, 20, 30, 40); 
 } 


public void testPropertySetTextHour887() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     TimeOfDay copy = test.hourOfDay().setCopy("12"); 
     check(test, 10, 20, 30, 40); 
     check(copy, 12, 20, 30, 40); 
 } 


public void testPropertySetMilli1183() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     TimeOfDay copy = test.millisOfSecond().setCopy(12); 
     check(test, 10, 20, 30, 40); 
     check(copy, 10, 20, 30, 12); 
     try { 
         test.millisOfSecond().setCopy(1000); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         test.millisOfSecond().setCopy(-1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testPropertyGetMaxMinValuesSecond1209() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     assertEquals(0, test.secondOfMinute().getMinimumValue()); 
     assertEquals(0, test.secondOfMinute().getMinimumValueOverall()); 
     assertEquals(59, test.secondOfMinute().getMaximumValue()); 
     assertEquals(59, test.secondOfMinute().getMaximumValueOverall()); 
 } 


public void testPropertyAddWrapFieldHour1389() { 
     TimeOfDay test = new TimeOfDay(10, 20, 30, 40); 
     TimeOfDay copy = test.hourOfDay().addWrapFieldToCopy(9); 
     check(test, 10, 20, 30, 40); 
     check(copy, 19, 20, 30, 40); 
     copy = test.hourOfDay().addWrapFieldToCopy(0); 
     check(copy, 10, 20, 30, 40); 
     copy = test.hourOfDay().addWrapFieldToCopy(18); 
     check(copy, 4, 20, 30, 40); 
     copy = test.hourOfDay().addWrapFieldToCopy(-15); 
     check(copy, 19, 20, 30, 40); 
 } 


public void testPropertyCompareToSecond1612() { 
     TimeOfDay test1 = new TimeOfDay(TEST_TIME1); 
     TimeOfDay test2 = new TimeOfDay(TEST_TIME2); 
     assertEquals(true, test1.secondOfMinute().compareTo(test2) < 0); 
     assertEquals(true, test2.secondOfMinute().compareTo(test1) > 0); 
     assertEquals(true, test1.secondOfMinute().compareTo(test1) == 0); 
     try { 
         test1.secondOfMinute().compareTo((ReadablePartial) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     DateTime dt1 = new DateTime(TEST_TIME1); 
     DateTime dt2 = new DateTime(TEST_TIME2); 
     assertEquals(true, test1.secondOfMinute().compareTo(dt2) < 0); 
     assertEquals(true, test2.secondOfMinute().compareTo(dt1) > 0); 
     assertEquals(true, test1.secondOfMinute().compareTo(dt1) == 0); 
     try { 
         test1.secondOfMinute().compareTo((ReadableInstant) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(TimeOfDay test, int hour, int min, int sec, int milli) {
        assertEquals(hour, test.getHourOfDay());
        assertEquals(min, test.getMinuteOfHour());
        assertEquals(sec, test.getSecondOfMinute());
        assertEquals(milli, test.getMillisOfSecond());
    }
}
