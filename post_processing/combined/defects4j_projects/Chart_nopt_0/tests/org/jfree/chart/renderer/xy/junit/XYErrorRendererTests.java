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
 * XYErrorRendererTests.java
 * -------------------------
 * (C) Copyright 2006-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Oct-2006 : Version 1 (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 * 28-Jan-2009 : Updated tests for new errorStroke field (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.renderer.xy.XYErrorRenderer;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link XYErrorRenderer} class.
 */
public class XYErrorRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYErrorRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYErrorRendererTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */
public void testFireChangeEvent1828() { XYErrorRenderer r = new XYErrorRenderer(); assertFalse(r.getDrawYError()); r.setDrawYError(true); assertTrue(r.getDrawYError()); r.setDrawYError(false); assertFalse(r.getDrawYError()); }
public void testCloning21831() throws CloneNotSupportedException { XYErrorRenderer r1 = new XYErrorRenderer(); r1.setErrorPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); XYErrorRenderer r2 = (XYErrorRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testFireChangeEvent1832() { XYErrorRenderer r1 = new XYErrorRenderer(); r1.setErrorPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); XYErrorRenderer r2 = new XYErrorRenderer(); r2.setErrorPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(r1, r2); }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * A test for cloning.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
