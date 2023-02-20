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
 * ------------------------------------------
 * DefaultMultiValueCategoryDatasetTests.java
 * ------------------------------------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 28-Sep-2007 : Version 1 (DG);
 *
 */

package org.jfree.data.statistics.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.UnknownKeyException;
import org.jfree.data.statistics.DefaultMultiValueCategoryDataset;

/**
 * Tests for the {@link DefaultMultiValueCategoryDataset} class.
 */
public class DefaultMultiValueCategoryDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultMultiValueCategoryDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultMultiValueCategoryDatasetTests(String name) {
        super(name);
    }

    /**
     * Some checks for the getValue() method.
     */
public void testClone4794() throws CloneNotSupportedException { DefaultMultiValueCategoryDataset d1 = new DefaultMultiValueCategoryDataset(); d1.add(new ArrayList(), "R1", "C1"); DefaultMultiValueCategoryDataset d2 = (DefaultMultiValueCategoryDataset) d1.clone(); assertEquals(d1.getValues("R1", "C1"), d2.getValues("R1", "C1")); assertEquals(d1.getValues("R1", "C2"), d2.getValues("R1", "C2")); }
public void testClone4795() throws CloneNotSupportedException { DefaultMultiValueCategoryDataset d1 = new DefaultMultiValueCategoryDataset(); d1.add(new ArrayList(), "R1", "C1"); DefaultMultiValueCategoryDataset d2 = (DefaultMultiValueCategoryDataset) d1.clone(); assertEquals(d1, d2); List values = new ArrayList(); d1.add(values, "R1", "C1"); d2.add(values, "R1", "C2"); assertEquals(d1, d2); }
    

    /**
     * A simple check for the getValue(int, int) method.
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
     * Some checks for the add() method.
     */
    

    /**
     * Confirm that cloning works.
     */
    

}
