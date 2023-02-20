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
public void testGetRowIndex1143() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertEquals(-1, empty.getRowIndex("ABC")); 
 }
public void testGetCategoryCount1144() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertEquals(0, empty.getCategoryCount()); 
 }
public void testEquals1145() { 
     DefaultIntervalCategoryDataset d1 = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     DefaultIntervalCategoryDataset d2 = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertTrue(d1.equals(d2)); 
     assertTrue(d2.equals(d1)); 
     d1 = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertFalse(d1.equals(d2)); 
     d2 = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertTrue(d1.equals(d2)); 
     d1 = new DefaultIntervalCategoryDataset(new double[0][1], new double[0][1]); 
     assertFalse(d1.equals(d2)); 
     d2 = new DefaultIntervalCategoryDataset(new double[0][1], new double[0][1]); 
     assertTrue(d1.equals(d2)); 
     d1 = new DefaultIntervalCategoryDataset(new double[0][2], new double[0][2]); 
     assertFalse(d1.equals(d2)); 
     d2 = new DefaultIntervalCategoryDataset(new double[0][2], new double[0][2]); 
     assertTrue(d1.equals(d2)); 
 }
public void testGetValue1146() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertEquals(new Double(0.0), empty.getValue("S1", "C1")); 
     boolean pass = true; 
     try { 
         empty.getValue("S1", "C2"); 
     } catch (UnknownKeyException e) { 
         pass = false; 
     } 
     assertTrue(pass); 
 }
public void testGetStartValue1149() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertEquals(new Double(0.0), empty.getStartValue("S1", "C1")); 
     boolean pass = true; 
     try { 
         empty.getStartValue(0, 0); 
     } catch (UnknownKeyException e) { 
         pass = false; 
     } 
     assertTrue(pass); 
 }
public void testGetEndValue21153() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     boolean pass = true; 
     try { 
         empty.getEndValue(0, 0); 
     } catch (UnknownKeyException e) { 
         pass = false; 
     } 
     assertTrue(pass); 
 }
public void testGetStartValue1154() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertEquals(new Double(0.0), empty.getStartValue(0, 0)); 
     assertEquals(new Double(1.0), empty.getStartValue(0, 1)); 
     assertEquals(new Double(2.0), empty.getStartValue(0, 2)); 
     assertEquals(new Double(3.0), empty.getStartValue(0, 3)); 
     boolean pass = false; 
     try { 
         empty.getStartValue(-1, 0); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         empty.getStartValue(1, 1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testGetEndValue21156() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     boolean pass = true; 
     try { 
         empty.getEndValue(0, 0); 
     } catch (IllegalArgumentException e) { 
         pass = false; 
     } 
     assertTrue(pass); 
 }
public void testSetSeriesKeys1160() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     boolean pass = true; 
     try { 
         empty.setSeriesKeys(new String[0]); 
     } catch (RuntimeException e) { 
         pass = false; 
     } 
     assertTrue(pass); 
 }
public void testGetRowAndColumnCount1161() { 
     double[] starts_S1 = new double[] { 0.1, 0.2, 0.3 }; 
     double[] starts_S2 = new double[] { 0.3, 0.4, 0.5 }; 
     double[] ends_S1 = new double[] { 0.5, 0.6, 0.7 }; 
     double[] ends_S2 = new double[] { 0.7, 0.8, 0.9 }; 
     double[][] starts = new double[][] { starts_S1, starts_S2 }; 
     double[][] ends = new double[][] { ends_S1, ends_S2 }; 
     DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(starts, ends); 
     assertEquals(2, d.getRowCount()); 
     assertEquals(3, d.getColumnCount()); 
 }
public void testGetCategoryIndex1162() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertEquals(-1, empty.getCategoryIndex("ABC")); 
 }
public void testGetRowKeys1163() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     List keys = empty.getRowKeys(); 
     assertEquals(0, keys.size()); 
 }
public void testGetColumnCount1164() { 
     DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertEquals(0, empty.getColumnCount()); 
 }
public void testEquals1165() { 
     DefaultIntervalCategoryDataset d1 = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     DefaultIntervalCategoryDataset d2 = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertTrue(d1.equals(d2)); 
     assertTrue(d2.equals(d1)); 
     d1 = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertFalse(d1.equals(d2)); 
     d2 = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     assertTrue(d1.equals(d2)); 
     d1 = new DefaultIntervalCategoryDataset(new double[0][1], new double[0][1]); 
     assertFalse(d1.equals(d2)); 
     d2 = new DefaultIntervalCategoryDataset(new double[0][1], new double[0][1]); 
     assertTrue(d1.equals(d2)); 
 }
public void testCloning21166() { 
     DefaultIntervalCategoryDataset d1 = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); 
     DefaultIntervalCategoryDataset d2 = null; 
     try { 
         d2 = (DefaultIntervalCategoryDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
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
