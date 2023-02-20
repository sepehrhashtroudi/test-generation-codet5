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
 * ------------------------------
 * CustomXYURLGeneratorTests.java
 * ------------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 21-Mar-2003 : Version 1 (DG);
 * 11-Apr-2008 : Added testCloning() and testEquals() (DG);
 * 21-Apr-2008 : Enhanced testCloning() (DG);
 * 23-Apr-2008 : Added testPublicCloneable (DG);
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

import org.jfree.chart.urls.CustomXYURLGenerator;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link CustomXYURLGenerator} class.
 */
public class CustomXYURLGeneratorTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CustomXYURLGeneratorTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CustomXYURLGeneratorTests(String name) {
        super(name);
    }

    /**
     * Some checks for the equals() method.
     */
public void testPublicCloneable1238() { 
     CustomXYURLGenerator g1 = new CustomXYURLGenerator(); 
     assertTrue(g1 instanceof PublicCloneable); 
 }
public void testCloning1240() { 
     CustomXYURLGenerator g1 = new CustomXYURLGenerator(); 
     CustomXYURLGenerator g2 = null; 
     try { 
         g2 = (CustomXYURLGenerator) g1.clone(); 
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
public void testSerialization1241() { 
     List u1 = new java.util.ArrayList(); 
     u1.add("URL A1"); 
     u1.add("URL A2"); 
     u1.add("URL A3"); 
     List u2 = new java.util.ArrayList(); 
     u2.add("URL B1"); 
     u2.add("URL B2"); 
     u2.add("URL B3"); 
     CustomXYURLGenerator g1 = new CustomXYURLGenerator(); 
     g1.addURLSeries(u1); 
     g1.addURLSeries(u2); 
     CustomXYURLGenerator g2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(g1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         g2 = (CustomXYURLGenerator) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(g1, g2); 
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
