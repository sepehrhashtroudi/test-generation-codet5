/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.time;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * These Unit-tests will check all possible extremes when using some rounding-methods of DateUtils.
 * The extremes are tested at the switch-point in milliseconds
 * 
 * According to the implementation SEMI_MONTH will either round/truncate to the 1st or 16th
 * When rounding Calendar.MONTH it depends on the number of days within that month.
 * A month with 28 days will be rounded up from the 15th
 * A month with 29 or 30 days will be rounded up from the 16th
 * A month with 31 days will be rounded up from the 17th
 * 
 * @since 3.0
 * @version $Id$
 */
public class DateUtilsRoundingTest {

    DateFormat dateTimeParser;
    
    Date januaryOneDate;
    Date targetYearDate;
    //No targetMonths, these must be tested for every type of month(28-31 days)
    Date targetDateDate, targetDayOfMonthDate, targetAmDate, targetPmDate;
    Date targetHourOfDayDate, targetHourDate;
    Date targetMinuteDate;
    Date targetSecondDate;
    Date targetMilliSecondDate;

    Calendar januaryOneCalendar;
    FastDateFormat fdf = DateFormatUtils.ISO_DATETIME_FORMAT;


    @Before
    public void setUp() throws Exception {

        dateTimeParser = new SimpleDateFormat("MMM dd, yyyy H:mm:ss.SSS", Locale.ENGLISH);
        
        targetYearDate = dateTimeParser.parse("January 1, 2007 0:00:00.000");
        targetDateDate = targetDayOfMonthDate = dateTimeParser.parse("June 1, 2008 0:00:00.000");
        targetAmDate =  dateTimeParser.parse("June 1, 2008 0:00:00.000");
        targetPmDate = dateTimeParser.parse("June 1, 2008 12:00:00.000");
        targetHourDate = dateTimeParser.parse("June 1, 2008 8:00:00.000");
        targetHourOfDayDate = dateTimeParser.parse("June 1, 2008 8:00:00.000");
        targetMinuteDate =  dateTimeParser.parse("June 1, 2008 8:15:00.000");
        targetSecondDate =  dateTimeParser.parse("June 1, 2008 8:15:14.000");
        targetMilliSecondDate =  dateTimeParser.parse("June 1, 2008 8:15:14.231");
        
        januaryOneDate = dateTimeParser.parse("January 1, 2008 0:00:00.000");
        januaryOneCalendar = Calendar.getInstance();
        januaryOneCalendar.setTime(januaryOneDate);
    }

    /**
     * Tests DateUtils.round()-method with Calendar.Year
     * 
     * @throws Exception
     * @since 3.0
     */
@Test
public void modify() { final Calendar cal = Calendar.getInstance(); cal.set(Calendar.YEAR, 280000000); cal.set(Calendar.MONTH, 1); cal.set(Calendar.DAY_OF_MONTH, 1); cal.set(Calendar.HOUR_OF_DAY, 1); cal.set(Calendar.MINUTE, 1); cal.set(Calendar.SECOND, 1); cal.set(Calendar.MILLISECOND, 1); cal.set(Calendar.SECOND, 1); cal.set(Calendar.MILLISECOND, 1); cal.set(Calendar.SECOND, 1); cal.set(Calendar.MILLISECOND, 1); cal.set(Calendar.SECOND, 1);
}

@Test
public void modify() { final Calendar cal = Calendar.getInstance(); cal.set(Calendar.YEAR, 280000000); cal.set(Calendar.SECOND, 0); cal.set(Calendar.MILLISECOND, 0); cal.set(Calendar.HOUR_OF_DAY, 0); cal.set(Calendar.MINUTE, 0); cal.set(Calendar.SECOND, 0); cal.set(Calendar.MILLISECOND, 0); cal.set(Calendar.MILLISECOND, 0); cal.set(Calendar.SECOND, 0); cal.set(Calendar.HOUR_OF_DAY, 0); cal.set(Calendar.MINUTE, 0); cal.set(Calendar.SECOND, 0);
}

@Test
public void modify() { final Calendar cal = Calendar.getInstance(); cal.set(Calendar.YEAR, 280000000); cal.set(Calendar.MINUTE, 0); cal.set(Calendar.SECOND, 0); cal.set(Calendar.MILLISECOND, 0); cal.set(Calendar.HOUR_OF_DAY, 0); cal.set(Calendar.MINUTE, 0); cal.set(Calendar.SECOND, 0); cal.set(Calendar.MILLISECOND, 0); cal.set(Calendar.HOUR_OF_DAY, 0); cal.set(Calendar.MINUTE, 0); cal.set(Calendar.SECOND, 0); cal.set(Calendar.MILLISECOND, 0);
}

@Test
public void testModify671() { final Calendar cal = Calendar.getInstance(); cal.set(Calendar.YEAR, 280000000); cal.set(Calendar.MONTH, 1); cal.set(Calendar.DAY_OF_MONTH, 1); cal.set(Calendar.HOUR_OF_DAY, 1); cal.set(Calendar.MINUTE, 1); cal.set(Calendar.SECOND, 1); cal.set(Calendar.MILLISECOND, 1); cal.set(Calendar.SECOND, 1); cal.set(Calendar.MILLISECOND, 1); cal.set(Calendar.SECOND, 1); cal.set(Calendar.SECOND, 1); cal.set(Calendar.SECOND, 1);
}

    
    
