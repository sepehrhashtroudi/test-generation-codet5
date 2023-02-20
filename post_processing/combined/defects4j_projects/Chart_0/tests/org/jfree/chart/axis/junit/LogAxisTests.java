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
 * -----------------
 * LogAxisTests.java
 * -----------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 11-Jul-2007 : Version 1 (DG);
 * 08-Apr-2008 : Fixed incorrect testEquals() method (DG);
 *
 */

package org.jfree.chart.axis.junit;

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
import org.jfree.chart.axis.LogAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link LogAxis} class.
 */
public class LogAxisTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(LogAxisTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public LogAxisTests(String name) {
        super(name);
    }

    /**
     * Confirm that cloning works.
     */
public void testTranslateJava2DToValue730() { 
     LogAxis axis = new LogAxis(); 
     axis.setRange(50.0, 100.0); 
     Rectangle2D dataArea = new Rectangle2D.Double(10.0, 50.0, 400.0, 300.0); 
     double y1 = axis.java2DToValue(75.0, dataArea, RectangleEdge.LEFT); 
     assertEquals(94.3874312681693, y1, EPSILON); 
     double y2 = axis.java2DToValue(75.0, dataArea, RectangleEdge.RIGHT); 
     assertEquals(94.3874312681693, y2, EPSILON); 
     double x1 = axis.java2DToValue(75.0, dataArea, RectangleEdge.TOP); 
     assertEquals(55.961246381405, x1, EPSILON); 
     double x2 = axis.java2DToValue(75.0, dataArea, RectangleEdge.BOTTOM); 
     assertEquals(55.961246381405, x2, EPSILON); 
     axis.setInverted(true); 
     double y3 = axis.java2DToValue(75.0, dataArea, RectangleEdge.LEFT); 
     assertEquals(52.9731547179647, y3, EPSILON); 
     double y4 = axis.java2DToValue(75.0, dataArea, RectangleEdge.RIGHT); 
     assertEquals(52.9731547179647, y4, EPSILON); 
     double x3 = axis.java2DToValue(75.0, dataArea, RectangleEdge.TOP); 
     assertEquals(89.3475453695651, x3, EPSILON); 
     double x4 = axis.java2DToValue(75.0, dataArea, RectangleEdge.BOTTOM); 
     assertEquals(89.3475453695651, x4, EPSILON); 
 }
public void testCloning734() { 
     LogAxis a1 = new LogAxis("Test"); 
     LogAxis a2 = null; 
     try { 
         a2 = (LogAxis) a1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(a1 != a2); 
     assertTrue(a1.getClass() == a2.getClass()); 
     assertTrue(a1.equals(a2)); 
 }
public void testHashCode735() { 
     LogAxis a1 = new LogAxis("Test"); 
     LogAxis a2 = new LogAxis("Test"); 
     assertTrue(a1.equals(a2)); 
     int h1 = a1.hashCode(); 
     int h2 = a2.hashCode(); 
     assertEquals(h1, h2); 
 }
    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    private static final double EPSILON = 0.0000001;

    /**
     * Test the translation of Java2D values to data values.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * A simple test for the auto-range calculation looking at a
     * LogAxis used as the range axis for a CategoryPlot.
     */
    

    /**
     * A simple test for the auto-range calculation looking at a
     * NumberAxis used as the range axis for a CategoryPlot.  In this
     * case, the original dataset is replaced with a new dataset.
     */
    

    /**
     * Checks that the auto-range for the domain axis on an XYPlot is
     * working as expected.
     */
    

    /**
     * Checks that the auto-range for the range axis on an XYPlot is
     * working as expected.
     */
    

    /**
     * Some checks for the setLowerBound() method.
     */
    

    /**
     * Checks the default value for the tickMarksVisible flag.
     */
    
}
