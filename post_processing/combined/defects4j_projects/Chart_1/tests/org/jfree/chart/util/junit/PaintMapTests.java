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
 * ------------------
 * PaintMapTests.java
 * ------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes:
 * --------
 * 27-Sep-2006 : Version 1 (DG);
 * 17-Jan-2007 : Added testKeysOfDifferentClasses() (DG);
 *
 */

package org.jfree.chart.util.junit;

import java.awt.Color;
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

import org.jfree.chart.util.PaintMap;

/**
 * Some tests for the {@link PaintMap} class.
 */
public class PaintMapTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(PaintMapTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public PaintMapTests(String name) {
        super(name);
    }

    /**
     * Some checks for the getPaint() method.
     */
public void testEquals17() { 
     PaintMap m1 = new PaintMap(); 
     PaintMap m2 = new PaintMap(); 
     assertTrue(m1.equals(m1)); 
     assertTrue(m1.equals(m2)); 
     assertFalse(m1.equals(null)); 
     assertFalse(m1.equals("ABC")); 
     m1.put("K1", Color.red); 
     assertFalse(m1.equals(m2)); 
     m2.put("K1", Color.red); 
     assertTrue(m1.equals(m2)); 
     m1.put("K2", new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(m1.equals(m2)); 
     m2.put("K2", new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(m1.equals(m2)); 
     m1.put("K2", null); 
     assertFalse(m1.equals(m2)); 
     m2.put("K2", null); 
     assertTrue(m1.equals(m2)); 
 }
public void testSerialization18() { 
     PaintMap m1 = new PaintMap(); 
     m1.put("K1", Color.red); 
     m1.put("K2", Color.blue); 
     PaintMap m2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(m1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         m2 = (PaintMap) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(m1, m2); 
 }
public void testCloning19() { 
     PaintMap m1 = new PaintMap(); 
     m1.put("K1", Color.red); 
     PaintMap m2 = null; 
     try { 
         m2 = (PaintMap) m1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(m1 != m2); 
     assertTrue(m1.getClass() == m2.getClass()); 
     assertTrue(m1.equals(m2)); 
     assertTrue(m1.equals(m2)); 
     m1.put("K2", Color.blue); 
     assertFalse(m1.equals(m2)); 
     m2.put("K2", Color.blue); 
     assertTrue(m1.equals(m2)); 
 }
public void testCloning20() { 
     PaintMap m1 = new PaintMap(); 
     m1.put("K1", Color.red); 
     PaintMap m2 = null; 
     try { 
         m2 = (PaintMap) m1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(m1 != m2); 
     assertTrue(m1.getClass() == m2.getClass()); 
     assertTrue(m1.equals(m2)); 
     m1.put("K2", Color.blue); 
     assertFalse(m1.equals(m2)); 
     m2.put("K2", Color.blue); 
     assertTrue(m1.equals(m2)); 
 }
public void testSerialization221() { 
     PaintMap m1 = new PaintMap(); 
     m1.put("K1", Color.red); 
     m1.put("K2", Color.blue); 
     PaintMap m2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(m1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         m2 = (PaintMap) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(m1, m2); 
 }
    

    /**
     * Some checks for the put() method.
     */
    

    /**
     * Some checks for the equals() method.
     */
    

    /**
     * Some checks for cloning.
     */
    

    /**
     * A check for serialization.
     */
    

    /**
     * A check for serialization.
     */
    

    /**
     * This test covers a bug reported in the forum:
     *
     * http://www.jfree.org/phpBB2/viewtopic.php?t=19980
     */
    

}

