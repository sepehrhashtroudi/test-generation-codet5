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
 * ------------------------------
 * TimeSeriesCollectionTests.java
 * ------------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 01-May-2003 : Version 1 (DG);
 * 04-Dec-2003 : Added a test for the getSurroundingItems() method (DG);
 * 08-May-2007 : Added testIndexOf() method (DG);
 * 18-May-2009 : Added testFindDomainBounds() (DG);
 *
 */

package org.jfree.data.time.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import java.util.List;
import java.util.TimeZone;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.Range;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.time.Day;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimePeriodAnchor;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;

/**
 * A collection of test cases for the {@link TimeSeriesCollection} class.
 */
public class TimeSeriesCollectionTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(TimeSeriesCollectionTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public TimeSeriesCollectionTests(String name) {
        super(name);
    }

    /**
     * Some tests for the equals() method.
     */
public void testRemoveSeries1422() { 
     TimeSeriesCollection c1 = new TimeSeriesCollection(); 
     TimeSeries s1 = new TimeSeries("Series 1"); 
     TimeSeries s2 = new TimeSeries("Series 2"); 
     TimeSeries s3 = new TimeSeries("Series 3"); 
     TimeSeries s4 = new TimeSeries("Series 4"); 
     c1.addSeries(s1); 
     c1.addSeries(s2); 
     c1.addSeries(s3); 
     c1.addSeries(s4); 
     c1.removeSeries(s3); 
     TimeSeries s = c1.getSeries(2); 
     boolean b1 = s.equals(s4); 
     assertTrue(b1); 
 }
public void testRemoveSeries_int1423() { 
     TimeSeriesCollection c1 = new TimeSeriesCollection(); 
     TimeSeries s1 = new TimeSeries("Series 1"); 
     TimeSeries s2 = new TimeSeries("Series 2"); 
     TimeSeries s3 = new TimeSeries("Series 3"); 
     TimeSeries s4 = new TimeSeries("Series 4"); 
     c1.addSeries(s1); 
     c1.addSeries(s2); 
     c1.addSeries(s3); 
     c1.addSeries(s4); 
     c1.removeSeries(2); 
     TimeSeries s = c1.getSeries(2); 
     boolean b1 = s.equals(s4); 
     assertTrue(b1); 
 }
    

    /**
     * Tests the remove series method.
     */
    

    /**
     * Some checks for the {@link TimeSeriesCollection#removeSeries(int)}
     * method.
     */
    

    /**
     * Test the getSurroundingItems() method to ensure it is returning the
     * values we expect.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Creates a time series for testing.
     *
     * @return A time series.
     */
    private TimeSeries createSeries() {
        RegularTimePeriod t = new Day();
        TimeSeries series = new TimeSeries("Test");
        series.add(t, 1.0);
        t = t.next();
        series.add(t, 2.0);
        t = t.next();
        series.add(t, null);
        t = t.next();
        series.add(t, 4.0);
        return series;
    }

    /**
     * A test for bug report 1170825.
     */
    

    /**
     * Some tests for the indexOf() method.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * This method provides a check for the bounds calculated using the
     * {@link DatasetUtilities#findDomainBounds(org.jfree.data.xy.XYDataset,
     * java.util.List, boolean)} method.
     */
    
// Defects4J: flaky method
//     public void testFindDomainBounds() {
//         TimeSeriesCollection dataset = new TimeSeriesCollection();
//         List visibleSeriesKeys = new java.util.ArrayList();
//         Range r = DatasetUtilities.findDomainBounds(dataset, visibleSeriesKeys,
//                 true);
//         assertNull(r);
// 
//         TimeSeries s1 = new TimeSeries("S1");
//         dataset.addSeries(s1);
//         visibleSeriesKeys.add("S1");
//         r = DatasetUtilities.findDomainBounds(dataset, visibleSeriesKeys, true);
//         assertNull(r);
// 
//         // store the current time zone
//         TimeZone saved = TimeZone.getDefault();
//         TimeZone.setDefault(TimeZone.getTimeZone("Europe/Paris"));
// 
//         s1.add(new Year(2008), 8.0);
//         r = DatasetUtilities.findDomainBounds(dataset, visibleSeriesKeys, true);
//         assertEquals(1199142000000.0, r.getLowerBound(), EPSILON);
//         assertEquals(1230764399999.0, r.getUpperBound(), EPSILON);
// 
//         TimeSeries s2 = new TimeSeries("S2");
//         dataset.addSeries(s2);
//         s2.add(new Year(2009), 9.0);
//         s2.add(new Year(2010), 10.0);
//         r = DatasetUtilities.findDomainBounds(dataset, visibleSeriesKeys, true);
//         assertEquals(1199142000000.0, r.getLowerBound(), EPSILON);
//         assertEquals(1230764399999.0, r.getUpperBound(), EPSILON);
// 
//         visibleSeriesKeys.add("S2");
//         r = DatasetUtilities.findDomainBounds(dataset, visibleSeriesKeys, true);
//         assertEquals(1199142000000.0, r.getLowerBound(), EPSILON);
//         assertEquals(1293836399999.0, r.getUpperBound(), EPSILON);
// 
//         // restore the default time zone
//         TimeZone.setDefault(saved);
//     }

    /**
     * Basic checks for cloning.
     */
    

}
