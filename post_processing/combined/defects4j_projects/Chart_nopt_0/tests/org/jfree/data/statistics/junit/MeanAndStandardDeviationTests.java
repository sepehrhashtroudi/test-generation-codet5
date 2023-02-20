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
 * ----------------------------------
 * MeanAndStandardDeviationTests.java
 * ----------------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 05-Feb-2005 : Version 1 (DG);
 *
 */

package org.jfree.data.statistics.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.statistics.MeanAndStandardDeviation;

/**
 * Tests for the {@link MeanAndStandardDeviation} class.
 */
public class MeanAndStandardDeviationTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(MeanAndStandardDeviationTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public MeanAndStandardDeviationTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testEquals685() { MeanAndStandardDeviation m1 = new MeanAndStandardDeviation(1.0, 2.0); MeanAndStandardDeviation m2 = new MeanAndStandardDeviation(1.0, 2.0); assertTrue(m1.equals(m1)); assertTrue(m1.equals(m2)); }
public void testEquals686() { MeanAndStandardDeviation m1 = new MeanAndStandardDeviation(1.0, 2.0); MeanAndStandardDeviation m2 = new MeanAndStandardDeviation(1.0, 2.0); assertEquals(m1, m2); assertEquals(m1.hashCode(), m2.hashCode()); }
public void testEquals687() { MeanAndStandardDeviation m1 = new MeanAndStandardDeviation(1.0, 2.0); MeanAndStandardDeviation m2 = new MeanAndStandardDeviation(1.0, 2.0); assertEquals(m1, m2); assertEquals(m2, m1); m1 = new MeanAndStandardDeviation(2.0, 3.0); assertFalse(m1.equals(m2)); m2 = new MeanAndStandardDeviation(2.0, 3.0); assertEquals(m1, m2); }
    

    /**
     * Immutable class - should not be cloneable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    
}
