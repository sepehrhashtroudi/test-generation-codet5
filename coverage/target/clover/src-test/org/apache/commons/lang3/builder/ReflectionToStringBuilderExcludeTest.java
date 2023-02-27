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

package org.apache.commons.lang3.builder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

/**
 * @version $Id$
 */
public class ReflectionToStringBuilderExcludeTest {static class __CLR4_1_2p8ip8il3lqxuev{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,32755,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    class TestFixture {
        @SuppressWarnings("unused")
        private final String secretField = SECRET_VALUE;

        @SuppressWarnings("unused")
        private final String showField = NOT_SECRET_VALUE;
    }

    private static final String NOT_SECRET_FIELD = "showField";

    private static final String NOT_SECRET_VALUE = "Hello World!";

    private static final String SECRET_FIELD = "secretField";

    private static final String SECRET_VALUE = "secret value";

    @Test
    public void test_toStringExclude() {__CLR4_1_2p8ip8il3lqxuev.R.globalSliceStart(getClass().getName(),32706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g8rg6wp8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p8ip8il3lqxuev.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p8ip8il3lqxuev.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExclude",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32706,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g8rg6wp8i(){try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32706);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32707);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), SECRET_FIELD);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32708);this.validateSecretFieldAbsent(toString);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeArray() {__CLR4_1_2p8ip8il3lqxuev.R.globalSliceStart(getClass().getName(),32709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tpkqv3p8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p8ip8il3lqxuev.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p8ip8il3lqxuev.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32709,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tpkqv3p8l(){try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32709);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32710);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), new String[]{SECRET_FIELD});
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32711);this.validateSecretFieldAbsent(toString);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeArrayWithNull() {__CLR4_1_2p8ip8il3lqxuev.R.globalSliceStart(getClass().getName(),32712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2f2ozccp8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p8ip8il3lqxuev.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p8ip8il3lqxuev.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeArrayWithNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32712,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2f2ozccp8o(){try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32712);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32713);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), new String[]{null});
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32714);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeArrayWithNulls() {__CLR4_1_2p8ip8il3lqxuev.R.globalSliceStart(getClass().getName(),32715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b1rxw5p8r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p8ip8il3lqxuev.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p8ip8il3lqxuev.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeArrayWithNulls",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32715,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b1rxw5p8r(){try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32715);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32716);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), new String[]{null, null});
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32717);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeCollection() {__CLR4_1_2p8ip8il3lqxuev.R.globalSliceStart(getClass().getName(),32718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vc301mp8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p8ip8il3lqxuev.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p8ip8il3lqxuev.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeCollection",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32718,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vc301mp8u(){try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32718);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32719);final List<String> excludeList = new ArrayList<String>();
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32720);excludeList.add(SECRET_FIELD);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32721);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), excludeList);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32722);this.validateSecretFieldAbsent(toString);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeCollectionWithNull() {__CLR4_1_2p8ip8il3lqxuev.R.globalSliceStart(getClass().getName(),32723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29qqmlvp8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p8ip8il3lqxuev.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p8ip8il3lqxuev.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeCollectionWithNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32723,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29qqmlvp8z(){try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32723);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32724);final List<String> excludeList = new ArrayList<String>();
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32725);excludeList.add(null);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32726);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), excludeList);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32727);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeCollectionWithNulls() {__CLR4_1_2p8ip8il3lqxuev.R.globalSliceStart(getClass().getName(),32728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2c6kwyap94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p8ip8il3lqxuev.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p8ip8il3lqxuev.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeCollectionWithNulls",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32728,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2c6kwyap94(){try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32728);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32729);final List<String> excludeList = new ArrayList<String>();
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32730);excludeList.add(null);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32731);excludeList.add(null);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32732);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), excludeList);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32733);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeEmptyArray() {__CLR4_1_2p8ip8il3lqxuev.R.globalSliceStart(getClass().getName(),32734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s1wh4kp9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p8ip8il3lqxuev.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p8ip8il3lqxuev.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeEmptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32734,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s1wh4kp9a(){try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32734);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32735);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), ArrayUtils.EMPTY_STRING_ARRAY);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32736);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeEmptyCollection() {__CLR4_1_2p8ip8il3lqxuev.R.globalSliceStart(getClass().getName(),32737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21syxypp9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p8ip8il3lqxuev.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p8ip8il3lqxuev.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeEmptyCollection",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32737,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21syxypp9d(){try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32737);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32738);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), new ArrayList<String>());
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32739);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeNullArray() {__CLR4_1_2p8ip8il3lqxuev.R.globalSliceStart(getClass().getName(),32740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aeso2wp9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p8ip8il3lqxuev.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p8ip8il3lqxuev.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeNullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32740,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aeso2wp9g(){try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32740);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32741);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), (String[]) null);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32742);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}

    @Test
    public void test_toStringExcludeNullCollection() {__CLR4_1_2p8ip8il3lqxuev.R.globalSliceStart(getClass().getName(),32743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fa4t4jp9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p8ip8il3lqxuev.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p8ip8il3lqxuev.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest.test_toStringExcludeNullCollection",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32743,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fa4t4jp9j(){try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32743);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32744);final String toString = ReflectionToStringBuilder.toStringExclude(new TestFixture(), (Collection<String>) null);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32745);this.validateSecretFieldPresent(toString);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}

    private void validateNonSecretField(final String toString) {try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32746);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32747);Assert.assertTrue(toString.indexOf(NOT_SECRET_FIELD) > ArrayUtils.INDEX_NOT_FOUND);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32748);Assert.assertTrue(toString.indexOf(NOT_SECRET_VALUE) > ArrayUtils.INDEX_NOT_FOUND);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}

    private void validateSecretFieldAbsent(final String toString) {try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32749);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32750);Assert.assertEquals(ArrayUtils.INDEX_NOT_FOUND, toString.indexOf(SECRET_VALUE));
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32751);this.validateNonSecretField(toString);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}

    private void validateSecretFieldPresent(final String toString) {try{__CLR4_1_2p8ip8il3lqxuev.R.inc(32752);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32753);Assert.assertTrue(toString.indexOf(SECRET_VALUE) > 0);
        __CLR4_1_2p8ip8il3lqxuev.R.inc(32754);this.validateNonSecretField(toString);
    }finally{__CLR4_1_2p8ip8il3lqxuev.R.flushNeeded();}}
}
