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
 * --------------------------
 * LegendItemEntityTests.java
 * --------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 20-May-2004 : Version 1 (DG);
 * 18-May-2007 : Added checks for new fields (DG);
 *
 */

package org.jfree.chart.entity.junit;

import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.entity.LegendItemEntity;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link LegendItemEntity} class.
 */
public class LegendItemEntityTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(LegendItemEntityTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public LegendItemEntityTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testLegendItemEntity4372() { LegendItemEntity e1 = new LegendItemEntity(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); LegendItemEntity e2 = new LegendItemEntity(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); assertEquals(e1, e2); }
public void testClone4380() throws CloneNotSupportedException { LegendItemEntity e1 = new LegendItemEntity(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); LegendItemEntity e2 = (LegendItemEntity) e1.clone(); assertEquals(e1, e2); }
public void testCloning4381() throws CloneNotSupportedException { LegendItemEntity e1 = new LegendItemEntity(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); LegendItemEntity e2 = (LegendItemEntity) e1.clone(); assertNotSame(e1, e2); assertSame(e1.getArea(), e2.getArea()); }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
