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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Trim/Empty methods
 *
 * @version $Id$
 */
public class StringUtilsTrimEmptyTest  {static class __CLR4_1_2msvmsvl3lqxu4v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,29710,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String FOO = "foo";

    //-----------------------------------------------------------------------
    @Test
    public void testIsEmpty() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2custqgmsv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testIsEmpty",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29551,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2custqgmsv(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29551);
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29552);assertTrue(StringUtils.isEmpty(null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29553);assertTrue(StringUtils.isEmpty(""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29554);assertFalse(StringUtils.isEmpty(" "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29555);assertFalse(StringUtils.isEmpty("foo"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29556);assertFalse(StringUtils.isEmpty("  foo  "));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}

    @Test
    public void testIsNotEmpty() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_278bq65mt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testIsNotEmpty",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29557,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_278bq65mt1(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29557);
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29558);assertFalse(StringUtils.isNotEmpty(null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29559);assertFalse(StringUtils.isNotEmpty(""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29560);assertTrue(StringUtils.isNotEmpty(" "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29561);assertTrue(StringUtils.isNotEmpty("foo"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29562);assertTrue(StringUtils.isNotEmpty("  foo  "));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}

    @Test
    public void testIsBlank() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lhhizlmt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testIsBlank",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29563,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lhhizlmt7(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29563);
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29564);assertTrue(StringUtils.isBlank(null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29565);assertTrue(StringUtils.isBlank(""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29566);assertTrue(StringUtils.isBlank(StringUtilsTest.WHITESPACE));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29567);assertFalse(StringUtils.isBlank("foo"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29568);assertFalse(StringUtils.isBlank("  foo  "));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}

    @Test
    public void testIsNotBlank() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21ecz30mtd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testIsNotBlank",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29569,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21ecz30mtd(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29569);
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29570);assertFalse(StringUtils.isNotBlank(null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29571);assertFalse(StringUtils.isNotBlank(""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29572);assertFalse(StringUtils.isNotBlank(StringUtilsTest.WHITESPACE));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29573);assertTrue(StringUtils.isNotBlank("foo"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29574);assertTrue(StringUtils.isNotBlank("  foo  "));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testTrim() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bl47ffmtj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testTrim",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29575,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bl47ffmtj(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29575);
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29576);assertEquals(FOO, StringUtils.trim(FOO + "  "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29577);assertEquals(FOO, StringUtils.trim(" " + FOO + "  "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29578);assertEquals(FOO, StringUtils.trim(" " + FOO));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29579);assertEquals(FOO, StringUtils.trim(FOO + ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29580);assertEquals("", StringUtils.trim(" \t\r\n\b "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29581);assertEquals("", StringUtils.trim(StringUtilsTest.TRIMMABLE));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29582);assertEquals(StringUtilsTest.NON_TRIMMABLE, StringUtils.trim(StringUtilsTest.NON_TRIMMABLE));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29583);assertEquals("", StringUtils.trim(""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29584);assertEquals(null, StringUtils.trim(null));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}

    @Test
    public void testTrimToNull() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hzqrktmtt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testTrimToNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29585,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hzqrktmtt(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29585);
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29586);assertEquals(FOO, StringUtils.trimToNull(FOO + "  "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29587);assertEquals(FOO, StringUtils.trimToNull(" " + FOO + "  "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29588);assertEquals(FOO, StringUtils.trimToNull(" " + FOO));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29589);assertEquals(FOO, StringUtils.trimToNull(FOO + ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29590);assertEquals(null, StringUtils.trimToNull(" \t\r\n\b "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29591);assertEquals(null, StringUtils.trimToNull(StringUtilsTest.TRIMMABLE));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29592);assertEquals(StringUtilsTest.NON_TRIMMABLE, StringUtils.trimToNull(StringUtilsTest.NON_TRIMMABLE));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29593);assertEquals(null, StringUtils.trimToNull(""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29594);assertEquals(null, StringUtils.trimToNull(null));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}

    @Test
    public void testTrimToEmpty() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n1zbfpmu3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testTrimToEmpty",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29595,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n1zbfpmu3(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29595);
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29596);assertEquals(FOO, StringUtils.trimToEmpty(FOO + "  "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29597);assertEquals(FOO, StringUtils.trimToEmpty(" " + FOO + "  "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29598);assertEquals(FOO, StringUtils.trimToEmpty(" " + FOO));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29599);assertEquals(FOO, StringUtils.trimToEmpty(FOO + ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29600);assertEquals("", StringUtils.trimToEmpty(" \t\r\n\b "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29601);assertEquals("", StringUtils.trimToEmpty(StringUtilsTest.TRIMMABLE));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29602);assertEquals(StringUtilsTest.NON_TRIMMABLE, StringUtils.trimToEmpty(StringUtilsTest.NON_TRIMMABLE));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29603);assertEquals("", StringUtils.trimToEmpty(""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29604);assertEquals("", StringUtils.trimToEmpty(null));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testStrip_String() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fnarchmud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testStrip_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29605,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fnarchmud(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29605);
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29606);assertEquals(null, StringUtils.strip(null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29607);assertEquals("", StringUtils.strip(""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29608);assertEquals("", StringUtils.strip("        "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29609);assertEquals("abc", StringUtils.strip("  abc  "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29610);assertEquals(StringUtilsTest.NON_WHITESPACE, 
            StringUtils.strip(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}
    
    @Test
    public void testStripToNull_String() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kfzpe9muj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testStripToNull_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29611,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kfzpe9muj(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29611);
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29612);assertEquals(null, StringUtils.stripToNull(null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29613);assertEquals(null, StringUtils.stripToNull(""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29614);assertEquals(null, StringUtils.stripToNull("        "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29615);assertEquals(null, StringUtils.stripToNull(StringUtilsTest.WHITESPACE));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29616);assertEquals("ab c", StringUtils.stripToNull("  ab c  "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29617);assertEquals(StringUtilsTest.NON_WHITESPACE, 
            StringUtils.stripToNull(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}
    
    @Test
    public void testStripToEmpty_String() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ciz6obmuq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testStripToEmpty_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29618,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ciz6obmuq(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29618);
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29619);assertEquals("", StringUtils.stripToEmpty(null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29620);assertEquals("", StringUtils.stripToEmpty(""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29621);assertEquals("", StringUtils.stripToEmpty("        "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29622);assertEquals("", StringUtils.stripToEmpty(StringUtilsTest.WHITESPACE));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29623);assertEquals("ab c", StringUtils.stripToEmpty("  ab c  "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29624);assertEquals(StringUtilsTest.NON_WHITESPACE, 
            StringUtils.stripToEmpty(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}
    
    @Test
    public void testStrip_StringString() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22qw5mmmux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testStrip_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29625,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22qw5mmmux(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29625);
        // null strip
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29626);assertEquals(null, StringUtils.strip(null, null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29627);assertEquals("", StringUtils.strip("", null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29628);assertEquals("", StringUtils.strip("        ", null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29629);assertEquals("abc", StringUtils.strip("  abc  ", null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29630);assertEquals(StringUtilsTest.NON_WHITESPACE, 
            StringUtils.strip(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE, null));

        // "" strip
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29631);assertEquals(null, StringUtils.strip(null, ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29632);assertEquals("", StringUtils.strip("", ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29633);assertEquals("        ", StringUtils.strip("        ", ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29634);assertEquals("  abc  ", StringUtils.strip("  abc  ", ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29635);assertEquals(StringUtilsTest.WHITESPACE, StringUtils.strip(StringUtilsTest.WHITESPACE, ""));
        
        // " " strip
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29636);assertEquals(null, StringUtils.strip(null, " "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29637);assertEquals("", StringUtils.strip("", " "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29638);assertEquals("", StringUtils.strip("        ", " "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29639);assertEquals("abc", StringUtils.strip("  abc  ", " "));
        
        // "ab" strip
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29640);assertEquals(null, StringUtils.strip(null, "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29641);assertEquals("", StringUtils.strip("", "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29642);assertEquals("        ", StringUtils.strip("        ", "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29643);assertEquals("  abc  ", StringUtils.strip("  abc  ", "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29644);assertEquals("c", StringUtils.strip("abcabab", "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29645);assertEquals(StringUtilsTest.WHITESPACE, StringUtils.strip(StringUtilsTest.WHITESPACE, ""));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}
    
    @Test
    public void testStripStart_StringString() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ck5o3wmvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testStripStart_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29646,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ck5o3wmvi(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29646);
        // null stripStart
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29647);assertEquals(null, StringUtils.stripStart(null, null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29648);assertEquals("", StringUtils.stripStart("", null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29649);assertEquals("", StringUtils.stripStart("        ", null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29650);assertEquals("abc  ", StringUtils.stripStart("  abc  ", null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29651);assertEquals(StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE, 
            StringUtils.stripStart(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE, null));

        // "" stripStart
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29652);assertEquals(null, StringUtils.stripStart(null, ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29653);assertEquals("", StringUtils.stripStart("", ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29654);assertEquals("        ", StringUtils.stripStart("        ", ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29655);assertEquals("  abc  ", StringUtils.stripStart("  abc  ", ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29656);assertEquals(StringUtilsTest.WHITESPACE, StringUtils.stripStart(StringUtilsTest.WHITESPACE, ""));
        
        // " " stripStart
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29657);assertEquals(null, StringUtils.stripStart(null, " "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29658);assertEquals("", StringUtils.stripStart("", " "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29659);assertEquals("", StringUtils.stripStart("        ", " "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29660);assertEquals("abc  ", StringUtils.stripStart("  abc  ", " "));
        
        // "ab" stripStart
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29661);assertEquals(null, StringUtils.stripStart(null, "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29662);assertEquals("", StringUtils.stripStart("", "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29663);assertEquals("        ", StringUtils.stripStart("        ", "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29664);assertEquals("  abc  ", StringUtils.stripStart("  abc  ", "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29665);assertEquals("cabab", StringUtils.stripStart("abcabab", "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29666);assertEquals(StringUtilsTest.WHITESPACE, StringUtils.stripStart(StringUtilsTest.WHITESPACE, ""));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}
    
    @Test
    public void testStripEnd_StringString() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_273n0urmw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testStripEnd_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29667,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_273n0urmw3(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29667);
        // null stripEnd
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29668);assertEquals(null, StringUtils.stripEnd(null, null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29669);assertEquals("", StringUtils.stripEnd("", null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29670);assertEquals("", StringUtils.stripEnd("        ", null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29671);assertEquals("  abc", StringUtils.stripEnd("  abc  ", null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29672);assertEquals(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE, 
            StringUtils.stripEnd(StringUtilsTest.WHITESPACE + StringUtilsTest.NON_WHITESPACE + StringUtilsTest.WHITESPACE, null));

        // "" stripEnd
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29673);assertEquals(null, StringUtils.stripEnd(null, ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29674);assertEquals("", StringUtils.stripEnd("", ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29675);assertEquals("        ", StringUtils.stripEnd("        ", ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29676);assertEquals("  abc  ", StringUtils.stripEnd("  abc  ", ""));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29677);assertEquals(StringUtilsTest.WHITESPACE, StringUtils.stripEnd(StringUtilsTest.WHITESPACE, ""));
        
        // " " stripEnd
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29678);assertEquals(null, StringUtils.stripEnd(null, " "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29679);assertEquals("", StringUtils.stripEnd("", " "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29680);assertEquals("", StringUtils.stripEnd("        ", " "));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29681);assertEquals("  abc", StringUtils.stripEnd("  abc  ", " "));
        
        // "ab" stripEnd
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29682);assertEquals(null, StringUtils.stripEnd(null, "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29683);assertEquals("", StringUtils.stripEnd("", "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29684);assertEquals("        ", StringUtils.stripEnd("        ", "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29685);assertEquals("  abc  ", StringUtils.stripEnd("  abc  ", "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29686);assertEquals("abc", StringUtils.stripEnd("abcabab", "ab"));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29687);assertEquals(StringUtilsTest.WHITESPACE, StringUtils.stripEnd(StringUtilsTest.WHITESPACE, ""));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}

    @Test
    public void testStripAll() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vcgc8ymwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testStripAll",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29688,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vcgc8ymwo(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29688);
        // test stripAll method, merely an array version of the above strip
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29689);final String[] empty = new String[0];
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29690);final String[] fooSpace = new String[] { "  "+FOO+"  ", "  "+FOO, FOO+"  " };
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29691);final String[] fooDots = new String[] { ".."+FOO+"..", ".."+FOO, FOO+".." };
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29692);final String[] foo = new String[] { FOO, FOO, FOO };

        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29693);assertNull(StringUtils.stripAll((String[]) null));
        // Additional varargs tests
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29694);assertArrayEquals(empty, StringUtils.stripAll()); // empty array
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29695);assertArrayEquals(new String[]{null}, StringUtils.stripAll((String) null)); // == new String[]{null}

        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29696);assertArrayEquals(empty, StringUtils.stripAll(empty));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29697);assertArrayEquals(foo, StringUtils.stripAll(fooSpace));
        
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29698);assertNull(StringUtils.stripAll(null, null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29699);assertArrayEquals(foo, StringUtils.stripAll(fooSpace, null));
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29700);assertArrayEquals(foo, StringUtils.stripAll(fooDots, "."));
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}

    @Test
    public void testStripAccents() {__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceStart(getClass().getName(),29701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_244nwaymx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2msvmsvl3lqxu4v.R.rethrow($CLV_t2$);}finally{__CLR4_1_2msvmsvl3lqxu4v.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.StringUtilsTrimEmptyTest.testStripAccents",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),29701,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_244nwaymx1(){try{__CLR4_1_2msvmsvl3lqxu4v.R.inc(29701);
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29702);final String cue = "\u00c7\u00fa\u00ea";
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29703);assertEquals( "Failed to strip accents from " + cue, "Cue", StringUtils.stripAccents(cue));

        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29704);final String lots = "\u00c0\u00c1\u00c2\u00c3\u00c4\u00c5\u00c7\u00c8\u00c9" + 
                      "\u00ca\u00cb\u00cc\u00cd\u00ce\u00cf\u00d1\u00d2\u00d3" + 
                      "\u00d4\u00d5\u00d6\u00d9\u00da\u00db\u00dc\u00dd";
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29705);assertEquals( "Failed to strip accents from " + lots, 
                      "AAAAAACEEEEIIIINOOOOOUUUUY", 
                      StringUtils.stripAccents(lots));

        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29706);assertNull( "Failed null safety", StringUtils.stripAccents(null) );
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29707);assertEquals( "Failed empty String", "", StringUtils.stripAccents("") );
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29708);assertEquals( "Failed to handle non-accented text", "control", StringUtils.stripAccents("control") );
        __CLR4_1_2msvmsvl3lqxu4v.R.inc(29709);assertEquals( "Failed to handle easy example", "eclair", StringUtils.stripAccents("\u00e9clair") );
    }finally{__CLR4_1_2msvmsvl3lqxu4v.R.flushNeeded();}}
}
