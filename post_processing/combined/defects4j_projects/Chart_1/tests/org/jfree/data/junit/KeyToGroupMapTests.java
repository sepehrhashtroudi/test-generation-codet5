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
 * -----------------------
 * KeyToGroupMapTests.java
 * -----------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 29-Apr-2004 : Version 1 (DG);
 *
 */

package org.jfree.data.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.KeyToGroupMap;

/**
 * Tests for the {@link KeyToGroupMap} class.
 */
public class KeyToGroupMapTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(KeyToGroupMapTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public KeyToGroupMapTests(String name) {
        super(name);
    }

    /**
     * Tests the mapKeyToGroup() method.
     */
public void testGetGroup439() { 
     KeyToGroupMap m1 = new KeyToGroupMap("Default Group"); 
     assertEquals("Default Group", m1.getGroup("K1")); 
     m1.mapKeyToGroup("K1", "G1"); 
     assertEquals("G1", m1.getGroup("K1")); 
     m1.mapKeyToGroup("K1", "G2"); 
     assertEquals("G2", m1.getGroup("K1")); 
     m1.mapKeyToGroup("K1", null); 
     assertEquals("Default Group", m1.getGroup("K1")); 
     boolean pass = false; 
     try { 
         Comparable g = m1.getGroup(null); 
         System.out.println(g); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testSerialization440() { 
     KeyToGroupMap m1 = new KeyToGroupMap("Default Group"); 
     m1.mapKeyToGroup("K1", "G1"); 
     KeyToGroupMap m2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(m1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         m2 = (KeyToGroupMap) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(m1, m2); 
     m1.mapKeyToGroup("K1", "G2"); 
     assertFalse(m1.equals(m2)); 
     m2.mapKeyToGroup("K1", "G2"); 
     assertTrue(m1.equals(m2)); 
 }
    

    /**
     * Tests that the getGroupCount() method returns the correct values under
     * various circumstances.
     */
    

    /**
     * Tests that the getKeyCount() method returns the correct values under
     * various circumstances.
     */
    

    /**
     * Tests the getGroupIndex() method.
     */
    

    /**
     * Tests the getGroup() method.
     */
    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
