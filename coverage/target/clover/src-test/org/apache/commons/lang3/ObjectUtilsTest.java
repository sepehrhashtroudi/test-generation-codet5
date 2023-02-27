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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.exception.CloneFailedException;
import org.apache.commons.lang3.mutable.MutableObject;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.ObjectUtils}.
 *
 * @version $Id$
 */
public class ObjectUtilsTest {static class __CLR4_1_2k7rk7rl3lqxtwx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,26462,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String FOO = "foo";
    private static final String BAR = "bar";

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hk7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26199,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hk7r(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26199);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26200);assertNotNull(new ObjectUtils());
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26201);final Constructor<?>[] cons = ObjectUtils.class.getDeclaredConstructors();
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26202);assertEquals(1, cons.length);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26203);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26204);assertTrue(Modifier.isPublic(ObjectUtils.class.getModifiers()));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26205);assertFalse(Modifier.isFinal(ObjectUtils.class.getModifiers()));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsNull() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ant4pik7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testIsNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26206,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ant4pik7y(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26206);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26207);final Object o = FOO;
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26208);final Object dflt = BAR;
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26209);assertSame("dflt was not returned when o was null", dflt, ObjectUtils.defaultIfNull(null, dflt));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26210);assertSame("dflt was returned when o was not null", o, ObjectUtils.defaultIfNull(o, dflt));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test
    public void testFirstNonNull() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27qp3fnk83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testFirstNonNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26211,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27qp3fnk83(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26211);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26212);assertEquals(null, ObjectUtils.firstNonNull(null, null));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26213);assertEquals("", ObjectUtils.firstNonNull(null, ""));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26214);final String firstNonNullGenerics = ObjectUtils.firstNonNull(null, null, "123", "456");
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26215);assertEquals("123", firstNonNullGenerics);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26216);assertEquals("123", ObjectUtils.firstNonNull("123", null, "456", null));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26217);assertEquals(null, ObjectUtils.firstNonNull());
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26218);assertSame(Boolean.TRUE, ObjectUtils.firstNonNull(Boolean.TRUE));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26219);assertNull(ObjectUtils.firstNonNull());
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26220);assertNull(ObjectUtils.firstNonNull(null, null));
//        assertSame("123", ObjectUtils.firstNonNull(null, ObjectUtils.NULL, "123", "456"));
//        assertSame("456", ObjectUtils.firstNonNull(ObjectUtils.NULL, "456", "123", null));
//        assertNull(ObjectUtils.firstNonNull(null, null, ObjectUtils.NULL));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26221);assertNull(ObjectUtils.firstNonNull((Object) null));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26222);assertNull(ObjectUtils.firstNonNull((Object[]) null));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquals() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608k8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26223,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608k8f(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26223);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26224);assertTrue("ObjectUtils.equals(null, null) returned false", ObjectUtils.equals(null, null));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26225);assertTrue("ObjectUtils.equals(\"foo\", null) returned true", !ObjectUtils.equals(FOO, null));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26226);assertTrue("ObjectUtils.equals(null, \"bar\") returned true", !ObjectUtils.equals(null, BAR));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26227);assertTrue("ObjectUtils.equals(\"foo\", \"bar\") returned true", !ObjectUtils.equals(FOO, BAR));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26228);assertTrue("ObjectUtils.equals(\"foo\", \"foo\") returned false", ObjectUtils.equals(FOO, FOO));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test
    public void testNotEqual() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rfc14qk8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testNotEqual",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26229,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rfc14qk8l(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26229);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26230);assertFalse("ObjectUtils.notEqual(null, null) returned false", ObjectUtils.notEqual(null, null));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26231);assertTrue("ObjectUtils.notEqual(\"foo\", null) returned true", ObjectUtils.notEqual(FOO, null));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26232);assertTrue("ObjectUtils.notEqual(null, \"bar\") returned true", ObjectUtils.notEqual(null, BAR));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26233);assertTrue("ObjectUtils.notEqual(\"foo\", \"bar\") returned true", ObjectUtils.notEqual(FOO, BAR));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26234);assertFalse("ObjectUtils.notEqual(\"foo\", \"foo\") returned false", ObjectUtils.notEqual(FOO, FOO));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8k8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26235,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8k8r(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26235);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26236);assertEquals(0, ObjectUtils.hashCode(null));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26237);assertEquals("a".hashCode(), ObjectUtils.hashCode("a"));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test
    public void testHashCodeMulti_multiple_emptyArray() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wk88s1k8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testHashCodeMulti_multiple_emptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26238,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wk88s1k8u(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26238);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26239);final Object[] array = new Object[0];
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26240);assertEquals(1, ObjectUtils.hashCodeMulti(array));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test
    public void testHashCodeMulti_multiple_nullArray() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oam1nhk8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testHashCodeMulti_multiple_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26241,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oam1nhk8x(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26241);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26242);final Object[] array = null;
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26243);assertEquals(1, ObjectUtils.hashCodeMulti(array));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test
    public void testHashCodeMulti_multiple_likeList() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yyboawk90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testHashCodeMulti_multiple_likeList",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26244,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yyboawk90(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26244);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26245);final List<Object> list0 = new ArrayList<Object>(Arrays.asList());
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26246);assertEquals(list0.hashCode(), ObjectUtils.hashCodeMulti());
        
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26247);final List<Object> list1 = new ArrayList<Object>(Arrays.asList("a"));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26248);assertEquals(list1.hashCode(), ObjectUtils.hashCodeMulti("a"));
        
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26249);final List<Object> list2 = new ArrayList<Object>(Arrays.asList("a", "b"));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26250);assertEquals(list2.hashCode(), ObjectUtils.hashCodeMulti("a", "b"));
        
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26251);final List<Object> list3 = new ArrayList<Object>(Arrays.asList("a", "b", "c"));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26252);assertEquals(list3.hashCode(), ObjectUtils.hashCodeMulti("a", "b", "c"));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

