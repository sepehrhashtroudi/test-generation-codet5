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
 * ---------------------------------------------
 * DefaultBoxAndWhiskerCategoryDatasetTests.java
 * ---------------------------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 01-Mar-2004 : Version 1 (DG);
 * 17-Apr-2007 : Added a test for bug 1701822 (DG);
 * 28-Sep-2007 : Enhanced testClone() (DG);
 * 02-Oct-2007 : Added new tests (DG);
 * 03-Oct-2007 : Added getTestRangeBounds() and testRemove() (DG);
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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.Range;
import org.jfree.data.UnknownKeyException;
import org.jfree.data.statistics.BoxAndWhiskerItem;
import org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset;

/**
 * Tests for the {@link DefaultBoxAndWhiskerCategoryDataset} class.
 */
public class DefaultBoxAndWhiskerCategoryDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultBoxAndWhiskerCategoryDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultBoxAndWhiskerCategoryDatasetTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testRemove235() { 
     DefaultBoxAndWhiskerCategoryDataset data = new DefaultBoxAndWhiskerCategoryDataset(); 
     boolean pass = false; 
     try { 
         data.remove("R1", "R2"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     data.add(new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList()), "R1", "C1"); 
     assertEquals(new Range(7.0, 8.0), data.getRangeBounds(false)); 
     assertEquals(new Range(7.0, 8.0), data.getRangeBounds(true)); 
     data.add(new BoxAndWhiskerItem(2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, new ArrayList()), "R2", "C1"); 
     assertEquals(new Range(7.0, 9.5), data.getRangeBounds(false)); 
     assertEquals(new Range(7.0, 9.5), data.getRangeBounds(true)); 
     data.remove("R1", "C1"); 
     assertEquals(new Range(8.5, 9.5), data.getRangeBounds(false)); 
     assertEquals(new Range(8.5, 9.5), data.getRangeBounds(true)); 
 }
public void testConstructor236() { 
     DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset(); 
     assertEquals(0, dataset.getColumnCount()); 
     assertEquals(0, dataset.getRowCount()); 
     assertTrue(Double.isNaN(dataset.getRangeLowerBound(false))); 
     assertTrue(Double.isNaN(dataset.getRangeUpperBound(false))); 
 }
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * A simple test for bug report 1701822.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the add() method.
     */
    

    /**
     * Some checks for the add() method.
     */
    

    /**
     * Some basic checks for the constructor.
     */
    

    /**
     * Some checks for the getRangeBounds() method.
     */
    

    /**
     * Some checks for the remove method.
     */
    

}
