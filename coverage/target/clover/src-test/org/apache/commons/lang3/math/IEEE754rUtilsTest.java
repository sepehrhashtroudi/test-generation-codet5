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
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.math.IEEE754rUtils}.
 *
 * @version $Id$
 */
public class IEEE754rUtilsTest  {static class __CLR4_1_2rsnrsnl3lqxuou{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,36069,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testLang381() {__CLR4_1_2rsnrsnl3lqxuou.R.globalSliceStart(getClass().getName(),36023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ok868jrsn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rsnrsnl3lqxuou.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rsnrsnl3lqxuou.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.IEEE754rUtilsTest.testLang381",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36023,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ok868jrsn(){try{__CLR4_1_2rsnrsnl3lqxuou.R.inc(36023);
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36024);assertEquals(1.2, IEEE754rUtils.min(1.2, 2.5, Double.NaN), 0.01);
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36025);assertEquals(2.5, IEEE754rUtils.max(1.2, 2.5, Double.NaN), 0.01);
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36026);assertTrue(Double.isNaN(IEEE754rUtils.max(Double.NaN, Double.NaN, Double.NaN)));
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36027);assertEquals(1.2f, IEEE754rUtils.min(1.2f, 2.5f, Float.NaN), 0.01);
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36028);assertEquals(2.5f, IEEE754rUtils.max(1.2f, 2.5f, Float.NaN), 0.01);
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36029);assertTrue(Float.isNaN(IEEE754rUtils.max(Float.NaN, Float.NaN, Float.NaN)));

        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36030);final double[] a = new double[] { 1.2, Double.NaN, 3.7, 27.0, 42.0, Double.NaN };
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36031);assertEquals(42.0, IEEE754rUtils.max(a), 0.01);
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36032);assertEquals(1.2, IEEE754rUtils.min(a), 0.01);

        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36033);final double[] b = new double[] { Double.NaN, 1.2, Double.NaN, 3.7, 27.0, 42.0, Double.NaN };
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36034);assertEquals(42.0, IEEE754rUtils.max(b), 0.01);
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36035);assertEquals(1.2, IEEE754rUtils.min(b), 0.01);

        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36036);final float[] aF = new float[] { 1.2f, Float.NaN, 3.7f, 27.0f, 42.0f, Float.NaN };
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36037);assertEquals(1.2f, IEEE754rUtils.min(aF), 0.01);
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36038);assertEquals(42.0f, IEEE754rUtils.max(aF), 0.01);

        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36039);final float[] bF = new float[] { Float.NaN, 1.2f, Float.NaN, 3.7f, 27.0f, 42.0f, Float.NaN };
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36040);assertEquals(1.2f, IEEE754rUtils.min(bF), 0.01);
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36041);assertEquals(42.0f, IEEE754rUtils.max(bF), 0.01);
    }finally{__CLR4_1_2rsnrsnl3lqxuou.R.flushNeeded();}}

    @Test
    public void testEnforceExceptions() {__CLR4_1_2rsnrsnl3lqxuou.R.globalSliceStart(getClass().getName(),36042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26o6w9nrt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rsnrsnl3lqxuou.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rsnrsnl3lqxuou.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.IEEE754rUtilsTest.testEnforceExceptions",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36042,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26o6w9nrt6(){try{__CLR4_1_2rsnrsnl3lqxuou.R.inc(36042);
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36043);try {
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36044);IEEE754rUtils.min( (float[]) null);
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36045);fail("IllegalArgumentException expected for null input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36046);try {
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36047);IEEE754rUtils.min(new float[0]);
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36048);fail("IllegalArgumentException expected for empty input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36049);try {
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36050);IEEE754rUtils.max( (float[]) null);
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36051);fail("IllegalArgumentException expected for null input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36052);try {
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36053);IEEE754rUtils.max(new float[0]);
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36054);fail("IllegalArgumentException expected for empty input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36055);try {
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36056);IEEE754rUtils.min( (double[]) null);
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36057);fail("IllegalArgumentException expected for null input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36058);try {
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36059);IEEE754rUtils.min(new double[0]);
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36060);fail("IllegalArgumentException expected for empty input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36061);try {
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36062);IEEE754rUtils.max( (double[]) null);
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36063);fail("IllegalArgumentException expected for null input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36064);try {
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36065);IEEE754rUtils.max(new double[0]);
            __CLR4_1_2rsnrsnl3lqxuou.R.inc(36066);fail("IllegalArgumentException expected for empty input");
        } catch(final IllegalArgumentException iae) { /* expected */ }

    }finally{__CLR4_1_2rsnrsnl3lqxuou.R.flushNeeded();}}

    @Test
    public void testConstructorExists() {__CLR4_1_2rsnrsnl3lqxuou.R.globalSliceStart(getClass().getName(),36067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21fvlx1rtv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rsnrsnl3lqxuou.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rsnrsnl3lqxuou.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.IEEE754rUtilsTest.testConstructorExists",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36067,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21fvlx1rtv(){try{__CLR4_1_2rsnrsnl3lqxuou.R.inc(36067);
        __CLR4_1_2rsnrsnl3lqxuou.R.inc(36068);new IEEE754rUtils();
    }finally{__CLR4_1_2rsnrsnl3lqxuou.R.flushNeeded();}}
    
}
