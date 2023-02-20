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

public void testSizingWithWidthConstraint8() { 
     RectangleConstraint constraint = new RectangleConstraint(10.0, new Range(10.0, 10.0), LengthConstraintType.FIXED, 0.0, new Range(0.0, 0.0), LengthConstraintType.NONE); 
     BlockContainer container = new BlockContainer(new BorderArrangement()); 
     BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB); 
     Graphics2D g2 = image.createGraphics(); 
     container.add(new EmptyBlock(5.0, 6.0)); 
     Size2D size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(6.0, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(15.0, 16.0)); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(16.0, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.RIGHT); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(7.0, 20.0)); 
     container.add(new EmptyBlock(8.0, 45.6), RectangleEdge.RIGHT); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0)); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0)); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(5.4, 3.2), RectangleEdge.RIGHT); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0)); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3)); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3)); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM); 
     container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(9.0, 10.0)); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(14.0, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.TOP); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(45.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0)); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.TOP); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.TOP); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3)); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.RIGHT); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.TOP); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3)); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.LEFT); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(9.0, 10.0)); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(12.0, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(65.6, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3)); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(77.9, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(77.9, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM); 
     container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(9.0, 10.0)); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(16.0, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(21.0, 12.3), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(10.0, 20.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(12.3, 45.6), RectangleEdge.BOTTOM); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(77.9, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM); 
     container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(9.0, 10.0)); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(16.0, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM); 
     container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(14.0, size.height, EPSILON); 
     container.clear(); 
     container.add(new EmptyBlock(1.0, 2.0), RectangleEdge.TOP); 
     container.add(new EmptyBlock(3.0, 4.0), RectangleEdge.BOTTOM); 
     container.add(new EmptyBlock(5.0, 6.0), RectangleEdge.LEFT); 
     container.add(new EmptyBlock(7.0, 8.0), RectangleEdge.RIGHT); 
     container.add(new EmptyBlock(9.0, 10.0)); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(16.0, size.height, EPSILON); 
     container.clear(); 
     size = container.arrange(g2, constraint); 
     assertEquals(10.0, size.width, EPSILON); 
     assertEquals(0.0, size.height, EPSILON); 
 } 


public void testSerialization535() { 
     BorderArrangement b1 = new BorderArrangement(); 
     BorderArrangement b2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(b1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         b2 = (BorderArrangement) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         fail(e.toString()); 
     } 
     assertEquals(b1, b2); 
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

