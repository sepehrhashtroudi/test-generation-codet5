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
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for StringConverter.
 *
 * @author Stephen Colebourne
 */
public class TestStringConverter extends TestCase {

    private static final DateTimeZone ONE_HOUR = DateTimeZone.forOffsetHours(1);
    private static final DateTimeZone SIX = DateTimeZone.forOffsetHours(6);
    private static final DateTimeZone SEVEN = DateTimeZone.forOffsetHours(7);
    private static final DateTimeZone EIGHT = DateTimeZone.forOffsetHours(8);
    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final Chronology ISO_EIGHT = ISOChronology.getInstance(EIGHT);
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static Chronology ISO;
    private static Chronology JULIAN;
    
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestStringConverter.class);
    }

    public TestStringConverter(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        zone = DateTimeZone.getDefault();
        locale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        Locale.setDefault(Locale.UK);
        
        JULIAN = JulianChronology.getInstance();
        ISO = ISOChronology.getInstance();
    }

    protected void tearDown() throws Exception {
        DateTimeZone.setDefault(zone);
        Locale.setDefault(locale);
        zone = null;
    }

    //-----------------------------------------------------------------------

public void testSetIntoPeriod_Object4147() throws Exception { 
     MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M.056S", null); 
     assertEquals(2, m.getYears()); 
     assertEquals(4, m.getWeeks()); 
     assertEquals(3, m.getDays()); 
     assertEquals(12, m.getHours()); 
     assertEquals(24, m.getMinutes()); 
     assertEquals(0, m.getSeconds()); 
     assertEquals(56, m.getMillis()); 
 } 


public void testSetIntoPeriod_Object6163() throws Exception { 
     MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.1234567S", null); 
     assertEquals(2, m.getYears()); 
     assertEquals(4, m.getWeeks()); 
     assertEquals(3, m.getDays()); 
     assertEquals(12, m.getHours()); 
     assertEquals(24, m.getMinutes()); 
     assertEquals(56, m.getSeconds()); 
     assertEquals(123, m.getMillis()); 
 } 


public void testGetDurationMillis_Object1221() throws Exception { 
     long millis = StringConverter.INSTANCE.getDurationMillis("PT12.345S"); 
     assertEquals(12345, millis); 
     millis = StringConverter.INSTANCE.getDurationMillis("pt12.345s"); 
     assertEquals(12345, millis); 
     millis = StringConverter.INSTANCE.getDurationMillis("pt12s"); 
     assertEquals(12000, millis); 
     millis = StringConverter.INSTANCE.getDurationMillis("pt12.s"); 
     assertEquals(12000, millis); 
     millis = StringConverter.INSTANCE.getDurationMillis("pt-12.32s"); 
     assertEquals(-12320, millis); 
     millis = StringConverter.INSTANCE.getDurationMillis("pt-0.32s"); 
     assertEquals(-320, millis); 
     millis = StringConverter.INSTANCE.getDurationMillis("pt-0.0s"); 
     assertEquals(0, millis); 
     millis = StringConverter.INSTANCE.getDurationMillis("pt0.0s"); 
     assertEquals(0, millis); 
     millis = StringConverter.INSTANCE.getDurationMillis("pt12.3456s"); 
     assertEquals(12345, millis); 
 } 


public void testIsReadableInterval_Object_Chronology574() throws Exception { 
     assertEquals(false, StringConverter.INSTANCE.isReadableInterval("", null)); 
 } 


public void testSetIntoInterval_Object_Chronology5580() throws Exception { 
     MutableInterval m = new MutableInterval(-1000L, 1000L); 
     StringConverter.INSTANCE.setInto(m, "P1Y2M/2004-06-09T+06:00", null); 
     assertEquals(new DateTime(2003, 4, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getStart()); 
     assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, SIX).withChronology(null), m.getEnd()); 
     assertEquals(ISOChronology.getInstance(), m.getChronology()); 
 } 


public void testToString604() { 
     assertEquals("Converter[java.lang.String]", StringConverter.INSTANCE.toString()); 
 } 


