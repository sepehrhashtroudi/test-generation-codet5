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
 * -------------------------------------------
 * DefaultStatisticalCategoryDatasetTests.java
 * -------------------------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 05-Feb-2005 : Version 1 (DG);
 * 03-Aug-2006 : Added testGetRangeBounds() method (DG);
 * 28-Sep-2007 : Enhanced testCloning() method (DG);
 * 02-Oct-2007 : Added new bounds tests (DG);
 * 03-Oct-2007 : Added testRemove() method (DG);
 *
 */

package org.jfree.data.statistics.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.Range;
import org.jfree.data.UnknownKeyException;
import org.jfree.data.statistics.DefaultStatisticalCategoryDataset;

/**
 * Tests for the {@link DefaultStatisticalCategoryDataset} class.
 */
public class DefaultStatisticalCategoryDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultStatisticalCategoryDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultStatisticalCategoryDatasetTests(String name) {
        super(name);
    }

    /**
     * Some checks for the getRangeBounds() method.
     */

public void testGetRangeBounds96() { 
     DefaultStatisticalCategoryDataset d = new DefaultStatisticalCategoryDataset(); 
     assertNull(d.getRangeBounds(true)); 
     d.add(4.5, 1.0, "R1", "C1"); 
     assertEquals(new Range(4.5, 4.5), d.getRangeBounds(false)); 
     assertEquals(new Range(3.5, 5.5), d.getRangeBounds(true)); 
     d.add(0.5, 2.0, "R1", "C2"); 
     assertEquals(new Range(0.5, 4.5), d.getRangeBounds(false)); 
     assertEquals(new Range(-1.5, 5.5), d.getRangeBounds(true)); 
     d.add(Double.NaN, 0.0, "R1", "C3"); 
     assertEquals(new Range(0.5, 4.5), d.getRangeBounds(false)); 
     assertEquals(new Range(-1.5, 5.5), d.getRangeBounds(true)); 
     d.add(Double.NEGATIVE_INFINITY, 0.0, "R1", "C3"); 
     assertEquals(new Range(Double.NEGATIVE_INFINITY, 4.5), d.getRangeBounds(false)); 
     assertEquals(new Range(Double.NEGATIVE_INFINITY, 5.5), d.getRangeBounds(true)); 
     d.add(Double.POSITIVE_INFINITY, 0.0, "R1", "C3"); 
     assertEquals(new Range(0.5, Double.POSITIVE_INFINITY), d.getRangeBounds(false)); 
     assertEquals(new Range(-1.5, Double.POSITIVE_INFINITY), d.getRangeBounds(true)); 
 } 


public void testCloning97() { 
     DefaultStatisticalCategoryDataset d1 = new DefaultStatisticalCategoryDataset(); 
     d1.add(1.1, 2.2, "R1", "C1"); 
     d1.add(3.3, 4.4, "R1", "C2"); 
     d1.add(null, new Double(5.5), "R1", "C3"); 
     d1.add(new Double(6.6), null, "R2", "C3"); 
     DefaultStatisticalCategoryDataset d2 = null; 
     try { 
         d2 = (DefaultStatisticalCategoryDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         fail(e.toString()); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     d1.add(1.1, 2.2, "R3", "C1"); 
     assertFalse(d1.equals(d2)); 
 } 


public void testAdd200() { 
     DefaultStatisticalCategoryDataset d1 = new DefaultStatisticalCategoryDataset(); 
     d1.add(1.0, 2.0, "R1", "C1"); 
     assertEquals(1.0, d1.getValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(2.0, d1.getStdDevValue("R1", "C1").doubleValue(), EPSILON); 
     d1.add(10.0, 20.0, "R1", "C1"); 
     assertEquals(10.0, d1.getValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(20.0, d1.getStdDevValue("R1", "C1").doubleValue(), EPSILON); 
 } 


public void testGetRangeUpperBound201() { 
     DefaultStatisticalCategoryDataset d1 = new DefaultStatisticalCategoryDataset(); 
     d1.add(1.0, 2.0, "R1", "C1"); 
     assertEquals(1.0, d1.getRangeUpperBound(false), EPSILON); 
     assertEquals(3.0, d1.getRangeUpperBound(true), EPSILON); 
 } 

    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Some checks for cloning.
     */
    

    /**
     * Check serialization of a default instance.
     */
    

    /**
     * Check serialization of a more complex instance.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the add() method.
     */
    

    /**
     * Some checks for the getRangeLowerBound() method.
     */
    

    /**
     * Some checks for the getRangeUpperBound() method.
     */
    

    /**
     * Some checks for the getRangeBounds() method.
     */
    

    /**
     * Some checks for the remove method.
     */
    


}
