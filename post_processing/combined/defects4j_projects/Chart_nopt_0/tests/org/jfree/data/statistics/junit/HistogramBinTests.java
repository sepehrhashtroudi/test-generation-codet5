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
 * ----------------------
 * HistogramBinTests.java
 * ----------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 01-Mar-2004 : Version 1 (DG);
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

import org.jfree.data.statistics.HistogramBin;

/**
 * Tests for the {@link HistogramBin} class.
 */
public class HistogramBinTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(HistogramBinTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public HistogramBinTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testHistogramBin5242() { final double start = 10; final double end = 20; HistogramBin bin = new HistogramBin(start, end); assertEquals(0, bin.getCount()); assertEquals(start, bin.getStartBoundary(), 0.001); assertEquals(end, bin.getEndBoundary(), 0.001); bin.incrementCount(); assertEquals(1, bin.getCount()); assertEquals(start, bin.getStartBoundary(), 0.001); assertEquals(end, bin.getEndBoundary(), 0.001); bin.incrementCount(); assertEquals(2, bin.getCount()); assertEquals(start, bin.getStartBoundary(), 0.001);
}

public void testEquals5251() { final double start = 10.0; final double end = 20.0; HistogramBin bin1 = new HistogramBin(start, end); HistogramBin bin2 = new HistogramBin(start, end); assertTrue(bin1.equals(bin2)); bin2.incrementCount(); assertTrue(bin1.equals(bin2)); bin1.incrementCount(); assertFalse(bin1.equals(bin2)); bin2.incrementCount(); assertFalse(bin1.equals(bin2)); }
public void testEquals5252() { final double start = 10.0; final double end = 20.0; HistogramBin bin1 = new HistogramBin(start, end); HistogramBin bin2 = new HistogramBin(start, end); assertTrue(bin1.equals(bin2)); bin2.incrementCount(); assertFalse(bin1.equals(bin2)); bin2.incrementCount(); assertTrue(bin1.equals(bin2)); bin1.incrementCount(); assertFalse(bin1.equals(bin2)); bin2.incrementCount(); assertTrue(bin1.equals(bin2)); }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
