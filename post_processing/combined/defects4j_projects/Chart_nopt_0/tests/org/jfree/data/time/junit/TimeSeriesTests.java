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
 * --------------------
 * TimeSeriesTests.java
 * --------------------
 * (C) Copyright 2001-2009, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 16-Nov-2001 : Version 1 (DG);
 * 17-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 * 13-Mar-2003 : Added serialization test (DG);
 * 15-Oct-2003 : Added test for setMaximumItemCount method (DG);
 * 23-Aug-2004 : Added test that highlights a bug where the addOrUpdate()
 *               method can lead to more than maximumItemCount items in the
 *               dataset (DG);
 * 24-May-2006 : Added new tests (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 * 31-Oct-2007 : New hashCode() test (DG);
 * 21-Nov-2007 : Added testBug1832432() and testClone2() (DG);
 * 10-Jan-2008 : Added testBug1864222() (DG);
 * 13-Jan-2009 : Added testEquals3() and testRemoveAgedItems3() (DG);
 * 26-May-2009 : Added various tests for min/maxY values (DG);
 * 09-Jun-2009 : Added testAdd_TimeSeriesDataItem (DG);
 * 31-Aug-2009 : Added new test for createCopy() method (DG);
 *
 */

package org.jfree.data.time.junit;

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
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Month;
import org.jfree.data.time.MonthConstants;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Year;

/**
 * A collection of test cases for the {@link TimeSeries} class.
 */
public class TimeSeriesTests extends TestCase implements SeriesChangeListener {

    /** A time series. */
    private TimeSeries seriesA;

    /** A time series. */
    private TimeSeries seriesB;

    /** A time series. */
    private TimeSeries seriesC;

    /** A flag that indicates whether or not a change event was fired. */
    private boolean gotSeriesChangeEvent = false;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(TimeSeriesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public TimeSeriesTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {

        this.seriesA = new TimeSeries("Series A");
        try {
            this.seriesA.add(new Year(2000), new Integer(102000));
            this.seriesA.add(new Year(2001), new Integer(102001));
            this.seriesA.add(new Year(2002), new Integer(102002));
            this.seriesA.add(new Year(2003), new Integer(102003));
            this.seriesA.add(new Year(2004), new Integer(102004));
            this.seriesA.add(new Year(2005), new Integer(102005));
        }
        catch (SeriesException e) {
            System.err.println("Problem creating series.");
        }

        this.seriesB = new TimeSeries("Series B");
        try {
            this.seriesB.add(new Year(2006), new Integer(202006));
            this.seriesB.add(new Year(2007), new Integer(202007));
            this.seriesB.add(new Year(2008), new Integer(202008));
        }
        catch (SeriesException e) {
            System.err.println("Problem creating series.");
        }

        this.seriesC = new TimeSeries("Series C");
        try {
            this.seriesC.add(new Year(1999), new Integer(301999));
            this.seriesC.add(new Year(2000), new Integer(302000));
            this.seriesC.add(new Year(2002), new Integer(302002));
        }
        catch (SeriesException e) {
            System.err.println("Problem creating series.");
        }

    }

    /**
     * Sets the flag to indicate that a {@link SeriesChangeEvent} has been
     * received.
     *
     * @param event  the event.
     */
    public void seriesChanged(SeriesChangeEvent event) {
        this.gotSeriesChangeEvent = true;
    }

    /**
     * Check that cloning works.
     */
public void testCompareTo828() { Year y1 = new Year(2001); Year y2 = new Year(2002); Year y3 = new Year(2003); assertTrue(y1.compareTo(y2) < 0); assertTrue(y2.compareTo(y1) > 0); assertTrue(y1.compareTo(y3) < 0); assertTrue(y3.compareTo(y1) > 0); }
public void testCompareTo829() { Year e1 = new Year(2001); Year e2 = new Year(2002); Year e3 = new Year(2003); assertTrue(e1.compareTo(e2) < 0); assertTrue(e2.compareTo(e1) > 0); assertTrue(e1.compareTo(e3) < 0); assertTrue(e3.compareTo(e1) == 0); }
public void testEquals1934() { Day day1 = new Day(31, MonthConstants.JANUARY, 2001); Day day2 = new Day(31, MonthConstants.JANUARY, 2001); Day day3 = new Day(31, MonthConstants.JANUARY, 2001); Day day4 = new Day(31, MonthConstants.JANUARY, 2001); Day day5 = new Day(31, MonthConstants.JANUARY, 2001); Day day6 = new Day(31, MonthConstants.JANUARY, 2001); Day day7 = new Day(31, MonthConstants.JANUARY, 2001);
}

public void testGetMinY2012() { TimeSeries s1 = new TimeSeries("S1"); s1.add(new Year(2001), 1.0); s1.add(new Year(2002), 2.0); s1.add(new Year(2003), 3.0); s1.add(new Year(2004), 4.0); assertEquals(1.0, s1.getMinY(), EPSILON); }
public void testGetMaxY2013() { TimeSeries s1 = new TimeSeries("S1"); s1.add(new Year(2001), 1.0); s1.add(new Year(2002), 2.0); s1.add(new Year(2003), 3.0); s1.add(new Year(2004), 4.0); assertEquals(2.0, s1.getMaxY(), EPSILON); }
public void testCompareTo2945() { Day d1 = new Day(1, 1, 1); Day d2 = new Day(1, 1, 1); Day d3 = new Day(1, 1, 1); assertTrue(d1.compareTo(d2) < 0); assertTrue(d2.compareTo(d1) > 0); assertTrue(d1.compareTo(d3) == 0); assertTrue(d3.compareTo(d1) == 0); }
public void testCompareTo2949() { Day d1 = new Day(1, 1, 1); Day d2 = new Day(1, 1, 1); Day d3 = new Day(1, 1, 1); assertTrue(d1.compareTo(d2) < 0); assertTrue(d2.compareTo(d1) > 0); assertTrue(d1.compareTo(d3) < 0); assertTrue(d3.compareTo(d1) == 0); }
public void testCompareTo2950() { Day d1 = new Day(); Day d2 = new Day(d1.getSerialDate()); Day d3 = new Day(d2.getSerialDate()); assertTrue(d1.compareTo(d2) < 0); assertTrue(d2.compareTo(d1) > 0); assertTrue(d1.compareTo(d3) == 0); assertTrue(d3.compareTo(d1) == 0); }
    

    /**
     * Another test of the clone() method.
     */
    

    /**
     * Add a value to series A for 1999.  It should be added at index 0.
     */
    

    /**
     * Tests the retrieval of values.
     */
    

    /**
     * Tests the deletion of values.
     */
    

    /**
     * Basic tests for the delete() method.
     */
    

    /**
     * Some checks for the delete(int, int) method.
     */
    

    /**
     * Check that the item bounds are determined correctly when there is a
     * maximum item count and a new value is added.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Tests the equals method.
     */
    

    /**
     * Tests a specific bug report where null arguments in the constructor
     * cause the equals() method to fail.  Fixed for 0.9.21.
     */
    

    /**
     * Some tests to ensure that the createCopy(RegularTimePeriod,
     * RegularTimePeriod) method is functioning correctly.
     */
    

    /**
     * Some tests to ensure that the createCopy(int, int) method is
     * functioning correctly.
     */
    

    /**
     * Checks that the min and max y values are updated correctly when copying
     * a subset.
     *
     * @throws java.lang.CloneNotSupportedException
     */
    

    /**
     * Test the setMaximumItemCount() method to ensure that it removes items
     * from the series if necessary.
     */
    

    /**
     * Some checks for the addOrUpdate() method.
     */
    

    /**
     * Test the add branch of the addOrUpdate() method.
     */
    

    /**
     * Test that the addOrUpdate() method won't allow multiple time period
     * classes.
     */
    

    /**
     * Some more checks for the addOrUpdate() method.
     */
    

    /**
     * A test for the bug report 1075255.
     */
    

    /**
     * A test for bug 1832432.
     */
    

    /**
     * Some checks for the getIndex() method.
     */
    

    /**
     * Some checks for the getDataItem(int) method.
     */
    

    /**
     * Some checks for the getDataItem(RegularTimePeriod) method.
     */
    

    /**
     * Some checks for the removeAgedItems() method.
     */
    

    /**
     * Some checks for the removeAgedItems(long, boolean) method.
     */
    

    /**
     * Calling removeAgedItems() on an empty series should not throw any
     * exception.
     */
    

    /**
     * Check that the item bounds are determined correctly when there is a
     * maximum item count.
     */
    

    /**
     * Check that the item bounds are determined correctly after a call to
     * removeAgedItems().
     */
    

    /**
     * Some simple checks for the hashCode() method.
     */
    

    /**
     * Test for bug report 1864222.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the getMinY() method.
     */
    

    /**
     * Some checks for the getMaxY() method.
     */
    

    /**
     * A test for the clear method.
     */
    

    /**
     * Check that the item bounds are determined correctly when there is a
     * maximum item count and a new value is added.
     */
    

    /**
     * Some checks for the update(RegularTimePeriod...method).
     */
    

    /**
     * Create a TimeSeriesDataItem, add it to a TimeSeries.  Now, modifying
     * the original TimeSeriesDataItem should NOT affect the TimeSeries.
     */
    

}
