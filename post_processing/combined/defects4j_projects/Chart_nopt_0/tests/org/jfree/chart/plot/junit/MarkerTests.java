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
 * ----------------
 * MarkerTests.java
 * ----------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 05-Sep-2006 : Version 1 (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import java.util.EventListener;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.event.MarkerChangeEvent;
import org.jfree.chart.event.MarkerChangeListener;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleInsets;

/**
 * Tests for the {@link Marker} class.
 */
public class MarkerTests extends TestCase implements MarkerChangeListener {

    MarkerChangeEvent lastEvent;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(MarkerTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public MarkerTests(String name) {
        super(name);
    }

    /**
     * Some checks for the getPaint() and setPaint() methods.
     */
    

    /**
     * Some checks for the getStroke() and setStroke() methods.
     */
    

    /**
     * Some checks for the getOutlinePaint() and setOutlinePaint() methods.
     */
    

    /**
     * Some checks for the getOutlineStroke() and setOutlineStroke() methods.
     */
    

    private static final float EPSILON = 0.000000001f;

    /**
     * Some checks for the getAlpha() and setAlpha() methods.
     */
    

    /**
     * Some checks for the getLabel() and setLabel() methods.
     */
    

    /**
     * Some checks for the getLabelFont() and setLabelFont() methods.
     */
    

    /**
     * Some checks for the getLabelPaint() and setLabelPaint() methods.
     */
    

    /**
     * Some checks for the getLabelAnchor() and setLabelAnchor() methods.
     */
    

    /**
     * Some checks for the getLabelOffset() and setLabelOffset() methods.
     */
    

    /**
     * Some checks for the getLabelOffsetType() and setLabelOffsetType()
     * methods.
     */
    

    /**
     * Some checks for the getLabelTextAnchor() and setLabelTextAnchor()
     * methods.
     */
    

    /**
     * Checks that a CategoryPlot deregisters listeners when clearing markers.
     */
    

    /**
     * Checks that an XYPlot deregisters listeners when clearing markers.
     */
    

    /**
     * Records the last event.
     *
     * @param event  the event.
     */
    public void markerChanged(MarkerChangeEvent event) {
        this.lastEvent = event;
    }

}
