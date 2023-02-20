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
public void testIsSelected3173() { DefaultPieDataset d = new DefaultPieDataset(); d.setValue("A", 1.0); d.setValue("B", 2.0); d.setValue("C", 3.0); d.setValue("D", 4.0); d.setValue("E", 5.0); assertTrue(d.isSelected("A")); assertTrue(d.isSelected("B")); assertTrue(d.isSelected("C")); assertFalse(d.isSelected("D")); }
public void testIsSelected3174() { DefaultPieDataset d = new DefaultPieDataset(); d.setValue("A", 1.0); d.setValue("B", 2.0); d.setValue("C", 3.0); d.setValue("D", 4.0); d.setValue("E", 5.0); d.setValue("F", 6.0); assertTrue(d.isSelected("A")); assertFalse(d.isSelected("B")); assertTrue(d.isSelected("C")); assertFalse(d.isSelected("D")); }
public void testGetDataset7064() { PiePlot plot = new PiePlot(); PieDataset dataset = new DefaultPieDataset(); plot.setDataset(dataset); assertSame(dataset, plot.getDataset()); }
public void testPieIndex7072() { PiePlot plot = new PiePlot(); plot.setPieIndex(0); assertEquals(0, plot.getPieIndex()); plot.setPieIndex(1); assertEquals(1, plot.getPieIndex()); plot.setPieIndex(2); assertEquals(2, plot.getPieIndex()); plot.setPieIndex(3); assertEquals(3, plot.getPieIndex()); }
public void testIsCircular7084() { PiePlot plot = new PiePlot(); assertFalse(plot.isCircular()); plot.setCircular(true); assertTrue(plot.isCircular()); plot.setCircular(false); assertFalse(plot.isCircular()); }
public void testSetCircular7085() { PiePlot plot = new PiePlot(); plot.setCircular(true); assertEquals(true, plot.isCircular()); plot.setCircular(false); assertEquals(false, plot.isCircular()); plot.setCircular(true); assertEquals(true, plot.isCircular()); plot.setCircular(false); assertEquals(false, plot.isCircular()); }
public void testSetCircular7086() { PiePlot plot = new PiePlot(); plot.setCircular(true); assertTrue(plot.isCircular()); plot.setCircular(false); assertFalse(plot.isCircular()); plot.setCircular(true); assertTrue(plot.isCircular()); }
public void testGetBaseSectionPaint7112() { PiePlot plot = new PiePlot(); assertSame(Color.RED, plot.getBaseSectionPaint()); plot.setBaseSectionPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertSame(Color.RED, plot.getBaseSectionPaint()); plot.setBaseSectionPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertSame(Color.RED, plot.getBaseSectionPaint()); }
public void testSetsBaseSectionPaint7114() { PiePlot plot = new PiePlot(); try { plot.setBaseSectionPaint(null); fail("IllegalArgumentException should have been thrown on null argument."); } catch (IllegalArgumentException e) { assertEquals("Null \'paint\' argument.", e.getMessage()); } try { plot.setBaseSectionPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); fail("IllegalArgumentException should have been thrown on null argument."); } catch (IllegalArgumentException e) { assertEquals("Null \'paint\' argument.", e.getMessage()); } }
public void testSetBaseSectionPaint7115() { PiePlot plot = new PiePlot(); try { plot.setBaseSectionPaint(null); fail("IllegalArgumentException should have been thrown."); } catch (IllegalArgumentException e) { assertEquals("Null \'paint\' argument.", e.getMessage()); } try { plot.setBaseSectionPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); fail("IllegalArgumentException should have been thrown."); } catch (IllegalArgumentException e) { assertEquals("Null \'paint\' argument.", e.getMessage()); } }
public void testSetsBaseSectionPaint7117() { PiePlot plot = new PiePlot(); Color color = Color.RED; plot.setBaseSectionPaint(color); assertSame(color, plot.getBaseSectionPaint()); }
public void testGetAutoPopulateSectionPaint7119() { PiePlot plot = new PiePlot(); assertFalse(plot.getAutoPopulateSectionPaint()); plot.setAutoPopulateSectionPaint(true); assertTrue(plot.getAutoPopulateSectionPaint()); plot.setAutoPopulateSectionPaint(false); assertFalse(plot.getAutoPopulateSectionPaint()); }
public void testSetAutoPopulateSectionPaint7120() { PiePlot plot = new PiePlot(); plot.setAutoPopulateSectionPaint(true); assertEquals(Color.RED, plot.getBaseSectionPaint()); plot.setAutoPopulateSectionPaint(false); assertEquals(Color.RED, plot.getBaseSectionPaint()); plot.setAutoPopulateSectionPaint(true); assertEquals(Color.RED, plot.getBaseSectionPaint()); }
public void testSetAutoPopulateSectionPaint7121() { PiePlot plot = new PiePlot(); plot.setAutoPopulateSectionPaint(true); assertEquals(true, plot.getAutoPopulateSectionPaint()); plot.setAutoPopulateSectionPaint(false); assertEquals(false, plot.getAutoPopulateSectionPaint()); }
public void testFireChangeEvent7122() { PiePlot plot = new PiePlot(); plot.setAutoPopulateSectionPaint(true); assertEquals(Color.RED, plot.getBaseSectionPaint()); plot.setAutoPopulateSectionPaint(false); assertEquals(Color.RED, plot.getBaseSectionPaint()); plot.setAutoPopulateSectionPaint(true); assertEquals(Color.RED, plot.getBaseSectionPaint()); plot.setAutoPopulateSectionPaint(true); assertEquals(Color.RED, plot.getBaseSectionPaint()); plot.setAutoPopulateSectionPaint(false); assertEquals(Color.RED, plot.getBaseSectionPaint()); }
public void testSetSectionOutlinesVisible7123() { PiePlot plot = new PiePlot(); plot.setSectionOutlinesVisible(true); assertEquals(true, plot.getSectionOutlinesVisible()); plot.setSectionOutlinesVisible(false); assertEquals(false, plot.getSectionOutlinesVisible()); plot.setSectionOutlinesVisible(true); assertEquals(true, plot.getSectionOutlinesVisible()); }
public void testEqualsAndHashCode7138() { PiePlot plot1 = new PiePlot(); PiePlot plot2 = new PiePlot(); plot1.setSectionOutlinePaint("Section 1", Color.RED); plot2.setSectionOutlinePaint("Section 1", Color.BLUE); plot1.setSectionOutlinePaint("Section 2", Color.RED); plot2.setSectionOutlinePaint("Section 2", Color.BLUE); assertEquals(plot1, plot2); }
public void testSetsBaseSectionOutlinePaint7141() { PiePlot plot = new PiePlot(); try { plot.setBaseSectionOutlinePaint(null); fail("IllegalArgumentException should have been thrown on null argument."); } catch (IllegalArgumentException e) { assertEquals("Null \'paint\' argument.", e.getMessage()); } try { plot.setBaseSectionOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); fail("IllegalArgumentException should have been thrown on null argument."); } catch (IllegalArgumentException e) { assertEquals("Null \'paint\' argument.", e.getMessage()); } }
public void testSetBaseSectionOutlinePaint7142() { PiePlot plot = new PiePlot(); try { plot.setBaseSectionOutlinePaint(null); fail("IllegalArgumentException should have been thrown."); } catch (IllegalArgumentException e) { assertEquals("Null \'paint\' argument.", e.getMessage()); } try { plot.setBaseSectionOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); fail("IllegalArgumentException should have been thrown."); } catch (IllegalArgumentException e) { assertEquals("Null \'paint\' argument.", e.getMessage()); } }
public void testSetsBaseSectionOutlinePaint7143() { PiePlot plot = new PiePlot(); Color color = Color.RED; plot.setBaseSectionOutlinePaint(color); assertSame(color, plot.getBaseSectionOutlinePaint()); }
public void testCloning7144() throws CloneNotSupportedException { PiePlot p1 = new PiePlot(); PiePlot p2 = (PiePlot) p1.clone(); assertNotSame(p1, p2); assertSame(p1.getClass(), p2.getClass()); p1.setBaseSectionOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); p2.setBaseSectionOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE));
}

