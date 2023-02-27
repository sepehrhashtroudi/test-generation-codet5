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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.CharSet}.
 *
 * @version $Id$
 */
public class CharSetTest  {static class __CLR4_1_2i2ui2ul3lqxtl9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,23758,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testClass() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21x2ulvi2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testClass",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23430,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21x2ulvi2u(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23430);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23431);assertTrue(Modifier.isPublic(CharSet.class.getModifiers()));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23432);assertFalse(Modifier.isFinal(CharSet.class.getModifiers()));
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testGetInstance() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29yurb4i2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testGetInstance",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23433,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29yurb4i2x(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23433);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23434);assertSame(CharSet.EMPTY, CharSet.getInstance( (String) null));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23435);assertSame(CharSet.EMPTY, CharSet.getInstance(""));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23436);assertSame(CharSet.ASCII_ALPHA, CharSet.getInstance("a-zA-Z"));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23437);assertSame(CharSet.ASCII_ALPHA, CharSet.getInstance("A-Za-z"));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23438);assertSame(CharSet.ASCII_ALPHA_LOWER, CharSet.getInstance("a-z"));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23439);assertSame(CharSet.ASCII_ALPHA_UPPER, CharSet.getInstance("A-Z"));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23440);assertSame(CharSet.ASCII_NUMERIC, CharSet.getInstance("0-9"));
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetInstance_Stringarray() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rmm5k9i35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testGetInstance_Stringarray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23441,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rmm5k9i35(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23441);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23442);assertEquals(null, CharSet.getInstance((String[]) null));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23443);assertEquals("[]", CharSet.getInstance(new String[0]).toString());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23444);assertEquals("[]", CharSet.getInstance(new String[] {null}).toString());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23445);assertEquals("[a-e]", CharSet.getInstance(new String[] {"a-e"}).toString());
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor_String_simple() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q6wsi8i3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testConstructor_String_simple",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23446,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q6wsi8i3a(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23446);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23447);CharSet set;
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23448);CharRange[] array;
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23449);set = CharSet.getInstance((String) null);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23450);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23451);assertEquals("[]", set.toString());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23452);assertEquals(0, array.length);
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23453);set = CharSet.getInstance("");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23454);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23455);assertEquals("[]", set.toString());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23456);assertEquals(0, array.length);
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23457);set = CharSet.getInstance("a");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23458);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23459);assertEquals("[a]", set.toString());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23460);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23461);assertEquals("a", array[0].toString());
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23462);set = CharSet.getInstance("^a");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23463);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23464);assertEquals("[^a]", set.toString());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23465);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23466);assertEquals("^a", array[0].toString());
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23467);set = CharSet.getInstance("a-e");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23468);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23469);assertEquals("[a-e]", set.toString());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23470);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23471);assertEquals("a-e", array[0].toString());
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23472);set = CharSet.getInstance("^a-e");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23473);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23474);assertEquals("[^a-e]", set.toString());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23475);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23476);assertEquals("^a-e", array[0].toString());
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}
    
    @Test
    public void testConstructor_String_combo() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jx4472i45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testConstructor_String_combo",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23477,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jx4472i45(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23477);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23478);CharSet set;
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23479);CharRange[] array;
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23480);set = CharSet.getInstance("abc");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23481);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23482);assertEquals(3, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23483);assertTrue(ArrayUtils.contains(array, CharRange.is('a')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23484);assertTrue(ArrayUtils.contains(array, CharRange.is('b')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23485);assertTrue(ArrayUtils.contains(array, CharRange.is('c')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23486);set = CharSet.getInstance("a-ce-f");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23487);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23488);assertEquals(2, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23489);assertTrue(ArrayUtils.contains(array, CharRange.isIn('a', 'c')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23490);assertTrue(ArrayUtils.contains(array, CharRange.isIn('e', 'f')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23491);set = CharSet.getInstance("ae-f");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23492);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23493);assertEquals(2, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23494);assertTrue(ArrayUtils.contains(array, CharRange.is('a')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23495);assertTrue(ArrayUtils.contains(array, CharRange.isIn('e', 'f')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23496);set = CharSet.getInstance("e-fa");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23497);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23498);assertEquals(2, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23499);assertTrue(ArrayUtils.contains(array, CharRange.is('a')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23500);assertTrue(ArrayUtils.contains(array, CharRange.isIn('e', 'f')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23501);set = CharSet.getInstance("ae-fm-pz");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23502);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23503);assertEquals(4, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23504);assertTrue(ArrayUtils.contains(array, CharRange.is('a')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23505);assertTrue(ArrayUtils.contains(array, CharRange.isIn('e', 'f')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23506);assertTrue(ArrayUtils.contains(array, CharRange.isIn('m', 'p')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23507);assertTrue(ArrayUtils.contains(array, CharRange.is('z')));
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}
    
    @Test
    public void testConstructor_String_comboNegated() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22smfdai50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testConstructor_String_comboNegated",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23508,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22smfdai50(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23508);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23509);CharSet set;
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23510);CharRange[] array;
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23511);set = CharSet.getInstance("^abc");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23512);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23513);assertEquals(3, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23514);assertTrue(ArrayUtils.contains(array, CharRange.isNot('a')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23515);assertTrue(ArrayUtils.contains(array, CharRange.is('b')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23516);assertTrue(ArrayUtils.contains(array, CharRange.is('c')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23517);set = CharSet.getInstance("b^ac");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23518);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23519);assertEquals(3, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23520);assertTrue(ArrayUtils.contains(array, CharRange.is('b')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23521);assertTrue(ArrayUtils.contains(array, CharRange.isNot('a')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23522);assertTrue(ArrayUtils.contains(array, CharRange.is('c')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23523);set = CharSet.getInstance("db^ac");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23524);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23525);assertEquals(4, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23526);assertTrue(ArrayUtils.contains(array, CharRange.is('d')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23527);assertTrue(ArrayUtils.contains(array, CharRange.is('b')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23528);assertTrue(ArrayUtils.contains(array, CharRange.isNot('a')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23529);assertTrue(ArrayUtils.contains(array, CharRange.is('c')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23530);set = CharSet.getInstance("^b^a");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23531);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23532);assertEquals(2, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23533);assertTrue(ArrayUtils.contains(array, CharRange.isNot('b')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23534);assertTrue(ArrayUtils.contains(array, CharRange.isNot('a')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23535);set = CharSet.getInstance("b^a-c^z");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23536);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23537);assertEquals(3, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23538);assertTrue(ArrayUtils.contains(array, CharRange.isNotIn('a', 'c')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23539);assertTrue(ArrayUtils.contains(array, CharRange.isNot('z')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23540);assertTrue(ArrayUtils.contains(array, CharRange.is('b')));
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}

    @Test
    public void testConstructor_String_oddDash() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_235zey9i5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testConstructor_String_oddDash",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23541,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_235zey9i5x(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23541);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23542);CharSet set;
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23543);CharRange[] array;
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23544);set = CharSet.getInstance("-");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23545);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23546);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23547);assertTrue(ArrayUtils.contains(array, CharRange.is('-')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23548);set = CharSet.getInstance("--");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23549);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23550);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23551);assertTrue(ArrayUtils.contains(array, CharRange.is('-')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23552);set = CharSet.getInstance("---");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23553);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23554);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23555);assertTrue(ArrayUtils.contains(array, CharRange.is('-')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23556);set = CharSet.getInstance("----");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23557);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23558);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23559);assertTrue(ArrayUtils.contains(array, CharRange.is('-')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23560);set = CharSet.getInstance("-a");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23561);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23562);assertEquals(2, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23563);assertTrue(ArrayUtils.contains(array, CharRange.is('-')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23564);assertTrue(ArrayUtils.contains(array, CharRange.is('a')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23565);set = CharSet.getInstance("a-");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23566);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23567);assertEquals(2, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23568);assertTrue(ArrayUtils.contains(array, CharRange.is('a')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23569);assertTrue(ArrayUtils.contains(array, CharRange.is('-')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23570);set = CharSet.getInstance("a--");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23571);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23572);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23573);assertTrue(ArrayUtils.contains(array, CharRange.isIn('a', '-')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23574);set = CharSet.getInstance("--a");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23575);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23576);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23577);assertTrue(ArrayUtils.contains(array, CharRange.isIn('-', 'a')));
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}
    
    @Test
    public void testConstructor_String_oddNegate() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2taotsxi6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testConstructor_String_oddNegate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23578,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2taotsxi6y(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23578);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23579);CharSet set;
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23580);CharRange[] array;
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23581);set = CharSet.getInstance("^");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23582);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23583);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23584);assertTrue(ArrayUtils.contains(array, CharRange.is('^'))); // "^"
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23585);set = CharSet.getInstance("^^");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23586);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23587);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23588);assertTrue(ArrayUtils.contains(array, CharRange.isNot('^'))); // "^^"
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23589);set = CharSet.getInstance("^^^");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23590);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23591);assertEquals(2, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23592);assertTrue(ArrayUtils.contains(array, CharRange.isNot('^'))); // "^^"
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23593);assertTrue(ArrayUtils.contains(array, CharRange.is('^'))); // "^"
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23594);set = CharSet.getInstance("^^^^");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23595);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23596);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23597);assertTrue(ArrayUtils.contains(array, CharRange.isNot('^'))); // "^^" x2
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23598);set = CharSet.getInstance("a^");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23599);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23600);assertEquals(2, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23601);assertTrue(ArrayUtils.contains(array, CharRange.is('a'))); // "a"
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23602);assertTrue(ArrayUtils.contains(array, CharRange.is('^'))); // "^"
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23603);set = CharSet.getInstance("^a-");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23604);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23605);assertEquals(2, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23606);assertTrue(ArrayUtils.contains(array, CharRange.isNot('a'))); // "^a"
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23607);assertTrue(ArrayUtils.contains(array, CharRange.is('-'))); // "-"
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23608);set = CharSet.getInstance("^^-c");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23609);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23610);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23611);assertTrue(ArrayUtils.contains(array, CharRange.isNotIn('^', 'c'))); // "^^-c"
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23612);set = CharSet.getInstance("^c-^");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23613);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23614);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23615);assertTrue(ArrayUtils.contains(array, CharRange.isNotIn('c', '^'))); // "^c-^"
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23616);set = CharSet.getInstance("^c-^d");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23617);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23618);assertEquals(2, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23619);assertTrue(ArrayUtils.contains(array, CharRange.isNotIn('c', '^'))); // "^c-^"
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23620);assertTrue(ArrayUtils.contains(array, CharRange.is('d'))); // "d"
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23621);set = CharSet.getInstance("^^-");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23622);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23623);assertEquals(2, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23624);assertTrue(ArrayUtils.contains(array, CharRange.isNot('^'))); // "^^"
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23625);assertTrue(ArrayUtils.contains(array, CharRange.is('-'))); // "-"
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}
    
    @Test
    public void testConstructor_String_oddCombinations() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28cfh7hi8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testConstructor_String_oddCombinations",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23626,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28cfh7hi8a(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23626);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23627);CharSet set;
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23628);CharRange[] array = null;
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23629);set = CharSet.getInstance("a-^c");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23630);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23631);assertTrue(ArrayUtils.contains(array, CharRange.isIn('a', '^'))); // "a-^"
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23632);assertTrue(ArrayUtils.contains(array, CharRange.is('c'))); // "c"
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23633);assertFalse(set.contains('b'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23634);assertTrue(set.contains('^'));  
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23635);assertTrue(set.contains('_')); // between ^ and a
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23636);assertTrue(set.contains('c'));  
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23637);set = CharSet.getInstance("^a-^c");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23638);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23639);assertTrue(ArrayUtils.contains(array, CharRange.isNotIn('a', '^'))); // "^a-^"
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23640);assertTrue(ArrayUtils.contains(array, CharRange.is('c'))); // "c"
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23641);assertTrue(set.contains('b'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23642);assertFalse(set.contains('^'));  
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23643);assertFalse(set.contains('_')); // between ^ and a
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23644);set = CharSet.getInstance("a- ^-- "); //contains everything
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23645);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23646);assertTrue(ArrayUtils.contains(array, CharRange.isIn('a', ' '))); // "a- "
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23647);assertTrue(ArrayUtils.contains(array, CharRange.isNotIn('-', ' '))); // "^-- "
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23648);assertTrue(set.contains('#'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23649);assertTrue(set.contains('^'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23650);assertTrue(set.contains('a'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23651);assertTrue(set.contains('*'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23652);assertTrue(set.contains('A'));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23653);set = CharSet.getInstance("^-b");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23654);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23655);assertTrue(ArrayUtils.contains(array, CharRange.isIn('^','b'))); // "^-b"
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23656);assertTrue(set.contains('b'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23657);assertTrue(set.contains('_')); // between ^ and a
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23658);assertFalse(set.contains('A'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23659);assertTrue(set.contains('^')); 
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23660);set = CharSet.getInstance("b-^");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23661);array = set.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23662);assertTrue(ArrayUtils.contains(array, CharRange.isIn('^','b'))); // "b-^"
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23663);assertTrue(set.contains('b'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23664);assertTrue(set.contains('^'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23665);assertTrue(set.contains('a')); // between ^ and b
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23666);assertFalse(set.contains('c')); 
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}
        
    //-----------------------------------------------------------------------    
    @Test
    public void testEquals_Object() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q292p8i9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testEquals_Object",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23667,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q292p8i9f(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23667);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23668);final CharSet abc = CharSet.getInstance("abc");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23669);final CharSet abc2 = CharSet.getInstance("abc");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23670);final CharSet atoc = CharSet.getInstance("a-c");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23671);final CharSet atoc2 = CharSet.getInstance("a-c");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23672);final CharSet notatoc = CharSet.getInstance("^a-c");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23673);final CharSet notatoc2 = CharSet.getInstance("^a-c");
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23674);assertFalse(abc.equals(null));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23675);assertTrue(abc.equals(abc));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23676);assertTrue(abc.equals(abc2));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23677);assertFalse(abc.equals(atoc));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23678);assertFalse(abc.equals(notatoc));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23679);assertFalse(atoc.equals(abc));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23680);assertTrue(atoc.equals(atoc));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23681);assertTrue(atoc.equals(atoc2));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23682);assertFalse(atoc.equals(notatoc));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23683);assertFalse(notatoc.equals(abc));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23684);assertFalse(notatoc.equals(atoc));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23685);assertTrue(notatoc.equals(notatoc));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23686);assertTrue(notatoc.equals(notatoc2));
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}
            
    @Test
    public void testHashCode() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8i9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23687,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8i9z(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23687);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23688);final CharSet abc = CharSet.getInstance("abc");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23689);final CharSet abc2 = CharSet.getInstance("abc");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23690);final CharSet atoc = CharSet.getInstance("a-c");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23691);final CharSet atoc2 = CharSet.getInstance("a-c");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23692);final CharSet notatoc = CharSet.getInstance("^a-c");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23693);final CharSet notatoc2 = CharSet.getInstance("^a-c");
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23694);assertEquals(abc.hashCode(), abc.hashCode());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23695);assertEquals(abc.hashCode(), abc2.hashCode());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23696);assertEquals(atoc.hashCode(), atoc.hashCode());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23697);assertEquals(atoc.hashCode(), atoc2.hashCode());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23698);assertEquals(notatoc.hashCode(), notatoc.hashCode());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23699);assertEquals(notatoc.hashCode(), notatoc2.hashCode());
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------    
    @Test
    public void testContains_Char() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v8fyfpiac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testContains_Char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23700,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v8fyfpiac(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23700);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23701);final CharSet btod = CharSet.getInstance("b-d");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23702);final CharSet dtob = CharSet.getInstance("d-b");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23703);final CharSet bcd = CharSet.getInstance("bcd");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23704);final CharSet bd = CharSet.getInstance("bd");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23705);final CharSet notbtod = CharSet.getInstance("^b-d");
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23706);assertFalse(btod.contains('a'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23707);assertTrue(btod.contains('b'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23708);assertTrue(btod.contains('c'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23709);assertTrue(btod.contains('d'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23710);assertFalse(btod.contains('e'));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23711);assertFalse(bcd.contains('a'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23712);assertTrue(bcd.contains('b'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23713);assertTrue(bcd.contains('c'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23714);assertTrue(bcd.contains('d'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23715);assertFalse(bcd.contains('e'));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23716);assertFalse(bd.contains('a'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23717);assertTrue(bd.contains('b'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23718);assertFalse(bd.contains('c'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23719);assertTrue(bd.contains('d'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23720);assertFalse(bd.contains('e'));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23721);assertTrue(notbtod.contains('a'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23722);assertFalse(notbtod.contains('b'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23723);assertFalse(notbtod.contains('c'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23724);assertFalse(notbtod.contains('d'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23725);assertTrue(notbtod.contains('e'));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23726);assertFalse(dtob.contains('a'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23727);assertTrue(dtob.contains('b'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23728);assertTrue(dtob.contains('c'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23729);assertTrue(dtob.contains('d'));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23730);assertFalse(dtob.contains('e'));
      
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23731);final CharRange[] array = dtob.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23732);assertEquals("[b-d]", dtob.toString());
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23733);assertEquals(1, array.length);
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------    
    @Test
    public void testSerialization() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26m1on9iba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testSerialization",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23734,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26m1on9iba(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23734);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23735);CharSet set = CharSet.getInstance("a");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23736);assertEquals(set, SerializationUtils.clone(set)); 
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23737);set = CharSet.getInstance("a-e");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23738);assertEquals(set, SerializationUtils.clone(set)); 
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23739);set = CharSet.getInstance("be-f^a-z");
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23740);assertEquals(set, SerializationUtils.clone(set)); 
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------    
    @Test
    public void testStatics() {__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceStart(getClass().getName(),23741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i1n64aibh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2i2ui2ul3lqxtl9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2i2ui2ul3lqxtl9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetTest.testStatics",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23741,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i1n64aibh(){try{__CLR4_1_2i2ui2ul3lqxtl9.R.inc(23741);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23742);CharRange[] array;
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23743);array = CharSet.EMPTY.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23744);assertEquals(0, array.length);
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23745);array = CharSet.ASCII_ALPHA.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23746);assertEquals(2, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23747);assertTrue(ArrayUtils.contains(array, CharRange.isIn('a', 'z')));
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23748);assertTrue(ArrayUtils.contains(array, CharRange.isIn('A', 'Z')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23749);array = CharSet.ASCII_ALPHA_LOWER.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23750);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23751);assertTrue(ArrayUtils.contains(array, CharRange.isIn('a', 'z')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23752);array = CharSet.ASCII_ALPHA_UPPER.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23753);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23754);assertTrue(ArrayUtils.contains(array, CharRange.isIn('A', 'Z')));
        
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23755);array = CharSet.ASCII_NUMERIC.getCharRanges();
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23756);assertEquals(1, array.length);
        __CLR4_1_2i2ui2ul3lqxtl9.R.inc(23757);assertTrue(ArrayUtils.contains(array, CharRange.isIn('0', '9')));
    }finally{__CLR4_1_2i2ui2ul3lqxtl9.R.flushNeeded();}}
    
}
