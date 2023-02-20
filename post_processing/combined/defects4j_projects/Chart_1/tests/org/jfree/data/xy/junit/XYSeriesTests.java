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
 * ------------------
 * XYSeriesTests.java
 * ------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 23-Dec-2003 : Version 1 (DG);
 * 15-Jan-2007 : Added tests for new toArray() method (DG);
 * 30-Jan-2007 : Fixed some code that won't compile with Java 1.4 (DG);
 * 31-Oct-2007 : New hashCode() test (DG);
 * 01-May-2008 : Added testAddOrUpdate3() (DG);
 * 24-Nov-2008 : Added testBug1955483() (DG);
 * 06-Mar-2009 : Added tests for cached bounds values (DG);
 *
 */

package org.jfree.data.xy.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.general.SeriesException;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;

/**
 * Tests for the {@link XYSeries} class.
 */
public class XYSeriesTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYSeriesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYSeriesTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testDelete350() { 
     XYSeries s1 = new XYSeries("Series 1"); 
     s1.add(1.0, 1.0); 
     s1.add(2.0, 2.0); 
     assertEquals(1.0, s1.getMinX(), EPSILON); 
     assertEquals(2.0, s1.getMaxX(), EPSILON); 
     assertEquals(1.0, s1.getMinY(), EPSILON); 
     assertEquals(2.0, s1.getMaxY(), EPSILON); 
     s1.delete(0, 2); 
     assertEquals(0.0, s1.getMinX(), EPSILON); 
     assertEquals(2.0, s1.getMaxX(), EPSILON); 
     assertEquals(0.0, s1.getMinY(), EPSILON); 
     assertEquals(2.0, s1.getMaxY(), EPSILON); 
 }
public void testDelete351() { 
     XYSeries s1 = new XYSeries("Series 1"); 
     s1.add(1.0, 1.0); 
     s1.add(2.0, 2.0); 
     assertEquals(1.0, s1.getMinX(), EPSILON); 
     assertEquals(2.0, s1.getMaxX(), EPSILON); 
     assertEquals(1.0, s1.getMinY(), EPSILON); 
     assertEquals(2.0, s1.getMaxY(), EPSILON); 
     s1.add(5.0, 5.0); 
     s1.add(6.0, 6.0); 
     assertEquals(5.0, s1.getMinX(), EPSILON); 
     assertEquals(6.0, s1.getMaxX(), EPSILON); 
     assertEquals(5.5, s1.getMinY(), EPSILON); 
     assertEquals(6.6, s1.getMaxY(), EPSILON); 
 }
public void testSetMaximumItemCount3352() { 
     XYSeries s1 = new XYSeries("S1"); 
     s1.add(1.0, 1.1); 
     s1.add(2.0, 2.2); 
     s1.add(3.0, 3.3); 
     s1.add(4.0, 4.4); 
     s1.add(5.0, 5.5); 
     s1.add(6.0, 6.6); 
     s1.setMaximumItemCount(2); 
     assertEquals(5.0, s1.getX(0).doubleValue(), EPSILON); 
     assertEquals(6.0, s1.getX(1).doubleValue(), EPSILON); 
     assertEquals(5.0, s1.getMinY(), EPSILON); 
     assertEquals(6.0, s1.getMaxY(), EPSILON); 
 }
public void testSetMaximumItemCount3353() { 
     XYSeries s1 = new XYSeries("S1", true, true); 
     s1.add(1.0, 1.1); 
     s1.add(2.0, 2.2); 
     s1.add(3.0, 3.3); 
     s1.add(4.0, 4.4); 
     s1.add(5.0, 5.5); 
     s1.add(6.0, 6.6); 
     s1.setMaximumItemCount(2); 
     assertEquals(5.0, s1.getX(0).doubleValue(), EPSILON); 
     assertEquals(6.0, s1.getX(1).doubleValue(), EPSILON); 
     assertEquals(5.0, s1.getMinY(), EPSILON); 
     assertEquals(6.0, s1.getMaxY(), EPSILON); 
 }
    

    /**
     * Some simple checks for the hashCode() method.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Another test of the clone() method.
     */
    

    /**
     * Another test of the clone() method.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Simple test for the indexOf() method.
     */
    

    /**
     * A check for the indexOf() method for an unsorted series.
     */
    

    /**
     * A check for the indexOf(Number) method when the series has duplicate
     * x-values.
     */
    

    /**
     * Simple test for the remove() method.
     */
    

    /**
     * Some checks for the remove(int) method.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * When items are added with duplicate x-values, we expect them to remain
     * in the order they were added.
     */
    

    /**
     * Some checks for the update(Number, Number) method.
     */
    

    /**
     * Some checks for the update() method for an unsorted series.
     */
    

    /**
     * Some checks for the addOrUpdate() method.
     */
    

    /**
     * Some checks for the addOrUpdate() method for an UNSORTED series.
     */
    

    /**
     * Another test for the addOrUpdate() method.
     */
    

    /**
     * Some checks for the add() method for an UNSORTED series.
     */
    

    /**
     * A simple check that the maximumItemCount attribute is working.
     */
    

    /**
     * Check that the maximum item count can be applied retrospectively.
     */
    

    /**
     * Check that the item bounds are determined correctly when there is a
     * maximum item count.
     */
    

    /**
     * Check that the item bounds are determined correctly when there is a
     * maximum item count.
     */
    

    /**
     * Some checks for the toArray() method.
     */
    

    /**
     * Some checks for an example using the toArray() method.
     */
    

    /**
     * Another test for the addOrUpdate() method.
     */
    

    /**
     * Some checks for the delete(int, int) method.
     */
    

    /**
     * Some checks for the getMinX() method.
     */
    

    /**
     * Some checks for the getMaxX() method.
     */
    

    /**
     * Some checks for the getMinY() method.
     */
    

    /**
     * Some checks for the getMaxY() method.
     */
    

    /**
     * A test for the clear method.
     */
    

    /**
     * Some checks for the updateByIndex() method.
     */
    

    /**
     * Some checks for the updateByIndex() method.
     */
    

    /**
     * Some checks for the updateByIndex() method.
     */
    

    /**
     * Some checks for the update(Number, Number) method.
     */
    

}
