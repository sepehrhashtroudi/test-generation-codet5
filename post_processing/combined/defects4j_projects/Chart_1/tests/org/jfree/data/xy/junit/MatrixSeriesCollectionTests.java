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
 * MatrixSeriesCollectionTests.java
 * --------------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 27-Nov-2006 : Version 1 (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.data.xy.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.MatrixSeries;
import org.jfree.data.xy.MatrixSeriesCollection;

/**
 * Tests for the {@link MatrixSeriesCollection} class.
 */
public class MatrixSeriesCollectionTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(MatrixSeriesCollectionTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public MatrixSeriesCollectionTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testSerialization996() { 
     MatrixSeriesCollection c1 = new MatrixSeriesCollection(); 
     MatrixSeries s1 = new MatrixSeries("Series", 2, 3); 
     c1.addSeries(s1); 
     MatrixSeriesCollection c2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(c1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         c2 = (MatrixSeriesCollection) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(c1, c2); 
 }
public void testSerialization997() { 
     MatrixSeries s1 = new MatrixSeries("Series", 2, 3); 
     MatrixSeriesCollection c1 = new MatrixSeriesCollection(); 
     c1.addSeries(s1); 
     MatrixSeriesCollection c2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(c1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         c2 = (MatrixSeriesCollection) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(c1, c2); 
 }
public void testEquals1026() { 
     MatrixSeries s1 = new MatrixSeries("Test", 3, 2); 
     MatrixSeries s2 = new MatrixSeries("Test", 3, 2); 
     assertTrue(s1.equals(s2)); 
     assertTrue(s2.equals(s1)); 
     s1.update(0, 0, 1.0); 
     assertFalse(s1.equals(s2)); 
     s2.update(0, 0, 1.0); 
     assertTrue(s1.equals(s2)); 
     s1.update(1, 1, 2.0); 
     assertFalse(s1.equals(s2)); 
     s2.update(1, 1, 2.0); 
     assertTrue(s1.equals(s2)); 
     s1.update(2, 2, 3.0); 
     assertFalse(s1.equals(s2)); 
     s2.update(2, 2, 3.0); 
     assertTrue(s1.equals(s2)); 
 }
public void testEquals1027() { 
     MatrixSeries s1 = new MatrixSeries("Test", 3, 2); 
     MatrixSeries s2 = new MatrixSeries("Test", 3, 2); 
     assertTrue(s1.equals(s2)); 
     assertTrue(s2.equals(s1)); 
     s1.update(0, 0, 0.0); 
     assertFalse(s1.equals(s2)); 
     s2.update(0, 0, 0.0); 
     assertTrue(s1.equals(s2)); 
     s1.update(1, 1, 1.0); 
     assertFalse(s1.equals(s2)); 
     s2.update(1, 1, 1.0); 
     assertTrue(s1.equals(s2)); 
     s1.update(2, 2, 2.0); 
     assertFalse(s1.equals(s2)); 
     s2.update(2, 2, 2.0); 
     assertTrue(s1.equals(s2)); 
     s1.zeroAll(); 
     assertFalse(s1.equals(s2)); 
     s2.zeroAll(); 
     assertTrue(s1.equals(s2)); 
 }
public void testSerialization1030() { 
     MatrixSeries m1 = new MatrixSeries("Test", 3, 2); 
     MatrixSeries m2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(m1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         m2 = (MatrixSeries) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(m1, m2); 
 }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
