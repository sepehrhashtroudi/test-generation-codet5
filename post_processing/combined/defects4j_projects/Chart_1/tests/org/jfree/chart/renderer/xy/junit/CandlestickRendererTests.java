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
 * -----------------------------
 * CandlestickRendererTests.java
 * -----------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 22-Oct-2003 : Added hashCode test (DG);
 * 17-Aug-2006 : Strengthened testEquals() and added testFindRangeBounds()
 *               method (DG);
 * 05-Mar-2007 : Added new field to testEquals() (DG);
 * 08-Oct-2007 : Added tests for new volumePaint field (DG);
 * 22-Apr-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

import java.awt.Color;
import java.awt.GradientPaint;
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

import org.jfree.chart.renderer.xy.CandlestickRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.Range;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;
import org.jfree.data.xy.OHLCDataset;

/**
 * Tests for the {@link CandlestickRenderer} class.
 */
public class CandlestickRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CandlestickRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CandlestickRendererTests(String name) {
        super(name);
    }

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the constructor.
     */
public void testEquals1002() { 
     CandlestickRenderer r1 = new CandlestickRenderer(); 
     CandlestickRenderer r2 = new CandlestickRenderer(); 
     assertEquals(r1, r2); 
     r1.setUpPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(r1.equals(r2)); 
     r2.setUpPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(r1.equals(r2)); 
     r1.setDownPaint(new GradientPaint(5.0f, 6.0f, Color.green, 7.0f, 8.0f, Color.yellow)); 
     assertFalse(r1.equals(r2)); 
     r2.setDownPaint(new GradientPaint(5.0f, 6.0f, Color.green, 7.0f, 8.0f, Color.yellow)); 
     assertTrue(r1.equals(r2)); 
     r1.setDrawVolume(false); 
     assertFalse(r1.equals(r2)); 
     r2.setDrawVolume(false); 
     assertTrue(r1.equals(r2)); 
     r1.setVolumePaint(new GradientPaint(9.0f, 0.0f, Color.red, 1.0f, 2.0f, Color.yellow)); 
     assertFalse(r1.equals(r2)); 
     r2.setVolumePaint(new GradientPaint(9.0f, 0.0f, Color.red, 1.0f, 2.0f, Color.yellow)); 
     assertTrue(r1.equals(r2)); 
     r1.setMaxCandleWidthInMilliseconds(123); 
     assertFalse(r1.equals(r2));
}

public void testCloning1005() { 
     CandlestickRenderer r1 = new CandlestickRenderer(); 
     CandlestickRenderer r2 = null; 
     try { 
         r2 = (CandlestickRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
 }
    

    /**
     * Check that the equals() method distinguishes all fields.
     */
    

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
