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
 * ------------------------------------
 * CombinedRangeCategoryPlotTests.java
 * ------------------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 21-Aug-2003 : Version 1 (DG);
 * 03-Jan-2008 : Added testNotification() (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
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

import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link CombinedRangeCategoryPlot} class.
 */
public class CombinedRangeCategoryPlotTests extends TestCase
        implements ChartChangeListener {

    /** A list of the events received. */
    private List events = new java.util.ArrayList();

    /**
     * Receives a chart change event.
     *
     * @param event  the event.
     */
    public void chartChanged(ChartChangeEvent event) {
        this.events.add(event);
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CombinedRangeCategoryPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CombinedRangeCategoryPlotTests(String name) {
        super(name);
    }

    /**
     * Test the equals() method.
     */
public void testCombinedRangeCategoryPlot561() { try { CombinedRangeCategoryPlot plot1 = createPlot(); CombinedRangeCategoryPlot plot2 = createPlot(); assertEquals(plot1, plot2); } catch (Exception e) { fail(e.getMessage()); } }
public void testEqualsObject562() { CombinedRangeCategoryPlot plot1 = createPlot(); CombinedRangeCategoryPlot plot2 = createPlot(); assertEquals(plot1, plot2); }
public void testCloning563() throws CloneNotSupportedException { CombinedRangeCategoryPlot plot1 = createPlot(); CombinedRangeCategoryPlot plot2 = (CombinedRangeCategoryPlot) plot1.clone(); assertNotSame(plot1, plot2); }
public void testEquals595() { CombinedRangeCategoryPlot plot1 = createPlot(); CombinedRangeCategoryPlot plot2 = createPlot(); assertEquals(plot1, plot2); }
public void testCloning596() throws CloneNotSupportedException { CombinedRangeCategoryPlot plot1 = createPlot(); CombinedRangeCategoryPlot plot2 = (CombinedRangeCategoryPlot) plot1.clone(); assertNotSame(plot1, plot2); assertSame(plot1.getClass(), plot2.getClass()); assertEquals(plot1, plot2); }
public void testGetColumnKey654() { DefaultCategoryDataset d = new DefaultCategoryDataset(); d.addValue(1.0, "R1", "C1"); d.addValue(2.0, "R2", "C2"); d.addValue(3.0, "R3", "C3"); d.addValue(4.0, "R4", "C4"); assertEquals("C1", d.getColumnKey(0)); assertEquals("C2", d.getColumnKey(1)); assertEquals("C3", d.getColumnKey(2)); }
public void testLineBreak3589() { String text = "\\n"; String text2 = "\\n"; String text3 = "\\n"; String text4 = "\\n"; String text5 = "\\n"; String text6 = "\\n"; String text7 = "\\n"; String text8 = "\\n"; String text9 = "\\n"; String text10 = "\\n"; String text11 = "\\n"; String text12 = "\\n"; String text13 = "\\n"; String text14 = "\\n"; String text15 = "\\n"; String text21 = "\\n"; String text22 = "\\n"; String text23 = "\\n"; String text24 = "\\n"; String text26 = "\\n";
}

public void testGetIndexOf7617() { CategoryPlot plot = new CategoryPlot(); assertEquals(-1, plot.getIndexOf(new LineAndShapeRenderer())); assertEquals(-1, plot.getIndexOf(new LineAndShapeRenderer())); }
public void testG2TextMeasurer8359() throws Exception { }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * This is a test to replicate the bug report 1121172.
     */
    

    /**
     * Check that only one chart change event is generated by a change to a
     * subplot.
     */
    

    /**
     * Creates a dataset.
     *
     * @return A dataset.
     */
    public CategoryDataset createDataset1() {

        DefaultCategoryDataset result = new DefaultCategoryDataset();

        // row keys...
        String series1 = "First";
        String series2 = "Second";

        // column keys...
        String type1 = "Type 1";
        String type2 = "Type 2";
        String type3 = "Type 3";
        String type4 = "Type 4";
        String type5 = "Type 5";
        String type6 = "Type 6";
        String type7 = "Type 7";
        String type8 = "Type 8";

        result.addValue(1.0, series1, type1);
        result.addValue(4.0, series1, type2);
        result.addValue(3.0, series1, type3);
        result.addValue(5.0, series1, type4);
        result.addValue(5.0, series1, type5);
        result.addValue(7.0, series1, type6);
        result.addValue(7.0, series1, type7);
        result.addValue(8.0, series1, type8);

        result.addValue(5.0, series2, type1);
        result.addValue(7.0, series2, type2);
        result.addValue(6.0, series2, type3);
        result.addValue(8.0, series2, type4);
        result.addValue(4.0, series2, type5);
        result.addValue(4.0, series2, type6);
        result.addValue(2.0, series2, type7);
        result.addValue(1.0, series2, type8);

        return result;

    }

    /**
     * Creates a dataset.
     *
     * @return A dataset.
     */
    public CategoryDataset createDataset2() {

        DefaultCategoryDataset result = new DefaultCategoryDataset();

        // row keys...
        String series1 = "Third";
        String series2 = "Fourth";

        // column keys...
        String type1 = "Type 1";
        String type2 = "Type 2";
        String type3 = "Type 3";
        String type4 = "Type 4";
        String type5 = "Type 5";
        String type6 = "Type 6";
        String type7 = "Type 7";
        String type8 = "Type 8";

        result.addValue(11.0, series1, type1);
        result.addValue(14.0, series1, type2);
        result.addValue(13.0, series1, type3);
        result.addValue(15.0, series1, type4);
        result.addValue(15.0, series1, type5);
        result.addValue(17.0, series1, type6);
        result.addValue(17.0, series1, type7);
        result.addValue(18.0, series1, type8);

        result.addValue(15.0, series2, type1);
        result.addValue(17.0, series2, type2);
        result.addValue(16.0, series2, type3);
        result.addValue(18.0, series2, type4);
        result.addValue(14.0, series2, type5);
        result.addValue(14.0, series2, type6);
        result.addValue(12.0, series2, type7);
        result.addValue(11.0, series2, type8);

        return result;

    }

    /**
     * Creates a sample plot.
     *
     * @return A plot.
     */
    private CombinedRangeCategoryPlot createPlot() {
        CategoryDataset dataset1 = createDataset1();
        CategoryAxis catAxis1 = new CategoryAxis("Category");
        LineAndShapeRenderer renderer1 = new LineAndShapeRenderer();
        renderer1.setBaseToolTipGenerator(
                new StandardCategoryToolTipGenerator());
        CategoryPlot subplot1 = new CategoryPlot(dataset1, catAxis1, null,
                renderer1);
        subplot1.setDomainGridlinesVisible(true);

        CategoryDataset dataset2 = createDataset2();
        CategoryAxis catAxis2 = new CategoryAxis("Category");
        BarRenderer renderer2 = new BarRenderer();
        renderer2.setBaseToolTipGenerator(
                new StandardCategoryToolTipGenerator());
        CategoryPlot subplot2 = new CategoryPlot(dataset2, catAxis2, null,
                renderer2);
        subplot2.setDomainGridlinesVisible(true);

        NumberAxis rangeAxis = new NumberAxis("Value");
        CombinedRangeCategoryPlot plot = new CombinedRangeCategoryPlot(
                rangeAxis);
        plot.add(subplot1, 2);
        plot.add(subplot2, 1);
        return plot;
    }

}
