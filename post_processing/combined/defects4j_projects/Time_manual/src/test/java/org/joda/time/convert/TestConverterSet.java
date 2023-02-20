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
import java.lang.reflect.Modifier;
import java.util.Calendar;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.ReadWritableDateTime;
import org.joda.time.ReadWritableInstant;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableInstant;

/**
 * This class is a JUnit test for ConverterSet.
 * Mostly for coverage.
 *
 * @author Stephen Colebourne
 */
public class TestConverterSet extends TestCase {

    private static final Converter c1 = new Converter() {
        public Class getSupportedType() {return Boolean.class;}
    };
    private static final Converter c2 = new Converter() {
        public Class getSupportedType() {return Character.class;}
    };
    private static final Converter c3 = new Converter() {
        public Class getSupportedType() {return Byte.class;}
    };
    private static final Converter c4 = new Converter() {
        public Class getSupportedType() {return Short.class;}
    };
    private static final Converter c4a = new Converter() {
        public Class getSupportedType() {return Short.class;}
    };
    private static final Converter c5 = new Converter() {
        public Class getSupportedType() {return Integer.class;}
    };
    
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestConverterSet.class);
    }

    public TestConverterSet(String name) {
        super(name);
    }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

}
