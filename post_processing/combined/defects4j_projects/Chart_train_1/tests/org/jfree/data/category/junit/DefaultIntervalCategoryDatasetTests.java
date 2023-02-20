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
 * ----------------------------------------
 * DefaultIntervalCategoryDatasetTests.java
 * ----------------------------------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 08-Mar-2007 : Version 1 (DG);
 * 25-Feb-2008 : Added new tests to check behaviour of an empty dataset (DG);
 *
 */

package org.jfree.data.category.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.UnknownKeyException;
import org.jfree.data.category.DefaultIntervalCategoryDataset;

/**
 * Tests for the {@link DefaultIntervalCategoryDataset} class.
 */
public class DefaultIntervalCategoryDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultIntervalCategoryDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultIntervalCategoryDatasetTests(String name) {
        super(name);
    }

    /**
     * Some checks for the getValue() method.
     */

public void testGetCategoryCount386() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertEquals(0, empty.getCategoryCount()); 
 } 


public void testGetValue585() { 
     double[] starts_S1 = new double[] { 0.1, 0.2, 0.3 }; 
     double[] starts_S2 = new double[] { 0.3, 0.4, 0.5 }; 
     double[] ends_S1 = new double[] { 0.5, 0.6, 0.7 }; 
     double[] ends_S2 = new double[] { 0.7, 0.8, 0.9 }; 
     double[][] starts = new double[][] { starts_S1, starts_S2 }; 
     double[][] ends = new double[][] { ends_S1, ends_S2 }; 
     DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(starts, ends); 
     assertEquals(new Double(0.1), d.getStartValue("Series 1", "Category 1")); 
     assertEquals(new Double(0.2), d.getStartValue("Series 1", "Category 2")); 
     assertEquals(new Double(0.3), d.getStartValue("Series 1", "Category 3")); 
     assertEquals(new Double(0.3), d.getStartValue("Series 2", "Category 1")); 
     assertEquals(new Double(0.4), d.getStartValue("Series 2", "Category 2")); 
     assertEquals(new Double(0.5), d.getStartValue("Series 2", "Category 3")); 
     assertEquals(new Double(0.5), d.getEndValue("Series 1", "Category 1")); 
     assertEquals(new Double(0.6), d.getEndValue("Series 1", "Category 2")); 
     assertEquals(new Double(0.7), d.getEndValue("Series 1", "Category 3")); 
     assertEquals(new Double(0.7), d.getEndValue("Series 2", "Category 1")); 
     assertEquals(new Double(0.8), d.getEndValue("Series 2", "Category 2")); 
     assertEquals(new Double(0.9), d.getEndValue("Series 2", "Category 3")); 
     boolean pass = false; 
     try { 
         d.getValue("XX", "Category 1"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         d.getValue("Series 1", "XX"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void testSetCategoryKeys586() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     boolean pass = true; 
     try { 
         empty.setCategoryKeys(new String[0]); 
     } catch (RuntimeException e) { 
         pass = false; 
     } 
     assertTrue(pass); 
 } 


public void testSetStartValue587() { 
     double[] starts_S1 = new double[] { 0.1, 0.2, 0.3 }; 
     double[] starts_S2 = new double[] { 0.3, 0.4, 0.5 }; 
     double[] ends_S1 = new double[] { 0.5, 0.6, 0.7 }; 
     double[] ends_S2 = new double[] { 0.7, 0.8, 0.9 }; 
     double[][] starts = new double[][] { starts_S1, starts_S2 }; 
     double[][] ends = new double[][] { ends_S1, ends_S2 }; 
     DefaultIntervalCategoryDataset d1 = new DefaultIntervalCategoryDataset(starts, ends); 
     d1.setStartValue(0, "Category 2", new Double(99.9)); 
     assertEquals(new Double(99.9), d1.getStartValue("Series 1", "Category 2")); 
     boolean pass = false; 
     try { 
         d1.setStartValue(-1, "Category 2", new Double(99.9)); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         d1.setStartValue(2, "Category 2", new Double(99.9)); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void testSetEndValue588() { 
     double[] starts_S1 = new double[] { 0.1, 0.2, 0.3 }; 
     double[] starts_S2 = new double[] { 0.3, 0.4, 0.5 }; 
     double[] ends_S1 = new double[] { 0.5, 0.6, 0.7 }; 
     double[] ends_S2 = new double[] { 0.7, 0.8, 0.9 }; 
     double[][] starts = new double[][] { starts_S1, starts_S2 }; 
     double[][] ends = new double[][] { ends_S1, ends_S2 }; 
     DefaultIntervalCategoryDataset d1 = new DefaultIntervalCategoryDataset(starts, ends); 
     d1.setEndValue(0, "Category 2", new Double(99.9)); 
     assertEquals(new Double(99.9), d1.getEndValue("Series 1", "Category 2")); 
     boolean pass = false; 
     try { 
         d1.setEndValue(-1, "Category 2", new Double(99.9)); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         d1.setEndValue(2, "Category 2", new Double(99.9)); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void testGetRowKeys589() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     List keys = empty.getRowKeys(); 
     assertEquals(0, keys.size()); 
 } 


public void testGetColumnCount590() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertEquals(0, empty.getColumnCount()); 
 } 


public void testCloning591() { 
     double[] starts_S1 = new double[] { 0.1, 0.2, 0.3 }; 
     double[] starts_S2 = new double[] { 0.3, 0.4, 0.5 }; 
     double[] ends_S1 = new double[] { 0.5, 0.6, 0.7 }; 
     double[] ends_S2 = new double[] { 0.7, 0.8, 0.9 }; 
     double[][] starts = new double[][] { starts_S1, starts_S2 }; 
     double[][] ends = new double[][] { ends_S1, ends_S2 }; 
     DefaultIntervalCategoryDataset d1 = new DefaultIntervalCategoryDataset(starts, ends); 
     DefaultIntervalCategoryDataset d2 = null; 
     try { 
         d2 = (DefaultIntervalCategoryDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     d1.setStartValue(0, "Category 1", new Double(0.99)); 
     assertFalse(d1.equals(d2)); 
     d2.setStartValue(0, "Category 1", new Double(0.99)); 
     assertTrue(d1.equals(d2)); 
 } 

    


    /**
     * Some tests for the getRowCount() method.
     */
    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * A check to ensure that an empty dataset can be cloned.
     */
    

    /**
     * Some basic checks for the setStartValue() method.
     */
    

    /**
     * Some basic checks for the setEndValue() method.
     */
    

    /**
     * Some checks for the getSeriesCount() method.
     */
    

    /**
     * Some checks for the getCategoryCount() method.
     */
    

    /**
     * Some checks for the getSeriesIndex() method.
     */
    

    /**
     * Some checks for the getRowIndex() method.
     */
    

    /**
     * Some checks for the setSeriesKeys() method.
     */
    

    /**
     * Some checks for the getCategoryIndex() method.
     */
    

    /**
     * Some checks for the getColumnIndex() method.
     */
    

    /**
     * Some checks for the setCategoryKeys() method.
     */
    

    /**
     * Some checks for the getColumnKeys() method.
     */
    

    /**
     * Some checks for the getRowKeys() method.
     */
    

    /**
     * Some checks for the getColumnCount() method.
     */
    

    /**
     * Some checks for the getRowCount() method.
     */
    

}
