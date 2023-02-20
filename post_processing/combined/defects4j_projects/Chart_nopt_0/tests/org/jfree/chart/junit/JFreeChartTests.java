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
 * JFreeChartTests.java
 * --------------------
 * (C) Copyright 2002-2009, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes:
 * --------
 * 11-Jun-2002 : Version 1 (DG);
 * 17-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 * 23-Sep-2003 : Removed null title test, since TM has added code to ensure
 *               null titles cannot be created (DG);
 * 24-Nov-2005 : Removed OldLegend (DG);
 * 16-May-2007 : Added some new tests (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.RenderingHints;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.Align;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

/**
 * Tests for the {@link JFreeChart} class.
 */
public class JFreeChartTests extends TestCase implements ChartChangeListener {

    /** A pie chart. */
    private JFreeChart pieChart;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(JFreeChartTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public JFreeChartTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Java", new Double(43.2));
        dataset.setValue("Visual Basic", new Double(0.0));
        dataset.setValue("C/C++", new Double(17.5));
        this.pieChart = ChartFactory.createPieChart("Pie Chart", dataset,
                true);
    }

    /**
     * Check that the equals() method can distinguish all fields.
     */
public void testRingPlot504() { RingPlot p1 = new RingPlot(null); RingPlot p2 = new RingPlot(null); assertEquals(p1, p2); }
public void testRingPlot505() { RingPlot p1 = new RingPlot(); RingPlot p2 = new RingPlot(); assertEquals(p1, p2); }
public void testTextTitle893() { TextTitle t1 = new TextTitle(); TextTitle t2 = new TextTitle(); assertEquals(t1.getText(), t2.getText()); assertEquals(t1.getFont(), t2.getFont()); assertEquals(t1.getHorizontalAlignment(), t2.getHorizontalAlignment()); assertEquals(t1.getVerticalAlignment(), t2.getVerticalAlignment()); assertEquals(t1.getPadding(), t2.getPadding()); }
public void testTextTitle894() { TextTitle t1 = new TextTitle(); TextTitle t2 = new TextTitle(); assertEquals(t1, t2); }
    

    /**
     * A test to make sure that the legend is being picked up in the
     * equals() testing.
     */
    

    /**
     * Checks the subtitle count - should be 1 (the legend).
     */
    

    /**
     * Some checks for the getSubtitle() method.
     */
    

    /**
     * Serialize a pie chart, restore it, and check for equality.
     */
    

    /**
     * Serialize a 3D pie chart, restore it, and check for equality.
     */
    

    /**
     * Serialize a bar chart, restore it, and check for equality.
     */
    

    /**
     * Serialize a time seroes chart, restore it, and check for equality.
     */
    

    /**
     * Some checks for the addSubtitle() methods.
     */
    

    /**
     * Some checks for the getSubtitles() method.
     */
    

    /**
     * Some checks for the default legend firing change events.
     */
    

    /**
     * Some checks for title changes and event notification.
     */
    

    /** The last ChartChangeEvent received. */
    private ChartChangeEvent lastChartChangeEvent;

    /**
     * Records the last chart change event.
     *
     * @param event  the event.
     */
    public void chartChanged(ChartChangeEvent event) {
        this.lastChartChangeEvent = event;
    }

}
