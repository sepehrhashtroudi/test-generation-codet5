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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

import org.apache.commons.lang3.text.WordUtils;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils}.
 *
 * @version $Id$
 */
public class StringUtilsTest {static class __CLR4_1_2lnxlnxl3lqxu48{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,29551,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    static final String WHITESPACE;
    static final String NON_WHITESPACE;
    static final String TRIMMABLE;
    static final String NON_TRIMMABLE;
    static {try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28077);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28078);String ws = "";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28079);String nws = "";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28080);String tr = "";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28081);String ntr = "";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28082);for (int i = 0; (((i < Character.MAX_VALUE)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28083)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28084)==0&false)); i++) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28085);if ((((Character.isWhitespace((char) i))&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28086)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28087)==0&false))) {{
                __CLR4_1_2lnxlnxl3lqxu48.R.inc(28088);ws += String.valueOf((char) i);
                __CLR4_1_2lnxlnxl3lqxu48.R.inc(28089);if ((((i > 32)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28090)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28091)==0&false))) {{
                    __CLR4_1_2lnxlnxl3lqxu48.R.inc(28092);ntr += String.valueOf((char) i);
                }
            }} }else {__CLR4_1_2lnxlnxl3lqxu48.R.inc(28093);if ((((i < 40)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28094)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28095)==0&false))) {{
                __CLR4_1_2lnxlnxl3lqxu48.R.inc(28096);nws += String.valueOf((char) i);
            }
        }}}
        }__CLR4_1_2lnxlnxl3lqxu48.R.inc(28097);for (int i = 0; (((i <= 32)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28098)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28099)==0&false)); i++) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28100);tr += String.valueOf((char) i);
        }
        }__CLR4_1_2lnxlnxl3lqxu48.R.inc(28101);WHITESPACE = ws;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28102);NON_WHITESPACE = nws;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28103);TRIMMABLE = tr;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28104);NON_TRIMMABLE = ntr;
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    private static final String[] ARRAY_LIST = { "foo", "bar", "baz" };
    private static final String[] EMPTY_ARRAY_LIST = {};
    private static final String[] NULL_ARRAY_LIST = {null};
    private static final Object[] NULL_TO_STRING_LIST = {
        new Object(){
            @Override
            public String toString() {try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28105);
                __CLR4_1_2lnxlnxl3lqxu48.R.inc(28106);return null;
            }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
        }
    };
    private static final String[] MIXED_ARRAY_LIST = {null, "", "foo"};
    private static final Object[] MIXED_TYPE_LIST = {"foo", Long.valueOf(2L)};
    private static final long[] LONG_PRIM_LIST = {1, 2};
    private static final int[] INT_PRIM_LIST = {1, 2};
    private static final byte[] BYTE_PRIM_LIST = {1, 2};
    private static final short[] SHORT_PRIM_LIST = {1, 2};
    private static final char[] CHAR_PRIM_LIST = {'1', '2'};
    private static final float[] FLOAT_PRIM_LIST = {1, 2};
    private static final double[] DOUBLE_PRIM_LIST = {1, 2};

    private static final String SEPARATOR = ",";
    private static final char   SEPARATOR_CHAR = ';';

    private static final String TEXT_LIST = "foo,bar,baz";
    private static final String TEXT_LIST_CHAR = "foo;bar;baz";
    private static final String TEXT_LIST_NOSEP = "foobarbaz";

    private static final String FOO_UNCAP = "foo";
    private static final String FOO_CAP = "Foo";

    private static final String SENTENCE_UNCAP = "foo bar baz";
    private static final String SENTENCE_CAP = "Foo Bar Baz";

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hlor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28107,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hlor(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28107);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28108);assertNotNull(new StringUtils());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28109);final Constructor<?>[] cons = StringUtils.class.getDeclaredConstructors();
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28110);assertEquals(1, cons.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28111);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28112);assertTrue(Modifier.isPublic(StringUtils.class.getModifiers()));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28113);assertFalse(Modifier.isFinal(StringUtils.class.getModifiers()));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testCaseFunctions() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mdkc1sloy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testCaseFunctions",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28114,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mdkc1sloy(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28114);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28115);assertEquals(null, StringUtils.upperCase(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28116);assertEquals(null, StringUtils.upperCase(null, Locale.ENGLISH));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28117);assertEquals(null, StringUtils.lowerCase(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28118);assertEquals(null, StringUtils.lowerCase(null, Locale.ENGLISH));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28119);assertEquals(null, StringUtils.capitalize(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28120);assertEquals(null, StringUtils.uncapitalize(null));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28121);assertEquals("capitalize(empty-string) failed",
                     "", StringUtils.capitalize("") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28122);assertEquals("capitalize(single-char-string) failed",
                "X", StringUtils.capitalize("x") );
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28123);assertEquals("uncapitalize(String) failed",
                     FOO_UNCAP, StringUtils.uncapitalize(FOO_CAP) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28124);assertEquals("uncapitalize(empty-string) failed",
                     "", StringUtils.uncapitalize("") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28125);assertEquals("uncapitalize(single-char-string) failed",
                "x", StringUtils.uncapitalize("X") );
                     
        // reflection type of tests: Sentences.
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28126);assertEquals("uncapitalize(capitalize(String)) failed",
                     SENTENCE_UNCAP, StringUtils.uncapitalize(StringUtils.capitalize(SENTENCE_UNCAP)) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28127);assertEquals("capitalize(uncapitalize(String)) failed",
                     SENTENCE_CAP, StringUtils.capitalize(StringUtils.uncapitalize(SENTENCE_CAP)) );

        // reflection type of tests: One word.
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28128);assertEquals("uncapitalize(capitalize(String)) failed",
                     FOO_UNCAP, StringUtils.uncapitalize(StringUtils.capitalize(FOO_UNCAP)) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28129);assertEquals("capitalize(uncapitalize(String)) failed",
                     FOO_CAP, StringUtils.capitalize(StringUtils.uncapitalize(FOO_CAP)) );

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28130);assertEquals("upperCase(String) failed",
                     "FOO TEST THING", StringUtils.upperCase("fOo test THING") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28131);assertEquals("upperCase(empty-string) failed",
                     "", StringUtils.upperCase("") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28132);assertEquals("lowerCase(String) failed",
                     "foo test thing", StringUtils.lowerCase("fOo test THING") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28133);assertEquals("lowerCase(empty-string) failed",
                     "", StringUtils.lowerCase("") );

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28134);assertEquals("upperCase(String, Locale) failed",
                     "FOO TEST THING", StringUtils.upperCase("fOo test THING", Locale.ENGLISH) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28135);assertEquals("upperCase(empty-string, Locale) failed",
                     "", StringUtils.upperCase("", Locale.ENGLISH) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28136);assertEquals("lowerCase(String, Locale) failed",
                     "foo test thing", StringUtils.lowerCase("fOo test THING", Locale.ENGLISH) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28137);assertEquals("lowerCase(empty-string, Locale) failed",
                     "", StringUtils.lowerCase("", Locale.ENGLISH) );
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testSwapCase_String() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vnsj26lpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSwapCase_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28138,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vnsj26lpm(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28138);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28139);assertEquals(null, StringUtils.swapCase(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28140);assertEquals("", StringUtils.swapCase(""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28141);assertEquals("  ", StringUtils.swapCase("  "));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28142);assertEquals("i", WordUtils.swapCase("I") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28143);assertEquals("I", WordUtils.swapCase("i") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28144);assertEquals("I AM HERE 123", StringUtils.swapCase("i am here 123") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28145);assertEquals("i aM hERE 123", StringUtils.swapCase("I Am Here 123") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28146);assertEquals("I AM here 123", StringUtils.swapCase("i am HERE 123") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28147);assertEquals("i am here 123", StringUtils.swapCase("I AM HERE 123") );
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28148);final String test = "This String contains a TitleCase character: \u01c8";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28149);final String expect = "tHIS sTRING CONTAINS A tITLEcASE CHARACTER: \u01c9";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28150);assertEquals(expect, WordUtils.swapCase(test));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testJoin_Objects() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_242x748lpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_Objects",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28151,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_242x748lpz(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28151);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28152);assertEquals("abc", StringUtils.join("a", "b", "c"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28153);assertEquals("a",   StringUtils.join(null, "", "a"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28154);assertEquals(null,  StringUtils.join((Object[])null));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testJoin_Objectarray() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2onjrylq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_Objectarray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28155,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2onjrylq3(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28155);
//        assertEquals(null, StringUtils.join(null)); // generates warning
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28156);assertEquals(null, StringUtils.join((Object[]) null)); // equivalent explicit cast
        // test additional varargs calls
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28157);assertEquals("", StringUtils.join()); // empty array
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28158);assertEquals("", StringUtils.join((Object) null)); // => new Object[]{null}

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28159);assertEquals("", StringUtils.join(EMPTY_ARRAY_LIST));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28160);assertEquals("", StringUtils.join(NULL_ARRAY_LIST));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28161);assertEquals("null", StringUtils.join(NULL_TO_STRING_LIST));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28162);assertEquals("abc", StringUtils.join(new String[] {"a", "b", "c"}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28163);assertEquals("a", StringUtils.join(new String[] {null, "a", ""}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28164);assertEquals("foo", StringUtils.join(MIXED_ARRAY_LIST));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28165);assertEquals("foo2", StringUtils.join(MIXED_TYPE_LIST));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
        
    @Test
    public void testJoin_ArrayCharSeparator() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25y8u74lqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayCharSeparator",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28166,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25y8u74lqe(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28166);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28167);assertEquals(null, StringUtils.join((Object[]) null, ','));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28168);assertEquals(TEXT_LIST_CHAR, StringUtils.join(ARRAY_LIST, SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28169);assertEquals("", StringUtils.join(EMPTY_ARRAY_LIST, SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28170);assertEquals(";;foo", StringUtils.join(MIXED_ARRAY_LIST, SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28171);assertEquals("foo;2", StringUtils.join(MIXED_TYPE_LIST, SEPARATOR_CHAR));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28172);assertEquals("/", StringUtils.join(MIXED_ARRAY_LIST, '/', 0, MIXED_ARRAY_LIST.length-1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28173);assertEquals("foo", StringUtils.join(MIXED_TYPE_LIST, '/', 0, 1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28174);assertEquals("null", StringUtils.join(NULL_TO_STRING_LIST,'/', 0, 1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28175);assertEquals("foo/2", StringUtils.join(MIXED_TYPE_LIST, '/', 0, 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28176);assertEquals("2", StringUtils.join(MIXED_TYPE_LIST, '/', 1, 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28177);assertEquals("", StringUtils.join(MIXED_TYPE_LIST, '/', 2, 1));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testJoin_ArrayOfChars() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zcrcrtlqq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28178,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zcrcrtlqq(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28178);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28179);assertEquals(null, StringUtils.join((char[]) null, ','));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28180);assertEquals("1;2", StringUtils.join(CHAR_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28181);assertEquals("2", StringUtils.join(CHAR_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testJoin_ArrayOfBytes() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wywvbvlqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfBytes",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28182,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wywvbvlqu(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28182);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28183);assertEquals(null, StringUtils.join((byte[]) null, ','));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28184);assertEquals("1;2", StringUtils.join(BYTE_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28185);assertEquals("2", StringUtils.join(BYTE_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testJoin_ArrayOfInts() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28wtha0lqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfInts",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28186,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28wtha0lqy(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28186);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28187);assertEquals(null, StringUtils.join((int[]) null, ','));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28188);assertEquals("1;2", StringUtils.join(INT_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28189);assertEquals("2", StringUtils.join(INT_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testJoin_ArrayOfLongs() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23bxc6plr2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfLongs",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28190,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23bxc6plr2(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28190);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28191);assertEquals(null, StringUtils.join((long[]) null, ','));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28192);assertEquals("1;2", StringUtils.join(LONG_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28193);assertEquals("2", StringUtils.join(LONG_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testJoin_ArrayOfFloats() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vzbmtnlr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfFloats",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28194,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vzbmtnlr6(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28194);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28195);assertEquals(null, StringUtils.join((float[]) null, ','));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28196);assertEquals("1.0;2.0", StringUtils.join(FLOAT_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28197);assertEquals("2.0", StringUtils.join(FLOAT_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testJoin_ArrayOfDoubles() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sh1mvwlra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfDoubles",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28198,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sh1mvwlra(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28198);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28199);assertEquals(null, StringUtils.join((double[]) null, ','));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28200);assertEquals("1.0;2.0", StringUtils.join(DOUBLE_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28201);assertEquals("2.0", StringUtils.join(DOUBLE_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testJoin_ArrayOfShorts() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26pu7kllre();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayOfShorts",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28202,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26pu7kllre(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28202);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28203);assertEquals(null, StringUtils.join((short[]) null, ','));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28204);assertEquals("1;2", StringUtils.join(SHORT_PRIM_LIST, SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28205);assertEquals("2", StringUtils.join(SHORT_PRIM_LIST, SEPARATOR_CHAR, 1, 2));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testJoin_ArrayString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ijqc6mlri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_ArrayString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28206,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ijqc6mlri(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28206);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28207);assertEquals(null, StringUtils.join((Object[]) null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28208);assertEquals(TEXT_LIST_NOSEP, StringUtils.join(ARRAY_LIST, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28209);assertEquals(TEXT_LIST_NOSEP, StringUtils.join(ARRAY_LIST, ""));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28210);assertEquals("", StringUtils.join(NULL_ARRAY_LIST, null));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28211);assertEquals("", StringUtils.join(EMPTY_ARRAY_LIST, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28212);assertEquals("", StringUtils.join(EMPTY_ARRAY_LIST, ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28213);assertEquals("", StringUtils.join(EMPTY_ARRAY_LIST, SEPARATOR));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28214);assertEquals(TEXT_LIST, StringUtils.join(ARRAY_LIST, SEPARATOR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28215);assertEquals(",,foo", StringUtils.join(MIXED_ARRAY_LIST, SEPARATOR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28216);assertEquals("foo,2", StringUtils.join(MIXED_TYPE_LIST, SEPARATOR));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28217);assertEquals("/", StringUtils.join(MIXED_ARRAY_LIST, "/", 0, MIXED_ARRAY_LIST.length-1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28218);assertEquals("", StringUtils.join(MIXED_ARRAY_LIST, "", 0, MIXED_ARRAY_LIST.length-1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28219);assertEquals("foo", StringUtils.join(MIXED_TYPE_LIST, "/", 0, 1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28220);assertEquals("foo/2", StringUtils.join(MIXED_TYPE_LIST, "/", 0, 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28221);assertEquals("2", StringUtils.join(MIXED_TYPE_LIST, "/", 1, 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28222);assertEquals("", StringUtils.join(MIXED_TYPE_LIST, "/", 2, 1));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testJoin_IteratorChar() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2909zvylrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_IteratorChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28223,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2909zvylrz(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28223);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28224);assertEquals(null, StringUtils.join((Iterator<?>) null, ','));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28225);assertEquals(TEXT_LIST_CHAR, StringUtils.join(Arrays.asList(ARRAY_LIST).iterator(), SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28226);assertEquals("", StringUtils.join(Arrays.asList(NULL_ARRAY_LIST).iterator(), SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28227);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST).iterator(), SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28228);assertEquals("foo", StringUtils.join(Collections.singleton("foo").iterator(), 'x'));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testJoin_IteratorString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26yldyvls5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_IteratorString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28229,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26yldyvls5(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28229);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28230);assertEquals(null, StringUtils.join((Iterator<?>) null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28231);assertEquals(TEXT_LIST_NOSEP, StringUtils.join(Arrays.asList(ARRAY_LIST).iterator(), null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28232);assertEquals(TEXT_LIST_NOSEP, StringUtils.join(Arrays.asList(ARRAY_LIST).iterator(), ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28233);assertEquals("foo", StringUtils.join(Collections.singleton("foo").iterator(), "x"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28234);assertEquals("foo", StringUtils.join(Collections.singleton("foo").iterator(), null));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28235);assertEquals("", StringUtils.join(Arrays.asList(NULL_ARRAY_LIST).iterator(), null));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28236);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST).iterator(), null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28237);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST).iterator(), ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28238);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST).iterator(), SEPARATOR));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28239);assertEquals(TEXT_LIST, StringUtils.join(Arrays.asList(ARRAY_LIST).iterator(), SEPARATOR));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testJoin_IterableChar() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yt1f9qlsg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_IterableChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28240,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yt1f9qlsg(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28240);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28241);assertEquals(null, StringUtils.join((Iterable<?>) null, ','));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28242);assertEquals(TEXT_LIST_CHAR, StringUtils.join(Arrays.asList(ARRAY_LIST), SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28243);assertEquals("", StringUtils.join(Arrays.asList(NULL_ARRAY_LIST), SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28244);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), SEPARATOR_CHAR));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28245);assertEquals("foo", StringUtils.join(Collections.singleton("foo"), 'x'));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testJoin_IterableString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28rbj4dlsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testJoin_IterableString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28246,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28rbj4dlsm(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28246);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28247);assertEquals(null, StringUtils.join((Iterable<?>) null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28248);assertEquals(TEXT_LIST_NOSEP, StringUtils.join(Arrays.asList(ARRAY_LIST), null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28249);assertEquals(TEXT_LIST_NOSEP, StringUtils.join(Arrays.asList(ARRAY_LIST), ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28250);assertEquals("foo", StringUtils.join(Collections.singleton("foo"), "x"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28251);assertEquals("foo", StringUtils.join(Collections.singleton("foo"), null));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28252);assertEquals("", StringUtils.join(Arrays.asList(NULL_ARRAY_LIST), null));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28253);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28254);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28255);assertEquals("", StringUtils.join(Arrays.asList(EMPTY_ARRAY_LIST), SEPARATOR));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28256);assertEquals(TEXT_LIST, StringUtils.join(Arrays.asList(ARRAY_LIST), SEPARATOR));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testSplit_String() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sdgkbzlsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplit_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28257,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sdgkbzlsx(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28257);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28258);assertArrayEquals(null, StringUtils.split(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28259);assertEquals(0, StringUtils.split("").length);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28260);String str = "a b  .c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28261);String[] res = StringUtils.split(str);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28262);assertEquals(3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28263);assertEquals("a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28264);assertEquals("b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28265);assertEquals(".c", res[2]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28266);str = " a ";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28267);res = StringUtils.split(str);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28268);assertEquals(1, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28269);assertEquals("a", res[0]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28270);str = "a" + WHITESPACE + "b" + NON_WHITESPACE + "c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28271);res = StringUtils.split(str);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28272);assertEquals(2, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28273);assertEquals("a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28274);assertEquals("b" + NON_WHITESPACE + "c", res[1]);                       
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testSplit_StringChar() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dymnj9ltf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplit_StringChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28275,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dymnj9ltf(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28275);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28276);assertArrayEquals(null, StringUtils.split(null, '.'));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28277);assertEquals(0, StringUtils.split("", '.').length);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28278);String str = "a.b.. c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28279);String[] res = StringUtils.split(str, '.');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28280);assertEquals(3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28281);assertEquals("a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28282);assertEquals("b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28283);assertEquals(" c", res[2]);
            
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28284);str = ".a.";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28285);res = StringUtils.split(str, '.');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28286);assertEquals(1, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28287);assertEquals("a", res[0]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28288);str = "a b c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28289);res = StringUtils.split(str,' ');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28290);assertEquals(3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28291);assertEquals("a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28292);assertEquals("b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28293);assertEquals("c", res[2]);
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testSplit_StringString_StringStringInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2u4000ilty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplit_StringString_StringStringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28294,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2u4000ilty(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28294);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28295);assertArrayEquals(null, StringUtils.split(null, "."));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28296);assertArrayEquals(null, StringUtils.split(null, ".", 3));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28297);assertEquals(0, StringUtils.split("", ".").length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28298);assertEquals(0, StringUtils.split("", ".", 3).length);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28299);innerTestSplit('.', ".", ' ');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28300);innerTestSplit('.', ".", ',');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28301);innerTestSplit('.', ".,", 'x');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28302);for (int i = 0; (((i < WHITESPACE.length())&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28303)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28304)==0&false)); i++) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28305);for (int j = 0; (((j < NON_WHITESPACE.length())&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28306)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28307)==0&false)); j++) {{
                __CLR4_1_2lnxlnxl3lqxu48.R.inc(28308);innerTestSplit(WHITESPACE.charAt(i), null, NON_WHITESPACE.charAt(j));
                __CLR4_1_2lnxlnxl3lqxu48.R.inc(28309);innerTestSplit(WHITESPACE.charAt(i), String.valueOf(WHITESPACE.charAt(i)), NON_WHITESPACE.charAt(j));
            }
        }}
        
        }__CLR4_1_2lnxlnxl3lqxu48.R.inc(28310);String[] results;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28311);final String[] expectedResults = {"ab", "de fg"};
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28312);results = StringUtils.split("ab   de fg", null, 2);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28313);assertEquals(expectedResults.length, results.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28314);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28315)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28316)==0&false)); i++) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28317);assertEquals(expectedResults[i], results[i]);
        }
        
        }__CLR4_1_2lnxlnxl3lqxu48.R.inc(28318);final String[] expectedResults2 = {"ab", "cd:ef"};
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28319);results = StringUtils.split("ab:cd:ef",":", 2);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28320);assertEquals(expectedResults2.length, results.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28321);for (int i = 0; (((i < expectedResults2.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28322)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28323)==0&false)); i++) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28324);assertEquals(expectedResults2[i], results[i]);
        }
    }}finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    private void innerTestSplit(final char separator, final String sepStr, final char noMatch) {try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28325);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28326);final String msg = "Failed on separator hex(" + Integer.toHexString(separator) +
            "), noMatch hex(" + Integer.toHexString(noMatch) + "), sepStr(" + sepStr + ")";
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28327);final String str = "a" + separator + "b" + separator + separator + noMatch + "c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28328);String[] res;
        // (str, sepStr)
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28329);res = StringUtils.split(str, sepStr);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28330);assertEquals(msg, 3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28331);assertEquals(msg, "a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28332);assertEquals(msg, "b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28333);assertEquals(msg, noMatch + "c", res[2]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28334);final String str2 = separator + "a" + separator;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28335);res = StringUtils.split(str2, sepStr);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28336);assertEquals(msg, 1, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28337);assertEquals(msg, "a", res[0]);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28338);res = StringUtils.split(str, sepStr, -1);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28339);assertEquals(msg, 3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28340);assertEquals(msg, "a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28341);assertEquals(msg, "b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28342);assertEquals(msg, noMatch + "c", res[2]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28343);res = StringUtils.split(str, sepStr, 0);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28344);assertEquals(msg, 3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28345);assertEquals(msg, "a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28346);assertEquals(msg, "b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28347);assertEquals(msg, noMatch + "c", res[2]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28348);res = StringUtils.split(str, sepStr, 1);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28349);assertEquals(msg, 1, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28350);assertEquals(msg, str, res[0]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28351);res = StringUtils.split(str, sepStr, 2);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28352);assertEquals(msg, 2, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28353);assertEquals(msg, "a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28354);assertEquals(msg, str.substring(2), res[1]);
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testSplitByWholeString_StringStringBoolean() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ri3upjlvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitByWholeString_StringStringBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28355,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ri3upjlvn(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28355);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28356);assertArrayEquals( null, StringUtils.splitByWholeSeparator( null, "." ) ) ;

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28357);assertEquals( 0, StringUtils.splitByWholeSeparator( "", "." ).length ) ;

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28358);final String stringToSplitOnNulls = "ab   de fg" ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28359);final String[] splitOnNullExpectedResults = { "ab", "de", "fg" } ;

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28360);final String[] splitOnNullResults = StringUtils.splitByWholeSeparator( stringToSplitOnNulls, null ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28361);assertEquals( splitOnNullExpectedResults.length, splitOnNullResults.length ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28362);for ( int i = 0 ; (((i < splitOnNullExpectedResults.length )&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28363)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28364)==0&false)); i+= 1 ) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28365);assertEquals( splitOnNullExpectedResults[i], splitOnNullResults[i] ) ;
        }

        }__CLR4_1_2lnxlnxl3lqxu48.R.inc(28366);final String stringToSplitOnCharactersAndString = "abstemiouslyaeiouyabstemiously" ;

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28367);final String[] splitOnStringExpectedResults = { "abstemiously", "abstemiously" } ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28368);final String[] splitOnStringResults = StringUtils.splitByWholeSeparator( stringToSplitOnCharactersAndString, "aeiouy" ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28369);assertEquals( splitOnStringExpectedResults.length, splitOnStringResults.length ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28370);for ( int i = 0 ; (((i < splitOnStringExpectedResults.length )&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28371)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28372)==0&false)); i+= 1 ) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28373);assertEquals( splitOnStringExpectedResults[i], splitOnStringResults[i] ) ;
        }

        }__CLR4_1_2lnxlnxl3lqxu48.R.inc(28374);final String[] splitWithMultipleSeparatorExpectedResults = {"ab", "cd", "ef"};
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28375);final String[] splitWithMultipleSeparator = StringUtils.splitByWholeSeparator("ab:cd::ef", ":");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28376);assertEquals( splitWithMultipleSeparatorExpectedResults.length, splitWithMultipleSeparator.length );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28377);for( int i = 0; (((i < splitWithMultipleSeparatorExpectedResults.length )&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28378)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28379)==0&false)); i++ ) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28380);assertEquals( splitWithMultipleSeparatorExpectedResults[i], splitWithMultipleSeparator[i] ) ;
        }
    }}finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testSplitByWholeString_StringStringBooleanInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qihsxmlwd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitByWholeString_StringStringBooleanInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28381,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qihsxmlwd(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28381);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28382);assertArrayEquals( null, StringUtils.splitByWholeSeparator( null, ".", 3 ) ) ;

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28383);assertEquals( 0, StringUtils.splitByWholeSeparator( "", ".", 3 ).length ) ;

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28384);final String stringToSplitOnNulls = "ab   de fg" ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28385);final String[] splitOnNullExpectedResults = { "ab", "de fg" } ;
        //String[] splitOnNullExpectedResults = { "ab", "de" } ;

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28386);final String[] splitOnNullResults = StringUtils.splitByWholeSeparator( stringToSplitOnNulls, null, 2 ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28387);assertEquals( splitOnNullExpectedResults.length, splitOnNullResults.length ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28388);for ( int i = 0 ; (((i < splitOnNullExpectedResults.length )&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28389)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28390)==0&false)); i+= 1 ) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28391);assertEquals( splitOnNullExpectedResults[i], splitOnNullResults[i] ) ;
        }

        }__CLR4_1_2lnxlnxl3lqxu48.R.inc(28392);final String stringToSplitOnCharactersAndString = "abstemiouslyaeiouyabstemiouslyaeiouyabstemiously" ;

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28393);final String[] splitOnStringExpectedResults = { "abstemiously", "abstemiouslyaeiouyabstemiously" } ;
        //String[] splitOnStringExpectedResults = { "abstemiously", "abstemiously" } ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28394);final String[] splitOnStringResults = StringUtils.splitByWholeSeparator( stringToSplitOnCharactersAndString, "aeiouy", 2 ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28395);assertEquals( splitOnStringExpectedResults.length, splitOnStringResults.length ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28396);for ( int i = 0 ; (((i < splitOnStringExpectedResults.length )&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28397)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28398)==0&false)); i++ ) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28399);assertEquals( splitOnStringExpectedResults[i], splitOnStringResults[i] ) ;
        }
    }}finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testSplitByWholeSeparatorPreserveAllTokens_StringStringInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wx5nhzlww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitByWholeSeparatorPreserveAllTokens_StringStringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28400,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wx5nhzlww(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28400);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28401);assertArrayEquals( null, StringUtils.splitByWholeSeparatorPreserveAllTokens( null, ".", -1 ) ) ;

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28402);assertEquals( 0, StringUtils.splitByWholeSeparatorPreserveAllTokens( "", ".", -1 ).length ) ;

        // test whitespace
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28403);String input = "ab   de fg" ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28404);String[] expected = new String[] { "ab", "", "", "de", "fg" } ;

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28405);String[] actual = StringUtils.splitByWholeSeparatorPreserveAllTokens( input, null, -1 ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28406);assertEquals( expected.length, actual.length ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28407);for ( int i = 0 ; (((i < actual.length )&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28408)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28409)==0&false)); i+= 1 ) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28410);assertEquals( expected[i], actual[i] );
        }

        // test delimiter singlechar
        }__CLR4_1_2lnxlnxl3lqxu48.R.inc(28411);input = "1::2:::3::::4";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28412);expected = new String[] { "1", "", "2", "", "", "3", "", "", "", "4" };

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28413);actual = StringUtils.splitByWholeSeparatorPreserveAllTokens( input, ":", -1 ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28414);assertEquals( expected.length, actual.length ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28415);for ( int i = 0 ; (((i < actual.length )&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28416)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28417)==0&false)); i+= 1 ) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28418);assertEquals( expected[i], actual[i] );
        }

        // test delimiter multichar
        }__CLR4_1_2lnxlnxl3lqxu48.R.inc(28419);input = "1::2:::3::::4";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28420);expected = new String[] { "1", "2", ":3", "", "4" };

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28421);actual = StringUtils.splitByWholeSeparatorPreserveAllTokens( input, "::", -1 ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28422);assertEquals( expected.length, actual.length ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28423);for ( int i = 0 ; (((i < actual.length )&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28424)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28425)==0&false)); i+= 1 ) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28426);assertEquals( expected[i], actual[i] );
        }

        // test delimiter char with max
        }__CLR4_1_2lnxlnxl3lqxu48.R.inc(28427);input = "1::2::3:4";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28428);expected = new String[] { "1", "", "2", ":3:4" };

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28429);actual = StringUtils.splitByWholeSeparatorPreserveAllTokens( input, ":", 4 ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28430);assertEquals( expected.length, actual.length ) ;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28431);for ( int i = 0 ; (((i < actual.length )&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28432)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28433)==0&false)); i+= 1 ) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28434);assertEquals( expected[i], actual[i] );
        }
    }}finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testSplitPreserveAllTokens_String() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2se03tclxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitPreserveAllTokens_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28435,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2se03tclxv(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28435);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28436);assertArrayEquals(null, StringUtils.splitPreserveAllTokens(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28437);assertEquals(0, StringUtils.splitPreserveAllTokens("").length);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28438);String str = "abc def";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28439);String[] res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28440);assertEquals(2, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28441);assertEquals("abc", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28442);assertEquals("def", res[1]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28443);str = "abc  def";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28444);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28445);assertEquals(3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28446);assertEquals("abc", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28447);assertEquals("", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28448);assertEquals("def", res[2]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28449);str = " abc ";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28450);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28451);assertEquals(3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28452);assertEquals("", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28453);assertEquals("abc", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28454);assertEquals("", res[2]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28455);str = "a b .c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28456);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28457);assertEquals(3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28458);assertEquals("a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28459);assertEquals("b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28460);assertEquals(".c", res[2]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28461);str = " a b .c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28462);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28463);assertEquals(4, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28464);assertEquals("", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28465);assertEquals("a", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28466);assertEquals("b", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28467);assertEquals(".c", res[3]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28468);str = "a  b  .c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28469);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28470);assertEquals(5, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28471);assertEquals("a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28472);assertEquals("", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28473);assertEquals("b", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28474);assertEquals("", res[3]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28475);assertEquals(".c", res[4]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28476);str = " a  ";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28477);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28478);assertEquals(4, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28479);assertEquals("", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28480);assertEquals("a", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28481);assertEquals("", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28482);assertEquals("", res[3]);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28483);str = " a  b";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28484);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28485);assertEquals(4, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28486);assertEquals("", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28487);assertEquals("a", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28488);assertEquals("", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28489);assertEquals("b", res[3]);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28490);str = "a" + WHITESPACE + "b" + NON_WHITESPACE + "c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28491);res = StringUtils.splitPreserveAllTokens(str);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28492);assertEquals(WHITESPACE.length() + 1, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28493);assertEquals("a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28494);for(int i = 1; (((i < WHITESPACE.length()-1)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28495)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28496)==0&false)); i++)
        {{
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28497);assertEquals("", res[i]);
        }
        }__CLR4_1_2lnxlnxl3lqxu48.R.inc(28498);assertEquals("b" + NON_WHITESPACE + "c", res[WHITESPACE.length()]);                       
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testSplitPreserveAllTokens_StringChar() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kv88belzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitPreserveAllTokens_StringChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28499,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kv88belzn(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28499);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28500);assertArrayEquals(null, StringUtils.splitPreserveAllTokens(null, '.'));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28501);assertEquals(0, StringUtils.splitPreserveAllTokens("", '.').length);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28502);String str = "a.b. c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28503);String[] res = StringUtils.splitPreserveAllTokens(str, '.');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28504);assertEquals(3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28505);assertEquals("a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28506);assertEquals("b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28507);assertEquals(" c", res[2]);
            
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28508);str = "a.b.. c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28509);res = StringUtils.splitPreserveAllTokens(str, '.');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28510);assertEquals(4, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28511);assertEquals("a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28512);assertEquals("b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28513);assertEquals("", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28514);assertEquals(" c", res[3]);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28515);str = ".a.";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28516);res = StringUtils.splitPreserveAllTokens(str, '.');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28517);assertEquals(3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28518);assertEquals("", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28519);assertEquals("a", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28520);assertEquals("", res[2]);
       
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28521);str = ".a..";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28522);res = StringUtils.splitPreserveAllTokens(str, '.');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28523);assertEquals(4, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28524);assertEquals("", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28525);assertEquals("a", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28526);assertEquals("", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28527);assertEquals("", res[3]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28528);str = "..a.";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28529);res = StringUtils.splitPreserveAllTokens(str, '.');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28530);assertEquals(4, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28531);assertEquals("", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28532);assertEquals("", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28533);assertEquals("a", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28534);assertEquals("", res[3]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28535);str = "..a";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28536);res = StringUtils.splitPreserveAllTokens(str, '.');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28537);assertEquals(3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28538);assertEquals("", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28539);assertEquals("", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28540);assertEquals("a", res[2]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28541);str = "a b c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28542);res = StringUtils.splitPreserveAllTokens(str,' ');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28543);assertEquals(3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28544);assertEquals("a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28545);assertEquals("b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28546);assertEquals("c", res[2]);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28547);str = "a  b  c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28548);res = StringUtils.splitPreserveAllTokens(str,' ');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28549);assertEquals(5, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28550);assertEquals("a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28551);assertEquals("", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28552);assertEquals("b", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28553);assertEquals("", res[3]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28554);assertEquals("c", res[4]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28555);str = " a b c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28556);res = StringUtils.splitPreserveAllTokens(str,' ');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28557);assertEquals(4, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28558);assertEquals("", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28559);assertEquals("a", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28560);assertEquals("b", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28561);assertEquals("c", res[3]);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28562);str = "  a b c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28563);res = StringUtils.splitPreserveAllTokens(str,' ');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28564);assertEquals(5, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28565);assertEquals("", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28566);assertEquals("", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28567);assertEquals("a", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28568);assertEquals("b", res[3]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28569);assertEquals("c", res[4]);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28570);str = "a b c ";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28571);res = StringUtils.splitPreserveAllTokens(str,' ');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28572);assertEquals(4, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28573);assertEquals("a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28574);assertEquals("b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28575);assertEquals("c", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28576);assertEquals("", res[3]);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28577);str = "a b c  ";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28578);res = StringUtils.splitPreserveAllTokens(str,' ');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28579);assertEquals(5, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28580);assertEquals("a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28581);assertEquals("b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28582);assertEquals("c", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28583);assertEquals("", res[3]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28584);assertEquals("", res[3]);

        // Match example in javadoc
        {
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28585);String[] results;
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28586);final String[] expectedResults = {"a", "", "b", "c"};
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28587);results = StringUtils.splitPreserveAllTokens("a..b.c",'.');
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28588);assertEquals(expectedResults.length, results.length);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28589);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28590)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28591)==0&false)); i++) {{
              __CLR4_1_2lnxlnxl3lqxu48.R.inc(28592);assertEquals(expectedResults[i], results[i]);
          }
        }}
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testSplitPreserveAllTokens_StringString_StringStringInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mz395dm29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitPreserveAllTokens_StringString_StringStringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28593,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mz395dm29(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28593);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28594);assertArrayEquals(null, StringUtils.splitPreserveAllTokens(null, "."));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28595);assertArrayEquals(null, StringUtils.splitPreserveAllTokens(null, ".", 3));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28596);assertEquals(0, StringUtils.splitPreserveAllTokens("", ".").length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28597);assertEquals(0, StringUtils.splitPreserveAllTokens("", ".", 3).length);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28598);innerTestSplitPreserveAllTokens('.', ".", ' ');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28599);innerTestSplitPreserveAllTokens('.', ".", ',');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28600);innerTestSplitPreserveAllTokens('.', ".,", 'x');
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28601);for (int i = 0; (((i < WHITESPACE.length())&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28602)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28603)==0&false)); i++) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28604);for (int j = 0; (((j < NON_WHITESPACE.length())&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28605)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28606)==0&false)); j++) {{
                __CLR4_1_2lnxlnxl3lqxu48.R.inc(28607);innerTestSplitPreserveAllTokens(WHITESPACE.charAt(i), null, NON_WHITESPACE.charAt(j));
                __CLR4_1_2lnxlnxl3lqxu48.R.inc(28608);innerTestSplitPreserveAllTokens(WHITESPACE.charAt(i), String.valueOf(WHITESPACE.charAt(i)), NON_WHITESPACE.charAt(j));
            }
        }}

        }{
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28609);String[] results;
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28610);final String[] expectedResults = {"ab", "de fg"};
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28611);results = StringUtils.splitPreserveAllTokens("ab de fg", null, 2);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28612);assertEquals(expectedResults.length, results.length);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28613);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28614)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28615)==0&false)); i++) {{
              __CLR4_1_2lnxlnxl3lqxu48.R.inc(28616);assertEquals(expectedResults[i], results[i]);
          }
        }}

        {
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28617);String[] results;
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28618);final String[] expectedResults = {"ab", "  de fg"};
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28619);results = StringUtils.splitPreserveAllTokens("ab   de fg", null, 2);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28620);assertEquals(expectedResults.length, results.length);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28621);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28622)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28623)==0&false)); i++) {{
              __CLR4_1_2lnxlnxl3lqxu48.R.inc(28624);assertEquals(expectedResults[i], results[i]);
          }
        }}
        
        {
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28625);String[] results;
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28626);final String[] expectedResults = {"ab", "::de:fg"};
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28627);results = StringUtils.splitPreserveAllTokens("ab:::de:fg", ":", 2);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28628);assertEquals(expectedResults.length, results.length);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28629);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28630)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28631)==0&false)); i++) {{
              __CLR4_1_2lnxlnxl3lqxu48.R.inc(28632);assertEquals(expectedResults[i], results[i]);
          }
        }}
        
        {
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28633);String[] results;
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28634);final String[] expectedResults = {"ab", "", " de fg"};
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28635);results = StringUtils.splitPreserveAllTokens("ab   de fg", null, 3);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28636);assertEquals(expectedResults.length, results.length);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28637);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28638)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28639)==0&false)); i++) {{
              __CLR4_1_2lnxlnxl3lqxu48.R.inc(28640);assertEquals(expectedResults[i], results[i]);
          }
        }}
        
        {
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28641);String[] results;
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28642);final String[] expectedResults = {"ab", "", "", "de fg"};
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28643);results = StringUtils.splitPreserveAllTokens("ab   de fg", null, 4);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28644);assertEquals(expectedResults.length, results.length);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28645);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28646)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28647)==0&false)); i++) {{
              __CLR4_1_2lnxlnxl3lqxu48.R.inc(28648);assertEquals(expectedResults[i], results[i]);
          }
        }}

        {
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28649);final String[] expectedResults = {"ab", "cd:ef"};
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28650);String[] results;
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28651);results = StringUtils.splitPreserveAllTokens("ab:cd:ef",":", 2);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28652);assertEquals(expectedResults.length, results.length);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28653);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28654)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28655)==0&false)); i++) {{
              __CLR4_1_2lnxlnxl3lqxu48.R.inc(28656);assertEquals(expectedResults[i], results[i]);
          }
        }}

        {
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28657);String[] results;
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28658);final String[] expectedResults = {"ab", ":cd:ef"};
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28659);results = StringUtils.splitPreserveAllTokens("ab::cd:ef",":", 2);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28660);assertEquals(expectedResults.length, results.length);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28661);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28662)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28663)==0&false)); i++) {{
              __CLR4_1_2lnxlnxl3lqxu48.R.inc(28664);assertEquals(expectedResults[i], results[i]);
          }
        }}

        {
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28665);String[] results;
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28666);final String[] expectedResults = {"ab", "", ":cd:ef"};
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28667);results = StringUtils.splitPreserveAllTokens("ab:::cd:ef",":", 3);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28668);assertEquals(expectedResults.length, results.length);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28669);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28670)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28671)==0&false)); i++) {{
              __CLR4_1_2lnxlnxl3lqxu48.R.inc(28672);assertEquals(expectedResults[i], results[i]);
          }
        }}

        {
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28673);String[] results;
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28674);final String[] expectedResults = {"ab", "", "", "cd:ef"};
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28675);results = StringUtils.splitPreserveAllTokens("ab:::cd:ef",":", 4);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28676);assertEquals(expectedResults.length, results.length);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28677);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28678)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28679)==0&false)); i++) {{
              __CLR4_1_2lnxlnxl3lqxu48.R.inc(28680);assertEquals(expectedResults[i], results[i]);
          }
        }}

        {
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28681);String[] results;
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28682);final String[] expectedResults = {"", "ab", "", "", "cd:ef"};
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28683);results = StringUtils.splitPreserveAllTokens(":ab:::cd:ef",":", 5);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28684);assertEquals(expectedResults.length, results.length);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28685);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28686)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28687)==0&false)); i++) {{
              __CLR4_1_2lnxlnxl3lqxu48.R.inc(28688);assertEquals(expectedResults[i], results[i]);
          }
        }}
        
        {
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28689);String[] results;
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28690);final String[] expectedResults = {"", "", "ab", "", "", "cd:ef"};
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28691);results = StringUtils.splitPreserveAllTokens("::ab:::cd:ef",":", 6);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28692);assertEquals(expectedResults.length, results.length);
          __CLR4_1_2lnxlnxl3lqxu48.R.inc(28693);for (int i = 0; (((i < expectedResults.length)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28694)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(28695)==0&false)); i++) {{
              __CLR4_1_2lnxlnxl3lqxu48.R.inc(28696);assertEquals(expectedResults[i], results[i]);
          }
        }}
        
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    private void innerTestSplitPreserveAllTokens(final char separator, final String sepStr, final char noMatch) {try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28697);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28698);final String msg = "Failed on separator hex(" + Integer.toHexString(separator) +
            "), noMatch hex(" + Integer.toHexString(noMatch) + "), sepStr(" + sepStr + ")";
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28699);final String str = "a" + separator + "b" + separator + separator + noMatch + "c";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28700);String[] res;
        // (str, sepStr)
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28701);res = StringUtils.splitPreserveAllTokens(str, sepStr);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28702);assertEquals(msg, 4, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28703);assertEquals(msg, "a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28704);assertEquals(msg, "b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28705);assertEquals(msg, "", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28706);assertEquals(msg, noMatch + "c", res[3]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28707);final String str2 = separator + "a" + separator;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28708);res = StringUtils.splitPreserveAllTokens(str2, sepStr);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28709);assertEquals(msg, 3, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28710);assertEquals(msg, "", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28711);assertEquals(msg, "a", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28712);assertEquals(msg, "", res[2]);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28713);res = StringUtils.splitPreserveAllTokens(str, sepStr, -1);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28714);assertEquals(msg, 4, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28715);assertEquals(msg, "a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28716);assertEquals(msg, "b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28717);assertEquals(msg, "", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28718);assertEquals(msg, noMatch + "c", res[3]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28719);res = StringUtils.splitPreserveAllTokens(str, sepStr, 0);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28720);assertEquals(msg, 4, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28721);assertEquals(msg, "a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28722);assertEquals(msg, "b", res[1]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28723);assertEquals(msg, "", res[2]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28724);assertEquals(msg, noMatch + "c", res[3]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28725);res = StringUtils.splitPreserveAllTokens(str, sepStr, 1);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28726);assertEquals(msg, 1, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28727);assertEquals(msg, str, res[0]);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28728);res = StringUtils.splitPreserveAllTokens(str, sepStr, 2);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28729);assertEquals(msg, 2, res.length);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28730);assertEquals(msg, "a", res[0]);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28731);assertEquals(msg, str.substring(2), res[1]);
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testSplitByCharacterType() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26vhf57m64();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitByCharacterType",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28732,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26vhf57m64(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28732);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28733);assertNull(StringUtils.splitByCharacterType(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28734);assertEquals(0, StringUtils.splitByCharacterType("").length);
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28735);assertTrue(ArrayUtils.isEquals(new String[] { "ab", " ", "de", " ",
        "fg" }, StringUtils.splitByCharacterType("ab de fg")));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28736);assertTrue(ArrayUtils.isEquals(new String[] { "ab", "   ", "de", " ",
        "fg" }, StringUtils.splitByCharacterType("ab   de fg")));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28737);assertTrue(ArrayUtils.isEquals(new String[] { "ab", ":", "cd", ":",
        "ef" }, StringUtils.splitByCharacterType("ab:cd:ef")));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28738);assertTrue(ArrayUtils.isEquals(new String[] { "number", "5" },
                StringUtils.splitByCharacterType("number5")));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28739);assertTrue(ArrayUtils.isEquals(new String[] { "foo", "B", "ar" },
                StringUtils.splitByCharacterType("fooBar")));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28740);assertTrue(ArrayUtils.isEquals(new String[] { "foo", "200", "B", "ar" },
                StringUtils.splitByCharacterType("foo200Bar")));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28741);assertTrue(ArrayUtils.isEquals(new String[] { "ASFR", "ules" },
                StringUtils.splitByCharacterType("ASFRules")));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testSplitByCharacterTypeCamelCase() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2akiyevm6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testSplitByCharacterTypeCamelCase",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28742,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2akiyevm6e(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28742);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28743);assertNull(StringUtils.splitByCharacterTypeCamelCase(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28744);assertEquals(0, StringUtils.splitByCharacterTypeCamelCase("").length);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28745);assertTrue(ArrayUtils.isEquals(new String[] { "ab", " ", "de", " ",
                "fg" }, StringUtils.splitByCharacterTypeCamelCase("ab de fg")));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28746);assertTrue(ArrayUtils.isEquals(new String[] { "ab", "   ", "de", " ",
                "fg" }, StringUtils.splitByCharacterTypeCamelCase("ab   de fg")));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28747);assertTrue(ArrayUtils.isEquals(new String[] { "ab", ":", "cd", ":",
                "ef" }, StringUtils.splitByCharacterTypeCamelCase("ab:cd:ef")));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28748);assertTrue(ArrayUtils.isEquals(new String[] { "number", "5" },
                StringUtils.splitByCharacterTypeCamelCase("number5")));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28749);assertTrue(ArrayUtils.isEquals(new String[] { "foo", "Bar" },
                StringUtils.splitByCharacterTypeCamelCase("fooBar")));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28750);assertTrue(ArrayUtils.isEquals(new String[] { "foo", "200", "Bar" },
                StringUtils.splitByCharacterTypeCamelCase("foo200Bar")));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28751);assertTrue(ArrayUtils.isEquals(new String[] { "ASF", "Rules" },
                StringUtils.splitByCharacterTypeCamelCase("ASFRules")));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testDeleteWhitespace_String() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i1q55vm6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDeleteWhitespace_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28752,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i1q55vm6o(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28752);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28753);assertEquals(null, StringUtils.deleteWhitespace(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28754);assertEquals("", StringUtils.deleteWhitespace(""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28755);assertEquals("", StringUtils.deleteWhitespace("    \t\t\n\n   "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28756);assertEquals("", StringUtils.deleteWhitespace(StringUtilsTest.WHITESPACE));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28757);assertEquals(StringUtilsTest.NON_WHITESPACE, StringUtils.deleteWhitespace(StringUtilsTest.NON_WHITESPACE));
        // Note: u-2007 and u-000A both cause problems in the source code
        // it should ignore 2007 but delete 000A
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28758);assertEquals("\u00a0\u202f", StringUtils.deleteWhitespace("  \u00a0  \t\t\n\n \u202f  "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28759);assertEquals("\u00a0\u202f", StringUtils.deleteWhitespace("\u00a0\u202f"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28760);assertEquals("test", StringUtils.deleteWhitespace("t  \t\n	e\rs\n\n   \tt"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testLang623() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bl9a2qm6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLang623",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28761,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bl9a2qm6x(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28761);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28762);assertEquals("t", StringUtils.replaceChars("\u00de", '\u00de', 't'));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28763);assertEquals("t", StringUtils.replaceChars("\u00fe", '\u00fe', 't'));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testReplace_StringStringString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pfsjefm70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplace_StringStringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28764,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pfsjefm70(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28764);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28765);assertEquals(null, StringUtils.replace(null, null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28766);assertEquals(null, StringUtils.replace(null, null, "any"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28767);assertEquals(null, StringUtils.replace(null, "any", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28768);assertEquals(null, StringUtils.replace(null, "any", "any"));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28769);assertEquals("", StringUtils.replace("", null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28770);assertEquals("", StringUtils.replace("", null, "any"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28771);assertEquals("", StringUtils.replace("", "any", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28772);assertEquals("", StringUtils.replace("", "any", "any"));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28773);assertEquals("FOO", StringUtils.replace("FOO", "", "any"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28774);assertEquals("FOO", StringUtils.replace("FOO", null, "any"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28775);assertEquals("FOO", StringUtils.replace("FOO", "F", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28776);assertEquals("FOO", StringUtils.replace("FOO", null, null));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28777);assertEquals("", StringUtils.replace("foofoofoo", "foo", ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28778);assertEquals("barbarbar", StringUtils.replace("foofoofoo", "foo", "bar"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28779);assertEquals("farfarfar", StringUtils.replace("foofoofoo", "oo", "ar"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testReplacePattern() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2de6sy3m7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplacePattern",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28780,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2de6sy3m7g(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28780);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28781);assertEquals("X", StringUtils.replacePattern("<A>\nxy\n</A>", "<A>.*</A>", "X"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testRemovePattern() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cwevpbm7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemovePattern",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28782,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cwevpbm7i(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28782);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28783);assertEquals("", StringUtils.removePattern("<A>x\\ny</A>", "<A>.*</A>"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testReplace_StringStringStringInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2avpi2im7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplace_StringStringStringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28784,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2avpi2im7k(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28784);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28785);assertEquals(null, StringUtils.replace(null, null, null, 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28786);assertEquals(null, StringUtils.replace(null, null, "any", 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28787);assertEquals(null, StringUtils.replace(null, "any", null, 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28788);assertEquals(null, StringUtils.replace(null, "any", "any", 2));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28789);assertEquals("", StringUtils.replace("", null, null, 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28790);assertEquals("", StringUtils.replace("", null, "any", 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28791);assertEquals("", StringUtils.replace("", "any", null, 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28792);assertEquals("", StringUtils.replace("", "any", "any", 2));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28793);final String str = new String(new char[] {'o', 'o', 'f', 'o', 'o'});
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28794);assertSame(str, StringUtils.replace(str, "x", "", -1));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28795);assertEquals("f", StringUtils.replace("oofoo", "o", "", -1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28796);assertEquals("oofoo", StringUtils.replace("oofoo", "o", "", 0));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28797);assertEquals("ofoo", StringUtils.replace("oofoo", "o", "", 1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28798);assertEquals("foo", StringUtils.replace("oofoo", "o", "", 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28799);assertEquals("fo", StringUtils.replace("oofoo", "o", "", 3));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28800);assertEquals("f", StringUtils.replace("oofoo", "o", "", 4));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28801);assertEquals("f", StringUtils.replace("oofoo", "o", "", -5));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28802);assertEquals("f", StringUtils.replace("oofoo", "o", "", 1000));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testReplaceOnce_StringStringString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2llx8fem83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplaceOnce_StringStringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28803,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2llx8fem83(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28803);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28804);assertEquals(null, StringUtils.replaceOnce(null, null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28805);assertEquals(null, StringUtils.replaceOnce(null, null, "any"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28806);assertEquals(null, StringUtils.replaceOnce(null, "any", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28807);assertEquals(null, StringUtils.replaceOnce(null, "any", "any"));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28808);assertEquals("", StringUtils.replaceOnce("", null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28809);assertEquals("", StringUtils.replaceOnce("", null, "any"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28810);assertEquals("", StringUtils.replaceOnce("", "any", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28811);assertEquals("", StringUtils.replaceOnce("", "any", "any"));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28812);assertEquals("FOO", StringUtils.replaceOnce("FOO", "", "any"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28813);assertEquals("FOO", StringUtils.replaceOnce("FOO", null, "any"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28814);assertEquals("FOO", StringUtils.replaceOnce("FOO", "F", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28815);assertEquals("FOO", StringUtils.replaceOnce("FOO", null, null));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28816);assertEquals("foofoo", StringUtils.replaceOnce("foofoofoo", "foo", ""));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    /**
     * Test method for 'StringUtils.replaceEach(String, String[], String[])'
     */
    @Test
    public void testReplace_StringStringArrayStringArray() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xr60mjm8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplace_StringStringArrayStringArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28817,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xr60mjm8h(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28817);
        //JAVADOC TESTS START
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28818);assertNull(StringUtils.replaceEach(null, new String[]{"a"}, new String[]{"b"}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28819);assertEquals(StringUtils.replaceEach("", new String[]{"a"}, new String[]{"b"}),"");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28820);assertEquals(StringUtils.replaceEach("aba", null, null),"aba");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28821);assertEquals(StringUtils.replaceEach("aba", new String[0], null),"aba");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28822);assertEquals(StringUtils.replaceEach("aba", null, new String[0]),"aba");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28823);assertEquals(StringUtils.replaceEach("aba", new String[]{"a"}, null),"aba");

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28824);assertEquals(StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{""}),"b");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28825);assertEquals(StringUtils.replaceEach("aba", new String[]{null}, new String[]{"a"}),"aba");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28826);assertEquals(StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}),"wcte");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28827);assertEquals(StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}),"dcte");
        //JAVADOC TESTS END

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28828);assertEquals("bcc", StringUtils.replaceEach("abc", new String[]{"a", "b"}, new String[]{"b", "c"}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28829);assertEquals("q651.506bera", StringUtils.replaceEach("d216.102oren",
            new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", 
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", 
                "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
                "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9"},
            new String[]{"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", 
                "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "N", "O", "P", "Q", 
                "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", 
                "H", "I", "J", "K", "L", "M", "5", "6", "7", "8", "9", "1", "2", "3", "4"}));

        // Test null safety inside arrays - LANG-552
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28830);assertEquals(StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{null}),"aba");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28831);assertEquals(StringUtils.replaceEach("aba", new String[]{"a", "b"}, new String[]{"c", null}),"cbc");
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    /**
     * Test method for 'StringUtils.replaceEachRepeatedly(String, String[], String[])'
     */
    @Test
    public void testReplace_StringStringArrayStringArrayBoolean() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hqk39dm8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplace_StringStringArrayStringArrayBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28832,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hqk39dm8w(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28832);
        //JAVADOC TESTS START
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28833);assertNull(StringUtils.replaceEachRepeatedly(null, new String[]{"a"}, new String[]{"b"}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28834);assertEquals(StringUtils.replaceEachRepeatedly("", new String[]{"a"}, new String[]{"b"}),"");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28835);assertEquals(StringUtils.replaceEachRepeatedly("aba", null, null),"aba");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28836);assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[0], null),"aba");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28837);assertEquals(StringUtils.replaceEachRepeatedly("aba", null, new String[0]),"aba");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28838);assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[0], null),"aba");

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28839);assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[]{"a"}, new String[]{""}),"b");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28840);assertEquals(StringUtils.replaceEachRepeatedly("aba", new String[]{null}, new String[]{"a"}),"aba");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28841);assertEquals(StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}),"wcte");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28842);assertEquals(StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}),"tcte");

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28843);try {
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28844);StringUtils.replaceEachRepeatedly("abcde", new String[]{"ab", "d"}, new String[]{"d", "ab"});
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28845);fail("Should be a circular reference");
        } catch (final IllegalStateException e) {}

        //JAVADOC TESTS END
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testReplaceChars_StringCharChar() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27pq7ncm9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplaceChars_StringCharChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28846,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27pq7ncm9a(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28846);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28847);assertEquals(null, StringUtils.replaceChars(null, 'b', 'z'));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28848);assertEquals("", StringUtils.replaceChars("", 'b', 'z'));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28849);assertEquals("azcza", StringUtils.replaceChars("abcba", 'b', 'z'));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28850);assertEquals("abcba", StringUtils.replaceChars("abcba", 'x', 'z'));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testReplaceChars_StringStringString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2y7n6wym9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReplaceChars_StringStringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28851,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2y7n6wym9f(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28851);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28852);assertEquals(null, StringUtils.replaceChars(null, null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28853);assertEquals(null, StringUtils.replaceChars(null, "", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28854);assertEquals(null, StringUtils.replaceChars(null, "a", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28855);assertEquals(null, StringUtils.replaceChars(null, null, ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28856);assertEquals(null, StringUtils.replaceChars(null, null, "x"));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28857);assertEquals("", StringUtils.replaceChars("", null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28858);assertEquals("", StringUtils.replaceChars("", "", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28859);assertEquals("", StringUtils.replaceChars("", "a", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28860);assertEquals("", StringUtils.replaceChars("", null, ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28861);assertEquals("", StringUtils.replaceChars("", null, "x"));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28862);assertEquals("abc", StringUtils.replaceChars("abc", null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28863);assertEquals("abc", StringUtils.replaceChars("abc", null, ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28864);assertEquals("abc", StringUtils.replaceChars("abc", null, "x"));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28865);assertEquals("abc", StringUtils.replaceChars("abc", "", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28866);assertEquals("abc", StringUtils.replaceChars("abc", "", ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28867);assertEquals("abc", StringUtils.replaceChars("abc", "", "x"));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28868);assertEquals("ac", StringUtils.replaceChars("abc", "b", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28869);assertEquals("ac", StringUtils.replaceChars("abc", "b", ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28870);assertEquals("axc", StringUtils.replaceChars("abc", "b", "x"));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28871);assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28872);assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28873);assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yzx"));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28874);assertEquals("abcba", StringUtils.replaceChars("abcba", "z", "w"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28875);assertSame("abcba", StringUtils.replaceChars("abcba", "z", "w"));
        
        // Javadoc examples:
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28876);assertEquals("jelly", StringUtils.replaceChars("hello", "ho", "jy"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28877);assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28878);assertEquals("ayya", StringUtils.replaceChars("abcba", "bc", "y"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28879);assertEquals("ayzya", StringUtils.replaceChars("abcba", "bc", "yzx"));
        
        // From http://issues.apache.org/bugzilla/show_bug.cgi?id=25454
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28880);assertEquals("bcc", StringUtils.replaceChars("abc", "ab", "bc"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28881);assertEquals("q651.506bera", StringUtils.replaceChars("d216.102oren",
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789",
            "nopqrstuvwxyzabcdefghijklmNOPQRSTUVWXYZABCDEFGHIJKLM567891234"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testOverlay_StringStringIntInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26tifqimaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testOverlay_StringStringIntInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28882,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26tifqimaa(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28882);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28883);assertEquals(null, StringUtils.overlay(null, null, 2, 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28884);assertEquals(null, StringUtils.overlay(null, null, -2, -4));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28885);assertEquals("", StringUtils.overlay("", null, 0, 0));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28886);assertEquals("", StringUtils.overlay("", "", 0, 0));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28887);assertEquals("zzzz", StringUtils.overlay("", "zzzz", 0, 0));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28888);assertEquals("zzzz", StringUtils.overlay("", "zzzz", 2, 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28889);assertEquals("zzzz", StringUtils.overlay("", "zzzz", -2, -4));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28890);assertEquals("abef", StringUtils.overlay("abcdef", null, 2, 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28891);assertEquals("abef", StringUtils.overlay("abcdef", null, 4, 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28892);assertEquals("abef", StringUtils.overlay("abcdef", "", 2, 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28893);assertEquals("abef", StringUtils.overlay("abcdef", "", 4, 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28894);assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 2, 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28895);assertEquals("abzzzzef", StringUtils.overlay("abcdef", "zzzz", 4, 2));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28896);assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", -1, 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28897);assertEquals("zzzzef", StringUtils.overlay("abcdef", "zzzz", 4, -1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28898);assertEquals("zzzzabcdef", StringUtils.overlay("abcdef", "zzzz", -2, -1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28899);assertEquals("zzzzabcdef", StringUtils.overlay("abcdef", "zzzz", -1, -2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28900);assertEquals("abcdzzzz", StringUtils.overlay("abcdef", "zzzz", 4, 10));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28901);assertEquals("abcdzzzz", StringUtils.overlay("abcdef", "zzzz", 10, 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28902);assertEquals("abcdefzzzz", StringUtils.overlay("abcdef", "zzzz", 8, 10));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28903);assertEquals("abcdefzzzz", StringUtils.overlay("abcdef", "zzzz", 10, 8));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testRepeat_StringInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_240c3pvmaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRepeat_StringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28904,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_240c3pvmaw(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28904);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28905);assertEquals(null, StringUtils.repeat(null, 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28906);assertEquals("", StringUtils.repeat("ab", 0));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28907);assertEquals("", StringUtils.repeat("", 3));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28908);assertEquals("aaa", StringUtils.repeat("a", 3));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28909);assertEquals("ababab", StringUtils.repeat("ab", 3));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28910);assertEquals("abcabcabc", StringUtils.repeat("abc", 3));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28911);final String str = StringUtils.repeat("a", 10000);  // bigger than pad limit
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28912);assertEquals(10000, str.length());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28913);assertTrue(StringUtils.containsOnly(str, new char[] {'a'}));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testRepeat_StringStringInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2usfnmqmb6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRepeat_StringStringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28914,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2usfnmqmb6(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28914);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28915);assertEquals(null, StringUtils.repeat(null, null, 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28916);assertEquals(null, StringUtils.repeat(null, "x", 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28917);assertEquals("", StringUtils.repeat("", null, 2));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28918);assertEquals("", StringUtils.repeat("ab", "", 0));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28919);assertEquals("", StringUtils.repeat("", "", 2));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28920);assertEquals("xx", StringUtils.repeat("", "x", 3));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28921);assertEquals("?, ?, ?", StringUtils.repeat("?", ", ", 3));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testChop() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23k2mtdmbe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testChop",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28922,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23k2mtdmbe(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28922);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28923);final String[][] chopCases = {
            { FOO_UNCAP + "\r\n", FOO_UNCAP } ,
            { FOO_UNCAP + "\n" , FOO_UNCAP } ,
            { FOO_UNCAP + "\r", FOO_UNCAP },
            { FOO_UNCAP + " \r", FOO_UNCAP + " " },
            { "foo", "fo"},
            { "foo\nfoo", "foo\nfo" },
            { "\n", "" },
            { "\r", "" },
            { "\r\n", "" },
            { null, null },
            { "", "" },
            { "a", "" },
        };
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28924);for (final String[] chopCase : chopCases) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28925);final String original = chopCase[0];
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28926);final String expectedResult = chopCase[1];
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28927);assertEquals("chop(String) failed",
                    expectedResult, StringUtils.chop(original));
        }
    }}finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @SuppressWarnings("deprecation") // intentional test of deprecated method
    @Test
    public void testChomp() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q6k98embk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testChomp",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28928,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q6k98embk(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28928);

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28929);final String[][] chompCases = {
            { FOO_UNCAP + "\r\n", FOO_UNCAP },
            { FOO_UNCAP + "\n" , FOO_UNCAP },
            { FOO_UNCAP + "\r", FOO_UNCAP },
            { FOO_UNCAP + " \r", FOO_UNCAP + " " },
            { FOO_UNCAP, FOO_UNCAP },
            { FOO_UNCAP + "\n\n", FOO_UNCAP + "\n"},
            { FOO_UNCAP + "\r\n\r\n", FOO_UNCAP + "\r\n" },
            { "foo\nfoo", "foo\nfoo" },
            { "foo\n\rfoo", "foo\n\rfoo" },
            { "\n", "" },
            { "\r", "" },
            { "a", "a" },
            { "\r\n", "" },
            { "", "" },
            { null, null },
            { FOO_UNCAP + "\n\r", FOO_UNCAP + "\n"}
        };
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28930);for (final String[] chompCase : chompCases) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28931);final String original = chompCase[0];
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28932);final String expectedResult = chompCase[1];
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(28933);assertEquals("chomp(String) failed",
                    expectedResult, StringUtils.chomp(original));
        }

        }__CLR4_1_2lnxlnxl3lqxu48.R.inc(28934);assertEquals("chomp(String, String) failed",
                "foo", StringUtils.chomp("foobar", "bar"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28935);assertEquals("chomp(String, String) failed",
                "foobar", StringUtils.chomp("foobar", "baz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28936);assertEquals("chomp(String, String) failed",
                "foo", StringUtils.chomp("foo", "foooo"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28937);assertEquals("chomp(String, String) failed",
                "foobar", StringUtils.chomp("foobar", ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28938);assertEquals("chomp(String, String) failed",
                "foobar", StringUtils.chomp("foobar", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28939);assertEquals("chomp(String, String) failed",
                "", StringUtils.chomp("", "foo"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28940);assertEquals("chomp(String, String) failed",
                "", StringUtils.chomp("", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28941);assertEquals("chomp(String, String) failed",
                "", StringUtils.chomp("", ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28942);assertEquals("chomp(String, String) failed",
                null, StringUtils.chomp(null, "foo"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28943);assertEquals("chomp(String, String) failed",
                null, StringUtils.chomp(null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28944);assertEquals("chomp(String, String) failed",
                null, StringUtils.chomp(null, ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28945);assertEquals("chomp(String, String) failed",
                "", StringUtils.chomp("foo", "foo"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28946);assertEquals("chomp(String, String) failed",
                " ", StringUtils.chomp(" foo", "foo"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28947);assertEquals("chomp(String, String) failed",
                "foo ", StringUtils.chomp("foo ", "foo"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testRightPad_StringInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rr5ki7mc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRightPad_StringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28948,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rr5ki7mc4(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28948);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28949);assertEquals(null, StringUtils.rightPad(null, 5));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28950);assertEquals("     ", StringUtils.rightPad("", 5));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28951);assertEquals("abc  ", StringUtils.rightPad("abc", 5));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28952);assertEquals("abc", StringUtils.rightPad("abc", 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28953);assertEquals("abc", StringUtils.rightPad("abc", -1));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testRightPad_StringIntChar() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tw7lj9mca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRightPad_StringIntChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28954,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tw7lj9mca(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28954);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28955);assertEquals(null, StringUtils.rightPad(null, 5, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28956);assertEquals("     ", StringUtils.rightPad("", 5, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28957);assertEquals("abc  ", StringUtils.rightPad("abc", 5, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28958);assertEquals("abc", StringUtils.rightPad("abc", 2, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28959);assertEquals("abc", StringUtils.rightPad("abc", -1, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28960);assertEquals("abcxx", StringUtils.rightPad("abc", 5, 'x'));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28961);final String str = StringUtils.rightPad("aaa", 10000, 'a');  // bigger than pad length
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28962);assertEquals(10000, str.length());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28963);assertTrue(StringUtils.containsOnly(str, new char[] {'a'}));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testRightPad_StringIntString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28964);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yrm04gmck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRightPad_StringIntString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28964,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yrm04gmck(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28964);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28965);assertEquals(null, StringUtils.rightPad(null, 5, "-+"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28966);assertEquals("     ", StringUtils.rightPad("", 5, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28967);assertEquals(null, StringUtils.rightPad(null, 8, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28968);assertEquals("abc-+-+", StringUtils.rightPad("abc", 7, "-+"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28969);assertEquals("abc-+~", StringUtils.rightPad("abc", 6, "-+~"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28970);assertEquals("abc-+", StringUtils.rightPad("abc", 5, "-+~"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28971);assertEquals("abc", StringUtils.rightPad("abc", 2, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28972);assertEquals("abc", StringUtils.rightPad("abc", -1, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28973);assertEquals("abc  ", StringUtils.rightPad("abc", 5, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28974);assertEquals("abc  ", StringUtils.rightPad("abc", 5, ""));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
        
    //-----------------------------------------------------------------------
    @Test
    public void testLeftPad_StringInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qoqj7kmcv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLeftPad_StringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28975,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qoqj7kmcv(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28975);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28976);assertEquals(null, StringUtils.leftPad(null, 5));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28977);assertEquals("     ", StringUtils.leftPad("", 5));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28978);assertEquals("  abc", StringUtils.leftPad("abc", 5));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28979);assertEquals("abc", StringUtils.leftPad("abc", 2));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
        
    @Test
    public void testLeftPad_StringIntChar() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pisn7amd0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLeftPad_StringIntChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28980,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pisn7amd0(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28980);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28981);assertEquals(null, StringUtils.leftPad(null, 5, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28982);assertEquals("     ", StringUtils.leftPad("", 5, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28983);assertEquals("  abc", StringUtils.leftPad("abc", 5, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28984);assertEquals("xxabc", StringUtils.leftPad("abc", 5, 'x'));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28985);assertEquals("\uffff\uffffabc", StringUtils.leftPad("abc", 5, '\uffff'));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28986);assertEquals("abc", StringUtils.leftPad("abc", 2, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28987);final String str = StringUtils.leftPad("aaa", 10000, 'a');  // bigger than pad length
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28988);assertEquals(10000, str.length());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28989);assertTrue(StringUtils.containsOnly(str, new char[] {'a'}));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
        
    @Test
    public void testLeftPad_StringIntString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),28990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nh2r2pmda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLeftPad_StringIntString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28990,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nh2r2pmda(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(28990);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28991);assertEquals(null, StringUtils.leftPad(null, 5, "-+"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28992);assertEquals(null, StringUtils.leftPad(null, 5, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28993);assertEquals("     ", StringUtils.leftPad("", 5, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28994);assertEquals("-+-+abc", StringUtils.leftPad("abc", 7, "-+"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28995);assertEquals("-+~abc", StringUtils.leftPad("abc", 6, "-+~"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28996);assertEquals("-+abc", StringUtils.leftPad("abc", 5, "-+~"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28997);assertEquals("abc", StringUtils.leftPad("abc", 2, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28998);assertEquals("abc", StringUtils.leftPad("abc", -1, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(28999);assertEquals("  abc", StringUtils.leftPad("abc", 5, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29000);assertEquals("  abc", StringUtils.leftPad("abc", 5, ""));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testLengthString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lmc6tsmdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLengthString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29001,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lmc6tsmdl(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29001);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29002);assertEquals(0, StringUtils.length(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29003);assertEquals(0, StringUtils.length(""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29004);assertEquals(0, StringUtils.length(StringUtils.EMPTY));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29005);assertEquals(1, StringUtils.length("A"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29006);assertEquals(1, StringUtils.length(" "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29007);assertEquals(8, StringUtils.length("ABCDEFGH"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testLengthStringBuffer() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28u42y8mds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLengthStringBuffer",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29008,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28u42y8mds(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29008);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29009);assertEquals(0, StringUtils.length(new StringBuffer("")));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29010);assertEquals(0, StringUtils.length(new StringBuffer(StringUtils.EMPTY)));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29011);assertEquals(1, StringUtils.length(new StringBuffer("A")));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29012);assertEquals(1, StringUtils.length(new StringBuffer(" ")));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29013);assertEquals(8, StringUtils.length(new StringBuffer("ABCDEFGH")));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testLengthStringBuilder() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22089axmdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLengthStringBuilder",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29014,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22089axmdy(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29014);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29015);assertEquals(0, StringUtils.length(new StringBuilder("")));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29016);assertEquals(0, StringUtils.length(new StringBuilder(StringUtils.EMPTY)));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29017);assertEquals(1, StringUtils.length(new StringBuilder("A")));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29018);assertEquals(1, StringUtils.length(new StringBuilder(" ")));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29019);assertEquals(8, StringUtils.length(new StringBuilder("ABCDEFGH")));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testLength_CharBuffer() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aikiv0me4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLength_CharBuffer",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29020,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aikiv0me4(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29020);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29021);assertEquals(0, StringUtils.length(CharBuffer.wrap("")));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29022);assertEquals(1, StringUtils.length(CharBuffer.wrap("A")));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29023);assertEquals(1, StringUtils.length(CharBuffer.wrap(" ")));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29024);assertEquals(8, StringUtils.length(CharBuffer.wrap("ABCDEFGH")));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCenter_StringInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27yqkzxme9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testCenter_StringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29025,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27yqkzxme9(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29025);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29026);assertEquals(null, StringUtils.center(null, -1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29027);assertEquals(null, StringUtils.center(null, 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29028);assertEquals("    ", StringUtils.center("", 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29029);assertEquals("ab", StringUtils.center("ab", 0));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29030);assertEquals("ab", StringUtils.center("ab", -1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29031);assertEquals("ab", StringUtils.center("ab", 1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29032);assertEquals("    ", StringUtils.center("", 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29033);assertEquals(" ab ", StringUtils.center("ab", 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29034);assertEquals("abcd", StringUtils.center("abcd", 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29035);assertEquals(" a  ", StringUtils.center("a", 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29036);assertEquals("  a  ", StringUtils.center("a", 5));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testCenter_StringIntChar() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gb10u5mel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testCenter_StringIntChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29037,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gb10u5mel(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29037);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29038);assertEquals(null, StringUtils.center(null, -1, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29039);assertEquals(null, StringUtils.center(null, 4, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29040);assertEquals("    ", StringUtils.center("", 4, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29041);assertEquals("ab", StringUtils.center("ab", 0, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29042);assertEquals("ab", StringUtils.center("ab", -1, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29043);assertEquals("ab", StringUtils.center("ab", 1, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29044);assertEquals("    ", StringUtils.center("", 4, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29045);assertEquals(" ab ", StringUtils.center("ab", 4, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29046);assertEquals("abcd", StringUtils.center("abcd", 2, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29047);assertEquals(" a  ", StringUtils.center("a", 4, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29048);assertEquals("  a  ", StringUtils.center("a", 5, ' '));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29049);assertEquals("xxaxx", StringUtils.center("a", 5, 'x'));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testCenter_StringIntString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ttv3a6mey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testCenter_StringIntString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29050,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ttv3a6mey(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29050);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29051);assertEquals(null, StringUtils.center(null, 4, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29052);assertEquals(null, StringUtils.center(null, -1, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29053);assertEquals(null, StringUtils.center(null, 4, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29054);assertEquals("    ", StringUtils.center("", 4, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29055);assertEquals("ab", StringUtils.center("ab", 0, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29056);assertEquals("ab", StringUtils.center("ab", -1, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29057);assertEquals("ab", StringUtils.center("ab", 1, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29058);assertEquals("    ", StringUtils.center("", 4, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29059);assertEquals(" ab ", StringUtils.center("ab", 4, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29060);assertEquals("abcd", StringUtils.center("abcd", 2, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29061);assertEquals(" a  ", StringUtils.center("a", 4, " "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29062);assertEquals("yayz", StringUtils.center("a", 4, "yz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29063);assertEquals("yzyayzy", StringUtils.center("a", 7, "yz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29064);assertEquals("  abc  ", StringUtils.center("abc", 7, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29065);assertEquals("  abc  ", StringUtils.center("abc", 7, ""));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReverse_String() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p35ajrmfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReverse_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29066,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p35ajrmfe(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29066);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29067);assertEquals(null, StringUtils.reverse(null) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29068);assertEquals("", StringUtils.reverse("") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29069);assertEquals("sdrawkcab", StringUtils.reverse("backwards") );
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
        
    @Test
    public void testReverseDelimited_StringChar() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k21aecmfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testReverseDelimited_StringChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29070,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k21aecmfi(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29070);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29071);assertEquals(null, StringUtils.reverseDelimited(null, '.') );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29072);assertEquals("", StringUtils.reverseDelimited("", '.') );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29073);assertEquals("c.b.a", StringUtils.reverseDelimited("a.b.c", '.') );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29074);assertEquals("a b c", StringUtils.reverseDelimited("a b c", '.') );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29075);assertEquals("", StringUtils.reverseDelimited("", '.') );
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDefault_String() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23yepfsmfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefault_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29076,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23yepfsmfo(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29076);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29077);assertEquals("", StringUtils.defaultString(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29078);assertEquals("", StringUtils.defaultString(""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29079);assertEquals("abc", StringUtils.defaultString("abc"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testDefault_StringString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bv7vkpmfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefault_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29080,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bv7vkpmfs(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29080);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29081);assertEquals("NULL", StringUtils.defaultString(null, "NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29082);assertEquals("", StringUtils.defaultString("", "NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29083);assertEquals("abc", StringUtils.defaultString("abc", "NULL"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testDefaultIfEmpty_StringString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bw98jrmfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfEmpty_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29084,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bw98jrmfw(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29084);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29085);assertEquals("NULL", StringUtils.defaultIfEmpty(null, "NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29086);assertEquals("NULL", StringUtils.defaultIfEmpty("", "NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29087);assertEquals("abc", StringUtils.defaultIfEmpty("abc", "NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29088);assertNull(StringUtils.defaultIfEmpty("", null));
        // Tests compatibility for the API return type
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29089);final String s = StringUtils.defaultIfEmpty("abc", "NULL");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29090);assertEquals("abc", s);
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testDefaultIfBlank_StringString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vk73ggmg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfBlank_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29091,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vk73ggmg3(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29091);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29092);assertEquals("NULL", StringUtils.defaultIfBlank(null, "NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29093);assertEquals("NULL", StringUtils.defaultIfBlank("", "NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29094);assertEquals("NULL", StringUtils.defaultIfBlank(" ", "NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29095);assertEquals("abc", StringUtils.defaultIfBlank("abc", "NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29096);assertNull(StringUtils.defaultIfBlank("", null));
        // Tests compatibility for the API return type
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29097);final String s = StringUtils.defaultIfBlank("abc", "NULL");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29098);assertEquals("abc", s);
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testDefaultIfEmpty_StringBuilders() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nzicr2mgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfEmpty_StringBuilders",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29099,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nzicr2mgb(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29099);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29100);assertEquals("NULL", StringUtils.defaultIfEmpty(new StringBuilder(""), new StringBuilder("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29101);assertEquals("abc", StringUtils.defaultIfEmpty(new StringBuilder("abc"), new StringBuilder("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29102);assertNull(StringUtils.defaultIfEmpty(new StringBuilder(""), null));
        // Tests compatibility for the API return type
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29103);final StringBuilder s = StringUtils.defaultIfEmpty(new StringBuilder("abc"), new StringBuilder("NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29104);assertEquals("abc", s.toString());
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testDefaultIfBlank_StringBuilders() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rxq51jmgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfBlank_StringBuilders",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29105,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rxq51jmgh(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29105);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29106);assertEquals("NULL", StringUtils.defaultIfBlank(new StringBuilder(""), new StringBuilder("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29107);assertEquals("NULL", StringUtils.defaultIfBlank(new StringBuilder(" "), new StringBuilder("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29108);assertEquals("abc", StringUtils.defaultIfBlank(new StringBuilder("abc"), new StringBuilder("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29109);assertNull(StringUtils.defaultIfBlank(new StringBuilder(""), null));
        // Tests compatibility for the API return type
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29110);final StringBuilder s = StringUtils.defaultIfBlank(new StringBuilder("abc"), new StringBuilder("NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29111);assertEquals("abc", s.toString());
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testDefaultIfEmpty_StringBuffers() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oqjb6dmgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfEmpty_StringBuffers",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29112,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oqjb6dmgo(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29112);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29113);assertEquals("NULL", StringUtils.defaultIfEmpty(new StringBuffer(""), new StringBuffer("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29114);assertEquals("abc", StringUtils.defaultIfEmpty(new StringBuffer("abc"), new StringBuffer("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29115);assertNull(StringUtils.defaultIfEmpty(new StringBuffer(""), null));
        // Tests compatibility for the API return type
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29116);final StringBuffer s = StringUtils.defaultIfEmpty(new StringBuffer("abc"), new StringBuffer("NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29117);assertEquals("abc", s.toString());
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testDefaultIfBlank_StringBuffers() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mbgltamgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfBlank_StringBuffers",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29118,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mbgltamgu(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29118);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29119);assertEquals("NULL", StringUtils.defaultIfBlank(new StringBuffer(""), new StringBuffer("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29120);assertEquals("NULL", StringUtils.defaultIfBlank(new StringBuffer(" "), new StringBuffer("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29121);assertEquals("abc", StringUtils.defaultIfBlank(new StringBuffer("abc"), new StringBuffer("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29122);assertNull(StringUtils.defaultIfBlank(new StringBuffer(""), null));
        // Tests compatibility for the API return type
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29123);final StringBuffer s = StringUtils.defaultIfBlank(new StringBuffer("abc"), new StringBuffer("NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29124);assertEquals("abc", s.toString());
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testDefaultIfEmpty_CharBuffers() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2apr8pymh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfEmpty_CharBuffers",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29125,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2apr8pymh1(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29125);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29126);assertEquals("NULL", StringUtils.defaultIfEmpty(CharBuffer.wrap(""), CharBuffer.wrap("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29127);assertEquals("abc", StringUtils.defaultIfEmpty(CharBuffer.wrap("abc"), CharBuffer.wrap("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29128);assertNull(StringUtils.defaultIfEmpty(CharBuffer.wrap(""), null));
        // Tests compatibility for the API return type
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29129);final CharBuffer s = StringUtils.defaultIfEmpty(CharBuffer.wrap("abc"), CharBuffer.wrap("NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29130);assertEquals("abc", s.toString());
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testDefaultIfBlank_CharBuffers() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vxhg1fmh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDefaultIfBlank_CharBuffers",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29131,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vxhg1fmh7(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29131);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29132);assertEquals("NULL", StringUtils.defaultIfBlank(CharBuffer.wrap(""), CharBuffer.wrap("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29133);assertEquals("NULL", StringUtils.defaultIfBlank(CharBuffer.wrap(" "), CharBuffer.wrap("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29134);assertEquals("abc", StringUtils.defaultIfBlank(CharBuffer.wrap("abc"), CharBuffer.wrap("NULL")).toString());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29135);assertNull(StringUtils.defaultIfBlank(CharBuffer.wrap(""), null));
        // Tests compatibility for the API return type
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29136);final CharBuffer s = StringUtils.defaultIfBlank(CharBuffer.wrap("abc"), CharBuffer.wrap("NULL"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29137);assertEquals("abc", s.toString());
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAbbreviate_StringInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lbb5wdmhe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testAbbreviate_StringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29138,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lbb5wdmhe(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29138);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29139);assertEquals(null, StringUtils.abbreviate(null, 10));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29140);assertEquals("", StringUtils.abbreviate("", 10));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29141);assertEquals("short", StringUtils.abbreviate("short", 10));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29142);assertEquals("Now is ...", StringUtils.abbreviate("Now is the time for all good men to come to the aid of their party.", 10));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29143);final String raspberry = "raspberry peach";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29144);assertEquals("raspberry p...", StringUtils.abbreviate(raspberry, 14));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29145);assertEquals("raspberry peach", StringUtils.abbreviate("raspberry peach", 15));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29146);assertEquals("raspberry peach", StringUtils.abbreviate("raspberry peach", 16));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29147);assertEquals("abc...", StringUtils.abbreviate("abcdefg", 6));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29148);assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 7));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29149);assertEquals("abcdefg", StringUtils.abbreviate("abcdefg", 8));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29150);assertEquals("a...", StringUtils.abbreviate("abcdefg", 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29151);assertEquals("", StringUtils.abbreviate("", 4));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29152);try {
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29153);@SuppressWarnings("unused")
            final
            String res = StringUtils.abbreviate("abc", 3);
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29154);fail("StringUtils.abbreviate expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
                // empty
        }              
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testAbbreviate_StringIntInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jsthuimhv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testAbbreviate_StringIntInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29155,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jsthuimhv(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29155);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29156);assertEquals(null, StringUtils.abbreviate(null, 10, 12));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29157);assertEquals("", StringUtils.abbreviate("", 0, 10));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29158);assertEquals("", StringUtils.abbreviate("", 2, 10));
        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29159);try {
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29160);@SuppressWarnings("unused")
            final
            String res = StringUtils.abbreviate("abcdefghij", 0, 3);
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29161);fail("StringUtils.abbreviate expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
                // empty
        }      
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29162);try {
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29163);@SuppressWarnings("unused")
            final
            String res = StringUtils.abbreviate("abcdefghij", 5, 6);
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29164);fail("StringUtils.abbreviate expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
                // empty
        }      
        

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29165);final String raspberry = "raspberry peach";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29166);assertEquals("raspberry peach", StringUtils.abbreviate(raspberry, 11, 15));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29167);assertEquals(null, StringUtils.abbreviate(null, 7, 14));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29168);assertAbbreviateWithOffset("abcdefg...", -1, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29169);assertAbbreviateWithOffset("abcdefg...", 0, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29170);assertAbbreviateWithOffset("abcdefg...", 1, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29171);assertAbbreviateWithOffset("abcdefg...", 2, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29172);assertAbbreviateWithOffset("abcdefg...", 3, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29173);assertAbbreviateWithOffset("abcdefg...", 4, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29174);assertAbbreviateWithOffset("...fghi...", 5, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29175);assertAbbreviateWithOffset("...ghij...", 6, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29176);assertAbbreviateWithOffset("...hijk...", 7, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29177);assertAbbreviateWithOffset("...ijklmno", 8, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29178);assertAbbreviateWithOffset("...ijklmno", 9, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29179);assertAbbreviateWithOffset("...ijklmno", 10, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29180);assertAbbreviateWithOffset("...ijklmno", 10, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29181);assertAbbreviateWithOffset("...ijklmno", 11, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29182);assertAbbreviateWithOffset("...ijklmno", 12, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29183);assertAbbreviateWithOffset("...ijklmno", 13, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29184);assertAbbreviateWithOffset("...ijklmno", 14, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29185);assertAbbreviateWithOffset("...ijklmno", 15, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29186);assertAbbreviateWithOffset("...ijklmno", 16, 10);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29187);assertAbbreviateWithOffset("...ijklmno", Integer.MAX_VALUE, 10);
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    private void assertAbbreviateWithOffset(final String expected, final int offset, final int maxWidth) {try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29188);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29189);final String abcdefghijklmno = "abcdefghijklmno";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29190);final String message = "abbreviate(String,int,int) failed";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29191);final String actual = StringUtils.abbreviate(abcdefghijklmno, offset, maxWidth);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29192);if ((((offset >= 0 && offset < abcdefghijklmno.length())&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(29193)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(29194)==0&false))) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29195);assertTrue(message + " -- should contain offset character",
                    actual.indexOf((char)('a'+offset)) != -1);
        }
        }__CLR4_1_2lnxlnxl3lqxu48.R.inc(29196);assertTrue(message + " -- should not be greater than maxWidth",
                actual.length() <= maxWidth);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29197);assertEquals(message, expected, actual);
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testAbbreviateMiddle() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qw9nx5mj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testAbbreviateMiddle",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29198,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qw9nx5mj2(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29198);
        // javadoc examples
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29199);assertNull( StringUtils.abbreviateMiddle(null, null, 0) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29200);assertEquals( "abc", StringUtils.abbreviateMiddle("abc", null, 0) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29201);assertEquals( "abc", StringUtils.abbreviateMiddle("abc", ".", 0) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29202);assertEquals( "abc", StringUtils.abbreviateMiddle("abc", ".", 3) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29203);assertEquals( "ab.f", StringUtils.abbreviateMiddle("abcdef", ".", 4) );

        // JIRA issue (LANG-405) example (slightly different than actual expected result)
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29204);assertEquals( 
            "A very long text with un...f the text is complete.",
            StringUtils.abbreviateMiddle(
                "A very long text with unimportant stuff in the middle but interesting start and " +
                "end to see if the text is complete.", "...", 50) );

        // Test a much longer text :)
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29205);final String longText = "Start text" + StringUtils.repeat("x", 10000) + "Close text";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29206);assertEquals( 
            "Start text->Close text",
            StringUtils.abbreviateMiddle( longText, "->", 22 ) );

        // Test negative length
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29207);assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", -1));

        // Test boundaries
        // Fails to change anything as method ensures first and last char are kept
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29208);assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29209);assertEquals("abc", StringUtils.abbreviateMiddle("abc", ".", 2));

        // Test length of n=1
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29210);assertEquals("a", StringUtils.abbreviateMiddle("a", ".", 1));

        // Test smallest length that can lead to success
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29211);assertEquals("a.d", StringUtils.abbreviateMiddle("abcd", ".", 3));

        // More from LANG-405
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29212);assertEquals("a..f", StringUtils.abbreviateMiddle("abcdef", "..", 4));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29213);assertEquals("ab.ef", StringUtils.abbreviateMiddle("abcdef", ".", 5));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDifference_StringString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ykaovtmji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDifference_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29214,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ykaovtmji(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29214);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29215);assertEquals(null, StringUtils.difference(null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29216);assertEquals("", StringUtils.difference("", ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29217);assertEquals("abc", StringUtils.difference("", "abc"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29218);assertEquals("", StringUtils.difference("abc", ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29219);assertEquals("i am a robot", StringUtils.difference(null, "i am a robot"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29220);assertEquals("i am a machine", StringUtils.difference("i am a machine", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29221);assertEquals("robot", StringUtils.difference("i am a machine", "i am a robot"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29222);assertEquals("", StringUtils.difference("abc", "abc"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29223);assertEquals("you are a robot", StringUtils.difference("i am a robot", "you are a robot"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testDifferenceAt_StringString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2swyxuimjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDifferenceAt_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29224,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2swyxuimjs(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29224);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29225);assertEquals(-1, StringUtils.indexOfDifference(null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29226);assertEquals(0, StringUtils.indexOfDifference(null, "i am a robot"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29227);assertEquals(-1, StringUtils.indexOfDifference("", ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29228);assertEquals(0, StringUtils.indexOfDifference("", "abc"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29229);assertEquals(0, StringUtils.indexOfDifference("abc", ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29230);assertEquals(0, StringUtils.indexOfDifference("i am a machine", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29231);assertEquals(7, StringUtils.indexOfDifference("i am a machine", "i am a robot"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29232);assertEquals(-1, StringUtils.indexOfDifference("foo", "foo"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29233);assertEquals(0, StringUtils.indexOfDifference("i am a robot", "you are a robot"));
        //System.out.println("indexOfDiff: " + StringUtils.indexOfDifference("i am a robot", "not machine"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetLevenshteinDistance_StringString() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sxoquemk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetLevenshteinDistance_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29234,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sxoquemk2(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29234);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29235);assertEquals(0, StringUtils.getLevenshteinDistance("", "") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29236);assertEquals(1, StringUtils.getLevenshteinDistance("", "a") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29237);assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29238);assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29239);assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29240);assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29241);assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29242);assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29243);assertEquals(8, StringUtils.getLevenshteinDistance("zzzzzzzz", "hippo") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29244);assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo") );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29245);try {
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29246);@SuppressWarnings("unused")
            final
            int d = StringUtils.getLevenshteinDistance("a", null);
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29247);fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            // empty
        }
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29248);try {
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29249);@SuppressWarnings("unused")
            final
            int d = StringUtils.getLevenshteinDistance(null, "a");
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29250);fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            // empty
        }
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testGetLevenshteinDistance_StringStringInt() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vwy5e1mkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetLevenshteinDistance_StringStringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29251,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vwy5e1mkj(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29251);
        // empty strings
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29252);assertEquals(0, StringUtils.getLevenshteinDistance("", "", 0));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29253);assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "", 8));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29254);assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "", 7));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29255);assertEquals(-1, StringUtils.getLevenshteinDistance("aaapppp", "", 6));

        // unequal strings, zero threshold
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29256);assertEquals(-1, StringUtils.getLevenshteinDistance("b", "a", 0));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29257);assertEquals(-1, StringUtils.getLevenshteinDistance("a", "b", 0));
    
        // equal strings
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29258);assertEquals(0, StringUtils.getLevenshteinDistance("aa", "aa", 0));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29259);assertEquals(0, StringUtils.getLevenshteinDistance("aa", "aa", 2));

        // same length
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29260);assertEquals(-1, StringUtils.getLevenshteinDistance("aaa", "bbb", 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29261);assertEquals(3, StringUtils.getLevenshteinDistance("aaa", "bbb", 3));
    
        // big stripe
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29262);assertEquals(6, StringUtils.getLevenshteinDistance("aaaaaa", "b", 10));

        // distance less than threshold
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29263);assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "b", 8));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29264);assertEquals(3, StringUtils.getLevenshteinDistance("a", "bbb", 4));
    
        // distance equal to threshold
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29265);assertEquals(7, StringUtils.getLevenshteinDistance("aaapppp", "b", 7));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29266);assertEquals(3, StringUtils.getLevenshteinDistance("a", "bbb", 3));

        // distance greater than threshold
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29267);assertEquals(-1, StringUtils.getLevenshteinDistance("a", "bbb", 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29268);assertEquals(-1, StringUtils.getLevenshteinDistance("bbb", "a", 2));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29269);assertEquals(-1, StringUtils.getLevenshteinDistance("aaapppp", "b", 6));

        // stripe runs off array, strings not similar
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29270);assertEquals(-1, StringUtils.getLevenshteinDistance("a", "bbb", 1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29271);assertEquals(-1, StringUtils.getLevenshteinDistance("bbb", "a", 1));

        // stripe runs off array, strings are similar
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29272);assertEquals(-1, StringUtils.getLevenshteinDistance("12345", "1234567", 1));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29273);assertEquals(-1, StringUtils.getLevenshteinDistance("1234567", "12345", 1));

        // old getLevenshteinDistance test cases
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29274);assertEquals(1, StringUtils.getLevenshteinDistance("frog", "fog",1) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29275);assertEquals(3, StringUtils.getLevenshteinDistance("fly", "ant",3) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29276);assertEquals(7, StringUtils.getLevenshteinDistance("elephant", "hippo",7) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29277);assertEquals(-1, StringUtils.getLevenshteinDistance("elephant", "hippo",6) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29278);assertEquals(7, StringUtils.getLevenshteinDistance("hippo", "elephant",7) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29279);assertEquals(-1, StringUtils.getLevenshteinDistance("hippo", "elephant",6) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29280);assertEquals(8, StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz",8) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29281);assertEquals(8, StringUtils.getLevenshteinDistance("zzzzzzzz", "hippo",8) );
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29282);assertEquals(1, StringUtils.getLevenshteinDistance("hello", "hallo",1) );

        // exceptions
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29283);try {
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29284);@SuppressWarnings("unused")
            final
            int d = StringUtils.getLevenshteinDistance("a", null, 0);
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29285);fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            // empty
        }
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29286);try {
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29287);@SuppressWarnings("unused")
            final
            int d = StringUtils.getLevenshteinDistance(null, "a", 0);
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29288);fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            // empty
        }

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29289);try {
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29290);@SuppressWarnings("unused")
            final
            int d = StringUtils.getLevenshteinDistance("a", "a", -1);
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29291);fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            // empty
        }
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    /**
     * A sanity check for {@link StringUtils#EMPTY}.
     */
    @Test
    public void testEMPTY() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2veedvmmlo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testEMPTY",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29292,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2veedvmmlo(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29292);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29293);assertNotNull(StringUtils.EMPTY);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29294);assertEquals("", StringUtils.EMPTY);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29295);assertEquals(0, StringUtils.EMPTY.length());
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    /**
     * Test for {@link StringUtils#isAllLowerCase(CharSequence)}.
     */
    @Test
    public void testIsAllLowerCase() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2chc6tpmls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testIsAllLowerCase",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29296,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2chc6tpmls(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29296);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29297);assertFalse(StringUtils.isAllLowerCase(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29298);assertFalse(StringUtils.isAllLowerCase(StringUtils.EMPTY));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29299);assertTrue(StringUtils.isAllLowerCase("abc"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29300);assertFalse(StringUtils.isAllLowerCase("abc "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29301);assertFalse(StringUtils.isAllLowerCase("abC"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    /**
     * Test for {@link StringUtils#isAllUpperCase(CharSequence)}.
     */
    @Test
    public void testIsAllUpperCase() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gl7ij0mly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testIsAllUpperCase",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29302,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gl7ij0mly(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29302);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29303);assertFalse(StringUtils.isAllUpperCase(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29304);assertFalse(StringUtils.isAllUpperCase(StringUtils.EMPTY));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29305);assertTrue(StringUtils.isAllUpperCase("ABC"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29306);assertFalse(StringUtils.isAllUpperCase("ABC "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29307);assertFalse(StringUtils.isAllUpperCase("aBC"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testRemoveStart() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24an65pmm4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemoveStart",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29308,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24an65pmm4(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29308);
        // StringUtils.removeStart("", *)        = ""
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29309);assertNull(StringUtils.removeStart(null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29310);assertNull(StringUtils.removeStart(null, ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29311);assertNull(StringUtils.removeStart(null, "a"));
        
        // StringUtils.removeStart(*, null)      = *
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29312);assertEquals(StringUtils.removeStart("", null), "");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29313);assertEquals(StringUtils.removeStart("", ""), "");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29314);assertEquals(StringUtils.removeStart("", "a"), "");
        
        // All others:
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29315);assertEquals(StringUtils.removeStart("www.domain.com", "www."), "domain.com");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29316);assertEquals(StringUtils.removeStart("domain.com", "www."), "domain.com");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29317);assertEquals(StringUtils.removeStart("domain.com", ""), "domain.com");        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29318);assertEquals(StringUtils.removeStart("domain.com", null), "domain.com");        
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testRemoveStartIgnoreCase() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ytn505mmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemoveStartIgnoreCase",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29319,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ytn505mmf(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29319);
        // StringUtils.removeStart("", *)        = ""
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29320);assertNull("removeStartIgnoreCase(null, null)", StringUtils.removeStartIgnoreCase(null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29321);assertNull("removeStartIgnoreCase(null, \"\")", StringUtils.removeStartIgnoreCase(null, ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29322);assertNull("removeStartIgnoreCase(null, \"a\")", StringUtils.removeStartIgnoreCase(null, "a"));
        
        // StringUtils.removeStart(*, null)      = *
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29323);assertEquals("removeStartIgnoreCase(\"\", null)", StringUtils.removeStartIgnoreCase("", null), "");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29324);assertEquals("removeStartIgnoreCase(\"\", \"\")", StringUtils.removeStartIgnoreCase("", ""), "");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29325);assertEquals("removeStartIgnoreCase(\"\", \"a\")", StringUtils.removeStartIgnoreCase("", "a"), "");
        
        // All others:
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29326);assertEquals("removeStartIgnoreCase(\"www.domain.com\", \"www.\")", StringUtils.removeStartIgnoreCase("www.domain.com", "www."), "domain.com");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29327);assertEquals("removeStartIgnoreCase(\"domain.com\", \"www.\")", StringUtils.removeStartIgnoreCase("domain.com", "www."), "domain.com");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29328);assertEquals("removeStartIgnoreCase(\"domain.com\", \"\")", StringUtils.removeStartIgnoreCase("domain.com", ""), "domain.com");        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29329);assertEquals("removeStartIgnoreCase(\"domain.com\", null)", StringUtils.removeStartIgnoreCase("domain.com", null), "domain.com");        
        
        // Case insensitive:
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29330);assertEquals("removeStartIgnoreCase(\"www.domain.com\", \"WWW.\")", StringUtils.removeStartIgnoreCase("www.domain.com", "WWW."), "domain.com");
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testRemoveEnd() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wrivbommr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemoveEnd",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29331,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wrivbommr(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29331);
        // StringUtils.removeEnd("", *)        = ""
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29332);assertNull(StringUtils.removeEnd(null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29333);assertNull(StringUtils.removeEnd(null, ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29334);assertNull(StringUtils.removeEnd(null, "a"));
        
        // StringUtils.removeEnd(*, null)      = *
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29335);assertEquals(StringUtils.removeEnd("", null), "");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29336);assertEquals(StringUtils.removeEnd("", ""), "");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29337);assertEquals(StringUtils.removeEnd("", "a"), "");
        
        // All others:
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29338);assertEquals(StringUtils.removeEnd("www.domain.com.", ".com"), "www.domain.com.");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29339);assertEquals(StringUtils.removeEnd("www.domain.com", ".com"), "www.domain");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29340);assertEquals(StringUtils.removeEnd("www.domain", ".com"), "www.domain");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29341);assertEquals(StringUtils.removeEnd("domain.com", ""), "domain.com");   
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29342);assertEquals(StringUtils.removeEnd("domain.com", null), "domain.com");   
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testRemoveEndIgnoreCase() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2badniqmn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemoveEndIgnoreCase",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29343,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2badniqmn3(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29343);
        // StringUtils.removeEndIgnoreCase("", *)        = ""
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29344);assertNull("removeEndIgnoreCase(null, null)", StringUtils.removeEndIgnoreCase(null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29345);assertNull("removeEndIgnoreCase(null, \"\")", StringUtils.removeEndIgnoreCase(null, ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29346);assertNull("removeEndIgnoreCase(null, \"a\")", StringUtils.removeEndIgnoreCase(null, "a"));
        
        // StringUtils.removeEnd(*, null)      = *
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29347);assertEquals("removeEndIgnoreCase(\"\", null)", StringUtils.removeEndIgnoreCase("", null), "");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29348);assertEquals("removeEndIgnoreCase(\"\", \"\")", StringUtils.removeEndIgnoreCase("", ""), "");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29349);assertEquals("removeEndIgnoreCase(\"\", \"a\")", StringUtils.removeEndIgnoreCase("", "a"), "");
        
        // All others:
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29350);assertEquals("removeEndIgnoreCase(\"www.domain.com.\", \".com\")", StringUtils.removeEndIgnoreCase("www.domain.com.", ".com"), "www.domain.com.");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29351);assertEquals("removeEndIgnoreCase(\"www.domain.com\", \".com\")", StringUtils.removeEndIgnoreCase("www.domain.com", ".com"), "www.domain");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29352);assertEquals("removeEndIgnoreCase(\"www.domain\", \".com\")", StringUtils.removeEndIgnoreCase("www.domain", ".com"), "www.domain");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29353);assertEquals("removeEndIgnoreCase(\"domain.com\", \"\")", StringUtils.removeEndIgnoreCase("domain.com", ""), "domain.com");   
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29354);assertEquals("removeEndIgnoreCase(\"domain.com\", null)", StringUtils.removeEndIgnoreCase("domain.com", null), "domain.com");   

        // Case insensitive:
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29355);assertEquals("removeEndIgnoreCase(\"www.domain.com\", \".COM\")", StringUtils.removeEndIgnoreCase("www.domain.com", ".COM"), "www.domain");
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29356);assertEquals("removeEndIgnoreCase(\"www.domain.COM\", \".com\")", StringUtils.removeEndIgnoreCase("www.domain.COM", ".com"), "www.domain");
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testRemove_String() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2it4735mnh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemove_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29357,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2it4735mnh(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29357);
        // StringUtils.remove(null, *)        = null
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29358);assertEquals(null, StringUtils.remove(null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29359);assertEquals(null, StringUtils.remove(null, ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29360);assertEquals(null, StringUtils.remove(null, "a"));
        
        // StringUtils.remove("", *)          = ""
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29361);assertEquals("", StringUtils.remove("", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29362);assertEquals("", StringUtils.remove("", ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29363);assertEquals("", StringUtils.remove("", "a"));
        
        // StringUtils.remove(*, null)        = *
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29364);assertEquals(null, StringUtils.remove(null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29365);assertEquals("", StringUtils.remove("", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29366);assertEquals("a", StringUtils.remove("a", null));
        
        // StringUtils.remove(*, "")          = *
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29367);assertEquals(null, StringUtils.remove(null, ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29368);assertEquals("", StringUtils.remove("", ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29369);assertEquals("a", StringUtils.remove("a", ""));
        
        // StringUtils.remove("queued", "ue") = "qd"
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29370);assertEquals("qd", StringUtils.remove("queued", "ue"));
        
        // StringUtils.remove("queued", "zz") = "queued"
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29371);assertEquals("queued", StringUtils.remove("queued", "zz"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testRemove_char() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fw3dcqmnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testRemove_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29372,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fw3dcqmnw(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29372);
        // StringUtils.remove(null, *)       = null
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29373);assertEquals(null, StringUtils.remove(null, 'a'));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29374);assertEquals(null, StringUtils.remove(null, 'a'));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29375);assertEquals(null, StringUtils.remove(null, 'a'));
        
        // StringUtils.remove("", *)          = ""
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29376);assertEquals("", StringUtils.remove("", 'a'));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29377);assertEquals("", StringUtils.remove("", 'a'));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29378);assertEquals("", StringUtils.remove("", 'a'));
        
        // StringUtils.remove("queued", 'u') = "qeed"
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29379);assertEquals("qeed", StringUtils.remove("queued", 'u'));
        
        // StringUtils.remove("queued", 'z') = "queued"
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29380);assertEquals("queued", StringUtils.remove("queued", 'z'));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testDifferenceAt_StringArray() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cmfprimo5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testDifferenceAt_StringArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29381,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cmfprimo5(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29381);        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29382);assertEquals(-1, StringUtils.indexOfDifference((String[])null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29383);assertEquals(-1, StringUtils.indexOfDifference(new String[] {}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29384);assertEquals(-1, StringUtils.indexOfDifference(new String[] {"abc"}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29385);assertEquals(-1, StringUtils.indexOfDifference(new String[] {null, null}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29386);assertEquals(-1, StringUtils.indexOfDifference(new String[] {"", ""}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29387);assertEquals(0, StringUtils.indexOfDifference(new String[] {"", null}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29388);assertEquals(0, StringUtils.indexOfDifference(new String[] {"abc", null, null}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29389);assertEquals(0, StringUtils.indexOfDifference(new String[] {null, null, "abc"}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29390);assertEquals(0, StringUtils.indexOfDifference(new String[] {"", "abc"}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29391);assertEquals(0, StringUtils.indexOfDifference(new String[] {"abc", ""}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29392);assertEquals(-1, StringUtils.indexOfDifference(new String[] {"abc", "abc"}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29393);assertEquals(1, StringUtils.indexOfDifference(new String[] {"abc", "a"}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29394);assertEquals(2, StringUtils.indexOfDifference(new String[] {"ab", "abxyz"}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29395);assertEquals(2, StringUtils.indexOfDifference(new String[] {"abcde", "abxyz"}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29396);assertEquals(0, StringUtils.indexOfDifference(new String[] {"abcde", "xyz"}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29397);assertEquals(0, StringUtils.indexOfDifference(new String[] {"xyz", "abcde"}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29398);assertEquals(7, StringUtils.indexOfDifference(new String[] {"i am a machine", "i am a robot"}));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testGetCommonPrefix_StringArray() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rvywk1mon();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testGetCommonPrefix_StringArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29399,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rvywk1mon(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29399);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29400);assertEquals("", StringUtils.getCommonPrefix((String[])null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29401);assertEquals("", StringUtils.getCommonPrefix());
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29402);assertEquals("abc", StringUtils.getCommonPrefix("abc"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29403);assertEquals("", StringUtils.getCommonPrefix(null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29404);assertEquals("", StringUtils.getCommonPrefix("", ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29405);assertEquals("", StringUtils.getCommonPrefix("", null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29406);assertEquals("", StringUtils.getCommonPrefix("abc", null, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29407);assertEquals("", StringUtils.getCommonPrefix(null, null, "abc"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29408);assertEquals("", StringUtils.getCommonPrefix("", "abc"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29409);assertEquals("", StringUtils.getCommonPrefix("abc", ""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29410);assertEquals("abc", StringUtils.getCommonPrefix("abc", "abc"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29411);assertEquals("a", StringUtils.getCommonPrefix("abc", "a"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29412);assertEquals("ab", StringUtils.getCommonPrefix("ab", "abxyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29413);assertEquals("ab", StringUtils.getCommonPrefix("abcde", "abxyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29414);assertEquals("", StringUtils.getCommonPrefix("abcde", "xyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29415);assertEquals("", StringUtils.getCommonPrefix("xyz", "abcde"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29416);assertEquals("i am a ", StringUtils.getCommonPrefix("i am a machine", "i am a robot"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
        
    @Test
    public void testNormalizeSpace() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2srv1n6mp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testNormalizeSpace",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29417,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2srv1n6mp5(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29417);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29418);assertEquals(null, StringUtils.normalizeSpace(null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29419);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29420);assertEquals("", StringUtils.normalizeSpace(" "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29421);assertEquals("", StringUtils.normalizeSpace("\t"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29422);assertEquals("", StringUtils.normalizeSpace("\n"));        
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29423);assertEquals("", StringUtils.normalizeSpace("	"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29424);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29425);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29426);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29427);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29428);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29429);assertEquals("", StringUtils.normalizeSpace(""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29430);assertEquals("", StringUtils.normalizeSpace("\f"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29431);assertEquals("", StringUtils.normalizeSpace("\r"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29432);assertEquals("a", StringUtils.normalizeSpace("  a  "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29433);assertEquals("a b c", StringUtils.normalizeSpace("  a  b   c  "));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29434);assertEquals("a b c", StringUtils.normalizeSpace("a\t\f\r  b   c\n"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    @Test
    public void testLANG666() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_256knlvmpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testLANG666",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29435,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_256knlvmpn(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29435);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29436);assertEquals("12",StringUtils.stripEnd("120.00", ".0"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29437);assertEquals("121",StringUtils.stripEnd("121.00", ".0"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    // Methods on StringUtils that are immutable in spirit (i.e. calculate the length) 
    // should take a CharSequence parameter. Methods that are mutable in spirit (i.e. capitalize) 
    // should take a String or String[] parameter and return String or String[].
    // This test enforces that this is done.
    @Test
    public void testStringUtilsCharSequenceContract() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wnzeoumpq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testStringUtilsCharSequenceContract",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29438,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wnzeoumpq(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29438);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29439);final Class<StringUtils> c = StringUtils.class;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29440);final Method[] methods = c.getMethods();
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29441);for (final Method m : methods) {{
            __CLR4_1_2lnxlnxl3lqxu48.R.inc(29442);if ((((m.getReturnType() == String.class || m.getReturnType() == String[].class)&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(29443)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(29444)==0&false))) {{
                // Assume this is mutable and ensure the first parameter is not CharSequence.
                // It may be String or it may be something else (String[], Object, Object[]) so 
                // don't actively test for that.
                __CLR4_1_2lnxlnxl3lqxu48.R.inc(29445);final Class<?>[] params = m.getParameterTypes();
                __CLR4_1_2lnxlnxl3lqxu48.R.inc(29446);if ( (((params.length > 0 && (params[0] == CharSequence.class || params[0] == CharSequence[].class))&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(29447)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(29448)==0&false))) {{
                    __CLR4_1_2lnxlnxl3lqxu48.R.inc(29449);fail("The method " + m + " appears to be mutable in spirit and therefore must not accept a CharSequence");
                }
            }} }else {{
                // Assume this is immutable in spirit and ensure the first parameter is not String.
                // As above, it may be something other than CharSequence.
                __CLR4_1_2lnxlnxl3lqxu48.R.inc(29450);final Class<?>[] params = m.getParameterTypes();
                __CLR4_1_2lnxlnxl3lqxu48.R.inc(29451);if ( (((params.length > 0 && (params[0] == String.class || params[0] == String[].class))&&(__CLR4_1_2lnxlnxl3lqxu48.R.iget(29452)!=0|true))||(__CLR4_1_2lnxlnxl3lqxu48.R.iget(29453)==0&false))) {{
                    __CLR4_1_2lnxlnxl3lqxu48.R.inc(29454);fail("The method " + m + " appears to be immutable in spirit and therefore must not accept a String");
                }
            }}
        }}
    }}finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    /**
     * Tests {@link StringUtils#toString(byte[], String)}
     * 
     * @throws UnsupportedEncodingException
     * @see StringUtils#toString(byte[], String)
     */
    @Test
    public void testToString() throws UnsupportedEncodingException {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidmq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29455,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidmq7() throws UnsupportedEncodingException{try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29455);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29456);final String expectedString = "The quick brown fox jumped over the lazy dog.";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29457);String encoding = SystemUtils.FILE_ENCODING;
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29458);byte[] expectedBytes = expectedString.getBytes(encoding);
        // sanity check start
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29459);assertArrayEquals(expectedBytes, expectedString.getBytes());
        // sanity check end
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29460);assertEquals(expectedString, StringUtils.toString(expectedBytes, null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29461);assertEquals(expectedString, StringUtils.toString(expectedBytes, encoding));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29462);encoding = "UTF-16";
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29463);expectedBytes = expectedString.getBytes(encoding);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29464);assertEquals(expectedString, StringUtils.toString(expectedBytes, encoding));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testEscapeSurrogatePairs() throws Exception {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pn13jvmqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testEscapeSurrogatePairs",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29465,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pn13jvmqh() throws Exception{try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29465);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29466);assertEquals("\ud83d\ude30", StringEscapeUtils.escapeCsv("\ud83d\ude30"));
        // Examples from https://en.wikipedia.org/wiki/UTF-16
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29467);assertEquals("\ud800\udc00", StringEscapeUtils.escapeCsv("\ud800\udc00"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29468);assertEquals("\ud834\udd1e", StringEscapeUtils.escapeCsv("\ud834\udd1e"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29469);assertEquals("\udbff\udffd", StringEscapeUtils.escapeCsv("\udbff\udffd"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29470);assertEquals("\udbff\udffd", StringEscapeUtils.escapeHtml3("\udbff\udffd"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29471);assertEquals("\udbff\udffd", StringEscapeUtils.escapeHtml4("\udbff\udffd"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29472);assertEquals("\udbff\udffd", StringEscapeUtils.escapeXml("\udbff\udffd"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    /**
     * Tests LANG-858.
     * 
     * @throws Exception
     */
    @Test
    public void testEscapeSurrogatePairsLang858() throws Exception {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j3q4hsmqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testEscapeSurrogatePairsLang858",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29473,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j3q4hsmqp() throws Exception{try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29473);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29474);assertEquals("\\uDBFF\\uDFFD", StringEscapeUtils.escapeJava("\udbff\udffd"));       //fail LANG-858
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29475);assertEquals("\\uDBFF\\uDFFD", StringEscapeUtils.escapeEcmaScript("\udbff\udffd")); //fail LANG-858
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
    
    @Test
    public void testUnescapeSurrogatePairs() throws Exception {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wgtzucmqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testUnescapeSurrogatePairs",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29476,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wgtzucmqs() throws Exception{try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29476);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29477);assertEquals("\ud83d\ude30", StringEscapeUtils.unescapeCsv("\ud83d\ude30"));
        // Examples from https://en.wikipedia.org/wiki/UTF-16
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29478);assertEquals("\ud800\udc00", StringEscapeUtils.unescapeCsv("\ud800\udc00"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29479);assertEquals("\ud834\udd1e", StringEscapeUtils.unescapeCsv("\ud834\udd1e"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29480);assertEquals("\udbff\udffd", StringEscapeUtils.unescapeCsv("\udbff\udffd"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29481);assertEquals("\udbff\udffd", StringEscapeUtils.unescapeHtml3("\udbff\udffd"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29482);assertEquals("\udbff\udffd", StringEscapeUtils.unescapeHtml4("\udbff\udffd"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    /**
     * Tests {@code appendIfMissing}.
     */
    @Test
    public void testAppendIfMissing() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nln83gmqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testAppendIfMissing",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29483,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nln83gmqz(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29483);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29484);assertEquals("appendIfMissing(null,null)", null, StringUtils.appendIfMissing(null,null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29485);assertEquals("appendIfMissing(abc,null)", "abc", StringUtils.appendIfMissing("abc",null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29486);assertEquals("appendIfMissing(\"\",xyz)", "xyz", StringUtils.appendIfMissing("","xyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29487);assertEquals("appendIfMissing(abc,xyz)", "abcxyz", StringUtils.appendIfMissing("abc","xyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29488);assertEquals("appendIfMissing(abcxyz,xyz)", "abcxyz", StringUtils.appendIfMissing("abcxyz","xyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29489);assertEquals("appendIfMissing(aXYZ,xyz)", "aXYZxyz", StringUtils.appendIfMissing("aXYZ","xyz"));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29490);assertEquals("appendIfMissing(null,null,null)", null, StringUtils.appendIfMissing(null,null,(CharSequence[]) null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29491);assertEquals("appendIfMissing(abc,null,null)", "abc", StringUtils.appendIfMissing("abc",null,(CharSequence[]) null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29492);assertEquals("appendIfMissing(\"\",xyz,null))", "xyz", StringUtils.appendIfMissing("","xyz",(CharSequence[]) null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29493);assertEquals("appendIfMissing(abc,xyz,{null})", "abcxyz", StringUtils.appendIfMissing("abc","xyz",new CharSequence[]{null}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29494);assertEquals("appendIfMissing(abc,xyz,\"\")", "abc", StringUtils.appendIfMissing("abc","xyz",""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29495);assertEquals("appendIfMissing(abc,xyz,mno)", "abcxyz", StringUtils.appendIfMissing("abc","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29496);assertEquals("appendIfMissing(abcxyz,xyz,mno)", "abcxyz", StringUtils.appendIfMissing("abcxyz","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29497);assertEquals("appendIfMissing(abcmno,xyz,mno)", "abcmno", StringUtils.appendIfMissing("abcmno","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29498);assertEquals("appendIfMissing(abcXYZ,xyz,mno)", "abcXYZxyz", StringUtils.appendIfMissing("abcXYZ","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29499);assertEquals("appendIfMissing(abcMNO,xyz,mno)", "abcMNOxyz", StringUtils.appendIfMissing("abcMNO","xyz","mno"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    /**
     * Tests {@code appendIfMissingIgnoreCase}.
     */
    @Test
    public void testAppendIfMissingIgnoreCase() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ag64g6mrg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testAppendIfMissingIgnoreCase",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29500,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ag64g6mrg(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29500);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29501);assertEquals("appendIfMissingIgnoreCase(null,null)", null, StringUtils.appendIfMissingIgnoreCase(null,null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29502);assertEquals("appendIfMissingIgnoreCase(abc,null)", "abc", StringUtils.appendIfMissingIgnoreCase("abc",null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29503);assertEquals("appendIfMissingIgnoreCase(\"\",xyz)", "xyz", StringUtils.appendIfMissingIgnoreCase("","xyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29504);assertEquals("appendIfMissingIgnoreCase(abc,xyz)", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abc","xyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29505);assertEquals("appendIfMissingIgnoreCase(abcxyz,xyz)", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abcxyz","xyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29506);assertEquals("appendIfMissingIgnoreCase(abcXYZ,xyz)", "abcXYZ", StringUtils.appendIfMissingIgnoreCase("abcXYZ","xyz"));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29507);assertEquals("appendIfMissingIgnoreCase(null,null,null)", null, StringUtils.appendIfMissingIgnoreCase(null,null,(CharSequence[]) null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29508);assertEquals("appendIfMissingIgnoreCase(abc,null,null)", "abc", StringUtils.appendIfMissingIgnoreCase("abc",null,(CharSequence[]) null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29509);assertEquals("appendIfMissingIgnoreCase(\"\",xyz,null)", "xyz", StringUtils.appendIfMissingIgnoreCase("","xyz",(CharSequence[]) null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29510);assertEquals("appendIfMissingIgnoreCase(abc,xyz,{null})", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abc","xyz",new CharSequence[]{null}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29511);assertEquals("appendIfMissingIgnoreCase(abc,xyz,\"\")", "abc", StringUtils.appendIfMissingIgnoreCase("abc","xyz",""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29512);assertEquals("appendIfMissingIgnoreCase(abc,xyz,mno)", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abc","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29513);assertEquals("appendIfMissingIgnoreCase(abcxyz,xyz,mno)", "abcxyz", StringUtils.appendIfMissingIgnoreCase("abcxyz","xyz","mno"));       
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29514);assertEquals("appendIfMissingIgnoreCase(abcmno,xyz,mno)", "abcmno", StringUtils.appendIfMissingIgnoreCase("abcmno","xyz","mno"));       
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29515);assertEquals("appendIfMissingIgnoreCase(abcXYZ,xyz,mno)", "abcXYZ", StringUtils.appendIfMissingIgnoreCase("abcXYZ","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29516);assertEquals("appendIfMissingIgnoreCase(abcMNO,xyz,mno)", "abcMNO", StringUtils.appendIfMissingIgnoreCase("abcMNO","xyz","mno"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    /**
     * Tests {@code prependIfMissing}.
     */
    @Test
    public void testPrependIfMissing() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wjytpwmrx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testPrependIfMissing",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29517,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wjytpwmrx(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29517);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29518);assertEquals("prependIfMissing(null,null)", null, StringUtils.prependIfMissing(null,null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29519);assertEquals("prependIfMissing(abc,null)", "abc", StringUtils.prependIfMissing("abc",null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29520);assertEquals("prependIfMissing(\"\",xyz)", "xyz", StringUtils.prependIfMissing("","xyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29521);assertEquals("prependIfMissing(abc,xyz)", "xyzabc", StringUtils.prependIfMissing("abc","xyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29522);assertEquals("prependIfMissing(xyzabc,xyz)", "xyzabc", StringUtils.prependIfMissing("xyzabc","xyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29523);assertEquals("prependIfMissing(XYZabc,xyz)", "xyzXYZabc", StringUtils.prependIfMissing("XYZabc","xyz"));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29524);assertEquals("prependIfMissing(null,null null)", null, StringUtils.prependIfMissing(null,null,(CharSequence[]) null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29525);assertEquals("prependIfMissing(abc,null,null)", "abc", StringUtils.prependIfMissing("abc",null,(CharSequence[]) null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29526);assertEquals("prependIfMissing(\"\",xyz,null)", "xyz", StringUtils.prependIfMissing("","xyz",(CharSequence[]) null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29527);assertEquals("prependIfMissing(abc,xyz,{null})","xyzabc", StringUtils.prependIfMissing("abc","xyz",new CharSequence[]{null}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29528);assertEquals("prependIfMissing(abc,xyz,\"\")","abc", StringUtils.prependIfMissing("abc","xyz",""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29529);assertEquals("prependIfMissing(abc,xyz,mno)","xyzabc", StringUtils.prependIfMissing("abc","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29530);assertEquals("prependIfMissing(xyzabc,xyz,mno)", "xyzabc", StringUtils.prependIfMissing("xyzabc","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29531);assertEquals("prependIfMissing(mnoabc,xyz,mno)", "mnoabc", StringUtils.prependIfMissing("mnoabc","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29532);assertEquals("prependIfMissing(XYZabc,xyz,mno)", "xyzXYZabc", StringUtils.prependIfMissing("XYZabc","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29533);assertEquals("prependIfMissing(MNOabc,xyz,mno)", "xyzMNOabc", StringUtils.prependIfMissing("MNOabc","xyz","mno"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}

    /**
     * Tests {@code prependIfMissingIgnoreCase}.
     */
    @Test
    public void testPrependIfMissingIgnoreCase() {__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceStart(getClass().getName(),29534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2t7vw6umse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2lnxlnxl3lqxu48.R.rethrow($CLV_t2$);}finally{__CLR4_1_2lnxlnxl3lqxu48.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTest.testPrependIfMissingIgnoreCase",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29534,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2t7vw6umse(){try{__CLR4_1_2lnxlnxl3lqxu48.R.inc(29534);
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29535);assertEquals("prependIfMissingIgnoreCase(null,null)", null, StringUtils.prependIfMissingIgnoreCase(null,null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29536);assertEquals("prependIfMissingIgnoreCase(abc,null)", "abc", StringUtils.prependIfMissingIgnoreCase("abc",null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29537);assertEquals("prependIfMissingIgnoreCase(\"\",xyz)", "xyz", StringUtils.prependIfMissingIgnoreCase("","xyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29538);assertEquals("prependIfMissingIgnoreCase(abc,xyz)", "xyzabc", StringUtils.prependIfMissingIgnoreCase("abc","xyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29539);assertEquals("prependIfMissingIgnoreCase(xyzabc,xyz)", "xyzabc", StringUtils.prependIfMissingIgnoreCase("xyzabc","xyz"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29540);assertEquals("prependIfMissingIgnoreCase(XYZabc,xyz)", "XYZabc", StringUtils.prependIfMissingIgnoreCase("XYZabc","xyz"));

        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29541);assertEquals("prependIfMissingIgnoreCase(null,null null)", null, StringUtils.prependIfMissingIgnoreCase(null,null,(CharSequence[]) null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29542);assertEquals("prependIfMissingIgnoreCase(abc,null,null)", "abc", StringUtils.prependIfMissingIgnoreCase("abc",null,(CharSequence[]) null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29543);assertEquals("prependIfMissingIgnoreCase(\"\",xyz,null)", "xyz", StringUtils.prependIfMissingIgnoreCase("","xyz",(CharSequence[]) null));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29544);assertEquals("prependIfMissingIgnoreCase(abc,xyz,{null})","xyzabc", StringUtils.prependIfMissingIgnoreCase("abc","xyz",new CharSequence[]{null}));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29545);assertEquals("prependIfMissingIgnoreCase(abc,xyz,\"\")","abc", StringUtils.prependIfMissingIgnoreCase("abc","xyz",""));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29546);assertEquals("prependIfMissingIgnoreCase(abc,xyz,mno)","xyzabc", StringUtils.prependIfMissingIgnoreCase("abc","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29547);assertEquals("prependIfMissingIgnoreCase(xyzabc,xyz,mno)", "xyzabc", StringUtils.prependIfMissingIgnoreCase("xyzabc","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29548);assertEquals("prependIfMissingIgnoreCase(mnoabc,xyz,mno)", "mnoabc", StringUtils.prependIfMissingIgnoreCase("mnoabc","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29549);assertEquals("prependIfMissingIgnoreCase(XYZabc,xyz,mno)", "XYZabc", StringUtils.prependIfMissingIgnoreCase("XYZabc","xyz","mno"));
        __CLR4_1_2lnxlnxl3lqxu48.R.inc(29550);assertEquals("prependIfMissingIgnoreCase(MNOabc,xyz,mno)", "MNOabc", StringUtils.prependIfMissingIgnoreCase("MNOabc","xyz","mno"));
    }finally{__CLR4_1_2lnxlnxl3lqxu48.R.flushNeeded();}}
}
