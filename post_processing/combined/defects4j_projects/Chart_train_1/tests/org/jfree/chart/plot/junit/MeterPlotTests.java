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
 * -------------------
 * MeterPlotTests.java
 * -------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 27-Mar-2003 : Version 1 (DG);
 * 12-May-2004 : Updated testEquals() (DG);
 * 29-Nov-2007 : Updated testEquals() and testSerialization1() for
 *               dialOutlinePaint (DG)
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.plot.DialShape;
import org.jfree.chart.plot.MeterInterval;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.data.Range;
import org.jfree.data.general.DefaultValueDataset;

/**
 * Tests for the {@link MeterPlot} class.
 */
public class MeterPlotTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(MeterPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public MeterPlotTests(String name) {
        super(name);
    }

    /**
     * Test the equals method to ensure that it can distinguish the required
     * fields.  Note that the dataset is NOT considered in the equals test.
     */

public void testSerialization2230() { 
     MeterPlot p1 = new MeterPlot(new DefaultValueDataset(1.23)); 
     MeterPlot p2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(p1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         p2 = (MeterPlot) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(p1, p2); 
 } 


public void testCloning637() { 
     MeterPlot p1 = new MeterPlot(); 
     MeterPlot p2 = null; 
     try { 
         p2 = (MeterPlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     assertTrue(p1.getDataset() == p2.getDataset()); 
     p1.getTickLabelFormat().setMinimumIntegerDigits(99); 
     assertFalse(p1.equals(p2)); 
     p2.getTickLabelFormat().setMinimumIntegerDigits(99); 
     assertTrue(p1.equals(p2)); 
     p1.addInterval(new MeterInterval("Test", new Range(1.234, 5.678))); 
     assertFalse(p1.equals(p2)); 
     p2.addInterval(new MeterInterval("Test", new Range(1.234, 5.678))); 
     assertTrue(p1.equals(p2)); 
 } 

    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
