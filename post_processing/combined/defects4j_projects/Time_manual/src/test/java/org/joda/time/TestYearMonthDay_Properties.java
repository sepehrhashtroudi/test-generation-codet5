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

import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.LenientChronology;
import org.joda.time.chrono.StrictChronology;

/**
 * This class is a Junit unit test for YearMonthDay.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestYearMonthDay_Properties extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);

    private long TEST_TIME_NOW =
            (31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    private long TEST_TIME1 =
        (31L + 28L + 31L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 12L * DateTimeConstants.MILLIS_PER_HOUR
        + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private long TEST_TIME2 =
        (365L + 31L + 28L + 31L + 30L + 7L -1L) * DateTimeConstants.MILLIS_PER_DAY
        + 14L * DateTimeConstants.MILLIS_PER_HOUR
        + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private DateTimeZone zone = null;

    private Locale systemDefaultLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestYearMonthDay_Properties.class);
    }

    public TestYearMonthDay_Properties(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(DateTimeZone.UTC);
        systemDefaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.ENGLISH);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
        Locale.setDefault(systemDefaultLocale);
        systemDefaultLocale = null;
    }

    //-----------------------------------------------------------------------

public void testFormatParse_textYear_UK24() { 
     DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder().appendLiteral('$').appendText(DateTimeFieldType.year()).toFormatter().withLocale(Locale.UK).withZoneUTC(); 
     String str = new DateTime(2007, 6, 23, 0, 0, 0, 0, UTC).toString(dateFormatter); 
     assertEquals("$2007", str); 
     try { 
         dateFormatter.parseDateTime(str); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void testPropertyWithMinimumValueDayOfMonth33() { 
     YearMonthDay test = new YearMonthDay(1972, 6, 9); 
     YearMonthDay copy = test.dayOfMonth().withMinimumValue(); 
     check(test, 1972, 6, 9); 
     check(copy, 1972, 6, 1); 
 }


public void testPropertyCompareToYear184() { 
     YearMonthDay test1 = new YearMonthDay(TEST_TIME1); 
     YearMonthDay test2 = new YearMonthDay(TEST_TIME2); 
     assertEquals(true, test1.year().compareTo(test2) < 0); 
     assertEquals(true, test2.year().compareTo(test1) > 0); 
     assertEquals(true, test1.year().compareTo(test1) == 0); 
     try { 
         test1.year().compareTo((ReadablePartial) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     DateTime dt1 = new DateTime(TEST_TIME1); 
     DateTime dt2 = new DateTime(TEST_TIME2); 
     assertEquals(true, test1.year().compareTo(dt2) < 0); 
     assertEquals(true, test2.year().compareTo(dt1) > 0); 
     assertEquals(true, test1.year().compareTo(dt1) == 0); 
     try { 
         test1.year().compareTo((ReadableInstant) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void testPropertyWithMaximumValueHour185() { 
     Partial test = new Partial(TYPES, VALUES); 
     Partial copy = test.property(DateTimeFieldType.hourOfDay()).withMaximumValue(); 
     check(test, 10, 20, 30, 40); 
     check(copy, 23, 20, 30, 40); 
 }

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(YearMonthDay test, int year, int month, int day) {
        assertEquals(year, test.getYear());
        assertEquals(month, test.getMonthOfYear());
        assertEquals(day, test.getDayOfMonth());
    }
}
