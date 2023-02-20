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
 * ------------------------------------------
 * StandardCategoryToolTipGeneratorTests.java
 * ------------------------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 11-May-2004 : Version 1 (DG);
 * ------------- JFREECHART 1.0.x ---------------------------------------------
 * 03-May-2006 : Added testEquals1481087() (DG);
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
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link StandardCategoryToolTipGenerator} class.
 */
public class StandardCategoryToolTipGeneratorTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StandardCategoryToolTipGeneratorTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StandardCategoryToolTipGeneratorTests(String name) {
        super(name);
    }

    /**
     * Tests the equals() method.
     */
public void testSerialization621() { 
     StandardCategoryToolTipGenerator g1 = new StandardCategoryToolTipGenerator("{2}", DateFormat.getInstance()); 
     StandardCategoryToolTipGenerator g2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(g1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         g2 = (StandardCategoryToolTipGenerator) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(g1, g2); 
 }
public void testEquals622() { 
     StandardCategoryToolTipGenerator g1 = new StandardCategoryToolTipGenerator(); 
     StandardCategoryToolTipGenerator g2 = new StandardCategoryToolTipGenerator(); 
     assertTrue(g1.equals(g2)); 
     assertTrue(g2.equals(g1)); 
     g1 = new StandardCategoryToolTipGenerator("{0}", new DecimalFormat("0.000")); 
     assertFalse(g1.equals(g2)); 
     g2 = new StandardCategoryToolTipGenerator("{0}", new DecimalFormat("0.000")); 
     assertTrue(g1.equals(g2)); 
     g1 = new StandardCategoryToolTipGenerator("{1}", new DecimalFormat("d-MMM")); 
     assertFalse(g1.equals(g2)); 
     g2 = new StandardCategoryToolTipGenerator("{1}", new DecimalFormat("d-MMM")); 
     assertTrue(g1.equals(g2)); 
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
    

    /**
     * A test for bug 1481087.
     */
    

}
