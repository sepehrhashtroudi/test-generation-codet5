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
 * --------------------------
 * DatasetUtilitiesTests.java
 * --------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 18-Sep-2003 : Version 1 (DG);
 * 23-Mar-2004 : Added test for maximumStackedRangeValue() method (DG);
 * 04-Oct-2004 : Eliminated NumberUtils usage (DG);
 * 07-Jan-2005 : Updated for method name changes (DG);
 * 03-Feb-2005 : Added testFindStackedRangeBounds2() method (DG);
 * 26-Sep-2007 : Added testIsEmptyOrNullXYDataset() method (DG);
 * 28-Mar-2008 : Added and renamed various tests (DG);
 * 08-Oct-2008 : New tests to support patch 2131001 and related 
 *               changes (DG);
 * 25-Mar-2009 : Added tests for new iterateToFindRangeBounds() method (DG);
 * 16-May-2009 : Added
 *               testIterateToFindRangeBounds_MultiValueCategoryDataset() (DG);
 * 10-Sep-2009 : Added tests for bug 2849731 (DG);
 *
 */

package org.jfree.data.general.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.KeyToGroupMap;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.function.Function2D;
import org.jfree.data.function.LineFunction2D;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.pie.PieDataset;
import org.jfree.data.statistics.BoxAndWhiskerItem;
import org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;
import org.jfree.data.statistics.MultiValueCategoryDataset;
import org.jfree.data.xy.DefaultIntervalXYDataset;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.TableXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYIntervalSeries;
import org.jfree.data.xy.XYIntervalSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.YIntervalSeries;
import org.jfree.data.xy.YIntervalSeriesCollection;

/**
 * Tests for the {@link DatasetUtilities} class.
 */
public class DatasetUtilitiesTests extends TestCase {

    private static final double EPSILON = 0.0000000001;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DatasetUtilitiesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DatasetUtilitiesTests(String name) {
        super(name);
    }

    /**
     * Some tests to verify that Java does what I think it does!
     */
public void testGetMaxRegularValue2757() throws Exception { assertEquals(Double.valueOf(1.0), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList()).getMaxRegularValue()); }
public void testGetMaxRegularValue2758() throws Exception { assertEquals(Double.valueOf(3.0), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList()).getMaxRegularValue()); }
public void testIterateDomainBounds4536() { XYDataset dataset = createXYDataset1(); Range r = DatasetUtilities.iterateDomainBounds(dataset); assertEquals(1.0, r.getLowerBound(), EPSILON); assertEquals(3.0, r.getUpperBound(), EPSILON); }
public void testFindRangeBoundsXYDataset4562() { XYDataset dataset = createXYDataset1(); Range r = DatasetUtilities.findRangeBounds(dataset); assertEquals(1.0, r.getLowerBound(), EPSILON); assertEquals(3.0, r.getUpperBound(), EPSILON); }
public void testFindRangeBounds4564() { XYDataset dataset = createXYDataset1(); Range r = DatasetUtilities.findRangeBounds(dataset, true); assertEquals(1.0, r.getLowerBound(), EPSILON); assertEquals(3.0, r.getUpperBound(), EPSILON); }
public void testIterateRangeBounds4584() { XYDataset dataset = createXYDataset1(); Range r = DatasetUtilities.iterateRangeBounds(dataset); assertEquals(1.0, r.getLowerBound(), EPSILON); assertEquals(3.0, r.getUpperBound(), EPSILON); }
public void testFindMaximumDomainValue4621() { XYDataset dataset = createXYDataset1(); Number max = DatasetUtilities.findMaximumDomainValue(dataset); assertNull(max); }
public void testGetValues4787() { DefaultMultiValueCategoryDataset dataset = new DefaultMultiValueCategoryDataset(); dataset.add(new ArrayList(), "R1", "C1"); dataset.add(new ArrayList(), "R2", "C2"); dataset.add(new ArrayList(), "R3", "C3"); List values = dataset.getValues(0, 0); assertEquals(2, values.size()); assertTrue(values.contains("R1")); assertTrue(values.contains("R2")); assertTrue(values.contains("R3")); }
public void testGetValues4788() { DefaultMultiValueCategoryDataset dataset = new DefaultMultiValueCategoryDataset(); dataset.add(new ArrayList(), "R1", "C1"); dataset.add(new ArrayList(), "R2", "C2"); dataset.add(new ArrayList(), "R3", "C3"); dataset.add(new ArrayList(), "R4", "C4"); List values = dataset.getValues(0, 0); assertEquals(2, values.size()); assertTrue(values.contains("R1")); assertTrue(values.contains("R2")); assertTrue(values.contains("R3")); assertTrue(values.contains("R4"));
}

