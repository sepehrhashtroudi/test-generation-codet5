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

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableObject;

/**
 * Unit tests ConstructorUtils
 * @version $Id$
 */
public class ConstructorUtilsTest {static class __CLR4_1_2szdszdl3lqxutq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,37650,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static class TestBean {
        private final String toString;

        public TestBean() {try{__CLR4_1_2szdszdl3lqxutq.R.inc(37561);
            __CLR4_1_2szdszdl3lqxutq.R.inc(37562);toString = "()";
        }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

        public TestBean(final int i) {try{__CLR4_1_2szdszdl3lqxutq.R.inc(37563);
            __CLR4_1_2szdszdl3lqxutq.R.inc(37564);toString = "(int)";
        }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

        public TestBean(final Integer i) {try{__CLR4_1_2szdszdl3lqxutq.R.inc(37565);
            __CLR4_1_2szdszdl3lqxutq.R.inc(37566);toString = "(Integer)";
        }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

        public TestBean(final double d) {try{__CLR4_1_2szdszdl3lqxutq.R.inc(37567);
            __CLR4_1_2szdszdl3lqxutq.R.inc(37568);toString = "(double)";
        }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

        public TestBean(final String s) {try{__CLR4_1_2szdszdl3lqxutq.R.inc(37569);
            __CLR4_1_2szdszdl3lqxutq.R.inc(37570);toString = "(String)";
        }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

        public TestBean(final Object o) {try{__CLR4_1_2szdszdl3lqxutq.R.inc(37571);
            __CLR4_1_2szdszdl3lqxutq.R.inc(37572);toString = "(Object)";
        }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_2szdszdl3lqxutq.R.inc(37573);
            __CLR4_1_2szdszdl3lqxutq.R.inc(37574);return toString;
        }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}
    }

    private static class PrivateClass {
        @SuppressWarnings("unused")
        public PrivateClass() {try{__CLR4_1_2szdszdl3lqxutq.R.inc(37575);
        }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}
    }

    private final Map<Class<?>, Class<?>[]> classCache;

    public ConstructorUtilsTest() {try{__CLR4_1_2szdszdl3lqxutq.R.inc(37576);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37577);classCache = new HashMap<Class<?>, Class<?>[]>();
    }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}


    @Before
    public void setUp() throws Exception {try{__CLR4_1_2szdszdl3lqxutq.R.inc(37578);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37579);classCache.clear();
    }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

    @Test
    public void testConstructor() throws Exception {__CLR4_1_2szdszdl3lqxutq.R.globalSliceStart(getClass().getName(),37580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hszw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2szdszdl3lqxutq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2szdszdl3lqxutq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37580,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hszw() throws Exception{try{__CLR4_1_2szdszdl3lqxutq.R.inc(37580);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37581);assertNotNull(MethodUtils.class.newInstance());
    }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

    @Test
    public void testInvokeConstructor() throws Exception {__CLR4_1_2szdszdl3lqxutq.R.globalSliceStart(getClass().getName(),37582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uxozbdszy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2szdszdl3lqxutq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2szdszdl3lqxutq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37582,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uxozbdszy() throws Exception{try{__CLR4_1_2szdszdl3lqxutq.R.inc(37582);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37583);assertEquals("()", ConstructorUtils.invokeConstructor(TestBean.class,
                (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY).toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37584);assertEquals("()", ConstructorUtils.invokeConstructor(TestBean.class,
                (Object[]) null).toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37585);assertEquals("()", ConstructorUtils.invokeConstructor(TestBean.class).toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37586);assertEquals("(String)", ConstructorUtils.invokeConstructor(
                TestBean.class, "").toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37587);assertEquals("(Object)", ConstructorUtils.invokeConstructor(
                TestBean.class, new Object()).toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37588);assertEquals("(Object)", ConstructorUtils.invokeConstructor(
                TestBean.class, Boolean.TRUE).toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37589);assertEquals("(Integer)", ConstructorUtils.invokeConstructor(
                TestBean.class, NumberUtils.INTEGER_ONE).toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37590);assertEquals("(int)", ConstructorUtils.invokeConstructor(
                TestBean.class, NumberUtils.BYTE_ONE).toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37591);assertEquals("(double)", ConstructorUtils.invokeConstructor(
                TestBean.class, NumberUtils.LONG_ONE).toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37592);assertEquals("(double)", ConstructorUtils.invokeConstructor(
                TestBean.class, NumberUtils.DOUBLE_ONE).toString());
    }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

    @Test
    public void testInvokeExactConstructor() throws Exception {__CLR4_1_2szdszdl3lqxutq.R.globalSliceStart(getClass().getName(),37593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fct97wt09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2szdszdl3lqxutq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2szdszdl3lqxutq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testInvokeExactConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37593,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fct97wt09() throws Exception{try{__CLR4_1_2szdszdl3lqxutq.R.inc(37593);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37594);assertEquals("()", ConstructorUtils.invokeExactConstructor(
                TestBean.class, (Object[]) ArrayUtils.EMPTY_CLASS_ARRAY).toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37595);assertEquals("()", ConstructorUtils.invokeExactConstructor(
                TestBean.class, (Object[]) null).toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37596);assertEquals("(String)", ConstructorUtils.invokeExactConstructor(
                TestBean.class, "").toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37597);assertEquals("(Object)", ConstructorUtils.invokeExactConstructor(
                TestBean.class, new Object()).toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37598);assertEquals("(Integer)", ConstructorUtils.invokeExactConstructor(
                TestBean.class, NumberUtils.INTEGER_ONE).toString());
        __CLR4_1_2szdszdl3lqxutq.R.inc(37599);assertEquals("(double)", ConstructorUtils.invokeExactConstructor(
                TestBean.class, new Object[] { NumberUtils.DOUBLE_ONE },
                new Class[] { Double.TYPE }).toString());

        __CLR4_1_2szdszdl3lqxutq.R.inc(37600);try {
            __CLR4_1_2szdszdl3lqxutq.R.inc(37601);ConstructorUtils.invokeExactConstructor(TestBean.class,
                    NumberUtils.BYTE_ONE);
            __CLR4_1_2szdszdl3lqxutq.R.inc(37602);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
        __CLR4_1_2szdszdl3lqxutq.R.inc(37603);try {
            __CLR4_1_2szdszdl3lqxutq.R.inc(37604);ConstructorUtils.invokeExactConstructor(TestBean.class,
                    NumberUtils.LONG_ONE);
            __CLR4_1_2szdszdl3lqxutq.R.inc(37605);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
        __CLR4_1_2szdszdl3lqxutq.R.inc(37606);try {
            __CLR4_1_2szdszdl3lqxutq.R.inc(37607);ConstructorUtils.invokeExactConstructor(TestBean.class,
                    Boolean.TRUE);
            __CLR4_1_2szdszdl3lqxutq.R.inc(37608);fail("should throw NoSuchMethodException");
        } catch (final NoSuchMethodException e) {
        }
    }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

    @Test
    public void testGetAccessibleConstructor() throws Exception {__CLR4_1_2szdszdl3lqxutq.R.globalSliceStart(getClass().getName(),37609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2de8pqxt0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2szdszdl3lqxutq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2szdszdl3lqxutq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testGetAccessibleConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37609,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2de8pqxt0p() throws Exception{try{__CLR4_1_2szdszdl3lqxutq.R.inc(37609);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37610);assertNotNull(ConstructorUtils.getAccessibleConstructor(Object.class
                .getConstructor(ArrayUtils.EMPTY_CLASS_ARRAY)));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37611);assertNull(ConstructorUtils.getAccessibleConstructor(PrivateClass.class
                .getConstructor(ArrayUtils.EMPTY_CLASS_ARRAY)));
    }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

    @Test
    public void testGetAccessibleConstructorFromDescription() throws Exception {__CLR4_1_2szdszdl3lqxutq.R.globalSliceStart(getClass().getName(),37612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2awzuyvt0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2szdszdl3lqxutq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2szdszdl3lqxutq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testGetAccessibleConstructorFromDescription",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37612,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2awzuyvt0s() throws Exception{try{__CLR4_1_2szdszdl3lqxutq.R.inc(37612);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37613);assertNotNull(ConstructorUtils.getAccessibleConstructor(Object.class,
                ArrayUtils.EMPTY_CLASS_ARRAY));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37614);assertNull(ConstructorUtils.getAccessibleConstructor(
                PrivateClass.class, ArrayUtils.EMPTY_CLASS_ARRAY));
    }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

    @Test
    public void testGetMatchingAccessibleMethod() throws Exception {__CLR4_1_2szdszdl3lqxutq.R.globalSliceStart(getClass().getName(),37615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ksuhnlt0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2szdszdl3lqxutq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2szdszdl3lqxutq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testGetMatchingAccessibleMethod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37615,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ksuhnlt0v() throws Exception{try{__CLR4_1_2szdszdl3lqxutq.R.inc(37615);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37616);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                ArrayUtils.EMPTY_CLASS_ARRAY, ArrayUtils.EMPTY_CLASS_ARRAY);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37617);expectMatchingAccessibleConstructorParameterTypes(TestBean.class, null,
                ArrayUtils.EMPTY_CLASS_ARRAY);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37618);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(String.class), singletonArray(String.class));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37619);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Object.class), singletonArray(Object.class));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37620);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Boolean.class), singletonArray(Object.class));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37621);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Byte.class), singletonArray(Integer.TYPE));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37622);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Byte.TYPE), singletonArray(Integer.TYPE));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37623);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Short.class), singletonArray(Integer.TYPE));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37624);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Short.TYPE), singletonArray(Integer.TYPE));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37625);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Character.class), singletonArray(Integer.TYPE));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37626);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Character.TYPE), singletonArray(Integer.TYPE));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37627);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Integer.class), singletonArray(Integer.class));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37628);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Integer.TYPE), singletonArray(Integer.TYPE));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37629);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Long.class), singletonArray(Double.TYPE));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37630);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Long.TYPE), singletonArray(Double.TYPE));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37631);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Float.class), singletonArray(Double.TYPE));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37632);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Float.TYPE), singletonArray(Double.TYPE));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37633);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Double.class), singletonArray(Double.TYPE));
        __CLR4_1_2szdszdl3lqxutq.R.inc(37634);expectMatchingAccessibleConstructorParameterTypes(TestBean.class,
                singletonArray(Double.TYPE), singletonArray(Double.TYPE));
    }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

    @Test
    public void testNullArgument() {__CLR4_1_2szdszdl3lqxutq.R.globalSliceStart(getClass().getName(),37635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r6zpszt1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2szdszdl3lqxutq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2szdszdl3lqxutq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.reflect.ConstructorUtilsTest.testNullArgument",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37635,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r6zpszt1f(){try{__CLR4_1_2szdszdl3lqxutq.R.inc(37635);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37636);expectMatchingAccessibleConstructorParameterTypes(MutableObject.class,
                singletonArray(null), singletonArray(Object.class));
    }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

    private void expectMatchingAccessibleConstructorParameterTypes(final Class<?> cls,
            final Class<?>[] requestTypes, final Class<?>[] actualTypes) {try{__CLR4_1_2szdszdl3lqxutq.R.inc(37637);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37638);final Constructor<?> c = ConstructorUtils.getMatchingAccessibleConstructor(cls,
                requestTypes);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37639);assertTrue(toString(c.getParameterTypes()) + " not equals "
                + toString(actualTypes), Arrays.equals(actualTypes, c
                .getParameterTypes()));
    }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

    private String toString(final Class<?>[] c) {try{__CLR4_1_2szdszdl3lqxutq.R.inc(37640);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37641);return Arrays.asList(c).toString();
    }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

    private Class<?>[] singletonArray(final Class<?> c) {try{__CLR4_1_2szdszdl3lqxutq.R.inc(37642);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37643);Class<?>[] result = classCache.get(c);
        __CLR4_1_2szdszdl3lqxutq.R.inc(37644);if ((((result == null)&&(__CLR4_1_2szdszdl3lqxutq.R.iget(37645)!=0|true))||(__CLR4_1_2szdszdl3lqxutq.R.iget(37646)==0&false))) {{
            __CLR4_1_2szdszdl3lqxutq.R.inc(37647);result = new Class[] { c };
            __CLR4_1_2szdszdl3lqxutq.R.inc(37648);classCache.put(c, result);
        }
        }__CLR4_1_2szdszdl3lqxutq.R.inc(37649);return result;
    }finally{__CLR4_1_2szdszdl3lqxutq.R.flushNeeded();}}

}
