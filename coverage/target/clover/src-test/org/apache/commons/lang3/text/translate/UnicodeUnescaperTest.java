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

package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.translate.UnicodeEscaper}.
 * @version $Id$
 */
public class UnicodeUnescaperTest {static class __CLR4_1_2w35w35l3lqxv21{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,41600,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // Requested in LANG-507
    @Test
    public void testUPlus() {__CLR4_1_2w35w35l3lqxv21.R.globalSliceStart(getClass().getName(),41585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2md2za4w35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w35w35l3lqxv21.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w35w35l3lqxv21.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.UnicodeUnescaperTest.testUPlus",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41585,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2md2za4w35(){try{__CLR4_1_2w35w35l3lqxv21.R.inc(41585);
        __CLR4_1_2w35w35l3lqxv21.R.inc(41586);final UnicodeUnescaper uu = new UnicodeUnescaper();

        __CLR4_1_2w35w35l3lqxv21.R.inc(41587);final String input = "\\u+0047";
        __CLR4_1_2w35w35l3lqxv21.R.inc(41588);assertEquals("Failed to unescape Unicode characters with 'u+' notation", "G", uu.translate(input));
    }finally{__CLR4_1_2w35w35l3lqxv21.R.flushNeeded();}}

    @Test
    public void testUuuuu() {__CLR4_1_2w35w35l3lqxv21.R.globalSliceStart(getClass().getName(),41589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22echbew39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w35w35l3lqxv21.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w35w35l3lqxv21.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.UnicodeUnescaperTest.testUuuuu",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41589,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22echbew39(){try{__CLR4_1_2w35w35l3lqxv21.R.inc(41589);
        __CLR4_1_2w35w35l3lqxv21.R.inc(41590);final UnicodeUnescaper uu = new UnicodeUnescaper();

        __CLR4_1_2w35w35l3lqxv21.R.inc(41591);final String input = "\\uuuuuuuu0047";
        __CLR4_1_2w35w35l3lqxv21.R.inc(41592);final String result = uu.translate(input);
        __CLR4_1_2w35w35l3lqxv21.R.inc(41593);assertEquals("Failed to unescape Unicode characters with many 'u' characters", "G", result);
    }finally{__CLR4_1_2w35w35l3lqxv21.R.flushNeeded();}}

    @Test
    public void testLessThanFour() {__CLR4_1_2w35w35l3lqxv21.R.globalSliceStart(getClass().getName(),41594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2caf1ehw3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w35w35l3lqxv21.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w35w35l3lqxv21.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.UnicodeUnescaperTest.testLessThanFour",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41594,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2caf1ehw3e(){try{__CLR4_1_2w35w35l3lqxv21.R.inc(41594);
        __CLR4_1_2w35w35l3lqxv21.R.inc(41595);final UnicodeUnescaper uu = new UnicodeUnescaper();

        __CLR4_1_2w35w35l3lqxv21.R.inc(41596);final String input = "\\0047\\u006";
        __CLR4_1_2w35w35l3lqxv21.R.inc(41597);try {
            __CLR4_1_2w35w35l3lqxv21.R.inc(41598);uu.translate(input);
            __CLR4_1_2w35w35l3lqxv21.R.inc(41599);fail("A lack of digits in a Unicode escape sequence failed to throw an exception");
        } catch(final IllegalArgumentException iae) {
            // expected
        }
    }finally{__CLR4_1_2w35w35l3lqxv21.R.flushNeeded();}}
}
