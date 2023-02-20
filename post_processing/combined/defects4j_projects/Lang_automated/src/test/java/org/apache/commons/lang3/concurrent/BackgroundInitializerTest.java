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

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class BackgroundInitializerTest {
    /**
     * Helper method for checking whether the initialize() method was correctly
     * called. start() must already have been invoked.
     *
     * @param init the initializer to test
     */
    private void checkInitialize(final BackgroundInitializerTestImpl init) {
        try {
            final Integer result = init.get();
            assertEquals("Wrong result", 1, result.intValue());
            assertEquals("Wrong number of invocations", 1, init.initializeCalls);
            assertNotNull("No future", init.getFuture());
        } catch (final ConcurrentException cex) {
            fail("Unexpected exception: " + cex);
        }
    }

    /**
     * Tests whether initialize() is invoked.
     */
    

    /**
     * Tries to obtain the executor before start(). It should not have been
     * initialized yet.
     */
    

    /**
     * Tests whether an external executor is correctly detected.
     */
    

    /**
     * Tests getActiveExecutor() for a temporary executor.
     */
    

    /**
     * Tests the execution of the background task if a temporary executor has to
     * be created.
     */
    

    /**
     * Tests whether an external executor can be set using the
     * setExternalExecutor() method.
     */
    

    /**
     * Tests that setting an executor after start() causes an exception.
     */
    

    /**
     * Tests invoking start() multiple times. Only the first invocation should
     * have an effect.
     */
    

    /**
     * Tests calling get() before start(). This should cause an exception.
     */
    

    /**
     * Tests the get() method if background processing causes a runtime
     * exception.
     */
    

    /**
     * Tests the get() method if background processing causes a checked
     * exception.
     */
    

    /**
     * Tests the get() method if waiting for the initialization is interrupted.
     */
    

    /**
     * Tests isStarted() before start() was called.
     */
    

    /**
     * Tests isStarted() after start().
     */
    

    /**
     * Tests isStarted() after the background task has finished.
     */
    

    /**
     * A concrete implementation of BackgroundInitializer. It also overloads
     * some methods that simplify testing.
     */
    private static class BackgroundInitializerTestImpl extends
            BackgroundInitializer<Integer> {
        /** An exception to be thrown by initialize(). */
        Exception ex;

        /** A flag whether the background task should sleep a while. */
        boolean shouldSleep;

        /** The number of invocations of initialize(). */
        volatile int initializeCalls;

        public BackgroundInitializerTestImpl() {
            super();
        }

        public BackgroundInitializerTestImpl(final ExecutorService exec) {
            super(exec);
        }

        /**
         * Records this invocation. Optionally throws an exception or sleeps a
         * while.
         */
        @Override
        protected Integer initialize() throws Exception {
            if (ex != null) {
                throw ex;
            }
            if (shouldSleep) {
                Thread.sleep(60000L);
            }
            return Integer.valueOf(++initializeCalls);
        }
    }
}
