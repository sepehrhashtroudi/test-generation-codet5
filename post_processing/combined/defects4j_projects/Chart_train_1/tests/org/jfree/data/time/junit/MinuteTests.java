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
 * ----------------
 * MinuteTests.java
 * ----------------
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
 * 11-Dec-2006 : Added test1611872() (DG);
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
import org.jfree.data.time.Minute;
import org.jfree.data.time.MonthConstants;

/**
 * Tests for the {@link Minute} class.
 */
public class MinuteTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(MinuteTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public MinuteTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        // no setup
    }

    /**
     * Check that a Minute instance is equal to itself.
     *
     * SourceForge Bug ID: 558850.
     */

public void testEqualsSelf644() { 
     Minute minute = new Minute(); 
     assertTrue(minute.equals(minute)); 
 } 


public void testGetSerialIndex645() { 
     Minute m = new Minute(1, 1, 1, 1, 2000); 
     assertEquals(52597501L, m.getSerialIndex()); 
     m = new Minute(1, 1, 1, 1, 1900); 
     assertEquals(2941L, m.getSerialIndex()); 
 } 


public void testDateConstructor2646() { 
     TimeZone zone = TimeZone.getTimeZone("Asia/Singapore"); 
     Calendar c = new GregorianCalendar(zone); 
     Minute m1 = new Minute(new Date(1016700899999L), zone); 
     Minute m2 = new Minute(new Date(1016700900000L), zone); 
     assertEquals(54, m1.getMinute()); 
     assertEquals(1016700899999L, m1.getLastMillisecond(c)); 
     assertEquals(55, m2.getMinute()); 
     assertEquals(1016700900000L, m2.getFirstMillisecond(c)); 
 } 


public void testGetEnd647() { 
     Locale saved = Locale.getDefault(); 
     Locale.setDefault(Locale.ITALY); 
     TimeZone savedZone = TimeZone.getDefault(); 
     TimeZone.setDefault(TimeZone.getTimeZone("Europe/Rome")); 
     Calendar cal = Calendar.getInstance(Locale.ITALY); 
     cal.set(2006, Calendar.JANUARY, 16, 3, 47, 59); 
     cal.set(Calendar.MILLISECOND, 999); 
     Minute m = new Minute(47, 3, 16, 1, 2006); 
     assertEquals(cal.getTime(), m.getEnd()); 
     Locale.setDefault(saved); 
     TimeZone.setDefault(savedZone); 
 } 


public void testNotCloneable699() { 
     Minute m = new Minute(45, 5, 1, 2, 2003); 
     assertFalse(m instanceof Cloneable); 
 } 

    

    /**
     * Tests the equals method.
     */
    

    /**
     * In GMT, the 4.55pm on 21 Mar 2002 is java.util.Date(1016729700000L).
     * Use this to check the Minute constructor.
     */
    

    /**
     * In Singapore, the 4.55pm on 21 Mar 2002 is
     * java.util.Date(1,014,281,700,000L). Use this to check the Minute
     * constructor.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * The {@link Minute} class is immutable, so should not be
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
    

    /**
     * Test for bug 1611872 - previous() fails for first minute in hour.
     */
    

}
