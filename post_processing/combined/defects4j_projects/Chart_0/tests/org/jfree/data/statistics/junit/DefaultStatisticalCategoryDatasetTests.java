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
public void testRemove333() { 
     DefaultStatisticalCategoryDataset data = new DefaultStatisticalCategoryDataset(); 
     boolean pass = false; 
     try { 
         data.remove("R1", "R2"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     data.add(1.0, 0.5, "R1", "C1"); 
     assertEquals(new Range(1.0, 1.0), data.getRangeBounds(false)); 
     assertEquals(new Range(0.5, 1.5), data.getRangeBounds(true)); 
     data.add(1.4, 0.2, "R2", "C1"); 
     assertEquals(1.0, data.getRangeLowerBound(false), EPSILON); 
     assertEquals(1.4, data.getRangeUpperBound(false), EPSILON); 
     assertEquals(0.5, data.getRangeLowerBound(true), EPSILON); 
     assertEquals(1.6, data.getRangeUpperBound(true), EPSILON); 
     data.remove("R1", "C1"); 
     assertEquals(1.4, data.getRangeLowerBound(false), EPSILON); 
     assertEquals(1.4, data.getRangeUpperBound(false), EPSILON); 
     assertEquals(1.2, data.getRangeLowerBound(true), EPSILON); 
     assertEquals(1.6, data.getRangeUpperBound(true), EPSILON); 
 }
public void testEquals338() { 
     DefaultStatisticalCategoryDataset d1 = new DefaultStatisticalCategoryDataset(); 
     DefaultStatisticalCategoryDataset d2 = new DefaultStatisticalCategoryDataset(); 
     assertTrue(d1.equals(d2)); 
     assertTrue(d2.equals(d1)); 
     d1.add(1.0, 0.5, "R1", "C1"); 
     assertFalse(d1.equals(d2)); 
     d2.add(1.0, 0.5, "R1", "C1"); 
     assertTrue(d1.equals(d2)); 
     d1.add(2.0, 0.5, "R1", "C2"); 
     assertFalse(d1.equals(d2)); 
     d2.add(2.0, 0.5, "R1", "C2"); 
     assertTrue(d1.equals(d2)); 
     d1.remove("R1", "C1"); 
     assertFalse(d1.equals(d2)); 
     d2.remove("R1", "C1"); 
     assertTrue(d1.equals(d2)); 
 }
public void testCloning339() { 
     DefaultStatisticalCategoryDataset d1 = new DefaultStatisticalCategoryDataset(); 
     DefaultStatisticalCategoryDataset d2 = null; 
     try { 
         d2 = (DefaultStatisticalCategoryDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     d1.add(1.0, 0.5, "R1", "C1"); 
     assertFalse(d1.equals(d2)); 
     d2.add(1.0, 0.5, "R1", "C1"); 
     assertTrue(d1.equals(d2)); 
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
