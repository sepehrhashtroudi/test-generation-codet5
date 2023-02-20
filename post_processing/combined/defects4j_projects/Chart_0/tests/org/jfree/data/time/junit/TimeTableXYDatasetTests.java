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
public void testStandard1092() { 
     TimeTableXYDataset d = new TimeTableXYDataset(); 
     d.add(new Year(1999), 1.0, "Series 1"); 
     assertEquals(d.getItemCount(), 1); 
     assertEquals(d.getSeriesCount(), 1); 
     d.add(new Year(2000), 2.0, "Series 2"); 
     assertEquals(d.getItemCount(), 2); 
     assertEquals(d.getSeriesCount(), 2); 
     assertEquals(d.getYValue(0, 0), 1.0, DELTA); 
     assertTrue(Double.isNaN(d.getYValue(0, 1))); 
     assertTrue(Double.isNaN(d.getYValue(1, 0))); 
     assertEquals(d.getYValue(1, 1), 2.0, DELTA); 
 }
public void testStandard1093() { 
     TimeTableXYDataset d = new TimeTableXYDataset(); 
     d.add(new Year(1999), 1.0, "Series 1"); 
     assertEquals(d.getItemCount(), 1); 
     d.clear(); 
     assertEquals(0, d.getItemCount()); 
 }
public void testCloning1096() { 
     TimeTableXYDataset d1 = new TimeTableXYDataset(); 
     d1.add(new Year(1999), 1.0, "Series 1"); 
     TimeTableXYDataset d2 = null; 
     try { 
         d2 = (TimeTableXYDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     d1.add(new Year(2000), 2.0, "Series 2"); 
     assertFalse(d1.equals(d2)); 
     d2.add(new Year(2000), 2.0, "Series 2"); 
     assertTrue(d1.equals(d2)); 
 }
    

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
