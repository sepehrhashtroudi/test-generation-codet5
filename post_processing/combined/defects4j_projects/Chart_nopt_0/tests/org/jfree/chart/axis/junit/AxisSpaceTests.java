/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2007, by Object Refinery Limited and Contributors.
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
 * -------------------
 * AxisSpaceTests.java
 * -------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 14-Aug-2003 : Version 1 (DG);
 * 07-Jan-2005 : Added hashCode test (DG);
 *
 */

package org.jfree.chart.axis.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.axis.AxisSpace;

/**
 * Tests for the {@link AxisSpace} class.
 */
public class AxisSpaceTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(AxisSpaceTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public AxisSpaceTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method can distinguish all fields.
     */
public void testCloning2839() throws CloneNotSupportedException { AxisSpace s = new AxisSpace(); s.setTop(1.0); s.setBottom(2.0); s.setLeft(3.0); s.setRight(4.0); AxisSpace clone = (AxisSpace) s.clone(); assertNotSame(s, clone); assertEquals(s.getTop(), clone.getTop(), 0.0); assertEquals(s.getBottom(), clone.getBottom(), 0.0); assertEquals(s.getLeft(), clone.getLeft(), 0.0); assertEquals(s.getRight(), clone.getRight(), 0.0); }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

}

