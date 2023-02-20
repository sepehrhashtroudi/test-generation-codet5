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
 * -----------------------------
 * XYPolygonAnnotationTests.java
 * -----------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 10-Jul-2006 : Version 1 (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.chart.annotations.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Stroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.annotations.XYPolygonAnnotation;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link XYPolygonAnnotation} class.
 */
public class XYPolygonAnnotationTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYPolygonAnnotationTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYPolygonAnnotationTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testHashCode1084() { 
     Stroke stroke = new BasicStroke(2.0f); 
     XYPolygonAnnotation a1 = new XYPolygonAnnotation(new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, stroke, Color.red, Color.blue); 
     XYPolygonAnnotation a2 = new XYPolygonAnnotation(new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, stroke, Color.red, Color.blue); 
     assertTrue(a1.equals(a2)); 
     int h1 = a1.hashCode(); 
     int h2 = a2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testHashCode1085() { 
     XYPolygonAnnotation a1 = new XYPolygonAnnotation(new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, new BasicStroke(1.2f), Color.red, Color.blue); 
     XYPolygonAnnotation a2 = new XYPolygonAnnotation(new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, new BasicStroke(1.2f), Color.red, Color.blue); 
     assertTrue(a1.equals(a2)); 
     int h1 = a1.hashCode(); 
     int h2 = a2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testEquals1086() { 
     XYPolygonAnnotation a1 = new XYPolygonAnnotation(new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, new BasicStroke(1.2f), Color.red, Color.blue); 
     XYPolygonAnnotation a2 = new XYPolygonAnnotation(new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, new BasicStroke(1.2f), Color.red, Color.blue); 
     assertTrue(a1.equals(a2)); 
     assertTrue(a2.equals(a1)); 
     a1 = new XYPolygonAnnotation(new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, new BasicStroke(1.2f), Color.red, Color.blue); 
     assertFalse(a1.equals(a2)); 
     a2 = new XYPolygonAnnotation(new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, new BasicStroke(1.2f), Color.red, Color.blue); 
     assertTrue(a1.equals(a2)); 
     a1 = new XYPolygonAnnotation(new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, new BasicStroke(2.3f), Color.red, Color.blue); 
     assertFalse(a1.equals(a2)); 
     a2 = new XYPolygonAnnotation(new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.3f }, new BasicStroke(2.3f), Color.red, Color.blue); 
     assertTrue(a1.equals(a2)); 
 }
public void testHashCode1087() { 
     XYPolygonAnnotation a1 = new XYPolygonAnnotation(new double[] { 1.2, 2.3, 3.4, 4.5 }); 
     XYPolygonAnnotation a2 = new XYPolygonAnnotation(new double[] { 1.2, 2.3, 3.4, 4.5 }); 
     assertTrue(a1.equals(a2)); 
     int h1 = a1.hashCode(); 
     int h2 = a2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testSerialization1088() { 
     Stroke stroke = new BasicStroke(2.0f); 
     XYPolygonAnnotation a1 = new XYPolygonAnnotation(new double[] { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 }, stroke, Color.red, Color.blue); 
     XYPolygonAnnotation a2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(a1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         a2 = (XYPolygonAnnotation) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(a1, a2); 
 }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Checks that this class implements PublicCloneable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
