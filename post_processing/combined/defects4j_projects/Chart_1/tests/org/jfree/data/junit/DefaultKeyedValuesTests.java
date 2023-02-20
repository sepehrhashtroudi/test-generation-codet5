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
public void testSortByValueAscending409() { 
     DefaultKeyedValues data = new DefaultKeyedValues(); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("B", null); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.sortByValues(SortOrder.ASCENDING); 
     assertEquals(data.getKey(0), "C"); 
     assertEquals(data.getKey(1), "A"); 
     assertEquals(data.getKey(2), "D"); 
     assertEquals(data.getKey(3), "A"); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), null); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
     assertEquals(data.getValue(0), new Double(1.0)); 
     assertEquals(data.getValue(1), new Double(2.0)); 
     assertEquals(data.getValue(2), new Double(3.0)); 
     assertEquals(data.getValue(3), null); 
 }
public void testSortByValueAscending410() { 
     DefaultKeyedValues data = new DefaultKeyedValues(); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("B", null); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.addValue("C", new Double(3.0)); 
     data.addValue("D", new Double(2.0)); 
     data.sortByValues(SortOrder.ASCENDING); 
     assertEquals(data.getKey(0), "C"); 
     assertEquals(data.getKey(1), "A"); 
     assertEquals(data.getKey(2), "D"); 
     assertEquals(data.getKey(3), "B"); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), null); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
     assertEquals(data.getValue(0), new Double(1.0)); 
     assertEquals(data.getValue(1), new Double(2.0)); 
     assertEquals(data.getValue(2), new Double(3.0)); 
     assertEquals(data.getValue(3), null); 
 }
public void testSortByValueAscending411() { 
     DefaultKeyedValues data = new DefaultKeyedValues(); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("B", null); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.sortByValues(SortOrder.ASCENDING); 
     assertEquals(data.getKey(0), "C"); 
     assertEquals(data.getKey(1), "A"); 
     assertEquals(data.getKey(2), "D"); 
     assertEquals(data.getKey(3), "B"); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), null); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
     assertEquals(data.getValue("D"), new Double(1.0)); 
 }
public void testSortByValueAscending412() { 
     DefaultKeyedValues data = new DefaultKeyedValues(); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("B", null); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.sortByValues(SortOrder.ASCENDING); 
     assertEquals(data.getKey(0), "C"); 
     assertEquals(data.getKey(1), "A"); 
     assertEquals(data.getKey(2), "D"); 
     assertEquals(data.getKey(3), "A"); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), null); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), new Double(1.0)); 
     assertEquals(data.getValue("C"), new Double(3.0)); 
     assertEquals(data.getValue("D"), new Double(1.0)); 
 }
public void testSerialization1421() { 
     DefaultKeyedValues v1 = new DefaultKeyedValues(); 
     v1.addValue("A", 1.0); 
     v1.addValue("B", 2.0); 
     DefaultKeyedValues v2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(v1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         v2 = (DefaultKeyedValues) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(v1, v2); 
 }
public void testSerialization1422() { 
     DefaultKeyedValues v1 = new DefaultKeyedValues(); 
     v1.insertValue(0, "A", 1.0); 
     v1.insertValue(0, "B", 2.0); 
     DefaultKeyedValues v2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(v1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         v2 = (DefaultKeyedValues) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(v1, v2); 
 }
public void testSortByValueDescending1423() { 
     DefaultKeyedValues data = new DefaultKeyedValues(); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("B", null); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.sortByKeys(SortOrder.DESCENDING); 
     assertEquals(data.getKey(0), "D"); 
     assertEquals(data.getKey(1), "A"); 
     assertEquals(data.getKey(2), "C"); 
     assertEquals(data.getKey(3), "B"); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), null); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
 }
