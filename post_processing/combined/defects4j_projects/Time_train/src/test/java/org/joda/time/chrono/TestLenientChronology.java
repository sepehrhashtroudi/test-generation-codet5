/*
 *  Copyright 2001-2007 Stephen Colebourne
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
package org.joda.time.chrono;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MockZone;

/**
 *
 * @author Brian S O'Neill
 * @author Blair Martin
 */
public class TestLenientChronology extends TestCase {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestLenientChronology.class);
    }

    public TestLenientChronology(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------

public void test_setHourOfDay244() { 
     Chronology zone = LenientChronology.getInstance(ISOChronology.getInstanceUTC()); 
     DateTime dt = new DateTime(2007, 1, 1, 0, 0, 0, 0, zone); 
     assertEquals("2007-01-01T00:00:00.000Z", dt.toString()); 
     dt = dt.withHourOfDay(24); 
     assertEquals("2007-01-02T00:00:00.000Z", dt.toString()); 
     dt = dt.withHourOfDay(-1); 
     assertEquals("2007-01-01T23:00:00.000Z", dt.toString()); 
 } 


public void test_lenientChrononolgy_Chicago1579() { 
     DateTimeZone zone = DateTimeZone.forID("America/Chicago"); 
     Chronology lenient = LenientChronology.getInstance(ISOChronology.getInstance(zone)); 
     DateTime dt = new DateTime(2007, 3, 11, 2, 30, 0, 0, lenient); 
     assertEquals("2007-03-11T03:30:00.000-05:00", dt.toString()); 
 } 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //------------------------ Bug ------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //------------------------ Bug [1755161] --------------------------------
    //-----------------------------------------------------------------------
    /** Mock zone simulating America/Grand_Turk cutover at midnight 2007-04-01 */
    private static long CUTOVER_TURK = 1175403600000L;
    private static int OFFSET_TURK = -18000000;  // -05:00
    private static final DateTimeZone MOCK_TURK = new MockZone(CUTOVER_TURK, OFFSET_TURK, 3600);

    //-----------------------------------------------------------------------
    

    

    

    

    

}