public void testGetDomainLowerBound6639() { XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.1); s1.add(2.0, 2.2); XYSeries s2 = new XYSeries("S2"); s2.add(1.0, 1.1); s2.add(2.0, 2.2); XYSeriesCollection dataset = new XYSeriesCollection(); dataset.addSeries(s1); dataset.addSeries(s2); assertEquals(1.0, dataset.getDomainLowerBound(false), EPSILON); assertEquals(1.0, dataset.getDomainLowerBound(true), EPSILON);
}

public void testGetDomainLowerBound6640() { XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.1); s1.add(2.0, 2.2); XYSeries s2 = new XYSeries("S2"); s2.add(1.0, 1.1); s2.add(2.0, 2.2); XYSeriesCollection dataset = new XYSeriesCollection(); dataset.addSeries(s1); dataset.addSeries(s2); assertEquals(1.0, dataset.getDomainLowerBound(true), EPSILON); assertEquals(1.0, dataset.getDomainLowerBound(false), EPSILON);
}

public void testGetDomainLowerBound6641() { XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.1); s1.add(2.0, 2.2); XYSeries s2 = new XYSeries("S2"); s2.add(1.0, 1.1); s2.add(2.0, 2.2); XYSeriesCollection dataset = new XYSeriesCollection(); dataset.addSeries(s1); dataset.addSeries(s2); double x1 = dataset.getDomainLowerBound(true); double x2 = dataset.getDomainLowerBound(false); assertEquals(x1, x2, EPSILON);
}

public void testGetDomainUpperBound6643() { XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.1); s1.add(2.0, 2.2); XYSeries s2 = new XYSeries("S2"); s2.add(1.0, 1.1); s2.add(2.0, 2.2); XYSeriesCollection dataset = new XYSeriesCollection(); dataset.addSeries(s1); dataset.addSeries(s2); assertEquals(2.5, dataset.getDomainUpperBound(true), EPSILON); assertEquals(2.5, dataset.getDomainUpperBound(false), EPSILON);
}

public void testGetUpperBound7939() { System.out.println("getUpperBound"); Range r1 = new Range(0.0, 1.0); assertEquals(1.0, r1.getUpperBound(), 0.001); r1 = new Range(1.0, 2.0); assertEquals(2.0, r1.getUpperBound(), 0.001); r1 = new Range(2.0, 3.0); assertEquals(3.0, r1.getUpperBound(), 0.001); }
public void testGetYLowValue8600() { YIntervalSeries s1 = new YIntervalSeries("S1"); s1.add(1.0, 2.0, 3.0, 4.0); s1.add(2.0, 4.0, 5.0, 6.0); assertEquals(3.0, s1.getYLowValue(0), EPSILON); assertEquals(5.0, s1.getYLowValue(1), EPSILON); assertEquals(6.0, s1.getYLowValue(2), EPSILON); }
public void testGetYLowValue8601() { YIntervalSeries s1 = new YIntervalSeries("S1"); s1.add(0.0, 0.5, 0.5, 0.5); assertEquals(0.5, s1.getYLowValue(0), EPSILON); s1.add(1.0, 1.5, 1.5, 1.5); assertEquals(1.5, s1.getYLowValue(0), EPSILON); s1.add(2.0, 2.5, 2.5, 2.5); assertEquals(2.5, s1.getYLowValue(1), EPSILON);
}

public void testGetYHighValue8602() { YIntervalSeries s1 = new YIntervalSeries("S1"); s1.add(0.0, 0.5, 0.5, 0.5); s1.add(1.0, 1.5, 1.5, 1.5); s1.add(2.0, 2.5, 2.5, 2.5); assertEquals(0.5, s1.getYHighValue(0), EPSILON); assertEquals(1.5, s1.getYHighValue(1), EPSILON); assertEquals(2.5, s1.getYHighValue(2), EPSILON);
}

