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
 * SerialUtilitiesTests.java
 * -------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 02-Jun-2008 : Copied from JCommon (DG);
 *
 */

package org.jfree.chart.util.junit;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.awt.TexturePaint;
import java.awt.font.TextAttribute;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.AttributedString;

import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.AttributedStringUtilities;
import org.jfree.chart.util.SerialUtilities;
import org.jfree.chart.util.ShapeUtilities;

/**
 * Tests for the {@link SerialUtilities} class.
 */
public class SerialUtilitiesTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(SerialUtilitiesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public SerialUtilitiesTests(final String name) {
        super(name);
    }

    /**
     * Tests the isSerializable(Class) method for some common cases.
     */

public void testGradientPaintSerialization680() { 
     Paint p1 = new GradientPaint(0.0f, 0.0f, Color.blue, 100.0f, 200.0f, Color.red); 
     Paint p2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutputStream out = new ObjectOutputStream(buffer); 
         SerialUtilities.writePaint(p1, out); 
         out.close(); 
         ByteArrayInputStream bias = new ByteArrayInputStream(buffer.toByteArray()); 
         ObjectInputStream in = new ObjectInputStream(bias); 
         p2 = SerialUtilities.readPaint(in); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     GradientPaint gp1 = (GradientPaint) p1; 
     GradientPaint gp2 = (GradientPaint) p2; 
     assertEquals(gp1.getColor1(), gp2.getColor1()); 
     assertEquals(gp1.getPoint1(), gp2.getPoint1()); 
     assertEquals(gp1.getColor2(), gp2.getColor2()); 
     assertEquals(gp1.getPoint2(), gp2.getPoint2()); 
     assertEquals(gp1.isCyclic(), gp2.isCyclic()); 
 } 


public void testArc2DFloatSerialization681() { 
     Arc2D a1 = new Arc2D.Float(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, Arc2D.PIE); 
     Arc2D a2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutputStream out = new ObjectOutputStream(buffer); 
         SerialUtilities.writeShape(a1, out); 
         out.close(); 
         ByteArrayInputStream bais = new ByteArrayInputStream(buffer.toByteArray()); 
         ObjectInputStream in = new ObjectInputStream(bais); 
         a2 = (Arc2D) SerialUtilities.readShape(in); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertTrue(ShapeUtilities.equal(a1, a2)); 
 } 


public void testLine2DFloatSerialization682() { 
     Line2D l1 = new Line2D.Float(1.0f, 2.0f, 3.0f, 4.0f); 
     Line2D l2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutputStream out = new ObjectOutputStream(buffer); 
         SerialUtilities.writeShape(l1, out); 
         out.close(); 
         ByteArrayInputStream bais = new ByteArrayInputStream(buffer.toByteArray()); 
         ObjectInputStream in = new ObjectInputStream(bais); 
         l2 = (Line2D) SerialUtilities.readShape(in); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertTrue(ShapeUtilities.equal(l1, l2)); 
 } 


public void testAttributedStringSerialization3683() { 
     AttributedString s1 = new AttributedString("ABC"); 
     s1.addAttribute(TextAttribute.LANGUAGE, "English"); 
     AttributedString s2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutputStream out = new ObjectOutputStream(buffer); 
         SerialUtilities.writeAttributedString(s1, out); 
         out.close(); 
         ByteArrayInputStream bais = new ByteArrayInputStream(buffer.toByteArray()); 
         ObjectInputStream in = new ObjectInputStream(bais); 
         s2 = SerialUtilities.readAttributedString(in); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertTrue(AttributedStringUtilities.equal(s1, s2)); 
 } 

    

    /**
     * Serialize a <code>Color</code> and check that it can be deserialized
     * correctly.
     */
    

    /**
     * Serialize a <code>ColorUIResource</code> and check that it can be
     * deserialized correctly.
     */
    

    /**
     * Serialize a <code>GradientPaint</code>, restore it, and check for
     * equality.
     */
    

    /**
     * Serialize a <code>TexturePaint</code>, restore it, and check for
     * equality.  Since this class is not serializable, we expect null as the
     * result.
     */
    

    /**
     * Serialize a <code>Line2D.Float</code> instance, and check that it can be
     * deserialized correctly.
     */
    

    /**
     * Serialize a <code>Line2D.Double</code> instance and check that it can be
     * deserialized correctly.
     */
    

    /**
     * Serialize a <code>Rectangle2D.Float</code> instance, and check that it
     * can be deserialized correctly.
     */
    

    /**
     * Serialize a <code>Rectangle2D.Double</code> instance and check that it
     * can be deserialized correctly.
     */
    

    /**
     * Serialize an <code>Arc2D.Float</code> instance and check that it
     * can be deserialized correctly.
     */
    

    /**
     * Serialize an <code>Arc2D.Double</code> instance and check that it
     * can be deserialized correctly.
     */
    

    /**
     * Some checks for the serialization of a GeneralPath instance.
     */
    

    /**
     * Tests the serialization of an {@link AttributedString}.
     */
    

    /**
     * Tests the serialization of an {@link AttributedString}.
     */
    

    /**
     * Tests the serialization of an {@link AttributedString}.
     */
    

}
