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

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static org.apache.commons.lang3.AnnotationUtilsTest.Stooge.CURLY;
import static org.apache.commons.lang3.AnnotationUtilsTest.Stooge.LARRY;
import static org.apache.commons.lang3.AnnotationUtilsTest.Stooge.MOE;
import static org.apache.commons.lang3.AnnotationUtilsTest.Stooge.SHEMP;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

/**
 * @version $Id$
 */
public class AnnotationUtilsTest {static class __CLR4_1_2evtevtl3lqxt2c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,19359,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @TestAnnotation(
            booleanValue = false,
            booleanValues = { false },
            byteValue = 0,
            byteValues = { 0 },
            charValue = 0,
            charValues = { 0 },
            doubleValue = 0,
            doubleValues = { 0 },
            floatValue = 0,
            floatValues = { 0 },
            intValue = 0,
            intValues = { 0 },
            longValue = 0,
            longValues = { 0 },
            nest = @NestAnnotation(
                    booleanValue = false,
                    booleanValues = { false },
                    byteValue = 0,
                    byteValues = { 0 },
                    charValue = 0,
                    charValues = { 0 },
                    doubleValue = 0,
                    doubleValues = { 0 },
                    floatValue = 0,
                    floatValues = { 0 },
                    intValue = 0,
                    intValues = { 0 },
                    longValue = 0,
                    longValues = { 0 },
                    shortValue = 0,
                    shortValues = { 0 },
                    stooge = CURLY,
                    stooges = { MOE, LARRY, SHEMP },
                    string = "",
                    strings = { "" },
                    type = Object.class,
                    types = { Object.class }
            ),
            nests = {
                @NestAnnotation(
                        booleanValue = false,
                        booleanValues = { false },
                        byteValue = 0,
                        byteValues = { 0 },
                        charValue = 0,
                        charValues = { 0 },
                        doubleValue = 0,
                        doubleValues = { 0 },
                        floatValue = 0,
                        floatValues = { 0 },
                        intValue = 0,
                        intValues = { 0 },
                        longValue = 0,
                        longValues = { 0 },
                        shortValue = 0,
                        shortValues = { 0 },
                        stooge = CURLY,
                        stooges = { MOE, LARRY, SHEMP },
                        string = "",
                        strings = { "" },
                        type = Object[].class,
                        types = { Object[].class }
                )
            },
            shortValue = 0,
            shortValues = { 0 },
            stooge = SHEMP,
            stooges = { MOE, LARRY, CURLY },
            string = "",
            strings = { "" },
            type = Object.class,
            types = { Object.class }
    )
    public Object dummy1;

    @TestAnnotation(
            booleanValue = false,
            booleanValues = { false },
            byteValue = 0,
            byteValues = { 0 },
            charValue = 0,
            charValues = { 0 },
            doubleValue = 0,
            doubleValues = { 0 },
            floatValue = 0,
            floatValues = { 0 },
            intValue = 0,
            intValues = { 0 },
            longValue = 0,
            longValues = { 0 },
            nest = @NestAnnotation(
                    booleanValue = false,
                    booleanValues = { false },
                    byteValue = 0,
                    byteValues = { 0 },
                    charValue = 0,
                    charValues = { 0 },
                    doubleValue = 0,
                    doubleValues = { 0 },
                    floatValue = 0,
                    floatValues = { 0 },
                    intValue = 0,
                    intValues = { 0 },
                    longValue = 0,
                    longValues = { 0 },
                    shortValue = 0,
                    shortValues = { 0 },
                    stooge = CURLY,
                    stooges = { MOE, LARRY, SHEMP },
                    string = "",
                    strings = { "" },
                    type = Object.class,
                    types = { Object.class }
            ),
            nests = {
                @NestAnnotation(
                        booleanValue = false,
                        booleanValues = { false },
                        byteValue = 0,
                        byteValues = { 0 },
                        charValue = 0,
                        charValues = { 0 },
                        doubleValue = 0,
                        doubleValues = { 0 },
                        floatValue = 0,
                        floatValues = { 0 },
                        intValue = 0,
                        intValues = { 0 },
                        longValue = 0,
                        longValues = { 0 },
                        shortValue = 0,
                        shortValues = { 0 },
                        stooge = CURLY,
                        stooges = { MOE, LARRY, SHEMP },
                        string = "",
                        strings = { "" },
                        type = Object[].class,
                        types = { Object[].class }
                )
            },
            shortValue = 0,
            shortValues = { 0 },
            stooge = SHEMP,
            stooges = { MOE, LARRY, CURLY },
            string = "",
            strings = { "" },
            type = Object.class,
            types = { Object.class }
    )
    public Object dummy2;

