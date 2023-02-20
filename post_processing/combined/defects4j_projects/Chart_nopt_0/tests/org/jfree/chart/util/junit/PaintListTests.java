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
 * PaintListTests.java
 * -------------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 04-Dec-2007 : Version 1, copied over from JCommon (DG);
 *
 */

package org.jfree.chart.util.junit;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.PaintList;

/**
 * Some tests for the {@link PaintList} class.
 */
public class PaintListTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(PaintListTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public PaintListTests(String name) {
        super(name);
    }

    /**
     * Tests the equals() method.
     */
public void testPaintList6133() { PaintList line1 = new PaintList(); PaintList line2 = new PaintList(); line1.setPaint(0, Color.RED); line2.setPaint(0, Color.GREEN); line1.setPaint(1, Color.BLUE); line2.setPaint(1, Color.BLUE); assertEquals(Color.RED, line1.getPaint(0)); assertEquals(Color.GREEN, line1.getPaint(1)); assertEquals(Color.BLUE, line2.getPaint(2)); }
public void testPaintList6134() { PaintList pl = new PaintList(); pl.setPaint(0, Color.RED); assertEquals(Color.RED, pl.getPaint(0)); pl.setPaint(1, Color.BLUE); assertEquals(Color.BLUE, pl.getPaint(1)); pl.setPaint(2, Color.RED); assertEquals(Color.RED, pl.getPaint(2)); pl.setPaint(3, Color.BLUE); assertEquals(Color.BLUE, pl.getPaint(3)); pl.setPaint(4, Color.RED); assertEquals(Color.RED, pl.getPaint(4)); }
public void testHashCode6143() { PaintList l1 = new PaintList(); PaintList l2 = new PaintList(); assertEquals(l1.hashCode(), l2.hashCode()); }
public void testReadLine6157() { PaintList line = new PaintList(); line.setPaint(0, Color.RED); assertEquals(Color.RED, line.getPaint(0)); line.setPaint(1, Color.BLUE); assertEquals(Color.BLUE, line.getPaint(1)); line.setPaint(2, Color.RED); assertEquals(Color.RED, line.getPaint(2)); line.setPaint(3, Color.BLUE); assertEquals(Color.BLUE, line.getPaint(3)); line.setPaint(4, Color.BLUE); assertEquals(Color.BLUE, line.getPaint(4));
}

    

    /**
     * Tests the equals method.
     */
    

    /**
     * Tests the equals() method when the list contains a GradientPaint
     * instance.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the testHashCode() method.
     */
    

}
