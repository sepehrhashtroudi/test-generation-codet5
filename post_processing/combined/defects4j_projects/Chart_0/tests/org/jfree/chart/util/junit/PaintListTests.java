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
public void testCloning1167() { 
     PaintList l1 = new PaintList(); 
     l1.setPaint(0, Color.red); 
     l1.setPaint(1, Color.blue); 
     l1.setPaint(2, null); 
     PaintList l2 = null; 
     try { 
         l2 = (PaintList) l1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(l1 != l2); 
     assertTrue(l1.getClass() == l2.getClass()); 
     assertTrue(l1.equals(l2)); 
     l2.setPaint(0, Color.red); 
     assertFalse(l1.equals(l2)); 
 }
public void testSerialization1168() { 
     PaintList l1 = new PaintList(); 
     l1.setPaint(0, Color.red); 
     l1.setPaint(1, Color.blue); 
     l1.setPaint(2, null); 
     PaintList l2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(l1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         l2 = (PaintList) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(l1, l2); 
 }
public void testEquals1169() { 
     PaintList l1 = new PaintList(); 
     PaintList l2 = new PaintList(); 
     assertTrue(l1.equals(l2)); 
     assertTrue(l2.equals(l1)); 
     l1.setPaint(0, Color.red); 
     assertFalse(l1.equals(l2)); 
     l2.setPaint(0, Color.red); 
     assertTrue(l1.equals(l2)); 
 }
public void testEquals1170() { 
     PaintList l1 = new PaintList(); 
     PaintList l2 = new PaintList(); 
     assertTrue(l1.equals(l2)); 
     assertTrue(l2.equals(l1)); 
     l1.setPaint(0, Color.red); 
     assertFalse(l1.equals(l2)); 
     l2.setPaint(0, Color.red); 
     assertTrue(l1.equals(l2)); 
     l1.setPaint(1, Color.blue); 
     assertFalse(l1.equals(l2)); 
     l2.setPaint(1, Color.blue); 
     assertTrue(l1.equals(l2)); 
     l1.setPaint(2, null); 
     assertFalse(l1.equals(l2)); 
     l2.setPaint(2, null); 
     assertTrue(l1.equals(l2)); 
 }
public void testHashCode1171() { 
     PaintList l1 = new PaintList(); 
     PaintList l2 = new PaintList(); 
     assertTrue(l1.hashCode() == l2.hashCode()); 
     l1.setPaint(0, Color.red); 
     assertFalse(l1.hashCode() == l2.hashCode()); 
     l2.setPaint(0, Color.red); 
     assertTrue(l1.hashCode() == l2.hashCode()); 
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
