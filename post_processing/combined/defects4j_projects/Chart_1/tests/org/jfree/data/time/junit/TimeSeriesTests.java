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
public void testCloning49() { 
     TimeSeries series = new TimeSeries("Test Series"); 
     RegularTimePeriod jan1st2002 = new Day(1, MonthConstants.JANUARY, 2002); 
     try { 
         series.add(jan1st2002, new Integer(42)); 
     } catch (SeriesException e) { 
         System.err.println("Failed to clone."); 
     } 
     TimeSeries clone = null; 
     try { 
         clone = (TimeSeries) series.clone(); 
         clone.setKey("Clone Series"); 
         try { 
             clone.update(jan1st2002, new Integer(10)); 
         } catch (SeriesException e) { 
             e.printStackTrace(); 
         } 
     } catch (CloneNotSupportedException e) { 
         assertTrue(false); 
     } 
     int seriesValue = series.getValue(jan1st2002).intValue(); 
     int cloneValue = Integer.MAX_VALUE; 
     if (clone != null) { 
         cloneValue = clone.getValue(jan1st2002).intValue(); 
     } 
     assertEquals(42, seriesValue); 
     assertEquals(10, cloneValue); 
     assertEquals("Test Series", series.getKey()); 
     if (clone != null) { 
         assertEquals("Clone Series", clone.getKey()); 
     } else { 
         assertTrue(false); 
     } 
 }
public void testHashcode425() { 
     TimeSeriesDataItem item1 = new TimeSeriesDataItem(new Year(2009), 1.0); 
     TimeSeriesDataItem item2 = new TimeSeriesDataItem(new Year(2009), 1.0); 
     assertTrue(item1.equals(item2)); 
     int h1 = item1.hashCode(); 
     int h2 = item2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testClone427() { 
     TimeSeries series = new TimeSeries("Test Series"); 
     RegularTimePeriod jan1st2002 = new Day(1, MonthConstants.JANUARY, 2002); 
     try { 
         series.add(jan1st2002, new Integer(42)); 
     } catch (SeriesException e) { 
         System.err.println("Problem adding to series."); 
     } 
     TimeSeries clone = null; 
     try { 
         clone = (TimeSeries) series.clone(); 
         clone.setKey("Clone Series"); 
         try { 
             clone.update(jan1st2002, new Integer(10)); 
         } catch (SeriesException e) { 
             e.printStackTrace(); 
         } 
     } catch (CloneNotSupportedException e) { 
         assertTrue(false); 
     } 
     int seriesValue = series.getValue(jan1st2002).intValue(); 
     int cloneValue = Integer.MAX_VALUE; 
     if (clone != null) { 
         cloneValue = clone.getValue(jan1st2002).intValue(); 
     } 
     assertEquals(42, seriesValue); 
     assertEquals(10, cloneValue); 
     assertEquals("Test Series", series.getKey()); 
     if (clone != null) { 
         assertEquals("Clone Series", clone.getKey()); 
     } else { 
         assertTrue(false); 
     } 
     }
public void testGetMaxY428() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     assertTrue(Double.isNaN(s1.getMaxY())); 
     s1.add(new Year(2008), 1.1); 
     assertEquals(1.1, s1.getMaxY(), EPSILON); 
     s1.add(new Year(2009), 2.2); 
     assertEquals(2.2, s1.getMaxY(), EPSILON); 
     s1.add(new Year(2000), 99.9); 
     assertEquals(99.9, s1.getMaxY(), EPSILON); 
     s1.add(new Year(2002), -1.1); 
     assertEquals(99.9, s1.getMaxY(), EPSILON); 
     s1.add(new Year(2003), null); 
     assertEquals(99.9, s1.getMaxY(), EPSILON); 
     s1.addOrUpdate(new Year(2000), null); 
     assertEquals(2.2, s1.getMaxY(), EPSILON); 
 }
public void testGetMaxY429() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     assertTrue(Double.isNaN(s1.getMaxY())); 
     s1.add(new Year(2008), 1.1); 
     assertEquals(1.1, s1.getMaxY(), EPSILON); 
     s1.add(new Year(2009), 2.2); 
     assertEquals(2.2, s1.getMaxY(), EPSILON); 
     s1.add(new Year(2000), 99.9); 
     assertEquals(99.9, s1.getMaxY(), EPSILON); 
     s1.add(new Year(2002), -1.1); 
     assertEquals(99.9, s1.getMaxY(), EPSILON); 
     s1.addOrUpdate(new Year(2000), null); 
     assertEquals(2.2, s1.getMaxY(), EPSILON); 
 }
