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

public void testCreateCategoryDataset2206() { 
     boolean pass = false; 
     String[] rowKeys = { "R1", "R2", "R3" }; 
     String[] columnKeys = { "C1", "C2" }; 
     double[][] data = new double[2][]; 
     data[0] = new double[] { 1.1, 1.2, 1.3 }; 
     data[1] = new double[] { 2.1, 2.2, 2.3 }; 
     CategoryDataset dataset = null; 
     try { 
         dataset = DatasetUtilities.createCategoryDataset(rowKeys, columnKeys, data); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     assertTrue(dataset == null); 
 } 


public void testCalculatePieDatasetTotal274() { 
     DefaultPieDataset d = new DefaultPieDataset(); 
     assertEquals(0.0, DatasetUtilities.calculatePieDatasetTotal(d), EPSILON); 
     d.setValue("A", 1.0); 
     assertEquals(1.0, DatasetUtilities.calculatePieDatasetTotal(d), EPSILON); 
     d.setValue("B", 3.0); 
     assertEquals(4.0, DatasetUtilities.calculatePieDatasetTotal(d), EPSILON); 
 } 


public void testIterateToFindRangeBounds_BoxAndWhiskerXYDataset285() { 
     DefaultBoxAndWhiskerXYDataset dataset = new DefaultBoxAndWhiskerXYDataset("Series 1"); 
     List visibleSeriesKeys = new ArrayList(); 
     visibleSeriesKeys.add("Series 1"); 
     Range xRange = new Range(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY); 
     assertNull(DatasetUtilities.iterateToFindRangeBounds(dataset, visibleSeriesKeys, xRange, false)); 
     dataset.add(new Date(50L), new BoxAndWhiskerItem(5.0, 4.9, 2.0, 8.0, 1.0, 9.0, 0.0, 10.0, new ArrayList())); 
     assertEquals(new Range(5.0, 5.0), DatasetUtilities.iterateToFindRangeBounds(dataset, visibleSeriesKeys, xRange, false)); 
     assertEquals(new Range(1.0, 9.0), DatasetUtilities.iterateToFindRangeBounds(dataset, visibleSeriesKeys, xRange, true)); 
 } 


public void testCreateCategoryDataset1453() { 
     String[] rowKeys = { "R1", "R2", "R3" }; 
     String[] columnKeys = { "C1", "C2" }; 
     double[][] data = new double[3][]; 
     data[0] = new double[] { 1.1, 1.2 }; 
     data[1] = new double[] { 2.1, 2.2 }; 
     data[2] = new double[] { 3.1, 3.2 }; 
     CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys, columnKeys, data); 
     assertTrue(dataset.getRowCount() == 3); 
     assertTrue(dataset.getColumnCount() == 2); 
 } 


public void testIsEmptyOrNullXYDataset454() { 
     XYSeriesCollection dataset = null; 
     assertTrue(DatasetUtilities.isEmptyOrNull(dataset)); 
     dataset = new XYSeriesCollection(); 
     assertTrue(DatasetUtilities.isEmptyOrNull(dataset)); 
     XYSeries s1 = new XYSeries("S1"); 
     dataset.addSeries(s1); 
     assertTrue(DatasetUtilities.isEmptyOrNull(dataset)); 
     s1.add(1.0, 2.0); 
     assertFalse(DatasetUtilities.isEmptyOrNull(dataset)); 
     s1.clear(); 
     assertTrue(DatasetUtilities.isEmptyOrNull(dataset)); 
 } 


public void testFindMaximumDomainValue455() { 
     XYDataset dataset = createXYDataset1(); 
     Number maximum = DatasetUtilities.findMaximumDomainValue(dataset); 
     assertEquals(new Double(3.0), maximum); 
 } 


public void testIterateDomainBounds456() { 
     XYDataset dataset = createXYDataset1(); 
     Range r = DatasetUtilities.iterateDomainBounds(dataset); 
     assertEquals(1.0, r.getLowerBound(), EPSILON); 
     assertEquals(3.0, r.getUpperBound(), EPSILON); 
 } 


