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
 * ----------------------------
 * XYStepAreaRendererTests.java
 * ----------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   Matthias Rose;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 26-Sep-2003 : copied XYStepRendererTests.java and used for
 *               testing XYStepAreaRenderer (MR);
 * 14-Feb-2007 : Extended testEquals() (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

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
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYSeries;

/**
 * Tests for the {@link XYStepAreaRenderer} class.
 */
public class XYStepAreaRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYStepAreaRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYStepAreaRendererTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */
public void testXYStepAreaRenderer1163() { XYStepAreaRenderer r1 = new XYStepAreaRenderer(); XYStepAreaRenderer r2 = new XYStepAreaRenderer(); assertEquals(r1, r2); }
public void testXYStepAreaRenderer1164() { XYStepAreaRenderer r = new XYStepAreaRenderer(); assertEquals(r, new XYStepAreaRenderer()); }
public void testCloning1167() throws CloneNotSupportedException { XYStepAreaRenderer r1 = new XYStepAreaRenderer(); XYStepAreaRenderer r2 = (XYStepAreaRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testIsOutline1170() { XYStepAreaRenderer r = new XYStepAreaRenderer(); assertFalse(r.isOutline()); r.setOutline(true); assertTrue(r.isOutline()); r.setOutline(false); assertFalse(r.isOutline()); }
public void testCloning1171() throws CloneNotSupportedException { XYStepAreaRenderer r1 = new XYStepAreaRenderer(); r1.setOutline(true); XYStepAreaRenderer r2 = (XYStepAreaRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testFireChangeEvent1172() { XYStepAreaRenderer r = new XYStepAreaRenderer(); assertFalse(r.isOutline()); r.setOutline(true); assertTrue(r.isOutline()); r.setOutline(false); assertFalse(r.isOutline()); r.setOutline(true); assertTrue(r.isOutline()); r.setOutline(false); assertFalse(r.isOutline()); r.setOutline(true); assertTrue(r.isOutline()); }
public void testGetShapesVisible1173() { XYStepAreaRenderer r = new XYStepAreaRenderer(); assertFalse(r.getShapesVisible()); r.setShapesVisible(true); assertTrue(r.getShapesVisible()); r.setShapesVisible(false); assertFalse(r.getShapesVisible()); }
public void testCloning1174() throws CloneNotSupportedException { XYStepAreaRenderer r1 = new XYStepAreaRenderer(); r1.setShapesVisible(true); XYStepAreaRenderer r2 = (XYStepAreaRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testFireChangeEvent1176() { XYStepAreaRenderer r = new XYStepAreaRenderer(); r.setShapesVisible(true); assertTrue(r.getShapesVisible()); r.setShapesVisible(false); assertFalse(r.getShapesVisible()); r.setShapesVisible(true); assertTrue(r.getShapesVisible()); r.setShapesVisible(true); assertTrue(r.getShapesVisible()); r.setShapesVisible(false); assertFalse(r.getShapesVisible()); }
public void testCloning1177() throws CloneNotSupportedException { XYStepAreaRenderer r1 = new XYStepAreaRenderer(); r1.setShapesFilled(true); XYStepAreaRenderer r2 = (XYStepAreaRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testGetPlotArea1179() { XYStepAreaRenderer r = new XYStepAreaRenderer(); assertFalse(r.getPlotArea()); r.setPlotArea(true); assertTrue(r.getPlotArea()); r.setPlotArea(false); assertFalse(r.getPlotArea()); }
public void testFireChangeEvent1181() { XYStepAreaRenderer r = new XYStepAreaRenderer(); r.setPlotArea(false); assertFalse(r.getPlotArea()); r.setPlotArea(true); assertTrue(r.getPlotArea()); r.setPlotArea(false); assertFalse(r.getPlotArea()); r.setPlotArea(true); assertTrue(r.getPlotArea()); r.setPlotArea(false); assertFalse(r.getPlotArea()); }
public void testCloning1183() throws CloneNotSupportedException { XYStepAreaRenderer r1 = new XYStepAreaRenderer(); r1.setRangeBase(0.5); XYStepAreaRenderer r2 = (XYStepAreaRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testEquals1208() { XYStepAreaRenderer r1 = new XYStepAreaRenderer(); XYStepAreaRenderer r2 = new XYStepAreaRenderer(); assertEquals(r1, r2); r1.setOutline(true); assertFalse(r1.equals(r2)); r2.setOutline(true); assertEquals(r1, r2); r1.setShapesVisible(true); assertFalse(r1.equals(r2)); r2.setShapesVisible(true); assertEquals(r1, r2); }
    

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
    

}
