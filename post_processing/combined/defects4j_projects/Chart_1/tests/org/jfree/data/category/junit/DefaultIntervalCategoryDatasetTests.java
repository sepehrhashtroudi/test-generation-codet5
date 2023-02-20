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
public void testSerialization1176() { 
     double[] starts_S1 = new double[] { 0.1, 0.2, 0.3 }; 
     double[] starts_S2 = new double[] { 0.3, 0.4, 0.5 }; 
     double[] ends_S1 = new double[] { 0.5, 0.6, 0.7 }; 
     double[] ends_S2 = new double[] { 0.7, 0.8, 0.9 }; 
     double[][] starts = new double[][] { starts_S1, starts_S2 }; 
     double[][] ends = new double[][] { ends_S1, ends_S2 }; 
     DefaultIntervalCategoryDataset d1 = new DefaultIntervalCategoryDataset(starts, ends); 
     DefaultIntervalCategoryDataset d2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(d1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         d2 = (DefaultIntervalCategoryDataset) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(d1, d2); 
 }
public void testCloning1177() { 
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
     d1.setEndValue(0, "Category 2", new Double(0.99)); 
     assertFalse(d1.equals(d2)); 
     d2.setEndValue(0, "Category 2", new Double(0.99)); 
     assertTrue(d1.equals(d2)); 
 }
public void testCloning1178() { 
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
public void testCloning1181() { 
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
     d1.setStartValue(0, "Category 1", new Double(99.9)); 
     assertFalse(d1.equals(d2)); 
     d2.setStartValue(0, "Category 1", new Double(99.9)); 
     assertTrue(d1.equals(d2)); 
     d1.setEndValue(0, "Category 2", new Double(99.9)); 
     assertFalse(d1.equals(d2)); 
     d2.setEndValue(0, "Category 2", new Double(99.9)); 
     assertTrue(d1.equals(d2)); 
 }
public void testCloning1186() { 
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
     d1.setStartValue(0, "Category 1", new Double(99.9)); 
     assertFalse(d1.equals(d2)); 
     d2.setStartValue(0, "Category 1", new Double(99.9)); 
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
