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
 * PieChart3DTests.java
 * --------------------
 * (C) Copyright 2004-2009, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes:
 * --------
 * 21-May-2004 : Version 1 (DG);
 *
 */

package org.jfree.chart.junit;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.pie.PieDataset;

/**
 * Tests for a pie chart with a 3D effect.
 */
public class PieChart3DTests extends TestCase {

    /** A chart. */
    private JFreeChart pieChart;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(PieChart3DTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public PieChart3DTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        // create a dataset...
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Java", new Double(43.2));
        dataset.setValue("Visual Basic", new Double(0.0));
        dataset.setValue("C/C++", new Double(17.5));
        this.pieChart = createPieChart3D(dataset);
    }

    /**
     * Using a regular pie chart, we replace the dataset with null.  Expect to
     * receive notification of a chart change event, and (of course) the
     * dataset should be null.
     */

public void testReplaceDatasetOnPieChart502() { 
     LocalListener l = new LocalListener(); 
     this.pieChart.addChangeListener(l); 
     PiePlot plot = (PiePlot) this.pieChart.getPlot(); 
     plot.setDataset(null); 
     assertEquals(true, l.flag); 
     assertNull(plot.getDataset()); 
 } 

    

    /**
     * Tests that no exceptions are thrown when there is a <code>null</code>
     * value in the dataset.
     */
    

    /**
     * Creates a pie chart.
     *
     * @param dataset  the dataset.
     *
     * @return The pie chart.
     */
    private static JFreeChart createPieChart3D(PieDataset dataset) {
        return ChartFactory.createPieChart3D("Pie Chart", dataset, true);
    }

    /**
     * A chart change listener.
     */
    static class LocalListener implements ChartChangeListener {

        /** A flag. */
        private boolean flag = false;

        /**
         * Event handler.
         *
         * @param event  the event.
         */
        public void chartChanged(ChartChangeEvent event) {
            this.flag = true;
        }

    }

}
