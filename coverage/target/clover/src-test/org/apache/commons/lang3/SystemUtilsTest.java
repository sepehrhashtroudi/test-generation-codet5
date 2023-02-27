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
import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Locale;

import org.junit.Assert;

/**
 * Unit tests {@link org.apache.commons.lang3.SystemUtils}.
 * 
 * Only limited testing can be performed.
 * 
 * @version $Id$
 */
public class SystemUtilsTest {static class __CLR4_1_2mxamxal3lqxu5i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,30027,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConstructor() {__CLR4_1_2mxamxal3lqxu5i.R.globalSliceStart(getClass().getName(),29710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hmxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2mxamxal3lqxu5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_2mxamxal3lqxu5i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29710,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hmxa(){try{__CLR4_1_2mxamxal3lqxu5i.R.inc(29710);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29711);assertNotNull(new SystemUtils());
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29712);final Constructor<?>[] cons = SystemUtils.class.getDeclaredConstructors();
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29713);assertEquals(1, cons.length);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29714);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29715);assertTrue(Modifier.isPublic(SystemUtils.class.getModifiers()));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29716);assertFalse(Modifier.isFinal(SystemUtils.class.getModifiers()));
    }finally{__CLR4_1_2mxamxal3lqxu5i.R.flushNeeded();}}

    /**
     * Assums no security manager exists.
     */
    @Test
    public void testGetJavaHome() {__CLR4_1_2mxamxal3lqxu5i.R.globalSliceStart(getClass().getName(),29717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b2ax58mxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2mxamxal3lqxu5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_2mxamxal3lqxu5i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testGetJavaHome",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29717,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b2ax58mxh(){try{__CLR4_1_2mxamxal3lqxu5i.R.inc(29717);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29718);final File dir = SystemUtils.getJavaHome();
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29719);Assert.assertNotNull(dir);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29720);Assert.assertTrue(dir.exists());
    }finally{__CLR4_1_2mxamxal3lqxu5i.R.flushNeeded();}}

    /**
     * Assums no security manager exists.
     */
    @Test
    public void testGetJavaIoTmpDir() {__CLR4_1_2mxamxal3lqxu5i.R.globalSliceStart(getClass().getName(),29721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2f1nxxlmxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2mxamxal3lqxu5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_2mxamxal3lqxu5i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testGetJavaIoTmpDir",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29721,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2f1nxxlmxl(){try{__CLR4_1_2mxamxal3lqxu5i.R.inc(29721);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29722);final File dir = SystemUtils.getJavaIoTmpDir();
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29723);Assert.assertNotNull(dir);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29724);Assert.assertTrue(dir.exists());
    }finally{__CLR4_1_2mxamxal3lqxu5i.R.flushNeeded();}}

    /**
     * Assums no security manager exists.
     */
    @Test
    public void testGetUserDir() {__CLR4_1_2mxamxal3lqxu5i.R.globalSliceStart(getClass().getName(),29725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i0ei4lmxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2mxamxal3lqxu5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_2mxamxal3lqxu5i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testGetUserDir",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29725,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i0ei4lmxp(){try{__CLR4_1_2mxamxal3lqxu5i.R.inc(29725);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29726);final File dir = SystemUtils.getUserDir();
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29727);Assert.assertNotNull(dir);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29728);Assert.assertTrue(dir.exists());
    }finally{__CLR4_1_2mxamxal3lqxu5i.R.flushNeeded();}}

    /**
     * Assums no security manager exists.
     */
    @Test
    public void testGetUserHome() {__CLR4_1_2mxamxal3lqxu5i.R.globalSliceStart(getClass().getName(),29729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2edsfxnmxt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2mxamxal3lqxu5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_2mxamxal3lqxu5i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testGetUserHome",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2edsfxnmxt(){try{__CLR4_1_2mxamxal3lqxu5i.R.inc(29729);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29730);final File dir = SystemUtils.getUserHome();
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29731);Assert.assertNotNull(dir);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29732);Assert.assertTrue(dir.exists());
    }finally{__CLR4_1_2mxamxal3lqxu5i.R.flushNeeded();}}

    @Test
    public void testIS_JAVA() {__CLR4_1_2mxamxal3lqxu5i.R.globalSliceStart(getClass().getName(),29733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21dkv70mxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2mxamxal3lqxu5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_2mxamxal3lqxu5i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testIS_JAVA",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29733,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21dkv70mxx(){try{__CLR4_1_2mxamxal3lqxu5i.R.inc(29733);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29734);final String javaVersion = System.getProperty("java.version");
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29735);if ((((javaVersion == null)&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29736)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29737)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29738);assertFalse(SystemUtils.IS_JAVA_1_1);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29739);assertFalse(SystemUtils.IS_JAVA_1_2);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29740);assertFalse(SystemUtils.IS_JAVA_1_3);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29741);assertFalse(SystemUtils.IS_JAVA_1_4);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29742);assertFalse(SystemUtils.IS_JAVA_1_5);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29743);assertFalse(SystemUtils.IS_JAVA_1_6);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29744);assertFalse(SystemUtils.IS_JAVA_1_7);
        } }else {__CLR4_1_2mxamxal3lqxu5i.R.inc(29745);if ((((javaVersion.startsWith("1.1"))&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29746)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29747)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29748);assertTrue(SystemUtils.IS_JAVA_1_1);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29749);assertFalse(SystemUtils.IS_JAVA_1_2);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29750);assertFalse(SystemUtils.IS_JAVA_1_3);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29751);assertFalse(SystemUtils.IS_JAVA_1_4);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29752);assertFalse(SystemUtils.IS_JAVA_1_5);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29753);assertFalse(SystemUtils.IS_JAVA_1_6);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29754);assertFalse(SystemUtils.IS_JAVA_1_7);
        } }else {__CLR4_1_2mxamxal3lqxu5i.R.inc(29755);if ((((javaVersion.startsWith("1.2"))&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29756)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29757)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29758);assertFalse(SystemUtils.IS_JAVA_1_1);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29759);assertTrue(SystemUtils.IS_JAVA_1_2);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29760);assertFalse(SystemUtils.IS_JAVA_1_3);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29761);assertFalse(SystemUtils.IS_JAVA_1_4);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29762);assertFalse(SystemUtils.IS_JAVA_1_5);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29763);assertFalse(SystemUtils.IS_JAVA_1_6);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29764);assertFalse(SystemUtils.IS_JAVA_1_7);
        } }else {__CLR4_1_2mxamxal3lqxu5i.R.inc(29765);if ((((javaVersion.startsWith("1.3"))&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29766)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29767)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29768);assertFalse(SystemUtils.IS_JAVA_1_1);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29769);assertFalse(SystemUtils.IS_JAVA_1_2);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29770);assertTrue(SystemUtils.IS_JAVA_1_3);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29771);assertFalse(SystemUtils.IS_JAVA_1_4);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29772);assertFalse(SystemUtils.IS_JAVA_1_5);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29773);assertFalse(SystemUtils.IS_JAVA_1_6);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29774);assertFalse(SystemUtils.IS_JAVA_1_7);
        } }else {__CLR4_1_2mxamxal3lqxu5i.R.inc(29775);if ((((javaVersion.startsWith("1.4"))&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29776)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29777)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29778);assertFalse(SystemUtils.IS_JAVA_1_1);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29779);assertFalse(SystemUtils.IS_JAVA_1_2);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29780);assertFalse(SystemUtils.IS_JAVA_1_3);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29781);assertTrue(SystemUtils.IS_JAVA_1_4);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29782);assertFalse(SystemUtils.IS_JAVA_1_5);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29783);assertFalse(SystemUtils.IS_JAVA_1_6);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29784);assertFalse(SystemUtils.IS_JAVA_1_7);
        } }else {__CLR4_1_2mxamxal3lqxu5i.R.inc(29785);if ((((javaVersion.startsWith("1.5"))&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29786)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29787)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29788);assertFalse(SystemUtils.IS_JAVA_1_1);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29789);assertFalse(SystemUtils.IS_JAVA_1_2);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29790);assertFalse(SystemUtils.IS_JAVA_1_3);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29791);assertFalse(SystemUtils.IS_JAVA_1_4);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29792);assertTrue(SystemUtils.IS_JAVA_1_5);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29793);assertFalse(SystemUtils.IS_JAVA_1_6);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29794);assertFalse(SystemUtils.IS_JAVA_1_7);
        } }else {__CLR4_1_2mxamxal3lqxu5i.R.inc(29795);if ((((javaVersion.startsWith("1.6"))&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29796)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29797)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29798);assertFalse(SystemUtils.IS_JAVA_1_1);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29799);assertFalse(SystemUtils.IS_JAVA_1_2);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29800);assertFalse(SystemUtils.IS_JAVA_1_3);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29801);assertFalse(SystemUtils.IS_JAVA_1_4);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29802);assertFalse(SystemUtils.IS_JAVA_1_5);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29803);assertTrue(SystemUtils.IS_JAVA_1_6);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29804);assertFalse(SystemUtils.IS_JAVA_1_7);
        } }else {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29805);System.out.println("Can't test IS_JAVA value: "+javaVersion);
        }
    }}}}}}}}finally{__CLR4_1_2mxamxal3lqxu5i.R.flushNeeded();}}

    @Test
    public void testIS_OS() {__CLR4_1_2mxamxal3lqxu5i.R.globalSliceStart(getClass().getName(),29806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2z4gv6amzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2mxamxal3lqxu5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_2mxamxal3lqxu5i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testIS_OS",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29806,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2z4gv6amzy(){try{__CLR4_1_2mxamxal3lqxu5i.R.inc(29806);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29807);final String osName = System.getProperty("os.name");
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29808);if ((((osName == null)&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29809)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29810)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29811);assertFalse(SystemUtils.IS_OS_WINDOWS);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29812);assertFalse(SystemUtils.IS_OS_UNIX);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29813);assertFalse(SystemUtils.IS_OS_SOLARIS);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29814);assertFalse(SystemUtils.IS_OS_LINUX);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29815);assertFalse(SystemUtils.IS_OS_MAC_OSX);
        } }else {__CLR4_1_2mxamxal3lqxu5i.R.inc(29816);if ((((osName.startsWith("Windows"))&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29817)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29818)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29819);assertFalse(SystemUtils.IS_OS_UNIX);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29820);assertTrue(SystemUtils.IS_OS_WINDOWS);
        } }else {__CLR4_1_2mxamxal3lqxu5i.R.inc(29821);if ((((osName.startsWith("Solaris"))&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29822)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29823)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29824);assertTrue(SystemUtils.IS_OS_SOLARIS);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29825);assertTrue(SystemUtils.IS_OS_UNIX);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29826);assertFalse(SystemUtils.IS_OS_WINDOWS);
        } }else {__CLR4_1_2mxamxal3lqxu5i.R.inc(29827);if ((((osName.toLowerCase(Locale.ENGLISH).startsWith("linux"))&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29828)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29829)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29830);assertTrue(SystemUtils.IS_OS_LINUX);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29831);assertTrue(SystemUtils.IS_OS_UNIX);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29832);assertFalse(SystemUtils.IS_OS_WINDOWS);
        } }else {__CLR4_1_2mxamxal3lqxu5i.R.inc(29833);if ((((osName.startsWith("Mac OS X"))&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29834)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29835)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29836);assertTrue(SystemUtils.IS_OS_MAC_OSX);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29837);assertTrue(SystemUtils.IS_OS_UNIX);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29838);assertFalse(SystemUtils.IS_OS_WINDOWS);
        } }else {__CLR4_1_2mxamxal3lqxu5i.R.inc(29839);if ((((osName.startsWith("OS/2"))&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29840)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29841)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29842);assertTrue(SystemUtils.IS_OS_OS2);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29843);assertFalse(SystemUtils.IS_OS_UNIX);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29844);assertFalse(SystemUtils.IS_OS_WINDOWS);
        } }else {__CLR4_1_2mxamxal3lqxu5i.R.inc(29845);if ((((osName.startsWith("SunOS"))&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29846)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29847)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29848);assertTrue(SystemUtils.IS_OS_SUN_OS);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29849);assertTrue(SystemUtils.IS_OS_UNIX);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29850);assertFalse(SystemUtils.IS_OS_WINDOWS);
        } }else {__CLR4_1_2mxamxal3lqxu5i.R.inc(29851);if ((((osName.startsWith("FreeBSD"))&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(29852)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(29853)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29854);assertTrue(SystemUtils.IS_OS_FREE_BSD);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29855);assertTrue(SystemUtils.IS_OS_UNIX);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29856);assertFalse(SystemUtils.IS_OS_WINDOWS);
        } }else {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(29857);System.out.println("Can't test IS_OS value: "+osName);
        }
    }}}}}}}}}finally{__CLR4_1_2mxamxal3lqxu5i.R.flushNeeded();}}

    @Test
    public void testJavaVersionMatches() {__CLR4_1_2mxamxal3lqxu5i.R.globalSliceStart(getClass().getName(),29858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26l52mun1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2mxamxal3lqxu5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_2mxamxal3lqxu5i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testJavaVersionMatches",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29858,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26l52mun1e(){try{__CLR4_1_2mxamxal3lqxu5i.R.inc(29858);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29859);String javaVersion = null;
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29860);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29861);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29862);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29863);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29864);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29865);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29866);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29867);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29868);javaVersion = "";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29869);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29870);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29871);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29872);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29873);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29874);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29875);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29876);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29877);javaVersion = "1.0";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29878);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29879);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29880);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29881);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29882);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29883);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29884);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29885);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29886);javaVersion = "1.1";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29887);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29888);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29889);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29890);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29891);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29892);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29893);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29894);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29895);javaVersion = "1.2";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29896);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29897);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29898);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29899);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29900);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29901);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29902);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29903);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29904);javaVersion = "1.3.0";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29905);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29906);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29907);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29908);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29909);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29910);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29911);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29912);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29913);javaVersion = "1.3.1";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29914);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29915);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29916);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29917);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29918);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29919);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29920);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29921);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29922);javaVersion = "1.4.0";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29923);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29924);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29925);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29926);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29927);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29928);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29929);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29930);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29931);javaVersion = "1.4.1";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29932);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29933);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29934);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29935);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29936);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29937);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29938);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29939);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29940);javaVersion = "1.4.2";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29941);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29942);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29943);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29944);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29945);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29946);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29947);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29948);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29949);javaVersion = "1.5.0";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29950);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29951);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29952);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29953);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29954);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29955);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29956);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29957);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29958);javaVersion = "1.6.0";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29959);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29960);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29961);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29962);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29963);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29964);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29965);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29966);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29967);javaVersion = "1.7.0";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29968);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.0"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29969);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29970);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.2"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29971);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.3"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29972);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.4"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29973);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.5"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29974);assertFalse(SystemUtils.isJavaVersionMatch(javaVersion, "1.6"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29975);assertTrue(SystemUtils.isJavaVersionMatch(javaVersion, "1.7"));
    }finally{__CLR4_1_2mxamxal3lqxu5i.R.flushNeeded();}}

    @Test
    public void testOSMatchesName() {__CLR4_1_2mxamxal3lqxu5i.R.globalSliceStart(getClass().getName(),29976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_217i29n4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2mxamxal3lqxu5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_2mxamxal3lqxu5i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testOSMatchesName",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29976,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_217i29n4o(){try{__CLR4_1_2mxamxal3lqxu5i.R.inc(29976);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29977);String osName = null;
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29978);assertFalse(SystemUtils.isOSNameMatch(osName, "Windows"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29979);osName = "";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29980);assertFalse(SystemUtils.isOSNameMatch(osName, "Windows"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29981);osName = "Windows 95";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29982);assertTrue(SystemUtils.isOSNameMatch(osName, "Windows"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29983);osName = "Windows NT";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29984);assertTrue(SystemUtils.isOSNameMatch(osName, "Windows"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29985);osName = "OS/2";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29986);assertFalse(SystemUtils.isOSNameMatch(osName, "Windows"));
    }finally{__CLR4_1_2mxamxal3lqxu5i.R.flushNeeded();}}

    @Test
    public void testOSMatchesNameAndVersion() {__CLR4_1_2mxamxal3lqxu5i.R.globalSliceStart(getClass().getName(),29987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hfgb80n4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2mxamxal3lqxu5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_2mxamxal3lqxu5i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testOSMatchesNameAndVersion",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29987,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hfgb80n4z(){try{__CLR4_1_2mxamxal3lqxu5i.R.inc(29987);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29988);String osName = null;
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29989);String osVersion = null;
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29990);assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29991);osName = "";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29992);osVersion = "";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29993);assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29994);osName = "Windows 95";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29995);osVersion = "4.0";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29996);assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29997);osName = "Windows 95";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29998);osVersion = "4.1";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(29999);assertTrue(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30000);osName = "Windows 98";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30001);osVersion = "4.1";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30002);assertTrue(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30003);osName = "Windows NT";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30004);osVersion = "4.0";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30005);assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30006);osName = "OS/2";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30007);osVersion = "4.0";
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30008);assertFalse(SystemUtils.isOSMatch(osName, osVersion, "Windows 9", "4.1"));
    }finally{__CLR4_1_2mxamxal3lqxu5i.R.flushNeeded();}}

    @Test
    public void testJavaAwtHeadless() {__CLR4_1_2mxamxal3lqxu5i.R.globalSliceStart(getClass().getName(),30009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iu0fm2n5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2mxamxal3lqxu5i.R.rethrow($CLV_t2$);}finally{__CLR4_1_2mxamxal3lqxu5i.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.SystemUtilsTest.testJavaAwtHeadless",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30009,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iu0fm2n5l(){try{__CLR4_1_2mxamxal3lqxu5i.R.inc(30009);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30010);final boolean atLeastJava14 = SystemUtils.isJavaVersionAtLeast(JAVA_1_4);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30011);final String expectedStringValue = System.getProperty("java.awt.headless");
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30012);final String expectedStringValueWithDefault = System.getProperty("java.awt.headless", "false");
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30013);assertNotNull(expectedStringValueWithDefault);
        __CLR4_1_2mxamxal3lqxu5i.R.inc(30014);if ((((atLeastJava14)&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(30015)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(30016)==0&false))) {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(30017);final boolean expectedValue = Boolean.valueOf(expectedStringValue).booleanValue();
            __CLR4_1_2mxamxal3lqxu5i.R.inc(30018);if ((((expectedStringValue != null)&&(__CLR4_1_2mxamxal3lqxu5i.R.iget(30019)!=0|true))||(__CLR4_1_2mxamxal3lqxu5i.R.iget(30020)==0&false))) {{
                __CLR4_1_2mxamxal3lqxu5i.R.inc(30021);assertEquals(expectedStringValue, SystemUtils.JAVA_AWT_HEADLESS);
            }
            }__CLR4_1_2mxamxal3lqxu5i.R.inc(30022);assertEquals(expectedValue, SystemUtils.isJavaAwtHeadless());
        } }else {{
            __CLR4_1_2mxamxal3lqxu5i.R.inc(30023);assertNull(expectedStringValue);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(30024);assertNull(SystemUtils.JAVA_AWT_HEADLESS);
            __CLR4_1_2mxamxal3lqxu5i.R.inc(30025);assertEquals(expectedStringValueWithDefault, "" + SystemUtils.isJavaAwtHeadless());
        }
        }__CLR4_1_2mxamxal3lqxu5i.R.inc(30026);assertEquals(expectedStringValueWithDefault, "" + SystemUtils.isJavaAwtHeadless());
    }finally{__CLR4_1_2mxamxal3lqxu5i.R.flushNeeded();}}
}
