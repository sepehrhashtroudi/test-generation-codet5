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
public void testRemoveSeries44() { 
     VectorSeries s1 = new VectorSeries("S1"); 
     VectorSeries s2 = new VectorSeries("S2"); 
     VectorSeriesCollection vsc = new VectorSeriesCollection(); 
     vsc.addSeries(s1); 
     vsc.addSeries(s2); 
     assertEquals(2, vsc.getSeriesCount()); 
     boolean b = vsc.removeSeries(s1); 
     assertTrue(b); 
     assertEquals(1, vsc.getSeriesCount()); 
     assertEquals("S2", vsc.getSeriesKey(0)); 
     b = vsc.removeSeries(new VectorSeries("NotInDataset")); 
     assertFalse(b); 
     assertEquals(1, vsc.getSeriesCount()); 
     b = vsc.removeSeries(s2); 
     assertTrue(b); 
     assertEquals(0, vsc.getSeriesCount()); 
 }
public void testCloning45() { 
     VectorSeries s1 = new VectorSeries("S1"); 
     VectorSeries s2 = null; 
     try { 
         s2 = (VectorSeries) s1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(s1 != s2); 
     assertTrue(s1.getClass() == s2.getClass()); 
     assertTrue(s1.equals(s2)); 
     s1.add(1.0, 2.0, 3.0, 4.0); 
     assertFalse(s1.equals(s2)); 
     s2.add(1.0, 2.0, 3.0, 4.0); 
     assertTrue(s1.equals(s2)); 
 }
public void testCloning46() { 
     VectorSeries s1 = new VectorSeries("S1"); 
     VectorSeries s2 = null; 
     try { 
         s2 = (VectorSeries) s1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(s1 != s2); 
     assertTrue(s1.getClass() == s2.getClass()); 
     assertTrue(s1.equals(s2)); 
     s1.add(1.0, 1.1, 1.2, 1.3); 
     assertFalse(s1.equals(s2)); 
     s2.add(1.0, 1.1, 1.2, 1.3); 
     assertTrue(s1.equals(s2)); 
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
