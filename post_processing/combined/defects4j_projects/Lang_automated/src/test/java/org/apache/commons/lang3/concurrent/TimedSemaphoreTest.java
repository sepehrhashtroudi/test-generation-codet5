/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.concurrent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * Test class for TimedSemaphore.
 *
 * @version $Id$
 */
public class TimedSemaphoreTest {
    /** Constant for the time period. */
    private static final long PERIOD = 500;

    /** Constant for the time unit. */
    private static final TimeUnit UNIT = TimeUnit.MILLISECONDS;

    /** Constant for the default limit. */
    private static final int LIMIT = 10;

    /**
     * Tests creating a new instance.
     */
@Test
public void testStartTimer30() throws InterruptedException { 
     final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(PERIOD, UNIT, LIMIT); 
     final ScheduledFuture<?> future = semaphore.startTimer(); 
     assertNotNull("No future returned", future); 
     Thread.sleep(PERIOD); 
     final int trials = 10; 
     int count = 0; 
     do { 
         Thread.sleep(PERIOD); 
         if (count++ > trials) { 
             fail("endOfPeriod() not called!"); 
         } 
     } while (semaphore.getPeriodEnds() <= 0); 
     semaphore.shutdown(); 
 }
@Test
public void testGetAverageCallsPerPeriod222() throws InterruptedException { 
     final ScheduledExecutorService service = EasyMock.createMock(ScheduledExecutorService.class); 
     final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class); 
     prepareStartTimer(service, future); 
     EasyMock.replay(service, future); 
     final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT, LIMIT); 
     for (int i = 0; i < LIMIT; i++) { 
         assertEquals("Wrong averageCallsPerPeriod", LIMIT - i, semaphore.getAverageCallsPerPeriod()); 
         semaphore.acquire(); 
     } 
     semaphore.endOfPeriod(); 
     assertEquals("WrongAverageCallsPerPeriod", LIMIT, semaphore.getAverageCallsPerPeriod()); 
     EasyMock.verify(service, future); 
 }
@Test
public void testGetLastAcquiresPerPeriod223() throws InterruptedException { 
     final ScheduledExecutorService service = EasyMock.createMock(ScheduledExecutorService.class); 
     final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class); 
     prepareStartTimer(service, future); 
     EasyMock.replay(service, future); 
     final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT, LIMIT); 
     for (int i = 0; i < LIMIT; i++) { 
         assertEquals("Wrong lastAcquiresPerPeriod", LIMIT - i, semaphore.getLastAcquiresPerPeriod()); 
         semaphore.acquire(); 
     } 
     semaphore.endOfPeriod(); 
     assertEquals("Wrong lastAcquiresPerPeriod", LIMIT, semaphore.getLastAcquiresPerPeriod()); 
     EasyMock.verify(service, future); 
 }
