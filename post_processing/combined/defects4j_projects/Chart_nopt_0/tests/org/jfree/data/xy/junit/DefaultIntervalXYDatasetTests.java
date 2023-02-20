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
 * ----------------------------------
 * DefaultIntervalXYDatasetTests.java
 * ----------------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 23-Oct-2006 : Version 1 (DG);
 * 02-Nov-2006 : Added testAddSeries() method (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
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

import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.DefaultIntervalXYDataset;

/**
 * Some tests for the {@link DefaultIntervalXYDataset} class.
 */
public class DefaultIntervalXYDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultIntervalXYDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultIntervalXYDatasetTests(String name) {
        super(name);
    }

    /**
     * Some checks for the getSeriesCount() method.
     */
public void testGetXValue4391() { DefaultIntervalXYDataset dataset = new DefaultIntervalXYDataset(); dataset.addSeries("Series 1", new double[][] {{1.0, 2.0}, {3.0, 4.0}}); assertEquals(1.0, dataset.getXValue(0, 0), EPSILON); assertEquals(2.0, dataset.getXValue(0, 1), EPSILON); assertEquals(3.0, dataset.getXValue(1, 0), EPSILON); assertEquals(4.0, dataset.getXValue(1, 1), EPSILON); }
public void testGetEndXValue4393() { DefaultIntervalXYDataset dataset = new DefaultIntervalXYDataset(); dataset.addSeries("Series 1", new double[][] {{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}}); assertEquals(1.0, dataset.getEndXValue(0, 0), EPSILON); assertEquals(2.0, dataset.getEndXValue(0, 1), EPSILON); assertEquals(3.0, dataset.getEndXValue(1, 0), EPSILON); assertEquals(4.0, dataset.getEndXValue(1, 1), EPSILON);
}

public void testGetEndYValue4395() { DefaultIntervalXYDataset dataset = new DefaultIntervalXYDataset(); dataset.addSeries("Series 1", new double[][] {{1.0, 2.0}, {3.0, 4.0}}); assertEquals(1.0, dataset.getEndYValue(0, 0), EPSILON); assertEquals(2.0, dataset.getEndYValue(0, 1), EPSILON); assertEquals(3.0, dataset.getEndYValue(1, 0), EPSILON); assertEquals(4.0, dataset.getEndYValue(1, 1), EPSILON); }
public void testGetEndYValue4396() { DefaultIntervalXYDataset dataset = new DefaultIntervalXYDataset(); dataset.addSeries("Series 1", new double[][] {{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}}); assertEquals(1.0, dataset.getEndYValue(0, 0), EPSILON); assertEquals(2.0, dataset.getEndYValue(0, 1), EPSILON); assertEquals(3.0, dataset.getEndYValue(1, 0), EPSILON); assertEquals(4.0, dataset.getEndYValue(1, 1), EPSILON);
}

    

    /**
     * Some checks for the getSeriesKey(int) method.
     */
    

    /**
     * Some checks for the getItemCount() method.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the getXValue() method.
     */
    

    /**
     * Some checks for the getYValue() method.
     */
    

    /**
     * Some checks for the getStartXValue() method.
     */
    

    /**
     * Some checks for the getEndXValue() method.
     */
    

    /**
     * Some checks for the getStartYValue() method.
     */
    

    /**
     * Some checks for the getEndYValue() method.
     */
    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Another test for cloning.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the indexOf(Comparable) method.
     */
    

    /**
     * Some tests for the addSeries() method.
     */
    

    /**
     * Creates a sample dataset for testing.
     *
     * @return A sample dataset.
     */
    public DefaultIntervalXYDataset createSampleDataset1() {
        DefaultIntervalXYDataset d = new DefaultIntervalXYDataset();
        double[] x1 = new double[] {1.0, 2.0, 3.0};
        double[] x1Start = new double[] {0.9, 1.9, 2.9};
        double[] x1End = new double[] {1.1, 2.1, 3.1};
        double[] y1 = new double[] {4.0, 5.0, 6.0};
        double[] y1Start = new double[] {1.09, 2.09, 3.09};
        double[] y1End = new double[] {1.11, 2.11, 3.11};
        double[][] data1 = new double[][] {x1, x1Start, x1End, y1, y1Start,
                y1End};
        d.addSeries("S1", data1);

        double[] x2 = new double[] {11.0, 12.0, 13.0};
        double[] x2Start = new double[] {10.9, 11.9, 12.9};
        double[] x2End = new double[] {11.1, 12.1, 13.1};
        double[] y2 = new double[] {14.0, 15.0, 16.0};
        double[] y2Start = new double[] {11.09, 12.09, 13.09};
        double[] y2End = new double[] {11.11, 12.11, 13.11};
        double[][] data2 = new double[][] {x2, x2Start, x2End, y2, y2Start,
                y2End};
        d.addSeries("S2", data2);
        return d;
    }

}
