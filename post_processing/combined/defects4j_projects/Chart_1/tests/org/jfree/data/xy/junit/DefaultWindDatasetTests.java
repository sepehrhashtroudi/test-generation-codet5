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
 * ----------------------------
 * DefaultWindDatasetTests.java
 * ----------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 12-Jul-2006 : Version 1 (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
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

import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.time.Day;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.xy.DefaultWindDataset;

/**
 * Tests for {@link DefaultWindDataset}.
 */
public class DefaultWindDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultWindDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultWindDatasetTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the getSeriesKey(int) method.
     */
    

    /**
     * Some checks for the indexOf(Comparable) method.
     */
    

    /**
     * Creates a sample dataset for testing.
     *
     * @return A sample dataset.
     */
    public DefaultWindDataset createSampleDataset1() {
        Day t = new Day(1, 4, 2006);
        Object[] item1 = createItem(t, 3, 7);
        Object[] item2 = createItem(t.next(), 4, 8);
        Object[] item3 = createItem(t.next(), 5, 9);
        Object[][] series1 = new Object[][] {item1, item2, item3};
        Object[] item1b = createItem(t, 6, 10);
        Object[] item2b = createItem(t.next(), 7, 11);
        Object[] item3b = createItem(t.next(), 8, 12);
        Object[][] series2 = new Object[][] {item1b, item2b, item3b};
        Object[][][] data = new Object[][][] {series1, series2};
        return new DefaultWindDataset(data);
    }

    /**
     * Creates an array representing one item in a series.
     *
     * @param t  the time period.
     * @param dir  the wind direction.
     * @param force  the wind force.
     *
     * @return An array containing the specified items.
     */
    private Object[] createItem(RegularTimePeriod t, int dir, int force) {
        return new Object[] {new Long(t.getMiddleMillisecond()),
                new Integer(dir), new Integer(force)};
    }
}
