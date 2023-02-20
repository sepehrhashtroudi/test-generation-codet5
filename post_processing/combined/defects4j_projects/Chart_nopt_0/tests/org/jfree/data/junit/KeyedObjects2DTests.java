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
public void testGetRowCount371() { KeyedObjects2D obj = new KeyedObjects2D(); assertEquals(0, obj.getRowCount()); obj.addObject("1", "R1", "C1"); assertEquals(1, obj.getRowCount()); obj.addObject("2", "R2", "C2"); assertEquals(2, obj.getRowCount()); obj.addObject("3", "R3", "C3"); assertEquals(3, obj.getRowCount()); obj.clear(); assertEquals(0, obj.getRowCount()); }
public void testGetColumnCount373() { KeyedObjects2D d = new KeyedObjects2D(); assertEquals(0, d.getColumnCount()); d.addObject("1", "A", "C"); assertEquals(1, d.getColumnCount()); d.addObject("2", "B", "C"); assertEquals(2, d.getColumnCount()); d.addObject("3", "A", "C"); assertEquals(3, d.getColumnCount()); d.addObject("4", "B", "C"); assertEquals(4, d.getColumnCount()); d.clear(); assertEquals(0, d.getColumnCount()); }
public void testGetColumnCount374() { KeyedObjects2D obj = new KeyedObjects2D(); assertEquals(0, obj.getColumnCount()); obj.addObject("1", "R1", "C1"); assertEquals(1, obj.getColumnCount()); obj.addObject("2", "R2", "C2"); assertEquals(2, obj.getColumnCount()); obj.addObject("3", "R3", "C3"); assertEquals(3, obj.getColumnCount()); obj.clear(); assertEquals(0, obj.getColumnCount()); }
public void testGetObject390() { KeyedObjects2D obj = new KeyedObjects2D(); obj.addObject("object1", "row1", "col1"); obj.addObject("object2", "row2", "col2"); obj.addObject("object3", "row3", "col3"); obj.addObject("object4", "row4", "col4"); obj.addObject("object5", "row5", "col5"); assertEquals("object1", obj.getObject(0, 0)); assertEquals("object2", obj.getObject(0, 1)); assertEquals("object3", obj.getObject(1, 0));
}

public void testEquals409() { KeyedObjects2D obj = new KeyedObjects2D(); obj.addObject(new Object(), "1", "2"); obj.addObject(new Object(), "1", "3"); obj.addObject(new Object(), "1", "4"); obj.addObject(new Object(), "1", "5"); obj.addObject(new Object(), "1", "6"); obj.addObject(new Object(), "1", "7"); obj.addObject(new Object(), "1", "8"); obj.addObject(new Object(), "1", "9"); obj.addObject(new Object(), "1", "10");
}

public void testEquals411() { KeyedObjects2D obj = new KeyedObjects2D(); assertTrue(obj.equals(obj)); obj = new KeyedObjects2D(); assertTrue(obj.equals(obj)); obj = new KeyedObjects2D(); assertFalse(obj.equals(obj)); obj = new KeyedObjects2D(); assertFalse(obj.equals(obj)); obj = new KeyedObjects2D(); assertFalse(obj.equals(obj)); obj = new KeyedObjects2D(); assertFalse(obj.equals(obj)); obj = new KeyedObjects2D(); assertFalse(obj.equals(obj)); obj = new KeyedObjects2D();
}

public void testEquals415() { KeyedObjects2D obj = new KeyedObjects2D(); assertTrue(obj.equals(obj)); obj = new KeyedObjects2D(); assertTrue(obj.equals(obj)); obj = new KeyedObjects2D(); assertTrue(obj.equals(obj)); obj = new KeyedObjects2D(); assertFalse(obj.equals(obj)); obj = new KeyedObjects2D(); assertFalse(obj.equals(obj)); obj = new KeyedObjects2D(); assertFalse(obj.equals(obj)); obj = new KeyedObjects2D(); assertFalse(obj.equals(obj)); obj = new KeyedObjects2D();
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
