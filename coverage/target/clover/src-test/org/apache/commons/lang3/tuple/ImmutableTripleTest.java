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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * Test the Triple class.
 * @version $Id$
 */
public class ImmutableTripleTest {static class __CLR4_1_2y3uy3ul3lqxv9s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,44257,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBasic() throws Exception {__CLR4_1_2y3uy3ul3lqxv9s.R.globalSliceStart(getClass().getName(),44202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p2uf7hy3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y3uy3ul3lqxv9s.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y3uy3ul3lqxv9s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutableTripleTest.testBasic",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44202,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p2uf7hy3u() throws Exception{try{__CLR4_1_2y3uy3ul3lqxv9s.R.inc(44202);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44203);final ImmutableTriple<Integer, String, Boolean> triple = new ImmutableTriple<Integer, String, Boolean>(0, "foo", Boolean.TRUE);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44204);assertEquals(0, triple.left.intValue());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44205);assertEquals(0, triple.getLeft().intValue());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44206);assertEquals("foo", triple.middle);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44207);assertEquals("foo", triple.getMiddle());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44208);assertEquals(Boolean.TRUE, triple.right);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44209);assertEquals(Boolean.TRUE, triple.getRight());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44210);final ImmutableTriple<Object, String, Integer> triple2 = new ImmutableTriple<Object, String, Integer>(null, "bar", 42);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44211);assertNull(triple2.left);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44212);assertNull(triple2.getLeft());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44213);assertEquals("bar", triple2.middle);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44214);assertEquals("bar", triple2.getMiddle());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44215);assertEquals(new Integer(42), triple2.right);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44216);assertEquals(new Integer(42), triple2.getRight());
    }finally{__CLR4_1_2y3uy3ul3lqxv9s.R.flushNeeded();}}

    @Test
    public void testTripleOf() throws Exception {__CLR4_1_2y3uy3ul3lqxv9s.R.globalSliceStart(getClass().getName(),44217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27pm0a6y49();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y3uy3ul3lqxv9s.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y3uy3ul3lqxv9s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutableTripleTest.testTripleOf",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44217,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27pm0a6y49() throws Exception{try{__CLR4_1_2y3uy3ul3lqxv9s.R.inc(44217);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44218);final ImmutableTriple<Integer, String, Boolean> triple = ImmutableTriple.of(0, "foo", Boolean.FALSE);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44219);assertEquals(0, triple.left.intValue());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44220);assertEquals(0, triple.getLeft().intValue());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44221);assertEquals("foo", triple.middle);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44222);assertEquals("foo", triple.getMiddle());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44223);assertEquals(Boolean.FALSE, triple.right);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44224);assertEquals(Boolean.FALSE, triple.getRight());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44225);final ImmutableTriple<Object, String, Boolean> triple2 = ImmutableTriple.of(null, "bar", Boolean.TRUE);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44226);assertNull(triple2.left);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44227);assertNull(triple2.getLeft());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44228);assertEquals("bar", triple2.middle);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44229);assertEquals("bar", triple2.getMiddle());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44230);assertEquals(Boolean.TRUE, triple2.right);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44231);assertEquals(Boolean.TRUE, triple2.getRight());
    }finally{__CLR4_1_2y3uy3ul3lqxv9s.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_1_2y3uy3ul3lqxv9s.R.globalSliceStart(getClass().getName(),44232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608y4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y3uy3ul3lqxv9s.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y3uy3ul3lqxv9s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutableTripleTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44232,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608y4o() throws Exception{try{__CLR4_1_2y3uy3ul3lqxv9s.R.inc(44232);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44233);assertEquals(ImmutableTriple.of(null, "foo", 42), ImmutableTriple.of(null, "foo", 42));
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44234);assertFalse(ImmutableTriple.of("foo", 0, Boolean.TRUE).equals(ImmutableTriple.of("foo", null, null)));
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44235);assertFalse(ImmutableTriple.of("foo", "bar", "baz").equals(ImmutableTriple.of("xyz", "bar", "blo")));

        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44236);final ImmutableTriple<String, String, String> p = ImmutableTriple.of("foo", "bar", "baz");
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44237);assertTrue(p.equals(p));
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44238);assertFalse(p.equals(new Object()));
    }finally{__CLR4_1_2y3uy3ul3lqxv9s.R.flushNeeded();}}

    @Test
    public void testHashCode() throws Exception {__CLR4_1_2y3uy3ul3lqxv9s.R.globalSliceStart(getClass().getName(),44239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8y4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y3uy3ul3lqxv9s.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y3uy3ul3lqxv9s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutableTripleTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44239,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8y4v() throws Exception{try{__CLR4_1_2y3uy3ul3lqxv9s.R.inc(44239);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44240);assertEquals(ImmutableTriple.of(null, "foo", Boolean.TRUE).hashCode(), ImmutableTriple.of(null, "foo", Boolean.TRUE).hashCode());
    }finally{__CLR4_1_2y3uy3ul3lqxv9s.R.flushNeeded();}}

    @Test
    public void testToString() throws Exception {__CLR4_1_2y3uy3ul3lqxv9s.R.globalSliceStart(getClass().getName(),44241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidy4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y3uy3ul3lqxv9s.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y3uy3ul3lqxv9s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutableTripleTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44241,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidy4x() throws Exception{try{__CLR4_1_2y3uy3ul3lqxv9s.R.inc(44241);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44242);assertEquals("(null,null,null)", ImmutableTriple.of(null, null, null).toString());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44243);assertEquals("(null,two,null)", ImmutableTriple.of(null, "two", null).toString());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44244);assertEquals("(one,null,null)", ImmutableTriple.of("one", null, null).toString());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44245);assertEquals("(one,two,null)", ImmutableTriple.of("one", "two", null).toString());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44246);assertEquals("(null,two,three)", ImmutableTriple.of(null, "two", "three").toString());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44247);assertEquals("(one,null,three)", ImmutableTriple.of("one", null, "three").toString());
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44248);assertEquals("(one,two,three)", MutableTriple.of("one", "two", "three").toString());
    }finally{__CLR4_1_2y3uy3ul3lqxv9s.R.flushNeeded();}}

    @Test
    @SuppressWarnings("unchecked")
    public void testSerialization() throws Exception {__CLR4_1_2y3uy3ul3lqxv9s.R.globalSliceStart(getClass().getName(),44249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26m1on9y55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y3uy3ul3lqxv9s.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y3uy3ul3lqxv9s.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutableTripleTest.testSerialization",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44249,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26m1on9y55() throws Exception{try{__CLR4_1_2y3uy3ul3lqxv9s.R.inc(44249);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44250);final ImmutableTriple<Integer, String, Boolean> origTriple = ImmutableTriple.of(0, "foo", Boolean.TRUE);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44251);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44252);final ObjectOutputStream out = new ObjectOutputStream(baos);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44253);out.writeObject(origTriple);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44254);final ImmutableTriple<Integer, String, Boolean> deserializedTriple = (ImmutableTriple<Integer, String, Boolean>) new ObjectInputStream(
                new ByteArrayInputStream(baos.toByteArray())).readObject();
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44255);assertEquals(origTriple, deserializedTriple);
        __CLR4_1_2y3uy3ul3lqxv9s.R.inc(44256);assertEquals(origTriple.hashCode(), deserializedTriple.hashCode());
    }finally{__CLR4_1_2y3uy3ul3lqxv9s.R.flushNeeded();}}
}

