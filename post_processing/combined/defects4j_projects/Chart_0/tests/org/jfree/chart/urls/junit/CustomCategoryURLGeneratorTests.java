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
 * ------------------------------------
 * CustomCategoryURLGeneratorTests.java
 * ------------------------------------
 * (C) Copyright 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 23-Apr-2008 : Version 1, based on CustomXYURLGeneratorTests.java (DG);
 *
 */

package org.jfree.chart.urls.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.urls.CustomCategoryURLGenerator;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link CustomCategoryURLGenerator} class.
 */
public class CustomCategoryURLGeneratorTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CustomCategoryURLGeneratorTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CustomCategoryURLGeneratorTests(String name) {
        super(name);
    }

    /**
     * Some checks for the equals() method.
     */
public void testPublicCloneable720() { 
     CustomCategoryURLGenerator g1 = new CustomCategoryURLGenerator(); 
     assertTrue(g1 instanceof PublicCloneable); 
 }
public void testGenerateURL723() { 
     CustomCategoryURLGenerator g = new CustomCategoryURLGenerator(); 
     assertEquals(" href=\"abc\"", g.getURL(0, 0)); 
     assertEquals(" href=\"images/abc.png\"", g.getURL(0, 1)); 
     assertEquals(" href=\"http://www.jfree.org/images/abc.png\"", g.getURL(1, 0)); 
     assertEquals(" href=\"http://www.jfree.org/images/abc.png\"", g.getURL(1, 1)); 
     assertEquals(" href=\"http://www.jfree.org/images/abc.png\"", g.getURL(1, 2)); 
     assertEquals(" href=\"http://www.jfree.org/images/abc.png\"", g.getURL(2, 2)); 
     assertEquals(" href=\"http://www.jfree.org/images/abc.png\"", g.getURL(3, 3)); 
     boolean pass = false; 
     try { 
         g.generateURL(null, 0, 1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testEquals725() { 
     CustomCategoryURLGenerator g1 = new CustomCategoryURLGenerator(); 
     CustomCategoryURLGenerator g2 = new CustomCategoryURLGenerator(); 
     assertTrue(g1.equals(g2)); 
     assertTrue(g2.equals(g1)); 
     g1.addURLSeries(new java.util.ArrayList()); 
     assertFalse(g1.equals(g2)); 
     g2.addURLSeries(new java.util.ArrayList()); 
     assertTrue(g1.equals(g2)); 
 }
public void testSerialization727() { 
     CustomCategoryURLGenerator g1 = new CustomCategoryURLGenerator(); 
     CustomCategoryURLGenerator g2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(g1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         g2 = (CustomCategoryURLGenerator) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(g1, g2); 
 }
public void testCloning729() { 
     CustomCategoryURLGenerator g1 = new CustomCategoryURLGenerator(); 
     CustomCategoryURLGenerator g2 = null; 
     try { 
         g2 = (CustomCategoryURLGenerator) g1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(g1 != g2); 
     assertTrue(g1.getClass() == g2.getClass()); 
     assertTrue(g1.equals(g2)); 
     g1.addURLSeries(new java.util.ArrayList()); 
     assertFalse(g1.equals(g2)); 
     g2.addURLSeries(new java.util.ArrayList()); 
     assertTrue(g1.equals(g2)); 
 }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Checks that the class implements PublicCloneable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the addURLSeries() method.
     */
    

}
