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
 * StatisticsTests.java
 * --------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2004 : Version 1 (DG);
 * 04-Oct-2004 : Eliminated NumberUtils usage (DG);
 *
 */

package org.jfree.data.statistics.junit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.statistics.Statistics;

/**
 * Tests for the {@link Statistics} class.
 */
public class StatisticsTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StatisticsTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StatisticsTests(String name) {
        super(name);
    }

    /**
     * Some checks for the calculateMean(Number[]) and
     * calculateMean(Number[], boolean) methods.
     */

public void testCalculateMean_Array357() { 
     boolean pass = false; 
     try { 
         Statistics.calculateMean((Number[]) null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         Statistics.calculateMean((Number[]) null, false); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     assertTrue(Double.isNaN(Statistics.calculateMean(new Number[0]))); 
     assertTrue(Double.isNaN(Statistics.calculateMean(new Number[0], false))); 
     Number[] values = new Number[] { new Double(1.0) }; 
     assertEquals(1.0, Statistics.calculateMean(values), EPSILON); 
     assertEquals(1.0, Statistics.calculateMean(values, true), EPSILON); 
     assertEquals(1.0, Statistics.calculateMean(values, false), EPSILON); 
     values = new Number[] { new Double(1.0), null }; 
     assertTrue(Double.isNaN(Statistics.calculateMean(values))); 
     assertTrue(Double.isNaN(Statistics.calculateMean(values, true))); 
     assertEquals(1.0, Statistics.calculateMean(values, false), EPSILON); 
     values = new Number[] { new Double(1.0), new Double(Double.NaN) }; 
     assertTrue(Double.isNaN(Statistics.calculateMean(values))); 
     assertTrue(Double.isNaN(Statistics.calculateMean(values, true))); 
     assertEquals(1.0, Statistics.calculateMean(values, false), EPSILON); 
 } 


public void testGetStdDev358() { 
     boolean pass = false; 
     try { 
         Statistics.getStdDev(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         Statistics.getStdDev(new Double[0]); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     assertTrue(Double.isNaN(Statistics.getStdDev(new Double[] { new Double(1.0) }))); 
 } 


public void testCorrelation2359() { 
     Number[] data1 = new Number[20]; 
     data1[0] = new Double(68); 
     data1[1] = new Double(71); 
     data1[2] = new Double(62); 
     data1[3] = new Double(75); 
     data1[4] = new Double(58); 
     data1[5] = new Double(60); 
     data1[6] = new Double(67); 
     data1[7] = new Double(68); 
     data1[8] = new Double(71); 
     data1[9] = new Double(69); 
     data1[10] = new Double(68); 
     data1[11] = new Double(67); 
     data1[12] = new Double(63); 
     data1[13] = new Double(62); 
     data1[14] = new Double(60); 
     data1[15] = new Double(63); 
     data1[16] = new Double(65); 
     data1[17] = new Double(67); 
     data1[18] = new Double(63); 
     data1[19] = new Double(61); 
     Number[] data2 = new Number[20]; 
     data2[0] = new Double(4.1); 
     data2[1] = new Double(4.6); 
     data2[2] = new Double(3.8); 
     data2[3] = new Double(4.4); 
     data2[4] = new Double(3.2); 
     data2[5] = new Double(3.1); 
     data2[6] = new Double(3.8); 
     data2[7] = new Double(4.1); 
     data2[8] = new Double(4.3); 
     data2[9] = new Double(3.7); 
     data2[10] = new Double(3.5); 
     data2[11] = new Double(3.2); 
     data2[12] = new Double(3.7); 
     data2[13] = new Double(3.3); 
     data2[14] = new Double(3.4); 
     data2[15] = new Double(4.0); 
     data2[16] = new Double(4.1); 
     data2[17] = new Double(3.8); 
     data2[18] = new Double(3.4); 
     data2[19] = new Double(3.6); 
     double r = Statistics.getCorrelation(data1, data2); 
     assertEquals(0.7306356862792885, r, 0.000000000001); 
 } 

    

    /**
     * Some checks for the calculateMean(Collection) and
     * calculateMean(Collection, boolean) methods.
     */
    

    static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the calculateMedian(List, boolean) method.
     */
    

    /**
     * A test for the calculateMedian() method.
     */
    

    /**
     * A test for the calculateMedian() method.
     */
    

    /**
     * A test for the calculateMedian() method.
     */
    

    /**
     * A test for the calculateMedian() method.
     */
    

    /**
     * A test using some real data that caused a problem at one point.
     */
    

    /**
     * A test for the calculateMedian() method.
     */
    

    /**
     * A simple test for the correlation calculation.
     */
    

    /**
     * A simple test for the correlation calculation.
     *
     * http://trochim.human.cornell.edu/kb/statcorr.htm
     */
    

    /**
     * Some checks for the getStdDev() method.
     */
    

}
