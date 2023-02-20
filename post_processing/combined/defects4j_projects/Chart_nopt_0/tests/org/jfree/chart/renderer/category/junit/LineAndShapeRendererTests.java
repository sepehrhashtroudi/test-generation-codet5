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
 * ------------------------------
 * LineAndShapeRendererTests.java
 * ------------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 22-Sep-2003 : Version 1 (DG);
 * 17-May-2007 : Added check for getLegendItem() method (DG);
 * 27-Sep-2007 : Extended equals() test (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.chart.renderer.category.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link LineAndShapeRenderer} class.
 */
public class LineAndShapeRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(LineAndShapeRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public LineAndShapeRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */
public void testLineAndShapeRenderer7786() { LineAndShapeRenderer r = new LineAndShapeRenderer(); assertEquals(r, new LineAndShapeRenderer()); }
public void testGetBaseLinesVisible7792() { LineAndShapeRenderer r = new LineAndShapeRenderer(); assertFalse(r.getBaseLinesVisible()); r.setBaseLinesVisible(true); assertTrue(r.getBaseLinesVisible()); r.setBaseLinesVisible(false); assertFalse(r.getBaseLinesVisible()); r.setBaseLinesVisible(true); assertTrue(r.getBaseLinesVisible()); }
public void testGetBaseShapesVisible7801() { LineAndShapeRenderer r = new LineAndShapeRenderer(); assertFalse(r.getBaseShapesVisible()); r.setBaseShapesVisible(true); assertTrue(r.getBaseShapesVisible()); r.setBaseShapesVisible(false); assertFalse(r.getBaseShapesVisible()); r.setBaseShapesVisible(true); assertTrue(r.getBaseShapesVisible()); }
public void testSetUseOutlinePaint7806() { LineAndShapeRenderer r = new LineAndShapeRenderer(); r.setUseOutlinePaint(true); assertTrue(r.getUseOutlinePaint()); r.setUseOutlinePaint(false); assertFalse(r.getUseOutlinePaint()); }
public void testFireChangeEvent7808() { LineAndShapeRenderer r = new LineAndShapeRenderer(); r.setUseOutlinePaint(true); assertTrue(r.getUseOutlinePaint()); r.setUseOutlinePaint(false); assertFalse(r.getUseOutlinePaint()); }
public void testCloning7813() throws CloneNotSupportedException { LineAndShapeRenderer r1 = new LineAndShapeRenderer(); r1.setSeriesShapesFilled(0, true); LineAndShapeRenderer r2 = (LineAndShapeRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testSetUseSeriesOffset7817() { LineAndShapeRenderer r = new LineAndShapeRenderer(); r.setUseSeriesOffset(true); assertTrue(r.getUseSeriesOffset()); r.setUseSeriesOffset(false); assertFalse(r.getUseSeriesOffset()); }
public void testFireChangeEvent7819() { LineAndShapeRenderer r = new LineAndShapeRenderer(); r.setUseSeriesOffset(true); assertTrue(r.getUseSeriesOffset()); r.setUseSeriesOffset(false); assertFalse(r.getUseSeriesOffset()); }
public void testEquals7824() { LineAndShapeRenderer r1 = new LineAndShapeRenderer(); LineAndShapeRenderer r2 = new LineAndShapeRenderer(); assertEquals(r1, r2); r1.setBaseLinesVisible(false); assertFalse(r1.equals(r2)); r2.setBaseLinesVisible(false); assertEquals(r1, r2); r1.setSeriesLinesVisible(1, true); assertFalse(r1.equals(r2)); r2.setSeriesLinesVisible(1, true); assertEquals(r1, r2); r1.setBaseShapesVisible(true); assertFalse(r1.equals(r2));
}

    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Check that this class implements PublicCloneable.
     */
    

    /**
     * Checks that the two renderers are equal but independent of one another.
     *
     * @param r1  renderer 1.
     * @param r2  renderer 2.
     *
     * @return A boolean.
     */
    private boolean checkIndependence(LineAndShapeRenderer r1,
                                      LineAndShapeRenderer r2) {

        // should be equal...
        if (!r1.equals(r2)) {
            return false;
        }

        // and independent...
        r1.setBaseLinesVisible(!r1.getBaseLinesVisible());
        if (r1.equals(r2)) {
            return false;
        }
        r2.setBaseLinesVisible(r1.getBaseLinesVisible());
        if (!r1.equals(r2)) {
            return false;
        }

        r1.setSeriesLinesVisible(1, true);
        if (r1.equals(r2)) {
            return false;
        }
        r2.setSeriesLinesVisible(1, true);
        if (!r1.equals(r2)) {
            return false;
        }

        r1.setBaseShapesVisible(!r1.getBaseShapesVisible());
        if (r1.equals(r2)) {
            return false;
        }
        r2.setBaseShapesVisible(r1.getBaseShapesVisible());
        if (!r1.equals(r2)) {
            return false;
        }

        r1.setSeriesShapesVisible(1, true);
        if (r1.equals(r2)) {
            return false;
        }
        r2.setSeriesShapesVisible(1, true);
        if (!r1.equals(r2)) {
            return false;
        }

        r1.setSeriesShapesFilled(0, false);
        r2.setSeriesShapesFilled(0, true);
        if (r1.equals(r2)) {
            return false;
        }
        r2.setSeriesShapesFilled(0, false);
        if (!r1.equals(r2)) {
            return false;
        }

        r1.setBaseShapesFilled(false);
        r2.setBaseShapesFilled(true);
        if (r1.equals(r2)) {
            return false;
        }
        r2.setBaseShapesFilled(false);
        if (!r1.equals(r2)) {
            return false;
        }
        return true;

    }

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * A check for the datasetIndex and seriesIndex fields in the LegendItem
     * returned by the getLegendItem() method.
     */
    

}
