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
 * -------------------------
 * FastScatterPlotTests.java
 * -------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 18-Mar-2003 : Version 1 (DG);
 * 29-Jan-2009 : Updated testEquals() (DG);
 * 26-Mar-2009 : Updated testEquals() for new panning fields (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Stroke;
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
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.FastScatterPlot;

/**
 * Tests for the {@link FastScatterPlot} class.
 */
public class FastScatterPlotTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(FastScatterPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public FastScatterPlotTests(String name) {
        super(name);
    }

    /**
     * Some checks for the equals() method.
     */
public void testCloning1193() { 
     FastScatterPlot p1 = new FastScatterPlot(); 
     FastScatterPlot p2 = null; 
     try { 
         p2 = (FastScatterPlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     float[][] a = p1.getData(); 
     float[][] b = p2.getData(); 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     a[0] = new float[6]; 
     assertFalse(p1.equals(p2)); 
     b[0] = new float[6]; 
     assertTrue(p1.equals(p2)); 
     a[0][0] = 1.0f; 
     assertFalse(p1.equals(p2)); 
     b[0][0] = 1.0f; 
     assertTrue(p1.equals(p2)); 
     a[0][1] = Float.NaN; 
     assertFalse(p1.equals(p2)); 
     b[0][1] = Float.NaN; 
     assertTrue(p1.equals(p2)); 
     a[0][2] = Float.POSITIVE_INFINITY; 
     assertFalse(p1.equals(p2)); 
     b[0][2] = Float.POSITIVE_INFINITY; 
     assertTrue(p1.equals(p2)); 
     a[0][3] = Float.NEGATIVE_INFINITY; 
     assertFalse(p1.equals(p2));
}

    

    /**
     * Some tests for the data array equality in the equals() method.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Draws the chart with a <code>null</code> info object to make sure that
     * no exceptions are thrown.
     */
    

    /**
     * Populates the data array with random values.
     *
     * @return Random data.
     */
    private float[][] createData() {
        float[][] result = new float[2][1000];
        for (int i = 0; i < result[0].length; i++) {
            float x = (float) i + 100;
            result[0][i] = x;
            result[1][i] = 100 + (float) Math.random() * 1000;
        }
        return result;
    }

}
