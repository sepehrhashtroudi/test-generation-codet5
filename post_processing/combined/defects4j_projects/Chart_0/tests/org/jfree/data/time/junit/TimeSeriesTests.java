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
public void testSerialization426() { 
     TimeSeries s1 = new TimeSeries("Series"); 
     TimeSeries s2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(s1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         s2 = (TimeSeries) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(s1, s2); 
 }
public void testEquals428() { 
     TimeSeriesDataItem item1 = new TimeSeriesDataItem(new Year(2010), 1.1); 
     TimeSeriesDataItem item2 = new TimeSeriesDataItem(new Year(2010), 1.1); 
     assertTrue(item1.equals(item2)); 
     assertTrue(item2.equals(item1)); 
     item1 = new TimeSeriesDataItem(new Year(2011), 2.2); 
     assertFalse(item1.equals(item2)); 
     item2 = new TimeSeriesDataItem(new Year(2011), 2.2); 
     assertTrue(item1.equals(item2)); 
     item1 = new TimeSeriesDataItem(new Year(2012), 3.3); 
     assertFalse(item1.equals(item2)); 
     item2 = new TimeSeriesDataItem(new Year(2012), 3.3); 
     assertTrue(item1.equals(item2)); 
 }
public void testEquals429() { 
     TimeSeriesDataItem item1 = new TimeSeriesDataItem(new Day(23, 9, 2001), 1.1); 
     TimeSeriesDataItem item2 = new TimeSeriesDataItem(new Day(23, 9, 2001), 1.1); 
     assertTrue(item1.equals(item2)); 
     assertTrue(item2.equals(item1)); 
     item1 = new TimeSeriesDataItem(new Day(23, 9, 2001), 2.2); 
     assertFalse(item1.equals(item2)); 
     item2 = new TimeSeriesDataItem(new Day(23, 9, 2001), 2.2); 
     assertTrue(item1.equals(item2)); 
     item1 = new TimeSeriesDataItem(new Day(23, 9, 2002), 3.3); 
     assertFalse(item1.equals(item2)); 
     item2 = new TimeSeriesDataItem(new Day(23, 9, 2002), 3.3); 
     assertTrue(item1.equals(item2)); 
 }
public void testGetMinY430() { 
     TimeSeries s1 = new TimeSeries("Test"); 
     TimeSeries s2 = null; 
     try { 
         s2 = (TimeSeries) s1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(s1 != s2); 
     assertTrue(s1.getClass() == s2.getClass()); 
     assertTrue(s1.equals(s2)); 
     s1.add(new Day(1, 1, 2007), 100.0); 
     assertFalse(s1.equals(s2)); 
 }
public void testCloning431() { 
     TimeSeries s1 = new TimeSeries("Test"); 
     TimeSeries s2 = null; 
     try { 
         s2 = (TimeSeries) s1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(s1 != s2); 
     assertTrue(s1.getClass() == s2.getClass()); 
     assertTrue(s1.equals(s2)); 
 }
public void testGetDataItem2455() { 
     TimeSeries series = new TimeSeries("S"); 
     assertNull(series.getDataItem(new Year(2006))); 
     boolean pass = false; 
     try { 
         series.getDataItem(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testAddOrUpdate2456() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.setMaximumItemCount(2); 
     s1.addOrUpdate(new Year(2010), 1.1); 
     s1.addOrUpdate(new Year(2011), 2.2); 
     s1.addOrUpdate(new Year(2012), 3.3); 
     assertEquals(2, s1.getItemCount()); 
     assertEquals(2.2, s1.getMinY(), EPSILON); 
     assertEquals(3.3, s1.getMaxY(), EPSILON); 
 }
public void testAddOrUpdate2457() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.addOrUpdate(new Year(2010), 1.1); 
     s1.addOrUpdate(new Year(2011), 2.2); 
     s1.addOrUpdate(new Year(2012), 3.3); 
     assertEquals(2, s1.getItemCount()); 
     assertEquals(2.2, s1.getMinY(), EPSILON); 
     assertEquals(3.3, s1.getMaxY(), EPSILON); 
 }
public void testAddOrUpdate2458() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.setMaximumItemCount(2); 
     s1.add(new Year(2010), 1.1); 
     s1.add(new Year(2011), 2.2); 
     s1.add(new Year(2012), 3.3); 
     s1.add(new Year(2013), 2.5); 
     assertEquals(2, s1.getItemCount()); 
     assertEquals(2.2, s1.getMinY(), EPSILON); 
     assertEquals(3.3, s1.getMaxY(), EPSILON); 
 }
public void testRemoveAgedItems4459() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.setMaximumItemAge(2); 
     s1.add(new Year(2010), 1.1); 
     s1.add(new Year(2011), 2.2); 
     s1.add(new Year(2012), 3.3); 
     s1.add(new Year(2013), 2.5); 
     assertEquals(3, s1.getItemCount()); 
     assertEquals(2.2, s1.getMinY(), EPSILON); 
     assertEquals(3.3, s1.getMaxY(), EPSILON); 
 }
public void testRemoveAgedItems3460() { 
     TimeSeries s = new TimeSeries("Test"); 
     boolean pass = true; 
     try { 
         s.removeAgedItems(0L, true); 
     } catch (Exception e) { 
         pass = false; 
     } 
     assertTrue(pass); 
 }
public void testDelete461() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.add(new Year(2009), 1.1); 
     s1.add(new Year(2010), 2.2); 
     s1.add(new Year(2011), 3.3); 
     s1.add(new Year(2012), 4.4); 
     s1.delete(2, 5); 
     s1.delete(3, 4); 
     assertEquals(2, s1.getItemCount()); 
     assertEquals(2.2, s1.getMinY(), EPSILON); 
     assertEquals(3.3, s1.getMaxY(), EPSILON); 
 }
public void testDelete462() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.add(new Year(2009), 1.1); 
     s1.add(new Year(2010), 2.2); 
     s1.add(new Year(2011), 3.3); 
     s1.add(new Year(2012), 4.4); 
     s1.delete(2, 4); 
     s1.delete(3, 4); 
     assertEquals(2, s1.getItemCount()); 
     assertEquals(2.2, s1.getMinY(), EPSILON); 
     assertEquals(3.3, s1.getMaxY(), EPSILON); 
 }
