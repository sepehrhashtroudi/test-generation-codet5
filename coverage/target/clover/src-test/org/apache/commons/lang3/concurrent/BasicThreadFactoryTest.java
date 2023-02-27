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
public class BasicThreadFactoryTest {static class __CLR4_1_2pzxpzxl3lqxujt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,33827,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the test naming pattern. */
    private static final String PATTERN = "testThread-%d";

    /** The builder for creating a thread factory. */
    private BasicThreadFactory.Builder builder;

    @Before
    public void setUp() throws Exception {try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33693);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33694);builder = new BasicThreadFactory.Builder();
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tests the default options of a thread factory.
     *
     * @param factory the factory to be checked
     */
    private void checkFactoryDefaults(final BasicThreadFactory factory) {try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33695);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33696);assertNull("Got a naming pattern", factory.getNamingPattern());
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33697);assertNull("Got an exception handler", factory
                .getUncaughtExceptionHandler());
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33698);assertNull("Got a priority", factory.getPriority());
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33699);assertNull("Got a daemon flag", factory.getDaemonFlag());
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33700);assertNotNull("No wrapped factory", factory.getWrappedFactory());
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tests the default values used by the builder.
     */
    @Test
    public void testBuildDefaults() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_287p6utq05();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuildDefaults",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33701,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_287p6utq05(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33701);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33702);final BasicThreadFactory factory = builder.build();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33703);checkFactoryDefaults(factory);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tries to set a null naming pattern.
     */
    @Test(expected = NullPointerException.class)
    public void testBuildNamingPatternNull() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kywb8aq08();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,117,105,108,100,78,97,109,105,110,103,80,97,116,116,101,114,110,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuildNamingPatternNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33704,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kywb8aq08(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33704);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33705);builder.namingPattern(null);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tries to set a null wrapped factory.
     */
    @Test(expected = NullPointerException.class)
    public void testBuildWrappedFactoryNull() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vz4ymnq0a();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,117,105,108,100,87,114,97,112,112,101,100,70,97,99,116,111,114,121,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuildWrappedFactoryNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33706,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vz4ymnq0a(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33706);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33707);builder.wrappedFactory(null);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tries to set a null exception handler.
     */
    @Test(expected = NullPointerException.class)
    public void testBuildUncaughtExceptionHandlerNull() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23dt1y2q0c();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,66,117,105,108,100,85,110,99,97,117,103,104,116,69,120,99,101,112,116,105,111,110,72,97,110,100,108,101,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuildUncaughtExceptionHandlerNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33708,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23dt1y2q0c(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33708);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33709);builder.uncaughtExceptionHandler(null);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tests the reset() method of the builder.
     */
    @Test
    public void testBuilderReset() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nhl6zxq0e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuilderReset",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33710,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nhl6zxq0e(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33710);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33711);final ThreadFactory wrappedFactory = EasyMock.createMock(ThreadFactory.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33712);final Thread.UncaughtExceptionHandler exHandler = EasyMock
                .createMock(Thread.UncaughtExceptionHandler.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33713);EasyMock.replay(wrappedFactory, exHandler);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33714);builder.namingPattern(PATTERN).daemon(true).priority(
                Thread.MAX_PRIORITY).uncaughtExceptionHandler(exHandler)
                .wrappedFactory(wrappedFactory);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33715);builder.reset();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33716);final BasicThreadFactory factory = builder.build();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33717);checkFactoryDefaults(factory);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33718);assertNotSame("Wrapped factory not reset", wrappedFactory, factory
                .getWrappedFactory());
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33719);EasyMock.verify(wrappedFactory, exHandler);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tests whether reset() is automatically called after build().
     */
    @Test
    public void testBuilderResetAfterBuild() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25d5g5dq0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testBuilderResetAfterBuild",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33720,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25d5g5dq0o(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33720);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33721);builder.wrappedFactory(EasyMock.createNiceMock(ThreadFactory.class))
                .namingPattern(PATTERN).daemon(true).build();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33722);checkFactoryDefaults(builder.build());
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tests whether the naming pattern is applied to new threads.
     */
    @Test
    public void testNewThreadNamingPattern() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k0ax55q0r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNamingPattern",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33723,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k0ax55q0r(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33723);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33724);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33725);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33726);final int count = 12;
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33727);for (int i = 0; (((i < count)&&(__CLR4_1_2pzxpzxl3lqxujt.R.iget(33728)!=0|true))||(__CLR4_1_2pzxpzxl3lqxujt.R.iget(33729)==0&false)); i++) {{
            __CLR4_1_2pzxpzxl3lqxujt.R.inc(33730);EasyMock.expect(wrapped.newThread(r)).andReturn(new Thread());
        }
        }__CLR4_1_2pzxpzxl3lqxujt.R.inc(33731);EasyMock.replay(wrapped, r);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33732);final BasicThreadFactory factory = builder.wrappedFactory(wrapped)
                .namingPattern(PATTERN).build();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33733);for (int i = 0; (((i < count)&&(__CLR4_1_2pzxpzxl3lqxujt.R.iget(33734)!=0|true))||(__CLR4_1_2pzxpzxl3lqxujt.R.iget(33735)==0&false)); i++) {{
            __CLR4_1_2pzxpzxl3lqxujt.R.inc(33736);final Thread t = factory.newThread(r);
            __CLR4_1_2pzxpzxl3lqxujt.R.inc(33737);assertEquals("Wrong thread name", String.format(PATTERN, Long
                    .valueOf(i + 1)), t.getName());
            __CLR4_1_2pzxpzxl3lqxujt.R.inc(33738);assertEquals("Wrong thread count", i + 1, factory.getThreadCount());
        }
        }__CLR4_1_2pzxpzxl3lqxujt.R.inc(33739);EasyMock.verify(wrapped, r);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tests whether the thread name is not modified if no naming pattern is
     * set.
     */
    @Test
    public void testNewThreadNoNamingPattern() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o6u54aq18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNoNamingPattern",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33740,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o6u54aq18(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33740);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33741);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33742);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33743);final String name = "unchangedThreadName";
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33744);final Thread t = new Thread(name);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33745);EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33746);EasyMock.replay(wrapped, r);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33747);final BasicThreadFactory factory = builder.wrappedFactory(wrapped).build();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33748);assertSame("Wrong thread", t, factory.newThread(r));
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33749);assertEquals("Name was changed", name, t.getName());
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33750);EasyMock.verify(wrapped, r);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Helper method for testing whether the daemon flag is taken into account.
     *
     * @param flag the value of the flag
     */
    private void checkDaemonFlag(final boolean flag) {try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33751);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33752);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33753);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33754);final Thread t = new Thread();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33755);EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33756);EasyMock.replay(wrapped, r);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33757);final BasicThreadFactory factory = builder.wrappedFactory(wrapped).daemon(
                flag).build();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33758);assertSame("Wrong thread", t, factory.newThread(r));
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33759);assertTrue("Wrong daemon flag", flag == t.isDaemon());
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33760);EasyMock.verify(wrapped, r);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tests whether daemon threads can be created.
     */
    @Test
    public void testNewThreadDaemonTrue() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29h5969q1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadDaemonTrue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33761,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29h5969q1t(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33761);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33762);checkDaemonFlag(true);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tests whether the daemon status of new threads can be turned off.
     */
    @Test
    public void testNewThreadDaemonFalse() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rpwiy6q1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadDaemonFalse",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33763,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rpwiy6q1v(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33763);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33764);checkDaemonFlag(false);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tests whether the daemon flag is not touched on newly created threads if
     * it is not specified.
     */
    @Test
    public void testNewThreadNoDaemonFlag() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dyrq9cq1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNoDaemonFlag",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33765,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dyrq9cq1x(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33765);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33766);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33767);final Runnable r1 = EasyMock.createMock(Runnable.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33768);final Runnable r2 = EasyMock.createMock(Runnable.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33769);final Thread t1 = new Thread();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33770);final Thread t2 = new Thread();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33771);t1.setDaemon(true);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33772);EasyMock.expect(wrapped.newThread(r1)).andReturn(t1);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33773);EasyMock.expect(wrapped.newThread(r2)).andReturn(t2);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33774);EasyMock.replay(wrapped, r1, r2);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33775);final BasicThreadFactory factory = builder.wrappedFactory(wrapped).build();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33776);assertSame("Wrong thread 1", t1, factory.newThread(r1));
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33777);assertTrue("No daemon thread", t1.isDaemon());
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33778);assertSame("Wrong thread 2", t2, factory.newThread(r2));
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33779);assertFalse("A daemon thread", t2.isDaemon());
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33780);EasyMock.verify(wrapped, r1, r2);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tests whether the priority is set on newly created threads.
     */
    @Test
    public void testNewThreadPriority() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28y96n7q2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadPriority",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33781,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28y96n7q2d(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33781);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33782);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33783);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33784);final Thread t = new Thread();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33785);EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33786);EasyMock.replay(wrapped, r);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33787);final int priority = Thread.NORM_PRIORITY + 1;
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33788);final BasicThreadFactory factory = builder.wrappedFactory(wrapped).priority(
                priority).build();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33789);assertSame("Wrong thread", t, factory.newThread(r));
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33790);assertEquals("Wrong priority", priority, t.getPriority());
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33791);EasyMock.verify(wrapped, r);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tests whether the original priority is not changed if no priority is
     * specified.
     */
    @Test
    public void testNewThreadNoPriority() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sbkk7wq2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNoPriority",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33792,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sbkk7wq2o(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33792);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33793);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33794);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33795);final int orgPriority = Thread.NORM_PRIORITY + 1;
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33796);final Thread t = new Thread();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33797);t.setPriority(orgPriority);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33798);EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33799);EasyMock.replay(wrapped, r);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33800);final BasicThreadFactory factory = builder.wrappedFactory(wrapped).build();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33801);assertSame("Wrong thread", t, factory.newThread(r));
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33802);assertEquals("Wrong priority", orgPriority, t.getPriority());
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33803);EasyMock.verify(wrapped, r);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tests whether the exception handler is set if one is provided.
     */
    @Test
    public void testNewThreadExHandler() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_236yxvqq30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadExHandler",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33804,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_236yxvqq30(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33804);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33805);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33806);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33807);final Thread.UncaughtExceptionHandler handler = EasyMock
                .createMock(Thread.UncaughtExceptionHandler.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33808);final Thread t = new Thread();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33809);EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33810);EasyMock.replay(wrapped, r, handler);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33811);final BasicThreadFactory factory = builder.wrappedFactory(wrapped)
                .uncaughtExceptionHandler(handler).build();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33812);assertSame("Wrong thread", t, factory.newThread(r));
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33813);assertEquals("Wrong exception handler", handler, t
                .getUncaughtExceptionHandler());
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33814);EasyMock.verify(wrapped, r, handler);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}

    /**
     * Tests whether the original exception hander is not touched if none is
     * specified.
     */
    @Test
    public void testNewThreadNoExHandler() {__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceStart(getClass().getName(),33815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fruba3q3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pzxpzxl3lqxujt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pzxpzxl3lqxujt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.BasicThreadFactoryTest.testNewThreadNoExHandler",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33815,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fruba3q3b(){try{__CLR4_1_2pzxpzxl3lqxujt.R.inc(33815);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33816);final ThreadFactory wrapped = EasyMock.createMock(ThreadFactory.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33817);final Runnable r = EasyMock.createMock(Runnable.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33818);final Thread.UncaughtExceptionHandler handler = EasyMock
                .createMock(Thread.UncaughtExceptionHandler.class);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33819);final Thread t = new Thread();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33820);t.setUncaughtExceptionHandler(handler);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33821);EasyMock.expect(wrapped.newThread(r)).andReturn(t);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33822);EasyMock.replay(wrapped, r, handler);
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33823);final BasicThreadFactory factory = builder.wrappedFactory(wrapped).build();
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33824);assertSame("Wrong thread", t, factory.newThread(r));
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33825);assertEquals("Wrong exception handler", handler, t
                .getUncaughtExceptionHandler());
        __CLR4_1_2pzxpzxl3lqxujt.R.inc(33826);EasyMock.verify(wrapped, r, handler);
    }finally{__CLR4_1_2pzxpzxl3lqxujt.R.flushNeeded();}}
}
