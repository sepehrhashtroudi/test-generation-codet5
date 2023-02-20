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
 * --------------------------
 * HistogramDatasetTests.java
 * --------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 01-Mar-2004 : Version 1 (DG);
 * 08-Jun-2005 : Added test for getSeriesKey(int) bug (DG);
 * 03-Aug-2006 : Added testAddSeries() and testBinBoundaries() method (DG);
 * 22-May-2008 : Added testAddSeries2() and enhanced testCloning() (DG);
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

import org.jfree.data.statistics.HistogramDataset;

/**
 * Tests for the {@link HistogramDataset} class.
 */
public class HistogramDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(HistogramDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public HistogramDatasetTests(String name) {
        super(name);
    }

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks that the correct values are assigned to bins.
     */
public void testGetBins4821() { HistogramDataset dataset = new HistogramDataset(); dataset.addSeries("Series 1", new double[] {1.0, 2.0, 3.0}, 4); dataset.addSeries("Series 2", new double[] {1.0, 2.0, 3.0}, 5); dataset.addSeries("Series 3", new double[] {1.0, 2.0, 3.0}, 6); dataset.addSeries("Series 4", new double[] {1.0, 2.0, 3.0}, 7); dataset.addSeries("Series 4", new double[] {1.0, 2.0, 3.0}, 8);
}

    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * A test for a bug reported in the forum where the series name isn't being
     * returned correctly.
     */
    

    /**
     * Some checks for the addSeries() method.
     */
    

    /**
     * Another check for the addSeries() method.
     */
    

    /**
     * This test is derived from a reported bug.
     */
    

    /**
     * Some checks for bug 1553088.  An IndexOutOfBoundsException is thrown
     * when a data value is *very* close to the upper limit of the last bin.
     */
    

}
