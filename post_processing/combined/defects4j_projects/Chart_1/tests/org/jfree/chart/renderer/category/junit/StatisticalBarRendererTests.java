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
 * --------------------------------
 * StatisticalBarRendererTests.java
 * --------------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 28-Aug-2007 : Added tests for bug 1779941 (DG);
 * 14-Nov-2007 : Updated testEquals() (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.chart.renderer.category.junit;

import java.awt.BasicStroke;
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
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.StatisticalBarRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;

/**
 * Tests for the {@link StatisticalBarRenderer} class.
 */
public class StatisticalBarRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StatisticalBarRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StatisticalBarRendererTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */
public void testGetColumnKey314() { 
     DefaultStatisticalCategoryDataset d = new DefaultStatisticalCategoryDataset(); 
     assertNull(d.getColumnKey(0)); 
     d.add(1.0, 2.0, "R1", "C1"); 
     assertEquals("R1", d.getColumnKey(0)); 
     d.add(10.0, 20.0, "R1", "C2"); 
     assertEquals("R1", d.getColumnKey(0)); 
     d.add(15.0, 9.0, "R1", "C3"); 
     assertEquals("R1", d.getColumnKey(1)); 
     boolean pass = false; 
     try { 
         d.getColumnKey(-1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         d.getColumnKey(2); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testCloning315() { 
     DefaultStatisticalCategoryDataset d1 = new DefaultStatisticalCategoryDataset(); 
     DefaultStatisticalCategoryDataset d2 = null; 
     try { 
         d2 = (DefaultStatisticalCategoryDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     d1.add(1.0, 2.0, "R1", "C1"); 
     assertFalse(d1.equals(d2)); 
     d2.add(1.0, 2.0, "R1", "C1"); 
     assertTrue(d1.equals(d2)); 
 }
public void testSerialization972() { 
     StatisticalBarRenderer r1 = new StatisticalBarRenderer(); 
     StatisticalBarRenderer r2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(r1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         r2 = (StatisticalBarRenderer) in.readObject(); 
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
     * Draws the chart with a <code>null</code> mean value to make sure that
     * no exceptions are thrown (particularly by code in the renderer).  See
     * bug report 1779941.
     */
    

    /**
     * Draws the chart with a <code>null</code> mean value to make sure that
     * no exceptions are thrown (particularly by code in the renderer).  See
     * bug report 1779941.
     */
    

    /**
     * Draws the chart with a <code>null</code> standard deviation to make sure
     * that no exceptions are thrown (particularly by code in the renderer).
     * See bug report 1779941.
     */
    

    /**
     * Draws the chart with a <code>null</code> standard deviation to make sure
     * that no exceptions are thrown (particularly by code in the renderer).
     * See bug report 1779941.
     */
    

}
