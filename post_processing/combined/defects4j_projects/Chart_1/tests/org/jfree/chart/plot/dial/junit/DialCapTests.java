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
 * -----------------
 * DialCapTests.java
 * -----------------
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

import org.jfree.chart.plot.dial.DialCap;

/**
 * Tests for the {@link DialCap} class.
 */
public class DialCapTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DialCapTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DialCapTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testEquals926() { 
     DialCap c1 = new DialCap(); 
     DialCap c2 = new DialCap(); 
     assertTrue(c1.equals(c2)); 
     c1.setFillPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(c1.equals(c2)); 
     c2.setFillPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(c1.equals(c2)); 
     c1.setOutlinePaint(new GradientPaint(5.0f, 6.0f, Color.red, 7.0f, 8.0f, Color.blue)); 
     assertFalse(c1.equals(c2)); 
     c2.setOutlinePaint(new GradientPaint(5.0f, 6.0f, Color.red, 7.0f, 8.0f, Color.blue)); 
     assertTrue(c1.equals(c2)); 
     c1.setOutlineStroke(new BasicStroke(1.1f)); 
     assertFalse(c1.equals(c2)); 
     c2.setOutlineStroke(new BasicStroke(1.1f)); 
     assertTrue(c1.equals(c2)); 
     c1.setVisible(false); 
     assertFalse(c1.equals(c2)); 
     c2.setVisible(false); 
     assertTrue(c1.equals(c2)); 
 }
public void testHashCode930() { 
     DialCap c1 = new DialCap(); 
     DialCap c2 = new DialCap(); 
     assertTrue(c1.equals(c2)); 
     int h1 = c1.hashCode(); 
     int h2 = c2.hashCode(); 
     assertEquals(h1, h2); 
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
