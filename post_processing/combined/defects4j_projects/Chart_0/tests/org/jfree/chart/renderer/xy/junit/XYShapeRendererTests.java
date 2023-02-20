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
 * XYShapeRendererTests.java
 * -------------------------
 * (C) Copyright 2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 17-Sep-2008 : Version 1 (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

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

import org.jfree.chart.renderer.LookupPaintScale;
import org.jfree.chart.renderer.xy.XYShapeRenderer;

/**
 * Tests for the {@link XYShapeRenderer} class.
 */
public class XYShapeRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYShapeRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYShapeRendererTests(String name) {
        super(name);
    }

    /**
     * Some checks for the equals() method.
     */
public void testHashcode882() { 
     XYShapeRenderer r1 = new XYShapeRenderer(); 
     XYShapeRenderer r2 = new XYShapeRenderer(); 
     assertTrue(r1.equals(r2)); 
     int h1 = r1.hashCode(); 
     int h2 = r2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testCloning888() { 
     XYShapeRenderer r1 = new XYShapeRenderer(); 
     LookupPaintScale ps1 = new LookupPaintScale(); 
     r1.setPaintScale(ps1); 
     XYShapeRenderer r2 = null; 
     try { 
         r2 = (XYShapeRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
     ps1.add(0.5, Color.red); 
     assertFalse(r1.equals(r2)); 
     LookupPaintScale ps2 = (LookupPaintScale) r2.getPaintScale(); 
     ps2.add(0.5, Color.red); 
     assertTrue(r1.equals(r2)); 
 }
public void testCloning890() { 
     XYShapeRenderer r1 = new XYShapeRenderer(); 
     LookupPaintScale scale1 = new LookupPaintScale(); 
     r1.setPaintScale(scale1); 
     XYShapeRenderer r2 = null; 
     try { 
         r2 = (XYShapeRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
     scale1.add(0.5, Color.red); 
     assertFalse(r1.equals(r2)); 
     LookupPaintScale scale2 = (LookupPaintScale) r2.getPaintScale(); 
     scale2.add(0.5, Color.red); 
     assertTrue(r1.equals(r2)); 
 }
public void testSerialization892() { 
     XYShapeRenderer r1 = new XYShapeRenderer(); 
     XYShapeRenderer r2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(r1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         r2 = (XYShapeRenderer) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(r1, r2); 
 }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
