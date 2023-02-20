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
 * --------------------------------
 * DefaultCategoryDatasetTests.java
 * --------------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 23-Mar-2004 : Version 1 (DG);
 * 08-Mar-2007 : Added testCloning() (DG);
 * 21-Nov-2007 : Added testBug1835955() method (DG);
 * 09-May-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.data.category.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.UnknownKeyException;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link DefaultCategoryDataset} class.
 */
public class DefaultCategoryDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultCategoryDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultCategoryDatasetTests(String name) {
        super(name);
    }

    /**
     * Some checks for the getValue() method.
     */

public void testAddValue90() { 
     DefaultCategoryDataset d1 = new DefaultCategoryDataset(); 
     d1.addValue(null, "R1", "C1"); 
     assertNull(d1.getValue("R1", "C1")); 
     d1.addValue(new Double(1.0), "R2", "C1"); 
     assertEquals(new Double(1.0), d1.getValue("R2", "C1")); 
     boolean pass = false; 
     try { 
         d1.addValue(new Double(1.1), null, "C2"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void testSerialization91() { 
     DefaultCategoryDataset d1 = new DefaultCategoryDataset(); 
     d1.setValue(23.4, "R1", "C1"); 
     DefaultCategoryDataset d2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(d1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         d2 = (DefaultCategoryDataset) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(d1, d2); 
 } 


public void testRemoveValue92() { 
     DefaultCategoryDataset d = new DefaultCategoryDataset(); 
     boolean pass = false; 
     try { 
         d.removeValue("R1", "C1"); 
     } catch (UnknownKeyException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     d.addValue(new Double(1.0), "R1", "C1"); 
     d.removeValue("R1", "C1"); 
     assertEquals(0, d.getRowCount()); 
     assertEquals(0, d.getColumnCount()); 
     d.addValue(new Double(1.0), "R1", "C1"); 
     d.addValue(new Double(2.0), "R2", "C1"); 
     d.removeValue("R1", "C1"); 
     assertEquals(new Double(2.0), d.getValue(0, 0)); 
     pass = false; 
     try { 
         d.removeValue(null, "C1"); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         d.removeValue("R1", null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void testCloning94() { 
     DefaultCategoryDataset d1 = new DefaultCategoryDataset(); 
     DefaultCategoryDataset d2 = null; 
     try { 
         d2 = (DefaultCategoryDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     d1.addValue(1.0, "R1", "C1"); 
     d1.addValue(2.0, "R1", "C2"); 
     try { 
         d2 = (DefaultCategoryDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     d1.addValue(3.0, "R1", "C1"); 
     assertFalse(d1.equals(d2)); 
     d2.addValue(3.0, "R1", "C1"); 
     assertTrue(d1.equals(d2)); 
 } 

    

    /**
     * A simple check for the getValue(int, int) method.
     */
    

    /**
     * Some checks for the incrementValue() method.
     */
    

    /**
     * Some tests for the getRowCount() method.
     */
    

    /**
     * Some tests for the getColumnCount() method.
     */
    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the addValue() method.
     */
    

    /**
     * Some basic checks for the removeValue() method.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Check that this class implements PublicCloneable.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * A test for bug 1835955.
     */
    

    /**
     * Some checks for the removeColumn(Comparable) method.
     */
    

    /**
     * Some checks for the removeRow(Comparable) method.
     */
    

}
