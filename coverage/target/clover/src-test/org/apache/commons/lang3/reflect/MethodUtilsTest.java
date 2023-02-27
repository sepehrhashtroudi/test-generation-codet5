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
package org.apache.commons.lang3.reflect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests MethodUtils
 * @version $Id$
 */
public class MethodUtilsTest {static class __CLR4_1_2t1ut1ul3lqxuu6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,37817,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
  
    private static interface PrivateInterface {}
    
    static class TestBeanWithInterfaces implements PrivateInterface {
        public String foo() {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37650);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37651);return "foo()";
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}
    }
    
    public static class TestBean {

        public static String bar() {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37652);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37653);return "bar()";
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

        public static String bar(final int i) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37654);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37655);return "bar(int)";
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

        public static String bar(final Integer i) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37656);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37657);return "bar(Integer)";
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

        public static String bar(final double d) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37658);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37659);return "bar(double)";
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

        public static String bar(final String s) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37660);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37661);return "bar(String)";
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

        public static String bar(final Object o) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37662);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37663);return "bar(Object)";
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}
        
        public static void oneParameterStatic(final String s) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37664);
            // empty
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

        @SuppressWarnings("unused")
        private void privateStuff() {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37665);
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}


        public String foo() {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37666);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37667);return "foo()";
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

        public String foo(final int i) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37668);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37669);return "foo(int)";
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

        public String foo(final Integer i) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37670);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37671);return "foo(Integer)";
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

        public String foo(final double d) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37672);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37673);return "foo(double)";
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

        public String foo(final String s) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37674);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37675);return "foo(String)";
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

        public String foo(final Object o) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37676);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37677);return "foo(Object)";
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}
        
        public void oneParameter(final String s) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37678);
            // empty
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}
    }

    private static class TestMutable implements Mutable<Object> {
        @Override
        public Object getValue() {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37679);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37680);return null;
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

        @Override
        public void setValue(final Object value) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37681);
        }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}
    }

    private TestBean testBean;
    private final Map<Class<?>, Class<?>[]> classCache = new HashMap<Class<?>, Class<?>[]>();

    @Before
    public void setUp() throws Exception {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37682);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37683);testBean = new TestBean();
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37684);classCache.clear();
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    @Test
    public void testConstructor() throws Exception {__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceStart(getClass().getName(),37685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8ht2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t1ut1ul3lqxuu6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37685,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8ht2t() throws Exception{try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37685);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37686);assertNotNull(MethodUtils.class.newInstance());
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    @Test
    public void testInvokeMethod() throws Exception {__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceStart(getClass().getName(),37687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s8eck2t2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t1ut1ul3lqxuu6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testInvokeMethod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37687,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s8eck2t2v() throws Exception{try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37687);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37688);assertEquals("foo()", MethodUtils.invokeMethod(testBean, "foo",
                (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37689);assertEquals("foo()", MethodUtils.invokeMethod(testBean, "foo",
                (Object[]) null));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37690);assertEquals("foo()", MethodUtils.invokeMethod(testBean, "foo", 
                (Object[]) null, (Class<?>[]) null));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37691);assertEquals("foo(String)", MethodUtils.invokeMethod(testBean, "foo",
                ""));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37692);assertEquals("foo(Object)", MethodUtils.invokeMethod(testBean, "foo",
                new Object()));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37693);assertEquals("foo(Object)", MethodUtils.invokeMethod(testBean, "foo",
                Boolean.TRUE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37694);assertEquals("foo(Integer)", MethodUtils.invokeMethod(testBean, "foo",
                NumberUtils.INTEGER_ONE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37695);assertEquals("foo(int)", MethodUtils.invokeMethod(testBean, "foo",
                NumberUtils.BYTE_ONE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37696);assertEquals("foo(double)", MethodUtils.invokeMethod(testBean, "foo",
                NumberUtils.LONG_ONE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37697);assertEquals("foo(double)", MethodUtils.invokeMethod(testBean, "foo",
                NumberUtils.DOUBLE_ONE));
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    @Test
    public void testInvokeExactMethod() throws Exception {__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceStart(getClass().getName(),37698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x5qcozt36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t1ut1ul3lqxuu6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testInvokeExactMethod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37698,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x5qcozt36() throws Exception{try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37698);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37699);assertEquals("foo()", MethodUtils.invokeExactMethod(testBean, "foo",
                (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37700);assertEquals("foo()", MethodUtils.invokeExactMethod(testBean, "foo",
                (Object[]) null));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37701);assertEquals("foo()", MethodUtils.invokeExactMethod(testBean, "foo", 
                (Object[]) null, (Class<?>[]) null));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37702);assertEquals("foo(String)", MethodUtils.invokeExactMethod(testBean,
                "foo", ""));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37703);assertEquals("foo(Object)", MethodUtils.invokeExactMethod(testBean,
                "foo", new Object()));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37704);assertEquals("foo(Integer)", MethodUtils.invokeExactMethod(testBean,
                "foo", NumberUtils.INTEGER_ONE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37705);assertEquals("foo(double)", MethodUtils.invokeExactMethod(testBean,
                "foo", new Object[] { NumberUtils.DOUBLE_ONE },
                new Class[] { Double.TYPE }));

        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37706);try {
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37707);MethodUtils
                    .invokeExactMethod(testBean, "foo", NumberUtils.BYTE_ONE);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37708);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37709);try {
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37710);MethodUtils
                    .invokeExactMethod(testBean, "foo", NumberUtils.LONG_ONE);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37711);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37712);try {
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37713);MethodUtils.invokeExactMethod(testBean, "foo", Boolean.TRUE);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37714);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    @Test
    public void testInvokeStaticMethod() throws Exception {__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceStart(getClass().getName(),37715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nmtr1ct3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t1ut1ul3lqxuu6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testInvokeStaticMethod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37715,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nmtr1ct3n() throws Exception{try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37715);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37716);assertEquals("bar()", MethodUtils.invokeStaticMethod(TestBean.class,
                "bar", (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37717);assertEquals("bar()", MethodUtils.invokeStaticMethod(TestBean.class,
                "bar", (Object[]) null));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37718);assertEquals("bar()", MethodUtils.invokeStaticMethod(TestBean.class,
                "bar", (Object[]) null, (Class<?>[]) null));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37719);assertEquals("bar(String)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", ""));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37720);assertEquals("bar(Object)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", new Object()));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37721);assertEquals("bar(Object)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", Boolean.TRUE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37722);assertEquals("bar(Integer)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", NumberUtils.INTEGER_ONE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37723);assertEquals("bar(int)", MethodUtils.invokeStaticMethod(TestBean.class,
                "bar", NumberUtils.BYTE_ONE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37724);assertEquals("bar(double)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", NumberUtils.LONG_ONE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37725);assertEquals("bar(double)", MethodUtils.invokeStaticMethod(
                TestBean.class, "bar", NumberUtils.DOUBLE_ONE));
        
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37726);try {
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37727);MethodUtils.invokeStaticMethod(TestBean.class, "does_not_exist");
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37728);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    @Test
    public void testInvokeExactStaticMethod() throws Exception {__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceStart(getClass().getName(),37729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_297dhytt41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t1ut1ul3lqxuu6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testInvokeExactStaticMethod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_297dhytt41() throws Exception{try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37729);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37730);assertEquals("bar()", MethodUtils.invokeExactStaticMethod(TestBean.class,
                "bar", (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37731);assertEquals("bar()", MethodUtils.invokeExactStaticMethod(TestBean.class,
                "bar", (Object[]) null));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37732);assertEquals("bar()", MethodUtils.invokeExactStaticMethod(TestBean.class,
                "bar", (Object[]) null, (Class<?>[]) null));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37733);assertEquals("bar(String)", MethodUtils.invokeExactStaticMethod(
                TestBean.class, "bar", ""));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37734);assertEquals("bar(Object)", MethodUtils.invokeExactStaticMethod(
                TestBean.class, "bar", new Object()));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37735);assertEquals("bar(Integer)", MethodUtils.invokeExactStaticMethod(
                TestBean.class, "bar", NumberUtils.INTEGER_ONE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37736);assertEquals("bar(double)", MethodUtils.invokeExactStaticMethod(
                TestBean.class, "bar", new Object[] { NumberUtils.DOUBLE_ONE },
                new Class[] { Double.TYPE }));

        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37737);try {
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37738);MethodUtils.invokeExactStaticMethod(TestBean.class, "bar",
                    NumberUtils.BYTE_ONE);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37739);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37740);try {
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37741);MethodUtils.invokeExactStaticMethod(TestBean.class, "bar",
                    NumberUtils.LONG_ONE);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37742);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37743);try {
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37744);MethodUtils.invokeExactStaticMethod(TestBean.class, "bar",
                    Boolean.TRUE);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37745);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    @Test
    public void testGetAccessibleInterfaceMethod() throws Exception {__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceStart(getClass().getName(),37746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2u470h3t4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t1ut1ul3lqxuu6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAccessibleInterfaceMethod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37746,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2u470h3t4i() throws Exception{try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37746);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37747);final Class<?>[][] p = { ArrayUtils.EMPTY_CLASS_ARRAY, null };
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37748);for (final Class<?>[] element : p) {{
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37749);final Method method = TestMutable.class.getMethod("getValue", element);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37750);final Method accessibleMethod = MethodUtils.getAccessibleMethod(method);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37751);assertNotSame(accessibleMethod, method);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37752);assertSame(Mutable.class, accessibleMethod.getDeclaringClass());
        }
    }}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}
    
    @Test
    public void testGetAccessibleMethodPrivateInterface() throws Exception {__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceStart(getClass().getName(),37753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23miewot4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t1ut1ul3lqxuu6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAccessibleMethodPrivateInterface",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37753,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23miewot4p() throws Exception{try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37753);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37754);final Method expected = TestBeanWithInterfaces.class.getMethod("foo");
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37755);assertNotNull(expected);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37756);final Method actual = MethodUtils.getAccessibleMethod(TestBeanWithInterfaces.class, "foo");
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37757);assertNull(actual);
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    @Test
    public void testGetAccessibleInterfaceMethodFromDescription()
            throws Exception {__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceStart(getClass().getName(),37758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pf3uh3t4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t1ut1ul3lqxuu6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAccessibleInterfaceMethodFromDescription",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37758,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pf3uh3t4u() throws Exception{try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37758);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37759);final Class<?>[][] p = { ArrayUtils.EMPTY_CLASS_ARRAY, null };
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37760);for (final Class<?>[] element : p) {{
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37761);final Method accessibleMethod = MethodUtils.getAccessibleMethod(
                    TestMutable.class, "getValue", element);
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37762);assertSame(Mutable.class, accessibleMethod.getDeclaringClass());
        }
    }}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    @Test
    public void testGetAccessiblePublicMethod() throws Exception {__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceStart(getClass().getName(),37763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26rv67pt4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t1ut1ul3lqxuu6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAccessiblePublicMethod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37763,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26rv67pt4z() throws Exception{try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37763);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37764);assertSame(MutableObject.class, MethodUtils.getAccessibleMethod(
                MutableObject.class.getMethod("getValue",
                        ArrayUtils.EMPTY_CLASS_ARRAY)).getDeclaringClass());
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    @Test
    public void testGetAccessiblePublicMethodFromDescription() throws Exception {__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceStart(getClass().getName(),37765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29s4ai3t51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t1ut1ul3lqxuu6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAccessiblePublicMethodFromDescription",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37765,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29s4ai3t51() throws Exception{try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37765);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37766);assertSame(MutableObject.class, MethodUtils.getAccessibleMethod(
                MutableObject.class, "getValue", ArrayUtils.EMPTY_CLASS_ARRAY)
                .getDeclaringClass());
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}
    
    @Test
   public void testGetAccessibleMethodInaccessible() throws Exception {__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceStart(getClass().getName(),37767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_218vjwjt53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t1ut1ul3lqxuu6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetAccessibleMethodInaccessible",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37767,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_218vjwjt53() throws Exception{try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37767);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37768);final Method expected = TestBean.class.getDeclaredMethod("privateStuff");
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37769);final Method actual = MethodUtils.getAccessibleMethod(expected);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37770);assertNull(actual);
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    @Test
   public void testGetMatchingAccessibleMethod() throws Exception {__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceStart(getClass().getName(),37771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ksuhnlt57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t1ut1ul3lqxuu6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testGetMatchingAccessibleMethod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37771,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ksuhnlt57() throws Exception{try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37771);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37772);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                ArrayUtils.EMPTY_CLASS_ARRAY, ArrayUtils.EMPTY_CLASS_ARRAY);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37773);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                null, ArrayUtils.EMPTY_CLASS_ARRAY);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37774);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(String.class), singletonArray(String.class));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37775);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Object.class), singletonArray(Object.class));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37776);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Boolean.class), singletonArray(Object.class));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37777);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Byte.class), singletonArray(Integer.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37778);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Byte.TYPE), singletonArray(Integer.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37779);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Short.class), singletonArray(Integer.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37780);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Short.TYPE), singletonArray(Integer.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37781);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Character.class), singletonArray(Integer.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37782);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Character.TYPE), singletonArray(Integer.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37783);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Integer.class), singletonArray(Integer.class));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37784);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Integer.TYPE), singletonArray(Integer.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37785);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Long.class), singletonArray(Double.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37786);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Long.TYPE), singletonArray(Double.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37787);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Float.class), singletonArray(Double.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37788);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Float.TYPE), singletonArray(Double.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37789);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Double.class), singletonArray(Double.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37790);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Double.TYPE), singletonArray(Double.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37791);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "foo",
                singletonArray(Double.TYPE), singletonArray(Double.TYPE));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37792);expectMatchingAccessibleMethodParameterTypes(InheritanceBean.class, "testOne",
                singletonArray(ParentObject.class), singletonArray(ParentObject.class));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37793);expectMatchingAccessibleMethodParameterTypes(InheritanceBean.class, "testOne",
                singletonArray(ChildObject.class), singletonArray(ParentObject.class));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37794);expectMatchingAccessibleMethodParameterTypes(InheritanceBean.class, "testTwo",
                singletonArray(ParentObject.class), singletonArray(GrandParentObject.class));
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37795);expectMatchingAccessibleMethodParameterTypes(InheritanceBean.class, "testTwo",
                singletonArray(ChildObject.class), singletonArray(ChildInterface.class));
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    @Test
    public void testNullArgument() {__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceStart(getClass().getName(),37796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r6zpszt5w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2t1ut1ul3lqxuu6.R.rethrow($CLV_t2$);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.MethodUtilsTest.testNullArgument",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37796,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r6zpszt5w(){try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37796);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37797);expectMatchingAccessibleMethodParameterTypes(TestBean.class, "oneParameter",
                singletonArray(null), singletonArray(String.class));
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    private void expectMatchingAccessibleMethodParameterTypes(final Class<?> cls,
            final String methodName, final Class<?>[] requestTypes, final Class<?>[] actualTypes) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37798);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37799);final Method m = MethodUtils.getMatchingAccessibleMethod(cls, methodName,
                requestTypes);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37800);assertTrue(toString(m.getParameterTypes()) + " not equals "
                + toString(actualTypes), Arrays.equals(actualTypes, m
                .getParameterTypes()));
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    private String toString(final Class<?>[] c) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37801);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37802);return Arrays.asList(c).toString();
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    private Class<?>[] singletonArray(final Class<?> c) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37803);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37804);Class<?>[] result = classCache.get(c);
        __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37805);if ((((result == null)&&(__CLR4_1_2t1ut1ul3lqxuu6.R.iget(37806)!=0|true))||(__CLR4_1_2t1ut1ul3lqxuu6.R.iget(37807)==0&false))) {{
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37808);result = new Class[] { c };
            __CLR4_1_2t1ut1ul3lqxuu6.R.inc(37809);classCache.put(c, result);
        }
        }__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37810);return result;
    }finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}

    public static class InheritanceBean {
        public void testOne(final Object obj) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37811);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}
        public void testOne(final GrandParentObject obj) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37812);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}
        public void testOne(final ParentObject obj) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37813);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}
        public void testTwo(final Object obj) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37814);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}
        public void testTwo(final GrandParentObject obj) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37815);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}
        public void testTwo(final ChildInterface obj) {try{__CLR4_1_2t1ut1ul3lqxuu6.R.inc(37816);}finally{__CLR4_1_2t1ut1ul3lqxuu6.R.flushNeeded();}}
    }
    
    interface ChildInterface {}    
    public static class GrandParentObject {}
    public static class ParentObject extends GrandParentObject {}
    public static class ChildObject extends ParentObject implements ChildInterface {}
    
}
