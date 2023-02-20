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
 * This class is a Junit unit test for DateTime.
 *
 * @author Stephen Colebourne
 * @author Mike Schrag
 */
public class TestMutableDateTime_Properties extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    //private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
    // 2002-04-05 Fri
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06 Tue
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestMutableDateTime_Properties.class);
    }

    public TestMutableDateTime_Properties(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        locale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        Locale.setDefault(Locale.UK);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        Locale.setDefault(locale);
        zone = null;
    }

    //-----------------------------------------------------------------------

public void testPropertySetTextMonthOfYear234() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.monthOfYear().set("12"); 
     assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.monthOfYear().set("December"); 
     assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.monthOfYear().set("Dec"); 
     assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
 } 


public void testPropertyRoundCeilingHourOfDay250() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     test.hourOfDay().roundCeiling(); 
     assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
 } 


public void testPropertyToIntervalMonthOfYear288() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     Interval testInterval = test.monthOfYear().toInterval(); 
     assertEquals(new MutableDateTime(2004, 6, 1, 0, 0, 0, 0), testInterval.getStart()); 
     assertEquals(new MutableDateTime(2004, 7, 1, 0, 0, 0, 0), testInterval.getEnd()); 
     assertEquals(new MutableDateTime(2004, 6, 9, 13, 23, 43, 53), test); 
 } 


public void testPropertySetDayOfWeek353() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.dayOfWeek().set(4); 
     assertEquals("2004-06-10T00:00:00.000+01:00", test.toString()); 
 } 


public void testPropertyAddWeekOfWeekyear385() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0); 
     test.weekOfWeekyear().add(1); 
     assertEquals("2004-06-14T00:00:00.000+01:00", test.toString()); 
 } 


public void testPropertyGetMinuteOfDay448() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     assertSame(test.getChronology().minuteOfDay(), test.minuteOfDay().getField()); 
     assertEquals("minuteOfDay", test.minuteOfDay().getName()); 
     assertEquals("Property[minuteOfDay]", test.minuteOfDay().toString()); 
     assertEquals(803, test.minuteOfDay().get()); 
     assertEquals("803", test.minuteOfDay().getAsText()); 
     assertEquals("803", test.minuteOfDay().getAsText(Locale.FRENCH)); 
     assertEquals("803", test.minuteOfDay().getAsShortText()); 
     assertEquals("803", test.minuteOfDay().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().minutes(), test.minuteOfDay().getDurationField()); 
     assertEquals(test.getChronology().days(), test.minuteOfDay().getRangeDurationField()); 
     assertEquals(4, test.minuteOfDay().getMaximumTextLength(null)); 
     assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null)); 
 } 


public void testPropertySetDayOfMonth548() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.dayOfMonth().set(12); 
     assertEquals("2004-06-12T00:00:00.000+01:00", test.toString()); 
 } 


public void testPropertyRoundHalfFloorHourOfDay685() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     test.hourOfDay().roundHalfFloor(); 
     assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     test.hourOfDay().roundHalfFloor(); 
     assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     test.hourOfDay().roundHalfFloor(); 
     assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 } 


public void testPropertyGetEra711() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertSame(test.getChronology().era(), test.era().getField()); 
     assertEquals("era", test.era().getName()); 
     assertEquals("Property[era]", test.era().toString()); 
     assertSame(test, test.era().getMutableDateTime()); 
     assertEquals(1, test.era().get()); 
     assertEquals("AD", test.era().getAsText()); 
     assertEquals("ap. J.-C.", test.era().getAsText(Locale.FRENCH)); 
     assertEquals("AD", test.era().getAsShortText()); 
     assertEquals("ap. J.-C.", test.era().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().eras(), test.era().getDurationField()); 
     assertEquals(null, test.era().getRangeDurationField()); 
     assertEquals(2, test.era().getMaximumTextLength(null)); 
     assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH)); 
     assertEquals(2, test.era().getMaximumShortTextLength(null)); 
     assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH)); 
 } 


public void testPropertyAddLongDayOfWeek717() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.dayOfWeek().add(1L); 
     assertEquals("2004-06-10T00:00:00.000+01:00", test.toString()); 
 } 


public void testPropertyGetMillisOfSecond748() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     assertSame(test.getChronology().millisOfSecond(), test.millisOfSecond().getField()); 
     assertEquals("millisOfSecond", test.millisOfSecond().getName()); 
     assertEquals("Property[millisOfSecond]", test.millisOfSecond().toString()); 
     assertEquals(53, test.millisOfSecond().get()); 
     assertEquals("53", test.millisOfSecond().getAsText()); 
     assertEquals("53", test.millisOfSecond().getAsText(Locale.FRENCH)); 
     assertEquals("53", test.millisOfSecond().getAsShortText()); 
     assertEquals("53", test.millisOfSecond().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().millis(), test.millisOfSecond().getDurationField()); 
     assertEquals(test.getChronology().seconds(), test.millisOfSecond().getRangeDurationField()); 
     assertEquals(3, test.millisOfSecond().getMaximumTextLength(null)); 
     assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null)); 
 } 