public void testIterateDomainBounds_NaN2457() { 
     DefaultIntervalXYDataset dataset = new DefaultIntervalXYDataset(); 
     double[] x1 = new double[] { Double.NaN, 2.0, 3.0 }; 
     double[] x1Start = new double[] { 0.9, Double.NaN, 2.9 }; 
     double[] x1End = new double[] { 1.1, Double.NaN, 3.1 }; 
     double[] y1 = new double[] { 4.0, 5.0, 6.0 }; 
     double[] y1Start = new double[] { 1.09, 2.09, 3.09 }; 
     double[] y1End = new double[] { 1.11, 2.11, 3.11 }; 
     double[][] data1 = new double[][] { x1, x1Start, x1End, y1, y1Start, y1End }; 
     dataset.addSeries("S1", data1); 
     Range r = DatasetUtilities.iterateDomainBounds(dataset, false); 
     assertEquals(2.0, r.getLowerBound(), EPSILON); 
     assertEquals(3.0, r.getUpperBound(), EPSILON); 
     r = DatasetUtilities.iterateDomainBounds(dataset, true); 
     assertEquals(0.9, r.getLowerBound(), EPSILON); 
     assertEquals(3.1, r.getUpperBound(), EPSILON); 
 } 


public void testFindRangeBounds_CategoryDataset459() { 
     CategoryDataset dataset = createCategoryDataset1(); 
     Range r = DatasetUtilities.findRangeBounds(dataset); 
     assertEquals(1.0, r.getLowerBound(), EPSILON); 
     assertEquals(6.0, r.getUpperBound(), EPSILON); 
 } 


public void testFindRangeBounds2460() { 
     YIntervalSeriesCollection dataset = new YIntervalSeriesCollection(); 
     Range r = DatasetUtilities.findRangeBounds(dataset); 
     assertNull(r); 
     YIntervalSeries s1 = new YIntervalSeries("S1"); 
     dataset.addSeries(s1); 
     r = DatasetUtilities.findRangeBounds(dataset); 
     assertNull(r); 
     s1.add(1.0, 2.0, 1.5, 2.5); 
     r = DatasetUtilities.findRangeBounds(dataset); 
     assertEquals(1.5, r.getLowerBound(), EPSILON); 
     assertEquals(2.5, r.getUpperBound(), EPSILON); 
     r = DatasetUtilities.findRangeBounds(dataset, false); 
     assertEquals(2.0, r.getLowerBound(), EPSILON); 
     assertEquals(2.0, r.getUpperBound(), EPSILON); 
     s1.add(2.0, 2.0, 1.4, 2.1); 
     r = DatasetUtilities.findRangeBounds(dataset); 
     assertEquals(1.4, r.getLowerBound(), EPSILON); 
     assertEquals(2.5, r.getUpperBound(), EPSILON); 
     YIntervalSeries s2 = new YIntervalSeries("S2"); 
     dataset.addSeries(s2); 
     r = DatasetUtilities.findRangeBounds(dataset); 
     assertEquals(1.4, r.getLowerBound(), EPSILON); 
     assertEquals(2.5, r.getUpperBound(), EPSILON); 
     s2.add(1.0, 2.0, 1.9, 2.6); 
     r = DatasetUtilities.findRangeBounds(dataset); 
     assertEquals(1.4, r.getLowerBound(), EPSILON); 
     assertEquals(2.6, r.getUpperBound(), EPSILON); 
     r = DatasetUtilities.findRangeBounds(dataset, false); 
     assertEquals(2.0, r.getLowerBound(), EPSILON); 
     assertEquals(2.0, r.getUpperBound(), EPSILON); 
 } 


public void testFindRangeBounds461() { 
     XYDataset dataset = createXYDataset1(); 
     Range r = DatasetUtilities.findRangeBounds(dataset); 
     assertEquals(100.0, r.getLowerBound(), EPSILON); 
     assertEquals(105.0, r.getUpperBound(), EPSILON); 
 } 


