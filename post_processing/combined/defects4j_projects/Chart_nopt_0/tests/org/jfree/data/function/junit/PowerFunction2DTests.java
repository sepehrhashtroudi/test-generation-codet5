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
 * -------------------------
 * PowerFunction2DTests.java
 * -------------------------
 * (C) Copyright 2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 28-May-2009 : Version 1 (DG);
 *
 */

package org.jfree.data.function.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.function.PowerFunction2D;

/**
 * Tests for the {@link PowerFunction2D} class.
 */
public class PowerFunction2DTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(PowerFunction2DTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public PowerFunction2DTests(String name) {
        super(name);
    }

    private static final double EPSILON = 0.000000001;

    /**
     * Some tests for the constructor.
     */
public void testHashCode3265() { PowerFunction2D p1 = new PowerFunction2D(1.0, 2.0); PowerFunction2D p2 = new PowerFunction2D(1.0, 2.0); PowerFunction2D p3 = new PowerFunction2D(1.0, 2.0); assertEquals(p1.hashCode(), p2.hashCode()); assertEquals(p1.hashCode(), p3.hashCode()); }
    

    /**
     * For datasets, the equals() method just checks keys and values.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Objects that are equal should have the same hash code otherwise FindBugs
     * will tell on us...
     */
    

}



