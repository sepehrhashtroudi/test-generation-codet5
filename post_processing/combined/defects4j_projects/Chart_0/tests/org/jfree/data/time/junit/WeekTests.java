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
 * --------------
 * WeekTests.java
 * --------------
 * (C) Copyright 2002-2009, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 05-Apr-2002 : Version 1 (DG);
 * 26-Jun-2002 : Removed unnecessary imports (DG);
 * 17-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 * 13-Mar-2003 : Added serialization test (DG);
 * 21-Oct-2003 : Added hashCode test (DG);
 * 06-Apr-2006 : Added testBug1448828() method (DG);
 * 01-Jun-2006 : Added testBug1498805() method (DG);
 * 11-Jul-2007 : Fixed bad time zone assumption (DG);
 * 28-Aug-2007 : Added test for constructor problem (DG);
 * 19-Dec-2007 : Set default locale for tests that are sensitive
 *               to the locale (DG);
 *
 */

package org.jfree.data.time.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.time.Week;
import org.jfree.data.time.Year;

/**
 * Tests for the {@link Week} class.
 */
public class WeekTests extends TestCase {

    /** A week. */
    private Week w1Y1900;

    /** A week. */
    private Week w2Y1900;

    /** A week. */
    private Week w51Y9999;

    /** A week. */
    private Week w52Y9999;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(WeekTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public WeekTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        this.w1Y1900 = new Week(1, 1900);
        this.w2Y1900 = new Week(2, 1900);
        this.w51Y9999 = new Week(51, 9999);
        this.w52Y9999 = new Week(52, 9999);
    }

    /**
     * Tests the equals method.
     */
public void testConstructor340() { 
     Locale savedLocale = Locale.getDefault(); 
     TimeZone savedZone = TimeZone.getDefault(); 
     Locale.setDefault(new Locale("da", "DK")); 
     TimeZone.setDefault(TimeZone.getTimeZone("Europe/Copenhagen")); 
     GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault()); 
     assertEquals(Calendar.MONDAY, cal.getFirstDayOfWeek()); 
     cal.set(2007, Calendar.AUGUST, 26, 1, 0, 0); 
     cal.set(Calendar.MILLISECOND, 0); 
     Date t = cal.getTime(); 
     Week w = new Week(t, TimeZone.getTimeZone("Europe/Copenhagen"), Locale.getDefault()); 
     assertEquals(34, w.getWeek()); 
     Locale.setDefault(Locale.US); 
     TimeZone.setDefault(TimeZone.getTimeZone("US/Detroit")); 
     cal = (GregorianCalendar) Calendar.getInstance(TimeZone.getDefault()); 
     assertEquals(Calendar.SUNDAY, cal.getFirstDayOfWeek()); 
     cal.set(2007, Calendar.AUGUST, 26, 1, 0, 0); 
     cal.set(Calendar.MILLISECOND, 0); 
     t = cal.getTime(); 
     w = new Week(t, TimeZone.getTimeZone("Europe/Copenhagen"), Locale.getDefault()); 
     assertEquals(35, w.getWeek()); 
     w = new Week(t, TimeZone.getTimeZone("Europe/Copenhagen"), new Locale("da", "DK")); 
     assertEquals(34, w.getWeek()); 
     Locale.setDefault(savedLocale); 
     TimeZone.setDefault(savedZone); 
 }
public void testSerialization341() { 
     Week w1 = new Week(24, 1999); 
     Week w2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(w1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         w2 = (Week) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(w1, w2); 
 }
public void testGetFirstMillisecond342() { 
     Locale saved = Locale.getDefault(); 
     Locale.setDefault(Locale.UK); 
     TimeZone savedZone = TimeZone.getDefault(); 
     TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); 
     Week w = new Week(31, 1970); 
     assertEquals(18485999999L, w.getFirstMillisecond()); 
     Locale.setDefault(saved); 
     TimeZone.setDefault(savedZone); 
 }