public void testGetMaxY430() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     assertTrue(Double.isNaN(s1.getMaxY())); 
     s1.add(new Year(2008), 1.1); 
     assertEquals(1.1, s1.getMaxY(), EPSILON); 
     s1.add(new Year(2009), 2.2); 
     assertEquals(2.2, s1.getMaxY(), EPSILON); 
     s1.add(new Year(2000), 99.9); 
     assertEquals(99.9, s1.getMaxY(), EPSILON); 
     s1.add(new Year(2002), -1.1); 
     assertEquals(99.9, s1.getMaxY(), EPSILON); 
     s1.addOrUpdate(new Year(2000), null); 
     assertEquals(2.2, s1.getMaxY(), EPSILON); 
     s1.addOrUpdate(new Year(2003), null); 
     assertEquals(99.9, s1.getMaxY(), EPSILON); 
 }
public void testGetMaxY431() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     assertTrue(Double.isNaN(s1.getMaxY())); 
     s1.add(new Year(2008), 1.1); 
     assertEquals(1.1, s1.getMaxY(), EPSILON); 
     s1.add(new Year(2009), 2.2); 
     assertEquals(2.2, s1.getMaxY(), EPSILON); 
     s1.add(new Year(2000), 99.9); 
     assertEquals(99.9, s1.getMaxY(), EPSILON); 
     s1.addOrUpdate(new Year(2002), -1.1); 
     assertEquals(99.9, s1.getMaxY(), EPSILON); 
     s1.addOrUpdate(new Year(2003), null); 
     assertEquals(99.9, s1.getMaxY(), EPSILON); 
     s1.addOrUpdate(new Year(2000), null); 
     assertEquals(2.2, s1.getMaxY(), EPSILON); 
 }
public void testRemoveAgedItems3432() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.add(new Year(2009), 1.1); 
     s1.add(new Year(2009), 2.2); 
     s1.add(new Year(2009), 3.3); 
     s1.add(new Year(2009), 4.4); 
     s1.add(new Year(2009), 5.5); 
     s1.add(new Year(2009), 6.6); 
     s1.removeAgedItems(true); 
     assertEquals(2, s1.getItemCount()); 
     assertEquals(new Year(2009), s1.getTimePeriod(0)); 
     assertEquals(new Year(2009), s1.getTimePeriod(1)); 
     assertEquals(1.1, s1.getMinY(), EPSILON); 
     assertEquals(2.2, s1.getMaxY(), EPSILON); 
 }
public void testRemoveAgedItems2433() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     s1.add(new Year(2009), 1.1); 
     s1.add(new Year(2009), 2.2); 
     s1.add(new Year(2009), 3.3); 
     s1.add(new Year(2009), 4.4); 
     s1.add(new Year(2009), 5.5); 
     s1.add(new Year(2009), 6.6); 
     s1.removeAgedItems(true); 
     assertEquals(2, s1.getItemCount()); 
     assertEquals(new Year(2009), s1.getTimePeriod(0)); 
     assertEquals(new Year(2009), s1.getTimePeriod(1)); 
     assertEquals(1.1, s1.getMinY(), EPSILON); 
     assertEquals(2.2, s1.getMaxY(), EPSILON); 
 }
public void testBug1864222436() { 
     TimeSeries s = new TimeSeries("S"); 
     s.add(new Day(19, 8, 2005), 1); 
     boolean pass = true; 
     try { 
         s.createCopy(new Day(1, 12, 2005), new Day(18, 1, 2006)); 
     } catch (CloneNotSupportedException e) { 
         pass = false; 
     } 
     assertTrue(pass); 
 }
public void testHashcode437() { 
     TimeSeries s1 = new TimeSeries("Test Series"); 
     TimeSeries s2 = new TimeSeries("Test Series"); 
     assertTrue(s1.equals(s2)); 
     int h1 = s1.hashCode(); 
     int h2 = s2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testMinIgnoreNaN438() { 
     TimeSeries s1 = new TimeSeries("S1"); 
     assertTrue(Double.isNaN(s1.getMinY())); 
     s1.add(new Year(2008), 1.1); 
     assertEquals(1.1, s1.getMinY(), EPSILON); 
     s1.add(new Year(2009), 2.2); 
     assertEquals(2.2, s1.getMinY(), EPSILON); 
     s1.add(new Year(2000), 99.9); 
     assertEquals(99.9, s1.getMinY(), EPSILON); 
     s1.add(new Year(2002), -1.1); 
     assertEquals(99.9, s1.getMinY(), EPSILON); 
     s1.add(new Year(2003), null); 
     assertEquals(99.9, s1.getMinY(), EPSILON); 
     s1.addOrUpdate(new Year(2000), null); 
     assertEquals(2.2, s1.getMinY(), EPSILON); 
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