public void testPropertyGetDayOfWeek781() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertSame(test.getChronology().dayOfWeek(), test.dayOfWeek().getField()); 
     assertEquals("dayOfWeek", test.dayOfWeek().getName()); 
     assertEquals("Property[dayOfWeek]", test.dayOfWeek().toString()); 
     assertEquals(3, test.dayOfWeek().get()); 
     assertEquals("Wednesday", test.dayOfWeek().getAsText()); 
     assertEquals("mercredi", test.dayOfWeek().getAsText(Locale.FRENCH)); 
     assertEquals("Wed", test.dayOfWeek().getAsShortText()); 
     assertEquals("mer.", test.dayOfWeek().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().days(), test.dayOfWeek().getDurationField()); 
     assertEquals(test.getChronology().weeks(), test.dayOfWeek().getRangeDurationField()); 
     assertEquals(9, test.dayOfWeek().getMaximumTextLength(null)); 
     assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH)); 
     assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null)); 
     assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH)); 
     assertEquals(1, test.dayOfWeek().getMinimumValue()); 
     assertEquals(1, test.dayOfWeek().getMinimumValueOverall()); 
     assertEquals(7, test.dayOfWeek().getMaximumValue()); 
     assertEquals(7, test.dayOfWeek().getMaximumValueOverall()); 
     assertEquals(false, test.dayOfWeek().isLeap()); 
     assertEquals(0, test.dayOfWeek().getLeapAmount()); 
     assertEquals(null, test.dayOfWeek().getLeapDurationField()); 
 } 


public void testPropertyRoundHalfCeilingHourOfDay805() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     test.hourOfDay().roundHalfCeiling(); 
     assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     test.hourOfDay().roundHalfCeiling(); 
     assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     test.hourOfDay().roundHalfCeiling(); 
     assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 } 


public void testPropertyGetCenturyOfEra919() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertSame(test.getChronology().centuryOfEra(), test.centuryOfEra().getField()); 
     assertEquals("centuryOfEra", test.centuryOfEra().getName()); 
     assertEquals("Property[centuryOfEra]", test.centuryOfEra().toString()); 
     assertEquals(20, test.centuryOfEra().get()); 
     assertEquals("20", test.centuryOfEra().getAsText()); 
     assertEquals("20", test.centuryOfEra().getAsText(Locale.FRENCH)); 
     assertEquals("20", test.centuryOfEra().getAsShortText()); 
     assertEquals("20", test.centuryOfEra().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().centuries(), test.centuryOfEra().getDurationField()); 
     assertEquals(test.getChronology().eras(), test.centuryOfEra().getRangeDurationField()); 
     assertEquals(7, test.centuryOfEra().getMaximumTextLength(null)); 
     assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null)); 
 } 


public void testPropertyRoundFloorHourOfDay936() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     test.hourOfDay().roundFloor(); 
     assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 } 


public void testPropertyGetMillisOfDay967() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     assertSame(test.getChronology().millisOfDay(), test.millisOfDay().getField()); 
     assertEquals("millisOfDay", test.millisOfDay().getName()); 
     assertEquals("Property[millisOfDay]", test.millisOfDay().toString()); 
     assertEquals(48223053, test.millisOfDay().get()); 
     assertEquals("48223053", test.millisOfDay().getAsText()); 
     assertEquals("48223053", test.millisOfDay().getAsText(Locale.FRENCH)); 
     assertEquals("48223053", test.millisOfDay().getAsShortText()); 
     assertEquals("48223053", test.millisOfDay().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().millis(), test.millisOfDay().getDurationField()); 
     assertEquals(test.getChronology().days(), test.millisOfDay().getRangeDurationField()); 
     assertEquals(8, test.millisOfDay().getMaximumTextLength(null)); 
     assertEquals(8, test.millisOfDay().getMaximumShortTextLength(null)); 
 } 


public void testPropertyGetMinuteOfHour977() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     assertSame(test.getChronology().minuteOfHour(), test.minuteOfHour().getField()); 
     assertEquals("minuteOfHour", test.minuteOfHour().getName()); 
     assertEquals("Property[minuteOfHour]", test.minuteOfHour().toString()); 
     assertEquals(23, test.minuteOfHour().get()); 
     assertEquals("23", test.minuteOfHour().getAsText()); 
     assertEquals("23", test.minuteOfHour().getAsText(Locale.FRENCH)); 
     assertEquals("23", test.minuteOfHour().getAsShortText()); 
     assertEquals("23", test.minuteOfHour().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().minutes(), test.minuteOfHour().getDurationField()); 
     assertEquals(test.getChronology().hours(), test.minuteOfHour().getRangeDurationField()); 
     assertEquals(2, test.minuteOfHour().getMaximumTextLength(null)); 
     assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null)); 
 } 


