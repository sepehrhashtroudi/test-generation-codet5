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
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Test cases for the {@link Fraction} class
 *
 * @version $Id$
 */
public class FractionTest  {static class __CLR4_1_2r3dr3dl3lqxuoj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,36023,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final int SKIP = 500;  //53

    //--------------------------------------------------------------------------
    @Test
    public void testConstants() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25epzlwr3d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testConstants",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35113,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25epzlwr3d(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35113);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35114);assertEquals(0, Fraction.ZERO.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35115);assertEquals(1, Fraction.ZERO.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35116);assertEquals(1, Fraction.ONE.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35117);assertEquals(1, Fraction.ONE.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35118);assertEquals(1, Fraction.ONE_HALF.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35119);assertEquals(2, Fraction.ONE_HALF.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35120);assertEquals(1, Fraction.ONE_THIRD.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35121);assertEquals(3, Fraction.ONE_THIRD.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35122);assertEquals(2, Fraction.TWO_THIRDS.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35123);assertEquals(3, Fraction.TWO_THIRDS.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35124);assertEquals(1, Fraction.ONE_QUARTER.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35125);assertEquals(4, Fraction.ONE_QUARTER.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35126);assertEquals(2, Fraction.TWO_QUARTERS.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35127);assertEquals(4, Fraction.TWO_QUARTERS.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35128);assertEquals(3, Fraction.THREE_QUARTERS.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35129);assertEquals(4, Fraction.THREE_QUARTERS.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35130);assertEquals(1, Fraction.ONE_FIFTH.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35131);assertEquals(5, Fraction.ONE_FIFTH.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35132);assertEquals(2, Fraction.TWO_FIFTHS.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35133);assertEquals(5, Fraction.TWO_FIFTHS.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35134);assertEquals(3, Fraction.THREE_FIFTHS.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35135);assertEquals(5, Fraction.THREE_FIFTHS.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35136);assertEquals(4, Fraction.FOUR_FIFTHS.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35137);assertEquals(5, Fraction.FOUR_FIFTHS.getDenominator());
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}

    @Test
    public void testFactory_int_int() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lgzp33r42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35138,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lgzp33r42(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35138);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35139);Fraction f = null;
        
        // zero
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35140);f = Fraction.getFraction(0, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35141);assertEquals(0, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35142);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35143);f = Fraction.getFraction(0, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35144);assertEquals(0, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35145);assertEquals(2, f.getDenominator());
        
        // normal
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35146);f = Fraction.getFraction(1, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35147);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35148);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35149);f = Fraction.getFraction(2, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35150);assertEquals(2, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35151);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35152);f = Fraction.getFraction(23, 345);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35153);assertEquals(23, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35154);assertEquals(345, f.getDenominator());
        
        // improper
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35155);f = Fraction.getFraction(22, 7);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35156);assertEquals(22, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35157);assertEquals(7, f.getDenominator());
        
        // negatives
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35158);f = Fraction.getFraction(-6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35159);assertEquals(-6, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35160);assertEquals(10, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35161);f = Fraction.getFraction(6, -10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35162);assertEquals(-6, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35163);assertEquals(10, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35164);f = Fraction.getFraction(-6, -10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35165);assertEquals(6, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35166);assertEquals(10, f.getDenominator());
        
        // zero denominator
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35167);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35168);f = Fraction.getFraction(1, 0);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35169);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35170);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35171);f = Fraction.getFraction(2, 0);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35172);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35173);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35174);f = Fraction.getFraction(-3, 0);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35175);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // very large: can't represent as unsimplified fraction, although
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35176);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35177);f = Fraction.getFraction(4, Integer.MIN_VALUE);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35178);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35179);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35180);f = Fraction.getFraction(1, Integer.MIN_VALUE);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35181);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}

    @Test
    public void testFactory_int_int_int() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j6mqr3r5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_int_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35182,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j6mqr3r5a(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35182);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35183);Fraction f = null;
        
        // zero
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35184);f = Fraction.getFraction(0, 0, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35185);assertEquals(0, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35186);assertEquals(2, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35187);f = Fraction.getFraction(2, 0, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35188);assertEquals(4, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35189);assertEquals(2, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35190);f = Fraction.getFraction(0, 1, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35191);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35192);assertEquals(2, f.getDenominator());
        
        // normal
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35193);f = Fraction.getFraction(1, 1, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35194);assertEquals(3, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35195);assertEquals(2, f.getDenominator());
        
        // negatives
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35196);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35197);f = Fraction.getFraction(1, -6, -10);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35198);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35199);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35200);f = Fraction.getFraction(1, -6, -10);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35201);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35202);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35203);f = Fraction.getFraction(1, -6, -10);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35204);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        // negative whole
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35205);f = Fraction.getFraction(-1, 6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35206);assertEquals(-16, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35207);assertEquals(10, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35208);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35209);f = Fraction.getFraction(-1, -6, 10);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35210);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35211);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35212);f = Fraction.getFraction(-1, 6, -10);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35213);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35214);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35215);f = Fraction.getFraction(-1, -6, -10);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35216);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        // zero denominator
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35217);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35218);f = Fraction.getFraction(0, 1, 0);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35219);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35220);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35221);f = Fraction.getFraction(1, 2, 0);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35222);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35223);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35224);f = Fraction.getFraction(-1, -3, 0);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35225);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35226);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35227);f = Fraction.getFraction(Integer.MAX_VALUE, 1, 2); 
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35228);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35229);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35230);f = Fraction.getFraction(-Integer.MAX_VALUE, 1, 2);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35231);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // very large
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35232);f = Fraction.getFraction(-1, 0, Integer.MAX_VALUE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35233);assertEquals(-Integer.MAX_VALUE, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35234);assertEquals(Integer.MAX_VALUE, f.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35235);try {
            // negative denominators not allowed in this constructor.
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35236);f = Fraction.getFraction(0, 4, Integer.MIN_VALUE);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35237);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35238);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35239);f = Fraction.getFraction(1, 1, Integer.MAX_VALUE);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35240);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35241);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35242);f = Fraction.getFraction(-1, 2, Integer.MAX_VALUE);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35243);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
    @Test
    public void testReducedFactory_int_int() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27ykps5r70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testReducedFactory_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35244,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27ykps5r70(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35244);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35245);Fraction f = null;
        
        // zero
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35246);f = Fraction.getReducedFraction(0, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35247);assertEquals(0, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35248);assertEquals(1, f.getDenominator());
        
        // normal
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35249);f = Fraction.getReducedFraction(1, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35250);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35251);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35252);f = Fraction.getReducedFraction(2, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35253);assertEquals(2, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35254);assertEquals(1, f.getDenominator());
        
        // improper
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35255);f = Fraction.getReducedFraction(22, 7);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35256);assertEquals(22, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35257);assertEquals(7, f.getDenominator());
        
        // negatives
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35258);f = Fraction.getReducedFraction(-6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35259);assertEquals(-3, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35260);assertEquals(5, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35261);f = Fraction.getReducedFraction(6, -10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35262);assertEquals(-3, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35263);assertEquals(5, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35264);f = Fraction.getReducedFraction(-6, -10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35265);assertEquals(3, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35266);assertEquals(5, f.getDenominator());
        
        // zero denominator
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35267);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35268);f = Fraction.getReducedFraction(1, 0);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35269);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35270);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35271);f = Fraction.getReducedFraction(2, 0);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35272);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35273);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35274);f = Fraction.getReducedFraction(-3, 0);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35275);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // reduced        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35276);f = Fraction.getReducedFraction(0, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35277);assertEquals(0, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35278);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35279);f = Fraction.getReducedFraction(2, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35280);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35281);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35282);f = Fraction.getReducedFraction(2, 4);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35283);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35284);assertEquals(2, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35285);f = Fraction.getReducedFraction(15, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35286);assertEquals(3, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35287);assertEquals(2, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35288);f = Fraction.getReducedFraction(121, 22);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35289);assertEquals(11, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35290);assertEquals(2, f.getDenominator());
        
        // Extreme values 
        // OK, can reduce before negating
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35291);f = Fraction.getReducedFraction(-2, Integer.MIN_VALUE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35292);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35293);assertEquals(-(Integer.MIN_VALUE / 2), f.getDenominator());
        
        // Can't reduce, negation will throw
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35294);try { 
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35295);f = Fraction.getReducedFraction(-7, Integer.MIN_VALUE);  
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35296);fail("Expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}      

        // LANG-662
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35297);f = Fraction.getReducedFraction(Integer.MIN_VALUE, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35298);assertEquals(Integer.MIN_VALUE / 2, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35299);assertEquals(1, f.getDenominator());
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}

    @Test
    public void testFactory_double() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27c3s4fr8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_double",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35300,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27c3s4fr8k(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35300);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35301);Fraction f = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35302);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35303);f = Fraction.getFraction(Double.NaN);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35304);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35305);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35306);f = Fraction.getFraction(Double.POSITIVE_INFINITY);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35307);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35308);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35309);f = Fraction.getFraction(Double.NEGATIVE_INFINITY);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35310);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35311);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35312);f = Fraction.getFraction((double) Integer.MAX_VALUE + 1);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35313);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        // zero
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35314);f = Fraction.getFraction(0.0d);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35315);assertEquals(0, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35316);assertEquals(1, f.getDenominator());
        
        // one
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35317);f = Fraction.getFraction(1.0d);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35318);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35319);assertEquals(1, f.getDenominator());
        
        // one half
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35320);f = Fraction.getFraction(0.5d);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35321);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35322);assertEquals(2, f.getDenominator());
        
        // negative
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35323);f = Fraction.getFraction(-0.875d);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35324);assertEquals(-7, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35325);assertEquals(8, f.getDenominator());
        
        // over 1
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35326);f = Fraction.getFraction(1.25d);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35327);assertEquals(5, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35328);assertEquals(4, f.getDenominator());
        
        // two thirds
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35329);f = Fraction.getFraction(0.66666d);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35330);assertEquals(2, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35331);assertEquals(3, f.getDenominator());
        
        // small
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35332);f = Fraction.getFraction(1.0d/10001d);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35333);assertEquals(0, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35334);assertEquals(1, f.getDenominator());
        
        // normal
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35335);Fraction f2 = null;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35336);for (int i = 1; (((i <= 100)&&(__CLR4_1_2r3dr3dl3lqxuoj.R.iget(35337)!=0|true))||(__CLR4_1_2r3dr3dl3lqxuoj.R.iget(35338)==0&false)); i++) {{  // denominator
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35339);for (int j = 1; (((j <= i)&&(__CLR4_1_2r3dr3dl3lqxuoj.R.iget(35340)!=0|true))||(__CLR4_1_2r3dr3dl3lqxuoj.R.iget(35341)==0&false)); j++) {{  // numerator
                __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35342);try {
                    __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35343);f = Fraction.getFraction((double) j / (double) i);
                } catch (final ArithmeticException ex) {
                    __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35344);System.err.println(j + " " + i);
                    __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35345);throw ex;
                }
                __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35346);f2 = Fraction.getReducedFraction(j, i);
                __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35347);assertEquals(f2.getNumerator(), f.getNumerator());
                __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35348);assertEquals(f2.getDenominator(), f.getDenominator());
            }
        }}
        // save time by skipping some tests!  (
        }__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35349);for (int i = 1001; (((i <= 10000)&&(__CLR4_1_2r3dr3dl3lqxuoj.R.iget(35350)!=0|true))||(__CLR4_1_2r3dr3dl3lqxuoj.R.iget(35351)==0&false)); i+=SKIP) {{  // denominator
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35352);for (int j = 1; (((j <= i)&&(__CLR4_1_2r3dr3dl3lqxuoj.R.iget(35353)!=0|true))||(__CLR4_1_2r3dr3dl3lqxuoj.R.iget(35354)==0&false)); j++) {{  // numerator
                __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35355);try {
                    __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35356);f = Fraction.getFraction((double) j / (double) i);
                } catch (final ArithmeticException ex) {
                    __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35357);System.err.println(j + " " + i);
                    __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35358);throw ex;
                }
                __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35359);f2 = Fraction.getReducedFraction(j, i);
                __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35360);assertEquals(f2.getNumerator(), f.getNumerator());
                __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35361);assertEquals(f2.getDenominator(), f.getDenominator());
            }
        }}
    }}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testFactory_String() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2c7gw3jraa();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,70,97,99,116,111,114,121,95,83,116,114,105,110,103,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35362,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2c7gw3jraa(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35362);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35363);Fraction.getFraction(null);
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
    
    
    @Test
    public void testFactory_String_double() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lwapdrrac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_String_double",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35364,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lwapdrrac(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35364);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35365);Fraction f = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35366);f = Fraction.getFraction("0.0");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35367);assertEquals(0, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35368);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35369);f = Fraction.getFraction("0.2");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35370);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35371);assertEquals(5, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35372);f = Fraction.getFraction("0.5");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35373);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35374);assertEquals(2, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35375);f = Fraction.getFraction("0.66666");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35376);assertEquals(2, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35377);assertEquals(3, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35378);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35379);f = Fraction.getFraction("2.3R");
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35380);fail("Expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35381);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35382);f = Fraction.getFraction("2147483648"); // too big
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35383);fail("Expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35384);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35385);f = Fraction.getFraction(".");
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35386);fail("Expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}

    @Test
    public void testFactory_String_proper() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k8blweraz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_String_proper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35387,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k8blweraz(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35387);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35388);Fraction f = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35389);f = Fraction.getFraction("0 0/1");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35390);assertEquals(0, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35391);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35392);f = Fraction.getFraction("1 1/5");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35393);assertEquals(6, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35394);assertEquals(5, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35395);f = Fraction.getFraction("7 1/2");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35396);assertEquals(15, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35397);assertEquals(2, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35398);f = Fraction.getFraction("1 2/4");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35399);assertEquals(6, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35400);assertEquals(4, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35401);f = Fraction.getFraction("-7 1/2");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35402);assertEquals(-15, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35403);assertEquals(2, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35404);f = Fraction.getFraction("-1 2/4");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35405);assertEquals(-6, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35406);assertEquals(4, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35407);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35408);f = Fraction.getFraction("2 3");
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35409);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35410);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35411);f = Fraction.getFraction("a 3");
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35412);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35413);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35414);f = Fraction.getFraction("2 b/4");
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35415);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35416);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35417);f = Fraction.getFraction("2 ");
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35418);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35419);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35420);f = Fraction.getFraction(" 3");
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35421);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35422);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35423);f = Fraction.getFraction(" ");
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35424);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}

    @Test
    public void testFactory_String_improper() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2z9dhmqrc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testFactory_String_improper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35425,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2z9dhmqrc1(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35425);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35426);Fraction f = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35427);f = Fraction.getFraction("0/1");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35428);assertEquals(0, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35429);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35430);f = Fraction.getFraction("1/5");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35431);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35432);assertEquals(5, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35433);f = Fraction.getFraction("1/2");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35434);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35435);assertEquals(2, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35436);f = Fraction.getFraction("2/3");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35437);assertEquals(2, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35438);assertEquals(3, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35439);f = Fraction.getFraction("7/3");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35440);assertEquals(7, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35441);assertEquals(3, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35442);f = Fraction.getFraction("2/4");
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35443);assertEquals(2, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35444);assertEquals(4, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35445);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35446);f = Fraction.getFraction("2/d");
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35447);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35448);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35449);f = Fraction.getFraction("2e/3");
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35450);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35451);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35452);f = Fraction.getFraction("2/");
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35453);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35454);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35455);f = Fraction.getFraction("/");
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35456);fail("expecting NumberFormatException");
        } catch (final NumberFormatException ex) {}
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}

    @Test
    public void testGets() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2whtq8arcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testGets",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35457,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2whtq8arcx(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35457);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35458);Fraction f = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35459);f = Fraction.getFraction(3, 5, 6);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35460);assertEquals(23, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35461);assertEquals(3, f.getProperWhole());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35462);assertEquals(5, f.getProperNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35463);assertEquals(6, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35464);f = Fraction.getFraction(-3, 5, 6);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35465);assertEquals(-23, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35466);assertEquals(-3, f.getProperWhole());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35467);assertEquals(5, f.getProperNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35468);assertEquals(6, f.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35469);f = Fraction.getFraction(Integer.MIN_VALUE, 0, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35470);assertEquals(Integer.MIN_VALUE, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35471);assertEquals(Integer.MIN_VALUE, f.getProperWhole());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35472);assertEquals(0, f.getProperNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35473);assertEquals(1, f.getDenominator());
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
            
    @Test
    public void testConversions() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ei559qrde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testConversions",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35474,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ei559qrde(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35474);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35475);Fraction f = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35476);f = Fraction.getFraction(3, 7, 8);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35477);assertEquals(3, f.intValue());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35478);assertEquals(3L, f.longValue());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35479);assertEquals(3.875f, f.floatValue(), 0.00001f);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35480);assertEquals(3.875d, f.doubleValue(), 0.00001d);
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
    
    @Test
    public void testReduce() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wogq1rrdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testReduce",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35481,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wogq1rrdl(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35481);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35482);Fraction f = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35483);f = Fraction.getFraction(50, 75);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35484);Fraction result = f.reduce();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35485);assertEquals(2, result.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35486);assertEquals(3, result.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35487);f = Fraction.getFraction(-2, -3);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35488);result = f.reduce();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35489);assertEquals(2, result.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35490);assertEquals(3, result.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35491);f = Fraction.getFraction(2, -3);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35492);result = f.reduce();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35493);assertEquals(-2, result.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35494);assertEquals(3, result.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35495);f = Fraction.getFraction(-2, 3);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35496);result = f.reduce();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35497);assertEquals(-2, result.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35498);assertEquals(3, result.getDenominator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35499);assertSame(f, result);

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35500);f = Fraction.getFraction(2, 3);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35501);result = f.reduce();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35502);assertEquals(2, result.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35503);assertEquals(3, result.getDenominator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35504);assertSame(f, result);

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35505);f = Fraction.getFraction(0, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35506);result = f.reduce();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35507);assertEquals(0, result.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35508);assertEquals(1, result.getDenominator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35509);assertSame(f, result);

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35510);f = Fraction.getFraction(0, 100);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35511);result = f.reduce();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35512);assertEquals(0, result.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35513);assertEquals(1, result.getDenominator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35514);assertSame(result, Fraction.ZERO);

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35515);f = Fraction.getFraction(Integer.MIN_VALUE, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35516);result = f.reduce();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35517);assertEquals(Integer.MIN_VALUE / 2, result.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35518);assertEquals(1, result.getDenominator());
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
    
    @Test
    public void testInvert() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oxt7inren();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testInvert",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35519,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oxt7inren(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35519);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35520);Fraction f = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35521);f = Fraction.getFraction(50, 75);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35522);f = f.invert();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35523);assertEquals(75, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35524);assertEquals(50, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35525);f = Fraction.getFraction(4, 3);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35526);f = f.invert();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35527);assertEquals(3, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35528);assertEquals(4, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35529);f = Fraction.getFraction(-15, 47);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35530);f = f.invert();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35531);assertEquals(-47, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35532);assertEquals(15, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35533);f = Fraction.getFraction(0, 3);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35534);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35535);f = f.invert();
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35536);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // large values
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35537);f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35538);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35539);f = f.invert();
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35540);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35541);f = Fraction.getFraction(Integer.MAX_VALUE, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35542);f = f.invert();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35543);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35544);assertEquals(Integer.MAX_VALUE, f.getDenominator());
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
    
    @Test
    public void testNegate() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ffqfwlrfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testNegate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35545,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ffqfwlrfd(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35545);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35546);Fraction f = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35547);f = Fraction.getFraction(50, 75);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35548);f = f.negate();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35549);assertEquals(-50, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35550);assertEquals(75, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35551);f = Fraction.getFraction(-50, 75);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35552);f = f.negate();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35553);assertEquals(50, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35554);assertEquals(75, f.getDenominator());

        // large values
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35555);f = Fraction.getFraction(Integer.MAX_VALUE-1, Integer.MAX_VALUE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35556);f = f.negate();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35557);assertEquals(Integer.MIN_VALUE+2, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35558);assertEquals(Integer.MAX_VALUE, f.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35559);f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35560);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35561);f = f.negate();
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35562);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
    
    @Test
    public void testAbs() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2l56wufrfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testAbs",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35563,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2l56wufrfv(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35563);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35564);Fraction f = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35565);f = Fraction.getFraction(50, 75);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35566);f = f.abs();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35567);assertEquals(50, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35568);assertEquals(75, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35569);f = Fraction.getFraction(-50, 75);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35570);f = f.abs();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35571);assertEquals(50, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35572);assertEquals(75, f.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35573);f = Fraction.getFraction(Integer.MAX_VALUE, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35574);f = f.abs();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35575);assertEquals(Integer.MAX_VALUE, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35576);assertEquals(1, f.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35577);f = Fraction.getFraction(Integer.MAX_VALUE, -1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35578);f = f.abs();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35579);assertEquals(Integer.MAX_VALUE, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35580);assertEquals(1, f.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35581);f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35582);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35583);f = f.abs();
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35584);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
    
    @Test
    public void testPow() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xazw8drgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testPow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35585,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xazw8drgh(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35585);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35586);Fraction f = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35587);f = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35588);assertEquals(Fraction.ONE, f.pow(0));
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35589);f = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35590);assertSame(f, f.pow(1));
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35591);assertEquals(f, f.pow(1));

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35592);f = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35593);f = f.pow(2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35594);assertEquals(9, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35595);assertEquals(25, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35596);f = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35597);f = f.pow(3);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35598);assertEquals(27, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35599);assertEquals(125, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35600);f = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35601);f = f.pow(-1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35602);assertEquals(5, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35603);assertEquals(3, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35604);f = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35605);f = f.pow(-2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35606);assertEquals(25, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35607);assertEquals(9, f.getDenominator());
        
        // check unreduced fractions stay that way.
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35608);f = Fraction.getFraction(6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35609);assertEquals(Fraction.ONE, f.pow(0));
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35610);f = Fraction.getFraction(6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35611);assertEquals(f, f.pow(1));
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35612);assertFalse(f.pow(1).equals(Fraction.getFraction(3,5)));

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35613);f = Fraction.getFraction(6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35614);f = f.pow(2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35615);assertEquals(9, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35616);assertEquals(25, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35617);f = Fraction.getFraction(6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35618);f = f.pow(3);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35619);assertEquals(27, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35620);assertEquals(125, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35621);f = Fraction.getFraction(6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35622);f = f.pow(-1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35623);assertEquals(10, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35624);assertEquals(6, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35625);f = Fraction.getFraction(6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35626);f = f.pow(-2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35627);assertEquals(25, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35628);assertEquals(9, f.getDenominator());
        
        // zero to any positive power is still zero.
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35629);f = Fraction.getFraction(0, 1231);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35630);f = f.pow(1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35631);assertTrue(0==f.compareTo(Fraction.ZERO));
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35632);assertEquals(0, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35633);assertEquals(1231, f.getDenominator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35634);f = f.pow(2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35635);assertTrue(0==f.compareTo(Fraction.ZERO));
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35636);assertEquals(0, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35637);assertEquals(1, f.getDenominator());

        // zero to negative powers should throw an exception
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35638);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35639);f = f.pow(-1);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35640);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35641);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35642);f = f.pow(Integer.MIN_VALUE);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35643);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // one to any power is still one.
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35644);f = Fraction.getFraction(1, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35645);f = f.pow(0);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35646);assertEquals(f, Fraction.ONE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35647);f = f.pow(1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35648);assertEquals(f, Fraction.ONE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35649);f = f.pow(-1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35650);assertEquals(f, Fraction.ONE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35651);f = f.pow(Integer.MAX_VALUE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35652);assertEquals(f, Fraction.ONE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35653);f = f.pow(Integer.MIN_VALUE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35654);assertEquals(f, Fraction.ONE);

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35655);f = Fraction.getFraction(Integer.MAX_VALUE, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35656);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35657);f = f.pow(2);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35658);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        // Numerator growing too negative during the pow operation.
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35659);f = Fraction.getFraction(Integer.MIN_VALUE, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35660);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35661);f = f.pow(3);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35662);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35663);f = Fraction.getFraction(65536, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35664);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35665);f = f.pow(2);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35666);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
    
    @Test
    public void testAdd() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vtx82erir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testAdd",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35667,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vtx82erir(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35667);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35668);Fraction f = null;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35669);Fraction f1 = null;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35670);Fraction f2 = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35671);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35672);f2 = Fraction.getFraction(1, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35673);f = f1.add(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35674);assertEquals(4, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35675);assertEquals(5, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35676);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35677);f2 = Fraction.getFraction(2, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35678);f = f1.add(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35679);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35680);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35681);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35682);f2 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35683);f = f1.add(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35684);assertEquals(6, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35685);assertEquals(5, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35686);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35687);f2 = Fraction.getFraction(-4, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35688);f = f1.add(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35689);assertEquals(-1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35690);assertEquals(5, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35691);f1 = Fraction.getFraction(Integer.MAX_VALUE - 1, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35692);f2 = Fraction.ONE;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35693);f = f1.add(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35694);assertEquals(Integer.MAX_VALUE, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35695);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35696);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35697);f2 = Fraction.getFraction(1, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35698);f = f1.add(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35699);assertEquals(11, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35700);assertEquals(10, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35701);f1 = Fraction.getFraction(3, 8);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35702);f2 = Fraction.getFraction(1, 6);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35703);f = f1.add(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35704);assertEquals(13, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35705);assertEquals(24, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35706);f1 = Fraction.getFraction(0, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35707);f2 = Fraction.getFraction(1, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35708);f = f1.add(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35709);assertSame(f2, f);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35710);f = f2.add(f1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35711);assertSame(f2, f);
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35712);f1 = Fraction.getFraction(-1, 13*13*2*2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35713);f2 = Fraction.getFraction(-2, 13*17*2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35714);f = f1.add(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35715);assertEquals(13*13*17*2*2, f.getDenominator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35716);assertEquals(-17 - 2*13*2, f.getNumerator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35717);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35718);f.add(null);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35719);fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {}
        
        // if this fraction is added naively, it will overflow.
        // check that it doesn't.
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35720);f1 = Fraction.getFraction(1,32768*3);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35721);f2 = Fraction.getFraction(1,59049);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35722);f = f1.add(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35723);assertEquals(52451, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35724);assertEquals(1934917632, f.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35725);f1 = Fraction.getFraction(Integer.MIN_VALUE, 3);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35726);f2 = Fraction.ONE_THIRD;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35727);f = f1.add(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35728);assertEquals(Integer.MIN_VALUE+1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35729);assertEquals(3, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35730);f1 = Fraction.getFraction(Integer.MAX_VALUE - 1, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35731);f2 = Fraction.ONE;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35732);f = f1.add(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35733);assertEquals(Integer.MAX_VALUE, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35734);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35735);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35736);f = f.add(Fraction.ONE); // should overflow
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35737);fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
        
        // denominator should not be a multiple of 2 or 3 to trigger overflow
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35738);f1 = Fraction.getFraction(Integer.MIN_VALUE, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35739);f2 = Fraction.getFraction(-1,5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35740);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35741);f = f1.add(f2); // should overflow
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35742);fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35743);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35744);f= Fraction.getFraction(-Integer.MAX_VALUE, 1);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35745);f = f.add(f);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35746);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35747);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35748);f= Fraction.getFraction(-Integer.MAX_VALUE, 1);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35749);f = f.add(f);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35750);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35751);f1 = Fraction.getFraction(3,327680);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35752);f2 = Fraction.getFraction(2,59049);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35753);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35754);f = f1.add(f2); // should overflow
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35755);fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
            
    @Test
    public void testSubtract() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hib6tprl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testSubtract",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35756,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hib6tprl8(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35756);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35757);Fraction f = null;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35758);Fraction f1 = null;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35759);Fraction f2 = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35760);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35761);f2 = Fraction.getFraction(1, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35762);f = f1.subtract(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35763);assertEquals(2, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35764);assertEquals(5, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35765);f1 = Fraction.getFraction(7, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35766);f2 = Fraction.getFraction(2, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35767);f = f1.subtract(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35768);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35769);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35770);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35771);f2 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35772);f = f1.subtract(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35773);assertEquals(0, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35774);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35775);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35776);f2 = Fraction.getFraction(-4, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35777);f = f1.subtract(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35778);assertEquals(7, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35779);assertEquals(5, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35780);f1 = Fraction.getFraction(0, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35781);f2 = Fraction.getFraction(4, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35782);f = f1.subtract(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35783);assertEquals(-4, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35784);assertEquals(5, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35785);f1 = Fraction.getFraction(0, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35786);f2 = Fraction.getFraction(-4, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35787);f = f1.subtract(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35788);assertEquals(4, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35789);assertEquals(5, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35790);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35791);f2 = Fraction.getFraction(1, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35792);f = f1.subtract(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35793);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35794);assertEquals(10, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35795);f1 = Fraction.getFraction(0, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35796);f2 = Fraction.getFraction(1, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35797);f = f2.subtract(f1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35798);assertSame(f2, f);
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35799);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35800);f.subtract(null);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35801);fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {}
        
        // if this fraction is subtracted naively, it will overflow.
        // check that it doesn't.
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35802);f1 = Fraction.getFraction(1,32768*3);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35803);f2 = Fraction.getFraction(1,59049);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35804);f = f1.subtract(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35805);assertEquals(-13085, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35806);assertEquals(1934917632, f.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35807);f1 = Fraction.getFraction(Integer.MIN_VALUE, 3);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35808);f2 = Fraction.ONE_THIRD.negate();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35809);f = f1.subtract(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35810);assertEquals(Integer.MIN_VALUE+1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35811);assertEquals(3, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35812);f1 = Fraction.getFraction(Integer.MAX_VALUE, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35813);f2 = Fraction.ONE;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35814);f = f1.subtract(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35815);assertEquals(Integer.MAX_VALUE-1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35816);assertEquals(1, f.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35817);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35818);f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35819);f2 = Fraction.getFraction(1, Integer.MAX_VALUE - 1);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35820);f = f1.subtract(f2);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35821);fail("expecting ArithmeticException");  //should overflow
        } catch (final ArithmeticException ex) {}
            
        // denominator should not be a multiple of 2 or 3 to trigger overflow
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35822);f1 = Fraction.getFraction(Integer.MIN_VALUE, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35823);f2 = Fraction.getFraction(1,5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35824);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35825);f = f1.subtract(f2); // should overflow
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35826);fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35827);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35828);f= Fraction.getFraction(Integer.MIN_VALUE, 1);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35829);f = f.subtract(Fraction.ONE);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35830);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35831);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35832);f= Fraction.getFraction(Integer.MAX_VALUE, 1);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35833);f = f.subtract(Fraction.ONE.negate());
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35834);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35835);f1 = Fraction.getFraction(3,327680);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35836);f2 = Fraction.getFraction(2,59049);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35837);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35838);f = f1.subtract(f2); // should overflow
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35839);fail("expecting ArithmeticException but got: " + f.toString());
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
            
    @Test
    public void testMultiply() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vkd1nnrnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testMultiply",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35840,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vkd1nnrnk(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35840);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35841);Fraction f = null;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35842);Fraction f1 = null;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35843);Fraction f2 = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35844);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35845);f2 = Fraction.getFraction(2, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35846);f = f1.multiplyBy(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35847);assertEquals(6, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35848);assertEquals(25, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35849);f1 = Fraction.getFraction(6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35850);f2 = Fraction.getFraction(6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35851);f = f1.multiplyBy(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35852);assertEquals(9, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35853);assertEquals(25, f.getDenominator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35854);f = f.multiplyBy(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35855);assertEquals(27, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35856);assertEquals(125, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35857);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35858);f2 = Fraction.getFraction(-2, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35859);f = f1.multiplyBy(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35860);assertEquals(-6, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35861);assertEquals(25, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35862);f1 = Fraction.getFraction(-3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35863);f2 = Fraction.getFraction(-2, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35864);f = f1.multiplyBy(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35865);assertEquals(6, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35866);assertEquals(25, f.getDenominator());
        
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35867);f1 = Fraction.getFraction(0, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35868);f2 = Fraction.getFraction(2, 7);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35869);f = f1.multiplyBy(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35870);assertSame(Fraction.ZERO, f);
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35871);f1 = Fraction.getFraction(2, 7);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35872);f2 = Fraction.ONE;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35873);f = f1.multiplyBy(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35874);assertEquals(2, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35875);assertEquals(7, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35876);f1 = Fraction.getFraction(Integer.MAX_VALUE, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35877);f2 = Fraction.getFraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35878);f = f1.multiplyBy(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35879);assertEquals(Integer.MIN_VALUE, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35880);assertEquals(1, f.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35881);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35882);f.multiplyBy(null);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35883);fail("expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35884);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35885);f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35886);f = f1.multiplyBy(f1);  // should overflow
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35887);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
            
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35888);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35889);f1 = Fraction.getFraction(1, -Integer.MAX_VALUE);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35890);f = f1.multiplyBy(f1);  // should overflow
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35891);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
            
    @Test
    public void testDivide() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ae8h2mrp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testDivide",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35892,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ae8h2mrp0(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35892);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35893);Fraction f = null;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35894);Fraction f1 = null;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35895);Fraction f2 = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35896);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35897);f2 = Fraction.getFraction(2, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35898);f = f1.divideBy(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35899);assertEquals(3, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35900);assertEquals(2, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35901);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35902);f2 = Fraction.ZERO;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35903);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35904);f = f1.divideBy(f2);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35905);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35906);f1 = Fraction.getFraction(0, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35907);f2 = Fraction.getFraction(2, 7);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35908);f = f1.divideBy(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35909);assertSame(Fraction.ZERO, f);
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35910);f1 = Fraction.getFraction(2, 7);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35911);f2 = Fraction.ONE;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35912);f = f1.divideBy(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35913);assertEquals(2, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35914);assertEquals(7, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35915);f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35916);f = f1.divideBy(f1);  
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35917);assertEquals(1, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35918);assertEquals(1, f.getDenominator());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35919);f1 = Fraction.getFraction(Integer.MIN_VALUE, Integer.MAX_VALUE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35920);f2 = Fraction.getFraction(1, Integer.MAX_VALUE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35921);f = f1.divideBy(f2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35922);assertEquals(Integer.MIN_VALUE, f.getNumerator());
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35923);assertEquals(1, f.getDenominator());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35924);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35925);f.divideBy(null);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35926);fail("IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35927);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35928);f1 = Fraction.getFraction(1, Integer.MAX_VALUE);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35929);f = f1.divideBy(f1.invert());  // should overflow
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35930);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35931);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35932);f1 = Fraction.getFraction(1, -Integer.MAX_VALUE);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35933);f = f1.divideBy(f1.invert());  // should overflow
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35934);fail("expecting ArithmeticException");
        } catch (final ArithmeticException ex) {}
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
            
    @Test
    public void testEquals() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608rq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35935,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608rq7(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35935);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35936);Fraction f1 = null;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35937);Fraction f2 = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35938);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35939);assertFalse(f1.equals(null));
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35940);assertFalse(f1.equals(new Object()));
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35941);assertFalse(f1.equals(Integer.valueOf(6)));
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35942);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35943);f2 = Fraction.getFraction(2, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35944);assertFalse(f1.equals(f2));
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35945);assertTrue(f1.equals(f1));
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35946);assertTrue(f2.equals(f2));
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35947);f2 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35948);assertTrue(f1.equals(f2));
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35949);f2 = Fraction.getFraction(6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35950);assertFalse(f1.equals(f2));
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
    
    @Test
    public void testHashCode() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8rqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35951,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8rqn(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35951);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35952);final Fraction f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35953);Fraction f2 = Fraction.getFraction(3, 5);
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35954);assertTrue(f1.hashCode() == f2.hashCode());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35955);f2 = Fraction.getFraction(2, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35956);assertTrue(f1.hashCode() != f2.hashCode());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35957);f2 = Fraction.getFraction(6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35958);assertTrue(f1.hashCode() != f2.hashCode());
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
    
    @Test
    public void testCompareTo() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pz6vfvrqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testCompareTo",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35959,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pz6vfvrqv(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35959);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35960);Fraction f1 = null;
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35961);Fraction f2 = null;
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35962);f1 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35963);assertTrue(f1.compareTo(f1) == 0);
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35964);try {
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35965);f1.compareTo(null);
            __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35966);fail("expecting NullPointerException");
        } catch (final NullPointerException ex) {}
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35967);f2 = Fraction.getFraction(2, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35968);assertTrue(f1.compareTo(f2) > 0);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35969);assertTrue(f2.compareTo(f2) == 0);
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35970);f2 = Fraction.getFraction(4, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35971);assertTrue(f1.compareTo(f2) < 0);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35972);assertTrue(f2.compareTo(f2) == 0);
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35973);f2 = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35974);assertTrue(f1.compareTo(f2) == 0);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35975);assertTrue(f2.compareTo(f2) == 0);
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35976);f2 = Fraction.getFraction(6, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35977);assertTrue(f1.compareTo(f2) == 0);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35978);assertTrue(f2.compareTo(f2) == 0);

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35979);f2 = Fraction.getFraction(-1, 1, Integer.MAX_VALUE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35980);assertTrue(f1.compareTo(f2) > 0);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35981);assertTrue(f2.compareTo(f2) == 0);

    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
    
    @Test
    public void testToString() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),35982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidrri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),35982,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidrri(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(35982);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35983);Fraction f = null;

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35984);f = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35985);final String str = f.toString();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35986);assertEquals("3/5", str);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35987);assertSame(str, f.toString());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35988);f = Fraction.getFraction(7, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35989);assertEquals("7/5", f.toString());        
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35990);f = Fraction.getFraction(4, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35991);assertEquals("4/2", f.toString());        
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35992);f = Fraction.getFraction(0, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35993);assertEquals("0/2", f.toString());        
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35994);f = Fraction.getFraction(2, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35995);assertEquals("2/2", f.toString());        

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35996);f = Fraction.getFraction(Integer.MIN_VALUE, 0, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35997);assertEquals("-2147483648/1", f.toString());        

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35998);f = Fraction.getFraction(-1, 1, Integer.MAX_VALUE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(35999);assertEquals("-2147483648/2147483647", f.toString());
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
    
    @Test
    public void testToProperString() {__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceStart(getClass().getName(),36000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sj4a0brs0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2r3dr3dl3lqxuoj.R.rethrow($CLV_t2$);}finally{__CLR4_1_2r3dr3dl3lqxuoj.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.math.FractionTest.testToProperString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36000,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sj4a0brs0(){try{__CLR4_1_2r3dr3dl3lqxuoj.R.inc(36000);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36001);Fraction f = null;

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36002);f = Fraction.getFraction(3, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36003);final String str = f.toProperString();
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36004);assertEquals("3/5", str);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36005);assertSame(str, f.toProperString());
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36006);f = Fraction.getFraction(7, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36007);assertEquals("1 2/5", f.toProperString());        
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36008);f = Fraction.getFraction(14, 10);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36009);assertEquals("1 4/10", f.toProperString());        
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36010);f = Fraction.getFraction(4, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36011);assertEquals("2", f.toProperString());        
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36012);f = Fraction.getFraction(0, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36013);assertEquals("0", f.toProperString());        
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36014);f = Fraction.getFraction(2, 2);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36015);assertEquals("1", f.toProperString());        
        
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36016);f = Fraction.getFraction(-7, 5);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36017);assertEquals("-1 2/5", f.toProperString());        

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36018);f = Fraction.getFraction(Integer.MIN_VALUE, 0, 1);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36019);assertEquals("-2147483648", f.toProperString());        

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36020);f = Fraction.getFraction(-1, 1, Integer.MAX_VALUE);
        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36021);assertEquals("-1 1/2147483647", f.toProperString());

        __CLR4_1_2r3dr3dl3lqxuoj.R.inc(36022);assertEquals("-1", Fraction.getFraction(-1).toProperString());
    }finally{__CLR4_1_2r3dr3dl3lqxuoj.R.flushNeeded();}}
}
