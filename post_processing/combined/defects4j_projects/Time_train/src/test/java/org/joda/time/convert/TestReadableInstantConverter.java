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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.TimeOfDay;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for ReadableInstantConverter.
 *
 * @author Stephen Colebourne
 */
public class TestReadableInstantConverter extends TestCase {

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
        return new TestSuite(TestReadableInstantConverter.class);
    }

    public TestReadableInstantConverter(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        JULIAN = JulianChronology.getInstance();
        ISO = ISOChronology.getInstance();
    }

    //-----------------------------------------------------------------------

public void testGetChronology_Object_Zone658() throws Exception { 
     assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), PARIS)); 
     assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), PARIS)); 
     assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), DateTimeZone.getDefault())); 
     assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), DateTimeZone.getDefault())); 
     assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), (DateTimeZone) null)); 
     assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), (DateTimeZone) null)); 
     assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L, new MockBadChronology()), PARIS)); 
     MutableDateTime mdt = new MutableDateTime() { 
  
         public Chronology getChronology() { 
             return null; 
         } 
     }; 
     assertEquals(ISO_PARIS, ReadableInstantConverter.INSTANCE.getChronology(mdt, PARIS)); 
 } 


public void testGetChronology_Object_Chronology1160() throws Exception { 
     assertEquals(JULIAN, ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), JULIAN)); 
     assertEquals(JULIAN, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), JULIAN)); 
 } 


public void testGetChronology_Object_nullChronology1277() throws Exception { 
     assertEquals(ISO.withUTC(), ReadableInstantConverter.INSTANCE.getChronology(new Instant(123L), (Chronology) null)); 
     assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(new DateTime(123L), (Chronology) null)); 
     MutableDateTime mdt = new MutableDateTime() { 
  
         public Chronology getChronology() { 
             return null; 
         } 
     }; 
     assertEquals(ISO, ReadableInstantConverter.INSTANCE.getChronology(mdt, (Chronology) null)); 
 } 


public void testToString1479() { 
     assertEquals("Converter[org.joda.time.ReadableInstant]", ReadableInstantConverter.INSTANCE.toString()); 
 } 


public void testGetInstantMillis_Object_Chronology1527() throws Exception { 
     assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new Instant(123L), JULIAN)); 
     assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new DateTime(123L), JULIAN)); 
     assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new Instant(123L), (Chronology) null)); 
     assertEquals(123L, ReadableInstantConverter.INSTANCE.getInstantMillis(new DateTime(123L), (Chronology) null)); 
 } 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
