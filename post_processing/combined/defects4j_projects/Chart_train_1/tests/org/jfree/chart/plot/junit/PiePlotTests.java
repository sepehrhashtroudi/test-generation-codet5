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
 * -----------------
 * PiePlotTests.java
 * -----------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 18-Mar-2003 : Version 1 (DG);
 * 10-May-2005 : Strengthened equals() test (DG);
 * 27-Sep-2006 : Added tests for the getBaseSectionPaint() method (DG);
 * 23-Nov-2006 : Additional equals() and clone() tests (DG);
 * 17-Apr-2007 : Added check for label generator that returns a null label (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 * 31-Mar-2008 : Updated testEquals() (DG);
 * 10-Jul-2009 : Updated testEquals() (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
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
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieToolTipGenerator;
import org.jfree.chart.plot.PieLabelLinkStyle;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.urls.CustomPieURLGenerator;
import org.jfree.chart.urls.StandardPieURLGenerator;
import org.jfree.chart.util.DefaultShadowGenerator;
import org.jfree.chart.util.Rotation;
import org.jfree.data.pie.DefaultPieDataset;
import org.jfree.data.pie.PieDataset;

/**
 * Some tests for the {@link PiePlot} class.
 */
public class PiePlotTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(PiePlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public PiePlotTests(String name) {
        super(name);
    }

    /**
     * Test the equals() method.
     */

public void testDrawWithNullLegendLabels13() { 
     DefaultPieDataset dataset = new DefaultPieDataset(); 
     dataset.setValue("L1", 12.0); 
     dataset.setValue("L2", 11.0); 
     JFreeChart chart = ChartFactory.createPieChart("Test", dataset, true); 
     PiePlot plot = (PiePlot) chart.getPlot(); 
     plot.setLegendLabelGenerator(new NullLegendLabelGenerator()); 
     boolean success = false; 
     try { 
         BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB); 
         Graphics2D g2 = image.createGraphics(); 
         chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null); 
         g2.dispose(); 
         success = true; 
     } catch (Exception e) { 
         success = false; 
     } 
     assertTrue(success); 
 } 


public void testEquals139() { 
     PiePlot plot1 = new PiePlot(); 
     PiePlot plot2 = new PiePlot(); 
     assertTrue(plot1.equals(plot2)); 
     assertTrue(plot2.equals(plot1)); 
     plot1.setPieIndex(99); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setPieIndex(99); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setInteriorGap(0.15); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setInteriorGap(0.15); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setCircular(!plot1.isCircular()); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setCircular(false); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setStartAngle(Math.PI); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setStartAngle(Math.PI); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDirection(Rotation.ANTICLOCKWISE); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDirection(Rotation.ANTICLOCKWISE); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setIgnoreZeroValues(true); 
     plot2.setIgnoreZeroValues(false); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setIgnoreZeroValues(true); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setIgnoreNullValues(true); 
     plot2.setIgnoreNullValues(false); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setIgnoreNullValues(true); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setSectionPaint("A", new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.white)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setSectionPaint("A", new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.white)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setBaseSectionPaint(new GradientPaint(1.0f, 2.0f, Color.black, 3.0f, 4.0f, Color.white)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setBaseSectionPaint(new GradientPaint(1.0f, 2.0f, Color.black, 3.0f, 4.0f, Color.white)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setSectionOutlinesVisible(false); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setSectionOutlinesVisible(false); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setSectionOutlinePaint("A", new GradientPaint(1.0f, 2.0f, Color.green, 3.0f, 4.0f, Color.white)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setSectionOutlinePaint("A", new GradientPaint(1.0f, 2.0f, Color.green, 3.0f, 4.0f, Color.white)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setBaseSectionOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.gray, 3.0f, 4.0f, Color.white)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setBaseSectionOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.gray, 3.0f, 4.0f, Color.white)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setSectionOutlineStroke("A", new BasicStroke(1.0f)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setSectionOutlineStroke("A", new BasicStroke(1.0f)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setBaseSectionOutlineStroke(new BasicStroke(1.0f)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setBaseSectionOutlineStroke(new BasicStroke(1.0f)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setShadowPaint(new GradientPaint(1.0f, 2.0f, Color.orange, 3.0f, 4.0f, Color.white)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setShadowPaint(new GradientPaint(1.0f, 2.0f, Color.orange, 3.0f, 4.0f, Color.white)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setShadowXOffset(4.4); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setShadowXOffset(4.4); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setShadowYOffset(4.4); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setShadowYOffset(4.4); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLabelFont(new Font("Serif", Font.PLAIN, 18)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelFont(new Font("Serif", Font.PLAIN, 18)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.darkGray, 3.0f, 4.0f, Color.white)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.darkGray, 3.0f, 4.0f, Color.white)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLabelBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.white)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.white)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLabelOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.white)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.white)); 
     assertTrue(plot1.equals(plot2)); 
     Stroke s = new BasicStroke(1.1f); 
     plot1.setLabelOutlineStroke(s); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelOutlineStroke(s); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLabelShadowPaint(new GradientPaint(1.0f, 2.0f, Color.yellow, 3.0f, 4.0f, Color.white)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelShadowPaint(new GradientPaint(1.0f, 2.0f, Color.yellow, 3.0f, 4.0f, Color.white)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setExplodePercent("A", 0.33); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setExplodePercent("A", 0.33); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLabelGenerator(new StandardPieSectionLabelGenerator("{2}{1}{0}")); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelGenerator(new StandardPieSectionLabelGenerator("{2}{1}{0}")); 
     assertTrue(plot1.equals(plot2)); 
     Font f = new Font("SansSerif", Font.PLAIN, 20); 
     plot1.setLabelFont(f); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelFont(f); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.magenta, 3.0f, 4.0f, Color.white)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.magenta, 3.0f, 4.0f, Color.white)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setMaximumLabelWidth(0.33); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setMaximumLabelWidth(0.33); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLabelGap(0.11); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelGap(0.11); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLabelLinksVisible(false); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelLinksVisible(false); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLabelLinkStyle(PieLabelLinkStyle.QUAD_CURVE); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelLinkStyle(PieLabelLinkStyle.QUAD_CURVE); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLabelLinkMargin(0.11); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelLinkMargin(0.11); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLabelLinkPaint(new GradientPaint(1.0f, 2.0f, Color.magenta, 3.0f, 4.0f, Color.white)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelLinkPaint(new GradientPaint(1.0f, 2.0f, Color.magenta, 3.0f, 4.0f, Color.white)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLabelLinkStroke(new BasicStroke(1.0f)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLabelLinkStroke(new BasicStroke(1.0f)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setToolTipGenerator(new StandardPieToolTipGenerator("{2}{1}{0}")); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setToolTipGenerator(new StandardPieToolTipGenerator("{2}{1}{0}")); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setURLGenerator(new StandardPieURLGenerator("xx")); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setURLGenerator(new StandardPieURLGenerator("xx")); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setMinimumArcAngleToDraw(1.0); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setMinimumArcAngleToDraw(1.0); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLegendItemShape(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLegendItemShape(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0} --> {1}")); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0} --> {1}")); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLegendLabelToolTipGenerator(new StandardPieSectionLabelGenerator("{0} is {1}")); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLegendLabelToolTipGenerator(new StandardPieSectionLabelGenerator("{0} is {1}")); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLegendLabelURLGenerator(new StandardPieURLGenerator("index.html")); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLegendLabelURLGenerator(new StandardPieURLGenerator("index.html")); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setAutoPopulateSectionPaint(false); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setAutoPopulateSectionPaint(false); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setAutoPopulateSectionOutlinePaint(true); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setAutoPopulateSectionOutlinePaint(true); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setAutoPopulateSectionOutlineStroke(true); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setAutoPopulateSectionOutlineStroke(true); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setShadowGenerator(new DefaultShadowGenerator(5, Color.gray, 0.6f, 4, -Math.PI / 4)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setShadowGenerator(new DefaultShadowGenerator(5, Color.gray, 0.6f, 4, -Math.PI / 4)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setShadowGenerator(null); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setShadowGenerator(null); 
     assertTrue(plot1.equals(plot2)); 
 } 


public void testGetBaseSectionPaint648() { 
     PiePlot plot = new PiePlot(); 
     assertNotNull(plot.getBaseSectionPaint()); 
     boolean pass = false; 
     try { 
         plot.setBaseSectionPaint(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 

    

    /**
     * Some basic checks for the clone() method.
     */
    

    /**
     * Check cloning of the urlGenerator field.
     */
    

    /**
     * Check cloning of the legendItemShape field.
     */
    

    /**
     * Check cloning of the legendLabelGenerator field.
     */
    

    /**
     * Check cloning of the legendLabelToolTipGenerator field.
     */
    

    /**
     * Check cloning of the legendLabelURLGenerator field.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the getLegendItems() method.
     */
    

    /**
     * Check that the default base section paint is not null, and that you
     * can never set it to null.
     */
    

    static class NullLegendLabelGenerator implements PieSectionLabelGenerator {
        public AttributedString generateAttributedSectionLabel(
                PieDataset dataset, Comparable key) {
            return null;
        }
        public String generateSectionLabel(PieDataset dataset, Comparable key) {
            return null;
        }
    }

    /**
     * Draws a pie chart where the label generator returns null.
     */
    

}
