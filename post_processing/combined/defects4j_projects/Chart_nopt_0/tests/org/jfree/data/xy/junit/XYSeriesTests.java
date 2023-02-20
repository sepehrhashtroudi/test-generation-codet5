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
public void testSeriesException71() { String message = "Test message"; SeriesException exception = new SeriesException(message); assertEquals(message, exception.getMessage()); }
public void testXYSeries1536() { XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.1); s1.add(2.0, 2.2); s1.add(3.0, 3.3); XYSeries s2 = new XYSeries("S2"); s2.add(1.0, 1.0); s2.add(2.0, 2.2); s2.add(3.0, 3.3); assertEquals(s1, s2); }
public void testGetMinX1540() { XYSeries s1 = new XYSeries("S1"); assertEquals(0.0, s1.getMinX(), EPSILON); s1.add(1.0, 1.1); assertEquals(1.0, s1.getMinX(), EPSILON); s1.add(2.0, 2.2); assertEquals(2.0, s1.getMinX(), EPSILON); s1.add(3.0, 3.3); assertEquals(3.0, s1.getMinX(), EPSILON); }
public void testGetMinY1544() { XYSeries s1 = new XYSeries("S1"); assertEquals(0.0, s1.getMinY(), EPSILON); s1.add(1.0, 1.1); assertEquals(1.0, s1.getMinY(), EPSILON); s1.add(2.0, 2.2); assertEquals(2.0, s1.getMinY(), EPSILON); s1.add(3.0, 3.3); assertEquals(3.0, s1.getMinY(), EPSILON); }
public void testUpdateBoundsForRemovedItem1560() { XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.0); s1.add(2.0, 2.0); assertEquals(1.0, s1.getMinX(), EPSILON); assertEquals(2.0, s1.getMaxX(), EPSILON); assertEquals(1.0, s1.getMinY(), EPSILON); assertEquals(2.0, s1.getMaxY(), EPSILON); s1.add(Double.NaN, Double.NaN); assertEquals(Double.NaN, s1.getMinX(), EPSILON);
}

public void testUpdateBoundsForRemovedItem1561() { XYSeries s1 = new XYSeries("s1"); s1.add(1.0, 1.0); s1.add(2.0, 2.0); assertEquals(1.0, s1.getMinX(), EPSILON); assertEquals(2.0, s1.getMaxX(), EPSILON); assertEquals(1.0, s1.getMinY(), EPSILON); assertEquals(2.0, s1.getMaxY(), EPSILON); s1.add(Double.NaN, Double.NaN); assertEquals(1.0, s1.getMinX(), EPSILON);
}

public void testGetItemCount1571() { XYSeries s1 = new XYSeries("S1"); assertEquals(0, s1.getItemCount()); s1.add(1.0, 1.1); assertEquals(1, s1.getItemCount()); s1.add(2.0, 2.2); assertEquals(2, s1.getItemCount()); s1.add(3.0, 3.3); assertEquals(3, s1.getItemCount()); s1.add(4.0, 4.4); assertEquals(4, s1.getItemCount()); }
public void testGetItemCount1572() { XYSeries s1 = new XYSeries("S1"); assertEquals(0, s1.getItemCount()); s1.add(1.0, 1.1); assertEquals(1, s1.getItemCount()); s1.add(2.0, 2.2); assertEquals(2, s1.getItemCount()); s1.add(3.0, 3.3); assertEquals(3, s1.getItemCount()); }
public void testSetMaximumItemCount1574() { XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.1); s1.add(2.0, 2.2); s1.add(3.0, 3.3); s1.add(4.0, 4.4); assertEquals(3, s1.getMaximumItemCount()); s1.setMaximumItemCount(4); assertEquals(4, s1.getMaximumItemCount()); }
public void testSetMaximumItemCount1575() { XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.0); s1.add(2.0, 2.0); s1.add(3.0, 3.0); s1.add(4.0, 4.0); assertEquals(3, s1.getMaximumItemCount()); s1.setMaximumItemCount(3); assertEquals(3, s1.getMaximumItemCount()); }
public void testSetMaximumItemCount1576() { XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.1); s1.add(2.0, 2.2); s1.add(3.0, 3.3); assertEquals(3, s1.getMaximumItemCount()); s1.setMaximumItemCount(4); assertEquals(4, s1.getMaximumItemCount()); }
public void testRemove1603() { XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.1); s1.add(2.0, 2.2); s1.add(3.0, 3.3); s1.add(4.0, 4.4); s1.add(5.0, 5.5); s1.add(6.0, 6.6); s1.add(7.0, 7.7); s1.add(8.0, 8.8); s1.add(9.0, 9.9); assertEquals(2, s1.getItemCount());
}

public void testMaxIgnoreNaN1626() { XYSeries s1 = new XYSeries("S1"); assertTrue(Double.isNaN(s1.getMaxX())); assertTrue(Double.isNaN(s1.getMaxY())); s1.add(1.0, 1.1); assertEquals(1.0, s1.getMaxX(), EPSILON); assertEquals(1.0, s1.getMaxY(), EPSILON); s1.add(Double.NaN, Double.NaN); assertEquals(1.0, s1.getMaxX(), EPSILON); assertEquals(1.0, s1.getMaxY(), EPSILON);
}

public void testAddOrUpdate1635() { XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.1); s1.add(2.0, 2.2); s1.add(3.0, 3.3); s1.add(4.0, 4.4); s1.add(5.0, 5.5); assertEquals(2, s1.getItemCount()); assertEquals(1.0, s1.getMinX(), EPSILON); assertEquals(2.0, s1.getMaxX(), EPSILON); assertEquals(3.0, s1.getMaxY(), EPSILON);
}

public void testGetY1944() { XYDataItem item = new XYDataItem(1.0, 1.0); assertEquals(1.0, item.getY().doubleValue(), 0.001); item.setY(2.0); assertEquals(2.0, item.getY().doubleValue(), 0.001); }
public void testGetYValue1945() { XYDataItem item = new XYDataItem(1.0, 1.0); assertEquals(1.0, item.getYValue(), 0.001); item.setY(2.0); assertEquals(2.0, item.getYValue(), 0.001); item.setY(null); assertEquals(Double.NaN, item.getYValue(), 0.001); }
public void testCompareTo1947() { XYDataItem item1 = new XYDataItem(1.0, 1.0); XYDataItem item2 = new XYDataItem(2.0, 2.0); assertEquals(0, item1.compareTo(item2)); }
public void testCompareTo1948() { XYDataItem item1 = new XYDataItem(1.0, 1.0); XYDataItem item2 = new XYDataItem(2.0, 2.0); XYDataItem item3 = new XYDataItem(3.0, 3.0); assertEquals(0, item1.compareTo(item1)); assertEquals(0, item1.compareTo(item2)); assertEquals(-1, item1.compareTo(item3)); }
public void testCompareTo1949() { XYDataItem item1 = new XYDataItem(1.0, 1.0); XYDataItem item2 = new XYDataItem(1.0, 2.0); assertEquals(0, item1.compareTo(item2)); }
public void testHashCode1952() { XYDataItem item1 = new XYDataItem(1.0, 1.0); XYDataItem item2 = new XYDataItem(1.0, 1.0); assertEquals(item1.hashCode(), item2.hashCode()); }
public void testHashCode1953() { XYDataItem item1 = new XYDataItem(1.0, 2.0); XYDataItem item2 = new XYDataItem(1.0, 2.0); assertEquals(item1.hashCode(), item2.hashCode()); }
    

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
