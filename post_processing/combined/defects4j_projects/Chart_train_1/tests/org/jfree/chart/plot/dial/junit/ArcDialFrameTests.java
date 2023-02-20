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
 * ArcDialFrameTests.java
 * ---------------------------
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

import org.jfree.chart.plot.dial.ArcDialFrame;

/**
 * Tests for the {@link ArcDialFrame} class.
 */
public class ArcDialFrameTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(ArcDialFrameTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public ArcDialFrameTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testEquals722() { 
     ArcDialFrame f1 = new ArcDialFrame(); 
     ArcDialFrame f2 = new ArcDialFrame(); 
     assertTrue(f1.equals(f2)); 
     f1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertFalse(f1.equals(f2)); 
     f2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertTrue(f1.equals(f2)); 
     f1.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertFalse(f1.equals(f2)); 
     f2.setForegroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     assertTrue(f1.equals(f2)); 
     f1.setStroke(new BasicStroke(1.1f)); 
     assertFalse(f1.equals(f2)); 
     f2.setStroke(new BasicStroke(1.1f)); 
     assertTrue(f1.equals(f2)); 
     f1.setInnerRadius(0.11); 
     assertFalse(f1.equals(f2)); 
     f2.setInnerRadius(0.11); 
     assertTrue(f1.equals(f2)); 
     f1.setOuterRadius(0.88); 
     assertFalse(f1.equals(f2)); 
     f2.setOuterRadius(0.88); 
     assertTrue(f1.equals(f2)); 
     f1.setStartAngle(99); 
     assertFalse(f1.equals(f2)); 
     f2.setStartAngle(99); 
     assertTrue(f1.equals(f2)); 
     f1.setExtent(33); 
     assertFalse(f1.equals(f2)); 
     f2.setExtent(33); 
     assertTrue(f1.equals(f2)); 
     f1.setVisible(false); 
     assertFalse(f1.equals(f2)); 
     f2.setVisible(false); 
     assertTrue(f1.equals(f2)); 
 } 


public void testSerialization723() { 
     ArcDialFrame f1 = new ArcDialFrame(); 
     ArcDialFrame f2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(f1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         f2 = (ArcDialFrame) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(f1, f2); 
 } 

    

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
