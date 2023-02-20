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
public void testRemoveRowByKey65() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.setObject("Obj1", "R1", "C1"); 
     data.setObject("Obj2", "R2", "C2"); 
     data.removeRow("R2"); 
     assertEquals(1, data.getRowCount()); 
     assertEquals("Obj1", data.getObject(0, 0)); 
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
 }
public void testRemoveColumnByKey68() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.setObject("Obj1", "R1", "C1"); 
     data.setObject("Obj2", "R2", "C2"); 
     data.removeColumn("C2"); 
     assertEquals(1, data.getColumnCount()); 
     assertEquals("Obj1", data.getObject(0, 0)); 
     boolean pass = false; 
     try { 
         data.removeColumn("XXX"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.removeColumn(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testGetValueByKey69() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.addObject("Obj1", "R1", "C1"); 
     data.addObject("Obj2", "R2", "C2"); 
     assertEquals("Obj1", data.getObject("R1", "C1")); 
     assertEquals("Obj2", data.getObject("R2", "C2")); 
     assertNull(data.getObject("R1", "C1")); 
     assertNull(data.getObject("R1", "C2")); 
     boolean pass = false; 
     try { 
         data.getObject("XX", "C1"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.getObject("R1", "XX"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.getObject("R1", "XX"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.getObject("R1", "XX"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveColumnByKey73() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.setObject("Obj1", "R1", "C1"); 
     data.setObject("Obj2", "R2", "C2"); 
     data.removeColumn("C2"); 
     assertEquals("Obj1", data.getObject(0, 0)); 
     assertEquals("Obj2", data.getObject(0, 1)); 
     boolean pass = false; 
     try { 
         data.removeColumn("XXX"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.removeColumn(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testGetValueByKey75() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.addObject("Obj1", "R1", "C1"); 
     data.addObject("Obj2", "R2", "C2"); 
     assertEquals("Obj1", data.getObject("R1", "C1")); 
     assertEquals("Obj2", data.getObject("R2", "C2")); 
     assertNull(data.getObject("R1", "C1")); 
     assertNull(data.getObject("R2", "C2")); 
     assertEquals(null, data.getObject("R1", "C1")); 
     assertEquals(new Double(1.0), data.getObject("R1", "C1")); 
     assertEquals(new Double(2.0), data.getObject("R2", "C2")); 
     assertEquals(null, data.getObject("R1", "C3")); 
     boolean pass = false; 
     try { 
         data.getObject("R1", "C1"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.getObject("R1", "C4"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.getObject("R1", "C4"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testGetValueByKey76() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.addObject("Obj1", "R1", "C1"); 
     data.addObject("Obj2", "R2", "C2"); 
     assertEquals("Obj1", data.getObject("R1", "C1")); 
     assertEquals("Obj2", data.getObject("R2", "C2")); 
     assertNull(data.getObject("R1", "C1")); 
     assertNull(data.getObject("R2", "C2")); 
     assertNull(data.getObject("R1", "C1")); 
     assertNull(data.getObject("R2", "C1")); 
     assertNull(data.getObject("R2", "C2")); 
     assertNull(data.getObject("R1", "C3")); 
     boolean pass = false; 
     try { 
         data.getObject("R1", "C1"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.getObject("R1", "C4"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.getObject("R1", "C1"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         data.getObject("R1", "C2"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveRowByKey78() { 
     KeyedObjects2D data = new KeyedObjects2D(); 
     data.setObject("Obj1", "R1", "C1"); 
     data.setObject("Obj2", "R2", "C2"); 
     data.removeRow("R2"); 
     assertEquals("Obj1", data.getObject(0, 0)); 
     assertEquals("Obj2", data.getObject(0, 1)); 
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
 }
public void testCloning82() { 
     KeyedObjects2D d1 = new KeyedObjects2D(); 
     KeyedObjects2D d2 = null; 
     try { 
         d2 = (KeyedObjects2D) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
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
