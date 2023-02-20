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
package org.joda.time.format;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;

/**
 * Makes sure that text fields are correct for English.
 *
 * @author Brian S O'Neill
 */
public class TestTextFields extends TestCase {

    private static final DateTimeZone[] ZONES = {
        DateTimeZone.UTC,
        DateTimeZone.forID("Europe/Paris"),
        DateTimeZone.forID("Europe/London"),
        DateTimeZone.forID("Asia/Tokyo"),
        DateTimeZone.forID("America/Los_Angeles"),
    };

    private static final String[] MONTHS = {
        null,
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    private static final String[] WEEKDAYS = {
        null,
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    private static final String[] HALFDAYS = {
        "AM", "PM"
    };

    private DateTimeZone originalDateTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestTextFields.class);
    }

    public TestTextFields(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        originalDateTimeZone = DateTimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(ZONES[0]);
        Locale.setDefault(Locale.ENGLISH);
    }

    protected void tearDown() throws Exception {
        DateTimeZone.setDefault(originalDateTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalLocale = null;
    }

    //-----------------------------------------------------------------------
    

    

    

    

    
}