public void testW52Y9999Next343() { 
     Week next = (Week) this.w52Y9999.next(); 
     assertEquals(this.w51Y9999, next); 
 }
public void testNext344() { 
     Week w = new Week(24, 1999); 
     w = (Week) w.next(); 
     assertEquals(2000, w.getYear().getYear()); 
     assertEquals(12, w.getWeek()); 
     w = new Week(59, 1999); 
     assertNull(w.next()); 
 }
public void testHashcode345() { 
     Week w1 = new Week(24, 1999); 
     Week w2 = new Week(24, 1999); 
     assertTrue(w1.equals(w2)); 
     int h1 = w1.hashCode(); 
     int h2 = w2.hashCode(); 
     assertEquals(h1, h2); 
 }
    

    /**
     * Request the week before week 1, 1900: it should be <code>null</code>.
     */
    

    /**
     * Request the week after week 1, 1900: it should be week 2, 1900.
     */
    

    /**
     * Request the week before w52, 9999: it should be week 51, 9999.
     */
    

    /**
     * Request the week after w52, 9999: it should be <code>null</code>.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * The {@link Week} class is immutable, so should not be {@link Cloneable}.
     */
    

    /**
     * The first week in 2005 should span the range:
     *
     * TimeZone         | Start Millis  | End Millis    | Start Date  | End Date
     * -----------------+---------------+---------------+-------------+------------
     * Europe/London    | 1104710400000 | 1105315199999 |  3-Jan-2005 | 9-Jan-2005
     * Europe/Paris     | 1104706800000 | 1105311599999 |  3-Jan-2005 | 2-Jan-2005
     * America/New_York | 1104037200000 | 1104641999999 | 26-Dec-2004 | 1-Jan-2005
     *
     * In London and Paris, Monday is the first day of the week, while in the
     * US it is Sunday.
     *
     * Previously, we were using these values, but see Java Bug ID 4960215:
     *
     * TimeZone         | Start Millis  | End Millis    | Start Date  | End Date
     * -----------------+---------------+---------------+-------------+------------
     * Europe/London    | 1104105600000 | 1104710399999 | 27-Dec-2004 | 2-Jan-2005
     * Europe/Paris     | 1104102000000 | 1104706799999 | 27-Dec-2004 | 2-Jan-2005
     * America/New_York | 1104037200000 | 1104641999999 | 26-Dec-2004 | 1-Jan-2005
     */
    

    /**
     * The 53rd week in 2004 in London and Paris should span the range:
     *
     * TimeZone         | Start Millis  | End Millis    | Start Date  | End Date
     * -----------------+---------------+---------------+-------------+------------
     * Europe/London    | 1104105600000 | 1104710399999 | 27-Dec-2004 | 02-Jan-2005
     * Europe/Paris     | 1104102000000 | 1104706799999 | 27-Dec-2004 | 02-Jan-2005
     *
     * The 53rd week in 2005 in New York should span the range:
     *
     * TimeZone         | Start Millis  | End Millis    | Start Date  | End Date
     * -----------------+---------------+---------------+-------------+------------
     * America/New_York | 1135486800000 | 1136091599999 | 25-Dec-2005 | 31-Dec-2005
     *
     * In London and Paris, Monday is the first day of the week, while in the
     * US it is Sunday.
     */
    

    /**
     * A test case for bug 1448828.
     */
    

    /**
     * A test case for bug 1498805.
     */
    

    /**
     * Some checks for the getFirstMillisecond() method.
     */
    

    /**
     * Some checks for the getFirstMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getFirstMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getLastMillisecond() method.
     */
    

    /**
     * Some checks for the getLastMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getLastMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getSerialIndex() method.
     */
    

    /**
     * Some checks for the testNext() method.
     */
    

    /**
     * Some checks for the getStart() method.
     */
    

    /**
     * Some checks for the getEnd() method.
     */
    

    /**
     * A test for a problem in constructing a new Week instance.
     */
    

}
