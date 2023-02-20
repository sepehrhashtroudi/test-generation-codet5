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
public void testRemoveColumnByKey1182() { 
     DefaultKeyedValues2D d = new DefaultKeyedValues2D(); 
     d.addValue(new Double(1.0), "R1", "C1"); 
     d.addValue(new Double(2.0), "R2", "C2"); 
     d.removeColumn("C2"); 
     d.addValue(new Double(3.0), "R2", "C2"); 
     d.addValue(new Double(2.0), "R2", "C2"); 
     d.removeColumn("XXX"); 
     d.addValue(new Double(2.0), "R2", "C2"); 
     d.addValue(new Double(3.0), "R2", "C2"); 
     assertEquals(3.0, d.getValue("R2", "C2").doubleValue(), EPSILON); 
     boolean pass = false; 
     try { 
         d.removeColumn("XXX"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveValue1183() { 
     DefaultKeyedValues2D d = new DefaultKeyedValues2D(); 
     d.removeValue("R1", "C1"); 
     d.addValue(new Double(1.0), "R1", "C1"); 
     d.removeValue("R1", "C1"); 
     d.addValue(new Double(0.0), "R0", "C1"); 
     d.removeValue("R1", "C1"); 
     d.addValue(new Double(1.0), "R1", "C1"); 
     assertEquals(new Double(0.0), d.getValue(0, 0)); 
 }
public void testRemoveValue1185() { 
     DefaultKeyedValues2D d = new DefaultKeyedValues2D(); 
     d.removeValue("R1", "C1"); 
     d.addValue(new Double(1.0), "R1", "C1"); 
     d.removeValue("R1", "C1"); 
     d.addValue(new Double(0.0), "R0", "C1"); 
     d.removeValue("R1", "C1"); 
     d.addValue(new Double(1.0), "R1", "C1"); 
     assertEquals(0.0, d.getValue("R1", "C1").doubleValue(), EPSILON); 
     boolean pass = false; 
     try { 
         d.removeValue("XXX", "C1"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testEquals1189() { 
     DefaultKeyedValues2D d1 = new DefaultKeyedValues2D(); 
     DefaultKeyedValues2D d2 = new DefaultKeyedValues2D(); 
     assertTrue(d1.equals(d2)); 
     assertTrue(d2.equals(d1)); 
     d1.addValue(new Double(1.0), new Double(2.0), "S1"); 
     assertFalse(d1.equals(d2)); 
     d2.addValue(new Double(1.0), new Double(2.0), "S1"); 
     assertTrue(d1.equals(d2)); 
 }
public void testCloning1190() { 
     DefaultKeyedValues2D d1 = new DefaultKeyedValues2D(); 
     DefaultKeyedValues2D d2 = null; 
     try { 
         d2 = (DefaultKeyedValues2D) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         System.err.println("Failed to clone."); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
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