public void testIterateRangeBounds3_CategoryDataset462() { 
     Number[][] starts = new Double[2][3]; 
     Number[][] ends = new Double[2][3]; 
     starts[0][0] = new Double(1.0); 
     starts[0][1] = new Double(2.0); 
     starts[0][2] = new Double(3.0); 
     starts[1][0] = new Double(11.0); 
     starts[1][1] = new Double(12.0); 
     starts[1][2] = new Double(13.0); 
     ends[0][0] = new Double(4.0); 
     ends[0][1] = new Double(5.0); 
     ends[0][2] = new Double(6.0); 
     ends[1][0] = new Double(16.0); 
     ends[1][1] = new Double(15.0); 
     ends[1][2] = new Double(14.0); 
     DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(starts, ends); 
     Range r = DatasetUtilities.iterateRangeBounds(d, false); 
     assertEquals(4.0, r.getLowerBound(), EPSILON); 
     assertEquals(16.0, r.getUpperBound(), EPSILON); 
     r = DatasetUtilities.iterateRangeBounds(d, true); 
     assertEquals(1.0, r.getLowerBound(), EPSILON); 
     assertEquals(16.0, r.getUpperBound(), EPSILON); 
 } 


public void testIterateToFindRangeBounds_MultiValueCategoryDataset463() { 
     DefaultMultiValueCategoryDataset dataset = new DefaultMultiValueCategoryDataset(); 
     List visibleSeriesKeys = new ArrayList(); 
     assertNull(DatasetUtilities.iterateToFindRangeBounds(dataset, visibleSeriesKeys, true)); 
     List values = Arrays.asList(new Double[] { new Double(1.0) }); 
     dataset.add(values, "R1", "C1"); 
     visibleSeriesKeys.add("R1"); 
     assertEquals(new Range(1.0, 1.0), DatasetUtilities.iterateToFindRangeBounds(dataset, visibleSeriesKeys, true)); 
     values = Arrays.asList(new Double[] { new Double(2.0), new Double(3.0) }); 
     dataset.add(values, "R1", "C2"); 
     assertEquals(new Range(1.0, 3.0), DatasetUtilities.iterateToFindRangeBounds(dataset, visibleSeriesKeys, true)); 
     values = Arrays.asList(new Double[] { new Double(-1.0), new Double(-2.0) }); 
     dataset.add(values, "R2", "C1"); 
     assertEquals(new Range(1.0, 3.0), DatasetUtilities.iterateToFindRangeBounds(dataset, visibleSeriesKeys, true)); 
     visibleSeriesKeys.add("R2"); 
     assertEquals(new Range(-2.0, 3.0), DatasetUtilities.iterateToFindRangeBounds(dataset, visibleSeriesKeys, true)); 
 } 


public void testBug2849731_3464() { 
     XYIntervalSeriesCollection d = new XYIntervalSeriesCollection(); 
     XYIntervalSeries s = new XYIntervalSeries("S1"); 
     s.add(1.0, Double.NaN, Double.NaN, 1.5, Double.NaN, Double.NaN); 
     d.addSeries(s); 
     Range r = DatasetUtilities.iterateRangeBounds(d); 
     assertEquals(1.5, r.getLowerBound(), EPSILON); 
     assertEquals(1.5, r.getUpperBound(), EPSILON); 
     s.add(1.0, 1.5, Double.NaN, Double.NaN, Double.NaN, 2.5); 
     r = DatasetUtilities.iterateRangeBounds(d); 
     assertEquals(1.5, r.getLowerBound(), EPSILON); 
     assertEquals(2.5, r.getUpperBound(), EPSILON); 
     s.add(1.0, Double.NaN, 0.5, Double.NaN, 3.5, Double.NaN); 
     r = DatasetUtilities.iterateRangeBounds(d); 
     assertEquals(1.5, r.getLowerBound(), EPSILON); 
     assertEquals(3.5, r.getUpperBound(), EPSILON); 
 } 