    /**
     * Tests DateUtils.round()-method with Calendar.MONTH
     * Includes rounding months with 28, 29, 30 and 31 days
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with DateUtils.SEMI_MONTH
     * Includes rounding months with 28, 29, 30 and 31 days, each with first and second half 
     * Includes rounding to January 1
     *      
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.DATE
     * Includes rounding the extremes of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.DAY_OF_MONTH
     * Includes rounding the extremes of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.AM_PM
     * Includes rounding the extremes of both AM and PM of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.HOUR_OF_DAY
     * Includes rounding the extremes of one hour 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.HOUR
     * Includes rounding the extremes of one hour 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.MINUTE
     * Includes rounding the extremes of one minute 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.SECOND
     * Includes rounding the extremes of one second 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Tests DateUtils.round()-method with Calendar.MILLISECOND
     * Includes rounding the extremes of one second 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.YEAR
     * 
     * @throws Exception
     * @since 3.0
     */
    

    /**
     * Test DateUtils.truncate()-method with Calendar.MONTH
     * 
     * @throws Exception
     * @since 3.0
     */
    

    /**
     * Test DateUtils.truncate()-method with DateUtils.SEMI_MONTH
     * Includes truncating months with 28, 29, 30 and 31 days, each with first and second half
     * 
     * @throws Exception
     * @since 3.0
     */
    

