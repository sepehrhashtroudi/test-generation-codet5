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
 * ----------------------------
 * TimeTableXYDatasetTests.java
 * ----------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   Rob Eden;
 *
 * Changes
 * -------
 * 15-Sep-2004 : Version 1 (DG);
 * 25-Jul-2007 : Added test for clear() method, by Rob Eden (DG);
 *
 */

package org.jfree.data.time.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.TimeZone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.time.TimeTableXYDataset;
import org.jfree.data.time.Year;

/**
 * A collection of test cases for the {@link TimeTableXYDataset} class.
 */
public class TimeTableXYDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(TimeTableXYDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public TimeTableXYDatasetTests(String name) {
        super(name);
    }

    private static final double DELTA = 0.0000000001;

    /**
     * Some checks for a simple dataset.
     */
public void testGetDomainIsPointsInTime5706() { TimeTableXYDataset d = new TimeTableXYDataset(); d.setDomainIsPointsInTime(true); assertTrue(d.getDomainIsPointsInTime()); d.setDomainIsPointsInTime(false); assertFalse(d.getDomainIsPointsInTime()); }
public void testSetDomainIsPointsInTime5707() { TimeTableXYDataset dataset = new TimeTableXYDataset(); dataset.setDomainIsPointsInTime(true); assertTrue(dataset.getDomainIsPointsInTime()); dataset.add(new Year(2006), 1.0, "Series 1"); dataset.setDomainIsPointsInTime(false); assertFalse(dataset.getDomainIsPointsInTime()); dataset.add(new Year(2006), 2.0, "Series 2"); dataset.setDomainIsPointsInTime(true); assertTrue(dataset.getDomainIsPointsInTime()); }
public void testSetDomainIsPointsInTime5708() { System.out.println("setDomainIsPointsInTime"); TimeTableXYDataset dataset = new TimeTableXYDataset(); dataset.setDomainIsPointsInTime(true); assertTrue(dataset.getDomainIsPointsInTime()); dataset.setDomainIsPointsInTime(false); assertFalse(dataset.getDomainIsPointsInTime()); dataset.setDomainIsPointsInTime(true); assertTrue(dataset.getDomainIsPointsInTime()); }
public void testGetTimePeriod5712() { TimeTableXYDataset d = new TimeTableXYDataset(); d.add(new Year(1999), 1.0, "Series 1"); d.add(new Year(2000), 2.0, "Series 2"); d.add(new Year(2006), 3.0, "Series 3"); assertEquals(new Year(2006), d.getTimePeriod(0)); assertEquals(new Year(2006), d.getTimePeriod(1)); assertEquals(new Year(2006), d.getTimePeriod(2)); }
public void testEquals5713() { TimeTableXYDataset d1 = new TimeTableXYDataset(); d1.add(new Year(0), 1.0, "Series 1"); TimeTableXYDataset d2 = new TimeTableXYDataset(); d2.add(new Year(0), 1.0, "Series 1"); assertEquals(d1, d2); d1.setDomainIsPointsInTime(!d1.getDomainIsPointsInTime()); assertFalse(d1.equals(d2)); d2.setDomainIsPointsInTime(!d1.getDomainIsPointsInTime()); assertEquals(d1, d2); }
public void testEquals5714() { TimeTableXYDataset d1 = new TimeTableXYDataset(); d1.add(new Year(0), 1.0, "Series 1"); TimeTableXYDataset d2 = new TimeTableXYDataset(); d2.add(new Year(0), 1.0, "Series 1"); assertEquals(d1, d2); d1.setDomainIsPointsInTime(true); assertFalse(d1.equals(d2)); d2.setDomainIsPointsInTime(true); assertEquals(d1, d2); }
public void testEquals5715() { TimeTableXYDataset d1 = new TimeTableXYDataset(); d1.setDomainIsPointsInTime(true); TimeTableXYDataset d2 = new TimeTableXYDataset(); d2.setDomainIsPointsInTime(true); assertEquals(d1, d2); d1.add(new Year(2001), 1.0, "Series 1"); assertFalse(d1.equals(d2)); d2.add(new Year(2001), 1.0, "Series 1"); assertEquals(d1, d2); d1.setDomainIsPointsInTime(false); assertFalse(d1.equals(d2));
}

public void testClone5717() throws CloneNotSupportedException { TimeTableXYDataset d1 = new TimeTableXYDataset(); d1.add(new Year(1999), 1.0, "Series 1"); TimeTableXYDataset d2 = (TimeTableXYDataset) d1.clone(); assertEquals(d1, d2); }
    

    /**
     * Some checks for the getTimePeriod() method.
     */
    

    /**
     * Some checks for the equals() method.
     */
    

    /**
     * Some checks for cloning.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Test clearing data.
     */
    

}
