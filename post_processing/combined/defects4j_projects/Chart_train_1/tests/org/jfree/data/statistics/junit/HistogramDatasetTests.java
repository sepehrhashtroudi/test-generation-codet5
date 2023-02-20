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

public void testSerialization112() { 
     double[] values = { 1.0, 2.0, 3.0, 4.0, 6.0, 12.0, 5.0, 6.3, 4.5 }; 
     HistogramDataset d1 = new HistogramDataset(); 
     d1.addSeries("Series 1", values, 5); 
     HistogramDataset d2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(d1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         d2 = (HistogramDataset) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(d1, d2); 
     d1.addSeries("Series 2", new double[] { 1.0, 2.0, 3.0 }, 2); 
     assertFalse(d1.equals(d2)); 
     d2.addSeries("Series 2", new double[] { 1.0, 2.0, 3.0 }, 2); 
     assertTrue(d1.equals(d2)); 
 } 


public void testBins448() { 
     double[] values = { 1.0, 2.0, 3.0, 4.0, 6.0, 12.0, 5.0, 6.3, 4.5 }; 
     HistogramDataset hd = new HistogramDataset(); 
     hd.addSeries("Series 1", values, 5); 
     assertEquals(hd.getYValue(0, 0), 3.0, EPSILON); 
     assertEquals(hd.getYValue(0, 1), 3.0, EPSILON); 
     assertEquals(hd.getYValue(0, 2), 2.0, EPSILON); 
     assertEquals(hd.getYValue(0, 3), 0.0, EPSILON); 
     assertEquals(hd.getYValue(0, 4), 1.0, EPSILON); 
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
