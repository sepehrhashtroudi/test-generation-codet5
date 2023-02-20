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
 * --------------------------
 * LookupPaintScaleTests.java
 * --------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 05-Jul-2006 : Version 1 (DG);
 * 31-Jan-2007 : Additional serialization tests (DG);
 * 07-Mar-2007 : Added new tests (DG);
 * 09-Mar-2007 : Check independence in testCloning() (DG);
 * 20-Jun-2007 : Updated for deprecated code removal (DG);
 *
 */

package org.jfree.chart.renderer.junit;

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

import org.jfree.chart.renderer.LookupPaintScale;

/**
 * Tests for the {@link LookupPaintScale} class.
 */
public class LookupPaintScaleTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(LookupPaintScaleTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public LookupPaintScaleTests(String name) {
        super(name);
    }

    /**
     * A test for the equals() method.
     */
public void testEquals1() { 
     LookupPaintScale g1 = new LookupPaintScale(); 
     LookupPaintScale g2 = new LookupPaintScale(); 
     assertTrue(g1.equals(g2)); 
     assertTrue(g2.equals(g1)); 
     g1 = new LookupPaintScale(1.0, 2.0, Color.red); 
     assertFalse(g1.equals(g2)); 
     g2 = new LookupPaintScale(1.0, 2.0, Color.red); 
     assertTrue(g1.equals(g2)); 
     g1.add(1.5, new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(g1.equals(g2)); 
     g2.add(1.5, new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(g1.equals(g2)); 
 }
public void testSerialization2() { 
     LookupPaintScale g1 = new LookupPaintScale(1.0, 2.0, Color.red); 
     LookupPaintScale g2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(g1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         g2 = (LookupPaintScale) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         System.out.println(e.toString()); 
     } 
     assertEquals(g1, g2); 
 }
public void testCloning3() { 
     LookupPaintScale g1 = new LookupPaintScale(1.0, 2.0, Color.red); 
     LookupPaintScale g2 = null; 
     try { 
         g2 = (LookupPaintScale) g1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(g1 != g2); 
     assertTrue(g1.getClass() == g2.getClass()); 
     assertTrue(g1.equals(g2)); 
     g1.add(1.5, new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(g1.equals(g2)); 
     g2.add(1.5, new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(g1.equals(g2)); 
 }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the default constructor.
     */
    

    /**
     * Some checks for the other constructor.
     */
    

    /**
     * Some general checks for the lookup table.
     */
    

}
