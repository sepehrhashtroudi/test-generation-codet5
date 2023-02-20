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

import java.util.Date;
import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.GregorianChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.MockZeroNullIntegerConverter;
import org.joda.time.format.DateTimeFormat;

/**
 * This class is a Junit unit test for DateMidnight.
 *
 * @author Stephen Colebourne
 */
@SuppressWarnings("deprecation")
public class TestDateMidnight_Constructors extends TestCase {
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
    private long TEST_TIME_NOW_UTC =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
    private long TEST_TIME_NOW_LONDON =
            TEST_TIME_NOW_UTC - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME_NOW_PARIS =
            TEST_TIME_NOW_UTC - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    // 2002-04-05
    private long TEST_TIME1_UTC =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME1_LONDON =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME1_PARIS =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    // 2003-05-06
    private long TEST_TIME2_UTC =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
    private long TEST_TIME2_LONDON =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - DateTimeConstants.MILLIS_PER_HOUR;
    private long TEST_TIME2_PARIS =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
             - 2*DateTimeConstants.MILLIS_PER_HOUR;
    
    private DateTimeZone zone = null;
    private Locale locale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestDateMidnight_Constructors.class);
    }

    public TestDateMidnight_Constructors(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC);
        zone = DateTimeZone.getDefault();
        locale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        Locale.setDefault(Locale.UK);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        Locale.setDefault(locale);
        zone = null;
    }

    //-----------------------------------------------------------------------

public void test_now_Chronology3() throws Throwable { 
     DateMidnight test = DateMidnight.now(GregorianChronology.getInstance()); 
     assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 } 


public void testConstructor_badconverterObject_DateTimeZone24() throws Throwable { 
     try { 
         ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
         DateMidnight test = new DateMidnight(new Integer(0), GregorianChronology.getInstance()); 
         assertEquals(ISOChronology.getInstance(), test.getChronology()); 
         assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); 
     } finally { 
         ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); 
     } 
 } 


public void test_now171() throws Throwable { 
     DateMidnight test = DateMidnight.now(); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
     assertEquals(2002, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
 } 


public void testConstructor_nullDateTimeZone745() throws Throwable { 
     DateMidnight test = new DateMidnight((DateTimeZone) null); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 } 


public void testConstructor_Object_nullDateTimeZone789() throws Throwable { 
     Date date = new Date(TEST_TIME1_UTC); 
     DateMidnight test = new DateMidnight(date, (DateTimeZone) null); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
 } 


public void testConstructor_int_int_int_Chronology883() throws Throwable { 
     DateMidnight test = new DateMidnight(2002, 6, 9, GregorianChronology.getInstance()); 
     assertEquals(GregorianChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
     assertEquals(2002, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
     try { 
         new DateMidnight(Integer.MIN_VALUE, 6, 9, GregorianChronology.getInstance()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new DateMidnight(Integer.MAX_VALUE, 6, 9, GregorianChronology.getInstance()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new DateMidnight(2002, 0, 9, GregorianChronology.getInstance()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new DateMidnight(2002, 13, 9, GregorianChronology.getInstance()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new DateMidnight(2002, 6, 0, GregorianChronology.getInstance()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         new DateMidnight(2002, 6, 31, GregorianChronology.getInstance()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     new DateMidnight(2002, 7, 31, GregorianChronology.getInstance()); 
     try { 
         new DateMidnight(2002, 7, 32, GregorianChronology.getInstance()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void test_now_nullDateTimeZone969() throws Throwable { 
     try { 
         DateMidnight.now((DateTimeZone) null); 
         fail(); 
     } catch (NullPointerException ex) { 
     } 
 } 


public void testParse_formatter978() throws Throwable { 
     assertEquals(new DateMidnight(2010, 6, 30, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010--30 06", DateTimeFormat.forPattern("yyyy--dd MM"))); 
 } 


public void testConstructor_int_int_int_nullDateTimeZone1423() throws Throwable { 
     DateMidnight test = new DateMidnight(2002, 6, 9, (DateTimeZone) null); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
     assertEquals(2002, test.getYear()); 
     assertEquals(6, test.getMonthOfYear()); 
     assertEquals(9, test.getDayOfMonth()); 
 } 


public void test_now_DateTimeZone1441() throws Throwable { 
     DateMidnight test = DateMidnight.now(PARIS); 
     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     assertEquals(TEST_TIME_NOW_PARIS, test.getMillis()); 
 } 


public void testConstructor_DateTimeZone1548() throws Throwable { 
     DateMidnight test = new DateMidnight(PARIS); 
     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); 
     assertEquals(TEST_TIME_NOW_PARIS, test.getMillis()); 
 } 


public void test_now_nullChronology1645() throws Throwable { 
     try { 
         DateMidnight.now((Chronology) null); 
         fail(); 
     } catch (NullPointerException ex) { 
     } 
 } 


public void testConstructor_nullChronology1697() throws Throwable { 
     DateMidnight test = new DateMidnight((Chronology) null); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 } 


public void testConstructor_nullObject1708() throws Throwable { 
     DateMidnight test = new DateMidnight((Object) null); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); 
 } 


public void testConstructor_Object_nullChronology1735() throws Throwable { 
     Date date = new Date(TEST_TIME1_UTC); 
     DateMidnight test = new DateMidnight(date, (Chronology) null); 
     assertEquals(ISOChronology.getInstance(), test.getChronology()); 
     assertEquals(TEST_TIME1_LONDON, test.getMillis()); 
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
