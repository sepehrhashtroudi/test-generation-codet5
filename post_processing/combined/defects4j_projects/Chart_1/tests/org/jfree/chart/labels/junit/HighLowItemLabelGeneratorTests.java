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
 * -----------------------------------
 * HighLowItemLabelGeneratorTests.java
 * -----------------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 18-Mar-2003 : Version 1 (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.chart.labels.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.labels.HighLowItemLabelGenerator;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link HighLowItemLabelGenerator} class.
 */
public class HighLowItemLabelGeneratorTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(HighLowItemLabelGeneratorTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public HighLowItemLabelGeneratorTests(String name) {
        super(name);
    }

    /**
     * Tests that the equals method can distinguish all fields.
     */
public void testPublicCloneable95() { 
     HighLowItemLabelGenerator g1 = new HighLowItemLabelGenerator(); 
     assertTrue(g1 instanceof PublicCloneable); 
 }
public void testEquals99() { 
     HighLowItemLabelGenerator g1 = new HighLowItemLabelGenerator(); 
     HighLowItemLabelGenerator g2 = new HighLowItemLabelGenerator(); 
     assertTrue(g1.equals(g2)); 
     assertTrue(g2.equals(g1)); 
     g1 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertFalse(g1.equals(g2)); 
     g2 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertTrue(g1.equals(g2)); 
     g1 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertFalse(g1.equals(g2)); 
     g2 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertTrue(g1.equals(g2)); 
     g1 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertFalse(g1.equals(g2)); 
     g2 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertTrue(g1.equals(g2)); 
 }
public void testCloning100() { 
     HighLowItemLabelGenerator g1 = new HighLowItemLabelGenerator(); 
     HighLowItemLabelGenerator g2 = null; 
     try { 
         g2 = (HighLowItemLabelGenerator) g1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(g1 != g2); 
     assertTrue(g1.getClass() == g2.getClass()); 
     assertTrue(g1.equals(g2)); 
 }
public void testEquals101() { 
     HighLowItemLabelGenerator g1 = new HighLowItemLabelGenerator(); 
     HighLowItemLabelGenerator g2 = new HighLowItemLabelGenerator(); 
     assertTrue(g1.equals(g2)); 
     assertTrue(g2.equals(g1)); 
     g1 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     g2 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertFalse(g1.equals(g2)); 
     g2 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertTrue(g1.equals(g2)); 
     g1 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     g2 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertFalse(g1.equals(g2)); 
     g2 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertTrue(g1.equals(g2)); 
 }
public void testEquals102() { 
     HighLowItemLabelGenerator g1 = new HighLowItemLabelGenerator(); 
     HighLowItemLabelGenerator g2 = new HighLowItemLabelGenerator(); 
     assertTrue(g1.equals(g2)); 
     assertTrue(g2.equals(g1)); 
     g1 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertFalse(g1.equals(g2)); 
     g2 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertTrue(g1.equals(g2)); 
     g1 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertFalse(g1.equals(g2)); 
     g2 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertTrue(g1.equals(g2)); 
     g1 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertFalse(g1.equals(g2)); 
     g2 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertTrue(g1.equals(g2)); 
     g1 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertFalse(g1.equals(g2)); 
     g2 = new HighLowItemLabelGenerator(new SimpleDateFormat("d"), new DecimalFormat("0.000")); 
     assertTrue(g1.equals(g2)); 
 }
public void testHashCode103() { 
     HighLowItemLabelGenerator g1 = new HighLowItemLabelGenerator(); 
     HighLowItemLabelGenerator g2 = new HighLowItemLabelGenerator(); 
     assertTrue(g1.equals(g2)); 
     assertTrue(g1.hashCode() == g2.hashCode()); 
 }
public void testHashCode104() { 
     HighLowItemLabelGenerator g1 = new HighLowItemLabelGenerator(); 
     HighLowItemLabelGenerator g2 = new HighLowItemLabelGenerator(); 
     assertTrue(g1.equals(g2)); 
     int h1 = g1.hashCode(); 
     int h2 = g2.hashCode(); 
     assertEquals(h1, h2); 
 }
    

    /**
     * Simple check that hashCode is implemented.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Check to ensure that this class implements PublicCloneable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
