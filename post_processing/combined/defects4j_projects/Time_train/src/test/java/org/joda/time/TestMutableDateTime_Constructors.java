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

import java.util.Date;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a Junit unit test for MutableDateTime.
 *
 * @author Stephen Colebourne
 */
public class TestMutableDateTime_Constructors extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
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
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
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
        return new TestSuite(TestMutableDateTime_Constructors.class);
    }

    public TestMutableDateTime_Constructors(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        locale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        java.util.TimeZone.setDefault(LONDON.toTimeZone());
        Locale.setDefault(Locale.UK);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        java.util.TimeZone.setDefault(zone.toTimeZone());
        Locale.setDefault(locale);
        zone = null;
    }

    //-----------------------------------------------------------------------

public void testConstructor_nullObject_nullDateTimeZone557() throws Throwable { 
     MutableDateTime test = new MutableDateTime((Object) null, (DateTimeZone) null); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void testConstructor_DateTimeZone639() throws Throwable { 
     MutableDateTime test = new MutableDateTime(PARIS); 
     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void testParse_noFormatter673() throws Throwable { 
     assertEquals(new MutableDateTime(2010, 6, 30, 1, 20, 0, 0, ISOChronology.getInstance(DateTimeZone.forOffsetHours(2))), MutableDateTime.parse("2010-06-30T01:20+02:00")); 
     assertEquals(new MutableDateTime(2010, 1, 2, 14, 50, 0, 0, ISOChronology.getInstance(LONDON)), MutableDateTime.parse("2010-002T14:50")); 
 } 


public void test_now_nullChronology903() throws Throwable { 
     try { 
         MutableDateTime.now((Chronology) null); 
         fail(); 
     } catch (NullPointerException ex) { 
     } 
 } 


public void test_now923() throws Throwable { 
     MutableDateTime test = MutableDateTime.now(); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void testConstructor_Chronology1012() throws Throwable { 
     MutableDateTime test = new MutableDateTime(GregorianChronology.getInstance()); 
     assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void testConstructor_nullObject1013() throws Throwable { 
     MutableDateTime test = new MutableDateTime((Object) null); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void test_now_DateTimeZone1079() throws Throwable { 
     MutableDateTime test = MutableDateTime.now(PARIS); 
     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void testConstructor_badconverterObject_DateTimeZone1101() throws Throwable { 
     try { 
         ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
         MutableDateTime test = new MutableDateTime(new Integer(0), GregorianChronology.getInstance()); 
         assertEquals(ISOChronology.getInstance(), test.getChronology()); 
         assertEquals(0L, test.getMillis()); 
     } finally { 
         ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
     } 
 } 


public void test_now_Chronology1312() throws Throwable { 
     MutableDateTime test = MutableDateTime.now(GregorianChronology.getInstance()); 
     assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 


public void test_now_nullDateTimeZone1403() throws Throwable { 
     try { 
         MutableDateTime.now((DateTimeZone) null); 
         fail(); 
     } catch (NullPointerException ex) { 
     } 
 } 


public void testConstructor1725() throws Throwable { 
     MutableDateTime test = new MutableDateTime(); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW, test.getMillis()); 
 } 

    

    //-----------------------------------------------------------------------
    /**
     * Test now ()
     */
    

    /**
     * Test now (DateTimeZone)
     */
    

    /**
     * Test now (DateTimeZone=null)
     */
    

    /**
     * Test now (Chronology)
     */
    

    /**
     * Test now (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    /**
     * Test constructor ()
     */
    

    /**
     * Test constructor (DateTimeZone)
     */
    

    /**
     * Test constructor (DateTimeZone=null)
     */
    

    /**
     * Test constructor (Chronology)
     */
    

    /**
     * Test constructor (Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long)
     */
    

    /**
     * Test constructor (long, DateTimeZone)
     */
    

    /**
     * Test constructor (long, DateTimeZone)
     */
    

    /**
     * Test constructor (long, DateTimeZone=null)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology)
     */
    

    /**
     * Test constructor (long, Chronology=null)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object)
     */
    

    /**
     * Test constructor (Object=null)
     */
    

    /**
     * Test constructor (Object=null)
     */
    

    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object=null, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, DateTimeZone=null)
     */
    

    /**
     * Test constructor (Object=null, DateTimeZone=null)
     */
    

    /**
     * Test constructor (Object, DateTimeZone)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    /**
     * Test constructor (Object=null, Chronology)
     */
    

    /**
     * Test constructor (Object, Chronology=null)
     */
    

    /**
     * Test constructor (Object=null, Chronology=null)
     */
    

    /**
     * Test constructor (Object, Chronology)
     */
    

    //-----------------------------------------------------------------------
    /**
     * Test constructor (int, int, int)
     */
    

    /**
     * Test constructor (int, int, int, DateTimeZone)
     */
    

    /**
     * Test constructor (int, int, int, DateTimeZone=null)
     */
    

    /**
     * Test constructor (int, int, int, Chronology)
     */
    

    /**
     * Test constructor (int, int, int, Chronology=null)
     */
    

}
