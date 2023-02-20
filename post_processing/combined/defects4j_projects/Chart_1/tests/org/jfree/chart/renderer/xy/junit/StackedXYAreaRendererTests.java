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
public void testSerialization1129() { 
     StackedXYAreaRenderer r1 = new StackedXYAreaRenderer(); 
     StackedXYAreaRenderer r2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(r1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         r2 = (StackedXYAreaRenderer) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(r1, r2); 
 }
public void testCloning1130() { 
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
public void testBug15931561484() { 
     boolean success = false; 
     try { 
         DefaultTableXYDataset dataset = new DefaultTableXYDataset(); 
         XYSeries s1 = new XYSeries("Series 1", true, false); 
         s1.add(5.0, 5.0); 
         s1.add(10.0, 15.5); 
         s1.add(15.0, 9.5); 
         s1.add(20.0, 7.5); 
         dataset.addSeries(s1); 
         XYSeries s2 = new XYSeries("Series 2", true, false); 
         s2.add(5.0, 5.0); 
         s2.add(10.0, 15.5); 
         s2.add(15.0, 9.5); 
         s2.add(20.0, 3.5); 
         dataset.addSeries(s2); 
         StackedXYAreaRenderer renderer = new StackedXYAreaRenderer(XYAreaRenderer.AREA_AND_SHAPES); 
         XYPlot plot = new XYPlot(dataset, new NumberAxis("X"), new NumberAxis("Y"), renderer); 
         JFreeChart chart = new JFreeChart(plot); 
         chart.createBufferedImage(300, 200, null); 
         success = true; 
     } catch (NullPointerException e) { 
         e.printStackTrace(); 
         success = false; 
     } 
     assertTrue(success); 
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
