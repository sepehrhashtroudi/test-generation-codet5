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
 * SpiderWebPlotTests.java
 * -----------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 10-Jun-2005 : Version 1 (DG);
 * 01-Jun-2006 : Added testDrawWithNullInfo() method (DG);
 * 05-Feb-2007 : Added more checks to testCloning (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
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

import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.SpiderWebPlot;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Rotation;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link SpiderWebPlot} class.
 */
public class SpiderWebPlotTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(SpiderWebPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public SpiderWebPlotTests(String name) {
        super(name);
    }

    /**
     * Some checks for the equals() method.
     */
public void testGetLabelPaint2229() { Color p = Color.RED; SpiderWebPlot plot = new SpiderWebPlot(); plot.setLabelPaint(p); assertEquals(p, plot.getLabelPaint()); plot.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE), plot.getLabelPaint()); }
public void testCloning2294() throws CloneNotSupportedException { SpiderWebPlot p1 = new SpiderWebPlot(); SpiderWebPlot p2 = (SpiderWebPlot) p1.clone(); assertNotSame(p1, p2); assertSame(p1.getClass(), p2.getClass()); assertEquals(p1, p2); }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Draws the chart with a null info object to make sure that no exceptions
     * are thrown.
     */
    

}
