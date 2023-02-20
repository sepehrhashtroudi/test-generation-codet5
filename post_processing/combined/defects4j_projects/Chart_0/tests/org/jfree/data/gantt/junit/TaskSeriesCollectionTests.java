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
 * ------------------------------
 * TaskSeriesCollectionTests.java
 * ------------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 30-Jul-2004 : Version 1 (DG);
 * 12-Jan-2005 : Added tests from TaskSeriesCollectionTests2.java (DG);
 * 08-Mar-2007 : Added testRemove() (DG);
 *
 */

package org.jfree.data.gantt.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;
import org.jfree.data.time.SimpleTimePeriod;

/**
 * Tests for the {@link TaskSeriesCollection} class.
 */
public class TaskSeriesCollectionTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(TaskSeriesCollectionTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public TaskSeriesCollectionTests(String name) {
        super(name);
    }

    /**
     * Creates a sample collection for testing purposes.
     *
     * @return A sample collection.
     */
    private TaskSeriesCollection createCollection1() {
        TaskSeriesCollection result = new TaskSeriesCollection();
        TaskSeries s1 = new TaskSeries("S1");
        s1.add(new Task("Task 1", new Date(1), new Date(2)));
        s1.add(new Task("Task 2", new Date(3), new Date(4)));
        result.add(s1);
        TaskSeries s2 = new TaskSeries("S2");
        s2.add(new Task("Task 3", new Date(5), new Date(6)));
        result.add(s2);
        return result;
    }

    /**
     * Creates a sample collection for testing purposes.
     *
     * @return A sample collection.
     */
    private TaskSeriesCollection createCollection2() {
        TaskSeriesCollection result = new TaskSeriesCollection();
        TaskSeries s1 = new TaskSeries("S1");
        Task t1 = new Task("Task 1", new Date(10), new Date(20));
        t1.addSubtask(new Task("Task 1A", new Date(10), new Date(15)));
        t1.addSubtask(new Task("Task 1B", new Date(16), new Date(20)));
        t1.setPercentComplete(0.10);
        s1.add(t1);
        Task t2 = new Task("Task 2", new Date(30), new Date(40));
        t2.addSubtask(new Task("Task 2A", new Date(30), new Date(35)));
        t2.addSubtask(new Task("Task 2B", new Date(36), new Date(40)));
        t2.setPercentComplete(0.20);
        s1.add(t2);
        result.add(s1);
        TaskSeries s2 = new TaskSeries("S2");
        Task t3 = new Task("Task 3", new Date(50), new Date(60));
        t3.addSubtask(new Task("Task 3A", new Date(50), new Date(55)));
        t3.addSubtask(new Task("Task 3B", new Date(56), new Date(60)));
        t3.setPercentComplete(0.30);
        s2.add(t3);
        result.add(s2);
        return result;
    }

    /**
     * Creates a sample collection for testing purposes.
     *
     * @return A sample collection.
     */
    private TaskSeriesCollection createCollection3() {

        // define subtasks
        Task sub1 = new Task("Sub1", new Date(11), new Date(111));
        Task sub2 = new Task("Sub2", new Date(22), new Date(222));
        Task sub3 = new Task("Sub3", new Date(33), new Date(333));
        Task sub4 = new Task("Sub4", new Date(44), new Date(444));
        Task sub5 = new Task("Sub5", new Date(55), new Date(555));
        Task sub6 = new Task("Sub6", new Date(66), new Date(666));
        sub1.setPercentComplete(0.111);
        sub2.setPercentComplete(0.222);
        sub3.setPercentComplete(0.333);
        sub4.setPercentComplete(0.444);
        sub5.setPercentComplete(0.555);
        sub6.setPercentComplete(0.666);

        TaskSeries seriesA = new TaskSeries("Series A");
        Task taskA1 = new Task("Task 1", new SimpleTimePeriod(new Date(100),
                new Date(200)));
        taskA1.setPercentComplete(0.1);
        taskA1.addSubtask(sub1);
        Task taskA2 = new Task("Task 2", new SimpleTimePeriod(new Date(220),
                new Date(350)));
        taskA2.setPercentComplete(0.2);
        taskA2.addSubtask(sub2);
        taskA2.addSubtask(sub3);
        seriesA.add(taskA1);
        seriesA.add(taskA2);

        TaskSeries seriesB = new TaskSeries("Series B");
        // note that we don't define taskB1
        Task taskB2 = new Task("Task 2", new SimpleTimePeriod(new Date(2220),
                new Date(3350)));
        taskB2.setPercentComplete(0.3);
        taskB2.addSubtask(sub4);
        taskB2.addSubtask(sub5);
        taskB2.addSubtask(sub6);
        seriesB.add(taskB2);

        TaskSeriesCollection tsc = new TaskSeriesCollection();
        tsc.add(seriesA);
        tsc.add(seriesB);

        return tsc;
    }

    /**
     * A test for the getSeriesCount() method.
     */
public void testGetSeriesKey742() { 
     TaskSeriesCollection c = new TaskSeriesCollection(); 
     TaskSeries s1 = new TaskSeries("S1"); 
     s1.add(new Task("Task 1", new Date(0L), new Date(1L))); 
     s1.add(new Task("Task 2", new Date(10L), new Date(11L))); 
     s1.add(new Task("Task 3", new Date(20L), new Date(21L))); 
     TaskSeries s2 = new TaskSeries("S2"); 
     s2.add(new Task("Task 1", new Date(0L), new Date(1L))); 
     s2.add(new Task("Task 2", new Date(10L), new Date(11L))); 
     s2.add(new Task("Task 3", new Date(20L), new Date(21L))); 
     TaskSeriesCollection c2 = new TaskSeriesCollection(); 
     c2.add(s1); 
     c2.add(s2); 
     assertEquals("S2", c2.getSeriesKey(0)); 
     assertEquals("S2", c2.getSeriesKey(1)); 
     assertEquals("S2", c2.getSeriesKey(2)); 
     assertEquals(new Date(10L), c2.getStartValue(0, 0)); 
     assertEquals(new Date(20L), c2.getStartValue(0, 1)); 
     assertEquals(new Date(21L), c2.getStartValue(1, 0)); 
     assertEquals(new Date(2220L), c2.getStartValue(1, 1)); 
     assertEquals(new Date(2220L), c2.getEndValue(0, 0)); 
     assertEquals(new Date(2220L), c2.getEndValue(1, 1)); 
 }
public void testGetColumnKey751() { 
     TaskSeriesCollection c = createCollection1(); 
     assertEquals("Task 1", c.getColumnKey(0)); 
     assertEquals("Task 2", c.getColumnKey(1)); 
     assertEquals("Task 3", c.getColumnKey(2)); 
     TaskSeriesCollection c3 = createCollection3(); 
     assertEquals("Task 1", c3.getColumnKey(0)); 
     assertEquals("Task 2", c3.getColumnKey(1)); 
     assertEquals("Task 3", c3.getColumnKey(2)); 
 }
public void testGetRowIndex752() { 
     TaskSeriesCollection c = createCollection1(); 
     assertEquals(0, c.getRowIndex("Task 1")); 
     assertEquals(1, c.getRowIndex("Task 2")); 
     assertEquals(-1, c.getRowIndex("Task 3")); 
 }
public void testGetRowKey753() { 
     TaskSeriesCollection c = createCollection1(); 
     assertEquals("S1", c.getRowKey(0)); 
     assertEquals("S2", c.getRowKey(1)); 
     assertEquals("S3", c.getRowKey(2)); 
 }
public void testRemove756() { 
     TaskSeriesCollection c = createCollection1(); 
     TaskSeries s1 = new TaskSeries("S1"); 
     c.add(s1); 
     c.remove(0); 
     assertEquals(0, c.getSeriesCount()); 
     c.add(s1); 
     boolean pass = false; 
     try { 
         c.remove(-1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c.remove(1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testGetStartValue757() { 
     TaskSeriesCollection c = createCollection1(); 
     assertEquals(new Long(1L), c.getStartValue("S1", "Task 1")); 
     assertEquals(new Long(3L), c.getStartValue("S1", "Task 2")); 
     assertEquals(new Long(5L), c.getStartValue("S2", "Task 3")); 
     assertEquals(new Long(1L), c.getStartValue(0, 0)); 
     assertEquals(new Long(3L), c.getStartValue(0, 1)); 
     assertEquals(null, c.getStartValue(0, 2)); 
     assertEquals(null, c.getStartValue(1, 0)); 
     assertEquals(null, c.getStartValue(1, 1)); 
     assertEquals(new Long(5L), c.getStartValue(1, 2)); 
     TaskSeriesCollection c3 = createCollection3(); 
     assertEquals(new Long(100), c3.getStartValue(0, 0)); 
     assertEquals(new Long(220), c3.getStartValue(0, 1)); 
     assertTrue(c3.getStartValue(1, 0) == null); 
     assertEquals(new Long(2220), c3.getStartValue(1, 1)); 
 }
public void testGetValue758() { 
     TaskSeriesCollection c = createCollection1(); 
     assertEquals(new Long(1L), c.getValue("S1", "Task 1")); 
     assertEquals(new Long(3L), c.getValue("S1", "Task 2")); 
     assertEquals(new Long(5L), c.getValue("S2", "Task 3")); 
     assertEquals(new Long(1L), c.getValue(0, 0)); 
     assertEquals(new Long(3L), c.getValue(0, 1)); 
     assertEquals(null, c.getValue(0, 2)); 
     assertEquals(null, c.getStartValue(0, 0)); 
     assertEquals(null, c.getStartValue(0, 1)); 
     assertEquals(null, c.getStartValue(1, 0)); 
     assertEquals(null, c.getStartValue(1, 1)); 
     TaskSeriesCollection c3 = createCollection3(); 
     assertEquals(new Long(100), c3.getStartValue(0, 0)); 
     assertEquals(new Long(220), c3.getStartValue(0, 1)); 
     assertTrue(c3.getStartValue(1, 0) == null); 
     assertEquals(new Long(2220), c3.getStartValue(1, 1)); 
 }
public void test800324760() { 
     TaskSeries s1 = new TaskSeries("S1"); 
     s1.add(new Task("Task 1", new SimpleTimePeriod(new Date(), new Date()))); 
     s1.add(new Task("Task 2", new SimpleTimePeriod(new Date(), new Date()))); 
     s1.add(new Task("Task 3", new SimpleTimePeriod(new Date(), new Date()))); 
     TaskSeriesCollection tsc = new TaskSeriesCollection(); 
     tsc.add(s1); 
     try { 
         tsc.getStartValue(0, 3); 
         assertTrue(false); 
     } catch (IndexOutOfBoundsException e) { 
     } 
     try { 
         tsc.getEndValue(0, 3); 
         assertTrue(false); 
     } catch (IndexOutOfBoundsException e) { 
     } 
     try { 
         tsc.getSubIntervalCount(0, 3); 
         assertTrue(false); 
     } catch (IndexOutOfBoundsException e) { 
     } 
 }
public void testCloning767() { 
     TaskSeriesCollection c1 = new TaskSeriesCollection(); 
     TaskSeriesCollection c2 = null; 
     try { 
         c2 = (TaskSeriesCollection) c1.clone(); 
     } catch (CloneNotSupportedException e) { 
         System.err.println("Failed to clone."); 
     } 
     assertTrue(c1 != c2); 
     assertTrue(c1.getClass() == c2.getClass()); 
     assertTrue(c1.equals(c2)); 
     TaskSeries s1 = new TaskSeries("S1"); 
     s1.add(new Task("Task 1", new Date(1L), new Date(2L))); 
     c1.add(s1); 
     assertFalse(c1.equals(c2)); 
     TaskSeries s2 = new TaskSeries("S2"); 
     s2.add(new Task("Task 1", new Date(1L), new Date(2L))); 
     c2.add(s2); 
     assertTrue(c1.equals(c2)); 
 }
public void testEquals1104() { 
     Task t1 = new Task("T", new Date(1), new Date(2)); 
     Task t2 = new Task("T", new Date(1), new Date(2)); 
     assertTrue(t1.equals(t2)); 
     assertTrue(t2.equals(t1)); 
     t1.setDescription("X"); 
     assertFalse(t1.equals(t2)); 
     t2.setDescription("X"); 
     assertTrue(t1.equals(t2)); 
     t1.setDuration(new SimpleTimePeriod(new Date(2), new Date(3))); 
     assertFalse(t1.equals(t2)); 
     t2.setDuration(new SimpleTimePeriod(new Date(2), new Date(3))); 
     assertTrue(t1.equals(t2)); 
     t1.setPercentComplete(0.5); 
     assertFalse(t1.equals(t2)); 
     t2.setPercentComplete(0.5); 
     assertTrue(t1.equals(t2)); 
     t1.addSubtask(new Task("T", new Date(22), new Date(33))); 
     assertFalse(t1.equals(t2)); 
     t2.addSubtask(new Task("T", new Date(22), new Date(33))); 
     assertTrue(t1.equals(t2)); 
 }
public void testGetSubTaskCount1105() { 
     Task t1 = new Task("T", new Date(100), new Date(200)); 
     assertEquals(0, t1.getSubtaskCount()); 
     t1.addSubtask(new Task("S1", new Date(100), new Date(110))); 
     assertEquals(1, t1.getSubtaskCount()); 
     Task s2 = new Task("S2", new Date(111), new Date(120)); 
     t1.addSubtask(s2); 
     assertEquals(2, t1.getSubtaskCount()); 
     t1.addSubtask(new Task("S3", new Date(121), new Date(130))); 
     assertEquals(3, t1.getSubtaskCount()); 
     t1.removeSubtask(s2); 
     assertEquals(2, t1.getSubtaskCount()); 
 }
public void testEquals1114() { 
     TaskSeries s1 = new TaskSeries("S"); 
     s1.add(new Task("T1", new Date(1), new Date(2))); 
     s1.add(new Task("T2", new Date(11), new Date(22))); 
     TaskSeries s2 = new TaskSeries("S"); 
     s2.add(new Task("T1", new Date(1), new Date(2))); 
     s2.add(new Task("T2", new Date(11), new Date(22))); 
     assertTrue(s1.equals(s2)); 
     assertTrue(s2.equals(s1)); 
     s1.add(new Task("T3", new Date(22), new Date(33))); 
     assertFalse(s1.equals(s2)); 
     s2.add(new Task("T3", new Date(22), new Date(33))); 
     assertTrue(s2.equals(s1)); 
 }
public void test7885971116() { 
     TaskSeries s1 = new TaskSeries("S1"); 
     s1.add(new Task("T1", new Date(1), new Date(2))); 
     s1.add(new Task("T2", new Date(11), new Date(22))); 
     assertEquals(3, s1.getItemCount()); 
     s1.removeAll(); 
     assertEquals(0, s1.getItemCount()); 
 }
    

    /**
     * Some tests for the getSeriesKey() method.
     */
    

    /**
     * A test for the getRowCount() method.
     */
    

    /**
     * Some tests for the getRowKey() method.
     */
    

    /**
     * Some tests for the getRowIndex() method.
     */
    

    /**
     * Some tests for the getValue() method.
     */
    

    /**
     * Some tests for the getStartValue() method.
     */
    

    /**
     * Some tests for the getStartValue() method for sub-intervals.
     */
    

    /**
     * A check for a null task duration.
     */
    

    /**
     * Some tests for the getEndValue() method.
     */
    

    /**
     * Some tests for the getEndValue() method for sub-intervals.
     */
    

    /**
     * A check for a null task duration.
     */
    

    /**
     * Some tests for the getPercentComplete() method.
     */
    

    /**
     * A test for the getColumnCount() method.
     */
    

    /**
     * Some tests for the getColumnKey() method.
     */
    

    /**
     * Some tests for the getColumnIndex() method.
     */
    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * A test for bug report 697153.
     */
    

    /**
     * A test for bug report 800324.
     */
    

    /**
     * Some tests for the bug report 1099331.  We create a TaskSeriesCollection
     * with two series - the first series has two tasks, but the second has
     * only one.  The key is to ensure that the methods in TaskSeriesCollection
     * translate the index values to key values *before* accessing the tasks
     * in the series.
     */
    

    /**
     * Some basic tests for the getSeries() methods.
     */
    

    /**
     * Some basic checks for the remove() method.
     */
    

}
