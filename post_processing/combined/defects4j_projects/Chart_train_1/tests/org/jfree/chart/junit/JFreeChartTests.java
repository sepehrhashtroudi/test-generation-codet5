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

public void testSerialization16() { 
     DefaultPieDataset data = new DefaultPieDataset(); 
     data.setValue("Type 1", 54.5); 
     data.setValue("Type 2", 23.9); 
     data.setValue("Type 3", 45.8); 
     JFreeChart c1 = ChartFactory.createPieChart("Test", data, true); 
     JFreeChart c2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(c1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         c2 = (JFreeChart) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(c1, c2); 
     LegendTitle lt2 = c2.getLegend(); 
     assertTrue(lt2.getSources()[0] == c2.getPlot()); 
 } 


public void testEquals76() { 
     JFreeChart chart1 = new JFreeChart("Title", new Font("SansSerif", Font.PLAIN, 12), new PiePlot(), true); 
     JFreeChart chart2 = new JFreeChart("Title", new Font("SansSerif", Font.PLAIN, 12), new PiePlot(), true); 
     assertTrue(chart1.equals(chart2)); 
     assertTrue(chart2.equals(chart1)); 
     chart1.setRenderingHints(new RenderingHints(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON)); 
     assertFalse(chart1.equals(chart2)); 
     chart2.setRenderingHints(new RenderingHints(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON)); 
     assertTrue(chart1.equals(chart2)); 
     chart1.setBorderVisible(true); 
     assertFalse(chart1.equals(chart2)); 
     chart2.setBorderVisible(true); 
     assertTrue(chart1.equals(chart2)); 
     BasicStroke s = new BasicStroke(2.0f); 
     chart1.setBorderStroke(s); 
     assertFalse(chart1.equals(chart2)); 
     chart2.setBorderStroke(s); 
     assertTrue(chart1.equals(chart2)); 
     chart1.setBorderPaint(Color.red); 
     assertFalse(chart1.equals(chart2)); 
     chart2.setBorderPaint(Color.red); 
     assertTrue(chart1.equals(chart2)); 
     chart1.setPadding(new RectangleInsets(1, 2, 3, 4)); 
     assertFalse(chart1.equals(chart2)); 
     chart2.setPadding(new RectangleInsets(1, 2, 3, 4)); 
     assertTrue(chart1.equals(chart2)); 
     chart1.setTitle("XYZ"); 
     assertFalse(chart1.equals(chart2)); 
     chart2.setTitle("XYZ"); 
     assertTrue(chart1.equals(chart2)); 
     chart1.addSubtitle(new TextTitle("Subtitle")); 
     assertFalse(chart1.equals(chart2)); 
     chart2.addSubtitle(new TextTitle("Subtitle")); 
     assertTrue(chart1.equals(chart2)); 
     chart1 = new JFreeChart("Title", new Font("SansSerif", Font.PLAIN, 12), new RingPlot(), false); 
     chart2 = new JFreeChart("Title", new Font("SansSerif", Font.PLAIN, 12), new PiePlot(), false); 
     assertFalse(chart1.equals(chart2)); 
     chart2 = new JFreeChart("Title", new Font("SansSerif", Font.PLAIN, 12), new RingPlot(), false); 
     assertTrue(chart1.equals(chart2)); 
     chart1.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(chart1.equals(chart2)); 
     chart2.setBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(chart1.equals(chart2)); 
     chart1.setBackgroundImage(JFreeChart.INFO.getLogo()); 
     assertFalse(chart1.equals(chart2)); 
     chart2.setBackgroundImage(JFreeChart.INFO.getLogo()); 
     assertTrue(chart1.equals(chart2)); 
     chart1.setBackgroundImageAlignment(Align.BOTTOM_LEFT); 
     assertFalse(chart1.equals(chart2)); 
     chart2.setBackgroundImageAlignment(Align.BOTTOM_LEFT); 
     assertTrue(chart1.equals(chart2)); 
     chart1.setBackgroundImageAlpha(0.1f); 
     assertFalse(chart1.equals(chart2)); 
     chart2.setBackgroundImageAlpha(0.1f); 
     assertTrue(chart1.equals(chart2)); 
 } 


public void testAddSubtitle132() { 
     DefaultPieDataset dataset = new DefaultPieDataset(); 
     JFreeChart chart = ChartFactory.createPieChart("title", dataset, true); 
     TextTitle t0 = new TextTitle("T0"); 
     chart.addSubtitle(0, t0); 
     assertEquals(t0, chart.getSubtitle(0)); 
     TextTitle t1 = new TextTitle("T1"); 
     chart.addSubtitle(t1); 
     assertEquals(t1, chart.getSubtitle(2)); 
     boolean pass = false; 
     try { 
         chart.addSubtitle(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         chart.addSubtitle(-1, t0); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         chart.addSubtitle(4, t0); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void testTitleChangeEvent415() { 
     DefaultPieDataset dataset = new DefaultPieDataset(); 
     JFreeChart chart = ChartFactory.createPieChart("title", dataset, true); 
     chart.addChangeListener(this); 
     this.lastChartChangeEvent = null; 
     TextTitle t = chart.getTitle(); 
     t.setFont(new Font("Dialog", Font.BOLD, 9)); 
     assertNotNull(this.lastChartChangeEvent); 
     this.lastChartChangeEvent = null; 
     TextTitle t2 = new TextTitle("T2"); 
     chart.setTitle(t2); 
     assertNotNull(this.lastChartChangeEvent); 
     this.lastChartChangeEvent = null; 
     t2.setFont(new Font("Dialog", Font.BOLD, 9)); 
     assertNotNull(this.lastChartChangeEvent); 
     this.lastChartChangeEvent = null; 
     t.setFont(new Font("Dialog", Font.BOLD, 9)); 
     assertNull(this.lastChartChangeEvent); 
     this.lastChartChangeEvent = null; 
 } 

    

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
