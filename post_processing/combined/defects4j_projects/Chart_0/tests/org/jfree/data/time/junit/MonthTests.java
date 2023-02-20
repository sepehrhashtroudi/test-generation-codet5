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
 * ---------------
 * MonthTests.java
 * ---------------
 * (C) Copyright 2001-2009, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 16-Nov-2001 : Version 1 (DG);
 * 14-Feb-2002 : Order of parameters in Month(int, int) constructor
 *               changed (DG);
 * 26-Jun-2002 : Removed unnecessary import (DG);
 * 17-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 * 13-Mar-2003 : Added serialization test (DG);
 * 21-Oct-2003 : Added hashCode test (DG);
 * 11-Jan-2005 : Added non-clonability test (DG);
 * 05-Oct-2006 : Added some new tests (DG);
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

import org.jfree.data.time.Month;
import org.jfree.data.time.MonthConstants;
import org.jfree.data.time.TimePeriodFormatException;
import org.jfree.data.time.Year;

/**
 * Tests for the {@link Month} class.
 */
public class MonthTests extends TestCase {

    /** A month. */
    private Month jan1900;

    /** A month. */
    private Month feb1900;

    /** A month. */
    private Month nov9999;

    /** A month. */
    private Month dec9999;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(MonthTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public MonthTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        this.jan1900 = new Month(MonthConstants.JANUARY, 1900);
        this.feb1900 = new Month(MonthConstants.FEBRUARY, 1900);
        this.nov9999 = new Month(MonthConstants.NOVEMBER, 9999);
        this.dec9999 = new Month(MonthConstants.DECEMBER, 9999);
    }

    /**
     * Check that a Month instance is equal to itself.
     *
     * SourceForge Bug ID: 558850.
     */
public void testDateConstructor1327() { 
     TimeZone zone = TimeZone.getTimeZone("GMT"); 
     Calendar c = new GregorianCalendar(zone); 
     Month m1 = new Month(new Date(951868799999L), zone, Locale.getDefault()); 
     Month m2 = new Month(new Date(951868800000L), zone, Locale.getDefault()); 
     assertEquals(MonthConstants.FEBRUARY, m1.getMonth()); 
     assertEquals(951868799999L, m1.getLastMillisecond(c)); 
     assertEquals(MonthConstants.MARCH, m2.getMonth()); 
     assertEquals(951868800000L, m2.getFirstMillisecond(c)); 
 }
public void testJan1900Previous328() { 
     Month previous = (Month) this.jan1900.previous(); 
     assertNull(previous); 
 }
public void testJan1900Next329() { 
     Month next = (Month) this.jan1900.next(); 
     assertNull(next); 
 }
public void testJan1900Next330() { 
     Month next = (Month) this.jan1900.next(); 
     assertEquals(this.feb1900, next); 
 }
public void testGetSerialIndex331() { 
     Month m = new Month(1, 2000); 
     assertEquals(876625L, m.getSerialIndex()); 
     m = new Month(1, 1900); 
     assertEquals(49L, m.getSerialIndex()); 
 }
public void testEqualsSelf332() { 
     Month month = new Month(); 
     assertTrue(month.equals(month)); 
 }
    

    /**
     * Tests the equals method.
     */
    

    /**
     * In GMT, the end of Feb 2000 is java.util.Date(951,868,799,999L).  Use
     * this to check the Month constructor.
     */
    

    /**
     * In Auckland, the end of Feb 2000 is java.util.Date(951,821,999,999L).
     * Use this to check the Month constructor.
     */
    

    /**
     * Set up a month equal to Jan 1900.  Request the previous month, it should
     * be null.
     */
    

    /**
     * Set up a month equal to Jan 1900.  Request the next month, it should be
     * Feb 1900.
     */
    

    /**
     * Set up a month equal to Dec 9999.  Request the previous month, it should
     * be Nov 9999.
     */
    

    /**
     * Set up a month equal to Dec 9999.  Request the next month, it should be
     * null.
     */
    

    /**
     * Tests the string parsing code...
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * The {@link Month} class is immutable, so should not be {@link Cloneable}.
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
