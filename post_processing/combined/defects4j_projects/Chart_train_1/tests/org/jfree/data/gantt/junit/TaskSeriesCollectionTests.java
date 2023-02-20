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

public void test69715333() { 
     TaskSeries s1 = new TaskSeries("S1"); 
     s1.add(new Task("Task 1", new SimpleTimePeriod(new Date(), new Date()))); 
     s1.add(new Task("Task 2", new SimpleTimePeriod(new Date(), new Date()))); 
     s1.add(new Task("Task 3", new SimpleTimePeriod(new Date(), new Date()))); 
     TaskSeries s2 = new TaskSeries("S2"); 
     s2.add(new Task("Task 2", new SimpleTimePeriod(new Date(), new Date()))); 
     s2.add(new Task("Task 3", new SimpleTimePeriod(new Date(), new Date()))); 
     s2.add(new Task("Task 4", new SimpleTimePeriod(new Date(), new Date()))); 
     TaskSeriesCollection tsc = new TaskSeriesCollection(); 
     tsc.add(s1); 
     tsc.add(s2); 
     s1.removeAll(); 
     int taskCount = tsc.getColumnCount(); 
     assertEquals(3, taskCount); 
 } 


public void testSerialization404() { 
     TaskSeries s1 = new TaskSeries("S"); 
     s1.add(new Task("T1", new Date(1), new Date(2))); 
     s1.add(new Task("T2", new Date(11), new Date(22))); 
     TaskSeries s2 = new TaskSeries("S"); 
     s2.add(new Task("T1", new Date(1), new Date(2))); 
     s2.add(new Task("T2", new Date(11), new Date(22))); 
     TaskSeriesCollection c1 = new TaskSeriesCollection(); 
     c1.add(s1); 
     c1.add(s2); 
     TaskSeriesCollection c2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(c1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         c2 = (TaskSeriesCollection) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         System.out.println(e.toString()); 
     } 
     assertEquals(c1, c2); 
 } 


