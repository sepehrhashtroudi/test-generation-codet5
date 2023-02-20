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
 * --------------------
 * NumberAxisTests.java
 * --------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 26-Mar-2003 : Version 1 (DG);
 * 14-Aug-2003 : Added tests for equals() method (DG);
 * 05-Oct-2004 : Added tests to pick up a bug in the auto-range calculation for
 *               a domain axis on an XYPlot using an XYSeriesCollection (DG);
 * 07-Jan-2005 : Added test for hashCode() (DG);
 * 11-Jan-2006 : Fixed testAutoRange2() and testAutoRange3() following changes
 *               to BarRenderer (DG);
 * 20-Feb-2006 : Added rangeType field to equals() test (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.RangeType;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link NumberAxis} class.
 */
public class NumberAxisTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(NumberAxisTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public NumberAxisTests(String name) {
        super(name);
    }

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    private static final double EPSILON = 0.0000001;

    /**
     * Test the translation of Java2D values to data values.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * A simple test for the auto-range calculation looking at a
     * NumberAxis used as the range axis for a CategoryPlot.
     */
    

    /**
     * A simple test for the auto-range calculation looking at a
     * NumberAxis used as the range axis for a CategoryPlot.  In this
     * case, the 'autoRangeIncludesZero' flag is set to false.
     */
    

    /**
     * A simple test for the auto-range calculation looking at a
     * NumberAxis used as the range axis for a CategoryPlot.  In this
     * case, the 'autoRangeIncludesZero' flag is set to false AND the
     * original dataset is replaced with a new dataset.
     */
    

    /**
     * A check for the interaction between the 'autoRangeIncludesZero' flag
     * and the base setting in the BarRenderer.
     */
    

    /**
     * Checks that the auto-range for the domain axis on an XYPlot is
     * working as expected.
     */
    

    /**
     * Checks that the auto-range for the range axis on an XYPlot is
     * working as expected.
     */
    

//    /**
//     * Some checks for the setRangeType() method.
//     */
//    public void testSetRangeType() {
//
//        NumberAxis axis = new NumberAxis("X");
//        axis.setRangeType(RangeType.POSITIVE);
//        assertEquals(RangeType.POSITIVE, axis.getRangeType());
//
//        // test a change to RangeType.POSITIVE
//        axis.setRangeType(RangeType.FULL);
//        axis.setRange(-5.0, 5.0);
//        axis.setRangeType(RangeType.POSITIVE);
//        assertEquals(new Range(0.0, 5.0), axis.getRange());
//
//        axis.setRangeType(RangeType.FULL);
//        axis.setRange(-10.0, -5.0);
//        axis.setRangeType(RangeType.POSITIVE);
//        assertEquals(new Range(0.0, axis.getAutoRangeMinimumSize()),
//                axis.getRange());
//
//        // test a change to RangeType.NEGATIVE
//        axis.setRangeType(RangeType.FULL);
//        axis.setRange(-5.0, 5.0);
//        axis.setRangeType(RangeType.NEGATIVE);
//        assertEquals(new Range(-5.0, 0.0), axis.getRange());
//
//        axis.setRangeType(RangeType.FULL);
//        axis.setRange(5.0, 10.0);
//        axis.setRangeType(RangeType.NEGATIVE);
//        assertEquals(new Range(-axis.getAutoRangeMinimumSize(), 0.0),
//                axis.getRange());
//
//        // try null
//        boolean pass = false;
//        try {
//            axis.setRangeType(null);
//        }
//        catch (IllegalArgumentException e) {
//            pass = true;
//        }
//        assertTrue(pass);
//    }

    /**
     * Some checks for the setLowerBound() method.
     */
    

}
