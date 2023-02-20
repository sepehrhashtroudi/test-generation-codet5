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
 * -------------------------
 * AreaXYRenderer2Tests.java
 * -------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 24-May-2005 : Version 1 (DG);
 * 30-Nov-2006 : Extended testEquals() and testCloning() (DG);
 * 17-May-2007 : Added testGetLegendItemSeriesIndex() (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

import java.awt.Rectangle;
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
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYAreaRenderer2;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link XYAreaRenderer2} class.
 */
public class XYAreaRenderer2Tests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYAreaRenderer2Tests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYAreaRenderer2Tests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */
public void testGetLegendItemSeriesIndex1604() { 
     XYSeriesCollection d1 = new XYSeriesCollection(); 
     XYSeries s1 = new XYSeries("S1"); 
     s1.add(1.0, 1.1); 
     XYSeries s2 = new XYSeries("S2"); 
     s2.add(1.0, 1.1); 
     d1.addSeries(s1); 
     d1.addSeries(s2); 
     XYSeriesCollection d2 = new XYSeriesCollection(); 
     XYSeries s3 = new XYSeries("S3"); 
     s3.add(1.0, 1.1); 
     XYSeries s4 = new XYSeries("S4"); 
     s4.add(1.0, 1.1); 
     XYSeries s5 = new XYSeries("S5"); 
     s5.add(1.0, 1.1); 
     d2.addSeries(s3); 
     d2.addSeries(s4); 
     XYAreaRenderer2 r = new XYAreaRenderer2(); 
     XYPlot plot = new XYPlot(d1, new NumberAxis("x"), new NumberAxis("y"), r); 
     plot.setDataset(1, d2); 
     new JFreeChart(plot); 
     LegendItem li = r.getLegendItem(1, 2); 
     assertEquals("S5", li.getLabel()); 
     assertEquals(1, li.getDatasetIndex()); 
     assertEquals(2, li.getSeriesIndex()); 
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
     * Draws the chart with a <code>null</code> info object to make sure that
     * no exceptions are thrown (particularly by code in the renderer).
     */
    

    /**
     * A check for the datasetIndex and seriesIndex fields in the LegendItem
     * returned by the getLegendItem() method.
     */
    

}
