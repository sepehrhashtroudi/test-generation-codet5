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
 * BarRenderer3DTests.java
 * -----------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 22-Oct-2003 : Added hashCode test (DG);
 * 07-Dec-2006 : Improved testEquals() (DG);
 * 23-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.chart.renderer.category.junit;

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

import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link BarRenderer3D} class.
 */
public class BarRenderer3DTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(BarRenderer3DTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public BarRenderer3DTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */
public void testEquals18() { 
     BarRenderer3D r1 = new BarRenderer3D(); 
     BarRenderer3D r2 = new BarRenderer3D(); 
     assertTrue(r1.equals(r2)); 
     assertTrue(r2.equals(r1)); 
     r1 = new BarRenderer3D(1.0, 2.0); 
     assertFalse(r1.equals(r2)); 
     r2 = new BarRenderer3D(1.0, 2.0); 
     assertTrue(r1.equals(r2)); 
     r1 = new BarRenderer3D(1.1, 2.0); 
     assertFalse(r1.equals(r2)); 
     r2 = new BarRenderer3D(1.1, 2.0); 
     assertTrue(r1.equals(r2)); 
     r1 = new BarRenderer3D(1.1, 2.2); 
     assertFalse(r1.equals(r2)); 
     r2 = new BarRenderer3D(1.1, 2.2); 
     assertTrue(r1.equals(r2)); 
 }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Check that this class implements PublicCloneable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
