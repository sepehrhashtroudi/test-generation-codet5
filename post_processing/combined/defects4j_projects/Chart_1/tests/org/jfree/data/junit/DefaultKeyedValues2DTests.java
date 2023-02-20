/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2007, by Object Refinery Limited and Contributors.
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
 * ------------------------------
 * DefaultKeyedValues2DTests.java
 * ------------------------------
 * (C) Copyright 2003-2007 by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 13-Mar-2003 : Version 1 (DG);
 * 15-Sep-2004 : Updated cloning test (DG);
 * 06-Oct-2005 : Added testEquals() (DG);
 * 18-Jan-2007 : Added testSparsePopulation() (DG);
 * 26-Feb-2007 : Added some basic tests (DG);
 * 30-Mar-2007 : Added a test for bug 1690654 (DG);
 * 21-Nov-2007 : Added testRemoveColumnByKey() method (DG);
 *
 */

package org.jfree.data.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.UnknownKeyException;

/**
 * Tests for the {@link DefaultKeyedValues2D} class.
 */
public class DefaultKeyedValues2DTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultKeyedValues2DTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultKeyedValues2DTests(String name) {
        super(name);
    }

    /**
     * Some checks for the getValue() method.
     */
public void testGetValue1199() { 
     DefaultKeyedValues2D v = new DefaultKeyedValues2D(); 
     assertNull(v.getValue("R1", "C1")); 
     v.setValue(new Double(1.0), "R2", "C1"); 
     assertEquals(new Double(1.0), v.getValue("R2", "C1")); 
     v.setValue(null, "R2", "C2"); 
     assertEquals(new Double(1.0), v.getValue("R2", "C2")); 
     boolean pass = false; 
     try { 
         v.getValue("R2", null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveValueBug16906541201() { 
     DefaultKeyedValues2D d = new DefaultKeyedValues2D(); 
     d.addValue(new Double(1.0), "R1", "C1"); 
     d.addValue(new Double(2.0), "R2", "C2"); 
     assertEquals(2, d.getColumnCount()); 
     assertEquals(2, d.getRowCount()); 
     d.removeValue("R2", "C2"); 
     assertEquals(1, d.getColumnCount()); 
     assertEquals(1, d.getRowCount()); 
     assertEquals(new Double(1.0), d.getValue(0, 0)); 
 }
public void testRemoveRow1202() { 
     DefaultKeyedValues2D v = new DefaultKeyedValues2D(); 
     assertEquals(0, v.getColumnCount()); 
     v.addValue(new Double(1.0), "R1", "C1"); 
     assertEquals(1, v.getColumnCount()); 
     v.removeRow("R1"); 
     assertEquals(0, v.getColumnCount()); 
     v.addValue(new Double(2.0), "R2", "C1"); 
     assertEquals(2, v.getColumnCount()); 
     boolean pass = false; 
     try { 
         v.removeRow(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         v.removeRow("R2"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         v.removeRow("R2"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveRow1203() { 
     DefaultKeyedValues2D v = new DefaultKeyedValues2D(); 
     assertEquals(0, v.getColumnCount()); 
     v.addValue(new Double(1.0), "R1", "C1"); 
     assertEquals(1, v.getColumnCount()); 
     v.removeRow("R1"); 
     assertEquals(0, v.getColumnCount()); 
     v.removeRow("R1"); 
     assertEquals(0, v.getColumnCount()); 
 }
public void testRemoveColumn1204() { 
     DefaultKeyedValues2D d = new DefaultKeyedValues2D(); 
     d.addValue(new Double(1.0), "R1", "C1"); 
     assertEquals(1, d.getColumnCount()); 
     d.removeColumn("C1"); 
     assertEquals(0, d.getColumnCount()); 
     boolean pass = false; 
     try { 
         d.removeColumn(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         d.removeColumn("XX"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         d.removeColumn("XXX"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testSerialization1205() { 
     DefaultKeyedValues2D v1 = new DefaultKeyedValues2D(); 
     v1.setValue(new Integer(1), "V1", "C1"); 
     v1.setValue(new Integer(2), "V2", "C2"); 
     DefaultKeyedValues2D v2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(v1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         v2 = (DefaultKeyedValues2D) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(v1, v2); 
 }
public void testCloning1206() { 
     DefaultKeyedValues2D v1 = new DefaultKeyedValues2D(); 
     v1.setValue(new Integer(1), "V1", "C1"); 
     DefaultKeyedValues2D v2 = null; 
     try { 
         v2 = (DefaultKeyedValues2D) v1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(v1 != v2); 
     assertTrue(v1.getClass() == v2.getClass()); 
     assertTrue(v1.equals(v2)); 
     v1.setValue(new Integer(2), "V2", "C2"); 
     assertFalse(v1.equals(v2)); 
     v2.setValue(new Integer(1), "V2", "C2"); 
     assertTrue(v1.equals(v2)); 
 }
    

    /**
     * Some checks for the clone() method.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the equals() method.
     */
    

    /**
     * Populates a data structure with sparse entries, then checks that
     * the unspecified entries return null.
     */
    

    /**
     * Some basic checks for the getRowCount() method.
     */
    

    /**
     * Some basic checks for the getColumnCount() method.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * Some basic checks for the getValue(int, int) method.
     */
    

    /**
     * Some basic checks for the getRowKey() method.
     */
    

    /**
     * Some basic checks for the getColumnKey() method.
     */
    

    /**
     * Some basic checks for the removeValue() method.
     */
    

    /**
     * A test for bug 1690654.
     */
    

    /**
     * Some basic checks for the removeRow() method.
     */
    

    /**
     * Some basic checks for the removeColumn(Comparable) method.
     */
    

}
