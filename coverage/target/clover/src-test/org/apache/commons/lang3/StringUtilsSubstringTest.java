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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods
 *
 * @version $Id$
 */
public class StringUtilsSubstringTest  {static class __CLR4_1_2li9li9l3lqxu19{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,28077,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String FOO = "foo";
    private static final String BAR = "bar";
    private static final String BAZ = "baz";
    private static final String FOOBAR = "foobar";
    private static final String SENTENCE = "foo bar baz";

    //-----------------------------------------------------------------------

    @Test
    public void testSubstring_StringInt() {__CLR4_1_2li9li9l3lqxu19.R.globalSliceStart(getClass().getName(),27873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_233oobpli9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2li9li9l3lqxu19.R.rethrow($CLV_t2$);}finally{__CLR4_1_2li9li9l3lqxu19.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstring_StringInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27873,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_233oobpli9(){try{__CLR4_1_2li9li9l3lqxu19.R.inc(27873);
        __CLR4_1_2li9li9l3lqxu19.R.inc(27874);assertEquals(null, StringUtils.substring(null, 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27875);assertEquals("", StringUtils.substring("", 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27876);assertEquals("", StringUtils.substring("", 2));
        
        __CLR4_1_2li9li9l3lqxu19.R.inc(27877);assertEquals("", StringUtils.substring(SENTENCE, 80));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27878);assertEquals(BAZ, StringUtils.substring(SENTENCE, 8));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27879);assertEquals(BAZ, StringUtils.substring(SENTENCE, -3));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27880);assertEquals(SENTENCE, StringUtils.substring(SENTENCE, 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27881);assertEquals("abc", StringUtils.substring("abc", -4));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27882);assertEquals("abc", StringUtils.substring("abc", -3));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27883);assertEquals("bc", StringUtils.substring("abc", -2));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27884);assertEquals("c", StringUtils.substring("abc", -1));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27885);assertEquals("abc", StringUtils.substring("abc", 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27886);assertEquals("bc", StringUtils.substring("abc", 1));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27887);assertEquals("c", StringUtils.substring("abc", 2));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27888);assertEquals("", StringUtils.substring("abc", 3));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27889);assertEquals("", StringUtils.substring("abc", 4));
    }finally{__CLR4_1_2li9li9l3lqxu19.R.flushNeeded();}}
    
    @Test
    public void testSubstring_StringIntInt() {__CLR4_1_2li9li9l3lqxu19.R.globalSliceStart(getClass().getName(),27890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ehgf3cliq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2li9li9l3lqxu19.R.rethrow($CLV_t2$);}finally{__CLR4_1_2li9li9l3lqxu19.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstring_StringIntInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27890,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ehgf3cliq(){try{__CLR4_1_2li9li9l3lqxu19.R.inc(27890);
        __CLR4_1_2li9li9l3lqxu19.R.inc(27891);assertEquals(null, StringUtils.substring(null, 0, 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27892);assertEquals(null, StringUtils.substring(null, 1, 2));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27893);assertEquals("", StringUtils.substring("", 0, 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27894);assertEquals("", StringUtils.substring("", 1, 2));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27895);assertEquals("", StringUtils.substring("", -2, -1));
        
        __CLR4_1_2li9li9l3lqxu19.R.inc(27896);assertEquals("", StringUtils.substring(SENTENCE, 8, 6));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27897);assertEquals(FOO, StringUtils.substring(SENTENCE, 0, 3));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27898);assertEquals("o", StringUtils.substring(SENTENCE, -9, 3));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27899);assertEquals(FOO, StringUtils.substring(SENTENCE, 0, -8));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27900);assertEquals("o", StringUtils.substring(SENTENCE, -9, -8));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27901);assertEquals(SENTENCE, StringUtils.substring(SENTENCE, 0, 80));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27902);assertEquals("", StringUtils.substring(SENTENCE, 2, 2));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27903);assertEquals("b",StringUtils.substring("abc", -2, -1));
    }finally{__CLR4_1_2li9li9l3lqxu19.R.flushNeeded();}}
           
    @Test
    public void testLeft_String() {__CLR4_1_2li9li9l3lqxu19.R.globalSliceStart(getClass().getName(),27904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2myucilj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2li9li9l3lqxu19.R.rethrow($CLV_t2$);}finally{__CLR4_1_2li9li9l3lqxu19.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testLeft_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27904,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2myucilj4(){try{__CLR4_1_2li9li9l3lqxu19.R.inc(27904);
        __CLR4_1_2li9li9l3lqxu19.R.inc(27905);assertSame(null, StringUtils.left(null, -1));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27906);assertSame(null, StringUtils.left(null, 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27907);assertSame(null, StringUtils.left(null, 2));
        
        __CLR4_1_2li9li9l3lqxu19.R.inc(27908);assertEquals("", StringUtils.left("", -1));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27909);assertEquals("", StringUtils.left("", 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27910);assertEquals("", StringUtils.left("", 2));
        
        __CLR4_1_2li9li9l3lqxu19.R.inc(27911);assertEquals("", StringUtils.left(FOOBAR, -1));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27912);assertEquals("", StringUtils.left(FOOBAR, 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27913);assertEquals(FOO, StringUtils.left(FOOBAR, 3));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27914);assertSame(FOOBAR, StringUtils.left(FOOBAR, 80));
    }finally{__CLR4_1_2li9li9l3lqxu19.R.flushNeeded();}}
    
    @Test
    public void testRight_String() {__CLR4_1_2li9li9l3lqxu19.R.globalSliceStart(getClass().getName(),27915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uqxl3nljf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2li9li9l3lqxu19.R.rethrow($CLV_t2$);}finally{__CLR4_1_2li9li9l3lqxu19.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testRight_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27915,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uqxl3nljf(){try{__CLR4_1_2li9li9l3lqxu19.R.inc(27915);
        __CLR4_1_2li9li9l3lqxu19.R.inc(27916);assertSame(null, StringUtils.right(null, -1));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27917);assertSame(null, StringUtils.right(null, 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27918);assertSame(null, StringUtils.right(null, 2));
        
        __CLR4_1_2li9li9l3lqxu19.R.inc(27919);assertEquals("", StringUtils.right("", -1));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27920);assertEquals("", StringUtils.right("", 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27921);assertEquals("", StringUtils.right("", 2));
        
        __CLR4_1_2li9li9l3lqxu19.R.inc(27922);assertEquals("", StringUtils.right(FOOBAR, -1));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27923);assertEquals("", StringUtils.right(FOOBAR, 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27924);assertEquals(BAR, StringUtils.right(FOOBAR, 3));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27925);assertSame(FOOBAR, StringUtils.right(FOOBAR, 80));
    }finally{__CLR4_1_2li9li9l3lqxu19.R.flushNeeded();}}
    
    @Test
    public void testMid_String() {__CLR4_1_2li9li9l3lqxu19.R.globalSliceStart(getClass().getName(),27926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24pur0hljq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2li9li9l3lqxu19.R.rethrow($CLV_t2$);}finally{__CLR4_1_2li9li9l3lqxu19.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testMid_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27926,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24pur0hljq(){try{__CLR4_1_2li9li9l3lqxu19.R.inc(27926);
        __CLR4_1_2li9li9l3lqxu19.R.inc(27927);assertSame(null, StringUtils.mid(null, -1, 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27928);assertSame(null, StringUtils.mid(null, 0, -1));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27929);assertSame(null, StringUtils.mid(null, 3, 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27930);assertSame(null, StringUtils.mid(null, 3, 2));
        
        __CLR4_1_2li9li9l3lqxu19.R.inc(27931);assertEquals("", StringUtils.mid("", 0, -1));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27932);assertEquals("", StringUtils.mid("", 0, 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27933);assertEquals("", StringUtils.mid("", 0, 2));
        
        __CLR4_1_2li9li9l3lqxu19.R.inc(27934);assertEquals("", StringUtils.mid(FOOBAR, 3, -1));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27935);assertEquals("", StringUtils.mid(FOOBAR, 3, 0));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27936);assertEquals("b", StringUtils.mid(FOOBAR, 3, 1));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27937);assertEquals(FOO, StringUtils.mid(FOOBAR, 0, 3));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27938);assertEquals(BAR, StringUtils.mid(FOOBAR, 3, 3));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27939);assertEquals(FOOBAR, StringUtils.mid(FOOBAR, 0, 80));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27940);assertEquals(BAR, StringUtils.mid(FOOBAR, 3, 80));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27941);assertEquals("", StringUtils.mid(FOOBAR, 9, 3));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27942);assertEquals(FOO, StringUtils.mid(FOOBAR, -1, 3));
    }finally{__CLR4_1_2li9li9l3lqxu19.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testSubstringBefore_StringString() {__CLR4_1_2li9li9l3lqxu19.R.globalSliceStart(getClass().getName(),27943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j91muilk7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2li9li9l3lqxu19.R.rethrow($CLV_t2$);}finally{__CLR4_1_2li9li9l3lqxu19.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringBefore_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27943,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j91muilk7(){try{__CLR4_1_2li9li9l3lqxu19.R.inc(27943);
        __CLR4_1_2li9li9l3lqxu19.R.inc(27944);assertEquals("foo", StringUtils.substringBefore("fooXXbarXXbaz", "XX"));

        __CLR4_1_2li9li9l3lqxu19.R.inc(27945);assertEquals(null, StringUtils.substringBefore(null, null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27946);assertEquals(null, StringUtils.substringBefore(null, ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27947);assertEquals(null, StringUtils.substringBefore(null, "XX"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27948);assertEquals("", StringUtils.substringBefore("", null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27949);assertEquals("", StringUtils.substringBefore("", ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27950);assertEquals("", StringUtils.substringBefore("", "XX"));
        
        __CLR4_1_2li9li9l3lqxu19.R.inc(27951);assertEquals("foo", StringUtils.substringBefore("foo", null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27952);assertEquals("foo", StringUtils.substringBefore("foo", "b"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27953);assertEquals("f", StringUtils.substringBefore("foot", "o"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27954);assertEquals("", StringUtils.substringBefore("abc", "a"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27955);assertEquals("a", StringUtils.substringBefore("abcba", "b"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27956);assertEquals("ab", StringUtils.substringBefore("abc", "c"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27957);assertEquals("", StringUtils.substringBefore("abc", ""));
    }finally{__CLR4_1_2li9li9l3lqxu19.R.flushNeeded();}}
    
    @Test
    public void testSubstringAfter_StringString() {__CLR4_1_2li9li9l3lqxu19.R.globalSliceStart(getClass().getName(),27958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2997q39lkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2li9li9l3lqxu19.R.rethrow($CLV_t2$);}finally{__CLR4_1_2li9li9l3lqxu19.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringAfter_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27958,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2997q39lkm(){try{__CLR4_1_2li9li9l3lqxu19.R.inc(27958);
        __CLR4_1_2li9li9l3lqxu19.R.inc(27959);assertEquals("barXXbaz", StringUtils.substringAfter("fooXXbarXXbaz", "XX"));
        
        __CLR4_1_2li9li9l3lqxu19.R.inc(27960);assertEquals(null, StringUtils.substringAfter(null, null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27961);assertEquals(null, StringUtils.substringAfter(null, ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27962);assertEquals(null, StringUtils.substringAfter(null, "XX"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27963);assertEquals("", StringUtils.substringAfter("", null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27964);assertEquals("", StringUtils.substringAfter("", ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27965);assertEquals("", StringUtils.substringAfter("", "XX"));
        
        __CLR4_1_2li9li9l3lqxu19.R.inc(27966);assertEquals("", StringUtils.substringAfter("foo", null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27967);assertEquals("ot", StringUtils.substringAfter("foot", "o"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27968);assertEquals("bc", StringUtils.substringAfter("abc", "a"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27969);assertEquals("cba", StringUtils.substringAfter("abcba", "b"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27970);assertEquals("", StringUtils.substringAfter("abc", "c"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27971);assertEquals("abc", StringUtils.substringAfter("abc", ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27972);assertEquals("", StringUtils.substringAfter("abc", "d"));
    }finally{__CLR4_1_2li9li9l3lqxu19.R.flushNeeded();}}

    @Test
    public void testSubstringBeforeLast_StringString() {__CLR4_1_2li9li9l3lqxu19.R.globalSliceStart(getClass().getName(),27973);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zhbo7gll1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2li9li9l3lqxu19.R.rethrow($CLV_t2$);}finally{__CLR4_1_2li9li9l3lqxu19.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringBeforeLast_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27973,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zhbo7gll1(){try{__CLR4_1_2li9li9l3lqxu19.R.inc(27973);
        __CLR4_1_2li9li9l3lqxu19.R.inc(27974);assertEquals("fooXXbar", StringUtils.substringBeforeLast("fooXXbarXXbaz", "XX"));

        __CLR4_1_2li9li9l3lqxu19.R.inc(27975);assertEquals(null, StringUtils.substringBeforeLast(null, null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27976);assertEquals(null, StringUtils.substringBeforeLast(null, ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27977);assertEquals(null, StringUtils.substringBeforeLast(null, "XX"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27978);assertEquals("", StringUtils.substringBeforeLast("", null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27979);assertEquals("", StringUtils.substringBeforeLast("", ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27980);assertEquals("", StringUtils.substringBeforeLast("", "XX"));

        __CLR4_1_2li9li9l3lqxu19.R.inc(27981);assertEquals("foo", StringUtils.substringBeforeLast("foo", null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27982);assertEquals("foo", StringUtils.substringBeforeLast("foo", "b"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27983);assertEquals("fo", StringUtils.substringBeforeLast("foo", "o"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27984);assertEquals("abc\r\n", StringUtils.substringBeforeLast("abc\r\n", "d"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27985);assertEquals("abc", StringUtils.substringBeforeLast("abcdabc", "d"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27986);assertEquals("abcdabc", StringUtils.substringBeforeLast("abcdabcd", "d"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27987);assertEquals("a", StringUtils.substringBeforeLast("abc", "b"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27988);assertEquals("abc ", StringUtils.substringBeforeLast("abc \n", "\n"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27989);assertEquals("a", StringUtils.substringBeforeLast("a", null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27990);assertEquals("a", StringUtils.substringBeforeLast("a", ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27991);assertEquals("", StringUtils.substringBeforeLast("a", "a"));
    }finally{__CLR4_1_2li9li9l3lqxu19.R.flushNeeded();}}
    
    @Test
    public void testSubstringAfterLast_StringString() {__CLR4_1_2li9li9l3lqxu19.R.globalSliceStart(getClass().getName(),27992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g5e0srllk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2li9li9l3lqxu19.R.rethrow($CLV_t2$);}finally{__CLR4_1_2li9li9l3lqxu19.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringAfterLast_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),27992,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g5e0srllk(){try{__CLR4_1_2li9li9l3lqxu19.R.inc(27992);
        __CLR4_1_2li9li9l3lqxu19.R.inc(27993);assertEquals("baz", StringUtils.substringAfterLast("fooXXbarXXbaz", "XX"));

        __CLR4_1_2li9li9l3lqxu19.R.inc(27994);assertEquals(null, StringUtils.substringAfterLast(null, null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27995);assertEquals(null, StringUtils.substringAfterLast(null, ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27996);assertEquals(null, StringUtils.substringAfterLast(null, "XX"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27997);assertEquals("", StringUtils.substringAfterLast("", null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27998);assertEquals("", StringUtils.substringAfterLast("", ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(27999);assertEquals("", StringUtils.substringAfterLast("", "a"));

        __CLR4_1_2li9li9l3lqxu19.R.inc(28000);assertEquals("", StringUtils.substringAfterLast("foo", null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28001);assertEquals("", StringUtils.substringAfterLast("foo", "b"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28002);assertEquals("t", StringUtils.substringAfterLast("foot", "o"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28003);assertEquals("bc", StringUtils.substringAfterLast("abc", "a"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28004);assertEquals("a", StringUtils.substringAfterLast("abcba", "b"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28005);assertEquals("", StringUtils.substringAfterLast("abc", "c"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28006);assertEquals("", StringUtils.substringAfterLast("", "d"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28007);assertEquals("", StringUtils.substringAfterLast("abc", ""));
    }finally{__CLR4_1_2li9li9l3lqxu19.R.flushNeeded();}}        
        
    //-----------------------------------------------------------------------
    @Test
    public void testSubstringBetween_StringString() {__CLR4_1_2li9li9l3lqxu19.R.globalSliceStart(getClass().getName(),28008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2soi6nzlm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2li9li9l3lqxu19.R.rethrow($CLV_t2$);}finally{__CLR4_1_2li9li9l3lqxu19.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringBetween_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28008,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2soi6nzlm0(){try{__CLR4_1_2li9li9l3lqxu19.R.inc(28008);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28009);assertEquals(null, StringUtils.substringBetween(null, "tag"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28010);assertEquals("", StringUtils.substringBetween("", ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28011);assertEquals(null, StringUtils.substringBetween("", "abc"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28012);assertEquals("", StringUtils.substringBetween("    ", " "));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28013);assertEquals(null, StringUtils.substringBetween("abc", null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28014);assertEquals("", StringUtils.substringBetween("abc", ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28015);assertEquals(null, StringUtils.substringBetween("abc", "a"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28016);assertEquals("bc", StringUtils.substringBetween("abca", "a"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28017);assertEquals("bc", StringUtils.substringBetween("abcabca", "a"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28018);assertEquals("bar", StringUtils.substringBetween("\nbar\n", "\n"));
    }finally{__CLR4_1_2li9li9l3lqxu19.R.flushNeeded();}}
            
    @Test
    public void testSubstringBetween_StringStringString() {__CLR4_1_2li9li9l3lqxu19.R.globalSliceStart(getClass().getName(),28019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2arrxhslmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2li9li9l3lqxu19.R.rethrow($CLV_t2$);}finally{__CLR4_1_2li9li9l3lqxu19.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringBetween_StringStringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28019,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2arrxhslmb(){try{__CLR4_1_2li9li9l3lqxu19.R.inc(28019);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28020);assertEquals(null, StringUtils.substringBetween(null, "", ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28021);assertEquals(null, StringUtils.substringBetween("", null, ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28022);assertEquals(null, StringUtils.substringBetween("", "", null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28023);assertEquals("", StringUtils.substringBetween("", "", ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28024);assertEquals("", StringUtils.substringBetween("foo", "", ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28025);assertEquals(null, StringUtils.substringBetween("foo", "", "]"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28026);assertEquals(null, StringUtils.substringBetween("foo", "[", "]"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28027);assertEquals("", StringUtils.substringBetween("    ", " ", "  "));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28028);assertEquals("bar", StringUtils.substringBetween("<foo>bar</foo>", "<foo>", "</foo>") );
    }finally{__CLR4_1_2li9li9l3lqxu19.R.flushNeeded();}}

   /**
     * Tests the substringsBetween method that returns an String Array of substrings.
     */
    @Test
    public void testSubstringsBetween_StringStringString() {__CLR4_1_2li9li9l3lqxu19.R.globalSliceStart(getClass().getName(),28029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vtliijlml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2li9li9l3lqxu19.R.rethrow($CLV_t2$);}finally{__CLR4_1_2li9li9l3lqxu19.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testSubstringsBetween_StringStringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28029,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vtliijlml(){try{__CLR4_1_2li9li9l3lqxu19.R.inc(28029);

        __CLR4_1_2li9li9l3lqxu19.R.inc(28030);String[] results = StringUtils.substringsBetween("[one], [two], [three]", "[", "]");
        __CLR4_1_2li9li9l3lqxu19.R.inc(28031);assertEquals(3, results.length);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28032);assertEquals("one", results[0]);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28033);assertEquals("two", results[1]);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28034);assertEquals("three", results[2]);

        __CLR4_1_2li9li9l3lqxu19.R.inc(28035);results = StringUtils.substringsBetween("[one], [two], three", "[", "]");
        __CLR4_1_2li9li9l3lqxu19.R.inc(28036);assertEquals(2, results.length);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28037);assertEquals("one", results[0]);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28038);assertEquals("two", results[1]);

        __CLR4_1_2li9li9l3lqxu19.R.inc(28039);results = StringUtils.substringsBetween("[one], [two], three]", "[", "]");
        __CLR4_1_2li9li9l3lqxu19.R.inc(28040);assertEquals(2, results.length);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28041);assertEquals("one", results[0]);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28042);assertEquals("two", results[1]);

        __CLR4_1_2li9li9l3lqxu19.R.inc(28043);results = StringUtils.substringsBetween("[one], two], three]", "[", "]");
        __CLR4_1_2li9li9l3lqxu19.R.inc(28044);assertEquals(1, results.length);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28045);assertEquals("one", results[0]);

        __CLR4_1_2li9li9l3lqxu19.R.inc(28046);results = StringUtils.substringsBetween("one], two], [three]", "[", "]");
        __CLR4_1_2li9li9l3lqxu19.R.inc(28047);assertEquals(1, results.length);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28048);assertEquals("three", results[0]);

        // 'ab hello ba' will match, but 'ab non ba' won't
        // this is because the 'a' is shared between the two and can't be matched twice
        __CLR4_1_2li9li9l3lqxu19.R.inc(28049);results = StringUtils.substringsBetween("aabhellobabnonba", "ab", "ba");
        __CLR4_1_2li9li9l3lqxu19.R.inc(28050);assertEquals(1, results.length);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28051);assertEquals("hello", results[0]);

        __CLR4_1_2li9li9l3lqxu19.R.inc(28052);results = StringUtils.substringsBetween("one, two, three", "[", "]");
        __CLR4_1_2li9li9l3lqxu19.R.inc(28053);assertNull(results);

        __CLR4_1_2li9li9l3lqxu19.R.inc(28054);results = StringUtils.substringsBetween("[one, two, three", "[", "]");
        __CLR4_1_2li9li9l3lqxu19.R.inc(28055);assertNull(results);

        __CLR4_1_2li9li9l3lqxu19.R.inc(28056);results = StringUtils.substringsBetween("one, two, three]", "[", "]");
        __CLR4_1_2li9li9l3lqxu19.R.inc(28057);assertNull(results);

        __CLR4_1_2li9li9l3lqxu19.R.inc(28058);results = StringUtils.substringsBetween("[one], [two], [three]", "[", null);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28059);assertNull(results);

        __CLR4_1_2li9li9l3lqxu19.R.inc(28060);results = StringUtils.substringsBetween("[one], [two], [three]", null, "]");
        __CLR4_1_2li9li9l3lqxu19.R.inc(28061);assertNull(results);

        __CLR4_1_2li9li9l3lqxu19.R.inc(28062);results = StringUtils.substringsBetween("[one], [two], [three]", "", "");
        __CLR4_1_2li9li9l3lqxu19.R.inc(28063);assertNull(results);

        __CLR4_1_2li9li9l3lqxu19.R.inc(28064);results = StringUtils.substringsBetween(null, "[", "]");
        __CLR4_1_2li9li9l3lqxu19.R.inc(28065);assertNull(results);

        __CLR4_1_2li9li9l3lqxu19.R.inc(28066);results = StringUtils.substringsBetween("", "[", "]");
        __CLR4_1_2li9li9l3lqxu19.R.inc(28067);assertEquals(0, results.length);
    }finally{__CLR4_1_2li9li9l3lqxu19.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCountMatches_String() {__CLR4_1_2li9li9l3lqxu19.R.globalSliceStart(getClass().getName(),28068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gwvaynlno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2li9li9l3lqxu19.R.rethrow($CLV_t2$);}finally{__CLR4_1_2li9li9l3lqxu19.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsSubstringTest.testCountMatches_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),28068,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gwvaynlno(){try{__CLR4_1_2li9li9l3lqxu19.R.inc(28068);
        __CLR4_1_2li9li9l3lqxu19.R.inc(28069);assertEquals(0, StringUtils.countMatches(null, null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28070);assertEquals(0, StringUtils.countMatches("blah", null));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28071);assertEquals(0, StringUtils.countMatches(null, "DD"));

        __CLR4_1_2li9li9l3lqxu19.R.inc(28072);assertEquals(0, StringUtils.countMatches("x", ""));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28073);assertEquals(0, StringUtils.countMatches("", ""));

        __CLR4_1_2li9li9l3lqxu19.R.inc(28074);assertEquals(3, 
             StringUtils.countMatches("one long someone sentence of one", "one"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28075);assertEquals(0, 
             StringUtils.countMatches("one long someone sentence of one", "two"));
        __CLR4_1_2li9li9l3lqxu19.R.inc(28076);assertEquals(4, 
             StringUtils.countMatches("oooooooooooo", "ooo"));
    }finally{__CLR4_1_2li9li9l3lqxu19.R.flushNeeded();}}

}
