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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.CharSetUtils}.
 *
 * @version $Id$
 */
public class CharSetUtilsTest  {static class __CLR4_1_2ibyibyl3lqxtlt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,23912,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceStart(getClass().getName(),23758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hiby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ibyibyl3lqxtlt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23758,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hiby(){try{__CLR4_1_2ibyibyl3lqxtlt.R.inc(23758);
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23759);assertNotNull(new CharSetUtils());
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23760);final Constructor<?>[] cons = CharSetUtils.class.getDeclaredConstructors();
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23761);assertEquals(1, cons.length);
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23762);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23763);assertTrue(Modifier.isPublic(CharSetUtils.class.getModifiers()));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23764);assertFalse(Modifier.isFinal(CharSetUtils.class.getModifiers()));
    }finally{__CLR4_1_2ibyibyl3lqxtlt.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testSqueeze_StringString() {__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceStart(getClass().getName(),23765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_277uwegic5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ibyibyl3lqxtlt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testSqueeze_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23765,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_277uwegic5(){try{__CLR4_1_2ibyibyl3lqxtlt.R.inc(23765);
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23766);assertEquals(null, CharSetUtils.squeeze(null, (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23767);assertEquals(null, CharSetUtils.squeeze(null, ""));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23768);assertEquals("", CharSetUtils.squeeze("", (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23769);assertEquals("", CharSetUtils.squeeze("", ""));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23770);assertEquals("", CharSetUtils.squeeze("", "a-e"));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23771);assertEquals("hello", CharSetUtils.squeeze("hello", (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23772);assertEquals("hello", CharSetUtils.squeeze("hello", ""));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23773);assertEquals("hello", CharSetUtils.squeeze("hello", "a-e"));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23774);assertEquals("helo", CharSetUtils.squeeze("hello", "l-p"));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23775);assertEquals("heloo", CharSetUtils.squeeze("helloo", "l"));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23776);assertEquals("hello", CharSetUtils.squeeze("helloo", "^l"));
    }finally{__CLR4_1_2ibyibyl3lqxtlt.R.flushNeeded();}}
    
    @Test
    public void testSqueeze_StringStringarray() {__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceStart(getClass().getName(),23777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m2trsfich();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ibyibyl3lqxtlt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testSqueeze_StringStringarray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23777,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m2trsfich(){try{__CLR4_1_2ibyibyl3lqxtlt.R.inc(23777);
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23778);assertEquals(null, CharSetUtils.squeeze(null, (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23779);assertEquals(null, CharSetUtils.squeeze(null, new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23780);assertEquals(null, CharSetUtils.squeeze(null, new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23781);assertEquals(null, CharSetUtils.squeeze(null, new String[] {"el"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23782);assertEquals("", CharSetUtils.squeeze("", (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23783);assertEquals("", CharSetUtils.squeeze("", new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23784);assertEquals("", CharSetUtils.squeeze("", new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23785);assertEquals("", CharSetUtils.squeeze("", new String[] {"a-e"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23786);assertEquals("hello", CharSetUtils.squeeze("hello", (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23787);assertEquals("hello", CharSetUtils.squeeze("hello", new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23788);assertEquals("hello", CharSetUtils.squeeze("hello", new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23789);assertEquals("hello", CharSetUtils.squeeze("hello", new String[] {"a-e"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23790);assertEquals("helo", CharSetUtils.squeeze("hello", new String[] { "el" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23791);assertEquals("hello", CharSetUtils.squeeze("hello", new String[] { "e" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23792);assertEquals("fofof", CharSetUtils.squeeze("fooffooff", new String[] { "of" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23793);assertEquals("fof", CharSetUtils.squeeze("fooooff", new String[] { "fo" }));
    }finally{__CLR4_1_2ibyibyl3lqxtlt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testContainsAny_StringString() {__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceStart(getClass().getName(),23794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i4ipo3icy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ibyibyl3lqxtlt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testContainsAny_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23794,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i4ipo3icy(){try{__CLR4_1_2ibyibyl3lqxtlt.R.inc(23794);
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23795);assertFalse(CharSetUtils.containsAny(null, (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23796);assertFalse(CharSetUtils.containsAny(null, ""));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23797);assertFalse(CharSetUtils.containsAny("", (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23798);assertFalse(CharSetUtils.containsAny("", ""));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23799);assertFalse(CharSetUtils.containsAny("", "a-e"));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23800);assertFalse(CharSetUtils.containsAny("hello", (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23801);assertFalse(CharSetUtils.containsAny("hello", ""));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23802);assertTrue(CharSetUtils.containsAny("hello", "a-e"));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23803);assertTrue(CharSetUtils.containsAny("hello", "l-p"));
    }finally{__CLR4_1_2ibyibyl3lqxtlt.R.flushNeeded();}}
    
    @Test
    public void testContainsAny_StringStringarray() {__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceStart(getClass().getName(),23804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ff7y12id8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ibyibyl3lqxtlt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testContainsAny_StringStringarray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23804,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ff7y12id8(){try{__CLR4_1_2ibyibyl3lqxtlt.R.inc(23804);
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23805);assertFalse(CharSetUtils.containsAny(null, (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23806);assertFalse(CharSetUtils.containsAny(null, new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23807);assertFalse(CharSetUtils.containsAny(null, new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23808);assertFalse(CharSetUtils.containsAny(null, new String[] {"a-e"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23809);assertFalse(CharSetUtils.containsAny("", (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23810);assertFalse(CharSetUtils.containsAny("", new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23811);assertFalse(CharSetUtils.containsAny("", new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23812);assertFalse(CharSetUtils.containsAny("", new String[] {"a-e"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23813);assertFalse(CharSetUtils.containsAny("hello", (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23814);assertFalse(CharSetUtils.containsAny("hello", new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23815);assertFalse(CharSetUtils.containsAny("hello", new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23816);assertTrue(CharSetUtils.containsAny("hello", new String[] {"a-e"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23817);assertTrue(CharSetUtils.containsAny("hello", new String[] { "el" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23818);assertFalse(CharSetUtils.containsAny("hello", new String[] { "x" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23819);assertTrue(CharSetUtils.containsAny("hello", new String[] { "e-i" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23820);assertTrue(CharSetUtils.containsAny("hello", new String[] { "a-z" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23821);assertFalse(CharSetUtils.containsAny("hello", new String[] { "" }));
    }finally{__CLR4_1_2ibyibyl3lqxtlt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testCount_StringString() {__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceStart(getClass().getName(),23822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23lgldhidq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ibyibyl3lqxtlt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testCount_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23822,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23lgldhidq(){try{__CLR4_1_2ibyibyl3lqxtlt.R.inc(23822);
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23823);assertEquals(0, CharSetUtils.count(null, (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23824);assertEquals(0, CharSetUtils.count(null, ""));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23825);assertEquals(0, CharSetUtils.count("", (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23826);assertEquals(0, CharSetUtils.count("", ""));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23827);assertEquals(0, CharSetUtils.count("", "a-e"));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23828);assertEquals(0, CharSetUtils.count("hello", (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23829);assertEquals(0, CharSetUtils.count("hello", ""));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23830);assertEquals(1, CharSetUtils.count("hello", "a-e"));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23831);assertEquals(3, CharSetUtils.count("hello", "l-p"));
    }finally{__CLR4_1_2ibyibyl3lqxtlt.R.flushNeeded();}}
    
    @Test
    public void testCount_StringStringarray() {__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceStart(getClass().getName(),23832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ddjlvgie0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ibyibyl3lqxtlt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testCount_StringStringarray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23832,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ddjlvgie0(){try{__CLR4_1_2ibyibyl3lqxtlt.R.inc(23832);
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23833);assertEquals(0, CharSetUtils.count(null, (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23834);assertEquals(0, CharSetUtils.count(null, new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23835);assertEquals(0, CharSetUtils.count(null, new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23836);assertEquals(0, CharSetUtils.count(null, new String[] {"a-e"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23837);assertEquals(0, CharSetUtils.count("", (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23838);assertEquals(0, CharSetUtils.count("", new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23839);assertEquals(0, CharSetUtils.count("", new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23840);assertEquals(0, CharSetUtils.count("", new String[] {"a-e"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23841);assertEquals(0, CharSetUtils.count("hello", (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23842);assertEquals(0, CharSetUtils.count("hello", new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23843);assertEquals(0, CharSetUtils.count("hello", new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23844);assertEquals(1, CharSetUtils.count("hello", new String[] {"a-e"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23845);assertEquals(3, CharSetUtils.count("hello", new String[] { "el" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23846);assertEquals(0, CharSetUtils.count("hello", new String[] { "x" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23847);assertEquals(2, CharSetUtils.count("hello", new String[] { "e-i" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23848);assertEquals(5, CharSetUtils.count("hello", new String[] { "a-z" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23849);assertEquals(0, CharSetUtils.count("hello", new String[] { "" }));
    }finally{__CLR4_1_2ibyibyl3lqxtlt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testKeep_StringString() {__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceStart(getClass().getName(),23850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aycwq9iei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ibyibyl3lqxtlt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testKeep_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23850,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aycwq9iei(){try{__CLR4_1_2ibyibyl3lqxtlt.R.inc(23850);
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23851);assertEquals(null, CharSetUtils.keep(null, (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23852);assertEquals(null, CharSetUtils.keep(null, ""));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23853);assertEquals("", CharSetUtils.keep("", (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23854);assertEquals("", CharSetUtils.keep("", ""));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23855);assertEquals("", CharSetUtils.keep("", "a-e"));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23856);assertEquals("", CharSetUtils.keep("hello", (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23857);assertEquals("", CharSetUtils.keep("hello", ""));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23858);assertEquals("", CharSetUtils.keep("hello", "xyz"));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23859);assertEquals("hello", CharSetUtils.keep("hello", "a-z"));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23860);assertEquals("hello", CharSetUtils.keep("hello", "oleh"));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23861);assertEquals("ell", CharSetUtils.keep("hello", "el"));
    }finally{__CLR4_1_2ibyibyl3lqxtlt.R.flushNeeded();}}
    
    @Test
    public void testKeep_StringStringarray() {__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceStart(getClass().getName(),23862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2e4eppmieu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ibyibyl3lqxtlt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testKeep_StringStringarray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23862,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2e4eppmieu(){try{__CLR4_1_2ibyibyl3lqxtlt.R.inc(23862);
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23863);assertEquals(null, CharSetUtils.keep(null, (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23864);assertEquals(null, CharSetUtils.keep(null, new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23865);assertEquals(null, CharSetUtils.keep(null, new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23866);assertEquals(null, CharSetUtils.keep(null, new String[] {"a-e"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23867);assertEquals("", CharSetUtils.keep("", (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23868);assertEquals("", CharSetUtils.keep("", new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23869);assertEquals("", CharSetUtils.keep("", new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23870);assertEquals("", CharSetUtils.keep("", new String[] {"a-e"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23871);assertEquals("", CharSetUtils.keep("hello", (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23872);assertEquals("", CharSetUtils.keep("hello", new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23873);assertEquals("", CharSetUtils.keep("hello", new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23874);assertEquals("e", CharSetUtils.keep("hello", new String[] {"a-e"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23875);assertEquals("e", CharSetUtils.keep("hello", new String[] { "a-e" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23876);assertEquals("ell", CharSetUtils.keep("hello", new String[] { "el" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23877);assertEquals("hello", CharSetUtils.keep("hello", new String[] { "elho" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23878);assertEquals("hello", CharSetUtils.keep("hello", new String[] { "a-z" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23879);assertEquals("----", CharSetUtils.keep("----", new String[] { "-" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23880);assertEquals("ll", CharSetUtils.keep("hello", new String[] { "l" }));
    }finally{__CLR4_1_2ibyibyl3lqxtlt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testDelete_StringString() {__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceStart(getClass().getName(),23881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xbf5v9ifd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ibyibyl3lqxtlt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testDelete_StringString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23881,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xbf5v9ifd(){try{__CLR4_1_2ibyibyl3lqxtlt.R.inc(23881);
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23882);assertEquals(null, CharSetUtils.delete(null, (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23883);assertEquals(null, CharSetUtils.delete(null, ""));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23884);assertEquals("", CharSetUtils.delete("", (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23885);assertEquals("", CharSetUtils.delete("", ""));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23886);assertEquals("", CharSetUtils.delete("", "a-e"));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23887);assertEquals("hello", CharSetUtils.delete("hello", (String) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23888);assertEquals("hello", CharSetUtils.delete("hello", ""));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23889);assertEquals("hllo", CharSetUtils.delete("hello", "a-e"));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23890);assertEquals("he", CharSetUtils.delete("hello", "l-p"));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23891);assertEquals("hello", CharSetUtils.delete("hello", "z"));
    }finally{__CLR4_1_2ibyibyl3lqxtlt.R.flushNeeded();}}
    
    @Test
    public void testDelete_StringStringarray() {__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceStart(getClass().getName(),23892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bvs5vgifo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ibyibyl3lqxtlt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ibyibyl3lqxtlt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.CharSetUtilsTest.testDelete_StringStringarray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),23892,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bvs5vgifo(){try{__CLR4_1_2ibyibyl3lqxtlt.R.inc(23892);
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23893);assertEquals(null, CharSetUtils.delete(null, (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23894);assertEquals(null, CharSetUtils.delete(null, new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23895);assertEquals(null, CharSetUtils.delete(null, new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23896);assertEquals(null, CharSetUtils.delete(null, new String[] {"el"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23897);assertEquals("", CharSetUtils.delete("", (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23898);assertEquals("", CharSetUtils.delete("", new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23899);assertEquals("", CharSetUtils.delete("", new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23900);assertEquals("", CharSetUtils.delete("", new String[] {"a-e"}));
        
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23901);assertEquals("hello", CharSetUtils.delete("hello", (String[]) null));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23902);assertEquals("hello", CharSetUtils.delete("hello", new String[0]));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23903);assertEquals("hello", CharSetUtils.delete("hello", new String[] {null}));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23904);assertEquals("hello", CharSetUtils.delete("hello", new String[] {"xyz"}));

        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23905);assertEquals("ho", CharSetUtils.delete("hello", new String[] { "el" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23906);assertEquals("", CharSetUtils.delete("hello", new String[] { "elho" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23907);assertEquals("hello", CharSetUtils.delete("hello", new String[] { "" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23908);assertEquals("hello", CharSetUtils.delete("hello", ""));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23909);assertEquals("", CharSetUtils.delete("hello", new String[] { "a-z" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23910);assertEquals("", CharSetUtils.delete("----", new String[] { "-" }));
        __CLR4_1_2ibyibyl3lqxtlt.R.inc(23911);assertEquals("heo", CharSetUtils.delete("hello", new String[] { "l" }));
    }finally{__CLR4_1_2ibyibyl3lqxtlt.R.flushNeeded();}}
    
}
