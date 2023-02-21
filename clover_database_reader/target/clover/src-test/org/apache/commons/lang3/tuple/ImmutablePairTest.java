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
 * Test the Pair class.
 * @version $Id$
 */
public class ImmutablePairTest {static class __CLR4_1_2y2my2ml3lqxv9m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,44202,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBasic() throws Exception {__CLR4_1_2y2my2ml3lqxv9m.R.globalSliceStart(getClass().getName(),44158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p2uf7hy2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y2my2ml3lqxv9m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y2my2ml3lqxv9m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutablePairTest.testBasic",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44158,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p2uf7hy2m() throws Exception{try{__CLR4_1_2y2my2ml3lqxv9m.R.inc(44158);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44159);final ImmutablePair<Integer, String> pair = new ImmutablePair<Integer, String>(0, "foo");
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44160);assertEquals(0, pair.left.intValue());
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44161);assertEquals(0, pair.getLeft().intValue());
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44162);assertEquals("foo", pair.right);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44163);assertEquals("foo", pair.getRight());
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44164);final ImmutablePair<Object, String> pair2 = new ImmutablePair<Object, String>(null, "bar");
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44165);assertNull(pair2.left);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44166);assertNull(pair2.getLeft());
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44167);assertEquals("bar", pair2.right);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44168);assertEquals("bar", pair2.getRight());
    }finally{__CLR4_1_2y2my2ml3lqxv9m.R.flushNeeded();}}

    @Test
    public void testPairOf() throws Exception {__CLR4_1_2y2my2ml3lqxv9m.R.globalSliceStart(getClass().getName(),44169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2e4t2tyy2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y2my2ml3lqxv9m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y2my2ml3lqxv9m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutablePairTest.testPairOf",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44169,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2e4t2tyy2x() throws Exception{try{__CLR4_1_2y2my2ml3lqxv9m.R.inc(44169);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44170);final ImmutablePair<Integer, String> pair = ImmutablePair.of(0, "foo");
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44171);assertEquals(0, pair.left.intValue());
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44172);assertEquals(0, pair.getLeft().intValue());
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44173);assertEquals("foo", pair.right);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44174);assertEquals("foo", pair.getRight());
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44175);final ImmutablePair<Object, String> pair2 = ImmutablePair.of(null, "bar");
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44176);assertNull(pair2.left);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44177);assertNull(pair2.getLeft());
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44178);assertEquals("bar", pair2.right);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44179);assertEquals("bar", pair2.getRight());
    }finally{__CLR4_1_2y2my2ml3lqxv9m.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_1_2y2my2ml3lqxv9m.R.globalSliceStart(getClass().getName(),44180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608y38();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y2my2ml3lqxv9m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y2my2ml3lqxv9m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutablePairTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44180,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608y38() throws Exception{try{__CLR4_1_2y2my2ml3lqxv9m.R.inc(44180);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44181);assertEquals(ImmutablePair.of(null, "foo"), ImmutablePair.of(null, "foo"));
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44182);assertFalse(ImmutablePair.of("foo", 0).equals(ImmutablePair.of("foo", null)));
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44183);assertFalse(ImmutablePair.of("foo", "bar").equals(ImmutablePair.of("xyz", "bar")));

        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44184);final ImmutablePair<String, String> p = ImmutablePair.of("foo", "bar");
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44185);assertTrue(p.equals(p));
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44186);assertFalse(p.equals(new Object()));
    }finally{__CLR4_1_2y2my2ml3lqxv9m.R.flushNeeded();}}

    @Test
    public void testHashCode() throws Exception {__CLR4_1_2y2my2ml3lqxv9m.R.globalSliceStart(getClass().getName(),44187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8y3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y2my2ml3lqxv9m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y2my2ml3lqxv9m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutablePairTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44187,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8y3f() throws Exception{try{__CLR4_1_2y2my2ml3lqxv9m.R.inc(44187);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44188);assertEquals(ImmutablePair.of(null, "foo").hashCode(), ImmutablePair.of(null, "foo").hashCode());
    }finally{__CLR4_1_2y2my2ml3lqxv9m.R.flushNeeded();}}

    @Test
    public void testToString() throws Exception {__CLR4_1_2y2my2ml3lqxv9m.R.globalSliceStart(getClass().getName(),44189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidy3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y2my2ml3lqxv9m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y2my2ml3lqxv9m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutablePairTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44189,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidy3h() throws Exception{try{__CLR4_1_2y2my2ml3lqxv9m.R.inc(44189);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44190);assertEquals("(null,null)", ImmutablePair.of(null, null).toString());
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44191);assertEquals("(null,two)", ImmutablePair.of(null, "two").toString());
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44192);assertEquals("(one,null)", ImmutablePair.of("one", null).toString());
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44193);assertEquals("(one,two)", ImmutablePair.of("one", "two").toString());
    }finally{__CLR4_1_2y2my2ml3lqxv9m.R.flushNeeded();}}

    @Test
    @SuppressWarnings("unchecked")
    public void testSerialization() throws Exception {__CLR4_1_2y2my2ml3lqxv9m.R.globalSliceStart(getClass().getName(),44194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26m1on9y3m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y2my2ml3lqxv9m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y2my2ml3lqxv9m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.ImmutablePairTest.testSerialization",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44194,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26m1on9y3m() throws Exception{try{__CLR4_1_2y2my2ml3lqxv9m.R.inc(44194);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44195);final ImmutablePair<Integer, String> origPair = ImmutablePair.of(0, "foo");
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44196);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44197);final ObjectOutputStream out = new ObjectOutputStream(baos);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44198);out.writeObject(origPair);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44199);final ImmutablePair<Integer, String> deserializedPair = (ImmutablePair<Integer, String>) new ObjectInputStream(
                new ByteArrayInputStream(baos.toByteArray())).readObject();
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44200);assertEquals(origPair, deserializedPair);
        __CLR4_1_2y2my2ml3lqxv9m.R.inc(44201);assertEquals(origPair.hashCode(), deserializedPair.hashCode());
    }finally{__CLR4_1_2y2my2ml3lqxv9m.R.flushNeeded();}}
}
