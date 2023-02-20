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
public void testSerialization121() { 
     PiePlot p1 = new PiePlot(null); 
     PiePlot p2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(p1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         p2 = (PiePlot) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(p1, p2); 
 }
public void testGetLegendItems227() { 
     DefaultPieDataset dataset = new DefaultPieDataset(); 
     dataset.setValue("Item 1", 1.0); 
     dataset.setValue("Item 2", 2.0); 
     dataset.setValue("Item 3", 0.0); 
     dataset.setValue("Item 4", null); 
     PiePlot plot = new PiePlot(dataset); 
     plot.setIgnoreNullValues(false); 
     plot.setIgnoreZeroValues(false); 
     LegendItemCollection items = plot.getLegendItems(); 
     assertEquals(4, items.getItemCount()); 
     plot.setIgnoreNullValues(true); 
     items = plot.getLegendItems(); 
     assertEquals(3, items.getItemCount()); 
     plot.setIgnoreZeroValues(true); 
     items = plot.getLegendItems(); 
     assertEquals(2, items.getItemCount()); 
     dataset.setValue("Item 5", -1.0); 
     items = plot.getLegendItems(); 
     assertEquals(2, items.getItemCount()); 
 }
public void testCloning624() { 
     DefaultPieDataset d1 = new DefaultPieDataset(); 
     d1.setValue("V1", new Integer(1)); 
     d1.setValue("V2", null); 
     d1.setValue("V3", new Integer(3)); 
     DefaultPieDataset d2 = null; 
     try { 
         d2 = (DefaultPieDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         System.err.println("Failed to clone."); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
 }
public void testCloning_URLGenerator1305() { 
     CustomPieURLGenerator generator = new CustomPieURLGenerator(); 
     PiePlot p1 = new PiePlot(null); 
     p1.setURLGenerator(generator); 
     PiePlot p2 = null; 
     try { 
         p2 = (PiePlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     assertTrue(p1.getURLGenerator() != p2.getURLGenerator()); 
 }
public void testAutoPopulateFlagDefaults1309() { 
     JFreeChart chart = ChartFactory.createPieChart3D("Test", null, true); 
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
public void testCloning_LegendLabelURLGenerator1314() { 
     CustomPieURLGenerator generator = new CustomPieURLGenerator(); 
     PiePlot p1 = new PiePlot(null); 
     p1.setLegendLabelURLGenerator(generator); 
     PiePlot p2 = null; 
     try { 
         p2 = (PiePlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     assertTrue(p1.getLegendLabelURLGenerator() != p2.getLegendLabelURLGenerator()); 
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
