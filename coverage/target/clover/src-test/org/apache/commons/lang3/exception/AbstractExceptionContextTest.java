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

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.tuple.Pair;


/**
 * Abstract test of an ExceptionContext implementation.
 */
public abstract class AbstractExceptionContextTest<T extends ExceptionContext & Serializable> {static class __CLR4_1_2qqdqqdl3lqxumb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,34729,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected static final String TEST_MESSAGE_2 = "This is monotonous";
    protected static final String TEST_MESSAGE = "Test Message";
    protected T exceptionContext;

    protected static class ObjectWithFaultyToString {
        @Override
        public String toString() {try{__CLR4_1_2qqdqqdl3lqxumb.R.inc(34645);
            __CLR4_1_2qqdqqdl3lqxumb.R.inc(34646);throw new RuntimeException("Crap");
        }finally{__CLR4_1_2qqdqqdl3lqxumb.R.flushNeeded();}}
    }


    @Before
    public void setUp() throws Exception {try{__CLR4_1_2qqdqqdl3lqxumb.R.inc(34647);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34648);exceptionContext
            .addContextValue("test1", null)
            .addContextValue("test2", "some value")
            .addContextValue("test Date", new Date())
            .addContextValue("test Nbr", Integer.valueOf(5))
            .addContextValue("test Poorly written obj", new ObjectWithFaultyToString());
    }finally{__CLR4_1_2qqdqqdl3lqxumb.R.flushNeeded();}}

    @Test
    public void testAddContextValue() {__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceStart(getClass().getName(),34649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bjv62wqqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qqdqqdl3lqxumb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testAddContextValue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34649,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bjv62wqqh(){try{__CLR4_1_2qqdqqdl3lqxumb.R.inc(34649);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34650);final String message = exceptionContext.getFormattedExceptionMessage(TEST_MESSAGE);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34651);assertTrue(message.indexOf(TEST_MESSAGE) >= 0);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34652);assertTrue(message.indexOf("test1") >= 0);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34653);assertTrue(message.indexOf("test2") >= 0);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34654);assertTrue(message.indexOf("test Date") >= 0);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34655);assertTrue(message.indexOf("test Nbr") >= 0);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34656);assertTrue(message.indexOf("some value") >= 0);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34657);assertTrue(message.indexOf("5") >= 0);

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34658);assertTrue(exceptionContext.getFirstContextValue("test1") == null);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34659);assertTrue(exceptionContext.getFirstContextValue("test2").equals("some value"));

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34660);assertEquals(5, exceptionContext.getContextLabels().size());
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34661);assertTrue(exceptionContext.getContextLabels().contains("test1"));
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34662);assertTrue(exceptionContext.getContextLabels().contains("test2"));
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34663);assertTrue(exceptionContext.getContextLabels().contains("test Date"));
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34664);assertTrue(exceptionContext.getContextLabels().contains("test Nbr"));

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34665);exceptionContext.addContextValue("test2", "different value");
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34666);assertEquals(5, exceptionContext.getContextLabels().size());
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34667);assertTrue(exceptionContext.getContextLabels().contains("test2"));

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34668);final String contextMessage = exceptionContext.getFormattedExceptionMessage(null);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34669);assertTrue(contextMessage.indexOf(TEST_MESSAGE) == -1);
    }finally{__CLR4_1_2qqdqqdl3lqxumb.R.flushNeeded();}}

    @Test
    public void testSetContextValue() {__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceStart(getClass().getName(),34670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tvu3rtqr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qqdqqdl3lqxumb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testSetContextValue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34670,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tvu3rtqr2(){try{__CLR4_1_2qqdqqdl3lqxumb.R.inc(34670);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34671);exceptionContext.addContextValue("test2", "different value");
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34672);exceptionContext.setContextValue("test3", "3");

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34673);final String message = exceptionContext.getFormattedExceptionMessage(TEST_MESSAGE);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34674);assertTrue(message.indexOf(TEST_MESSAGE) >= 0);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34675);assertTrue(message.indexOf("test Poorly written obj") >= 0);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34676);assertTrue(message.indexOf("Crap") >= 0);

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34677);assertTrue(exceptionContext.getFirstContextValue("crap") == null);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34678);assertTrue(exceptionContext.getFirstContextValue("test Poorly written obj") instanceof ObjectWithFaultyToString);

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34679);assertEquals(7, exceptionContext.getContextEntries().size());
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34680);assertEquals(6, exceptionContext.getContextLabels().size());

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34681);assertTrue(exceptionContext.getContextLabels().contains("test Poorly written obj"));
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34682);assertTrue(!exceptionContext.getContextLabels().contains("crap"));

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34683);exceptionContext.setContextValue("test Poorly written obj", "replacement");

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34684);assertEquals(7, exceptionContext.getContextEntries().size());
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34685);assertEquals(6, exceptionContext.getContextLabels().size());

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34686);exceptionContext.setContextValue("test2", "another");

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34687);assertEquals(6, exceptionContext.getContextEntries().size());
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34688);assertEquals(6, exceptionContext.getContextLabels().size());

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34689);final String contextMessage = exceptionContext.getFormattedExceptionMessage(null);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34690);assertTrue(contextMessage.indexOf(TEST_MESSAGE) == -1);
    }finally{__CLR4_1_2qqdqqdl3lqxumb.R.flushNeeded();}}

    @Test
    public void testGetFirstContextValue() {__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceStart(getClass().getName(),34691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2loxcq3qrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qqdqqdl3lqxumb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testGetFirstContextValue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34691,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2loxcq3qrn(){try{__CLR4_1_2qqdqqdl3lqxumb.R.inc(34691);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34692);exceptionContext.addContextValue("test2", "different value");

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34693);assertTrue(exceptionContext.getFirstContextValue("test1") == null);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34694);assertTrue(exceptionContext.getFirstContextValue("test2").equals("some value"));
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34695);assertTrue(exceptionContext.getFirstContextValue("crap") == null);

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34696);exceptionContext.setContextValue("test2", "another");

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34697);assertTrue(exceptionContext.getFirstContextValue("test2").equals("another"));
    }finally{__CLR4_1_2qqdqqdl3lqxumb.R.flushNeeded();}}

    @Test
    public void testGetContextValues() {__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceStart(getClass().getName(),34698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d4iyloqru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qqdqqdl3lqxumb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testGetContextValues",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34698,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d4iyloqru(){try{__CLR4_1_2qqdqqdl3lqxumb.R.inc(34698);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34699);exceptionContext.addContextValue("test2", "different value");

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34700);assertEquals(exceptionContext.getContextValues("test1"), Collections.singletonList(null));
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34701);assertEquals(exceptionContext.getContextValues("test2"), Arrays.asList("some value", "different value"));

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34702);exceptionContext.setContextValue("test2", "another");

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34703);assertTrue(exceptionContext.getFirstContextValue("test2").equals("another"));
    }finally{__CLR4_1_2qqdqqdl3lqxumb.R.flushNeeded();}}

    @Test
    public void testGetContextLabels() {__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceStart(getClass().getName(),34704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23o6b9tqs0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qqdqqdl3lqxumb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testGetContextLabels",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34704,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23o6b9tqs0(){try{__CLR4_1_2qqdqqdl3lqxumb.R.inc(34704);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34705);assertEquals(5, exceptionContext.getContextEntries().size());
        
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34706);exceptionContext.addContextValue("test2", "different value");

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34707);final Set<String> labels = exceptionContext.getContextLabels();
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34708);assertEquals(6, exceptionContext.getContextEntries().size());
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34709);assertEquals(5, labels.size());
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34710);assertTrue(labels.contains("test1"));
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34711);assertTrue(labels.contains("test2"));
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34712);assertTrue(labels.contains("test Date"));
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34713);assertTrue(labels.contains("test Nbr"));
    }finally{__CLR4_1_2qqdqqdl3lqxumb.R.flushNeeded();}}

    @Test
    public void testGetContextEntries() {__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceStart(getClass().getName(),34714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21nkzd8qsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qqdqqdl3lqxumb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testGetContextEntries",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34714,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21nkzd8qsa(){try{__CLR4_1_2qqdqqdl3lqxumb.R.inc(34714);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34715);assertEquals(5, exceptionContext.getContextEntries().size());
        
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34716);exceptionContext.addContextValue("test2", "different value");

        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34717);final List<Pair<String, Object>> entries = exceptionContext.getContextEntries();
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34718);assertEquals(6, entries.size());
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34719);assertEquals("test1", entries.get(0).getKey());
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34720);assertEquals("test2", entries.get(1).getKey());
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34721);assertEquals("test Date", entries.get(2).getKey());
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34722);assertEquals("test Nbr", entries.get(3).getKey());
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34723);assertEquals("test Poorly written obj", entries.get(4).getKey());
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34724);assertEquals("test2", entries.get(5).getKey());
    }finally{__CLR4_1_2qqdqqdl3lqxumb.R.flushNeeded();}}
    
    @Test
    public void testJavaSerialization() {__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceStart(getClass().getName(),34725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2igcnczqsl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qqdqqdl3lqxumb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qqdqqdl3lqxumb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.exception.AbstractExceptionContextTest.testJavaSerialization",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34725,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2igcnczqsl(){try{__CLR4_1_2qqdqqdl3lqxumb.R.inc(34725);
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34726);exceptionContext.setContextValue("test Poorly written obj", "serializable replacement");
        
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34727);final T clone = SerializationUtils.deserialize(SerializationUtils.serialize(exceptionContext));
        __CLR4_1_2qqdqqdl3lqxumb.R.inc(34728);assertEquals(exceptionContext.getFormattedExceptionMessage(null), clone.getFormattedExceptionMessage(null));
    }finally{__CLR4_1_2qqdqqdl3lqxumb.R.flushNeeded();}}
}
