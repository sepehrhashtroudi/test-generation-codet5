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
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.apache.commons.lang3.SystemUtils;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.StrBuilder}.
 *
 * @version $Id$
 */
public class StrBuilderAppendInsertTest {static class __CLR4_1_2te5te5l3lqxuwl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,38988,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** The system line separator. */
    private static final String SEP = SystemUtils.LINE_SEPARATOR;

    /** Test subclass of Object, with a toString method. */
    private static final Object FOO = new Object() {
        @Override
        public String toString() {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38093);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38094);return "foo";
        }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
    };

    //-----------------------------------------------------------------------
    @Test
    public void testAppendNewLine() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gzphptte7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendNewLine",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38095,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gzphptte7(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38095);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38096);StrBuilder sb = new StrBuilder("---");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38097);sb.appendNewLine().append("+++");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38098);assertEquals("---" + SEP + "+++", sb.toString());
        
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38099);sb = new StrBuilder("---");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38100);sb.setNewLineText("#").appendNewLine().setNewLineText(null).appendNewLine();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38101);assertEquals("---#" + SEP, sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendWithNullText() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ih84ibtee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendWithNullText",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38102,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ih84ibtee(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38102);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38103);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38104);sb.setNullText("NULL");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38105);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38106);sb.appendNull();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38107);assertEquals("NULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38108);sb.append((Object) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38109);assertEquals("NULLNULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38110);sb.append(FOO);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38111);assertEquals("NULLNULLfoo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38112);sb.append((String) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38113);assertEquals("NULLNULLfooNULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38114);sb.append("");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38115);assertEquals("NULLNULLfooNULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38116);sb.append("bar");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38117);assertEquals("NULLNULLfooNULLbar", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38118);sb.append((StringBuffer) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38119);assertEquals("NULLNULLfooNULLbarNULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38120);sb.append(new StringBuffer("baz"));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38121);assertEquals("NULLNULLfooNULLbarNULLbaz", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_Object() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k9usvttey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_Object",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38122,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k9usvttey(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38122);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38123);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38124);sb.appendNull();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38125);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38126);sb.append((Object) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38127);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38128);sb.append(FOO);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38129);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38130);sb.append((StringBuffer) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38131);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38132);sb.append(new StringBuffer("baz"));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38133);assertEquals("foobaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38134);sb.append(new StrBuilder("yes"));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38135);assertEquals("foobazyes", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38136);sb.append((CharSequence) "Seq");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38137);assertEquals("foobazyesSeq", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38138);sb.append(new StringBuilder("bld")); // Check it supports StringBuilder
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38139);assertEquals("foobazyesSeqbld", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testAppend_StringBuilder() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vvq78itfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_StringBuilder",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38140,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vvq78itfg(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38140);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38141);StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38142);sb.setNullText("NULL").append((String) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38143);assertEquals("NULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38144);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38145);sb.append(new StringBuilder("foo"));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38146);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38147);sb.append(new StringBuilder(""));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38148);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38149);sb.append(new StringBuilder("bar"));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38150);assertEquals("foobar", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_String() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2utissrtfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38151,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2utissrtfr(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38151);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38152);StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38153);sb.setNullText("NULL").append((String) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38154);assertEquals("NULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38155);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38156);sb.append("foo");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38157);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38158);sb.append("");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38159);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38160);sb.append("bar");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38161);assertEquals("foobar", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_String_int_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dvwd63tg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_String_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38162,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dvwd63tg2(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38162);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38163);StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38164);sb.setNullText("NULL").append((String) null, 0, 1);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38165);assertEquals("NULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38166);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38167);sb.append("foo", 0, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38168);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38169);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38170);sb.append("bar", -1, 1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38171);fail("append(char[], -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38172);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38173);sb.append("bar", 3, 1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38174);fail("append(char[], 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38175);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38176);sb.append("bar", 1, -1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38177);fail("append(char[],, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38178);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38179);sb.append("bar", 1, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38180);fail("append(char[], 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38181);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38182);sb.append("bar", -1, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38183);fail("append(char[], -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38184);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38185);sb.append("bar", 4, 0);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38186);fail("append(char[], 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38187);sb.append("bar", 3, 0);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38188);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38189);sb.append("abcbardef", 3, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38190);assertEquals("foobar", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38191);sb.append( (CharSequence)"abcbardef", 4, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38192);assertEquals("foobarard", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testAppend_StringBuilder_int_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fuyshutgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_StringBuilder_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38193,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fuyshutgx(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38193);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38194);StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38195);sb.setNullText("NULL").append((String) null, 0, 1);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38196);assertEquals("NULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38197);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38198);sb.append(new StringBuilder("foo"), 0, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38199);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38200);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38201);sb.append(new StringBuilder("bar"), -1, 1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38202);fail("append(StringBuilder, -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38203);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38204);sb.append(new StringBuilder("bar"), 3, 1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38205);fail("append(StringBuilder, 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38206);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38207);sb.append(new StringBuilder("bar"), 1, -1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38208);fail("append(StringBuilder,, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38209);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38210);sb.append(new StringBuilder("bar"), 1, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38211);fail("append(StringBuilder, 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38212);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38213);sb.append(new StringBuilder("bar"), -1, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38214);fail("append(StringBuilder, -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38215);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38216);sb.append(new StringBuilder("bar"), 4, 0);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38217);fail("append(StringBuilder, 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38218);sb.append(new StringBuilder("bar"), 3, 0);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38219);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38220);sb.append(new StringBuilder("abcbardef"), 3, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38221);assertEquals("foobar", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38222);sb.append( new StringBuilder("abcbardef"), 4, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38223);assertEquals("foobarard", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_StringBuffer() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aox57vths();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_StringBuffer",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38224,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aox57vths(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38224);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38225);StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38226);sb.setNullText("NULL").append((StringBuffer) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38227);assertEquals("NULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38228);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38229);sb.append(new StringBuffer("foo"));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38230);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38231);sb.append(new StringBuffer(""));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38232);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38233);sb.append(new StringBuffer("bar"));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38234);assertEquals("foobar", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_StringBuffer_int_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r3e585ti3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_StringBuffer_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38235,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r3e585ti3(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38235);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38236);StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38237);sb.setNullText("NULL").append((StringBuffer) null, 0, 1);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38238);assertEquals("NULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38239);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38240);sb.append(new StringBuffer("foo"), 0, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38241);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38242);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38243);sb.append(new StringBuffer("bar"), -1, 1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38244);fail("append(char[], -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38245);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38246);sb.append(new StringBuffer("bar"), 3, 1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38247);fail("append(char[], 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38248);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38249);sb.append(new StringBuffer("bar"), 1, -1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38250);fail("append(char[],, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38251);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38252);sb.append(new StringBuffer("bar"), 1, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38253);fail("append(char[], 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38254);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38255);sb.append(new StringBuffer("bar"), -1, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38256);fail("append(char[], -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38257);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38258);sb.append(new StringBuffer("bar"), 4, 0);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38259);fail("append(char[], 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38260);sb.append(new StringBuffer("bar"), 3, 0);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38261);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38262);sb.append(new StringBuffer("abcbardef"), 3, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38263);assertEquals("foobar", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_StrBuilder() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gvs5hgtiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_StrBuilder",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38264,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gvs5hgtiw(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38264);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38265);StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38266);sb.setNullText("NULL").append((StrBuilder) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38267);assertEquals("NULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38268);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38269);sb.append(new StrBuilder("foo"));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38270);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38271);sb.append(new StrBuilder(""));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38272);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38273);sb.append(new StrBuilder("bar"));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38274);assertEquals("foobar", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_StrBuilder_int_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hgdpzwtj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_StrBuilder_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38275,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hgdpzwtj7(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38275);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38276);StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38277);sb.setNullText("NULL").append((StrBuilder) null, 0, 1);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38278);assertEquals("NULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38279);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38280);sb.append(new StrBuilder("foo"), 0, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38281);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38282);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38283);sb.append(new StrBuilder("bar"), -1, 1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38284);fail("append(char[], -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38285);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38286);sb.append(new StrBuilder("bar"), 3, 1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38287);fail("append(char[], 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38288);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38289);sb.append(new StrBuilder("bar"), 1, -1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38290);fail("append(char[],, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38291);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38292);sb.append(new StrBuilder("bar"), 1, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38293);fail("append(char[], 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38294);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38295);sb.append(new StrBuilder("bar"), -1, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38296);fail("append(char[], -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38297);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38298);sb.append(new StrBuilder("bar"), 4, 0);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38299);fail("append(char[], 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38300);sb.append(new StrBuilder("bar"), 3, 0);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38301);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38302);sb.append(new StrBuilder("abcbardef"), 3, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38303);assertEquals("foobar", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_CharArray() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iaia21tk0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_CharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38304,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iaia21tk0(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38304);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38305);StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38306);sb.setNullText("NULL").append((char[]) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38307);assertEquals("NULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38308);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38309);sb.append(new char[0]);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38310);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38311);sb.append(new char[]{'f', 'o', 'o'});
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38312);assertEquals("foo", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_CharArray_int_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jiosmvtk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_CharArray_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38313,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jiosmvtk9(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38313);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38314);StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38315);sb.setNullText("NULL").append((char[]) null, 0, 1);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38316);assertEquals("NULL", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38317);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38318);sb.append(new char[]{'f', 'o', 'o'}, 0, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38319);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38320);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38321);sb.append(new char[]{'b', 'a', 'r'}, -1, 1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38322);fail("append(char[], -1,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38323);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38324);sb.append(new char[]{'b', 'a', 'r'}, 3, 1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38325);fail("append(char[], 3,) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38326);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38327);sb.append(new char[]{'b', 'a', 'r'}, 1, -1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38328);fail("append(char[],, -1) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38329);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38330);sb.append(new char[]{'b', 'a', 'r'}, 1, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38331);fail("append(char[], 1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38332);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38333);sb.append(new char[]{'b', 'a', 'r'}, -1, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38334);fail("append(char[], -1, 3) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38335);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38336);sb.append(new char[]{'b', 'a', 'r'}, 4, 0);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38337);fail("append(char[], 4, 0) expected IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38338);sb.append(new char[]{'b', 'a', 'r'}, 3, 0);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38339);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38340);sb.append(new char[]{'a', 'b', 'c', 'b', 'a', 'r', 'd', 'e', 'f'}, 3, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38341);assertEquals("foobar", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_Boolean() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aa2v24tl2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_Boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38342,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aa2v24tl2(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38342);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38343);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38344);sb.append(true);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38345);assertEquals("true", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38346);sb.append(false);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38347);assertEquals("truefalse", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38348);sb.append('!');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38349);assertEquals("truefalse!", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_PrimitiveNumber() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cmmr38tla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_PrimitiveNumber",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38350,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cmmr38tla(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38350);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38351);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38352);sb.append(0);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38353);assertEquals("0", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38354);sb.append(1L);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38355);assertEquals("01", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38356);sb.append(2.3f);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38357);assertEquals("012.3", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38358);sb.append(4.5d);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38359);assertEquals("012.34.5", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_FormattedString() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2l8eqebtlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_FormattedString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38360,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2l8eqebtlk(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38360);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38361);final int[] count = new int[2];
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38362);final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final String str) {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38363);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38364);count[0]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38365);return super.append(str);
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38366);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38367);count[1]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38368);return super.appendNewLine();
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
        };
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38369);sb.appendln("Hello %s", "Alice");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38370);assertEquals("Hello Alice" + SEP, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38371);assertEquals(2, count[0]);  // appendNewLine() calls append(String)
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38372);assertEquals(1, count[1]);
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_Object() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22h494ntlx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_Object",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38373,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22h494ntlx(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38373);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38374);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38375);sb.appendln((Object) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38376);assertEquals("" + SEP, sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38377);sb.appendln(FOO);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38378);assertEquals(SEP + "foo" + SEP, sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38379);sb.appendln(Integer.valueOf(6));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38380);assertEquals(SEP + "foo" + SEP + "6" + SEP, sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_String() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d0s91ltm5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38381,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d0s91ltm5(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38381);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38382);final int[] count = new int[2];
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38383);final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final String str) {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38384);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38385);count[0]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38386);return super.append(str);
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38387);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38388);count[1]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38389);return super.appendNewLine();
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
        };
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38390);sb.appendln("foo");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38391);assertEquals("foo" + SEP, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38392);assertEquals(2, count[0]);  // appendNewLine() calls append(String)
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38393);assertEquals(1, count[1]);
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_String_int_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oe8bahtmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_String_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38394,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oe8bahtmi(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38394);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38395);final int[] count = new int[2];
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38396);final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final String str, final int startIndex, final int length) {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38397);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38398);count[0]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38399);return super.append(str, startIndex, length);
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38400);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38401);count[1]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38402);return super.appendNewLine();
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
        };
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38403);sb.appendln("foo", 0, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38404);assertEquals("foo" + SEP, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38405);assertEquals(1, count[0]);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38406);assertEquals(1, count[1]);
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_StringBuffer() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2if2pg7tmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_StringBuffer",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38407,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2if2pg7tmv(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38407);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38408);final int[] count = new int[2];
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38409);final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final StringBuffer str) {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38410);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38411);count[0]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38412);return super.append(str);
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38413);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38414);count[1]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38415);return super.appendNewLine();
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
        };
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38416);sb.appendln(new StringBuffer("foo"));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38417);assertEquals("foo" + SEP, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38418);assertEquals(1, count[0]);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38419);assertEquals(1, count[1]);
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_StringBuilder() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ax4w9stn8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_StringBuilder",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38420,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ax4w9stn8(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38420);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38421);final int[] count = new int[2];
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38422);final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final StringBuilder str) {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38423);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38424);count[0]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38425);return super.append(str);
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38426);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38427);count[1]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38428);return super.appendNewLine();
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
        };
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38429);sb.appendln(new StringBuilder("foo"));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38430);assertEquals("foo" + SEP, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38431);assertEquals(1, count[0]);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38432);assertEquals(1, count[1]);
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_StringBuffer_int_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22zw1rrtnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_StringBuffer_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38433,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22zw1rrtnl(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38433);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38434);final int[] count = new int[2];
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38435);final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final StringBuffer str, final int startIndex, final int length) {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38436);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38437);count[0]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38438);return super.append(str, startIndex, length);
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38439);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38440);count[1]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38441);return super.appendNewLine();
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
        };
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38442);sb.appendln(new StringBuffer("foo"), 0, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38443);assertEquals("foo" + SEP, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38444);assertEquals(1, count[0]);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38445);assertEquals(1, count[1]);
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_StringBuilder_int_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kuhmv4tny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_StringBuilder_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38446,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kuhmv4tny(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38446);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38447);final int[] count = new int[2];
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38448);final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final StringBuilder str, final int startIndex, final int length) {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38449);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38450);count[0]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38451);return super.append(str, startIndex, length);
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38452);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38453);count[1]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38454);return super.appendNewLine();
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
        };
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38455);sb.appendln(new StringBuilder("foo"), 0, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38456);assertEquals("foo" + SEP, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38457);assertEquals(1, count[0]);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38458);assertEquals(1, count[1]);
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_StrBuilder() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23p19kutob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_StrBuilder",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38459,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23p19kutob(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38459);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38460);final int[] count = new int[2];
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38461);final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final StrBuilder str) {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38462);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38463);count[0]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38464);return super.append(str);
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38465);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38466);count[1]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38467);return super.appendNewLine();
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
        };
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38468);sb.appendln(new StrBuilder("foo"));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38469);assertEquals("foo" + SEP, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38470);assertEquals(1, count[0]);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38471);assertEquals(1, count[1]);
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_StrBuilder_int_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38472);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2h0htiatoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_StrBuilder_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38472,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2h0htiatoo(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38472);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38473);final int[] count = new int[2];
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38474);final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final StrBuilder str, final int startIndex, final int length) {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38475);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38476);count[0]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38477);return super.append(str, startIndex, length);
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38478);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38479);count[1]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38480);return super.appendNewLine();
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
        };
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38481);sb.appendln(new StrBuilder("foo"), 0, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38482);assertEquals("foo" + SEP, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38483);assertEquals(1, count[0]);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38484);assertEquals(1, count[1]);
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_CharArray() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mi6jrtp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_CharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38485,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mi6jrtp1(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38485);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38486);final int[] count = new int[2];
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38487);final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final char[] str) {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38488);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38489);count[0]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38490);return super.append(str);
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38491);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38492);count[1]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38493);return super.appendNewLine();
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
        };
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38494);sb.appendln("foo".toCharArray());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38495);assertEquals("foo" + SEP, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38496);assertEquals(1, count[0]);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38497);assertEquals(1, count[1]);
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_CharArray_int_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24kn8ljtpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_CharArray_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38498,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24kn8ljtpe(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38498);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38499);final int[] count = new int[2];
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38500);final StrBuilder sb = new StrBuilder() {
            @Override
            public StrBuilder append(final char[] str, final int startIndex, final int length) {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38501);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38502);count[0]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38503);return super.append(str, startIndex, length);
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
            @Override
            public StrBuilder appendNewLine() {try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38504);
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38505);count[1]++;
                __CLR4_1_2te5te5l3lqxuwl.R.inc(38506);return super.appendNewLine();
            }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
        };
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38507);sb.appendln("foo".toCharArray(), 0, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38508);assertEquals("foo" + SEP, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38509);assertEquals(1, count[0]);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38510);assertEquals(1, count[1]);
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_Boolean() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qs4agutpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_Boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38511,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qs4agutpr(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38511);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38512);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38513);sb.appendln(true);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38514);assertEquals("true" + SEP, sb.toString());
        
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38515);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38516);sb.appendln(false);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38517);assertEquals("false" + SEP, sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendln_PrimitiveNumber() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gqn50atpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendln_PrimitiveNumber",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38518,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gqn50atpy(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38518);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38519);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38520);sb.appendln(0);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38521);assertEquals("0" + SEP, sb.toString());
        
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38522);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38523);sb.appendln(1L);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38524);assertEquals("1" + SEP, sb.toString());
        
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38525);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38526);sb.appendln(2.3f);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38527);assertEquals("2.3" + SEP, sb.toString());
        
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38528);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38529);sb.appendln(4.5d);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38530);assertEquals("4.5" + SEP, sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendPadding() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27b6h4ktqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendPadding",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38531,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27b6h4ktqb(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38531);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38532);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38533);sb.append("foo");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38534);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38535);sb.appendPadding(-1, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38536);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38537);sb.appendPadding(0, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38538);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38539);sb.appendPadding(1, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38540);assertEquals("foo-", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38541);sb.appendPadding(16, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38542);assertEquals(20, sb.length());
        //            12345678901234567890
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38543);assertEquals("foo-----------------", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendFixedWidthPadLeft() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yx3zzxtqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendFixedWidthPadLeft",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38544,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yx3zzxtqo(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38544);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38545);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38546);sb.appendFixedWidthPadLeft("foo", -1, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38547);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38548);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38549);sb.appendFixedWidthPadLeft("foo", 0, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38550);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38551);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38552);sb.appendFixedWidthPadLeft("foo", 1, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38553);assertEquals("o", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38554);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38555);sb.appendFixedWidthPadLeft("foo", 2, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38556);assertEquals("oo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38557);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38558);sb.appendFixedWidthPadLeft("foo", 3, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38559);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38560);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38561);sb.appendFixedWidthPadLeft("foo", 4, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38562);assertEquals("-foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38563);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38564);sb.appendFixedWidthPadLeft("foo", 10, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38565);assertEquals(10, sb.length());
        //            1234567890
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38566);assertEquals("-------foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38567);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38568);sb.setNullText("null");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38569);sb.appendFixedWidthPadLeft(null, 5, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38570);assertEquals("-null", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendFixedWidthPadLeft_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38571);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vybpptrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendFixedWidthPadLeft_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38571,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vybpptrf(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38571);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38572);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38573);sb.appendFixedWidthPadLeft(123, -1, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38574);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38575);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38576);sb.appendFixedWidthPadLeft(123, 0, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38577);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38578);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38579);sb.appendFixedWidthPadLeft(123, 1, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38580);assertEquals("3", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38581);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38582);sb.appendFixedWidthPadLeft(123, 2, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38583);assertEquals("23", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38584);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38585);sb.appendFixedWidthPadLeft(123, 3, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38586);assertEquals("123", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38587);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38588);sb.appendFixedWidthPadLeft(123, 4, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38589);assertEquals("-123", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38590);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38591);sb.appendFixedWidthPadLeft(123, 10, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38592);assertEquals(10, sb.length());
        //            1234567890
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38593);assertEquals("-------123", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendFixedWidthPadRight() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m3b75ats2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendFixedWidthPadRight",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38594,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m3b75ats2(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38594);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38595);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38596);sb.appendFixedWidthPadRight("foo", -1, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38597);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38598);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38599);sb.appendFixedWidthPadRight("foo", 0, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38600);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38601);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38602);sb.appendFixedWidthPadRight("foo", 1, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38603);assertEquals("f", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38604);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38605);sb.appendFixedWidthPadRight("foo", 2, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38606);assertEquals("fo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38607);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38608);sb.appendFixedWidthPadRight("foo", 3, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38609);assertEquals("foo", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38610);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38611);sb.appendFixedWidthPadRight("foo", 4, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38612);assertEquals("foo-", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38613);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38614);sb.appendFixedWidthPadRight("foo", 10, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38615);assertEquals(10, sb.length());
        //            1234567890
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38616);assertEquals("foo-------", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38617);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38618);sb.setNullText("null");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38619);sb.appendFixedWidthPadRight(null, 5, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38620);assertEquals("null-", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    // See: http://issues.apache.org/jira/browse/LANG-299
    @Test
    public void testLang299() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bdtfzttst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testLang299",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38621,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bdtfzttst(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38621);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38622);final StrBuilder sb = new StrBuilder(1);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38623);sb.appendFixedWidthPadRight("foo", 1, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38624);assertEquals("f", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendFixedWidthPadRight_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_290ronytsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendFixedWidthPadRight_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38625,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_290ronytsx(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38625);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38626);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38627);sb.appendFixedWidthPadRight(123, -1, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38628);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38629);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38630);sb.appendFixedWidthPadRight(123, 0, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38631);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38632);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38633);sb.appendFixedWidthPadRight(123, 1, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38634);assertEquals("1", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38635);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38636);sb.appendFixedWidthPadRight(123, 2, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38637);assertEquals("12", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38638);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38639);sb.appendFixedWidthPadRight(123, 3, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38640);assertEquals("123", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38641);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38642);sb.appendFixedWidthPadRight(123, 4, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38643);assertEquals("123-", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38644);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38645);sb.appendFixedWidthPadRight(123, 10, '-');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38646);assertEquals(10, sb.length());
        //            1234567890
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38647);assertEquals("123-------", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppend_FormattedString() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kfffhbttk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppend_FormattedString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38648,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kfffhbttk(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38648);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38649);StrBuilder sb;

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38650);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38651);sb.append("Hi", (Object[]) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38652);assertEquals("Hi", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38653);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38654);sb.append("Hi", "Alice");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38655);assertEquals("Hi", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38656);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38657);sb.append("Hi %s", "Alice");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38658);assertEquals("Hi Alice", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38659);sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38660);sb.append("Hi %s %,d", "Alice", 5000);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38661);assertEquals("Hi Alice 5,000", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendAll_Array() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jjsgpitty();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendAll_Array",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38662,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jjsgpitty(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38662);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38663);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38664);sb.appendAll((Object[]) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38665);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38666);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38667);sb.appendAll(new Object[0]);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38668);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38669);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38670);sb.appendAll(new Object[]{"foo", "bar", "baz"});
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38671);assertEquals("foobarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38672);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38673);sb.appendAll("foo", "bar", "baz");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38674);assertEquals("foobarbaz", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendAll_Collection() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2co8ma7tub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendAll_Collection",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38675,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2co8ma7tub(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38675);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38676);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38677);sb.appendAll((Collection<?>) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38678);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38679);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38680);sb.appendAll(Collections.EMPTY_LIST);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38681);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38682);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38683);sb.appendAll(Arrays.asList(new Object[]{"foo", "bar", "baz"}));
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38684);assertEquals("foobarbaz", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendAll_Iterator() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p5ja3ltul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendAll_Iterator",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38685,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p5ja3ltul(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38685);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38686);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38687);sb.appendAll((Iterator<?>) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38688);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38689);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38690);sb.appendAll(Collections.EMPTY_LIST.iterator());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38691);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38692);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38693);sb.appendAll(Arrays.asList(new Object[]{"foo", "bar", "baz"}).iterator());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38694);assertEquals("foobarbaz", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendWithSeparators_Array() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dqyzzztuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendWithSeparators_Array",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38695,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dqyzzztuv(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38695);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38696);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38697);sb.appendWithSeparators((Object[]) null, ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38698);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38699);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38700);sb.appendWithSeparators(new Object[0], ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38701);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38702);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38703);sb.appendWithSeparators(new Object[]{"foo", "bar", "baz"}, ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38704);assertEquals("foo,bar,baz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38705);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38706);sb.appendWithSeparators(new Object[]{"foo", "bar", "baz"}, null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38707);assertEquals("foobarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38708);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38709);sb.appendWithSeparators(new Object[]{"foo", null, "baz"}, ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38710);assertEquals("foo,,baz", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendWithSeparators_Collection() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_259r0n8tvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendWithSeparators_Collection",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38711,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_259r0n8tvb(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38711);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38712);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38713);sb.appendWithSeparators((Collection<?>) null, ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38714);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38715);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38716);sb.appendWithSeparators(Collections.EMPTY_LIST, ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38717);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38718);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38719);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", "bar", "baz"}), ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38720);assertEquals("foo,bar,baz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38721);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38722);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", "bar", "baz"}), null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38723);assertEquals("foobarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38724);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38725);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", null, "baz"}), ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38726);assertEquals("foo,,baz", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendWithSeparators_Iterator() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2h3rxwstvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendWithSeparators_Iterator",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38727,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2h3rxwstvr(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38727);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38728);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38729);sb.appendWithSeparators((Iterator<?>) null, ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38730);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38731);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38732);sb.appendWithSeparators(Collections.EMPTY_LIST.iterator(), ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38733);assertEquals("", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38734);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38735);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", "bar", "baz"}).iterator(), ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38736);assertEquals("foo,bar,baz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38737);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38738);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", "bar", "baz"}).iterator(), null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38739);assertEquals("foobarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38740);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38741);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", null, "baz"}).iterator(), ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38742);assertEquals("foo,,baz", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendWithSeparatorsWithNullText() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kplx7ltw7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendWithSeparatorsWithNullText",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38743,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kplx7ltw7(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38743);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38744);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38745);sb.setNullText("null");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38746);sb.appendWithSeparators(new Object[]{"foo", null, "baz"}, ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38747);assertEquals("foo,null,baz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38748);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38749);sb.appendWithSeparators(Arrays.asList(new Object[]{"foo", null, "baz"}), ",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38750);assertEquals("foo,null,baz", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendSeparator_String() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24dm2citwf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendSeparator_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38751,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24dm2citwf(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38751);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38752);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38753);sb.appendSeparator(",");  // no effect
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38754);assertEquals("", sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38755);sb.append("foo");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38756);assertEquals("foo", sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38757);sb.appendSeparator(",");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38758);assertEquals("foo,", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testAppendSeparator_String_String() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dvoy8wtwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendSeparator_String_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38759,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dvoy8wtwn(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38759);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38760);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38761);final String startSeparator = "order by ";
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38762);final String standardSeparator = ",";
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38763);final String foo = "foo";
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38764);sb.appendSeparator(null, null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38765);assertEquals("", sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38766);sb.appendSeparator(standardSeparator, null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38767);assertEquals("", sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38768);sb.appendSeparator(standardSeparator, startSeparator); 
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38769);assertEquals(startSeparator, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38770);sb.appendSeparator(null, null); 
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38771);assertEquals(startSeparator, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38772);sb.appendSeparator(null, startSeparator); 
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38773);assertEquals(startSeparator, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38774);sb.append(foo);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38775);assertEquals(startSeparator + foo, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38776);sb.appendSeparator(standardSeparator, startSeparator);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38777);assertEquals(startSeparator + foo + standardSeparator, sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendSeparator_char() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qxfn19tx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendSeparator_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38778,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qxfn19tx6(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38778);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38779);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38780);sb.appendSeparator(',');  // no effect
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38781);assertEquals("", sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38782);sb.append("foo");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38783);assertEquals("foo", sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38784);sb.appendSeparator(',');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38785);assertEquals("foo,", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
    @Test
    public void testAppendSeparator_char_char() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fghzi8txe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendSeparator_char_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38786,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fghzi8txe(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38786);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38787);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38788);final char startSeparator = ':';
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38789);final char standardSeparator = ',';
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38790);final String foo = "foo";
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38791);sb.appendSeparator(standardSeparator, startSeparator);  // no effect
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38792);assertEquals(String.valueOf(startSeparator), sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38793);sb.append(foo);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38794);assertEquals(String.valueOf(startSeparator) + foo, sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38795);sb.appendSeparator(standardSeparator, startSeparator);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38796);assertEquals(String.valueOf(startSeparator) + foo + standardSeparator, sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendSeparator_String_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iepu8etxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendSeparator_String_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38797,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iepu8etxp(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38797);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38798);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38799);sb.appendSeparator(",", 0);  // no effect
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38800);assertEquals("", sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38801);sb.append("foo");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38802);assertEquals("foo", sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38803);sb.appendSeparator(",", 1);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38804);assertEquals("foo,", sb.toString());
        
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38805);sb.appendSeparator(",", -1);  // no effect
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38806);assertEquals("foo,", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAppendSeparator_char_int() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pifju5txz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testAppendSeparator_char_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38807,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pifju5txz(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38807);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38808);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38809);sb.appendSeparator(',', 0);  // no effect
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38810);assertEquals("", sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38811);sb.append("foo");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38812);assertEquals("foo", sb.toString());
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38813);sb.appendSeparator(',', 1);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38814);assertEquals("foo,", sb.toString());
        
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38815);sb.appendSeparator(',', -1);  // no effect
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38816);assertEquals("foo,", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testInsert() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2adr9w2ty9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testInsert",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38817,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2adr9w2ty9(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38817);

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38818);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38819);sb.append("barbaz");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38820);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38821);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38822);sb.insert(-1, FOO);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38823);fail("insert(-1, Object) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38824);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38825);sb.insert(7, FOO);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38826);fail("insert(7, Object) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38827);sb.insert(0, (Object) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38828);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38829);sb.insert(0, FOO);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38830);assertEquals("foobarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38831);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38832);sb.append("barbaz");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38833);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38834);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38835);sb.insert(-1, "foo");
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38836);fail("insert(-1, String) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38837);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38838);sb.insert(7, "foo");
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38839);fail("insert(7, String) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38840);sb.insert(0, (String) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38841);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38842);sb.insert(0, "foo");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38843);assertEquals("foobarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38844);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38845);sb.append("barbaz");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38846);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38847);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38848);sb.insert(-1, new char[]{'f', 'o', 'o'});
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38849);fail("insert(-1, char[]) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38850);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38851);sb.insert(7, new char[]{'f', 'o', 'o'});
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38852);fail("insert(7, char[]) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38853);sb.insert(0, (char[]) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38854);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38855);sb.insert(0, new char[0]);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38856);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38857);sb.insert(0, new char[]{'f', 'o', 'o'});
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38858);assertEquals("foobarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38859);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38860);sb.append("barbaz");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38861);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38862);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38863);sb.insert(-1, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 3, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38864);fail("insert(-1, char[], 3, 3) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38865);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38866);sb.insert(7, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 3, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38867);fail("insert(7, char[], 3, 3) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38868);sb.insert(0, (char[]) null, 0, 0);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38869);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38870);sb.insert(0, new char[0], 0, 0);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38871);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38872);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38873);sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, -1, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38874);fail("insert(0, char[], -1, 3) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38875);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38876);sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 10, 3);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38877);fail("insert(0, char[], 10, 3) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38878);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38879);sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 0, -1);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38880);fail("insert(0, char[], 0, -1) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38881);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38882);sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 0, 10);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38883);fail("insert(0, char[], 0, 10) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38884);sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 0, 0);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38885);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38886);sb.insert(0, new char[]{'a', 'b', 'c', 'f', 'o', 'o', 'd', 'e', 'f'}, 3, 3);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38887);assertEquals("foobarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38888);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38889);sb.append("barbaz");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38890);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38891);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38892);sb.insert(-1, true);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38893);fail("insert(-1, boolean) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38894);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38895);sb.insert(7, true);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38896);fail("insert(7, boolean) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38897);sb.insert(0, true);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38898);assertEquals("truebarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38899);sb.insert(0, false);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38900);assertEquals("falsetruebarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38901);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38902);sb.append("barbaz");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38903);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38904);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38905);sb.insert(-1, '!');
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38906);fail("insert(-1, char) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38907);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38908);sb.insert(7, '!');
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38909);fail("insert(7, char) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38910);sb.insert(0, '!');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38911);assertEquals("!barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38912);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38913);sb.append("barbaz");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38914);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38915);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38916);sb.insert(-1, 0);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38917);fail("insert(-1, int) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38918);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38919);sb.insert(7, 0);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38920);fail("insert(7, int) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38921);sb.insert(0, '0');
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38922);assertEquals("0barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38923);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38924);sb.append("barbaz");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38925);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38926);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38927);sb.insert(-1, 1L);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38928);fail("insert(-1, long) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38929);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38930);sb.insert(7, 1L);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38931);fail("insert(7, long) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38932);sb.insert(0, 1L);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38933);assertEquals("1barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38934);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38935);sb.append("barbaz");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38936);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38937);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38938);sb.insert(-1, 2.3F);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38939);fail("insert(-1, float) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38940);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38941);sb.insert(7, 2.3F);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38942);fail("insert(7, float) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38943);sb.insert(0, 2.3F);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38944);assertEquals("2.3barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38945);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38946);sb.append("barbaz");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38947);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38948);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38949);sb.insert(-1, 4.5D);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38950);fail("insert(-1, double) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38951);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38952);sb.insert(7, 4.5D);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38953);fail("insert(7, double) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38954);sb.insert(0, 4.5D);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38955);assertEquals("4.5barbaz", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testInsertWithNullText() {__CLR4_1_2te5te5l3lqxuwl.R.globalSliceStart(getClass().getName(),38956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2auvp90u24();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2te5te5l3lqxuwl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2te5te5l3lqxuwl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrBuilderAppendInsertTest.testInsertWithNullText",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38956,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2auvp90u24(){try{__CLR4_1_2te5te5l3lqxuwl.R.inc(38956);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38957);final StrBuilder sb = new StrBuilder();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38958);sb.setNullText("null");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38959);sb.append("barbaz");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38960);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38961);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38962);sb.insert(-1, FOO);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38963);fail("insert(-1, Object) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38964);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38965);sb.insert(7, FOO);
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38966);fail("insert(7, Object) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38967);sb.insert(0, (Object) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38968);assertEquals("nullbarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38969);sb.insert(0, FOO);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38970);assertEquals("foonullbarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38971);sb.clear();
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38972);sb.append("barbaz");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38973);assertEquals("barbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38974);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38975);sb.insert(-1, "foo");
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38976);fail("insert(-1, String) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38977);try {
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38978);sb.insert(7, "foo");
            __CLR4_1_2te5te5l3lqxuwl.R.inc(38979);fail("insert(7, String) expected StringIndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException e) {
            // expected
        }

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38980);sb.insert(0, (String) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38981);assertEquals("nullbarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38982);sb.insert(0, "foo");
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38983);assertEquals("foonullbarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38984);sb.insert(0, (char[]) null);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38985);assertEquals("nullfoonullbarbaz", sb.toString());

        __CLR4_1_2te5te5l3lqxuwl.R.inc(38986);sb.insert(0, (char[]) null, 0, 0);
        __CLR4_1_2te5te5l3lqxuwl.R.inc(38987);assertEquals("nullnullfoonullbarbaz", sb.toString());
    }finally{__CLR4_1_2te5te5l3lqxuwl.R.flushNeeded();}}
}
