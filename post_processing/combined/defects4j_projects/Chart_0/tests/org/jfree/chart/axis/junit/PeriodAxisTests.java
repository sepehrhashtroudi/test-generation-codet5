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
 * PeriodAxisTests.java
 * --------------------
 * (C) Copyright 2004-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 10-Jun-2003 : Version 1 (DG);
 * 07-Jan-2005 : Added test for hashCode() method (DG);
 * 08-Apr-2008 : Added test1932146() (DG);
 * 16-Jan-2009 : Added test2490803() (DG);
 * 02-Mar-2009 : Added testEqualsWithLocale (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Stroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.PeriodAxisLabelInfo;
import org.jfree.chart.event.AxisChangeEvent;
import org.jfree.chart.event.AxisChangeListener;
import org.jfree.data.Range;
import org.jfree.data.time.DateRange;
import org.jfree.data.time.Day;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.Second;
import org.jfree.data.time.Year;

/**
 * Tests for the {@link PeriodAxis} class.
 */
public class PeriodAxisTests extends TestCase implements AxisChangeListener {

    /** The last event received. */
    private AxisChangeEvent lastEvent;

    /**
     * Receives and records an {@link AxisChangeEvent}.
     *
     * @param event  the event.
     */
    public void axisChanged(AxisChangeEvent event) {
        this.lastEvent = event;
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(PeriodAxisTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public PeriodAxisTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals() method can distinguish all the required fields.
     */
public void testCloning737() { 
     PeriodAxisLabelInfo info1 = new PeriodAxisLabelInfo(Day.class, new SimpleDateFormat("d")); 
     PeriodAxisLabelInfo info2 = null; 
     try { 
         info2 = (PeriodAxisLabelInfo) info1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(info1 != info2); 
     assertTrue(info1.getClass() == info2.getClass()); 
     assertTrue(info1.equals(info2)); 
 }
public void testHashCode831() { 
     PeriodAxis a1 = new PeriodAxis("Test"); 
     PeriodAxis a2 = new PeriodAxis("Test"); 
     assertTrue(a1.equals(a2)); 
     int h1 = a1.hashCode(); 
     int h2 = a2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testSerialization908() { 
     PeriodAxis a1 = new PeriodAxis("Test Axis"); 
     PeriodAxis a2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(a1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         a2 = (PeriodAxis) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(a1, a2); 
 }
public void testEquals911() { 
     PeriodAxis a1 = new PeriodAxis("Test"); 
     PeriodAxis a2 = new PeriodAxis("Test"); 
     assertTrue(a1.equals(a2)); 
     assertTrue(a2.equals(a1)); 
     a1 = new PeriodAxis("Test 1"); 
     assertFalse(a1.equals(a2)); 
     a2 = new PeriodAxis("Test 1"); 
     assertTrue(a1.equals(a2)); 
     a1 = new PeriodAxis("Test 2"); 
     assertFalse(a1.equals(a2)); 
     a2 = new PeriodAxis("Test 2"); 
     assertTrue(a1.equals(a2)); 
     a1 = new PeriodAxis("Test", new Year(2000), new Year(2001)); 
     assertFalse(a1.equals(a2)); 
     a2 = new PeriodAxis("Test", new Year(2000), new Year(2001)); 
     assertTrue(a1.equals(a2)); 
     a1 = new PeriodAxis("Test", new Year(2002), new Year(2003)); 
     assertFalse(a1.equals(a2)); 
     a2 = new PeriodAxis("Test", new Year(2002), new Year(2003)); 
     assertTrue(a1.equals(a2)); 
 }
public void testCloning931() { 
     PeriodAxis a1 = new PeriodAxis("Test"); 
     PeriodAxis a2 = null; 
     try { 
         a2 = (PeriodAxis) a1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(a1 != a2); 
     assertTrue(a1.getClass() == a2.getClass()); 
     assertTrue(a1.equals(a2)); 
     a1 = new PeriodAxis("Test 1"); 
     assertFalse(a1.equals(a2)); 
     a2 = null; 
     try { 
         a2 = (PeriodAxis) a1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(a1 != a2); 
     assertTrue(a1.getClass() == a2.getClass()); 
     assertTrue(a1.equals(a2)); 
     a1.setTickMarksVisible(false); 
     assertFalse(a1.equals(a2)); 
     a2.setTickMarksVisible(false); 
     assertTrue(a1.equals(a2)); 
 }
public void testCloning932() { 
     PeriodAxis a1 = new PeriodAxis("Test"); 
     PeriodAxis a2 = null; 
     try { 
         a2 = (PeriodAxis) a1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(a1 != a2); 
     assertTrue(a1.getClass() == a2.getClass()); 
     assertTrue(a1.equals(a2)); 
     a1.setTickMarksVisible(false); 
     assertFalse(a1.equals(a2)); 
     a2.setTickMarksVisible(false); 
     assertTrue(a1.equals(a2)); 
 }
public void testConstructor933() { 
     PeriodAxis a1 = new PeriodAxis("Test Axis"); 
     PeriodAxis a2 = null; 
     try { 
         a2 = (PeriodAxis) a1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(a1 != a2); 
     assertTrue(a1.getClass() == a2.getClass()); 
     assertTrue(a1.equals(a2)); 
 }
    

    /**
     * Confirm that the equals() method can distinguish the locale field (which
     * is new in version 1.0.13).
     */
    

        /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * A test for bug 1932146.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * A test for the setRange() method (because the axis shows whole time
     * periods, the range set for the axis will most likely be wider than the
     * one specified).
     */
    
// Defects4J: flaky method
//     public void test2490803() {
//         Locale savedLocale = Locale.getDefault();
//         TimeZone savedTimeZone = TimeZone.getDefault();
//         try {
//             Locale.setDefault(Locale.FRANCE);
//             TimeZone.setDefault(TimeZone.getTimeZone("Europe/Paris"));
//             GregorianCalendar c0 = new GregorianCalendar();
//             c0.clear();
//             /* c0.set(2009, Calendar.JANUARY, 16, 12, 34, 56);
//             System.out.println(c0.getTime().getTime());
//             c0.clear();
//             c0.set(2009, Calendar.JANUARY, 17, 12, 34, 56);
//             System.out.println(c0.getTime().getTime()); */
//             PeriodAxis axis = new PeriodAxis("TestAxis");
//             axis.setRange(new Range(1232105696000L, 1232192096000L), false,
//                     false);
//             Range r = axis.getRange();
//             Day d0 = new Day(16, 1, 2009);
//             Day d1 = new Day(17, 1, 2009);
//             assertEquals(d0.getFirstMillisecond(), r.getLowerBound(), EPSILON);
//             assertEquals(d1.getLastMillisecond() + 1.0, r.getUpperBound(),
//                     EPSILON);
//         }
//         finally {
//             TimeZone.setDefault(savedTimeZone);
//             Locale.setDefault(savedLocale);
//         }
//     }

}
