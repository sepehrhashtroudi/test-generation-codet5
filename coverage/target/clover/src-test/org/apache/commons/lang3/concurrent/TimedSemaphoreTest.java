/* $$ This file has been instrumented by Clover 4.1.2#20161011084623935 $$ *//*
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
public class TimedSemaphoreTest {static class __CLR4_1_2qf7qf7l3lqxuli{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,34454,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
    public void testInit() {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ai0cvrqf7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testInit",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34243,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ai0cvrqf7(){try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34243);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34244);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34245);EasyMock.replay(service);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34246);final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT,
                LIMIT);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34247);EasyMock.verify(service);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34248);assertEquals("Wrong service", service, semaphore.getExecutorService());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34249);assertEquals("Wrong period", PERIOD, semaphore.getPeriod());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34250);assertEquals("Wrong unit", UNIT, semaphore.getUnit());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34251);assertEquals("Statistic available", 0, semaphore
                .getLastAcquiresPerPeriod());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34252);assertEquals("Average available", 0.0, semaphore
                .getAverageCallsPerPeriod(), .05);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34253);assertFalse("Already shutdown", semaphore.isShutdown());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34254);assertEquals("Wrong limit", LIMIT, semaphore.getLimit());
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tries to create an instance with a negative period. This should cause an
     * exception.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testInitInvalidPeriod() {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ujj43qfj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,105,116,73,110,118,97,108,105,100,80,101,114,105,111,100,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testInitInvalidPeriod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34255,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ujj43qfj(){try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34255);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34256);new TimedSemaphore(0L, UNIT, LIMIT);
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tests whether a default executor service is created if no service is
     * provided.
     */
    @Test
    public void testInitDefaultService() {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22ntkgzqfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testInitDefaultService",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34257,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22ntkgzqfl(){try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34257);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34258);final TimedSemaphore semaphore = new TimedSemaphore(PERIOD, UNIT, LIMIT);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34259);final ScheduledThreadPoolExecutor exec = (ScheduledThreadPoolExecutor) semaphore
                .getExecutorService();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34260);assertFalse("Wrong periodic task policy", exec
                .getContinueExistingPeriodicTasksAfterShutdownPolicy());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34261);assertFalse("Wrong delayed task policy", exec
                .getExecuteExistingDelayedTasksAfterShutdownPolicy());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34262);assertFalse("Already shutdown", exec.isShutdown());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34263);semaphore.shutdown();
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tests starting the timer.
     */
    @Test
    public void testStartTimer() throws InterruptedException {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oedyqsqfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testStartTimer",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34264,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oedyqsqfs() throws InterruptedException{try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34264);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34265);final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(PERIOD,
                UNIT, LIMIT);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34266);final ScheduledFuture<?> future = semaphore.startTimer();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34267);assertNotNull("No future returned", future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34268);Thread.sleep(PERIOD);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34269);final int trials = 10;
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34270);int count = 0;
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34271);do {{
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34272);Thread.sleep(PERIOD);
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34273);if ((((count++ > trials)&&(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34274)!=0|true))||(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34275)==0&false))) {{
                __CLR4_1_2qf7qf7l3lqxuli.R.inc(34276);fail("endOfPeriod() not called!");
            }
        }} }while ((((semaphore.getPeriodEnds() <= 0)&&(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34277)!=0|true))||(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34278)==0&false)));
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34279);semaphore.shutdown();
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tests the shutdown() method if the executor belongs to the semaphore. In
     * this case it has to be shut down.
     */
    @Test
    public void testShutdownOwnExecutor() {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27w2xzcqg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownOwnExecutor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34280,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27w2xzcqg8(){try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34280);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34281);final TimedSemaphore semaphore = new TimedSemaphore(PERIOD, UNIT, LIMIT);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34282);semaphore.shutdown();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34283);assertTrue("Not shutdown", semaphore.isShutdown());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34284);assertTrue("Executor not shutdown", semaphore.getExecutorService()
                .isShutdown());
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tests the shutdown() method for a shared executor service before a task
     * was started. This should do pretty much nothing.
     */
    @Test
    public void testShutdownSharedExecutorNoTask() {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i9dbt9qgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownSharedExecutorNoTask",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34285,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i9dbt9qgd(){try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34285);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34286);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34287);EasyMock.replay(service);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34288);final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT,
                LIMIT);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34289);semaphore.shutdown();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34290);assertTrue("Not shutdown", semaphore.isShutdown());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34291);EasyMock.verify(service);
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Prepares an executor service mock to expect the start of the timer.
     *
     * @param service the mock
     * @param future the future
     */
    private void prepareStartTimer(final ScheduledExecutorService service,
            final ScheduledFuture<?> future) {try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34292);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34293);service.scheduleAtFixedRate((Runnable) EasyMock.anyObject(), EasyMock
                .eq(PERIOD), EasyMock.eq(PERIOD), EasyMock.eq(UNIT));
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34294);EasyMock.expectLastCall().andReturn(future);
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tests the shutdown() method for a shared executor after the task was
     * started. In this case the task must be canceled.
     */
    @Test
    public void testShutdownSharedExecutorTask() throws InterruptedException {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kf1jv0qgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownSharedExecutorTask",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34295,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kf1jv0qgn() throws InterruptedException{try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34295);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34296);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34297);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34298);prepareStartTimer(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34299);EasyMock.expect(Boolean.valueOf(future.cancel(false))).andReturn(Boolean.TRUE);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34300);EasyMock.replay(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34301);final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(service,
                PERIOD, UNIT, LIMIT);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34302);semaphore.acquire();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34303);semaphore.shutdown();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34304);assertTrue("Not shutdown", semaphore.isShutdown());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34305);EasyMock.verify(service, future);
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tests multiple invocations of the shutdown() method.
     */
    @Test
    public void testShutdownMultipleTimes() throws InterruptedException {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ikv823qgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testShutdownMultipleTimes",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34306,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ikv823qgy() throws InterruptedException{try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34306);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34307);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34308);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34309);prepareStartTimer(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34310);EasyMock.expect(Boolean.valueOf(future.cancel(false))).andReturn(Boolean.TRUE);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34311);EasyMock.replay(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34312);final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(service,
                PERIOD, UNIT, LIMIT);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34313);semaphore.acquire();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34314);for (int i = 0; (((i < 10)&&(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34315)!=0|true))||(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34316)==0&false)); i++) {{
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34317);semaphore.shutdown();
        }
        }__CLR4_1_2qf7qf7l3lqxuli.R.inc(34318);EasyMock.verify(service, future);
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tests the acquire() method if a limit is set.
     */
    @Test
    public void testAcquireLimit() throws InterruptedException {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k2jmhqqhb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireLimit",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34319,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k2jmhqqhb() throws InterruptedException{try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34319);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34320);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34321);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34322);prepareStartTimer(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34323);EasyMock.replay(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34324);final int count = 10;
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34325);final CountDownLatch latch = new CountDownLatch(count - 1);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34326);final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT, 1);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34327);final SemaphoreThread t = new SemaphoreThread(semaphore, latch, count,
                count - 1);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34328);semaphore.setLimit(count - 1);

        // start a thread that calls the semaphore count times
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34329);t.start();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34330);latch.await();
        // now the semaphore's limit should be reached and the thread blocked
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34331);assertEquals("Wrong semaphore count", count - 1, semaphore
                .getAcquireCount());

        // this wakes up the thread, it should call the semaphore once more
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34332);semaphore.endOfPeriod();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34333);t.join();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34334);assertEquals("Wrong semaphore count (2)", 1, semaphore
                .getAcquireCount());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34335);assertEquals("Wrong acquire() count", count - 1, semaphore
                .getLastAcquiresPerPeriod());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34336);EasyMock.verify(service, future);
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tests the acquire() method if more threads are involved than the limit.
     * This method starts a number of threads that all invoke the semaphore. The
     * semaphore's limit is set to 1, so in each period only a single thread can
     * acquire the semaphore.
     */
    @Test
    public void testAcquireMultipleThreads() throws InterruptedException {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22tzp0kqht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireMultipleThreads",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34337,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22tzp0kqht() throws InterruptedException{try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34337);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34338);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34339);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34340);prepareStartTimer(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34341);EasyMock.replay(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34342);final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(service,
                PERIOD, UNIT, 1);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34343);semaphore.latch = new CountDownLatch(1);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34344);final int count = 10;
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34345);final SemaphoreThread[] threads = new SemaphoreThread[count];
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34346);for (int i = 0; (((i < count)&&(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34347)!=0|true))||(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34348)==0&false)); i++) {{
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34349);threads[i] = new SemaphoreThread(semaphore, null, 1, 0);
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34350);threads[i].start();
        }
        }__CLR4_1_2qf7qf7l3lqxuli.R.inc(34351);for (int i = 0; (((i < count)&&(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34352)!=0|true))||(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34353)==0&false)); i++) {{
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34354);semaphore.latch.await();
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34355);assertEquals("Wrong count", 1, semaphore.getAcquireCount());
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34356);semaphore.latch = new CountDownLatch(1);
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34357);semaphore.endOfPeriod();
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34358);assertEquals("Wrong acquire count", 1, semaphore
                    .getLastAcquiresPerPeriod());
        }
        }__CLR4_1_2qf7qf7l3lqxuli.R.inc(34359);for (int i = 0; (((i < count)&&(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34360)!=0|true))||(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34361)==0&false)); i++) {{
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34362);threads[i].join();
        }
        }__CLR4_1_2qf7qf7l3lqxuli.R.inc(34363);EasyMock.verify(service, future);
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tests the acquire() method if no limit is set. A test thread is started
     * that calls the semaphore a large number of times. Even if the semaphore's
     * period does not end, the thread should never block.
     */
    @Test
    public void testAcquireNoLimit() throws InterruptedException {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ly32wtqik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireNoLimit",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34364,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ly32wtqik() throws InterruptedException{try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34364);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34365);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34366);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34367);prepareStartTimer(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34368);EasyMock.replay(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34369);final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(service,
                PERIOD, UNIT, TimedSemaphore.NO_LIMIT);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34370);final int count = 1000;
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34371);final CountDownLatch latch = new CountDownLatch(count);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34372);final SemaphoreThread t = new SemaphoreThread(semaphore, latch, count, count);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34373);t.start();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34374);latch.await();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34375);EasyMock.verify(service, future);
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tries to call acquire() after shutdown(). This should cause an exception.
     */
    @Test(expected = IllegalStateException.class)
    public void testPassAfterShutdown() throws InterruptedException {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wxevreqiw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,97,115,115,65,102,116,101,114,83,104,117,116,100,111,119,110,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testPassAfterShutdown",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34376,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wxevreqiw() throws InterruptedException{try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34376);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34377);final TimedSemaphore semaphore = new TimedSemaphore(PERIOD, UNIT, LIMIT);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34378);semaphore.shutdown();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34379);semaphore.acquire();
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tests a bigger number of invocations that span multiple periods. The
     * period is set to a very short time. A background thread calls the
     * semaphore a large number of times. While it runs at last one end of a
     * period should be reached.
     */
    @Test
    public void testAcquireMultiplePeriods() throws InterruptedException {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rpnc85qj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testAcquireMultiplePeriods",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34380,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rpnc85qj0() throws InterruptedException{try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34380);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34381);final int count = 1000;
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34382);final TimedSemaphoreTestImpl semaphore = new TimedSemaphoreTestImpl(
                PERIOD / 10, TimeUnit.MILLISECONDS, 1);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34383);semaphore.setLimit(count / 4);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34384);final CountDownLatch latch = new CountDownLatch(count);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34385);final SemaphoreThread t = new SemaphoreThread(semaphore, latch, count, count);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34386);t.start();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34387);latch.await();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34388);semaphore.shutdown();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34389);assertTrue("End of period not reached", semaphore.getPeriodEnds() > 0);
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tests the methods for statistics.
     */
    @Test
    public void testGetAverageCallsPerPeriod() throws InterruptedException {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2le4j1lqja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testGetAverageCallsPerPeriod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34390,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2le4j1lqja() throws InterruptedException{try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34390);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34391);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34392);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34393);prepareStartTimer(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34394);EasyMock.replay(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34395);final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT,
                LIMIT);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34396);semaphore.acquire();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34397);semaphore.endOfPeriod();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34398);assertEquals("Wrong average (1)", 1.0, semaphore
                .getAverageCallsPerPeriod(), .005);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34399);semaphore.acquire();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34400);semaphore.acquire();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34401);semaphore.endOfPeriod();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34402);assertEquals("Wrong average (2)", 1.5, semaphore
                .getAverageCallsPerPeriod(), .005);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34403);EasyMock.verify(service, future);
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

    /**
     * Tests whether the available non-blocking calls can be queried.
     */
    @Test
    public void testGetAvailablePermits() throws InterruptedException {__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceStart(getClass().getName(),34404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23a7x0mqjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qf7qf7l3lqxuli.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qf7qf7l3lqxuli.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.TimedSemaphoreTest.testGetAvailablePermits",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34404,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23a7x0mqjo() throws InterruptedException{try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34404);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34405);final ScheduledExecutorService service = EasyMock
                .createMock(ScheduledExecutorService.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34406);final ScheduledFuture<?> future = EasyMock.createMock(ScheduledFuture.class);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34407);prepareStartTimer(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34408);EasyMock.replay(service, future);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34409);final TimedSemaphore semaphore = new TimedSemaphore(service, PERIOD, UNIT,
                LIMIT);
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34410);for (int i = 0; (((i < LIMIT)&&(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34411)!=0|true))||(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34412)==0&false)); i++) {{
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34413);assertEquals("Wrong available count at " + i, LIMIT - i, semaphore
                    .getAvailablePermits());
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34414);semaphore.acquire();
        }
        }__CLR4_1_2qf7qf7l3lqxuli.R.inc(34415);semaphore.endOfPeriod();
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34416);assertEquals("Wrong available count in new period", LIMIT, semaphore
                .getAvailablePermits());
        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34417);EasyMock.verify(service, future);
    }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

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
            super(timePeriod, timeUnit, limit);__CLR4_1_2qf7qf7l3lqxuli.R.inc(34419);try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34418);
        }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

        public TimedSemaphoreTestImpl(final ScheduledExecutorService service,
                final long timePeriod, final TimeUnit timeUnit, final int limit) {
            super(service, timePeriod, timeUnit, limit);__CLR4_1_2qf7qf7l3lqxuli.R.inc(34421);try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34420);
        }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

        /**
         * Returns the number of invocations of the endOfPeriod() method.
         *
         * @return the endOfPeriod() invocations
         */
        public int getPeriodEnds() {try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34422);
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34423);synchronized (this) {
                __CLR4_1_2qf7qf7l3lqxuli.R.inc(34424);return periodEnds;
            }
        }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

        /**
         * Invokes the latch if one is set.
         */
        @Override
        public synchronized void acquire() throws InterruptedException {try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34425);
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34426);super.acquire();
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34427);if ((((latch != null)&&(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34428)!=0|true))||(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34429)==0&false))) {{
                __CLR4_1_2qf7qf7l3lqxuli.R.inc(34430);latch.countDown();
            }
        }}finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

        /**
         * Counts the number of invocations.
         */
        @Override
        protected synchronized void endOfPeriod() {try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34431);
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34432);super.endOfPeriod();
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34433);periodEnds++;
        }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

        /**
         * Either returns the mock future or calls the super method.
         */
        @Override
        protected ScheduledFuture<?> startTimer() {try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34434);
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34435);return (((schedFuture != null )&&(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34436)!=0|true))||(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34437)==0&false))? schedFuture : super.startTimer();
        }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}
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

        public SemaphoreThread(final TimedSemaphore b, final CountDownLatch l, final int c, final int lc) {try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34438);
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34439);semaphore = b;
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34440);latch = l;
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34441);count = c;
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34442);latchCount = lc;
        }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}

        /**
         * Calls acquire() on the semaphore for the specified number of times.
         * Optionally the latch will also be triggered to synchronize with the
         * main test thread.
         */
        @Override
        public void run() {try{__CLR4_1_2qf7qf7l3lqxuli.R.inc(34443);
            __CLR4_1_2qf7qf7l3lqxuli.R.inc(34444);try {
                __CLR4_1_2qf7qf7l3lqxuli.R.inc(34445);for (int i = 0; (((i < count)&&(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34446)!=0|true))||(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34447)==0&false)); i++) {{
                    __CLR4_1_2qf7qf7l3lqxuli.R.inc(34448);semaphore.acquire();

                    __CLR4_1_2qf7qf7l3lqxuli.R.inc(34449);if ((((i < latchCount)&&(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34450)!=0|true))||(__CLR4_1_2qf7qf7l3lqxuli.R.iget(34451)==0&false))) {{
                        __CLR4_1_2qf7qf7l3lqxuli.R.inc(34452);latch.countDown();
                    }
                }}
            }} catch (final InterruptedException iex) {
                __CLR4_1_2qf7qf7l3lqxuli.R.inc(34453);Thread.currentThread().interrupt();
            }
        }finally{__CLR4_1_2qf7qf7l3lqxuli.R.flushNeeded();}}
    }
}
