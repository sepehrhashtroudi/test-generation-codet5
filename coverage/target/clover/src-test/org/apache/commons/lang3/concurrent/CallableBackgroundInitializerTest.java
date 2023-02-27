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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

/**
 * Test class for {@code CallableBackgroundInitializer}
 *
 * @version $Id$
 */
public class CallableBackgroundInitializerTest  {static class __CLR4_1_2q3nq3nl3lqxujx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,33844,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the result of the call() invocation. */
    private static final Integer RESULT = Integer.valueOf(42);

    /**
     * Tries to create an instance without a Callable. This should cause an
     * exception.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testInitNullCallable() {__CLR4_1_2q3nq3nl3lqxujx.R.globalSliceStart(getClass().getName(),33827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cbejkoq3n();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,105,116,78,117,108,108,67,97,108,108,97,98,108,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q3nq3nl3lqxujx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q3nq3nl3lqxujx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.testInitNullCallable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33827,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cbejkoq3n(){try{__CLR4_1_2q3nq3nl3lqxujx.R.inc(33827);
        __CLR4_1_2q3nq3nl3lqxujx.R.inc(33828);new CallableBackgroundInitializer<Object>(null);
    }finally{__CLR4_1_2q3nq3nl3lqxujx.R.flushNeeded();}}

    /**
     * Tests whether the executor service is correctly passed to the super
     * class.
     */
    @Test
    public void testInitExecutor() {__CLR4_1_2q3nq3nl3lqxujx.R.globalSliceStart(getClass().getName(),33829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25h8rdwq3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q3nq3nl3lqxujx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q3nq3nl3lqxujx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.testInitExecutor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33829,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25h8rdwq3p(){try{__CLR4_1_2q3nq3nl3lqxujx.R.inc(33829);
        __CLR4_1_2q3nq3nl3lqxujx.R.inc(33830);final ExecutorService exec = Executors.newSingleThreadExecutor();
        __CLR4_1_2q3nq3nl3lqxujx.R.inc(33831);final CallableBackgroundInitializer<Integer> init = new CallableBackgroundInitializer<Integer>(
                new TestCallable(), exec);
        __CLR4_1_2q3nq3nl3lqxujx.R.inc(33832);assertEquals("Executor not set", exec, init.getExternalExecutor());
    }finally{__CLR4_1_2q3nq3nl3lqxujx.R.flushNeeded();}}

    /**
     * Tries to pass a null Callable to the constructor that takes an executor.
     * This should cause an exception.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testInitExecutorNullCallable() {__CLR4_1_2q3nq3nl3lqxujx.R.globalSliceStart(getClass().getName(),33833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xg3r7pq3t();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,105,116,69,120,101,99,117,116,111,114,78,117,108,108,67,97,108,108,97,98,108,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q3nq3nl3lqxujx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q3nq3nl3lqxujx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.testInitExecutorNullCallable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33833,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xg3r7pq3t(){try{__CLR4_1_2q3nq3nl3lqxujx.R.inc(33833);
        __CLR4_1_2q3nq3nl3lqxujx.R.inc(33834);final ExecutorService exec = Executors.newSingleThreadExecutor();
        __CLR4_1_2q3nq3nl3lqxujx.R.inc(33835);new CallableBackgroundInitializer<Integer>(null, exec);
    }finally{__CLR4_1_2q3nq3nl3lqxujx.R.flushNeeded();}}

    /**
     * Tests the implementation of initialize().
     */
    @Test
    public void testInitialize() throws Exception {__CLR4_1_2q3nq3nl3lqxujx.R.globalSliceStart(getClass().getName(),33836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25j52d3q3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q3nq3nl3lqxujx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q3nq3nl3lqxujx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.CallableBackgroundInitializerTest.testInitialize",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33836,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25j52d3q3w() throws Exception{try{__CLR4_1_2q3nq3nl3lqxujx.R.inc(33836);
        __CLR4_1_2q3nq3nl3lqxujx.R.inc(33837);final TestCallable call = new TestCallable();
        __CLR4_1_2q3nq3nl3lqxujx.R.inc(33838);final CallableBackgroundInitializer<Integer> init = new CallableBackgroundInitializer<Integer>(
                call);
        __CLR4_1_2q3nq3nl3lqxujx.R.inc(33839);assertEquals("Wrong result", RESULT, init.initialize());
        __CLR4_1_2q3nq3nl3lqxujx.R.inc(33840);assertEquals("Wrong number of invocations", 1, call.callCount);
    }finally{__CLR4_1_2q3nq3nl3lqxujx.R.flushNeeded();}}

    /**
     * A test Callable implementation for checking the initializer's
     * implementation of the initialize() method.
     */
    private static class TestCallable implements Callable<Integer> {
        /** A counter for the number of call() invocations. */
        int callCount;

        /**
         * Records this invocation and returns the test result.
         */
        @Override
        public Integer call() throws Exception {try{__CLR4_1_2q3nq3nl3lqxujx.R.inc(33841);
            __CLR4_1_2q3nq3nl3lqxujx.R.inc(33842);callCount++;
            __CLR4_1_2q3nq3nl3lqxujx.R.inc(33843);return RESULT;
        }finally{__CLR4_1_2q3nq3nl3lqxujx.R.flushNeeded();}}
    }
}
