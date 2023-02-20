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
 * StrokeListTests.java
 * --------------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 04-Dec-2007 : Version 1, based on PaintListTests (DG);
 *
 */

package org.jfree.chart.util.junit;

import java.awt.BasicStroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.StrokeList;

/**
 * Some tests for the {@link StrokeList} class.
 */
public class StrokeListTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StrokeListTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StrokeListTests(String name) {
        super(name);
    }

    /**
     * Tests the equals() method.
     */
public void testSerialization1401() { 
     StrokeList l1 = new StrokeList(); 
     l1.setStroke(0, new BasicStroke(1.1f)); 
     l1.setStroke(1, new BasicStroke(2.2f)); 
     StrokeList l2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(l1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         l2 = (StrokeList) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(l1, l2); 
 }
public void testHashcode1402() { 
     StrokeList l1 = new StrokeList(); 
     l1.setStroke(0, new BasicStroke(1.1f)); 
     l1.setStroke(1, new BasicStroke(2.2f)); 
     StrokeList l2 = new StrokeList(); 
     l2.setStroke(0, new BasicStroke(1.1f)); 
     assertTrue(l1.equals(l2)); 
     int h1 = l1.hashCode(); 
     int h2 = l2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testSerialization21403() { 
     StrokeList l1 = new StrokeList(); 
     l1.setStroke(0, new BasicStroke(1.1f)); 
     l1.setStroke(1, new BasicStroke(2.2f)); 
     StrokeList l2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(l1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         l2 = (StrokeList) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(l1, l2); 
 }
    

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
