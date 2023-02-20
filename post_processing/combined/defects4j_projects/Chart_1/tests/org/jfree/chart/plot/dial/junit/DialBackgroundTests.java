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
 * ------------------------
 * DialBackgroundTests.java
 * ------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 03-Nov-2006 : Version 1 (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.plot.dial.junit;

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

import org.jfree.chart.plot.dial.DialBackground;
import org.jfree.chart.util.GradientPaintTransformType;
import org.jfree.chart.util.StandardGradientPaintTransformer;

/**
 * Tests for the {@link DialBackground} class.
 */
public class DialBackgroundTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DialBackgroundTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DialBackgroundTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testSerialization711() { 
     DialBackground b1 = new DialBackground(); 
     DialBackground b2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(b1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         b2 = (DialBackground) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(b1, b2); 
 }
public void testCloning712() { 
     DialBackground b1 = new DialBackground(); 
     DialBackground b2 = null; 
     try { 
         b2 = (DialBackground) b1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(b1 != b2); 
     assertTrue(b1.getClass() == b2.getClass()); 
     assertTrue(b1.equals(b2)); 
     b2.setPaint(Color.red); 
     assertFalse(b1.equals(b2)); 
 }
public void testHashCode714() { 
     DialBackground b1 = new DialBackground(Color.red); 
     DialBackground b2 = new DialBackground(Color.red); 
     assertTrue(b1.equals(b2)); 
     int h1 = b1.hashCode(); 
     int h2 = b2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testCloning715() { 
     DialBackground b1 = new DialBackground(); 
     DialBackground b2 = null; 
     try { 
         b2 = (DialBackground) b1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(b1 != b2); 
     assertTrue(b1.getClass() == b2.getClass()); 
     assertTrue(b1.equals(b2)); 
     b1.setPaint(Color.red); 
     assertFalse(b1.equals(b2)); 
     b2.setPaint(Color.red); 
     assertTrue(b1.equals(b2)); 
     b1.setGradientPaintTransformer(new StandardGradientPaintTransformer(GradientPaintTransformType.HORIZONTAL)); 
     assertFalse(b1.equals(b2)); 
     b2.setGradientPaintTransformer(new StandardGradientPaintTransformer(GradientPaintTransformType.HORIZONTAL)); 
     assertTrue(b1.equals(b2)); 
 }
public void testSerialization716() { 
     DialBackground b1 = new DialBackground(Color.red); 
     DialBackground b2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(b1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         b2 = (DialBackground) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(b1, b2); 
 }
public void testHashCode1192() { 
     GradientPaintTransformType t1 = GradientPaintTransformType.HORIZONTAL; 
     GradientPaintTransformType t2 = GradientPaintTransformType.HORIZONTAL; 
     assertTrue(t1.equals(t2)); 
     int h1 = t1.hashCode(); 
     int h2 = t2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testHashCode1504() { 
     StandardGradientPaintTransformer t1 = new StandardGradientPaintTransformer(GradientPaintTransformType.HORIZONTAL); 
     StandardGradientPaintTransformer t2 = new StandardGradientPaintTransformer(GradientPaintTransformType.HORIZONTAL); 
     assertTrue(t1.equals(t2)); 
     int h1 = t1.hashCode(); 
     int h2 = t2.hashCode(); 
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
