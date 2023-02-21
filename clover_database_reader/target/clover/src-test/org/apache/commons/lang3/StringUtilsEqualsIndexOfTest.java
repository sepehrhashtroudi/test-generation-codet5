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
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Locale;

import org.hamcrest.core.IsNot;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods
 *
 * @version $Id$
 */
public class StringUtilsEqualsIndexOfTest  {static class __CLR4_1_2kugkugl3lqxu04{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,27670,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String BAR = "bar";
    /**
     * Supplementary character U+20000
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharU20000 = "\ud840\udc00";
    /**
     * Supplementary character U+20001
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharU20001 = "\ud840\udc01";
    /**
     * Incomplete supplementary character U+20000, high surrogate only.
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharUSuppCharHigh = "\udc00";

    /**
     * Incomplete supplementary character U+20000, low surrogate only.
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    private static final String CharUSuppCharLow = "\ud840";

    private static final String FOO = "foo";

    private static final String FOOBAR = "foobar";

    private static final String[] FOOBAR_SUB_ARRAY = new String[] {"ob", "ba"};

    @Test
    public void testContains_Char() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v8fyfpkug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_Char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27016,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v8fyfpkug(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27016);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27017);assertFalse(StringUtils.contains(null, ' '));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27018);assertFalse(StringUtils.contains("", ' '));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27019);assertFalse(StringUtils.contains("", null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27020);assertFalse(StringUtils.contains(null, null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27021);assertTrue(StringUtils.contains("abc", 'a'));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27022);assertTrue(StringUtils.contains("abc", 'b'));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27023);assertTrue(StringUtils.contains("abc", 'c'));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27024);assertFalse(StringUtils.contains("abc", 'z'));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testContains_String() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w2z9vqkup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27025,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w2z9vqkup(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27025);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27026);assertFalse(StringUtils.contains(null, null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27027);assertFalse(StringUtils.contains(null, ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27028);assertFalse(StringUtils.contains(null, "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27029);assertFalse(StringUtils.contains("", null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27030);assertTrue(StringUtils.contains("", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27031);assertFalse(StringUtils.contains("", "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27032);assertTrue(StringUtils.contains("abc", "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27033);assertTrue(StringUtils.contains("abc", "b"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27034);assertTrue(StringUtils.contains("abc", "c"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27035);assertTrue(StringUtils.contains("abc", "abc"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27036);assertFalse(StringUtils.contains("abc", "z"));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContains_StringWithBadSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cmtephkv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_StringWithBadSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27037,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cmtephkv1(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27037);
        // Test edge case: 1/2 of a (broken) supplementary char
        __CLR4_1_2kugkugl3lqxu04.R.inc(27038);assertFalse(StringUtils.contains(CharUSuppCharHigh, CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27039);assertFalse(StringUtils.contains(CharUSuppCharLow, CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27040);assertFalse(StringUtils.contains(CharU20001, CharUSuppCharHigh));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27041);assertEquals(0, CharU20001.indexOf(CharUSuppCharLow));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27042);assertTrue(StringUtils.contains(CharU20001, CharUSuppCharLow));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27043);assertTrue(StringUtils.contains(CharU20001 + CharUSuppCharLow + "a", "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27044);assertTrue(StringUtils.contains(CharU20001 + CharUSuppCharHigh + "a", "a"));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContains_StringWithSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28k93s6kv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContains_StringWithSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27045,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28k93s6kv9(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27045);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27046);assertTrue(StringUtils.contains(CharU20000 + CharU20001, CharU20000));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27047);assertTrue(StringUtils.contains(CharU20000 + CharU20001, CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27048);assertTrue(StringUtils.contains(CharU20000, CharU20000));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27049);assertFalse(StringUtils.contains(CharU20000, CharU20001));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testContainsAny_StringCharArray() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ykdcyzkve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27050,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ykdcyzkve(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27050);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27051);assertFalse(StringUtils.containsAny(null, (char[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27052);assertFalse(StringUtils.containsAny(null, new char[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27053);assertFalse(StringUtils.containsAny(null, new char[] { 'a', 'b' }));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27054);assertFalse(StringUtils.containsAny("", (char[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27055);assertFalse(StringUtils.containsAny("", new char[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27056);assertFalse(StringUtils.containsAny("", new char[] { 'a', 'b' }));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27057);assertFalse(StringUtils.containsAny("zzabyycdxx", (char[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27058);assertFalse(StringUtils.containsAny("zzabyycdxx", new char[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27059);assertTrue(StringUtils.containsAny("zzabyycdxx", new char[] { 'z', 'a' }));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27060);assertTrue(StringUtils.containsAny("zzabyycdxx", new char[] { 'b', 'y' }));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27061);assertFalse(StringUtils.containsAny("ab", new char[] { 'z' }));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsAny_StringCharArrayWithBadSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2z2h5tmkvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArrayWithBadSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27062,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2z2h5tmkvq(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27062);
        // Test edge case: 1/2 of a (broken) supplementary char
        __CLR4_1_2kugkugl3lqxu04.R.inc(27063);assertFalse(StringUtils.containsAny(CharUSuppCharHigh, CharU20001.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27064);assertFalse(StringUtils.containsAny("abc" + CharUSuppCharHigh + "xyz", CharU20001.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27065);assertEquals(-1, CharUSuppCharLow.indexOf(CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27066);assertFalse(StringUtils.containsAny(CharUSuppCharLow, CharU20001.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27067);assertFalse(StringUtils.containsAny(CharU20001, CharUSuppCharHigh.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27068);assertEquals(0, CharU20001.indexOf(CharUSuppCharLow));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27069);assertTrue(StringUtils.containsAny(CharU20001, CharUSuppCharLow.toCharArray()));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsAny_StringCharArrayWithSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27cpffbkvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringCharArrayWithSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27070,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27cpffbkvy(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27070);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27071);assertTrue(StringUtils.containsAny(CharU20000 + CharU20001, CharU20000.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27072);assertTrue(StringUtils.containsAny("a" + CharU20000 + CharU20001, "a".toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27073);assertTrue(StringUtils.containsAny(CharU20000 + "a" + CharU20001, "a".toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27074);assertTrue(StringUtils.containsAny(CharU20000 + CharU20001 + "a", "a".toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27075);assertTrue(StringUtils.containsAny(CharU20000 + CharU20001, CharU20001.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27076);assertTrue(StringUtils.containsAny(CharU20000, CharU20000.toCharArray()));
        // Sanity check:
        __CLR4_1_2kugkugl3lqxu04.R.inc(27077);assertEquals(-1, CharU20000.indexOf(CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27078);assertEquals(0, CharU20000.indexOf(CharU20001.charAt(0)));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27079);assertEquals(-1, CharU20000.indexOf(CharU20001.charAt(1)));
        // Test:
        __CLR4_1_2kugkugl3lqxu04.R.inc(27080);assertFalse(StringUtils.containsAny(CharU20000, CharU20001.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27081);assertFalse(StringUtils.containsAny(CharU20001, CharU20000.toCharArray()));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testContainsAny_StringString() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i4ipo3kwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27082,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i4ipo3kwa(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27082);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27083);assertFalse(StringUtils.containsAny(null, (String) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27084);assertFalse(StringUtils.containsAny(null, ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27085);assertFalse(StringUtils.containsAny(null, "ab"));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27086);assertFalse(StringUtils.containsAny("", (String) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27087);assertFalse(StringUtils.containsAny("", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27088);assertFalse(StringUtils.containsAny("", "ab"));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27089);assertFalse(StringUtils.containsAny("zzabyycdxx", (String) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27090);assertFalse(StringUtils.containsAny("zzabyycdxx", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27091);assertTrue(StringUtils.containsAny("zzabyycdxx", "za"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27092);assertTrue(StringUtils.containsAny("zzabyycdxx", "by"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27093);assertFalse(StringUtils.containsAny("ab", "z"));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsAny_StringWithBadSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kz2pz5kwm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringWithBadSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27094,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kz2pz5kwm(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27094);
        // Test edge case: 1/2 of a (broken) supplementary char
        __CLR4_1_2kugkugl3lqxu04.R.inc(27095);assertFalse(StringUtils.containsAny(CharUSuppCharHigh, CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27096);assertEquals(-1, CharUSuppCharLow.indexOf(CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27097);assertFalse(StringUtils.containsAny(CharUSuppCharLow, CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27098);assertFalse(StringUtils.containsAny(CharU20001, CharUSuppCharHigh));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27099);assertEquals(0, CharU20001.indexOf(CharUSuppCharLow));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27100);assertTrue(StringUtils.containsAny(CharU20001, CharUSuppCharLow));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsAny_StringWithSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_251cd4gkwt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsAny_StringWithSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27101,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_251cd4gkwt(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27101);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27102);assertTrue(StringUtils.containsAny(CharU20000 + CharU20001, CharU20000));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27103);assertTrue(StringUtils.containsAny(CharU20000 + CharU20001, CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27104);assertTrue(StringUtils.containsAny(CharU20000, CharU20000));
        // Sanity check:
        __CLR4_1_2kugkugl3lqxu04.R.inc(27105);assertEquals(-1, CharU20000.indexOf(CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27106);assertEquals(0, CharU20000.indexOf(CharU20001.charAt(0)));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27107);assertEquals(-1, CharU20000.indexOf(CharU20001.charAt(1)));
        // Test:
        __CLR4_1_2kugkugl3lqxu04.R.inc(27108);assertFalse(StringUtils.containsAny(CharU20000, CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27109);assertFalse(StringUtils.containsAny(CharU20001, CharU20000));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testContainsIgnoreCase_LocaleIndependence() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o1z6p5kx2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_LocaleIndependence",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27110,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o1z6p5kx2(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27110);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27111);final Locale orig = Locale.getDefault();

        __CLR4_1_2kugkugl3lqxu04.R.inc(27112);final Locale[] locales = { Locale.ENGLISH, new Locale("tr"), Locale.getDefault() };

        __CLR4_1_2kugkugl3lqxu04.R.inc(27113);final String[][] tdata = {
            { "i", "I" },
            { "I", "i" },
            { "\u03c2", "\u03c3" },
            { "\u03a3", "\u03c2" },
            { "\u03a3", "\u03c3" },
        };

        __CLR4_1_2kugkugl3lqxu04.R.inc(27114);final String[][] fdata = {
            { "\u00df", "SS" },
        };

        __CLR4_1_2kugkugl3lqxu04.R.inc(27115);try {
            __CLR4_1_2kugkugl3lqxu04.R.inc(27116);for (final Locale locale : locales) {{
                __CLR4_1_2kugkugl3lqxu04.R.inc(27117);Locale.setDefault(locale);
                __CLR4_1_2kugkugl3lqxu04.R.inc(27118);for (int j = 0; (((j < tdata.length)&&(__CLR4_1_2kugkugl3lqxu04.R.iget(27119)!=0|true))||(__CLR4_1_2kugkugl3lqxu04.R.iget(27120)==0&false)); j++) {{
                    __CLR4_1_2kugkugl3lqxu04.R.inc(27121);assertTrue(Locale.getDefault() + ": " + j + " " + tdata[j][0] + " " + tdata[j][1], StringUtils
                            .containsIgnoreCase(tdata[j][0], tdata[j][1]));
                }
                }__CLR4_1_2kugkugl3lqxu04.R.inc(27122);for (int j = 0; (((j < fdata.length)&&(__CLR4_1_2kugkugl3lqxu04.R.iget(27123)!=0|true))||(__CLR4_1_2kugkugl3lqxu04.R.iget(27124)==0&false)); j++) {{
                    __CLR4_1_2kugkugl3lqxu04.R.inc(27125);assertFalse(Locale.getDefault() + ": " + j + " " + fdata[j][0] + " " + fdata[j][1], StringUtils
                            .containsIgnoreCase(fdata[j][0], fdata[j][1]));
                }
            }}
        }} finally {
            __CLR4_1_2kugkugl3lqxu04.R.inc(27126);Locale.setDefault(orig);
        }
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testContainsIgnoreCase_StringString() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r7d42zkxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsIgnoreCase_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27127,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r7d42zkxj(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27127);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27128);assertFalse(StringUtils.containsIgnoreCase(null, null));

        // Null tests
        __CLR4_1_2kugkugl3lqxu04.R.inc(27129);assertFalse(StringUtils.containsIgnoreCase(null, ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27130);assertFalse(StringUtils.containsIgnoreCase(null, "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27131);assertFalse(StringUtils.containsIgnoreCase(null, "abc"));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27132);assertFalse(StringUtils.containsIgnoreCase("", null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27133);assertFalse(StringUtils.containsIgnoreCase("a", null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27134);assertFalse(StringUtils.containsIgnoreCase("abc", null));

        // Match len = 0
        __CLR4_1_2kugkugl3lqxu04.R.inc(27135);assertTrue(StringUtils.containsIgnoreCase("", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27136);assertTrue(StringUtils.containsIgnoreCase("a", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27137);assertTrue(StringUtils.containsIgnoreCase("abc", ""));

        // Match len = 1
        __CLR4_1_2kugkugl3lqxu04.R.inc(27138);assertFalse(StringUtils.containsIgnoreCase("", "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27139);assertTrue(StringUtils.containsIgnoreCase("a", "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27140);assertTrue(StringUtils.containsIgnoreCase("abc", "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27141);assertFalse(StringUtils.containsIgnoreCase("", "A"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27142);assertTrue(StringUtils.containsIgnoreCase("a", "A"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27143);assertTrue(StringUtils.containsIgnoreCase("abc", "A"));

        // Match len > 1
        __CLR4_1_2kugkugl3lqxu04.R.inc(27144);assertFalse(StringUtils.containsIgnoreCase("", "abc"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27145);assertFalse(StringUtils.containsIgnoreCase("a", "abc"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27146);assertTrue(StringUtils.containsIgnoreCase("xabcz", "abc"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27147);assertFalse(StringUtils.containsIgnoreCase("", "ABC"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27148);assertFalse(StringUtils.containsIgnoreCase("a", "ABC"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27149);assertTrue(StringUtils.containsIgnoreCase("xabcz", "ABC"));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testContainsNone_CharArray() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yv1jboky6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27150,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yv1jboky6(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27150);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27151);final String str1 = "a";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27152);final String str2 = "b";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27153);final String str3 = "ab.";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27154);final char[] chars1= {'b'};
        __CLR4_1_2kugkugl3lqxu04.R.inc(27155);final char[] chars2= {'.'};
        __CLR4_1_2kugkugl3lqxu04.R.inc(27156);final char[] chars3= {'c', 'd'};
        __CLR4_1_2kugkugl3lqxu04.R.inc(27157);final char[] emptyChars = new char[0];
        __CLR4_1_2kugkugl3lqxu04.R.inc(27158);assertTrue(StringUtils.containsNone(null, (char[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27159);assertTrue(StringUtils.containsNone("", (char[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27160);assertTrue(StringUtils.containsNone(null, emptyChars));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27161);assertTrue(StringUtils.containsNone(str1, emptyChars));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27162);assertTrue(StringUtils.containsNone("", emptyChars));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27163);assertTrue(StringUtils.containsNone("", chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27164);assertTrue(StringUtils.containsNone(str1, chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27165);assertTrue(StringUtils.containsNone(str1, chars2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27166);assertTrue(StringUtils.containsNone(str1, chars3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27167);assertFalse(StringUtils.containsNone(str2, chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27168);assertTrue(StringUtils.containsNone(str2, chars2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27169);assertTrue(StringUtils.containsNone(str2, chars3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27170);assertFalse(StringUtils.containsNone(str3, chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27171);assertFalse(StringUtils.containsNone(str3, chars2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27172);assertTrue(StringUtils.containsNone(str3, chars3));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsNone_CharArrayWithBadSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27173);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_265t42hkyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArrayWithBadSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27173,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_265t42hkyt(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27173);
        // Test edge case: 1/2 of a (broken) supplementary char
        __CLR4_1_2kugkugl3lqxu04.R.inc(27174);assertTrue(StringUtils.containsNone(CharUSuppCharHigh, CharU20001.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27175);assertEquals(-1, CharUSuppCharLow.indexOf(CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27176);assertTrue(StringUtils.containsNone(CharUSuppCharLow, CharU20001.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27177);assertEquals(-1, CharU20001.indexOf(CharUSuppCharHigh));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27178);assertTrue(StringUtils.containsNone(CharU20001, CharUSuppCharHigh.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27179);assertEquals(0, CharU20001.indexOf(CharUSuppCharLow));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27180);assertFalse(StringUtils.containsNone(CharU20001, CharUSuppCharLow.toCharArray()));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsNone_CharArrayWithSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fibckokz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_CharArrayWithSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27181,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fibckokz1(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27181);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27182);assertFalse(StringUtils.containsNone(CharU20000 + CharU20001, CharU20000.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27183);assertFalse(StringUtils.containsNone(CharU20000 + CharU20001, CharU20001.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27184);assertFalse(StringUtils.containsNone(CharU20000, CharU20000.toCharArray()));
        // Sanity check:
        __CLR4_1_2kugkugl3lqxu04.R.inc(27185);assertEquals(-1, CharU20000.indexOf(CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27186);assertEquals(0, CharU20000.indexOf(CharU20001.charAt(0)));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27187);assertEquals(-1, CharU20000.indexOf(CharU20001.charAt(1)));
        // Test:
        __CLR4_1_2kugkugl3lqxu04.R.inc(27188);assertTrue(StringUtils.containsNone(CharU20000, CharU20001.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27189);assertTrue(StringUtils.containsNone(CharU20001, CharU20000.toCharArray()));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testContainsNone_String() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sc59m6kza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27190,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sc59m6kza(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27190);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27191);final String str1 = "a";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27192);final String str2 = "b";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27193);final String str3 = "ab.";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27194);final String chars1= "b";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27195);final String chars2= ".";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27196);final String chars3= "cd";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27197);assertTrue(StringUtils.containsNone(null, (String) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27198);assertTrue(StringUtils.containsNone("", (String) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27199);assertTrue(StringUtils.containsNone(null, ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27200);assertTrue(StringUtils.containsNone(str1, ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27201);assertTrue(StringUtils.containsNone("", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27202);assertTrue(StringUtils.containsNone("", chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27203);assertTrue(StringUtils.containsNone(str1, chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27204);assertTrue(StringUtils.containsNone(str1, chars2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27205);assertTrue(StringUtils.containsNone(str1, chars3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27206);assertFalse(StringUtils.containsNone(str2, chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27207);assertTrue(StringUtils.containsNone(str2, chars2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27208);assertTrue(StringUtils.containsNone(str2, chars3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27209);assertFalse(StringUtils.containsNone(str3, chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27210);assertFalse(StringUtils.containsNone(str3, chars2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27211);assertTrue(StringUtils.containsNone(str3, chars3));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsNone_StringWithBadSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k11s3xkzw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_StringWithBadSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27212,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k11s3xkzw(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27212);
        // Test edge case: 1/2 of a (broken) supplementary char
        __CLR4_1_2kugkugl3lqxu04.R.inc(27213);assertTrue(StringUtils.containsNone(CharUSuppCharHigh, CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27214);assertEquals(-1, CharUSuppCharLow.indexOf(CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27215);assertTrue(StringUtils.containsNone(CharUSuppCharLow, CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27216);assertEquals(-1, CharU20001.indexOf(CharUSuppCharHigh));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27217);assertTrue(StringUtils.containsNone(CharU20001, CharUSuppCharHigh));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27218);assertEquals(0, CharU20001.indexOf(CharUSuppCharLow));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27219);assertFalse(StringUtils.containsNone(CharU20001, CharUSuppCharLow));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testContainsNone_StringWithSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v23iv2l04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsNone_StringWithSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27220,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v23iv2l04(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27220);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27221);assertFalse(StringUtils.containsNone(CharU20000 + CharU20001, CharU20000));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27222);assertFalse(StringUtils.containsNone(CharU20000 + CharU20001, CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27223);assertFalse(StringUtils.containsNone(CharU20000, CharU20000));
        // Sanity check:
        __CLR4_1_2kugkugl3lqxu04.R.inc(27224);assertEquals(-1, CharU20000.indexOf(CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27225);assertEquals(0, CharU20000.indexOf(CharU20001.charAt(0)));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27226);assertEquals(-1, CharU20000.indexOf(CharU20001.charAt(1)));
        // Test:
        __CLR4_1_2kugkugl3lqxu04.R.inc(27227);assertTrue(StringUtils.containsNone(CharU20000, CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27228);assertTrue(StringUtils.containsNone(CharU20001, CharU20000));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testContainsOnly_CharArray() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j9yepkl0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_CharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27229,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j9yepkl0d(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27229);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27230);final String str1 = "a";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27231);final String str2 = "b";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27232);final String str3 = "ab";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27233);final char[] chars1= {'b'};
        __CLR4_1_2kugkugl3lqxu04.R.inc(27234);final char[] chars2= {'a'};
        __CLR4_1_2kugkugl3lqxu04.R.inc(27235);final char[] chars3= {'a', 'b'};
        __CLR4_1_2kugkugl3lqxu04.R.inc(27236);final char[] emptyChars = new char[0];
        __CLR4_1_2kugkugl3lqxu04.R.inc(27237);assertFalse(StringUtils.containsOnly(null, (char[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27238);assertFalse(StringUtils.containsOnly("", (char[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27239);assertFalse(StringUtils.containsOnly(null, emptyChars));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27240);assertFalse(StringUtils.containsOnly(str1, emptyChars));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27241);assertTrue(StringUtils.containsOnly("", emptyChars));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27242);assertTrue(StringUtils.containsOnly("", chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27243);assertFalse(StringUtils.containsOnly(str1, chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27244);assertTrue(StringUtils.containsOnly(str1, chars2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27245);assertTrue(StringUtils.containsOnly(str1, chars3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27246);assertTrue(StringUtils.containsOnly(str2, chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27247);assertFalse(StringUtils.containsOnly(str2, chars2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27248);assertTrue(StringUtils.containsOnly(str2, chars3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27249);assertFalse(StringUtils.containsOnly(str3, chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27250);assertFalse(StringUtils.containsOnly(str3, chars2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27251);assertTrue(StringUtils.containsOnly(str3, chars3));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testContainsOnly_String() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xabr7ql10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsOnly_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27252,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xabr7ql10(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27252);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27253);final String str1 = "a";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27254);final String str2 = "b";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27255);final String str3 = "ab";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27256);final String chars1= "b";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27257);final String chars2= "a";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27258);final String chars3= "ab";
        __CLR4_1_2kugkugl3lqxu04.R.inc(27259);assertFalse(StringUtils.containsOnly(null, (String) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27260);assertFalse(StringUtils.containsOnly("", (String) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27261);assertFalse(StringUtils.containsOnly(null, ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27262);assertFalse(StringUtils.containsOnly(str1, ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27263);assertTrue(StringUtils.containsOnly("", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27264);assertTrue(StringUtils.containsOnly("", chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27265);assertFalse(StringUtils.containsOnly(str1, chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27266);assertTrue(StringUtils.containsOnly(str1, chars2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27267);assertTrue(StringUtils.containsOnly(str1, chars3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27268);assertTrue(StringUtils.containsOnly(str2, chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27269);assertFalse(StringUtils.containsOnly(str2, chars2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27270);assertTrue(StringUtils.containsOnly(str2, chars3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27271);assertFalse(StringUtils.containsOnly(str3, chars1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27272);assertFalse(StringUtils.containsOnly(str3, chars2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27273);assertTrue(StringUtils.containsOnly(str3, chars3));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testContainsWhitespace() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22tc791l1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testContainsWhitespace",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27274,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22tc791l1m(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27274);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27275);assertFalse( StringUtils.containsWhitespace("") );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27276);assertTrue( StringUtils.containsWhitespace(" ") );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27277);assertFalse( StringUtils.containsWhitespace("a") );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27278);assertTrue( StringUtils.containsWhitespace("a ") );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27279);assertTrue( StringUtils.containsWhitespace(" a") );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27280);assertTrue( StringUtils.containsWhitespace("a\t") );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27281);assertTrue( StringUtils.containsWhitespace("\n") );
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    // The purpose of this class is to test StringUtils#equals(CharSequence, CharSequence)
    // with a CharSequence implementation whose equals(Object) override requires that the
    // other object be an instance of CustomCharSequence, even though, as char sequences,
    // `seq` may equal the other object.
    private static class CustomCharSequence implements CharSequence {
        private final CharSequence seq;

        public CustomCharSequence(final CharSequence seq) {try{__CLR4_1_2kugkugl3lqxu04.R.inc(27282);
            __CLR4_1_2kugkugl3lqxu04.R.inc(27283);this.seq = seq;
        }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

        @Override
        public char charAt(final int index) {try{__CLR4_1_2kugkugl3lqxu04.R.inc(27284);
            __CLR4_1_2kugkugl3lqxu04.R.inc(27285);return seq.charAt(index);
        }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

        @Override
        public int length() {try{__CLR4_1_2kugkugl3lqxu04.R.inc(27286);
            __CLR4_1_2kugkugl3lqxu04.R.inc(27287);return seq.length();
        }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

        @Override
        public CharSequence subSequence(final int start, final int end) {try{__CLR4_1_2kugkugl3lqxu04.R.inc(27288);
            __CLR4_1_2kugkugl3lqxu04.R.inc(27289);return new CustomCharSequence(seq.subSequence(start, end));
        }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

        @Override
        public boolean equals(final Object obj) {try{__CLR4_1_2kugkugl3lqxu04.R.inc(27290);
            __CLR4_1_2kugkugl3lqxu04.R.inc(27291);if ((((obj == null || !(obj instanceof CustomCharSequence))&&(__CLR4_1_2kugkugl3lqxu04.R.iget(27292)!=0|true))||(__CLR4_1_2kugkugl3lqxu04.R.iget(27293)==0&false))) {{
                __CLR4_1_2kugkugl3lqxu04.R.inc(27294);return false;
            }
            }__CLR4_1_2kugkugl3lqxu04.R.inc(27295);final CustomCharSequence other = (CustomCharSequence) obj;
            __CLR4_1_2kugkugl3lqxu04.R.inc(27296);return seq.equals(other.seq);
        }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_1_2kugkugl3lqxu04.R.inc(27297);
            __CLR4_1_2kugkugl3lqxu04.R.inc(27298);return seq.hashCode();
        }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_2kugkugl3lqxu04.R.inc(27299);
            __CLR4_1_2kugkugl3lqxu04.R.inc(27300);return seq.toString();
        }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}
    }

    @Test
    public void testCustomCharSequence() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pfmbnjl2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testCustomCharSequence",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27301,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pfmbnjl2d(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27301);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27302);assertThat(new CustomCharSequence(FOO), IsNot.<CharSequence>not(FOO));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27303);assertThat(FOO, IsNot.<CharSequence>not(new CustomCharSequence(FOO)));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27304);assertEquals(new CustomCharSequence(FOO), new CustomCharSequence(FOO));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608l2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27305,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608l2h(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27305);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27306);final CharSequence fooCs = FOO, barCs = BAR, foobarCs = FOOBAR;
        __CLR4_1_2kugkugl3lqxu04.R.inc(27307);assertTrue(StringUtils.equals(null, null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27308);assertTrue(StringUtils.equals(fooCs, fooCs));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27309);assertTrue(StringUtils.equals(fooCs, new StringBuilder(FOO)));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27310);assertTrue(StringUtils.equals(fooCs, new String(new char[] { 'f', 'o', 'o' })));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27311);assertTrue(StringUtils.equals(fooCs, new CustomCharSequence(FOO)));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27312);assertTrue(StringUtils.equals(new CustomCharSequence(FOO), fooCs));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27313);assertFalse(StringUtils.equals(fooCs, new String(new char[] { 'f', 'O', 'O' })));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27314);assertFalse(StringUtils.equals(fooCs, barCs));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27315);assertFalse(StringUtils.equals(fooCs, null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27316);assertFalse(StringUtils.equals(null, fooCs));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27317);assertFalse(StringUtils.equals(fooCs, foobarCs));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27318);assertFalse(StringUtils.equals(foobarCs, fooCs));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testEqualsOnStrings() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2biupbtl2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsOnStrings",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27319,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2biupbtl2v(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27319);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27320);assertTrue(StringUtils.equals(null, null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27321);assertTrue(StringUtils.equals(FOO, FOO));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27322);assertTrue(StringUtils.equals(FOO, new String(new char[] { 'f', 'o', 'o' })));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27323);assertFalse(StringUtils.equals(FOO, new String(new char[] { 'f', 'O', 'O' })));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27324);assertFalse(StringUtils.equals(FOO, BAR));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27325);assertFalse(StringUtils.equals(FOO, null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27326);assertFalse(StringUtils.equals(null, FOO));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27327);assertFalse(StringUtils.equals(FOO, FOOBAR));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27328);assertFalse(StringUtils.equals(FOOBAR, FOO));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testEqualsIgnoreCase() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2c1544ml35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testEqualsIgnoreCase",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27329,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2c1544ml35(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27329);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27330);assertTrue(StringUtils.equalsIgnoreCase(null, null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27331);assertTrue(StringUtils.equalsIgnoreCase(FOO, FOO));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27332);assertTrue(StringUtils.equalsIgnoreCase(FOO, new String(new char[] { 'f', 'o', 'o' })));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27333);assertTrue(StringUtils.equalsIgnoreCase(FOO, new String(new char[] { 'f', 'O', 'O' })));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27334);assertFalse(StringUtils.equalsIgnoreCase(FOO, BAR));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27335);assertFalse(StringUtils.equalsIgnoreCase(FOO, null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27336);assertFalse(StringUtils.equalsIgnoreCase(null, FOO));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27337);assertTrue(StringUtils.equalsIgnoreCase("",""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27338);assertFalse(StringUtils.equalsIgnoreCase("abcd","abcd "));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIndexOf_char() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22eupffl3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27339,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22eupffl3f(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27339);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27340);assertEquals(-1, StringUtils.indexOf(null, ' '));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27341);assertEquals(-1, StringUtils.indexOf("", ' '));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27342);assertEquals(0, StringUtils.indexOf("aabaabaa", 'a'));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27343);assertEquals(2, StringUtils.indexOf("aabaabaa", 'b'));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27344);assertEquals(2, StringUtils.indexOf(new StringBuilder("aabaabaa"), 'b'));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testIndexOf_charInt() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g13kegl3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_charInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27345,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g13kegl3l(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27345);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27346);assertEquals(-1, StringUtils.indexOf(null, ' ', 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27347);assertEquals(-1, StringUtils.indexOf(null, ' ', -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27348);assertEquals(-1, StringUtils.indexOf("", ' ', 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27349);assertEquals(-1, StringUtils.indexOf("", ' ', -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27350);assertEquals(0, StringUtils.indexOf("aabaabaa", 'a', 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27351);assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27352);assertEquals(5, StringUtils.indexOf("aabaabaa", 'b', 3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27353);assertEquals(-1, StringUtils.indexOf("aabaabaa", 'b', 9));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27354);assertEquals(2, StringUtils.indexOf("aabaabaa", 'b', -1));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27355);assertEquals(5, StringUtils.indexOf(new StringBuilder("aabaabaa"), 'b', 3));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testIndexOf_String() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qm76bkl3w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27356,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qm76bkl3w(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27356);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27357);assertEquals(-1, StringUtils.indexOf(null, null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27358);assertEquals(-1, StringUtils.indexOf("", null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27359);assertEquals(0, StringUtils.indexOf("", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27360);assertEquals(0, StringUtils.indexOf("aabaabaa", "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27361);assertEquals(2, StringUtils.indexOf("aabaabaa", "b"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27362);assertEquals(1, StringUtils.indexOf("aabaabaa", "ab"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27363);assertEquals(0, StringUtils.indexOf("aabaabaa", ""));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27364);assertEquals(2, StringUtils.indexOf(new StringBuilder("aabaabaa"), "b"));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testIndexOf_StringInt() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qeq93xl45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOf_StringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27365,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qeq93xl45(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27365);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27366);assertEquals(-1, StringUtils.indexOf(null, null, 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27367);assertEquals(-1, StringUtils.indexOf(null, null, -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27368);assertEquals(-1, StringUtils.indexOf(null, "", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27369);assertEquals(-1, StringUtils.indexOf(null, "", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27370);assertEquals(-1, StringUtils.indexOf("", null, 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27371);assertEquals(-1, StringUtils.indexOf("", null, -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27372);assertEquals(0, StringUtils.indexOf("", "", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27373);assertEquals(0, StringUtils.indexOf("", "", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27374);assertEquals(0, StringUtils.indexOf("", "", 9));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27375);assertEquals(0, StringUtils.indexOf("abc", "", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27376);assertEquals(0, StringUtils.indexOf("abc", "", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27377);assertEquals(3, StringUtils.indexOf("abc", "", 9));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27378);assertEquals(3, StringUtils.indexOf("abc", "", 3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27379);assertEquals(0, StringUtils.indexOf("aabaabaa", "a", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27380);assertEquals(2, StringUtils.indexOf("aabaabaa", "b", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27381);assertEquals(1, StringUtils.indexOf("aabaabaa", "ab", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27382);assertEquals(5, StringUtils.indexOf("aabaabaa", "b", 3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27383);assertEquals(-1, StringUtils.indexOf("aabaabaa", "b", 9));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27384);assertEquals(2, StringUtils.indexOf("aabaabaa", "b", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27385);assertEquals(2,StringUtils.indexOf("aabaabaa", "", 2));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27386);assertEquals(5, StringUtils.indexOf(new StringBuilder("aabaabaa"), "b", 3));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testIndexOfAny_StringCharArray() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mjfr0vl4r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27387,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mjfr0vl4r(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27387);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27388);assertEquals(-1, StringUtils.indexOfAny(null, (char[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27389);assertEquals(-1, StringUtils.indexOfAny(null, new char[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27390);assertEquals(-1, StringUtils.indexOfAny(null, new char[] {'a','b'}));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27391);assertEquals(-1, StringUtils.indexOfAny("", (char[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27392);assertEquals(-1, StringUtils.indexOfAny("", new char[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27393);assertEquals(-1, StringUtils.indexOfAny("", new char[] {'a','b'}));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27394);assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", (char[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27395);assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", new char[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27396);assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", new char[] {'z','a'}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27397);assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", new char[] {'b','y'}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27398);assertEquals(-1, StringUtils.indexOfAny("ab", new char[] {'z'}));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testIndexOfAny_StringCharArrayWithSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21ozixvl53();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringCharArrayWithSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27399,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21ozixvl53(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27399);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27400);assertEquals(0, StringUtils.indexOfAny(CharU20000 + CharU20001, CharU20000.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27401);assertEquals(2, StringUtils.indexOfAny(CharU20000 + CharU20001, CharU20001.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27402);assertEquals(0, StringUtils.indexOfAny(CharU20000, CharU20000.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27403);assertEquals(-1, StringUtils.indexOfAny(CharU20000, CharU20001.toCharArray()));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testIndexOfAny_StringString() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ato7yrl58();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27404,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ato7yrl58(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27404);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27405);assertEquals(-1, StringUtils.indexOfAny(null, (String) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27406);assertEquals(-1, StringUtils.indexOfAny(null, ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27407);assertEquals(-1, StringUtils.indexOfAny(null, "ab"));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27408);assertEquals(-1, StringUtils.indexOfAny("", (String) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27409);assertEquals(-1, StringUtils.indexOfAny("", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27410);assertEquals(-1, StringUtils.indexOfAny("", "ab"));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27411);assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", (String) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27412);assertEquals(-1, StringUtils.indexOfAny("zzabyycdxx", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27413);assertEquals(0, StringUtils.indexOfAny("zzabyycdxx", "za"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27414);assertEquals(3, StringUtils.indexOfAny("zzabyycdxx", "by"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27415);assertEquals(-1, StringUtils.indexOfAny("ab", "z"));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testIndexOfAny_StringStringArray() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r2mii4l5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27416,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r2mii4l5k(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27416);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27417);assertEquals(-1, StringUtils.indexOfAny(null, (String[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27418);assertEquals(-1, StringUtils.indexOfAny(null, FOOBAR_SUB_ARRAY));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27419);assertEquals(-1, StringUtils.indexOfAny(FOOBAR, (String[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27420);assertEquals(2, StringUtils.indexOfAny(FOOBAR, FOOBAR_SUB_ARRAY));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27421);assertEquals(-1, StringUtils.indexOfAny(FOOBAR, new String[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27422);assertEquals(-1, StringUtils.indexOfAny(null, new String[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27423);assertEquals(-1, StringUtils.indexOfAny("", new String[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27424);assertEquals(-1, StringUtils.indexOfAny(FOOBAR, new String[] {"llll"}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27425);assertEquals(0, StringUtils.indexOfAny(FOOBAR, new String[] {""}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27426);assertEquals(0, StringUtils.indexOfAny("", new String[] {""}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27427);assertEquals(-1, StringUtils.indexOfAny("", new String[] {"a"}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27428);assertEquals(-1, StringUtils.indexOfAny("", new String[] {null}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27429);assertEquals(-1, StringUtils.indexOfAny(FOOBAR, new String[] {null}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27430);assertEquals(-1, StringUtils.indexOfAny(null, new String[] {null}));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    /**
     * See http://www.oracle.com/technetwork/articles/javase/supplementary-142654.html
     */
    @Test
    public void testIndexOfAny_StringStringWithSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pvlf2xl5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAny_StringStringWithSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27431,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pvlf2xl5z(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27431);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27432);assertEquals(0, StringUtils.indexOfAny(CharU20000 + CharU20001, CharU20000));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27433);assertEquals(2, StringUtils.indexOfAny(CharU20000 + CharU20001, CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27434);assertEquals(0, StringUtils.indexOfAny(CharU20000, CharU20000));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27435);assertEquals(-1, StringUtils.indexOfAny(CharU20000, CharU20001));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testIndexOfAnyBut_StringCharArray() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nblwe2l64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27436,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nblwe2l64(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27436);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27437);assertEquals(-1, StringUtils.indexOfAnyBut(null, (char[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27438);assertEquals(-1, StringUtils.indexOfAnyBut(null, new char[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27439);assertEquals(-1, StringUtils.indexOfAnyBut(null, new char[] {'a','b'}));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27440);assertEquals(-1, StringUtils.indexOfAnyBut("", (char[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27441);assertEquals(-1, StringUtils.indexOfAnyBut("", new char[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27442);assertEquals(-1, StringUtils.indexOfAnyBut("", new char[] {'a','b'}));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27443);assertEquals(-1, StringUtils.indexOfAnyBut("zzabyycdxx", (char[]) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27444);assertEquals(-1, StringUtils.indexOfAnyBut("zzabyycdxx", new char[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27445);assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", new char[] {'z','a'}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27446);assertEquals(0, StringUtils.indexOfAnyBut("zzabyycdxx", new char[] {'b','y'}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27447);assertEquals(-1, StringUtils.indexOfAnyBut("aba", new char[] {'a', 'b'}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27448);assertEquals(0, StringUtils.indexOfAnyBut("aba", new char[] {'z'}));

    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testIndexOfAnyBut_StringCharArrayWithSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_224gi92l6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringCharArrayWithSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27449,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_224gi92l6h(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27449);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27450);assertEquals(2, StringUtils.indexOfAnyBut(CharU20000 + CharU20001, CharU20000.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27451);assertEquals(0, StringUtils.indexOfAnyBut(CharU20000 + CharU20001, CharU20001.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27452);assertEquals(-1, StringUtils.indexOfAnyBut(CharU20000, CharU20000.toCharArray()));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27453);assertEquals(0, StringUtils.indexOfAnyBut(CharU20000, CharU20001.toCharArray()));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testIndexOfAnyBut_StringString() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22npunwl6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27454,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22npunwl6m(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27454);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27455);assertEquals(-1, StringUtils.indexOfAnyBut(null, (String) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27456);assertEquals(-1, StringUtils.indexOfAnyBut(null, ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27457);assertEquals(-1, StringUtils.indexOfAnyBut(null, "ab"));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27458);assertEquals(-1, StringUtils.indexOfAnyBut("", (String) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27459);assertEquals(-1, StringUtils.indexOfAnyBut("", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27460);assertEquals(-1, StringUtils.indexOfAnyBut("", "ab"));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27461);assertEquals(-1, StringUtils.indexOfAnyBut("zzabyycdxx", (String) null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27462);assertEquals(-1, StringUtils.indexOfAnyBut("zzabyycdxx", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27463);assertEquals(3, StringUtils.indexOfAnyBut("zzabyycdxx", "za"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27464);assertEquals(0, StringUtils.indexOfAnyBut("zzabyycdxx", "by"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27465);assertEquals(0, StringUtils.indexOfAnyBut("ab", "z"));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testIndexOfAnyBut_StringStringWithSupplementaryChars() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k7ri6ol6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfAnyBut_StringStringWithSupplementaryChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27466,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k7ri6ol6y(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27466);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27467);assertEquals(2, StringUtils.indexOfAnyBut(CharU20000 + CharU20001, CharU20000));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27468);assertEquals(0, StringUtils.indexOfAnyBut(CharU20000 + CharU20001, CharU20001));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27469);assertEquals(-1, StringUtils.indexOfAnyBut(CharU20000, CharU20000));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27470);assertEquals(0, StringUtils.indexOfAnyBut(CharU20000, CharU20001));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testIndexOfIgnoreCase_String() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q89f7ml73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27471,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q89f7ml73(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27471);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27472);assertEquals(-1, StringUtils.indexOfIgnoreCase(null, null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27473);assertEquals(-1, StringUtils.indexOfIgnoreCase(null, ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27474);assertEquals(-1, StringUtils.indexOfIgnoreCase("", null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27475);assertEquals(0, StringUtils.indexOfIgnoreCase("", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27476);assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27477);assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", "A"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27478);assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "b"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27479);assertEquals(2, StringUtils.indexOfIgnoreCase("aabaabaa", "B"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27480);assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "ab"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27481);assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27482);assertEquals(0, StringUtils.indexOfIgnoreCase("aabaabaa", ""));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testIndexOfIgnoreCase_StringInt() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hw1rq9l7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testIndexOfIgnoreCase_StringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27483,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hw1rq9l7f(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27483);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27484);assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27485);assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27486);assertEquals(1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27487);assertEquals(4, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27488);assertEquals(4, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27489);assertEquals(4, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 4));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27490);assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 5));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27491);assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 6));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27492);assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 7));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27493);assertEquals(-1, StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 8));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27494);assertEquals(1, StringUtils.indexOfIgnoreCase("aab", "AB", 1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27495);assertEquals(5, StringUtils.indexOfIgnoreCase("aabaabaa", "", 5));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27496);assertEquals(-1, StringUtils.indexOfIgnoreCase("ab", "AAB", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27497);assertEquals(-1, StringUtils.indexOfIgnoreCase("aab", "AAB", 1));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_char() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hag5h7l7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27498,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hag5h7l7u(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27498);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27499);assertEquals(-1, StringUtils.lastIndexOf(null, ' '));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27500);assertEquals(-1, StringUtils.lastIndexOf("", ' '));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27501);assertEquals(7, StringUtils.lastIndexOf("aabaabaa", 'a'));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27502);assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b'));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27503);assertEquals(5, StringUtils.lastIndexOf(new StringBuilder("aabaabaa"), 'b'));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_charInt() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mdwi82l80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_charInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27504,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mdwi82l80(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27504);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27505);assertEquals(-1, StringUtils.lastIndexOf(null, ' ', 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27506);assertEquals(-1, StringUtils.lastIndexOf(null, ' ', -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27507);assertEquals(-1, StringUtils.lastIndexOf("", ' ', 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27508);assertEquals(-1, StringUtils.lastIndexOf("", ' ', -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27509);assertEquals(7, StringUtils.lastIndexOf("aabaabaa", 'a', 8));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27510);assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 8));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27511);assertEquals(2, StringUtils.lastIndexOf("aabaabaa", 'b', 3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27512);assertEquals(5, StringUtils.lastIndexOf("aabaabaa", 'b', 9));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27513);assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", 'b', -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27514);assertEquals(0, StringUtils.lastIndexOf("aabaabaa", 'a', 0));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27515);assertEquals(2, StringUtils.lastIndexOf(new StringBuilder("aabaabaa"), 'b', 2));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_String() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dkp8s6l8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27516,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dkp8s6l8c(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27516);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27517);assertEquals(-1, StringUtils.lastIndexOf(null, null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27518);assertEquals(-1, StringUtils.lastIndexOf("", null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27519);assertEquals(-1, StringUtils.lastIndexOf("", "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27520);assertEquals(0, StringUtils.lastIndexOf("", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27521);assertEquals(8, StringUtils.lastIndexOf("aabaabaa", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27522);assertEquals(7, StringUtils.lastIndexOf("aabaabaa", "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27523);assertEquals(5, StringUtils.lastIndexOf("aabaabaa", "b"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27524);assertEquals(4, StringUtils.lastIndexOf("aabaabaa", "ab"));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27525);assertEquals(4, StringUtils.lastIndexOf(new StringBuilder("aabaabaa"), "ab"));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testLastIndexOf_StringInt() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28t3sknl8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOf_StringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27526,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28t3sknl8m(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27526);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27527);assertEquals(-1, StringUtils.lastIndexOf(null, null, 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27528);assertEquals(-1, StringUtils.lastIndexOf(null, null, -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27529);assertEquals(-1, StringUtils.lastIndexOf(null, "", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27530);assertEquals(-1, StringUtils.lastIndexOf(null, "", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27531);assertEquals(-1, StringUtils.lastIndexOf("", null, 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27532);assertEquals(-1, StringUtils.lastIndexOf("", null, -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27533);assertEquals(0, StringUtils.lastIndexOf("", "", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27534);assertEquals(-1, StringUtils.lastIndexOf("", "", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27535);assertEquals(0, StringUtils.lastIndexOf("", "", 9));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27536);assertEquals(0, StringUtils.lastIndexOf("abc", "", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27537);assertEquals(-1, StringUtils.lastIndexOf("abc", "", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27538);assertEquals(3, StringUtils.lastIndexOf("abc", "", 9));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27539);assertEquals(7, StringUtils.lastIndexOf("aabaabaa", "a", 8));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27540);assertEquals(5, StringUtils.lastIndexOf("aabaabaa", "b", 8));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27541);assertEquals(4, StringUtils.lastIndexOf("aabaabaa", "ab", 8));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27542);assertEquals(2, StringUtils.lastIndexOf("aabaabaa", "b", 3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27543);assertEquals(5, StringUtils.lastIndexOf("aabaabaa", "b", 9));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27544);assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", "b", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27545);assertEquals(-1, StringUtils.lastIndexOf("aabaabaa", "b", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27546);assertEquals(0, StringUtils.lastIndexOf("aabaabaa", "a", 0));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27547);assertEquals(2, StringUtils.lastIndexOf(new StringBuilder("aabaabaa"), "b", 3));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testLastIndexOfAny_StringStringArray() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p3gh12l98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfAny_StringStringArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27548,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p3gh12l98(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27548);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27549);assertEquals(-1, StringUtils.lastIndexOfAny(null, (CharSequence) null));   // test both types of ...
        __CLR4_1_2kugkugl3lqxu04.R.inc(27550);assertEquals(-1, StringUtils.lastIndexOfAny(null, (CharSequence[]) null)); // ... varargs invocation
        __CLR4_1_2kugkugl3lqxu04.R.inc(27551);assertEquals(-1, StringUtils.lastIndexOfAny(null)); // Missing varag
        __CLR4_1_2kugkugl3lqxu04.R.inc(27552);assertEquals(-1, StringUtils.lastIndexOfAny(null, FOOBAR_SUB_ARRAY));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27553);assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, (CharSequence) null));   // test both types of ...
        __CLR4_1_2kugkugl3lqxu04.R.inc(27554);assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, (CharSequence[]) null)); // ... varargs invocation
        __CLR4_1_2kugkugl3lqxu04.R.inc(27555);assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR)); // Missing vararg
        __CLR4_1_2kugkugl3lqxu04.R.inc(27556);assertEquals(3, StringUtils.lastIndexOfAny(FOOBAR, FOOBAR_SUB_ARRAY));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27557);assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, new String[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27558);assertEquals(-1, StringUtils.lastIndexOfAny(null, new String[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27559);assertEquals(-1, StringUtils.lastIndexOfAny("", new String[0]));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27560);assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, new String[] {"llll"}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27561);assertEquals(6, StringUtils.lastIndexOfAny(FOOBAR, new String[] {""}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27562);assertEquals(0, StringUtils.lastIndexOfAny("", new String[] {""}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27563);assertEquals(-1, StringUtils.lastIndexOfAny("", new String[] {"a"}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27564);assertEquals(-1, StringUtils.lastIndexOfAny("", new String[] {null}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27565);assertEquals(-1, StringUtils.lastIndexOfAny(FOOBAR, new String[] {null}));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27566);assertEquals(-1, StringUtils.lastIndexOfAny(null, new String[] {null}));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testLastIndexOfIgnoreCase_String() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22c4f5gl9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27567,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22c4f5gl9r(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27567);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27568);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27569);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("", null));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27570);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27571);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("", "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27572);assertEquals(0, StringUtils.lastIndexOfIgnoreCase("", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27573);assertEquals(8, StringUtils.lastIndexOfIgnoreCase("aabaabaa", ""));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27574);assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "a"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27575);assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27576);assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "b"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27577);assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27578);assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "ab"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27579);assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27580);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("ab", "AAB"));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27581);assertEquals(0, StringUtils.lastIndexOfIgnoreCase("aab", "AAB"));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testLastIndexOfIgnoreCase_StringInt() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2meq82fla6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastIndexOfIgnoreCase_StringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27582,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2meq82fla6(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27582);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27583);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, null, 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27584);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, null, -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27585);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27586);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase(null, "", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27587);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("", null, 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27588);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("", null, -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27589);assertEquals(0, StringUtils.lastIndexOfIgnoreCase("", "", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27590);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("", "", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27591);assertEquals(0, StringUtils.lastIndexOfIgnoreCase("", "", 9));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27592);assertEquals(0, StringUtils.lastIndexOfIgnoreCase("abc", "", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27593);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("abc", "", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27594);assertEquals(3, StringUtils.lastIndexOfIgnoreCase("abc", "", 9));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27595);assertEquals(7, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 8));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27596);assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 8));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27597);assertEquals(4, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB", 8));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27598);assertEquals(2, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27599);assertEquals(5, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 9));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27600);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27601);assertEquals(-1, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27602);assertEquals(0, StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27603);assertEquals(1, StringUtils.lastIndexOfIgnoreCase("aab", "AB", 1));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testLastOrdinalIndexOf() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jortmhlas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testLastOrdinalIndexOf",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27604,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jortmhlas(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27604);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27605);assertEquals(-1, StringUtils.lastOrdinalIndexOf(null, "*", 42) );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27606);assertEquals(-1, StringUtils.lastOrdinalIndexOf("*", null, 42) );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27607);assertEquals(0, StringUtils.lastOrdinalIndexOf("", "", 42) );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27608);assertEquals(7, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 1) );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27609);assertEquals(6, StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 2) );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27610);assertEquals(5, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 1) );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27611);assertEquals(2, StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 2) );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27612);assertEquals(4, StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 1) );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27613);assertEquals(1, StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 2) );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27614);assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1) );
        __CLR4_1_2kugkugl3lqxu04.R.inc(27615);assertEquals(8, StringUtils.lastOrdinalIndexOf("aabaabaa", "", 2) );
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

    @Test
    public void testOrdinalIndexOf() {__CLR4_1_2kugkugl3lqxu04.R.globalSliceStart(getClass().getName(),27616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b5ft8xlb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kugkugl3lqxu04.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kugkugl3lqxu04.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsEqualsIndexOfTest.testOrdinalIndexOf",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27616,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b5ft8xlb4(){try{__CLR4_1_2kugkugl3lqxu04.R.inc(27616);
        __CLR4_1_2kugkugl3lqxu04.R.inc(27617);assertEquals(-1, StringUtils.ordinalIndexOf(null, null, Integer.MIN_VALUE));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27618);assertEquals(-1, StringUtils.ordinalIndexOf("", null, Integer.MIN_VALUE));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27619);assertEquals(-1, StringUtils.ordinalIndexOf("", "", Integer.MIN_VALUE));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27620);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "a", Integer.MIN_VALUE));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27621);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "b", Integer.MIN_VALUE));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27622);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "ab", Integer.MIN_VALUE));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27623);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "", Integer.MIN_VALUE));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27624);assertEquals(-1, StringUtils.ordinalIndexOf(null, null, -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27625);assertEquals(-1, StringUtils.ordinalIndexOf("", null, -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27626);assertEquals(-1, StringUtils.ordinalIndexOf("", "", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27627);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "a", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27628);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "b", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27629);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "ab", -1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27630);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "", -1));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27631);assertEquals(-1, StringUtils.ordinalIndexOf(null, null, 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27632);assertEquals(-1, StringUtils.ordinalIndexOf("", null, 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27633);assertEquals(-1, StringUtils.ordinalIndexOf("", "", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27634);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "a", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27635);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "b", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27636);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "ab", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27637);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "", 0));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27638);assertEquals(-1, StringUtils.ordinalIndexOf(null, null, 1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27639);assertEquals(-1, StringUtils.ordinalIndexOf("", null, 1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27640);assertEquals(0, StringUtils.ordinalIndexOf("", "", 1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27641);assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "a", 1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27642);assertEquals(2, StringUtils.ordinalIndexOf("aabaabaa", "b", 1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27643);assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "ab", 1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27644);assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "", 1));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27645);assertEquals(-1, StringUtils.ordinalIndexOf(null, null, 2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27646);assertEquals(-1, StringUtils.ordinalIndexOf("", null, 2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27647);assertEquals(0, StringUtils.ordinalIndexOf("", "", 2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27648);assertEquals(1, StringUtils.ordinalIndexOf("aabaabaa", "a", 2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27649);assertEquals(5, StringUtils.ordinalIndexOf("aabaabaa", "b", 2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27650);assertEquals(4, StringUtils.ordinalIndexOf("aabaabaa", "ab", 2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27651);assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "", 2));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27652);assertEquals(-1, StringUtils.ordinalIndexOf(null, null, Integer.MAX_VALUE));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27653);assertEquals(-1, StringUtils.ordinalIndexOf("", null, Integer.MAX_VALUE));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27654);assertEquals(0, StringUtils.ordinalIndexOf("", "", Integer.MAX_VALUE));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27655);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "a", Integer.MAX_VALUE));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27656);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "b", Integer.MAX_VALUE));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27657);assertEquals(-1, StringUtils.ordinalIndexOf("aabaabaa", "ab", Integer.MAX_VALUE));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27658);assertEquals(0, StringUtils.ordinalIndexOf("aabaabaa", "", Integer.MAX_VALUE));

        __CLR4_1_2kugkugl3lqxu04.R.inc(27659);assertEquals(-1, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 0));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27660);assertEquals(0, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 1));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27661);assertEquals(1, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 2));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27662);assertEquals(2, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 3));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27663);assertEquals(3, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 4));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27664);assertEquals(4, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 5));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27665);assertEquals(5, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 6));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27666);assertEquals(6, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 7));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27667);assertEquals(7, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 8));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27668);assertEquals(8, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 9));
        __CLR4_1_2kugkugl3lqxu04.R.inc(27669);assertEquals(-1, StringUtils.ordinalIndexOf("aaaaaaaaa", "a", 10));
    }finally{__CLR4_1_2kugkugl3lqxu04.R.flushNeeded();}}

}
