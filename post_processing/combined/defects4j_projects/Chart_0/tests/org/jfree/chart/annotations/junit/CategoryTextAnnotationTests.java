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
public void testPublicCloneable964() { 
     CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); 
     assertTrue(a1 instanceof PublicCloneable); 
 }
public void testSerialization965() { 
     CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); 
     CategoryTextAnnotation a2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(a1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         a2 = (CategoryTextAnnotation) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(a1, a2); 
 }
public void testEquals971() { 
     CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); 
     CategoryTextAnnotation a2 = new CategoryTextAnnotation("Test", "Category", 1.0); 
     assertTrue(a1.equals(a2)); 
     assertTrue(a2.equals(a1)); 
     a1 = new CategoryTextAnnotation("Test 1", "Category", 1.0); 
     assertFalse(a1.equals(a2)); 
     a2 = new CategoryTextAnnotation("Test", "Category", 1.0); 
     assertTrue(a1.equals(a2)); 
     a1 = new CategoryTextAnnotation("Test 2", "Category", 2.0); 
     assertFalse(a1.equals(a2)); 
     a2 = new CategoryTextAnnotation("Test 2", "Category", 2.0); 
     assertTrue(a1.equals(a2)); 
     a1 = new CategoryTextAnnotation("Test 2", "Category", 3.0); 
     assertFalse(a1.equals(a2)); 
     a2 = new CategoryTextAnnotation("Test 2", "Category", 3.0); 
     assertTrue(a1.equals(a2)); 
 }
public void testCloning972() { 
     CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); 
     CategoryTextAnnotation a2 = null; 
     try { 
         a2 = (CategoryTextAnnotation) a1.clone(); 
     } catch (CloneNotSupportedException e) { 
         System.err.println("Failed to clone."); 
     } 
     assertTrue(a1 != a2); 
     assertTrue(a1.getClass() == a2.getClass()); 
     assertTrue(a1.equals(a2)); 
 }
public void testHashCode1124() { 
     CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); 
     CategoryTextAnnotation a2 = new CategoryTextAnnotation("Test", "Category", 1.0); 
     assertTrue(a1.equals(a2)); 
     int h1 = a1.hashCode(); 
     int h2 = a2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testHashCode1131() { 
     CategoryTextAnnotation a1 = new CategoryTextAnnotation("Text", "Category", 1.0); 
     CategoryTextAnnotation a2 = new CategoryTextAnnotation("Text", "Category", 1.0); 
     assertTrue(a1.equals(a2)); 
     int h1 = a1.hashCode(); 
     int h2 = a2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testSerialization1132() { 
     CategoryTextAnnotation a1 = new CategoryTextAnnotation("Test", "Category", 1.0); 
     CategoryTextAnnotation a2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(a1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         a2 = (CategoryTextAnnotation) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(a1, a2); 
     a1 = new CategoryTextAnnotation("Test 2", "Category", 1.0); 
     a2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(a1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         a2 = (CategoryTextAnnotation) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(a1, a2); 
 }
    

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
