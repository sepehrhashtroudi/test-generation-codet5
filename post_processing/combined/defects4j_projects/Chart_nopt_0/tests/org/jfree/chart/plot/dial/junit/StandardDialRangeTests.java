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
 * SimpleDialRangeTests.java
 * -------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 03-Nov-2006 : Version 1 (DG);
 *
 */

package org.jfree.chart.plot.dial.junit;

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

import org.jfree.chart.plot.dial.StandardDialRange;

/**
 * Tests for the {@link StandardDialRange} class.
 */
public class StandardDialRangeTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StandardDialRangeTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StandardDialRangeTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testStandardDialRange5642() { StandardDialRange r1 = new StandardDialRange(); assertEquals(0.0, r1.getLowerBound(), 0.001); assertEquals(100.0, r1.getUpperBound(), 0.001); assertEquals(Color.white, r1.getPaint()); StandardDialRange r2 = new StandardDialRange(); assertEquals(0.0, r2.getLowerBound(), 0.001); assertEquals(100.0, r2.getUpperBound(), 0.001); assertEquals(Color.white, r2.getPaint()); }
public void testStandardDialRange5643() { StandardDialRange r1 = new StandardDialRange(); assertEquals(0.0, r1.getLowerBound(), 0.001); assertEquals(100.0, r1.getUpperBound(), 0.001); assertEquals(Color.WHITE, r1.getPaint()); StandardDialRange r2 = new StandardDialRange(); assertEquals(0.0, r2.getLowerBound(), 0.001); assertEquals(100.0, r2.getUpperBound(), 0.001); assertEquals(Color.WHITE, r2.getPaint()); }
public void testHashCode5656() { StandardDialRange l1 = new StandardDialRange(); StandardDialRange l2 = new StandardDialRange(); assertEquals(l1, l2); int h1 = l1.hashCode(); int h2 = l2.hashCode(); assertEquals(h1, h2); }
public void testHashCode5657() { StandardDialRange r1 = new StandardDialRange(); StandardDialRange r2 = new StandardDialRange(); assertEquals(r1, r2); int h1 = r1.hashCode(); int h2 = r2.hashCode(); assertEquals(h1, h2); }
    

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
