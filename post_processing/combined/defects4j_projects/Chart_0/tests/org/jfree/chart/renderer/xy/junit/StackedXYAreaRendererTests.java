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
 * -------------------------------
 * StackedXYAreaRendererTests.java
 * -------------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 06-Jan-2005 : Renamed StackedAreaXYRendererTests -->
 *               StackedXYAreaRendererTests, improved testEquals() method,
 *               added check for auto range calculation (DG);
 * 10-Nov-2006 : Added testBug1593156() (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Stroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import org.jfree.chart.renderer.xy.XYAreaRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.Range;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.TableXYDataset;
import org.jfree.data.xy.XYSeries;

/**
 * Tests for the {@link StackedXYAreaRenderer} class.
 */
public class StackedXYAreaRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StackedXYAreaRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StackedXYAreaRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */
public void testPublicCloneable1109() { 
     StackedXYAreaRenderer r1 = new StackedXYAreaRenderer(); 
     assertTrue(r1 instanceof PublicCloneable); 
 }
public void testEquals1110() { 
     StackedXYAreaRenderer r1 = new StackedXYAreaRenderer(); 
     StackedXYAreaRenderer r2 = new StackedXYAreaRenderer(); 
     assertEquals(r1, r2); 
     assertEquals(r2, r1); 
     r1.setShapePaint(new GradientPaint(1.0f, 2.0f, Color.yellow, 3.0f, 4.0f, Color.green)); 
     assertFalse(r1.equals(r2)); 
     r2.setShapePaint(new GradientPaint(1.0f, 2.0f, Color.yellow, 3.0f, 4.0f, Color.green)); 
     assertTrue(r1.equals(r2)); 
     Stroke s = new BasicStroke(1.23f); 
     r1.setShapeStroke(s); 
     assertFalse(r1.equals(r2)); 
     r2.setShapeStroke(s); 
     assertTrue(r1.equals(r2)); 
 }
public void testCloning1111() { 
     StackedXYAreaRenderer r1 = new StackedXYAreaRenderer(); 
     StackedXYAreaRenderer r2 = null; 
     try { 
         r2 = (StackedXYAreaRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
 }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
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
     * Check that the renderer is calculating the range bounds correctly.
     */
    

    /**
     * Draws the chart with a <code>null</code> info object to make sure that
     * no exceptions are thrown (particularly by code in the renderer).
     */
    

    /**
     * A test for bug 1593156.
     */
    

}
