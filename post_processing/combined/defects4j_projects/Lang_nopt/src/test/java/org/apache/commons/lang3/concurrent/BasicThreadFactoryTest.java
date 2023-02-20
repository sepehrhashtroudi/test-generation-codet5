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
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.ThreadFactory;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@code BasicThreadFactory}.
 *
 * @version $Id$
 */
public class BasicThreadFactoryTest {
    /** Constant for the test naming pattern. */
    private static final String PATTERN = "testThread-%d";

    /** The builder for creating a thread factory. */
    private BasicThreadFactory.Builder builder;

    @Before
    public void setUp() throws Exception {
        builder = new BasicThreadFactory.Builder();
    }

    /**
     * Tests the default options of a thread factory.
     *
     * @param factory the factory to be checked
     */
    private void checkFactoryDefaults(final BasicThreadFactory factory) {
        assertNull("Got a naming pattern", factory.getNamingPattern());
        assertNull("Got an exception handler", factory
                .getUncaughtExceptionHandler());
        assertNull("Got a priority", factory.getPriority());
        assertNull("Got a daemon flag", factory.getDaemonFlag());
        assertNotNull("No wrapped factory", factory.getWrappedFactory());
    }

    /**
     * Tests the default values used by the builder.
     */
    

    /**
     * Tries to set a null naming pattern.
     */
    

    /**
     * Tries to set a null wrapped factory.
     */
    

    /**
     * Tries to set a null exception handler.
     */
    

    /**
     * Tests the reset() method of the builder.
     */
    

    /**
     * Tests whether reset() is automatically called after build().
     */
    

    /**
     * Tests whether the naming pattern is applied to new threads.
     */
    

    /**
     * Tests whether the thread name is not modified if no naming pattern is
     * set.
     */
    

    /**
     * Helper method for testing whether the daemon flag is taken into account.
     *
     * @param flag the value of the flag
     */
    private void checkDaemonFlag(final boolean flag) {
        final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        final Runnable r = EasyMock.createMock(Runnable.class);
        final Thread t = new Thread();
        EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        EasyMock.replay(wrapped, r);
        final BasicThreadFactory factory = builder.wrappedFactory(wrapped).daemon(
                flag).build();
        assertSame("Wrong thread", t, factory.newThread(r));
        assertTrue("Wrong daemon flag", flag == t.isDaemon());
        EasyMock.verify(wrapped, r);
    }

    /**
     * Tests whether daemon threads can be created.
     */
    

    /**
     * Tests whether the daemon status of new threads can be turned off.
     */
    

    /**
     * Tests whether the daemon flag is not touched on newly created threads if
     * it is not specified.
     */
    

    /**
     * Tests whether the priority is set on newly created threads.
     */
    

    /**
     * Tests whether the original priority is not changed if no priority is
     * specified.
     */
    

    /**
     * Tests whether the exception handler is set if one is provided.
     */
    

    /**
     * Tests whether the original exception hander is not touched if none is
     * specified.
     */
    
}
