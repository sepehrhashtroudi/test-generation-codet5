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

public void testPropertyEqualsHashCodeLenient184() { 
     LocalDate test1 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     LocalDate test2 = new LocalDate(1970, 6, 9, LenientChronology.getInstance(COPTIC_PARIS)); 
     assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 } 


public void testPropertyEquals521() { 
     LocalDate test1 = new LocalDate(2005, 11, 8); 
     LocalDate test2 = new LocalDate(2005, 11, 9); 
     LocalDate test3 = new LocalDate(2005, 11, 8, CopticChronology.getInstanceUTC()); 
     assertEquals(false, test1.dayOfMonth().equals(test1.year())); 
     assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear())); 
     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(false, test1.dayOfMonth().equals(test2.year())); 
     assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear())); 
     assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(false, test1.monthOfYear().equals(test1.year())); 
     assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); 
     assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth())); 
     assertEquals(false, test1.monthOfYear().equals(test2.year())); 
     assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear())); 
     assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth())); 
     assertEquals(false, test1.dayOfMonth().equals(null)); 
     assertEquals(false, test1.dayOfMonth().equals("any")); 
     assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth())); 
 } 


public void testPropertyWithMinimumValueDayOfMonth544() { 
     LocalDate test = new LocalDate(1972, 6, 9); 
     LocalDate copy = test.dayOfMonth().withMinimumValue(); 
     check(test, 1972, 6, 9); 
     check(copy, 1972, 6, 1); 
 } 


public void testPropertySetCopyTextDay801() { 
     LocalDate test = new LocalDate(1972, 6, 9); 
     LocalDate copy = test.dayOfMonth().setCopy("12"); 
     check(test, 1972, 6, 9); 
     check(copy, 1972, 6, 12); 
 } 


public void testPropertyAddToCopyYear1095() { 
     LocalDate test = new LocalDate(1972, 6, 9); 
     LocalDate copy = test.year().addToCopy(9); 
     check(test, 1972, 6, 9); 
     check(copy, 1981, 6, 9); 
     copy = test.year().addToCopy(0); 
     check(copy, 1972, 6, 9); 
     copy = test.year().addToCopy(292278993 - 1972); 
     check(copy, 292278993, 6, 9); 
     try { 
         test.year().addToCopy(292278993 - 1972 + 1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     check(test, 1972, 6, 9); 
     copy = test.year().addToCopy(-1972); 
     check(copy, 0, 6, 9); 
     copy = test.year().addToCopy(-1973); 
     check(copy, -1, 6, 9); 
     try { 
         test.year().addToCopy(-292275054 - 1972 - 1); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     check(test, 1972, 6, 9); 
 } 


public void testPropertyEqualsHashCodeStrict1244() { 
     LocalDate test1 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     LocalDate test2 = new LocalDate(1970, 6, 9, StrictChronology.getInstance(COPTIC_PARIS)); 
     assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); 
     assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); 
     assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); 
 } 


public void testPropertyAddWrapFieldToCopyDay1464() { 
     LocalDate test = new LocalDate(1972, 6, 9); 
     LocalDate copy = test.dayOfMonth().addWrapFieldToCopy(21); 
     check(test, 1972, 6, 9); 
     check(copy, 1972, 6, 30); 
     copy = test.dayOfMonth().addWrapFieldToCopy(22); 
     check(copy, 1972, 6, 1); 
     copy = test.dayOfMonth().addWrapFieldToCopy(-12); 
     check(copy, 1972, 6, 27); 
     test = new LocalDate(1972, 7, 9); 
     copy = test.dayOfMonth().addWrapFieldToCopy(21); 
     check(copy, 1972, 7, 30); 
     copy = test.dayOfMonth().addWrapFieldToCopy(22); 
     check(copy, 1972, 7, 31); 
     copy = test.dayOfMonth().addWrapFieldToCopy(23); 
     check(copy, 1972, 7, 1); 
     copy = test.dayOfMonth().addWrapFieldToCopy(-12); 
     check(copy, 1972, 7, 28); 
 } 


public void testPropertyGetDay1484() { 
     LocalDate test = new LocalDate(1972, 6, 9); 
     assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField()); 
     assertEquals("dayOfMonth", test.dayOfMonth().getName()); 
     assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString()); 
     assertSame(test, test.dayOfMonth().getLocalDate()); 
     assertEquals(9, test.dayOfMonth().get()); 
     assertEquals("9", test.dayOfMonth().getAsString()); 
     assertEquals("9", test.dayOfMonth().getAsText()); 
     assertEquals("9", test.dayOfMonth().getAsText(Locale.FRENCH)); 
     assertEquals("9", test.dayOfMonth().getAsShortText()); 
     assertEquals("9", test.dayOfMonth().getAsShortText(Locale.FRENCH)); 
     assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField()); 
     assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField()); 
     assertEquals(2, test.dayOfMonth().getMaximumTextLength(null)); 
     assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null)); 
 } 


public void testPropertyWithMaximumValueDayOfMonth1652() { 
     LocalDate test = new LocalDate(1972, 6, 9); 
     LocalDate copy = test.dayOfMonth().withMaximumValue(); 
     check(test, 1972, 6, 9); 
     check(copy, 1972, 6, 30); 
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