public void testGetYHighValue8603() { YIntervalSeries s1 = new YIntervalSeries("S1"); s1.add(0.0, 0.5, 0.5, 0.5); assertEquals(0.5, s1.getYHighValue(0), EPSILON); s1.add(1.0, 1.5, 1.5, 1.5); assertEquals(1.5, s1.getYHighValue(0), EPSILON); s1.add(2.0, 2.5, 2.5, 2.5); assertEquals(2.5, s1.getYHighValue(1), EPSILON);
}

    

    /**
     * Some tests for the calculatePieDatasetTotal() method.
     */
    

    /**
     * Some tests for the findDomainBounds() method.
     */
    

    /**
     * This test checks that the standard method has 'includeInterval'
     * defaulting to true.
     */
    

    /**
     * This test checks that when the 'includeInterval' flag is false, the
     * bounds come from the regular x-values.
     */
    

    /**
     * This test checks that NaN values are ignored.
     */
    

    /**
     * Some tests for the iterateDomainBounds() method.
     */
    

    /**
     * Check that NaN values in the dataset are ignored.
     */
    

    /**
     * Check that NaN values in the IntervalXYDataset are ignored.
     */
    

    /**
     * Some tests for the findRangeBounds() for a CategoryDataset method.
     */
    

    /**
     * Some tests for the findRangeBounds() method on an XYDataset.
     */
    

    /**
     * A test for the findRangeBounds(XYDataset) method using
     * an IntervalXYDataset.
     */
    

    /**
     * Some tests for the iterateRangeBounds() method.
     */
    

    /**
     * Some checks for the iterateRangeBounds() method.
     */
    

    /**
     * Some checks for the iterateRangeBounds() method using an
     * IntervalCategoryDataset.
     */
    

    /**
     * Some tests for the iterateRangeBounds() method.
     */
    

    /**
     * Check the range returned when a series contains a null value.
     */
    

    /**
     * Some checks for the iterateRangeBounds() method.
     */
    

    /**
     * Some checks for the range bounds of a dataset that implements the
     * {@link IntervalXYDataset} interface.
     */
    

    /**
     * Some tests for the findMinimumDomainValue() method.
     */
    

    /**
     * Some tests for the findMaximumDomainValue() method.
     */
    

    /**
     * Some tests for the findMinimumRangeValue() method.
     */
    

    /**
     * Some tests for the findMaximumRangeValue() method.
     */
    

    /**
     * A quick test of the min and max range value methods.
     */
    

    /**
     * A test to reproduce bug report 803660.
     */
    

    /**
     * A simple test for the cumulative range calculation.  The sequence of
     * "cumulative" values are considered to be { 0.0, 10.0, 25.0, 18.0 } so
     * the range should be 0.0 -> 25.0.
     */
    

    /**
     * A further test for the cumulative range calculation.
     */
    

    /**
     * A further test for the cumulative range calculation.
     */
    

    /**
     * Check that the findCumulativeRangeBounds() method ignores Double.NaN
     * values.
     */
    

    /**
     * Test the creation of a dataset from an array.
     */
    

    /**
     * Test the creation of a dataset from an array.  This time is should fail
     * because the array dimensions are around the wrong way.
     */
    

    /**
     * Test for a bug reported in the forum:
     *
     * http://www.jfree.org/phpBB2/viewtopic.php?t=7903
     */
    

    /**
     * Some checks for the findStackedRangeBounds() method.
     */
    

    /**
     * Some checks for the findStackedRangeBounds() method.
     */
    

    /**
     * Some checks for the findStackedRangeBounds(CategoryDataset,
     * KeyToGroupMap) method.
     */
    

    /**
     * Some checks for the findStackedRangeBounds() method.
     */
    

    /**
     * Some checks for the findStackedRangeBounds() method.
     */
    

    /**
     * Tests the stacked range extent calculation.
     */
    

    /**
     * Some checks for the isEmptyOrNull(XYDataset) method.
     */
    

    /**
     * Some checks for the limitPieDataset() methods.
     */
    

    /**
     * Some checks for the sampleFunction2D() method.
     */
    

    /**
     * A simple check for the findMinimumStackedRangeValue() method.
     */
    

    /**
     * A simple check for the findMaximumStackedRangeValue() method.
     */
    

    /**
     * A simple check for the findMaximumStackedRangeValue() method.
     */
    

    /**
     * A simple check for the findMaximumStackedRangeValue() method.
     */
    

    /**
     * Creates a dataset for testing.
     *
     * @return A dataset.
     */
    private CategoryDataset createCategoryDataset1() {
        DefaultCategoryDataset result = new DefaultCategoryDataset();
        result.addValue(1.0, "R0", "C0");
        result.addValue(1.0, "R1", "C0");
        result.addValue(1.0, "R2", "C0");
        result.addValue(4.0, "R0", "C1");
        result.addValue(5.0, "R1", "C1");
        result.addValue(6.0, "R2", "C1");
        return result;
    }

    /**
     * Creates a dataset for testing.
     *
     * @return A dataset.
     */
    private CategoryDataset createCategoryDataset2() {
        DefaultCategoryDataset result = new DefaultCategoryDataset();
        result.addValue(1.0, "R0", "C0");
        result.addValue(-2.0, "R1", "C0");
        result.addValue(2.0, "R0", "C1");
        result.addValue(-1.0, "R1", "C1");
        return result;
    }


    /**
     * Creates a dataset for testing.
     *
     * @return A dataset.
     */
    private XYDataset createXYDataset1() {
        XYSeries series1 = new XYSeries("S1");
        series1.add(1.0, 100.0);
        series1.add(2.0, 101.0);
        series1.add(3.0, 102.0);
        XYSeries series2 = new XYSeries("S2");
        series2.add(1.0, 103.0);
        series2.add(2.0, null);
        series2.add(3.0, 105.0);
        XYSeriesCollection result = new XYSeriesCollection();
        result.addSeries(series1);
        result.addSeries(series2);
        result.setIntervalWidth(0.0);
        return result;
    }

    /**
     * Creates a sample dataset for testing purposes.
     *
     * @return A sample dataset.
     */
    private TableXYDataset createTableXYDataset1() {
        DefaultTableXYDataset dataset = new DefaultTableXYDataset();

        XYSeries s1 = new XYSeries("Series 1", true, false);
        s1.add(1.0, 1.0);
        s1.add(2.0, 2.0);
        dataset.addSeries(s1);

        XYSeries s2 = new XYSeries("Series 2", true, false);
        s2.add(1.0, -2.0);
        s2.add(2.0, -1.0);
        dataset.addSeries(s2);

        return dataset;
    }

    /**
     * Some checks for the iteratorToFindRangeBounds(XYDataset...) method.
     */
    

    /**
     * Some tests for the iterateToFindRangeBounds() method.
     */
    

    /**
     * Some checks for the iterateToFindRangeBounds() method when applied to
     * a BoxAndWhiskerXYDataset.
     */
    

    /**
     * Some checks for the iterateToFindRangeBounds(CategoryDataset...)
     * method.
     */
    

    /**
     * Some checks for the iterateToFindRangeBounds(CategoryDataset...) method
     * with a {@link MultiValueCategoryDataset}.
     */
    

    /**
     * Some checks for the iterateRangeBounds() method when passed an
     * IntervalCategoryDataset.
     */
    
