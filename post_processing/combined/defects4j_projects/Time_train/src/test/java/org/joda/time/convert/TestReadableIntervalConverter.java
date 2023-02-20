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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.MutableInterval;
import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInterval;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a JUnit test for ReadableIntervalConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadableIntervalConverter extends TestCase {

    private static final DateTimeZone UTC = DateTimeZone.UTC;
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static Chronology JULIAN;
    private static Chronology ISO;
    
    private DateTimeZone zone = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestReadableIntervalConverter.class);
    }

    public TestReadableIntervalConverter(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        JULIAN = JulianChronology.getInstance();
        ISO = ISOChronology.getInstance();
    }

    //-----------------------------------------------------------------------

public void testIsReadableInterval_Object_Chronology374() throws Exception { 
     Interval i = new Interval(1234L, 5678L); 
     assertEquals(true, ReadableIntervalConverter.INSTANCE.isReadableInterval(i, null)); 
 } 


public void testSetIntoPeriod_Object1648() throws Exception { 
     Interval i = new Interval(100L, 223L); 
     MutablePeriod m = new MutablePeriod(PeriodType.millis()); 
     ReadableIntervalConverter.INSTANCE.setInto(m, i, null); 
     assertEquals(0, m.getYears()); 
     assertEquals(0, m.getMonths()); 
     assertEquals(0, m.getWeeks()); 
     assertEquals(0, m.getDays()); 
     assertEquals(0, m.getHours()); 
     assertEquals(0, m.getMinutes()); 
     assertEquals(0, m.getSeconds()); 
     assertEquals(123, m.getMillis()); 
 } 


public void testSetIntoInterval_Object1881() throws Exception { 
     Interval i = new Interval(0L, 123L, CopticChronology.getInstance()); 
     MutableInterval m = new MutableInterval(-1000L, 1000L, BuddhistChronology.getInstance()); 
     ReadableIntervalConverter.INSTANCE.setInto(m, i, null); 
     assertEquals(0L, m.getStartMillis()); 
     assertEquals(123L, m.getEndMillis()); 
     assertEquals(CopticChronology.getInstance(), m.getChronology()); 
 } 


public void testGetPeriodType_Object1020() throws Exception { 
     Interval i = new Interval(100L, 223L); 
     assertEquals(PeriodType.standard(), ReadableIntervalConverter.INSTANCE.getPeriodType(i)); 
 } 


public void testSupportedType1240() throws Exception { 
     assertEquals(ReadableInterval.class, ReadableIntervalConverter.INSTANCE.getSupportedType()); 
 } 


public void testGetDurationMillis_Object1371() throws Exception { 
     Interval i = new Interval(100L, 223L); 
     assertEquals(123L, ReadableIntervalConverter.INSTANCE.getDurationMillis(i)); 
 } 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
