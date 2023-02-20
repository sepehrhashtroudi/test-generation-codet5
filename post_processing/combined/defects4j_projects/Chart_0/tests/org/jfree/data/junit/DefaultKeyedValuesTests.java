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
 * ----------------------------
 * DefaultKeyedValuesTests.java
 * ----------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 05-Mar-2003 : Version 1 (DG);
 * 27-Aug-2003 : Moved SortOrder from org.jfree.data --> org.jfree.util (DG);
 * 31-Jul-2006 : Added test for new clear() method (DG);
 * 01-Aug-2006 : Extended testGetIndex() method (DG);
 * 30-Apr-2007 : Added some new tests (DG);
 * 03-Oct-2007 : Updated testRemoveValue() (DG);
 * 21-Nov-2007 : Added testGetIndex2() method (DG);
 *
 */

package org.jfree.data.junit;

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

import org.jfree.chart.util.SortOrder;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.UnknownKeyException;

/**
 * Tests for the {@link DefaultKeyedValues} class.
 */
public class DefaultKeyedValuesTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultKeyedValuesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultKeyedValuesTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        // no setup required
    }

    /**
     * Checks that a new instance is empty.
     */
public void testSortByKeyDescending411() { 
     DefaultKeyedValues data = new DefaultKeyedValues(); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("B", null); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.sortByKeys(SortOrder.DESCENDING); 
     assertEquals(data.getKey(0), "D"); 
     assertEquals(data.getKey(1), "C"); 
     assertEquals(data.getKey(2), "B"); 
     assertEquals(data.getKey(3), "A"); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), null); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
     assertEquals(data.getValue(0), new Double(3.0)); 
     assertEquals(data.getValue(1), new Double(1.0)); 
     assertEquals(data.getValue(2), null); 
     assertEquals(data.getValue(3), new Double(2.0)); 
 }
public void testAddValue1336() { 
     DefaultKeyedValues v1 = new DefaultKeyedValues(); 
     v1.addValue("A", 1.0); 
     assertEquals(new Double(1.0), v1.getValue("A")); 
     v1.addValue("B", 2.0); 
     assertEquals(new Double(2.0), v1.getValue("B")); 
     v1.addValue("B", 3.0); 
     assertEquals(new Double(3.0), v1.getValue("B")); 
     assertEquals(2, v1.getItemCount()); 
     v1.addValue("A", null); 
     assertNull(v1.getValue("A")); 
     assertEquals(2, v1.getItemCount()); 
     boolean pass = false; 
     try { 
         v1.addValue(null, 99.9); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testGetIndex1337() { 
     DefaultKeyedValues v1 = new DefaultKeyedValues(); 
     v1.addValue("A", 1.0); 
     assertEquals(0, v1.getIndex("A")); 
     v1.addValue("B", 2.0); 
     assertEquals(1, v1.getIndex("B")); 
     assertEquals(-1, v1.getIndex("XX")); 
     boolean pass = false; 
     try { 
         v1.getIndex(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testAddValue1338() { 
     DefaultKeyedValues v1 = new DefaultKeyedValues(); 
     v1.addValue("A", 1.0); 
     assertEquals(2, v1.getItemCount()); 
     v1.addValue("B", 2.0); 
     assertEquals(2, v1.getItemCount()); 
     v1.addValue("B", 3.0); 
     assertEquals(3, v1.getItemCount()); 
     v1.addValue("A", null); 
     assertNull(v1.getValue("A")); 
     assertEquals(2, v1.getItemCount()); 
     boolean pass = false; 
     try { 
         v1.addValue(null, 99.9); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testSortByKeyAscending1342() { 
     DefaultKeyedValues data = new DefaultKeyedValues(); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("B", null); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.sortByKeys(SortOrder.ASCENDING); 
     assertEquals(data.getKey(0), "A"); 
     assertEquals(data.getKey(1), "B"); 
     assertEquals(data.getKey(2), "C"); 
     assertEquals(data.getKey(3), "D"); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), null); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
     assertEquals(data.getValue(0), new Double(2.0)); 
     assertEquals(data.getValue(1), null); 
     assertEquals(data.getValue(2), new Double(1.0)); 
     assertEquals(data.getValue(3), new Double(3.0)); 
 }
public void testCloning1343() { 
     DefaultKeyedValues v1 = new DefaultKeyedValues(); 
     v1.addValue("V1", new Integer(1)); 
     v1.addValue("V2", null); 
     v1.addValue("V3", new Integer(3)); 
     DefaultKeyedValues v2 = null; 
     try { 
         v2 = (DefaultKeyedValues) v1.clone(); 
     } catch (CloneNotSupportedException e) { 
         System.err.println("Failed to clone."); 
     } 
     assertTrue(v1 != v2); 
     assertTrue(v1.getClass() == v2.getClass()); 
     assertTrue(v1.equals(v2)); 
     v2.setValue("V1", new Integer(44)); 
     assertFalse(v1.equals(v2)); 
 }
public void testCloning1344() { 
     DefaultKeyedValues v1 = new DefaultKeyedValues(); 
     v1.addValue("V1", new Integer(1)); 
     v1.addValue("V2", null); 
     v1.addValue("V3", new Integer(3)); 
     DefaultKeyedValues v2 = null; 
     try { 
         v2 = (DefaultKeyedValues) v1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(v1 != v2); 
     assertTrue(v1.getClass() == v2.getClass()); 
     assertTrue(v1.equals(v2)); 
     v2.setValue("V1", new Integer(44)); 
     assertFalse(v1.equals(v2)); 
 }
    

    /**
     * Some checks for the getItemCount() method.
     */
    

    /**
     * Some checks for the getKeys() method.
     */
    

    /**
     * A simple test for the clear() method.
     */
    

    /**
     * Some checks for the getValue() methods.
     */
    

    /**
     * Some checks for the getKey() methods.
     */
    

    /**
     * Some checks for the getIndex() methods.
     */
    

    /**
     * Another check for the getIndex(Comparable) method.
     */
    

    /**
     * Some checks for the addValue() method.
     */
    

    /**
     * Some checks for the insertValue() method.
     */
    

    /**
     * Some checks for the clone() method.
     */
    

    /**
     * Check that inserting and retrieving values works as expected.
     */
    

    /**
     * Some tests for the removeValue() method.
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
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
