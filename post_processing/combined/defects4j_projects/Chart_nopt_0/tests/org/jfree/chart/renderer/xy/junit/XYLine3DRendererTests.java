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
 * --------------------------
 * XYLine3DRendererTests.java
 * --------------------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 30-Apr-2007 : Version 1 (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

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

import org.jfree.chart.renderer.xy.XYLine3DRenderer;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link XYLine3DRenderer} class.
 */
public class XYLine3DRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYLine3DRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYLine3DRendererTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */
public void testCloning2298() throws CloneNotSupportedException { XYLine3DRenderer r1 = new XYLine3DRenderer(); r1.setWallPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); XYLine3DRenderer r2 = (XYLine3DRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getWallPaint(), r2.getWallPaint()); }
public void testCloning2299() throws CloneNotSupportedException { XYLine3DRenderer r1 = new XYLine3DRenderer(); r1.setWallPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); XYLine3DRenderer r2 = (XYLine3DRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
    

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
    

}
