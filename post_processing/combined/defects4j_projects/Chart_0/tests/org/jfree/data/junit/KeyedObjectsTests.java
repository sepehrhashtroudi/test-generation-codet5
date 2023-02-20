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
 * ----------------------
 * KeyedObjectsTests.java
 * ----------------------
 * (C) Copyright 2004-2009, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 27-Jan-2004 : Version 1 (DG);
 * 28-Sep-2007 : Added testCloning2() (DG);
 * 03-Oct-2007 : New tests (DG);
 * 01-Jul-2009 : Added tests for sorting (DG);
 *
 */

package org.jfree.data.junit;

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

import org.jfree.chart.util.SortOrder;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.KeyedObjects;
import org.jfree.data.UnknownKeyException;
import org.jfree.data.pie.DefaultPieDataset;

/**
 * Tests for the {@link KeyedObjects} class.
 */
public class KeyedObjectsTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(KeyedObjectsTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public KeyedObjectsTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        // no setup required
    }

    /**
     * Confirm that cloning works.
     */
public void testSortByKeyAscending1249() { 
     KeyedObjects data = new KeyedObjects(); 
     data.addObject("C", new Double(1.0)); 
     data.addObject("B", null); 
     data.addObject("D", new Double(3.0)); 
     data.addObject("A", new Double(2.0)); 
     data.sortByKeys(SortOrder.ASCENDING); 
     assertEquals(data.getKey(0), "A"); 
     assertEquals(data.getKey(1), "B"); 
     assertEquals(data.getKey(2), "C"); 
     assertEquals(data.getKey(3), "D"); 
     assertEquals(data.getObject("A"), new Double(2.0)); 
     assertEquals(data.getObject("B"), null); 
     assertEquals(data.getObject("C"), new Double(1.0)); 
     assertEquals(data.getObject("D"), new Double(3.0)); 
     assertEquals(data.getObject(0), new Double(2.0)); 
     assertEquals(data.getObject(1), new Double(1.0)); 
     assertEquals(data.getObject(2), new Double(3.0)); 
     assertEquals(data.getObject(3), null); 
 }
public void testSortByValueDescending1428() { 
     KeyedObjects data = new KeyedObjects(); 
     data.addObject("C", new Double(1.0)); 
     data.addObject("B", null); 
     data.addObject("D", new Double(3.0)); 
     data.addObject("A", new Double(2.0)); 
     data.sortByObjects(SortOrder.DESCENDING); 
     assertEquals(data.getKey(0), "D"); 
     assertEquals(data.getKey(1), "A"); 
     assertEquals(data.getKey(2), "C"); 
     assertEquals(data.getKey(3), "B"); 
     assertEquals(data.getObject("A"), new Double(2.0)); 
     assertEquals(data.getObject("B"), null); 
     assertEquals(data.getObject("C"), new Double(1.0)); 
     assertEquals(data.getObject("D"), new Double(3.0)); 
     assertEquals(data.getObject(0), new Double(3.0)); 
     assertEquals(data.getObject(1), new Double(2.0)); 
     assertEquals(data.getObject(2), new Double(1.0)); 
     assertEquals(data.getObject(3), null); 
 }
    

    /**
     * Confirm special features of cloning.
     */
    

    /**
     * Check that inserting and retrieving values works as expected.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Simple checks for the getObject(int) method.
     */
    

    /**
     * Simple checks for the getKey(int) method.
     */
    

    /**
     * Simple checks for the getIndex(Comparable) method.
     */
    

    /**
     * Some checks for the setObject(Comparable, Object) method.
     */
    

    /**
     * Some checks for the removeValue() methods.
     */
    

    /**
     * Some checks for the removeValue(int) method.
     */
    

    /**
     * Tests sorting of data by key (ascending).
     */
    

    /**
     * Tests sorting of data by key (descending).
     */
    

    /**
     * Tests sorting of data by value (ascending).
     */
    

    /**
     * Tests sorting of data by key (descending).
     */
    

}
