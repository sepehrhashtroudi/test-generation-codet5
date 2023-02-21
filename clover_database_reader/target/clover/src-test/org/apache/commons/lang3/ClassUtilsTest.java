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
package org.apache.commons.lang3;

import static org.apache.commons.lang3.JavaVersion.JAVA_1_5;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.ClassUtils}.
 *
 * @version $Id$
 */
@SuppressWarnings("boxing") // JUnit4 does not support primitive equality testing apart from long
public class ClassUtilsTest  {static class __CLR4_1_2iouioul3lqxto4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,24986,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static class Inner {
        private class DeeplyNested{}
    }

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hiou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24222,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hiou(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24222);
        __CLR4_1_2iouioul3lqxto4.R.inc(24223);assertNotNull(new ClassUtils());
        __CLR4_1_2iouioul3lqxto4.R.inc(24224);final Constructor<?>[] cons = ClassUtils.class.getDeclaredConstructors();
        __CLR4_1_2iouioul3lqxto4.R.inc(24225);assertEquals(1, cons.length);
        __CLR4_1_2iouioul3lqxto4.R.inc(24226);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24227);assertTrue(Modifier.isPublic(ClassUtils.class.getModifiers()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24228);assertFalse(Modifier.isFinal(ClassUtils.class.getModifiers()));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    // -------------------------------------------------------------------------
    @Test
    public void test_getShortClassName_Object() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27pwoz9ip1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getShortClassName_Object",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24229,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27pwoz9ip1(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24229);
        __CLR4_1_2iouioul3lqxto4.R.inc(24230);assertEquals("ClassUtils", ClassUtils.getShortClassName(new ClassUtils(), "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24231);assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortClassName(new Inner(), "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24232);assertEquals("String", ClassUtils.getShortClassName("hello", "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24233);assertEquals("<null>", ClassUtils.getShortClassName(null, "<null>"));

        // Inner types
        class Named extends Object {}
        __CLR4_1_2iouioul3lqxto4.R.inc(24234);assertEquals("ClassUtilsTest.1", ClassUtils.getShortClassName(new Object(){}, "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24235);assertEquals("ClassUtilsTest.1Named", ClassUtils.getShortClassName(new Named(), "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24236);assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortClassName(new Inner(), "<null>"));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_getShortClassName_Class() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q9s92oip9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getShortClassName_Class",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24237,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q9s92oip9(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24237);
        __CLR4_1_2iouioul3lqxto4.R.inc(24238);assertEquals("ClassUtils", ClassUtils.getShortClassName(ClassUtils.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24239);assertEquals("Map.Entry", ClassUtils.getShortClassName(Map.Entry.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24240);assertEquals("", ClassUtils.getShortClassName((Class<?>) null));

        // LANG-535
        __CLR4_1_2iouioul3lqxto4.R.inc(24241);assertEquals("String[]", ClassUtils.getShortClassName(String[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24242);assertEquals("Map.Entry[]", ClassUtils.getShortClassName(Map.Entry[].class));

        // Primitives
        __CLR4_1_2iouioul3lqxto4.R.inc(24243);assertEquals("boolean", ClassUtils.getShortClassName(boolean.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24244);assertEquals("byte", ClassUtils.getShortClassName(byte.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24245);assertEquals("char", ClassUtils.getShortClassName(char.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24246);assertEquals("short", ClassUtils.getShortClassName(short.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24247);assertEquals("int", ClassUtils.getShortClassName(int.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24248);assertEquals("long", ClassUtils.getShortClassName(long.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24249);assertEquals("float", ClassUtils.getShortClassName(float.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24250);assertEquals("double", ClassUtils.getShortClassName(double.class));

        // Primitive Arrays
        __CLR4_1_2iouioul3lqxto4.R.inc(24251);assertEquals("boolean[]", ClassUtils.getShortClassName(boolean[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24252);assertEquals("byte[]", ClassUtils.getShortClassName(byte[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24253);assertEquals("char[]", ClassUtils.getShortClassName(char[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24254);assertEquals("short[]", ClassUtils.getShortClassName(short[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24255);assertEquals("int[]", ClassUtils.getShortClassName(int[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24256);assertEquals("long[]", ClassUtils.getShortClassName(long[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24257);assertEquals("float[]", ClassUtils.getShortClassName(float[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24258);assertEquals("double[]", ClassUtils.getShortClassName(double[].class));

        // Arrays of arrays of ...
        __CLR4_1_2iouioul3lqxto4.R.inc(24259);assertEquals("String[][]", ClassUtils.getShortClassName(String[][].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24260);assertEquals("String[][][]", ClassUtils.getShortClassName(String[][][].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24261);assertEquals("String[][][][]", ClassUtils.getShortClassName(String[][][][].class));
        
        // Inner types
        class Named extends Object {}
        __CLR4_1_2iouioul3lqxto4.R.inc(24262);assertEquals("ClassUtilsTest.2", ClassUtils.getShortClassName(new Object(){}.getClass()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24263);assertEquals("ClassUtilsTest.2Named", ClassUtils.getShortClassName(Named.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24264);assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortClassName(Inner.class));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}



    @Test
    public void test_getShortClassName_String() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i9kow7iq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getShortClassName_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24265,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i9kow7iq1(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24265);
        __CLR4_1_2iouioul3lqxto4.R.inc(24266);assertEquals("ClassUtils", ClassUtils.getShortClassName(ClassUtils.class.getName()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24267);assertEquals("Map.Entry", ClassUtils.getShortClassName(Map.Entry.class.getName()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24268);assertEquals("", ClassUtils.getShortClassName((String) null));
        __CLR4_1_2iouioul3lqxto4.R.inc(24269);assertEquals("", ClassUtils.getShortClassName(""));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_getSimpleName_Class() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2spap22iq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getSimpleName_Class",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24270,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2spap22iq6(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24270);
        __CLR4_1_2iouioul3lqxto4.R.inc(24271);assertEquals("ClassUtils", ClassUtils.getSimpleName(ClassUtils.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24272);assertEquals("Entry", ClassUtils.getSimpleName(Map.Entry.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24273);assertEquals("", ClassUtils.getSimpleName((Class<?>) null));

        // LANG-535
        __CLR4_1_2iouioul3lqxto4.R.inc(24274);assertEquals("String[]", ClassUtils.getSimpleName(String[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24275);assertEquals("Entry[]", ClassUtils.getSimpleName(Map.Entry[].class));

        // Primitives
        __CLR4_1_2iouioul3lqxto4.R.inc(24276);assertEquals("boolean", ClassUtils.getSimpleName(boolean.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24277);assertEquals("byte", ClassUtils.getSimpleName(byte.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24278);assertEquals("char", ClassUtils.getSimpleName(char.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24279);assertEquals("short", ClassUtils.getSimpleName(short.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24280);assertEquals("int", ClassUtils.getSimpleName(int.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24281);assertEquals("long", ClassUtils.getSimpleName(long.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24282);assertEquals("float", ClassUtils.getSimpleName(float.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24283);assertEquals("double", ClassUtils.getSimpleName(double.class));

        // Primitive Arrays
        __CLR4_1_2iouioul3lqxto4.R.inc(24284);assertEquals("boolean[]", ClassUtils.getSimpleName(boolean[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24285);assertEquals("byte[]", ClassUtils.getSimpleName(byte[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24286);assertEquals("char[]", ClassUtils.getSimpleName(char[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24287);assertEquals("short[]", ClassUtils.getSimpleName(short[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24288);assertEquals("int[]", ClassUtils.getSimpleName(int[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24289);assertEquals("long[]", ClassUtils.getSimpleName(long[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24290);assertEquals("float[]", ClassUtils.getSimpleName(float[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24291);assertEquals("double[]", ClassUtils.getSimpleName(double[].class));

        // Arrays of arrays of ...
        __CLR4_1_2iouioul3lqxto4.R.inc(24292);assertEquals("String[][]", ClassUtils.getSimpleName(String[][].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24293);assertEquals("String[][][]", ClassUtils.getSimpleName(String[][][].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24294);assertEquals("String[][][][]", ClassUtils.getSimpleName(String[][][][].class));
        
        // On-the-fly types
        class Named extends Object {}
        __CLR4_1_2iouioul3lqxto4.R.inc(24295);assertEquals("", ClassUtils.getSimpleName(new Object(){}.getClass()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24296);assertEquals("Named", ClassUtils.getSimpleName(Named.class));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_getSimpleName_Object() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23e4zhbiqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getSimpleName_Object",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24297,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23e4zhbiqx(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24297);
        __CLR4_1_2iouioul3lqxto4.R.inc(24298);assertEquals("ClassUtils", ClassUtils.getSimpleName(new ClassUtils(), "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24299);assertEquals("Inner", ClassUtils.getSimpleName(new Inner(), "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24300);assertEquals("String", ClassUtils.getSimpleName("hello", "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24301);assertEquals("<null>", ClassUtils.getSimpleName(null, "<null>"));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    // -------------------------------------------------------------------------
    @Test
    public void test_getPackageName_Object() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2y37bibir2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getPackageName_Object",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24302,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2y37bibir2(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24302);
        __CLR4_1_2iouioul3lqxto4.R.inc(24303);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(new ClassUtils(), "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24304);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(new Inner(), "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24305);assertEquals("<null>", ClassUtils.getPackageName(null, "<null>"));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_getPackageName_Class() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n1d0u0ir6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getPackageName_Class",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24306,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n1d0u0ir6(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24306);
        __CLR4_1_2iouioul3lqxto4.R.inc(24307);assertEquals("java.lang", ClassUtils.getPackageName(String.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24308);assertEquals("java.util", ClassUtils.getPackageName(Map.Entry.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24309);assertEquals("", ClassUtils.getPackageName((Class<?>)null));

        // LANG-535
        __CLR4_1_2iouioul3lqxto4.R.inc(24310);assertEquals("java.lang", ClassUtils.getPackageName(String[].class));

        // Primitive Arrays
        __CLR4_1_2iouioul3lqxto4.R.inc(24311);assertEquals("", ClassUtils.getPackageName(boolean[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24312);assertEquals("", ClassUtils.getPackageName(byte[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24313);assertEquals("", ClassUtils.getPackageName(char[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24314);assertEquals("", ClassUtils.getPackageName(short[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24315);assertEquals("", ClassUtils.getPackageName(int[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24316);assertEquals("", ClassUtils.getPackageName(long[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24317);assertEquals("", ClassUtils.getPackageName(float[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24318);assertEquals("", ClassUtils.getPackageName(double[].class));

        // Arrays of arrays of ...
        __CLR4_1_2iouioul3lqxto4.R.inc(24319);assertEquals("java.lang", ClassUtils.getPackageName(String[][].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24320);assertEquals("java.lang", ClassUtils.getPackageName(String[][][].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24321);assertEquals("java.lang", ClassUtils.getPackageName(String[][][][].class));
        
        // On-the-fly types
        class Named extends Object {}
        __CLR4_1_2iouioul3lqxto4.R.inc(24322);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(new Object(){}.getClass()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24323);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(Named.class));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_getPackageName_String() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2njjbldiro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getPackageName_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24324,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2njjbldiro(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24324);
        __CLR4_1_2iouioul3lqxto4.R.inc(24325);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(ClassUtils.class.getName()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24326);assertEquals("java.util", ClassUtils.getPackageName(Map.Entry.class.getName()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24327);assertEquals("", ClassUtils.getPackageName((String)null));
        __CLR4_1_2iouioul3lqxto4.R.inc(24328);assertEquals("", ClassUtils.getPackageName(""));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    // -------------------------------------------------------------------------
    @Test
    public void test_getAllSuperclasses_Class() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2z8fim5irt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getAllSuperclasses_Class",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24329,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2z8fim5irt(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24329);
        __CLR4_1_2iouioul3lqxto4.R.inc(24330);final List<?> list = ClassUtils.getAllSuperclasses(CY.class);
        __CLR4_1_2iouioul3lqxto4.R.inc(24331);assertEquals(2, list.size());
        __CLR4_1_2iouioul3lqxto4.R.inc(24332);assertEquals(CX.class, list.get(0));
        __CLR4_1_2iouioul3lqxto4.R.inc(24333);assertEquals(Object.class, list.get(1));

        __CLR4_1_2iouioul3lqxto4.R.inc(24334);assertEquals(null, ClassUtils.getAllSuperclasses(null));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_getAllInterfaces_Class() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28upfciirz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getAllInterfaces_Class",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24335,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28upfciirz(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24335);
        __CLR4_1_2iouioul3lqxto4.R.inc(24336);final List<?> list = ClassUtils.getAllInterfaces(CY.class);
        __CLR4_1_2iouioul3lqxto4.R.inc(24337);assertEquals(6, list.size());
        __CLR4_1_2iouioul3lqxto4.R.inc(24338);assertEquals(IB.class, list.get(0));
        __CLR4_1_2iouioul3lqxto4.R.inc(24339);assertEquals(IC.class, list.get(1));
        __CLR4_1_2iouioul3lqxto4.R.inc(24340);assertEquals(ID.class, list.get(2));
        __CLR4_1_2iouioul3lqxto4.R.inc(24341);assertEquals(IE.class, list.get(3));
        __CLR4_1_2iouioul3lqxto4.R.inc(24342);assertEquals(IF.class, list.get(4));
        __CLR4_1_2iouioul3lqxto4.R.inc(24343);assertEquals(IA.class, list.get(5));

        __CLR4_1_2iouioul3lqxto4.R.inc(24344);assertEquals(null, ClassUtils.getAllInterfaces(null));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    private static interface IA {
    }
    private static interface IB {
    }
    private static interface IC extends ID, IE {
    }
    private static interface ID {
    }
    private static interface IE extends IF {
    }
    private static interface IF {
    }
    private static class CX implements IB, IA, IE {
    }
    private static class CY extends CX implements IB, IC {
    }

    // -------------------------------------------------------------------------
    @Test
    public void test_convertClassNamesToClasses_List() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nhqzdbis9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_convertClassNamesToClasses_List",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24345,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nhqzdbis9(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24345);
        __CLR4_1_2iouioul3lqxto4.R.inc(24346);final List<String> list = new ArrayList<String>();
        __CLR4_1_2iouioul3lqxto4.R.inc(24347);List<Class<?>> result = ClassUtils.convertClassNamesToClasses(list);
        __CLR4_1_2iouioul3lqxto4.R.inc(24348);assertEquals(0, result.size());

        __CLR4_1_2iouioul3lqxto4.R.inc(24349);list.add("java.lang.String");
        __CLR4_1_2iouioul3lqxto4.R.inc(24350);list.add("java.lang.xxx");
        __CLR4_1_2iouioul3lqxto4.R.inc(24351);list.add("java.lang.Object");
        __CLR4_1_2iouioul3lqxto4.R.inc(24352);result = ClassUtils.convertClassNamesToClasses(list);
        __CLR4_1_2iouioul3lqxto4.R.inc(24353);assertEquals(3, result.size());
        __CLR4_1_2iouioul3lqxto4.R.inc(24354);assertEquals(String.class, result.get(0));
        __CLR4_1_2iouioul3lqxto4.R.inc(24355);assertEquals(null, result.get(1));
        __CLR4_1_2iouioul3lqxto4.R.inc(24356);assertEquals(Object.class, result.get(2));

        __CLR4_1_2iouioul3lqxto4.R.inc(24357);@SuppressWarnings("unchecked") // test what happens when non-generic code adds wrong type of element
        final
        List<Object> olist = (List<Object>)(List<?>)list;
        __CLR4_1_2iouioul3lqxto4.R.inc(24358);olist.add(new Object());
        __CLR4_1_2iouioul3lqxto4.R.inc(24359);try {
            __CLR4_1_2iouioul3lqxto4.R.inc(24360);ClassUtils.convertClassNamesToClasses(list);
            __CLR4_1_2iouioul3lqxto4.R.inc(24361);fail("Should not have been able to convert list");
        } catch (final ClassCastException expected) {}
        __CLR4_1_2iouioul3lqxto4.R.inc(24362);assertEquals(null, ClassUtils.convertClassNamesToClasses(null));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_convertClassesToClassNames_List() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2re9p47isr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_convertClassesToClassNames_List",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24363,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2re9p47isr(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24363);
        __CLR4_1_2iouioul3lqxto4.R.inc(24364);final List<Class<?>> list = new ArrayList<Class<?>>();
        __CLR4_1_2iouioul3lqxto4.R.inc(24365);List<String> result = ClassUtils.convertClassesToClassNames(list);
        __CLR4_1_2iouioul3lqxto4.R.inc(24366);assertEquals(0, result.size());

        __CLR4_1_2iouioul3lqxto4.R.inc(24367);list.add(String.class);
        __CLR4_1_2iouioul3lqxto4.R.inc(24368);list.add(null);
        __CLR4_1_2iouioul3lqxto4.R.inc(24369);list.add(Object.class);
        __CLR4_1_2iouioul3lqxto4.R.inc(24370);result = ClassUtils.convertClassesToClassNames(list);
        __CLR4_1_2iouioul3lqxto4.R.inc(24371);assertEquals(3, result.size());
        __CLR4_1_2iouioul3lqxto4.R.inc(24372);assertEquals("java.lang.String", result.get(0));
        __CLR4_1_2iouioul3lqxto4.R.inc(24373);assertEquals(null, result.get(1));
        __CLR4_1_2iouioul3lqxto4.R.inc(24374);assertEquals("java.lang.Object", result.get(2));

        __CLR4_1_2iouioul3lqxto4.R.inc(24375);@SuppressWarnings("unchecked") // test what happens when non-generic code adds wrong type of element
        final
        List<Object> olist = (List<Object>)(List<?>)list;
        __CLR4_1_2iouioul3lqxto4.R.inc(24376);olist.add(new Object());
        __CLR4_1_2iouioul3lqxto4.R.inc(24377);try {
            __CLR4_1_2iouioul3lqxto4.R.inc(24378);ClassUtils.convertClassesToClassNames(list);
            __CLR4_1_2iouioul3lqxto4.R.inc(24379);fail("Should not have been able to convert list");
        } catch (final ClassCastException expected) {}
        __CLR4_1_2iouioul3lqxto4.R.inc(24380);assertEquals(null, ClassUtils.convertClassesToClassNames(null));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    // -------------------------------------------------------------------------
    @Test
    public void test_isInnerClass_Class() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26pbz9jit9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isInnerClass_Class",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24381,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26pbz9jit9(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24381);
        __CLR4_1_2iouioul3lqxto4.R.inc(24382);assertTrue(ClassUtils.isInnerClass(Inner.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24383);assertTrue(ClassUtils.isInnerClass(Map.Entry.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24384);assertTrue(ClassUtils.isInnerClass(new Cloneable() {
        }.getClass()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24385);assertFalse(ClassUtils.isInnerClass(this.getClass()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24386);assertFalse(ClassUtils.isInnerClass(String.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24387);assertFalse(ClassUtils.isInnerClass(null));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    // -------------------------------------------------------------------------
    @Test
    public void test_isAssignable_ClassArray_ClassArray() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2krre6xitg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_ClassArray_ClassArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24388,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2krre6xitg() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24388);
        __CLR4_1_2iouioul3lqxto4.R.inc(24389);final Class<?>[] array2 = new Class[] {Object.class, Object.class};
        __CLR4_1_2iouioul3lqxto4.R.inc(24390);final Class<?>[] array1 = new Class[] {Object.class};
        __CLR4_1_2iouioul3lqxto4.R.inc(24391);final Class<?>[] array1s = new Class[] {String.class};
        __CLR4_1_2iouioul3lqxto4.R.inc(24392);final Class<?>[] array0 = new Class[] {};
        __CLR4_1_2iouioul3lqxto4.R.inc(24393);final Class<?>[] arrayPrimitives = { Integer.TYPE, Boolean.TYPE };
        __CLR4_1_2iouioul3lqxto4.R.inc(24394);final Class<?>[] arrayWrappers = { Integer.class, Boolean.class };

        __CLR4_1_2iouioul3lqxto4.R.inc(24395);assertFalse(ClassUtils.isAssignable(array1, array2));
        __CLR4_1_2iouioul3lqxto4.R.inc(24396);assertFalse(ClassUtils.isAssignable(null, array2));
        __CLR4_1_2iouioul3lqxto4.R.inc(24397);assertTrue(ClassUtils.isAssignable(null, array0));
        __CLR4_1_2iouioul3lqxto4.R.inc(24398);assertTrue(ClassUtils.isAssignable(array0, array0));
//        assertTrue(ClassUtils.isAssignable(array0, null)); 
        __CLR4_1_2iouioul3lqxto4.R.inc(24399);assertTrue(ClassUtils.isAssignable(array0, (Class<?>[]) null)); // explicit cast to avoid warning
        __CLR4_1_2iouioul3lqxto4.R.inc(24400);assertTrue(ClassUtils.isAssignable((Class[]) null, (Class[]) null));

        __CLR4_1_2iouioul3lqxto4.R.inc(24401);assertFalse(ClassUtils.isAssignable(array1, array1s));
        __CLR4_1_2iouioul3lqxto4.R.inc(24402);assertTrue(ClassUtils.isAssignable(array1s, array1s));
        __CLR4_1_2iouioul3lqxto4.R.inc(24403);assertTrue(ClassUtils.isAssignable(array1s, array1));

        __CLR4_1_2iouioul3lqxto4.R.inc(24404);final boolean autoboxing = SystemUtils.isJavaVersionAtLeast(JAVA_1_5);

        __CLR4_1_2iouioul3lqxto4.R.inc(24405);assertEquals(autoboxing, ClassUtils.isAssignable(arrayPrimitives, arrayWrappers));
        __CLR4_1_2iouioul3lqxto4.R.inc(24406);assertEquals(autoboxing, ClassUtils.isAssignable(arrayWrappers, arrayPrimitives));
        __CLR4_1_2iouioul3lqxto4.R.inc(24407);assertFalse(ClassUtils.isAssignable(arrayPrimitives, array1));
        __CLR4_1_2iouioul3lqxto4.R.inc(24408);assertFalse(ClassUtils.isAssignable(arrayWrappers, array1));
        __CLR4_1_2iouioul3lqxto4.R.inc(24409);assertEquals(autoboxing, ClassUtils.isAssignable(arrayPrimitives, array2));
        __CLR4_1_2iouioul3lqxto4.R.inc(24410);assertTrue(ClassUtils.isAssignable(arrayWrappers, array2));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_isAssignable_ClassArray_ClassArray_Autoboxing() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sicsfgiu3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_ClassArray_ClassArray_Autoboxing",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24411,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sicsfgiu3() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24411);
        __CLR4_1_2iouioul3lqxto4.R.inc(24412);final Class<?>[] array2 = new Class[] {Object.class, Object.class};
        __CLR4_1_2iouioul3lqxto4.R.inc(24413);final Class<?>[] array1 = new Class[] {Object.class};
        __CLR4_1_2iouioul3lqxto4.R.inc(24414);final Class<?>[] array1s = new Class[] {String.class};
        __CLR4_1_2iouioul3lqxto4.R.inc(24415);final Class<?>[] array0 = new Class[] {};
        __CLR4_1_2iouioul3lqxto4.R.inc(24416);final Class<?>[] arrayPrimitives = { Integer.TYPE, Boolean.TYPE };
        __CLR4_1_2iouioul3lqxto4.R.inc(24417);final Class<?>[] arrayWrappers = { Integer.class, Boolean.class };

        __CLR4_1_2iouioul3lqxto4.R.inc(24418);assertFalse(ClassUtils.isAssignable(array1, array2, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24419);assertFalse(ClassUtils.isAssignable(null, array2, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24420);assertTrue(ClassUtils.isAssignable(null, array0, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24421);assertTrue(ClassUtils.isAssignable(array0, array0, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24422);assertTrue(ClassUtils.isAssignable(array0, null, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24423);assertTrue(ClassUtils.isAssignable((Class[]) null, (Class[]) null, true));

        __CLR4_1_2iouioul3lqxto4.R.inc(24424);assertFalse(ClassUtils.isAssignable(array1, array1s, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24425);assertTrue(ClassUtils.isAssignable(array1s, array1s, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24426);assertTrue(ClassUtils.isAssignable(array1s, array1, true));

        __CLR4_1_2iouioul3lqxto4.R.inc(24427);assertTrue(ClassUtils.isAssignable(arrayPrimitives, arrayWrappers, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24428);assertTrue(ClassUtils.isAssignable(arrayWrappers, arrayPrimitives, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24429);assertFalse(ClassUtils.isAssignable(arrayPrimitives, array1, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24430);assertFalse(ClassUtils.isAssignable(arrayWrappers, array1, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24431);assertTrue(ClassUtils.isAssignable(arrayPrimitives, array2, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24432);assertTrue(ClassUtils.isAssignable(arrayWrappers, array2, true));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_isAssignable_ClassArray_ClassArray_NoAutoboxing() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_246kii5iup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_ClassArray_ClassArray_NoAutoboxing",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24433,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_246kii5iup() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24433);
        __CLR4_1_2iouioul3lqxto4.R.inc(24434);final Class<?>[] array2 = new Class[] {Object.class, Object.class};
        __CLR4_1_2iouioul3lqxto4.R.inc(24435);final Class<?>[] array1 = new Class[] {Object.class};
        __CLR4_1_2iouioul3lqxto4.R.inc(24436);final Class<?>[] array1s = new Class[] {String.class};
        __CLR4_1_2iouioul3lqxto4.R.inc(24437);final Class<?>[] array0 = new Class[] {};
        __CLR4_1_2iouioul3lqxto4.R.inc(24438);final Class<?>[] arrayPrimitives = { Integer.TYPE, Boolean.TYPE };
        __CLR4_1_2iouioul3lqxto4.R.inc(24439);final Class<?>[] arrayWrappers = { Integer.class, Boolean.class };

        __CLR4_1_2iouioul3lqxto4.R.inc(24440);assertFalse(ClassUtils.isAssignable(array1, array2, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24441);assertFalse(ClassUtils.isAssignable(null, array2, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24442);assertTrue(ClassUtils.isAssignable(null, array0, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24443);assertTrue(ClassUtils.isAssignable(array0, array0, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24444);assertTrue(ClassUtils.isAssignable(array0, null, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24445);assertTrue(ClassUtils.isAssignable((Class[]) null, (Class[]) null, false));

        __CLR4_1_2iouioul3lqxto4.R.inc(24446);assertFalse(ClassUtils.isAssignable(array1, array1s, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24447);assertTrue(ClassUtils.isAssignable(array1s, array1s, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24448);assertTrue(ClassUtils.isAssignable(array1s, array1, false));

        __CLR4_1_2iouioul3lqxto4.R.inc(24449);assertFalse(ClassUtils.isAssignable(arrayPrimitives, arrayWrappers, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24450);assertFalse(ClassUtils.isAssignable(arrayWrappers, arrayPrimitives, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24451);assertFalse(ClassUtils.isAssignable(arrayPrimitives, array1, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24452);assertFalse(ClassUtils.isAssignable(arrayWrappers, array1, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24453);assertTrue(ClassUtils.isAssignable(arrayWrappers, array2, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24454);assertFalse(ClassUtils.isAssignable(arrayPrimitives, array2, false));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_isAssignable() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gykv3bivb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24455,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gykv3bivb() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24455);
        __CLR4_1_2iouioul3lqxto4.R.inc(24456);assertFalse(ClassUtils.isAssignable((Class<?>) null, null));
        __CLR4_1_2iouioul3lqxto4.R.inc(24457);assertFalse(ClassUtils.isAssignable(String.class, null));

        __CLR4_1_2iouioul3lqxto4.R.inc(24458);assertTrue(ClassUtils.isAssignable(null, Object.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24459);assertTrue(ClassUtils.isAssignable(null, Integer.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24460);assertFalse(ClassUtils.isAssignable(null, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24461);assertTrue(ClassUtils.isAssignable(String.class, Object.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24462);assertTrue(ClassUtils.isAssignable(String.class, String.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24463);assertFalse(ClassUtils.isAssignable(Object.class, String.class));

        __CLR4_1_2iouioul3lqxto4.R.inc(24464);final boolean autoboxing = SystemUtils.isJavaVersionAtLeast(JAVA_1_5);

        __CLR4_1_2iouioul3lqxto4.R.inc(24465);assertEquals(autoboxing, ClassUtils.isAssignable(Integer.TYPE, Integer.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24466);assertEquals(autoboxing, ClassUtils.isAssignable(Integer.TYPE, Object.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24467);assertEquals(autoboxing, ClassUtils.isAssignable(Integer.class, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24468);assertEquals(autoboxing, ClassUtils.isAssignable(Integer.class, Object.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24469);assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24470);assertTrue(ClassUtils.isAssignable(Integer.class, Integer.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24471);assertEquals(autoboxing, ClassUtils.isAssignable(Boolean.TYPE, Boolean.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24472);assertEquals(autoboxing, ClassUtils.isAssignable(Boolean.TYPE, Object.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24473);assertEquals(autoboxing, ClassUtils.isAssignable(Boolean.class, Boolean.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24474);assertEquals(autoboxing, ClassUtils.isAssignable(Boolean.class, Object.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24475);assertTrue(ClassUtils.isAssignable(Boolean.TYPE, Boolean.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24476);assertTrue(ClassUtils.isAssignable(Boolean.class, Boolean.class));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_isAssignable_Autoboxing() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_254f9bgivx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_Autoboxing",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24477,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_254f9bgivx() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24477);
        __CLR4_1_2iouioul3lqxto4.R.inc(24478);assertFalse(ClassUtils.isAssignable((Class<?>) null, null, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24479);assertFalse(ClassUtils.isAssignable(String.class, null, true));

        __CLR4_1_2iouioul3lqxto4.R.inc(24480);assertTrue(ClassUtils.isAssignable(null, Object.class, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24481);assertTrue(ClassUtils.isAssignable(null, Integer.class, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24482);assertFalse(ClassUtils.isAssignable(null, Integer.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24483);assertTrue(ClassUtils.isAssignable(String.class, Object.class, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24484);assertTrue(ClassUtils.isAssignable(String.class, String.class, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24485);assertFalse(ClassUtils.isAssignable(Object.class, String.class, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24486);assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.class, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24487);assertTrue(ClassUtils.isAssignable(Integer.TYPE, Object.class, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24488);assertTrue(ClassUtils.isAssignable(Integer.class, Integer.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24489);assertTrue(ClassUtils.isAssignable(Integer.class, Object.class, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24490);assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24491);assertTrue(ClassUtils.isAssignable(Integer.class, Integer.class, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24492);assertTrue(ClassUtils.isAssignable(Boolean.TYPE, Boolean.class, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24493);assertTrue(ClassUtils.isAssignable(Boolean.class, Boolean.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24494);assertTrue(ClassUtils.isAssignable(Boolean.class, Object.class, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24495);assertTrue(ClassUtils.isAssignable(Boolean.TYPE, Boolean.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24496);assertTrue(ClassUtils.isAssignable(Boolean.class, Boolean.class, true));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_isAssignable_NoAutoboxing() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oxxb2riwh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_NoAutoboxing",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24497,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oxxb2riwh() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24497);
        __CLR4_1_2iouioul3lqxto4.R.inc(24498);assertFalse(ClassUtils.isAssignable((Class<?>) null, null, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24499);assertFalse(ClassUtils.isAssignable(String.class, null, false));

        __CLR4_1_2iouioul3lqxto4.R.inc(24500);assertTrue(ClassUtils.isAssignable(null, Object.class, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24501);assertTrue(ClassUtils.isAssignable(null, Integer.class, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24502);assertFalse(ClassUtils.isAssignable(null, Integer.TYPE, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24503);assertTrue(ClassUtils.isAssignable(String.class, Object.class, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24504);assertTrue(ClassUtils.isAssignable(String.class, String.class, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24505);assertFalse(ClassUtils.isAssignable(Object.class, String.class, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24506);assertFalse(ClassUtils.isAssignable(Integer.TYPE, Integer.class, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24507);assertFalse(ClassUtils.isAssignable(Integer.TYPE, Object.class, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24508);assertFalse(ClassUtils.isAssignable(Integer.class, Integer.TYPE, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24509);assertTrue(ClassUtils.isAssignable(Integer.TYPE, Integer.TYPE, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24510);assertTrue(ClassUtils.isAssignable(Integer.class, Integer.class, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24511);assertFalse(ClassUtils.isAssignable(Boolean.TYPE, Boolean.class, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24512);assertFalse(ClassUtils.isAssignable(Boolean.TYPE, Object.class, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24513);assertFalse(ClassUtils.isAssignable(Boolean.class, Boolean.TYPE, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24514);assertTrue(ClassUtils.isAssignable(Boolean.class, Object.class, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24515);assertTrue(ClassUtils.isAssignable(Boolean.TYPE, Boolean.TYPE, false));
        __CLR4_1_2iouioul3lqxto4.R.inc(24516);assertTrue(ClassUtils.isAssignable(Boolean.class, Boolean.class, false));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_isAssignable_Widening() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g92xhvix1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_Widening",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24517,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g92xhvix1() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24517);
        // test byte conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24518);assertFalse("byte -> char", ClassUtils.isAssignable(Byte.TYPE, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24519);assertTrue("byte -> byte", ClassUtils.isAssignable(Byte.TYPE, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24520);assertTrue("byte -> short", ClassUtils.isAssignable(Byte.TYPE, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24521);assertTrue("byte -> int", ClassUtils.isAssignable(Byte.TYPE, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24522);assertTrue("byte -> long", ClassUtils.isAssignable(Byte.TYPE, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24523);assertTrue("byte -> float", ClassUtils.isAssignable(Byte.TYPE, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24524);assertTrue("byte -> double", ClassUtils.isAssignable(Byte.TYPE, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24525);assertFalse("byte -> boolean", ClassUtils.isAssignable(Byte.TYPE, Boolean.TYPE));

        // test short conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24526);assertFalse("short -> char", ClassUtils.isAssignable(Short.TYPE, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24527);assertFalse("short -> byte", ClassUtils.isAssignable(Short.TYPE, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24528);assertTrue("short -> short", ClassUtils.isAssignable(Short.TYPE, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24529);assertTrue("short -> int", ClassUtils.isAssignable(Short.TYPE, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24530);assertTrue("short -> long", ClassUtils.isAssignable(Short.TYPE, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24531);assertTrue("short -> float", ClassUtils.isAssignable(Short.TYPE, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24532);assertTrue("short -> double", ClassUtils.isAssignable(Short.TYPE, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24533);assertFalse("short -> boolean", ClassUtils.isAssignable(Short.TYPE, Boolean.TYPE));

        // test char conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24534);assertTrue("char -> char", ClassUtils.isAssignable(Character.TYPE, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24535);assertFalse("char -> byte", ClassUtils.isAssignable(Character.TYPE, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24536);assertFalse("char -> short", ClassUtils.isAssignable(Character.TYPE, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24537);assertTrue("char -> int", ClassUtils.isAssignable(Character.TYPE, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24538);assertTrue("char -> long", ClassUtils.isAssignable(Character.TYPE, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24539);assertTrue("char -> float", ClassUtils.isAssignable(Character.TYPE, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24540);assertTrue("char -> double", ClassUtils.isAssignable(Character.TYPE, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24541);assertFalse("char -> boolean", ClassUtils.isAssignable(Character.TYPE, Boolean.TYPE));

        // test int conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24542);assertFalse("int -> char", ClassUtils.isAssignable(Integer.TYPE, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24543);assertFalse("int -> byte", ClassUtils.isAssignable(Integer.TYPE, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24544);assertFalse("int -> short", ClassUtils.isAssignable(Integer.TYPE, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24545);assertTrue("int -> int", ClassUtils.isAssignable(Integer.TYPE, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24546);assertTrue("int -> long", ClassUtils.isAssignable(Integer.TYPE, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24547);assertTrue("int -> float", ClassUtils.isAssignable(Integer.TYPE, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24548);assertTrue("int -> double", ClassUtils.isAssignable(Integer.TYPE, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24549);assertFalse("int -> boolean", ClassUtils.isAssignable(Integer.TYPE, Boolean.TYPE));

        // test long conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24550);assertFalse("long -> char", ClassUtils.isAssignable(Long.TYPE, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24551);assertFalse("long -> byte", ClassUtils.isAssignable(Long.TYPE, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24552);assertFalse("long -> short", ClassUtils.isAssignable(Long.TYPE, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24553);assertFalse("long -> int", ClassUtils.isAssignable(Long.TYPE, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24554);assertTrue("long -> long", ClassUtils.isAssignable(Long.TYPE, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24555);assertTrue("long -> float", ClassUtils.isAssignable(Long.TYPE, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24556);assertTrue("long -> double", ClassUtils.isAssignable(Long.TYPE, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24557);assertFalse("long -> boolean", ClassUtils.isAssignable(Long.TYPE, Boolean.TYPE));

        // test float conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24558);assertFalse("float -> char", ClassUtils.isAssignable(Float.TYPE, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24559);assertFalse("float -> byte", ClassUtils.isAssignable(Float.TYPE, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24560);assertFalse("float -> short", ClassUtils.isAssignable(Float.TYPE, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24561);assertFalse("float -> int", ClassUtils.isAssignable(Float.TYPE, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24562);assertFalse("float -> long", ClassUtils.isAssignable(Float.TYPE, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24563);assertTrue("float -> float", ClassUtils.isAssignable(Float.TYPE, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24564);assertTrue("float -> double", ClassUtils.isAssignable(Float.TYPE, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24565);assertFalse("float -> boolean", ClassUtils.isAssignable(Float.TYPE, Boolean.TYPE));

        // test double conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24566);assertFalse("double -> char", ClassUtils.isAssignable(Double.TYPE, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24567);assertFalse("double -> byte", ClassUtils.isAssignable(Double.TYPE, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24568);assertFalse("double -> short", ClassUtils.isAssignable(Double.TYPE, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24569);assertFalse("double -> int", ClassUtils.isAssignable(Double.TYPE, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24570);assertFalse("double -> long", ClassUtils.isAssignable(Double.TYPE, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24571);assertFalse("double -> float", ClassUtils.isAssignable(Double.TYPE, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24572);assertTrue("double -> double", ClassUtils.isAssignable(Double.TYPE, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24573);assertFalse("double -> boolean", ClassUtils.isAssignable(Double.TYPE, Boolean.TYPE));

        // test boolean conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24574);assertFalse("boolean -> char", ClassUtils.isAssignable(Boolean.TYPE, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24575);assertFalse("boolean -> byte", ClassUtils.isAssignable(Boolean.TYPE, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24576);assertFalse("boolean -> short", ClassUtils.isAssignable(Boolean.TYPE, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24577);assertFalse("boolean -> int", ClassUtils.isAssignable(Boolean.TYPE, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24578);assertFalse("boolean -> long", ClassUtils.isAssignable(Boolean.TYPE, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24579);assertFalse("boolean -> float", ClassUtils.isAssignable(Boolean.TYPE, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24580);assertFalse("boolean -> double", ClassUtils.isAssignable(Boolean.TYPE, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24581);assertTrue("boolean -> boolean", ClassUtils.isAssignable(Boolean.TYPE, Boolean.TYPE));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_isAssignable_DefaultUnboxing_Widening() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ev99k5iyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_DefaultUnboxing_Widening",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24582,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ev99k5iyu() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24582);
        __CLR4_1_2iouioul3lqxto4.R.inc(24583);final boolean autoboxing = SystemUtils.isJavaVersionAtLeast(JAVA_1_5);

        // test byte conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24584);assertFalse("byte -> char", ClassUtils.isAssignable(Byte.class, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24585);assertEquals("byte -> byte", autoboxing, ClassUtils.isAssignable(Byte.class, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24586);assertEquals("byte -> short", autoboxing, ClassUtils.isAssignable(Byte.class, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24587);assertEquals("byte -> int", autoboxing, ClassUtils.isAssignable(Byte.class, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24588);assertEquals("byte -> long", autoboxing, ClassUtils.isAssignable(Byte.class, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24589);assertEquals("byte -> float", autoboxing, ClassUtils.isAssignable(Byte.class, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24590);assertEquals("byte -> double", autoboxing, ClassUtils.isAssignable(Byte.class, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24591);assertFalse("byte -> boolean", ClassUtils.isAssignable(Byte.class, Boolean.TYPE));

        // test short conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24592);assertFalse("short -> char", ClassUtils.isAssignable(Short.class, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24593);assertFalse("short -> byte", ClassUtils.isAssignable(Short.class, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24594);assertEquals("short -> short", autoboxing, ClassUtils.isAssignable(Short.class, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24595);assertEquals("short -> int", autoboxing, ClassUtils.isAssignable(Short.class, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24596);assertEquals("short -> long", autoboxing, ClassUtils.isAssignable(Short.class, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24597);assertEquals("short -> float", autoboxing, ClassUtils.isAssignable(Short.class, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24598);assertEquals("short -> double", autoboxing, ClassUtils.isAssignable(Short.class, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24599);assertFalse("short -> boolean", ClassUtils.isAssignable(Short.class, Boolean.TYPE));

        // test char conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24600);assertEquals("char -> char", autoboxing, ClassUtils.isAssignable(Character.class, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24601);assertFalse("char -> byte", ClassUtils.isAssignable(Character.class, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24602);assertFalse("char -> short", ClassUtils.isAssignable(Character.class, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24603);assertEquals("char -> int", autoboxing, ClassUtils.isAssignable(Character.class, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24604);assertEquals("char -> long", autoboxing, ClassUtils.isAssignable(Character.class, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24605);assertEquals("char -> float", autoboxing, ClassUtils.isAssignable(Character.class, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24606);assertEquals("char -> double", autoboxing, ClassUtils.isAssignable(Character.class, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24607);assertFalse("char -> boolean", ClassUtils.isAssignable(Character.class, Boolean.TYPE));

        // test int conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24608);assertFalse("int -> char", ClassUtils.isAssignable(Integer.class, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24609);assertFalse("int -> byte", ClassUtils.isAssignable(Integer.class, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24610);assertFalse("int -> short", ClassUtils.isAssignable(Integer.class, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24611);assertEquals("int -> int", autoboxing, ClassUtils.isAssignable(Integer.class, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24612);assertEquals("int -> long", autoboxing, ClassUtils.isAssignable(Integer.class, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24613);assertEquals("int -> float", autoboxing, ClassUtils.isAssignable(Integer.class, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24614);assertEquals("int -> double", autoboxing, ClassUtils.isAssignable(Integer.class, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24615);assertFalse("int -> boolean", ClassUtils.isAssignable(Integer.class, Boolean.TYPE));

        // test long conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24616);assertFalse("long -> char", ClassUtils.isAssignable(Long.class, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24617);assertFalse("long -> byte", ClassUtils.isAssignable(Long.class, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24618);assertFalse("long -> short", ClassUtils.isAssignable(Long.class, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24619);assertFalse("long -> int", ClassUtils.isAssignable(Long.class, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24620);assertEquals("long -> long", autoboxing, ClassUtils.isAssignable(Long.class, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24621);assertEquals("long -> float", autoboxing, ClassUtils.isAssignable(Long.class, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24622);assertEquals("long -> double", autoboxing, ClassUtils.isAssignable(Long.class, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24623);assertFalse("long -> boolean", ClassUtils.isAssignable(Long.class, Boolean.TYPE));

        // test float conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24624);assertFalse("float -> char", ClassUtils.isAssignable(Float.class, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24625);assertFalse("float -> byte", ClassUtils.isAssignable(Float.class, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24626);assertFalse("float -> short", ClassUtils.isAssignable(Float.class, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24627);assertFalse("float -> int", ClassUtils.isAssignable(Float.class, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24628);assertFalse("float -> long", ClassUtils.isAssignable(Float.class, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24629);assertEquals("float -> float", autoboxing, ClassUtils.isAssignable(Float.class, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24630);assertEquals("float -> double", autoboxing, ClassUtils.isAssignable(Float.class, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24631);assertFalse("float -> boolean", ClassUtils.isAssignable(Float.class, Boolean.TYPE));

        // test double conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24632);assertFalse("double -> char", ClassUtils.isAssignable(Double.class, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24633);assertFalse("double -> byte", ClassUtils.isAssignable(Double.class, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24634);assertFalse("double -> short", ClassUtils.isAssignable(Double.class, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24635);assertFalse("double -> int", ClassUtils.isAssignable(Double.class, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24636);assertFalse("double -> long", ClassUtils.isAssignable(Double.class, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24637);assertFalse("double -> float", ClassUtils.isAssignable(Double.class, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24638);assertEquals("double -> double", autoboxing, ClassUtils.isAssignable(Double.class, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24639);assertFalse("double -> boolean", ClassUtils.isAssignable(Double.class, Boolean.TYPE));

        // test boolean conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24640);assertFalse("boolean -> char", ClassUtils.isAssignable(Boolean.class, Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24641);assertFalse("boolean -> byte", ClassUtils.isAssignable(Boolean.class, Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24642);assertFalse("boolean -> short", ClassUtils.isAssignable(Boolean.class, Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24643);assertFalse("boolean -> int", ClassUtils.isAssignable(Boolean.class, Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24644);assertFalse("boolean -> long", ClassUtils.isAssignable(Boolean.class, Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24645);assertFalse("boolean -> float", ClassUtils.isAssignable(Boolean.class, Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24646);assertFalse("boolean -> double", ClassUtils.isAssignable(Boolean.class, Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24647);assertEquals("boolean -> boolean", autoboxing, ClassUtils.isAssignable(Boolean.class, Boolean.TYPE));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_isAssignable_Unboxing_Widening() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dleftuj0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_isAssignable_Unboxing_Widening",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24648,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dleftuj0o() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24648);
        // test byte conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24649);assertFalse("byte -> char", ClassUtils.isAssignable(Byte.class, Character.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24650);assertTrue("byte -> byte", ClassUtils.isAssignable(Byte.class, Byte.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24651);assertTrue("byte -> short", ClassUtils.isAssignable(Byte.class, Short.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24652);assertTrue("byte -> int", ClassUtils.isAssignable(Byte.class, Integer.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24653);assertTrue("byte -> long", ClassUtils.isAssignable(Byte.class, Long.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24654);assertTrue("byte -> float", ClassUtils.isAssignable(Byte.class, Float.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24655);assertTrue("byte -> double", ClassUtils.isAssignable(Byte.class, Double.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24656);assertFalse("byte -> boolean", ClassUtils.isAssignable(Byte.class, Boolean.TYPE, true));

        // test short conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24657);assertFalse("short -> char", ClassUtils.isAssignable(Short.class, Character.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24658);assertFalse("short -> byte", ClassUtils.isAssignable(Short.class, Byte.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24659);assertTrue("short -> short", ClassUtils.isAssignable(Short.class, Short.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24660);assertTrue("short -> int", ClassUtils.isAssignable(Short.class, Integer.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24661);assertTrue("short -> long", ClassUtils.isAssignable(Short.class, Long.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24662);assertTrue("short -> float", ClassUtils.isAssignable(Short.class, Float.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24663);assertTrue("short -> double", ClassUtils.isAssignable(Short.class, Double.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24664);assertFalse("short -> boolean", ClassUtils.isAssignable(Short.class, Boolean.TYPE, true));

        // test char conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24665);assertTrue("char -> char", ClassUtils.isAssignable(Character.class, Character.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24666);assertFalse("char -> byte", ClassUtils.isAssignable(Character.class, Byte.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24667);assertFalse("char -> short", ClassUtils.isAssignable(Character.class, Short.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24668);assertTrue("char -> int", ClassUtils.isAssignable(Character.class, Integer.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24669);assertTrue("char -> long", ClassUtils.isAssignable(Character.class, Long.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24670);assertTrue("char -> float", ClassUtils.isAssignable(Character.class, Float.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24671);assertTrue("char -> double", ClassUtils.isAssignable(Character.class, Double.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24672);assertFalse("char -> boolean", ClassUtils.isAssignable(Character.class, Boolean.TYPE, true));

        // test int conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24673);assertFalse("int -> char", ClassUtils.isAssignable(Integer.class, Character.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24674);assertFalse("int -> byte", ClassUtils.isAssignable(Integer.class, Byte.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24675);assertFalse("int -> short", ClassUtils.isAssignable(Integer.class, Short.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24676);assertTrue("int -> int", ClassUtils.isAssignable(Integer.class, Integer.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24677);assertTrue("int -> long", ClassUtils.isAssignable(Integer.class, Long.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24678);assertTrue("int -> float", ClassUtils.isAssignable(Integer.class, Float.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24679);assertTrue("int -> double", ClassUtils.isAssignable(Integer.class, Double.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24680);assertFalse("int -> boolean", ClassUtils.isAssignable(Integer.class, Boolean.TYPE, true));

        // test long conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24681);assertFalse("long -> char", ClassUtils.isAssignable(Long.class, Character.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24682);assertFalse("long -> byte", ClassUtils.isAssignable(Long.class, Byte.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24683);assertFalse("long -> short", ClassUtils.isAssignable(Long.class, Short.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24684);assertFalse("long -> int", ClassUtils.isAssignable(Long.class, Integer.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24685);assertTrue("long -> long", ClassUtils.isAssignable(Long.class, Long.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24686);assertTrue("long -> float", ClassUtils.isAssignable(Long.class, Float.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24687);assertTrue("long -> double", ClassUtils.isAssignable(Long.class, Double.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24688);assertFalse("long -> boolean", ClassUtils.isAssignable(Long.class, Boolean.TYPE, true));

        // test float conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24689);assertFalse("float -> char", ClassUtils.isAssignable(Float.class, Character.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24690);assertFalse("float -> byte", ClassUtils.isAssignable(Float.class, Byte.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24691);assertFalse("float -> short", ClassUtils.isAssignable(Float.class, Short.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24692);assertFalse("float -> int", ClassUtils.isAssignable(Float.class, Integer.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24693);assertFalse("float -> long", ClassUtils.isAssignable(Float.class, Long.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24694);assertTrue("float -> float", ClassUtils.isAssignable(Float.class, Float.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24695);assertTrue("float -> double", ClassUtils.isAssignable(Float.class, Double.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24696);assertFalse("float -> boolean", ClassUtils.isAssignable(Float.class, Boolean.TYPE, true));

        // test double conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24697);assertFalse("double -> char", ClassUtils.isAssignable(Double.class, Character.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24698);assertFalse("double -> byte", ClassUtils.isAssignable(Double.class, Byte.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24699);assertFalse("double -> short", ClassUtils.isAssignable(Double.class, Short.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24700);assertFalse("double -> int", ClassUtils.isAssignable(Double.class, Integer.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24701);assertFalse("double -> long", ClassUtils.isAssignable(Double.class, Long.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24702);assertFalse("double -> float", ClassUtils.isAssignable(Double.class, Float.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24703);assertTrue("double -> double", ClassUtils.isAssignable(Double.class, Double.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24704);assertFalse("double -> boolean", ClassUtils.isAssignable(Double.class, Boolean.TYPE, true));

        // test boolean conversions
        __CLR4_1_2iouioul3lqxto4.R.inc(24705);assertFalse("boolean -> char", ClassUtils.isAssignable(Boolean.class, Character.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24706);assertFalse("boolean -> byte", ClassUtils.isAssignable(Boolean.class, Byte.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24707);assertFalse("boolean -> short", ClassUtils.isAssignable(Boolean.class, Short.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24708);assertFalse("boolean -> int", ClassUtils.isAssignable(Boolean.class, Integer.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24709);assertFalse("boolean -> long", ClassUtils.isAssignable(Boolean.class, Long.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24710);assertFalse("boolean -> float", ClassUtils.isAssignable(Boolean.class, Float.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24711);assertFalse("boolean -> double", ClassUtils.isAssignable(Boolean.class, Double.TYPE, true));
        __CLR4_1_2iouioul3lqxto4.R.inc(24712);assertTrue("boolean -> boolean", ClassUtils.isAssignable(Boolean.class, Boolean.TYPE, true));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testIsPrimitiveOrWrapper() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_211zy6sj2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testIsPrimitiveOrWrapper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24713,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_211zy6sj2h(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24713);

        // test primitive wrapper classes
        __CLR4_1_2iouioul3lqxto4.R.inc(24714);assertTrue("Boolean.class", ClassUtils.isPrimitiveOrWrapper(Boolean.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24715);assertTrue("Byte.class", ClassUtils.isPrimitiveOrWrapper(Byte.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24716);assertTrue("Character.class", ClassUtils.isPrimitiveOrWrapper(Character.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24717);assertTrue("Short.class", ClassUtils.isPrimitiveOrWrapper(Short.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24718);assertTrue("Integer.class", ClassUtils.isPrimitiveOrWrapper(Integer.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24719);assertTrue("Long.class", ClassUtils.isPrimitiveOrWrapper(Long.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24720);assertTrue("Double.class", ClassUtils.isPrimitiveOrWrapper(Double.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24721);assertTrue("Float.class", ClassUtils.isPrimitiveOrWrapper(Float.class));
        
        // test primitive classes
        __CLR4_1_2iouioul3lqxto4.R.inc(24722);assertTrue("boolean", ClassUtils.isPrimitiveOrWrapper(Boolean.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24723);assertTrue("byte", ClassUtils.isPrimitiveOrWrapper(Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24724);assertTrue("char", ClassUtils.isPrimitiveOrWrapper(Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24725);assertTrue("short", ClassUtils.isPrimitiveOrWrapper(Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24726);assertTrue("int", ClassUtils.isPrimitiveOrWrapper(Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24727);assertTrue("long", ClassUtils.isPrimitiveOrWrapper(Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24728);assertTrue("double", ClassUtils.isPrimitiveOrWrapper(Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24729);assertTrue("float", ClassUtils.isPrimitiveOrWrapper(Float.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24730);assertTrue("Void.TYPE", ClassUtils.isPrimitiveOrWrapper(Void.TYPE));
        
        // others
        __CLR4_1_2iouioul3lqxto4.R.inc(24731);assertFalse("null", ClassUtils.isPrimitiveOrWrapper(null));
        __CLR4_1_2iouioul3lqxto4.R.inc(24732);assertFalse("Void.class", ClassUtils.isPrimitiveOrWrapper(Void.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24733);assertFalse("String.class", ClassUtils.isPrimitiveOrWrapper(String.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24734);assertFalse("this.getClass()", ClassUtils.isPrimitiveOrWrapper(this.getClass()));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}
    
    @Test
    public void testIsPrimitiveWrapper() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23m013lj33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testIsPrimitiveWrapper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24735,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23m013lj33(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24735);

        // test primitive wrapper classes
        __CLR4_1_2iouioul3lqxto4.R.inc(24736);assertTrue("Boolean.class", ClassUtils.isPrimitiveWrapper(Boolean.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24737);assertTrue("Byte.class", ClassUtils.isPrimitiveWrapper(Byte.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24738);assertTrue("Character.class", ClassUtils.isPrimitiveWrapper(Character.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24739);assertTrue("Short.class", ClassUtils.isPrimitiveWrapper(Short.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24740);assertTrue("Integer.class", ClassUtils.isPrimitiveWrapper(Integer.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24741);assertTrue("Long.class", ClassUtils.isPrimitiveWrapper(Long.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24742);assertTrue("Double.class", ClassUtils.isPrimitiveWrapper(Double.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24743);assertTrue("Float.class", ClassUtils.isPrimitiveWrapper(Float.class));
        
        // test primitive classes
        __CLR4_1_2iouioul3lqxto4.R.inc(24744);assertFalse("boolean", ClassUtils.isPrimitiveWrapper(Boolean.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24745);assertFalse("byte", ClassUtils.isPrimitiveWrapper(Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24746);assertFalse("char", ClassUtils.isPrimitiveWrapper(Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24747);assertFalse("short", ClassUtils.isPrimitiveWrapper(Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24748);assertFalse("int", ClassUtils.isPrimitiveWrapper(Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24749);assertFalse("long", ClassUtils.isPrimitiveWrapper(Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24750);assertFalse("double", ClassUtils.isPrimitiveWrapper(Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24751);assertFalse("float", ClassUtils.isPrimitiveWrapper(Float.TYPE));
        
        // others
        __CLR4_1_2iouioul3lqxto4.R.inc(24752);assertFalse("null", ClassUtils.isPrimitiveWrapper(null));
        __CLR4_1_2iouioul3lqxto4.R.inc(24753);assertFalse("Void.class", ClassUtils.isPrimitiveWrapper(Void.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24754);assertFalse("Void.TYPE", ClassUtils.isPrimitiveWrapper(Void.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24755);assertFalse("String.class", ClassUtils.isPrimitiveWrapper(String.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24756);assertFalse("this.getClass()", ClassUtils.isPrimitiveWrapper(this.getClass()));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}
    
    @Test
    public void testPrimitiveToWrapper() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25xvma2j3p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testPrimitiveToWrapper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24757,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25xvma2j3p(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24757);

        // test primitive classes
        __CLR4_1_2iouioul3lqxto4.R.inc(24758);assertEquals("boolean -> Boolean.class",
            Boolean.class, ClassUtils.primitiveToWrapper(Boolean.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24759);assertEquals("byte -> Byte.class",
            Byte.class, ClassUtils.primitiveToWrapper(Byte.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24760);assertEquals("char -> Character.class",
            Character.class, ClassUtils.primitiveToWrapper(Character.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24761);assertEquals("short -> Short.class",
            Short.class, ClassUtils.primitiveToWrapper(Short.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24762);assertEquals("int -> Integer.class",
            Integer.class, ClassUtils.primitiveToWrapper(Integer.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24763);assertEquals("long -> Long.class",
            Long.class, ClassUtils.primitiveToWrapper(Long.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24764);assertEquals("double -> Double.class",
            Double.class, ClassUtils.primitiveToWrapper(Double.TYPE));
        __CLR4_1_2iouioul3lqxto4.R.inc(24765);assertEquals("float -> Float.class",
            Float.class, ClassUtils.primitiveToWrapper(Float.TYPE));

        // test a few other classes
        __CLR4_1_2iouioul3lqxto4.R.inc(24766);assertEquals("String.class -> String.class",
            String.class, ClassUtils.primitiveToWrapper(String.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24767);assertEquals("ClassUtils.class -> ClassUtils.class",
            org.apache.commons.lang3.ClassUtils.class,
            ClassUtils.primitiveToWrapper(org.apache.commons.lang3.ClassUtils.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24768);assertEquals("Void.TYPE -> Void.TYPE",
            Void.TYPE, ClassUtils.primitiveToWrapper(Void.TYPE));

        // test null
        __CLR4_1_2iouioul3lqxto4.R.inc(24769);assertNull("null -> null",
            ClassUtils.primitiveToWrapper(null));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testPrimitivesToWrappers() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vjzg00j42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testPrimitivesToWrappers",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24770,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vjzg00j42(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24770);
        // test null
//        assertNull("null -> null", ClassUtils.primitivesToWrappers(null)); // generates warning
        __CLR4_1_2iouioul3lqxto4.R.inc(24771);assertNull("null -> null", ClassUtils.primitivesToWrappers((Class<?>[]) null)); // equivalent cast to avoid warning
        // Other possible casts for null
        __CLR4_1_2iouioul3lqxto4.R.inc(24772);assertTrue("empty -> empty", Arrays.equals(ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.primitivesToWrappers()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24773);final Class<?>[] castNull = ClassUtils.primitivesToWrappers((Class<?>)null); // == new Class<?>[]{null}
        __CLR4_1_2iouioul3lqxto4.R.inc(24774);assertTrue("(Class<?>)null -> [null]", Arrays.equals(new Class<?>[]{null}, castNull));
        // test empty array is returned unchanged
        // TODO this is not documented
        __CLR4_1_2iouioul3lqxto4.R.inc(24775);assertArrayEquals("empty -> empty",
                ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.primitivesToWrappers(ArrayUtils.EMPTY_CLASS_ARRAY));

        // test an array of various classes
        __CLR4_1_2iouioul3lqxto4.R.inc(24776);final Class<?>[] primitives = new Class[] {
                Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE,
                Integer.TYPE, Long.TYPE, Double.TYPE, Float.TYPE,
                String.class, ClassUtils.class
        };
        __CLR4_1_2iouioul3lqxto4.R.inc(24777);final Class<?>[] wrappers= ClassUtils.primitivesToWrappers(primitives);

        __CLR4_1_2iouioul3lqxto4.R.inc(24778);for (int i=0; (((i < primitives.length)&&(__CLR4_1_2iouioul3lqxto4.R.iget(24779)!=0|true))||(__CLR4_1_2iouioul3lqxto4.R.iget(24780)==0&false)); i++) {{
            // test each returned wrapper
            __CLR4_1_2iouioul3lqxto4.R.inc(24781);final Class<?> primitive = primitives[i];
            __CLR4_1_2iouioul3lqxto4.R.inc(24782);final Class<?> expectedWrapper = ClassUtils.primitiveToWrapper(primitive);

            __CLR4_1_2iouioul3lqxto4.R.inc(24783);assertEquals(primitive + " -> " + expectedWrapper, expectedWrapper, wrappers[i]);
        }

        // test an array of no primitive classes
        }__CLR4_1_2iouioul3lqxto4.R.inc(24784);final Class<?>[] noPrimitives = new Class[] {
                String.class, ClassUtils.class, Void.TYPE
        };
        // This used to return the exact same array, but no longer does.
        __CLR4_1_2iouioul3lqxto4.R.inc(24785);assertNotSame("unmodified", noPrimitives, ClassUtils.primitivesToWrappers(noPrimitives));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testWrapperToPrimitive() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ebqz7yj4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWrapperToPrimitive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24786,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ebqz7yj4i(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24786);
        // an array with classes to convert
        __CLR4_1_2iouioul3lqxto4.R.inc(24787);final Class<?>[] primitives = {
                Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE,
                Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE
        };
        __CLR4_1_2iouioul3lqxto4.R.inc(24788);for (final Class<?> primitive : primitives) {{
            __CLR4_1_2iouioul3lqxto4.R.inc(24789);final Class<?> wrapperCls = ClassUtils.primitiveToWrapper(primitive);
            __CLR4_1_2iouioul3lqxto4.R.inc(24790);assertFalse("Still primitive", wrapperCls.isPrimitive());
            __CLR4_1_2iouioul3lqxto4.R.inc(24791);assertEquals(wrapperCls + " -> " + primitive, primitive,
                    ClassUtils.wrapperToPrimitive(wrapperCls));
        }
    }}finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testWrapperToPrimitiveNoWrapper() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25rydimj4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWrapperToPrimitiveNoWrapper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24792,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25rydimj4o(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24792);
        __CLR4_1_2iouioul3lqxto4.R.inc(24793);assertNull("Wrong result for non wrapper class", ClassUtils.wrapperToPrimitive(String.class));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testWrapperToPrimitiveNull() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fusfifj4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWrapperToPrimitiveNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24794,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fusfifj4q(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24794);
        __CLR4_1_2iouioul3lqxto4.R.inc(24795);assertNull("Wrong result for null class", ClassUtils.wrapperToPrimitive(null));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testWrappersToPrimitives() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ow2z5sj4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWrappersToPrimitives",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24796,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ow2z5sj4s(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24796);
        // an array with classes to test
        __CLR4_1_2iouioul3lqxto4.R.inc(24797);final Class<?>[] classes = {
                Boolean.class, Byte.class, Character.class, Short.class,
                Integer.class, Long.class, Float.class, Double.class,
                String.class, ClassUtils.class, null
        };

        __CLR4_1_2iouioul3lqxto4.R.inc(24798);final Class<?>[] primitives = ClassUtils.wrappersToPrimitives(classes);
        // now test the result
        __CLR4_1_2iouioul3lqxto4.R.inc(24799);assertEquals("Wrong length of result array", classes.length, primitives.length);
        __CLR4_1_2iouioul3lqxto4.R.inc(24800);for (int i = 0; (((i < classes.length)&&(__CLR4_1_2iouioul3lqxto4.R.iget(24801)!=0|true))||(__CLR4_1_2iouioul3lqxto4.R.iget(24802)==0&false)); i++) {{
            __CLR4_1_2iouioul3lqxto4.R.inc(24803);final Class<?> expectedPrimitive = ClassUtils.wrapperToPrimitive(classes[i]);
            __CLR4_1_2iouioul3lqxto4.R.inc(24804);assertEquals(classes[i] + " -> " + expectedPrimitive, expectedPrimitive,
                    primitives[i]);
        }
    }}finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testWrappersToPrimitivesNull() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xcgh53j51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWrappersToPrimitivesNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24805,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xcgh53j51(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24805);
//        assertNull("Wrong result for null input", ClassUtils.wrappersToPrimitives(null)); // generates warning
        __CLR4_1_2iouioul3lqxto4.R.inc(24806);assertNull("Wrong result for null input", ClassUtils.wrappersToPrimitives((Class<?>[]) null)); // equivalent cast
        // Other possible casts for null
        __CLR4_1_2iouioul3lqxto4.R.inc(24807);assertTrue("empty -> empty", Arrays.equals(ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.wrappersToPrimitives()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24808);final Class<?>[] castNull = ClassUtils.wrappersToPrimitives((Class<?>)null); // == new Class<?>[]{null}
        __CLR4_1_2iouioul3lqxto4.R.inc(24809);assertTrue("(Class<?>)null -> [null]", Arrays.equals(new Class<?>[]{null}, castNull));
}finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testWrappersToPrimitivesEmpty() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21sby2jj56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWrappersToPrimitivesEmpty",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24810,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21sby2jj56(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24810);
        __CLR4_1_2iouioul3lqxto4.R.inc(24811);final Class<?>[] empty = new Class[0];
        __CLR4_1_2iouioul3lqxto4.R.inc(24812);assertArrayEquals("Wrong result for empty input", empty, ClassUtils.wrappersToPrimitives(empty));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testGetClassClassNotFound() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fwwrej59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassClassNotFound",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24813,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fwwrej59() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24813);
        __CLR4_1_2iouioul3lqxto4.R.inc(24814);assertGetClassThrowsClassNotFound( "bool" );
        __CLR4_1_2iouioul3lqxto4.R.inc(24815);assertGetClassThrowsClassNotFound( "bool[]" );
        __CLR4_1_2iouioul3lqxto4.R.inc(24816);assertGetClassThrowsClassNotFound( "integer[]" );
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testGetClassInvalidArguments() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ia7jaej5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassInvalidArguments",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24817,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ia7jaej5d() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24817);
        __CLR4_1_2iouioul3lqxto4.R.inc(24818);assertGetClassThrowsNullPointerException( null );
        __CLR4_1_2iouioul3lqxto4.R.inc(24819);assertGetClassThrowsClassNotFound( "[][][]" );
        __CLR4_1_2iouioul3lqxto4.R.inc(24820);assertGetClassThrowsClassNotFound( "[[]" );
        __CLR4_1_2iouioul3lqxto4.R.inc(24821);assertGetClassThrowsClassNotFound( "[" );
        __CLR4_1_2iouioul3lqxto4.R.inc(24822);assertGetClassThrowsClassNotFound( "java.lang.String][" );
        __CLR4_1_2iouioul3lqxto4.R.inc(24823);assertGetClassThrowsClassNotFound( ".hello.world" );
        __CLR4_1_2iouioul3lqxto4.R.inc(24824);assertGetClassThrowsClassNotFound( "hello..world" );
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testWithInterleavingWhitespace() throws ClassNotFoundException {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i1cjpoj5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testWithInterleavingWhitespace",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24825,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i1cjpoj5l() throws ClassNotFoundException{try{__CLR4_1_2iouioul3lqxto4.R.inc(24825);
        __CLR4_1_2iouioul3lqxto4.R.inc(24826);assertEquals( int[].class, ClassUtils.getClass( " int [ ] " ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24827);assertEquals( long[].class, ClassUtils.getClass( "\rlong\t[\n]\r" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24828);assertEquals( short[].class, ClassUtils.getClass( "\tshort                \t\t[]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24829);assertEquals( byte[].class, ClassUtils.getClass( "byte[\t\t\n\r]   " ) );
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testGetInnerClass() throws ClassNotFoundException {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25ve3m5j5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetInnerClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24830,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25ve3m5j5q() throws ClassNotFoundException{try{__CLR4_1_2iouioul3lqxto4.R.inc(24830);
        __CLR4_1_2iouioul3lqxto4.R.inc(24831);assertEquals( Inner.DeeplyNested.class, ClassUtils.getClass( "org.apache.commons.lang3.ClassUtilsTest.Inner.DeeplyNested" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24832);assertEquals( Inner.DeeplyNested.class, ClassUtils.getClass( "org.apache.commons.lang3.ClassUtilsTest.Inner$DeeplyNested" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24833);assertEquals( Inner.DeeplyNested.class, ClassUtils.getClass( "org.apache.commons.lang3.ClassUtilsTest$Inner$DeeplyNested" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24834);assertEquals( Inner.DeeplyNested.class, ClassUtils.getClass( "org.apache.commons.lang3.ClassUtilsTest$Inner.DeeplyNested" ) );
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testGetClassByNormalNameArrays() throws ClassNotFoundException {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22nh3mqj5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassByNormalNameArrays",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24835,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22nh3mqj5v() throws ClassNotFoundException{try{__CLR4_1_2iouioul3lqxto4.R.inc(24835);
        __CLR4_1_2iouioul3lqxto4.R.inc(24836);assertEquals( int[].class, ClassUtils.getClass( "int[]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24837);assertEquals( long[].class, ClassUtils.getClass( "long[]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24838);assertEquals( short[].class, ClassUtils.getClass( "short[]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24839);assertEquals( byte[].class, ClassUtils.getClass( "byte[]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24840);assertEquals( char[].class, ClassUtils.getClass( "char[]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24841);assertEquals( float[].class, ClassUtils.getClass( "float[]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24842);assertEquals( double[].class, ClassUtils.getClass( "double[]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24843);assertEquals( boolean[].class, ClassUtils.getClass( "boolean[]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24844);assertEquals( String[].class, ClassUtils.getClass( "java.lang.String[]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24845);assertEquals( java.util.Map.Entry[].class, ClassUtils.getClass( "java.util.Map.Entry[]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24846);assertEquals( java.util.Map.Entry[].class, ClassUtils.getClass( "java.util.Map$Entry[]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24847);assertEquals( java.util.Map.Entry[].class, ClassUtils.getClass( "[Ljava.util.Map.Entry;" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24848);assertEquals( java.util.Map.Entry[].class, ClassUtils.getClass( "[Ljava.util.Map$Entry;" ) );
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testGetClassByNormalNameArrays2D() throws ClassNotFoundException {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fmq01cj69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassByNormalNameArrays2D",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24849,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fmq01cj69() throws ClassNotFoundException{try{__CLR4_1_2iouioul3lqxto4.R.inc(24849);
        __CLR4_1_2iouioul3lqxto4.R.inc(24850);assertEquals( int[][].class, ClassUtils.getClass( "int[][]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24851);assertEquals( long[][].class, ClassUtils.getClass( "long[][]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24852);assertEquals( short[][].class, ClassUtils.getClass( "short[][]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24853);assertEquals( byte[][].class, ClassUtils.getClass( "byte[][]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24854);assertEquals( char[][].class, ClassUtils.getClass( "char[][]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24855);assertEquals( float[][].class, ClassUtils.getClass( "float[][]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24856);assertEquals( double[][].class, ClassUtils.getClass( "double[][]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24857);assertEquals( boolean[][].class, ClassUtils.getClass( "boolean[][]" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24858);assertEquals( String[][].class, ClassUtils.getClass( "java.lang.String[][]" ) );
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testGetClassWithArrayClasses2D() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23ov134j6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassWithArrayClasses2D",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24859,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23ov134j6j() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24859);
        __CLR4_1_2iouioul3lqxto4.R.inc(24860);assertGetClassReturnsClass( String[][].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24861);assertGetClassReturnsClass( int[][].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24862);assertGetClassReturnsClass( long[][].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24863);assertGetClassReturnsClass( short[][].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24864);assertGetClassReturnsClass( byte[][].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24865);assertGetClassReturnsClass( char[][].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24866);assertGetClassReturnsClass( float[][].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24867);assertGetClassReturnsClass( double[][].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24868);assertGetClassReturnsClass( boolean[][].class );
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testGetClassWithArrayClasses() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k3crcej6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassWithArrayClasses",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24869,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k3crcej6t() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24869);
        __CLR4_1_2iouioul3lqxto4.R.inc(24870);assertGetClassReturnsClass( String[].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24871);assertGetClassReturnsClass( int[].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24872);assertGetClassReturnsClass( long[].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24873);assertGetClassReturnsClass( short[].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24874);assertGetClassReturnsClass( byte[].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24875);assertGetClassReturnsClass( char[].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24876);assertGetClassReturnsClass( float[].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24877);assertGetClassReturnsClass( double[].class );
        __CLR4_1_2iouioul3lqxto4.R.inc(24878);assertGetClassReturnsClass( boolean[].class );
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testGetClassRawPrimitives() throws ClassNotFoundException {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2od0gm1j73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetClassRawPrimitives",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24879,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2od0gm1j73() throws ClassNotFoundException{try{__CLR4_1_2iouioul3lqxto4.R.inc(24879);
        __CLR4_1_2iouioul3lqxto4.R.inc(24880);assertEquals( int.class, ClassUtils.getClass( "int" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24881);assertEquals( long.class, ClassUtils.getClass( "long" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24882);assertEquals( short.class, ClassUtils.getClass( "short" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24883);assertEquals( byte.class, ClassUtils.getClass( "byte" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24884);assertEquals( char.class, ClassUtils.getClass( "char" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24885);assertEquals( float.class, ClassUtils.getClass( "float" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24886);assertEquals( double.class, ClassUtils.getClass( "double" ) );
        __CLR4_1_2iouioul3lqxto4.R.inc(24887);assertEquals( boolean.class, ClassUtils.getClass( "boolean" ) );
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    private void assertGetClassReturnsClass( final Class<?> c ) throws Exception {try{__CLR4_1_2iouioul3lqxto4.R.inc(24888);
        __CLR4_1_2iouioul3lqxto4.R.inc(24889);assertEquals( c, ClassUtils.getClass( c.getName() ) );
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    private void assertGetClassThrowsException( final String className, final Class<?> exceptionType ) throws Exception {try{__CLR4_1_2iouioul3lqxto4.R.inc(24890);
        __CLR4_1_2iouioul3lqxto4.R.inc(24891);try {
            __CLR4_1_2iouioul3lqxto4.R.inc(24892);ClassUtils.getClass( className );
            __CLR4_1_2iouioul3lqxto4.R.inc(24893);fail( "ClassUtils.getClass() should fail with an exception of type " + exceptionType.getName() + " when given class name \"" + className + "\"." );
        }
        catch( final Exception e ) {
            __CLR4_1_2iouioul3lqxto4.R.inc(24894);assertTrue( exceptionType.isAssignableFrom( e.getClass() ) );
        }
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    private void assertGetClassThrowsNullPointerException( final String className ) throws Exception {try{__CLR4_1_2iouioul3lqxto4.R.inc(24895);
        __CLR4_1_2iouioul3lqxto4.R.inc(24896);assertGetClassThrowsException( className, NullPointerException.class );
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    private void assertGetClassThrowsClassNotFound( final String className ) throws Exception {try{__CLR4_1_2iouioul3lqxto4.R.inc(24897);
        __CLR4_1_2iouioul3lqxto4.R.inc(24898);assertGetClassThrowsException( className, ClassNotFoundException.class );
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    // Show the Java bug: http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4071957
    // We may have to delete this if a JDK fixes the bug.
    @Test
    public void testShowJavaBug() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b2l4x6j7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testShowJavaBug",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24899,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b2l4x6j7n() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24899);
        // Tests with Collections$UnmodifiableSet
        __CLR4_1_2iouioul3lqxto4.R.inc(24900);final Set<?> set = Collections.unmodifiableSet(new HashSet<Object>());
        __CLR4_1_2iouioul3lqxto4.R.inc(24901);final Method isEmptyMethod = set.getClass().getMethod("isEmpty",  new Class[0]);
        __CLR4_1_2iouioul3lqxto4.R.inc(24902);try {
            __CLR4_1_2iouioul3lqxto4.R.inc(24903);isEmptyMethod.invoke(set, new Object[0]);
            __CLR4_1_2iouioul3lqxto4.R.inc(24904);fail("Failed to throw IllegalAccessException as expected");
        } catch(final IllegalAccessException iae) {
            // expected
        }
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testGetPublicMethod() throws Exception {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ywjiobj7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testGetPublicMethod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24905,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ywjiobj7t() throws Exception{try{__CLR4_1_2iouioul3lqxto4.R.inc(24905);
        // Tests with Collections$UnmodifiableSet
        __CLR4_1_2iouioul3lqxto4.R.inc(24906);final Set<?> set = Collections.unmodifiableSet(new HashSet<Object>());
        __CLR4_1_2iouioul3lqxto4.R.inc(24907);final Method isEmptyMethod = ClassUtils.getPublicMethod(set.getClass(), "isEmpty",  new Class[0]);
            __CLR4_1_2iouioul3lqxto4.R.inc(24908);assertTrue(Modifier.isPublic(isEmptyMethod.getDeclaringClass().getModifiers()));

        __CLR4_1_2iouioul3lqxto4.R.inc(24909);try {
            __CLR4_1_2iouioul3lqxto4.R.inc(24910);isEmptyMethod.invoke(set, new Object[0]);
        } catch(final java.lang.IllegalAccessException iae) {
            __CLR4_1_2iouioul3lqxto4.R.inc(24911);fail("Should not have thrown IllegalAccessException");
        }

        // Tests with a public Class
        __CLR4_1_2iouioul3lqxto4.R.inc(24912);final Method toStringMethod = ClassUtils.getPublicMethod(Object.class, "toString",  new Class[0]);
            __CLR4_1_2iouioul3lqxto4.R.inc(24913);assertEquals(Object.class.getMethod("toString", new Class[0]), toStringMethod);
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void testToClass_object() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v8bl5yj82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.testToClass_object",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24914,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v8bl5yj82(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24914);
//        assertNull(ClassUtils.toClass(null)); // generates warning
        __CLR4_1_2iouioul3lqxto4.R.inc(24915);assertNull(ClassUtils.toClass((Object[]) null)); // equivalent explicit cast
        
        // Additional varargs tests
        __CLR4_1_2iouioul3lqxto4.R.inc(24916);assertTrue("empty -> empty", Arrays.equals(ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.toClass()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24917);final Class<?>[] castNull = ClassUtils.toClass((Object) null); // == new Object[]{null}
        __CLR4_1_2iouioul3lqxto4.R.inc(24918);assertTrue("(Object)null -> [null]", Arrays.equals(new Object[]{null}, castNull));

        __CLR4_1_2iouioul3lqxto4.R.inc(24919);assertSame(ArrayUtils.EMPTY_CLASS_ARRAY, ClassUtils.toClass(ArrayUtils.EMPTY_OBJECT_ARRAY));

        __CLR4_1_2iouioul3lqxto4.R.inc(24920);assertTrue(Arrays.equals(new Class[] { String.class, Integer.class, Double.class },
                ClassUtils.toClass(new Object[] { "Test", Integer.valueOf(1), Double.valueOf(99d) })));

        __CLR4_1_2iouioul3lqxto4.R.inc(24921);assertTrue(Arrays.equals(new Class[] { String.class, null, Double.class },
                ClassUtils.toClass(new Object[] { "Test", null, Double.valueOf(99d) })));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_getShortCanonicalName_Object() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2u5zf5lj8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getShortCanonicalName_Object",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24922,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2u5zf5lj8a(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24922);
        __CLR4_1_2iouioul3lqxto4.R.inc(24923);assertEquals("<null>", ClassUtils.getShortCanonicalName(null, "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24924);assertEquals("ClassUtils", ClassUtils.getShortCanonicalName(new ClassUtils(), "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24925);assertEquals("ClassUtils[]", ClassUtils.getShortCanonicalName(new ClassUtils[0], "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24926);assertEquals("ClassUtils[][]", ClassUtils.getShortCanonicalName(new ClassUtils[0][0], "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24927);assertEquals("int[]", ClassUtils.getShortCanonicalName(new int[0], "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24928);assertEquals("int[][]", ClassUtils.getShortCanonicalName(new int[0][0], "<null>"));

        // Inner types
        class Named extends Object {}
        __CLR4_1_2iouioul3lqxto4.R.inc(24929);assertEquals("ClassUtilsTest.6", ClassUtils.getShortCanonicalName(new Object(){}, "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24930);assertEquals("ClassUtilsTest.5Named", ClassUtils.getShortCanonicalName(new Named(), "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24931);assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortCanonicalName(new Inner(), "<null>"));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_getShortCanonicalName_Class() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22muc8kj8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getShortCanonicalName_Class",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24932,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22muc8kj8k(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24932);
        __CLR4_1_2iouioul3lqxto4.R.inc(24933);assertEquals("ClassUtils", ClassUtils.getShortCanonicalName(ClassUtils.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24934);assertEquals("ClassUtils[]", ClassUtils.getShortCanonicalName(ClassUtils[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24935);assertEquals("ClassUtils[][]", ClassUtils.getShortCanonicalName(ClassUtils[][].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24936);assertEquals("int[]", ClassUtils.getShortCanonicalName(int[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24937);assertEquals("int[][]", ClassUtils.getShortCanonicalName(int[][].class));
        
        // Inner types
        class Named extends Object {}
        __CLR4_1_2iouioul3lqxto4.R.inc(24938);assertEquals("ClassUtilsTest.7", ClassUtils.getShortCanonicalName(new Object(){}.getClass()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24939);assertEquals("ClassUtilsTest.6Named", ClassUtils.getShortCanonicalName(Named.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24940);assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortCanonicalName(Inner.class));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_getShortCanonicalName_String() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ubgmwlj8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getShortCanonicalName_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24941,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ubgmwlj8t(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24941);
        __CLR4_1_2iouioul3lqxto4.R.inc(24942);assertEquals("ClassUtils", ClassUtils.getShortCanonicalName("org.apache.commons.lang3.ClassUtils"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24943);assertEquals("ClassUtils[]", ClassUtils.getShortCanonicalName("[Lorg.apache.commons.lang3.ClassUtils;"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24944);assertEquals("ClassUtils[][]", ClassUtils.getShortCanonicalName("[[Lorg.apache.commons.lang3.ClassUtils;"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24945);assertEquals("ClassUtils[]", ClassUtils.getShortCanonicalName("org.apache.commons.lang3.ClassUtils[]"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24946);assertEquals("ClassUtils[][]", ClassUtils.getShortCanonicalName("org.apache.commons.lang3.ClassUtils[][]"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24947);assertEquals("int[]", ClassUtils.getShortCanonicalName("[I"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24948);assertEquals("int[][]", ClassUtils.getShortCanonicalName("[[I"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24949);assertEquals("int[]", ClassUtils.getShortCanonicalName("int[]"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24950);assertEquals("int[][]", ClassUtils.getShortCanonicalName("int[][]"));
        
        // Inner types
        __CLR4_1_2iouioul3lqxto4.R.inc(24951);assertEquals("ClassUtilsTest.6", ClassUtils.getShortCanonicalName("org.apache.commons.lang3.ClassUtilsTest$6"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24952);assertEquals("ClassUtilsTest.5Named", ClassUtils.getShortCanonicalName("org.apache.commons.lang3.ClassUtilsTest$5Named"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24953);assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortCanonicalName("org.apache.commons.lang3.ClassUtilsTest$Inner"));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_getPackageCanonicalName_Object() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uv535vj96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getPackageCanonicalName_Object",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24954,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uv535vj96(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24954);
        __CLR4_1_2iouioul3lqxto4.R.inc(24955);assertEquals("<null>", ClassUtils.getPackageCanonicalName(null, "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24956);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new ClassUtils(), "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24957);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new ClassUtils[0], "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24958);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new ClassUtils[0][0], "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24959);assertEquals("", ClassUtils.getPackageCanonicalName(new int[0], "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24960);assertEquals("", ClassUtils.getPackageCanonicalName(new int[0][0], "<null>"));
        
        // Inner types
        class Named extends Object {}
        __CLR4_1_2iouioul3lqxto4.R.inc(24961);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new Object(){}, "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24962);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new Named(), "<null>"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24963);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new Inner(), "<null>"));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_getPackageCanonicalName_Class() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bjkouj9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getPackageCanonicalName_Class",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24964,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bjkouj9g(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24964);
        __CLR4_1_2iouioul3lqxto4.R.inc(24965);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(ClassUtils.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24966);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(ClassUtils[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24967);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(ClassUtils[][].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24968);assertEquals("", ClassUtils.getPackageCanonicalName(int[].class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24969);assertEquals("", ClassUtils.getPackageCanonicalName(int[][].class));
        
        // Inner types
        class Named extends Object {}
        __CLR4_1_2iouioul3lqxto4.R.inc(24970);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new Object(){}.getClass()));
        __CLR4_1_2iouioul3lqxto4.R.inc(24971);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(Named.class));
        __CLR4_1_2iouioul3lqxto4.R.inc(24972);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(Inner.class));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

    @Test
    public void test_getPackageCanonicalName_String() {__CLR4_1_2iouioul3lqxto4.R.globalSliceStart(getClass().getName(),24973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tmaywbj9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2iouioul3lqxto4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2iouioul3lqxto4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ClassUtilsTest.test_getPackageCanonicalName_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24973,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tmaywbj9p(){try{__CLR4_1_2iouioul3lqxto4.R.inc(24973);
        __CLR4_1_2iouioul3lqxto4.R.inc(24974);assertEquals("org.apache.commons.lang3",
            ClassUtils.getPackageCanonicalName("org.apache.commons.lang3.ClassUtils"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24975);assertEquals("org.apache.commons.lang3",
            ClassUtils.getPackageCanonicalName("[Lorg.apache.commons.lang3.ClassUtils;"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24976);assertEquals("org.apache.commons.lang3",
            ClassUtils.getPackageCanonicalName("[[Lorg.apache.commons.lang3.ClassUtils;"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24977);assertEquals("org.apache.commons.lang3",
            ClassUtils.getPackageCanonicalName("org.apache.commons.lang3.ClassUtils[]"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24978);assertEquals("org.apache.commons.lang3",
            ClassUtils.getPackageCanonicalName("org.apache.commons.lang3.ClassUtils[][]"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24979);assertEquals("", ClassUtils.getPackageCanonicalName("[I"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24980);assertEquals("", ClassUtils.getPackageCanonicalName("[[I"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24981);assertEquals("", ClassUtils.getPackageCanonicalName("int[]"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24982);assertEquals("", ClassUtils.getPackageCanonicalName("int[][]"));
        
        // Inner types
        __CLR4_1_2iouioul3lqxto4.R.inc(24983);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName("org.apache.commons.lang3.ClassUtilsTest$6"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24984);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName("org.apache.commons.lang3.ClassUtilsTest$5Named"));
        __CLR4_1_2iouioul3lqxto4.R.inc(24985);assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName("org.apache.commons.lang3.ClassUtilsTest$Inner"));
    }finally{__CLR4_1_2iouioul3lqxto4.R.flushNeeded();}}

}