    /**
     * Test DateUtils.truncate()-method with Calendar.DATE
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.DAY_OF_MONTH
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.AM_PM
     * Includes truncating the extremes of both AM and PM of one day 
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.HOUR
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.HOUR_OF_DAY
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.MINUTE
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.SECOND
     * 
     * @throws Exception
     * @since 3.0
     */
    
    
    /**
     * Test DateUtils.truncate()-method with Calendar.SECOND
     * 
     * @throws Exception
     * @since 3.0
     */
    
        
    /**
     * When using this basetest all extremes are tested.<br> 
     * It will test the Date, Calendar and Object-implementation<br>
     * lastRoundDownDate should round down to roundedDownDate<br>
     * lastRoundDownDate + 1 millisecond should round up to roundedUpDate
     * 
     * @param roundedUpDate the next rounded date after <strong>roundedDownDate</strong> when using <strong>calendarField</strong>
     * @param roundedDownDate the result if <strong>lastRoundDownDate</strong> was rounded with <strong>calendarField</strong>
     * @param lastRoundDownDate rounding this value with <strong>calendarField</strong> will result in <strong>roundedDownDate</strong>
     * @param calendarField
     * @since 3.0
     */
    protected void baseRoundTest(final Date roundedUpDate, final Date roundedDownDate, final Date lastRoundDownDate, final int calendarField) {
        final Date firstRoundUpDate = DateUtils.addMilliseconds(lastRoundDownDate, 1);
        
        //Date-comparison
        assertEquals(roundedDownDate, DateUtils.round(roundedDownDate, calendarField));
        assertEquals(roundedUpDate, DateUtils.round(roundedUpDate, calendarField));
        assertEquals(roundedDownDate, DateUtils.round(lastRoundDownDate, calendarField));
        assertEquals(roundedUpDate, DateUtils.round(firstRoundUpDate, calendarField));
        
        //Calendar-initiations
        Calendar roundedUpCalendar, roundedDownCalendar, lastRoundDownCalendar, firstRoundUpCalendar; 
        roundedDownCalendar = Calendar.getInstance();
        roundedUpCalendar = Calendar.getInstance();
        lastRoundDownCalendar = Calendar.getInstance();
        firstRoundUpCalendar = Calendar.getInstance();
        roundedDownCalendar.setTime(roundedDownDate);
        roundedUpCalendar.setTime(roundedUpDate);
        lastRoundDownCalendar.setTime(lastRoundDownDate);
        firstRoundUpCalendar.setTime(firstRoundUpDate);

        //Calendar-comparison
        assertEquals(roundedDownCalendar, DateUtils.round(roundedDownCalendar, calendarField));
        assertEquals(roundedUpCalendar, DateUtils.round(roundedUpCalendar, calendarField));
        assertEquals(roundedDownCalendar, DateUtils.round(lastRoundDownCalendar, calendarField));
        assertEquals(roundedUpCalendar, DateUtils.round(firstRoundUpCalendar, calendarField));

        //Object-comparison
        assertEquals(roundedDownDate, DateUtils.round((Object) roundedDownDate, calendarField));
        assertEquals(roundedUpDate, DateUtils.round((Object) roundedUpDate, calendarField));
        assertEquals(roundedDownDate, DateUtils.round((Object) lastRoundDownDate, calendarField));
        assertEquals(roundedUpDate, DateUtils.round((Object) firstRoundUpDate, calendarField));
        assertEquals(roundedDownDate, DateUtils.round((Object) roundedDownCalendar, calendarField));
        assertEquals(roundedUpDate, DateUtils.round((Object) roundedUpCalendar, calendarField));
        assertEquals(roundedDownDate, DateUtils.round((Object) lastRoundDownDate, calendarField));
        assertEquals(roundedUpDate, DateUtils.round((Object) firstRoundUpDate, calendarField));
    }
    