public void testGetSeries405() { 
     TaskSeries s1 = new TaskSeries("S1"); 
     TaskSeries s2 = new TaskSeries("S2"); 
     TaskSeriesCollection c = new TaskSeriesCollection(); 
     c.add(s1); 
     assertEquals(c.getSeries(0), s1); 
     assertEquals(c.getSeries("S1"), s1); 
     assertEquals(c.getSeries("XX"), null); 
     c.add(s2); 
     assertEquals(c.getSeries(1), s2); 
     assertEquals(c.getSeries("S2"), s2); 
     boolean pass = false; 
     try { 
         c.getSeries(null); 
     } catch (NullPointerException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void testGetStartValue2406() { 
     TaskSeriesCollection c = createCollection2(); 
     assertEquals(new Long(10L), c.getStartValue("S1", "Task 1", 0)); 
     assertEquals(new Long(16L), c.getStartValue("S1", "Task 1", 1)); 
     assertEquals(new Long(30L), c.getStartValue("S1", "Task 2", 0)); 
     assertEquals(new Long(36L), c.getStartValue("S1", "Task 2", 1)); 
     assertEquals(new Long(50L), c.getStartValue("S2", "Task 3", 0)); 
     assertEquals(new Long(56L), c.getStartValue("S2", "Task 3", 1)); 
     assertEquals(new Long(10L), c.getStartValue(0, 0, 0)); 
     assertEquals(new Long(16L), c.getStartValue(0, 0, 1)); 
     assertEquals(new Long(30L), c.getStartValue(0, 1, 0)); 
     assertEquals(new Long(36L), c.getStartValue(0, 1, 1)); 
     assertEquals(new Long(50L), c.getStartValue(1, 2, 0)); 
     assertEquals(new Long(56L), c.getStartValue(1, 2, 1)); 
     TaskSeriesCollection c3 = createCollection3(); 
     assertEquals(new Long(11), c3.getStartValue(0, 0, 0)); 
     assertEquals(new Long(22), c3.getStartValue(0, 1, 0)); 
     assertEquals(new Long(33), c3.getStartValue(0, 1, 1)); 
     assertTrue(c3.getStartValue(1, 0, 0) == null); 
     assertEquals(new Long(44), c3.getStartValue(1, 1, 0)); 
     assertEquals(new Long(55), c3.getStartValue(1, 1, 1)); 
     assertEquals(new Long(66), c3.getStartValue(1, 1, 2)); 
 } 


public void testRemove407() { 
     TaskSeriesCollection c = new TaskSeriesCollection(); 
     TaskSeries s1 = new TaskSeries("S1"); 
     c.add(s1); 
     assertEquals("S1", c.getSeries(0).getKey()); 
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


public void testGetValue408() { 
     TaskSeriesCollection c = createCollection1(); 
     assertEquals(new Long(1L), c.getValue("S1", "Task 1")); 
     assertEquals(new Long(3L), c.getValue("S1", "Task 2")); 
     assertEquals(new Long(5L), c.getValue("S2", "Task 3")); 
     assertEquals(new Long(1L), c.getValue(0, 0)); 
     assertEquals(new Long(3L), c.getValue(0, 1)); 
     assertEquals(null, c.getValue(0, 2)); 
     assertEquals(null, c.getValue(1, 0)); 
     assertEquals(null, c.getValue(1, 1)); 
     assertEquals(new Long(5L), c.getValue(1, 2)); 
 } 


public void testGetEndValue409() { 
     TaskSeriesCollection c = createCollection1(); 
     assertEquals(new Long(2L), c.getEndValue("S1", "Task 1")); 
     assertEquals(new Long(4L), c.getEndValue("S1", "Task 2")); 
     assertEquals(new Long(6L), c.getEndValue("S2", "Task 3")); 
     assertEquals(new Long(2L), c.getEndValue(0, 0)); 
     assertEquals(new Long(4L), c.getEndValue(0, 1)); 
     assertEquals(null, c.getEndValue(0, 2)); 
     assertEquals(null, c.getEndValue(1, 0)); 
     assertEquals(null, c.getEndValue(1, 1)); 
     assertEquals(new Long(6L), c.getEndValue(1, 2)); 
     TaskSeriesCollection c3 = createCollection3(); 
     assertEquals(new Long(200), c3.getEndValue(0, 0)); 
     assertEquals(new Long(350), c3.getEndValue(0, 1)); 
     assertTrue(c3.getEndValue(1, 0) == null); 
     assertEquals(new Long(3350), c3.getEndValue(1, 1)); 
 } 


public void testGetEndValue2410() { 
     TaskSeriesCollection c = createCollection2(); 
     assertEquals(new Long(15L), c.getEndValue("S1", "Task 1", 0)); 
     assertEquals(new Long(20L), c.getEndValue("S1", "Task 1", 1)); 
     assertEquals(new Long(35L), c.getEndValue("S1", "Task 2", 0)); 
     assertEquals(new Long(40L), c.getEndValue("S1", "Task 2", 1)); 
     assertEquals(new Long(55L), c.getEndValue("S2", "Task 3", 0)); 
     assertEquals(new Long(60L), c.getEndValue("S2", "Task 3", 1)); 
     assertEquals(new Long(15L), c.getEndValue(0, 0, 0)); 
     assertEquals(new Long(20L), c.getEndValue(0, 0, 1)); 
     assertEquals(new Long(35L), c.getEndValue(0, 1, 0)); 
     assertEquals(new Long(40L), c.getEndValue(0, 1, 1)); 
     assertEquals(new Long(55L), c.getEndValue(1, 2, 0)); 
     assertEquals(new Long(60L), c.getEndValue(1, 2, 1)); 
     TaskSeriesCollection c3 = createCollection3(); 
     assertEquals(new Long(111), c3.getEndValue(0, 0, 0)); 
     assertEquals(new Long(222), c3.getEndValue(0, 1, 0)); 
     assertEquals(new Long(333), c3.getEndValue(0, 1, 1)); 
     assertTrue(c3.getEndValue(1, 0, 0) == null); 
     assertEquals(new Long(444), c3.getEndValue(1, 1, 0)); 
     assertEquals(new Long(555), c3.getEndValue(1, 1, 1)); 
     assertEquals(new Long(666), c3.getEndValue(1, 1, 2)); 
 } 


public void testCloning412() { 
     TaskSeries s1 = new TaskSeries("S"); 
     s1.add(new Task("T1", new Date(1), new Date(2))); 
     s1.add(new Task("T2", new Date(11), new Date(22))); 
     TaskSeries s2 = new TaskSeries("S"); 
     s2.add(new Task("T1", new Date(1), new Date(2))); 
     s2.add(new Task("T2", new Date(11), new Date(22))); 
     TaskSeriesCollection c1 = new TaskSeriesCollection(); 
     c1.add(s1); 
     c1.add(s2); 
     TaskSeriesCollection c2 = null; 
     try { 
         c2 = (TaskSeriesCollection) c1.clone(); 
     } catch (CloneNotSupportedException e) { 
         System.err.println("Failed to clone."); 
     } 
     assertTrue(c1 != c2); 
     assertTrue(c1.getClass() == c2.getClass()); 
     assertTrue(c1.equals(c2)); 
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
