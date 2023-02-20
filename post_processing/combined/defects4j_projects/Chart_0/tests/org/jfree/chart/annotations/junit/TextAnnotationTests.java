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
 * TextAnnotationTests.java
 * ------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 19-Aug-2003 : Version 1 (DG);
 * 07-Jan-2005 : Added testHashCode() method (DG);
 * 20-Jun-2007 : Removed JCommon tests (DG);
 *
 */

package org.jfree.chart.annotations.junit;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.annotations.TextAnnotation;
import org.jfree.chart.text.TextAnchor;

/**
 * Tests for the {@link TextAnnotation} class.
 */
public class TextAnnotationTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(TextAnnotationTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public TextAnnotationTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testEquals1130() { 
     CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); 
     CategoryTextAnnotation a2 = new CategoryTextAnnotation("Test", "Category", 1.0); 
     assertTrue(a1.equals(a2)); 
     assertTrue(a2.equals(a1)); 
     a1 = new CategoryTextAnnotation("Test 1", "Category", 1.0); 
     assertFalse(a1.equals(a2)); 
     a2 = new CategoryTextAnnotation("Test 1", "Category", 1.0); 
     assertTrue(a1.equals(a2)); 
     a1 = new CategoryTextAnnotation("Test 2", "Category", 1.0); 
     assertFalse(a1.equals(a2)); 
     a2 = new CategoryTextAnnotation("Test 2", "Category", 1.0); 
     assertTrue(a1.equals(a2)); 
     a1 = new CategoryTextAnnotation("Test 2", "Category", 1.1); 
     assertFalse(a1.equals(a2)); 
     a2 = new CategoryTextAnnotation("Test 2", "Category", 1.1); 
     assertTrue(a1.equals(a2)); 
     a1 = new CategoryTextAnnotation("Test 2", "Category", 1.2); 
     assertFalse(a1.equals(a2)); 
     a2 = new CategoryTextAnnotation("Test 2", "Category", 1.2); 
     assertTrue(a1.equals(a2)); 
     a1.setFont(new Font("Serif", Font.PLAIN, 23)); 
     assertFalse(a1.equals(a2)); 
     a2.setFont(new Font("Serif", Font.PLAIN, 23)); 
     assertTrue(a1.equals(a2)); 
     GradientPaint gp1 = new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow);
}

    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

}
