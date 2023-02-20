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
 * --------------------------
 * SimpleTimePeriodTests.java
 * --------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 13-Mar-2003 : Version 1 (DG);
 * 21-Oct-2003 : Added hashCode() test (DG);
 * 02-Jun-2008 : Added a test for immutability (DG);
 *
 */

package org.jfree.data.time.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.time.SimpleTimePeriod;

/**
 * Tests for the {@link SimpleTimePeriod} class.
 */
public class SimpleTimePeriodTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(SimpleTimePeriodTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public SimpleTimePeriodTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        // no setup
    }

    /**
     * Check that an instance is equal to itself.
     *
     * SourceForge Bug ID: 558850.
     */
public void testSerialization1453() { 
     SimpleTimePeriod s1 = new SimpleTimePeriod(new Date(0L), new Date(1L)); 
     SimpleTimePeriod s2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(s1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         s2 = (SimpleTimePeriod) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(s1, s2); 
 }
public void testEquals1454() { 
     SimpleTimePeriod s1 = new SimpleTimePeriod(new Date(0L), new Date(1L)); 
     SimpleTimePeriod s2 = new SimpleTimePeriod(new Date(0L), new Date(1L)); 
     assertTrue(s1.equals(s2)); 
     assertTrue(s2.equals(s1)); 
     s1 = new SimpleTimePeriod(new Date(1L), new Date(2L)); 
     assertFalse(s1.equals(s2)); 
     s2 = new SimpleTimePeriod(new Date(1L), new Date(2L)); 
     assertTrue(s1.equals(s2)); 
     s1 = new SimpleTimePeriod(new Date(11L), new Date(22L)); 
     assertFalse(s1.equals(s2)); 
     s2 = new SimpleTimePeriod(new Date(11L), new Date(22L)); 
     assertTrue(s1.equals(s2)); 
     s1 = new SimpleTimePeriod(new Date(11L), new Date(22L)); 
     assertFalse(s1.equals(s2)); 
     s2 = new SimpleTimePeriod(new Date(11L), new Date(22L)); 
     assertTrue(s1.equals(s2)); 
 }
public void testDateConstructor11455() { 
     Date d1 = new Date(); 
     Date d2 = new Date(d1.getTime()); 
     SimpleTimePeriod s1 = new SimpleTimePeriod(d1, d2); 
     assertEquals(d1, s1.getStart()); 
     assertEquals(d2, s1.getEnd()); 
     boolean pass = false; 
     try { 
         s1 = new SimpleTimePeriod(null, d2); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         s1 = new SimpleTimePeriod(d1, d2); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         s1 = new SimpleTimePeriod(d1, d2); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         s1 = new SimpleTimePeriod(d1, d2); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testDateConstructor11456() { 
     SimpleTimePeriod s = new SimpleTimePeriod(new Date(101L), new Date(102L)); 
     assertEquals(new Date(101L), s.getStart()); 
     assertEquals(102L, s.getEndMillis()); 
 }
public void testHashcode1464() { 
     SimpleTimePeriod s1 = new SimpleTimePeriod(new Date(0L), new Date(1L)); 
     SimpleTimePeriod s2 = new SimpleTimePeriod(new Date(0L), new Date(1L)); 
     assertTrue(s1.equals(s2)); 
     int h1 = s1.hashCode(); 
     int h2 = s2.hashCode(); 
     assertEquals(h1, h2); 
 }
    

    /**
     * Test the equals() method.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * This class is immutable, so it should not implement Cloneable.
     */
    

    /**
     * Some simple checks for immutability.
     */
    

    /**
     * Some checks for the compareTo() method.
     */
    

}
