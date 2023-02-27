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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.HashSet;

import org.junit.Test;

/**
 * Test the Triple class.
 *
 * @version $Id$
 */
public class TripleTest {static class __CLR4_1_2y9ry9rl3lqxvan{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,44476,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testTripleOf() throws Exception {__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceStart(getClass().getName(),44415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27pm0a6y9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y9ry9rl3lqxvan.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testTripleOf",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44415,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27pm0a6y9r() throws Exception{try{__CLR4_1_2y9ry9rl3lqxvan.R.inc(44415);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44416);final Triple<Integer, String, Boolean> triple = Triple.of(0, "foo", Boolean.TRUE);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44417);assertTrue(triple instanceof ImmutableTriple<?, ?, ?>);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44418);assertEquals(0, ((ImmutableTriple<Integer, String, Boolean>) triple).left.intValue());
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44419);assertEquals("foo", ((ImmutableTriple<Integer, String, Boolean>) triple).middle);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44420);assertEquals(Boolean.TRUE, ((ImmutableTriple<Integer, String, Boolean>) triple).right);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44421);final Triple<Object, String, Long> triple2 = Triple.of(null, "bar", Long.valueOf(200L));
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44422);assertTrue(triple2 instanceof ImmutableTriple<?, ?, ?>);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44423);assertNull(((ImmutableTriple<Object, String, Long>) triple2).left);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44424);assertEquals("bar", ((ImmutableTriple<Object, String, Long>) triple2).middle);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44425);assertEquals(new Long(200L), ((ImmutableTriple<Object, String, Long>) triple2).right);
    }finally{__CLR4_1_2y9ry9rl3lqxvan.R.flushNeeded();}}

    @Test
    public void testCompatibilityBetweenTriples() throws Exception {__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceStart(getClass().getName(),44426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28408c2ya2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y9ry9rl3lqxvan.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testCompatibilityBetweenTriples",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44426,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28408c2ya2() throws Exception{try{__CLR4_1_2y9ry9rl3lqxvan.R.inc(44426);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44427);final Triple<Integer, String, Boolean> triple = ImmutableTriple.of(0, "foo", Boolean.TRUE);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44428);final Triple<Integer, String, Boolean> triple2 = MutableTriple.of(0, "foo", Boolean.TRUE);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44429);assertEquals(triple, triple2);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44430);assertEquals(triple.hashCode(), triple2.hashCode());
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44431);final HashSet<Triple<Integer, String, Boolean>> set = new HashSet<Triple<Integer, String, Boolean>>();
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44432);set.add(triple);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44433);assertTrue(set.contains(triple2));
    }finally{__CLR4_1_2y9ry9rl3lqxvan.R.flushNeeded();}}

    @Test
    public void testComparable1() throws Exception {__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceStart(getClass().getName(),44434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m96w1gyaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y9ry9rl3lqxvan.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testComparable1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44434,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m96w1gyaa() throws Exception{try{__CLR4_1_2y9ry9rl3lqxvan.R.inc(44434);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44435);final Triple<String, String, String> triple1 = Triple.of("A", "D", "A");
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44436);final Triple<String, String, String> triple2 = Triple.of("B", "C", "A");
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44437);assertTrue(triple1.compareTo(triple1) == 0);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44438);assertTrue(triple1.compareTo(triple2) < 0);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44439);assertTrue(triple2.compareTo(triple2) == 0);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44440);assertTrue(triple2.compareTo(triple1) > 0);
    }finally{__CLR4_1_2y9ry9rl3lqxvan.R.flushNeeded();}}

    @Test
    public void testComparable2() throws Exception {__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceStart(getClass().getName(),44441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j06x8zyah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y9ry9rl3lqxvan.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testComparable2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44441,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j06x8zyah() throws Exception{try{__CLR4_1_2y9ry9rl3lqxvan.R.inc(44441);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44442);final Triple<String, String, String> triple1 = Triple.of("A", "C", "B");
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44443);final Triple<String, String, String> triple2 = Triple.of("A", "D", "B");
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44444);assertTrue(triple1.compareTo(triple1) == 0);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44445);assertTrue(triple1.compareTo(triple2) < 0);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44446);assertTrue(triple2.compareTo(triple2) == 0);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44447);assertTrue(triple2.compareTo(triple1) > 0);
    }finally{__CLR4_1_2y9ry9rl3lqxvan.R.flushNeeded();}}

    @Test
    public void testComparable3() throws Exception {__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceStart(getClass().getName(),44448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fr6ygiyao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y9ry9rl3lqxvan.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testComparable3",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44448,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fr6ygiyao() throws Exception{try{__CLR4_1_2y9ry9rl3lqxvan.R.inc(44448);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44449);final Triple<String, String, String> triple1 = Triple.of("A", "A", "D");
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44450);final Triple<String, String, String> triple2 = Triple.of("A", "B", "C");
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44451);assertTrue(triple1.compareTo(triple1) == 0);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44452);assertTrue(triple1.compareTo(triple2) < 0);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44453);assertTrue(triple2.compareTo(triple2) == 0);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44454);assertTrue(triple2.compareTo(triple1) > 0);
    }finally{__CLR4_1_2y9ry9rl3lqxvan.R.flushNeeded();}}

    @Test
    public void testComparable4() throws Exception {__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceStart(getClass().getName(),44455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ci6zo1yav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y9ry9rl3lqxvan.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testComparable4",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44455,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ci6zo1yav() throws Exception{try{__CLR4_1_2y9ry9rl3lqxvan.R.inc(44455);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44456);final Triple<String, String, String> triple1 = Triple.of("B", "A", "C");
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44457);final Triple<String, String, String> triple2 = Triple.of("B", "A", "D");
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44458);assertTrue(triple1.compareTo(triple1) == 0);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44459);assertTrue(triple1.compareTo(triple2) < 0);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44460);assertTrue(triple2.compareTo(triple2) == 0);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44461);assertTrue(triple2.compareTo(triple1) > 0);
    }finally{__CLR4_1_2y9ry9rl3lqxvan.R.flushNeeded();}}

    @Test
    public void testToString() throws Exception {__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceStart(getClass().getName(),44462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidyb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y9ry9rl3lqxvan.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44462,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidyb2() throws Exception{try{__CLR4_1_2y9ry9rl3lqxvan.R.inc(44462);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44463);final Triple<String, String, String> triple = Triple.of("Key", "Something", "Value");
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44464);assertEquals("(Key,Something,Value)", triple.toString());
    }finally{__CLR4_1_2y9ry9rl3lqxvan.R.flushNeeded();}}

    @Test
    public void testToStringCustom() throws Exception {__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceStart(getClass().getName(),44465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qi0ineyb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y9ry9rl3lqxvan.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testToStringCustom",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44465,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qi0ineyb5() throws Exception{try{__CLR4_1_2y9ry9rl3lqxvan.R.inc(44465);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44466);final Calendar date = Calendar.getInstance();
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44467);date.set(2011, Calendar.APRIL, 25);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44468);final Triple<String, String, Calendar> triple = Triple.of("DOB", "string", date);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44469);assertEquals("Test created on " + "04-25-2011", triple.toString("Test created on %3$tm-%3$td-%3$tY"));
    }finally{__CLR4_1_2y9ry9rl3lqxvan.R.flushNeeded();}}

    @Test
    public void testFormattable_simple() throws Exception {__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceStart(getClass().getName(),44470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2js7hrnyba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y9ry9rl3lqxvan.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testFormattable_simple",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44470,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2js7hrnyba() throws Exception{try{__CLR4_1_2y9ry9rl3lqxvan.R.inc(44470);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44471);final Triple<String, String, String> triple = Triple.of("Key", "Something", "Value");
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44472);assertEquals("(Key,Something,Value)", String.format("%1$s", triple));
    }finally{__CLR4_1_2y9ry9rl3lqxvan.R.flushNeeded();}}

    @Test
    public void testFormattable_padded() throws Exception {__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceStart(getClass().getName(),44473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bgb1ldybd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y9ry9rl3lqxvan.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y9ry9rl3lqxvan.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.TripleTest.testFormattable_padded",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44473,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bgb1ldybd() throws Exception{try{__CLR4_1_2y9ry9rl3lqxvan.R.inc(44473);
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44474);final Triple<String, String, String> triple = Triple.of("Key", "Something", "Value");
        __CLR4_1_2y9ry9rl3lqxvan.R.inc(44475);assertEquals("         (Key,Something,Value)", String.format("%1$30s", triple));
    }finally{__CLR4_1_2y9ry9rl3lqxvan.R.flushNeeded();}}

}

