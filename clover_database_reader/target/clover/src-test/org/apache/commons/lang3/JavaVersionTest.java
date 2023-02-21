/* $$ This file has been instrumented by Clover 4.1.2#20161011084623935 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.apache.commons.lang3.JavaVersion.JAVA_0_9;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_1;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_2;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_3;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_5;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_6;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_7;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_8;
import static org.apache.commons.lang3.JavaVersion.get;
import static org.apache.commons.lang3.JavaVersion.getJavaVersion;

/**
 * Unit tests {@link org.apache.commons.lang3.JavaVersion}.
 *
 * @version $Id: JavaVersionTest.java 918366 2010-03-03 08:56:22Z bayard $
 */
public class JavaVersionTest {static class __CLR4_1_2k0pk0pl3lqxtvr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,25965,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testGetJavaVersion() {__CLR4_1_2k0pk0pl3lqxtvr.R.globalSliceStart(getClass().getName(),25945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29epmsnk0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k0pk0pl3lqxtvr.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k0pk0pl3lqxtvr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.JavaVersionTest.testGetJavaVersion",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25945,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29epmsnk0p(){try{__CLR4_1_2k0pk0pl3lqxtvr.R.inc(25945);
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25946);assertEquals("0.9 failed", JAVA_0_9, get("0.9"));
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25947);assertEquals("1.1 failed", JAVA_1_1, get("1.1"));
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25948);assertEquals("1.2 failed", JAVA_1_2, get("1.2"));
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25949);assertEquals("1.3 failed", JAVA_1_3, get("1.3"));
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25950);assertEquals("1.4 failed", JAVA_1_4, get("1.4"));
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25951);assertEquals("1.5 failed", JAVA_1_5, get("1.5"));
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25952);assertEquals("1.6 failed", JAVA_1_6, get("1.6"));
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25953);assertEquals("1.7 failed", JAVA_1_7, get("1.7"));
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25954);assertEquals("1.8 failed", JAVA_1_8, get("1.8"));
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25955);assertNull("1.9 unexpectedly worked", get("1.9"));
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25956);assertEquals("Wrapper method failed", get("1.5"), getJavaVersion("1.5"));
    }finally{__CLR4_1_2k0pk0pl3lqxtvr.R.flushNeeded();}}

    @Test
    public void testAtLeast() {__CLR4_1_2k0pk0pl3lqxtvr.R.globalSliceStart(getClass().getName(),25957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sjhe7pk11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k0pk0pl3lqxtvr.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k0pk0pl3lqxtvr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.JavaVersionTest.testAtLeast",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25957,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sjhe7pk11(){try{__CLR4_1_2k0pk0pl3lqxtvr.R.inc(25957);
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25958);assertFalse("1.2 at least 1.5 passed", JAVA_1_2.atLeast(JAVA_1_5));
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25959);assertTrue("1.5 at least 1.2 failed", JAVA_1_5.atLeast(JAVA_1_2));
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25960);assertFalse("1.6 at least 1.7 passed", JAVA_1_6.atLeast(JAVA_1_7));

        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25961);assertTrue("0.9 at least 1.5 failed", JAVA_0_9.atLeast(JAVA_1_5));
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25962);assertFalse("0.9 at least 1.6 passed", JAVA_0_9.atLeast(JAVA_1_6));
    }finally{__CLR4_1_2k0pk0pl3lqxtvr.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_1_2k0pk0pl3lqxtvr.R.globalSliceStart(getClass().getName(),25963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidk17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2k0pk0pl3lqxtvr.R.rethrow($CLV_t2$);}finally{__CLR4_1_2k0pk0pl3lqxtvr.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.JavaVersionTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25963,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidk17(){try{__CLR4_1_2k0pk0pl3lqxtvr.R.inc(25963);
        __CLR4_1_2k0pk0pl3lqxtvr.R.inc(25964);assertEquals("1.2", JAVA_1_2.toString());
    }finally{__CLR4_1_2k0pk0pl3lqxtvr.R.flushNeeded();}}

}
