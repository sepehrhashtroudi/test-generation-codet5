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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.math.NumberUtils}.
 *
 * @version $Id$
 */
public class NumberUtilsTest {static class __CLR4_1_2rtxrtxl3lqxura{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,36861,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hrtx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36069,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hrtx(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36069);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36070);assertNotNull(new NumberUtils());
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36071);final Constructor<?>[] cons = NumberUtils.class.getDeclaredConstructors();
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36072);assertEquals(1, cons.length);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36073);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36074);assertTrue(Modifier.isPublic(NumberUtils.class.getModifiers()));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36075);assertFalse(Modifier.isFinal(NumberUtils.class.getModifiers()));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    //---------------------------------------------------------------------

    /**
     * Test for {@link NumberUtils#toInt(String)}.
     */
    @Test
    public void testToIntString() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qi7p96ru4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToIntString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36076,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qi7p96ru4(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36076);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36077);assertTrue("toInt(String) 1 failed", NumberUtils.toInt("12345") == 12345);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36078);assertTrue("toInt(String) 2 failed", NumberUtils.toInt("abc") == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36079);assertTrue("toInt(empty) failed", NumberUtils.toInt("") == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36080);assertTrue("toInt(null) failed", NumberUtils.toInt(null) == 0);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toInt(String, int)}.
     */
    @Test
    public void testToIntStringI() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ftli0tru9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToIntStringI",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36081,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ftli0tru9(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36081);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36082);assertTrue("toInt(String,int) 1 failed", NumberUtils.toInt("12345", 5) == 12345);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36083);assertTrue("toInt(String,int) 2 failed", NumberUtils.toInt("1234.5", 5) == 5);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toLong(String)}.
     */
    @Test
    public void testToLongString() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2e1ekoxruc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToLongString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36084,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2e1ekoxruc(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36084);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36085);assertTrue("toLong(String) 1 failed", NumberUtils.toLong("12345") == 12345l);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36086);assertTrue("toLong(String) 2 failed", NumberUtils.toLong("abc") == 0l);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36087);assertTrue("toLong(String) 3 failed", NumberUtils.toLong("1L") == 0l);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36088);assertTrue("toLong(String) 4 failed", NumberUtils.toLong("1l") == 0l);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36089);assertTrue("toLong(Long.MAX_VALUE) failed", NumberUtils.toLong(Long.MAX_VALUE+"") == Long.MAX_VALUE);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36090);assertTrue("toLong(Long.MIN_VALUE) failed", NumberUtils.toLong(Long.MIN_VALUE+"") == Long.MIN_VALUE);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36091);assertTrue("toLong(empty) failed", NumberUtils.toLong("") == 0l);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36092);assertTrue("toLong(null) failed", NumberUtils.toLong(null) == 0l);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toLong(String, long)}.
     */
    @Test
    public void testToLongStringL() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25qx95zrul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToLongStringL",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36093,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25qx95zrul(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36093);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36094);assertTrue("toLong(String,long) 1 failed", NumberUtils.toLong("12345", 5l) == 12345l);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36095);assertTrue("toLong(String,long) 2 failed", NumberUtils.toLong("1234.5", 5l) == 5l);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toFloat(String)}.
     */
    @Test
    public void testToFloatString() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vvq8m1ruo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToFloatString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36096,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vvq8m1ruo(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36096);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36097);assertTrue("toFloat(String) 1 failed", NumberUtils.toFloat("-1.2345") == -1.2345f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36098);assertTrue("toFloat(String) 2 failed", NumberUtils.toFloat("1.2345") == 1.2345f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36099);assertTrue("toFloat(String) 3 failed", NumberUtils.toFloat("abc") == 0.0f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36100);assertTrue("toFloat(Float.MAX_VALUE) failed", NumberUtils.toFloat(Float.MAX_VALUE+"") ==  Float.MAX_VALUE);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36101);assertTrue("toFloat(Float.MIN_VALUE) failed", NumberUtils.toFloat(Float.MIN_VALUE+"") == Float.MIN_VALUE);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36102);assertTrue("toFloat(empty) failed", NumberUtils.toFloat("") == 0.0f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36103);assertTrue("toFloat(null) failed", NumberUtils.toFloat(null) == 0.0f);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toFloat(String, float)}.
     */
    @Test
    public void testToFloatStringF() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s5t6tvruw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToFloatStringF",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36104,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s5t6tvruw(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36104);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36105);assertTrue("toFloat(String,int) 1 failed", NumberUtils.toFloat("1.2345", 5.1f) == 1.2345f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36106);assertTrue("toFloat(String,int) 2 failed", NumberUtils.toFloat("a", 5.0f) == 5.0f);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}
    
    /**
     * Test for {(@link NumberUtils#createNumber(String)}
     */
