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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.FastDatePrinter}.
 *
 * @since 3.0
 */
public class FastDatePrinterTest {
    
    private static final String YYYY_MM_DD = "yyyy/MM/dd";
    private static final TimeZone NEW_YORK = TimeZone.getTimeZone("America/New_York");
    private static final Locale SWEDEN = new Locale("sv", "SE");

        DatePrinter getInstance(final String format) {
        return getInstance(format, TimeZone.getDefault(), Locale.getDefault());
    }

    private DatePrinter getDateInstance(final int dateStyle, final Locale locale) {
        return getInstance(FormatCache.getPatternForStyle(Integer.valueOf(dateStyle), null, locale), TimeZone.getDefault(), Locale.getDefault());
    }

    private DatePrinter getInstance(final String format, final Locale locale) {
        return getInstance(format, TimeZone.getDefault(), locale);
    }

    private DatePrinter getInstance(final String format, final TimeZone timeZone) {
        return getInstance(format, timeZone, Locale.getDefault());
    }

    /**
     * Override this method in derived tests to change the construction of instances
     * @param format
     * @param timeZone
     * @param locale
     * @return
     */
    protected DatePrinter getInstance(final String format, final TimeZone timeZone, final Locale locale) {
        return new FastDatePrinter(format, timeZone, locale);
    }

@Test
public void testShortDateStyleWithLocales24() { 
     final Locale usLocale = Locale.US; 
     final Locale swedishLocale = new Locale("sv", "SE"); 
     final Calendar cal = Calendar.getInstance(); 
     cal.set(2004, 1, 3); 
     DatePrinter fdf = getDateInstance(FastDateFormat.SHORT, usLocale); 
     assertEquals("2/3/04", fdf.format(cal)); 
     fdf = getDateInstance(FastDateFormat.SHORT, swedishLocale); 
     assertEquals("2004-02-03", fdf.format(cal)); 
 }
@Test
public void testTimeZoneDisplay188() { 
     final Locale usLocale = Locale.US; 
     final Locale swedishLocale = new Locale("sv", "SE"); 
     final Calendar cal = Calendar.getInstance(); 
     cal.set(2004, 1, 3); 
     DatePrinter fdf = getDateInstance(FastDateFormat.SHORT, usLocale); 
     assertEquals("2/3/04", fdf.format(cal)); 
     fdf = getDateInstance(FastDateFormat.SHORT, swedishLocale); 
     assertEquals("2004-02-03", fdf.format(cal)); 
 }
@Test
public void testSMTP189() { 
     final TimeZone timeZone = TimeZone.getTimeZone("GMT-3"); 
     final Calendar cal = Calendar.getInstance(timeZone); 
     cal.set(2003, 5, 8, 10, 11, 12); 
     String text = DateFormatUtils.format(cal.getTime(), DateFormatUtils.SMTP_DATETIME_FORMAT.getPattern(), timeZone, DateFormatUtils.SMTP_DATETIME_FORMAT.getLocale()); 
     assertEquals("Sun, 08 Jun 2003 10:11:12 -0300", text); 
     text = DateFormatUtils.format(cal.getTime().getTime(), DateFormatUtils.SMTP_DATETIME_FORMAT.getPattern(), timeZone, DateFormatUtils.SMTP_DATETIME_FORMAT.getLocale()); 
     assertEquals("Sun, 08 Jun 2003 10:11:12 -0300", text); 
     text = DateFormatUtils.SMTP_DATETIME_FORMAT.format(cal); 
     assertEquals("Sun, 08 Jun 2003 10:11:12 -0300", text); 
     text = DateFormatUtils.formatUTC(cal.getTime().getTime(), DateFormatUtils.SMTP_DATETIME_FORMAT.getPattern(), DateFormatUtils.SMTP_DATETIME_FORMAT.getLocale()); 
     assertEquals("Sun, 08 Jun 2003 13:11:12 +0000", text); 
 }
@Test
public void testLang645191() { 
     final Locale locale = new Locale("sv", "SE"); 
     final Calendar cal = Calendar.getInstance(); 
     cal.set(2010, 0, 1, 12, 0, 0); 
     final Date d = cal.getTime(); 
     final DatePrinter fdf = getInstance("EEEE', week 'ww", locale); 
     assertEquals("fredag, week 53", fdf.format(d)); 
 }
@Test
public void testEquals192() { 
     final DatePrinter printer1 = getInstance(YYYY_MM_DD); 
     final DatePrinter printer2 = getInstance(YYYY_MM_DD); 
     assertEquals(printer1, printer2); 
     assertEquals(printer1.hashCode(), printer2.hashCode()); 
     assertFalse(printer1.equals(new Object())); 
 }
@Test
public void testLocaleMatches195() { 
     final DatePrinter printer = getInstance(YYYY_MM_DD, NEW_YORK); 
     assertEquals(NEW_YORK, printer.getLocale()); 
 }
@Test
public void testMilleniumBug279() { 
     final Calendar cal = Calendar.getInstance(); 
     final DatePrinter format = getInstance("dd.MM.yyyy"); 
     cal.set(1000, 0, 1); 
     assertEquals("01.01.1000", format.format(cal)); 
 }
    

    /**
     * Test case for {@link FastDateParser#FastDateParser(String, TimeZone, Locale)}.
     */
    

    /**
     * Tests that pre-1000AD years get padded with yyyy
     */
    
    /**
     * Show Bug #39410 is solved
     */
    

    /**
     * testLowYearPadding showed that the date was buggy
     * This test confirms it, getting 366 back as a date
     */
    

    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
// Defects4J: flaky method
//     @Test
//     public void testCalendarTimezoneRespected() {
//         final String[] availableZones = TimeZone.getAvailableIDs();
//         final TimeZone currentZone = TimeZone.getDefault();
//         
//         TimeZone anotherZone = null;
//         for (final String zone : availableZones) {
//             if (!zone.equals(currentZone.getID())) {
//                 anotherZone = TimeZone.getTimeZone(zone);
//             }
//         }
//         
//         assertNotNull("Cannot find another timezone", anotherZone);
//         
//         final String pattern = "h:mma z";
//         final Calendar cal = Calendar.getInstance(anotherZone);
//         
//         final SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//         sdf.setTimeZone(anotherZone);
//         final String expectedValue = sdf.format(cal.getTime());
//         final String actualValue = FastDateFormat.getInstance(pattern).format(cal);
//         assertEquals(expectedValue, actualValue);
//     }
}
