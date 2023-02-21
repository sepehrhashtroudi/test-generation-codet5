/* $$ This file has been instrumented by Clover 4.1.2#20161011084623935 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @version $Id$
 */
public class EnumUtilsTest {static class __CLR4_1_2js3js3l3lqxtvc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,25830,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConstructable() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26t3r8mjs3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.testConstructable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25635,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26t3r8mjs3(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25635);
        // enforce public constructor
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25636);new EnumUtils();
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test
    public void test_getEnumMap() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_216e9xjjs5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_getEnumMap",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25637,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_216e9xjjs5(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25637);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25638);final Map<String, Traffic> test = EnumUtils.getEnumMap(Traffic.class);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25639);assertEquals( "getEnumMap not created correctly", "{RED=RED, AMBER=AMBER, GREEN=GREEN}", test.toString());
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25640);assertEquals(3, test.size());
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25641);assertTrue(test.containsKey("RED"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25642);assertEquals(Traffic.RED, test.get("RED"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25643);assertTrue(test.containsKey("AMBER"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25644);assertEquals(Traffic.AMBER, test.get("AMBER"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25645);assertTrue(test.containsKey("GREEN"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25646);assertEquals(Traffic.GREEN, test.get("GREEN"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25647);assertFalse(test.containsKey("PURPLE"));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test
    public void test_getEnumList() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23vpsjzjsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_getEnumList",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25648,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23vpsjzjsg(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25648);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25649);final List<Traffic> test = EnumUtils.getEnumList(Traffic.class);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25650);assertEquals(3, test.size());
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25651);assertEquals(Traffic.RED, test.get(0));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25652);assertEquals(Traffic.AMBER, test.get(1));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25653);assertEquals(Traffic.GREEN, test.get(2));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test
    public void test_isEnum() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vk417ljsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_isEnum",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25654,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vk417ljsm(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25654);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25655);assertTrue(EnumUtils.isValidEnum(Traffic.class, "RED"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25656);assertTrue(EnumUtils.isValidEnum(Traffic.class, "AMBER"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25657);assertTrue(EnumUtils.isValidEnum(Traffic.class, "GREEN"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25658);assertFalse(EnumUtils.isValidEnum(Traffic.class, "PURPLE"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25659);assertFalse(EnumUtils.isValidEnum(Traffic.class, null));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_isEnum_nullClass() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2acnj9tjss();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,105,115,69,110,117,109,95,110,117,108,108,67,108,97,115,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_isEnum_nullClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25660,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2acnj9tjss(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25660);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25661);EnumUtils.isValidEnum((Class<Traffic>) null, "PURPLE");
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test
    public void test_getEnum() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2z3ex1tjsu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_getEnum",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25662,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2z3ex1tjsu(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25662);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25663);assertEquals(Traffic.RED, EnumUtils.getEnum(Traffic.class, "RED"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25664);assertEquals(Traffic.AMBER, EnumUtils.getEnum(Traffic.class, "AMBER"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25665);assertEquals(Traffic.GREEN, EnumUtils.getEnum(Traffic.class, "GREEN"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25666);assertEquals(null, EnumUtils.getEnum(Traffic.class, "PURPLE"));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25667);assertEquals(null, EnumUtils.getEnum(Traffic.class, null));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_getEnum_nullClass() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gqzkcjjt0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,116,69,110,117,109,95,110,117,108,108,67,108,97,115,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_getEnum_nullClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25668,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gqzkcjjt0(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25668);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25669);EnumUtils.getEnum((Class<Traffic>) null, "PURPLE");
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_generateBitVector_nullClass() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wii093jt2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,117,108,108,67,108,97,115,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nullClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25670,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wii093jt2(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25670);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25671);EnumUtils.generateBitVector(null, EnumSet.of(Traffic.RED));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_generateBitVectors_nullClass() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nt7anyjt4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,67,108,97,115,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nullClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25672,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nt7anyjt4(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25672);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25673);EnumUtils.generateBitVectors(null, EnumSet.of(Traffic.RED));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    @Test(expected=NullPointerException.class)
    public void test_generateBitVector_nullIterable() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kd3hwxjt6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,117,108,108,73,116,101,114,97,98,108,101,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nullIterable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25674,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kd3hwxjt6(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25674);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25675);EnumUtils.generateBitVector(Traffic.class, (Iterable<Traffic>) null);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_generateBitVectors_nullIterable() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2krrnrujt8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,73,116,101,114,97,98,108,101,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nullIterable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25676,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2krrnrujt8(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25676);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25677);EnumUtils.generateBitVectors(null, (Iterable<Traffic>) null);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVector_nullElement() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rbzd7jta();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,117,108,108,69,108,101,109,101,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nullElement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25678,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rbzd7jta(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25678);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25679);EnumUtils.generateBitVector(Traffic.class, Arrays.asList(Traffic.RED, null));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVectors_nullElement() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j3pf5ujtc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,69,108,101,109,101,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nullElement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25680,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j3pf5ujtc(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25680);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25681);EnumUtils.generateBitVectors(Traffic.class, Arrays.asList(Traffic.RED, null));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    @Test(expected=NullPointerException.class)
    public void test_generateBitVector_nullClassWithArray() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_247fgjejte();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,117,108,108,67,108,97,115,115,87,105,116,104,65,114,114,97,121,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nullClassWithArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25682,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_247fgjejte(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25682);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25683);EnumUtils.generateBitVector(null, Traffic.RED);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    @Test(expected=NullPointerException.class)
    public void test_generateBitVectors_nullClassWithArray() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26f8yotjtg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,67,108,97,115,115,87,105,116,104,65,114,114,97,121,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nullClassWithArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25684,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26f8yotjtg(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25684);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25685);EnumUtils.generateBitVectors(null, Traffic.RED);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    @Test(expected=NullPointerException.class)
    public void test_generateBitVector_nullArray() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29ljpfcjti();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,117,108,108,65,114,114,97,121,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25686,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29ljpfcjti(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25686);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25687);EnumUtils.generateBitVector(Traffic.class, (Traffic[]) null);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_generateBitVectors_nullArray() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iauf0hjtk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,65,114,114,97,121,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25688,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iauf0hjtk(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25688);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25689);EnumUtils.generateBitVectors(Traffic.class, (Traffic[]) null);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVector_nullArrayElement() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_222237ijtm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,117,108,108,65,114,114,97,121,69,108,101,109,101,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nullArrayElement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25690,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_222237ijtm(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25690);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25691);EnumUtils.generateBitVector(Traffic.class, Traffic.RED, null);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVectors_nullArrayElement() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tkb0ydjto();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,65,114,114,97,121,69,108,101,109,101,110,116,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nullArrayElement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25692,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tkb0ydjto(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25692);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25693);EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, null);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVector_longClass() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28r5je6jtq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,108,111,110,103,67,108,97,115,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_longClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25694,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28r5je6jtq(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25694);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25695);EnumUtils.generateBitVector(TooMany.class, EnumSet.of(TooMany.A1));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVector_longClassWithArray() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v84panjts();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,108,111,110,103,67,108,97,115,115,87,105,116,104,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_longClassWithArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25696,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v84panjts(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25696);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25697);EnumUtils.generateBitVector(TooMany.class, TooMany.A1);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVector_nonEnumClass() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xohmamjtu();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,111,110,69,110,117,109,67,108,97,115,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nonEnumClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25698,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xohmamjtu(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25698);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25699);@SuppressWarnings("rawtypes")
        final
        Class rawType = Object.class;
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25700);@SuppressWarnings("rawtypes")
        final
        List rawList = new ArrayList();
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25701);EnumUtils.generateBitVector(rawType, rawList);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    @SuppressWarnings("unchecked")
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVectors_nonEnumClass() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x9tgfpjty();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,111,110,69,110,117,109,67,108,97,115,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nonEnumClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25702,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x9tgfpjty(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25702);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25703);@SuppressWarnings("rawtypes")
        final
        Class rawType = Object.class;
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25704);@SuppressWarnings("rawtypes")
        final
        List rawList = new ArrayList();
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25705);EnumUtils.generateBitVectors(rawType, rawList);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    @SuppressWarnings("unchecked")
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVector_nonEnumClassWithArray() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gnzfsvju2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,95,110,111,110,69,110,117,109,67,108,97,115,115,87,105,116,104,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector_nonEnumClassWithArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25706,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gnzfsvju2(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25706);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25707);@SuppressWarnings("rawtypes")
        final
        Class rawType = Object.class;
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25708);EnumUtils.generateBitVector(rawType);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    @Test(expected=IllegalArgumentException.class)
    public void test_generateBitVectors_nonEnumClassWithArray() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24kl8eiju5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,103,101,110,101,114,97,116,101,66,105,116,86,101,99,116,111,114,115,95,110,111,110,69,110,117,109,67,108,97,115,115,87,105,116,104,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors_nonEnumClassWithArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25709,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24kl8eiju5(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25709);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25710);@SuppressWarnings("rawtypes")
        final
        Class rawType = Object.class;
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25711);EnumUtils.generateBitVectors(rawType);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    @Test
    public void test_generateBitVector() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24rr6lnju8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVector",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25712,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24rr6lnju8(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25712);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25713);assertEquals(0L, EnumUtils.generateBitVector(Traffic.class, EnumSet.noneOf(Traffic.class)));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25714);assertEquals(1L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.RED)));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25715);assertEquals(2L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.AMBER)));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25716);assertEquals(4L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.GREEN)));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25717);assertEquals(3L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.RED, Traffic.AMBER)));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25718);assertEquals(5L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.RED, Traffic.GREEN)));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25719);assertEquals(6L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.AMBER, Traffic.GREEN)));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25720);assertEquals(7L, EnumUtils.generateBitVector(Traffic.class, EnumSet.of(Traffic.RED, Traffic.AMBER, Traffic.GREEN)));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test
    public void test_generateBitVectors() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2z3vbf0juh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectors",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25721,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2z3vbf0juh(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25721);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25722);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.noneOf(Traffic.class)), 0L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25723);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.RED)), 1L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25724);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.AMBER)), 2L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25725);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.GREEN)), 4L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25726);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.RED, Traffic.AMBER)), 3L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25727);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.RED, Traffic.GREEN)), 5L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25728);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.AMBER, Traffic.GREEN)), 6L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25729);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, EnumSet.of(Traffic.RED, Traffic.AMBER, Traffic.GREEN)), 7L);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test
    public void test_generateBitVectorFromArray() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nxyhc8juq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectorFromArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25730,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nxyhc8juq(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25730);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25731);assertEquals(0L, EnumUtils.generateBitVector(Traffic.class));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25732);assertEquals(1L, EnumUtils.generateBitVector(Traffic.class, Traffic.RED));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25733);assertEquals(2L, EnumUtils.generateBitVector(Traffic.class, Traffic.AMBER));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25734);assertEquals(4L, EnumUtils.generateBitVector(Traffic.class, Traffic.GREEN));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25735);assertEquals(3L, EnumUtils.generateBitVector(Traffic.class, Traffic.RED, Traffic.AMBER));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25736);assertEquals(5L, EnumUtils.generateBitVector(Traffic.class, Traffic.RED, Traffic.GREEN));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25737);assertEquals(6L, EnumUtils.generateBitVector(Traffic.class, Traffic.AMBER, Traffic.GREEN));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25738);assertEquals(7L, EnumUtils.generateBitVector(Traffic.class, Traffic.RED, Traffic.AMBER, Traffic.GREEN));
        //gracefully handles duplicates:
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25739);assertEquals(7L, EnumUtils.generateBitVector(Traffic.class, Traffic.RED, Traffic.AMBER, Traffic.GREEN, Traffic.GREEN));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    @Test
    public void test_generateBitVectorsFromArray() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wtsupdjv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_generateBitVectorsFromArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25740,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wtsupdjv0(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25740);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25741);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class), 0L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25742);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED), 1L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25743);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.AMBER), 2L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25744);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.GREEN), 4L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25745);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, Traffic.AMBER), 3L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25746);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, Traffic.GREEN), 5L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25747);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.AMBER, Traffic.GREEN), 6L);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25748);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, Traffic.AMBER, Traffic.GREEN), 7L);
        //gracefully handles duplicates:
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25749);assertArrayEquals(EnumUtils.generateBitVectors(Traffic.class, Traffic.RED, Traffic.AMBER, Traffic.GREEN, Traffic.GREEN), 7L);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    private void assertArrayEquals(final long[] actual, final long... expected) {try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25750);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25751);Assert.assertArrayEquals(expected, actual);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_processBitVector_nullClass() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uaay61jvc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,112,114,111,99,101,115,115,66,105,116,86,101,99,116,111,114,95,110,117,108,108,67,108,97,115,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_processBitVector_nullClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25752,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uaay61jvc(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25752);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25753);final Class<Traffic> empty = null;
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25754);EnumUtils.processBitVector(empty, 0L);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void test_processBitVectors_nullClass() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_255ov0ijvf();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,112,114,111,99,101,115,115,66,105,116,86,101,99,116,111,114,115,95,110,117,108,108,67,108,97,115,115,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_processBitVectors_nullClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25755,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_255ov0ijvf(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25755);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25756);final Class<Traffic> empty = null;
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25757);EnumUtils.processBitVectors(empty, 0L);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test
    public void test_processBitVector() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hp3wx7jvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_processBitVector",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25758,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hp3wx7jvi(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25758);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25759);assertEquals(EnumSet.noneOf(Traffic.class), EnumUtils.processBitVector(Traffic.class, 0L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25760);assertEquals(EnumSet.of(Traffic.RED), EnumUtils.processBitVector(Traffic.class, 1L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25761);assertEquals(EnumSet.of(Traffic.AMBER), EnumUtils.processBitVector(Traffic.class, 2L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25762);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER), EnumUtils.processBitVector(Traffic.class, 3L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25763);assertEquals(EnumSet.of(Traffic.GREEN), EnumUtils.processBitVector(Traffic.class, 4L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25764);assertEquals(EnumSet.of(Traffic.RED, Traffic.GREEN), EnumUtils.processBitVector(Traffic.class, 5L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25765);assertEquals(EnumSet.of(Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVector(Traffic.class, 6L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25766);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVector(Traffic.class, 7L));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test
    public void test_processBitVectors() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2agj2nojvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_processBitVectors",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25767,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2agj2nojvr(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25767);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25768);assertEquals(EnumSet.noneOf(Traffic.class), EnumUtils.processBitVectors(Traffic.class, 0L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25769);assertEquals(EnumSet.of(Traffic.RED), EnumUtils.processBitVectors(Traffic.class, 1L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25770);assertEquals(EnumSet.of(Traffic.AMBER), EnumUtils.processBitVectors(Traffic.class, 2L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25771);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER), EnumUtils.processBitVectors(Traffic.class, 3L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25772);assertEquals(EnumSet.of(Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 4L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25773);assertEquals(EnumSet.of(Traffic.RED, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 5L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25774);assertEquals(EnumSet.of(Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 6L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25775);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 7L));

        __CLR4_1_2js3js3l3lqxtvc.R.inc(25776);assertEquals(EnumSet.noneOf(Traffic.class), EnumUtils.processBitVectors(Traffic.class, 0L, 0L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25777);assertEquals(EnumSet.of(Traffic.RED), EnumUtils.processBitVectors(Traffic.class, 0L, 1L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25778);assertEquals(EnumSet.of(Traffic.AMBER), EnumUtils.processBitVectors(Traffic.class, 0L, 2L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25779);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER), EnumUtils.processBitVectors(Traffic.class, 0L, 3L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25780);assertEquals(EnumSet.of(Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 0L, 4L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25781);assertEquals(EnumSet.of(Traffic.RED, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 0L, 5L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25782);assertEquals(EnumSet.of(Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 0L, 6L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25783);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 0L, 7L));

        // demonstrate tolerance of irrelevant high-order digits:
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25784);assertEquals(EnumSet.noneOf(Traffic.class), EnumUtils.processBitVectors(Traffic.class, 666L, 0L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25785);assertEquals(EnumSet.of(Traffic.RED), EnumUtils.processBitVectors(Traffic.class, 666L, 1L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25786);assertEquals(EnumSet.of(Traffic.AMBER), EnumUtils.processBitVectors(Traffic.class, 666L, 2L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25787);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER), EnumUtils.processBitVectors(Traffic.class, 666L, 3L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25788);assertEquals(EnumSet.of(Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 666L, 4L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25789);assertEquals(EnumSet.of(Traffic.RED, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 666L, 5L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25790);assertEquals(EnumSet.of(Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 666L, 6L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25791);assertEquals(EnumSet.of(Traffic.RED, Traffic.AMBER, Traffic.GREEN), EnumUtils.processBitVectors(Traffic.class, 666L, 7L));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void test_processBitVector_longClass() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iufu6jwg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,112,114,111,99,101,115,115,66,105,116,86,101,99,116,111,114,95,108,111,110,103,67,108,97,115,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_processBitVector_longClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25792,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iufu6jwg(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25792);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25793);EnumUtils.processBitVector(TooMany.class, 0L);
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}
    
    public void test_processBitVectors_longClass() {__CLR4_1_2js3js3l3lqxtvc.R.globalSliceStart(getClass().getName(),25794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2olrnbdjwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2js3js3l3lqxtvc.R.rethrow($CLV_t2$);}finally{__CLR4_1_2js3js3l3lqxtvc.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.EnumUtilsTest.test_processBitVectors_longClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25794,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2olrnbdjwi(){try{__CLR4_1_2js3js3l3lqxtvc.R.inc(25794);
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25795);assertEquals(EnumSet.noneOf(TooMany.class), EnumUtils.processBitVectors(TooMany.class, 0L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25796);assertEquals(EnumSet.of(TooMany.A), EnumUtils.processBitVectors(TooMany.class, 1L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25797);assertEquals(EnumSet.of(TooMany.B), EnumUtils.processBitVectors(TooMany.class, 2L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25798);assertEquals(EnumSet.of(TooMany.A, TooMany.B), EnumUtils.processBitVectors(TooMany.class, 3L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25799);assertEquals(EnumSet.of(TooMany.C), EnumUtils.processBitVectors(TooMany.class, 4L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25800);assertEquals(EnumSet.of(TooMany.A, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 5L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25801);assertEquals(EnumSet.of(TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 6L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25802);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 7L));

        __CLR4_1_2js3js3l3lqxtvc.R.inc(25803);assertEquals(EnumSet.noneOf(TooMany.class), EnumUtils.processBitVectors(TooMany.class, 0L, 0L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25804);assertEquals(EnumSet.of(TooMany.A), EnumUtils.processBitVectors(TooMany.class, 0L, 1L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25805);assertEquals(EnumSet.of(TooMany.B), EnumUtils.processBitVectors(TooMany.class, 0L, 2L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25806);assertEquals(EnumSet.of(TooMany.A, TooMany.B), EnumUtils.processBitVectors(TooMany.class, 0L, 3L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25807);assertEquals(EnumSet.of(TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 4L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25808);assertEquals(EnumSet.of(TooMany.A, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 5L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25809);assertEquals(EnumSet.of(TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 6L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25810);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 7L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25811);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C), EnumUtils.processBitVectors(TooMany.class, 0L, 7L));

        __CLR4_1_2js3js3l3lqxtvc.R.inc(25812);assertEquals(EnumSet.of(TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 0L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25813);assertEquals(EnumSet.of(TooMany.A, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 1L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25814);assertEquals(EnumSet.of(TooMany.B, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 2L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25815);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 3L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25816);assertEquals(EnumSet.of(TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 4L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25817);assertEquals(EnumSet.of(TooMany.A, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 5L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25818);assertEquals(EnumSet.of(TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 6L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25819);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 7L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25820);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 1L, 7L));

        // demonstrate tolerance of irrelevant high-order digits:
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25821);assertEquals(EnumSet.of(TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 0L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25822);assertEquals(EnumSet.of(TooMany.A, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 1L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25823);assertEquals(EnumSet.of(TooMany.B, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 2L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25824);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 3L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25825);assertEquals(EnumSet.of(TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 4L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25826);assertEquals(EnumSet.of(TooMany.A, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 5L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25827);assertEquals(EnumSet.of(TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 6L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25828);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 7L));
        __CLR4_1_2js3js3l3lqxtvc.R.inc(25829);assertEquals(EnumSet.of(TooMany.A, TooMany.B, TooMany.C, TooMany.M2), EnumUtils.processBitVectors(TooMany.class, 9L, 7L));
    }finally{__CLR4_1_2js3js3l3lqxtvc.R.flushNeeded();}}

}

enum Traffic {
    RED, AMBER, GREEN
}

enum TooMany {
    A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z,
    A1,B1,C1,D1,E1,F1,G1,H1,I1,J1,K1,L1,M1,N1,O1,P1,Q1,R1,S1,T1,U1,V1,W1,X1,Y1,Z1,
    A2,B2,C2,D2,E2,F2,G2,H2,I2,J2,K2,L2,M2;
}
