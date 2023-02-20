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
 * VectorSeriesCollectionTests.java
 * --------------------------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 30-Jan-2007 : Version 1 (DG);
 * 24-May-2007 : Added testRemoveSeries() (DG);
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
import org.jfree.data.xy.VectorSeries;
import org.jfree.data.xy.VectorSeriesCollection;

/**
 * Tests for the {@link VectorSeriesCollection} class.
 */
public class VectorSeriesCollectionTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(VectorSeriesCollectionTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public VectorSeriesCollectionTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testRemoveSeries59() { 
     VectorSeries s1 = new VectorSeries("Series"); 
     s1.add(1.0, 1.1, 1.2, 1.3); 
     VectorSeriesCollection dataset = new VectorSeriesCollection(); 
     dataset.addSeries(s1); 
     assertEquals(1, dataset.getSeriesCount()); 
     assertEquals("Series", dataset.getSeriesKey(0)); 
     boolean pass = false; 
     try { 
         dataset.removeSeries(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         dataset.removeSeries(new VectorSeries("Empty Series")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         dataset.removeSeries(new VectorSeries("Empty Series")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveSeries60() { 
     VectorSeries s1 = new VectorSeries("Series"); 
     s1.add(1.0, 1.1, 1.2, 1.3); 
     VectorSeriesCollection dataset = new VectorSeriesCollection(); 
     dataset.addSeries(s1); 
     assertEquals(0, dataset.getSeriesCount()); 
     boolean pass = false; 
     try { 
         dataset.removeSeries(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         dataset.removeSeries(new VectorSeries("Empty Series")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         dataset.removeSeries(new VectorSeries("Empty Series")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         dataset.removeSeries(new VectorSeries("Empty Series")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveSeries61() { 
     VectorSeries s1 = new VectorSeries("Series"); 
     s1.add(1.0, 1.1, 1.2, 1.3); 
     VectorSeriesCollection dataset = new VectorSeriesCollection(); 
     dataset.addSeries(s1); 
     assertEquals(1, dataset.getSeriesCount()); 
     assertEquals("Series", dataset.getSeriesKey(0)); 
     boolean pass = false; 
     try { 
         dataset.removeSeries(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         dataset.removeSeries(new VectorSeries("Empty Series")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         dataset.removeSeries(new VectorSeries("Empty Series")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         dataset.removeSeries(new VectorSeries("Empty Series")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testCloning62() { 
     VectorSeries s1 = new VectorSeries("Series"); 
     s1.add(1.0, 1.1, 1.2, 1.3); 
     VectorSeriesCollection c1 = new VectorSeriesCollection(); 
     c1.addSeries(s1); 
     VectorSeriesCollection c2 = null; 
     try { 
         c2 = (VectorSeriesCollection) c1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(c1 != c2); 
     assertTrue(c1.getClass() == c2.getClass()); 
     assertTrue(c1.equals(c2)); 
     s1.setDescription("XYZ"); 
     assertFalse(c1.equals(c2)); 
 }
public void testSerialization63() { 
     VectorSeries s1 = new VectorSeries("Series"); 
     s1.add(1.0, 1.1, 1.2, 1.3); 
     VectorSeriesCollection c1 = new VectorSeriesCollection(); 
     c1.addSeries(s1); 
     VectorSeriesCollection c2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(c1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         c2 = (VectorSeriesCollection) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(c1, c2); 
 }
public void testGetSeries64() { 
     VectorSeries s1 = new VectorSeries("Series"); 
     VectorSeriesCollection dataset = new VectorSeriesCollection(); 
     assertNull(dataset.getSeries(0)); 
     dataset.addSeries(s1); 
     assertEquals("Series", dataset.getSeries(0).getKey()); 
     boolean pass = false; 
     try { 
         dataset.getSeries(-1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         dataset.getSeries(1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         dataset.getSeries(2); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testGetSeriesKey65() { 
     VectorSeries s1 = new VectorSeries("Series"); 
     s1.add(1.0, 1.1, 1.2, 1.3); 
     VectorSeriesCollection dataset = new VectorSeriesCollection(); 
     dataset.addSeries(s1); 
     assertEquals("Series", dataset.getSeriesKey(0)); 
     assertEquals("Series 1", dataset.getSeriesKey(1)); 
     assertEquals("Series 2", dataset.getSeriesKey(2)); 
     assertEquals("Series 3", dataset.getSeriesKey(3)); 
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
    

    /**
     * Some checks for the removeSeries() method.
     */
    

}
