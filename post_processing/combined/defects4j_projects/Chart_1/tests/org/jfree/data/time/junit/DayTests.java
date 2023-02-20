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
 * -------------
 * DayTests.java
 * -------------
 * (C) Copyright 2001-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 15-Nov-2001 : Version 1 (DG);
 * 20-Mar-2002 : Added new tests for Day constructor and getStart() and
 *               getEnd() in different time zones (DG);
 * 26-Jun-2002 : Removed unnecessary imports (DG);
 * 17-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 * 13-Mar-2003 : Added serialization test (DG);
 * 21-Oct-2003 : Added hashCode test (DG);
 * 11-Jan-2005 : Added test for non-clonability (DG);
 * 03-Oct-2006 : Added testGetSerialIndex() (DG);
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.time.Day;
import org.jfree.data.time.MonthConstants;

/**
 * Tests for the {@link Day} class.
 */
public class DayTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DayTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DayTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        // no setup required
    }

    /**
     * Check that a Day instance is equal to itself.
     *
     * SourceForge Bug ID: 558850.
     */
public void testDateConstructor1551() { 
     TimeZone zone = TimeZone.getTimeZone("GMT"); 
     Calendar c = new GregorianCalendar(zone); 
     Day d1 = new Day(new Date(1078099199999L), zone); 
     Day d2 = null; 
     try { 
         d2 = (Day) d1.previous(); 
     } catch (NullPointerException e) { 
         e.printStackTrace(); 
     } 
     assertEquals(1078099199999L, d2.getLastMillisecond(c)); 
     assertEquals(1078099200000L, d2.getLastMillisecond(c)); 
 }
    

    /**
     * Tests the equals method.
     */
    

    /**
     * In GMT, the end of 29 Feb 2004 is java.util.Date(1,078,099,199,999L).
     * Use this to check the day constructor.
     */
    

    /**
     * In Helsinki, the end of 29 Feb 2004 is
     * java.util.Date(1,078,091,999,999L).  Use this to check the Day
     * constructor.
     */
    

    /**
     * Set up a day equal to 1 January 1900.  Request the previous day, it
     * should be null.
     */
    

    /**
     * Set up a day equal to 1 January 1900.  Request the next day, it should
     * be 2 January 1900.
     */
    

    /**
     * Set up a day equal to 31 December 9999.  Request the previous day, it
     * should be 30 December 9999.
     */
    

    /**
     * Set up a day equal to 31 December 9999.  Request the next day, it should
     * be null.
     */
    

    /**
     * Problem for date parsing.
     * <p>
     * This test works only correct if the short pattern of the date
     * format is "dd/MM/yyyy". If not, this test will result in a
     * false negative.
     *
     * @throws ParseException on parsing errors.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * The {@link Day} class is immutable, so should not be {@link Cloneable}.
     */
    

    /**
     * Some checks for the getSerialIndex() method.
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
     * Some checks for the testNext() method.
     */
    

    /**
     * Some checks for the getStart() method.
     */
    

    /**
     * Some checks for the getEnd() method.
     */
    

}