    @TestAnnotation(
            booleanValue = false,
            booleanValues = { false },
            byteValue = 0,
            byteValues = { 0 },
            charValue = 0,
            charValues = { 0 },
            doubleValue = 0,
            doubleValues = { 0 },
            floatValue = 0,
            floatValues = { 0 },
            intValue = 0,
            intValues = { 0 },
            longValue = 0,
            longValues = { 0 },
            nest = @NestAnnotation(
                    booleanValue = false,
                    booleanValues = { false },
                    byteValue = 0,
                    byteValues = { 0 },
                    charValue = 0,
                    charValues = { 0 },
                    doubleValue = 0,
                    doubleValues = { 0 },
                    floatValue = 0,
                    floatValues = { 0 },
                    intValue = 0,
                    intValues = { 0 },
                    longValue = 0,
                    longValues = { 0 },
                    shortValue = 0,
                    shortValues = { 0 },
                    stooge = CURLY,
                    stooges = { MOE, LARRY, SHEMP },
                    string = "",
                    strings = { "" },
                    type = Object.class,
                    types = { Object.class }
            ),
            nests = {
                @NestAnnotation(
                        booleanValue = false,
                        booleanValues = { false },
                        byteValue = 0,
                        byteValues = { 0 },
                        charValue = 0,
                        charValues = { 0 },
                        doubleValue = 0,
                        doubleValues = { 0 },
                        floatValue = 0,
                        floatValues = { 0 },
                        intValue = 0,
                        intValues = { 0 },
                        longValue = 0,
                        longValues = { 0 },
                        shortValue = 0,
                        shortValues = { 0 },
                        stooge = CURLY,
                        stooges = { MOE, LARRY, SHEMP },
                        string = "",
                        strings = { "" },
                        type = Object[].class,
                        types = { Object[].class }
                ),
                //add a second NestAnnotation to break equality:
                @NestAnnotation(
                        booleanValue = false,
                        booleanValues = { false },
                        byteValue = 0,
                        byteValues = { 0 },
                        charValue = 0,
                        charValues = { 0 },
                        doubleValue = 0,
                        doubleValues = { 0 },
                        floatValue = 0,
                        floatValues = { 0 },
                        intValue = 0,
                        intValues = { 0 },
                        longValue = 0,
                        longValues = { 0 },
                        shortValue = 0,
                        shortValues = { 0 },
                        stooge = CURLY,
                        stooges = { MOE, LARRY, SHEMP },
                        string = "",
                        strings = { "" },
                        type = Object[].class,
                        types = { Object[].class }
                )
            },
            shortValue = 0,
            shortValues = { 0 },
            stooge = SHEMP,
            stooges = { MOE, LARRY, CURLY },
            string = "",
            strings = { "" },
            type = Object.class,
            types = { Object.class }
    )
    public Object dummy3;

    @NestAnnotation(
            booleanValue = false,
            booleanValues = { false },
            byteValue = 0,
            byteValues = { 0 },
            charValue = 0,
            charValues = { 0 },
            doubleValue = 0,
            doubleValues = { 0 },
            floatValue = 0,
            floatValues = { 0 },
            intValue = 0,
            intValues = { 0 },
            longValue = 0,
            longValues = { 0 },
            shortValue = 0,
            shortValues = { 0 },
            stooge = CURLY,
            stooges = { MOE, LARRY, SHEMP },
            string = "",
            strings = { "" },
            type = Object[].class,
            types = { Object[].class }
    )
    public Object dummy4;

    @Target(FIELD)
    @Retention(RUNTIME)
    public @interface TestAnnotation {
        String string();
        String[] strings();
        Class<?> type();
        Class<?>[] types();
        byte byteValue();
        byte[] byteValues();
        short shortValue();
        short[] shortValues();
        int intValue();
        int[] intValues();
        char charValue();
        char[] charValues();
        long longValue();
        long[] longValues();
        float floatValue();
        float[] floatValues();
        double doubleValue();
        double[] doubleValues();
        boolean booleanValue();
        boolean[] booleanValues();
        Stooge stooge();
        Stooge[] stooges();
        NestAnnotation nest();
        NestAnnotation[] nests();
    }