//    @Test
//    public void testStringCreateNumberEnsureNoPrecisionLoss(){
//        String shouldBeFloat = "1.23";
//        String shouldBeDouble = "3.40282354e+38";
//        String shouldBeBigDecimal = "1.797693134862315759e+308";
//
//        assertTrue(NumberUtils.createNumber(shouldBeFloat) instanceof Float);
//        assertTrue(NumberUtils.createNumber(shouldBeDouble) instanceof Double);
//        assertTrue(NumberUtils.createNumber(shouldBeBigDecimal) instanceof BigDecimal);
//    }
    /**
     * Test for {@link NumberUtils#toDouble(String)}.
     */
    @Test
    public void testStringToDoubleString() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_263i249ruz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testStringToDoubleString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36107,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_263i249ruz(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36107);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36108);assertTrue("toDouble(String) 1 failed", NumberUtils.toDouble("-1.2345") == -1.2345d);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36109);assertTrue("toDouble(String) 2 failed", NumberUtils.toDouble("1.2345") == 1.2345d);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36110);assertTrue("toDouble(String) 3 failed", NumberUtils.toDouble("abc") == 0.0d);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36111);assertTrue("toDouble(Double.MAX_VALUE) failed", NumberUtils.toDouble(Double.MAX_VALUE+"") == Double.MAX_VALUE);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36112);assertTrue("toDouble(Double.MIN_VALUE) failed", NumberUtils.toDouble(Double.MIN_VALUE+"") == Double.MIN_VALUE);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36113);assertTrue("toDouble(empty) failed", NumberUtils.toDouble("") == 0.0d);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36114);assertTrue("toDouble(null) failed", NumberUtils.toDouble(null) == 0.0d);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toDouble(String, double)}.
     */
    @Test
    public void testStringToDoubleStringD() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gp04txrv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testStringToDoubleStringD",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36115,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gp04txrv7(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36115);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36116);assertTrue("toDouble(String,int) 1 failed", NumberUtils.toDouble("1.2345", 5.1d) == 1.2345d);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36117);assertTrue("toDouble(String,int) 2 failed", NumberUtils.toDouble("a", 5.0d) == 5.0d);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

     /**
     * Test for {@link NumberUtils#toByte(String)}.
     */
    @Test
    public void testToByteString() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2u5whfxrva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToByteString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36118,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2u5whfxrva(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36118);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36119);assertTrue("toByte(String) 1 failed", NumberUtils.toByte("123") == 123);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36120);assertTrue("toByte(String) 2 failed", NumberUtils.toByte("abc") == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36121);assertTrue("toByte(empty) failed", NumberUtils.toByte("") == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36122);assertTrue("toByte(null) failed", NumberUtils.toByte(null) == 0);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toByte(String, byte)}.
     */
    @Test
    public void testToByteStringI() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cuac46rvf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToByteStringI",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36123,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cuac46rvf(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36123);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36124);assertTrue("toByte(String,byte) 1 failed", NumberUtils.toByte("123", (byte) 5) == 123);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36125);assertTrue("toByte(String,byte) 2 failed", NumberUtils.toByte("12.3", (byte) 5) == 5);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toShort(String)}.
     */
    @Test
    public void testToShortString() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p6d4oprvi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToShortString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36126,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p6d4oprvi(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36126);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36127);assertTrue("toShort(String) 1 failed", NumberUtils.toShort("12345") == 12345);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36128);assertTrue("toShort(String) 2 failed", NumberUtils.toShort("abc") == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36129);assertTrue("toShort(empty) failed", NumberUtils.toShort("") == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36130);assertTrue("toShort(null) failed", NumberUtils.toShort(null) == 0);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    /**
     * Test for {@link NumberUtils#toShort(String, short)}.
     */
    @Test
    public void testToShortStringI() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nnv2ogrvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testToShortStringI",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36131,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nnv2ogrvn(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36131);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36132);assertTrue("toShort(String,short) 1 failed", NumberUtils.toShort("12345", (short) 5) == 12345);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36133);assertTrue("toShort(String,short) 2 failed", NumberUtils.toShort("1234.5", (short) 5) == 5);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testCreateNumber() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nvsfparvq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumber",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36134,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nvsfparvq(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36134);
        // a lot of things can go wrong
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36135);assertEquals("createNumber(String) 1 failed", Float.valueOf("1234.5"), NumberUtils.createNumber("1234.5"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36136);assertEquals("createNumber(String) 2 failed", Integer.valueOf("12345"), NumberUtils.createNumber("12345"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36137);assertEquals("createNumber(String) 3 failed", Double.valueOf("1234.5"), NumberUtils.createNumber("1234.5D"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36138);assertEquals("createNumber(String) 3 failed", Double.valueOf("1234.5"), NumberUtils.createNumber("1234.5d"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36139);assertEquals("createNumber(String) 4 failed", Float.valueOf("1234.5"), NumberUtils.createNumber("1234.5F"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36140);assertEquals("createNumber(String) 4 failed", Float.valueOf("1234.5"), NumberUtils.createNumber("1234.5f"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36141);assertEquals("createNumber(String) 5 failed", Long.valueOf(Integer.MAX_VALUE + 1L), NumberUtils.createNumber(""
            + (Integer.MAX_VALUE + 1L)));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36142);assertEquals("createNumber(String) 6 failed", Long.valueOf(12345), NumberUtils.createNumber("12345L"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36143);assertEquals("createNumber(String) 6 failed", Long.valueOf(12345), NumberUtils.createNumber("12345l"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36144);assertEquals("createNumber(String) 7 failed", Float.valueOf("-1234.5"), NumberUtils.createNumber("-1234.5"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36145);assertEquals("createNumber(String) 8 failed", Integer.valueOf("-12345"), NumberUtils.createNumber("-12345"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36146);assertTrue("createNumber(String) 9a failed", 0xFADE == NumberUtils.createNumber("0xFADE").intValue());
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36147);assertTrue("createNumber(String) 9b failed", 0xFADE == NumberUtils.createNumber("0Xfade").intValue());
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36148);assertTrue("createNumber(String) 10a failed", -0xFADE == NumberUtils.createNumber("-0xFADE").intValue());
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36149);assertTrue("createNumber(String) 10b failed", -0xFADE == NumberUtils.createNumber("-0Xfade").intValue());
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36150);assertEquals("createNumber(String) 11 failed", Double.valueOf("1.1E200"), NumberUtils.createNumber("1.1E200"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36151);assertEquals("createNumber(String) 12 failed", Float.valueOf("1.1E20"), NumberUtils.createNumber("1.1E20"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36152);assertEquals("createNumber(String) 13 failed", Double.valueOf("-1.1E200"), NumberUtils.createNumber("-1.1E200"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36153);assertEquals("createNumber(String) 14 failed", Double.valueOf("1.1E-200"), NumberUtils.createNumber("1.1E-200"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36154);assertEquals("createNumber(null) failed", null, NumberUtils.createNumber(null));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36155);assertEquals("createNumber(String) failed", new BigInteger("12345678901234567890"), NumberUtils
                .createNumber("12345678901234567890L"));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36156);assertEquals("createNumber(String) 15 failed", new BigDecimal("1.1E-700"), NumberUtils
                    .createNumber("1.1E-700F"));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36157);assertEquals("createNumber(String) 16 failed", Long.valueOf("10" + Integer.MAX_VALUE), NumberUtils
                .createNumber("10" + Integer.MAX_VALUE + "L"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36158);assertEquals("createNumber(String) 17 failed", Long.valueOf("10" + Integer.MAX_VALUE), NumberUtils
                .createNumber("10" + Integer.MAX_VALUE));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36159);assertEquals("createNumber(String) 18 failed", new BigInteger("10" + Long.MAX_VALUE), NumberUtils
                .createNumber("10" + Long.MAX_VALUE));

        // LANG-521
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36160);assertEquals("createNumber(String) LANG-521 failed", Float.valueOf("2."), NumberUtils.createNumber("2."));

        // LANG-638
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36161);assertFalse("createNumber(String) succeeded", checkCreateNumber("1eE"));

        // LANG-693
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36162);assertEquals("createNumber(String) LANG-693 failed", Double.valueOf(Double.MAX_VALUE), NumberUtils
                    .createNumber("" + Double.MAX_VALUE));

        // LANG-822
        // ensure that the underlying negative number would create a BigDecimal
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36163);final Number bigNum = NumberUtils.createNumber("-1.1E-700F");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36164);assertNotNull(bigNum);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36165);assertEquals(BigDecimal.class, bigNum.getClass());
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when preceeded by -- rather than -
    public void testCreateNumberFailure_1() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26hd52srwm();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,78,117,109,98,101,114,70,97,105,108,117,114,101,95,49,58,32,91,78,117,109,98,101,114,70,111,114,109,97,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberFormatException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberFailure_1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36166,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26hd52srwm(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36166);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36167);NumberUtils.createNumber("--1.1E-700F");
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when both e and E are present (with decimal)
    public void testCreateNumberFailure_2() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_238d6abrwo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,78,117,109,98,101,114,70,97,105,108,117,114,101,95,50,58,32,91,78,117,109,98,101,114,70,111,114,109,97,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberFormatException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberFailure_2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36168,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_238d6abrwo(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36168);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36169);NumberUtils.createNumber("-1.1E+0-7e00");
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when both e and E are present (no decimal)
    public void testCreateNumberFailure_3() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2msi6rwq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,78,117,109,98,101,114,70,97,105,108,117,114,101,95,51,58,32,91,78,117,109,98,101,114,70,111,114,109,97,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberFormatException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberFailure_3",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36170,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2msi6rwq(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36170);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36171);NumberUtils.createNumber("-11E+0-7e00");
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected=NumberFormatException.class)
    // Check that the code fails to create a valid number when both e and E are present (no decimal)
    public void testCreateNumberFailure_4() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_239mranrws();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,78,117,109,98,101,114,70,97,105,108,117,114,101,95,52,58,32,91,78,117,109,98,101,114,70,111,114,109,97,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NumberFormatException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberFailure_4",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36172,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_239mranrws(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36172);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36173);NumberUtils.createNumber("1eE+00001");
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    // Tests to show when magnitude causes switch to next Number type
    // Will probably need to be adjusted if code is changed to check precision (LANG-693)
    @Test
    public void testCreateNumberMagnitude() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lwp2hsrwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateNumberMagnitude",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36174,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lwp2hsrwu(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36174);
        // Test Float.MAX_VALUE, and same with +1 in final digit to check conversion changes to next Number type
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36175);assertEquals(Float.valueOf(Float.MAX_VALUE),  NumberUtils.createNumber("3.4028235e+38"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36176);assertEquals(Double.valueOf(3.4028236e+38),   NumberUtils.createNumber("3.4028236e+38"));

        // Test Double.MAX_VALUE
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36177);assertEquals(Double.valueOf(Double.MAX_VALUE),          NumberUtils.createNumber("1.7976931348623157e+308"));
        // Test with +2 in final digit (+1 does not cause roll-over to BigDecimal)
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36178);assertEquals(new BigDecimal("1.7976931348623159e+308"), NumberUtils.createNumber("1.7976931348623159e+308"));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36179);assertEquals(Integer.valueOf(0x12345678), NumberUtils.createNumber("0x12345678"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36180);assertEquals(Long.valueOf(0x123456789L),  NumberUtils.createNumber("0x123456789"));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36181);assertEquals(Long.valueOf(0x7fffffffffffffffL),      NumberUtils.createNumber("0x7fffffffffffffff"));
        // Does not appear to be a way to create a literal BigInteger of this magnitude
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36182);assertEquals(new BigInteger("7fffffffffffffff0",16), NumberUtils.createNumber("0x7fffffffffffffff0"));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36183);assertEquals(Long.valueOf(0x7fffffffffffffffL),      NumberUtils.createNumber("#7fffffffffffffff"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36184);assertEquals(new BigInteger("7fffffffffffffff0",16), NumberUtils.createNumber("#7fffffffffffffff0"));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36185);assertEquals(Integer.valueOf(017777777777), NumberUtils.createNumber("017777777777")); // 31 bits
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36186);assertEquals(Long.valueOf(037777777777L),   NumberUtils.createNumber("037777777777")); // 32 bits

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36187);assertEquals(Long.valueOf(0777777777777777777777L),      NumberUtils.createNumber("0777777777777777777777")); // 63 bits
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36188);assertEquals(new BigInteger("1777777777777777777777",8), NumberUtils.createNumber("01777777777777777777777"));// 64 bits
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testCreateFloat() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g1ot63rx9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36189,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g1ot63rx9(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36189);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36190);assertEquals("createFloat(String) failed", Float.valueOf("1234.5"), NumberUtils.createFloat("1234.5"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36191);assertEquals("createFloat(null) failed", null, NumberUtils.createFloat(null));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36192);this.testCreateFloatFailure("");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36193);this.testCreateFloatFailure(" ");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36194);this.testCreateFloatFailure("\b\t\n\f\r");
        // Funky whitespaces
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36195);this.testCreateFloatFailure("\u00a0\ufeff");
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    protected void testCreateFloatFailure(final String str) {try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36196);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36197);try {
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36198);final Float value = NumberUtils.createFloat(str);
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36199);fail("createFloat(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testCreateDouble() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21g7g1yrxk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36200,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21g7g1yrxk(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36200);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36201);assertEquals("createDouble(String) failed", Double.valueOf("1234.5"), NumberUtils.createDouble("1234.5"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36202);assertEquals("createDouble(null) failed", null, NumberUtils.createDouble(null));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36203);this.testCreateDoubleFailure("");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36204);this.testCreateDoubleFailure(" ");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36205);this.testCreateDoubleFailure("\b\t\n\f\r");
        // Funky whitespaces
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36206);this.testCreateDoubleFailure("\u00a0\ufeff");
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    protected void testCreateDoubleFailure(final String str) {try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36207);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36208);try {
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36209);final Double value = NumberUtils.createDouble(str);
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36210);fail("createDouble(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testCreateInteger() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2olwtbrrxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateInteger",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36211,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2olwtbrrxv(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36211);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36212);assertEquals("createInteger(String) failed", Integer.valueOf("12345"), NumberUtils.createInteger("12345"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36213);assertEquals("createInteger(null) failed", null, NumberUtils.createInteger(null));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36214);this.testCreateIntegerFailure("");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36215);this.testCreateIntegerFailure(" ");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36216);this.testCreateIntegerFailure("\b\t\n\f\r");
        // Funky whitespaces
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36217);this.testCreateIntegerFailure("\u00a0\ufeff");
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    protected void testCreateIntegerFailure(final String str) {try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36218);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36219);try {
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36220);final Integer value = NumberUtils.createInteger(str);
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36221);fail("createInteger(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testCreateLong() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wplinry6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36222,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wplinry6(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36222);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36223);assertEquals("createLong(String) failed", Long.valueOf("12345"), NumberUtils.createLong("12345"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36224);assertEquals("createLong(null) failed", null, NumberUtils.createLong(null));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36225);this.testCreateLongFailure("");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36226);this.testCreateLongFailure(" ");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36227);this.testCreateLongFailure("\b\t\n\f\r");
        // Funky whitespaces
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36228);this.testCreateLongFailure("\u00a0\ufeff");
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    protected void testCreateLongFailure(final String str) {try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36229);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36230);try {
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36231);final Long value = NumberUtils.createLong(str);
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36232);fail("createLong(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testCreateBigInteger() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rahrnxryh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateBigInteger",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36233,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rahrnxryh(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36233);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36234);assertEquals("createBigInteger(String) failed", new BigInteger("12345"), NumberUtils.createBigInteger("12345"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36235);assertEquals("createBigInteger(null) failed", null, NumberUtils.createBigInteger(null));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36236);this.testCreateBigIntegerFailure("");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36237);this.testCreateBigIntegerFailure(" ");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36238);this.testCreateBigIntegerFailure("\b\t\n\f\r");
        // Funky whitespaces
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36239);this.testCreateBigIntegerFailure("\u00a0\ufeff");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36240);assertEquals("createBigInteger(String) failed", new BigInteger("255"), NumberUtils.createBigInteger("0xff"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36241);assertEquals("createBigInteger(String) failed", new BigInteger("255"), NumberUtils.createBigInteger("#ff"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36242);assertEquals("createBigInteger(String) failed", new BigInteger("-255"), NumberUtils.createBigInteger("-0xff"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36243);assertEquals("createBigInteger(String) failed", new BigInteger("255"), NumberUtils.createBigInteger("0377"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36244);assertEquals("createBigInteger(String) failed", new BigInteger("-255"), NumberUtils.createBigInteger("-0377"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36245);assertEquals("createBigInteger(String) failed", new BigInteger("-255"), NumberUtils.createBigInteger("-0377"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36246);assertEquals("createBigInteger(String) failed", new BigInteger("-0"), NumberUtils.createBigInteger("-0"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36247);assertEquals("createBigInteger(String) failed", new BigInteger("0"), NumberUtils.createBigInteger("0"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36248);testCreateBigIntegerFailure("#");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36249);testCreateBigIntegerFailure("-#");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36250);testCreateBigIntegerFailure("0x");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36251);testCreateBigIntegerFailure("-0x");
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    protected void testCreateBigIntegerFailure(final String str) {try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36252);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36253);try {
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36254);final BigInteger value = NumberUtils.createBigInteger(str);
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36255);fail("createBigInteger(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testCreateBigDecimal() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n17hbarz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCreateBigDecimal",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36256,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n17hbarz4(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36256);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36257);assertEquals("createBigDecimal(String) failed", new BigDecimal("1234.5"), NumberUtils.createBigDecimal("1234.5"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36258);assertEquals("createBigDecimal(null) failed", null, NumberUtils.createBigDecimal(null));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36259);this.testCreateBigDecimalFailure("");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36260);this.testCreateBigDecimalFailure(" ");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36261);this.testCreateBigDecimalFailure("\b\t\n\f\r");
        // Funky whitespaces
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36262);this.testCreateBigDecimalFailure("\u00a0\ufeff");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36263);this.testCreateBigDecimalFailure("-"); // sign alone not valid
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36264);this.testCreateBigDecimalFailure("--"); // comment in NumberUtils suggests some implementations may incorrectly allow this
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36265);this.testCreateBigDecimalFailure("--0");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36266);this.testCreateBigDecimalFailure("+"); // sign alone not valid
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36267);this.testCreateBigDecimalFailure("++"); // in case this was also allowed by some JVMs
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36268);this.testCreateBigDecimalFailure("++0");
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    protected void testCreateBigDecimalFailure(final String str) {try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36269);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36270);try {
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36271);final BigDecimal value = NumberUtils.createBigDecimal(str);
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36272);fail("createBigDecimal(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    // min/max tests
    // ----------------------------------------------------------------------
    @Test(expected = IllegalArgumentException.class)
    public void testMinLong_nullArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ci3h1mrzl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,76,111,110,103,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinLong_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36273,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ci3h1mrzl(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36273);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36274);NumberUtils.min((long[]) null);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinLong_emptyArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2y8pl7arzn();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,76,111,110,103,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinLong_emptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36275,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2y8pl7arzn(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36275);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36276);NumberUtils.min(new long[0]);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMinLong() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25599kzrzp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36277,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25599kzrzp(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36277);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36278);assertEquals(
            "min(long[]) failed for array length 1",
            5,
            NumberUtils.min(new long[] { 5 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36279);assertEquals(
            "min(long[]) failed for array length 2",
            6,
            NumberUtils.min(new long[] { 6, 9 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36280);assertEquals(-10, NumberUtils.min(new long[] { -10, -5, 0, 5, 10 }));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36281);assertEquals(-10, NumberUtils.min(new long[] { -5, 0, -10, 5, 10 }));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinInt_nullArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vrqdvbrzu();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,73,110,116,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinInt_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36282,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vrqdvbrzu(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36282);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36283);NumberUtils.min((int[]) null);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinInt_emptyArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_256vrfnrzw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,73,110,116,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinInt_emptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36284,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_256vrfnrzw(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36284);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36285);NumberUtils.min(new int[0]);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMinInt() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21f3pkarzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36286,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21f3pkarzy(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36286);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36287);assertEquals(
            "min(int[]) failed for array length 1",
            5,
            NumberUtils.min(new int[] { 5 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36288);assertEquals(
            "min(int[]) failed for array length 2",
            6,
            NumberUtils.min(new int[] { 6, 9 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36289);assertEquals(-10, NumberUtils.min(new int[] { -10, -5, 0, 5, 10 }));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36290);assertEquals(-10, NumberUtils.min(new int[] { -5, 0, -10, 5, 10 }));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinShort_nullArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2phd9fus03();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,83,104,111,114,116,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinShort_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36291,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2phd9fus03(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36291);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36292);NumberUtils.min((short[]) null);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinShort_emptyArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cz5l62s05();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,83,104,111,114,116,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinShort_emptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36293,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cz5l62s05(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36293);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36294);NumberUtils.min(new short[0]);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMinShort() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2f73ghps07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36295,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2f73ghps07(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36295);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36296);assertEquals(
            "min(short[]) failed for array length 1",
            5,
            NumberUtils.min(new short[] { 5 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36297);assertEquals(
            "min(short[]) failed for array length 2",
            6,
            NumberUtils.min(new short[] { 6, 9 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36298);assertEquals(-10, NumberUtils.min(new short[] { -10, -5, 0, 5, 10 }));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36299);assertEquals(-10, NumberUtils.min(new short[] { -5, 0, -10, 5, 10 }));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinByte_nullArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21amdq6s0c();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,66,121,116,101,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinByte_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36300,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21amdq6s0c(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36300);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36301);NumberUtils.min((byte[]) null);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinByte_emptyArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qiv66is0e();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,66,121,116,101,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinByte_emptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36302,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qiv66is0e(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36302);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36303);NumberUtils.min(new byte[0]);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMinByte() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yz6pf5s0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36304,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yz6pf5s0g(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36304);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36305);assertEquals(
            "min(byte[]) failed for array length 1",
            5,
            NumberUtils.min(new byte[] { 5 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36306);assertEquals(
            "min(byte[]) failed for array length 2",
            6,
            NumberUtils.min(new byte[] { 6, 9 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36307);assertEquals(-10, NumberUtils.min(new byte[] { -10, -5, 0, 5, 10 }));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36308);assertEquals(-10, NumberUtils.min(new byte[] { -5, 0, -10, 5, 10 }));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinDouble_nullArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s0xv8rs0l();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,68,111,117,98,108,101,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinDouble_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36309,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s0xv8rs0l(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36309);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36310);NumberUtils.min((double[]) null);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinDouble_emptyArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2c2u6khs0n();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,68,111,117,98,108,101,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinDouble_emptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36311,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2c2u6khs0n(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36311);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36312);NumberUtils.min(new double[0]);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMinDouble() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24jcuiws0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36313,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24jcuiws0p(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36313);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36314);assertEquals(
            "min(double[]) failed for array length 1",
            5.12,
            NumberUtils.min(new double[] { 5.12 }),
            0);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36315);assertEquals(
            "min(double[]) failed for array length 2",
            6.23,
            NumberUtils.min(new double[] { 6.23, 9.34 }),
            0);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36316);assertEquals(
            "min(double[]) failed for array length 5",
            -10.45,
            NumberUtils.min(new double[] { -10.45, -5.56, 0, 5.67, 10.78 }),
            0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36317);assertEquals(-10, NumberUtils.min(new double[] { -10, -5, 0, 5, 10 }), 0.0001);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36318);assertEquals(-10, NumberUtils.min(new double[] { -5, 0, -10, 5, 10 }), 0.0001);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloat_nullArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_287vl5is0v();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,70,108,111,97,116,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinFloat_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36319,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_287vl5is0v(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36319);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36320);NumberUtils.min((float[]) null);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMinFloat_emptyArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xp82fes0x();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,105,110,70,108,111,97,116,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinFloat_emptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36321,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xp82fes0x(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36321);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36322);NumberUtils.min(new float[0]);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMinFloat() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tl3uzns0z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36323,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tl3uzns0z(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36323);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36324);assertEquals(
            "min(float[]) failed for array length 1",
            5.9f,
            NumberUtils.min(new float[] { 5.9f }),
            0);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36325);assertEquals(
            "min(float[]) failed for array length 2",
            6.8f,
            NumberUtils.min(new float[] { 6.8f, 9.7f }),
            0);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36326);assertEquals(
            "min(float[]) failed for array length 5",
            -10.6f,
            NumberUtils.min(new float[] { -10.6f, -5.5f, 0, 5.4f, 10.3f }),
            0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36327);assertEquals(-10, NumberUtils.min(new float[] { -10, -5, 0, 5, 10 }), 0.0001f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36328);assertEquals(-10, NumberUtils.min(new float[] { -5, 0, -10, 5, 10 }), 0.0001f);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLong_nullArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27vk6dks15();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,76,111,110,103,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxLong_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36329,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27vk6dks15(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36329);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36330);NumberUtils.max((long[]) null);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxLong_emptyArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qq29hgs17();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,76,111,110,103,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxLong_emptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36331,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qq29hgs17(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36331);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36332);NumberUtils.max(new long[0]);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMaxLong() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2438cd1s19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36333,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2438cd1s19(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36333);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36334);assertEquals(
            "max(long[]) failed for array length 1",
            5,
            NumberUtils.max(new long[] { 5 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36335);assertEquals(
            "max(long[]) failed for array length 2",
            9,
            NumberUtils.max(new long[] { 6, 9 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36336);assertEquals(
            "max(long[]) failed for array length 5",
            10,
            NumberUtils.max(new long[] { -10, -5, 0, 5, 10 }));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36337);assertEquals(10, NumberUtils.max(new long[] { -10, -5, 0, 5, 10 }));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36338);assertEquals(10, NumberUtils.max(new long[] { -5, 0, 10, 5, -10 }));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxInt_nullArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xejy2xs1f();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,73,110,116,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxInt_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36339,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xejy2xs1f(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36339);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36340);NumberUtils.max((int[]) null);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxInt_emptyArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pkjeuts1h();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,73,110,116,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxInt_emptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36341,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pkjeuts1h(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36341);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36342);NumberUtils.max(new int[0]);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMaxInt() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2js89q4s1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36343,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2js89q4s1j(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36343);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36344);assertEquals(
            "max(int[]) failed for array length 1",
            5,
            NumberUtils.max(new int[] { 5 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36345);assertEquals(
            "max(int[]) failed for array length 2",
            9,
            NumberUtils.max(new int[] { 6, 9 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36346);assertEquals(
            "max(int[]) failed for array length 5",
            10,
            NumberUtils.max(new int[] { -10, -5, 0, 5, 10 }));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36347);assertEquals(10, NumberUtils.max(new int[] { -10, -5, 0, 5, 10 }));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36348);assertEquals(10, NumberUtils.max(new int[] { -5, 0, 10, 5, -10 }));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShort_nullArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x00l5os1p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,83,104,111,114,116,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxShort_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36349,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x00l5os1p(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36349);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36350);NumberUtils.max((short[]) null);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxShort_emptyArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wxwihks1r();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,83,104,111,114,116,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxShort_emptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36351,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wxwihks1r(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36351);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36352);NumberUtils.max(new short[0]);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMaxShort() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n37zn5s1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36353,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n37zn5s1t(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36353);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36354);assertEquals(
            "max(short[]) failed for array length 1",
            5,
            NumberUtils.max(new short[] { 5 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36355);assertEquals(
            "max(short[]) failed for array length 2",
            9,
            NumberUtils.max(new short[] { 6, 9 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36356);assertEquals(
            "max(short[]) failed for array length 5",
            10,
            NumberUtils.max(new short[] { -10, -5, 0, 5, 10 }));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36357);assertEquals(10, NumberUtils.max(new short[] { -10, -5, 0, 5, 10 }));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36358);assertEquals(10, NumberUtils.max(new short[] { -5, 0, 10, 5, -10 }));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByte_nullArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j319p0s1z();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,66,121,116,101,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxByte_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36359,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j319p0s1z(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36359);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36360);NumberUtils.max((byte[]) null);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxByte_emptyArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j07ugos21();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,66,121,116,101,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxByte_emptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36361,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j07ugos21(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36361);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36362);NumberUtils.max(new byte[0]);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMaxByte() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yzwfc1s23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36363,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yzwfc1s23(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36363);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36364);assertEquals(
            "max(byte[]) failed for array length 1",
            5,
            NumberUtils.max(new byte[] { 5 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36365);assertEquals(
            "max(byte[]) failed for array length 2",
            9,
            NumberUtils.max(new byte[] { 6, 9 }));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36366);assertEquals(
            "max(byte[]) failed for array length 5",
            10,
            NumberUtils.max(new byte[] { -10, -5, 0, 5, 10 }));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36367);assertEquals(10, NumberUtils.max(new byte[] { -10, -5, 0, 5, 10 }));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36368);assertEquals(10, NumberUtils.max(new byte[] { -5, 0, 10, 5, -10 }));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDouble_nullArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2826xx9s29();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,68,111,117,98,108,101,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxDouble_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36369,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2826xx9s29(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36369);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36370);NumberUtils.max((double[]) null);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxDouble_emptyArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wfnzfzs2b();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,68,111,117,98,108,101,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxDouble_emptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36371,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wfnzfzs2b(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36371);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36372);NumberUtils.max(new double[0]);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMaxDouble() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p6evxys2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36373,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p6evxys2d(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36373);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36374);final double[] d = null;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36375);try {
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36376);NumberUtils.max(d);
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36377);fail("No exception was thrown for null input.");
        } catch (final IllegalArgumentException ex) {}

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36378);try {
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36379);NumberUtils.max(new double[0]);
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36380);fail("No exception was thrown for empty input.");
        } catch (final IllegalArgumentException ex) {}

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36381);assertEquals(
            "max(double[]) failed for array length 1",
            5.1f,
            NumberUtils.max(new double[] { 5.1f }),
            0);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36382);assertEquals(
            "max(double[]) failed for array length 2",
            9.2f,
            NumberUtils.max(new double[] { 6.3f, 9.2f }),
            0);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36383);assertEquals(
            "max(double[]) failed for float length 5",
            10.4f,
            NumberUtils.max(new double[] { -10.5f, -5.6f, 0, 5.7f, 10.4f }),
            0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36384);assertEquals(10, NumberUtils.max(new double[] { -10, -5, 0, 5, 10 }), 0.0001);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36385);assertEquals(10, NumberUtils.max(new double[] { -5, 0, 10, 5, -10 }), 0.0001);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloat_nullArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p89fos2q();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,70,108,111,97,116,95,110,117,108,108,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxFloat_nullArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36386,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p89fos2q(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36386);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36387);NumberUtils.max((float[]) null);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testMaxFloat_emptyArray() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hd5288s2s();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,77,97,120,70,108,111,97,116,95,101,109,112,116,121,65,114,114,97,121,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxFloat_emptyArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36388,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hd5288s2s(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36388);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36389);NumberUtils.max(new float[0]);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMaxFloat() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_235oquns2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaxFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36390,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_235oquns2u(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36390);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36391);assertEquals(
            "max(float[]) failed for array length 1",
            5.1f,
            NumberUtils.max(new float[] { 5.1f }),
            0);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36392);assertEquals(
            "max(float[]) failed for array length 2",
            9.2f,
            NumberUtils.max(new float[] { 6.3f, 9.2f }),
            0);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36393);assertEquals(
            "max(float[]) failed for float length 5",
            10.4f,
            NumberUtils.max(new float[] { -10.5f, -5.6f, 0, 5.7f, 10.4f }),
            0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36394);assertEquals(10, NumberUtils.max(new float[] { -10, -5, 0, 5, 10 }), 0.0001f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36395);assertEquals(10, NumberUtils.max(new float[] { -5, 0, 10, 5, -10 }), 0.0001f);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMinimumLong() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n4uayns30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinimumLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36396,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n4uayns30(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36396);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36397);assertEquals("minimum(long,long,long) 1 failed", 12345L, NumberUtils.min(12345L, 12345L + 1L, 12345L + 2L));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36398);assertEquals("minimum(long,long,long) 2 failed", 12345L, NumberUtils.min(12345L + 1L, 12345L, 12345 + 2L));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36399);assertEquals("minimum(long,long,long) 3 failed", 12345L, NumberUtils.min(12345L + 1L, 12345L + 2L, 12345L));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36400);assertEquals("minimum(long,long,long) 4 failed", 12345L, NumberUtils.min(12345L + 1L, 12345L, 12345L));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36401);assertEquals("minimum(long,long,long) 5 failed", 12345L, NumberUtils.min(12345L, 12345L, 12345L));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMinimumInt() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m2ntp6s36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinimumInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36402,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m2ntp6s36(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36402);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36403);assertEquals("minimum(int,int,int) 1 failed", 12345, NumberUtils.min(12345, 12345 + 1, 12345 + 2));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36404);assertEquals("minimum(int,int,int) 2 failed", 12345, NumberUtils.min(12345 + 1, 12345, 12345 + 2));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36405);assertEquals("minimum(int,int,int) 3 failed", 12345, NumberUtils.min(12345 + 1, 12345 + 2, 12345));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36406);assertEquals("minimum(int,int,int) 4 failed", 12345, NumberUtils.min(12345 + 1, 12345, 12345));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36407);assertEquals("minimum(int,int,int) 5 failed", 12345, NumberUtils.min(12345, 12345, 12345));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMinimumShort() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2psvpixs3c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinimumShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36408,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2psvpixs3c(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36408);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36409);final short low = 1234;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36410);final short mid = 1234 + 1;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36411);final short high = 1234 + 2;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36412);assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(low, mid, high));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36413);assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(mid, low, high));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36414);assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(mid, high, low));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36415);assertEquals("minimum(short,short,short) 1 failed", low, NumberUtils.min(low, mid, low));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMinimumByte() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gzlo1hs3k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinimumByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36416,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gzlo1hs3k(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36416);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36417);final byte low = 123;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36418);final byte mid = 123 + 1;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36419);final byte high = 123 + 2;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36420);assertEquals("minimum(byte,byte,byte) 1 failed", low, NumberUtils.min(low, mid, high));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36421);assertEquals("minimum(byte,byte,byte) 1 failed", low, NumberUtils.min(mid, low, high));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36422);assertEquals("minimum(byte,byte,byte) 1 failed", low, NumberUtils.min(mid, high, low));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36423);assertEquals("minimum(byte,byte,byte) 1 failed", low, NumberUtils.min(low, mid, low));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMinimumDouble() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2luvnass3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinimumDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36424,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2luvnass3s(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36424);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36425);final double low = 12.3;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36426);final double mid = 12.3 + 1;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36427);final double high = 12.3 + 2;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36428);assertEquals(low, NumberUtils.min(low, mid, high), 0.0001);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36429);assertEquals(low, NumberUtils.min(mid, low, high), 0.0001);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36430);assertEquals(low, NumberUtils.min(mid, high, low), 0.0001);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36431);assertEquals(low, NumberUtils.min(low, mid, low), 0.0001);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36432);assertEquals(mid, NumberUtils.min(high, mid, high), 0.0001);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMinimumFloat() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2izblyfs41();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMinimumFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36433,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2izblyfs41(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36433);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36434);final float low = 12.3f;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36435);final float mid = 12.3f + 1;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36436);final float high = 12.3f + 2;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36437);assertEquals(low, NumberUtils.min(low, mid, high), 0.0001f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36438);assertEquals(low, NumberUtils.min(mid, low, high), 0.0001f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36439);assertEquals(low, NumberUtils.min(mid, high, low), 0.0001f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36440);assertEquals(low, NumberUtils.min(low, mid, low), 0.0001f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36441);assertEquals(mid, NumberUtils.min(high, mid, high), 0.0001f);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMaximumLong() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_259tr69s4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaximumLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36442,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_259tr69s4a(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36442);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36443);assertEquals("maximum(long,long,long) 1 failed", 12345L, NumberUtils.max(12345L, 12345L - 1L, 12345L - 2L));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36444);assertEquals("maximum(long,long,long) 2 failed", 12345L, NumberUtils.max(12345L - 1L, 12345L, 12345L - 2L));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36445);assertEquals("maximum(long,long,long) 3 failed", 12345L, NumberUtils.max(12345L - 1L, 12345L - 2L, 12345L));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36446);assertEquals("maximum(long,long,long) 4 failed", 12345L, NumberUtils.max(12345L - 1L, 12345L, 12345L));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36447);assertEquals("maximum(long,long,long) 5 failed", 12345L, NumberUtils.max(12345L, 12345L, 12345L));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMaximumInt() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lhx3igs4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaximumInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36448,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lhx3igs4g(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36448);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36449);assertEquals("maximum(int,int,int) 1 failed", 12345, NumberUtils.max(12345, 12345 - 1, 12345 - 2));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36450);assertEquals("maximum(int,int,int) 2 failed", 12345, NumberUtils.max(12345 - 1, 12345, 12345 - 2));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36451);assertEquals("maximum(int,int,int) 3 failed", 12345, NumberUtils.max(12345 - 1, 12345 - 2, 12345));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36452);assertEquals("maximum(int,int,int) 4 failed", 12345, NumberUtils.max(12345 - 1, 12345, 12345));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36453);assertEquals("maximum(int,int,int) 5 failed", 12345, NumberUtils.max(12345, 12345, 12345));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMaximumShort() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b9gb63s4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaximumShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36454,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b9gb63s4m(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36454);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36455);final short low = 1234;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36456);final short mid = 1234 + 1;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36457);final short high = 1234 + 2;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36458);assertEquals("maximum(short,short,short) 1 failed", high, NumberUtils.max(low, mid, high));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36459);assertEquals("maximum(short,short,short) 1 failed", high, NumberUtils.max(mid, low, high));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36460);assertEquals("maximum(short,short,short) 1 failed", high, NumberUtils.max(mid, high, low));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36461);assertEquals("maximum(short,short,short) 1 failed", high, NumberUtils.max(high, mid, high));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMaximumByte() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yum7tvs4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaximumByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36462,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yum7tvs4u(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36462);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36463);final byte low = 123;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36464);final byte mid = 123 + 1;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36465);final byte high = 123 + 2;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36466);assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(low, mid, high));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36467);assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(mid, low, high));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36468);assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(mid, high, low));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36469);assertEquals("maximum(byte,byte,byte) 1 failed", high, NumberUtils.max(high, mid, high));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMaximumDouble() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2omndh6s52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaximumDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36470,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2omndh6s52(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36470);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36471);final double low = 12.3;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36472);final double mid = 12.3 + 1;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36473);final double high = 12.3 + 2;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36474);assertEquals(high, NumberUtils.max(low, mid, high), 0.0001);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36475);assertEquals(high, NumberUtils.max(mid, low, high), 0.0001);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36476);assertEquals(high, NumberUtils.max(mid, high, low), 0.0001);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36477);assertEquals(mid, NumberUtils.max(low, mid, low), 0.0001);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36478);assertEquals(high, NumberUtils.max(high, mid, high), 0.0001);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testMaximumFloat() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xir0b9s5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testMaximumFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36479,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xir0b9s5b(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36479);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36480);final float low = 12.3f;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36481);final float mid = 12.3f + 1;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36482);final float high = 12.3f + 2;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36483);assertEquals(high, NumberUtils.max(low, mid, high), 0.0001f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36484);assertEquals(high, NumberUtils.max(mid, low, high), 0.0001f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36485);assertEquals(high, NumberUtils.max(mid, high, low), 0.0001f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36486);assertEquals(mid, NumberUtils.max(low, mid, low), 0.0001f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36487);assertEquals(high, NumberUtils.max(high, mid, high), 0.0001f);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    // Testing JDK against old Lang functionality
    @Test
    public void testCompareDouble() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2h9jc0ls5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCompareDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36488,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2h9jc0ls5k(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36488);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36489);assertTrue(Double.compare(Double.NaN, Double.NaN) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36490);assertTrue(Double.compare(Double.NaN, Double.POSITIVE_INFINITY) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36491);assertTrue(Double.compare(Double.NaN, Double.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36492);assertTrue(Double.compare(Double.NaN, 1.2d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36493);assertTrue(Double.compare(Double.NaN, 0.0d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36494);assertTrue(Double.compare(Double.NaN, -0.0d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36495);assertTrue(Double.compare(Double.NaN, -1.2d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36496);assertTrue(Double.compare(Double.NaN, -Double.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36497);assertTrue(Double.compare(Double.NaN, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36498);assertTrue(Double.compare(Double.POSITIVE_INFINITY, Double.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36499);assertTrue(Double.compare(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36500);assertTrue(Double.compare(Double.POSITIVE_INFINITY, Double.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36501);assertTrue(Double.compare(Double.POSITIVE_INFINITY, 1.2d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36502);assertTrue(Double.compare(Double.POSITIVE_INFINITY, 0.0d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36503);assertTrue(Double.compare(Double.POSITIVE_INFINITY, -0.0d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36504);assertTrue(Double.compare(Double.POSITIVE_INFINITY, -1.2d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36505);assertTrue(Double.compare(Double.POSITIVE_INFINITY, -Double.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36506);assertTrue(Double.compare(Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36507);assertTrue(Double.compare(Double.MAX_VALUE, Double.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36508);assertTrue(Double.compare(Double.MAX_VALUE, Double.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36509);assertTrue(Double.compare(Double.MAX_VALUE, Double.MAX_VALUE) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36510);assertTrue(Double.compare(Double.MAX_VALUE, 1.2d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36511);assertTrue(Double.compare(Double.MAX_VALUE, 0.0d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36512);assertTrue(Double.compare(Double.MAX_VALUE, -0.0d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36513);assertTrue(Double.compare(Double.MAX_VALUE, -1.2d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36514);assertTrue(Double.compare(Double.MAX_VALUE, -Double.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36515);assertTrue(Double.compare(Double.MAX_VALUE, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36516);assertTrue(Double.compare(1.2d, Double.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36517);assertTrue(Double.compare(1.2d, Double.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36518);assertTrue(Double.compare(1.2d, Double.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36519);assertTrue(Double.compare(1.2d, 1.2d) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36520);assertTrue(Double.compare(1.2d, 0.0d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36521);assertTrue(Double.compare(1.2d, -0.0d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36522);assertTrue(Double.compare(1.2d, -1.2d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36523);assertTrue(Double.compare(1.2d, -Double.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36524);assertTrue(Double.compare(1.2d, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36525);assertTrue(Double.compare(0.0d, Double.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36526);assertTrue(Double.compare(0.0d, Double.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36527);assertTrue(Double.compare(0.0d, Double.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36528);assertTrue(Double.compare(0.0d, 1.2d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36529);assertTrue(Double.compare(0.0d, 0.0d) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36530);assertTrue(Double.compare(0.0d, -0.0d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36531);assertTrue(Double.compare(0.0d, -1.2d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36532);assertTrue(Double.compare(0.0d, -Double.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36533);assertTrue(Double.compare(0.0d, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36534);assertTrue(Double.compare(-0.0d, Double.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36535);assertTrue(Double.compare(-0.0d, Double.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36536);assertTrue(Double.compare(-0.0d, Double.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36537);assertTrue(Double.compare(-0.0d, 1.2d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36538);assertTrue(Double.compare(-0.0d, 0.0d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36539);assertTrue(Double.compare(-0.0d, -0.0d) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36540);assertTrue(Double.compare(-0.0d, -1.2d) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36541);assertTrue(Double.compare(-0.0d, -Double.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36542);assertTrue(Double.compare(-0.0d, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36543);assertTrue(Double.compare(-1.2d, Double.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36544);assertTrue(Double.compare(-1.2d, Double.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36545);assertTrue(Double.compare(-1.2d, Double.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36546);assertTrue(Double.compare(-1.2d, 1.2d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36547);assertTrue(Double.compare(-1.2d, 0.0d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36548);assertTrue(Double.compare(-1.2d, -0.0d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36549);assertTrue(Double.compare(-1.2d, -1.2d) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36550);assertTrue(Double.compare(-1.2d, -Double.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36551);assertTrue(Double.compare(-1.2d, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36552);assertTrue(Double.compare(-Double.MAX_VALUE, Double.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36553);assertTrue(Double.compare(-Double.MAX_VALUE, Double.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36554);assertTrue(Double.compare(-Double.MAX_VALUE, Double.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36555);assertTrue(Double.compare(-Double.MAX_VALUE, 1.2d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36556);assertTrue(Double.compare(-Double.MAX_VALUE, 0.0d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36557);assertTrue(Double.compare(-Double.MAX_VALUE, -0.0d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36558);assertTrue(Double.compare(-Double.MAX_VALUE, -1.2d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36559);assertTrue(Double.compare(-Double.MAX_VALUE, -Double.MAX_VALUE) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36560);assertTrue(Double.compare(-Double.MAX_VALUE, Double.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36561);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, Double.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36562);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36563);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, Double.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36564);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, 1.2d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36565);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, 0.0d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36566);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, -0.0d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36567);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, -1.2d) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36568);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, -Double.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36569);assertTrue(Double.compare(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY) == 0);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testCompareFloat() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m0ddcs7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testCompareFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36570,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m0ddcs7u(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36570);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36571);assertTrue(Float.compare(Float.NaN, Float.NaN) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36572);assertTrue(Float.compare(Float.NaN, Float.POSITIVE_INFINITY) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36573);assertTrue(Float.compare(Float.NaN, Float.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36574);assertTrue(Float.compare(Float.NaN, 1.2f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36575);assertTrue(Float.compare(Float.NaN, 0.0f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36576);assertTrue(Float.compare(Float.NaN, -0.0f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36577);assertTrue(Float.compare(Float.NaN, -1.2f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36578);assertTrue(Float.compare(Float.NaN, -Float.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36579);assertTrue(Float.compare(Float.NaN, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36580);assertTrue(Float.compare(Float.POSITIVE_INFINITY, Float.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36581);assertTrue(Float.compare(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36582);assertTrue(Float.compare(Float.POSITIVE_INFINITY, Float.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36583);assertTrue(Float.compare(Float.POSITIVE_INFINITY, 1.2f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36584);assertTrue(Float.compare(Float.POSITIVE_INFINITY, 0.0f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36585);assertTrue(Float.compare(Float.POSITIVE_INFINITY, -0.0f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36586);assertTrue(Float.compare(Float.POSITIVE_INFINITY, -1.2f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36587);assertTrue(Float.compare(Float.POSITIVE_INFINITY, -Float.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36588);assertTrue(Float.compare(Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36589);assertTrue(Float.compare(Float.MAX_VALUE, Float.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36590);assertTrue(Float.compare(Float.MAX_VALUE, Float.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36591);assertTrue(Float.compare(Float.MAX_VALUE, Float.MAX_VALUE) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36592);assertTrue(Float.compare(Float.MAX_VALUE, 1.2f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36593);assertTrue(Float.compare(Float.MAX_VALUE, 0.0f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36594);assertTrue(Float.compare(Float.MAX_VALUE, -0.0f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36595);assertTrue(Float.compare(Float.MAX_VALUE, -1.2f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36596);assertTrue(Float.compare(Float.MAX_VALUE, -Float.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36597);assertTrue(Float.compare(Float.MAX_VALUE, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36598);assertTrue(Float.compare(1.2f, Float.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36599);assertTrue(Float.compare(1.2f, Float.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36600);assertTrue(Float.compare(1.2f, Float.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36601);assertTrue(Float.compare(1.2f, 1.2f) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36602);assertTrue(Float.compare(1.2f, 0.0f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36603);assertTrue(Float.compare(1.2f, -0.0f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36604);assertTrue(Float.compare(1.2f, -1.2f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36605);assertTrue(Float.compare(1.2f, -Float.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36606);assertTrue(Float.compare(1.2f, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36607);assertTrue(Float.compare(0.0f, Float.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36608);assertTrue(Float.compare(0.0f, Float.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36609);assertTrue(Float.compare(0.0f, Float.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36610);assertTrue(Float.compare(0.0f, 1.2f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36611);assertTrue(Float.compare(0.0f, 0.0f) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36612);assertTrue(Float.compare(0.0f, -0.0f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36613);assertTrue(Float.compare(0.0f, -1.2f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36614);assertTrue(Float.compare(0.0f, -Float.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36615);assertTrue(Float.compare(0.0f, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36616);assertTrue(Float.compare(-0.0f, Float.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36617);assertTrue(Float.compare(-0.0f, Float.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36618);assertTrue(Float.compare(-0.0f, Float.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36619);assertTrue(Float.compare(-0.0f, 1.2f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36620);assertTrue(Float.compare(-0.0f, 0.0f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36621);assertTrue(Float.compare(-0.0f, -0.0f) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36622);assertTrue(Float.compare(-0.0f, -1.2f) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36623);assertTrue(Float.compare(-0.0f, -Float.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36624);assertTrue(Float.compare(-0.0f, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36625);assertTrue(Float.compare(-1.2f, Float.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36626);assertTrue(Float.compare(-1.2f, Float.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36627);assertTrue(Float.compare(-1.2f, Float.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36628);assertTrue(Float.compare(-1.2f, 1.2f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36629);assertTrue(Float.compare(-1.2f, 0.0f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36630);assertTrue(Float.compare(-1.2f, -0.0f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36631);assertTrue(Float.compare(-1.2f, -1.2f) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36632);assertTrue(Float.compare(-1.2f, -Float.MAX_VALUE) == +1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36633);assertTrue(Float.compare(-1.2f, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36634);assertTrue(Float.compare(-Float.MAX_VALUE, Float.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36635);assertTrue(Float.compare(-Float.MAX_VALUE, Float.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36636);assertTrue(Float.compare(-Float.MAX_VALUE, Float.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36637);assertTrue(Float.compare(-Float.MAX_VALUE, 1.2f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36638);assertTrue(Float.compare(-Float.MAX_VALUE, 0.0f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36639);assertTrue(Float.compare(-Float.MAX_VALUE, -0.0f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36640);assertTrue(Float.compare(-Float.MAX_VALUE, -1.2f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36641);assertTrue(Float.compare(-Float.MAX_VALUE, -Float.MAX_VALUE) == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36642);assertTrue(Float.compare(-Float.MAX_VALUE, Float.NEGATIVE_INFINITY) == +1);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36643);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, Float.NaN) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36644);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36645);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, Float.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36646);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, 1.2f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36647);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, 0.0f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36648);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, -0.0f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36649);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, -1.2f) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36650);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, -Float.MAX_VALUE) == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36651);assertTrue(Float.compare(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY) == 0);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testIsDigits() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xdmkbtsa4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testIsDigits",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36652,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xdmkbtsa4(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36652);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36653);assertFalse("isDigits(null) failed", NumberUtils.isDigits(null));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36654);assertFalse("isDigits('') failed", NumberUtils.isDigits(""));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36655);assertTrue("isDigits(String) failed", NumberUtils.isDigits("12345"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36656);assertFalse("isDigits(String) neg 1 failed", NumberUtils.isDigits("1234.5"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36657);assertFalse("isDigits(String) neg 3 failed", NumberUtils.isDigits("1ab"));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36658);assertFalse("isDigits(String) neg 4 failed", NumberUtils.isDigits("abc"));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    /**
     * Tests isNumber(String) and tests that createNumber(String) returns
     * a valid number iff isNumber(String) returns false.
     */
    @Test
    public void testIsNumber() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nd01assab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testIsNumber",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36659,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nd01assab(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36659);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36660);String val = "12345";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36661);assertTrue("isNumber(String) 1 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36662);assertTrue("isNumber(String)/createNumber(String) 1 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36663);val = "1234.5";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36664);assertTrue("isNumber(String) 2 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36665);assertTrue("isNumber(String)/createNumber(String) 2 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36666);val = ".12345";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36667);assertTrue("isNumber(String) 3 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36668);assertTrue("isNumber(String)/createNumber(String) 3 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36669);val = "1234E5";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36670);assertTrue("isNumber(String) 4 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36671);assertTrue("isNumber(String)/createNumber(String) 4 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36672);val = "1234E+5";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36673);assertTrue("isNumber(String) 5 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36674);assertTrue("isNumber(String)/createNumber(String) 5 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36675);val = "1234E-5";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36676);assertTrue("isNumber(String) 6 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36677);assertTrue("isNumber(String)/createNumber(String) 6 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36678);val = "123.4E5";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36679);assertTrue("isNumber(String) 7 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36680);assertTrue("isNumber(String)/createNumber(String) 7 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36681);val = "-1234";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36682);assertTrue("isNumber(String) 8 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36683);assertTrue("isNumber(String)/createNumber(String) 8 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36684);val = "-1234.5";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36685);assertTrue("isNumber(String) 9 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36686);assertTrue("isNumber(String)/createNumber(String) 9 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36687);val = "-.12345";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36688);assertTrue("isNumber(String) 10 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36689);assertTrue("isNumber(String)/createNumber(String) 10 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36690);val = "-1234E5";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36691);assertTrue("isNumber(String) 11 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36692);assertTrue("isNumber(String)/createNumber(String) 11 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36693);val = "0";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36694);assertTrue("isNumber(String) 12 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36695);assertTrue("isNumber(String)/createNumber(String) 12 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36696);val = "-0";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36697);assertTrue("isNumber(String) 13 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36698);assertTrue("isNumber(String)/createNumber(String) 13 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36699);val = "01234";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36700);assertTrue("isNumber(String) 14 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36701);assertTrue("isNumber(String)/createNumber(String) 14 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36702);val = "-01234";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36703);assertTrue("isNumber(String) 15 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36704);assertTrue("isNumber(String)/createNumber(String) 15 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36705);val = "0xABC123";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36706);assertTrue("isNumber(String) 16 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36707);assertTrue("isNumber(String)/createNumber(String) 16 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36708);val = "0x0";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36709);assertTrue("isNumber(String) 17 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36710);assertTrue("isNumber(String)/createNumber(String) 17 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36711);val = "123.4E21D";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36712);assertTrue("isNumber(String) 19 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36713);assertTrue("isNumber(String)/createNumber(String) 19 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36714);val = "-221.23F";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36715);assertTrue("isNumber(String) 20 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36716);assertTrue("isNumber(String)/createNumber(String) 20 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36717);val = "22338L";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36718);assertTrue("isNumber(String) 21 failed", NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36719);assertTrue("isNumber(String)/createNumber(String) 21 failed", checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36720);val = null;
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36721);assertTrue("isNumber(String) 1 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36722);assertTrue("isNumber(String)/createNumber(String) 1 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36723);val = "";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36724);assertTrue("isNumber(String) 2 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36725);assertTrue("isNumber(String)/createNumber(String) 2 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36726);val = "--2.3";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36727);assertTrue("isNumber(String) 3 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36728);assertTrue("isNumber(String)/createNumber(String) 3 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36729);val = ".12.3";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36730);assertTrue("isNumber(String) 4 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36731);assertTrue("isNumber(String)/createNumber(String) 4 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36732);val = "-123E";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36733);assertTrue("isNumber(String) 5 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36734);assertTrue("isNumber(String)/createNumber(String) 5 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36735);val = "-123E+-212";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36736);assertTrue("isNumber(String) 6 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36737);assertTrue("isNumber(String)/createNumber(String) 6 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36738);val = "-123E2.12";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36739);assertTrue("isNumber(String) 7 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36740);assertTrue("isNumber(String)/createNumber(String) 7 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36741);val = "0xGF";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36742);assertTrue("isNumber(String) 8 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36743);assertTrue("isNumber(String)/createNumber(String) 8 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36744);val = "0xFAE-1";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36745);assertTrue("isNumber(String) 9 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36746);assertTrue("isNumber(String)/createNumber(String) 9 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36747);val = ".";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36748);assertTrue("isNumber(String) 10 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36749);assertTrue("isNumber(String)/createNumber(String) 10 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36750);val = "-0ABC123";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36751);assertTrue("isNumber(String) 11 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36752);assertTrue("isNumber(String)/createNumber(String) 11 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36753);val = "123.4E-D";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36754);assertTrue("isNumber(String) 12 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36755);assertTrue("isNumber(String)/createNumber(String) 12 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36756);val = "123.4ED";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36757);assertTrue("isNumber(String) 13 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36758);assertTrue("isNumber(String)/createNumber(String) 13 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36759);val = "1234E5l";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36760);assertTrue("isNumber(String) 14 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36761);assertTrue("isNumber(String)/createNumber(String) 14 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36762);val = "11a";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36763);assertTrue("isNumber(String) 15 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36764);assertTrue("isNumber(String)/createNumber(String) 15 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36765);val = "1a";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36766);assertTrue("isNumber(String) 16 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36767);assertTrue("isNumber(String)/createNumber(String) 16 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36768);val = "a";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36769);assertTrue("isNumber(String) 17 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36770);assertTrue("isNumber(String)/createNumber(String) 17 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36771);val = "11g";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36772);assertTrue("isNumber(String) 18 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36773);assertTrue("isNumber(String)/createNumber(String) 18 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36774);val = "11z";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36775);assertTrue("isNumber(String) 19 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36776);assertTrue("isNumber(String)/createNumber(String) 19 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36777);val = "11def";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36778);assertTrue("isNumber(String) 20 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36779);assertTrue("isNumber(String)/createNumber(String) 20 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36780);val = "11d11";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36781);assertTrue("isNumber(String) 21 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36782);assertTrue("isNumber(String)/createNumber(String) 21 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36783);val = "11 11";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36784);assertTrue("isNumber(String) 22 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36785);assertTrue("isNumber(String)/createNumber(String) 22 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36786);val = " 1111";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36787);assertTrue("isNumber(String) 23 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36788);assertTrue("isNumber(String)/createNumber(String) 23 Neg failed", !checkCreateNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36789);val = "1111 ";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36790);assertTrue("isNumber(String) 24 Neg failed", !NumberUtils.isNumber(val));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36791);assertTrue("isNumber(String)/createNumber(String) 24 Neg failed", !checkCreateNumber(val));

        // LANG-521
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36792);val = "2.";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36793);assertTrue("isNumber(String) LANG-521 failed", NumberUtils.isNumber(val));

        // LANG-664
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36794);val = "1.1L";
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36795);assertFalse("isNumber(String) LANG-664 failed", NumberUtils.isNumber(val));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    private boolean checkCreateNumber(final String val) {try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36796);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36797);try {
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36798);final Object obj = NumberUtils.createNumber(val);
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36799);if ((((obj == null)&&(__CLR4_1_2rtxrtxl3lqxura.R.iget(36800)!=0|true))||(__CLR4_1_2rtxrtxl3lqxura.R.iget(36801)==0&false))) {{
                __CLR4_1_2rtxrtxl3lqxura.R.inc(36802);return false;
            }
            }__CLR4_1_2rtxrtxl3lqxura.R.inc(36803);return true;
        } catch (final NumberFormatException e) {
            __CLR4_1_2rtxrtxl3lqxura.R.inc(36804);return false;
       }
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @SuppressWarnings("cast") // suppress instanceof warning check
    @Test
    public void testConstants() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25epzlwsed();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testConstants",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36805,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25epzlwsed(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36805);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36806);assertTrue(NumberUtils.LONG_ZERO instanceof Long);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36807);assertTrue(NumberUtils.LONG_ONE instanceof Long);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36808);assertTrue(NumberUtils.LONG_MINUS_ONE instanceof Long);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36809);assertTrue(NumberUtils.INTEGER_ZERO instanceof Integer);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36810);assertTrue(NumberUtils.INTEGER_ONE instanceof Integer);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36811);assertTrue(NumberUtils.INTEGER_MINUS_ONE instanceof Integer);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36812);assertTrue(NumberUtils.SHORT_ZERO instanceof Short);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36813);assertTrue(NumberUtils.SHORT_ONE instanceof Short);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36814);assertTrue(NumberUtils.SHORT_MINUS_ONE instanceof Short);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36815);assertTrue(NumberUtils.BYTE_ZERO instanceof Byte);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36816);assertTrue(NumberUtils.BYTE_ONE instanceof Byte);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36817);assertTrue(NumberUtils.BYTE_MINUS_ONE instanceof Byte);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36818);assertTrue(NumberUtils.DOUBLE_ZERO instanceof Double);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36819);assertTrue(NumberUtils.DOUBLE_ONE instanceof Double);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36820);assertTrue(NumberUtils.DOUBLE_MINUS_ONE instanceof Double);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36821);assertTrue(NumberUtils.FLOAT_ZERO instanceof Float);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36822);assertTrue(NumberUtils.FLOAT_ONE instanceof Float);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36823);assertTrue(NumberUtils.FLOAT_MINUS_ONE instanceof Float);

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36824);assertTrue(NumberUtils.LONG_ZERO.longValue() == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36825);assertTrue(NumberUtils.LONG_ONE.longValue() == 1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36826);assertTrue(NumberUtils.LONG_MINUS_ONE.longValue() == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36827);assertTrue(NumberUtils.INTEGER_ZERO.intValue() == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36828);assertTrue(NumberUtils.INTEGER_ONE.intValue() == 1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36829);assertTrue(NumberUtils.INTEGER_MINUS_ONE.intValue() == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36830);assertTrue(NumberUtils.SHORT_ZERO.shortValue() == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36831);assertTrue(NumberUtils.SHORT_ONE.shortValue() == 1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36832);assertTrue(NumberUtils.SHORT_MINUS_ONE.shortValue() == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36833);assertTrue(NumberUtils.BYTE_ZERO.byteValue() == 0);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36834);assertTrue(NumberUtils.BYTE_ONE.byteValue() == 1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36835);assertTrue(NumberUtils.BYTE_MINUS_ONE.byteValue() == -1);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36836);assertTrue(NumberUtils.DOUBLE_ZERO.doubleValue() == 0.0d);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36837);assertTrue(NumberUtils.DOUBLE_ONE.doubleValue() == 1.0d);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36838);assertTrue(NumberUtils.DOUBLE_MINUS_ONE.doubleValue() == -1.0d);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36839);assertTrue(NumberUtils.FLOAT_ZERO.floatValue() == 0.0f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36840);assertTrue(NumberUtils.FLOAT_ONE.floatValue() == 1.0f);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36841);assertTrue(NumberUtils.FLOAT_MINUS_ONE.floatValue() == -1.0f);
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testLang300() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23cauyusfe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testLang300",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36842,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23cauyusfe(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36842);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36843);NumberUtils.createNumber("-1l");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36844);NumberUtils.createNumber("01l");
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36845);NumberUtils.createNumber("1l");
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

    @Test
    public void testLang381() {__CLR4_1_2rtxrtxl3lqxura.R.globalSliceStart(getClass().getName(),36846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ok868jsfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2rtxrtxl3lqxura.R.rethrow($CLV_t2$);}finally{__CLR4_1_2rtxrtxl3lqxura.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.NumberUtilsTest.testLang381",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36846,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ok868jsfi(){try{__CLR4_1_2rtxrtxl3lqxura.R.inc(36846);
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36847);assertTrue(Double.isNaN(NumberUtils.min(1.2, 2.5, Double.NaN)));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36848);assertTrue(Double.isNaN(NumberUtils.max(1.2, 2.5, Double.NaN)));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36849);assertTrue(Float.isNaN(NumberUtils.min(1.2f, 2.5f, Float.NaN)));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36850);assertTrue(Float.isNaN(NumberUtils.max(1.2f, 2.5f, Float.NaN)));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36851);final double[] a = new double[] { 1.2, Double.NaN, 3.7, 27.0, 42.0, Double.NaN };
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36852);assertTrue(Double.isNaN(NumberUtils.max(a)));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36853);assertTrue(Double.isNaN(NumberUtils.min(a)));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36854);final double[] b = new double[] { Double.NaN, 1.2, Double.NaN, 3.7, 27.0, 42.0, Double.NaN };
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36855);assertTrue(Double.isNaN(NumberUtils.max(b)));
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36856);assertTrue(Double.isNaN(NumberUtils.min(b)));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36857);final float[] aF = new float[] { 1.2f, Float.NaN, 3.7f, 27.0f, 42.0f, Float.NaN };
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36858);assertTrue(Float.isNaN(NumberUtils.max(aF)));

        __CLR4_1_2rtxrtxl3lqxura.R.inc(36859);final float[] bF = new float[] { Float.NaN, 1.2f, Float.NaN, 3.7f, 27.0f, 42.0f, Float.NaN };
        __CLR4_1_2rtxrtxl3lqxura.R.inc(36860);assertTrue(Float.isNaN(NumberUtils.max(bF)));
    }finally{__CLR4_1_2rtxrtxl3lqxura.R.flushNeeded();}}

}
