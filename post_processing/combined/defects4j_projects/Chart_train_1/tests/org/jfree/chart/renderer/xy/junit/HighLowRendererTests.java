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
 * -------------------------
 * HighLowRendererTests.java
 * -------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 22-Oct-2003 : Added hashCode test (DG);
 * 01-Nov-2005 : Added tests for new fields (DG);
 * 17-Aug-2006 : Added testFindRangeBounds() method (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 * 29-Apr-2008 : Extended testEquals() for new field (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

import java.awt.Color;
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

import org.jfree.chart.renderer.xy.HighLowRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.Range;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.OHLCDataset;

/**
 * Tests for the {@link HighLowRenderer} class.
 */
public class HighLowRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(HighLowRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public HighLowRendererTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */

public void testCloning171() { 
     HighLowRenderer r1 = new HighLowRenderer(); 
     r1.setCloseTickPaint(Color.green); 
     HighLowRenderer r2 = null; 
     try { 
         r2 = (HighLowRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
 } 


public void testEquals172() { 
     HighLowRenderer r1 = new HighLowRenderer(); 
     HighLowRenderer r2 = new HighLowRenderer(); 
     assertEquals(r1, r2); 
     r1.setDrawOpenTicks(false); 
     assertFalse(r1.equals(r2)); 
     r2.setDrawOpenTicks(false); 
     assertTrue(r1.equals(r2)); 
     r1.setDrawCloseTicks(false); 
     assertFalse(r1.equals(r2)); 
     r2.setDrawCloseTicks(false); 
     assertTrue(r1.equals(r2)); 
     r1.setOpenTickPaint(Color.red); 
     assertFalse(r1.equals(r2)); 
     r2.setOpenTickPaint(Color.red); 
     assertTrue(r1.equals(r2)); 
     r1.setCloseTickPaint(Color.blue); 
     assertFalse(r1.equals(r2)); 
     r2.setCloseTickPaint(Color.blue); 
     assertTrue(r1.equals(r2)); 
     r1.setTickLength(99.9); 
     assertFalse(r1.equals(r2)); 
     r2.setTickLength(99.9); 
     assertTrue(r1.equals(r2)); 
 } 

    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

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
     * Some checks for the findRangeBounds() method.
     */
    

}
