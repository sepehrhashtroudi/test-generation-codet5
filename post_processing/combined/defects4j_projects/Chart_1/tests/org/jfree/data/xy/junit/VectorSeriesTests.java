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
 * ----------------------
 * VectorSeriesTests.java
 * ----------------------
 * (C) Copyright 2007, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 30-Jan-2007 : Version 1, based on XYSeriesTests (DG);
 * 24-May-2007 : Updated for modified method names (DG);
 * 27-Nov-2007 : Added testClear() method (DG);
 *
 */

package org.jfree.data.xy.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.event.SeriesChangeEvent;
import org.jfree.data.event.SeriesChangeListener;
import org.jfree.data.xy.VectorSeries;
import org.jfree.data.xy.XYCoordinate;

/**
 * Tests for the {@link VectorSeries} class.
 */
public class VectorSeriesTests extends TestCase
        implements SeriesChangeListener {

    SeriesChangeEvent lastEvent;

    /**
     * Records the last event.
     *
     * @param event  the event.
     */
    public void seriesChanged(SeriesChangeEvent event) {
        this.lastEvent = event;
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(VectorSeriesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public VectorSeriesTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testEquals1594() { 
     VectorSeries s1 = new VectorSeries("Series 1"); 
     VectorSeries s2 = new VectorSeries("Series 2"); 
     assertTrue(s1.equals(s2)); 
     assertTrue(s2.equals(s1)); 
     s1.add(1.0, 1.1, 1.1, 1.1); 
     assertFalse(s1.equals(s2)); 
     s2.add(1.0, 1.1, 1.1, 1.1); 
     assertTrue(s1.equals(s2)); 
     s1.add(2.0, 2.2, 2.2, 2.2); 
     assertFalse(s1.equals(s2)); 
     s2.add(2.0, 2.2, 2.2, 2.2); 
     assertTrue(s1.equals(s2)); 
     s1.remove(0); 
     assertFalse(s1.equals(s2)); 
     s2.remove(0); 
     assertTrue(s1.equals(s2)); 
 }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Simple test for the indexOf() method.
     */
    

    /**
     * A check for the indexOf() method for an unsorted series.
     */
    

    /**
     * Simple test for the remove() method.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * When items are added with duplicate x-values, we expect them to remain
     * in the order they were added.
     */
    

    /**
     * Some checks for the add() method for an UNSORTED series.
     */
    

    /**
     * A simple check that the maximumItemCount attribute is working.
     */
    

    /**
     * Check that the maximum item count can be applied retrospectively.
     */
    

    /**
     * Some checks for the clear() method.
     */
    

}
