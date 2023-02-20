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
 * ----------------------
 * DateTickUnitTests.java
 * ----------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 26-Mar-2003 : Version 1 (DG);
 * 07-Jan-2005 : Added test for hashCode() (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.DateTickUnitType;

/**
 * Tests for the {@link DateTickUnit} class.
 */
public class DateTickUnitTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DateTickUnitTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DateTickUnitTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testHashCode109() { 
     DateTickUnit t1 = new DateTickUnit(DateTickUnitType.DAY, 1); 
     DateTickUnit t2 = new DateTickUnit(DateTickUnitType.DAY, 1); 
     assertTrue(t1.equals(t2)); 
     int h1 = t1.hashCode(); 
     int h2 = t2.hashCode(); 
     assertEquals(h1, h2); 
 } 


public void testEquals224() { 
     DateTickUnit t1 = new DateTickUnit(DateTickUnitType.DAY, 1); 
     DateTickUnit t2 = new DateTickUnit(DateTickUnitType.DAY, 1); 
     assertTrue(t1.equals(t2)); 
 } 

    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
