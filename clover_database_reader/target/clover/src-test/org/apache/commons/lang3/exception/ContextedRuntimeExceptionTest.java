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
package org.apache.commons.lang3.exception;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

/**
 * JUnit tests for ContextedRuntimeException.
 */
public class ContextedRuntimeExceptionTest extends AbstractExceptionContextTest<ContextedRuntimeException> {static class __CLR4_1_2qu0qu0l3lqxump{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,34823,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    @Override
    @Before
    public void setUp() throws Exception {try{__CLR4_1_2qu0qu0l3lqxump.R.inc(34776);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34777);exceptionContext = new ContextedRuntimeException(new Exception(TEST_MESSAGE));
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34778);super.setUp();
    }finally{__CLR4_1_2qu0qu0l3lqxump.R.flushNeeded();}}

    @Test
    public void testContextedException() {__CLR4_1_2qu0qu0l3lqxump.R.globalSliceStart(getClass().getName(),34779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bsrjayqu3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qu0qu0l3lqxump.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qu0qu0l3lqxump.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testContextedException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34779,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bsrjayqu3(){try{__CLR4_1_2qu0qu0l3lqxump.R.inc(34779);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34780);exceptionContext = new ContextedRuntimeException();
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34781);final String message = exceptionContext.getMessage();
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34782);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34783);assertTrue(trace.indexOf("ContextedException")>=0);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34784);assertTrue(StringUtils.isEmpty(message));
    }finally{__CLR4_1_2qu0qu0l3lqxump.R.flushNeeded();}}

    @Test
    public void testContextedExceptionString() {__CLR4_1_2qu0qu0l3lqxump.R.globalSliceStart(getClass().getName(),34785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29iknn9qu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qu0qu0l3lqxump.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qu0qu0l3lqxump.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testContextedExceptionString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34785,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29iknn9qu9(){try{__CLR4_1_2qu0qu0l3lqxump.R.inc(34785);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34786);exceptionContext = new ContextedRuntimeException(TEST_MESSAGE);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34787);assertEquals(TEST_MESSAGE, exceptionContext.getMessage());
        
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34788);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34789);assertTrue(trace.indexOf(TEST_MESSAGE)>=0);
    }finally{__CLR4_1_2qu0qu0l3lqxump.R.flushNeeded();}}

    @Test
    public void testContextedExceptionThrowable() {__CLR4_1_2qu0qu0l3lqxump.R.globalSliceStart(getClass().getName(),34790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b0gvhoque();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qu0qu0l3lqxump.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qu0qu0l3lqxump.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testContextedExceptionThrowable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34790,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b0gvhoque(){try{__CLR4_1_2qu0qu0l3lqxump.R.inc(34790);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34791);exceptionContext = new ContextedRuntimeException(new Exception(TEST_MESSAGE));
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34792);final String message = exceptionContext.getMessage();
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34793);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34794);assertTrue(trace.indexOf("ContextedException")>=0);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34795);assertTrue(trace.indexOf(TEST_MESSAGE)>=0);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34796);assertTrue(message.indexOf(TEST_MESSAGE)>=0);
    }finally{__CLR4_1_2qu0qu0l3lqxump.R.flushNeeded();}}

    @Test
    public void testContextedExceptionStringThrowable() {__CLR4_1_2qu0qu0l3lqxump.R.globalSliceStart(getClass().getName(),34797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j1qehvqul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qu0qu0l3lqxump.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qu0qu0l3lqxump.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testContextedExceptionStringThrowable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34797,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j1qehvqul(){try{__CLR4_1_2qu0qu0l3lqxump.R.inc(34797);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34798);exceptionContext = new ContextedRuntimeException(TEST_MESSAGE_2, new Exception(TEST_MESSAGE));
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34799);final String message = exceptionContext.getMessage();
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34800);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34801);assertTrue(trace.indexOf("ContextedException")>=0);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34802);assertTrue(trace.indexOf(TEST_MESSAGE)>=0);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34803);assertTrue(trace.indexOf(TEST_MESSAGE_2)>=0);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34804);assertTrue(message.indexOf(TEST_MESSAGE_2)>=0);
    }finally{__CLR4_1_2qu0qu0l3lqxump.R.flushNeeded();}}
    
    @Test
    public void testContextedExceptionStringThrowableContext() {__CLR4_1_2qu0qu0l3lqxump.R.globalSliceStart(getClass().getName(),34805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2z5npayqut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qu0qu0l3lqxump.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qu0qu0l3lqxump.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testContextedExceptionStringThrowableContext",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34805,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2z5npayqut(){try{__CLR4_1_2qu0qu0l3lqxump.R.inc(34805);
        // Use an anonymous subclass to make sure users can provide custom implementations
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34806);exceptionContext = new ContextedRuntimeException(TEST_MESSAGE_2, new Exception(TEST_MESSAGE), new DefaultExceptionContext() {});
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34807);final String message = exceptionContext.getMessage();
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34808);final String trace = ExceptionUtils.getStackTrace(exceptionContext);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34809);assertTrue(trace.indexOf("ContextedException")>=0);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34810);assertTrue(trace.indexOf(TEST_MESSAGE)>=0);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34811);assertTrue(trace.indexOf(TEST_MESSAGE_2)>=0);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34812);assertTrue(message.indexOf(TEST_MESSAGE_2)>=0);
    }finally{__CLR4_1_2qu0qu0l3lqxump.R.flushNeeded();}}

    @Test
    public void testNullExceptionPassing() {__CLR4_1_2qu0qu0l3lqxump.R.globalSliceStart(getClass().getName(),34813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n2zwo2qv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qu0qu0l3lqxump.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qu0qu0l3lqxump.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testNullExceptionPassing",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34813,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n2zwo2qv1(){try{__CLR4_1_2qu0qu0l3lqxump.R.inc(34813);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34814);exceptionContext = new ContextedRuntimeException(TEST_MESSAGE_2, new Exception(TEST_MESSAGE), null)
        .addContextValue("test1", null)
        .addContextValue("test2", "some value")
        .addContextValue("test Date", new Date())
        .addContextValue("test Nbr", Integer.valueOf(5))
        .addContextValue("test Poorly written obj", new ObjectWithFaultyToString());
        
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34815);final String message = exceptionContext.getMessage();
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34816);assertTrue(message != null);
    }finally{__CLR4_1_2qu0qu0l3lqxump.R.flushNeeded();}}

    @Test
    public void testRawMessage() {__CLR4_1_2qu0qu0l3lqxump.R.globalSliceStart(getClass().getName(),34817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25rv2zsqv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qu0qu0l3lqxump.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qu0qu0l3lqxump.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testRawMessage",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34817,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25rv2zsqv5(){try{__CLR4_1_2qu0qu0l3lqxump.R.inc(34817);
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34818);assertEquals(Exception.class.getName() + ": " + TEST_MESSAGE, exceptionContext.getRawMessage());
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34819);exceptionContext = new ContextedRuntimeException(TEST_MESSAGE_2, new Exception(TEST_MESSAGE), new DefaultExceptionContext());
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34820);assertEquals(TEST_MESSAGE_2, exceptionContext.getRawMessage());
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34821);exceptionContext = new ContextedRuntimeException(null, new Exception(TEST_MESSAGE), new DefaultExceptionContext());
        __CLR4_1_2qu0qu0l3lqxump.R.inc(34822);assertNull(exceptionContext.getRawMessage());
    }finally{__CLR4_1_2qu0qu0l3lqxump.R.flushNeeded();}}
}
