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
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * Test class for {@link ConcurrentUtils}.
 *
 * @version $Id$
 */
public class ConcurrentUtilsTest {static class __CLR4_1_2q44q44l3lqxukh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,34049,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Tests creating a ConcurrentException with a runtime exception as cause.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConcurrentExceptionCauseUnchecked() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j73lgyq44();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,99,117,114,114,101,110,116,69,120,99,101,112,116,105,111,110,67,97,117,115,101,85,110,99,104,101,99,107,101,100,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseUnchecked",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33844,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j73lgyq44(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33844);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33845);new ConcurrentException(new RuntimeException());
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests creating a ConcurrentException with an error as cause.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConcurrentExceptionCauseError() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23kr3kcq46();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,99,117,114,114,101,110,116,69,120,99,101,112,116,105,111,110,67,97,117,115,101,69,114,114,111,114,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseError",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33846,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23kr3kcq46(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33846);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33847);new ConcurrentException("An error", new Error());
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests creating a ConcurrentException with null as cause.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConcurrentExceptionCauseNull() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2c4fg33q48();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,99,117,114,114,101,110,116,69,120,99,101,112,116,105,111,110,67,97,117,115,101,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentExceptionCauseNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33848,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2c4fg33q48(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33848);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33849);new ConcurrentException(null);
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tries to create a ConcurrentRuntimeException with a runtime as cause.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConcurrentRuntimeExceptionCauseUnchecked() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2t2px9oq4a();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,99,117,114,114,101,110,116,82,117,110,116,105,109,101,69,120,99,101,112,116,105,111,110,67,97,117,115,101,85,110,99,104,101,99,107,101,100,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseUnchecked",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33850,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2t2px9oq4a(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33850);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33851);new ConcurrentRuntimeException(new RuntimeException());
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tries to create a ConcurrentRuntimeException with an error as cause.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConcurrentRuntimeExceptionCauseError() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21dwqo6q4c();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,99,117,114,114,101,110,116,82,117,110,116,105,109,101,69,120,99,101,112,116,105,111,110,67,97,117,115,101,69,114,114,111,114,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseError",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33852,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21dwqo6q4c(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33852);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33853);new ConcurrentRuntimeException("An error", new Error());
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tries to create a ConcurrentRuntimeException with null as cause.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConcurrentRuntimeExceptionCauseNull() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xmrzvbq4e();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,99,117,114,114,101,110,116,82,117,110,116,105,109,101,69,120,99,101,112,116,105,111,110,67,97,117,115,101,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConcurrentRuntimeExceptionCauseNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33854,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xmrzvbq4e(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33854);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33855);new ConcurrentRuntimeException(null);
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests extractCause() for a null exception.
     */
    @Test
    public void testExtractCauseNull() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tal59kq4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33856,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tal59kq4g(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33856);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33857);assertNull("Non null result", ConcurrentUtils.extractCause(null));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests extractCause() if the cause of the passed in exception is null.
     */
    @Test
    public void testExtractCauseNullCause() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vw4pzlq4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseNullCause",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33858,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vw4pzlq4i(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33858);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33859);assertNull("Non null result", ConcurrentUtils
                .extractCause(new ExecutionException("Test", null)));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests extractCause() if the cause is an error.
     */
    @Test
    public void testExtractCauseError() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28y8hw5q4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseError",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33860,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28y8hw5q4k(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33860);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33861);final Error err = new AssertionError("Test");
        __CLR4_1_2q44q44l3lqxukh.R.inc(33862);try {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33863);ConcurrentUtils.extractCause(new ExecutionException(err));
            __CLR4_1_2q44q44l3lqxukh.R.inc(33864);fail("Error not thrown!");
        } catch (final Error e) {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33865);assertEquals("Wrong error", err, e);
        }
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests extractCause() if the cause is an unchecked exception.
     */
    @Test
    public void testExtractCauseUncheckedException() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w8etzyq4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33866,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w8etzyq4q(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33866);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33867);final RuntimeException rex = new RuntimeException("Test");
        __CLR4_1_2q44q44l3lqxukh.R.inc(33868);try {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33869);ConcurrentUtils.extractCause(new ExecutionException(rex));
            __CLR4_1_2q44q44l3lqxukh.R.inc(33870);fail("Runtime exception not thrown!");
        } catch (final RuntimeException r) {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33871);assertEquals("Wrong exception", rex, r);
        }
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests extractCause() if the cause is a checked exception.
     */
    @Test
    public void testExtractCauseChecked() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29ov0esq4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseChecked",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33872,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29ov0esq4w(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33872);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33873);final Exception ex = new Exception("Test");
        __CLR4_1_2q44q44l3lqxukh.R.inc(33874);final ConcurrentException cex = ConcurrentUtils
                .extractCause(new ExecutionException(ex));
        __CLR4_1_2q44q44l3lqxukh.R.inc(33875);assertSame("Wrong cause", ex, cex.getCause());
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests extractCauseUnchecked() for a null exception.
     */
    @Test
    public void testExtractCauseUncheckedNull() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27jgo76q50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33876,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27jgo76q50(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33876);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33877);assertNull("Non null result", ConcurrentUtils.extractCauseUnchecked(null));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests extractCauseUnchecked() if the cause of the passed in exception is null.
     */
    @Test
    public void testExtractCauseUncheckedNullCause() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zi3gutq52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedNullCause",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33878,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zi3gutq52(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33878);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33879);assertNull("Non null result", ConcurrentUtils
                .extractCauseUnchecked(new ExecutionException("Test", null)));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests extractCauseUnchecked() if the cause is an error.
     */
    @Test
    public void testExtractCauseUncheckedError() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q4lpdxq54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedError",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33880,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q4lpdxq54(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33880);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33881);final Error err = new AssertionError("Test");
        __CLR4_1_2q44q44l3lqxukh.R.inc(33882);try {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33883);ConcurrentUtils.extractCauseUnchecked(new ExecutionException(err));
            __CLR4_1_2q44q44l3lqxukh.R.inc(33884);fail("Error not thrown!");
        } catch (final Error e) {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33885);assertEquals("Wrong error", err, e);
        }
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests extractCauseUnchecked() if the cause is an unchecked exception.
     */
    @Test
    public void testExtractCauseUncheckedUncheckedException() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d0qv98q5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedUncheckedException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33886,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d0qv98q5a(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33886);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33887);final RuntimeException rex = new RuntimeException("Test");
        __CLR4_1_2q44q44l3lqxukh.R.inc(33888);try {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33889);ConcurrentUtils.extractCauseUnchecked(new ExecutionException(rex));
            __CLR4_1_2q44q44l3lqxukh.R.inc(33890);fail("Runtime exception not thrown!");
        } catch (final RuntimeException r) {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33891);assertEquals("Wrong exception", rex, r);
        }
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests extractCauseUnchecked() if the cause is a checked exception.
     */
    @Test
    public void testExtractCauseUncheckedChecked() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wfzapyq5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testExtractCauseUncheckedChecked",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33892,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wfzapyq5g(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33892);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33893);final Exception ex = new Exception("Test");
        __CLR4_1_2q44q44l3lqxukh.R.inc(33894);final ConcurrentRuntimeException cex = ConcurrentUtils
                .extractCauseUnchecked(new ExecutionException(ex));
        __CLR4_1_2q44q44l3lqxukh.R.inc(33895);assertSame("Wrong cause", ex, cex.getCause());
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests handleCause() if the cause is an error.
     */
    @Test
    public void testHandleCauseError() throws ConcurrentException {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iwrmf4q5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseError",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33896,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iwrmf4q5k() throws ConcurrentException{try{__CLR4_1_2q44q44l3lqxukh.R.inc(33896);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33897);final Error err = new AssertionError("Test");
        __CLR4_1_2q44q44l3lqxukh.R.inc(33898);try {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33899);ConcurrentUtils.handleCause(new ExecutionException(err));
            __CLR4_1_2q44q44l3lqxukh.R.inc(33900);fail("Error not thrown!");
        } catch (final Error e) {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33901);assertEquals("Wrong error", err, e);
        }
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests handleCause() if the cause is an unchecked exception.
     */
    @Test
    public void testHandleCauseUncheckedException() throws ConcurrentException {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nteiaxq5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33902,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nteiaxq5q() throws ConcurrentException{try{__CLR4_1_2q44q44l3lqxukh.R.inc(33902);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33903);final RuntimeException rex = new RuntimeException("Test");
        __CLR4_1_2q44q44l3lqxukh.R.inc(33904);try {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33905);ConcurrentUtils.handleCause(new ExecutionException(rex));
            __CLR4_1_2q44q44l3lqxukh.R.inc(33906);fail("Runtime exception not thrown!");
        } catch (final RuntimeException r) {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33907);assertEquals("Wrong exception", rex, r);
        }
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests handleCause() if the cause is a checked exception.
     */
    @Test
    public void testHandleCauseChecked() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28osjsxq5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseChecked",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33908,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28osjsxq5w(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33908);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33909);final Exception ex = new Exception("Test");
        __CLR4_1_2q44q44l3lqxukh.R.inc(33910);try {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33911);ConcurrentUtils.handleCause(new ExecutionException(ex));
            __CLR4_1_2q44q44l3lqxukh.R.inc(33912);fail("ConcurrentException not thrown!");
        } catch (final ConcurrentException cex) {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33913);assertEquals("Wrong cause", ex, cex.getCause());
        }
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests handleCause() for a null parameter or a null cause. In this case
     * the method should do nothing. We can only test that no exception is
     * thrown.
     */
    @Test
    public void testHandleCauseNull() throws ConcurrentException {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yjhwdfq62();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33914,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yjhwdfq62() throws ConcurrentException{try{__CLR4_1_2q44q44l3lqxukh.R.inc(33914);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33915);ConcurrentUtils.handleCause(null);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33916);ConcurrentUtils.handleCause(new ExecutionException("Test", null));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests handleCauseUnchecked() if the cause is an error.
     */
    @Test
    public void testHandleCauseUncheckedError() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ioktn4q65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedError",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33917,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ioktn4q65(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33917);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33918);final Error err = new AssertionError("Test");
        __CLR4_1_2q44q44l3lqxukh.R.inc(33919);try {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33920);ConcurrentUtils.handleCauseUnchecked(new ExecutionException(err));
            __CLR4_1_2q44q44l3lqxukh.R.inc(33921);fail("Error not thrown!");
        } catch (final Error e) {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33922);assertEquals("Wrong error", err, e);
        }
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests handleCauseUnchecked() if the cause is an unchecked exception.
     */
    @Test
    public void testHandleCauseUncheckedUncheckedException() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_270v5jtq6b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedUncheckedException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33923,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_270v5jtq6b(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33923);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33924);final RuntimeException rex = new RuntimeException("Test");
        __CLR4_1_2q44q44l3lqxukh.R.inc(33925);try {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33926);ConcurrentUtils.handleCauseUnchecked(new ExecutionException(rex));
            __CLR4_1_2q44q44l3lqxukh.R.inc(33927);fail("Runtime exception not thrown!");
        } catch (final RuntimeException r) {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33928);assertEquals("Wrong exception", rex, r);
        }
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests handleCauseUnchecked() if the cause is a checked exception.
     */
    @Test
    public void testHandleCauseUncheckedChecked() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j8amb3q6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedChecked",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33929,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j8amb3q6h(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33929);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33930);final Exception ex = new Exception("Test");
        __CLR4_1_2q44q44l3lqxukh.R.inc(33931);try {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33932);ConcurrentUtils.handleCauseUnchecked(new ExecutionException(ex));
            __CLR4_1_2q44q44l3lqxukh.R.inc(33933);fail("ConcurrentRuntimeException not thrown!");
        } catch (final ConcurrentRuntimeException crex) {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33934);assertEquals("Wrong cause", ex, crex.getCause());
        }
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests handleCauseUnchecked() for a null parameter or a null cause. In
     * this case the method should do nothing. We can only test that no
     * exception is thrown.
     */
    @Test
    public void testHandleCauseUncheckedNull() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j8jodpq6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testHandleCauseUncheckedNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33935,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j8jodpq6n(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33935);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33936);ConcurrentUtils.handleCauseUnchecked(null);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33937);ConcurrentUtils.handleCauseUnchecked(new ExecutionException("Test",
                null));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests initialize() for a null argument.
     */
    @Test
    public void testInitializeNull() throws ConcurrentException {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w3dh1sq6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33938,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w3dh1sq6q() throws ConcurrentException{try{__CLR4_1_2q44q44l3lqxukh.R.inc(33938);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33939);assertNull("Got a result", ConcurrentUtils.initialize(null));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests a successful initialize() operation.
     */
    @Test
    public void testInitialize() throws ConcurrentException {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33940);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25j52d3q6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitialize",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33940,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25j52d3q6s() throws ConcurrentException{try{__CLR4_1_2q44q44l3lqxukh.R.inc(33940);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33941);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Object> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33942);final Object result = new Object();
        __CLR4_1_2q44q44l3lqxukh.R.inc(33943);EasyMock.expect(init.get()).andReturn(result);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33944);EasyMock.replay(init);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33945);assertSame("Wrong result object", result, ConcurrentUtils
                .initialize(init));
        __CLR4_1_2q44q44l3lqxukh.R.inc(33946);EasyMock.verify(init);
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests initializeUnchecked() for a null argument.
     */
    @Test
    public void testInitializeUncheckedNull() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2di05yeq6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUncheckedNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33947,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2di05yeq6z(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33947);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33948);assertNull("Got a result", ConcurrentUtils.initializeUnchecked(null));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests a successful initializeUnchecked() operation.
     */
    @Test
    public void testInitializeUnchecked() throws ConcurrentException {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24mgpnxq71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUnchecked",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33949,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24mgpnxq71() throws ConcurrentException{try{__CLR4_1_2q44q44l3lqxukh.R.inc(33949);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33950);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Object> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33951);final Object result = new Object();
        __CLR4_1_2q44q44l3lqxukh.R.inc(33952);EasyMock.expect(init.get()).andReturn(result);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33953);EasyMock.replay(init);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33954);assertSame("Wrong result object", result, ConcurrentUtils
                .initializeUnchecked(init));
        __CLR4_1_2q44q44l3lqxukh.R.inc(33955);EasyMock.verify(init);
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests whether exceptions are correctly handled by initializeUnchecked().
     */
    @Test
    public void testInitializeUncheckedEx() throws ConcurrentException {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_298uut6q78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testInitializeUncheckedEx",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33956,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_298uut6q78() throws ConcurrentException{try{__CLR4_1_2q44q44l3lqxukh.R.inc(33956);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33957);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Object> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33958);final Exception cause = new Exception();
        __CLR4_1_2q44q44l3lqxukh.R.inc(33959);EasyMock.expect(init.get()).andThrow(new ConcurrentException(cause));
        __CLR4_1_2q44q44l3lqxukh.R.inc(33960);EasyMock.replay(init);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33961);try {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33962);ConcurrentUtils.initializeUnchecked(init);
            __CLR4_1_2q44q44l3lqxukh.R.inc(33963);fail("Exception not thrown!");
        } catch (final ConcurrentRuntimeException crex) {
            __CLR4_1_2q44q44l3lqxukh.R.inc(33964);assertSame("Wrong cause", cause, crex.getCause());
        }
        __CLR4_1_2q44q44l3lqxukh.R.inc(33965);EasyMock.verify(init);
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests constant future.
     */
    @Test
    public void testConstantFuture_Integer() throws Exception {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wm2cinq7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_Integer",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33966,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wm2cinq7i() throws Exception{try{__CLR4_1_2q44q44l3lqxukh.R.inc(33966);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33967);final Integer value = Integer.valueOf(5);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33968);final Future<Integer> test = ConcurrentUtils.constantFuture(value);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33969);assertTrue(test.isDone());
        __CLR4_1_2q44q44l3lqxukh.R.inc(33970);assertSame(value, test.get());
        __CLR4_1_2q44q44l3lqxukh.R.inc(33971);assertSame(value, test.get(1000, TimeUnit.SECONDS));
        __CLR4_1_2q44q44l3lqxukh.R.inc(33972);assertSame(value, test.get(1000, null));
        __CLR4_1_2q44q44l3lqxukh.R.inc(33973);assertFalse(test.isCancelled());
        __CLR4_1_2q44q44l3lqxukh.R.inc(33974);assertFalse(test.cancel(true));
        __CLR4_1_2q44q44l3lqxukh.R.inc(33975);assertFalse(test.cancel(false));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests constant future.
     */
    @Test
    public void testConstantFuture_null() throws Exception {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xwkvskq7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testConstantFuture_null",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33976,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xwkvskq7s() throws Exception{try{__CLR4_1_2q44q44l3lqxukh.R.inc(33976);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33977);final Integer value = null;
        __CLR4_1_2q44q44l3lqxukh.R.inc(33978);final Future<Integer> test = ConcurrentUtils.constantFuture(value);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33979);assertTrue(test.isDone());
        __CLR4_1_2q44q44l3lqxukh.R.inc(33980);assertSame(value, test.get());
        __CLR4_1_2q44q44l3lqxukh.R.inc(33981);assertSame(value, test.get(1000, TimeUnit.SECONDS));
        __CLR4_1_2q44q44l3lqxukh.R.inc(33982);assertSame(value, test.get(1000, null));
        __CLR4_1_2q44q44l3lqxukh.R.inc(33983);assertFalse(test.isCancelled());
        __CLR4_1_2q44q44l3lqxukh.R.inc(33984);assertFalse(test.cancel(true));
        __CLR4_1_2q44q44l3lqxukh.R.inc(33985);assertFalse(test.cancel(false));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests putIfAbsent() if the map contains the key in question.
     */
    @Test
    public void testPutIfAbsentKeyPresent() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lxlmgaq82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testPutIfAbsentKeyPresent",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33986,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lxlmgaq82(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33986);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33987);final String key = "testKey";
        __CLR4_1_2q44q44l3lqxukh.R.inc(33988);final Integer value = 42;
        __CLR4_1_2q44q44l3lqxukh.R.inc(33989);final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        __CLR4_1_2q44q44l3lqxukh.R.inc(33990);map.put(key, value);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33991);assertEquals("Wrong result", value,
                ConcurrentUtils.putIfAbsent(map, key, 0));
        __CLR4_1_2q44q44l3lqxukh.R.inc(33992);assertEquals("Wrong value in map", value, map.get(key));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests putIfAbsent() if the map does not contain the key in question.
     */
    @Test
    public void testPutIfAbsentKeyNotPresent() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25ngipnq89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testPutIfAbsentKeyNotPresent",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33993,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25ngipnq89(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33993);
        __CLR4_1_2q44q44l3lqxukh.R.inc(33994);final String key = "testKey";
        __CLR4_1_2q44q44l3lqxukh.R.inc(33995);final Integer value = 42;
        __CLR4_1_2q44q44l3lqxukh.R.inc(33996);final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        __CLR4_1_2q44q44l3lqxukh.R.inc(33997);assertEquals("Wrong result", value,
                ConcurrentUtils.putIfAbsent(map, key, value));
        __CLR4_1_2q44q44l3lqxukh.R.inc(33998);assertEquals("Wrong value in map", value, map.get(key));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests putIfAbsent() if a null map is passed in.
     */
    @Test
    public void testPutIfAbsentNullMap() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),33999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dsak15q8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testPutIfAbsentNullMap",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33999,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dsak15q8f(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(33999);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34000);assertNull("Wrong result",
                ConcurrentUtils.putIfAbsent(null, "test", 100));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests createIfAbsent() if the key is found in the map.
     */
    @Test
    public void testCreateIfAbsentKeyPresent() throws ConcurrentException {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),34001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tqh1hjq8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentKeyPresent",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34001,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tqh1hjq8h() throws ConcurrentException{try{__CLR4_1_2q44q44l3lqxukh.R.inc(34001);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34002);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Integer> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34003);EasyMock.replay(init);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34004);final String key = "testKey";
        __CLR4_1_2q44q44l3lqxukh.R.inc(34005);final Integer value = 42;
        __CLR4_1_2q44q44l3lqxukh.R.inc(34006);final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        __CLR4_1_2q44q44l3lqxukh.R.inc(34007);map.put(key, value);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34008);assertEquals("Wrong result", value,
                ConcurrentUtils.createIfAbsent(map, key, init));
        __CLR4_1_2q44q44l3lqxukh.R.inc(34009);assertEquals("Wrong value in map", value, map.get(key));
        __CLR4_1_2q44q44l3lqxukh.R.inc(34010);EasyMock.verify(init);
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests createIfAbsent() if the map does not contain the key in question.
     */
    @Test
    public void testCreateIfAbsentKeyNotPresent() throws ConcurrentException {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),34011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2stzpt6q8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentKeyNotPresent",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34011,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2stzpt6q8r() throws ConcurrentException{try{__CLR4_1_2q44q44l3lqxukh.R.inc(34011);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34012);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Integer> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34013);final String key = "testKey";
        __CLR4_1_2q44q44l3lqxukh.R.inc(34014);final Integer value = 42;
        __CLR4_1_2q44q44l3lqxukh.R.inc(34015);EasyMock.expect(init.get()).andReturn(value);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34016);EasyMock.replay(init);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34017);final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        __CLR4_1_2q44q44l3lqxukh.R.inc(34018);assertEquals("Wrong result", value,
                ConcurrentUtils.createIfAbsent(map, key, init));
        __CLR4_1_2q44q44l3lqxukh.R.inc(34019);assertEquals("Wrong value in map", value, map.get(key));
        __CLR4_1_2q44q44l3lqxukh.R.inc(34020);EasyMock.verify(init);
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests createIfAbsent() if a null map is passed in.
     */
    @Test
    public void testCreateIfAbsentNullMap() throws ConcurrentException {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),34021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21l0tuwq91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentNullMap",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34021,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21l0tuwq91() throws ConcurrentException{try{__CLR4_1_2q44q44l3lqxukh.R.inc(34021);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34022);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Integer> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34023);EasyMock.replay(init);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34024);assertNull("Wrong result",
                ConcurrentUtils.createIfAbsent(null, "test", init));
        __CLR4_1_2q44q44l3lqxukh.R.inc(34025);EasyMock.verify(init);
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests createIfAbsent() if a null initializer is passed in.
     */
    @Test
    public void testCreateIfAbsentNullInit() throws ConcurrentException {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),34026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o0yhc2q96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentNullInit",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34026,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o0yhc2q96() throws ConcurrentException{try{__CLR4_1_2q44q44l3lqxukh.R.inc(34026);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34027);final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        __CLR4_1_2q44q44l3lqxukh.R.inc(34028);final String key = "testKey";
        __CLR4_1_2q44q44l3lqxukh.R.inc(34029);final Integer value = 42;
        __CLR4_1_2q44q44l3lqxukh.R.inc(34030);map.put(key, value);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34031);assertNull("Wrong result",
                ConcurrentUtils.createIfAbsent(map, key, null));
        __CLR4_1_2q44q44l3lqxukh.R.inc(34032);assertEquals("Map was changed", value, map.get(key));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests createIfAbsentUnchecked() if no exception is thrown.
     */
    @Test
    public void testCreateIfAbsentUncheckedSuccess() {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),34033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22gzuoq9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentUncheckedSuccess",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34033,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22gzuoq9d(){try{__CLR4_1_2q44q44l3lqxukh.R.inc(34033);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34034);final String key = "testKey";
        __CLR4_1_2q44q44l3lqxukh.R.inc(34035);final Integer value = 42;
        __CLR4_1_2q44q44l3lqxukh.R.inc(34036);final ConcurrentMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
        __CLR4_1_2q44q44l3lqxukh.R.inc(34037);assertEquals("Wrong result", value,
                ConcurrentUtils.createIfAbsentUnchecked(map, key,
                        new ConstantInitializer<Integer>(value)));
        __CLR4_1_2q44q44l3lqxukh.R.inc(34038);assertEquals("Wrong value in map", value, map.get(key));
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}

    /**
     * Tests createIfAbsentUnchecked() if an exception is thrown.
     */
    @Test
    public void testCreateIfAbsentUncheckedException()
            throws ConcurrentException {__CLR4_1_2q44q44l3lqxukh.R.globalSliceStart(getClass().getName(),34039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r38yx8q9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q44q44l3lqxukh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q44q44l3lqxukh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConcurrentUtilsTest.testCreateIfAbsentUncheckedException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34039,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r38yx8q9j() throws ConcurrentException{try{__CLR4_1_2q44q44l3lqxukh.R.inc(34039);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34040);@SuppressWarnings("unchecked")
        final
        ConcurrentInitializer<Integer> init = EasyMock
                .createMock(ConcurrentInitializer.class);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34041);final Exception ex = new Exception();
        __CLR4_1_2q44q44l3lqxukh.R.inc(34042);EasyMock.expect(init.get()).andThrow(new ConcurrentException(ex));
        __CLR4_1_2q44q44l3lqxukh.R.inc(34043);EasyMock.replay(init);
        __CLR4_1_2q44q44l3lqxukh.R.inc(34044);try {
            __CLR4_1_2q44q44l3lqxukh.R.inc(34045);ConcurrentUtils.createIfAbsentUnchecked(
                    new ConcurrentHashMap<String, Integer>(), "test", init);
            __CLR4_1_2q44q44l3lqxukh.R.inc(34046);fail("Exception not thrown!");
        } catch (final ConcurrentRuntimeException crex) {
            __CLR4_1_2q44q44l3lqxukh.R.inc(34047);assertEquals("Wrong cause", ex, crex.getCause());
        }
        __CLR4_1_2q44q44l3lqxukh.R.inc(34048);EasyMock.verify(init);
    }finally{__CLR4_1_2q44q44l3lqxukh.R.flushNeeded();}}
}
