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
 * ChartPanelTests.java
 * --------------------
 * (C) Copyright 2004-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 13-Jul-2004 : Version 1 (DG);
 * 12-Jan-2009 : Added test2502355() (DG);
 * 08-Jun-2009 : Added testSetMouseWheelEnabled() (DG);
 */

package org.jfree.chart.junit;

import java.awt.geom.Rectangle2D;
import java.util.EventListener;
import java.util.List;

import javax.swing.event.CaretListener;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.event.ChartChangeEvent;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.DefaultXYDataset;

/**
 * Tests for the {@link ChartPanel} class.
 */
public class ChartPanelTests extends TestCase
        implements ChartChangeListener, ChartMouseListener {

    private List chartChangeEvents = new java.util.ArrayList();

    /**
     * Receives a chart change event and stores it in a list for later
     * inspection.
     *
     * @param event  the event.
     */
    public void chartChanged(ChartChangeEvent event) {
        this.chartChangeEvents.add(event);
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(ChartPanelTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public ChartPanelTests(String name) {
        super(name);
    }

    /**
     * Test that the constructor will accept a null chart.
     */
public void testConstructor1652() { 
     ChartPanel panel = new ChartPanel(null); 
     assertEquals(null, panel.getChart()); 
 }
public void test2502355_zoomInDomain656() { 
     DefaultXYDataset dataset = new DefaultXYDataset(); 
     JFreeChart chart = ChartFactory.createXYLineChart("TestChart", "X", "Y", dataset, false); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     plot.setRangeAxis(1, new NumberAxis("X2")); 
     ChartPanel panel = new ChartPanel(chart); 
     chart.addChangeListener(this); 
     this.chartChangeEvents.clear(); 
     panel.zoomInDomain(1.0, 2.0); 
     assertEquals(1, this.chartChangeEvents.size()); 
 }
public void test2502355_zoomOutBoth657() { 
     DefaultXYDataset dataset = new DefaultXYDataset(); 
     JFreeChart chart = ChartFactory.createXYLineChart("TestChart", "X", "Y", dataset, false); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     plot.setRangeAxis(1, new NumberAxis("X2")); 
     ChartPanel panel = new ChartPanel(chart); 
     chart.addChangeListener(this); 
     this.chartChangeEvents.clear(); 
     panel.zoomOutBoth(1.0, 2.0); 
     assertEquals(1, this.chartChangeEvents.size()); 
 }
public void test2502355_zoomOutDomain658() { 
     DefaultXYDataset dataset = new DefaultXYDataset(); 
     JFreeChart chart = ChartFactory.createXYLineChart("TestChart", "X", "Y", dataset, false); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     plot.setRangeAxis(1, new NumberAxis("X2")); 
     ChartPanel panel = new ChartPanel(chart); 
     chart.addChangeListener(this); 
     this.chartChangeEvents.clear(); 
     panel.zoomOutDomain(1.0, 2.0); 
     assertEquals(1, this.chartChangeEvents.size()); 
 }
public void test2502355_restoreAutoDomainBounds661() { 
     DefaultXYDataset dataset = new DefaultXYDataset(); 
     JFreeChart chart = ChartFactory.createXYLineChart("TestChart", "X", "Y", dataset, false); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     plot.setRangeAxis(1, new NumberAxis("X2")); 
     ChartPanel panel = new ChartPanel(chart); 
     chart.addChangeListener(this); 
     this.chartChangeEvents.clear(); 
     panel.restoreAutoDomainBounds(); 
     assertEquals(1, this.chartChangeEvents.size()); 
 }
public void test2502355_zoomable662() { 
     DefaultXYDataset dataset = new DefaultXYDataset(); 
     JFreeChart chart = ChartFactory.createXYLineChart("TestChart", "X", "Y", dataset, false); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     plot.setRangeAxis(1, new NumberAxis("X2")); 
     ChartPanel panel = new ChartPanel(chart); 
     chart.addChangeListener(this); 
     this.chartChangeEvents.clear(); 
     panel.restoreAutoDomainBounds(); 
     assertEquals(1, this.chartChangeEvents.size()); 
 }
public void test2502355_zoomDomainBounds663() { 
     DefaultXYDataset dataset = new DefaultXYDataset(); 
     JFreeChart chart = ChartFactory.createXYLineChart("TestChart", "X", "Y", dataset, false); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     plot.setRangeAxis(1, new NumberAxis("X2")); 
     ChartPanel panel = new ChartPanel(chart); 
     chart.addChangeListener(this); 
     this.chartChangeEvents.clear(); 
     panel.restoreAutoDomainBounds(); 
     assertEquals(1, this.chartChangeEvents.size()); 
 }
public void test2502355_restoreAutoRangeBounds664() { 
     DefaultXYDataset dataset = new DefaultXYDataset(); 
     JFreeChart chart = ChartFactory.createXYLineChart("TestChart", "X", "Y", dataset, false); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     plot.setRangeAxis(1, new NumberAxis("X2")); 
     ChartPanel panel = new ChartPanel(chart); 
     chart.addChangeListener(this); 
     this.chartChangeEvents.clear(); 
     panel.restoreAutoRangeBounds(); 
     assertEquals(1, this.chartChangeEvents.size()); 
 }
public void test2502355_zoomable665() { 
     DefaultXYDataset dataset = new DefaultXYDataset(); 
     JFreeChart chart = ChartFactory.createXYLineChart("TestChart", "X", "Y", dataset, false); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     plot.setRangeAxis(1, new NumberAxis("X2")); 
     ChartPanel panel = new ChartPanel(chart); 
     chart.addChangeListener(this); 
     this.chartChangeEvents.clear(); 
     panel.restoreAutoRangeBounds(); 
     assertEquals(1, this.chartChangeEvents.size()); 
 }
public void test2502355_zoomRangeAxes666() { 
     DefaultXYDataset dataset = new DefaultXYDataset(); 
     JFreeChart chart = ChartFactory.createXYLineChart("TestChart", "X", "Y", dataset, false); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     plot.setRangeAxis(1, new NumberAxis("X2")); 
     ChartPanel panel = new ChartPanel(chart); 
     chart.addChangeListener(this); 
     this.chartChangeEvents.clear(); 
     panel.restoreAutoRangeBounds(); 
     assertEquals(1, this.chartChangeEvents.size()); 
 }
    

    /**
     * Test that it is possible to set the panel's chart to null.
     */
    

    /**
     * Check the behaviour of the getListeners() method.
     */
    

    /**
     * Ignores a mouse click event.
     *
     * @param event  the event.
     */
    public void chartMouseClicked(ChartMouseEvent event) {
        // ignore
    }

    /**
     * Ignores a mouse move event.
     *
     * @param event  the event.
     */
    public void chartMouseMoved(ChartMouseEvent event) {
        // ignore
    }

    /**
     * Checks that a call to the zoom() method generates just one
     * ChartChangeEvent.
     */
    

    /**
     * Checks that a call to the zoomInBoth() method generates just one
     * ChartChangeEvent.
     */
    

    /**
     * Checks that a call to the zoomOutBoth() method generates just one
     * ChartChangeEvent.
     */
    

    /**
     * Checks that a call to the restoreAutoBounds() method generates just one
     * ChartChangeEvent.
     */
    

    /**
     * Checks that a call to the zoomInDomain() method, for a plot with more
     * than one domain axis, generates just one ChartChangeEvent.
     */
    

    /**
     * Checks that a call to the zoomInRange() method, for a plot with more
     * than one range axis, generates just one ChartChangeEvent.
     */
    

    /**
     * Checks that a call to the zoomOutDomain() method, for a plot with more
     * than one domain axis, generates just one ChartChangeEvent.
     */
    

    /**
     * Checks that a call to the zoomOutRange() method, for a plot with more
     * than one range axis, generates just one ChartChangeEvent.
     */
    

    /**
     * Checks that a call to the restoreAutoDomainBounds() method, for a plot
     * with more than one range axis, generates just one ChartChangeEvent.
     */
    

    /**
     * Checks that a call to the restoreAutoRangeBounds() method, for a plot
     * with more than one range axis, generates just one ChartChangeEvent.
     */
    

    /**
     * In version 1.0.13 there is a bug where enabling the mouse wheel handler
     * twice would in fact disable it.
     */
    
}
