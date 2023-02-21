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
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.BooleanUtils}.
 *
 * @version $Id$
 */
public class BooleanUtilsTest {static class __CLR4_1_2hjqhjql3lqxtjt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,23098,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hhjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22742,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hhjq(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22742);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22743);assertNotNull(new BooleanUtils());
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22744);final Constructor<?>[] cons = BooleanUtils.class.getDeclaredConstructors();
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22745);assertEquals(1, cons.length);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22746);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22747);assertTrue(Modifier.isPublic(BooleanUtils.class.getModifiers()));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22748);assertFalse(Modifier.isFinal(BooleanUtils.class.getModifiers()));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void test_negate_Boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2otwntthjx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_negate_Boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22749,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2otwntthjx(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22749);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22750);assertSame(null, BooleanUtils.negate(null));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22751);assertSame(Boolean.TRUE, BooleanUtils.negate(Boolean.FALSE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22752);assertSame(Boolean.FALSE, BooleanUtils.negate(Boolean.TRUE));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_isTrue_Boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yzm3jphk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_isTrue_Boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22753,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yzm3jphk1(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22753);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22754);assertTrue(BooleanUtils.isTrue(Boolean.TRUE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22755);assertFalse(BooleanUtils.isTrue(Boolean.FALSE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22756);assertFalse(BooleanUtils.isTrue((Boolean) null));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test
    public void test_isNotTrue_Boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sorarqhk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_isNotTrue_Boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22757,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sorarqhk5(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22757);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22758);assertFalse(BooleanUtils.isNotTrue(Boolean.TRUE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22759);assertTrue(BooleanUtils.isNotTrue(Boolean.FALSE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22760);assertTrue(BooleanUtils.isNotTrue((Boolean) null));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_isFalse_Boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_284ppushk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_isFalse_Boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22761,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_284ppushk9(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22761);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22762);assertFalse(BooleanUtils.isFalse(Boolean.TRUE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22763);assertTrue(BooleanUtils.isFalse(Boolean.FALSE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22764);assertFalse(BooleanUtils.isFalse((Boolean) null));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test
    public void test_isNotFalse_Boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26qwhmfhkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_isNotFalse_Boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22765,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26qwhmfhkd(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22765);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22766);assertTrue(BooleanUtils.isNotFalse(Boolean.TRUE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22767);assertFalse(BooleanUtils.isNotFalse(Boolean.FALSE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22768);assertTrue(BooleanUtils.isNotFalse((Boolean) null));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_toBoolean_Boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22769);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gzm0k0hkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_Boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22769,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gzm0k0hkh(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22769);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22770);assertTrue(BooleanUtils.toBoolean(Boolean.TRUE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22771);assertFalse(BooleanUtils.toBoolean(Boolean.FALSE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22772);assertFalse(BooleanUtils.toBoolean((Boolean) null));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test
    public void test_toBooleanDefaultIfNull_Boolean_boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hwzb4uhkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanDefaultIfNull_Boolean_boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22773,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hwzb4uhkl(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22773);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22774);assertTrue(BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, true));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22775);assertTrue(BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22776);assertFalse(BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22777);assertFalse(BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, false));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22778);assertTrue(BooleanUtils.toBooleanDefaultIfNull((Boolean) null, true));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22779);assertFalse(BooleanUtils.toBooleanDefaultIfNull((Boolean) null, false));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void test_toBoolean_int() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r4o6yfhks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22780,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r4o6yfhks(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22780);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22781);assertTrue(BooleanUtils.toBoolean(1));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22782);assertTrue(BooleanUtils.toBoolean(-1));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22783);assertFalse(BooleanUtils.toBoolean(0));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toBooleanObject_int() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b2cc3ahkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22784,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b2cc3ahkw(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22784);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22785);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(1));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22786);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(-1));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22787);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(0));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toBooleanObject_Integer() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jf06t7hl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_Integer",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22788,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jf06t7hl0(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22788);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22789);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(1)));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22790);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(-1)));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22791);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(Integer.valueOf(0)));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22792);assertEquals(null, BooleanUtils.toBooleanObject((Integer) null));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void test_toBoolean_int_int_int() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wpvg4phl5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_int_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22793,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wpvg4phl5(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22793);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22794);assertTrue(BooleanUtils.toBoolean(6, 6, 7));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22795);assertFalse(BooleanUtils.toBoolean(7, 6, 7));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBoolean_int_int_int_noMatch() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23jh9h8hl8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,95,105,110,116,95,105,110,116,95,105,110,116,95,110,111,77,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_int_int_int_noMatch",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22796,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23jh9h8hl8(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22796);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22797);BooleanUtils.toBoolean(8, 6, 7);
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toBoolean_Integer_Integer_Integer() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tlqio4hla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_Integer_Integer_Integer",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22798,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tlqio4hla(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22798);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22799);final Integer six = Integer.valueOf(6);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22800);final Integer seven = Integer.valueOf(7);

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22801);assertTrue(BooleanUtils.toBoolean((Integer) null, null, seven));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22802);assertFalse(BooleanUtils.toBoolean((Integer) null, six, null));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22803);assertTrue(BooleanUtils.toBoolean(Integer.valueOf(6), six, seven));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22804);assertFalse(BooleanUtils.toBoolean(Integer.valueOf(7), six, seven));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBoolean_Integer_Integer_Integer_nullValue() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_294uvprhlh();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,110,117,108,108,86,97,108,117,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_Integer_Integer_Integer_nullValue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22805,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_294uvprhlh(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22805);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22806);BooleanUtils.toBoolean(null, Integer.valueOf(6), Integer.valueOf(7));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBoolean_Integer_Integer_Integer_noMatch() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b4vxw7hlj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,110,111,77,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_Integer_Integer_Integer_noMatch",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22807,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b4vxw7hlj(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22807);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22808);BooleanUtils.toBoolean(Integer.valueOf(8), Integer.valueOf(6), Integer.valueOf(7));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void test_toBooleanObject_int_int_int() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ya44gmhll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_int_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22809,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ya44gmhll(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22809);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22810);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(6, 6, 7, 8));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22811);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(7, 6, 7, 8));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22812);assertEquals(null, BooleanUtils.toBooleanObject(8, 6, 7, 8));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBooleanObject_int_int_int_noMatch() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mmc98lhlp();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,79,98,106,101,99,116,95,105,110,116,95,105,110,116,95,105,110,116,95,110,111,77,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_int_int_int_noMatch",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22813,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mmc98lhlp(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22813);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22814);BooleanUtils.toBooleanObject(9, 6, 7, 8);
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toBooleanObject_Integer_Integer_Integer_Integer() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fqndkyhlr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_Integer_Integer_Integer_Integer",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22815,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fqndkyhlr(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22815);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22816);final Integer six = Integer.valueOf(6);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22817);final Integer seven = Integer.valueOf(7);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22818);final Integer eight = Integer.valueOf(8);

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22819);assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject((Integer) null, null, seven, eight));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22820);assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject((Integer) null, six, null, eight));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22821);assertSame(null, BooleanUtils.toBooleanObject((Integer) null, six, seven, null));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22822);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject(Integer.valueOf(6), six, seven, eight));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22823);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject(Integer.valueOf(7), six, seven, eight));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22824);assertEquals(null, BooleanUtils.toBooleanObject(Integer.valueOf(8), six, seven, eight));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBooleanObject_Integer_Integer_Integer_Integer_nullValue() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ks667nhm1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,79,98,106,101,99,116,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,110,117,108,108,86,97,108,117,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_Integer_Integer_Integer_Integer_nullValue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22825,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ks667nhm1(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22825);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22826);BooleanUtils.toBooleanObject(null, Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBooleanObject_Integer_Integer_Integer_Integer_noMatch() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hnqkh3hm3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,79,98,106,101,99,116,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,73,110,116,101,103,101,114,95,110,111,77,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_Integer_Integer_Integer_Integer_noMatch",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22827,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hnqkh3hm3(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22827);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22828);BooleanUtils.toBooleanObject(Integer.valueOf(9), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_toInteger_boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tea76ihm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toInteger_boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22829,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tea76ihm5(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22829);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22830);assertEquals(1, BooleanUtils.toInteger(true));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22831);assertEquals(0, BooleanUtils.toInteger(false));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toIntegerObject_boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uj02lhhm8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toIntegerObject_boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22832,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uj02lhhm8(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22832);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22833);assertEquals(Integer.valueOf(1), BooleanUtils.toIntegerObject(true));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22834);assertEquals(Integer.valueOf(0), BooleanUtils.toIntegerObject(false));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toIntegerObject_Boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qkcdmjhmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toIntegerObject_Boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22835,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qkcdmjhmb(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22835);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22836);assertEquals(Integer.valueOf(1), BooleanUtils.toIntegerObject(Boolean.TRUE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22837);assertEquals(Integer.valueOf(0), BooleanUtils.toIntegerObject(Boolean.FALSE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22838);assertEquals(null, BooleanUtils.toIntegerObject((Boolean) null));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void test_toInteger_boolean_int_int() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2c15nd2hmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toInteger_boolean_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22839,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2c15nd2hmf(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22839);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22840);assertEquals(6, BooleanUtils.toInteger(true, 6, 7));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22841);assertEquals(7, BooleanUtils.toInteger(false, 6, 7));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toInteger_Boolean_int_int_int() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2we680mhmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toInteger_Boolean_int_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22842,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2we680mhmi(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22842);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22843);assertEquals(6, BooleanUtils.toInteger(Boolean.TRUE, 6, 7, 8));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22844);assertEquals(7, BooleanUtils.toInteger(Boolean.FALSE, 6, 7, 8));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22845);assertEquals(8, BooleanUtils.toInteger(null, 6, 7, 8));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toIntegerObject_boolean_Integer_Integer() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xho5wdhmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toIntegerObject_boolean_Integer_Integer",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22846,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xho5wdhmm(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22846);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22847);final Integer six = Integer.valueOf(6);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22848);final Integer seven = Integer.valueOf(7);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22849);assertEquals(six, BooleanUtils.toIntegerObject(true, six, seven));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22850);assertEquals(seven, BooleanUtils.toIntegerObject(false, six, seven));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toIntegerObject_Boolean_Integer_Integer_Integer() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2obgq9qhmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toIntegerObject_Boolean_Integer_Integer_Integer",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22851,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2obgq9qhmr(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22851);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22852);final Integer six = Integer.valueOf(6);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22853);final Integer seven = Integer.valueOf(7);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22854);final Integer eight = Integer.valueOf(8);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22855);assertEquals(six, BooleanUtils.toIntegerObject(Boolean.TRUE, six, seven, eight));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22856);assertEquals(seven, BooleanUtils.toIntegerObject(Boolean.FALSE, six, seven, eight));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22857);assertEquals(eight, BooleanUtils.toIntegerObject((Boolean) null, six, seven, eight));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22858);assertEquals(null, BooleanUtils.toIntegerObject((Boolean) null, six, seven, null));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void test_toBooleanObject_String() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bbpym0hmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22859,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bbpym0hmz(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22859);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22860);assertEquals(null, BooleanUtils.toBooleanObject((String) null));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22861);assertEquals(null, BooleanUtils.toBooleanObject(""));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22862);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("false"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22863);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("no"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22864);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("off"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22865);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("FALSE"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22866);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("NO"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22867);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("OFF"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22868);assertEquals(null, BooleanUtils.toBooleanObject("oof"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22869);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("true"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22870);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("yes"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22871);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("on"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22872);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("TRUE"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22873);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("ON"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22874);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("YES"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22875);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("TruE"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22876);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("TruE"));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22877);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("y"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22878);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("Y"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22879);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("t"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22880);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("T"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22881);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("f"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22882);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("F"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22883);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("n"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22884);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("N"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22885);assertEquals(null, BooleanUtils.toBooleanObject("z"));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22886);assertEquals(null, BooleanUtils.toBooleanObject("ab"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22887);assertEquals(null, BooleanUtils.toBooleanObject("yoo"));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toBooleanObject_String_String_String_String() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28ckmpmhns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_String_String_String_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22888,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28ckmpmhns(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22888);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22889);assertSame(Boolean.TRUE, BooleanUtils.toBooleanObject((String) null, null, "N", "U"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22890);assertSame(Boolean.FALSE, BooleanUtils.toBooleanObject((String) null, "Y", null, "U"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22891);assertSame(null, BooleanUtils.toBooleanObject((String) null, "Y", "N", null));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22892);assertEquals(Boolean.TRUE, BooleanUtils.toBooleanObject("Y", "Y", "N", "U"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22893);assertEquals(Boolean.FALSE, BooleanUtils.toBooleanObject("N", "Y", "N", "U"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22894);assertEquals(null, BooleanUtils.toBooleanObject("U", "Y", "N", "U"));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBooleanObject_String_String_String_String_nullValue() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23lpaq9hnz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,79,98,106,101,99,116,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,110,117,108,108,86,97,108,117,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_String_String_String_String_nullValue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22895,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23lpaq9hnz(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22895);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22896);BooleanUtils.toBooleanObject((String) null, "Y", "N", "U");
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBooleanObject_String_String_String_String_noMatch() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kj0z85ho1();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,79,98,106,101,99,116,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,110,111,77,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBooleanObject_String_String_String_String_noMatch",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22897,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kj0z85ho1(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22897);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22898);BooleanUtils.toBooleanObject("X", "Y", "N", "U");
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_toBoolean_String() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bax4q1ho3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22899,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bax4q1ho3(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22899);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22900);assertFalse(BooleanUtils.toBoolean((String) null));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22901);assertFalse(BooleanUtils.toBoolean(""));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22902);assertFalse(BooleanUtils.toBoolean("off"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22903);assertFalse(BooleanUtils.toBoolean("oof"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22904);assertFalse(BooleanUtils.toBoolean("yep"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22905);assertFalse(BooleanUtils.toBoolean("trux"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22906);assertFalse(BooleanUtils.toBoolean("false"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22907);assertFalse(BooleanUtils.toBoolean("a"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22908);assertTrue(BooleanUtils.toBoolean("true")); // interned handled differently
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22909);assertTrue(BooleanUtils.toBoolean(new StringBuffer("tr").append("ue").toString()));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22910);assertTrue(BooleanUtils.toBoolean("truE"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22911);assertTrue(BooleanUtils.toBoolean("trUe"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22912);assertTrue(BooleanUtils.toBoolean("trUE"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22913);assertTrue(BooleanUtils.toBoolean("tRue"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22914);assertTrue(BooleanUtils.toBoolean("tRuE"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22915);assertTrue(BooleanUtils.toBoolean("tRUe"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22916);assertTrue(BooleanUtils.toBoolean("tRUE"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22917);assertTrue(BooleanUtils.toBoolean("TRUE"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22918);assertTrue(BooleanUtils.toBoolean("TRUe"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22919);assertTrue(BooleanUtils.toBoolean("TRuE"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22920);assertTrue(BooleanUtils.toBoolean("TRue"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22921);assertTrue(BooleanUtils.toBoolean("TrUE"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22922);assertTrue(BooleanUtils.toBoolean("TrUe"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22923);assertTrue(BooleanUtils.toBoolean("TruE"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22924);assertTrue(BooleanUtils.toBoolean("True"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22925);assertTrue(BooleanUtils.toBoolean("on"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22926);assertTrue(BooleanUtils.toBoolean("oN"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22927);assertTrue(BooleanUtils.toBoolean("On"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22928);assertTrue(BooleanUtils.toBoolean("ON"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22929);assertTrue(BooleanUtils.toBoolean("yes"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22930);assertTrue(BooleanUtils.toBoolean("yeS"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22931);assertTrue(BooleanUtils.toBoolean("yEs"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22932);assertTrue(BooleanUtils.toBoolean("yES"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22933);assertTrue(BooleanUtils.toBoolean("Yes"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22934);assertTrue(BooleanUtils.toBoolean("YeS"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22935);assertTrue(BooleanUtils.toBoolean("YEs"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22936);assertTrue(BooleanUtils.toBoolean("YES"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22937);assertFalse(BooleanUtils.toBoolean("yes?"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22938);assertFalse(BooleanUtils.toBoolean("tru"));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22939);assertFalse(BooleanUtils.toBoolean("no"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22940);assertFalse(BooleanUtils.toBoolean("off"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22941);assertFalse(BooleanUtils.toBoolean("yoo"));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test
    public void test_toBoolean_String_String_String() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oa98lzhpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_String_String_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22942,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oa98lzhpa(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22942);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22943);assertTrue(BooleanUtils.toBoolean((String) null, null, "N"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22944);assertFalse(BooleanUtils.toBoolean((String) null, "Y", null));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22945);assertTrue(BooleanUtils.toBoolean("Y", "Y", "N"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22946);assertTrue(BooleanUtils.toBoolean("Y", new String("Y"), new String("N")));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22947);assertFalse(BooleanUtils.toBoolean("N", "Y", "N"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22948);assertFalse(BooleanUtils.toBoolean("N", new String("Y"), new String("N")));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22949);assertTrue(BooleanUtils.toBoolean((String) null, null, null));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22950);assertTrue(BooleanUtils.toBoolean("Y", "Y", "Y"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22951);assertTrue(BooleanUtils.toBoolean("Y", new String("Y"), new String("Y")));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBoolean_String_String_String_nullValue() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28uk9pehpk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,110,117,108,108,86,97,108,117,101,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_String_String_String_nullValue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22952,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28uk9pehpk(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22952);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22953);BooleanUtils.toBoolean(null, "Y", "N");
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void test_toBoolean_String_String_String_noMatch() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dju6ikhpm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,116,111,66,111,111,108,101,97,110,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,83,116,114,105,110,103,95,110,111,77,97,116,99,104,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toBoolean_String_String_String_noMatch",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22954,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dju6ikhpm(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22954);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22955);BooleanUtils.toBoolean("X", "Y", "N");
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void test_toStringTrueFalse_Boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2esvfhohpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toStringTrueFalse_Boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22956,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2esvfhohpo(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22956);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22957);assertEquals(null, BooleanUtils.toStringTrueFalse((Boolean) null));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22958);assertEquals("true", BooleanUtils.toStringTrueFalse(Boolean.TRUE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22959);assertEquals("false", BooleanUtils.toStringTrueFalse(Boolean.FALSE));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toStringOnOff_Boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nggkrrhps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toStringOnOff_Boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22960,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nggkrrhps(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22960);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22961);assertEquals(null, BooleanUtils.toStringOnOff((Boolean) null));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22962);assertEquals("on", BooleanUtils.toStringOnOff(Boolean.TRUE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22963);assertEquals("off", BooleanUtils.toStringOnOff(Boolean.FALSE));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toStringYesNo_Boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mewgm7hpw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toStringYesNo_Boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22964,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mewgm7hpw(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22964);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22965);assertEquals(null, BooleanUtils.toStringYesNo((Boolean) null));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22966);assertEquals("yes", BooleanUtils.toStringYesNo(Boolean.TRUE));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22967);assertEquals("no", BooleanUtils.toStringYesNo(Boolean.FALSE));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toString_Boolean_String_String_String() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mg4vu3hq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toString_Boolean_String_String_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22968,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mg4vu3hq0(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22968);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22969);assertEquals("U", BooleanUtils.toString((Boolean) null, "Y", "N", "U"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22970);assertEquals("Y", BooleanUtils.toString(Boolean.TRUE, "Y", "N", "U"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22971);assertEquals("N", BooleanUtils.toString(Boolean.FALSE, "Y", "N", "U"));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void test_toStringTrueFalse_boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v3tqkhq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toStringTrueFalse_boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22972,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v3tqkhq4(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22972);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22973);assertEquals("true", BooleanUtils.toStringTrueFalse(true));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22974);assertEquals("false", BooleanUtils.toStringTrueFalse(false));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toStringOnOff_boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29ioz0nhq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toStringOnOff_boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22975,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29ioz0nhq7(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22975);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22976);assertEquals("on", BooleanUtils.toStringOnOff(true));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22977);assertEquals("off", BooleanUtils.toStringOnOff(false));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toStringYesNo_boolean() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28h4uv3hqa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toStringYesNo_boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22978,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28h4uv3hqa(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22978);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22979);assertEquals("yes", BooleanUtils.toStringYesNo(true));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22980);assertEquals("no", BooleanUtils.toStringYesNo(false));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void test_toString_boolean_String_String_String() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g4ihmdhqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.test_toString_boolean_String_String_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22981,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g4ihmdhqd(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22981);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22982);assertEquals("Y", BooleanUtils.toString(true, "Y", "N"));
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22983);assertEquals("N", BooleanUtils.toString(false, "Y", "N"));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    //  testXor
    //  -----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testXor_primitive_nullInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23c05c4hqg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,88,111,114,95,112,114,105,109,105,116,105,118,101,95,110,117,108,108,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_primitive_nullInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22984,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23c05c4hqg(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22984);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22985);BooleanUtils.xor((boolean[]) null);
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testXor_primitive_emptyInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wnpck2hqi();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,88,111,114,95,112,114,105,109,105,116,105,118,101,95,101,109,112,116,121,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_primitive_emptyInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22986,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wnpck2hqi(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22986);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22987);BooleanUtils.xor(new boolean[] {});
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test
    public void testXor_primitive_validInput_2items() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x6qmtkhqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_primitive_validInput_2items",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22988,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x6qmtkhqk(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22988);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22989);assertTrue(
            "True result for (true, true)",
            ! BooleanUtils.xor(new boolean[] { true, true }));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22990);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.xor(new boolean[] { false, false }));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22991);assertTrue(
            "False result for (true, false)",
            BooleanUtils.xor(new boolean[] { true, false }));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22992);assertTrue(
            "False result for (false, true)",
            BooleanUtils.xor(new boolean[] { false, true }));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test
    public void testXor_primitive_validInput_3items() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),22993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cwtcqfhqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_primitive_validInput_3items",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22993,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cwtcqfhqp(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(22993);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22994);assertTrue(
            "False result for (false, false, true)",
            BooleanUtils.xor(new boolean[] { false, false, true }));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22995);assertTrue(
            "False result for (false, true, false)",
            BooleanUtils.xor(new boolean[] { false, true, false }));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22996);assertTrue(
            "False result for (true, false, false)",
            BooleanUtils.xor(new boolean[] { true, false, false }));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22997);assertTrue(
            "True result for (true, true, true)",
            ! BooleanUtils.xor(new boolean[] { true, true, true }));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22998);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.xor(new boolean[] { false, false, false }));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(22999);assertTrue(
            "True result for (true, true, false)",
            ! BooleanUtils.xor(new boolean[] { true, true, false }));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23000);assertTrue(
            "True result for (true, false, true)",
            ! BooleanUtils.xor(new boolean[] { true, false, true }));

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23001);assertTrue(
            "False result for (false, true, true)",
            ! BooleanUtils.xor(new boolean[] { false, true, true }));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testXor_object_nullInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ft11z4hqy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,88,111,114,95,111,98,106,101,99,116,95,110,117,108,108,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_object_nullInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23002,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ft11z4hqy(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23002);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23003);BooleanUtils.xor((Boolean[]) null);
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testXor_object_emptyInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_215himmhr0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,88,111,114,95,111,98,106,101,99,116,95,101,109,112,116,121,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_object_emptyInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23004,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_215himmhr0(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23004);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23005);BooleanUtils.xor(new Boolean[] {});
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testXor_object_nullElementInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w0p90mhr2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,88,111,114,95,111,98,106,101,99,116,95,110,117,108,108,69,108,101,109,101,110,116,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_object_nullElementInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23006,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w0p90mhr2(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23006);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23007);BooleanUtils.xor(new Boolean[] {null});
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test
    public void testXor_object_validInput_2items() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2endk1ohr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_object_validInput_2items",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23008,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2endk1ohr4(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23008);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23009);assertTrue(
            "True result for (true, true)",
            ! BooleanUtils
                .xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE })
                .booleanValue());

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23010);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils
                .xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE })
                .booleanValue());

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23011);assertTrue(
            "False result for (true, false)",
            BooleanUtils
                .xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE })
                .booleanValue());

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23012);assertTrue(
            "False result for (false, true)",
            BooleanUtils
                .xor(new Boolean[] { Boolean.FALSE, Boolean.TRUE })
                .booleanValue());
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    @Test
    public void testXor_object_validInput_3items() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aa6idhhr9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testXor_object_validInput_3items",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23013,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aa6idhhr9(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23013);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23014);assertTrue(
            "False result for (false, false, true)",
            BooleanUtils
                .xor(
                    new Boolean[] {
                        Boolean.FALSE,
                        Boolean.FALSE,
                        Boolean.TRUE })
                .booleanValue());

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23015);assertTrue(
            "False result for (false, true, false)",
            BooleanUtils
                .xor(
                    new Boolean[] {
                        Boolean.FALSE,
                        Boolean.TRUE,
                        Boolean.FALSE })
                .booleanValue());

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23016);assertTrue(
            "False result for (true, false, false)",
            BooleanUtils
                .xor(
                    new Boolean[] {
                        Boolean.TRUE,
                        Boolean.FALSE,
                        Boolean.FALSE })
                .booleanValue());

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23017);assertTrue(
            "True result for (true, true, true)",
            ! BooleanUtils
                .xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE, Boolean.TRUE })
                .booleanValue());

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23018);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.xor(
                    new Boolean[] {
                        Boolean.FALSE,
                        Boolean.FALSE,
                        Boolean.FALSE })
                .booleanValue());

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23019);assertTrue(
            "True result for (true, true, false)",
            ! BooleanUtils.xor(
                    new Boolean[] {
                        Boolean.TRUE,
                        Boolean.TRUE,
                        Boolean.FALSE })
                .booleanValue());

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23020);assertTrue(
            "True result for (true, false, true)",
            ! BooleanUtils.xor(
                    new Boolean[] {
                        Boolean.TRUE,
                        Boolean.FALSE,
                        Boolean.TRUE })
                .booleanValue());

        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23021);assertTrue(
            "False result for (false, true, true)",
            ! BooleanUtils.xor(
                    new Boolean[] {
                        Boolean.FALSE,
                        Boolean.TRUE,
                        Boolean.TRUE })
                .booleanValue());
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}

    //  testAnd
    //  -----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testAnd_primitive_nullInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ltuebchri();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,110,100,95,112,114,105,109,105,116,105,118,101,95,110,117,108,108,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_primitive_nullInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23022,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ltuebchri(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23022);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23023);BooleanUtils.and((boolean[]) null);
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testAnd_primitive_emptyInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vcro0mhrk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,110,100,95,112,114,105,109,105,116,105,118,101,95,101,109,112,116,121,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_primitive_emptyInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23024,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vcro0mhrk(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23024);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23025);BooleanUtils.and(new boolean[] {});
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void testAnd_primitive_validInput_2items() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x6of04hrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_primitive_validInput_2items",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23026,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x6of04hrm(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23026);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23027);assertTrue(
            "False result for (true, true)",
            BooleanUtils.and(new boolean[] { true, true }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23028);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.and(new boolean[] { false, false }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23029);assertTrue(
            "True result for (true, false)",
            ! BooleanUtils.and(new boolean[] { true, false }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23030);assertTrue(
            "True result for (false, true)",
            ! BooleanUtils.and(new boolean[] { false, true }));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void testAnd_primitive_validInput_3items() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2894ckzhrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_primitive_validInput_3items",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23031,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2894ckzhrr(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23031);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23032);assertTrue(
            "True result for (false, false, true)",
            ! BooleanUtils.and(new boolean[] { false, false, true }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23033);assertTrue(
            "True result for (false, true, false)",
            ! BooleanUtils.and(new boolean[] { false, true, false }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23034);assertTrue(
            "True result for (true, false, false)",
            ! BooleanUtils.and(new boolean[] { true, false, false }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23035);assertTrue(
            "False result for (true, true, true)",
            BooleanUtils.and(new boolean[] { true, true, true }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23036);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.and(new boolean[] { false, false, false }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23037);assertTrue(
            "True result for (true, true, false)",
            ! BooleanUtils.and(new boolean[] { true, true, false }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23038);assertTrue(
            "True result for (true, false, true)",
            ! BooleanUtils.and(new boolean[] { true, false, true }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23039);assertTrue(
            "True result for (false, true, true)",
            ! BooleanUtils.and(new boolean[] { false, true, true }));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testAnd_object_nullInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uy4y4chs0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,110,100,95,111,98,106,101,99,116,95,110,117,108,108,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_object_nullInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23040,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uy4y4chs0(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23040);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23041);BooleanUtils.and((Boolean[]) null);
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testAnd_object_emptyInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2syx7yihs2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,110,100,95,111,98,106,101,99,116,95,101,109,112,116,121,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_object_emptyInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23042,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2syx7yihs2(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23042);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23043);BooleanUtils.and(new Boolean[] {});
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testAnd_object_nullElementInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pmbfa6hs4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,110,100,95,111,98,106,101,99,116,95,110,117,108,108,69,108,101,109,101,110,116,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_object_nullElementInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23044,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pmbfa6hs4(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23044);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23045);BooleanUtils.and(new Boolean[] {null});
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void testAnd_object_validInput_2items() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23lm05chs6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_object_validInput_2items",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23046,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23lm05chs6(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23046);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23047);assertTrue(
            "False result for (true, true)",
            BooleanUtils
            .and(new Boolean[] { Boolean.TRUE, Boolean.TRUE })
            .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23048);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils
            .and(new Boolean[] { Boolean.FALSE, Boolean.FALSE })
            .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23049);assertTrue(
            "True result for (true, false)",
            ! BooleanUtils
            .and(new Boolean[] { Boolean.TRUE, Boolean.FALSE })
            .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23050);assertTrue(
            "True result for (false, true)",
            ! BooleanUtils
            .and(new Boolean[] { Boolean.FALSE, Boolean.TRUE })
            .booleanValue());
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void testAnd_object_validInput_3items() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lby29thsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testAnd_object_validInput_3items",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23051,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lby29thsb(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23051);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23052);assertTrue(
            "True result for (false, false, true)",
            ! BooleanUtils
            .and(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.FALSE,
                    Boolean.TRUE })
                    .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23053);assertTrue(
            "True result for (false, true, false)",
            ! BooleanUtils
            .and(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.TRUE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23054);assertTrue(
            "True result for (true, false, false)",
            ! BooleanUtils
            .and(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.FALSE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23055);assertTrue(
            "False result for (true, true, true)",
            BooleanUtils
            .and(new Boolean[] { Boolean.TRUE, Boolean.TRUE, Boolean.TRUE })
            .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23056);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.and(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.FALSE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23057);assertTrue(
            "True result for (true, true, false)",
            ! BooleanUtils.and(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.TRUE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23058);assertTrue(
            "True result for (true, false, true)",
            ! BooleanUtils.and(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.FALSE,
                    Boolean.TRUE })
                    .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23059);assertTrue(
            "True result for (false, true, true)",
            ! BooleanUtils.and(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.TRUE,
                    Boolean.TRUE })
                    .booleanValue());
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    //  testOr
    //  -----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testOr_primitive_nullInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2awvwa0hsk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,79,114,95,112,114,105,109,105,116,105,118,101,95,110,117,108,108,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_primitive_nullInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23060,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2awvwa0hsk(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23060);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23061);BooleanUtils.or((boolean[]) null);
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testOr_primitive_emptyInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mwhn8ahsm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,79,114,95,112,114,105,109,105,116,105,118,101,95,101,109,112,116,121,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_primitive_emptyInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23062,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mwhn8ahsm(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23062);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23063);BooleanUtils.or(new boolean[] {});
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void testOr_primitive_validInput_2items() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21r1wwshso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_primitive_validInput_2items",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23064,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21r1wwshso(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23064);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23065);assertTrue(
            "False result for (true, true)",
            BooleanUtils.or(new boolean[] { true, true }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23066);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.or(new boolean[] { false, false }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23067);assertTrue(
            "False result for (true, false)",
            BooleanUtils.or(new boolean[] { true, false }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23068);assertTrue(
            "False result for (false, true)",
            BooleanUtils.or(new boolean[] { false, true }));
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void testOr_primitive_validInput_3items() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qolzbxhst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_primitive_validInput_3items",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23069,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qolzbxhst(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23069);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23070);assertTrue(
            "False result for (false, false, true)",
            BooleanUtils.or(new boolean[] { false, false, true }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23071);assertTrue(
            "False result for (false, true, false)",
            BooleanUtils.or(new boolean[] { false, true, false }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23072);assertTrue(
            "False result for (true, false, false)",
            BooleanUtils.or(new boolean[] { true, false, false }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23073);assertTrue(
            "False result for (true, true, true)",
            BooleanUtils.or(new boolean[] { true, true, true }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23074);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.or(new boolean[] { false, false, false }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23075);assertTrue(
            "False result for (true, true, false)",
            BooleanUtils.or(new boolean[] { true, true, false }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23076);assertTrue(
            "False result for (true, false, true)",
            BooleanUtils.or(new boolean[] { true, false, true }));
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23077);assertTrue(
            "False result for (false, true, true)",
            BooleanUtils.or(new boolean[] { false, true, true }));
    
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    @Test(expected = IllegalArgumentException.class)
    public void testOr_object_nullInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vz58mkht2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,79,114,95,111,98,106,101,99,116,95,110,117,108,108,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_object_nullInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23078,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vz58mkht2(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23078);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23079);BooleanUtils.or((Boolean[]) null);
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testOr_object_emptyInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22wbtqeht4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,79,114,95,111,98,106,101,99,116,95,101,109,112,116,121,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_object_emptyInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23080,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22wbtqeht4(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23080);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23081);BooleanUtils.or(new Boolean[] {});
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test(expected = IllegalArgumentException.class)
    public void testOr_object_nullElementInput() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m4gxymht6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,79,114,95,111,98,106,101,99,116,95,110,117,108,108,69,108,101,109,101,110,116,73,110,112,117,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_object_nullElementInput",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23082,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m4gxymht6(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23082);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23083);BooleanUtils.or(new Boolean[] {null});
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void testOr_object_validInput_2items() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2u3d6uoht8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_object_validInput_2items",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23084,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2u3d6uoht8(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23084);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23085);assertTrue(
            "False result for (true, true)",
            BooleanUtils
            .or(new Boolean[] { Boolean.TRUE, Boolean.TRUE })
            .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23086);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils
            .or(new Boolean[] { Boolean.FALSE, Boolean.FALSE })
            .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23087);assertTrue(
            "False result for (true, false)",
            BooleanUtils
            .or(new Boolean[] { Boolean.TRUE, Boolean.FALSE })
            .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23088);assertTrue(
            "False result for (false, true)",
            BooleanUtils
            .or(new Boolean[] { Boolean.FALSE, Boolean.TRUE })
            .booleanValue());
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
    @Test
    public void testOr_object_validInput_3items() {__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceStart(getClass().getName(),23089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g06spbhtd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hjqhjql3lqxtjt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hjqhjql3lqxtjt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BooleanUtilsTest.testOr_object_validInput_3items",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23089,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g06spbhtd(){try{__CLR4_1_2hjqhjql3lqxtjt.R.inc(23089);
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23090);assertTrue(
            "False result for (false, false, true)",
            BooleanUtils
            .or(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.FALSE,
                    Boolean.TRUE })
                    .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23091);assertTrue(
            "False result for (false, true, false)",
            BooleanUtils
            .or(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.TRUE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23092);assertTrue(
            "False result for (true, false, false)",
            BooleanUtils
            .or(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.FALSE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23093);assertTrue(
            "False result for (true, true, true)",
            BooleanUtils
            .or(new Boolean[] { Boolean.TRUE, Boolean.TRUE, Boolean.TRUE })
            .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23094);assertTrue(
            "True result for (false, false)",
            ! BooleanUtils.or(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.FALSE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23095);assertTrue(
            "False result for (true, true, false)",
            BooleanUtils.or(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.TRUE,
                    Boolean.FALSE })
                    .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23096);assertTrue(
            "False result for (true, false, true)",
            BooleanUtils.or(
                new Boolean[] {
                    Boolean.TRUE,
                    Boolean.FALSE,
                    Boolean.TRUE })
                    .booleanValue());
        
        __CLR4_1_2hjqhjql3lqxtjt.R.inc(23097);assertTrue(
            "False result for (false, true, true)",
            BooleanUtils.or(
                new Boolean[] {
                    Boolean.FALSE,
                    Boolean.TRUE,
                    Boolean.TRUE })
                    .booleanValue());
    }finally{__CLR4_1_2hjqhjql3lqxtjt.R.flushNeeded();}}
    
}
