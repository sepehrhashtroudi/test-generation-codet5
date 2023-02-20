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
 * -----------------------
 * LevelRendererTests.java
 * -----------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 29-Mar-2005 : Version 1 (DG);
 * 23-Apr-2008 : Added testPublicCloneable (DG);
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
import org.jfree.chart.renderer.category.LevelRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link LevelRenderer} class.
 */
public class LevelRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(LevelRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public LevelRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */
public void testSerialization1131() { 
     LevelRenderer r1 = new LevelRenderer(); 
     LevelRenderer r2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(r1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         r2 = (LevelRenderer) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(r1, r2); 
 }
public void testEquals1133() { 
     LevelRenderer r1 = new LevelRenderer(); 
     LevelRenderer r2 = new LevelRenderer(); 
     assertEquals(r1, r2); 
     r1.setItemMargin(0.11); 
     assertFalse(r1.equals(r2)); 
     r2.setItemMargin(0.11); 
     assertTrue(r1.equals(r2)); 
     r1.setMaximumItemWidth(0.11); 
     assertFalse(r1.equals(r2)); 
     r2.setMaximumItemWidth(0.11); 
     assertTrue(r1.equals(r2)); 
     r1.setItemMargin(0.22); 
     assertFalse(r1.equals(r2)); 
     r2.setItemMargin(0.22); 
     assertTrue(r1.equals(r2)); 
     r1.setMaximumItemWidth(0.33); 
     assertFalse(r1.equals(r2)); 
     r2.setMaximumItemWidth(0.33); 
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
    private boolean checkIndependence(LevelRenderer r1, LevelRenderer r2) {

        // should be equal...
        boolean b0 = r1.equals(r2);

        // and independent...
        r1.setItemMargin(0.0);
        boolean b1 = !r1.equals(r2);
        r2.setItemMargin(0.0);
        boolean b2 = r1.equals(r2);

        return b0 && b1 && b2;

    }

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Draws the chart with a <code>null</code> info object to make sure that
     * no exceptions are thrown (particularly by code in the renderer).
     */
    

    /**
     * A check for the datasetIndex and seriesIndex fields in the LegendItem
     * returned by the getLegendItem() method.
     */
    

}
