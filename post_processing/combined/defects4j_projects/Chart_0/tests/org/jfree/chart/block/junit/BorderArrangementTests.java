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
 * ---------------------------
 * BorderArrangementTests.java
 * ---------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 22-Oct-2004 : Version 1 (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.block.junit;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.block.Block;
import org.jfree.chart.block.BlockContainer;
import org.jfree.chart.block.BorderArrangement;
import org.jfree.chart.block.EmptyBlock;
import org.jfree.chart.block.LengthConstraintType;
import org.jfree.chart.block.RectangleConstraint;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.Size2D;
import org.jfree.data.Range;

/**
 * Tests for the {@link BorderArrangement} class.
 */
public class BorderArrangementTests extends TestCase {

    private static final double EPSILON = 0.0000000001;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(BorderArrangementTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public BorderArrangementTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals() method can distinguish all the required fields.
     */
public void testEquals1026() { 
     BorderArrangement b1 = new BorderArrangement(); 
     BorderArrangement b2 = new BorderArrangement(); 
     assertTrue(b1.equals(b2)); 
     assertTrue(b2.equals(b2)); 
     b1.add(new EmptyBlock(99.0, 99.0), null); 
     assertFalse(b1.equals(b2)); 
     b2.add(new EmptyBlock(99.0, 99.0), null); 
     assertTrue(b1.equals(b2)); 
     b1.add(new EmptyBlock(1.0, 1.0), RectangleEdge.LEFT); 
     assertFalse(b1.equals(b2)); 
     b2.add(new EmptyBlock(1.0, 1.0), RectangleEdge.LEFT); 
     assertTrue(b1.equals(b2)); 
     b1.add(new EmptyBlock(2.0, 2.0), RectangleEdge.RIGHT); 
     assertFalse(b1.equals(b2)); 
     b2.add(new EmptyBlock(2.0, 2.0), RectangleEdge.RIGHT); 
     assertTrue(b1.equals(b2)); 
     b1.add(new EmptyBlock(3.0, 3.0), RectangleEdge.TOP); 
     assertFalse(b1.equals(b2)); 
     b2.add(new EmptyBlock(3.0, 3.0), RectangleEdge.TOP); 
     assertTrue(b1.equals(b2)); 
     b1.add(new EmptyBlock(4.0, 4.0), RectangleEdge.BOTTOM); 
     assertFalse(b1.equals(b2)); 
     b2.add(new EmptyBlock(4.0, 4.0), RectangleEdge.BOTTOM); 
     assertTrue(b1.equals(b2)); 
 }
    

    /**
     * Immutable - cloning is not necessary.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Run some checks on sizing.
     */
    

    /**
     * Run some checks on sizing when there is a fixed width constraint.
     */
    

    /**
     * This test is for a particular bug that arose just prior to the release
     * of JFreeChart 1.0.10.  A BorderArrangement with LEFT, CENTRE and RIGHT
     * blocks that is too wide, by default, for the available space, wasn't
     * shrinking the centre block as expected.
     */
    
}

