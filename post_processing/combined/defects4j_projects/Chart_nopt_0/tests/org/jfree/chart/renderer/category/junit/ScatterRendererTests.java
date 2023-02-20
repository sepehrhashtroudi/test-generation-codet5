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
 * ScatterRendererTests.java
 * -------------------------
 * (C) Copyright 2007, 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 08-Oct-2007 : Version 1 (DG);
 * 11-Oct-2007 : Renamed ScatterRenderer (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.chart.renderer.category.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.renderer.category.ScatterRenderer;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link ScatterRenderer} class.
 */
public class ScatterRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(ScatterRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public ScatterRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */
public void testFireChangeEvent1291() { ScatterRenderer r = new ScatterRenderer(); r.setUseSeriesOffset(true); assertTrue(r.getUseSeriesOffset()); r.setUseSeriesOffset(false); assertFalse(r.getUseSeriesOffset()); r.setUseSeriesOffset(true); assertTrue(r.getUseSeriesOffset()); }
public void testFireChangeEvent1293() { ScatterRenderer r = new ScatterRenderer(); r.setDrawOutlines(true); assertTrue(r.getDrawOutlines()); r.setDrawOutlines(false); assertFalse(r.getDrawOutlines()); }
public void testFireChangeEvent1296() { ScatterRenderer r = new ScatterRenderer(); assertFalse(r.getUseOutlinePaint()); r.setUseOutlinePaint(true); assertTrue(r.getUseOutlinePaint()); r.setUseOutlinePaint(false); assertFalse(r.getUseOutlinePaint()); r.setUseOutlinePaint(true); assertTrue(r.getUseOutlinePaint()); r.setUseOutlinePaint(false); assertFalse(r.getUseOutlinePaint()); }
public void testFireChangeEvent1300() { ScatterRenderer r = new ScatterRenderer(); r.setBaseShapesFilled(true); assertTrue(r.getBaseShapesFilled()); r.setBaseShapesFilled(false); assertFalse(r.getBaseShapesFilled()); r.setBaseShapesFilled(true); assertTrue(r.getBaseShapesFilled()); }
public void testFireChangeEvent1302() { ScatterRenderer r = new ScatterRenderer(); assertFalse(r.getUseFillPaint()); r.setUseFillPaint(true); assertTrue(r.getUseFillPaint()); r.setUseFillPaint(false); assertFalse(r.getUseFillPaint()); r.setUseFillPaint(true); assertTrue(r.getUseFillPaint()); }
public void testEquals1303() { ScatterRenderer r1 = new ScatterRenderer(); ScatterRenderer r2 = new ScatterRenderer(); assertEquals(r1, r2); r1.setSeriesShapesFilled(1, true); assertFalse(r1.equals(r2)); r2.setSeriesShapesFilled(1, true); assertEquals(r1, r2); r1.setBaseShapesFilled(true); assertFalse(r1.equals(r2)); r2.setBaseShapesFilled(true); assertEquals(r1, r2); r1.setUseFillPaint(true); assertFalse(r1.equals(r2));
}

public void testEquals1304() { ScatterRenderer r1 = new ScatterRenderer(); ScatterRenderer r2 = new ScatterRenderer(); assertEquals(r1, r2); r1.setBaseShapesFilled(true); assertFalse(r1.equals(r2)); r2.setBaseShapesFilled(true); assertEquals(r1, r2); r1.setSeriesShapesFilled(0, true); assertFalse(r1.equals(r2)); r2.setSeriesShapesFilled(0, true); assertEquals(r1, r2); r1.setUseFillPaint(true); assertFalse(r1.equals(r2));
}

public void testEquals1305() { ScatterRenderer r1 = new ScatterRenderer(); ScatterRenderer r2 = new ScatterRenderer(); assertEquals(r1, r2); r1.setUseFillPaint(true); assertFalse(r1.equals(r2)); r2.setUseFillPaint(true); assertEquals(r1, r2); r1.setSeriesShapesFilled(0, true); assertFalse(r1.equals(r2)); r2.setSeriesShapesFilled(0, true); assertEquals(r1, r2); r1.setBaseShapesFilled(true); assertFalse(r1.equals(r2));
}

public void testEquals1307() { ScatterRenderer r1 = new ScatterRenderer(); ScatterRenderer r2 = new ScatterRenderer(); assertEquals(r1, r2); r1.setUseOutlinePaint(true); assertFalse(r1.equals(r2)); r2.setUseOutlinePaint(true); assertEquals(r1, r2); r1.setSeriesShapesFilled(0, true); assertFalse(r1.equals(r2)); r2.setSeriesShapesFilled(0, true); assertEquals(r1, r2); r1.setBaseShapesFilled(true); assertFalse(r1.equals(r2));
}

public void testEquals1308() { ScatterRenderer r1 = new ScatterRenderer(); ScatterRenderer r2 = new ScatterRenderer(); assertEquals(r1, r2); r1.setUseSeriesOffset(true); assertFalse(r1.equals(r2)); r2.setUseSeriesOffset(true); assertEquals(r1, r2); r1.setSeriesShapesFilled(2, true); assertFalse(r1.equals(r2)); r2.setSeriesShapesFilled(2, true); assertEquals(r1, r2); r1.setBaseShapesFilled(true); assertFalse(r1.equals(r2));
}

public void testCloning1310() throws CloneNotSupportedException { ScatterRenderer r1 = new ScatterRenderer(); ScatterRenderer r2 = (ScatterRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
    

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
     * Checks that the two renderers are equal but independent of one another.
     *
     * @param r1  renderer 1.
     * @param r2  renderer 2.
     *
     * @return A boolean.
     */
    private boolean checkIndependence(ScatterRenderer r1,
            ScatterRenderer r2) {

        // should be equal...
        if (!r1.equals(r2)) {
            return false;
        }

        // and independent...
        r1.setSeriesShapesFilled(1, true);
        if (r1.equals(r2)) {
            return false;
        }
        r2.setSeriesShapesFilled(1, true);
        if (!r1.equals(r2)) {
            return false;
        }

        r1.setBaseShapesFilled(false);
        r2.setBaseShapesFilled(true);
        if (r1.equals(r2)) {
            return false;
        }
        r2.setBaseShapesFilled(false);
        if (!r1.equals(r2)) {
            return false;
        }
        return true;

    }

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
