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
 * ------------------------------
 * CategoryStepRendererTests.java
 * ------------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 08-Mar-2005 : Version 1 (DG);
 * 22-Feb-2007 : Minor updates (DG);
 * 17-May-2007 : Added testGetLegendItemSeriesIndex() (DG);
 * 23-Apr-2008 : Added testPublicCloneable (DG);
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
import org.jfree.chart.LegendItem;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.CategoryStepRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link CategoryStepRenderer} class.
 */
public class CategoryStepRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CategoryStepRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CategoryStepRendererTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */

public void testGetLegendItemSeriesIndex350() { 
     DefaultCategoryDataset dataset0 = new DefaultCategoryDataset(); 
     dataset0.addValue(21.0, "R1", "C1"); 
     dataset0.addValue(22.0, "R2", "C1"); 
     DefaultCategoryDataset dataset1 = new DefaultCategoryDataset(); 
     dataset1.addValue(23.0, "R3", "C1"); 
     dataset1.addValue(24.0, "R4", "C1"); 
     dataset1.addValue(25.0, "R5", "C1"); 
     CategoryStepRenderer r = new CategoryStepRenderer(); 
     CategoryPlot plot = new CategoryPlot(dataset0, new CategoryAxis("x"), new NumberAxis("y"), r); 
     plot.setDataset(1, dataset1); 
     new JFreeChart(plot); 
     LegendItem li = r.getLegendItem(1, 2); 
     assertEquals("R5", li.getLabel()); 
     assertEquals(1, li.getDatasetIndex()); 
     assertEquals(2, li.getSeriesIndex()); 
 } 


public void testEquals351() { 
     CategoryStepRenderer r1 = new CategoryStepRenderer(false); 
     CategoryStepRenderer r2 = new CategoryStepRenderer(false); 
     assertEquals(r1, r2); 
     r1 = new CategoryStepRenderer(true); 
     assertFalse(r1.equals(r2)); 
     r2 = new CategoryStepRenderer(true); 
     assertTrue(r1.equals(r2)); 
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
     * A check for the datasetIndex and seriesIndex fields in the LegendItem
     * returned by the getLegendItem() method.
     */
    

}