public void testFindMinimumDomainValue465() { 
     XYDataset dataset = createXYDataset1(); 
     Number minimum = DatasetUtilities.findMinimumDomainValue(dataset); 
     assertEquals(new Double(1.0), minimum); 
 } 


public void testFindStackedRangeBounds_CategoryDataset1466() { 
     CategoryDataset d1 = createCategoryDataset1(); 
     Range r = DatasetUtilities.findStackedRangeBounds(d1); 
     assertEquals(0.0, r.getLowerBound(), EPSILON); 
     assertEquals(15.0, r.getUpperBound(), EPSILON); 
     d1 = createCategoryDataset2(); 
     r = DatasetUtilities.findStackedRangeBounds(d1); 
     assertEquals(-2.0, r.getLowerBound(), EPSILON); 
     assertEquals(2.0, r.getUpperBound(), EPSILON); 
 } 


public void testStackedRangeWithMap467() { 
     CategoryDataset d = createCategoryDataset1(); 
     KeyToGroupMap map = new KeyToGroupMap("G0"); 
     map.mapKeyToGroup("R2", "G1"); 
     Range r = DatasetUtilities.findStackedRangeBounds(d, map); 
     assertEquals(0.0, r.getLowerBound(), EPSILON); 
     assertEquals(9.0, r.getUpperBound(), EPSILON); 
 } 


public void testFindMinimumStackedRangeValue468() { 
     DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
     Number min = DatasetUtilities.findMinimumStackedRangeValue(dataset); 
     assertNull(min); 
     dataset.addValue(1.0, "R1", "C1"); 
     min = DatasetUtilities.findMinimumStackedRangeValue(dataset); 
     assertEquals(0.0, min.doubleValue(), EPSILON); 
     dataset.addValue(2.0, "R2", "C1"); 
     min = DatasetUtilities.findMinimumStackedRangeValue(dataset); 
     assertEquals(0.0, min.doubleValue(), EPSILON); 
     dataset.addValue(-3.0, "R3", "C1"); 
     min = DatasetUtilities.findMinimumStackedRangeValue(dataset); 
     assertEquals(-3.0, min.doubleValue(), EPSILON); 
     dataset.addValue(Double.NaN, "R4", "C1"); 
     min = DatasetUtilities.findMinimumStackedRangeValue(dataset); 
     assertEquals(-3.0, min.doubleValue(), EPSILON); 
 } 


public void testFindMaximumStackedRangeValue469() { 
     DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
     Number max = DatasetUtilities.findMaximumStackedRangeValue(dataset); 
     assertNull(max); 
     dataset.addValue(1.0, "R1", "C1"); 
     max = DatasetUtilities.findMaximumStackedRangeValue(dataset); 
     assertEquals(1.0, max.doubleValue(), EPSILON); 
     dataset.addValue(2.0, "R2", "C1"); 
     max = DatasetUtilities.findMaximumStackedRangeValue(dataset); 
     assertEquals(3.0, max.doubleValue(), EPSILON); 
     dataset.addValue(-3.0, "R3", "C1"); 
     max = DatasetUtilities.findMaximumStackedRangeValue(dataset); 
     assertEquals(3.0, max.doubleValue(), EPSILON); 
     dataset.addValue(Double.NaN, "R4", "C1"); 
     max = DatasetUtilities.findMaximumStackedRangeValue(dataset); 
     assertEquals(3.0, max.doubleValue(), EPSILON); 
 } 


public void testFindMinimumStackedRangeValue2705() { 
     DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 
     dataset.addValue(-1.0, "R1", "C1"); 
     Number min = DatasetUtilities.findMinimumStackedRangeValue(dataset); 
     assertEquals(-1.0, min.doubleValue(), EPSILON); 
     dataset.addValue(-2.0, "R2", "C1"); 
     min = DatasetUtilities.findMinimumStackedRangeValue(dataset); 
     assertEquals(-3.0, min.doubleValue(), EPSILON); 
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
