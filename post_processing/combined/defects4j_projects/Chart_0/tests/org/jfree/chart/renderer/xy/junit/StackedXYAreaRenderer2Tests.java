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
 * -------------------------------
 * StackedXYAreaRenderer2Tests.java
 * -------------------------------
 * (C) Copyright 2005-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 06-Jan-2005 : Version 1 (DG);
 * 22-Aug-2006 : Added testDrawWithEmptyDataset() method (DG);
 * 30-Nov-2006 : Extended testEquals() (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StackedXYAreaRenderer2;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.Range;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.TableXYDataset;

/**
 * Tests for the {@link StackedXYAreaRenderer2} class.
 */
public class StackedXYAreaRenderer2Tests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StackedXYAreaRenderer2Tests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StackedXYAreaRenderer2Tests(String name) {
        super(name);
    }

    /**
     * Test chart drawing with an empty dataset to ensure that this special
     * case doesn't cause any exceptions.
     */
public void testPublicCloneable868() { 
     StackedXYAreaRenderer2 r1 = new StackedXYAreaRenderer2(); 
     assertTrue(r1 instanceof PublicCloneable); 
 }
public void testEquals869() { 
     StackedXYAreaRenderer2 r1 = new StackedXYAreaRenderer2(); 
     StackedXYAreaRenderer2 r2 = new StackedXYAreaRenderer2(); 
     assertTrue(r1.equals(r2)); 
     assertTrue(r2.equals(r1)); 
     r1.setRoundXCoordinates(true); 
     assertFalse(r1.equals(r2)); 
     r2.setRoundXCoordinates(true); 
     assertTrue(r1.equals(r2)); 
 }
public void testHashcode871() { 
     StackedXYAreaRenderer2 r1 = new StackedXYAreaRenderer2(); 
     StackedXYAreaRenderer2 r2 = new StackedXYAreaRenderer2(); 
     assertTrue(r1.equals(r2)); 
     int h1 = r1.hashCode(); 
     int h2 = r2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testCloning873() { 
     StackedXYAreaRenderer2 r1 = new StackedXYAreaRenderer2(); 
     StackedXYAreaRenderer2 r2 = null; 
     try { 
         r2 = (StackedXYAreaRenderer2) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
 }
    

    /**
     * Test that the equals() method distinguishes all fields.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Check that the renderer is calculating the range bounds correctly.
     */
    

}
