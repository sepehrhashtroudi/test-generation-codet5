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
package org.joda.time.convert;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for CalendarConverter.
 *
 * @author Stephen Colebourne
 */
public class TestCalendarConverter extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone MOSCOW = DateTimeZone.forID("Europe/Moscow");
    private static Chronology JULIAN;
    private static Chronology ISO;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestCalendarConverter.class);
    }

    public TestCalendarConverter(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        JULIAN = JulianChronology.getInstance();
        ISO = ISOChronology.getInstance();
    }

    //-----------------------------------------------------------------------

public void testGetChronology_Object_nullChronology213() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris")); 
     assertEquals(GJChronology.getInstance(PARIS), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow")); 
     cal.setGregorianChange(new Date(0L)); 
     assertEquals(GJChronology.getInstance(MOSCOW, 0L, 4), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow")); 
     cal.setGregorianChange(new Date(Long.MAX_VALUE)); 
     assertEquals(JulianChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Moscow")); 
     cal.setGregorianChange(new Date(Long.MIN_VALUE)); 
     assertEquals(GregorianChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     cal = new GregorianCalendar(new MockUnknownTimeZone()); 
     assertEquals(GJChronology.getInstance(), CalendarConverter.INSTANCE.getChronology(cal, (Chronology) null)); 
     Calendar uc = new MockUnknownCalendar(TimeZone.getTimeZone("Europe/Moscow")); 
     assertEquals(ISOChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(uc, (Chronology) null)); 
     try { 
         Calendar bc = (Calendar) Class.forName("sun.util.BuddhistCalendar").newInstance(); 
         bc.setTimeZone(TimeZone.getTimeZone("Europe/Moscow")); 
         assertEquals(BuddhistChronology.getInstance(MOSCOW), CalendarConverter.INSTANCE.getChronology(bc, (Chronology) null)); 
     } catch (ClassNotFoundException ex) { 
     } 
 } 


public void testGetChronology_Object_Chronology770() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Paris")); 
     assertEquals(JULIAN, CalendarConverter.INSTANCE.getChronology(cal, JULIAN)); 
 } 


public void testToString1556() { 
     assertEquals("Converter[java.util.Calendar]", CalendarConverter.INSTANCE.toString()); 
 } 


public void testGetPartialValues1566() throws Exception { 
     GregorianCalendar cal = new GregorianCalendar(); 
     cal.setTime(new Date(12345678L)); 
     TimeOfDay tod = new TimeOfDay(); 
     int[] expected = ISO.get(tod, 12345678L); 
     int[] actual = CalendarConverter.INSTANCE.getPartialValues(tod, cal, ISO); 
     assertEquals(true, Arrays.equals(expected, actual)); 
 } 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
