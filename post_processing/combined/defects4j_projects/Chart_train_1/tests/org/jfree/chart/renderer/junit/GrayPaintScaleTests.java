/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2009, by Object Refinery Limited and Contributors.
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
 * GrayPaintScaleTests.java
 * ------------------------
 * (C) Copyright 2006-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 05-Jul-2006 : Version 1 (DG);
 * 26-Sep-2007 : Added testConstructor() and testGetPaint() (DG);
 * 29-Jan-2009 : Extended testEquals() for new alpha field (DG);
 *
 */

package org.jfree.chart.renderer.junit;

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

import org.jfree.chart.renderer.GrayPaintScale;


/**
 * Tests for the {@link GrayPaintScale} class.
 */
public class GrayPaintScaleTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(GrayPaintScaleTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public GrayPaintScaleTests(String name) {
        super(name);
    }

    private static final double EPSILON = 0.000000001;

    /**
     * Simple check for the default constructor.
     */

public void testSerialization305() { 
     GrayPaintScale g1 = new GrayPaintScale(); 
     GrayPaintScale g2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(g1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         g2 = (GrayPaintScale) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(g1, g2); 
 } 


public void testEquals307() { 
     GrayPaintScale g1 = new GrayPaintScale(); 
     GrayPaintScale g2 = new GrayPaintScale(); 
     assertTrue(g1.equals(g2)); 
     assertTrue(g2.equals(g1)); 
     g1 = new GrayPaintScale(0.0, 1.0); 
     g2 = new GrayPaintScale(0.0, 1.0); 
     assertTrue(g1.equals(g2)); 
     g1 = new GrayPaintScale(0.1, 1.0); 
     assertFalse(g1.equals(g2)); 
     g2 = new GrayPaintScale(0.1, 1.0); 
     assertTrue(g1.equals(g2)); 
     g1 = new GrayPaintScale(0.1, 0.9); 
     assertFalse(g1.equals(g2)); 
     g2 = new GrayPaintScale(0.1, 0.9); 
     assertTrue(g1.equals(g2)); 
     g1 = new GrayPaintScale(0.1, 0.9, 128); 
     assertFalse(g1.equals(g2)); 
     g2 = new GrayPaintScale(0.1, 0.9, 128); 
     assertTrue(g1.equals(g2)); 
 } 


public void testCloning308() { 
     GrayPaintScale g1 = new GrayPaintScale(); 
     GrayPaintScale g2 = null; 
     try { 
         g2 = (GrayPaintScale) g1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(g1 != g2); 
     assertTrue(g1.getClass() == g2.getClass()); 
     assertTrue(g1.equals(g2)); 
 } 

    

    /**
     * Some checks for the getPaint() method.
     */
    

    /**
     * A test for the equals() method.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