public void testGetIndex598() { 
     TimeSeries series = new TimeSeries("Series"); 
     assertEquals(-1, series.getIndex(new Month(1, 2003))); 
     series.add(new Month(1, 2003), 45.0); 
     assertEquals(0, series.getIndex(new Month(1, 2003))); 
     assertEquals(-1, series.getIndex(new Month(12, 2002))); 
     assertEquals(-2, series.getIndex(new Month(2, 2003))); 
     series.add(new Month(3, 2003), 55.0); 
     assertEquals(-1, series.getIndex(new Month(12, 2002))); 
     assertEquals(0, series.getIndex(new Month(1, 2003))); 
     assertEquals(-2, series.getIndex(new Month(2, 2003))); 
     assertEquals(1, series.getIndex(new Month(3, 2003))); 
     assertEquals(-3, series.getIndex(new Month(4, 2003))); 
 }
public void testGetIndex599() { 
     TimeSeries series = new TimeSeries("Series"); 
     assertEquals(-1, series.getIndex(new Day(1, 1, 2003))); 
     series.add(new Day(1, 1, 2003), 45.0); 
     assertEquals(0, series.getIndex(new Day(1, 1, 2003))); 
     assertEquals(-1, series.getIndex(new Day(12, 1, 2003))); 
     assertEquals(-2, series.getIndex(new Day(2, 2, 2003))); 
     series.add(new Day(3, 3, 2003), 55.0); 
     assertEquals(-1, series.getIndex(new Day(12, 1, 2003))); 
     assertEquals(0, series.getIndex(new Day(1, 1, 2003))); 
     assertEquals(-2, series.getIndex(new Day(2, 2, 2003))); 
     assertEquals(1, series.getIndex(new Day(3, 3, 2003))); 
     assertEquals(-3, series.getIndex(new Day(4, 4, 2003))); 
 }
    

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
