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
public void testGetItemCount688() { DefaultTableXYDataset d = new DefaultTableXYDataset(); XYSeries s1 = new XYSeries("Series 1", true, false); s1.add(1.0, 1.1); s1.add(2.0, 2.2); d.addSeries(s1); assertEquals(2, d.getItemCount()); d.addSeries(s1); assertEquals(2, d.getItemCount()); d.removeSeries(s1); assertEquals(0, d.getItemCount()); }
public void testGetItemCount689() { DefaultTableXYDataset d = new DefaultTableXYDataset(); XYSeries s1 = new XYSeries("Series 1", true, false); s1.add(1.0, 1.1); s1.add(2.0, 2.2); d.addSeries(s1); assertEquals(2, d.getItemCount()); XYSeries s2 = new XYSeries("Series 2", true, false); s2.add(1.0, 1.1); s2.add(2.0, 2.2); d.addSeries(s2); assertEquals(2, d.getItemCount()); }
public void testGetSeriesKey692() { DefaultTableXYDataset d1 = new DefaultTableXYDataset(); XYSeries s1 = new XYSeries("Series 1", true, false); s1.add(1.0, 1.1); s1.add(2.0, 2.2); s1.add(3.0, 3.3); d1.addSeries(s1); assertEquals("Series 1", d1.getSeriesKey(0)); assertEquals("Series 2", d1.getSeriesKey(1)); assertEquals("Series 3", d1.getSeriesKey(2)); }
public void testGetSeriesKey693() { DefaultTableXYDataset d = new DefaultTableXYDataset(); XYSeries s1 = new XYSeries("Series 1", true, false); s1.add(1.0, 1.1); s1.add(2.0, 2.2); s1.add(3.0, 3.3); d.addSeries(s1); assertEquals("Series 1", d.getSeriesKey(0)); assertEquals("Series 2", d.getSeriesKey(1)); assertEquals("Series 3", d.getSeriesKey(2)); }
public void testStackedXYAreaRenderer5903() { StackedXYAreaRenderer r = new StackedXYAreaRenderer(); assertEquals(r, new StackedXYAreaRenderer()); }
public void testStackedXYAreaRenderer5904() { StackedXYAreaRenderer r = new StackedXYAreaRenderer(); assertEquals(r, r); }
public void testCloning5906() throws CloneNotSupportedException { StackedXYAreaRenderer r1 = new StackedXYAreaRenderer(); StackedXYAreaRenderer r2 = (StackedXYAreaRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testDrawItem5922() { }
    

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
