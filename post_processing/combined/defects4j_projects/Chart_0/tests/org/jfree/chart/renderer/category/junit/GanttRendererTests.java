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
 * GanttRendererTests.java
 * -----------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 22-Oct-2003 : Version 1 (DG);
 * 20-Mar-2007 : Extended testEquals() (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
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

import org.jfree.chart.renderer.category.GanttRenderer;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link GanttRenderer} class.
 */
public class GanttRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(GanttRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public GanttRendererTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */
public void testEquals395() { 
     GanttRenderer r1 = new GanttRenderer(); 
     GanttRenderer r2 = new GanttRenderer(); 
     assertEquals(r1, r2); 
     r1.setCompletePaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(r1.equals(r2)); 
     r2.setCompletePaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertEquals(r1, r2); 
     r1.setIncompletePaint(new GradientPaint(4.0f, 3.0f, Color.red, 2.0f, 1.0f, Color.blue)); 
     assertFalse(r1.equals(r2)); 
     r2.setIncompletePaint(new GradientPaint(4.0f, 3.0f, Color.red, 2.0f, 1.0f, Color.blue)); 
     assertEquals(r1, r2); 
     r1.setStartPercent(0.01); 
     assertFalse(r1.equals(r2)); 
     r2.setStartPercent(0.01); 
     assertEquals(r1, r2); 
     r1.setIncompletePaint(new GradientPaint(4.0f, 3.0f, Color.red, 2.0f, 1.0f, Color.blue)); 
     assertFalse(r1.equals(r2)); 
     r2.setIncompletePaint(new GradientPaint(4.0f, 3.0f, Color.red, 2.0f, 1.0f, Color.blue)); 
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
