/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2009, by Object Refinery Limited and Contributors.
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
 * -----------------
 * QuarterTests.java
 * -----------------
 * (C) Copyright 2001-2009, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 16-Nov-2001 : Version 1 (DG);
 * 17-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 * 13-Mar-2003 : Added serialization test (DG);
 * 11-Jan-2005 : Added check for non-clonability (DG);
 * 05-Oct-2006 : Added some new tests (DG);
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

import org.jfree.data.time.Quarter;
import org.jfree.data.time.TimePeriodFormatException;
import org.jfree.data.time.Year;

/**
 * Tests for the {link Quarter} class.
 */
public class QuarterTests extends TestCase {

    /** A quarter. */
    private Quarter q1Y1900;

    /** A quarter. */
    private Quarter q2Y1900;

    /** A quarter. */
    private Quarter q3Y9999;

    /** A quarter. */
    private Quarter q4Y9999;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(QuarterTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public QuarterTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        this.q1Y1900 = new Quarter(1, 1900);
        this.q2Y1900 = new Quarter(2, 1900);
        this.q3Y9999 = new Quarter(3, 9999);
        this.q4Y9999 = new Quarter(4, 9999);
    }

    /**
     * Check that a Quarter instance is equal to itself.
     *
     * SourceForge Bug ID: 558850.
     */
public void testDateConstructor11421() { 
     TimeZone zone = TimeZone.getTimeZone("GMT"); 
     Calendar c = new GregorianCalendar(zone); 
     Quarter q1 = new Quarter(new Date(1017619199999L), zone, Locale.getDefault()); 
     Quarter q2 = new Quarter(new Date(1017619200000L), zone, Locale.getDefault()); 
     assertEquals(1, q1.getQuarter()); 
     assertEquals(1017619199999L, q1.getLastMillisecond(c)); 
     assertEquals(2, q2.getQuarter()); 
     assertEquals(1017619200000L, q2.getFirstMillisecond(c)); 
 }
public void testQ4Y9999Previous1437() { 
     Quarter previous = (Quarter) this.q4Y9999.previous(); 
     assertEquals(this.q3Y9999, previous); 
 }
public void testParseQuarter1438() { 
     Quarter quarter = null; 
     try { 
         quarter = Quarter.parseQuarter("Q1-2000"); 
     } catch (TimePeriodFormatException e) { 
         quarter = new Quarter(1, 1900); 
     } 
     assertEquals(1, quarter.getQuarter()); 
     assertEquals(2000, quarter.getYear().getYear()); 
     try { 
         quarter = Quarter.parseQuarter("2001-Q2"); 
     } catch (TimePeriodFormatException e) { 
         quarter = new Quarter(1, 1900); 
     } 
     assertEquals(2, quarter.getQuarter()); 
     assertEquals(2001, quarter.getYear().getYear()); 
     try { 
         quarter = Quarter.parseQuarter("Q3, 2002"); 
     } catch (TimePeriodFormatException e) { 
         quarter = new Quarter(1, 1900); 
     } 
     assertEquals(3, quarter.getQuarter()); 
     assertEquals(2002, quarter.getYear().getYear()); 
 }
public void testGetLastMillisecond1439() { 
     Locale saved = Locale.getDefault(); 
     Locale.setDefault(Locale.UK); 
     TimeZone savedZone = TimeZone.getDefault(); 
     TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); 
     Quarter q = new Quarter(3, 1970); 
     assertEquals(15634800000L, q.getLastMillisecond()); 
     Locale.setDefault(saved); 
     TimeZone.setDefault(savedZone); 
 }
public void testGetSerialIndex1440() { 
     Quarter q = new Quarter(1, 2000); 
     assertEquals(3155850061500L, q.getSerialIndex()); 
     q = new Quarter(1, 1900); 
     assertEquals(176461500L, q.getSerialIndex()); 
 }
public void testHashcode1441() { 
     Quarter q1 = new Quarter(1, 1900); 
     Quarter q2 = new Quarter(1, 1900); 
     assertTrue(q1.equals(q2)); 
     int h1 = q1.hashCode(); 
     int h2 = q2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testGetFirstMillisecondWithCalendar1442() { 
     Quarter q = new Quarter(3, 1970); 
     GregorianCalendar calendar = new GregorianCalendar(Locale.GERMANY); 
     calendar.setTimeZone(TimeZone.getTimeZone("Europe/Frankfurt")); 
     assertEquals(15634800000L, q.getFirstMillisecond(calendar)); 
     boolean pass = false; 
     try { 
         q.getFirstMillisecond((Calendar) null); 
     } catch (NullPointerException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
    

    /**
     * Tests the equals method.
     */
    

    /**
     * In GMT, the end of Q1 2002 is java.util.Date(1017619199999L).  Use this
     * to check the quarter constructor.
     */
    

    /**
     * In Istanbul, the end of Q1 2002 is java.util.Date(1017608399999L).  Use
     * this to check the quarter constructor.
     */
    

    /**
     * Set up a quarter equal to Q1 1900.  Request the previous quarter, it
     * should be null.
     */
    

    /**
     * Set up a quarter equal to Q1 1900.  Request the next quarter, it should
     * be Q2 1900.
     */
    

    /**
     * Set up a quarter equal to Q4 9999.  Request the previous quarter, it
     * should be Q3 9999.
     */
    

    /**
     * Set up a quarter equal to Q4 9999.  Request the next quarter, it should
     * be null.
     */
    

    /**
     * Test the string parsing code...
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * The {@link Quarter} class is immutable, so should not be
     * {@link Cloneable}.
     */
    

    /**
     * Some tests for the constructor with (int, int) arguments.  Covers bug
     * report 1377239.
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
