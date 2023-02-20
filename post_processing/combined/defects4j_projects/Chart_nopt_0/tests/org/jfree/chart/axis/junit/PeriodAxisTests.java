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
public void testPeriodAxis4841() { PeriodAxis axis = new PeriodAxis("Test"); assertEquals("Test", axis.getLabel()); }
public void testPeriodAxis4844() { PeriodAxis a1 = new PeriodAxis("Test"); assertEquals("Test", a1.getLabel()); assertEquals(new Year(2000), a1.getFirst()); assertEquals(new Year(2001), a1.getLast()); PeriodAxis a2 = new PeriodAxis("Test", new Year(2001), new Year(2001)); assertEquals("Test", a2.getLabel()); assertEquals(new Year(2001), a2.getFirst()); assertEquals(new Year(2001), a2.getLast()); }
public void testPeriodAxis4846() { PeriodAxis axis = new PeriodAxis("Test", new Year(2000), new Year(2000), TimeZone.getTimeZone("GMT"), Locale.GERMANY); assertEquals(new Year(2000), axis.getFirst()); assertEquals(new Year(2000), axis.getLast()); assertEquals(TimeZone.getTimeZone("GMT"), axis.getTimeZone()); axis.setFirst(new Year(2000)); assertEquals(new Year(2000), axis.getFirst()); assertEquals(new Year(2000), axis.getLast()); assertEquals(TimeZone.getTimeZone("GMT"), axis.getTimeZone()); }
public void testPeriodAxis4847() { PeriodAxis axis = new PeriodAxis("Test", new Year(2000), new Year(2000), TimeZone.getTimeZone("GMT"), Locale.UK); assertEquals(new Year(2000), axis.getFirst()); assertEquals(new Year(2000), axis.getLast()); assertEquals(TimeZone.getTimeZone("GMT"), axis.getTimeZone()); }
public void testPeriodAxis4849() { PeriodAxis a = new PeriodAxis("Test", new Year(2000), new Year(2000), TimeZone.getTimeZone("Europe/London"), Locale.GERMANY); assertEquals(new Year(2000), a.getFirst()); assertEquals(new Year(2000), a.getLast()); assertEquals(TimeZone.getTimeZone("Europe/London"), a.getTimeZone()); }
public void testPeriodAxis4851() { PeriodAxis axis = new PeriodAxis("Test", new Year(2000), new Year(2000), TimeZone.getTimeZone("GMT"), Locale.ENGLISH); assertEquals(new Year(2000), axis.getFirst()); assertEquals(new Year(2000), axis.getLast()); assertEquals(TimeZone.getTimeZone("GMT"), axis.getTimeZone()); axis.setFirst(new Year(2000)); assertEquals(new Year(2000), axis.getFirst()); assertEquals(new Year(2000), axis.getLast()); assertEquals(TimeZone.getTimeZone("GMT"), axis.getTimeZone()); }
public void testPeriodAxis4854() { PeriodAxis axis = new PeriodAxis("Test", new Year(2000), new Year(2000), TimeZone.getTimeZone("Europe/London"), Locale.GERMANY); assertEquals(new Year(2000), axis.getFirst()); assertEquals(new Year(2000), axis.getLast()); assertEquals(TimeZone.getTimeZone("Europe/London"), axis.getTimeZone()); assertEquals(true, axis.isMinorTickMarksVisible()); }
public void testSetAutoRange4856() { PeriodAxis axis = new PeriodAxis("Test", new Year(2000), new Year(2000), TimeZone.getTimeZone("GMT"), Locale.getDefault()); assertEquals(new Year(2000), axis.getFirst()); assertEquals(new Year(2000), axis.getLast()); axis.setAutoRange(true); assertEquals(new Year(2000), axis.getFirst()); assertEquals(new Year(2000), axis.getLast()); }
public void testPeriodAxis4858() { PeriodAxis axis = new PeriodAxis("Test", new Year(2000), new Year(2000)); assertEquals(new Year(2000), axis.getFirst()); assertEquals(new Year(2000), axis.getLast()); assertEquals(new Year(2000), axis.getTimeZone()); PeriodAxisLabelInfo[] labelInfo = axis.getLabelInfo(); assertEquals(2, labelInfo.length); assertEquals(Month.class, labelInfo[0].getClass()); assertEquals(Month.class, labelInfo[1].getClass()); assertEquals(new Year(2000), axis.getFirst()); assertEquals(new Year(2000), axis.getLast());
}

