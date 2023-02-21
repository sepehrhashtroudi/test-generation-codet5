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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.CharRange}.
 *
 * @version $Id$
 */
public class CharRangeTest  {static class __CLR4_1_2huuhuul3lqxtkl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,23408,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testClass() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21x2ulvhuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23142,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21x2ulvhuu(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23142);
        // class changed to non-public in 3.0
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23143);assertFalse(Modifier.isPublic(CharRange.class.getModifiers()));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23144);assertTrue(Modifier.isFinal(CharRange.class.getModifiers()));
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructorAccessors_is() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hqin7whux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_is",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23145,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hqin7whux(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23145);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23146);final CharRange rangea = CharRange.is('a');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23147);assertEquals('a', rangea.getStart());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23148);assertEquals('a', rangea.getEnd());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23149);assertFalse(rangea.isNegated());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23150);assertEquals("a", rangea.toString());
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isNot() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2emsrijhv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isNot",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23151,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2emsrijhv3(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23151);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23152);final CharRange rangea = CharRange.isNot('a');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23153);assertEquals('a', rangea.getStart());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23154);assertEquals('a', rangea.getEnd());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23155);assertTrue(rangea.isNegated());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23156);assertEquals("^a", rangea.toString());
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isIn_Same() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vzo6xuhv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isIn_Same",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23157,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vzo6xuhv9(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23157);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23158);final CharRange rangea = CharRange.isIn('a', 'a');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23159);assertEquals('a', rangea.getStart());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23160);assertEquals('a', rangea.getEnd());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23161);assertFalse(rangea.isNegated());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23162);assertEquals("a", rangea.toString());
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isIn_Normal() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_262yh8dhvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isIn_Normal",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23163,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_262yh8dhvf(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23163);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23164);final CharRange rangea = CharRange.isIn('a', 'e');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23165);assertEquals('a', rangea.getStart());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23166);assertEquals('e', rangea.getEnd());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23167);assertFalse(rangea.isNegated());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23168);assertEquals("a-e", rangea.toString());
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isIn_Reversed() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g8eef6hvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isIn_Reversed",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23169,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g8eef6hvl(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23169);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23170);final CharRange rangea = CharRange.isIn('e', 'a');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23171);assertEquals('a', rangea.getStart());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23172);assertEquals('e', rangea.getEnd());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23173);assertFalse(rangea.isNegated());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23174);assertEquals("a-e", rangea.toString());
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isNotIn_Same() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22zw3fdhvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isNotIn_Same",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23175,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22zw3fdhvr(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23175);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23176);final CharRange rangea = CharRange.isNotIn('a', 'a');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23177);assertEquals('a', rangea.getStart());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23178);assertEquals('a', rangea.getEnd());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23179);assertTrue(rangea.isNegated());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23180);assertEquals("^a", rangea.toString());
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isNotIn_Normal() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p3ur0mhvx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isNotIn_Normal",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23181,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p3ur0mhvx(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23181);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23182);final CharRange rangea = CharRange.isNotIn('a', 'e');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23183);assertEquals('a', rangea.getStart());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23184);assertEquals('e', rangea.getEnd());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23185);assertTrue(rangea.isNegated());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23186);assertEquals("^a-e", rangea.toString());
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    @Test
    public void testConstructorAccessors_isNotIn_Reversed() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qt6k39hw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testConstructorAccessors_isNotIn_Reversed",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23187,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qt6k39hw3(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23187);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23188);final CharRange rangea = CharRange.isNotIn('e', 'a');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23189);assertEquals('a', rangea.getStart());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23190);assertEquals('e', rangea.getEnd());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23191);assertTrue(rangea.isNegated());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23192);assertEquals("^a-e", rangea.toString());
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEquals_Object() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q292p8hw9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testEquals_Object",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23193,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q292p8hw9(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23193);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23194);final CharRange rangea = CharRange.is('a');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23195);final CharRange rangeae = CharRange.isIn('a', 'e');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23196);final CharRange rangenotbf = CharRange.isIn('b', 'f');

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23197);assertFalse(rangea.equals(null));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23198);assertTrue(rangea.equals(rangea));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23199);assertTrue(rangea.equals(CharRange.is('a')));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23200);assertTrue(rangeae.equals(rangeae));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23201);assertTrue(rangeae.equals(CharRange.isIn('a', 'e')));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23202);assertTrue(rangenotbf.equals(rangenotbf));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23203);assertTrue(rangenotbf.equals(CharRange.isIn('b', 'f')));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23204);assertFalse(rangea.equals(rangeae));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23205);assertFalse(rangea.equals(rangenotbf));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23206);assertFalse(rangeae.equals(rangea));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23207);assertFalse(rangeae.equals(rangenotbf));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23208);assertFalse(rangenotbf.equals(rangea));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23209);assertFalse(rangenotbf.equals(rangeae));
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8hwq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23210,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8hwq(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23210);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23211);final CharRange rangea = CharRange.is('a');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23212);final CharRange rangeae = CharRange.isIn('a', 'e');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23213);final CharRange rangenotbf = CharRange.isIn('b', 'f');

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23214);assertTrue(rangea.hashCode() == rangea.hashCode());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23215);assertTrue(rangea.hashCode() == CharRange.is('a').hashCode());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23216);assertTrue(rangeae.hashCode() == rangeae.hashCode());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23217);assertTrue(rangeae.hashCode() == CharRange.isIn('a', 'e').hashCode());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23218);assertTrue(rangenotbf.hashCode() == rangenotbf.hashCode());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23219);assertTrue(rangenotbf.hashCode() == CharRange.isIn('b', 'f').hashCode());

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23220);assertFalse(rangea.hashCode() == rangeae.hashCode());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23221);assertFalse(rangea.hashCode() == rangenotbf.hashCode());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23222);assertFalse(rangeae.hashCode() == rangea.hashCode());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23223);assertFalse(rangeae.hashCode() == rangenotbf.hashCode());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23224);assertFalse(rangenotbf.hashCode() == rangea.hashCode());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23225);assertFalse(rangenotbf.hashCode() == rangeae.hashCode());
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testContains_Char() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v8fyfphx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testContains_Char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23226,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v8fyfphx6(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23226);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23227);CharRange range = CharRange.is('c');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23228);assertFalse(range.contains('b'));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23229);assertTrue(range.contains('c'));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23230);assertFalse(range.contains('d'));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23231);assertFalse(range.contains('e'));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23232);range = CharRange.isIn('c', 'd');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23233);assertFalse(range.contains('b'));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23234);assertTrue(range.contains('c'));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23235);assertTrue(range.contains('d'));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23236);assertFalse(range.contains('e'));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23237);range = CharRange.isIn('d', 'c');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23238);assertFalse(range.contains('b'));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23239);assertTrue(range.contains('c'));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23240);assertTrue(range.contains('d'));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23241);assertFalse(range.contains('e'));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23242);range = CharRange.isNotIn('c', 'd');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23243);assertTrue(range.contains('b'));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23244);assertFalse(range.contains('c'));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23245);assertFalse(range.contains('d'));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23246);assertTrue(range.contains('e'));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23247);assertTrue(range.contains((char) 0));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23248);assertTrue(range.contains(Character.MAX_VALUE));
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testContains_Charrange() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oczku8hxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testContains_Charrange",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23249,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oczku8hxt(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23249);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23250);final CharRange a = CharRange.is('a');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23251);final CharRange b = CharRange.is('b');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23252);final CharRange c = CharRange.is('c');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23253);final CharRange c2 = CharRange.is('c');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23254);final CharRange d = CharRange.is('d');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23255);final CharRange e = CharRange.is('e');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23256);final CharRange cd = CharRange.isIn('c', 'd');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23257);final CharRange bd = CharRange.isIn('b', 'd');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23258);final CharRange bc = CharRange.isIn('b', 'c');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23259);final CharRange ab = CharRange.isIn('a', 'b');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23260);final CharRange de = CharRange.isIn('d', 'e');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23261);final CharRange ef = CharRange.isIn('e', 'f');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23262);final CharRange ae = CharRange.isIn('a', 'e');

        // normal/normal
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23263);assertFalse(c.contains(b));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23264);assertTrue(c.contains(c));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23265);assertTrue(c.contains(c2));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23266);assertFalse(c.contains(d));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23267);assertFalse(c.contains(cd));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23268);assertFalse(c.contains(bd));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23269);assertFalse(c.contains(bc));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23270);assertFalse(c.contains(ab));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23271);assertFalse(c.contains(de));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23272);assertTrue(cd.contains(c));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23273);assertTrue(bd.contains(c));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23274);assertTrue(bc.contains(c));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23275);assertFalse(ab.contains(c));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23276);assertFalse(de.contains(c));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23277);assertTrue(ae.contains(b));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23278);assertTrue(ae.contains(ab));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23279);assertTrue(ae.contains(bc));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23280);assertTrue(ae.contains(cd));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23281);assertTrue(ae.contains(de));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23282);final CharRange notb = CharRange.isNot('b');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23283);final CharRange notc = CharRange.isNot('c');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23284);final CharRange notd = CharRange.isNot('d');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23285);final CharRange notab = CharRange.isNotIn('a', 'b');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23286);final CharRange notbc = CharRange.isNotIn('b', 'c');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23287);final CharRange notbd = CharRange.isNotIn('b', 'd');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23288);final CharRange notcd = CharRange.isNotIn('c', 'd');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23289);final CharRange notde = CharRange.isNotIn('d', 'e');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23290);final CharRange notae = CharRange.isNotIn('a', 'e');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23291);final CharRange all = CharRange.isIn((char) 0, Character.MAX_VALUE);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23292);final CharRange allbutfirst = CharRange.isIn((char) 1, Character.MAX_VALUE);

        // normal/negated
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23293);assertFalse(c.contains(notc));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23294);assertFalse(c.contains(notbd));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23295);assertTrue(all.contains(notc));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23296);assertTrue(all.contains(notbd));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23297);assertFalse(allbutfirst.contains(notc));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23298);assertFalse(allbutfirst.contains(notbd));

        // negated/normal
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23299);assertTrue(notc.contains(a));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23300);assertTrue(notc.contains(b));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23301);assertFalse(notc.contains(c));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23302);assertTrue(notc.contains(d));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23303);assertTrue(notc.contains(e));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23304);assertTrue(notc.contains(ab));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23305);assertFalse(notc.contains(bc));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23306);assertFalse(notc.contains(bd));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23307);assertFalse(notc.contains(cd));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23308);assertTrue(notc.contains(de));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23309);assertFalse(notc.contains(ae));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23310);assertFalse(notc.contains(all));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23311);assertFalse(notc.contains(allbutfirst));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23312);assertTrue(notbd.contains(a));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23313);assertFalse(notbd.contains(b));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23314);assertFalse(notbd.contains(c));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23315);assertFalse(notbd.contains(d));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23316);assertTrue(notbd.contains(e));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23317);assertTrue(notcd.contains(ab));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23318);assertFalse(notcd.contains(bc));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23319);assertFalse(notcd.contains(bd));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23320);assertFalse(notcd.contains(cd));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23321);assertFalse(notcd.contains(de));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23322);assertFalse(notcd.contains(ae));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23323);assertTrue(notcd.contains(ef));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23324);assertFalse(notcd.contains(all));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23325);assertFalse(notcd.contains(allbutfirst));

        // negated/negated
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23326);assertFalse(notc.contains(notb));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23327);assertTrue(notc.contains(notc));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23328);assertFalse(notc.contains(notd));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23329);assertFalse(notc.contains(notab));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23330);assertTrue(notc.contains(notbc));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23331);assertTrue(notc.contains(notbd));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23332);assertTrue(notc.contains(notcd));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23333);assertFalse(notc.contains(notde));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23334);assertFalse(notbd.contains(notb));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23335);assertFalse(notbd.contains(notc));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23336);assertFalse(notbd.contains(notd));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23337);assertFalse(notbd.contains(notab));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23338);assertFalse(notbd.contains(notbc));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23339);assertTrue(notbd.contains(notbd));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23340);assertFalse(notbd.contains(notcd));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23341);assertFalse(notbd.contains(notde));
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23342);assertTrue(notbd.contains(notae));
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    @Test
    public void testContainsNullArg() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21hj6pxi0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testContainsNullArg",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23343,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21hj6pxi0f(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23343);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23344);final CharRange range = CharRange.is('a');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23345);try {
            __CLR4_1_2huuhuul3lqxtkl.R.inc(23346);@SuppressWarnings("unused")
            final
            boolean contains = range.contains(null);
        } catch(final IllegalArgumentException e) {
            __CLR4_1_2huuhuul3lqxtkl.R.inc(23347);assertEquals("The Range must not be null", e.getMessage());
        }
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    @Test
    public void testIterator() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d9uicni0k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testIterator",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23348,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d9uicni0k(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23348);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23349);final CharRange a = CharRange.is('a');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23350);final CharRange ad = CharRange.isIn('a', 'd');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23351);final CharRange nota = CharRange.isNot('a');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23352);final CharRange emptySet = CharRange.isNotIn((char) 0, Character.MAX_VALUE);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23353);final CharRange notFirst = CharRange.isNotIn((char) 1, Character.MAX_VALUE);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23354);final CharRange notLast = CharRange.isNotIn((char) 0, (char) (Character.MAX_VALUE - 1));

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23355);final Iterator<Character> aIt = a.iterator();
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23356);assertNotNull(aIt);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23357);assertTrue(aIt.hasNext());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23358);assertEquals(Character.valueOf('a'), aIt.next());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23359);assertFalse(aIt.hasNext());

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23360);final Iterator<Character> adIt = ad.iterator();
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23361);assertNotNull(adIt);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23362);assertTrue(adIt.hasNext());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23363);assertEquals(Character.valueOf('a'), adIt.next());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23364);assertEquals(Character.valueOf('b'), adIt.next());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23365);assertEquals(Character.valueOf('c'), adIt.next());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23366);assertEquals(Character.valueOf('d'), adIt.next());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23367);assertFalse(adIt.hasNext());

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23368);final Iterator<Character> notaIt = nota.iterator();
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23369);assertNotNull(notaIt);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23370);assertTrue(notaIt.hasNext());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23371);while ((((notaIt.hasNext())&&(__CLR4_1_2huuhuul3lqxtkl.R.iget(23372)!=0|true))||(__CLR4_1_2huuhuul3lqxtkl.R.iget(23373)==0&false))) {{
            __CLR4_1_2huuhuul3lqxtkl.R.inc(23374);final Character c = notaIt.next();
            __CLR4_1_2huuhuul3lqxtkl.R.inc(23375);assertFalse('a' == c.charValue());
        }

        }__CLR4_1_2huuhuul3lqxtkl.R.inc(23376);final Iterator<Character> emptySetIt = emptySet.iterator();
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23377);assertNotNull(emptySetIt);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23378);assertFalse(emptySetIt.hasNext());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23379);try {
            __CLR4_1_2huuhuul3lqxtkl.R.inc(23380);emptySetIt.next();
            __CLR4_1_2huuhuul3lqxtkl.R.inc(23381);fail("Should throw NoSuchElementException");
        } catch (final NoSuchElementException e) {
            __CLR4_1_2huuhuul3lqxtkl.R.inc(23382);assertTrue(true);
        }

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23383);final Iterator<Character> notFirstIt = notFirst.iterator();
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23384);assertNotNull(notFirstIt);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23385);assertTrue(notFirstIt.hasNext());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23386);assertEquals(Character.valueOf((char) 0), notFirstIt.next());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23387);assertFalse(notFirstIt.hasNext());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23388);try {
            __CLR4_1_2huuhuul3lqxtkl.R.inc(23389);notFirstIt.next();
            __CLR4_1_2huuhuul3lqxtkl.R.inc(23390);fail("Should throw NoSuchElementException");
        } catch (final NoSuchElementException e) {
            __CLR4_1_2huuhuul3lqxtkl.R.inc(23391);assertTrue(true);
        }

        __CLR4_1_2huuhuul3lqxtkl.R.inc(23392);final Iterator<Character> notLastIt = notLast.iterator();
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23393);assertNotNull(notLastIt);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23394);assertTrue(notLastIt.hasNext());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23395);assertEquals(Character.valueOf(Character.MAX_VALUE), notLastIt.next());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23396);assertFalse(notLastIt.hasNext());
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23397);try {
            __CLR4_1_2huuhuul3lqxtkl.R.inc(23398);notLastIt.next();
            __CLR4_1_2huuhuul3lqxtkl.R.inc(23399);fail("Should throw NoSuchElementException");
        } catch (final NoSuchElementException e) {
            __CLR4_1_2huuhuul3lqxtkl.R.inc(23400);assertTrue(true);
        }
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerialization() {__CLR4_1_2huuhuul3lqxtkl.R.globalSliceStart(getClass().getName(),23401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26m1on9i21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2huuhuul3lqxtkl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2huuhuul3lqxtkl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharRangeTest.testSerialization",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23401,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26m1on9i21(){try{__CLR4_1_2huuhuul3lqxtkl.R.inc(23401);
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23402);CharRange range = CharRange.is('a');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23403);assertEquals(range, SerializationUtils.clone(range)); 
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23404);range = CharRange.isIn('a', 'e');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23405);assertEquals(range, SerializationUtils.clone(range)); 
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23406);range = CharRange.isNotIn('a', 'e');
        __CLR4_1_2huuhuul3lqxtkl.R.inc(23407);assertEquals(range, SerializationUtils.clone(range)); 
    }finally{__CLR4_1_2huuhuul3lqxtkl.R.flushNeeded();}}

}
