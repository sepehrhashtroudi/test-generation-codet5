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

package org.apache.commons.lang3.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.StrMatcher}.
 *
 * @version $Id$
 */
public class StrMatcherTest  {static class __CLR4_1_2v1vv1vl3lqxuza{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,40363,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final char[] BUFFER1 = "0,1\t2 3\n\r\f\u0000'\"".toCharArray();

    private static final char[] BUFFER2 = "abcdef".toCharArray();


    //-----------------------------------------------------------------------
    @Test
    public void testCommaMatcher() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27lemvev1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testCommaMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40243,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27lemvev1v(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40243);
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40244);final StrMatcher matcher = StrMatcher.commaMatcher();
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40245);assertSame(matcher, StrMatcher.commaMatcher());
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40246);assertEquals(0, matcher.isMatch(BUFFER1, 0));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40247);assertEquals(1, matcher.isMatch(BUFFER1, 1));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40248);assertEquals(0, matcher.isMatch(BUFFER1, 2));
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTabMatcher() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26qa74av21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testTabMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40249,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26qa74av21(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40249);
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40250);final StrMatcher matcher = StrMatcher.tabMatcher();
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40251);assertSame(matcher, StrMatcher.tabMatcher());
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40252);assertEquals(0, matcher.isMatch(BUFFER1, 2));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40253);assertEquals(1, matcher.isMatch(BUFFER1, 3));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40254);assertEquals(0, matcher.isMatch(BUFFER1, 4));
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSpaceMatcher() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ifx9xhv27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testSpaceMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40255,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ifx9xhv27(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40255);
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40256);final StrMatcher matcher = StrMatcher.spaceMatcher();
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40257);assertSame(matcher, StrMatcher.spaceMatcher());
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40258);assertEquals(0, matcher.isMatch(BUFFER1, 4));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40259);assertEquals(1, matcher.isMatch(BUFFER1, 5));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40260);assertEquals(0, matcher.isMatch(BUFFER1, 6));
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSplitMatcher() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26bhe9dv2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testSplitMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40261,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26bhe9dv2d(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40261);
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40262);final StrMatcher matcher = StrMatcher.splitMatcher();
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40263);assertSame(matcher, StrMatcher.splitMatcher());
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40264);assertEquals(0, matcher.isMatch(BUFFER1, 2));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40265);assertEquals(1, matcher.isMatch(BUFFER1, 3));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40266);assertEquals(0, matcher.isMatch(BUFFER1, 4));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40267);assertEquals(1, matcher.isMatch(BUFFER1, 5));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40268);assertEquals(0, matcher.isMatch(BUFFER1, 6));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40269);assertEquals(1, matcher.isMatch(BUFFER1, 7));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40270);assertEquals(1, matcher.isMatch(BUFFER1, 8));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40271);assertEquals(1, matcher.isMatch(BUFFER1, 9));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40272);assertEquals(0, matcher.isMatch(BUFFER1, 10));
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTrimMatcher() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_273bmbfv2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testTrimMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40273,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_273bmbfv2p(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40273);
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40274);final StrMatcher matcher = StrMatcher.trimMatcher();
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40275);assertSame(matcher, StrMatcher.trimMatcher());
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40276);assertEquals(0, matcher.isMatch(BUFFER1, 2));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40277);assertEquals(1, matcher.isMatch(BUFFER1, 3));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40278);assertEquals(0, matcher.isMatch(BUFFER1, 4));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40279);assertEquals(1, matcher.isMatch(BUFFER1, 5));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40280);assertEquals(0, matcher.isMatch(BUFFER1, 6));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40281);assertEquals(1, matcher.isMatch(BUFFER1, 7));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40282);assertEquals(1, matcher.isMatch(BUFFER1, 8));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40283);assertEquals(1, matcher.isMatch(BUFFER1, 9));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40284);assertEquals(1, matcher.isMatch(BUFFER1, 10));
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSingleQuoteMatcher() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d9o2kpv31();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testSingleQuoteMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40285,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d9o2kpv31(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40285);
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40286);final StrMatcher matcher = StrMatcher.singleQuoteMatcher();
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40287);assertSame(matcher, StrMatcher.singleQuoteMatcher());
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40288);assertEquals(0, matcher.isMatch(BUFFER1, 10));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40289);assertEquals(1, matcher.isMatch(BUFFER1, 11));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40290);assertEquals(0, matcher.isMatch(BUFFER1, 12));
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDoubleQuoteMatcher() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uy70f4v37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testDoubleQuoteMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40291,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uy70f4v37(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40291);
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40292);final StrMatcher matcher = StrMatcher.doubleQuoteMatcher();
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40293);assertSame(matcher, StrMatcher.doubleQuoteMatcher());
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40294);assertEquals(0, matcher.isMatch(BUFFER1, 11));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40295);assertEquals(1, matcher.isMatch(BUFFER1, 12));
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testQuoteMatcher() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x5oultv3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testQuoteMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40296,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x5oultv3c(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40296);
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40297);final StrMatcher matcher = StrMatcher.quoteMatcher();
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40298);assertSame(matcher, StrMatcher.quoteMatcher());
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40299);assertEquals(0, matcher.isMatch(BUFFER1, 10));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40300);assertEquals(1, matcher.isMatch(BUFFER1, 11));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40301);assertEquals(1, matcher.isMatch(BUFFER1, 12));
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNoneMatcher() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tvnub3v3i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testNoneMatcher",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40302,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tvnub3v3i(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40302);
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40303);final StrMatcher matcher = StrMatcher.noneMatcher();
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40304);assertSame(matcher, StrMatcher.noneMatcher());
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40305);assertEquals(0, matcher.isMatch(BUFFER1, 0));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40306);assertEquals(0, matcher.isMatch(BUFFER1, 1));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40307);assertEquals(0, matcher.isMatch(BUFFER1, 2));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40308);assertEquals(0, matcher.isMatch(BUFFER1, 3));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40309);assertEquals(0, matcher.isMatch(BUFFER1, 4));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40310);assertEquals(0, matcher.isMatch(BUFFER1, 5));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40311);assertEquals(0, matcher.isMatch(BUFFER1, 6));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40312);assertEquals(0, matcher.isMatch(BUFFER1, 7));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40313);assertEquals(0, matcher.isMatch(BUFFER1, 8));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40314);assertEquals(0, matcher.isMatch(BUFFER1, 9));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40315);assertEquals(0, matcher.isMatch(BUFFER1, 10));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40316);assertEquals(0, matcher.isMatch(BUFFER1, 11));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40317);assertEquals(0, matcher.isMatch(BUFFER1, 12));
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCharMatcher_char() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22vp8z2v3y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testCharMatcher_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40318,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22vp8z2v3y(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40318);
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40319);final StrMatcher matcher = StrMatcher.charMatcher('c');
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40320);assertEquals(0, matcher.isMatch(BUFFER2, 0));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40321);assertEquals(0, matcher.isMatch(BUFFER2, 1));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40322);assertEquals(1, matcher.isMatch(BUFFER2, 2));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40323);assertEquals(0, matcher.isMatch(BUFFER2, 3));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40324);assertEquals(0, matcher.isMatch(BUFFER2, 4));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40325);assertEquals(0, matcher.isMatch(BUFFER2, 5));
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCharSetMatcher_String() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_277k6prv46();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testCharSetMatcher_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40326,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_277k6prv46(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40326);
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40327);final StrMatcher matcher = StrMatcher.charSetMatcher("ace");
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40328);assertEquals(1, matcher.isMatch(BUFFER2, 0));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40329);assertEquals(0, matcher.isMatch(BUFFER2, 1));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40330);assertEquals(1, matcher.isMatch(BUFFER2, 2));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40331);assertEquals(0, matcher.isMatch(BUFFER2, 3));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40332);assertEquals(1, matcher.isMatch(BUFFER2, 4));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40333);assertEquals(0, matcher.isMatch(BUFFER2, 5));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40334);assertSame(StrMatcher.noneMatcher(), StrMatcher.charSetMatcher(""));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40335);assertSame(StrMatcher.noneMatcher(), StrMatcher.charSetMatcher((String) null));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40336);assertTrue(StrMatcher.charSetMatcher("a") instanceof StrMatcher.CharMatcher);
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCharSetMatcher_charArray() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26jcuilv4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testCharSetMatcher_charArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40337,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26jcuilv4h(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40337);
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40338);final StrMatcher matcher = StrMatcher.charSetMatcher("ace".toCharArray());
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40339);assertEquals(1, matcher.isMatch(BUFFER2, 0));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40340);assertEquals(0, matcher.isMatch(BUFFER2, 1));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40341);assertEquals(1, matcher.isMatch(BUFFER2, 2));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40342);assertEquals(0, matcher.isMatch(BUFFER2, 3));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40343);assertEquals(1, matcher.isMatch(BUFFER2, 4));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40344);assertEquals(0, matcher.isMatch(BUFFER2, 5));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40345);assertSame(StrMatcher.noneMatcher(), StrMatcher.charSetMatcher(new char[0]));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40346);assertSame(StrMatcher.noneMatcher(), StrMatcher.charSetMatcher((char[]) null));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40347);assertTrue(StrMatcher.charSetMatcher("a".toCharArray()) instanceof StrMatcher.CharMatcher);
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testStringMatcher_String() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nkunmwv4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testStringMatcher_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40348,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nkunmwv4s(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40348);
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40349);final StrMatcher matcher = StrMatcher.stringMatcher("bc");
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40350);assertEquals(0, matcher.isMatch(BUFFER2, 0));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40351);assertEquals(2, matcher.isMatch(BUFFER2, 1));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40352);assertEquals(0, matcher.isMatch(BUFFER2, 2));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40353);assertEquals(0, matcher.isMatch(BUFFER2, 3));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40354);assertEquals(0, matcher.isMatch(BUFFER2, 4));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40355);assertEquals(0, matcher.isMatch(BUFFER2, 5));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40356);assertSame(StrMatcher.noneMatcher(), StrMatcher.stringMatcher(""));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40357);assertSame(StrMatcher.noneMatcher(), StrMatcher.stringMatcher((String) null));
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testMatcherIndices() {__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceStart(getClass().getName(),40358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28zzfwyv52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v1vv1vl3lqxuza.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v1vv1vl3lqxuza.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrMatcherTest.testMatcherIndices",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40358,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28zzfwyv52(){try{__CLR4_1_2v1vv1vl3lqxuza.R.inc(40358);
        // remember that the API contract is tight for the isMatch() method
        // all the onus is on the caller, so invalid inputs are not
        // the concern of StrMatcher, and are not bugs
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40359);final StrMatcher matcher = StrMatcher.stringMatcher("bc");
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40360);assertEquals(2, matcher.isMatch(BUFFER2, 1, 1, BUFFER2.length));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40361);assertEquals(2, matcher.isMatch(BUFFER2, 1, 0, 3));
        __CLR4_1_2v1vv1vl3lqxuza.R.inc(40362);assertEquals(0, matcher.isMatch(BUFFER2, 1, 0, 2));
    }finally{__CLR4_1_2v1vv1vl3lqxuza.R.flushNeeded();}}

}
