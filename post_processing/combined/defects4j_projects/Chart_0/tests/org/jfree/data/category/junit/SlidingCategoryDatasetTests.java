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
 * --------------------------------
 * SlidingCategoryDatasetTests.java
 * --------------------------------
 * (C) Copyright 2008, 2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 08-May-2008 : Version 1 (DG);
 * 15-Mar-2009 : Added testGetColumnKeys() (DG);
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
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.category.SlidingCategoryDataset;

/**
 * Tests for the {@link SlidingCategoryDataset} class.
 */
public class SlidingCategoryDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(SlidingCategoryDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public SlidingCategoryDatasetTests(String name) {
        super(name);
    }

    /**
     * Some checks for the equals() method.
     */
public void testGetRowCount548() { 
     DefaultCategoryDataset underlying = new DefaultCategoryDataset(); 
     underlying.addValue(1.0, "R1", "C1"); 
     underlying.addValue(2.0, "R1", "C2"); 
     underlying.addValue(3.0, "R1", "C3"); 
     underlying.addValue(4.0, "R1", "C4"); 
     SlidingCategoryDataset dataset = new SlidingCategoryDataset(underlying, 1, 2); 
     assertEquals(2, dataset.getRowCount()); 
     assertEquals(3, dataset.getRowCount()); 
     assertEquals(4, dataset.getRowCount()); 
     dataset.setFirstCategoryIndex(3); 
     assertEquals(2, dataset.getRowCount()); 
     assertEquals(1, dataset.getRowCount()); 
     assertEquals(2, dataset.getRowCount()); 
     dataset.setFirstCategoryIndex(4); 
     assertEquals(1, dataset.getRowCount()); 
     assertEquals(2, dataset.getRowCount()); 
     dataset.setFirstCategoryIndex(3); 
     assertEquals(3, dataset.getRowCount()); 
     assertEquals(4, dataset.getRowCount()); 
     dataset.setFirstCategoryIndex(4); 
     assertEquals(4, dataset.getRowCount()); 
     dataset.setFirstCategoryIndex(5); 
     assertEquals(2, dataset.getRowCount()); 
     assertEquals(1, dataset.getRowCount()); 
 }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the getColumnCount() method.
     */
    

    /**
     * Some checks for the getRowCount() method.
     */
    

    /**
     * Some checks for the getColumnIndex() method.
     */
    

    /**
     * Some checks for the getRowIndex() method.
     */
    

    /**
     * Some checks for the getValue() method.
     */
    

    /**
     * Some checks for the getColumnKeys() method.
     */
    

}
