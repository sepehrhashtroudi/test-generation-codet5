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
 * ShapeUtilitiesTests.java
 * ------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 02-Jun-2008 : Copied from JCommon (DG);
 * 05-Nov-2008 : Added tests for clipLine() method (DG);
 *
 */

package org.jfree.chart.util.junit;

import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.ShapeUtilities;

/**
 * Tests for the {@link ShapeUtilities} class.
 */
public class ShapeUtilitiesTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(ShapeUtilitiesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public ShapeUtilitiesTests(final String name) {
        super(name);
    }

    /**
     * Tests the equal() method.
     */

public void testEqualGeneralPaths106() { 
     GeneralPath g1 = new GeneralPath(); 
     g1.moveTo(1.0f, 2.0f); 
     g1.lineTo(3.0f, 4.0f); 
     g1.curveTo(5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f); 
     g1.quadTo(1.0f, 2.0f, 3.0f, 4.0f); 
     g1.closePath(); 
     GeneralPath g2 = new GeneralPath(); 
     g2.moveTo(1.0f, 2.0f); 
     g2.lineTo(3.0f, 4.0f); 
     g2.curveTo(5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f); 
     g2.quadTo(1.0f, 2.0f, 3.0f, 4.0f); 
     g2.closePath(); 
     assertTrue(ShapeUtilities.equal(g1, g2)); 
     g2 = new GeneralPath(); 
     g2.moveTo(11.0f, 22.0f); 
     g2.lineTo(3.0f, 4.0f); 
     g2.curveTo(5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f); 
     g2.quadTo(1.0f, 2.0f, 3.0f, 4.0f); 
     g2.closePath(); 
     assertFalse(ShapeUtilities.equal(g1, g2)); 
     g2 = new GeneralPath(); 
     g2.moveTo(1.0f, 2.0f); 
     g2.lineTo(33.0f, 44.0f); 
     g2.curveTo(5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f); 
     g2.quadTo(1.0f, 2.0f, 3.0f, 4.0f); 
     g2.closePath(); 
     assertFalse(ShapeUtilities.equal(g1, g2)); 
     g2 = new GeneralPath(); 
     g2.moveTo(1.0f, 2.0f); 
     g2.lineTo(3.0f, 4.0f); 
     g2.curveTo(55.0f, 66.0f, 77.0f, 88.0f, 99.0f, 100.0f); 
     g2.quadTo(1.0f, 2.0f, 3.0f, 4.0f); 
     g2.closePath(); 
     assertFalse(ShapeUtilities.equal(g1, g2)); 
     g2 = new GeneralPath(); 
     g2.moveTo(1.0f, 2.0f); 
     g2.lineTo(3.0f, 4.0f); 
     g2.curveTo(5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f); 
     g2.quadTo(11.0f, 22.0f, 33.0f, 44.0f); 
     g2.closePath(); 
     assertFalse(ShapeUtilities.equal(g1, g2)); 
     g2 = new GeneralPath(); 
     g2.moveTo(1.0f, 2.0f); 
     g2.lineTo(3.0f, 4.0f); 
     g2.curveTo(5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 10.0f); 
     g2.quadTo(1.0f, 2.0f, 3.0f, 4.0f); 
     g2.lineTo(3.0f, 4.0f); 
     g2.closePath(); 
     assertFalse(ShapeUtilities.equal(g1, g2)); 
 } 


public void testIntersects108() { 
     final Rectangle2D r1 = new Rectangle2D.Float(0, 0, 100, 100); 
     final Rectangle2D r2 = new Rectangle2D.Float(0, 0, 100, 100); 
     assertTrue(ShapeUtilities.intersects(r1, r2)); 
     r1.setRect(100, 0, 100, 0); 
     assertTrue(ShapeUtilities.intersects(r1, r2)); 
     assertTrue(ShapeUtilities.intersects(r2, r1)); 
     r1.setRect(0, 0, 0, 0); 
     assertTrue(ShapeUtilities.intersects(r1, r2)); 
     assertTrue(ShapeUtilities.intersects(r2, r1)); 
     r1.setRect(50, 50, 10, 0); 
     assertTrue(ShapeUtilities.intersects(r1, r2)); 
     assertTrue(ShapeUtilities.intersects(r2, r1)); 
 } 

    

    /**
     * Some checks for the equal(Shape, Shape) method.
     */
    

    /**
     * Some checks for the intersects() method,
     */
    

    /**
     * Some checks for the equal(GeneralPath, GeneralPath) method.
     */
    
    private boolean lineEquals(Line2D line, double x1, double y1, double x2,
            double y2) {
        boolean result = true;
        double epsilon = 0.0000000001;
        if (Math.abs(line.getX1() - x1) > epsilon) result = false;
        if (Math.abs(line.getY1() - y1) > epsilon) result = false;
        if (Math.abs(line.getX2() - x2) > epsilon) result = false;
        if (Math.abs(line.getY2() - y2) > epsilon) result = false;
        if (result == false) {
            System.out.println(line.getX1() + ", " + line.getY1() + ", "
                    + line.getX2() + ", " + line.getY2());
        }
        return result;
    }

    /**
     * Some tests for the clipLine() method.
     */
    

}
