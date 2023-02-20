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
 * XYBoxAnnotationTests.java
 * -------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 19-Jan-2005 : Version 1 (DG);
 * 26-Feb-2008 : Added testDrawWithNullInfo() method (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 *
 */

package org.jfree.chart.annotations.junit;

import java.awt.BasicStroke;
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

import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYBoxAnnotation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.DefaultTableXYDataset;
import org.jfree.data.xy.XYSeries;

/**
 * Some tests for the {@link XYBoxAnnotation} class.
 */
public class XYBoxAnnotationTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYBoxAnnotationTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYBoxAnnotationTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testXYBoxAnnotation3351() { XYBoxAnnotation a1 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0, new BasicStroke(1.2f), Color.RED, Color.BLUE); XYBoxAnnotation a2 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0, new BasicStroke(1.2f), Color.RED, Color.BLUE); assertEquals(a1, a2); }
public void testXYBoxAnnotation3352() { XYBoxAnnotation a1 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0, new BasicStroke(1.2f), Color.RED, Color.BLUE); assertEquals(a1, a1); }
public void testCloning3365() throws CloneNotSupportedException { XYBoxAnnotation a1 = new XYBoxAnnotation(1.0, 2.0, 3.0, 4.0, new BasicStroke(1.2f), Color.RED, Color.BLUE); XYBoxAnnotation a2 = (XYBoxAnnotation) a1.clone(); assertNotSame(a1, a2); assertSame(a1.getClass(), a2.getClass()); assertEquals(a1, a2); }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Checks that this class implements PublicCloneable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Draws the chart with a <code>null</code> info object to make sure that
     * no exceptions are thrown.
     */
    

}
