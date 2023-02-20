/*
 *  Copyright 2001-2010 Stephen Colebourne
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
public class TestLocalDate_Properties extends TestCase {

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
        return new TestSuite(TestLocalDate_Properties.class);
    }

    public TestLocalDate_Properties(String name) {
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

public void testIsSupported_DateTimeFieldType32() { 
     LocalDate test = new LocalDate(COPTIC_PARIS); 
     assertEquals(true, test.isSupported(DateTimeFieldType.year())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.dayOfMonth())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.dayOfWeek())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.dayOfYear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.weekOfWeekyear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.weekyear())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.yearOfCentury())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.yearOfEra())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.centuryOfEra())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.weekyearOfCentury())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.era())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.hourOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfHour())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.secondOfMinute())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.millisOfSecond())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.minuteOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.secondOfDay())); 
     assertEquals(true, test.isSupported(DateTimeFieldType.millisOfDay()));


public void testPropertySetCopyTextDay218() { 
     LocalDate test = new LocalDate(1972, 6, 9); 
     LocalDate copy = test.dayOfMonth().setCopy("12"); 
     check(test, 1972, 6, 9); 
     check(copy, 1972, 6, 12); 
 }


public void testToDateTimeAtStartOfDay219() { 
     LocalDate base = new LocalDate(2005, 6, 9, COPTIC_PARIS); 
     DateTime test = base.toDateTimeAtStartOfDay(); 
     check(base, 2005, 6, 9); 
     assertEquals(new DateTime(2005, 6, 9, 0, 0, 0, 0, COPTIC_LONDON), test); 
 }


public void testPropertyWithMinimumValueDayOfMonth220() { 
     LocalDate test = new LocalDate(1972, 6, 9); 
     LocalDate copy = test.dayOfMonth().withMinimumValue(); 
     check(test, 1972, 6, 9); 
     check(copy, 1972, 6, 1); 
 }


public void test_LocalDate_new_Turk221() { 
     LocalDate date1 = new LocalDate(CUTOVER_TURK, MOCK_TURK); 
     assertEquals("2007-04-01", date1.toString()); 
     LocalDate date2 = new LocalDate(CUTOVER_TURK - 1, MOCK_TURK); 
     assertEquals("2007-03-31", date2.toString()); 
 }


public void testPlus_RP222() { 
     LocalDate test = new LocalDate(2002, 5, 3, BUDDHIST_LONDON); 
     LocalDate result = test.plus(new Period(1, 2, 3, 4, 29, 6, 7, 8)); 
     LocalDate expected = new LocalDate(2003, 7, 28, BUDDHIST_LONDON); 
     assertEquals(expected, result); 
     result = test.plus((ReadablePeriod) null); 
     assertSame(test, result); 
 }

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    private void check(LocalDate test, int year, int month, int day) {
        assertEquals(year, test.getYear());
        assertEquals(month, test.getMonthOfYear());
        assertEquals(day, test.getDayOfMonth());
    }
}
