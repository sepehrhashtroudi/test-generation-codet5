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
 * --------------------
 * LegendItemTests.java
 * --------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 04-Jun-2004 : Version 1 (DG);
 * 10-Dec-2005 : Addded new test to cover bug report 1374328 (DG);
 * 13-Dec-2006 : Extended testEquals() for new fillPaintTransformer
 *               attribute (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 23-Apr-2008 : Implemented Cloneable (DG);
 * 17-Jun-2008 : Included new fields in existing tests (DG);
 *
 */

package org.jfree.chart.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.font.TextAttribute;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.AttributedString;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.LegendItem;
import org.jfree.chart.util.GradientPaintTransformType;
import org.jfree.chart.util.StandardGradientPaintTransformer;

/**
 * Tests for the {@link LegendItem} class.
 */
public class LegendItemTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(LegendItemTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public LegendItemTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testCharacterIteratorToString5814() { LegendItem item1 = new LegendItem("Label1", null); LegendItem item2 = new LegendItem("Label2", null); LegendItem item3 = new LegendItem("Label3", null); LegendItem item4 = new LegendItem("Label4", null); LegendItem item5 = new LegendItem("Label5", null); assertEquals("Label1", item1.getLabel()); assertEquals("Label2", item2.getLabel()); assertEquals("Label3", item3.getLabel()); assertEquals("Label4", item4.getLabel()); assertEquals("", item5.getLabel());
}

    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Basic checks for cloning.
     */
    

}
