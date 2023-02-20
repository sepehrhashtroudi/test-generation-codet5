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
 * ----------------------
 * CategoryAxisTests.java
 * ----------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 18-Mar-2003 : Version 1 (DG);
 * 13-Aug-2003 : Added clone() test (DG);
 * 07-Jan-2005 : Added hashCode() test (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;

/**
 * Tests for the {@link CategoryAxis} class.
 */
public class CategoryAxisTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CategoryAxisTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CategoryAxisTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testSetCategoryLabelPositionOffset240() { CategoryAxis a1 = new CategoryAxis(); a1.setCategoryLabelPositionOffset(0); assertEquals(0, a1.getCategoryLabelPositionOffset()); a1.setCategoryLabelPositionOffset(1); assertEquals(1, a1.getCategoryLabelPositionOffset()); a1.setCategoryLabelPositionOffset(2); assertEquals(2, a1.getCategoryLabelPositionOffset()); a1.setCategoryLabelPositionOffset(3); assertEquals(3, a1.getCategoryLabelPositionOffset()); }
public void testSetCategoryLabelPositionOffset241() { CategoryAxis a1 = new CategoryAxis(); a1.setCategoryLabelPositionOffset(0); assertEquals(0, a1.getCategoryLabelPositionOffset()); a1.setCategoryLabelPositionOffset(1); assertEquals(1, a1.getCategoryLabelPositionOffset()); a1.setCategoryLabelPositionOffset(2); assertEquals(2, a1.getCategoryLabelPositionOffset()); }
public void testSetCategoryLabelPositions244() { CategoryAxis a1 = new CategoryAxis(); CategoryLabelPositions positions = new CategoryLabelPositions(); a1.setCategoryLabelPositions(positions); assertSame(positions, a1.getCategoryLabelPositions()); try { a1.setCategoryLabelPositions(null); fail("IllegalArgumentException should have been thrown on null categoryLabelPositions"); } catch (IllegalArgumentException e) { assertEquals("Null \'positions\' argument.", e.getMessage()); } }
public void testCloning315() throws CloneNotSupportedException { CategoryAxis a1 = new CategoryAxis("Test"); CategoryAxis a2 = (CategoryAxis) a1.clone(); assertNotSame(a1, a2); assertSame(a1.getClass(), a2.getClass()); assertEquals(a1, a2); }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Confirm that cloning works.  This test customises the font and paint
     * per category label.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
