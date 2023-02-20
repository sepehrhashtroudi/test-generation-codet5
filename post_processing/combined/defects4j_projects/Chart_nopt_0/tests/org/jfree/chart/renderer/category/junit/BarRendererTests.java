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
 * ---------------------
 * BarRendererTests.java
 * ---------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 19-Aug-2003 : Renamed HorizontalBarRendererTests --> BarRendererTests (DG);
 * 22-Oct-2003 : Added hashCode test (DG);
 * 18-May-2005 : Added field to equals() test (DG);
 * 22-Sep-2005 : Renamed getMaxBarWidth() --> getMaximumBarWidth() (DG);
 * 11-May-2007 : Added testGetLegendItem() (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 * 25-Nov-2008 : Added testFindRangeBounds (DG);
 *
 */

package org.jfree.chart.renderer.category.junit;

import java.awt.Color;
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
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.GradientBarPainter;
import org.jfree.chart.renderer.junit.RendererChangeDetector;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.util.GradientPaintTransformType;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.StandardGradientPaintTransformer;
import org.jfree.data.Range;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link BarRenderer} class.
 */
public class BarRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(BarRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public BarRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */
public void testFireChangeEvent2616() { BarRenderer r = new BarRenderer(); r.setBase(1.0); assertEquals(1.0, r.getBase(), 0.001); r.setBase(2.0); assertEquals(2.0, r.getBase(), 0.001); r.setBase(3.0); assertEquals(3.0, r.getBase(), 0.001); r.setBase(4.0); assertEquals(4.0, r.getBase(), 0.001); r.setBase(5.0); assertEquals(5.0, r.getBase(), 0.001); }
public void testDrawBarOutline2621() { BarRenderer r = new BarRenderer(); r.setDrawBarOutline(true); assertTrue(r.isDrawBarOutline()); r.setDrawBarOutline(false); assertFalse(r.isDrawBarOutline()); }
public void testFireChangeEvent2622() { BarRenderer r = new BarRenderer(); r.setDrawBarOutline(false); assertFalse(r.isDrawBarOutline()); r.setDrawBarOutline(true); assertTrue(r.isDrawBarOutline()); }
public void testSetShadowVisible2632() { BarRenderer r = new BarRenderer(); r.setShadowVisible(true); assertTrue(r.getShadowsVisible()); r.setShadowVisible(false); assertFalse(r.getShadowsVisible()); r.setShadowVisible(true); assertTrue(r.getShadowsVisible()); r.setShadowVisible(false); assertFalse(r.getShadowsVisible()); }
public void testSetShadowXOffset2637() { BarRenderer r = new BarRenderer(); r.setShadowXOffset(0.5); assertEquals(0.5, r.getShadowXOffset(), 0.001); r.setShadowXOffset(1.0); assertEquals(1.0, r.getShadowXOffset(), 0.001); r.setShadowXOffset(2.0); assertEquals(2.0, r.getShadowXOffset(), 0.001); r.setShadowXOffset(3.0); assertEquals(3.0, r.getShadowXOffset(), 0.001); }
public void testFireChangeEvent2638() { BarRenderer r = new BarRenderer(); r.setShadowXOffset(1.0); assertEquals(1.0, r.getShadowXOffset(), 0.001); r.setShadowXOffset(2.0); assertEquals(2.0, r.getShadowXOffset(), 0.001); r.setShadowXOffset(3.0); assertEquals(3.0, r.getShadowXOffset(), 0.001); }
public void testSetShadowYOffset2639() { BarRenderer r = new BarRenderer(); r.setShadowYOffset(0.5); assertEquals(0.5, r.getShadowYOffset(), 0.001); r.setShadowYOffset(1.0); assertEquals(1.0, r.getShadowYOffset(), 0.001); r.setShadowYOffset(2.0); assertEquals(2.0, r.getShadowYOffset(), 0.001); r.setShadowYOffset(3.0); assertEquals(3.0, r.getShadowYOffset(), 0.001); }
public void testFireChangeEvent2640() { BarRenderer r = new BarRenderer(); r.setShadowYOffset(1.0); assertEquals(1.0, r.getShadowYOffset(), 0.001); r.setShadowYOffset(2.0); assertEquals(2.0, r.getShadowYOffset(), 0.001); r.setShadowYOffset(3.0); assertEquals(3.0, r.getShadowYOffset(), 0.001); }
    

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
     * Tests each setter method to ensure that it sends an event notification.
     */
    

    /**
     * Some checks for the getLegendItem() method.
     */
    

    /**
     * A check for the datasetIndex and seriesIndex fields in the LegendItem
     * returned by the getLegendItem() method.
     */
    

    /**
     * Some checks for the findRangeBounds() method.
     */
    

}
