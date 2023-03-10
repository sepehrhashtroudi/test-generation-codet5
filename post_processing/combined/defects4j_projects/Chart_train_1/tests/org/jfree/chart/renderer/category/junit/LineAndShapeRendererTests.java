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

public void testHashcode676() { 
     LineAndShapeRenderer r1 = new LineAndShapeRenderer(); 
     LineAndShapeRenderer r2 = new LineAndShapeRenderer(); 
     assertTrue(r1.equals(r2)); 
     int h1 = r1.hashCode(); 
     int h2 = r2.hashCode(); 
     assertEquals(h1, h2); 
 } 


public void testEquals677() { 
     LineAndShapeRenderer r1 = new LineAndShapeRenderer(); 
     LineAndShapeRenderer r2 = new LineAndShapeRenderer(); 
     assertEquals(r1, r2); 
     r1.setBaseLinesVisible(!r1.getBaseLinesVisible()); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseLinesVisible(r1.getBaseLinesVisible()); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesLinesVisible(1, true); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesLinesVisible(1, true); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseShapesVisible(!r1.getBaseShapesVisible()); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseShapesVisible(r1.getBaseShapesVisible()); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesShapesVisible(1, true); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesShapesVisible(1, true); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesShapesFilled(1, true); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesShapesFilled(1, true); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseShapesFilled(false); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseShapesFilled(false); 
     assertTrue(r1.equals(r2)); 
     r1.setUseOutlinePaint(true); 
     assertFalse(r1.equals(r2)); 
     r2.setUseOutlinePaint(true); 
     assertTrue(r1.equals(r2)); 
     r1.setUseSeriesOffset(true); 
     assertFalse(r1.equals(r2)); 
     r2.setUseSeriesOffset(true); 
     assertTrue(r1.equals(r2)); 
     r1.setItemMargin(0.14); 
     assertFalse(r1.equals(r2)); 
     r2.setItemMargin(0.14); 
     assertTrue(r1.equals(r2)); 
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
