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

import org.junit.Test;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.translate.NumericEntityEscaper}.
 * @version $Id$
 */
public class NumericEntityEscaperTest  {static class __CLR4_1_2w0tw0tl3lqxv1q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,41522,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBelow() {__CLR4_1_2w0tw0tl3lqxv1q.R.globalSliceStart(getClass().getName(),41501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vjgh5mw0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w0tw0tl3lqxv1q.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w0tw0tl3lqxv1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.NumericEntityEscaperTest.testBelow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41501,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vjgh5mw0t(){try{__CLR4_1_2w0tw0tl3lqxv1q.R.inc(41501);
        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41502);final NumericEntityEscaper nee = NumericEntityEscaper.below('F');

        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41503);final String input = "ADFGZ";
        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41504);final String result = nee.translate(input);
        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41505);assertEquals("Failed to escape numeric entities via the below method", "&#65;&#68;FGZ", result);
    }finally{__CLR4_1_2w0tw0tl3lqxv1q.R.flushNeeded();}}

    @Test
    public void testBetween() {__CLR4_1_2w0tw0tl3lqxv1q.R.globalSliceStart(getClass().getName(),41506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nkypurw0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w0tw0tl3lqxv1q.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w0tw0tl3lqxv1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.NumericEntityEscaperTest.testBetween",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41506,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nkypurw0y(){try{__CLR4_1_2w0tw0tl3lqxv1q.R.inc(41506);
        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41507);final NumericEntityEscaper nee = NumericEntityEscaper.between('F', 'L');

        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41508);final String input = "ADFGZ";
        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41509);final String result = nee.translate(input);
        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41510);assertEquals("Failed to escape numeric entities via the between method", "AD&#70;&#71;Z", result);
    }finally{__CLR4_1_2w0tw0tl3lqxv1q.R.flushNeeded();}}

    @Test
    public void testAbove() {__CLR4_1_2w0tw0tl3lqxv1q.R.globalSliceStart(getClass().getName(),41511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hmuioiw13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w0tw0tl3lqxv1q.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w0tw0tl3lqxv1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.NumericEntityEscaperTest.testAbove",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41511,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hmuioiw13(){try{__CLR4_1_2w0tw0tl3lqxv1q.R.inc(41511);
        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41512);final NumericEntityEscaper nee = NumericEntityEscaper.above('F');

        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41513);final String input = "ADFGZ";
        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41514);final String result = nee.translate(input);
        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41515);assertEquals("Failed to escape numeric entities via the above method", "ADF&#71;&#90;", result);
    }finally{__CLR4_1_2w0tw0tl3lqxv1q.R.flushNeeded();}}

    // See LANG-617
    @Test
    public void testSupplementary() {__CLR4_1_2w0tw0tl3lqxv1q.R.globalSliceStart(getClass().getName(),41516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qinr24w18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w0tw0tl3lqxv1q.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w0tw0tl3lqxv1q.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.translate.NumericEntityEscaperTest.testSupplementary",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41516,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qinr24w18(){try{__CLR4_1_2w0tw0tl3lqxv1q.R.inc(41516);
        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41517);final NumericEntityEscaper nee = new NumericEntityEscaper();
        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41518);final String input = "\ud803\udc22";
        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41519);final String expected = "&#68642;";

        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41520);final String result = nee.translate(input);
        __CLR4_1_2w0tw0tl3lqxv1q.R.inc(41521);assertEquals("Failed to escape numeric entities supplementary characters", expected, result);

    }finally{__CLR4_1_2w0tw0tl3lqxv1q.R.flushNeeded();}}

}
