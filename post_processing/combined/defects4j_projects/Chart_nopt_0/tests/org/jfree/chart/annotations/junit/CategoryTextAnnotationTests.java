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
 * CategoryTextAnnotationTests.java
 * --------------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 19-Aug-2003 : Version 1 (DG);
 * 07-Jan-2005 : Added hashCode() test (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.chart.annotations.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link CategoryTextAnnotation} class.
 */
public class CategoryTextAnnotationTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CategoryTextAnnotationTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CategoryTextAnnotationTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testCategoryTextAnnotation5066() { CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); CategoryTextAnnotation a2 = new CategoryTextAnnotation("Test", "Category", 1.0); assertEquals(a1, a2); }
public void testGetCategory5067() { CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); assertEquals("Category", a1.getCategory()); CategoryTextAnnotation a2 = new CategoryTextAnnotation("Test", "Category", 2.0); assertEquals("Category", a2.getCategory()); }
public void testCategoryTextAnnotation5068() { CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); assertEquals("Category", a1.getCategory()); CategoryTextAnnotation a2 = new CategoryTextAnnotation("Test", "Category", 2.0); assertEquals("Category", a2.getCategory()); }
public void testCloning5069() throws CloneNotSupportedException { CategoryTextAnnotation a1 = new CategoryTextAnnotation("Text", "Category", 1.0); CategoryTextAnnotation a2 = (CategoryTextAnnotation) a1.clone(); assertNotSame(a1, a2); a1.setCategory(null); assertSame(a1.getClass(), a2.getClass()); assertEquals(a1, a2); }
public void testCloning5070() throws CloneNotSupportedException { CategoryTextAnnotation a1 = new CategoryTextAnnotation("Text", "Category", 1.0); CategoryTextAnnotation a2 = (CategoryTextAnnotation) a1.clone(); assertNotSame(a1, a2); assertSame(a1.getClass(), a2.getClass()); assertEquals(a1, a2); a1.setCategory(null); assertNotSame(a1.getClass(), a2.getClass()); assertEquals(a1, a2); }
public void testCloning5074() throws CloneNotSupportedException { CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); CategoryTextAnnotation a2 = (CategoryTextAnnotation) a1.clone(); assertNotSame(a1, a2); assertSame(a1.getCategoryAnchor(), a2.getCategoryAnchor()); assertEquals(a1, a2); }
public void testCloning5078() throws CloneNotSupportedException { CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 0.0); CategoryTextAnnotation a2 = (CategoryTextAnnotation) a1.clone(); assertNotSame(a1, a2); a1.setValue(0.0); a2.setValue(0.0); assertSame(a1, a2); }
public void testCloning5079() throws CloneNotSupportedException { CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 0.5); CategoryTextAnnotation a2 = (CategoryTextAnnotation) a1.clone(); assertNotSame(a1, a2); a1.setValue(0.5); assertSame(a1, a2); }
public void testEquals5081() { CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); CategoryTextAnnotation a2 = new CategoryTextAnnotation("Test", "Category", 1.0); assertEquals(a1, a2); a1.setCategory("Category A"); assertFalse(a1.equals(a2)); a2.setCategory("Category A"); assertEquals(a1, a2); a1.setValue(0.5); assertFalse(a1.equals(a2)); a2.setValue(0.5); assertEquals(a1, a2); }
public void testEquals5082() { CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); CategoryTextAnnotation a2 = new CategoryTextAnnotation("Test", "Category", 1.0); assertEquals(a1, a2); a1.setCategory("Category A"); assertFalse(a1.equals(a2)); a2.setCategory("Category A"); assertEquals(a1, a2); a1.setValue(2.0); assertFalse(a1.equals(a2)); a2.setValue(2.0); assertEquals(a1, a2); }
public void testEquals5083() { CategoryTextAnnotation a1 = new CategoryTextAnnotation("Text", "Category", 1.0); CategoryTextAnnotation a2 = new CategoryTextAnnotation("Text", "Category", 1.0); assertEquals(a1, a2); a1.setCategory("Category A"); assertFalse(a1.equals(a2)); a2.setCategory("Category A"); assertEquals(a1, a2); a1.setValue(2.0); assertFalse(a1.equals(a2)); a2.setValue(2.0); assertEquals(a1, a2); }
public void testCloning5086() throws CloneNotSupportedException { CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); CategoryTextAnnotation a2 = (CategoryTextAnnotation) a1.clone(); assertNotSame(a1, a2); assertSame(a1.getClass(), a2.getClass()); assertEquals(a1, a2); }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Checks that this class implements PublicCloneable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
