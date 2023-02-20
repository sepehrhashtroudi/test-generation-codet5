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
 * -------------------------
 * XYShapeRendererTests.java
 * -------------------------
 * (C) Copyright 2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 17-Sep-2008 : Version 1 (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

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

import org.jfree.chart.renderer.LookupPaintScale;
import org.jfree.chart.renderer.xy.XYShapeRenderer;

/**
 * Tests for the {@link XYShapeRenderer} class.
 */
public class XYShapeRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYShapeRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYShapeRendererTests(String name) {
        super(name);
    }

    /**
     * Some checks for the equals() method.
     */
public void testXYShapeRenderer4701() { XYShapeRenderer renderer = new XYShapeRenderer(); assertEquals(Color.darkGray, renderer.getPaintScale()); assertEquals(Color.darkGray, renderer.getGuideLinePaint()); assertEquals(Color.darkGray, renderer.getGuideLineStroke()); }
public void testCloning4705() throws CloneNotSupportedException { XYShapeRenderer r1 = new XYShapeRenderer(); r1.setPaintScale(null); XYShapeRenderer r2 = (XYShapeRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testCloning4707() throws CloneNotSupportedException { XYShapeRenderer r1 = new XYShapeRenderer(); r1.setDrawOutlines(true); XYShapeRenderer r2 = (XYShapeRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testFireChangeEvent4708() { XYShapeRenderer r = new XYShapeRenderer(); r.setDrawOutlines(false); assertFalse(r.getDrawOutlines()); r.setDrawOutlines(true); assertTrue(r.getDrawOutlines()); }
public void testFireChangeEvent4710() { XYShapeRenderer r = new XYShapeRenderer(); r.setUseFillPaint(false); assertFalse(r.getUseFillPaint()); r.setUseFillPaint(true); assertTrue(r.getUseFillPaint()); }
public void testCloning4711() throws CloneNotSupportedException { XYShapeRenderer r1 = new XYShapeRenderer(); r1.setUseOutlinePaint(true); XYShapeRenderer r2 = (XYShapeRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testFireChangeEvent4712() { XYShapeRenderer r = new XYShapeRenderer(); assertFalse(r.getUseOutlinePaint()); r.setUseOutlinePaint(true); assertTrue(r.getUseOutlinePaint()); r.setUseOutlinePaint(false); assertFalse(r.getUseOutlinePaint()); }
public void testFireChangeEvent4714() { XYShapeRenderer r = new XYShapeRenderer(); r.setGuideLinesVisible(true); assertTrue(r.isGuideLinesVisible()); r.setGuideLinesVisible(false); assertFalse(r.isGuideLinesVisible()); }
public void testCloning4718() throws CloneNotSupportedException { XYShapeRenderer r1 = new XYShapeRenderer(); XYShapeRenderer r2 = (XYShapeRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
