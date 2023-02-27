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

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;

/**
 * Unit test for Tokenizer.
 * 
 */
public class StrTokenizerTest {static class __CLR4_1_2vd3vd3l3lqxv0r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,41213,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String CSV_SIMPLE_FIXTURE = "A,b,c";

    private static final String TSV_SIMPLE_FIXTURE = "A\tb\tc";

    private void checkClone(final StrTokenizer tokenizer) {try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40647);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40648);assertFalse(StrTokenizer.getCSVInstance() == tokenizer);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40649);assertFalse(StrTokenizer.getTSVInstance() == tokenizer);
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void test1() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24e6beuvd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40650,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24e6beuvd6(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40650);

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40651);final String input = "a;b;c;\"d;\"\"e\";f; ; ;  ";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40652);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40653);tok.setDelimiterChar(';');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40654);tok.setQuoteChar('"');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40655);tok.setIgnoredMatcher(StrMatcher.trimMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40656);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40657);final String tokens[] = tok.getTokenArray();

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40658);final String expected[] = new String[]{"a", "b", "c", "d;\"e", "f", "", "", "",};

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40659);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40660);for (int i = 0; (((i < expected.length)&&(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40661)!=0|true))||(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40662)==0&false)); i++) {{
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40663);assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    ObjectUtils.equals(expected[i], tokens[i]));
        }

    }}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void test2() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27n6a7bvdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40664,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27n6a7bvdk(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40664);

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40665);final String input = "a;b;c ;\"d;\"\"e\";f; ; ;";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40666);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40667);tok.setDelimiterChar(';');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40668);tok.setQuoteChar('"');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40669);tok.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40670);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40671);final String tokens[] = tok.getTokenArray();

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40672);final String expected[] = new String[]{"a", "b", "c ", "d;\"e", "f", " ", " ", "",};

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40673);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40674);for (int i = 0; (((i < expected.length)&&(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40675)!=0|true))||(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40676)==0&false)); i++) {{
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40677);assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    ObjectUtils.equals(expected[i], tokens[i]));
        }

    }}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void test3() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aw68zsvdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test3",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40678,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aw68zsvdy(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40678);

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40679);final String input = "a;b; c;\"d;\"\"e\";f; ; ;";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40680);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40681);tok.setDelimiterChar(';');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40682);tok.setQuoteChar('"');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40683);tok.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40684);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40685);final String tokens[] = tok.getTokenArray();

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40686);final String expected[] = new String[]{"a", "b", " c", "d;\"e", "f", " ", " ", "",};

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40687);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40688);for (int i = 0; (((i < expected.length)&&(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40689)!=0|true))||(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40690)==0&false)); i++) {{
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40691);assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    ObjectUtils.equals(expected[i], tokens[i]));
        }

    }}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void test4() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2e567s9vec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test4",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40692,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2e567s9vec(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40692);

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40693);final String input = "a;b; c;\"d;\"\"e\";f; ; ;";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40694);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40695);tok.setDelimiterChar(';');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40696);tok.setQuoteChar('"');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40697);tok.setIgnoredMatcher(StrMatcher.trimMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40698);tok.setIgnoreEmptyTokens(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40699);final String tokens[] = tok.getTokenArray();

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40700);final String expected[] = new String[]{"a", "b", "c", "d;\"e", "f",};

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40701);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40702);for (int i = 0; (((i < expected.length)&&(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40703)!=0|true))||(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40704)==0&false)); i++) {{
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40705);assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    ObjectUtils.equals(expected[i], tokens[i]));
        }

    }}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void test5() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2he66kqveq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test5",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40706,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2he66kqveq(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40706);

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40707);final String input = "a;b; c;\"d;\"\"e\";f; ; ;";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40708);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40709);tok.setDelimiterChar(';');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40710);tok.setQuoteChar('"');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40711);tok.setIgnoredMatcher(StrMatcher.trimMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40712);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40713);tok.setEmptyTokenAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40714);final String tokens[] = tok.getTokenArray();

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40715);final String expected[] = new String[]{"a", "b", "c", "d;\"e", "f", null, null, null,};

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40716);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40717);for (int i = 0; (((i < expected.length)&&(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40718)!=0|true))||(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40719)==0&false)); i++) {{
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40720);assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    ObjectUtils.equals(expected[i], tokens[i]));
        }

    }}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void test6() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kn65d7vf5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test6",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40721,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kn65d7vf5(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40721);

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40722);final String input = "a;b; c;\"d;\"\"e\";f; ; ;";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40723);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40724);tok.setDelimiterChar(';');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40725);tok.setQuoteChar('"');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40726);tok.setIgnoredMatcher(StrMatcher.trimMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40727);tok.setIgnoreEmptyTokens(false);
        // tok.setTreatingEmptyAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40728);final String tokens[] = tok.getTokenArray();

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40729);final String expected[] = new String[]{"a", "b", " c", "d;\"e", "f", null, null, null,};

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40730);int nextCount = 0;
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40731);while ((((tok.hasNext())&&(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40732)!=0|true))||(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40733)==0&false))) {{
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40734);tok.next();
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40735);nextCount++;
        }

        }__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40736);int prevCount = 0;
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40737);while ((((tok.hasPrevious())&&(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40738)!=0|true))||(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40739)==0&false))) {{
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40740);tok.previous();
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40741);prevCount++;
        }

        }__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40742);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40743);assertTrue("could not cycle through entire token list" + " using the 'hasNext' and 'next' methods",
                nextCount == expected.length);

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40744);assertTrue("could not cycle through entire token list" + " using the 'hasPrevious' and 'previous' methods",
                prevCount == expected.length);

    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void test7() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nw645ovft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test7",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40745,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nw645ovft(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40745);

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40746);final String input = "a   b c \"d e\" f ";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40747);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40748);tok.setDelimiterMatcher(StrMatcher.spaceMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40749);tok.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40750);tok.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40751);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40752);final String tokens[] = tok.getTokenArray();

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40753);final String expected[] = new String[]{"a", "", "", "b", "c", "d e", "f", "",};

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40754);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40755);for (int i = 0; (((i < expected.length)&&(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40756)!=0|true))||(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40757)==0&false)); i++) {{
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40758);assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    ObjectUtils.equals(expected[i], tokens[i]));
        }

    }}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void test8() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r562y5vg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.test8",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40759,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r562y5vg7(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40759);

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40760);final String input = "a   b c \"d e\" f ";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40761);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40762);tok.setDelimiterMatcher(StrMatcher.spaceMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40763);tok.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40764);tok.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40765);tok.setIgnoreEmptyTokens(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40766);final String tokens[] = tok.getTokenArray();

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40767);final String expected[] = new String[]{"a", "b", "c", "d e", "f",};

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40768);assertEquals(ArrayUtils.toString(tokens), expected.length, tokens.length);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40769);for (int i = 0; (((i < expected.length)&&(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40770)!=0|true))||(__CLR4_1_2vd3vd3l3lqxv0r.R.iget(40771)==0&false)); i++) {{
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40772);assertTrue("token[" + i + "] was '" + tokens[i] + "' but was expected to be '" + expected[i] + "'",
                    ObjectUtils.equals(expected[i], tokens[i]));
        }

    }}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasic1() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40773);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rlm9usvgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasic1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40773,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rlm9usvgl(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40773);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40774);final String input = "a  b c";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40775);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40776);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40777);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40778);assertEquals("c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40779);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasic2() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ocmb2bvgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasic2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40780,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ocmb2bvgs(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40780);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40781);final String input = "a \nb\fc";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40782);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40783);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40784);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40785);assertEquals("c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40786);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasic3() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2l3mc9uvgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasic3",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40787,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2l3mc9uvgz(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40787);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40788);final String input = "a \nb\u0001\fc";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40789);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40790);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40791);assertEquals("b\u0001", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40792);assertEquals("c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40793);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasic4() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2humdhdvh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasic4",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40794,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2humdhdvh6(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40794);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40795);final String input = "a \"b\" c";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40796);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40797);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40798);assertEquals("\"b\"", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40799);assertEquals("c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40800);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasic5() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2elmeowvhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasic5",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40801,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2elmeowvhd(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40801);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40802);final String input = "a:b':c";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40803);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40804);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40805);assertEquals("b'", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40806);assertEquals("c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40807);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicDelim1() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tauj2dvhk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicDelim1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40808,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tauj2dvhk(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40808);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40809);final String input = "a:b:c";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40810);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40811);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40812);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40813);assertEquals("c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40814);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicDelim2() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wjuhuuvhr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicDelim2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40815,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wjuhuuvhr(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40815);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40816);final String input = "a:b:c";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40817);final StrTokenizer tok = new StrTokenizer(input, ',');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40818);assertEquals("a:b:c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40819);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicEmpty1() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22dr13tvhw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicEmpty1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40820,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22dr13tvhw(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40820);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40821);final String input = "a  b c";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40822);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40823);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40824);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40825);assertEquals("", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40826);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40827);assertEquals("c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40828);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicEmpty2() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v8xoovi5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicEmpty2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40829,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v8xoovi5(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40829);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40830);final String input = "a  b c";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40831);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40832);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40833);tok.setEmptyTokenAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40834);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40835);assertEquals(null, tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40836);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40837);assertEquals("c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40838);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicQuoted1() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23371m4vif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40839,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23371m4vif(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40839);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40840);final String input = "a 'b' c";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40841);final StrTokenizer tok = new StrTokenizer(input, ' ', '\'');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40842);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40843);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40844);assertEquals("c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40845);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicQuoted2() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25sx6dvim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40846,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25sx6dvim(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40846);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40847);final String input = "a:'b':";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40848);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40849);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40850);tok.setEmptyTokenAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40851);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40852);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40853);assertEquals(null, tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40854);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicQuoted3() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23esvyuviv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted3",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40855,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23esvyuviv(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40855);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40856);final String input = "a:'b''c'";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40857);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40858);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40859);tok.setEmptyTokenAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40860);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40861);assertEquals("b'c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40862);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicQuoted4() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26nsurbvj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted4",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40863,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26nsurbvj3(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40863);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40864);final String input = "a: 'b' 'c' :d";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40865);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40866);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40867);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40868);tok.setEmptyTokenAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40869);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40870);assertEquals("b c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40871);assertEquals("d", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40872);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicQuoted5() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29wstjsvjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted5",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40873,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29wstjsvjd(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40873);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40874);final String input = "a: 'b'x'c' :d";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40875);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40876);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40877);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40878);tok.setEmptyTokenAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40879);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40880);assertEquals("bxc", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40881);assertEquals("d", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40882);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicQuoted6() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d5ssc9vjn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted6",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40883,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d5ssc9vjn(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40883);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40884);final String input = "a:'b'\"c':d";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40885);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40886);tok.setQuoteMatcher(StrMatcher.quoteMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40887);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40888);assertEquals("b\"c:d", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40889);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicQuoted7() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gesr4qvju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuoted7",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40890,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gesr4qvju(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40890);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40891);final String input = "a:\"There's a reason here\":b";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40892);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40893);tok.setQuoteMatcher(StrMatcher.quoteMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40894);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40895);assertEquals("There's a reason here", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40896);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40897);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicQuotedTrimmed1() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2acxmj6vk2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicQuotedTrimmed1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40898,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2acxmj6vk2(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40898);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40899);final String input = "a: 'b' :";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40900);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40901);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40902);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40903);tok.setEmptyTokenAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40904);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40905);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40906);assertEquals(null, tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40907);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicTrimmed1() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_231qn62vkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicTrimmed1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40908,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_231qn62vkc(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40908);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40909);final String input = "a: b :  ";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40910);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40911);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40912);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40913);tok.setEmptyTokenAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40914);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40915);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40916);assertEquals(null, tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40917);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicTrimmed2() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26aqlyjvkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicTrimmed2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40918,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26aqlyjvkm(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40918);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40919);final String input = "a:  b  :";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40920);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40921);tok.setTrimmerMatcher(StrMatcher.stringMatcher("  "));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40922);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40923);tok.setEmptyTokenAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40924);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40925);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40926);assertEquals(null, tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40927);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicIgnoreTrimmed1() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cytnr0vkw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicIgnoreTrimmed1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40928,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cytnr0vkw(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40928);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40929);final String input = "a: bIGNOREc : ";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40930);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40931);tok.setIgnoredMatcher(StrMatcher.stringMatcher("IGNORE"));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40932);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40933);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40934);tok.setEmptyTokenAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40935);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40936);assertEquals("bc", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40937);assertEquals(null, tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40938);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicIgnoreTrimmed2() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g7tmjhvl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicIgnoreTrimmed2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40939,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g7tmjhvl7(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40939);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40940);final String input = "IGNOREaIGNORE: IGNORE bIGNOREc IGNORE : IGNORE ";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40941);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40942);tok.setIgnoredMatcher(StrMatcher.stringMatcher("IGNORE"));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40943);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40944);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40945);tok.setEmptyTokenAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40946);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40947);assertEquals("bc", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40948);assertEquals(null, tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40949);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicIgnoreTrimmed3() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jgtlbyvli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicIgnoreTrimmed3",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40950,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jgtlbyvli(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40950);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40951);final String input = "IGNOREaIGNORE: IGNORE bIGNOREc IGNORE : IGNORE ";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40952);final StrTokenizer tok = new StrTokenizer(input, ':');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40953);tok.setIgnoredMatcher(StrMatcher.stringMatcher("IGNORE"));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40954);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40955);tok.setEmptyTokenAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40956);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40957);assertEquals("  bc  ", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40958);assertEquals("  ", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40959);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testBasicIgnoreTrimmed4() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mptk4fvls();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testBasicIgnoreTrimmed4",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40960,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mptk4fvls(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40960);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40961);final String input = "IGNOREaIGNORE: IGNORE 'bIGNOREc'IGNORE'd' IGNORE : IGNORE ";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40962);final StrTokenizer tok = new StrTokenizer(input, ':', '\'');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40963);tok.setIgnoredMatcher(StrMatcher.stringMatcher("IGNORE"));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40964);tok.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40965);tok.setIgnoreEmptyTokens(false);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40966);tok.setEmptyTokenAsNull(true);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40967);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40968);assertEquals("bIGNOREcd", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40969);assertEquals(null, tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40970);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testListArray() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nz0nw0vm3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testListArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40971,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nz0nw0vm3(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40971);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40972);final String input = "a  b c";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40973);final StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40974);final String[] array = tok.getTokenArray();
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40975);final List<?> list = tok.getTokenList();
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40976);assertEquals(Arrays.asList(array), list);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40977);assertEquals(3, list.size());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void testCSV(final String data) {try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40978);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40979);this.testXSVAbc(StrTokenizer.getCSVInstance(data));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40980);this.testXSVAbc(StrTokenizer.getCSVInstance(data.toCharArray()));
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testCSVEmpty() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xqvfswvmd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testCSVEmpty",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40981,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xqvfswvmd(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40981);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40982);this.testEmpty(StrTokenizer.getCSVInstance());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40983);this.testEmpty(StrTokenizer.getCSVInstance(""));
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testCSVSimple() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hdwm8jvmg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testCSVSimple",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40984,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hdwm8jvmg(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40984);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40985);this.testCSV(CSV_SIMPLE_FIXTURE);
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testCSVSimpleNeedsTrim() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24t3jcwvmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testCSVSimpleNeedsTrim",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40986,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24t3jcwvmi(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40986);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40987);this.testCSV("   " + CSV_SIMPLE_FIXTURE);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40988);this.testCSV("   \n\t  " + CSV_SIMPLE_FIXTURE);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40989);this.testCSV("   \n  " + CSV_SIMPLE_FIXTURE + "\n\n\r");
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    void testEmpty(final StrTokenizer tokenizer) {try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40990);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40991);this.checkClone(tokenizer);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40992);assertFalse(tokenizer.hasNext());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40993);assertFalse(tokenizer.hasPrevious());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40994);assertEquals(null, tokenizer.nextToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40995);assertEquals(0, tokenizer.size());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40996);try {
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40997);tokenizer.next();
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(40998);fail();
        } catch (final NoSuchElementException ex) {}
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testGetContent() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),40999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26pculgvmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testGetContent",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40999,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26pculgvmv(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(40999);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41000);final String input = "a   b c \"d e\" f ";
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41001);StrTokenizer tok = new StrTokenizer(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41002);assertEquals(input, tok.getContent());

        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41003);tok = new StrTokenizer(input.toCharArray());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41004);assertEquals(input, tok.getContent());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41005);tok = new StrTokenizer();
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41006);assertEquals(null, tok.getContent());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testChaining() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ks9sm2vn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testChaining",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41007,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ks9sm2vn3(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41007);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41008);final StrTokenizer tok = new StrTokenizer();
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41009);assertEquals(tok, tok.reset());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41010);assertEquals(tok, tok.reset(""));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41011);assertEquals(tok, tok.reset(new char[0]));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41012);assertEquals(tok, tok.setDelimiterChar(' '));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41013);assertEquals(tok, tok.setDelimiterString(" "));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41014);assertEquals(tok, tok.setDelimiterMatcher(null));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41015);assertEquals(tok, tok.setQuoteChar(' '));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41016);assertEquals(tok, tok.setQuoteMatcher(null));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41017);assertEquals(tok, tok.setIgnoredChar(' '));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41018);assertEquals(tok, tok.setIgnoredMatcher(null));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41019);assertEquals(tok, tok.setTrimmerMatcher(null));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41020);assertEquals(tok, tok.setEmptyTokenAsNull(false));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41021);assertEquals(tok, tok.setIgnoreEmptyTokens(false));
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    /**
     * Tests that the {@link StrTokenizer#clone()} clone method catches {@link CloneNotSupportedException} and returns
     * <code>null</code>.
     */
    @Test
    public void testCloneNotSupportedException() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29o7laovni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testCloneNotSupportedException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41022,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29o7laovni(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41022);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41023);final Object notCloned = new StrTokenizer() {
            @Override
            Object cloneReset() throws CloneNotSupportedException {try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41024);
                __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41025);throw new CloneNotSupportedException("test");
            }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}
        }.clone();
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41026);assertNull(notCloned);
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testCloneNull() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_239os87vnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testCloneNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41027,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_239os87vnn(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41027);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41028);final StrTokenizer tokenizer = new StrTokenizer((char[]) null);
        // Start sanity check
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41029);assertEquals(null, tokenizer.nextToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41030);tokenizer.reset();
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41031);assertEquals(null, tokenizer.nextToken());
        // End sanity check
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41032);final StrTokenizer clonedTokenizer = (StrTokenizer) tokenizer.clone();
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41033);tokenizer.reset();
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41034);assertEquals(null, tokenizer.nextToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41035);assertEquals(null, clonedTokenizer.nextToken());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testCloneReset() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uubunfvnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testCloneReset",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41036,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uubunfvnw(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41036);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41037);final char[] input = new char[]{'a'};
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41038);final StrTokenizer tokenizer = new StrTokenizer(input);
        // Start sanity check
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41039);assertEquals("a", tokenizer.nextToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41040);tokenizer.reset(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41041);assertEquals("a", tokenizer.nextToken());
        // End sanity check
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41042);final StrTokenizer clonedTokenizer = (StrTokenizer) tokenizer.clone();
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41043);input[0] = 'b';
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41044);tokenizer.reset(input);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41045);assertEquals("b", tokenizer.nextToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41046);assertEquals("a", clonedTokenizer.nextToken());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}
  
    // -----------------------------------------------------------------------
    @Test
    public void testConstructor_String() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_245xchdvo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testConstructor_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41047,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_245xchdvo7(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41047);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41048);StrTokenizer tok = new StrTokenizer("a b");
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41049);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41050);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41051);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41052);tok = new StrTokenizer("");
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41053);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41054);tok = new StrTokenizer((String) null);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41055);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_String_char() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2188rxovog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testConstructor_String_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41056,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2188rxovog(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41056);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41057);StrTokenizer tok = new StrTokenizer("a b", ' ');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41058);assertEquals(1, tok.getDelimiterMatcher().isMatch(" ".toCharArray(), 0, 0, 1));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41059);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41060);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41061);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41062);tok = new StrTokenizer("", ' ');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41063);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41064);tok = new StrTokenizer((String) null, ' ');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41065);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_String_char_char() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2c4x7blvoq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testConstructor_String_char_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41066,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2c4x7blvoq(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41066);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41067);StrTokenizer tok = new StrTokenizer("a b", ' ', '"');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41068);assertEquals(1, tok.getDelimiterMatcher().isMatch(" ".toCharArray(), 0, 0, 1));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41069);assertEquals(1, tok.getQuoteMatcher().isMatch("\"".toCharArray(), 0, 0, 1));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41070);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41071);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41072);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41073);tok = new StrTokenizer("", ' ', '"');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41074);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41075);tok = new StrTokenizer((String) null, ' ', '"');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41076);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_charArray() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k0rg1fvp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testConstructor_charArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41077,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k0rg1fvp1(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41077);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41078);StrTokenizer tok = new StrTokenizer("a b".toCharArray());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41079);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41080);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41081);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41082);tok = new StrTokenizer(new char[0]);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41083);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41084);tok = new StrTokenizer((char[]) null);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41085);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_charArray_char() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nu859svpa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testConstructor_charArray_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41086,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nu859svpa(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41086);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41087);StrTokenizer tok = new StrTokenizer("a b".toCharArray(), ' ');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41088);assertEquals(1, tok.getDelimiterMatcher().isMatch(" ".toCharArray(), 0, 0, 1));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41089);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41090);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41091);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41092);tok = new StrTokenizer(new char[0], ' ');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41093);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41094);tok = new StrTokenizer((char[]) null, ' ');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41095);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_charArray_char_char() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aql3pvvpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testConstructor_charArray_char_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41096,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aql3pvvpk(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41096);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41097);StrTokenizer tok = new StrTokenizer("a b".toCharArray(), ' ', '"');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41098);assertEquals(1, tok.getDelimiterMatcher().isMatch(" ".toCharArray(), 0, 0, 1));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41099);assertEquals(1, tok.getQuoteMatcher().isMatch("\"".toCharArray(), 0, 0, 1));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41100);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41101);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41102);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41103);tok = new StrTokenizer(new char[0], ' ', '"');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41104);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41105);tok = new StrTokenizer((char[]) null, ' ', '"');
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41106);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReset() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26jq2kcvpv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testReset",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41107,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26jq2kcvpv(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41107);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41108);final StrTokenizer tok = new StrTokenizer("a b c");
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41109);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41110);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41111);assertEquals("c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41112);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41113);tok.reset();
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41114);assertEquals("a", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41115);assertEquals("b", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41116);assertEquals("c", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41117);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReset_String() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ap8c3qvq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testReset_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41118,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ap8c3qvq6(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41118);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41119);final StrTokenizer tok = new StrTokenizer("x x x");
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41120);tok.reset("d e");
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41121);assertEquals("d", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41122);assertEquals("e", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41123);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41124);tok.reset((String) null);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41125);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testReset_charArray() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25wln2wvqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testReset_charArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41126,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25wln2wvqe(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41126);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41127);final StrTokenizer tok = new StrTokenizer("x x x");
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41128);final char[] array = new char[] {'a', 'b', 'c'};
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41129);tok.reset(array);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41130);assertEquals("abc", tok.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41131);assertFalse(tok.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41132);tok.reset((char[]) null);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41133);assertFalse(tok.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTSV() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28t1n64vqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testTSV",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41134,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28t1n64vqm(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41134);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41135);this.testXSVAbc(StrTokenizer.getTSVInstance(TSV_SIMPLE_FIXTURE));
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41136);this.testXSVAbc(StrTokenizer.getTSVInstance(TSV_SIMPLE_FIXTURE.toCharArray()));
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testTSVEmpty() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28f3m3zvqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testTSVEmpty",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41137,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28f3m3zvqp(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41137);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41138);this.testEmpty(StrTokenizer.getCSVInstance());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41139);this.testEmpty(StrTokenizer.getCSVInstance(""));
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    void testXSVAbc(final StrTokenizer tokenizer) {try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41140);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41141);this.checkClone(tokenizer);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41142);assertEquals(-1, tokenizer.previousIndex());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41143);assertEquals(0, tokenizer.nextIndex());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41144);assertEquals(null, tokenizer.previousToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41145);assertEquals("A", tokenizer.nextToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41146);assertEquals(1, tokenizer.nextIndex());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41147);assertEquals("b", tokenizer.nextToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41148);assertEquals(2, tokenizer.nextIndex());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41149);assertEquals("c", tokenizer.nextToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41150);assertEquals(3, tokenizer.nextIndex());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41151);assertEquals(null, tokenizer.nextToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41152);assertEquals(3, tokenizer.nextIndex());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41153);assertEquals("c", tokenizer.previousToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41154);assertEquals(2, tokenizer.nextIndex());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41155);assertEquals("b", tokenizer.previousToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41156);assertEquals(1, tokenizer.nextIndex());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41157);assertEquals("A", tokenizer.previousToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41158);assertEquals(0, tokenizer.nextIndex());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41159);assertEquals(null, tokenizer.previousToken());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41160);assertEquals(0, tokenizer.nextIndex());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41161);assertEquals(-1, tokenizer.previousIndex());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41162);assertEquals(3, tokenizer.size());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    @Test
    public void testIteration() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24ob0pevrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testIteration",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41163,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24ob0pevrf(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41163);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41164);final StrTokenizer tkn = new StrTokenizer("a b c");
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41165);assertFalse(tkn.hasPrevious());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41166);try {
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41167);tkn.previous();
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41168);fail();
        } catch (final NoSuchElementException ex) {}
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41169);assertTrue(tkn.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41170);assertEquals("a", tkn.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41171);try {
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41172);tkn.remove();
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41173);fail();
        } catch (final UnsupportedOperationException ex) {}
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41174);try {
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41175);tkn.set("x");
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41176);fail();
        } catch (final UnsupportedOperationException ex) {}
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41177);try {
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41178);tkn.add("y");
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41179);fail();
        } catch (final UnsupportedOperationException ex) {}
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41180);assertTrue(tkn.hasPrevious());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41181);assertTrue(tkn.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41182);assertEquals("b", tkn.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41183);assertTrue(tkn.hasPrevious());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41184);assertTrue(tkn.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41185);assertEquals("c", tkn.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41186);assertTrue(tkn.hasPrevious());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41187);assertFalse(tkn.hasNext());
        
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41188);try {
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41189);tkn.next();
            __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41190);fail();
        } catch (final NoSuchElementException ex) {}
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41191);assertTrue(tkn.hasPrevious());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41192);assertFalse(tkn.hasNext());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTokenizeSubclassInputChange() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fk0bwkvs9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testTokenizeSubclassInputChange",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41193,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fk0bwkvs9(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41193);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41194);final StrTokenizer tkn = new StrTokenizer("a b c d e") {
            @Override
            protected List<String> tokenize(final char[] chars, final int offset, final int count) {try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41195);
                __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41196);return super.tokenize("w x y z".toCharArray(), 2, 5);
            }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}
        };
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41197);assertEquals("x", tkn.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41198);assertEquals("y", tkn.next());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTokenizeSubclassOutputChange() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2edwzctvsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testTokenizeSubclassOutputChange",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41199,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2edwzctvsf(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41199);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41200);final StrTokenizer tkn = new StrTokenizer("a b c") {
            @Override
            protected List<String> tokenize(final char[] chars, final int offset, final int count) {try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41201);
                __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41202);final List<String> list = super.tokenize(chars, offset, count);
                __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41203);Collections.reverse(list);
                __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41204);return list;
            }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}
        };
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41205);assertEquals("c", tkn.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41206);assertEquals("b", tkn.next());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41207);assertEquals("a", tkn.next());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceStart(getClass().getName(),41208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidvso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2vd3vd3l3lqxv0r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2vd3vd3l3lqxv0r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrTokenizerTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41208,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidvso(){try{__CLR4_1_2vd3vd3l3lqxv0r.R.inc(41208);
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41209);final StrTokenizer tkn = new StrTokenizer("a b c d e");
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41210);assertEquals("StrTokenizer[not tokenized yet]", tkn.toString());
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41211);tkn.next();
        __CLR4_1_2vd3vd3l3lqxv0r.R.inc(41212);assertEquals("StrTokenizer[a, b, c, d, e]", tkn.toString());
    }finally{__CLR4_1_2vd3vd3l3lqxv0r.R.flushNeeded();}}

}
