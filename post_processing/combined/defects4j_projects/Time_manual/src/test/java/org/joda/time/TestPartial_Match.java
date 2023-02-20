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
package org.joda.time;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.ISOChronology;

/**
 * This class is a Junit unit test for Partial.
 *
 * @author Stephen Colebourne
 */
public class TestPartial_Match extends TestCase {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    private static final DateTimeZone TOKYO = DateTimeZone.forID("Asia/Tokyo");
    private static final int OFFSET = 1;
    private static final Chronology COPTIC_PARIS = CopticChronology.getInstance(PARIS);
    private static final Chronology COPTIC_LONDON = CopticChronology.getInstance(LONDON);
    private static final Chronology COPTIC_TOKYO = CopticChronology.getInstance(TOKYO);
    private static final Chronology COPTIC_UTC = CopticChronology.getInstanceUTC();
    private static final Chronology ISO_PARIS = ISOChronology.getInstance(PARIS);
    private static final Chronology ISO_LONDON = ISOChronology.getInstance(LONDON);
    private static final Chronology ISO_TOKYO = ISOChronology.getInstance(TOKYO);
    private static final Chronology ISO_UTC = ISOChronology.getInstanceUTC();
    private static final Chronology BUDDHIST_PARIS = BuddhistChronology.getInstance(PARIS);
    private static final Chronology BUDDHIST_LONDON = BuddhistChronology.getInstance(LONDON);
    private static final Chronology BUDDHIST_TOKYO = BuddhistChronology.getInstance(TOKYO);
    private static final Chronology BUDDHIST_UTC = BuddhistChronology.getInstanceUTC();
    
    private long TEST_TIME_NOW =
            10L * DateTimeConstants.MILLIS_PER_HOUR
            + 20L * DateTimeConstants.MILLIS_PER_MINUTE
            + 30L * DateTimeConstants.MILLIS_PER_SECOND
            + 40L;
            
    private long TEST_TIME1 =
        1L * DateTimeConstants.MILLIS_PER_HOUR
        + 2L * DateTimeConstants.MILLIS_PER_MINUTE
        + 3L * DateTimeConstants.MILLIS_PER_SECOND
        + 4L;
        
    private long TEST_TIME2 =
        1L * DateTimeConstants.MILLIS_PER_DAY
        + 5L * DateTimeConstants.MILLIS_PER_HOUR
        + 6L * DateTimeConstants.MILLIS_PER_MINUTE
        + 7L * DateTimeConstants.MILLIS_PER_SECOND
        + 8L;
        
    private DateTimeZone zone = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestPartial_Match.class);
    }

    public TestPartial_Match(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        zone = DateTimeZone.getDefault();
        DateTimeZone.setDefault(LONDON);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(zone);
        zone = null;
    }

    //-----------------------------------------------------------------------

public void testIsMatch_Partial50() { 
     Partial test = createYMDwPartial(ISO_UTC, 2005, 7, 2); 
     assertEquals(true, test.isMatch(new Partial(DateTimeFieldType.year(), 2005, 7, 2))); 
     assertEquals(false, test.isMatch(new Partial(DateTimeFieldType.monthOfYear(), 2005, 7, 2))); 
     assertEquals(false, test.isMatch(new Partial(DateTimeFieldType.dayOfMonth(), 2005, 7, 2))); 
     assertEquals(true, test.isMatch(new Partial(DateTimeFieldType.dayOfWeek(), 2005, 7, 2))); 
     assertEquals(true, test.isMatch(new Partial(DateTimeFieldType.dayOfYear(), 2005, 7, 2))); 
     assertEquals(true, test.isMatch(new Partial(DateTimeFieldType.weekOfWeekyear(), 2005, 7, 2))); 
     assertEquals(true, test.isMatch(new Partial(DateTimeFieldType.weekyear(), 2005, 7, 2))); 
     assertEquals(true, test.isMatch(new Partial(DateTimeFieldType.yearOfCentury(), 2005, 7, 2))); 
     assertEquals(true, test.isMatch(new Partial(DateTimeFieldType.yearOfEra(), 2005, 7, 2))); 
     assertEquals(true, test.isMatch(new Partial(DateTimeFieldType.centuryOfEra(), 2005, 7, 2))); 
     assertEquals(true, test.isMatch(new Partial(DateTimeFieldType.era(), 2005, 7, 2))); 
     assertEquals(false, test.isMatch(new Partial(DateTimeFieldType.hourOfDay(), 2005, 7, 2))); 
     assertEquals(false, test.isMatch(new Partial(DateTimeFieldType.minuteOfHour(), 2005, 7, 2))); 
     assertEquals(false, test.isMatch(new Partial(DateTimeFieldType.secondOfMinute(), 2005, 7, 2))); 
     assertEquals(false, test.isMatch(new Partial(DateTimeFieldType.millisOfSecond(),


public void testIsMatch_Partial284() { 
     Partial test = createYMDwPartial(ISO_UTC, 2005, 7, 2); 
     Partial result = test.isMatch(new YearMonthDay(2005, 7, 2)); 
     assertEquals(true, test.isMatch(result)); 
     check(test, 2005, 7, 2); 
     result = test.isMatch(new YearMonthDay(2005, 7, 2)); 
     assertEquals(false, test.isMatch(result)); 
     check(test, 2005, 7, 2); 
     result = test.isMatch((ReadablePartial) null); 
     assertEquals(false, test.isMatch(result)); 
     check(test, 2005, 7, 2); 
     try { 
         test.isMatch(new YearMonthDay()); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     check(test, 2005, 7, 2); 
     try { 
         test.isMatch((ReadablePartial) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 }


public void testIsMatch_Partial285() { 
     Partial test = createYMDwPartial(ISO_UTC, 2005, 7, 2); 
     Partial result = test.isMatch(test); 
     assertEquals(true, test.isMatch(result)); 
     test = createYMDwPartial(DateTimeFieldType.year(), 2005, 7, 2); 
     result = test.isMatch(test); 
     assertEquals(false, test.isMatch(result)); 
     test = createYMDwPartial(DateTimeFieldType.monthOfYear(), 2005, 7, 2); 
     result = test.isMatch(test); 
     assertEquals(false, test.isMatch(result)); 
     test = createYMDwPartial(DateTimeFieldType.dayOfMonth(), 2005, 7, 2); 
     result = test.isMatch(test); 
     assertEquals(true, test.isMatch(result)); 
     test = createYMDwPartial(DateTimeFieldType.dayOfMonth(), 2005, 7, 2); 
     result = test.isMatch(test); 
     assertEquals(false, test.isMatch(result)); 
     test = createYMDwPartial(DateTimeFieldType.era(), 2005, 7, 2); 
     try { 
         test.isMatch(null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     check(test, 2005, 7, 2); 
 }

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    private Partial createYMDwPartial(Chronology chrono, int year, int month, int dow) {
        return new Partial(
            new DateTimeFieldType[] {
                    DateTimeFieldType.year(),
                    DateTimeFieldType.monthOfYear(),
                    DateTimeFieldType.dayOfWeek()},
            new int[] {year, month, dow},
            chrono);
    }

}
