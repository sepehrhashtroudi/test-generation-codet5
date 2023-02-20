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
 * ---------------------
 * DialPointerTests.java
 * ---------------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 30-Apr-2007 : Version 1 (DG);
 * 23-Nov-2007 : Added testEqualsPointer() and testSerialization2() (DG);
 *
 */

package org.jfree.chart.plot.dial.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.plot.dial.DialPointer;

/**
 * Tests for the {@link DialPointer} class.
 */
public class DialPointerTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DialPointerTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DialPointerTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testHashCode213() { 
     DialPointer i1 = new DialPointer.Pin(1); 
     DialPointer i2 = new DialPointer.Pin(1); 
     assertTrue(i1.equals(i2)); 
     int h1 = i1.hashCode(); 
     int h2 = i2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testSerialization214() { 
     DialPointer i1 = new DialPointer.Pin(1); 
     DialPointer i2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(i1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         i2 = (DialPointer) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(i1, i2); 
 }
public void testEqualsPointer215() { 
     DialPointer.Pointer p1 = new DialPointer.Pointer(); 
     DialPointer.Pointer p2 = new DialPointer.Pointer(); 
     assertTrue(p1.equals(p2)); 
     assertTrue(p2.equals(p1)); 
     p1.setFillPaint(Color.red); 
     assertFalse(p1.equals(p2)); 
     p2.setFillPaint(Color.red); 
     assertTrue(p1.equals(p2)); 
     p1.setOutlinePaint(Color.blue); 
     assertFalse(p1.equals(p2)); 
     p2.setOutlinePaint(Color.blue); 
     assertTrue(p1.equals(p2)); 
     p1.setVisible(false); 
     assertFalse(p1.equals(p2)); 
     p2.setVisible(false); 
     assertTrue(p1.equals(p2)); 
 }
    

    /**
     * Check the equals() method for the DialPointer.Pin class.
     */
    

    /**
     * Check the equals() method for the DialPointer.Pointer class.
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
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    
}
