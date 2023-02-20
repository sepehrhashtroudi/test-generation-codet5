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
 * -----------------------
 * XYBarRendererTests.java
 * -----------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 22-Oct-2003 : Added hashCode test (DG);
 * 09-Feb-2007 : Added to testCloning() (DG);
 * 17-May-2007 : Added testGetLegendItemSeriesIndex() (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 * 19-Jun-2008 : Added testFindRangeBounds() (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

import java.awt.geom.Rectangle2D;
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
import org.jfree.chart.LegendItem;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.GradientXYBarPainter;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.util.GradientPaintTransformType;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.StandardGradientPaintTransformer;
import org.jfree.data.Range;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.XYBarDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link XYBarRenderer} class.
 */
public class XYBarRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYBarRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYBarRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */
public void testXYBarRenderer3088() { XYBarRenderer r = new XYBarRenderer(); }
public void testXYBarRenderer3089() { XYBarRenderer r = new XYBarRenderer(); assertEquals(0.0, r.getMargin(), 0.001); }
public void testCloning3109() throws CloneNotSupportedException { XYBarRenderer r1 = new XYBarRenderer(); XYBarRenderer r2 = (XYBarRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
    

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
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Check that the renderer is calculating the domain bounds correctly.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * A simple test for the findRangeBounds() method.
     */
    

    /**
     * A check for the datasetIndex and seriesIndex fields in the LegendItem
     * returned by the getLegendItem() method.
     */
    


}
