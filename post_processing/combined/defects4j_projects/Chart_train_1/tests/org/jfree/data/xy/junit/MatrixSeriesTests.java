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
 * ----------------------
 * MatrixSeriesTests.java
 * ----------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 21-May-2004 : Version 1 (DG);
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

import org.jfree.data.xy.MatrixSeries;

/**
 * Tests for the {@link MatrixSeries} class.
 */
public class MatrixSeriesTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(MatrixSeriesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public MatrixSeriesTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testGetItem533() { 
     MatrixSeries m = new MatrixSeries("Test", 3, 2); 
     m.update(0, 0, 0.0); 
     m.update(0, 1, 1.0); 
     m.update(1, 0, 2.0); 
     m.update(1, 1, 3.0); 
     m.update(2, 0, 4.0); 
     m.update(2, 1, 5.0); 
     assertEquals(0.0, m.getItem(0).doubleValue(), 0.001); 
     assertEquals(1.0, m.getItem(1).doubleValue(), 0.001); 
     assertEquals(2.0, m.getItem(2).doubleValue(), 0.001); 
     assertEquals(3.0, m.getItem(3).doubleValue(), 0.001); 
     assertEquals(4.0, m.getItem(4).doubleValue(), 0.001); 
     assertEquals(5.0, m.getItem(5).doubleValue(), 0.001); 
 } 


public void testGetItemColumn534() { 
     MatrixSeries m = new MatrixSeries("Test", 3, 2); 
     assertEquals(0, m.getItemColumn(0)); 
     assertEquals(1, m.getItemColumn(1)); 
     assertEquals(0, m.getItemColumn(2)); 
     assertEquals(1, m.getItemColumn(3)); 
     assertEquals(0, m.getItemColumn(4)); 
     assertEquals(1, m.getItemColumn(5)); 
 } 

    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Tests the getItemColumn() method.
     */
    

    /**
     * Tests the getItemRow() method.
     */
    

    /**
     * Tests the getItem() method.
     */
    
}