public void testGetAutoPopulateSectionOutlinePaint7145() { PiePlot plot = new PiePlot(); assertFalse(plot.getAutoPopulateSectionOutlinePaint()); plot.setAutoPopulateSectionOutlinePaint(true); assertTrue(plot.getAutoPopulateSectionOutlinePaint()); plot.setAutoPopulateSectionOutlinePaint(false); assertFalse(plot.getAutoPopulateSectionOutlinePaint()); }
public void testSetAutoPopulateSectionOutlinePaint7146() { PiePlot plot = new PiePlot(); plot.setAutoPopulateSectionOutlinePaint(true); assertEquals(Color.RED, plot.getBaseSectionOutlinePaint()); plot.setAutoPopulateSectionOutlinePaint(false); assertEquals(Color.RED, plot.getBaseSectionOutlinePaint()); plot.setAutoPopulateSectionOutlinePaint(true); assertEquals(Color.RED, plot.getBaseSectionOutlinePaint()); }
public void testSetAutoPopulateSectionOutlinePaint7147() { PiePlot plot = new PiePlot(); plot.setAutoPopulateSectionOutlinePaint(true); assertTrue(plot.getAutoPopulateSectionOutlinePaint()); plot.setAutoPopulateSectionOutlinePaint(false); assertFalse(plot.getAutoPopulateSectionOutlinePaint()); }
public void testSetBaseSectionOutlineStroke7163() { PiePlot plot = new PiePlot(); try { plot.setBaseSectionOutlineStroke(null); fail("IllegalArgumentException should have been thrown."); } catch (IllegalArgumentException e) { assertEquals("Null \'stroke\' argument.", e.getMessage()); } try { plot.setBaseSectionOutlineStroke(new BasicStroke(1.5f)); fail("IllegalArgumentException should have been thrown."); } catch (IllegalArgumentException e) { assertEquals("Null \'stroke\' argument.", e.getMessage()); } }
public void testGetAutoPopulateSectionOutlineStroke7166() { PiePlot plot = new PiePlot(); assertFalse(plot.getAutoPopulateSectionOutlineStroke()); plot.setAutoPopulateSectionOutlineStroke(true); assertTrue(plot.getAutoPopulateSectionOutlineStroke()); plot.setAutoPopulateSectionOutlineStroke(false); assertFalse(plot.getAutoPopulateSectionOutlineStroke()); }
public void testSetAutoPopulateSectionOutlineStroke7167() { PiePlot plot = new PiePlot(); plot.setAutoPopulateSectionOutlineStroke(true); assertEquals(true, plot.getAutoPopulateSectionOutlineStroke()); plot.setAutoPopulateSectionOutlineStroke(false); assertEquals(false, plot.getAutoPopulateSectionOutlineStroke()); }
public void testEqualsAndHashCode7170() { PiePlot plot1 = new PiePlot(); PiePlot plot2 = new PiePlot(); plot1.setShadowPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); plot2.setShadowPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(plot1, plot2); }
public void testFireChangeEvent7172() { PiePlot plot = new PiePlot(); Color color = Color.RED; plot.setShadowPaint(color); assertEquals(color, plot.getShadowPaint()); plot.setShadowPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(color, plot.getShadowPaint()); plot.setShadowPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(color, plot.getShadowPaint()); }
public void testSetLabelLinksVisible7202() { PiePlot plot = new PiePlot(); plot.setLabelLinksVisible(true); assertTrue(plot.getLabelLinksVisible()); plot.setLabelLinksVisible(false); assertFalse(plot.getLabelLinksVisible()); plot.setLabelLinksVisible(true); assertTrue(plot.getLabelLinksVisible()); }
public void testGetLabelLinkStyle7203() { PiePlot plot = new PiePlot(); PieLabelLinkStyle style1 = plot.getLabelLinkStyle(); PieLabelLinkStyle style2 = plot.getLabelLinkStyle(); assertSame(style1, style2); }
public void testEquals_ObjectList27209() { PiePlot plot1 = new PiePlot(); PiePlot plot2 = new PiePlot(); plot1.setLabelLinkPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); plot2.setLabelLinkPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); }
public void testGetLabelFont7216() { PiePlot plot = new PiePlot(); assertNotNull(plot.getLabelFont()); }
public void testGetLabelFont7217() { PiePlot plot = new PiePlot(); Font font = plot.getLabelFont(); assertEquals(new Font("SansSerif", Font.PLAIN, 8), font); }
public void testEqualsAndHashCode7222() { PiePlot plot1 = new PiePlot(); PiePlot plot2 = new PiePlot(); plot1.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); plot2.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(plot1, plot2); }
public void testSetLabelPaint7224() { PiePlot plot = new PiePlot(); try { plot.setLabelPaint(null); fail("IllegalArgumentException should have been thrown."); } catch (IllegalArgumentException e) { assertEquals("Null \'paint\' argument.", e.getMessage()); } try { plot.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); fail("IllegalArgumentException should have been thrown."); } catch (IllegalArgumentException e) { assertEquals("Null \'paint\' argument.", e.getMessage()); } }
public void testEqualsAndHashCode7225() { PiePlot plot1 = new PiePlot(); PiePlot plot2 = new PiePlot(); plot1.setLabelBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); plot2.setLabelBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(plot1, plot2); }
public void testCloning7226() throws CloneNotSupportedException { PiePlot p1 = new PiePlot(); PiePlot p2 = (PiePlot) p1.clone(); p1.setLabelBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); p2.setLabelBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertNotSame(p1, p2); }
public void testEqualsAndHashCode7227() { PiePlot plot1 = new PiePlot(); PiePlot plot2 = new PiePlot(); plot1.setLabelOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); plot2.setLabelOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(plot1, plot2); }
public void testSetLabelOutlineStroke7230() { PiePlot plot = new PiePlot(); Stroke s = new BasicStroke(2.5f); plot.setLabelOutlineStroke(s); assertSame(s, plot.getLabelOutlineStroke()); }
public void testFireChangeEvent7231() { PiePlot plot = new PiePlot(); plot.setLabelOutlineStroke(new BasicStroke(1.0f)); assertEquals(new BasicStroke(1.0f), plot.getLabelOutlineStroke()); plot.setLabelOutlineStroke(new BasicStroke(2.0f)); assertEquals(new BasicStroke(2.0f), plot.getLabelOutlineStroke()); plot.setLabelOutlineStroke(new BasicStroke(3.0f)); assertEquals(new BasicStroke(3.0f), plot.getLabelOutlineStroke()); }
public void testEqualsAndHashCode7232() { PiePlot plot1 = new PiePlot(); PiePlot plot2 = new PiePlot(); plot1.setLabelShadowPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); plot2.setLabelShadowPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(plot1, plot2); }
public void testCloning7233() throws CloneNotSupportedException { PiePlot p1 = new PiePlot(); PiePlot p2 = (PiePlot) p1.clone(); p1.setLabelShadowPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); p2.setLabelShadowPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertNotSame(p1, p2); }
public void testGetLegendItemShape7241() { PiePlot plot = new PiePlot(); assertNotNull(plot.getLegendItemShape()); }
public void testEqualsAndHashCode7246() { PiePlot plot1 = new PiePlot(); PiePlot plot2 = new PiePlot(); PieSectionLabelGenerator g1 = new StandardPieSectionLabelGenerator(); PieSectionLabelGenerator g2 = new StandardPieSectionLabelGenerator(); plot1.setLegendLabelGenerator(g1); plot2.setLegendLabelGenerator(g2); plot1.setLegendLabelGenerator(g1); plot2.setLegendLabelGenerator(g2); assertEquals(plot1, plot2); }
public void testNullLegendLabelGenerator7247() { PiePlot plot = new PiePlot(); try { plot.setLegendLabelGenerator(null); fail("IllegalArgumentException should have been thrown."); } catch (IllegalArgumentException e) { assertEquals("Null \'generator\' argument.", e.getMessage()); } }
public void testSetLegendLabelGenerator7248() { PiePlot plot = new PiePlot(); PieSectionLabelGenerator generator1 = new StandardPieSectionLabelGenerator(); plot.setLegendLabelGenerator(generator1); assertSame(generator1, plot.getLegendLabelGenerator()); PieSectionLabelGenerator generator2 = new StandardPieSectionLabelGenerator(); plot.setLegendLabelGenerator(generator2); assertSame(generator2, plot.getLegendLabelGenerator()); }
public void testEqualsAndHashCode7250() { PiePlot plot1 = new PiePlot(); PiePlot plot2 = new PiePlot(); PieSectionLabelGenerator g1 = new StandardPieSectionLabelGenerator(); PieSectionLabelGenerator g2 = new StandardPieSectionLabelGenerator(); plot1.setLegendLabelToolTipGenerator(g1); plot2.setLegendLabelToolTipGenerator(g2); plot1.setLegendLabelToolTipGenerator(g1); plot2.setLegendLabelToolTipGenerator(g2); assertEquals(plot1, plot2); }
public void testSetLegendLabelToolTipGenerator7251() { PiePlot plot = new PiePlot(); PieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator(); plot.setLegendLabelToolTipGenerator(generator); assertSame(generator, plot.getLegendLabelToolTipGenerator()); }
    

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