public void testPeriodAxis4859() { PeriodAxis a1 = new PeriodAxis("Test"); PeriodAxis a2 = new PeriodAxis("Test"); PeriodAxis a3 = new PeriodAxis("Test"); PeriodAxis a4 = new PeriodAxis("Test"); PeriodAxis a5 = new PeriodAxis("Test"); PeriodAxis a6 = new PeriodAxis("Test"); PeriodAxis a7 = new PeriodAxis("Test"); PeriodAxis a8 = new PeriodAxis("Test"); PeriodAxis a9 = new PeriodAxis("Test"); PeriodAxis b = new PeriodAxis("Test"); PeriodAxis c = new PeriodAxis("Test"); PeriodAxis d = new PeriodAxis("Test"); PeriodAxis e = new PeriodAxis("Test");
}

public void testSetFirst4860() { PeriodAxis a = new PeriodAxis("Test"); a.setFirst(new Year(2000)); assertEquals(new Year(2000), a.getFirst()); try { a.setFirst(null); fail("IllegalArgumentException expected"); } catch (IllegalArgumentException e) { } }
public void testSetFirst4861() { PeriodAxis a1 = new PeriodAxis("Test"); a1.setFirst(new Year(2000)); assertEquals(new Year(2000), a1.getFirst()); try { a1.setFirst(null); fail(); } catch (IllegalArgumentException e) { } }
public void testSetFirst4862() { PeriodAxis a1 = new PeriodAxis("Test"); a1.setFirst(new Year(2000)); PeriodAxis a2 = new PeriodAxis("Test"); a2.setFirst(new Year(2000)); try { a1.setFirst(null); fail(); } catch (IllegalArgumentException expected) { } try { a2.setFirst(null); fail(); } catch (IllegalArgumentException expected) { } }
public void testSetLast4864() { PeriodAxis a = new PeriodAxis("Test"); a.setLast(new Year(2000)); assertEquals(new Year(2000), a.getLast()); try { a.setLast(null); fail("Expected IllegalArgumentException"); } catch (IllegalArgumentException e) { } }
public void testSetLast4865() { PeriodAxis a = new PeriodAxis("Test"); assertNull(a.getLast()); a.setLast(new Year(2000)); assertEquals(new Year(2000), a.getLast()); try { a.setLast(null); fail("Expected IllegalArgumentException"); } catch (IllegalArgumentException e) { } }
public void testSetLast4867() { PeriodAxis a1 = new PeriodAxis("Test"); a1.setFirst(new Year(2000)); a1.setLast(new Year(2002)); PeriodAxis a2 = new PeriodAxis("Test", new Year(2000), new Year(2002)); a2.setLast(new Year(2002)); assertEquals(new Year(2002), a1.getLast()); assertEquals(new Year(2002), a2.getFirst()); assertEquals(new Year(2002), a2.getLast()); try { a1.setLast(null); fail(); } catch (IllegalArgumentException e) { } }
public void testSetTimeZone4869() { Locale locale = Locale.getDefault(); TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles"); PeriodAxis axis = new PeriodAxis("Test", new Year(2000), new Year(2000), tz, locale); axis.setTimeZone(tz); assertEquals(tz, axis.getTimeZone()); }
public void testSetTimeZone4870() { PeriodAxis a1 = new PeriodAxis("Test"); a1.setTimeZone(TimeZone.getTimeZone("PST")); assertEquals(TimeZone.getTimeZone("PST"), a1.getTimeZone()); try { a1.setTimeZone(null); fail("IllegalArgumentException expected"); } catch (IllegalArgumentException e) { } }
public void testSetTimeZone4871() { PeriodAxis a1 = new PeriodAxis("Test"); a1.setTimeZone(TimeZone.getTimeZone("PST")); assertEquals(TimeZone.getTimeZone("PST"), a1.getTimeZone()); try { a1.setTimeZone(null); fail("IllegalArgumentException expected"); } catch (IllegalArgumentException expected) { } }
public void testSetTimeZone4872() { PeriodAxis a1 = new PeriodAxis("Test"); a1.setTimeZone(TimeZone.getTimeZone("PST")); PeriodAxis a2 = new PeriodAxis("Test"); a2.setTimeZone(TimeZone.getTimeZone("PST")); assertEquals(TimeZone.getTimeZone("PST"), a1.getTimeZone()); assertEquals(TimeZone.getTimeZone("PST"), a2.getTimeZone()); }
public void testSetTimeZone4873() { Locale locale = Locale.US; TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles"); PeriodAxis a = new PeriodAxis("Test", new Year(2000), new Year(2000), tz, locale); assertEquals(TimeZone.getTimeZone("America/Los_Angeles"), a.getTimeZone()); a.setTimeZone(tz); assertEquals(TimeZone.getTimeZone("America/Los_Angeles"), a.getTimeZone()); }
public void testSetAutoRangeTimePeriodClass4876() { PeriodAxis a = new PeriodAxis("Test"); try { a.setAutoRangeTimePeriodClass(null); fail(); } catch (IllegalArgumentException e) { } try { a.setAutoRangeTimePeriodClass(Class.class); fail(); } catch (IllegalArgumentException e) { } }
public void testMinorTickMarksVisible4883() { PeriodAxis axis = new PeriodAxis("Test"); axis.setMinorTickMarksVisible(true); assertTrue(axis.isMinorTickMarksVisible()); axis.setMinorTickMarksVisible(false); assertFalse(axis.isMinorTickMarksVisible()); }
public void testSetMinorTickMarksVisible4885() { PeriodAxis axis = new PeriodAxis("Test"); axis.setMinorTickMarksVisible(true); assertTrue(axis.isMinorTickMarksVisible()); axis.setMinorTickMarksVisible(false); assertFalse(axis.isMinorTickMarksVisible()); axis.setMinorTickMarksVisible(true); assertTrue(axis.isMinorTickMarksVisible()); }
public void testMinorTickMarksVisible4886() { PeriodAxis a1 = new PeriodAxis("Test"); a1.setMinorTickMarksVisible(true); assertEquals(true, a1.isMinorTickMarksVisible()); PeriodAxis a2 = new PeriodAxis("Test"); a2.setMinorTickMarksVisible(false); assertEquals(false, a2.isMinorTickMarksVisible()); }
public void testSetMinorTickTimePeriodClass4889() { PeriodAxis a = new PeriodAxis("Test"); try { a.setMinorTickTimePeriodClass(null); fail(); } catch (IllegalArgumentException e) { } try { a.setMinorTickTimePeriodClass(Class.class); fail(); } catch (IllegalArgumentException e) { } }
public void testCloning4916() throws CloneNotSupportedException { PeriodAxis a1 = new PeriodAxis("Test"); PeriodAxis a2 = (PeriodAxis) a1.clone(); assertNotSame(a1, a2); assertSame(a1.getClass(), a2.getClass()); assertEquals(a1, a2); }
public void testCreateInstance4921() { PeriodAxis a = new PeriodAxis("Test"); assertEquals(new Year(2000), a.getFirst()); assertEquals(new Year(2001), a.getLast()); assertEquals(new Year(2002), a.getFirst()); assertEquals(new Year(2003), a.getLast()); assertEquals(new Year(2004), a.getFirst()); assertEquals(new Year(2005), a.getLast()); assertEquals(new Year(2006), a.getFirst()); assertEquals(new Year(2007), a.getLast()); }
    

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
