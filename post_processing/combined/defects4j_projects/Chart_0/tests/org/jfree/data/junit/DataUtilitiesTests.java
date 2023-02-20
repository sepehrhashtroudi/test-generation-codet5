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
 * -----------------------
 * DataUtilitiesTests.java
 * -----------------------
 * (C) Copyright 2005-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 03-Mar-2005 : Version 1 (DG);
 * 28-Jan-2009 : Added tests for equal(double[][], double[][]) method (DG);
 * 28-Jan-2009 : Added tests for clone(double[][]) (DG);
 * 04-Feb-2009 : Added tests for new calculateColumnTotal/RowTotal methods (DG);
 *
 */

package org.jfree.data.junit;

import junit.framework.Test;
import junit.framework.TestCase;

import junit.framework.TestSuite;
import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues2D;

/**
 * Some tests for the {@link DataUtilities} class.
 */
public class DataUtilitiesTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DataUtilitiesTests.class);
    }

    /**
     * Tests the createNumberArray2D() method.
     */
public void testCalculateColumnTotal1332() { 
     DefaultKeyedValues2D table = new DefaultKeyedValues2D(); 
     table.addValue(new Double(1.0), "R0", "C0"); 
     table.addValue(new Double(2.0), "R0", "C1"); 
     table.addValue(new Double(3.0), "R1", "C0"); 
     table.addValue(new Double(4.0), "R1", "C1"); 
     assertEquals(4.0, DataUtilities.calculateColumnTotal(table, 0), EPSILON); 
     assertEquals(6.0, DataUtilities.calculateColumnTotal(table, 1), EPSILON); 
     table.setValue(null, "R1", "C1"); 
     assertEquals(2.0, DataUtilities.calculateColumnTotal(table, 1), EPSILON); 
 }
public void testCalculateRowTotal1333() { 
     DefaultKeyedValues2D table = new DefaultKeyedValues2D(); 
     table.addValue(new Double(1.0), "R0", "C0"); 
     table.addValue(new Double(2.0), "R0", "C1"); 
     table.addValue(new Double(3.0), "R1", "C0"); 
     table.addValue(new Double(4.0), "R1", "C1"); 
     assertEquals(4.0, DataUtilities.calculateRowTotal(table, 0), EPSILON); 
     assertEquals(6.0, DataUtilities.calculateRowTotal(table, 1), EPSILON); 
     table.setValue(null, "R1", "C1"); 
     assertEquals(2.0, DataUtilities.calculateRowTotal(table, 1), EPSILON); 
 }
    

    private static final double EPSILON = 0.000000001;

    /**
     * Some checks for the calculateColumnTotal() method.
     */
    

    /**
     * Some checks for the calculateColumnTotal() method.
     */
    

    /**
     * Some checks for the calculateRowTotal() method.
     */
    

    /**
     * Some checks for the calculateRowTotal() method.
     */
    

    /**
     * Some tests for the equal(double[][], double[][]) method.
     */
    

    /**
     * Some tests for the clone() method.
     */
    

    /**
     * Runs the test suite using JUnit's text-based runner.
     *
     * @param args  ignored.
     */
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

}
