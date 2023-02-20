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
 * --------------------
 * OHLCSeriesTests.java
 * --------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 04-Dec-2006 : Version 1, based on XYSeriesTests (DG);
 * 27-Nov-2007 : Added testClear() method (DG);
 *
 */

package org.jfree.data.time.ohlc.junit;

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
import org.jfree.data.general.SeriesException;
import org.jfree.data.time.Year;
import org.jfree.data.time.ohlc.OHLCSeries;

/**
 * Tests for the {@link OHLCSeries} class.
 */
public class OHLCSeriesTests extends TestCase
        implements SeriesChangeListener {

    SeriesChangeEvent lastEvent;

    /**
     * Records a change event.
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
        return new TestSuite(OHLCSeriesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public OHLCSeriesTests(String name) {
        super(name);
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
     * Simple test for the indexOf() method.
     */
    

    /**
     * Simple test for the remove() method.
     */
    

    /**
     * If you add a duplicate period, an exception should be thrown.
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