//    /**
//     * Show that java.util.Date and java.sql.Timestamp are apples and oranges.
//     * Prompted by an email discussion. 
//     * 
//     * The behavior is different b/w Sun Java 1.3.1_10 and 1.4.2_03.
//     */
//    public void testDateEqualsJava() {
//        long now = 1076957313284L; // Feb 16, 2004 10:49... PST
//        java.util.Date date = new java.util.Date(now);
//        java.sql.Timestamp realTimestamp = new java.sql.Timestamp(now);
//        java.util.Date timestamp = realTimestamp;
//        // sanity check 1:
//        assertEquals(284000000, realTimestamp.getNanos());
//        assertEquals(1076957313284L, date.getTime());
//        //
//        // On Sun 1.3.1_10:
//        //junit.framework.AssertionFailedError: expected:<1076957313284> but was:<1076957313000>
//        //
//        //assertEquals(1076957313284L, timestamp.getTime());
//        //
//        //junit.framework.AssertionFailedError: expected:<1076957313284> but was:<1076957313000>
//        //
//        //assertEquals(1076957313284L, realTimestamp.getTime());
//        // sanity check 2:        
//        assertEquals(date.getDay(), realTimestamp.getDay());
//        assertEquals(date.getHours(), realTimestamp.getHours());
//        assertEquals(date.getMinutes(), realTimestamp.getMinutes());
//        assertEquals(date.getMonth(), realTimestamp.getMonth());
//        assertEquals(date.getSeconds(), realTimestamp.getSeconds());
//        assertEquals(date.getTimezoneOffset(), realTimestamp.getTimezoneOffset());
//        assertEquals(date.getYear(), realTimestamp.getYear());
//        //
//        // Time values are == and equals() on Sun 1.4.2_03 but NOT on Sun 1.3.1_10:
//        //
//        //assertFalse("Sanity check failed: date.getTime() == timestamp.getTime()", date.getTime() == timestamp.getTime());
//        //assertFalse("Sanity check failed: timestamp.equals(date)", timestamp.equals(date));
//        //assertFalse("Sanity check failed: date.equals(timestamp)", date.equals(timestamp));
//        // real test:
//        //assertFalse("java.util.Date and java.sql.Timestamp should be equal", ObjectUtils.equals(date, timestamp));
//    }
    
    @Test
    public void testIdentityToString() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x154ubk99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testIdentityToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26253,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x154ubk99(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26253);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26254);assertEquals(null, ObjectUtils.identityToString(null));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26255);assertEquals(
            "java.lang.String@" + Integer.toHexString(System.identityHashCode(FOO)),
            ObjectUtils.identityToString(FOO));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26256);final Integer i = Integer.valueOf(90);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26257);final String expected = "java.lang.Integer@" + Integer.toHexString(System.identityHashCode(i));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26258);assertEquals(expected, ObjectUtils.identityToString(i));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26259);final StringBuffer buffer = new StringBuffer();
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26260);ObjectUtils.identityToString(buffer, i);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26261);assertEquals(expected, buffer.toString());

        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26262);try {
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26263);ObjectUtils.identityToString(null, "tmp");
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26264);fail("NullPointerException expected");
        } catch(final NullPointerException npe) {
        }
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26265);try {
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26266);ObjectUtils.identityToString(new StringBuffer(), null);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26267);fail("NullPointerException expected");
        } catch(final NullPointerException npe) {
        }
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test
    public void testToString_Object() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b1wh5zk9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testToString_Object",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26268,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b1wh5zk9o(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26268);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26269);assertEquals("", ObjectUtils.toString((Object) null) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26270);assertEquals(Boolean.TRUE.toString(), ObjectUtils.toString(Boolean.TRUE) );
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}
            
    @Test
    public void testToString_ObjectString() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28qnit4k9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testToString_ObjectString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26271,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28qnit4k9r(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26271);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26272);assertEquals(BAR, ObjectUtils.toString((Object) null, BAR) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26273);assertEquals(Boolean.TRUE.toString(), ObjectUtils.toString(Boolean.TRUE, BAR) );
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @SuppressWarnings("cast") // 1 OK, because we are checking for code change
    @Test
    public void testNull() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29231k0k9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26274,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29231k0k9u(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26274);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26275);assertNotNull(ObjectUtils.NULL);
        // 1 Check that NULL really is a Null i.e. the definition has not been changed
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26276);assertTrue(ObjectUtils.NULL instanceof ObjectUtils.Null);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26277);assertSame(ObjectUtils.NULL, SerializationUtils.clone(ObjectUtils.NULL));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test
    public void testMax() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hxwg3rk9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testMax",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26278,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hxwg3rk9y(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26278);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26279);final Calendar calendar = Calendar.getInstance();
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26280);final Date nonNullComparable1 = calendar.getTime();
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26281);final Date nonNullComparable2 = calendar.getTime();
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26282);final String[] nullAray = null;
        
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26283);calendar.set( Calendar.YEAR, calendar.get( Calendar.YEAR ) -1 );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26284);final Date minComparable = calendar.getTime();
        
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26285);assertNotSame( nonNullComparable1, nonNullComparable2 );
        
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26286);assertNull(ObjectUtils.max( (String) null ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26287);assertNull(ObjectUtils.max( nullAray ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26288);assertSame( nonNullComparable1, ObjectUtils.max( null, nonNullComparable1 ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26289);assertSame( nonNullComparable1, ObjectUtils.max( nonNullComparable1, null ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26290);assertSame( nonNullComparable1, ObjectUtils.max( null, nonNullComparable1, null ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26291);assertSame( nonNullComparable1, ObjectUtils.max( nonNullComparable1, nonNullComparable2 ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26292);assertSame( nonNullComparable2, ObjectUtils.max( nonNullComparable2, nonNullComparable1 ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26293);assertSame( nonNullComparable1, ObjectUtils.max( nonNullComparable1, minComparable ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26294);assertSame( nonNullComparable1, ObjectUtils.max( minComparable, nonNullComparable1 ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26295);assertSame( nonNullComparable1, ObjectUtils.max( null, minComparable, null, nonNullComparable1 ) );

        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26296);assertNull( ObjectUtils.max((String)null, (String)null) );
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test
    public void testMin() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2psd1llkah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testMin",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26297,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2psd1llkah(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26297);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26298);final Calendar calendar = Calendar.getInstance();
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26299);final Date nonNullComparable1 = calendar.getTime();
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26300);final Date nonNullComparable2 = calendar.getTime();
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26301);final String[] nullAray = null;
        
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26302);calendar.set( Calendar.YEAR, calendar.get( Calendar.YEAR ) -1 );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26303);final Date minComparable = calendar.getTime();
        
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26304);assertNotSame( nonNullComparable1, nonNullComparable2 );
        
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26305);assertNull(ObjectUtils.min( (String) null ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26306);assertNull(ObjectUtils.min( nullAray ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26307);assertSame( nonNullComparable1, ObjectUtils.min( null, nonNullComparable1 ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26308);assertSame( nonNullComparable1, ObjectUtils.min( nonNullComparable1, null ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26309);assertSame( nonNullComparable1, ObjectUtils.min( null, nonNullComparable1, null ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26310);assertSame( nonNullComparable1, ObjectUtils.min( nonNullComparable1, nonNullComparable2 ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26311);assertSame( nonNullComparable2, ObjectUtils.min( nonNullComparable2, nonNullComparable1 ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26312);assertSame( minComparable, ObjectUtils.min( nonNullComparable1, minComparable ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26313);assertSame( minComparable, ObjectUtils.min( minComparable, nonNullComparable1 ) );
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26314);assertSame( minComparable, ObjectUtils.min( null, nonNullComparable1, null, minComparable ) );

        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26315);assertNull( ObjectUtils.min((String)null, (String)null) );
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#compare(Comparable, Comparable, boolean)}.
     */
    @Test
    public void testCompare() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28o8au2kb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testCompare",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26316,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28o8au2kb0(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26316);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26317);final Integer one = Integer.valueOf(1);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26318);final Integer two = Integer.valueOf(2);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26319);final Integer nullValue = null;

        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26320);assertEquals("Null Null false", 0, ObjectUtils.compare(nullValue, nullValue));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26321);assertEquals("Null Null true",  0, ObjectUtils.compare(nullValue, nullValue, true));

        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26322);assertEquals("Null one false", -1, ObjectUtils.compare(nullValue, one));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26323);assertEquals("Null one true",   1, ObjectUtils.compare(nullValue, one, true));
        
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26324);assertEquals("one Null false", 1, ObjectUtils.compare(one, nullValue));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26325);assertEquals("one Null true", -1, ObjectUtils.compare(one, nullValue, true));

        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26326);assertEquals("one two false", -1, ObjectUtils.compare(one, two));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26327);assertEquals("one two true",  -1, ObjectUtils.compare(one, two, true));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test
    public void testMedian() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2apj4lfkbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testMedian",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26328,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2apj4lfkbc(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26328);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26329);assertEquals("foo", ObjectUtils.median("foo"));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26330);assertEquals("bar", ObjectUtils.median("foo", "bar"));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26331);assertEquals("baz", ObjectUtils.median("foo", "bar", "baz"));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26332);assertEquals("baz", ObjectUtils.median("foo", "bar", "baz", "blah"));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26333);assertEquals("blah", ObjectUtils.median("foo", "bar", "baz", "blah", "wah"));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26334);assertEquals(Integer.valueOf(5),
            ObjectUtils.median(Integer.valueOf(1), Integer.valueOf(5), Integer.valueOf(10)));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26335);assertEquals(
            Integer.valueOf(7),
            ObjectUtils.median(Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8),
                Integer.valueOf(9)));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26336);assertEquals(Integer.valueOf(6),
            ObjectUtils.median(Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8)));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testMedian_nullItems() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a5vfb7kbl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,101,100,105,97,110,95,110,117,108,108,73,116,101,109,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testMedian_nullItems",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26337,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a5vfb7kbl(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26337);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26338);ObjectUtils.median((String[]) null);
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMedian_emptyItems() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23jjil9kbn();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,101,100,105,97,110,95,101,109,112,116,121,73,116,101,109,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testMedian_emptyItems",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26339,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23jjil9kbn(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26339);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26340);ObjectUtils.<String> median();
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test
    public void testComparatorMedian() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qmiqexkbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testComparatorMedian",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26341,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qmiqexkbp(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26341);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26342);final CharSequenceComparator cmp = new CharSequenceComparator();
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26343);final NonComparableCharSequence foo = new NonComparableCharSequence("foo");
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26344);final NonComparableCharSequence bar = new NonComparableCharSequence("bar");
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26345);final NonComparableCharSequence baz = new NonComparableCharSequence("baz");
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26346);final NonComparableCharSequence blah = new NonComparableCharSequence("blah");
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26347);final NonComparableCharSequence wah = new NonComparableCharSequence("wah");
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26348);assertSame(foo, ObjectUtils.median(cmp, foo));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26349);assertSame(bar, ObjectUtils.median(cmp, foo, bar));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26350);assertSame(baz, ObjectUtils.median(cmp, foo, bar, baz));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26351);assertSame(baz, ObjectUtils.median(cmp, foo, bar, baz, blah));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26352);assertSame(blah, ObjectUtils.median(cmp, foo, bar, baz, blah, wah));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testComparatorMedian_nullComparator() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2u25m6nkc1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,97,116,111,114,77,101,100,105,97,110,95,110,117,108,108,67,111,109,112,97,114,97,116,111,114,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testComparatorMedian_nullComparator",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26353,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2u25m6nkc1(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26353);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26354);ObjectUtils.median((Comparator<CharSequence>) null, new NonComparableCharSequence("foo"));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test(expected = NullPointerException.class)
    public void testComparatorMedian_nullItems() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24lx66lkc3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,97,116,111,114,77,101,100,105,97,110,95,110,117,108,108,73,116,101,109,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testComparatorMedian_nullItems",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26355,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24lx66lkc3(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26355);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26356);ObjectUtils.median(new CharSequenceComparator(), (CharSequence[]) null);
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testComparatorMedian_emptyItems() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xnt9lzkc5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,97,116,111,114,77,101,100,105,97,110,95,101,109,112,116,121,73,116,101,109,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testComparatorMedian_emptyItems",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26357,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xnt9lzkc5(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26357);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26358);ObjectUtils.median(new CharSequenceComparator());
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    @Test
    public void testMode() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mixofwkc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testMode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26359,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mixofwkc7(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26359);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26360);assertNull(ObjectUtils.mode((Object[]) null));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26361);assertNull(ObjectUtils.mode());
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26362);assertNull(ObjectUtils.mode("foo", "bar", "baz"));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26363);assertNull(ObjectUtils.mode("foo", "bar", "baz", "foo", "bar"));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26364);assertEquals("foo", ObjectUtils.mode("foo", "bar", "baz", "foo"));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26365);assertEquals(Integer.valueOf(9),
            ObjectUtils.mode("foo", "bar", "baz", Integer.valueOf(9), Integer.valueOf(10), Integer.valueOf(9)));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#clone(Object)} with a cloneable object.
     */
    @Test
    public void testCloneOfCloneable() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25p2x98kce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testCloneOfCloneable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26366,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25p2x98kce(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26366);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26367);final CloneableString string = new CloneableString("apache");
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26368);final CloneableString stringClone = ObjectUtils.clone(string);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26369);assertEquals("apache", stringClone.getValue());
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#clone(Object)} with a not cloneable object.
     */
    @Test
    public void testCloneOfNotCloneable() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zifo8dkci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testCloneOfNotCloneable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26370,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zifo8dkci(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26370);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26371);final String string = new String("apache");
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26372);assertNull(ObjectUtils.clone(string));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an uncloneable object.
     */
    @Test(expected = NoSuchMethodException.class)
    public void testCloneOfUncloneable() throws Throwable {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fhvg1vkcl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,108,111,110,101,79,102,85,110,99,108,111,110,101,97,98,108,101,58,32,91,78,111,83,117,99,104,77,101,116,104,111,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchMethodException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testCloneOfUncloneable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26373,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fhvg1vkcl() throws Throwable{try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26373);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26374);final UncloneableString string = new UncloneableString("apache");
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26375);try {
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26376);ObjectUtils.clone(string);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26377);fail("Thrown " + CloneFailedException.class.getName() + " expected");
        } catch (final CloneFailedException e) {
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26378);throw e.getCause();
        }
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an object array.
     */
    @Test
    public void testCloneOfStringArray() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j94z77kcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testCloneOfStringArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26379,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j94z77kcr(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26379);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26380);assertTrue(Arrays.deepEquals(
            new String[]{"string"}, ObjectUtils.clone(new String[]{"string"})));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#clone(Object)} with an array of primitives.
     */
    @Test
    public void testCloneOfPrimitiveArray() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25ah22tkct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testCloneOfPrimitiveArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26381,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25ah22tkct(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26381);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26382);assertTrue(Arrays.equals(new int[]{1}, ObjectUtils.clone(new int[]{1})));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with a cloneable object.
     */
    @Test
    public void testPossibleCloneOfCloneable() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rfhprnkcv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testPossibleCloneOfCloneable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26383,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rfhprnkcv(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26383);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26384);final CloneableString string = new CloneableString("apache");
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26385);final CloneableString stringClone = ObjectUtils.cloneIfPossible(string);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26386);assertEquals("apache", stringClone.getValue());
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with a not cloneable object.
     */
    @Test
    public void testPossibleCloneOfNotCloneable() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jniyeckcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testPossibleCloneOfNotCloneable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26387,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jniyeckcz(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26387);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26388);final String string = new String("apache");
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26389);assertSame(string, ObjectUtils.cloneIfPossible(string));
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    /**
     * Tests {@link ObjectUtils#cloneIfPossible(Object)} with an uncloneable object.
     */
    @Test(expected = NoSuchMethodException.class)
    public void testPossibleCloneOfUncloneable() throws Throwable {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_229df04kd2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,80,111,115,115,105,98,108,101,67,108,111,110,101,79,102,85,110,99,108,111,110,101,97,98,108,101,58,32,91,78,111,83,117,99,104,77,101,116,104,111,100,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchMethodException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testPossibleCloneOfUncloneable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26390,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_229df04kd2() throws Throwable{try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26390);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26391);final UncloneableString string = new UncloneableString("apache");
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26392);try {
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26393);ObjectUtils.cloneIfPossible(string);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26394);fail("Thrown " + CloneFailedException.class.getName() + " expected");
        } catch (final CloneFailedException e) {
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26395);throw e.getCause();
        }
    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    @Test
    public void testConstMethods() {__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceStart(getClass().getName(),26396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aml6jckd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k7rk7rl3lqxtwx.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k7rk7rl3lqxtwx.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ObjectUtilsTest.testConstMethods",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26396,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aml6jckd8(){try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26396);

        // To truly test the CONST() method, we'd want to look in the
        // bytecode to see if the literals were folded into the
        // class, or if the bytecode kept the method call.

        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26397);assertTrue("CONST(boolean)", ObjectUtils.CONST(true));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26398);assertEquals("CONST(byte)", (byte) 3, ObjectUtils.CONST((byte) 3));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26399);assertEquals("CONST(char)", (char) 3, ObjectUtils.CONST((char) 3));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26400);assertEquals("CONST(short)", (short) 3, ObjectUtils.CONST((short) 3));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26401);assertEquals("CONST(int)", 3, ObjectUtils.CONST(3));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26402);assertEquals("CONST(long)", 3l, ObjectUtils.CONST(3l));
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26403);assertEquals("CONST(float)", 3f, ObjectUtils.CONST(3f), 0);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26404);assertEquals("CONST(double)", 3.0, ObjectUtils.CONST(3.0), 0);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26405);assertEquals("CONST(Object)", "abc", ObjectUtils.CONST("abc"));

        // Make sure documentation examples from Javadoc all work
        // (this fixed a lot of my bugs when I these!)
        //
        // My bugs should be in a software engineering textbook
        // for "Can you screw this up?"  The answer is, yes,
        // you can even screw this up.  (When you == Julius)
        // .
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26406);final boolean MAGIC_FLAG = ObjectUtils.CONST(true);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26407);final byte MAGIC_BYTE1 = ObjectUtils.CONST((byte) 127);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26408);final byte MAGIC_BYTE2 = ObjectUtils.CONST_BYTE(127);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26409);final char MAGIC_CHAR = ObjectUtils.CONST('a');
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26410);final short MAGIC_SHORT1 = ObjectUtils.CONST((short) 123);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26411);final short MAGIC_SHORT2 = ObjectUtils.CONST_SHORT(127);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26412);final int MAGIC_INT = ObjectUtils.CONST(123);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26413);final long MAGIC_LONG1 = ObjectUtils.CONST(123L);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26414);final long MAGIC_LONG2 = ObjectUtils.CONST(3);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26415);final float MAGIC_FLOAT = ObjectUtils.CONST(1.0f);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26416);final double MAGIC_DOUBLE = ObjectUtils.CONST(1.0);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26417);final String MAGIC_STRING = ObjectUtils.CONST("abc");

        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26418);assertTrue(MAGIC_FLAG);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26419);assertEquals(127, MAGIC_BYTE1);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26420);assertEquals(127, MAGIC_BYTE2);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26421);assertEquals('a', MAGIC_CHAR);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26422);assertEquals(123, MAGIC_SHORT1);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26423);assertEquals(127, MAGIC_SHORT2);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26424);assertEquals(123, MAGIC_INT);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26425);assertEquals(123, MAGIC_LONG1);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26426);assertEquals(3, MAGIC_LONG2);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26427);assertEquals(1.0f, MAGIC_FLOAT, 0.0f);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26428);assertEquals(1.0, MAGIC_DOUBLE, 0.0);
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26429);assertEquals("abc", MAGIC_STRING);

        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26430);try {
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26431);ObjectUtils.CONST_BYTE(-129);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26432);fail("CONST_BYTE(-129): IllegalArgumentException should have been thrown.");
        } catch (final IllegalArgumentException iae) {

        }
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26433);try {
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26434);ObjectUtils.CONST_BYTE(128);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26435);fail("CONST_BYTE(128): IllegalArgumentException should have been thrown.");
        } catch (final IllegalArgumentException iae) {

        }
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26436);try {
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26437);ObjectUtils.CONST_SHORT(-32769);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26438);fail("CONST_SHORT(-32769): IllegalArgumentException should have been thrown.");
        } catch (final IllegalArgumentException iae) {

        }
        __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26439);try {
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26440);ObjectUtils.CONST_BYTE(32768);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26441);fail("CONST_SHORT(32768): IllegalArgumentException should have been thrown.");
        } catch (final IllegalArgumentException iae) {

        }

    }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    /**
     * String that is cloneable.
     */
    static final class CloneableString extends MutableObject<String> implements Cloneable {
        private static final long serialVersionUID = 1L;
        CloneableString(final String s) {
            super(s);__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26443);try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26442);
        }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

        @Override
        public CloneableString clone() throws CloneNotSupportedException {try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26444);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26445);return (CloneableString)super.clone();
        }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}
    }

    /**
     * String that is not cloneable.
     */
    static final class UncloneableString extends MutableObject<String> implements Cloneable {
        private static final long serialVersionUID = 1L;
        UncloneableString(final String s) {
            super(s);__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26447);try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26446);
        }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}
    }

    static final class NonComparableCharSequence implements CharSequence {
        final String value;

        /**
         * Create a new NonComparableCharSequence instance.
         *
         * @param value
         */
        public NonComparableCharSequence(final String value) {
            super();__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26449);try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26448);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26450);Validate.notNull(value);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26451);this.value = value;
        }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

        @Override
        public char charAt(final int arg0) {try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26452);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26453);return value.charAt(arg0);
        }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

        @Override
        public int length() {try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26454);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26455);return value.length();
        }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

        @Override
        public CharSequence subSequence(final int arg0, final int arg1) {try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26456);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26457);return value.subSequence(arg0, arg1);
        }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26458);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26459);return value;
        }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}
    }

    static final class CharSequenceComparator implements Comparator<CharSequence> {

        @Override
        public int compare(final CharSequence o1, final CharSequence o2) {try{__CLR4_1_2k7rk7rl3lqxtwx.R.inc(26460);
            __CLR4_1_2k7rk7rl3lqxtwx.R.inc(26461);return o1.toString().compareTo(o2.toString());
        }finally{__CLR4_1_2k7rk7rl3lqxtwx.R.flushNeeded();}}

    }
}
