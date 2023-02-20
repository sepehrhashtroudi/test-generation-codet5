/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2008, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc.
 * in the United States and other countries.]
 *
 * --------------
 * HourTests.java
 * --------------
 * (C) Copyright 2002-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 29-Jan-2002 : Version 1 (DG);
 * 17-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 * 13-Mar-2003 : Added serialization test (DG);
 * 21-Oct-2003 : Added hashCode test (DG);
 * 11-Jan-2005 : Added test for non-clonability (DG);
 * 05-Oct-2006 : Added new tests (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 * 11-Jul-2007 : Fixed bad time zone assumption (DG);
 *
 */

package org.jfree.data.time.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.MonthConstants;

/**
 * Tests for the {@link Hour} class.
 */
public class HourTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(HourTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public HourTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        // no setup
    }

    /**
     * Check that an Hour instance is equal to itself.
     *
     * SourceForge Bug ID: 558850.
     */
public void testHour3419() { Hour h = new Hour(1, new Day(1, 1, 1)); assertEquals(1, h.getHour()); assertEquals(1, h.getDayOfMonth()); assertEquals(1, h.getHour()); assertEquals(1, h.getYear()); assertEquals(1, h.getMonth()); assertEquals(1, h.getDayOfMonth()); assertEquals(1, h.getHour()); assertEquals(1, h.getYear()); assertEquals(1, h.getMonth()); assertEquals(1, h.getDayOfMonth()); assertEquals(1, h.getHour()); assertEquals(1, h.getHour());
}

public void testHour3426() { Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles")); Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles")); Calendar cal3 = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles")); cal2.setTimeInMillis(cal.getTimeInMillis()); cal3.setTimeInMillis(cal.getTimeInMillis()); Hour h = new Hour(1, 2, 3, 1970); assertEquals(1, h.getHour()); assertEquals(2, h.getDayOfMonth()); assertEquals(3, h.getHour());
}

public void testHour3427() { Calendar c = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles")); Hour h = new Hour(0, 0, 0, 1970); assertEquals(0, h.getHour()); assertEquals(0, h.getDayOfMonth()); assertEquals(0, h.getYear()); assertEquals(0, h.getMonth()); assertEquals(0, h.getYear()); assertEquals(0, h.getDayOfMonth()); assertEquals(0, h.getHour()); assertEquals(0, h.getFirstMillisecond()); assertEquals(0, h.getLastMillisecond(c)); }
public void testFirstHour3441() { Hour a = new Hour(0, new Day(0, 0, 0)); assertEquals(new Day(0, 0, 0), a.previous()); }
public void testGetFirstMillisecond3448() { Locale saved = Locale.getDefault(); Locale.setDefault(Locale.UK); TimeZone savedZone = TimeZone.getDefault(); TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); Calendar c = new GregorianCalendar(saved); assertEquals(0, new Hour(0, 0, 0, 0).getFirstMillisecond(c)); Locale.setDefault(saved); TimeZone.setDefault(savedZone); }
public void testGetLastMillisecond3452() { Locale saved = Locale.getDefault(); Locale.setDefault(Locale.UK); TimeZone savedZone = TimeZone.getDefault(); TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); Calendar c = new GregorianCalendar(saved); assertEquals(0, new Hour().getLastMillisecond(c)); Locale.setDefault(saved); TimeZone.setDefault(savedZone); }
public void testGetLastMillisecond3454() { Locale saved = Locale.getDefault(); Locale.setDefault(Locale.UK); TimeZone savedZone = TimeZone.getDefault(); TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); Hour h = new Hour(0, 0, 0, 1970); Calendar c = new GregorianCalendar(saved); assertEquals(0, h.getLastMillisecond(c)); try { h.getLastMillisecond(null); fail("NullPointerException should have been thrown"); } catch (NullPointerException e) { } }
    

    /**
     * Tests the equals method.
     */
    

    /**
     * In GMT, the 4pm on 21 Mar 2002 is java.util.Date(1,014,307,200,000L).
     * Use this to check the hour constructor.
     */
    

    /**
     * In Sydney, the 4pm on 21 Mar 2002 is java.util.Date(1,014,267,600,000L).
     * Use this to check the hour constructor.
     */
    

    /**
     * Set up an hour equal to hour zero, 1 January 1900.  Request the
     * previous hour, it should be null.
     */
    

    /**
     * Set up an hour equal to hour zero, 1 January 1900.  Request the next
     * hour, it should be null.
     */
    

    /**
     * Set up an hour equal to hour zero, 1 January 1900.  Request the previous
     * hour, it should be null.
     */
    

    /**
     * Set up an hour equal to hour zero, 1 January 1900.  Request the next
     * hour, it should be null.
     */
    

    /**
     * Problem for date parsing.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * The {@link Hour} class is immutable, so should not be {@link Cloneable}.
     */
    

/**
     * Some checks for the getFirstMillisecond() method.
     */
    

    /**
     * Some checks for the getFirstMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getFirstMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getLastMillisecond() method.
     */
    

    /**
     * Some checks for the getLastMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getLastMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getSerialIndex() method.
     */
    

    /**
     * Some checks for the testNext() method.
     */
    

    /**
     * Some checks for the getStart() method.
     */
    

    /**
     * Some checks for the getEnd() method.
     */
    

}
