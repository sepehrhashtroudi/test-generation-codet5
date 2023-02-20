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
public void testEquals489() { 
     SpiderWebPlot p1 = new SpiderWebPlot(new DefaultCategoryDataset()); 
     SpiderWebPlot p2 = new SpiderWebPlot(new DefaultCategoryDataset()); 
     assertTrue(p1.equals(p2)); 
     assertTrue(p2.equals(p1)); 
     p1.setDataExtractOrder(TableOrder.BY_COLUMN); 
     assertFalse(p1.equals(p2)); 
     p2.setDataExtractOrder(TableOrder.BY_COLUMN); 
     assertTrue(p1.equals(p2)); 
     p1.setHeadPercent(0.321); 
     assertFalse(p1.equals(p2)); 
     p2.setHeadPercent(0.321); 
     assertTrue(p1.equals(p2)); 
     p1.setInteriorGap(0.123); 
     assertFalse(p1.equals(p2)); 
     p2.setInteriorGap(0.123); 
     assertTrue(p1.equals(p2)); 
     p1.setStartAngle(0.456); 
     assertFalse(p1.equals(p2)); 
     p2.setStartAngle(0.456); 
     assertTrue(p1.equals(p2)); 
     p1.setDirection(Rotation.ANTICLOCKWISE); 
     assertFalse(p1.equals(p2)); 
     p2.setDirection(Rotation.ANTICLOCKWISE); 
     assertTrue(p1.equals(p2)); 
     p1.setMaxValue(123.4); 
     assertFalse(p1.equals(p2)); 
     p2.setMaxValue(123.4); 
     assertTrue(p1.equals(p2)); 
     p1.setLegendItemShape(new Rectangle(1, 2, 3, 4)); 
     assertFalse(p1.equals(p2));
}

public void testCloning492() { 
     SpiderWebPlot p1 = new SpiderWebPlot(new DefaultCategoryDataset()); 
     SpiderWebPlot p2 = null; 
     try { 
         p2 = (SpiderWebPlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
 }
public void testGenerateLabel1326() { 
     StandardCategoryItemLabelGenerator g = new StandardCategoryItemLabelGenerator("{2}", new DecimalFormat("0.000")); 
     DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
     dataset.addValue(1.0, "R0", "C0"); 
     dataset.addValue(2.0, "R0", "C1"); 
     dataset.addValue(3.0, "R1", "C0"); 
     dataset.addValue(null, "R1", "C1"); 
     String s = g.generateColumnLabel(dataset, 0); 
     assertTrue(s.startsWith("1")); 
     assertTrue(s.endsWith("000")); 
     s = g.generateColumnLabel(dataset, 1); 
     assertEquals("-", s); 
 }
    

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
