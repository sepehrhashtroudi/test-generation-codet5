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
 * ----------------------------
 * SimpleHistogramBinTests.java
 * ----------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 10-Jan-2005 : Version 1 (DG);
 *
 */

package org.jfree.data.statistics.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.statistics.SimpleHistogramBin;

/**
 * Tests for the {@link SimpleHistogramBin} class.
 */
public class SimpleHistogramBinTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(SimpleHistogramBinTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public SimpleHistogramBinTests(String name) {
        super(name);
    }

    /**
     * Some checks for the accepts() method.
     */
public void testCloning1465() { 
     SimpleHistogramBin b1 = new SimpleHistogramBin(1.1, 2.2, false, true); 
     b1.setItemCount(99); 
     SimpleHistogramBin b2 = null; 
     try { 
         b2 = (SimpleHistogramBin) b1.clone(); 
     } catch (CloneNotSupportedException e) { 
         System.err.println("Failed to clone."); 
     } 
     assertTrue(b1 != b2); 
     assertTrue(b1.getClass() == b2.getClass()); 
     assertTrue(b1.equals(b2)); 
     b2.setItemCount(111); 
     assertFalse(b1.equals(b2)); 
 }
public void testOverlapsWith1467() { 
     SimpleHistogramBin b1 = new SimpleHistogramBin(1.1, 2.2, false, true); 
     SimpleHistogramBin b2 = new SimpleHistogramBin(1.1, 2.2, false, true); 
     assertFalse(b1.overlapsWith(b2)); 
     b2.setItemCount(99); 
     assertTrue(b1.overlapsWith(b2)); 
     b2.setItemCount(111); 
     assertTrue(b1.overlapsWith(b2)); 
     b1 = new SimpleHistogramBin(1.1, 2.2, false, true); 
     assertFalse(b1.overlapsWith(b2)); 
     b2.setItemCount(111); 
     assertTrue(b1.overlapsWith(b2)); 
     b1 = new SimpleHistogramBin(1.1, 2.2, false, true); 
     assertFalse(b1.overlapsWith(b2)); 
     b2 = new SimpleHistogramBin(1.1, 2.2, false, true); 
     assertTrue(b1.overlapsWith(b2)); 
     b1.setItemCount(111); 
     assertFalse(b1.overlapsWith(b2)); 
     b2.setItemCount(111); 
     assertTrue(b1.overlapsWith(b2)); 
     b1.setSelected(false); 
     assertFalse(b1.overlapsWith(b2)); 
     b2.setSelected(false); 
     assertTrue(b1.overlapsWith(b2)); 
 }
public void testOverlapsWith1468() { 
     SimpleHistogramBin b1 = new SimpleHistogramBin(1.1, 2.2, false, true); 
     SimpleHistogramBin b2 = new SimpleHistogramBin(1.1, 2.2, false, true); 
     assertFalse(b1.overlapsWith(b2)); 
     b2.setItemCount(99); 
     assertTrue(b1.overlapsWith(b2)); 
     b2.setItemCount(111); 
     assertTrue(b1.overlapsWith(b2)); 
     b1 = new SimpleHistogramBin(1.1, 2.2, false, true); 
     assertFalse(b1.overlapsWith(b2)); 
     b2.setItemCount(111); 
     assertTrue(b1.overlapsWith(b2)); 
     b1 = new SimpleHistogramBin(1.1, 2.2, false, true); 
     assertFalse(b1.overlapsWith(b2)); 
     b2 = new SimpleHistogramBin(1.1, 2.2, false, true); 
     assertTrue(b1.overlapsWith(b2)); 
     b1.setItemCount(111); 
     assertFalse(b1.overlapsWith(b2)); 
     b2.setItemCount(111); 
     assertTrue(b1.overlapsWith(b2)); 
     b1.setSelected(false); 
     assertFalse(b1.overlapsWith(b2)); 
     b2.setSelected(false); 
     assertTrue(b1.equals(b2)); 
 }
    

    /**
     * Some checks for the overlapsWith() method.
     */
    

    /**
     * Ensure that the equals() method can distinguish all fields.
     */
    

    /**
     * Some checks for the clone() method.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
