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

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.lang3.text.StrBuilder;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - StartsWith/EndsWith methods
 *
 * @version $Id$
 */
public class StringUtilsStartsEndsWithTest {static class __CLR4_1_2lfulful3lqxu0u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,27873,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String foo    = "foo";
    private static final String bar    = "bar";
    private static final String foobar = "foobar";
    private static final String FOO    = "FOO";
    private static final String BAR    = "BAR";
    private static final String FOOBAR = "FOOBAR";

    //-----------------------------------------------------------------------

    /**
     * Test StringUtils.startsWith()
     */
    @Test
    public void testStartsWith() {__CLR4_1_2lfulful3lqxu0u.R.globalSliceStart(getClass().getName(),27786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_210ksuolfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lfulful3lqxu0u.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lfulful3lqxu0u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsStartsEndsWithTest.testStartsWith",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27786,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_210ksuolfu(){try{__CLR4_1_2lfulful3lqxu0u.R.inc(27786);
        __CLR4_1_2lfulful3lqxu0u.R.inc(27787);assertTrue("startsWith(null, null)", StringUtils.startsWith(null, (String)null));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27788);assertFalse("startsWith(FOOBAR, null)", StringUtils.startsWith(FOOBAR, (String)null));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27789);assertFalse("startsWith(null, FOO)",    StringUtils.startsWith(null, FOO));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27790);assertTrue("startsWith(FOOBAR, \"\")",  StringUtils.startsWith(FOOBAR, ""));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27791);assertTrue("startsWith(foobar, foo)",  StringUtils.startsWith(foobar, foo));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27792);assertTrue("startsWith(FOOBAR, FOO)",  StringUtils.startsWith(FOOBAR, FOO));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27793);assertFalse("startsWith(foobar, FOO)", StringUtils.startsWith(foobar, FOO));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27794);assertFalse("startsWith(FOOBAR, foo)", StringUtils.startsWith(FOOBAR, foo));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27795);assertFalse("startsWith(foo, foobar)", StringUtils.startsWith(foo, foobar));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27796);assertFalse("startsWith(foo, foobar)", StringUtils.startsWith(bar, foobar));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27797);assertFalse("startsWith(foobar, bar)", StringUtils.startsWith(foobar, bar));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27798);assertFalse("startsWith(FOOBAR, BAR)", StringUtils.startsWith(FOOBAR, BAR));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27799);assertFalse("startsWith(foobar, BAR)", StringUtils.startsWith(foobar, BAR));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27800);assertFalse("startsWith(FOOBAR, bar)", StringUtils.startsWith(FOOBAR, bar));
    }finally{__CLR4_1_2lfulful3lqxu0u.R.flushNeeded();}}

    /**
     * Test StringUtils.testStartsWithIgnoreCase()
     */
    @Test
    public void testStartsWithIgnoreCase() {__CLR4_1_2lfulful3lqxu0u.R.globalSliceStart(getClass().getName(),27801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w0t2helg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lfulful3lqxu0u.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lfulful3lqxu0u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsStartsEndsWithTest.testStartsWithIgnoreCase",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27801,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w0t2helg9(){try{__CLR4_1_2lfulful3lqxu0u.R.inc(27801);
        __CLR4_1_2lfulful3lqxu0u.R.inc(27802);assertTrue("startsWithIgnoreCase(null, null)",    StringUtils.startsWithIgnoreCase(null, (String)null));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27803);assertFalse("startsWithIgnoreCase(FOOBAR, null)", StringUtils.startsWithIgnoreCase(FOOBAR, (String)null));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27804);assertFalse("startsWithIgnoreCase(null, FOO)",    StringUtils.startsWithIgnoreCase(null, FOO));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27805);assertTrue("startsWithIgnoreCase(FOOBAR, \"\")",  StringUtils.startsWithIgnoreCase(FOOBAR, ""));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27806);assertTrue("startsWithIgnoreCase(foobar, foo)", StringUtils.startsWithIgnoreCase(foobar, foo));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27807);assertTrue("startsWithIgnoreCase(FOOBAR, FOO)", StringUtils.startsWithIgnoreCase(FOOBAR, FOO));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27808);assertTrue("startsWithIgnoreCase(foobar, FOO)", StringUtils.startsWithIgnoreCase(foobar, FOO));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27809);assertTrue("startsWithIgnoreCase(FOOBAR, foo)", StringUtils.startsWithIgnoreCase(FOOBAR, foo));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27810);assertFalse("startsWithIgnoreCase(foo, foobar)", StringUtils.startsWithIgnoreCase(foo, foobar));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27811);assertFalse("startsWithIgnoreCase(foo, foobar)", StringUtils.startsWithIgnoreCase(bar, foobar));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27812);assertFalse("startsWithIgnoreCase(foobar, bar)", StringUtils.startsWithIgnoreCase(foobar, bar));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27813);assertFalse("startsWithIgnoreCase(FOOBAR, BAR)", StringUtils.startsWithIgnoreCase(FOOBAR, BAR));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27814);assertFalse("startsWithIgnoreCase(foobar, BAR)", StringUtils.startsWithIgnoreCase(foobar, BAR));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27815);assertFalse("startsWithIgnoreCase(FOOBAR, bar)", StringUtils.startsWithIgnoreCase(FOOBAR, bar));
    }finally{__CLR4_1_2lfulful3lqxu0u.R.flushNeeded();}}

    @Test
    public void testStartsWithAny() {__CLR4_1_2lfulful3lqxu0u.R.globalSliceStart(getClass().getName(),27816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2h8v67elgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lfulful3lqxu0u.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lfulful3lqxu0u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsStartsEndsWithTest.testStartsWithAny",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27816,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2h8v67elgo(){try{__CLR4_1_2lfulful3lqxu0u.R.inc(27816);
        __CLR4_1_2lfulful3lqxu0u.R.inc(27817);assertFalse(StringUtils.startsWithAny(null, (String[])null));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27818);assertFalse(StringUtils.startsWithAny(null, "abc"));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27819);assertFalse(StringUtils.startsWithAny("abcxyz", (String[])null));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27820);assertFalse(StringUtils.startsWithAny("abcxyz"));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27821);assertTrue(StringUtils.startsWithAny("abcxyz", "abc"));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27822);assertTrue(StringUtils.startsWithAny("abcxyz", null, "xyz", "abc"));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27823);assertFalse(StringUtils.startsWithAny("abcxyz", null, "xyz", "abcd"));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27824);assertTrue("StringUtils.startsWithAny(abcxyz, StringBuilder(xyz), StringBuffer(abc))", StringUtils.startsWithAny("abcxyz", new StringBuilder("xyz"), new StringBuffer("abc")));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27825);assertTrue("StringUtils.startsWithAny( StrBuilder(abcxyz), StringBuilder(xyz), StringBuffer(abc))", StringUtils.startsWithAny( new StrBuilder("abcxyz"), new StringBuilder("xyz"), new StringBuffer("abc")));
    }finally{__CLR4_1_2lfulful3lqxu0u.R.flushNeeded();}}
 

    /**
     * Test StringUtils.endsWith()
     */
    @Test
    public void testEndsWith() {__CLR4_1_2lfulful3lqxu0u.R.globalSliceStart(getClass().getName(),27826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yf5q6vlgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lfulful3lqxu0u.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lfulful3lqxu0u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsStartsEndsWithTest.testEndsWith",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27826,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yf5q6vlgy(){try{__CLR4_1_2lfulful3lqxu0u.R.inc(27826);
        __CLR4_1_2lfulful3lqxu0u.R.inc(27827);assertTrue("endsWith(null, null)",    StringUtils.endsWith(null, (String)null));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27828);assertFalse("endsWith(FOOBAR, null)", StringUtils.endsWith(FOOBAR, (String)null));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27829);assertFalse("endsWith(null, FOO)",    StringUtils.endsWith(null, FOO));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27830);assertTrue("endsWith(FOOBAR, \"\")",  StringUtils.endsWith(FOOBAR, ""));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27831);assertFalse("endsWith(foobar, foo)", StringUtils.endsWith(foobar, foo));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27832);assertFalse("endsWith(FOOBAR, FOO)", StringUtils.endsWith(FOOBAR, FOO));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27833);assertFalse("endsWith(foobar, FOO)", StringUtils.endsWith(foobar, FOO));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27834);assertFalse("endsWith(FOOBAR, foo)", StringUtils.endsWith(FOOBAR, foo));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27835);assertFalse("endsWith(foo, foobar)", StringUtils.endsWith(foo, foobar));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27836);assertFalse("endsWith(foo, foobar)", StringUtils.endsWith(bar, foobar));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27837);assertTrue("endsWith(foobar, bar)",  StringUtils.endsWith(foobar, bar));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27838);assertTrue("endsWith(FOOBAR, BAR)",  StringUtils.endsWith(FOOBAR, BAR));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27839);assertFalse("endsWith(foobar, BAR)", StringUtils.endsWith(foobar, BAR));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27840);assertFalse("endsWith(FOOBAR, bar)", StringUtils.endsWith(FOOBAR, bar));

        // "alpha,beta,gamma,delta".endsWith("delta")
        __CLR4_1_2lfulful3lqxu0u.R.inc(27841);assertTrue("endsWith(\u03b1\u03b2\u03b3\u03b4, \u03b4)",
                StringUtils.endsWith("\u03b1\u03b2\u03b3\u03b4", "\u03b4"));
        // "alpha,beta,gamma,delta".endsWith("gamma,DELTA")
        __CLR4_1_2lfulful3lqxu0u.R.inc(27842);assertFalse("endsWith(\u03b1\u03b2\u03b3\u03b4, \u03b3\u0394)",
                StringUtils.endsWith("\u03b1\u03b2\u03b3\u03b4", "\u03b3\u0394"));
    }finally{__CLR4_1_2lfulful3lqxu0u.R.flushNeeded();}}

    /**
     * Test StringUtils.endsWithIgnoreCase()
     */
    @Test
    public void testEndsWithIgnoreCase() {__CLR4_1_2lfulful3lqxu0u.R.globalSliceStart(getClass().getName(),27843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vfojdzlhf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lfulful3lqxu0u.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lfulful3lqxu0u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsStartsEndsWithTest.testEndsWithIgnoreCase",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27843,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vfojdzlhf(){try{__CLR4_1_2lfulful3lqxu0u.R.inc(27843);
        __CLR4_1_2lfulful3lqxu0u.R.inc(27844);assertTrue("endsWithIgnoreCase(null, null)",    StringUtils.endsWithIgnoreCase(null, (String)null));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27845);assertFalse("endsWithIgnoreCase(FOOBAR, null)", StringUtils.endsWithIgnoreCase(FOOBAR, (String)null));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27846);assertFalse("endsWithIgnoreCase(null, FOO)",    StringUtils.endsWithIgnoreCase(null, FOO));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27847);assertTrue("endsWithIgnoreCase(FOOBAR, \"\")",  StringUtils.endsWithIgnoreCase(FOOBAR, ""));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27848);assertFalse("endsWithIgnoreCase(foobar, foo)", StringUtils.endsWithIgnoreCase(foobar, foo));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27849);assertFalse("endsWithIgnoreCase(FOOBAR, FOO)", StringUtils.endsWithIgnoreCase(FOOBAR, FOO));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27850);assertFalse("endsWithIgnoreCase(foobar, FOO)", StringUtils.endsWithIgnoreCase(foobar, FOO));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27851);assertFalse("endsWithIgnoreCase(FOOBAR, foo)", StringUtils.endsWithIgnoreCase(FOOBAR, foo));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27852);assertFalse("endsWithIgnoreCase(foo, foobar)", StringUtils.endsWithIgnoreCase(foo, foobar));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27853);assertFalse("endsWithIgnoreCase(foo, foobar)", StringUtils.endsWithIgnoreCase(bar, foobar));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27854);assertTrue("endsWithIgnoreCase(foobar, bar)", StringUtils.endsWithIgnoreCase(foobar, bar));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27855);assertTrue("endsWithIgnoreCase(FOOBAR, BAR)", StringUtils.endsWithIgnoreCase(FOOBAR, BAR));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27856);assertTrue("endsWithIgnoreCase(foobar, BAR)", StringUtils.endsWithIgnoreCase(foobar, BAR));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27857);assertTrue("endsWithIgnoreCase(FOOBAR, bar)", StringUtils.endsWithIgnoreCase(FOOBAR, bar));

        // javadoc
        __CLR4_1_2lfulful3lqxu0u.R.inc(27858);assertTrue(StringUtils.endsWithIgnoreCase("abcdef", "def"));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27859);assertTrue(StringUtils.endsWithIgnoreCase("ABCDEF", "def"));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27860);assertFalse(StringUtils.endsWithIgnoreCase("ABCDEF", "cde"));

        // "alpha,beta,gamma,delta".endsWith("DELTA")
        __CLR4_1_2lfulful3lqxu0u.R.inc(27861);assertTrue("endsWith(\u03b1\u03b2\u03b3\u03b4, \u0394)",
                StringUtils.endsWithIgnoreCase("\u03b1\u03b2\u03b3\u03b4", "\u0394"));
        // "alpha,beta,gamma,delta".endsWith("GAMMA")
        __CLR4_1_2lfulful3lqxu0u.R.inc(27862);assertFalse("endsWith(\u03b1\u03b2\u03b3\u03b4, \u0393)",
                StringUtils.endsWithIgnoreCase("\u03b1\u03b2\u03b3\u03b4", "\u0393"));
    }finally{__CLR4_1_2lfulful3lqxu0u.R.flushNeeded();}}

    @Test
    public void testEndsWithAny() {__CLR4_1_2lfulful3lqxu0u.R.globalSliceStart(getClass().getName(),27863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rdcvlplhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lfulful3lqxu0u.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lfulful3lqxu0u.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsStartsEndsWithTest.testEndsWithAny",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27863,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rdcvlplhz(){try{__CLR4_1_2lfulful3lqxu0u.R.inc(27863);
        __CLR4_1_2lfulful3lqxu0u.R.inc(27864);assertFalse("StringUtils.endsWithAny(null, null)", StringUtils.endsWithAny(null, (String)null));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27865);assertFalse("StringUtils.endsWithAny(null, new String[] {abc})", StringUtils.endsWithAny(null, new String[] {"abc"}));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27866);assertFalse("StringUtils.endsWithAny(abcxyz, null)", StringUtils.endsWithAny("abcxyz", (String)null));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27867);assertTrue("StringUtils.endsWithAny(abcxyz, new String[] {\"\"})", StringUtils.endsWithAny("abcxyz", new String[] {""}));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27868);assertTrue("StringUtils.endsWithAny(abcxyz, new String[] {xyz})", StringUtils.endsWithAny("abcxyz", new String[] {"xyz"}));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27869);assertTrue("StringUtils.endsWithAny(abcxyz, new String[] {null, xyz, abc})", StringUtils.endsWithAny("abcxyz", new String[] {null, "xyz", "abc"}));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27870);assertFalse("StringUtils.endsWithAny(defg, new String[] {null, xyz, abc})", StringUtils.endsWithAny("defg", new String[] {null, "xyz", "abc"}));

        __CLR4_1_2lfulful3lqxu0u.R.inc(27871);assertTrue("StringUtils.endsWithAny(abcxyz, StringBuilder(abc), StringBuffer(xyz))", StringUtils.endsWithAny("abcxyz", new StringBuilder("abc"), new StringBuffer("xyz")));
        __CLR4_1_2lfulful3lqxu0u.R.inc(27872);assertTrue("StringUtils.endsWithAny( StrBuilder(abcxyz), StringBuilder(abc), StringBuffer(xyz))", StringUtils.endsWithAny( new StrBuilder("abcxyz"), new StringBuilder("abc"), new StringBuffer("xyz")));
    }finally{__CLR4_1_2lfulful3lqxu0u.R.flushNeeded();}}


}
