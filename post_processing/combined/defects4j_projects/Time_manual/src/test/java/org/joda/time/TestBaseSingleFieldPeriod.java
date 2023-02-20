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

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.base.BaseSingleFieldPeriod;

/**
 * This class is a Junit unit test for BaseSingleFieldPeriod.
 *
 * @author Stephen Colebourne
 */
public class TestBaseSingleFieldPeriod extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestBaseSingleFieldPeriod.class);
    }

    public TestBaseSingleFieldPeriod(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

            

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

//    public void testToDurationFrom() {
//        Period test = new Period(123L);
//        assertEquals(new Duration(123L), test.toDurationFrom(new Instant(0L)));
//    }
//
//    public void testToDurationTo() {
//        Period test = new Period(123L);
//        assertEquals(new Duration(123L), test.toDurationTo(new Instant(123L)));
//    }
//

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    /** Test class. */
    static class Single extends BaseSingleFieldPeriod {

        public Single(int period) {
            super(period);
        }
        
        public static int between(ReadableInstant start, ReadableInstant end, DurationFieldType field) {
            return BaseSingleFieldPeriod.between(start, end, field);
        }
        
        public static int between(ReadablePartial start, ReadablePartial end, ReadablePeriod zeroInstance) {
            return BaseSingleFieldPeriod.between(start, end, zeroInstance);
        }
        
        public static int standardPeriodIn(ReadablePeriod period, long millisPerUnit) {
            return BaseSingleFieldPeriod.standardPeriodIn(period, millisPerUnit);
        }
        
        public DurationFieldType getFieldType() {
            return DurationFieldType.days();
        }

        public PeriodType getPeriodType() {
            return PeriodType.days();
        }
        
        public int getValue() {
            return super.getValue();
        }
        
        public void setValue(int value) {
            super.setValue(value);
        }
    }

}
