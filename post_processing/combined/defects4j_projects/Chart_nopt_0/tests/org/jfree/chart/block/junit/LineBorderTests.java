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
 * --------------------
 * LineBorderTests.java
 * --------------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 16-Mar-2007 : Version 1 (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.block.junit;

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

import org.jfree.chart.block.LineBorder;
import org.jfree.chart.util.RectangleInsets;

/**
 * Tests for the {@link LineBorder} class.
 */
public class LineBorderTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(LineBorderTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public LineBorderTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals() method can distinguish all the required fields.
     */
public void testLineBorder7401() { LineBorder lb = new LineBorder(Color.BLUE, new BasicStroke(1.0f), new RectangleInsets(1.0, 1.0, 1.0, 1.0)); assertEquals(Color.BLUE, lb.getPaint()); assertEquals(new BasicStroke(1.0f), lb.getStroke()); assertEquals(new RectangleInsets(1.0, 1.0, 1.0, 1.0), lb.getInsets()); }
public void testLineBorder7402() { LineBorder br = new LineBorder(Color.BLUE, new BasicStroke(1.0f), new RectangleInsets(1.0, 1.0, 1.0, 1.0)); assertEquals(Color.BLUE, br.getPaint()); assertEquals(new BasicStroke(1.0f), br.getStroke()); assertEquals(new RectangleInsets(1.0, 1.0, 1.0, 1.0), br.getInsets()); }
public void testLineBorder7403() { LineBorder lb1 = new LineBorder(Color.RED, new BasicStroke(1.5f), new RectangleInsets(1, 1, 1, 1)); assertEquals(Color.RED, lb1.getPaint()); assertEquals(new BasicStroke(1.5f), lb1.getStroke()); assertEquals(new RectangleInsets(1, 1, 1, 1), lb1.getInsets()); LineBorder lb2 = new LineBorder(Color.BLUE, new BasicStroke(1.5f), new RectangleInsets(1, 1, 1, 1)); assertEquals(Color.BLUE, lb2.getPaint());
}

    

    /**
     * Immutable - cloning not necessary.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