// Defects4J: flaky method
//     public void testIterateRangeBounds_IntervalCategoryDataset() {
//         TestIntervalCategoryDataset d = new TestIntervalCategoryDataset();
//         d.addItem(1.0, 2.0, 3.0, "R1", "C1");
//         assertEquals(new Range(1.0, 3.0),
//                 DatasetUtilities.iterateRangeBounds(d));
// 
//         d = new TestIntervalCategoryDataset();
//         d.addItem(2.5, 2.0, 3.0, "R1", "C1");
//         assertEquals(new Range(2.0, 3.0),
//                 DatasetUtilities.iterateRangeBounds(d));
// 
//         d = new TestIntervalCategoryDataset();
//         d.addItem(4.0, 2.0, 3.0, "R1", "C1");
//         assertEquals(new Range(2.0, 4.0),
//                 DatasetUtilities.iterateRangeBounds(d));
// 
//         d = new TestIntervalCategoryDataset();
//         d.addItem(0.0, 2.0, 3.0, "R1", "C1");
//         assertEquals(new Range(2.0, 3.0),
//                 DatasetUtilities.iterateRangeBounds(d));
// 
//         // try some nulls
//         d = new TestIntervalCategoryDataset();
//         d.addItem(null, null, null, "R1", "C1");
//         assertNull(DatasetUtilities.iterateRangeBounds(d));
// 
//         d = new TestIntervalCategoryDataset();
//         d.addItem(1.0, 0.0, 0.0, "R1", "C1");
//         assertEquals(new Range(1.0, 1.0),
//                 DatasetUtilities.iterateRangeBounds(d));
// 
//         d = new TestIntervalCategoryDataset();
//         d.addItem(0.0, 1.0, 0.0, "R1", "C1");
//         assertEquals(new Range(1.0, 1.0),
//                 DatasetUtilities.iterateRangeBounds(d));
// 
//         d = new TestIntervalCategoryDataset();
//         d.addItem(0.0, 0.0, 1.0, "R1", "C1");
//         assertEquals(new Range(1.0, 1.0),
//                 DatasetUtilities.iterateRangeBounds(d));
//     }

    /**
     * A test for bug 2849731.
     */
    
// Defects4J: flaky method
//     public void testBug2849731() {
//         TestIntervalCategoryDataset d = new TestIntervalCategoryDataset();
//         d.addItem(2.5, 2.0, 3.0, "R1", "C1");
//         d.addItem(4.0, 0.0, 0.0, "R2", "C1");
//         assertEquals(new Range(2.0, 4.0),
//                 DatasetUtilities.iterateRangeBounds(d));
//     }

    /**
     * Another test for bug 2849731.
     */
    

    /**
     * Yet another test for bug 2849731.
     */
    

}