public void testPropertySetWeekOfWeekyear1100() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 7, 0, 0, 0, 0); 
     test.weekOfWeekyear().set(4); 
     assertEquals("2004-01-19T00:00:00.000Z", test.toString()); 
 } 


public void testPropertyGetWeekyear1165() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertSame(test.getChronology().weekyear(), test.weekyear().getField()); 
     assertEquals("weekyear", test.weekyear().getName()); 
     assertEquals("Property[weekyear]", test.weekyear().toString()); 
     assertEquals(2004, test.weekyear().get()); 
     assertEquals("2004", test.weekyear().getAsText()); 
     assertEquals("2004", test.weekyear().getAsText(Locale.FRENCH)); 
     assertEquals("2004", test.weekyear().getAsShortText()); 
     assertEquals("2004", test.weekyear().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().weekyears(), test.weekyear().getDurationField()); 
     assertEquals(null, test.weekyear().getRangeDurationField()); 
     assertEquals(9, test.weekyear().getMaximumTextLength(null)); 
     assertEquals(9, test.weekyear().getMaximumShortTextLength(null)); 
 } 


public void testPropertySetTextYear1171() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.year().set("1960"); 
     assertEquals("1960-06-09T00:00:00.000+01:00", test.toString()); 
 } 


public void testPropertyAddWrapFieldMonthOfYear1229() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.monthOfYear().addWrapField(8); 
     assertEquals("2004-02-09T00:00:00.000Z", test.toString()); 
 } 


public void testPropertyGetYearOfCentury1374() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertSame(test.getChronology().yearOfCentury(), test.yearOfCentury().getField()); 
     assertEquals("yearOfCentury", test.yearOfCentury().getName()); 
     assertEquals("Property[yearOfCentury]", test.yearOfCentury().toString()); 
     assertEquals(4, test.yearOfCentury().get()); 
     assertEquals("4", test.yearOfCentury().getAsText()); 
     assertEquals("4", test.yearOfCentury().getAsText(Locale.FRENCH)); 
     assertEquals("4", test.yearOfCentury().getAsShortText()); 
     assertEquals("4", test.yearOfCentury().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().years(), test.yearOfCentury().getDurationField()); 
     assertEquals(test.getChronology().centuries(), test.yearOfCentury().getRangeDurationField()); 
     assertEquals(2, test.yearOfCentury().getMaximumTextLength(null)); 
     assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null)); 
 } 


public void testPropertyRoundHalfEvenHourOfDay1460() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 0); 
     test.hourOfDay().roundHalfEven(); 
     assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 14, 30, 0, 0); 
     test.hourOfDay().roundHalfEven(); 
     assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 13, 30, 0, 1); 
     test.hourOfDay().roundHalfEven(); 
     assertEquals("2004-06-09T14:00:00.000+01:00", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 13, 29, 59, 999); 
     test.hourOfDay().roundHalfEven(); 
     assertEquals("2004-06-09T13:00:00.000+01:00", test.toString()); 
 } 


public void testPropertyGetYearOfEra1473() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertSame(test.getChronology().yearOfEra(), test.yearOfEra().getField()); 
     assertEquals("yearOfEra", test.yearOfEra().getName()); 
     assertEquals("Property[yearOfEra]", test.yearOfEra().toString()); 
     assertEquals(2004, test.yearOfEra().get()); 
     assertEquals("2004", test.yearOfEra().getAsText()); 
     assertEquals("2004", test.yearOfEra().getAsText(Locale.FRENCH)); 
     assertEquals("2004", test.yearOfEra().getAsShortText()); 
     assertEquals("2004", test.yearOfEra().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().years(), test.yearOfEra().getDurationField()); 
     assertEquals(test.getChronology().eras(), test.yearOfEra().getRangeDurationField()); 
     assertEquals(9, test.yearOfEra().getMaximumTextLength(null)); 
     assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null)); 
 } 


public void testPropertyGetSecondOfDay1508() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     assertSame(test.getChronology().secondOfDay(), test.secondOfDay().getField()); 
     assertEquals("secondOfDay", test.secondOfDay().getName()); 
     assertEquals("Property[secondOfDay]", test.secondOfDay().toString()); 
     assertEquals(48223, test.secondOfDay().get()); 
     assertEquals("48223", test.secondOfDay().getAsText()); 
     assertEquals("48223", test.secondOfDay().getAsText(Locale.FRENCH)); 
     assertEquals("48223", test.secondOfDay().getAsShortText()); 
     assertEquals("48223", test.secondOfDay().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().seconds(), test.secondOfDay().getDurationField()); 
     assertEquals(test.getChronology().days(), test.secondOfDay().getRangeDurationField()); 
     assertEquals(5, test.secondOfDay().getMaximumTextLength(null)); 
     assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null)); 
 } 


public void testPropertySetTextDayOfYear1668() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.dayOfYear().set("12"); 
     assertEquals("2004-01-12T00:00:00.000Z", test.toString()); 
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
    

    

    

    

    

    

    

    

    

}