    /**
     * When using this basetest all extremes are tested.<br> 
     * It will test the Date, Calendar and Object-implementation<br>
     * lastTruncateDate should round down to truncatedDate<br>
     * lastTruncateDate + 1 millisecond should never round down to truncatedDate
     * 
     * @param truncatedDate expected Date when <strong>lastTruncateDate</strong> is truncated with <strong>calendarField</strong>
     * @param lastTruncateDate the last possible Date which will truncate to <strong>truncatedDate</strong> with <strong>calendarField</strong>
     * @param calendarField a Calendar.field value
     * @since 3.0
     */
    protected void baseTruncateTest(final Date truncatedDate, final Date lastTruncateDate, final int calendarField) {
        final Date nextTruncateDate = DateUtils.addMilliseconds(lastTruncateDate, 1);
        
        //Date-comparison
        assertEquals("Truncating "+ fdf.format(truncatedDate) +" as Date with CalendarField-value "+ calendarField +" must return itself", truncatedDate, DateUtils.truncate(truncatedDate, calendarField));
        assertEquals(truncatedDate, DateUtils.truncate(lastTruncateDate, calendarField));
        assertFalse(fdf.format(lastTruncateDate) +" is not an extreme when truncating as Date with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate(nextTruncateDate, calendarField)));
        
        //Calendar-initiations
        Calendar truncatedCalendar, lastTruncateCalendar, nextTruncateCalendar; 
        truncatedCalendar = Calendar.getInstance();
        lastTruncateCalendar = Calendar.getInstance();
        nextTruncateCalendar = Calendar.getInstance();
        truncatedCalendar.setTime(truncatedDate);
        lastTruncateCalendar.setTime(lastTruncateDate);
        nextTruncateCalendar.setTime(nextTruncateDate);

        //Calendar-comparison
        assertEquals("Truncating "+ fdf.format(truncatedCalendar) +" as Calendar with CalendarField-value "+ calendarField +" must return itself", truncatedCalendar, DateUtils.truncate(truncatedCalendar, calendarField));
        assertEquals(truncatedCalendar, DateUtils.truncate(lastTruncateCalendar, calendarField));
        assertFalse(fdf.format(lastTruncateCalendar) +" is not an extreme when truncating as Calendar with CalendarField-value "+ calendarField, truncatedCalendar.equals(DateUtils.truncate(nextTruncateCalendar, calendarField)));

        //Object-comparison
        assertEquals("Truncating "+ fdf.format(truncatedDate) +" as Date cast to Object with CalendarField-value "+ calendarField +" must return itself as Date", truncatedDate, DateUtils.truncate((Object) truncatedDate, calendarField));
        assertEquals(truncatedDate, DateUtils.truncate((Object) lastTruncateDate, calendarField));
        assertFalse(fdf.format(lastTruncateDate) +" is not an extreme when truncating as Date cast to Object with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate((Object) nextTruncateDate, calendarField)));
        assertEquals("Truncating "+ fdf.format(truncatedCalendar) +" as Calendar cast to Object with CalendarField-value "+ calendarField +" must return itself as Date", truncatedDate, DateUtils.truncate((Object) truncatedCalendar, calendarField));
        assertEquals(truncatedDate, DateUtils.truncate((Object) lastTruncateCalendar, calendarField));
        assertFalse(fdf.format(lastTruncateCalendar) +" is not an extreme when truncating as Calendar cast to Object with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate((Object) nextTruncateCalendar, calendarField)));
    }
    
    /**
     * 
     * Any January 1 could be considered as the ultimate extreme.
     * Instead of comparing the results if the input has a difference of 1 millisecond we check the output to be exactly January first. 
     * 
     * @param minDate
     * @param maxDate
     * @param calendarField
     * @since 3.0
     */
    protected void roundToJanuaryFirst(final Date minDate, final Date maxDate, final int calendarField) {
        assertEquals("Rounding "+ fdf.format(januaryOneDate) +" as Date with CalendarField-value "+ calendarField +" must return itself", januaryOneDate, DateUtils.round(januaryOneDate, calendarField));
        assertEquals(januaryOneDate, DateUtils.round(minDate, calendarField));
        assertEquals(januaryOneDate, DateUtils.round(maxDate, calendarField));
        
        final Calendar minCalendar = Calendar.getInstance();
        minCalendar.setTime(minDate);
        final Calendar maxCalendar = Calendar.getInstance();
        maxCalendar.setTime(maxDate);
        assertEquals("Rounding "+ fdf.format(januaryOneCalendar) +" as Date with CalendarField-value "+ calendarField +" must return itself", januaryOneCalendar, DateUtils.round(januaryOneCalendar, calendarField));
        assertEquals(januaryOneCalendar, DateUtils.round(minCalendar, calendarField));
        assertEquals(januaryOneCalendar, DateUtils.round(maxCalendar, calendarField));

        final Date toPrevRoundDate = DateUtils.addMilliseconds(minDate, -1);
        final Date toNextRoundDate = DateUtils.addMilliseconds(maxDate, 1);
        assertFalse(fdf.format(minDate) +" is not an lower-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toPrevRoundDate, calendarField)));
        assertFalse(fdf.format(maxDate) +" is not an upper-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toNextRoundDate, calendarField)));
        
        final Calendar toPrevRoundCalendar = Calendar.getInstance();
        toPrevRoundCalendar.setTime(toPrevRoundDate);
        final Calendar toNextRoundCalendar = Calendar.getInstance();
        toNextRoundCalendar.setTime(toNextRoundDate);
        assertFalse(fdf.format(minCalendar) +" is not an lower-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toPrevRoundDate, calendarField)));
        assertFalse(fdf.format(maxCalendar) +" is not an upper-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toNextRoundDate, calendarField)));
    }
}