    public @interface NestAnnotation {
        String string();
        String[] strings();
        Class<?> type();
        Class<?>[] types();
        byte byteValue();
        byte[] byteValues();
        short shortValue();
        short[] shortValues();
        int intValue();
        int[] intValues();
        char charValue();
        char[] charValues();
        long longValue();
        long[] longValues();
        float floatValue();
        float[] floatValues();
        double doubleValue();
        double[] doubleValues();
        boolean booleanValue();
        boolean[] booleanValues();
        Stooge stooge();
        Stooge[] stooges();
    }

    public static enum Stooge {
        MOE, LARRY, CURLY, JOE, SHEMP;
    }

    private Field field1;
    private Field field2;
    private Field field3;
    private Field field4;

    @Before
    public void setup() throws Exception {try{__CLR4_1_2evtevtl3lqxt2c.R.inc(19289);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19290);field1 = getClass().getDeclaredField("dummy1");
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19291);field2 = getClass().getDeclaredField("dummy2");
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19292);field3 = getClass().getDeclaredField("dummy3");
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19293);field4 = getClass().getDeclaredField("dummy4");
    }finally{__CLR4_1_2evtevtl3lqxt2c.R.flushNeeded();}}

    @Test
    public void testEquivalence() {__CLR4_1_2evtevtl3lqxt2c.R.globalSliceStart(getClass().getName(),19294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fqchj3evy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2evtevtl3lqxt2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2evtevtl3lqxt2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testEquivalence",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19294,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fqchj3evy(){try{__CLR4_1_2evtevtl3lqxt2c.R.inc(19294);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19295);assertTrue(AnnotationUtils.equals(field1.getAnnotation(TestAnnotation.class), field2.getAnnotation(TestAnnotation.class)));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19296);assertTrue(AnnotationUtils.equals(field2.getAnnotation(TestAnnotation.class), field1.getAnnotation(TestAnnotation.class)));
    }finally{__CLR4_1_2evtevtl3lqxt2c.R.flushNeeded();}}

    @Test
    public void testSameInstance() {__CLR4_1_2evtevtl3lqxt2c.R.globalSliceStart(getClass().getName(),19297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nqiovoew1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2evtevtl3lqxt2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2evtevtl3lqxt2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testSameInstance",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19297,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nqiovoew1(){try{__CLR4_1_2evtevtl3lqxt2c.R.inc(19297);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19298);assertTrue(AnnotationUtils.equals(field1.getAnnotation(TestAnnotation.class), field1.getAnnotation(TestAnnotation.class)));
    }finally{__CLR4_1_2evtevtl3lqxt2c.R.flushNeeded();}}

    @Test
    public void testNonEquivalentAnnotationsOfSameType() {__CLR4_1_2evtevtl3lqxt2c.R.globalSliceStart(getClass().getName(),19299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2401szew3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2evtevtl3lqxt2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2evtevtl3lqxt2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testNonEquivalentAnnotationsOfSameType",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19299,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2401szew3(){try{__CLR4_1_2evtevtl3lqxt2c.R.inc(19299);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19300);assertFalse(AnnotationUtils.equals(field1.getAnnotation(TestAnnotation.class), field3.getAnnotation(TestAnnotation.class)));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19301);assertFalse(AnnotationUtils.equals(field3.getAnnotation(TestAnnotation.class), field1.getAnnotation(TestAnnotation.class)));
    }finally{__CLR4_1_2evtevtl3lqxt2c.R.flushNeeded();}}

    @Test
    public void testAnnotationsOfDifferingTypes() {__CLR4_1_2evtevtl3lqxt2c.R.globalSliceStart(getClass().getName(),19302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uyga87ew6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2evtevtl3lqxt2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2evtevtl3lqxt2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testAnnotationsOfDifferingTypes",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19302,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uyga87ew6(){try{__CLR4_1_2evtevtl3lqxt2c.R.inc(19302);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19303);assertFalse(AnnotationUtils.equals(field1.getAnnotation(TestAnnotation.class), field4.getAnnotation(NestAnnotation.class)));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19304);assertFalse(AnnotationUtils.equals(field4.getAnnotation(NestAnnotation.class), field1.getAnnotation(TestAnnotation.class)));
    }finally{__CLR4_1_2evtevtl3lqxt2c.R.flushNeeded();}}

    @Test
    public void testOneArgNull() {__CLR4_1_2evtevtl3lqxt2c.R.globalSliceStart(getClass().getName(),19305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_273qdioew9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2evtevtl3lqxt2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2evtevtl3lqxt2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testOneArgNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19305,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_273qdioew9(){try{__CLR4_1_2evtevtl3lqxt2c.R.inc(19305);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19306);assertFalse(AnnotationUtils.equals(field1.getAnnotation(TestAnnotation.class), null));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19307);assertFalse(AnnotationUtils.equals(null, field1.getAnnotation(TestAnnotation.class)));
    }finally{__CLR4_1_2evtevtl3lqxt2c.R.flushNeeded();}}

    @Test
    public void testBothArgsNull() {__CLR4_1_2evtevtl3lqxt2c.R.globalSliceStart(getClass().getName(),19308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hc5nzyewc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2evtevtl3lqxt2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2evtevtl3lqxt2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testBothArgsNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19308,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hc5nzyewc(){try{__CLR4_1_2evtevtl3lqxt2c.R.inc(19308);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19309);assertTrue(AnnotationUtils.equals(null, null));
    }finally{__CLR4_1_2evtevtl3lqxt2c.R.flushNeeded();}}

    @Test
    public void testIsValidAnnotationMemberType() {__CLR4_1_2evtevtl3lqxt2c.R.globalSliceStart(getClass().getName(),19310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2e3ezquewe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2evtevtl3lqxt2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2evtevtl3lqxt2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testIsValidAnnotationMemberType",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19310,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2e3ezquewe(){try{__CLR4_1_2evtevtl3lqxt2c.R.inc(19310);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19311);for (final Class<?> type : new Class[] { byte.class, short.class, int.class, char.class,
                long.class, float.class, double.class, boolean.class, String.class, Class.class,
                NestAnnotation.class, TestAnnotation.class, Stooge.class, ElementType.class }) {{
            __CLR4_1_2evtevtl3lqxt2c.R.inc(19312);assertTrue(AnnotationUtils.isValidAnnotationMemberType(type));
            __CLR4_1_2evtevtl3lqxt2c.R.inc(19313);assertTrue(AnnotationUtils.isValidAnnotationMemberType(Array.newInstance(type, 0)
                    .getClass()));
        }
        }__CLR4_1_2evtevtl3lqxt2c.R.inc(19314);for (final Class<?> type : new Class[] { Object.class, Map.class, Collection.class }) {{
            __CLR4_1_2evtevtl3lqxt2c.R.inc(19315);assertFalse(AnnotationUtils.isValidAnnotationMemberType(type));
            __CLR4_1_2evtevtl3lqxt2c.R.inc(19316);assertFalse(AnnotationUtils.isValidAnnotationMemberType(Array.newInstance(type, 0)
                    .getClass()));
        }
    }}finally{__CLR4_1_2evtevtl3lqxt2c.R.flushNeeded();}}

    @Test(timeout = 666000)
    public void testGeneratedAnnotationEquivalentToRealAnnotation() throws Exception {__CLR4_1_2evtevtl3lqxt2c.R.globalSliceStart(getClass().getName(),19317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2y1euvvewl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2evtevtl3lqxt2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2evtevtl3lqxt2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testGeneratedAnnotationEquivalentToRealAnnotation",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19317,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2y1euvvewl() throws Exception{try{__CLR4_1_2evtevtl3lqxt2c.R.inc(19317);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19318);final Test real = getClass().getDeclaredMethod(
                "testGeneratedAnnotationEquivalentToRealAnnotation").getAnnotation(Test.class);

        __CLR4_1_2evtevtl3lqxt2c.R.inc(19319);final InvocationHandler generatedTestInvocationHandler = new InvocationHandler() {

            @Override
            public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {try{__CLR4_1_2evtevtl3lqxt2c.R.inc(19320);
                __CLR4_1_2evtevtl3lqxt2c.R.inc(19321);if (((("equals".equals(method.getName()) && method.getParameterTypes().length == 1)&&(__CLR4_1_2evtevtl3lqxt2c.R.iget(19322)!=0|true))||(__CLR4_1_2evtevtl3lqxt2c.R.iget(19323)==0&false))) {{
                    __CLR4_1_2evtevtl3lqxt2c.R.inc(19324);return Boolean.valueOf(proxy == args[0]);
                }
                }__CLR4_1_2evtevtl3lqxt2c.R.inc(19325);if (((("hashCode".equals(method.getName()) && method.getParameterTypes().length == 0)&&(__CLR4_1_2evtevtl3lqxt2c.R.iget(19326)!=0|true))||(__CLR4_1_2evtevtl3lqxt2c.R.iget(19327)==0&false))) {{
                    __CLR4_1_2evtevtl3lqxt2c.R.inc(19328);return Integer.valueOf(System.identityHashCode(proxy));
                }
                }__CLR4_1_2evtevtl3lqxt2c.R.inc(19329);if (((("toString".equals(method.getName()) && method.getParameterTypes().length == 0)&&(__CLR4_1_2evtevtl3lqxt2c.R.iget(19330)!=0|true))||(__CLR4_1_2evtevtl3lqxt2c.R.iget(19331)==0&false))) {{
                    __CLR4_1_2evtevtl3lqxt2c.R.inc(19332);return "Test proxy";
                }
                }__CLR4_1_2evtevtl3lqxt2c.R.inc(19333);return method.invoke(real, args);
            }finally{__CLR4_1_2evtevtl3lqxt2c.R.flushNeeded();}}
        };

        __CLR4_1_2evtevtl3lqxt2c.R.inc(19334);final Test generated = (Test) Proxy.newProxyInstance(Thread.currentThread()
                .getContextClassLoader(), new Class[] { Test.class },
                generatedTestInvocationHandler);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19335);assertTrue(real.equals(generated));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19336);assertFalse(generated.equals(real));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19337);assertTrue(AnnotationUtils.equals(generated, real));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19338);assertTrue(AnnotationUtils.equals(real, generated));

        __CLR4_1_2evtevtl3lqxt2c.R.inc(19339);final Test generated2 = (Test) Proxy.newProxyInstance(Thread.currentThread()
                .getContextClassLoader(), new Class[] { Test.class },
                generatedTestInvocationHandler);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19340);assertFalse(generated.equals(generated2));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19341);assertFalse(generated2.equals(generated));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19342);assertTrue(AnnotationUtils.equals(generated, generated2));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19343);assertTrue(AnnotationUtils.equals(generated2, generated));
    }finally{__CLR4_1_2evtevtl3lqxt2c.R.flushNeeded();}}

    @Test(timeout = 666000)
    public void testHashCode() throws Exception {__CLR4_1_2evtevtl3lqxt2c.R.globalSliceStart(getClass().getName(),19344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8exc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2evtevtl3lqxt2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2evtevtl3lqxt2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19344,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8exc() throws Exception{try{__CLR4_1_2evtevtl3lqxt2c.R.inc(19344);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19345);final Test test = getClass().getDeclaredMethod("testHashCode").getAnnotation(Test.class);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19346);assertEquals(test.hashCode(), AnnotationUtils.hashCode(test));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19347);final TestAnnotation testAnnotation1 = field1.getAnnotation(TestAnnotation.class);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19348);assertEquals(testAnnotation1.hashCode(), AnnotationUtils.hashCode(testAnnotation1));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19349);final TestAnnotation testAnnotation3 = field3.getAnnotation(TestAnnotation.class);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19350);assertEquals(testAnnotation3.hashCode(), AnnotationUtils.hashCode(testAnnotation3));
    }finally{__CLR4_1_2evtevtl3lqxt2c.R.flushNeeded();}}

    @Test(timeout = 666000)
    public void testToString() throws Exception {__CLR4_1_2evtevtl3lqxt2c.R.globalSliceStart(getClass().getName(),19351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidexj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2evtevtl3lqxt2c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2evtevtl3lqxt2c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.AnnotationUtilsTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19351,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidexj() throws Exception{try{__CLR4_1_2evtevtl3lqxt2c.R.inc(19351);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19352);final Test testAnno = getClass().getDeclaredMethod("testToString")
                .getAnnotation(Test.class);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19353);final String toString = AnnotationUtils.toString(testAnno);
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19354);assertTrue(toString.startsWith("@org.junit.Test("));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19355);assertTrue(toString.endsWith(")"));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19356);assertTrue(toString.contains("expected=class org.junit.Test$None"));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19357);assertTrue(toString.contains("timeout=666000"));
        __CLR4_1_2evtevtl3lqxt2c.R.inc(19358);assertTrue(toString.contains(", "));
    }finally{__CLR4_1_2evtevtl3lqxt2c.R.flushNeeded();}}

}
