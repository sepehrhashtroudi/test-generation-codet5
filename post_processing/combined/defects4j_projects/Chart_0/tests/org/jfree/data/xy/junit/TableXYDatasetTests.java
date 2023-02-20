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
 * ------------------------
 * TableXYDatasetTests.java
 * ------------------------
 * (C) Copyright 2003-2008, by Richard Atkinson and Contributors.
 *
 * Original Author:  Richard Atkinson;
 * Contributor(s):   David Gilbert (for Object Refinery Limited);
 *
 * Changes
 * -------
 * 11-Aug-2003 : Version 1 (RA);
 * 18-Aug-2003 : Added tests for event notification when removing and updating
 *               series (RA);
 * 22-Sep-2003 : Changed to recognise that empty values are now null rather
 *               than zero (RA);
 * 16-Feb-2004 : Added some additional tests (DG);
 * 15-Jul-2004 : Switched getX() with getXValue() and getY() with
 *               getYValue() (DG);
 * 02-Feb-2007 : Removed author tags all over JFreeChart sources (DG);
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
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYSeries;

/**
 * Tests for {@link DefaultTableXYDataset}.
 */
public class TableXYDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(TableXYDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public TableXYDatasetTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Assorted tests.
     */
    

    /**
     * A test for bug report 788597.
     */
    

    /**
     * Test that removing all values for a given x works.
     */
    

    /**
     * Tests to see that pruning removes unwanted x values.
     */
    

    /**
     * Tests the auto-pruning feature.
     */
    

    /**
     * Creates a series for testing.
     *
     * @return A series.
     */
    private XYSeries createSeriesA() {
        XYSeries s = new XYSeries("A", true, false);
        s.add(1.0, 1.1);
        s.add(2.0, null);
        return s;
    }

    /**
     * Creates a series for testing.
     *
     * @return A series.
     */
    private XYSeries createSeriesB() {
        XYSeries s = new XYSeries("B", true, false);
        s.add(1.0, null);
        s.add(2.0, 2.2);
        return s;
    }

    /**
     * Creates a series for testing.
     *
     * @return A series.
     */
    private XYSeries createSeries1() {
        XYSeries series1 = new XYSeries("Series 1", true, false);
        series1.add(1.0, 1.0);
        series1.add(2.0, 1.0);
        series1.add(4.0, 1.0);
        series1.add(5.0, 1.0);
        return series1;
    }

    /**
     * Creates a series for testing.
     *
     * @return A series.
     */
    private XYSeries createSeries2() {
        XYSeries series2 = new XYSeries("Series 2", true, false);
        series2.add(2.0, 2.0);
        series2.add(3.0, 2.0);
        series2.add(4.0, 2.0);
        series2.add(5.0, 2.0);
        series2.add(6.0, 2.0);
        return series2;
    }

}
