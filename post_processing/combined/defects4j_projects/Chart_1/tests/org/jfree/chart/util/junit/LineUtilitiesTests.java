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
 * LineUtilitiesTests.java
 * -----------------------
 * (C) Copyright 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 05-Nov-2008 : Version 1 (DG);
 *
 */

package org.jfree.chart.util.junit;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.LineUtilities;

/**
 * Tests for the {@link LineUtilities} class.
 */
public class LineUtilitiesTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(LineUtilitiesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public LineUtilitiesTests(String name) {
        super(name);
    }

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

    

}

