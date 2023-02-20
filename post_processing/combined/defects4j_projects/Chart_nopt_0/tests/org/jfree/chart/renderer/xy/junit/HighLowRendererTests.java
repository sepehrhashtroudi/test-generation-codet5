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
public void testHighLowRenderer1140() { HighLowRenderer r1 = new HighLowRenderer(); HighLowRenderer r2 = new HighLowRenderer(); assertEquals(r1, r2); }
public void testHighLowRenderer1141() { HighLowRenderer r = new HighLowRenderer(); assertEquals(r, new HighLowRenderer()); }
public void testCloning1145() throws CloneNotSupportedException { HighLowRenderer r1 = new HighLowRenderer(); r1.setDrawOpenTicks(true); HighLowRenderer r2 = (HighLowRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testFireChangeEvent1146() { HighLowRenderer r = new HighLowRenderer(); r.setDrawOpenTicks(false); assertFalse(r.getDrawOpenTicks()); r.setDrawOpenTicks(true); assertTrue(r.getDrawOpenTicks()); }
public void testCloning1147() throws CloneNotSupportedException { HighLowRenderer r1 = new HighLowRenderer(); r1.setDrawCloseTicks(true); HighLowRenderer r2 = (HighLowRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testFireChangeEvent1148() { HighLowRenderer r = new HighLowRenderer(); r.setDrawCloseTicks(true); assertEquals(true, r.getDrawCloseTicks()); r.setDrawCloseTicks(false); assertEquals(false, r.getDrawCloseTicks()); }
public void testCloning1150() throws CloneNotSupportedException { HighLowRenderer r1 = new HighLowRenderer(); r1.setOpenTickPaint(Color.RED); HighLowRenderer r2 = (HighLowRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testFireChangeEvent1151() { HighLowRenderer r = new HighLowRenderer(); r.setOpenTickPaint(Color.RED); assertEquals(Color.RED, r.getOpenTickPaint()); r.setOpenTickPaint(Color.BLUE); assertEquals(Color.BLUE, r.getOpenTickPaint()); r.setCloseTickPaint(Color.RED); assertEquals(Color.RED, r.getCloseTickPaint()); }
public void testCloning1153() throws CloneNotSupportedException { HighLowRenderer r1 = new HighLowRenderer(); r1.setCloseTickPaint(Color.RED); HighLowRenderer r2 = (HighLowRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testCloning1155() throws CloneNotSupportedException { HighLowRenderer r1 = new HighLowRenderer(); r1.setTickLength(0.5); HighLowRenderer r2 = (HighLowRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testCloning1156() throws CloneNotSupportedException { HighLowRenderer r1 = new HighLowRenderer(); HighLowRenderer r2 = (HighLowRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
public void testEquals1162() { HighLowRenderer r1 = new HighLowRenderer(); HighLowRenderer r2 = new HighLowRenderer(); assertEquals(r1, r2); r1.setTickLength(0.5); assertFalse(r1.equals(r2)); r2.setTickLength(0.5); assertEquals(r1, r2); r1.setOpenTickPaint(Color.RED); assertFalse(r1.equals(r2)); r2.setOpenTickPaint(Color.RED); assertEquals(r1, r2); r1.setCloseTickPaint(Color.RED); assertFalse(r1.equals(r2));
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
