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
public void testFirstHourNext639() { 
     Hour first = new Hour(0, new Day(1, MonthConstants.JANUARY, 1900)); 
     Hour next = (Hour) first.next(); 
     assertEquals(1, next.getHour()); 
 }
public void testFirstHourPrevious641() { 
     Hour first = new Hour(0, new Day(1, MonthConstants.JANUARY, 1900)); 
     Hour previous = (Hour) first.previous(); 
     assertNull(previous); 
 }
public void testFirstHourNext642() { 
     Hour first = new Hour(0, new Day(1, MonthConstants.JANUARY, 1900)); 
     Hour next = (Hour) first.next(); 
     assertNull(next); 
 }
public void testHashcode643() { 
     Hour h1 = new Hour(0, new Day(1, MonthConstants.JANUARY, 1900)); 
     Hour h2 = new Hour(0, new Day(1, MonthConstants.JANUARY, 1900)); 
     assertTrue(h1.equals(h2)); 
     int h1HashCode = h1.hashCode(); 
     int h2HashCode = h2.hashCode(); 
     assertEquals(h1HashCode, h2HashCode); 
 }
public void testFirstHourNext644() { 
     Hour first = new Hour(0, new Day(1, MonthConstants.JANUARY, 1900)); 
     Hour next = (Hour) first.next(); 
     assertEquals(next, first); 
     int h1 = first.getHour(); 
     int h2 = first.getHour(); 
     assertEquals(h1, h2); 
 }
    

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
