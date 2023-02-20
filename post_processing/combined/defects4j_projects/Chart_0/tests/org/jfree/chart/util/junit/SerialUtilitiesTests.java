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
public void testColorUIResourceSerialization1373() { 
     Paint p1 = UIManager.getColor("Panel.background"); 
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
         fail(e.toString()); 
     } 
     assertEquals(p1, p2); 
 }
public void testGeneralPathSerialization1375() { 
     GeneralPath g1 = new GeneralPath(); 
     g1.moveTo(1.0f, 2.0f); 
     g1.lineTo(3.0f, 4.0f); 
     g1.curveTo(5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f); 
     g1.quadTo(1.0f, 2.0f, 3.0f, 4.0f); 
     g1.closePath(); 
     GeneralPath g2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutputStream out = new ObjectOutputStream(buffer); 
         SerialUtilities.writeShape(g1, out); 
         out.close(); 
         ByteArrayInputStream bais = new ByteArrayInputStream(buffer.toByteArray()); 
         ObjectInputStream in = new ObjectInputStream(bais); 
         g2 = (GeneralPath) SerialUtilities.readShape(in); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertTrue(ShapeUtilities.equal(g1, g2)); 
 }
public void testAttributedStringSerialization11376() { 
     AttributedString s1 = new AttributedString(""); 
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
