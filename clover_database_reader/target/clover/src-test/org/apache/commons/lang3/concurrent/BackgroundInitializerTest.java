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

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class BackgroundInitializerTest {static class __CLR4_1_2pwdpwdl3lqxujg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,33693,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Helper method for checking whether the initialize() method was correctly
     * called. start() must already have been invoked.
     *
     * @param init the initializer to test
     */
    private void checkInitialize(final BackgroundInitializerTestImpl init) {try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33565);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33566);try {
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33567);final Integer result = init.get();
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33568);assertEquals("Wrong result", 1, result.intValue());
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33569);assertEquals("Wrong number of invocations", 1, init.initializeCalls);
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33570);assertNotNull("No future", init.getFuture());
        } catch (final ConcurrentException cex) {
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33571);fail("Unexpected exception: " + cex);
        }
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests whether initialize() is invoked.
     */
    @Test
    public void testInitialize() {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25j52d3pwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testInitialize",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33572,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25j52d3pwk(){try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33572);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33573);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33574);init.start();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33575);checkInitialize(init);
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tries to obtain the executor before start(). It should not have been
     * initialized yet.
     */
    @Test
    public void testGetActiveExecutorBeforeStart() {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25fvz71pwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetActiveExecutorBeforeStart",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33576,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25fvz71pwo(){try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33576);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33577);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33578);assertNull("Got an executor", init.getActiveExecutor());
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests whether an external executor is correctly detected.
     */
    @Test
    public void testGetActiveExecutorExternal() {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2f9obe7pwr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetActiveExecutorExternal",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33579,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2f9obe7pwr(){try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33579);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33580);final ExecutorService exec = Executors.newSingleThreadExecutor();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33581);try {
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33582);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl(
                    exec);
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33583);init.start();
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33584);assertSame("Wrong executor", exec, init.getActiveExecutor());
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33585);checkInitialize(init);
        } finally {
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33586);exec.shutdown();
        }
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests getActiveExecutor() for a temporary executor.
     */
    @Test
    public void testGetActiveExecutorTemp() {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x0r76gpwz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetActiveExecutorTemp",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33587,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x0r76gpwz(){try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33587);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33588);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33589);init.start();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33590);assertNotNull("No active executor", init.getActiveExecutor());
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33591);checkInitialize(init);
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests the execution of the background task if a temporary executor has to
     * be created.
     */
    @Test
    public void testInitializeTempExecutor() {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23y2lo0px4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testInitializeTempExecutor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33592,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23y2lo0px4(){try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33592);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33593);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33594);assertTrue("Wrong result of start()", init.start());
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33595);checkInitialize(init);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33596);assertTrue("Executor not shutdown", init.getActiveExecutor()
                .isShutdown());
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests whether an external executor can be set using the
     * setExternalExecutor() method.
     */
    @Test
    public void testSetExternalExecutor() throws Exception {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28oz7x1px9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testSetExternalExecutor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33597,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28oz7x1px9() throws Exception{try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33597);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33598);final ExecutorService exec = Executors.newCachedThreadPool();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33599);try {
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33600);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33601);init.setExternalExecutor(exec);
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33602);assertEquals("Wrong executor service", exec, init
                    .getExternalExecutor());
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33603);assertTrue("Wrong result of start()", init.start());
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33604);assertSame("Wrong active executor", exec, init.getActiveExecutor());
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33605);checkInitialize(init);
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33606);assertFalse("Executor was shutdown", exec.isShutdown());
        } finally {
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33607);exec.shutdown();
        }
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests that setting an executor after start() causes an exception.
     */
    @Test
    public void testSetExternalExecutorAfterStart() throws ConcurrentException {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xc97krpxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testSetExternalExecutorAfterStart",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33608,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xc97krpxk() throws ConcurrentException{try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33608);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33609);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33610);init.start();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33611);try {
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33612);init.setExternalExecutor(Executors.newSingleThreadExecutor());
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33613);fail("Could set executor after start()!");
        } catch (final IllegalStateException istex) {
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33614);init.get();
        }
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests invoking start() multiple times. Only the first invocation should
     * have an effect.
     */
    @Test
    public void testStartMultipleTimes() {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24o7dsdpxr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testStartMultipleTimes",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33615,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24o7dsdpxr(){try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33615);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33616);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33617);assertTrue("Wrong result for start()", init.start());
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33618);for (int i = 0; (((i < 10)&&(__CLR4_1_2pwdpwdl3lqxujg.R.iget(33619)!=0|true))||(__CLR4_1_2pwdpwdl3lqxujg.R.iget(33620)==0&false)); i++) {{
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33621);assertFalse("Could start again", init.start());
        }
        }__CLR4_1_2pwdpwdl3lqxujg.R.inc(33622);checkInitialize(init);
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests calling get() before start(). This should cause an exception.
     */
    @Test(expected=IllegalStateException.class)
    public void testGetBeforeStart() throws ConcurrentException {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k7q8aupxz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,71,101,116,66,101,102,111,114,101,83,116,97,114,116,58,32,91,73,108,108,101,103,97,108,83,116,97,116,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalStateException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetBeforeStart",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33623,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k7q8aupxz() throws ConcurrentException{try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33623);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33624);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33625);init.get();
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests the get() method if background processing causes a runtime
     * exception.
     */
    @Test
    public void testGetRuntimeException() throws Exception {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q5fm7ypy2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetRuntimeException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33626,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q5fm7ypy2() throws Exception{try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33626);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33627);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33628);final RuntimeException rex = new RuntimeException();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33629);init.ex = rex;
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33630);init.start();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33631);try {
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33632);init.get();
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33633);fail("Exception not thrown!");
        } catch (final Exception ex) {
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33634);assertEquals("Runtime exception not thrown", rex, ex);
        }
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests the get() method if background processing causes a checked
     * exception.
     */
    @Test
    public void testGetCheckedException() throws Exception {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o6we31pyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetCheckedException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33635,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o6we31pyb() throws Exception{try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33635);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33636);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33637);final Exception ex = new Exception();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33638);init.ex = ex;
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33639);init.start();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33640);try {
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33641);init.get();
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33642);fail("Exception not thrown!");
        } catch (final ConcurrentException cex) {
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33643);assertEquals("Exception not thrown", ex, cex.getCause());
        }
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests the get() method if waiting for the initialization is interrupted.
     */
    @Test
    public void testGetInterruptedException() throws Exception {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b5lctkpyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testGetInterruptedException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33644,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b5lctkpyk() throws Exception{try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33644);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33645);final ExecutorService exec = Executors.newSingleThreadExecutor();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33646);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl(
                exec);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33647);final CountDownLatch latch1 = new CountDownLatch(1);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33648);init.shouldSleep = true;
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33649);init.start();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33650);final AtomicReference<InterruptedException> iex = new AtomicReference<InterruptedException>();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33651);final Thread getThread = new Thread() {
            @Override
            public void run() {try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33652);
                __CLR4_1_2pwdpwdl3lqxujg.R.inc(33653);try {
                    __CLR4_1_2pwdpwdl3lqxujg.R.inc(33654);init.get();
                } catch (final ConcurrentException cex) {
                    __CLR4_1_2pwdpwdl3lqxujg.R.inc(33655);if ((((cex.getCause() instanceof InterruptedException)&&(__CLR4_1_2pwdpwdl3lqxujg.R.iget(33656)!=0|true))||(__CLR4_1_2pwdpwdl3lqxujg.R.iget(33657)==0&false))) {{
                        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33658);iex.set((InterruptedException) cex.getCause());
                    }
                }} finally {
                    __CLR4_1_2pwdpwdl3lqxujg.R.inc(33659);assertTrue("Thread not interrupted", isInterrupted());
                    __CLR4_1_2pwdpwdl3lqxujg.R.inc(33660);latch1.countDown();
                }
            }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}
        };
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33661);getThread.start();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33662);getThread.interrupt();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33663);latch1.await();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33664);exec.shutdownNow();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33665);exec.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33666);assertNotNull("No interrupted exception", iex.get());
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests isStarted() before start() was called.
     */
    @Test
    public void testIsStartedFalse() {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x2olwbpz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testIsStartedFalse",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33667,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x2olwbpz7(){try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33667);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33668);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33669);assertFalse("Already started", init.isStarted());
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests isStarted() after start().
     */
    @Test
    public void testIsStartedTrue() {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oka15ypza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testIsStartedTrue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33670,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oka15ypza(){try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33670);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33671);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33672);init.start();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33673);assertTrue("Not started", init.isStarted());
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

    /**
     * Tests isStarted() after the background task has finished.
     */
    @Test
    public void testIsStartedAfterGet() {__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceStart(getClass().getName(),33674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2getqmypze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pwdpwdl3lqxujg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pwdpwdl3lqxujg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BackgroundInitializerTest.testIsStartedAfterGet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33674,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2getqmypze(){try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33674);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33675);final BackgroundInitializerTestImpl init = new BackgroundInitializerTestImpl();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33676);init.start();
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33677);checkInitialize(init);
        __CLR4_1_2pwdpwdl3lqxujg.R.inc(33678);assertTrue("Not started", init.isStarted());
    }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

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
            super();__CLR4_1_2pwdpwdl3lqxujg.R.inc(33680);try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33679);
        }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

        public BackgroundInitializerTestImpl(final ExecutorService exec) {
            super(exec);__CLR4_1_2pwdpwdl3lqxujg.R.inc(33682);try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33681);
        }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}

        /**
         * Records this invocation. Optionally throws an exception or sleeps a
         * while.
         */
        @Override
        protected Integer initialize() throws Exception {try{__CLR4_1_2pwdpwdl3lqxujg.R.inc(33683);
            __CLR4_1_2pwdpwdl3lqxujg.R.inc(33684);if ((((ex != null)&&(__CLR4_1_2pwdpwdl3lqxujg.R.iget(33685)!=0|true))||(__CLR4_1_2pwdpwdl3lqxujg.R.iget(33686)==0&false))) {{
                __CLR4_1_2pwdpwdl3lqxujg.R.inc(33687);throw ex;
            }
            }__CLR4_1_2pwdpwdl3lqxujg.R.inc(33688);if ((((shouldSleep)&&(__CLR4_1_2pwdpwdl3lqxujg.R.iget(33689)!=0|true))||(__CLR4_1_2pwdpwdl3lqxujg.R.iget(33690)==0&false))) {{
                __CLR4_1_2pwdpwdl3lqxujg.R.inc(33691);Thread.sleep(60000L);
            }
            }__CLR4_1_2pwdpwdl3lqxujg.R.inc(33692);return Integer.valueOf(++initializeCalls);
        }finally{__CLR4_1_2pwdpwdl3lqxujg.R.flushNeeded();}}
    }
}
