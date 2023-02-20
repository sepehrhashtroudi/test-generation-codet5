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
 * --------------------------------
 * StandardXYItemRendererTests.java
 * --------------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 22-Oct-2003 : Added hashCode test (DG);
 * 08-Oct-2004 : Strengthened test for equals() method (DG);
 * 14-Mar-2007 : Added new checks in testEquals() and testCloning() (DG);
 * 17-May-2007 : Added testGetLegendItemSeriesIndex() (DG);
 * 08-Jun-2007 : Added testNoDisplayedItem() (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
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
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.entity.XYItemEntity;
import org.jfree.chart.junit.TestUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.chart.util.UnitType;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link StandardXYItemRenderer} class.
 */
public class StandardXYItemRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StandardXYItemRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StandardXYItemRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */

public void testGetLegendItemSeriesIndex618() { 
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
     d2.addSeries(s5); 
     StandardXYItemRenderer r = new StandardXYItemRenderer(); 
     XYPlot plot = new XYPlot(d1, new NumberAxis("x"), new NumberAxis("y"), r); 
     plot.setDataset(1, d2); 
     new JFreeChart(plot); 
     LegendItem li = r.getLegendItem(1, 2); 
     assertEquals("S5", li.getLabel()); 
     assertEquals(1, li.getDatasetIndex()); 
     assertEquals(2, li.getSeriesIndex()); 
 } 


public void testSerialization619() { 
     StandardXYItemRenderer r1 = new StandardXYItemRenderer(); 
     StandardXYItemRenderer r2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(r1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         r2 = (StandardXYItemRenderer) in.readObject(); 
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
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * A check for the datasetIndex and seriesIndex fields in the LegendItem
     * returned by the getLegendItem() method.
     */
    

    /**
     * A check to ensure that an item that falls outside the plot's data area
     * does NOT generate an item entity.
     */
    

}
