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
 * ------------------------
 * XYAreaRendererTests.java
 * ------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 22-Oct-2003 : Added hashCode test (DG);
 * 14-Feb-2007 : Updated testCloning() (DG);
 * 17-May-2007 : Added testGetLegendItemSeriesIndex() (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
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

import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYAreaRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link XYAreaRenderer} class.
 */
public class XYAreaRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYAreaRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYAreaRendererTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */

public void testEquals692() { 
     XYAreaRenderer r1 = new XYAreaRenderer(); 
     XYAreaRenderer r2 = new XYAreaRenderer(); 
     assertEquals(r1, r2); 
     r1 = new XYAreaRenderer(XYAreaRenderer.AREA_AND_SHAPES); 
     assertFalse(r1.equals(r2)); 
     r2 = new XYAreaRenderer(XYAreaRenderer.AREA_AND_SHAPES); 
     assertTrue(r1.equals(r2)); 
     r1 = new XYAreaRenderer(XYAreaRenderer.AREA); 
     assertFalse(r1.equals(r2)); 
     r2 = new XYAreaRenderer(XYAreaRenderer.AREA); 
     assertTrue(r1.equals(r2)); 
     r1 = new XYAreaRenderer(XYAreaRenderer.LINES); 
     assertFalse(r1.equals(r2)); 
     r2 = new XYAreaRenderer(XYAreaRenderer.LINES); 
     assertTrue(r1.equals(r2)); 
     r1 = new XYAreaRenderer(XYAreaRenderer.SHAPES); 
     assertFalse(r1.equals(r2)); 
     r2 = new XYAreaRenderer(XYAreaRenderer.SHAPES); 
     assertTrue(r1.equals(r2)); 
     r1 = new XYAreaRenderer(XYAreaRenderer.SHAPES_AND_LINES); 
     assertFalse(r1.equals(r2)); 
     r2 = new XYAreaRenderer(XYAreaRenderer.SHAPES_AND_LINES); 
     assertTrue(r1.equals(r2)); 
     r1.setOutline(true); 
     assertFalse(r1.equals(r2)); 
     r2.setOutline(true); 
     assertTrue(r1.equals(r2)); 
     r1.setLegendArea(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendArea(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertTrue(r1.equals(r2)); 
 } 


public void testCloning693() { 
     XYAreaRenderer r1 = new XYAreaRenderer(); 
     Rectangle2D rect1 = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0); 
     r1.setLegendArea(rect1); 
     XYAreaRenderer r2 = null; 
     try { 
         r2 = (XYAreaRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
     rect1.setRect(4.0, 3.0, 2.0, 1.0); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendArea(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0)); 
     assertTrue(r1.equals(r2)); 
 } 


public void testSerialization694() { 
     XYAreaRenderer r1 = new XYAreaRenderer(); 
     XYAreaRenderer r2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(r1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         r2 = (XYAreaRenderer) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         System.out.println(e.toString()); 
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
     * Draws the chart with a <code>null</code> info object to make sure that
     * no exceptions are thrown (particularly by code in the renderer).
     */
    

    /**
     * A check for the datasetIndex and seriesIndex fields in the LegendItem
     * returned by the getLegendItem() method.
     */
    

}
