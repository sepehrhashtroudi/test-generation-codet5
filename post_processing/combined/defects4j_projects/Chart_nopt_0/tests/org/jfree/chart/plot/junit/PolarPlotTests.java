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
 * -------------------
 * PolarPlotTests.java
 * -------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 23-Feb-2005 : Version 1 (DG);
 * 08-Jun-2005 : Extended testEquals() (DG);
 * 07-Feb-2007 : Extended testEquals() and testCloning() (DG);
 * 17-Feb-2008 : Tests for new angleTickUnit field (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
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

import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.data.xy.DefaultXYDataset;

/**
 * Some tests for the {@link PolarPlot} class.
 */
public class PolarPlotTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(PolarPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public PolarPlotTests(String name) {
        super(name);
    }

    /**
     * Some checks for the equals() method.
     */
public void testSetAngleLabelsVisible2562() { PolarPlot plot = new PolarPlot(); plot.setAngleLabelsVisible(true); assertTrue(plot.isAngleLabelsVisible()); plot.setAngleLabelsVisible(false); assertFalse(plot.isAngleLabelsVisible()); plot.setAngleLabelsVisible(true); assertTrue(plot.isAngleLabelsVisible()); plot.setAngleLabelsVisible(true); assertTrue(plot.isAngleLabelsVisible()); }
public void testFireChangeEvent2563() { PolarPlot plot = new PolarPlot(); plot.setAngleLabelsVisible(true); plot.setAngleLabelsVisible(false); plot.setAngleLabelsVisible(true); }
public void testSetAngleLabelFont2565() { Font f = new Font("SansSerif", Font.PLAIN, 12); PolarPlot plot = new PolarPlot(); plot.setAngleLabelFont(f); assertEquals(f, plot.getAngleLabelFont()); try { plot.setAngleLabelFont(null); fail(); } catch (IllegalArgumentException e) { } }
public void testCloning2569() throws CloneNotSupportedException { PolarPlot p1 = new PolarPlot(); p1.setAngleLabelPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); PolarPlot p2 = (PolarPlot) p1.clone(); assertNotSame(p1, p2); assertSame(p1.getAngleLabelPaint(), p2.getAngleLabelPaint()); }
public void testSetAngleGridlinesVisible2572() { PolarPlot plot = new PolarPlot(); plot.setAngleGridlinesVisible(true); assertTrue(plot.isAngleGridlinesVisible()); plot.setAngleGridlinesVisible(false); assertFalse(plot.isAngleGridlinesVisible()); plot.setAngleGridlinesVisible(true); assertTrue(plot.isAngleGridlinesVisible()); plot.setAngleGridlinesVisible(true); assertTrue(plot.isAngleGridlinesVisible()); }
public void testSetAngleGridlinesVisible2573() { PolarPlot plot = new PolarPlot(); plot.setAngleGridlinesVisible(true); assertEquals(true, plot.isAngleGridlinesVisible()); plot.setAngleGridlinesVisible(false); assertEquals(false, plot.isAngleGridlinesVisible()); plot.setAngleGridlinesVisible(true); assertEquals(true, plot.isAngleGridlinesVisible()); plot.setAngleGridlinesVisible(true); assertEquals(true, plot.isAngleGridlinesVisible()); }
public void testSetAngleGridlineStroke2576() { Stroke s = new BasicStroke(1.5f); PolarPlot plot = new PolarPlot(); plot.setAngleGridlineStroke(s); assertEquals(s, plot.getAngleGridlineStroke()); }
public void testCloning2578() throws CloneNotSupportedException { PolarPlot p1 = new PolarPlot(); p1.setAngleGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); PolarPlot p2 = (PolarPlot) p1.clone(); p2.setAngleGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertNotSame(p1, p2); }
public void testCloning2579() throws CloneNotSupportedException { PolarPlot p1 = new PolarPlot(); p1.setAngleGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); PolarPlot p2 = (PolarPlot) p1.clone(); assertNotSame(p1, p2); assertSame(p1.getAngleGridlinePaint(), p2.getAngleGridlinePaint()); }
public void testSetRadiusGridlinesVisible2581() { PolarPlot plot = new PolarPlot(); plot.setRadiusGridlinesVisible(true); assertTrue(plot.isRadiusGridlinesVisible()); plot.setRadiusGridlinesVisible(false); assertFalse(plot.isRadiusGridlinesVisible()); plot.setRadiusGridlinesVisible(true); assertTrue(plot.isRadiusGridlinesVisible()); plot.setRadiusGridlinesVisible(true); assertTrue(plot.isRadiusGridlinesVisible()); }
public void testStroke2584() { Stroke s = new BasicStroke(1.5f); PolarPlot plot = new PolarPlot(); plot.setRadiusGridlineStroke(s); assertEquals(s, plot.getRadiusGridlineStroke()); }
public void testRadiusGridlineStroke2585() { Stroke s = new BasicStroke(1.5f); PolarPlot plot = new PolarPlot(); plot.setRadiusGridlineStroke(s); assertEquals(s, plot.getRadiusGridlineStroke()); }
public void testCloning2586() throws CloneNotSupportedException { PolarPlot p1 = new PolarPlot(); p1.setRadiusGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); PolarPlot p2 = (PolarPlot) p1.clone(); assertNotSame(p1, p2); assertSame(p1.getRadiusGridlinePaint(), p2.getRadiusGridlinePaint()); }
public void testCloning2587() throws CloneNotSupportedException { PolarPlot p1 = new PolarPlot(); p1.setRadiusGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); PolarPlot p2 = (PolarPlot) p1.clone(); p2.setRadiusGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertNotSame(p1, p2); }
public void testCloning2596() throws CloneNotSupportedException { PolarPlot p1 = new PolarPlot(); PolarPlot p2 = (PolarPlot) p1.clone(); assertNotSame(p1, p2); assertSame(p1.getClass(), p2.getClass()); assertEquals(p1, p2); }
public void testCloning2597() throws CloneNotSupportedException { PolarPlot p1 = new PolarPlot(); PolarPlot p2 = (PolarPlot) p1.clone(); assertNotSame(p1, p2); assertSame(p1.getDataset(), p2.getDataset()); assertEquals(p1, p2); }
    

    /**
     * Some basic checks for the clone() method.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
