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
public void testAdd_RInterval139() { 
     MutablePeriod test = new MutablePeriod(100L); 
     test.add(new Interval(100L, 200L)); 
     assertEquals(0, test.getYears()); 
     assertEquals(0, test.getMonths()); 
     assertEquals(0, test.getWeeks()); 
     assertEquals(0, test.getDays()); 
     assertEquals(0, test.getHours()); 
     assertEquals(0, test.getMinutes()); 
     assertEquals(0, test.getSeconds()); 
     assertEquals(200, test.getMillis()); 
 }
public void testPropertySetMonthOfYear246() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.monthOfYear().set(12); 
     assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.monthOfYear().set(2); 
     assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
     test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     test.monthOfYear().set(3); 
     assertEquals("2004-12-09T00:00:00.000Z", test.toString()); 
 }
public void testPropertyGetEra247() { 
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
public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths248() throws Throwable { 
     LocalDate dt1 = new LocalDate(2004, 12, 28); 
     LocalDate dt2 = new LocalDate(2005, 2, 28); 
     Period test = new Period(dt1, dt2); 
     assertEquals(PeriodType.standard(), test.getPeriodType()); 
     assertEquals(new Period(0, 2, 0, 0, 0, 0, 0, 0), test); 
 }
public void testSetDate_int_int_int1249() { 
     MutableDateTime test = new MutableDateTime(2002, 6, 9, 12, 24, 48, 501); 
     test.setDate(2010, 12, 3); 
     assertEquals(2010, test.getYear()); 
     assertEquals(12, test.getMonthOfYear()); 
     assertEquals(3, test.getDayOfMonth()); 
     assertEquals(12, test.getHourOfDay()); 
     assertEquals(24, test.getMinuteOfHour()); 
     assertEquals(48, test.getSecondOfMinute()); 
     assertEquals(501, test.getMillisOfSecond()); 
 }
public void testPropertyGetHourOfDay250() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 13, 23, 43, 53); 
     assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     assertEquals("hourOfDay", test.hourOfDay().getName()); 
     assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     assertEquals(23, test.hourOfDay().get()); 
     assertEquals("23", test.hourOfDay().getAsText()); 
     assertEquals("23", test.hourOfDay().getAsText(Locale.FRENCH)); 
     assertEquals("23", test.hourOfDay().getAsShortText()); 
     assertEquals("23", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
 }
public void testPropertyGetMonthOfYear251() { 
     MutableDateTime test = new MutableDateTime(2004, 6, 9, 0, 0, 0, 0); 
     assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); 
     assertEquals("monthOfYear", test.monthOfYear().getName()); 
     assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); 
     assertSame(test, test.monthOfYear().getMutableDateTime()); 
     assertEquals(6, test.monthOfYear().get()); 
     assertEquals("6", test.monthOfYear().getAsText()); 
     assertEquals("June", test.monthOfYear().getAsText(Locale.FRENCH)); 
     assertEquals("June", test.monthOfYear().getAsShortText()); 
     assertEquals("juin", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); 
     assertEquals(test.getChronology().years(), test.monthOfYear().getRangeDurationField()); 
     assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); 
     assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); 
     test = new MutableDateTime(2004, 7, 9, 0, 0, 0, 0); 
     assertEquals("juillet", test.monthOfYear().getAsText(Locale.FRENCH)); 
     assertEquals("juil.", test.monthOfYear().getAsShortText(Locale.FRENCH)); 
 }
public void testSetTime_int_int_int2253() { 
     MutableDateTime test = new MutableDateTime(TEST_TIME1); 
     try { 
         test.setTime(60, 6, 7, 8); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     assertEquals(TEST_TIME1, test.getMillis()); 
 }
public void testPropertyCompareToDay254() { 
     LocalDateTime test1 = new LocalDateTime(TEST_TIME1); 
     LocalDateTime test2 = new LocalDateTime(TEST_TIME2); 
     assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0); 
     assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0); 
     assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0); 
     try { 
         test1.dayOfMonth().compareTo((ReadablePartial) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     DateTime dt1 = new DateTime(TEST_TIME1); 
     DateTime dt2 = new DateTime(TEST_TIME2); 
     assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0); 
     assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0); 
     assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0); 
     try { 
         test1.dayOfMonth().compareTo((ReadableInstant) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }
public void testPropertyGetHourOfDay255() { 
     DateTime test = new DateTime(2004, 6, 9, 13, 23, 43, 53); 
     assertSame(test.getChronology().hourOfDay(), test.hourOfDay().getField()); 
     assertEquals("hourOfDay", test.hourOfDay().getName()); 
     assertEquals("Property[hourOfDay]", test.hourOfDay().toString()); 
     assertSame(test, test.hourOfDay().getDateTime()); 
     assertEquals(13, test.hourOfDay().get()); 
     assertEquals("13", test.hourOfDay().getAsString()); 
     assertEquals("13", test.hourOfDay().getAsText()); 
     assertEquals("13", test.hourOfDay().getAsText(Locale.FRENCH)); 
     assertEquals("13", test.hourOfDay().getAsShortText()); 
     assertEquals("13", test.hourOfDay().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().hours(), test.hourOfDay().getDurationField()); 
     assertEquals(test.getChronology().days(), test.hourOfDay().getRangeDurationField()); 
     assertEquals(2, test.hourOfDay().getMaximumTextLength(null)); 
     assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null)); 
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