public void testSortByValueDescending1424() { 
     DefaultKeyedValues data = new DefaultKeyedValues(); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("B", null); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.sortByKeys(SortOrder.DESCENDING); 
     assertEquals(data.getKey(0), "D"); 
     assertEquals(data.getKey(1), "A"); 
     assertEquals(data.getKey(2), "C"); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
     assertEquals(data.getValue("A"), null); 
     assertEquals(data.getValue("B"), new Double(2.0)); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
     assertEquals(data.getValue("E"), new Double(4.0)); 
     assertEquals(data.getValue("F"), new Double(5.0)); 
     assertEquals(data.getValue("G"), new Double(6.0)); 
     assertEquals(data.getValue("H"), new Double(7.0)); 
     assertEquals(data.getValue("R"), new Double(8.0)); 
     assertEquals(data.getValue("R"), new Double(7.0)); 
 }
public void testSortByValueDescending1425() { 
     DefaultKeyedValues data = new DefaultKeyedValues(); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("B", null); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.addValue("B", new Double(1.0)); 
     data.addValue("C", new Double(3.0)); 
     assertEquals(data.getKey(0), "D"); 
     assertEquals(data.getKey(1), "A"); 
     assertEquals(data.getKey(2), "C"); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), null); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), new Double(1.0)); 
     assertEquals(data.getValue("C"), new Double(3.0)); 
     assertEquals(data.getValue("D"), new Double(4.0)); 
     assertEquals(data.getValue("A"), new Double(5.0)); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), null); 
 }
public void testSortByValueDescending1426() { 
     DefaultKeyedValues data = new DefaultKeyedValues(); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("B", null); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.addValue("B", new Double(1.0)); 
     data.sortByKeys(SortOrder.DESCENDING); 
     assertEquals(data.getKey(0), "D"); 
     assertEquals(data.getKey(1), "A"); 
     assertEquals(data.getKey(2), "C"); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), null); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), new Double(1.0)); 
     assertEquals(data.getValue("C"), new Double(3.0)); 
     assertEquals(data.getValue("D"), new Double(4.0)); 
     assertEquals(data.getValue("A"), new Double(5.0)); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
 }
public void testSortByValueDescending1427() { 
     DefaultKeyedValues data = new DefaultKeyedValues(); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("B", null); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.addValue("B", new Double(1.0)); 
     data.addValue("C", new Double(3.0)); 
     assertEquals(data.getKey(0), "D"); 
     assertEquals(data.getKey(1), "A"); 
     assertEquals(data.getKey(2), "C"); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), null); 
     assertEquals(data.getValue("C"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
     assertEquals(data.getValue("A"), new Double(2.0)); 
     assertEquals(data.getValue("B"), new Double(1.0)); 
     assertEquals(data.getValue("C"), new Double(3.0)); 
     assertEquals(data.getValue("D"), new Double(1.0)); 
 }
public void testSortByValueDescending1428() { 
     DefaultKeyedValues data = new DefaultKeyedValues(); 
     data.addValue("C", new Double(1.0)); 
     data.addValue("B", null); 
     data.addValue("D", new Double(3.0)); 
     data.addValue("A", new Double(2.0)); 
     data.sortByKeys(SortOrder.DESCENDING); 
     assertEquals(data.getKey(0), "D"); 
     assertEquals(data.getKey(1), "A"); 
     assertEquals(data.getKey(2), "C"); 
     assertEquals(data.getValue("A"), new Double(3.0)); 
     assertEquals(data.getValue("B"), null); 
     assertEquals(data.getValue("C"), new Double(2.0)); 
     assertEquals(data.getValue("D"), new Double(1.0)); 
     assertEquals(data.getValue("A"), new Double(3.0)); 
     assertEquals(data.getValue("B"), new Double(1.0)); 
     assertEquals(data.getValue("C"), new Double(2.0)); 
     assertEquals(data.getValue("D"), new Double(1.0)); 
     assertEquals(data.getValue("D"), new Double(3.0)); 
 }
public void testSerialization1429() { 
     DefaultKeyedValues v1 = new DefaultKeyedValues(); 
     v1.addValue("Key 1", new Double(23)); 
     v1.addValue("Key 2", null); 
     DefaultKeyedValues v2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(v1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         v2 = (DefaultKeyedValues) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(v1, v2); 
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
