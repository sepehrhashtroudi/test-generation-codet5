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
 * -----------------
 * OutlierTests.java
 * -----------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 21-Nov-2007 : Version 1 (DG);
 *
 */

package org.jfree.chart.renderer.junit;

import java.awt.geom.Point2D;
import java.io.Serializable;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.renderer.Outlier;


/**
 * Tests for the {@link Outlier} class.
 */
public class OutlierTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(OutlierTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public OutlierTests(String name) {
        super(name);
    }

    private static final double EPSILON = 0.000000001;

    /**
     * Simple check for the default constructor.
     */

public void testConstructor89() { 
     Outlier out = new Outlier(1.0, 2.0, 3.0); 
     assertEquals(-2.0, out.getX(), EPSILON); 
     assertEquals(-1.0, out.getY(), EPSILON); 
     assertEquals(3.0, out.getRadius(), EPSILON); 
 } 

    

    /**
     * A test for the equals() method.
     */
    

    /**
     * Confirm that cloning is not implemented.
     */
    

    /**
     * Confirm that serialization is not implemented.
     */
    

}

