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
 * --------------------------------
 * DefaultCategoryDatasetTests.java
 * --------------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 23-Mar-2004 : Version 1 (DG);
 * 08-Mar-2007 : Added testCloning() (DG);
 * 21-Nov-2007 : Added testBug1835955() method (DG);
 * 09-May-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.data.category.junit;

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
import org.jfree.data.UnknownKeyException;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link DefaultCategoryDataset} class.
 */
public class DefaultCategoryDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultCategoryDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultCategoryDatasetTests(String name) {
        super(name);
    }

    /**
     * Some checks for the getValue() method.
     */
public void testGetRowCount643() { DefaultCategoryDataset d = new DefaultCategoryDataset(); d.addValue(1.0, "R1", "C1"); d.addValue(2.0, "R2", "C2"); d.addValue(3.0, "R3", "C3"); assertEquals(3, d.getRowCount()); }
public void testGetColumnCount644() { DefaultCategoryDataset d = new DefaultCategoryDataset(); d.addValue(1.0, "R1", "C1"); d.addValue(2.0, "R2", "C2"); d.addValue(3.0, "R3", "C3"); assertEquals(3, d.getColumnCount()); }
public void testEquals673() { DefaultCategoryDataset d1 = new DefaultCategoryDataset(); d1.setValue(1.0, "Row 1", "Column 1"); d1.setValue(2.0, "Row 2", "Column 2"); d1.setValue(3.0, "Row 3", "Column 3"); DefaultCategoryDataset d2 = new DefaultCategoryDataset(); d2.setValue(1.0, "Row 1", "Column 1"); d2.setValue(2.0, "Row 2", "Column 2"); d2.setValue(3.0, "Row 3", "Column 3"); assertEquals(d1, d2); }
    

    /**
     * A simple check for the getValue(int, int) method.
     */
    

    /**
     * Some checks for the incrementValue() method.
     */
    

    /**
     * Some tests for the getRowCount() method.
     */
    

    /**
     * Some tests for the getColumnCount() method.
     */
    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the addValue() method.
     */
    

    /**
     * Some basic checks for the removeValue() method.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Check that this class implements PublicCloneable.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * A test for bug 1835955.
     */
    

    /**
     * Some checks for the removeColumn(Comparable) method.
     */
    

    /**
     * Some checks for the removeRow(Comparable) method.
     */
    

}
