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
 * ------------------------
 * CompositeTitleTests.java
 * ------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 04-Feb-2005 : Version 1 (DG);
 * 19-Jun-2007 : Fixed deprecation warnings (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 09-Jul-2008 : Added new field into testEquals() (DG);
 *
 */

package org.jfree.chart.title.junit;

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

import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.title.CompositeTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.util.RectangleInsets;

/**
 * Tests for the {@link CompositeTitle} class.
 */
public class CompositeTitleTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CompositeTitleTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CompositeTitleTests(String name) {
        super(name);
    }

    /**
     * Some checks for the constructor.
     */
public void testCompositeTitle604() { BlockContainer c1 = new BlockContainer(); CompositeTitle t1 = new CompositeTitle(c1); assertEquals(c1, t1.getContainer()); }
public void testCloning607() throws CloneNotSupportedException { CompositeTitle t1 = new CompositeTitle(); t1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); CompositeTitle t2 = (CompositeTitle) t1.clone(); assertNotSame(t1, t2); assertSame(t1.getBackgroundPaint(), t2.getBackgroundPaint()); }
public void testEquals611() { CompositeTitle t1 = new CompositeTitle(); CompositeTitle t2 = new CompositeTitle(); assertEquals(t1, t2); assertEquals(t2, t1); t1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertFalse(t1.equals(t2)); t2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(t1, t2); }
    

    /**
     * Check that the equals() method distinguishes all fields.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
