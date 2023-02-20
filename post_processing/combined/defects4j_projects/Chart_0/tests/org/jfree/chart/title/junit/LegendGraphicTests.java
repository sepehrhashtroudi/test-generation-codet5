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
 * -----------------------
 * LegendGraphicTests.java
 * -----------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 01-Sep-2005 : Version 1 (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.title.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.title.LegendGraphic;
import org.jfree.chart.util.GradientPaintTransformType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.StandardGradientPaintTransformer;

/**
 * Tests for the {@link LegendGraphic} class.
 */
public class LegendGraphicTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(LegendGraphicTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public LegendGraphicTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */
public void testCloning1288() { 
     LegendGraphic g1 = new LegendGraphic(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), Color.black); 
     LegendGraphic g2 = null; 
     try { 
         g2 = (LegendGraphic) g1.clone(); 
     } catch (CloneNotSupportedException e) { 
         System.err.println("Failed to clone."); 
     } 
     assertTrue(g1 != g2); 
     assertTrue(g1.getClass() == g2.getClass()); 
     assertTrue(g1.equals(g2)); 
 }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * A test for cloning - checks that the line shape is cloned correctly.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
