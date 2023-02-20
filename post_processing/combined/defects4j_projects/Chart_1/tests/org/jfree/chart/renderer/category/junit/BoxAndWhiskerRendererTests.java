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
 * BoxAndWhiskerRendererTests.java
 * -------------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 22-Oct-2003 : Version 1 (DG);
 * 23-Apr-2004 : Extended testEquals() method (DG);
 * 12-Oct-2006 : Added new checks for bug 1572478 (DG);
 * 11-May-2007 : Added testGetLegendItem() (DG);
 * 17-May-2007 : Added testGetLegendItemSeriesIndex() (DG);
 * 08-Oct-2007 : Added tests for null items in dataset (DG);
 * 15-Jan-2008 : Updated testEquals() (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 * 21-Jan-2009 : Updated testEquals() for new fields (DG);
 *
 */

package org.jfree.chart.renderer.category.junit;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.BufferedImageRenderingSource;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.BoxAndWhiskerItem;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;

/**
 * Tests for the {@link BoxAndWhiskerRenderer} class.
 */
public class BoxAndWhiskerRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(BoxAndWhiskerRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public BoxAndWhiskerRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */
public void testSerialization263() { 
     BoxAndWhiskerRenderer r1 = new BoxAndWhiskerRenderer(); 
     BoxAndWhiskerRenderer r2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(r1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         r2 = (BoxAndWhiskerRenderer) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(r1, r2); 
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
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Draws the chart with a <code>null</code> info object to make sure that
     * no exceptions are thrown (particularly by code in the renderer).
     */
    

    /**
     * A check for bug 1572478 (for the vertical orientation).
     */
    

    /**
     * A check for bug 1572478 (for the horizontal orientation).
     */
    

    /**
     * Some checks for the getLegendItem() method.
     */
    

    /**
     * A check for the datasetIndex and seriesIndex fields in the LegendItem
     * returned by the getLegendItem() method.
     */
    

    /**
     * Draws a chart where the dataset contains a null mean value.
     */
    

    /**
     * Draws a chart where the dataset contains a null median value.
     */
    

    /**
     * Draws a chart where the dataset contains a null Q1 value.
     */
    

    /**
     * Draws a chart where the dataset contains a null Q3 value.
     */
    

    /**
     * Draws a chart where the dataset contains a null min regular value.
     */
    

    /**
     * Draws a chart where the dataset contains a null max regular value.
     */
    

    /**
     * Draws a chart where the dataset contains a null min outlier value.
     */
    

    /**
     * Draws a chart where the dataset contains a null max outlier value.
     */
    

}
