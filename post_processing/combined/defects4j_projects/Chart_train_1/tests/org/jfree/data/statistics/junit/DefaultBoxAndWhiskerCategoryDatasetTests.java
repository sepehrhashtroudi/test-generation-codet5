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

public void testEquals145() { 
     DefaultBoxAndWhiskerCategoryDataset d1 = new DefaultBoxAndWhiskerCategoryDataset(); 
     d1.add(new BoxAndWhiskerItem(new Double(1.0), new Double(2.0), new Double(3.0), new Double(4.0), new Double(5.0), new Double(6.0), new Double(7.0), new Double(8.0), new ArrayList()), "ROW1", "COLUMN1"); 
     DefaultBoxAndWhiskerCategoryDataset d2 = new DefaultBoxAndWhiskerCategoryDataset(); 
     d2.add(new BoxAndWhiskerItem(new Double(1.0), new Double(2.0), new Double(3.0), new Double(4.0), new Double(5.0), new Double(6.0), new Double(7.0), new Double(8.0), new ArrayList()), "ROW1", "COLUMN1"); 
     assertTrue(d1.equals(d2)); 
     assertTrue(d2.equals(d1)); 
 } 


public void testAddUpdatesCachedRange146() { 
     DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset(); 
     BoxAndWhiskerItem item1 = new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList()); 
     dataset.add(item1, "R1", "C1"); 
     BoxAndWhiskerItem item2 = new BoxAndWhiskerItem(1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, new ArrayList()); 
     dataset.add(item2, "R1", "C1"); 
     assertEquals(2.5, dataset.getValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(1.5, dataset.getMeanValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(2.5, dataset.getMedianValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(3.5, dataset.getQ1Value("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(4.5, dataset.getQ3Value("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(5.5, dataset.getMinRegularValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(6.5, dataset.getMaxRegularValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(7.5, dataset.getMinOutlier("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(8.5, dataset.getMaxOutlier("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(new Range(7.5, 8.5), dataset.getRangeBounds(false)); 
 } 


public void testAdd147() { 
     DefaultBoxAndWhiskerCategoryDataset dataset = new DefaultBoxAndWhiskerCategoryDataset(); 
     BoxAndWhiskerItem item1 = new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList()); 
     dataset.add(item1, "R1", "C1"); 
     assertEquals(2.0, dataset.getValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(1.0, dataset.getMeanValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(2.0, dataset.getMedianValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(3.0, dataset.getQ1Value("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(4.0, dataset.getQ3Value("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(5.0, dataset.getMinRegularValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(6.0, dataset.getMaxRegularValue("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(7.0, dataset.getMinOutlier("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(8.0, dataset.getMaxOutlier("R1", "C1").doubleValue(), EPSILON); 
     assertEquals(new Range(7.0, 8.0), dataset.getRangeBounds(false)); 
 } 


public void testCloning148() { 
     DefaultBoxAndWhiskerCategoryDataset d1 = new DefaultBoxAndWhiskerCategoryDataset(); 
     d1.add(new BoxAndWhiskerItem(new Double(1.0), new Double(2.0), new Double(3.0), new Double(4.0), new Double(5.0), new Double(6.0), new Double(7.0), new Double(8.0), new ArrayList()), "ROW1", "COLUMN1"); 
     DefaultBoxAndWhiskerCategoryDataset d2 = null; 
     try { 
         d2 = (DefaultBoxAndWhiskerCategoryDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     d1.add(new BoxAndWhiskerItem(new Double(1.0), new Double(2.0), new Double(3.0), new Double(4.0), new Double(5.0), new Double(6.0), new Double(7.0), new Double(8.0), new ArrayList()), "ROW2", "COLUMN1"); 
     assertFalse(d1.equals(d2)); 
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
