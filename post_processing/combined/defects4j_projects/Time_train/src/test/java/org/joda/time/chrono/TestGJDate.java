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
package org.joda.time.chrono;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;

/**
 * Test.
 */
public class TestGJDate extends TestCase {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestGJDate.class);
    }

    public TestGJDate(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    private static final Chronology GJ_CHRONOLOGY = GJChronology.getInstanceUTC();

    //-----------------------------------------------------------------------

public void test_plusYears_positiveToZero_crossCutover153() { 
     LocalDate date = new LocalDate(2003, 6, 30, GJ_CHRONOLOGY); 
     LocalDate expected = new LocalDate(-1, 6, 30, GJ_CHRONOLOGY); 
     assertEquals(expected, date.plusYears(-2003)); 
 } 


public void test_plusYears_negativeToPositive680() { 
     LocalDate date = new LocalDate(-3, 6, 30, GJ_CHRONOLOGY); 
     LocalDate expected = new LocalDate(2, 6, 30, GJ_CHRONOLOGY); 
     assertEquals(expected, date.plusYears(4)); 
 } 


public void test_plusWeekyears_positiveToZero_crossCutover1289() { 
     LocalDate date = new LocalDate(2003, 6, 30, GJ_CHRONOLOGY); 
     LocalDate expected = new LocalDate(-1, 6, 30, GJ_CHRONOLOGY).withWeekOfWeekyear(date.getWeekOfWeekyear()).withDayOfWeek(date.getDayOfWeek()); 
     assertEquals(expected, date.weekyear().addToCopy(-2003)); 
 } 


public void test_cutoverPreZero1689() { 
     DateTime cutover = new LocalDate(-2, 6, 30, ISOChronology.getInstanceUTC()).toDateTimeAtStartOfDay(DateTimeZone.UTC); 
     try { 
         GJChronology.getInstance(DateTimeZone.UTC, cutover); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

}
