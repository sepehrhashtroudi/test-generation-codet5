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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@link MultiBackgroundInitializer}.
 *
 * @version $Id$
 */
public class MultiBackgroundInitializerTest {static class __CLR4_1_2qb2qb2l3lqxul1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,34243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the names of the child initializers. */
    private static final String CHILD_INIT = "childInitializer";

    /** The initializer to be tested. */
    private MultiBackgroundInitializer initializer;

    @Before
    public void setUp() throws Exception {try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34094);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34095);initializer = new MultiBackgroundInitializer();
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tests whether a child initializer has been executed. Optionally the
     * expected executor service can be checked, too.
     *
     * @param child the child initializer
     * @param expExec the expected executor service (null if the executor should
     * not be checked)
     * @throws ConcurrentException if an error occurs
     */
    private void checkChild(final BackgroundInitializer<?> child,
            final ExecutorService expExec) throws ConcurrentException {try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34096);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34097);final ChildBackgroundInitializer cinit = (ChildBackgroundInitializer) child;
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34098);final Integer result = cinit.get();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34099);assertEquals("Wrong result", 1, result.intValue());
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34100);assertEquals("Wrong number of executions", 1, cinit.initializeCalls);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34101);if ((((expExec != null)&&(__CLR4_1_2qb2qb2l3lqxul1.R.iget(34102)!=0|true))||(__CLR4_1_2qb2qb2l3lqxul1.R.iget(34103)==0&false))) {{
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34104);assertEquals("Wrong executor service", expExec,
                    cinit.currentExecutor);
        }
    }}finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tests addInitializer() if a null name is passed in. This should cause an
     * exception.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAddInitializerNullName() {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28eblqsqbd();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,73,110,105,116,105,97,108,105,122,101,114,78,117,108,108,78,97,109,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testAddInitializerNullName",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34105,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28eblqsqbd(){try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34105);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34106);initializer.addInitializer(null, new ChildBackgroundInitializer());
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tests addInitializer() if a null initializer is passed in. This should
     * cause an exception.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAddInitializerNullInit() {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2biy6mpqbf();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,73,110,105,116,105,97,108,105,122,101,114,78,117,108,108,73,110,105,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testAddInitializerNullInit",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34107,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2biy6mpqbf(){try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34107);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34108);initializer.addInitializer(CHILD_INIT, null);
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tests the background processing if there are no child initializers.
     */
    @Test
    public void testInitializeNoChildren() throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xm4l6xqbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeNoChildren",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34109,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xm4l6xqbh() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34109);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34110);assertTrue("Wrong result of start()", initializer.start());
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34111);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34112);assertTrue("Got child initializers", res.initializerNames().isEmpty());
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34113);assertTrue("Executor not shutdown", initializer.getActiveExecutor()
                .isShutdown());
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Helper method for testing the initialize() method. This method can
     * operate with both an external and a temporary executor service.
     *
     * @return the result object produced by the initializer
     */
    private MultiBackgroundInitializer.MultiBackgroundInitializerResults checkInitialize()
            throws ConcurrentException {try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34114);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34115);final int count = 5;
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34116);for (int i = 0; (((i < count)&&(__CLR4_1_2qb2qb2l3lqxul1.R.iget(34117)!=0|true))||(__CLR4_1_2qb2qb2l3lqxul1.R.iget(34118)==0&false)); i++) {{
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34119);initializer.addInitializer(CHILD_INIT + i,
                    new ChildBackgroundInitializer());
        }
        }__CLR4_1_2qb2qb2l3lqxul1.R.inc(34120);initializer.start();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34121);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34122);assertEquals("Wrong number of child initializers", count, res
                .initializerNames().size());
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34123);for (int i = 0; (((i < count)&&(__CLR4_1_2qb2qb2l3lqxul1.R.iget(34124)!=0|true))||(__CLR4_1_2qb2qb2l3lqxul1.R.iget(34125)==0&false)); i++) {{
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34126);final String key = CHILD_INIT + i;
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34127);assertTrue("Name not found: " + key, res.initializerNames()
                    .contains(key));
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34128);assertEquals("Wrong result object", Integer.valueOf(1), res
                    .getResultObject(key));
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34129);assertFalse("Exception flag", res.isException(key));
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34130);assertNull("Got an exception", res.getException(key));
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34131);checkChild(res.getInitializer(key), initializer.getActiveExecutor());
        }
        }__CLR4_1_2qb2qb2l3lqxul1.R.inc(34132);return res;
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tests background processing if a temporary executor is used.
     */
    @Test
    public void testInitializeTempExec() throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kpq9qmqc5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeTempExec",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34133,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kpq9qmqc5() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34133);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34134);checkInitialize();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34135);assertTrue("Executor not shutdown", initializer.getActiveExecutor()
                .isShutdown());
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tests background processing if an external executor service is provided.
     */
    @Test
    public void testInitializeExternalExec() throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29xy4x1qc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeExternalExec",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34136,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29xy4x1qc8() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34136);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34137);final ExecutorService exec = Executors.newCachedThreadPool();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34138);try {
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34139);initializer = new MultiBackgroundInitializer(exec);
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34140);checkInitialize();
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34141);assertEquals("Wrong executor", exec, initializer
                    .getActiveExecutor());
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34142);assertFalse("Executor was shutdown", exec.isShutdown());
        } finally {
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34143);exec.shutdown();
        }
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tests the behavior of initialize() if a child initializer has a specific
     * executor service. Then this service should not be overridden.
     */
    @Test
    public void testInitializeChildWithExecutor() throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28pir0aqcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeChildWithExecutor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34144,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28pir0aqcg() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34144);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34145);final String initExec = "childInitializerWithExecutor";
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34146);final ExecutorService exec = Executors.newSingleThreadExecutor();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34147);try {
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34148);final ChildBackgroundInitializer c1 = new ChildBackgroundInitializer();
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34149);final ChildBackgroundInitializer c2 = new ChildBackgroundInitializer();
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34150);c2.setExternalExecutor(exec);
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34151);initializer.addInitializer(CHILD_INIT, c1);
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34152);initializer.addInitializer(initExec, c2);
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34153);initializer.start();
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34154);initializer.get();
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34155);checkChild(c1, initializer.getActiveExecutor());
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34156);checkChild(c2, exec);
        } finally {
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34157);exec.shutdown();
        }
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tries to add another child initializer after the start() method has been
     * called. This should not be allowed.
     */
    @Test
    public void testAddInitializerAfterStart() throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qzkbogqcu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testAddInitializerAfterStart",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34158,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qzkbogqcu() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34158);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34159);initializer.start();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34160);try {
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34161);initializer.addInitializer(CHILD_INIT,
                    new ChildBackgroundInitializer());
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34162);fail("Could add initializer after start()!");
        } catch (final IllegalStateException istex) {
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34163);initializer.get();
        }
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tries to query an unknown child initializer from the results object. This
     * should cause an exception.
     */
    @Test(expected = NoSuchElementException.class)
    public void testResultGetInitializerUnknown() throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2e6mugaqd0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,115,117,108,116,71,101,116,73,110,105,116,105,97,108,105,122,101,114,85,110,107,110,111,119,110,58,32,91,78,111,83,117,99,104,69,108,101,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchElementException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultGetInitializerUnknown",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34164,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2e6mugaqd0() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34164);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34165);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = checkInitialize();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34166);res.getInitializer("unknown");
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tries to query the results of an unknown child initializer from the
     * results object. This should cause an exception.
     */
    @Test(expected = NoSuchElementException.class)
    public void testResultGetResultObjectUnknown() throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21yvfwuqd3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,115,117,108,116,71,101,116,82,101,115,117,108,116,79,98,106,101,99,116,85,110,107,110,111,119,110,58,32,91,78,111,83,117,99,104,69,108,101,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchElementException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultGetResultObjectUnknown",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34167,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21yvfwuqd3() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34167);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34168);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = checkInitialize();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34169);res.getResultObject("unknown");
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tries to query the exception of an unknown child initializer from the
     * results object. This should cause an exception.
     */
    @Test(expected = NoSuchElementException.class)
    public void testResultGetExceptionUnknown() throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b1227dqd6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,115,117,108,116,71,101,116,69,120,99,101,112,116,105,111,110,85,110,107,110,111,119,110,58,32,91,78,111,83,117,99,104,69,108,101,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchElementException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultGetExceptionUnknown",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34170,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b1227dqd6() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34170);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34171);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = checkInitialize();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34172);res.getException("unknown");
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tries to query the exception flag of an unknown child initializer from
     * the results object. This should cause an exception.
     */
    @Test(expected = NoSuchElementException.class)
    public void testResultIsExceptionUnknown() throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26kpf0lqd9();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,115,117,108,116,73,115,69,120,99,101,112,116,105,111,110,85,110,107,110,111,119,110,58,32,91,78,111,83,117,99,104,69,108,101,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchElementException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultIsExceptionUnknown",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34173,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26kpf0lqd9() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34173);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34174);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = checkInitialize();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34175);res.isException("unknown");
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tests that the set with the names of the initializers cannot be modified.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testResultInitializerNamesModify() throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yf369iqdc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,115,117,108,116,73,110,105,116,105,97,108,105,122,101,114,78,97,109,101,115,77,111,100,105,102,121,58,32,91,85,110,115,117,112,112,111,114,116,101,100,79,112,101,114,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof UnsupportedOperationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testResultInitializerNamesModify",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34176,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yf369iqdc() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34176);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34177);checkInitialize();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34178);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34179);final Iterator<String> it = res.initializerNames().iterator();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34180);it.next();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34181);it.remove();
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tests the behavior of the initializer if one of the child initializers
     * throws a runtime exception.
     */
    @Test
    public void testInitializeRuntimeEx() {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r7emoqdi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeRuntimeEx",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34182,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r7emoqdi(){try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34182);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34183);final ChildBackgroundInitializer child = new ChildBackgroundInitializer();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34184);child.ex = new RuntimeException();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34185);initializer.addInitializer(CHILD_INIT, child);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34186);initializer.start();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34187);try {
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34188);initializer.get();
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34189);fail("Runtime exception not thrown!");
        } catch (final Exception ex) {
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34190);assertEquals("Wrong exception", child.ex, ex);
        }
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tests the behavior of the initializer if one of the child initializers
     * throws a checked exception.
     */
    @Test
    public void testInitializeEx() throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2t5l6x0qdr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeEx",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34191,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2t5l6x0qdr() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34191);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34192);final ChildBackgroundInitializer child = new ChildBackgroundInitializer();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34193);child.ex = new Exception();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34194);initializer.addInitializer(CHILD_INIT, child);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34195);initializer.start();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34196);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34197);assertTrue("No exception flag", res.isException(CHILD_INIT));
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34198);assertNull("Got a results object", res.getResultObject(CHILD_INIT));
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34199);final ConcurrentException cex = res.getException(CHILD_INIT);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34200);assertEquals("Wrong cause", child.ex, cex.getCause());
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tests the isSuccessful() method of the result object if no child
     * initializer has thrown an exception.
     */
    @Test
    public void testInitializeResultsIsSuccessfulTrue()
            throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qsr5o3qe1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeResultsIsSuccessfulTrue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34201,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qsr5o3qe1() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34201);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34202);final ChildBackgroundInitializer child = new ChildBackgroundInitializer();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34203);initializer.addInitializer(CHILD_INIT, child);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34204);initializer.start();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34205);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34206);assertTrue("Wrong success flag", res.isSuccessful());
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tests the isSuccessful() method of the result object if at least one
     * child initializer has thrown an exception.
     */
    @Test
    public void testInitializeResultsIsSuccessfulFalse()
            throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vcbfjiqe7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeResultsIsSuccessfulFalse",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34207,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vcbfjiqe7() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34207);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34208);final ChildBackgroundInitializer child = new ChildBackgroundInitializer();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34209);child.ex = new Exception();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34210);initializer.addInitializer(CHILD_INIT, child);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34211);initializer.start();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34212);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34213);assertFalse("Wrong success flag", res.isSuccessful());
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * Tests whether MultiBackgroundInitializers can be combined in a nested
     * way.
     */
    @Test
    public void testInitializeNested() throws ConcurrentException {__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceStart(getClass().getName(),34214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wxd474qee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qb2qb2l3lqxul1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qb2qb2l3lqxul1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.MultiBackgroundInitializerTest.testInitializeNested",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34214,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wxd474qee() throws ConcurrentException{try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34214);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34215);final String nameMulti = "multiChildInitializer";
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34216);initializer
                .addInitializer(CHILD_INIT, new ChildBackgroundInitializer());
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34217);final MultiBackgroundInitializer mi2 = new MultiBackgroundInitializer();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34218);final int count = 3;
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34219);for (int i = 0; (((i < count)&&(__CLR4_1_2qb2qb2l3lqxul1.R.iget(34220)!=0|true))||(__CLR4_1_2qb2qb2l3lqxul1.R.iget(34221)==0&false)); i++) {{
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34222);mi2
                    .addInitializer(CHILD_INIT + i,
                            new ChildBackgroundInitializer());
        }
        }__CLR4_1_2qb2qb2l3lqxul1.R.inc(34223);initializer.addInitializer(nameMulti, mi2);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34224);initializer.start();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34225);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res = initializer
                .get();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34226);final ExecutorService exec = initializer.getActiveExecutor();
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34227);checkChild(res.getInitializer(CHILD_INIT), exec);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34228);final MultiBackgroundInitializer.MultiBackgroundInitializerResults res2 = (MultiBackgroundInitializer.MultiBackgroundInitializerResults) res
                .getResultObject(nameMulti);
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34229);assertEquals("Wrong number of initializers", count, res2
                .initializerNames().size());
        __CLR4_1_2qb2qb2l3lqxul1.R.inc(34230);for (int i = 0; (((i < count)&&(__CLR4_1_2qb2qb2l3lqxul1.R.iget(34231)!=0|true))||(__CLR4_1_2qb2qb2l3lqxul1.R.iget(34232)==0&false)); i++) {{
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34233);checkChild(res2.getInitializer(CHILD_INIT + i), exec);
        }
        }__CLR4_1_2qb2qb2l3lqxul1.R.inc(34234);assertTrue("Executor not shutdown", exec.isShutdown());
    }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}

    /**
     * A concrete implementation of {@code BackgroundInitializer} used for
     * defining background tasks for {@code MultiBackgroundInitializer}.
     */
    private static class ChildBackgroundInitializer extends
            BackgroundInitializer<Integer> {
        /** Stores the current executor service. */
        volatile ExecutorService currentExecutor;

        /** A counter for the invocations of initialize(). */
        volatile int initializeCalls;

        /** An exception to be thrown by initialize(). */
        Exception ex;

        /**
         * Records this invocation. Optionally throws an exception.
         */
        @Override
        protected Integer initialize() throws Exception {try{__CLR4_1_2qb2qb2l3lqxul1.R.inc(34235);
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34236);currentExecutor = getActiveExecutor();
            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34237);initializeCalls++;

            __CLR4_1_2qb2qb2l3lqxul1.R.inc(34238);if ((((ex != null)&&(__CLR4_1_2qb2qb2l3lqxul1.R.iget(34239)!=0|true))||(__CLR4_1_2qb2qb2l3lqxul1.R.iget(34240)==0&false))) {{
                __CLR4_1_2qb2qb2l3lqxul1.R.inc(34241);throw ex;
            }

            }__CLR4_1_2qb2qb2l3lqxul1.R.inc(34242);return Integer.valueOf(initializeCalls);
        }finally{__CLR4_1_2qb2qb2l3lqxul1.R.flushNeeded();}}
    }
}
