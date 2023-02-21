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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods
 *
 * @version $Id$
 */
public class StringUtilsIsTest  {static class __CLR4_1_2lcmlcml3lqxu0g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,27786,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------

    @Test
    public void testIsAlpha() {__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceStart(getClass().getName(),27670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bg1d9llcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lcmlcml3lqxu0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsAlpha",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27670,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bg1d9llcm(){try{__CLR4_1_2lcmlcml3lqxu0g.R.inc(27670);
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27671);assertFalse(StringUtils.isAlpha(null));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27672);assertFalse(StringUtils.isAlpha(""));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27673);assertFalse(StringUtils.isAlpha(" "));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27674);assertTrue(StringUtils.isAlpha("a"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27675);assertTrue(StringUtils.isAlpha("A"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27676);assertTrue(StringUtils.isAlpha("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27677);assertFalse(StringUtils.isAlpha("ham kso"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27678);assertFalse(StringUtils.isAlpha("1"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27679);assertFalse(StringUtils.isAlpha("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27680);assertFalse(StringUtils.isAlpha("_"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27681);assertFalse(StringUtils.isAlpha("hkHKHik*khbkuh"));
    }finally{__CLR4_1_2lcmlcml3lqxu0g.R.flushNeeded();}}

    @Test
    public void testIsAlphanumeric() {__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceStart(getClass().getName(),27682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fbygfilcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lcmlcml3lqxu0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsAlphanumeric",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27682,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fbygfilcy(){try{__CLR4_1_2lcmlcml3lqxu0g.R.inc(27682);
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27683);assertFalse(StringUtils.isAlphanumeric(null));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27684);assertFalse(StringUtils.isAlphanumeric(""));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27685);assertFalse(StringUtils.isAlphanumeric(" "));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27686);assertTrue(StringUtils.isAlphanumeric("a"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27687);assertTrue(StringUtils.isAlphanumeric("A"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27688);assertTrue(StringUtils.isAlphanumeric("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27689);assertFalse(StringUtils.isAlphanumeric("ham kso"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27690);assertTrue(StringUtils.isAlphanumeric("1"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27691);assertTrue(StringUtils.isAlphanumeric("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27692);assertFalse(StringUtils.isAlphanumeric("_"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27693);assertFalse(StringUtils.isAlphanumeric("hkHKHik*khbkuh"));
    }finally{__CLR4_1_2lcmlcml3lqxu0g.R.flushNeeded();}}

    @Test
    public void testIsWhitespace() {__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceStart(getClass().getName(),27694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hky02olda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lcmlcml3lqxu0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsWhitespace",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27694,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hky02olda(){try{__CLR4_1_2lcmlcml3lqxu0g.R.inc(27694);
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27695);assertFalse(StringUtils.isWhitespace(null));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27696);assertTrue(StringUtils.isWhitespace(""));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27697);assertTrue(StringUtils.isWhitespace(" "));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27698);assertTrue(StringUtils.isWhitespace("\t \n \t"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27699);assertFalse(StringUtils.isWhitespace("\t aa\n \t"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27700);assertTrue(StringUtils.isWhitespace(" "));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27701);assertFalse(StringUtils.isWhitespace(" a "));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27702);assertFalse(StringUtils.isWhitespace("a  "));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27703);assertFalse(StringUtils.isWhitespace("  a"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27704);assertFalse(StringUtils.isWhitespace("aba"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27705);assertTrue(StringUtils.isWhitespace(StringUtilsTest.WHITESPACE));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27706);assertFalse(StringUtils.isWhitespace(StringUtilsTest.NON_WHITESPACE));
    }finally{__CLR4_1_2lcmlcml3lqxu0g.R.flushNeeded();}}

    @Test
    public void testIsAlphaspace() {__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceStart(getClass().getName(),27707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_291t76zldn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lcmlcml3lqxu0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsAlphaspace",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27707,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_291t76zldn(){try{__CLR4_1_2lcmlcml3lqxu0g.R.inc(27707);
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27708);assertFalse(StringUtils.isAlphaSpace(null));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27709);assertTrue(StringUtils.isAlphaSpace(""));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27710);assertTrue(StringUtils.isAlphaSpace(" "));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27711);assertTrue(StringUtils.isAlphaSpace("a"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27712);assertTrue(StringUtils.isAlphaSpace("A"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27713);assertTrue(StringUtils.isAlphaSpace("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27714);assertTrue(StringUtils.isAlphaSpace("ham kso"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27715);assertFalse(StringUtils.isAlphaSpace("1"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27716);assertFalse(StringUtils.isAlphaSpace("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27717);assertFalse(StringUtils.isAlphaSpace("_"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27718);assertFalse(StringUtils.isAlphaSpace("hkHKHik*khbkuh"));
    }finally{__CLR4_1_2lcmlcml3lqxu0g.R.flushNeeded();}}

    @Test
    public void testIsAlphanumericSpace() {__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceStart(getClass().getName(),27719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aigmkildz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lcmlcml3lqxu0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsAlphanumericSpace",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27719,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aigmkildz(){try{__CLR4_1_2lcmlcml3lqxu0g.R.inc(27719);
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27720);assertFalse(StringUtils.isAlphanumericSpace(null));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27721);assertTrue(StringUtils.isAlphanumericSpace(""));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27722);assertTrue(StringUtils.isAlphanumericSpace(" "));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27723);assertTrue(StringUtils.isAlphanumericSpace("a"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27724);assertTrue(StringUtils.isAlphanumericSpace("A"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27725);assertTrue(StringUtils.isAlphanumericSpace("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27726);assertTrue(StringUtils.isAlphanumericSpace("ham kso"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27727);assertTrue(StringUtils.isAlphanumericSpace("1"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27728);assertTrue(StringUtils.isAlphanumericSpace("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27729);assertFalse(StringUtils.isAlphanumericSpace("_"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27730);assertFalse(StringUtils.isAlphanumericSpace("hkHKHik*khbkuh"));
    }finally{__CLR4_1_2lcmlcml3lqxu0g.R.flushNeeded();}}

    @Test
    public void testIsAsciiPrintable_String() {__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceStart(getClass().getName(),27731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v0b3tnleb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lcmlcml3lqxu0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsAsciiPrintable_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27731,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v0b3tnleb(){try{__CLR4_1_2lcmlcml3lqxu0g.R.inc(27731);
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27732);assertFalse(StringUtils.isAsciiPrintable(null));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27733);assertTrue(StringUtils.isAsciiPrintable(""));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27734);assertTrue(StringUtils.isAsciiPrintable(" "));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27735);assertTrue(StringUtils.isAsciiPrintable("a"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27736);assertTrue(StringUtils.isAsciiPrintable("A"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27737);assertTrue(StringUtils.isAsciiPrintable("1"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27738);assertTrue(StringUtils.isAsciiPrintable("Ceki"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27739);assertTrue(StringUtils.isAsciiPrintable("!ab2c~"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27740);assertTrue(StringUtils.isAsciiPrintable("1000"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27741);assertTrue(StringUtils.isAsciiPrintable("10 00"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27742);assertFalse(StringUtils.isAsciiPrintable("10\t00"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27743);assertTrue(StringUtils.isAsciiPrintable("10.00"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27744);assertTrue(StringUtils.isAsciiPrintable("10,00"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27745);assertTrue(StringUtils.isAsciiPrintable("!ab-c~"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27746);assertTrue(StringUtils.isAsciiPrintable("hkHK=Hik6i?UGH_KJgU7.tUJgKJ*GI87GI,kug"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27747);assertTrue(StringUtils.isAsciiPrintable(" "));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27748);assertTrue(StringUtils.isAsciiPrintable("!"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27749);assertTrue(StringUtils.isAsciiPrintable("~"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27750);assertFalse(StringUtils.isAsciiPrintable(""));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27751);assertTrue(StringUtils.isAsciiPrintable("G?lc?"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27752);assertTrue(StringUtils.isAsciiPrintable("=?iso-8859-1?Q?G=FClc=FC?="));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27753);assertFalse(StringUtils.isAsciiPrintable("G\u00fclc\u00fc"));
    }finally{__CLR4_1_2lcmlcml3lqxu0g.R.flushNeeded();}}
  
    @Test
    public void testIsNumeric() {__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceStart(getClass().getName(),27754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lh53nsley();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lcmlcml3lqxu0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsNumeric",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27754,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lh53nsley(){try{__CLR4_1_2lcmlcml3lqxu0g.R.inc(27754);
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27755);assertFalse(StringUtils.isNumeric(null));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27756);assertFalse(StringUtils.isNumeric(""));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27757);assertFalse(StringUtils.isNumeric(" "));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27758);assertFalse(StringUtils.isNumeric("a"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27759);assertFalse(StringUtils.isNumeric("A"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27760);assertFalse(StringUtils.isNumeric("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27761);assertFalse(StringUtils.isNumeric("ham kso"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27762);assertTrue(StringUtils.isNumeric("1"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27763);assertTrue(StringUtils.isNumeric("1000"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27764);assertFalse(StringUtils.isNumeric("2.3"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27765);assertFalse(StringUtils.isNumeric("10 00"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27766);assertFalse(StringUtils.isNumeric("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27767);assertFalse(StringUtils.isNumeric("_"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27768);assertFalse(StringUtils.isNumeric("hkHKHik*khbkuh"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27769);assertFalse(StringUtils.isNumeric("+123"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27770);assertFalse(StringUtils.isNumeric("-123"));
    }finally{__CLR4_1_2lcmlcml3lqxu0g.R.flushNeeded();}}

    @Test
    public void testIsNumericSpace() {__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceStart(getClass().getName(),27771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29ky8kklff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lcmlcml3lqxu0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lcmlcml3lqxu0g.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsIsTest.testIsNumericSpace",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27771,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29ky8kklff(){try{__CLR4_1_2lcmlcml3lqxu0g.R.inc(27771);
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27772);assertFalse(StringUtils.isNumericSpace(null));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27773);assertTrue(StringUtils.isNumericSpace(""));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27774);assertTrue(StringUtils.isNumericSpace(" "));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27775);assertFalse(StringUtils.isNumericSpace("a"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27776);assertFalse(StringUtils.isNumericSpace("A"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27777);assertFalse(StringUtils.isNumericSpace("kgKgKgKgkgkGkjkjlJlOKLgHdGdHgl"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27778);assertFalse(StringUtils.isNumericSpace("ham kso"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27779);assertTrue(StringUtils.isNumericSpace("1"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27780);assertTrue(StringUtils.isNumericSpace("1000"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27781);assertFalse(StringUtils.isNumericSpace("2.3"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27782);assertTrue(StringUtils.isNumericSpace("10 00"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27783);assertFalse(StringUtils.isNumericSpace("hkHKHik6iUGHKJgU7tUJgKJGI87GIkug"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27784);assertFalse(StringUtils.isNumericSpace("_"));
        __CLR4_1_2lcmlcml3lqxu0g.R.inc(27785);assertFalse(StringUtils.isNumericSpace("hkHKHik*khbkuh"));
    }finally{__CLR4_1_2lcmlcml3lqxu0g.R.flushNeeded();}}

}
