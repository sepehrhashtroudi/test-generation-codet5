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
public void testGetSeriesIndex6098() { DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); assertEquals(-1, empty.getSeriesIndex("ABC")); }
public void testSetStartValue6113() { double[] starts_S1 = new double[] {0.1, 0.2, 0.3}; double[] starts_S2 = new double[] {0.1, 0.2, 0.3}; double[] starts_S3 = new double[] {0.1, 0.2, 0.3}; double[] ends_S1 = new double[] {0.1, 0.2, 0.3}; double[] ends_S2 = new double[] {0.1, 0.2, 0.3}; double[] ends_S3 = new double[] {0.1, 0.2, 0.3};
}

public void testSetStartValue6114() { double[] starts_S1 = new double[] {0.0, 1.0, 2.0}; double[] starts_S2 = new double[] {0.0, 1.0, 2.0}; double[] starts_S3 = new double[] {0.0, 1.0, 2.0}; double[] ends_S1 = new double[] {0.0, 1.0, 2.0}; double[] ends_S2 = new double[] {0.0, 1.0, 2.0}; double[] ends_S3 = new double[] {0.0, 1.0, 2.0};
}

public void testFireDatasetChanged6115() { double[] starts_S1 = new double[] {0.1, 0.2, 0.3}; double[] starts_S2 = new double[] {0.1, 0.2, 0.3}; double[] starts_S3 = new double[] {0.1, 0.2, 0.3}; double[] ends_S1 = new double[] {0.1, 0.2, 0.3}; double[] ends_S2 = new double[] {0.1, 0.2, 0.3}; double[] ends_S3 = new double[] {0.1, 0.2, 0.3};
}

public void testGetColumnIndex6122() { DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); assertEquals(0, d.getColumnIndex("A")); assertEquals(0, d.getColumnIndex("B")); assertEquals(0, d.getColumnIndex("C")); try { d.getColumnIndex(null); fail("IllegalArgumentException should have been thrown on null key"); } catch (IllegalArgumentException e) { assertEquals("Null \'columnKey\' argument.", e.getMessage()); } }
public void testGetColumnIndex6123() { DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); try { d.getColumnIndex(null); fail("IllegalArgumentException should have been thrown on null column"); } catch (IllegalArgumentException e) { assertEquals("Null \'columnKey\' argument.", e.getMessage()); } try { d.getColumnIndex(""); fail("IllegalArgumentException should have been thrown on null column"); } catch (IllegalArgumentException e) { assertEquals("Null \'columnKey\' argument.", e.getMessage()); } }
public void testGetRowKeys6125() { DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); List keys = d.getRowKeys(); assertEquals(0, keys.size()); d.setSeriesKeys(null); keys = d.getRowKeys(); keys = d.getRowKeys(); assertEquals(0, keys.size()); }
public void testGetRowKeys6126() { DefaultIntervalCategoryDataset d = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); List keys = d.getRowKeys(); assertEquals(0, keys.size()); d.setSeriesKeys(null); keys = d.getRowKeys(); assertEquals(0, keys.size()); }
public void testGetColumnCount6128() { DefaultIntervalCategoryDataset empty = new DefaultIntervalCategoryDataset(new double[0][0], new double[0][0]); assertEquals(0, empty.getColumnCount()); }
    


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
