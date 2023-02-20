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
 * ---------------------
 * MillisecondTests.java
 * ---------------------
 * (C) Copyright 2002-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 29-Jan-2002 : Version 1 (DG);
 * 17-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 * 21-Oct-2003 : Added hashCode tests (DG);
 * 29-Apr-2004 : Added test for getMiddleMillisecond() method (DG);
 * 11-Jan-2005 : Added test for non-clonability (DG);
 * 05-Oct-2006 : Added some tests (DG);
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
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.MonthConstants;
import org.jfree.data.time.Second;

/**
 * Tests for the {@link Millisecond} class.
 */
public class MillisecondTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(MillisecondTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public MillisecondTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        // no setup
    }

    /**
     * Check that a {@link Millisecond} instance is equal to itself.
     *
     * SourceForge Bug ID: 558850.
     */
public void testSerialization823() { 
     Millisecond m1 = new Millisecond(599, 23, 45, 7, 9, 10, 2007); 
     Millisecond m2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(m1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         m2 = (Millisecond) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         System.out.println(e.toString()); 
     } 
     assertEquals(m1, m2); 
 }
public void testDateConstructor2824() { 
     TimeZone zone = TimeZone.getTimeZone("Europe/Tallinn"); 
     Calendar c = new GregorianCalendar(zone); 
     Millisecond m1 = new Millisecond(new Date(1016722559122L), zone); 
     Millisecond m2 = new Millisecond(new Date(1016722559123L), zone); 
     assertEquals(122, m1.getMillisecond()); 
     assertEquals(1016722559122L, m1.getLastMillisecond(c)); 
     assertEquals(123, m2.getMillisecond()); 
     assertEquals(1016722559123L, m2.getFirstMillisecond(c)); 
 }
public void testGetFirstMillisecondWithCalendar825() { 
     Millisecond m = new Millisecond(500, 55, 40, 2, 15, 4, 2000); 
     GregorianCalendar calendar = new GregorianCalendar(Locale.GERMANY); 
     calendar.setTimeZone(TimeZone.getTimeZone("Europe/Frankfurt")); 
     assertEquals(955766455500L, m.getFirstMillisecond(calendar)); 
     boolean pass = false; 
     try { 
         m.getFirstMillisecond((Calendar) null); 
     } catch (NullPointerException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testHashcode826() { 
     Millisecond m1 = new Millisecond(599, 23, 45, 7, 9, 10, 2007); 
     Millisecond m2 = new Millisecond(599, 23, 45, 7, 9, 10, 2007); 
     assertTrue(m1.equals(m2)); 
     int hash1 = m1.hashCode(); 
     int hash2 = m2.hashCode(); 
     assertEquals(hash1, hash2); 
 }
    

    /**
     * Tests the equals method.
     */
    

    /**
     * In GMT, the 4.55:59.123pm on 21 Mar 2002 is
     * java.util.Date(1016729759123L).  Use this to check the Millisecond
     * constructor.
     */
    

    /**
     * In Tallinn, the 4.55:59.123pm on 21 Mar 2002 is
     * java.util.Date(1016722559123L).  Use this to check the Millisecond
     * constructor.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * A test for bug report 943985 - the calculation for the middle
     * millisecond is incorrect for odd milliseconds.
     */
    

    /**
     * The {@link Millisecond} class is immutable, so should not be
     * {@link Cloneable}.
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
