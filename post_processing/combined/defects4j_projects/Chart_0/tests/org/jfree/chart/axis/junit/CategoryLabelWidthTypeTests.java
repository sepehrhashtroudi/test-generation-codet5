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
 * CategoryLabelWidthTypeTests.java
 * --------------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 13-May-2004 : Version 1 (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.axis.CategoryLabelWidthType;

/**
 * Tests for the {@link CategoryLabelWidthType} class.
 */
public class CategoryLabelWidthTypeTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CategoryLabelWidthTypeTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CategoryLabelWidthTypeTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals() method distinguishes the known values.
     */
public void testHashCode1102() { 
     CategoryLabelWidthType a1 = CategoryLabelWidthType.CATEGORY; 
     CategoryLabelWidthType a2 = CategoryLabelWidthType.CATEGORY; 
     assertTrue(a1.equals(a2)); 
     int h1 = a1.hashCode(); 
     int h2 = a2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testEquals1103() { 
     CategoryLabelWidthType a1 = CategoryLabelWidthType.CATEGORY; 
     CategoryLabelWidthType a2 = CategoryLabelWidthType.CATEGORY; 
     assertTrue(a1.equals(a2)); 
     assertTrue(a2.equals(a1)); 
     a1 = CategoryLabelWidthType.RANGE; 
     assertFalse(a1.equals(a2)); 
     a2 = CategoryLabelWidthType.RANGE; 
     assertTrue(a1.equals(a2)); 
     a1 = CategoryLabelWidthType.CATEGORY; 
     assertFalse(a1.equals(a2)); 
     a2 = CategoryLabelWidthType.CATEGORY; 
     assertTrue(a1.equals(a2)); 
     a1 = CategoryLabelWidthType.RANGE; 
     assertFalse(a1.equals(a2)); 
     a2 = CategoryLabelWidthType.RANGE; 
     assertTrue(a1.equals(a2)); 
 }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
