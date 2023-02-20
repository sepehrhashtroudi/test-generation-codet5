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
public void testRemove316() { 
     DefaultStatisticalCategoryDataset d = new DefaultStatisticalCategoryDataset(); 
     assertNull(d.getValue("R1", "C1")); 
     d.add(1.0, 2.0, "R1", "C1"); 
     assertEquals(new Double(1.0), d.getValue("R1", "C1")); 
     d.add(10.0, 20.0, "R1", "C1"); 
     assertEquals(new Double(10.0), d.getValue("R1", "C1")); 
     boolean pass = false; 
     try { 
         d.remove("R1", "C1"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemove317() { 
     DefaultStatisticalCategoryDataset d = new DefaultStatisticalCategoryDataset(); 
     d.add(1.0, 2.0, "R1", "C1"); 
     assertEquals(1.0, d.getValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(2.0, d.getStdDevValue("R1", "C1").doubleValue(), EPSILON); 
     d.add(10.0, 20.0, "R1", "C1"); 
     assertEquals(10.0, d.getValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(20.0, d.getStdDevValue("R1", "C1").doubleValue(), EPSILON); 
     boolean pass = false; 
     try { 
         d.remove("R1", "C1"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemove318() { 
     DefaultStatisticalCategoryDataset d = new DefaultStatisticalCategoryDataset(); 
     assertNull(d.getValue("R1", "C1")); 
     assertNull(d.getStdDevValue("R1", "C1")); 
     d.add(1.0, 2.0, "R1", "C1"); 
     assertEquals(1.0, d.getValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(2.0, d.getStdDevValue("R1", "C1").doubleValue(), EPSILON); 
     d.add(10.0, 20.0, "R1", "C1"); 
     assertEquals(10.0, d.getValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(20.0, d.getStdDevValue("R1", "C1").doubleValue(), EPSILON); 
     boolean pass = false; 
     try { 
         d.remove("R1", "C1"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testGetRangeLowerBound319() { 
     DefaultStatisticalCategoryDataset d = new DefaultStatisticalCategoryDataset(); 
     assertEquals(0.0, d.getRangeLowerBound(false), EPSILON); 
     d.add(1.0, 2.0, "R1", "C1"); 
     assertEquals(1.0, d.getRangeLowerBound(false), EPSILON); 
     assertEquals(2.0, d.getRangeLowerBound(true), EPSILON); 
     d.add(10.0, 20.0, "R1", "C2"); 
     assertEquals(10.0, d.getRangeLowerBound(false), EPSILON); 
     assertEquals(20.0, d.getRangeLowerBound(true), EPSILON); 
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
