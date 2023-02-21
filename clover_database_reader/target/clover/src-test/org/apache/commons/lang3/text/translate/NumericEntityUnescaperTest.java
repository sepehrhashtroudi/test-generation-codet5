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
 * Unit tests for {@link org.apache.commons.lang3.text.translate.NumericEntityUnescaper}.
 * @version $Id$
 */
public class NumericEntityUnescaperTest  {static class __CLR4_1_2w1ew1el3lqxv1t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,41550,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testSupplementaryUnescaping() {__CLR4_1_2w1ew1el3lqxv1t.R.globalSliceStart(getClass().getName(),41522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iajsnvw1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w1ew1el3lqxv1t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w1ew1el3lqxv1t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest.testSupplementaryUnescaping",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41522,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iajsnvw1e(){try{__CLR4_1_2w1ew1el3lqxv1t.R.inc(41522);
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41523);final NumericEntityUnescaper neu = new NumericEntityUnescaper();
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41524);final String input = "&#68642;";
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41525);final String expected = "\ud803\udc22";

        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41526);final String result = neu.translate(input);
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41527);assertEquals("Failed to unescape numeric entities supplementary characters", expected, result);
    }finally{__CLR4_1_2w1ew1el3lqxv1t.R.flushNeeded();}}

    @Test
    public void testOutOfBounds() {__CLR4_1_2w1ew1el3lqxv1t.R.globalSliceStart(getClass().getName(),41528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22qlxapw1k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w1ew1el3lqxv1t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w1ew1el3lqxv1t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest.testOutOfBounds",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41528,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22qlxapw1k(){try{__CLR4_1_2w1ew1el3lqxv1t.R.inc(41528);
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41529);final NumericEntityUnescaper neu = new NumericEntityUnescaper();

        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41530);assertEquals("Failed to ignore when last character is &", "Test &", neu.translate("Test &"));
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41531);assertEquals("Failed to ignore when last character is &", "Test &#", neu.translate("Test &#"));
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41532);assertEquals("Failed to ignore when last character is &", "Test &#x", neu.translate("Test &#x"));
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41533);assertEquals("Failed to ignore when last character is &", "Test &#X", neu.translate("Test &#X"));
    }finally{__CLR4_1_2w1ew1el3lqxv1t.R.flushNeeded();}}

    @Test
    public void testUnfinishedEntity() {__CLR4_1_2w1ew1el3lqxv1t.R.globalSliceStart(getClass().getName(),41534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_252mfqxw1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w1ew1el3lqxv1t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w1ew1el3lqxv1t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.NumericEntityUnescaperTest.testUnfinishedEntity",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41534,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_252mfqxw1q(){try{__CLR4_1_2w1ew1el3lqxv1t.R.inc(41534);
        // parse it
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41535);NumericEntityUnescaper neu = new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.semiColonOptional);
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41536);String input = "Test &#x30 not test";
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41537);String expected = "Test 0 not test";

        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41538);String result = neu.translate(input);
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41539);assertEquals("Failed to support unfinished entities (i.e. missing semi-colon)", expected, result);

        // ignore it
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41540);neu = new NumericEntityUnescaper();
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41541);input = "Test &#x30 not test";
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41542);expected = input;

        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41543);result = neu.translate(input);
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41544);assertEquals("Failed to ignore unfinished entities (i.e. missing semi-colon)", expected, result);

        // fail it
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41545);neu = new NumericEntityUnescaper(NumericEntityUnescaper.OPTION.errorIfNoSemiColon);
        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41546);input = "Test &#x30 not test";

        __CLR4_1_2w1ew1el3lqxv1t.R.inc(41547);try {
            __CLR4_1_2w1ew1el3lqxv1t.R.inc(41548);result = neu.translate(input);
            __CLR4_1_2w1ew1el3lqxv1t.R.inc(41549);fail("IllegalArgumentException expected");
        } catch(final IllegalArgumentException iae) {
            // expected
        }
    }finally{__CLR4_1_2w1ew1el3lqxv1t.R.flushNeeded();}}

}