public void testSetIntoIntervalEx_Object_Chronology5697() throws Exception { 
     MutableInterval m = new MutableInterval(-1000L, 1000L); 
     try { 
         StringConverter.INSTANCE.setInto(m, "P1Y/P2Y", null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testSetIntoPeriod_Object3775() throws Exception { 
     MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48.034S", null); 
     assertEquals(2, m.getYears()); 
     assertEquals(4, m.getWeeks()); 
     assertEquals(3, m.getDays()); 
     assertEquals(12, m.getHours()); 
     assertEquals(24, m.getMinutes()); 
     assertEquals(48, m.getSeconds()); 
     assertEquals(34, m.getMillis()); 
 } 


public void testSetIntoIntervalEx_Object_Chronology4874() throws Exception { 
     MutableInterval m = new MutableInterval(-1000L, 1000L); 
     try { 
         StringConverter.INSTANCE.setInto(m, "/P1Y", null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testGetPartialValues1047() throws Exception { 
     TimeOfDay tod = new TimeOfDay(); 
     int[] expected = new int[] { 3, 4, 5, 6 }; 
     int[] actual = StringConverter.INSTANCE.getPartialValues(tod, "T03:04:05.006", ISOChronology.getInstance()); 
     assertEquals(true, Arrays.equals(expected, actual)); 
 } 


public void testSetIntoInterval_Object_Chronology11199() throws Exception { 
     MutableInterval m = new MutableInterval(-1000L, 1000L); 
     StringConverter.INSTANCE.setInto(m, "2004-06-09/P1Y2M", null); 
     assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0), m.getStart()); 
     assertEquals(new DateTime(2005, 8, 9, 0, 0, 0, 0), m.getEnd()); 
     assertEquals(ISOChronology.getInstance(), m.getChronology()); 
 } 


public void testSetIntoPeriod_Object81355() throws Exception { 
     MutablePeriod m = new MutablePeriod(); 
     try { 
         StringConverter.INSTANCE.setInto(m, "", null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         StringConverter.INSTANCE.setInto(m, "PXY", null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         StringConverter.INSTANCE.setInto(m, "PT0SXY", null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M48SX", null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testSetIntoIntervalEx_Object_Chronology11478() throws Exception { 
     MutableInterval m = new MutableInterval(-1000L, 1000L); 
     try { 
         StringConverter.INSTANCE.setInto(m, "", null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testGetDurationMillis_Object21504() throws Exception { 
     try { 
         StringConverter.INSTANCE.getDurationMillis("P2Y6M9DXYZ"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         StringConverter.INSTANCE.getDurationMillis("PTS"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         StringConverter.INSTANCE.getDurationMillis("XT0S"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         StringConverter.INSTANCE.getDurationMillis("PX0S"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         StringConverter.INSTANCE.getDurationMillis("PT0X"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         StringConverter.INSTANCE.getDurationMillis("PTXS"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         StringConverter.INSTANCE.getDurationMillis("PT0.0.0S"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         StringConverter.INSTANCE.getDurationMillis("PT0-00S"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         StringConverter.INSTANCE.getDurationMillis("PT-.001S"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testSetIntoIntervalEx_Object_Chronology31552() throws Exception { 
     MutableInterval m = new MutableInterval(-1000L, 1000L); 
     try { 
         StringConverter.INSTANCE.setInto(m, "P1Y/", null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testSetIntoPeriod_Object51748() throws Exception { 
     MutablePeriod m = new MutablePeriod(PeriodType.yearWeekDayTime()); 
     StringConverter.INSTANCE.setInto(m, "P2Y4W3DT12H24M56.S", null); 
     assertEquals(2, m.getYears()); 
     assertEquals(4, m.getWeeks()); 
     assertEquals(3, m.getDays()); 
     assertEquals(12, m.getHours()); 
     assertEquals(24, m.getMinutes()); 
     assertEquals(56, m.getSeconds()); 
     assertEquals(0, m.getMillis()); 
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
    

}
