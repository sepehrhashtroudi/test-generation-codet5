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
 * -----------------------------------
 * GroupedStackedBarRendererTests.java
 * -----------------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 08-Jul-2004 : Version 1 (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.chart.renderer.category.junit;

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
import org.jfree.chart.renderer.category.GroupedStackedBarRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.KeyToGroupMap;
import org.jfree.data.Range;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link GroupedStackedBarRenderer} class.
 */
public class GroupedStackedBarRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(GroupedStackedBarRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public GroupedStackedBarRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */
public void testSerialization1060() { 
     GroupedStackedBarRenderer r1 = new GroupedStackedBarRenderer(); 
     GroupedStackedBarRenderer r2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(r1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         r2 = (GroupedStackedBarRenderer) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(r1, r2); 
 }
public void testEquals1061() { 
     GroupedStackedBarRenderer r1 = new GroupedStackedBarRenderer(); 
     GroupedStackedBarRenderer r2 = new GroupedStackedBarRenderer(); 
     assertEquals(r1, r2); 
     KeyToGroupMap m1 = new KeyToGroupMap("G1"); 
     r1.setSeriesToGroupMap(m1); 
     assertFalse(r1.equals(r2)); 
     KeyToGroupMap m2 = new KeyToGroupMap("G2"); 
     r2.setSeriesToGroupMap(m2); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesToGroupMap(null); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesToGroupMap(null); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesToGroupMap(m2); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesToGroupMap(m2); 
     assertTrue(r1.equals(r2)); 
 }
public void testEquals1062() { 
     GroupedStackedBarRenderer r1 = new GroupedStackedBarRenderer(); 
     GroupedStackedBarRenderer r2 = new GroupedStackedBarRenderer(); 
     assertEquals(r1, r2); 
     KeyToGroupMap m1 = new KeyToGroupMap("G1"); 
     r1.setSeriesToGroupMap(m1); 
     assertFalse(r1.equals(r2)); 
     KeyToGroupMap m2 = new KeyToGroupMap("G2"); 
     r2.setSeriesToGroupMap(m2); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesToGroupMap(null); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesToGroupMap(m2); 
     assertTrue(r1.equals(r2)); 
 }
public void testFindRangeBounds1063() { 
     GroupedStackedBarRenderer r = new GroupedStackedBarRenderer(); 
     assertNull(r.findRangeBounds(null)); 
     DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
     assertNull(r.findRangeBounds(dataset)); 
     dataset.addValue(1.0, "R1", "C1"); 
     assertEquals(new Range(1.0, 1.0), r.findRangeBounds(dataset)); 
     dataset.addValue(-2.0, "R2", "C1"); 
     assertEquals(new Range(-2.0, 1.0), r.findRangeBounds(dataset)); 
 }
    

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
     * Some checks for the findRangeBounds() method.
     */
    

}
