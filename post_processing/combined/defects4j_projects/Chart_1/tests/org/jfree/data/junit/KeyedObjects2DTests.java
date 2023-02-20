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
 * ------------------------
 * KeyedObjects2DTests.java
 * ------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 01-Mar-2004 : Version 1 (DG);
 * 28-Sep-2007 : Added testEquals() and enhanced testClone() (DG);
 * 03-Oct-2007 : Added new tests (DG);
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

import org.jfree.data.KeyedObjects2D;
import org.jfree.data.UnknownKeyException;

/**
 * Tests for the {@link KeyedObjects2D} class.
 */
public class KeyedObjects2DTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(KeyedObjects2DTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public KeyedObjects2DTests(String name) {
        super(name);
    }

    /**
     * Some checks for the equals() method.
     */
public void testCloning75() { 
     KeyedObjects2D o1 = new KeyedObjects2D(); 
     o1.setObject(new Integer(1), "V1", "C1"); 
     o1.setObject(null, "V2", "C1"); 
     o1.setObject(new Integer(3), "V3", "C2"); 
     KeyedObjects2D o2 = null; 
     try { 
         o2 = (KeyedObjects2D) o1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(o1 != o2); 
     assertTrue(o1.getClass() == o2.getClass()); 
     assertTrue(o1.equals(o2)); 
     o1.addObject("XX", "R1", "C1"); 
     assertFalse(o1.equals(o2)); 
 }
public void testRemoveRow79() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.setObject("Obj1", "R1", "C1"); 
     data.setObject("Obj2", "R2", "C2"); 
     assertEquals(2, data.getColumnCount()); 
     data.removeRow("R2"); 
     assertEquals(0, data.getColumnCount()); 
     data.removeRow("R2"); 
     assertEquals(0, data.getColumnCount()); 
     boolean pass = false; 
     try { 
         data.removeRow(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.removeRow("R2"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveRow80() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.setObject("Obj1", "R1", "C1"); 
     data.setObject("Obj2", "R2", "C2"); 
     assertEquals(2, data.getColumnCount()); 
     data.removeRow("R2"); 
     assertEquals(0, data.getColumnCount()); 
     data.removeRow("R2"); 
     assertEquals(0, data.getColumnCount()); 
     boolean pass = false; 
     try { 
         data.removeRow(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.removeRow("R2"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.removeRow("R2"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveColumn81() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.setObject("Obj1", "R1", "C1"); 
     data.setObject("Obj2", "R2", "C2"); 
     assertEquals(2, data.getColumnCount()); 
     data.removeColumn("C1"); 
     assertEquals(0, data.getColumnCount()); 
     data.removeColumn("C1"); 
     assertEquals(0, data.getColumnCount()); 
     boolean pass = false; 
     try { 
         data.removeColumn(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.removeColumn("C1"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.removeColumn("C2"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveRow82() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.setObject("Obj1", "R1", "C1"); 
     data.setObject("Obj2", "R2", "C2"); 
     assertEquals(2, data.getColumnCount()); 
     data.removeRow("R2"); 
     assertEquals(0, data.getColumnCount()); 
     boolean pass = false; 
     try { 
         data.removeRow("XXX"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.removeRow(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.removeRow("XXX"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveRow83() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.setObject(new Integer(1), "V1", "C1"); 
     data.setObject(null, "V2", "C1"); 
     assertEquals(1, data.getRowCount()); 
     data.removeRow("R1"); 
     assertEquals(0, data.getRowCount()); 
     boolean pass = false; 
     try { 
         data.removeRow("XX"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.removeRow("R2"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.removeRow(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveColumn84() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.setObject("Obj1", "R1", "C1"); 
     data.setObject("Obj2", "R2", "C2"); 
     assertEquals(2, data.getColumnCount()); 
     data.removeColumn("C1"); 
     assertEquals(0, data.getColumnCount()); 
     boolean pass = false; 
     try { 
         data.removeColumn(null); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.removeColumn("XX"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.removeColumn("XXX"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveColumn85() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.setObject(new Integer(1), "V1", "C1"); 
     data.setObject(null, "V2", "C1"); 
     assertEquals(1, data.getColumnCount()); 
     data.removeColumn("C1"); 
     assertEquals(0, data.getColumnCount()); 
     boolean pass = false; 
     try { 
         data.removeColumn("XXX"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the getValue(int, int) method.
     */
    

    /**
     * Some checks for the getValue(Comparable, Comparable) method.
     */
    

    /**
     * Some checks for the setObject(Object, Comparable, Comparable) method.
     */
    

    /**
     * Some checks for the removeRow(int) method.
     */
    

    /**
     * Some checks for the removeColumn(int) method.
     */
    

    /**
     * Some checks for the removeRow(Comparable) method.
     */
    

    /**
     * Some checks for the removeColumn(Comparable) method.
     */
    

    /**
     * A simple check for the removeValue() method.
     */
    

}
