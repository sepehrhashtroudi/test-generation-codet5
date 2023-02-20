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
 * -----------------------------------
 * CategoryPointerAnnotationTests.java
 * -----------------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 02-Oct-2006 : Version 1 (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.chart.annotations.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.annotations.CategoryPointerAnnotation;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link CategoryPointerAnnotation} class.
 */
public class CategoryPointerAnnotationTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CategoryPointerAnnotationTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CategoryPointerAnnotationTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testHashCode4980() { CategoryPointerAnnotation a1 = new CategoryPointerAnnotation("Label", "A", 20.0, Math.PI); CategoryPointerAnnotation a2 = new CategoryPointerAnnotation("Label", "A", 20.0, Math.PI); assertEquals(a1, a2); int h1 = a1.hashCode(); int h2 = a2.hashCode(); assertEquals(h1, h2); }
public void testHashCode4981() { CategoryPointerAnnotation a1 = new CategoryPointerAnnotation("Label", "Test", 1.0, Math.PI); CategoryPointerAnnotation a2 = new CategoryPointerAnnotation("Label", "Test", 1.0, Math.PI); assertEquals(a1, a2); int h1 = a1.hashCode(); int h2 = a2.hashCode(); assertEquals(h1, h2); }
public void testHashCode4982() { CategoryPointerAnnotation a1 = new CategoryPointerAnnotation("Label", "A", 1.0, Math.PI); CategoryPointerAnnotation a2 = new CategoryPointerAnnotation("Label", "A", 1.0, Math.PI); assertEquals(a1, a2); int h1 = a1.hashCode(); int h2 = a2.hashCode(); assertEquals(h1, h2); }
public void testCloning4983() throws CloneNotSupportedException { CategoryPointerAnnotation p1 = new CategoryPointerAnnotation("Label", "A", 20.0, Math.PI); CategoryPointerAnnotation p2 = (CategoryPointerAnnotation) p1.clone(); assertNotSame(p1, p2); assertSame(p1.getClass(), p2.getClass()); assertEquals(p1, p2); }
    

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
