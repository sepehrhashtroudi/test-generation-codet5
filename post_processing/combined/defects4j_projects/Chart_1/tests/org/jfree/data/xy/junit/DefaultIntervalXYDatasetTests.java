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
 * ----------------------------------
 * DefaultIntervalXYDatasetTests.java
 * ----------------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 23-Oct-2006 : Version 1 (DG);
 * 02-Nov-2006 : Added testAddSeries() method (DG);
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
import org.jfree.data.xy.DefaultIntervalXYDataset;

/**
 * Some tests for the {@link DefaultIntervalXYDataset} class.
 */
public class DefaultIntervalXYDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultIntervalXYDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultIntervalXYDatasetTests(String name) {
        super(name);
    }

    /**
     * Some checks for the getSeriesCount() method.
     */
public void testGetSeriesKey763() { 
     DefaultIntervalXYDataset d = createSampleDataset1(); 
     assertEquals("S1", d.getSeriesKey(0)); 
     assertEquals("S2", d.getSeriesKey(1)); 
     boolean pass = false; 
     try { 
         d.getSeriesKey(-1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         d.getSeriesKey(2); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testGetYValue764() { 
     DefaultIntervalXYDataset d = createSampleDataset1(); 
     assertEquals(1.1, d.getYValue(0, 0), EPSILON); 
     assertEquals(2.1, d.getYValue(0, 1), EPSILON); 
     assertEquals(3.1, d.getYValue(0, 2), EPSILON); 
     assertEquals(11.1, d.getYValue(0, 3), EPSILON); 
     assertEquals(12.1, d.getYValue(0, 4), EPSILON); 
     assertEquals(13.1, d.getYValue(0, 5), EPSILON); 
     assertEquals(14.1, d.getYValue(0, 6), EPSILON); 
 }
public void testGetStartXValue765() { 
     DefaultIntervalXYDataset d = createSampleDataset1(); 
     assertEquals(1.1, d.getStartXValue(0, 0), EPSILON); 
     assertEquals(2.1, d.getStartXValue(0, 1), EPSILON); 
     assertEquals(3.1, d.getStartXValue(0, 2), EPSILON); 
     assertEquals(11.1, d.getStartXValue(0, 3), EPSILON); 
     assertEquals(12.1, d.getStartXValue(0, 4), EPSILON); 
     assertEquals(13.1, d.getStartXValue(0, 5), EPSILON); 
     assertEquals(14.1, d.getStartXValue(0, 6), EPSILON); 
     assertEquals(15.1, d.getStartXValue(0, 7), EPSILON); 
 }
public void testGetStartXValue766() { 
     DefaultIntervalXYDataset d = createSampleDataset1(); 
     assertEquals(1.1, d.getStartXValue(0, 0), EPSILON); 
     assertEquals(1.1, d.getStartXValue(0, 1), EPSILON); 
     assertEquals(2.1, d.getStartXValue(0, 2), EPSILON); 
     assertEquals(3.1, d.getStartXValue(0, 3), EPSILON); 
     assertEquals(4.1, d.getStartXValue(0, 4), EPSILON); 
     assertEquals(5.1, d.getStartXValue(0, 5), EPSILON); 
     assertEquals(6.1, d.getStartXValue(0, 6), EPSILON); 
 }
public void testGetStartYValue767() { 
     DefaultIntervalXYDataset d = createSampleDataset1(); 
     assertEquals(1.1, d.getStartYValue(0, 0), EPSILON); 
     assertEquals(2.1, d.getStartYValue(0, 1), EPSILON); 
     assertEquals(3.1, d.getStartYValue(0, 2), EPSILON); 
     assertEquals(11.1, d.getStartYValue(0, 3), EPSILON); 
     assertEquals(12.1, d.getStartYValue(0, 4), EPSILON); 
     assertEquals(13.1, d.getStartYValue(0, 5), EPSILON); 
     assertEquals(14.1, d.getStartYValue(0, 6), EPSILON); 
 }
public void testGetStartYValue768() { 
     DefaultIntervalXYDataset d = createSampleDataset1(); 
     assertEquals(1.1, d.getStartYValue(0, 0), EPSILON); 
     assertEquals(2.1, d.getStartYValue(0, 1), EPSILON); 
     assertEquals(3.1, d.getStartYValue(0, 2), EPSILON); 
     assertEquals(11.1, d.getStartYValue(0, 3), EPSILON); 
     assertEquals(12.1, d.getStartYValue(0, 4), EPSILON); 
     assertEquals(13.1, d.getStartYValue(0, 5), EPSILON); 
     assertEquals(14.1, d.getStartYValue(0, 6), EPSILON); 
     assertEquals(15.1, d.getEndYValue(0, 0), EPSILON); 
     assertEquals(16.1, d.getEndYValue(0, 1), EPSILON); 
 }
public void testGetStartYValue769() { 
     DefaultIntervalXYDataset d = createSampleDataset1(); 
     assertEquals(1.1, d.getStartYValue(0, 0), EPSILON); 
     assertEquals(2.1, d.getStartYValue(0, 1), EPSILON); 
     assertEquals(3.1, d.getStartYValue(0, 2), EPSILON); 
     assertEquals(11.1, d.getStartYValue(0, 3), EPSILON); 
     assertEquals(12.1, d.getStartYValue(0, 4), EPSILON); 
     assertEquals(13.1, d.getEndYValue(0, 0), EPSILON); 
     assertEquals(14.1, d.getEndYValue(0, 1), EPSILON); 
 }
public void testAddSeries770() { 
     DefaultIntervalXYDataset d = new DefaultIntervalXYDataset(); 
     d.addSeries("S1", new double[][] { { 1.0 }, { 2.0 } }); 
     assertEquals("S1", d.getSeriesKey(0)); 
     d.addSeries("S1", new double[][] { { 11.0 }, { 12.0 } }); 
     assertEquals(1, d.getSeriesCount()); 
     assertEquals("S1", d.getSeriesKey(1)); 
     boolean pass = false; 
     try { 
         d.addSeries(null, new double[][] { { 1.0 }, { 2.0 } }); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testAddSeries771() { 
     DefaultIntervalXYDataset d = new DefaultIntervalXYDataset(); 
     d.addSeries("S1", new double[][] { { 1.0 }, { 2.0 } }); 
     assertEquals(1, d.getSeriesCount()); 
     assertEquals("S1", d.getSeriesKey(0)); 
     d.addSeries("S1", new double[][] { { 11.0 }, { 12.0 } }); 
     assertEquals(1, d.getSeriesCount()); 
     assertEquals("S1", d.getSeriesKey(1)); 
     boolean pass = false; 
     try { 
         d.addSeries(null, new double[][] { { 1.0 }, { 2.0 } }); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testCloning2772() { 
     DefaultIntervalXYDataset d1 = new DefaultIntervalXYDataset(); 
     double[] x1 = new double[] { 1.0, 2.0, 3.0 }; 
     double[] x1Start = new double[] { 0.9, 1.9, 2.9 }; 
     double[] x1End = new double[] { 1.1, 2.1, 3.1 }; 
     double[] y1 = new double[] { 4.0, 5.0, 6.0 }; 
     double[] y1Start = new double[] { 1.09, 2.09, 3.09 }; 
     double[] y1End = new double[] { 1.11, 2.11, 3.11 }; 
     double[][] data1 = new double[][] { x1, x1Start, x1End, y1, y1Start, y1End }; 
     d1.addSeries("S1", data1); 
     DefaultIntervalXYDataset d2 = null; 
     try { 
         d2 = (DefaultIntervalXYDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     x1[0] = 111.1; 
     assertFalse(d1.equals(d2)); 
 }
    

    /**
     * Some checks for the getSeriesKey(int) method.
     */
    

    /**
     * Some checks for the getItemCount() method.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the getXValue() method.
     */
    

    /**
     * Some checks for the getYValue() method.
     */
    

    /**
     * Some checks for the getStartXValue() method.
     */
    

    /**
     * Some checks for the getEndXValue() method.
     */
    

    /**
     * Some checks for the getStartYValue() method.
     */
    

    /**
     * Some checks for the getEndYValue() method.
     */
    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Another test for cloning.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the indexOf(Comparable) method.
     */
    

    /**
     * Some tests for the addSeries() method.
     */
    

    /**
     * Creates a sample dataset for testing.
     *
     * @return A sample dataset.
     */
    public DefaultIntervalXYDataset createSampleDataset1() {
        DefaultIntervalXYDataset d = new DefaultIntervalXYDataset();
        double[] x1 = new double[] {1.0, 2.0, 3.0};
        double[] x1Start = new double[] {0.9, 1.9, 2.9};
        double[] x1End = new double[] {1.1, 2.1, 3.1};
        double[] y1 = new double[] {4.0, 5.0, 6.0};
        double[] y1Start = new double[] {1.09, 2.09, 3.09};
        double[] y1End = new double[] {1.11, 2.11, 3.11};
        double[][] data1 = new double[][] {x1, x1Start, x1End, y1, y1Start,
                y1End};
        d.addSeries("S1", data1);

        double[] x2 = new double[] {11.0, 12.0, 13.0};
        double[] x2Start = new double[] {10.9, 11.9, 12.9};
        double[] x2End = new double[] {11.1, 12.1, 13.1};
        double[] y2 = new double[] {14.0, 15.0, 16.0};
        double[] y2Start = new double[] {11.09, 12.09, 13.09};
        double[] y2End = new double[] {11.11, 12.11, 13.11};
        double[][] data2 = new double[][] {x2, x2Start, x2End, y2, y2Start,
                y2End};
        d.addSeries("S2", data2);
        return d;
    }

}
