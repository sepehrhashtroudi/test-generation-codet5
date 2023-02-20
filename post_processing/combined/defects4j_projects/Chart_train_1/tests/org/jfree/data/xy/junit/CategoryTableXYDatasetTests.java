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
 * CategoryTableXYDatasetTests.java
 * --------------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 06-Oct-2005 : Version 1 (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.data.xy.junit;

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
import org.jfree.data.xy.CategoryTableXYDataset;

/**
 * Tests for the {@link CategoryTableXYDataset} class.
 */
public class CategoryTableXYDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CategoryTableXYDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CategoryTableXYDatasetTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testAddSeries312() { 
     CategoryTableXYDataset d1 = new CategoryTableXYDataset(); 
     d1.setAutoWidth(true); 
     d1.add(3.0, 1.1, "Series 1"); 
     d1.add(7.0, 2.2, "Series 1"); 
     assertEquals(3.0, d1.getXValue(0, 0), EPSILON); 
     assertEquals(7.0, d1.getXValue(0, 1), EPSILON); 
     assertEquals(1.0, d1.getStartXValue(0, 0), EPSILON); 
     assertEquals(5.0, d1.getStartXValue(0, 1), EPSILON); 
     assertEquals(5.0, d1.getEndXValue(0, 0), EPSILON); 
     assertEquals(9.0, d1.getEndXValue(0, 1), EPSILON); 
     d1.add(7.5, 1.1, "Series 2"); 
     d1.add(9.0, 2.2, "Series 2"); 
     assertEquals(3.0, d1.getXValue(1, 0), EPSILON); 
     assertEquals(7.0, d1.getXValue(1, 1), EPSILON); 
     assertEquals(7.5, d1.getXValue(1, 2), EPSILON); 
     assertEquals(9.0, d1.getXValue(1, 3), EPSILON); 
     assertEquals(7.25, d1.getStartXValue(1, 2), EPSILON); 
     assertEquals(8.75, d1.getStartXValue(1, 3), EPSILON); 
     assertEquals(7.75, d1.getEndXValue(1, 2), EPSILON); 
     assertEquals(9.25, d1.getEndXValue(1, 3), EPSILON); 
     assertEquals(2.75, d1.getStartXValue(0, 0), EPSILON); 
     assertEquals(6.75, d1.getStartXValue(0, 1), EPSILON); 
     assertEquals(3.25, d1.getEndXValue(0, 0), EPSILON); 
     assertEquals(7.25, d1.getEndXValue(0, 1), EPSILON); 
 } 

    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Another check for cloning - making sure it works for a customised
     * interval delegate.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * This is a test for bug 1312066 - adding a new series should trigger a
     * recalculation of the interval width, if it is being automatically
     * calculated.
     */
    
}
