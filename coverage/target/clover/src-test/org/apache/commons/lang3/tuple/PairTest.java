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
package org.apache.commons.lang3.tuple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.junit.Test;

/**
 * Test the Pair class.
 * 
 * @version $Id$
 */
public class PairTest {static class __CLR4_1_2y88y88l3lqxvaf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,44415,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testPairOf() throws Exception {__CLR4_1_2y88y88l3lqxvaf.R.globalSliceStart(getClass().getName(),44360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2e4t2tyy88();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y88y88l3lqxvaf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y88y88l3lqxvaf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testPairOf",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44360,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2e4t2tyy88() throws Exception{try{__CLR4_1_2y88y88l3lqxvaf.R.inc(44360);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44361);final Pair<Integer, String> pair = Pair.of(0, "foo");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44362);assertTrue(pair instanceof ImmutablePair<?, ?>);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44363);assertEquals(0, ((ImmutablePair<Integer, String>) pair).left.intValue());
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44364);assertEquals("foo", ((ImmutablePair<Integer, String>) pair).right);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44365);final Pair<Object, String> pair2 = Pair.of(null, "bar");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44366);assertTrue(pair2 instanceof ImmutablePair<?, ?>);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44367);assertNull(((ImmutablePair<Object, String>) pair2).left);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44368);assertEquals("bar", ((ImmutablePair<Object, String>) pair2).right);
    }finally{__CLR4_1_2y88y88l3lqxvaf.R.flushNeeded();}}

    @Test
    public void testCompatibilityBetweenPairs() throws Exception {__CLR4_1_2y88y88l3lqxvaf.R.globalSliceStart(getClass().getName(),44369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i13rquy8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y88y88l3lqxvaf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y88y88l3lqxvaf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testCompatibilityBetweenPairs",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44369,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i13rquy8h() throws Exception{try{__CLR4_1_2y88y88l3lqxvaf.R.inc(44369);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44370);final Pair<Integer, String> pair = ImmutablePair.of(0, "foo");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44371);final Pair<Integer, String> pair2 = MutablePair.of(0, "foo");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44372);assertEquals(pair, pair2);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44373);assertEquals(pair.hashCode(), pair2.hashCode());
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44374);final HashSet<Pair<Integer, String>> set = new HashSet<Pair<Integer, String>>();
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44375);set.add(pair);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44376);assertTrue(set.contains(pair2));

        __CLR4_1_2y88y88l3lqxvaf.R.inc(44377);pair2.setValue("bar");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44378);assertFalse(pair.equals(pair2));
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44379);assertFalse(pair.hashCode() == pair2.hashCode());
    }finally{__CLR4_1_2y88y88l3lqxvaf.R.flushNeeded();}}

    @Test
    public void testMapEntry() throws Exception {__CLR4_1_2y88y88l3lqxvaf.R.globalSliceStart(getClass().getName(),44380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21vnlhty8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y88y88l3lqxvaf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y88y88l3lqxvaf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testMapEntry",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44380,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21vnlhty8s() throws Exception{try{__CLR4_1_2y88y88l3lqxvaf.R.inc(44380);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44381);final Pair<Integer, String> pair = ImmutablePair.of(0, "foo");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44382);final HashMap<Integer, String> map = new HashMap<Integer, String>();
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44383);map.put(0, "foo");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44384);final Entry<Integer, String> entry = map.entrySet().iterator().next();
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44385);assertEquals(pair, entry);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44386);assertEquals(pair.hashCode(), entry.hashCode());
    }finally{__CLR4_1_2y88y88l3lqxvaf.R.flushNeeded();}}

    @Test
    public void testComparable1() throws Exception {__CLR4_1_2y88y88l3lqxvaf.R.globalSliceStart(getClass().getName(),44387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m96w1gy8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y88y88l3lqxvaf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y88y88l3lqxvaf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testComparable1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44387,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m96w1gy8z() throws Exception{try{__CLR4_1_2y88y88l3lqxvaf.R.inc(44387);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44388);final Pair<String, String> pair1 = Pair.of("A", "D");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44389);final Pair<String, String> pair2 = Pair.of("B", "C");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44390);assertTrue(pair1.compareTo(pair1) == 0);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44391);assertTrue(pair1.compareTo(pair2) < 0);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44392);assertTrue(pair2.compareTo(pair2) == 0);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44393);assertTrue(pair2.compareTo(pair1) > 0);
    }finally{__CLR4_1_2y88y88l3lqxvaf.R.flushNeeded();}}

    @Test
    public void testComparable2() throws Exception {__CLR4_1_2y88y88l3lqxvaf.R.globalSliceStart(getClass().getName(),44394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j06x8zy96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y88y88l3lqxvaf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y88y88l3lqxvaf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testComparable2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44394,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j06x8zy96() throws Exception{try{__CLR4_1_2y88y88l3lqxvaf.R.inc(44394);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44395);final Pair<String, String> pair1 = Pair.of("A", "C");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44396);final Pair<String, String> pair2 = Pair.of("A", "D");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44397);assertTrue(pair1.compareTo(pair1) == 0);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44398);assertTrue(pair1.compareTo(pair2) < 0);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44399);assertTrue(pair2.compareTo(pair2) == 0);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44400);assertTrue(pair2.compareTo(pair1) > 0);
    }finally{__CLR4_1_2y88y88l3lqxvaf.R.flushNeeded();}}

    @Test
    public void testToString() throws Exception {__CLR4_1_2y88y88l3lqxvaf.R.globalSliceStart(getClass().getName(),44401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidy9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y88y88l3lqxvaf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y88y88l3lqxvaf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44401,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidy9d() throws Exception{try{__CLR4_1_2y88y88l3lqxvaf.R.inc(44401);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44402);final Pair<String, String> pair = Pair.of("Key", "Value");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44403);assertEquals("(Key,Value)", pair.toString());
    }finally{__CLR4_1_2y88y88l3lqxvaf.R.flushNeeded();}}

    @Test
    public void testToStringCustom() throws Exception {__CLR4_1_2y88y88l3lqxvaf.R.globalSliceStart(getClass().getName(),44404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qi0iney9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y88y88l3lqxvaf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y88y88l3lqxvaf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testToStringCustom",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44404,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qi0iney9g() throws Exception{try{__CLR4_1_2y88y88l3lqxvaf.R.inc(44404);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44405);final Calendar date = Calendar.getInstance();
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44406);date.set(2011, Calendar.APRIL, 25);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44407);final Pair<String, Calendar> pair = Pair.of("DOB", date);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44408);assertEquals("Test created on " + "04-25-2011", pair.toString("Test created on %2$tm-%2$td-%2$tY"));
    }finally{__CLR4_1_2y88y88l3lqxvaf.R.flushNeeded();}}

    @Test
    public void testFormattable_simple() throws Exception {__CLR4_1_2y88y88l3lqxvaf.R.globalSliceStart(getClass().getName(),44409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2js7hrny9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y88y88l3lqxvaf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y88y88l3lqxvaf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testFormattable_simple",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44409,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2js7hrny9l() throws Exception{try{__CLR4_1_2y88y88l3lqxvaf.R.inc(44409);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44410);final Pair<String, String> pair = Pair.of("Key", "Value");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44411);assertEquals("(Key,Value)", String.format("%1$s", pair));
    }finally{__CLR4_1_2y88y88l3lqxvaf.R.flushNeeded();}}

    @Test
    public void testFormattable_padded() throws Exception {__CLR4_1_2y88y88l3lqxvaf.R.globalSliceStart(getClass().getName(),44412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bgb1ldy9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y88y88l3lqxvaf.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y88y88l3lqxvaf.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.PairTest.testFormattable_padded",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44412,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bgb1ldy9o() throws Exception{try{__CLR4_1_2y88y88l3lqxvaf.R.inc(44412);
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44413);final Pair<String, String> pair = Pair.of("Key", "Value");
        __CLR4_1_2y88y88l3lqxvaf.R.inc(44414);assertEquals("         (Key,Value)", String.format("%1$20s", pair));
    }finally{__CLR4_1_2y88y88l3lqxvaf.R.flushNeeded();}}

}
