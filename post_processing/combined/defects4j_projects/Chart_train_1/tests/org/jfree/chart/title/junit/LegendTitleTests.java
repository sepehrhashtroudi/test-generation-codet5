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
 * ---------------------
 * LegendTitleTests.java
 * ---------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Feb-2005 : Version 1 (DG);
 * 16-Mar-2005 : Extended testEquals() (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.title.junit;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
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

import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleEdge;

/**
 * Some tests for the {@link LegendTitle} class.
 */
public class LegendTitleTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(LegendTitleTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public LegendTitleTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */

public void testCloning552() { 
     XYPlot plot = new XYPlot(); 
     Rectangle2D bounds1 = new Rectangle2D.Double(10.0, 20.0, 30.0, 40.0); 
     LegendTitle t1 = new LegendTitle(plot); 
     t1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); 
     t1.setBounds(bounds1); 
     LegendTitle t2 = null; 
     try { 
         t2 = (LegendTitle) t1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(t1 != t2); 
     assertTrue(t1.getClass() == t2.getClass()); 
     assertTrue(t1.equals(t2)); 
     bounds1.setFrame(40.0, 30.0, 20.0, 10.0); 
     assertFalse(t1.equals(t2)); 
     t2.setBounds(new Rectangle2D.Double(40.0, 30.0, 20.0, 10.0)); 
     assertTrue(t1.equals(t2)); 
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
