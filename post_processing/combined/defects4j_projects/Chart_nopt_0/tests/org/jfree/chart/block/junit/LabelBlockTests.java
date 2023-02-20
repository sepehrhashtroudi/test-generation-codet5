/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2009, by Object Refinery Limited and Contributors.
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
 * LabelBlockTests.java
 * --------------------
 * (C) Copyright 2005-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 01-Sep-2005 : Version 1 (DG);
 * 16-Mar-2007 : Check GradientPaint in testSerialization() (DG);
 * 10-Feb-2009 : Added new fields to testEquals() (DG);
 *
 */

package org.jfree.chart.block.junit;

import java.awt.Color;
import java.awt.Font;
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
import org.jfree.chart.block.LabelBlock;
import org.jfree.chart.text.TextBlockAnchor;
import org.jfree.chart.util.RectangleAnchor;

/**
 * Some tests for the {@link LabelBlock} class.
 */
public class LabelBlockTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(LabelBlockTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public LabelBlockTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals() method can distinguish all the required fields.
     */
public void testLabelBlock3457() { LabelBlock b1 = new LabelBlock("line1", new Font("Dialog", Font.PLAIN, 12), Color.RED); LabelBlock b2 = new LabelBlock("line1", new Font("Dialog", Font.PLAIN, 12), Color.RED); assertEquals(b1, b2); }
public void testLabelBlock3458() { LabelBlock labelBlock1 = new LabelBlock("line1", new Font("Dialog", Font.PLAIN, 12), Color.RED); assertEquals(new LabelBlock("line1", new Font("Dialog", Font.PLAIN, 12), Color.RED), labelBlock1); LabelBlock labelBlock2 = new LabelBlock("line2", new Font("Dialog", Font.PLAIN, 12), Color.RED); assertEquals(new LabelBlock("line2", new Font("Dialog", Font.PLAIN, 12), Color.RED), labelBlock2); }
public void testEquals3480() { LabelBlock l1 = new LabelBlock("line1", new Font("Dialog", Font.PLAIN, 12), Color.RED); LabelBlock l2 = new LabelBlock("line1", new Font("Dialog", Font.PLAIN, 12), Color.RED); assertEquals(l1, l2); assertEquals(l2, l1); l1.setToolTipText("line1"); assertFalse(l1.equals(l2)); l2.setToolTipText("line1"); assertEquals(l1, l2); }
public void testEquals3481() { LabelBlock l1 = new LabelBlock("Line 1", new Font("Dialog", Font.PLAIN, 12), Color.RED); LabelBlock l2 = new LabelBlock("Line 1", new Font("Dialog", Font.PLAIN, 12), Color.RED); assertEquals(l1, l2); assertEquals(l2, l1); l1.setToolTipText("Line 1"); assertFalse(l1.equals(l2)); l2.setToolTipText("Line 1"); assertEquals(l1, l2); }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