@Test
public void testGetAverageCallsPerPeriod224() throws InterruptedException { 
     final ScheduledExecutorService service = EasyMock.createMock(ScheduledExecutorService.class); 
     final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class); 
     prepareStartTimer(service, future); 
     EasyMock.replay(service, future); 
     final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT, LIMIT); 
     for (int i = 0; i < LIMIT; i++) { 
         assertEquals("Wrong averageCallsPerPeriod", LIMIT - i, semaphore.getAverageCallsPerPeriod()); 
         semaphore.acquire(); 
     } 
     semaphore.endOfPeriod(); 
     assertEquals("WrongAverageCallsPerPeriod", 0, semaphore.getAverageCallsPerPeriod()); 
     EasyMock.verify(service, future); 
 }
    

    /**
     * Tries to create an instance with a negative period. This should cause an
     * exception.
     */
    

    /**
     * Tests whether a default executor service is created if no service is
     * provided.
     */
    

    /**
     * Tests starting the timer.
     */
    

    /**
     * Tests the shutdown() method if the executor belongs to the semaphore. In
     * this case it has to be shut down.
     */
    

    /**
     * Tests the shutdown() method for a shared executor service before a task
     * was started. This should do pretty much nothing.
     */
    

    /**
     * Prepares an executor service mock to expect the start of the timer.
     *
     * @param service the mock
     * @param future the future
     */
    private void prepareStartTimer(final ScheduledExecutorService service,
            final ScheduledFuture<?> future) {
        service.scheduleAtFixedRate((Runnable) EasyMock.anyObject(), EasyMock
                .eq(PERIOD), EasyMock.eq(PERIOD), EasyMock.eq(UNIT));
        EasyMock.expectLastCall().andReturn(future);
    }

    /**
     * Tests the shutdown() method for a shared executor after the task was
     * started. In this case the task must be canceled.
     */
    

    /**
     * Tests multiple invocations of the shutdown() method.
     */
    

    /**
     * Tests the acquire() method if a limit is set.
     */
    

    /**
     * Tests the acquire() method if more threads are involved than the limit.
     * This method starts a number of threads that all invoke the semaphore. The
     * semaphore's limit is set to 1, so in each period only a single thread can
     * acquire the semaphore.
     */
    

    /**
     * Tests the acquire() method if no limit is set. A test thread is started
     * that calls the semaphore a large number of times. Even if the semaphore's
     * period does not end, the thread should never block.
     */
    

    /**
     * Tries to call acquire() after shutdown(). This should cause an exception.
     */
    

    /**
     * Tests a bigger number of invocations that span multiple periods. The
     * period is set to a very short time. A background thread calls the
     * semaphore a large number of times. While it runs at last one end of a
     * period should be reached.
     */
    

    /**
     * Tests the methods for statistics.
     */
    

    /**
     * Tests whether the available non-blocking calls can be queried.
     */
    

    /**
     * A specialized implementation of {@code TimedSemaphore} that is easier to
     * test.
     */
    private static class TimedSemaphoreTestImpl extends TimedSemaphore {
        /** A mock scheduled future. */
        ScheduledFuture<?> schedFuture;

        /** A latch for synchronizing with the main thread. */
        volatile CountDownLatch latch;

        /** Counter for the endOfPeriod() invocations. */
        private int periodEnds;

        public TimedSemaphoreTestImpl(final long timePeriod, final TimeUnit timeUnit,
                final int limit) {
            super(timePeriod, timeUnit, limit);
        }

        public TimedSemaphoreTestImpl(final ScheduledExecutorService service,
                final long timePeriod, final TimeUnit timeUnit, final int limit) {
            super(service, timePeriod, timeUnit, limit);
        }

        /**
         * Returns the number of invocations of the endOfPeriod() method.
         *
         * @return the endOfPeriod() invocations
         */
        public int getPeriodEnds() {
            synchronized (this) {
                return periodEnds;
            }
        }

        /**
         * Invokes the latch if one is set.
         */
        @Override
        public synchronized void acquire() throws InterruptedException {
            super.acquire();
            if (latch != null) {
                latch.countDown();
            }
        }

        /**
         * Counts the number of invocations.
         */
        @Override
        protected synchronized void endOfPeriod() {
            super.endOfPeriod();
            periodEnds++;
        }

        /**
         * Either returns the mock future or calls the super method.
         */
        @Override
        protected ScheduledFuture<?> startTimer() {
            return schedFuture != null ? schedFuture : super.startTimer();
        }
    }

    /**
     * A test thread class that will be used by tests for triggering the
     * semaphore. The thread calls the semaphore a configurable number of times.
     * When this is done, it can notify the main thread.
     */
    private static class SemaphoreThread extends Thread {
        /** The semaphore. */
        private final TimedSemaphore semaphore;

        /** A latch for communication with the main thread. */
        private final CountDownLatch latch;

        /** The number of acquire() calls. */
        private final int count;

        /** The number of invocations of the latch. */
        private final int latchCount;

        public SemaphoreThread(final TimedSemaphore b, final CountDownLatch l, final int c, final int lc) {
            semaphore = b;
            latch = l;
            count = c;
            latchCount = lc;
        }

        /**
         * Calls acquire() on the semaphore for the specified number of times.
         * Optionally the latch will also be triggered to synchronize with the
         * main test thread.
         */
        @Override
        public void run() {
            try {
                for (int i = 0; i < count; i++) {
                    semaphore.acquire();

                    if (i < latchCount) {
                        latch.countDown();
                    }
                }
            } catch (final InterruptedException iex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
