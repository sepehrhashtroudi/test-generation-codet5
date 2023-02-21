/* $$ This file has been instrumented by Clover 4.1.2#20161011084623935 $$ *//*******************************************************************************
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
 *******************************************************************************/
package org.apache.commons.lang3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.UUID;

import org.junit.Test;


/**
 * Unit tests {@link Conversion}.
 * 
 * @version $Id$
 */
public class ConversionTest {static class __CLR4_1_2ja2ja2l3lqxtun{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,25635,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Tests {@link Conversion#hexDigitToInt(char)}.
     */
    @Test
    public void testHexDigitToInt() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),24986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ojw2g9ja2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexDigitToInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),24986,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ojw2g9ja2(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(24986);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(24987);assertEquals(0, Conversion.hexDigitToInt('0'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(24988);assertEquals(1, Conversion.hexDigitToInt('1'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(24989);assertEquals(2, Conversion.hexDigitToInt('2'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(24990);assertEquals(3, Conversion.hexDigitToInt('3'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(24991);assertEquals(4, Conversion.hexDigitToInt('4'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(24992);assertEquals(5, Conversion.hexDigitToInt('5'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(24993);assertEquals(6, Conversion.hexDigitToInt('6'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(24994);assertEquals(7, Conversion.hexDigitToInt('7'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(24995);assertEquals(8, Conversion.hexDigitToInt('8'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(24996);assertEquals(9, Conversion.hexDigitToInt('9'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(24997);assertEquals(10, Conversion.hexDigitToInt('A'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(24998);assertEquals(10, Conversion.hexDigitToInt('a'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(24999);assertEquals(11, Conversion.hexDigitToInt('B'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25000);assertEquals(11, Conversion.hexDigitToInt('b'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25001);assertEquals(12, Conversion.hexDigitToInt('C'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25002);assertEquals(12, Conversion.hexDigitToInt('c'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25003);assertEquals(13, Conversion.hexDigitToInt('D'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25004);assertEquals(13, Conversion.hexDigitToInt('d'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25005);assertEquals(14, Conversion.hexDigitToInt('E'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25006);assertEquals(14, Conversion.hexDigitToInt('e'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25007);assertEquals(15, Conversion.hexDigitToInt('F'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25008);assertEquals(15, Conversion.hexDigitToInt('f'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25009);try {
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25010);Conversion.hexDigitToInt('G');
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25011);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexDigitMsb0ToInt(char)}.
     */
    @Test
    public void testHexDigitMsb0ToInt() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x9l60tjas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexDigitMsb0ToInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25012,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x9l60tjas(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25012);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25013);assertEquals(0x0, Conversion.hexDigitMsb0ToInt('0'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25014);assertEquals(0x8, Conversion.hexDigitMsb0ToInt('1'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25015);assertEquals(0x4, Conversion.hexDigitMsb0ToInt('2'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25016);assertEquals(0xC, Conversion.hexDigitMsb0ToInt('3'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25017);assertEquals(0x2, Conversion.hexDigitMsb0ToInt('4'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25018);assertEquals(0xA, Conversion.hexDigitMsb0ToInt('5'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25019);assertEquals(0x6, Conversion.hexDigitMsb0ToInt('6'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25020);assertEquals(0xE, Conversion.hexDigitMsb0ToInt('7'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25021);assertEquals(0x1, Conversion.hexDigitMsb0ToInt('8'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25022);assertEquals(0x9, Conversion.hexDigitMsb0ToInt('9'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25023);assertEquals(0x5, Conversion.hexDigitMsb0ToInt('A'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25024);assertEquals(0x5, Conversion.hexDigitMsb0ToInt('a'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25025);assertEquals(0xD, Conversion.hexDigitMsb0ToInt('B'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25026);assertEquals(0xD, Conversion.hexDigitMsb0ToInt('b'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25027);assertEquals(0x3, Conversion.hexDigitMsb0ToInt('C'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25028);assertEquals(0x3, Conversion.hexDigitMsb0ToInt('c'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25029);assertEquals(0xB, Conversion.hexDigitMsb0ToInt('D'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25030);assertEquals(0xB, Conversion.hexDigitMsb0ToInt('d'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25031);assertEquals(0x7, Conversion.hexDigitMsb0ToInt('E'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25032);assertEquals(0x7, Conversion.hexDigitMsb0ToInt('e'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25033);assertEquals(0xF, Conversion.hexDigitMsb0ToInt('F'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25034);assertEquals(0xF, Conversion.hexDigitMsb0ToInt('f'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25035);try {
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25036);Conversion.hexDigitMsb0ToInt('G');
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25037);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexDigitToBinary(char)}.
     */
    @Test
    public void testHexDigitToBinary() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jkm4s9jbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexDigitToBinary",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25038,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jkm4s9jbi(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25038);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25039);assertBinaryEquals(
            new boolean[]{false, false, false, false}, Conversion.hexDigitToBinary('0'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25040);assertBinaryEquals(
            new boolean[]{true, false, false, false}, Conversion.hexDigitToBinary('1'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25041);assertBinaryEquals(
            new boolean[]{false, true, false, false}, Conversion.hexDigitToBinary('2'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25042);assertBinaryEquals(
            new boolean[]{true, true, false, false}, Conversion.hexDigitToBinary('3'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25043);assertBinaryEquals(
            new boolean[]{false, false, true, false}, Conversion.hexDigitToBinary('4'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25044);assertBinaryEquals(
            new boolean[]{true, false, true, false}, Conversion.hexDigitToBinary('5'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25045);assertBinaryEquals(
            new boolean[]{false, true, true, false}, Conversion.hexDigitToBinary('6'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25046);assertBinaryEquals(
            new boolean[]{true, true, true, false}, Conversion.hexDigitToBinary('7'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25047);assertBinaryEquals(
            new boolean[]{false, false, false, true}, Conversion.hexDigitToBinary('8'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25048);assertBinaryEquals(
            new boolean[]{true, false, false, true}, Conversion.hexDigitToBinary('9'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25049);assertBinaryEquals(
            new boolean[]{false, true, false, true}, Conversion.hexDigitToBinary('A'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25050);assertBinaryEquals(
            new boolean[]{false, true, false, true}, Conversion.hexDigitToBinary('a'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25051);assertBinaryEquals(
            new boolean[]{true, true, false, true}, Conversion.hexDigitToBinary('B'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25052);assertBinaryEquals(
            new boolean[]{true, true, false, true}, Conversion.hexDigitToBinary('b'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25053);assertBinaryEquals(
            new boolean[]{false, false, true, true}, Conversion.hexDigitToBinary('C'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25054);assertBinaryEquals(
            new boolean[]{false, false, true, true}, Conversion.hexDigitToBinary('c'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25055);assertBinaryEquals(
            new boolean[]{true, false, true, true}, Conversion.hexDigitToBinary('D'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25056);assertBinaryEquals(
            new boolean[]{true, false, true, true}, Conversion.hexDigitToBinary('d'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25057);assertBinaryEquals(
            new boolean[]{false, true, true, true}, Conversion.hexDigitToBinary('E'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25058);assertBinaryEquals(
            new boolean[]{false, true, true, true}, Conversion.hexDigitToBinary('e'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25059);assertBinaryEquals(
            new boolean[]{true, true, true, true}, Conversion.hexDigitToBinary('F'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25060);assertBinaryEquals(
            new boolean[]{true, true, true, true}, Conversion.hexDigitToBinary('f'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25061);try {
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25062);Conversion.hexDigitToBinary('G');
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25063);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexDigitMsb0ToBinary(char)}.
     */
    @Test
    public void testHexDigitMsb0ToBinary() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_258sbobjc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexDigitMsb0ToBinary",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25064,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_258sbobjc8(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25064);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25065);assertBinaryEquals(
            new boolean[]{false, false, false, false}, Conversion.hexDigitMsb0ToBinary('0'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25066);assertBinaryEquals(
            new boolean[]{false, false, false, true}, Conversion.hexDigitMsb0ToBinary('1'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25067);assertBinaryEquals(
            new boolean[]{false, false, true, false}, Conversion.hexDigitMsb0ToBinary('2'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25068);assertBinaryEquals(
            new boolean[]{false, false, true, true}, Conversion.hexDigitMsb0ToBinary('3'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25069);assertBinaryEquals(
            new boolean[]{false, true, false, false}, Conversion.hexDigitMsb0ToBinary('4'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25070);assertBinaryEquals(
            new boolean[]{false, true, false, true}, Conversion.hexDigitMsb0ToBinary('5'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25071);assertBinaryEquals(
            new boolean[]{false, true, true, false}, Conversion.hexDigitMsb0ToBinary('6'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25072);assertBinaryEquals(
            new boolean[]{false, true, true, true}, Conversion.hexDigitMsb0ToBinary('7'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25073);assertBinaryEquals(
            new boolean[]{true, false, false, false}, Conversion.hexDigitMsb0ToBinary('8'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25074);assertBinaryEquals(
            new boolean[]{true, false, false, true}, Conversion.hexDigitMsb0ToBinary('9'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25075);assertBinaryEquals(
            new boolean[]{true, false, true, false}, Conversion.hexDigitMsb0ToBinary('A'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25076);assertBinaryEquals(
            new boolean[]{true, false, true, false}, Conversion.hexDigitMsb0ToBinary('a'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25077);assertBinaryEquals(
            new boolean[]{true, false, true, true}, Conversion.hexDigitMsb0ToBinary('B'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25078);assertBinaryEquals(
            new boolean[]{true, false, true, true}, Conversion.hexDigitMsb0ToBinary('b'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25079);assertBinaryEquals(
            new boolean[]{true, true, false, false}, Conversion.hexDigitMsb0ToBinary('C'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25080);assertBinaryEquals(
            new boolean[]{true, true, false, false}, Conversion.hexDigitMsb0ToBinary('c'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25081);assertBinaryEquals(
            new boolean[]{true, true, false, true}, Conversion.hexDigitMsb0ToBinary('D'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25082);assertBinaryEquals(
            new boolean[]{true, true, false, true}, Conversion.hexDigitMsb0ToBinary('d'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25083);assertBinaryEquals(
            new boolean[]{true, true, true, false}, Conversion.hexDigitMsb0ToBinary('E'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25084);assertBinaryEquals(
            new boolean[]{true, true, true, false}, Conversion.hexDigitMsb0ToBinary('e'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25085);assertBinaryEquals(
            new boolean[]{true, true, true, true}, Conversion.hexDigitMsb0ToBinary('F'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25086);assertBinaryEquals(
            new boolean[]{true, true, true, true}, Conversion.hexDigitMsb0ToBinary('f'));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25087);try {
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25088);Conversion.hexDigitMsb0ToBinary('G');
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25089);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToHexDigit(boolean[])}.
     */
    @Test
    public void testBinaryToHexDigit() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kqfhhjjcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToHexDigit",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25090,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kqfhhjjcy(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25090);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25091);assertEquals(
            '0', Conversion.binaryToHexDigit(new boolean[]{false, false, false, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25092);assertEquals('1', Conversion.binaryToHexDigit(new boolean[]{true, false, false, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25093);assertEquals('2', Conversion.binaryToHexDigit(new boolean[]{false, true, false, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25094);assertEquals('3', Conversion.binaryToHexDigit(new boolean[]{true, true, false, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25095);assertEquals('4', Conversion.binaryToHexDigit(new boolean[]{false, false, true, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25096);assertEquals('5', Conversion.binaryToHexDigit(new boolean[]{true, false, true, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25097);assertEquals('6', Conversion.binaryToHexDigit(new boolean[]{false, true, true, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25098);assertEquals('7', Conversion.binaryToHexDigit(new boolean[]{true, true, true, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25099);assertEquals('8', Conversion.binaryToHexDigit(new boolean[]{false, false, false, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25100);assertEquals('9', Conversion.binaryToHexDigit(new boolean[]{true, false, false, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25101);assertEquals('a', Conversion.binaryToHexDigit(new boolean[]{false, true, false, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25102);assertEquals('b', Conversion.binaryToHexDigit(new boolean[]{true, true, false, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25103);assertEquals('c', Conversion.binaryToHexDigit(new boolean[]{false, false, true, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25104);assertEquals('d', Conversion.binaryToHexDigit(new boolean[]{true, false, true, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25105);assertEquals('e', Conversion.binaryToHexDigit(new boolean[]{false, true, true, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25106);assertEquals('f', Conversion.binaryToHexDigit(new boolean[]{true, true, true, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25107);assertEquals('1', Conversion.binaryToHexDigit(new boolean[]{true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25108);assertEquals(
            'f', Conversion.binaryToHexDigit(new boolean[]{true, true, true, true, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25109);try {
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25110);Conversion.binaryToHexDigit(new boolean[]{});
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25111);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryBeMsb0ToHexDigit(boolean[], int)}.
     */
    @Test
    public void testBinaryToHexDigit_2args() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yy859ljdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToHexDigit_2args",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25112,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yy859ljdk(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25112);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25113);final boolean[] shortArray = new boolean[]{false, true, true};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25114);assertEquals('6', Conversion.binaryToHexDigit(shortArray, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25115);assertEquals('3', Conversion.binaryToHexDigit(shortArray, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25116);assertEquals('1', Conversion.binaryToHexDigit(shortArray, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25117);final boolean[] longArray = new boolean[]{true, false, true, false, false, true, true};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25118);assertEquals('5', Conversion.binaryToHexDigit(longArray, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25119);assertEquals('2', Conversion.binaryToHexDigit(longArray, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25120);assertEquals('9', Conversion.binaryToHexDigit(longArray, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25121);assertEquals('c', Conversion.binaryToHexDigit(longArray, 3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25122);assertEquals('6', Conversion.binaryToHexDigit(longArray, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25123);assertEquals('3', Conversion.binaryToHexDigit(longArray, 5));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25124);assertEquals('1', Conversion.binaryToHexDigit(longArray, 6));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToHexDigitMsb0_4bits(boolean[])}.
     */
    @Test
    public void testBinaryToHexDigitMsb0_bits() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ktc8ojdx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToHexDigitMsb0_bits",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25125,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ktc8ojdx(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25125);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25126);assertEquals(
            '0',
            Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, false, false, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25127);assertEquals(
            '1',
            Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, false, false, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25128);assertEquals(
            '2',
            Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, false, true, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25129);assertEquals(
            '3', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, false, true, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25130);assertEquals(
            '4',
            Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, true, false, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25131);assertEquals(
            '5', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, true, false, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25132);assertEquals(
            '6', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, true, true, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25133);assertEquals(
            '7', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{false, true, true, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25134);assertEquals(
            '8',
            Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, false, false, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25135);assertEquals(
            '9', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, false, false, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25136);assertEquals(
            'a', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, false, true, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25137);assertEquals(
            'b', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, false, true, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25138);assertEquals(
            'c', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, true, false, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25139);assertEquals(
            'd', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, true, false, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25140);assertEquals(
            'e', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, true, true, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25141);assertEquals(
            'f', Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{true, true, true, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25142);try {
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25143);Conversion.binaryToHexDigitMsb0_4bits(new boolean[]{});
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25144);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToHexDigitMsb0_4bits(boolean[], int)}.
     */
    @Test
    public void testBinaryToHexDigitMsb0_4bits_2args() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22r60jejeh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToHexDigitMsb0_4bits_2args",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25145,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22r60jejeh(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25145);
        // boolean[] shortArray = new boolean[]{true,true,false};
        // assertEquals('6', Conversion.BinaryToHexDigitMsb0(shortArray,0));
        // assertEquals('3', Conversion.BinaryToHexDigitMsb0(shortArray,1));
        // assertEquals('1', Conversion.BinaryToHexDigitMsb0(shortArray,2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25146);final boolean[] shortArray = new boolean[]{true, true, false, true};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25147);assertEquals('d', Conversion.binaryToHexDigitMsb0_4bits(shortArray, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25148);final boolean[] longArray = new boolean[]{true, false, true, false, false, true, true};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25149);assertEquals('a', Conversion.binaryToHexDigitMsb0_4bits(longArray, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25150);assertEquals('4', Conversion.binaryToHexDigitMsb0_4bits(longArray, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25151);assertEquals('9', Conversion.binaryToHexDigitMsb0_4bits(longArray, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25152);assertEquals('3', Conversion.binaryToHexDigitMsb0_4bits(longArray, 3));
        // assertEquals('6', Conversion.BinaryToHexDigitMsb0(longArray,4));
        // assertEquals('3', Conversion.BinaryToHexDigitMsb0(longArray,5));
        // assertEquals('1', Conversion.BinaryToHexDigitMsb0(longArray,6));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25153);final boolean[] maxLengthArray = new boolean[]{
            true, false, true, false, false, true, true, true};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25154);assertEquals('a', Conversion.binaryToHexDigitMsb0_4bits(maxLengthArray, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25155);assertEquals('4', Conversion.binaryToHexDigitMsb0_4bits(maxLengthArray, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25156);assertEquals('9', Conversion.binaryToHexDigitMsb0_4bits(maxLengthArray, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25157);assertEquals('3', Conversion.binaryToHexDigitMsb0_4bits(maxLengthArray, 3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25158);assertEquals('7', Conversion.binaryToHexDigitMsb0_4bits(maxLengthArray, 4));
        // assertEquals('7', Conversion.BinaryToHexDigitMsb0(longArray,5));
        // assertEquals('3', Conversion.BinaryToHexDigitMsb0(longArray,6));
        // assertEquals('1', Conversion.BinaryToHexDigitMsb0(longArray,7));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25159);final boolean[] javaDocCheck = new boolean[]{
            true, false, false, true, true, false, true, false};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25160);assertEquals('d', Conversion.binaryToHexDigitMsb0_4bits(javaDocCheck, 3));

    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToHexDigit(boolean[])}.
     */
    @Test
    public void testBinaryBeMsb0ToHexDigit() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x3owpqjex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryBeMsb0ToHexDigit",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25161,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x3owpqjex(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25161);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25162);assertEquals(
            '0', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, false, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25163);assertEquals(
            '1', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, false, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25164);assertEquals(
            '2', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, true, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25165);assertEquals(
            '3', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, false, true, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25166);assertEquals(
            '4', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, false, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25167);assertEquals(
            '5', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, false, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25168);assertEquals(
            '6', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, true, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25169);assertEquals(
            '7', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{false, true, true, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25170);assertEquals(
            '8', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, false, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25171);assertEquals(
            '9', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, false, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25172);assertEquals(
            'a', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, true, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25173);assertEquals(
            'b', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, false, true, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25174);assertEquals(
            'c', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, true, false, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25175);assertEquals(
            'd', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, true, false, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25176);assertEquals(
            'e', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, true, true, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25177);assertEquals(
            'f', Conversion.binaryBeMsb0ToHexDigit(new boolean[]{true, true, true, true}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25178);assertEquals(
            '4',
            Conversion.binaryBeMsb0ToHexDigit(new boolean[]{
                true, false, false, false, false, false, false, false, false, false, false,
                false, false, true, false, false}));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25179);try {
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25180);Conversion.binaryBeMsb0ToHexDigit(new boolean[]{});
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25181);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToHexDigit(boolean[], int)}.
     */
    @Test
    public void testBinaryBeMsb0ToHexDigit_2args() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21005uajfi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryBeMsb0ToHexDigit_2args",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25182,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21005uajfi(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25182);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25183);assertEquals(
            '5',
            Conversion.binaryBeMsb0ToHexDigit(new boolean[]{
                true, false, false, false, false, false, false, false, false, false, false,
                true, false, true, false, false}, 2));

        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25184);final boolean[] shortArray = new boolean[]{true, true, false};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25185);assertEquals('6', Conversion.binaryBeMsb0ToHexDigit(shortArray, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25186);assertEquals('3', Conversion.binaryBeMsb0ToHexDigit(shortArray, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25187);assertEquals('1', Conversion.binaryBeMsb0ToHexDigit(shortArray, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25188);final boolean[] shortArray2 = new boolean[]{true, true, true, false, false, true, false, true};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25189);assertEquals('5', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25190);assertEquals('2', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25191);assertEquals('9', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25192);assertEquals('c', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25193);assertEquals('e', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25194);assertEquals('7', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 5));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25195);assertEquals('3', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 6));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25196);assertEquals('1', Conversion.binaryBeMsb0ToHexDigit(shortArray2, 7));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25197);final boolean[] multiBytesArray = new boolean[]{
            true, true, false, false, true, false, true, false, true, true, true, false, false,
            true, false, true};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25198);assertEquals('5', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25199);assertEquals('2', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25200);assertEquals('9', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25201);assertEquals('c', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25202);assertEquals('e', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25203);assertEquals('7', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 5));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25204);assertEquals('b', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 6));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25205);assertEquals('5', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 7));

        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25206);assertEquals('a', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25207);assertEquals('5', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 9));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25208);assertEquals('2', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 10));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25209);assertEquals('9', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 11));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25210);assertEquals('c', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 12));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25211);assertEquals('6', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 13));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25212);assertEquals('3', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 14));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25213);assertEquals('1', Conversion.binaryBeMsb0ToHexDigit(multiBytesArray, 15));

    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intToHexDigit(int)}.
     */
    @Test
    public void testIntToHexDigit() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vngdhtjge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntToHexDigit",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25214,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vngdhtjge(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25214);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25215);assertEquals('0', Conversion.intToHexDigit(0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25216);assertEquals('1', Conversion.intToHexDigit(1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25217);assertEquals('2', Conversion.intToHexDigit(2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25218);assertEquals('3', Conversion.intToHexDigit(3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25219);assertEquals('4', Conversion.intToHexDigit(4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25220);assertEquals('5', Conversion.intToHexDigit(5));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25221);assertEquals('6', Conversion.intToHexDigit(6));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25222);assertEquals('7', Conversion.intToHexDigit(7));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25223);assertEquals('8', Conversion.intToHexDigit(8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25224);assertEquals('9', Conversion.intToHexDigit(9));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25225);assertEquals('a', Conversion.intToHexDigit(10));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25226);assertEquals('b', Conversion.intToHexDigit(11));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25227);assertEquals('c', Conversion.intToHexDigit(12));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25228);assertEquals('d', Conversion.intToHexDigit(13));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25229);assertEquals('e', Conversion.intToHexDigit(14));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25230);assertEquals('f', Conversion.intToHexDigit(15));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25231);try {
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25232);Conversion.intToHexDigit(16);
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25233);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intToHexDigitMsb0(int)}.
     */
    @Test
    public void testIntToHexDigitMsb0() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oje9qzjgy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntToHexDigitMsb0",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25234,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oje9qzjgy(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25234);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25235);assertEquals('0', Conversion.intToHexDigitMsb0(0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25236);assertEquals('8', Conversion.intToHexDigitMsb0(1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25237);assertEquals('4', Conversion.intToHexDigitMsb0(2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25238);assertEquals('c', Conversion.intToHexDigitMsb0(3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25239);assertEquals('2', Conversion.intToHexDigitMsb0(4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25240);assertEquals('a', Conversion.intToHexDigitMsb0(5));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25241);assertEquals('6', Conversion.intToHexDigitMsb0(6));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25242);assertEquals('e', Conversion.intToHexDigitMsb0(7));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25243);assertEquals('1', Conversion.intToHexDigitMsb0(8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25244);assertEquals('9', Conversion.intToHexDigitMsb0(9));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25245);assertEquals('5', Conversion.intToHexDigitMsb0(10));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25246);assertEquals('d', Conversion.intToHexDigitMsb0(11));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25247);assertEquals('3', Conversion.intToHexDigitMsb0(12));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25248);assertEquals('b', Conversion.intToHexDigitMsb0(13));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25249);assertEquals('7', Conversion.intToHexDigitMsb0(14));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25250);assertEquals('f', Conversion.intToHexDigitMsb0(15));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25251);try {
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25252);Conversion.intToHexDigitMsb0(16);
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25253);fail("Thrown " + IllegalArgumentException.class.getName() + " expected");
        } catch (final IllegalArgumentException e) {
            // OK
        }
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    static String dbgPrint(final boolean[] src) {try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25254);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25255);final StringBuilder sb = new StringBuilder();
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25256);for (final boolean e : src) {{
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25257);if ((((e)&&(__CLR4_1_2ja2ja2l3lqxtun.R.iget(25258)!=0|true))||(__CLR4_1_2ja2ja2l3lqxtun.R.iget(25259)==0&false))) {{
                __CLR4_1_2ja2ja2l3lqxtun.R.inc(25260);sb.append("1,");
            } }else {{
                __CLR4_1_2ja2ja2l3lqxtun.R.inc(25261);sb.append("0,");
            }
        }}
        }__CLR4_1_2ja2ja2l3lqxtun.R.inc(25262);final String out = sb.toString();
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25263);return out.substring(0, out.length() - 1);
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    // org.junit.Assert(boolean[], boolean[]) does not exist in JUnit 4.2
    static void assertBinaryEquals(final boolean[] expected, final boolean[] actual) {try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25264);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25265);assertEquals(expected.length, actual.length);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25266);for (int i = 0; (((i < expected.length)&&(__CLR4_1_2ja2ja2l3lqxtun.R.iget(25267)!=0|true))||(__CLR4_1_2ja2ja2l3lqxtun.R.iget(25268)==0&false)); i++ ) {{
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25269);try {
                __CLR4_1_2ja2ja2l3lqxtun.R.inc(25270);assertEquals(expected[i], actual[i]);
            } catch (final Throwable e) {
                __CLR4_1_2ja2ja2l3lqxtun.R.inc(25271);final String msg = "Mismatch at index "
                    + i
                    + " between:\n"
                    + dbgPrint(expected)
                    + " and\n"
                    + dbgPrint(actual);
                __CLR4_1_2ja2ja2l3lqxtun.R.inc(25272);fail(msg + "\n" + e.getMessage());
            }
        }
    }}finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intArrayToLong(int[], int, long, int, int)}.
     */
    @Test
    public void testIntArrayToLong() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lsxm2iji1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntArrayToLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25273,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lsxm2iji1(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25273);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25274);final int[] src = new int[]{0xCDF1F0C1, 0x0F123456, 0x78000000};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25275);assertEquals(0x0000000000000000L, Conversion.intArrayToLong(src, 0, 0L, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25276);assertEquals(0x0000000000000000L, Conversion.intArrayToLong(src, 1, 0L, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25277);assertEquals(0x00000000CDF1F0C1L, Conversion.intArrayToLong(src, 0, 0L, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25278);assertEquals(0x0F123456CDF1F0C1L, Conversion.intArrayToLong(src, 0, 0L, 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25279);assertEquals(0x000000000F123456L, Conversion.intArrayToLong(src, 1, 0L, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25280);assertEquals(
            0x123456789ABCDEF0L, Conversion.intArrayToLong(src, 0, 0x123456789ABCDEF0L, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25281);assertEquals(
            0x1234567878000000L, Conversion.intArrayToLong(src, 2, 0x123456789ABCDEF0L, 0, 1));
        // assertEquals(0x0F12345678000000L,Conversion.intsToLong(src,1,0x123456789ABCDEF0L,32,2));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#shortArrayToLong(short[], int, long, int, int)}.
     */
    @Test
    public void testShortArrayToLong() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2627q8jjia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testShortArrayToLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25282,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2627q8jjia(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25282);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25283);final short[] src = new short[]{
            (short)0xCDF1, (short)0xF0C1, (short)0x0F12, (short)0x3456, (short)0x7800};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25284);assertEquals(0x0000000000000000L, Conversion.shortArrayToLong(src, 0, 0L, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25285);assertEquals(0x000000000000CDF1L, Conversion.shortArrayToLong(src, 0, 0L, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25286);assertEquals(0x00000000F0C1CDF1L, Conversion.shortArrayToLong(src, 0, 0L, 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25287);assertEquals(0x780034560F12F0C1L, Conversion.shortArrayToLong(src, 1, 0L, 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25288);assertEquals(
            0x123456789ABCDEF0L, Conversion.shortArrayToLong(src, 0, 0x123456789ABCDEF0L, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25289);assertEquals(
            0x123456CDF1BCDEF0L,
            Conversion.shortArrayToLong(src, 0, 0x123456789ABCDEF0L, 24, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25290);assertEquals(
            0x123478003456DEF0L,
            Conversion.shortArrayToLong(src, 3, 0x123456789ABCDEF0L, 16, 2));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#byteArrayToLong(byte[], int, long, int, int)}.
     */
    @Test
    public void testByteArrayToLong() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cnqipvjij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testByteArrayToLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25291,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cnqipvjij(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25291);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25292);final byte[] src = new byte[]{
            (byte)0xCD, (byte)0xF1, (byte)0xF0, (byte)0xC1, (byte)0x0F, (byte)0x12, (byte)0x34,
            (byte)0x56, (byte)0x78};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25293);assertEquals(0x0000000000000000L, Conversion.byteArrayToLong(src, 0, 0L, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25294);assertEquals(0x00000000000000CDL, Conversion.byteArrayToLong(src, 0, 0L, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25295);assertEquals(0x00000000C1F0F1CDL, Conversion.byteArrayToLong(src, 0, 0L, 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25296);assertEquals(0x000000000FC1F0F1L, Conversion.byteArrayToLong(src, 1, 0L, 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25297);assertEquals(
            0x123456789ABCDEF0L, Conversion.byteArrayToLong(src, 0, 0x123456789ABCDEF0L, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25298);assertEquals(
            0x12345678CDBCDEF0L, Conversion.byteArrayToLong(src, 0, 0x123456789ABCDEF0L, 24, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25299);assertEquals(
            0x123456789A7856F0L, Conversion.byteArrayToLong(src, 7, 0x123456789ABCDEF0L, 8, 2));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#shortArrayToInt(short[], int, int, int, int)}.
     */
    @Test
    public void testShortArrayToInt() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21s49asjis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testShortArrayToInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25300,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21s49asjis(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25300);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25301);final short[] src = new short[]{
            (short)0xCDF1, (short)0xF0C1, (short)0x0F12, (short)0x3456, (short)0x7800};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25302);assertEquals(0x00000000, Conversion.shortArrayToInt(src, 0, 0, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25303);assertEquals(0x0000CDF1, Conversion.shortArrayToInt(src, 0, 0, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25304);assertEquals(0xF0C1CDF1, Conversion.shortArrayToInt(src, 0, 0, 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25305);assertEquals(0x0F12F0C1, Conversion.shortArrayToInt(src, 1, 0, 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25306);assertEquals(0x12345678, Conversion.shortArrayToInt(src, 0, 0x12345678, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25307);assertEquals(0xCDF15678, Conversion.shortArrayToInt(src, 0, 0x12345678, 16, 1));
        // assertEquals(0x34567800,Conversion.ShortArrayToInt(src, 3, 0x12345678, 16, 2));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#byteArrayToInt(byte[], int, int, int, int)}.
     */
    @Test
    public void testByteArrayToInt() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27663z0jj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testByteArrayToInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25308,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27663z0jj0(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25308);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25309);final byte[] src = new byte[]{
            (byte)0xCD, (byte)0xF1, (byte)0xF0, (byte)0xC1, (byte)0x0F, (byte)0x12, (byte)0x34,
            (byte)0x56, (byte)0x78};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25310);assertEquals(0x00000000, Conversion.byteArrayToInt(src, 0, 0, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25311);assertEquals(0x000000CD, Conversion.byteArrayToInt(src, 0, 0, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25312);assertEquals(0xC1F0F1CD, Conversion.byteArrayToInt(src, 0, 0, 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25313);assertEquals(0x0FC1F0F1, Conversion.byteArrayToInt(src, 1, 0, 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25314);assertEquals(0x12345678, Conversion.byteArrayToInt(src, 0, 0x12345678, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25315);assertEquals(0xCD345678, Conversion.byteArrayToInt(src, 0, 0x12345678, 24, 1));
        // assertEquals(0x56341278,Conversion.ByteArrayToInt(src, 5, 0x01234567, 8, 4));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#byteArrayToShort(byte[], int, short, int, int)}.
     */
    @Test
    public void testByteArrayToShort() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_212zlzdjj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testByteArrayToShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25316,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_212zlzdjj8(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25316);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25317);final byte[] src = new byte[]{
            (byte)0xCD, (byte)0xF1, (byte)0xF0, (byte)0xC1, (byte)0x0F, (byte)0x12, (byte)0x34,
            (byte)0x56, (byte)0x78};
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25318);assertEquals((short)0x0000, Conversion.byteArrayToShort(src, 0, (short)0, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25319);assertEquals((short)0x00CD, Conversion.byteArrayToShort(src, 0, (short)0, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25320);assertEquals((short)0xF1CD, Conversion.byteArrayToShort(src, 0, (short)0, 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25321);assertEquals((short)0xF0F1, Conversion.byteArrayToShort(src, 1, (short)0, 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25322);assertEquals((short)0x1234, Conversion.byteArrayToShort(src, 0, (short)0x1234, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25323);assertEquals((short)0xCD34, Conversion.byteArrayToShort(src, 0, (short)0x1234, 8, 1));
        // assertEquals((short)0x5678,Conversion.ByteArrayToShort(src, 7, (short) 0x0123, 8,
        // 2));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexToLong(String, int, long, int, int)}.
     */
    @Test
    public void testHexToLong() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oievdzjjg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexToLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25324,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oievdzjjg(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25324);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25325);final String src = "CDF1F0C10F12345678";
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25326);assertEquals(0x0000000000000000L, Conversion.hexToLong(src, 0, 0L, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25327);assertEquals(0x000000000000000CL, Conversion.hexToLong(src, 0, 0L, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25328);assertEquals(0x000000001C0F1FDCL, Conversion.hexToLong(src, 0, 0L, 0, 8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25329);assertEquals(0x0000000001C0F1FDL, Conversion.hexToLong(src, 1, 0L, 0, 8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25330);assertEquals(
            0x123456798ABCDEF0L, Conversion.hexToLong(src, 0, 0x123456798ABCDEF0L, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25331);assertEquals(
            0x1234567876BCDEF0L, Conversion.hexToLong(src, 15, 0x123456798ABCDEF0L, 24, 3));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexToInt(String, int, int, int, int)}.
     */
    @Test
    public void testHexToInt() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2va7lbmjjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexToInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25332,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2va7lbmjjo(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25332);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25333);final String src = "CDF1F0C10F12345678";
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25334);assertEquals(0x00000000, Conversion.hexToInt(src, 0, 0, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25335);assertEquals(0x0000000C, Conversion.hexToInt(src, 0, 0, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25336);assertEquals(0x1C0F1FDC, Conversion.hexToInt(src, 0, 0, 0, 8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25337);assertEquals(0x01C0F1FD, Conversion.hexToInt(src, 1, 0, 0, 8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25338);assertEquals(0x12345679, Conversion.hexToInt(src, 0, 0x12345679, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25339);assertEquals(0x87645679, Conversion.hexToInt(src, 15, 0x12345679, 20, 3));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexToShort(String, int, short, int, int)}.
     */
    @Test
    public void testHexToShort() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gvtvofjjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexToShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25340,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gvtvofjjw(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25340);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25341);final String src = "CDF1F0C10F12345678";
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25342);assertEquals((short)0x0000, Conversion.hexToShort(src, 0, (short)0, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25343);assertEquals((short)0x000C, Conversion.hexToShort(src, 0, (short)0, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25344);assertEquals((short)0x1FDC, Conversion.hexToShort(src, 0, (short)0, 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25345);assertEquals((short)0xF1FD, Conversion.hexToShort(src, 1, (short)0, 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25346);assertEquals((short)0x1234, Conversion.hexToShort(src, 0, (short)0x1234, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25347);assertEquals((short)0x8764, Conversion.hexToShort(src, 15, (short)0x1234, 4, 3));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#hexToByte(String, int, byte, int, int)}.
     */
    @Test
    public void testHexToByte() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fm13m5jk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testHexToByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25348,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fm13m5jk4(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25348);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25349);final String src = "CDF1F0C10F12345678";
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25350);assertEquals((byte)0x00, Conversion.hexToByte(src, 0, (byte)0, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25351);assertEquals((byte)0x0C, Conversion.hexToByte(src, 0, (byte)0, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25352);assertEquals((byte)0xDC, Conversion.hexToByte(src, 0, (byte)0, 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25353);assertEquals((byte)0xFD, Conversion.hexToByte(src, 1, (byte)0, 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25354);assertEquals((byte)0x34, Conversion.hexToByte(src, 0, (byte)0x34, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25355);assertEquals((byte)0x84, Conversion.hexToByte(src, 17, (byte)0x34, 4, 1));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToLong(boolean[], int, long, int, int)}.
     */
    @Test
    public void testBinaryToLong() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27v4i41jkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25356,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27v4i41jkc(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25356);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25357);final boolean[] src = new boolean[]{
            false, false, true, true, true, false, true, true, true, true, true, true, true,
            false, false, false, true, true, true, true, false, false, false, false, false,
            false, true, true, true, false, false, false, false, false, false, false, true,
            true, true, true, true, false, false, false, false, true, false, false, true, true,
            false, false, false, false, true, false, true, false, true, false, false, true,
            true, false, true, true, true, false, false, false, false, true};
        // conversion of "CDF1F0C10F12345678" by HexToBinary
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25358);assertEquals(0x0000000000000000L, Conversion.binaryToLong(src, 0, 0L, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25359);assertEquals(0x000000000000000CL, Conversion.binaryToLong(src, 0, 0L, 0, 1 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25360);assertEquals(0x000000001C0F1FDCL, Conversion.binaryToLong(src, 0, 0L, 0, 8 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25361);assertEquals(0x0000000001C0F1FDL, Conversion.binaryToLong(src, 1 * 4, 0L, 0, 8 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25362);assertEquals(
            0x123456798ABCDEF0L, Conversion.binaryToLong(src, 0, 0x123456798ABCDEF0L, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25363);assertEquals(
            0x1234567876BCDEF0L,
            Conversion.binaryToLong(src, 15 * 4, 0x123456798ABCDEF0L, 24, 3 * 4));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToInt(boolean[], int, int, int, int)}.
     */
    @Test
    public void testBinaryToInt() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cez8rsjkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25364,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cez8rsjkk(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25364);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25365);final boolean[] src = new boolean[]{
            false, false, true, true, true, false, true, true, true, true, true, true, true,
            false, false, false, true, true, true, true, false, false, false, false, false,
            false, true, true, true, false, false, false, false, false, false, false, true,
            true, true, true, true, false, false, false, false, true, false, false, true, true,
            false, false, false, false, true, false, true, false, true, false, false, true,
            true, false, true, true, true, false, false, false, false, true};
        // conversion of "CDF1F0C10F12345678" by HexToBinary
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25366);assertEquals(0x00000000, Conversion.binaryToInt(src, 0 * 4, 0, 0, 0 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25367);assertEquals(0x0000000C, Conversion.binaryToInt(src, 0 * 4, 0, 0, 1 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25368);assertEquals(0x1C0F1FDC, Conversion.binaryToInt(src, 0 * 4, 0, 0, 8 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25369);assertEquals(0x01C0F1FD, Conversion.binaryToInt(src, 1 * 4, 0, 0, 8 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25370);assertEquals(0x12345679, Conversion.binaryToInt(src, 0 * 4, 0x12345679, 0, 0 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25371);assertEquals(0x87645679, Conversion.binaryToInt(src, 15 * 4, 0x12345679, 20, 3 * 4));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToShort(boolean[], int, short, int, int)}.
     */
    @Test
    public void testBinaryToShort() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21yb623jks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25372,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21yb623jks(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25372);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25373);final boolean[] src = new boolean[]{
            false, false, true, true, true, false, true, true, true, true, true, true, true,
            false, false, false, true, true, true, true, false, false, false, false, false,
            false, true, true, true, false, false, false, false, false, false, false, true,
            true, true, true, true, false, false, false, false, true, false, false, true, true,
            false, false, false, false, true, false, true, false, true, false, false, true,
            true, false, true, true, true, false, false, false, false, true};
        // conversion of "CDF1F0C10F12345678" by HexToBinary
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25374);assertEquals((short)0x0000, Conversion.binaryToShort(src, 0 * 4, (short)0, 0, 0 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25375);assertEquals((short)0x000C, Conversion.binaryToShort(src, 0 * 4, (short)0, 0, 1 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25376);assertEquals((short)0x1FDC, Conversion.binaryToShort(src, 0 * 4, (short)0, 0, 4 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25377);assertEquals((short)0xF1FD, Conversion.binaryToShort(src, 1 * 4, (short)0, 0, 4 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25378);assertEquals(
            (short)0x1234, Conversion.binaryToShort(src, 0 * 4, (short)0x1234, 0, 0 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25379);assertEquals(
            (short)0x8764, Conversion.binaryToShort(src, 15 * 4, (short)0x1234, 4, 3 * 4));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#binaryToByte(boolean[], int, byte, int, int)}.
     */
    @Test
    public void testBinaryToByte() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w9bgw3jl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testBinaryToByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25380,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w9bgw3jl0(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25380);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25381);final boolean[] src = new boolean[]{
            false, false, true, true, true, false, true, true, true, true, true, true, true,
            false, false, false, true, true, true, true, false, false, false, false, false,
            false, true, true, true, false, false, false, false, false, false, false, true,
            true, true, true, true, false, false, false, false, true, false, false, true, true,
            false, false, false, false, true, false, true, false, true, false, false, true,
            true, false, true, true, true, false, false, false, false, true};
        // conversion of "CDF1F0C10F12345678" by HexToBinary
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25382);assertEquals((byte)0x00, Conversion.binaryToByte(src, 0 * 4, (byte)0, 0, 0 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25383);assertEquals((byte)0x0C, Conversion.binaryToByte(src, 0 * 4, (byte)0, 0, 1 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25384);assertEquals((byte)0xDC, Conversion.binaryToByte(src, 0 * 4, (byte)0, 0, 2 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25385);assertEquals((byte)0xFD, Conversion.binaryToByte(src, 1 * 4, (byte)0, 0, 2 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25386);assertEquals((byte)0x34, Conversion.binaryToByte(src, 0 * 4, (byte)0x34, 0, 0 * 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25387);assertEquals((byte)0x84, Conversion.binaryToByte(src, 17 * 4, (byte)0x34, 4, 1 * 4));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#longToIntArray(long, int, int[], int, int)}.
     */
    @Test
    public void testLongToIntArray() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jco8w6jl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testLongToIntArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25388,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jco8w6jl8(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25388);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25389);assertArrayEquals(
            new int[]{}, Conversion.longToIntArray(0x0000000000000000L, 0, new int[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25390);assertArrayEquals(
            new int[]{}, Conversion.longToIntArray(0x0000000000000000L, 100, new int[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25391);assertArrayEquals(
            new int[]{}, Conversion.longToIntArray(0x0000000000000000L, 0, new int[]{}, 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25392);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 0, new int[]{-1, -1, -1, -1}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25393);assertArrayEquals(
            new int[]{0x90ABCDEF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 0, new int[]{-1, -1, -1, -1}, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25394);assertArrayEquals(
            new int[]{0x90ABCDEF, 0x12345678, 0xFFFFFFFF, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 0, new int[]{-1, -1, -1, -1}, 0, 2));
        // assertArrayEquals(new
        // int[]{0x90ABCDEF,0x12345678,0x90ABCDEF,0x12345678},Conversion.longToIntArray(0x1234567890ABCDEFL,
        // 0,new int[]{-1,-1,-1,-1},0,4));//rejected by assertion
        // assertArrayEquals(new
        // int[]{0xFFFFFFFF,0x90ABCDEF,0x12345678,0x90ABCDEF},Conversion.longToIntArray(0x1234567890ABCDEFL,
        // 0,new int[]{-1,-1,-1,-1},1,3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25395);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0x90ABCDEF, 0x12345678},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 0, new int[]{-1, -1, -1, -1}, 2, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25396);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0x90ABCDEF, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 0, new int[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25397);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0x90ABCDEF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 0, new int[]{-1, -1, -1, -1}, 3, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25398);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0x4855E6F7, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 1, new int[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25399);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0x242AF37B, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 2, new int[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25400);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0x121579BD, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 3, new int[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25401);assertArrayEquals(
            new int[]{0xFFFFFFFF, 0xFFFFFFFF, 0x890ABCDE, 0xFFFFFFFF},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 4, new int[]{-1, -1, -1, -1}, 2, 1));
        // assertArrayEquals(new
        // int[]{0x4855E6F7,0x091A2B3C,0x4855E6F7,0x091A2B3C},Conversion.longToIntArray(0x1234567890ABCDEFL,
        // 1,new int[]{-1,-1,-1,-1},0,4));//rejected by assertion
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25402);assertArrayEquals(
            new int[]{0x091A2B3C},
            Conversion.longToIntArray(0x1234567890ABCDEFL, 33, new int[]{0}, 0, 1));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#longToShortArray(long, int, short[], int, int)}.
     */
    @Test
    public void testLongToShortArray() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hf5d65jln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testLongToShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25403,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hf5d65jln(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25403);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25404);assertArrayEquals(
            new short[]{},
            Conversion.longToShortArray(0x0000000000000000L, 0, new short[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25405);assertArrayEquals(
            new short[]{},
            Conversion.longToShortArray(0x0000000000000000L, 100, new short[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25406);assertArrayEquals(
            new short[]{},
            Conversion.longToShortArray(0x0000000000000000L, 0, new short[]{}, 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25407);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xFFFF, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25408);assertArrayEquals(
            new short[]{(short)0xCDEF, (short)0xFFFF, (short)0xFFFF, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25409);assertArrayEquals(
            new short[]{(short)0xCDEF, (short)0x90AB, (short)0xFFFF, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25410);assertArrayEquals(
            new short[]{(short)0xCDEF, (short)0x90AB, (short)0x5678, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 0, 3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25411);assertArrayEquals(
            new short[]{(short)0xCDEF, (short)0x90AB, (short)0x5678, (short)0x1234},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25412);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xCDEF, (short)0x90AB, (short)0x5678},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 1, 3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25413);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xCDEF, (short)0x90AB},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 2, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25414);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xCDEF, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25415);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xFFFF, (short)0xCDEF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 0, new short[]{-1, -1, -1, -1}, 3, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25416);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xE6F7, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 1, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25417);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xF37B, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 2, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25418);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x79BD, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 3, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25419);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xBCDE, (short)0xFFFF},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 4, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25420);assertArrayEquals(
            new short[]{(short)0xE6F7, (short)0x4855, (short)0x2B3C, (short)0x091A},
            Conversion.longToShortArray(
                0x1234567890ABCDEFL, 1, new short[]{-1, -1, -1, -1}, 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25421);assertArrayEquals(
            new short[]{(short)0x2B3C},
            Conversion.longToShortArray(0x1234567890ABCDEFL, 33, new short[]{0}, 0, 1));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intToShortArray(int, int, short[], int, int)}.
     */
    @Test
    public void testIntToShortArray() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25um3s4jm6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntToShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25422,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25um3s4jm6(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25422);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25423);assertArrayEquals(
            new short[]{}, Conversion.intToShortArray(0x00000000, 0, new short[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25424);assertArrayEquals(
            new short[]{}, Conversion.intToShortArray(0x00000000, 100, new short[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25425);assertArrayEquals(
            new short[]{}, Conversion.intToShortArray(0x00000000, 0, new short[]{}, 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25426);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xFFFF, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 0, new short[]{-1, -1, -1, -1}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25427);assertArrayEquals(
            new short[]{(short)0x5678, (short)0xFFFF, (short)0xFFFF, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 0, new short[]{-1, -1, -1, -1}, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25428);assertArrayEquals(
            new short[]{(short)0x5678, (short)0x1234, (short)0xFFFF, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 0, new short[]{-1, -1, -1, -1}, 0, 2));
        // assertArrayEquals(new
        // short[]{(short)0x5678,(short)0x1234,(short)0x5678,(short)0xFFFF},Conversion.intToShortArray(0x12345678,
        // 0,new short[]{-1,-1,-1,-1},0,3));//rejected by assertion
        // assertArrayEquals(new
        // short[]{(short)0x5678,(short)0x1234,(short)0x5678,(short)0x1234},Conversion.intToShortArray(0x12345678,
        // 0,new short[]{-1,-1,-1,-1},0,4));
        // assertArrayEquals(new
        // short[]{(short)0xFFFF,(short)0x5678,(short)0x1234,(short)0x5678},Conversion.intToShortArray(0x12345678,
        // 0,new short[]{-1,-1,-1,-1},1,3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25429);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x5678, (short)0x1234},
            Conversion.intToShortArray(0x12345678, 0, new short[]{-1, -1, -1, -1}, 2, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25430);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x5678, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 0, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25431);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0xFFFF, (short)0x5678},
            Conversion.intToShortArray(0x12345678, 0, new short[]{-1, -1, -1, -1}, 3, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25432);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x2B3C, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 1, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25433);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x159E, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 2, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25434);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x8ACF, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 3, new short[]{-1, -1, -1, -1}, 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25435);assertArrayEquals(
            new short[]{(short)0xFFFF, (short)0xFFFF, (short)0x4567, (short)0xFFFF},
            Conversion.intToShortArray(0x12345678, 4, new short[]{-1, -1, -1, -1}, 2, 1));
        // assertArrayEquals(new
        // short[]{(short)0xE6F7,(short)0x4855,(short)0x2B3C,(short)0x091A},Conversion.intToShortArray(0x12345678,
        // 1,new short[]{-1,-1,-1,-1},0,4));//rejected by assertion
        // assertArrayEquals(new
        // short[]{(short)0x2B3C},Conversion.intToShortArray(0x12345678,33,new
        // short[]{0},0,1));//rejected by assertion
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25436);assertArrayEquals(
            new short[]{(short)0x091A},
            Conversion.intToShortArray(0x12345678, 17, new short[]{0}, 0, 1));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#longToByteArray(long, int, byte[], int, int)}.
     */
    @Test
    public void testLongToByteArray() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pfi5nzjml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testLongToByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25437,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pfi5nzjml(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25437);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25438);assertArrayEquals(
            new byte[]{},
            Conversion.longToByteArray(0x0000000000000000L, 0, new byte[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25439);assertArrayEquals(
            new byte[]{},
            Conversion.longToByteArray(0x0000000000000000L, 100, new byte[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25440);assertArrayEquals(
            new byte[]{},
            Conversion.longToByteArray(0x0000000000000000L, 0, new byte[]{}, 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25441);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25442);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25443);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25444);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xAB, (byte)0x90, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25445);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xAB, (byte)0x90, (byte)0x78, (byte)0x56,
                (byte)0x34, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 7));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25446);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xAB, (byte)0x90, (byte)0x78, (byte)0x56,
                (byte)0x34, (byte)0x12, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25447);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25448);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25449);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xAB,
                (byte)0x90, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25450);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xAB,
                (byte)0x90, (byte)0x78, (byte)0x56, (byte)0x34, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 7));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25451);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xAB,
                (byte)0x90, (byte)0x78, (byte)0x56, (byte)0x34, (byte)0x12},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25452);assertArrayEquals(
            new byte[]{
                (byte)0xF7, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 1, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25453);assertArrayEquals(
            new byte[]{
                (byte)0x7B, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 2, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25454);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0x00, (byte)0xFF, (byte)0x6F, (byte)0x5E, (byte)0x85,
                (byte)0xC4, (byte)0xB3, (byte)0xA2, (byte)0x91, (byte)0x00},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 5, new byte[]{
                -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 8));
        // assertArrayEquals(new
        // byte[]{(byte)0xFF,(byte)0x00,(byte)0xFF,(byte)0x5E,(byte)0x85,(byte)0xC4,(byte)0xB3,(byte)0xA2,(byte)0x91,(byte)0x00,(byte)0x00},Conversion.longToByteArray(0x1234567890ABCDEFL,13,new
        // byte[]{-1, 0,-1,-1,-1,-1,-1,-1,-1,-1,-1},3,8));//rejected by assertion
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25455);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0x00, (byte)0xFF, (byte)0x5E, (byte)0x85, (byte)0xC4,
                (byte)0xB3, (byte)0xA2, (byte)0x91, (byte)0x00, (byte)0xFF},
            Conversion.longToByteArray(0x1234567890ABCDEFL, 13, new byte[]{
                -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 7));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intToByteArray(int, int, byte[], int, int)}.
     */
    @Test
    public void testIntToByteArray() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ius6jkjn4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntToByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25456,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ius6jkjn4(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25456);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25457);assertArrayEquals(
            new byte[]{}, Conversion.intToByteArray(0x00000000, 0, new byte[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25458);assertArrayEquals(
            new byte[]{}, Conversion.intToByteArray(0x00000000, 100, new byte[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25459);assertArrayEquals(
            new byte[]{}, Conversion.intToByteArray(0x00000000, 0, new byte[]{}, 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25460);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25461);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25462);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25463);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xAB, (byte)0x90, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25464);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25465);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25466);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xAB,
                (byte)0x90, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25467);assertArrayEquals(
            new byte[]{
                (byte)0xF7, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 1, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25468);assertArrayEquals(
            new byte[]{
                (byte)0x7B, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 2, new byte[]{
                -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25469);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0x00, (byte)0xFF, (byte)0x6F, (byte)0x5E, (byte)0x85,
                (byte)0xFC, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 5, new byte[]{
                -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 4));
        // assertArrayEquals(new
        // byte[]{(byte)0xFF,(byte)0x00,(byte)0xFF,(byte)0x5E,(byte)0x85,(byte)0xFC,(byte)0x00,(byte)0xFF,(byte)0xFF,(byte)0xFF,(byte)0xFF},Conversion.intToByteArray(0x90ABCDEF,13,new
        // byte[]{-1, 0,-1,-1,-1,-1,-1,-1,-1,-1,-1},3,4));//rejected by assertion
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25470);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0x00, (byte)0xFF, (byte)0x5E, (byte)0x85, (byte)0xFC,
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF},
            Conversion.intToByteArray(0x90ABCDEF, 13, new byte[]{
                -1, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1}, 3, 3));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#shortToByteArray(short, int, byte[], int, int)}.
     */
    @Test
    public void testShortToByteArray() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ob6j4jjnj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testShortToByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25471,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ob6j4jjnj(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25471);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25472);assertArrayEquals(
            new byte[]{}, Conversion.shortToByteArray((short)0x0000, 0, new byte[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25473);assertArrayEquals(
            new byte[]{}, Conversion.shortToByteArray((short)0x0000, 100, new byte[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25474);assertArrayEquals(
            new byte[]{}, Conversion.shortToByteArray((short)0x0000, 0, new byte[]{}, 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25475);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25476);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25477);assertArrayEquals(
            new byte[]{
                (byte)0xEF, (byte)0xCD, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25478);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 3, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25479);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xEF, (byte)0xCD, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 0, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 3, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25480);assertArrayEquals(
            new byte[]{
                (byte)0xF7, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 1, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25481);assertArrayEquals(
            new byte[]{
                (byte)0x7B, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 2, new byte[]{
                -1, -1, -1, -1, -1, -1, -1}, 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25482);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0x00, (byte)0xFF, (byte)0x6F, (byte)0xFE, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 5, new byte[]{
                -1, 0, -1, -1, -1, -1, -1}, 3, 2));
        // assertArrayEquals(new
        // byte[]{(byte)0xFF,(byte)0x00,(byte)0xFF,(byte)0x5E,(byte)0xFF,(byte)0xFF,(byte)0xFF},Conversion.shortToByteArray((short)0xCDEF,13,new
        // byte[]{-1, 0,-1,-1,-1,-1,-1},3,2));//rejected by assertion
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25483);assertArrayEquals(
            new byte[]{
                (byte)0xFF, (byte)0x00, (byte)0xFF, (byte)0xFE, (byte)0xFF, (byte)0xFF,
                (byte)0xFF}, Conversion.shortToByteArray((short)0xCDEF, 13, new byte[]{
                -1, 0, -1, -1, -1, -1, -1}, 3, 1));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#longToHex(long, int, String, int, int)}.
     */
    @Test
    public void testLongToHex() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nzl59jjnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testLongToHex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25484,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nzl59jjnw(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25484);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25485);assertEquals("", Conversion.longToHex(0x0000000000000000L, 0, "", 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25486);assertEquals("", Conversion.longToHex(0x0000000000000000L, 100, "", 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25487);assertEquals("", Conversion.longToHex(0x0000000000000000L, 0, "", 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25488);assertEquals(
            "ffffffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25489);assertEquals(
            "3fffffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDE3L, 0, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25490);assertEquals(
            "feffffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25491);assertEquals(
            "fedcffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25492);assertEquals(
            "fedcba098765432fffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 0, 15));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25493);assertEquals(
            "fedcba0987654321ffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 0, 16));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25494);assertEquals(
            "fff3ffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDE3L, 0, "ffffffffffffffffffffffff", 3, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25495);assertEquals(
            "ffffefffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 3, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25496);assertEquals(
            "ffffedcfffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 3, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25497);assertEquals(
            "ffffedcba098765432ffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 3, 15));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25498);assertEquals(
            "ffffedcba0987654321fffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 0, "ffffffffffffffffffffffff", 3, 16));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25499);assertEquals(
            "7fffffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 1, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25500);assertEquals(
            "bfffffffffffffffffffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 2, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25501);assertEquals(
            "fffdb975121fca86420fffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 3, "ffffffffffffffffffffffff", 3, 16));
        // assertEquals("ffffffffffffffffffffffff",Conversion.longToHex(0x1234567890ABCDEFL,4,"ffffffffffffffffffffffff",3,16));//rejected
        // by assertion
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25502);assertEquals(
            "fffedcba0987654321ffffff",
            Conversion.longToHex(0x1234567890ABCDEFL, 4, "ffffffffffffffffffffffff", 3, 15));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25503);assertEquals(
            "fedcba0987654321", Conversion.longToHex(0x1234567890ABCDEFL, 0, "", 0, 16));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25504);try {
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25505);Conversion.longToHex(0x1234567890ABCDEFL, 0, "", 1, 8);
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25506);fail("Thrown " + StringIndexOutOfBoundsException.class.getName() + " expected");
        } catch (final StringIndexOutOfBoundsException e) {
            // OK
        }
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intToHex(int, int, String, int, int)}.
     */
    @Test
    public void testIntToHex() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23bkvwqjoj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntToHex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25507,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23bkvwqjoj(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25507);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25508);assertEquals("", Conversion.intToHex(0x00000000, 0, "", 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25509);assertEquals("", Conversion.intToHex(0x00000000, 100, "", 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25510);assertEquals("", Conversion.intToHex(0x00000000, 0, "", 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25511);assertEquals(
            "ffffffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25512);assertEquals(
            "3fffffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDE3, 0, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25513);assertEquals(
            "feffffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25514);assertEquals(
            "fedcffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25515);assertEquals(
            "fedcba0fffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 0, 7));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25516);assertEquals(
            "fedcba09ffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 0, 8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25517);assertEquals(
            "fff3ffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDE3, 0, "ffffffffffffffffffffffff", 3, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25518);assertEquals(
            "ffffefffffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 3, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25519);assertEquals(
            "ffffedcfffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 3, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25520);assertEquals(
            "ffffedcba0ffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 3, 7));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25521);assertEquals(
            "ffffedcba09fffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 0, "ffffffffffffffffffffffff", 3, 8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25522);assertEquals(
            "7fffffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 1, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25523);assertEquals(
            "bfffffffffffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 2, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25524);assertEquals(
            "fffdb97512ffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 3, "ffffffffffffffffffffffff", 3, 8));
        // assertEquals("ffffffffffffffffffffffff",Conversion.intToHex(0x90ABCDEF,
        // 4,"ffffffffffffffffffffffff",3,8));//rejected by assertion
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25525);assertEquals(
            "fffedcba09ffffffffffffff",
            Conversion.intToHex(0x90ABCDEF, 4, "ffffffffffffffffffffffff", 3, 7));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25526);assertEquals("fedcba09", Conversion.intToHex(0x90ABCDEF, 0, "", 0, 8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25527);try {
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25528);Conversion.intToHex(0x90ABCDEF, 0, "", 1, 8);
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25529);fail("Thrown " + StringIndexOutOfBoundsException.class.getName() + " expected");
        } catch (final StringIndexOutOfBoundsException e) {
            // OK
        }
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#shortToHex(short, int, String, int, int)}.
     */
    @Test
    public void testShortToHex() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i677eljp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testShortToHex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25530,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i677eljp6(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25530);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25531);assertEquals("", Conversion.shortToHex((short)0x0000, 0, "", 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25532);assertEquals("", Conversion.shortToHex((short)0x0000, 100, "", 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25533);assertEquals("", Conversion.shortToHex((short)0x0000, 0, "", 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25534);assertEquals(
            "ffffffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 0, "ffffffffffffffffffffffff", 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25535);assertEquals(
            "3fffffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDE3, 0, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25536);assertEquals(
            "feffffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 0, "ffffffffffffffffffffffff", 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25537);assertEquals(
            "fedfffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 0, "ffffffffffffffffffffffff", 0, 3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25538);assertEquals(
            "fedcffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 0, "ffffffffffffffffffffffff", 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25539);assertEquals(
            "fff3ffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDE3, 0, "ffffffffffffffffffffffff", 3, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25540);assertEquals(
            "ffffefffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 0, "ffffffffffffffffffffffff", 3, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25541);assertEquals(
            "7fffffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 1, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25542);assertEquals(
            "bfffffffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 2, "ffffffffffffffffffffffff", 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25543);assertEquals(
            "fffdb9ffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 3, "ffffffffffffffffffffffff", 3, 4));
        // assertEquals("ffffffffffffffffffffffff",Conversion.shortToHex((short)0xCDEF,
        // 4,"ffffffffffffffffffffffff",3,4));//rejected by assertion
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25544);assertEquals(
            "fffedcffffffffffffffffff",
            Conversion.shortToHex((short)0xCDEF, 4, "ffffffffffffffffffffffff", 3, 3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25545);assertEquals("fedc", Conversion.shortToHex((short)0xCDEF, 0, "", 0, 4));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25546);try {
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25547);Conversion.shortToHex((short)0xCDEF, 0, "", 1, 4);
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25548);fail("Thrown " + StringIndexOutOfBoundsException.class.getName() + " expected");
        } catch (final StringIndexOutOfBoundsException e) {
            // OK
        }
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#byteToHex(byte, int, String, int, int)}.
     */
    @Test
    public void testByteToHex() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s1u4c3jpp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testByteToHex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25549,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s1u4c3jpp(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25549);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25550);assertEquals("", Conversion.byteToHex((byte)0x00, 0, "", 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25551);assertEquals("", Conversion.byteToHex((byte)0x00, 100, "", 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25552);assertEquals("", Conversion.byteToHex((byte)0x00, 0, "", 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25553);assertEquals("00000", Conversion.byteToHex((byte)0xEF, 0, "00000", 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25554);assertEquals("f0000", Conversion.byteToHex((byte)0xEF, 0, "00000", 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25555);assertEquals("fe000", Conversion.byteToHex((byte)0xEF, 0, "00000", 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25556);assertEquals("000f0", Conversion.byteToHex((byte)0xEF, 0, "00000", 3, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25557);assertEquals("000fe", Conversion.byteToHex((byte)0xEF, 0, "00000", 3, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25558);assertEquals("70000", Conversion.byteToHex((byte)0xEF, 1, "00000", 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25559);assertEquals("b0000", Conversion.byteToHex((byte)0xEF, 2, "00000", 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25560);assertEquals("000df", Conversion.byteToHex((byte)0xEF, 3, "00000", 3, 2));
        // assertEquals("00000",Conversion.byteToHex((byte)0xEF, 4,"00000",3,2));//rejected by
        // assertion
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25561);assertEquals("000e0", Conversion.byteToHex((byte)0xEF, 4, "00000", 3, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25562);assertEquals("fe", Conversion.byteToHex((byte)0xEF, 0, "", 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25563);try {
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25564);Conversion.byteToHex((byte)0xEF, 0, "", 1, 2);
            __CLR4_1_2ja2ja2l3lqxtun.R.inc(25565);fail("Thrown " + StringIndexOutOfBoundsException.class.getName() + " expected");
        } catch (final StringIndexOutOfBoundsException e) {
            // OK
        }
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#longToBinary(long, int, boolean[], int, int)}.
     */
    @Test
    public void testLongToBinary() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ldhykvjq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testLongToBinary",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25566,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ldhykvjq6(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25566);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25567);assertBinaryEquals(
            new boolean[]{},
            Conversion.longToBinary(0x0000000000000000L, 0, new boolean[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25568);assertBinaryEquals(
            new boolean[]{},
            Conversion.longToBinary(0x0000000000000000L, 100, new boolean[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25569);assertBinaryEquals(
            new boolean[]{},
            Conversion.longToBinary(0x0000000000000000L, 0, new boolean[]{}, 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25570);assertBinaryEquals(
            new boolean[69],
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 0, 0));

        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25571);assertBinaryEquals(
            new boolean[]{
                true, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25572);assertBinaryEquals(
            new boolean[]{
                true, true, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25573);assertBinaryEquals(
            new boolean[]{
                true, true, true, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 0, 3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25574);assertBinaryEquals(
            new boolean[]{
                true, true, true, true, false, true, true, true, true, false, true, true,
                false, false, true, true, true, true, false, true, false, true, false, true,
                false, false, false, false, true, false, false, true, false, false, false,
                true, true, true, true, false, false, true, true, false, true, false, true,
                false, false, false, true, false, true, true, false, false, false, true, false,
                false, true, false, false, false, false, false, false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 0, 63));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25575);assertBinaryEquals(
            new boolean[]{
                true, true, true, true, false, true, true, true, true, false, true, true,
                false, false, true, true, true, true, false, true, false, true, false, true,
                false, false, false, false, true, false, false, true, false, false, false,
                true, true, true, true, false, false, true, true, false, true, false, true,
                false, false, false, true, false, true, true, false, false, false, true, false,
                false, true, false, false, false, false, false, false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 0, 64));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25576);assertBinaryEquals(
            new boolean[]{
                false, false, true, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false, false,
                false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25577);assertBinaryEquals(
            new boolean[]{
                false, false, true, true, true, true, false, true, true, true, true, false,
                true, true, false, false, true, true, true, true, false, true, false, true,
                false, true, false, false, false, false, true, false, false, true, false,
                false, false, true, true, true, true, false, false, true, true, false, true,
                false, true, false, false, false, true, false, true, true, false, false, false,
                true, false, false, true, false, false, false, false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 0, new boolean[69], 2, 64));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25578);assertBinaryEquals(
            new boolean[]{
                true, true, true, false, true, true, true, true, false, true, true, false,
                false, true, true, true, true, false, true, false, true, false, true, false,
                false, false, false, true, false, false, true, false, false, false, true, true,
                true, true, false, false, true, true, false, true, false, true, false, false,
                false, true, false, true, true, false, false, false, true, false, false, true,
                false, false, false, false, false, false, false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 1, new boolean[69], 0, 63));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25579);assertBinaryEquals(
            new boolean[]{
                true, true, false, true, true, true, true, false, true, true, false, false,
                true, true, true, true, false, true, false, true, false, true, false, false,
                false, false, true, false, false, true, false, false, false, true, true, true,
                true, false, false, true, true, false, true, false, true, false, false, false,
                true, false, true, true, false, false, false, true, false, false, true, false,
                false, false, false, false, false, false, false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 2, new boolean[69], 0, 62));

        // assertBinaryEquals(new boolean[]{false,false,false, true, true, false, true, true,
        // true, true, false, true, true, false, false, true, true, true, true, false, true,
        // false, true, false, true, false, false, false, false, true, false, false, true,
        // false, false, false, true, true, true, true, false, false, true, true, false, true,
        // false, true, false, false, false, true, false, true, true, false, false, false, true,
        // false, false, true, false, false, false
        // ,false,false,false,false},Conversion.longToBinary(0x1234567890ABCDEFL, 2,new
        // boolean[69], 3, 63));//rejected by assertion
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25580);assertBinaryEquals(
            new boolean[]{
                false, false, false, true, true, false, true, true, true, true, false, true,
                true, false, false, true, true, true, true, false, true, false, true, false,
                true, false, false, false, false, true, false, false, true, false, false,
                false, true, true, true, true, false, false, true, true, false, true, false,
                true, false, false, false, true, false, true, true, false, false, false, true,
                false, false, true, false, false, false, false, false, false, false},
            Conversion.longToBinary(0x1234567890ABCDEFL, 2, new boolean[69], 3, 62));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#intToBinary(int, int, boolean[], int, int)}.
     */
    @Test
    public void testIntToBinary() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2awh8psjql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testIntToBinary",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25581,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2awh8psjql(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25581);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25582);assertBinaryEquals(
            new boolean[]{}, Conversion.intToBinary(0x00000000, 0, new boolean[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25583);assertBinaryEquals(
            new boolean[]{}, Conversion.intToBinary(0x00000000, 100, new boolean[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25584);assertBinaryEquals(
            new boolean[]{}, Conversion.intToBinary(0x00000000, 0, new boolean[]{}, 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25585);assertBinaryEquals(
            new boolean[69], Conversion.intToBinary(0x90ABCDEF, 0, new boolean[69], 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25586);assertBinaryEquals(new boolean[]{
            true, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25587);assertBinaryEquals(new boolean[]{
            true, true, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25588);assertBinaryEquals(new boolean[]{
            true, true, true, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 0, 3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25589);assertBinaryEquals(
            new boolean[]{
                true, true, true, true, false, true, true, true, true, false, true, true,
                false, false, true, true, true, true, false, true, false, true, false, true,
                false, false, false, false, true, false, false, false, false, false, false,
                false, false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 0, 31));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25590);assertBinaryEquals(
            new boolean[]{
                true, true, true, true, false, true, true, true, true, false, true, true,
                false, false, true, true, true, true, false, true, false, true, false, true,
                false, false, false, false, true, false, false, true, false, false, false,
                false, false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 0, 32));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25591);assertBinaryEquals(new boolean[]{
            false, false, true, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false, false, false, false, false, false, false, false, false, false, false, false,
            false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25592);assertBinaryEquals(
            new boolean[]{
                false, false, true, true, true, true, false, true, true, true, true, false,
                true, true, false, false, true, true, true, true, false, true, false, true,
                false, true, false, false, false, false, true, false, false, true, false,
                false, false}, Conversion.intToBinary(0x90ABCDEF, 0, new boolean[37], 2, 32));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25593);assertBinaryEquals(
            new boolean[]{
                true, true, true, false, true, true, true, true, false, true, true, false,
                false, true, true, true, true, false, true, false, true, false, true, false,
                false, false, false, true, false, false, true, false, false, false, false,
                false, false}, Conversion.intToBinary(0x90ABCDEF, 1, new boolean[37], 0, 31));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25594);assertBinaryEquals(
            new boolean[]{
                true, true, false, true, true, true, true, false, true, true, false, false,
                true, true, true, true, false, true, false, true, false, true, false, false,
                false, false, true, false, false, true, false, false, false, false, false,
                false, false}, Conversion.intToBinary(0x90ABCDEF, 2, new boolean[37], 0, 30));
        // assertBinaryEquals(new boolean[]{false, false, false, true, true, false, true,
        // true,
        // true, true, false, true, true, false, false, true, true, true, true, false, true,
        // false, true, false, true, false, false, false, false, true, false, false, false,
        // false, false, false, false},Conversion.intToBinary(0x90ABCDEF, 2,new boolean[37],
        // 3,31));//rejected by assertion
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25595);assertBinaryEquals(
            new boolean[]{
                false, false, false, true, true, false, true, true, true, true, false, true,
                true, false, false, true, true, true, true, false, true, false, true, false,
                true, false, false, false, false, true, false, false, true, false, false,
                false, false}, Conversion.intToBinary(0x90ABCDEF, 2, new boolean[37], 3, 30));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#shortToBinary(short, int, boolean[], int, int)}.
     */
    @Test
    public void testShortToBinary() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lhwemljr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testShortToBinary",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25596,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lhwemljr0(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25596);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25597);assertBinaryEquals(
            new boolean[]{}, Conversion.shortToBinary((short)0x0000, 0, new boolean[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25598);assertBinaryEquals(
            new boolean[]{},
            Conversion.shortToBinary((short)0x0000, 100, new boolean[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25599);assertBinaryEquals(
            new boolean[]{},
            Conversion.shortToBinary((short)0x0000, 0, new boolean[]{}, 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25600);assertBinaryEquals(
            new boolean[69], Conversion.shortToBinary((short)0xCDEF, 0, new boolean[69], 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25601);assertBinaryEquals(
            new boolean[]{
                true, false, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25602);assertBinaryEquals(
            new boolean[]{
                true, true, false, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25603);assertBinaryEquals(
            new boolean[]{
                true, true, true, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 0, 3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25604);assertBinaryEquals(
            new boolean[]{
                true, true, true, true, false, true, true, true, true, false, true, true,
                false, false, true, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 0, 15));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25605);assertBinaryEquals(
            new boolean[]{
                true, true, true, true, false, true, true, true, true, false, true, true,
                false, false, true, true, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 0, 16));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25606);assertBinaryEquals(
            new boolean[]{
                false, false, true, false, false, false, false, false, false, false, false,
                false, false, false, false, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25607);assertBinaryEquals(
            new boolean[]{
                false, false, true, true, true, true, false, true, true, true, true, false,
                true, true, false, false, true, true, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 0, new boolean[21], 2, 16));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25608);assertBinaryEquals(
            new boolean[]{
                true, true, true, false, true, true, true, true, false, true, true, false,
                false, true, true, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 1, new boolean[21], 0, 15));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25609);assertBinaryEquals(
            new boolean[]{
                true, true, false, true, true, true, true, false, true, true, false, false,
                true, true, false, false, false, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 2, new boolean[21], 0, 14));
        // assertArrayEquals(new boolean[]{false, false, false, true, true, false, true, true,
        // true, true, false, true, true, false, false, true, false, false, false, false,
        // false},Conversion.shortToBinary((short)0xCDEF, 2,new boolean[21],
        // 3,15));//rejected by
        // assertion
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25610);assertBinaryEquals(
            new boolean[]{
                false, false, false, true, true, false, true, true, true, true, false, true,
                true, false, false, true, true, false, false, false, false},
            Conversion.shortToBinary((short)0xCDEF, 2, new boolean[21], 3, 14));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#byteToBinary(byte, int, boolean[], int, int)}.
     */
    @Test
    public void testByteToBinary() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a1yog3jrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testByteToBinary",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25611,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a1yog3jrf(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25611);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25612);assertBinaryEquals(
            new boolean[]{}, Conversion.byteToBinary((byte)0x00, 0, new boolean[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25613);assertBinaryEquals(
            new boolean[]{}, Conversion.byteToBinary((byte)0x00, 100, new boolean[]{}, 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25614);assertBinaryEquals(
            new boolean[]{}, Conversion.byteToBinary((byte)0x00, 0, new boolean[]{}, 100, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25615);assertBinaryEquals(
            new boolean[69], Conversion.byteToBinary((byte)0xEF, 0, new boolean[69], 0, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25616);assertBinaryEquals(new boolean[]{
            true, false, false, false, false, false, false, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 0, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25617);assertBinaryEquals(new boolean[]{
            true, false, false, false, false, false, false, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 0, 2));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25618);assertBinaryEquals(new boolean[]{
            true, false, true, false, false, false, false, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 0, 3));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25619);assertBinaryEquals(new boolean[]{
            true, false, true, false, true, false, false, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 0, 7));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25620);assertBinaryEquals(new boolean[]{
            true, false, true, false, true, false, false, true, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 0, 8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25621);assertBinaryEquals(new boolean[]{
            false, false, true, false, false, false, false, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 2, 1));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25622);assertBinaryEquals(new boolean[]{
            false, false, true, false, true, false, true, false, false, true, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 0, new boolean[13], 2, 8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25623);assertBinaryEquals(new boolean[]{
            false, true, false, true, false, false, true, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 1, new boolean[13], 0, 7));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25624);assertBinaryEquals(new boolean[]{
            true, false, true, false, false, true, false, false, false, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 2, new boolean[13], 0, 6));
        // assertArrayEquals(new boolean[]{false, false, false, true, true, false, true, true,
        // false, false, false, false, false},Conversion.byteToBinary((byte)0x95, 2,new
        // boolean[13], 3, 7));//rejected by assertion
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25625);assertBinaryEquals(new boolean[]{
            false, false, false, true, false, true, false, false, true, false, false, false,
            false}, Conversion.byteToBinary((byte)0x95, 2, new boolean[13], 3, 6));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#uuidToByteArray(UUID, byte[], int, int)}.
     */
    @Test
    public void testUuidToByteArray() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x28viojru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testUuidToByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25626,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x28viojru(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25626);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25627);assertArrayEquals(new byte[]{
            (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff,
            (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff,
            (byte)0xff, (byte)0xff}, Conversion.uuidToByteArray(new UUID(
            0xFFFFFFFFFFFFFFFFL, 0xFFFFFFFFFFFFFFFFL), new byte[16], 0, 16));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25628);assertArrayEquals(new byte[]{
            (byte)0x88, (byte)0x99, (byte)0xaa, (byte)0xbb, (byte)0xcc, (byte)0xdd, (byte)0xee,
            (byte)0xff, (byte)0x00, (byte)0x11, (byte)0x22, (byte)0x33, (byte)0x44, (byte)0x55,
            (byte)0x66, (byte)0x77}, Conversion.uuidToByteArray(new UUID(
            0xFFEEDDCCBBAA9988L, 0x7766554433221100L), new byte[16], 0, 16));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25629);assertArrayEquals(new byte[]{
            (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x00, (byte)0x88, (byte)0x99, (byte)0xaa,
            (byte)0xbb, (byte)0xcc, (byte)0xdd, (byte)0xee, (byte)0xff, (byte)0x00, (byte)0x00,
            (byte)0x00, (byte)0x00}, Conversion.uuidToByteArray(new UUID(
            0xFFEEDDCCBBAA9988L, 0x7766554433221100L), new byte[16], 4, 8));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25630);assertArrayEquals(new byte[]{
            (byte)0x00, (byte)0x00, (byte)0x88, (byte)0x99, (byte)0xaa, (byte)0xbb, (byte)0xcc,
            (byte)0xdd, (byte)0xee, (byte)0xff, (byte)0x00, (byte)0x11, (byte)0x22, (byte)0x33,
            (byte)0x00, (byte)0x00}, Conversion.uuidToByteArray(new UUID(
            0xFFEEDDCCBBAA9988L, 0x7766554433221100L), new byte[16], 2, 12));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}

    /**
     * Tests {@link Conversion#byteArrayToUuid(byte[], int)}.
     */
    @Test
    public void testByteArrayToUuid() {__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceStart(getClass().getName(),25631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21x8tukjrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ja2ja2l3lqxtun.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ja2ja2l3lqxtun.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ConversionTest.testByteArrayToUuid",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),25631,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21x8tukjrz(){try{__CLR4_1_2ja2ja2l3lqxtun.R.inc(25631);
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25632);assertEquals(
            new UUID(0xFFFFFFFFFFFFFFFFL, 0xFFFFFFFFFFFFFFFFL),
            Conversion.byteArrayToUuid(new byte[]{
                (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff,
                (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff,
                (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff}, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25633);assertEquals(
            new UUID(0xFFEEDDCCBBAA9988L, 0x7766554433221100L),
            Conversion.byteArrayToUuid(new byte[]{
                (byte)0x88, (byte)0x99, (byte)0xaa, (byte)0xbb, (byte)0xcc, (byte)0xdd,
                (byte)0xee, (byte)0xff, (byte)0x00, (byte)0x11, (byte)0x22, (byte)0x33,
                (byte)0x44, (byte)0x55, (byte)0x66, (byte)0x77}, 0));
        __CLR4_1_2ja2ja2l3lqxtun.R.inc(25634);assertEquals(
            new UUID(0xFFEEDDCCBBAA9988L, 0x7766554433221100L),
            Conversion.byteArrayToUuid(new byte[]{
                0, 0, (byte)0x88, (byte)0x99, (byte)0xaa, (byte)0xbb, (byte)0xcc, (byte)0xdd,
                (byte)0xee, (byte)0xff, (byte)0x00, (byte)0x11, (byte)0x22, (byte)0x33,
                (byte)0x44, (byte)0x55, (byte)0x66, (byte)0x77}, 2));
    }finally{__CLR4_1_2ja2ja2l3lqxtun.R.flushNeeded();}}
}
