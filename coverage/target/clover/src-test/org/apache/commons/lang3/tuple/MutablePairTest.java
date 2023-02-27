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
 * Test the MutablePair class.
 * @version $Id$
 */
public class MutablePairTest {static class __CLR4_1_2y5dy5dl3lqxv9x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,44303,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBasic() throws Exception {__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceStart(getClass().getName(),44257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p2uf7hy5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y5dy5dl3lqxv9x.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testBasic",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44257,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p2uf7hy5d() throws Exception{try{__CLR4_1_2y5dy5dl3lqxv9x.R.inc(44257);
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44258);final MutablePair<Integer, String> pair = new MutablePair<Integer, String>(0, "foo");
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44259);assertEquals(0, pair.getLeft().intValue());
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44260);assertEquals("foo", pair.getRight());
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44261);final MutablePair<Object, String> pair2 = new MutablePair<Object, String>(null, "bar");
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44262);assertNull(pair2.getLeft());
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44263);assertEquals("bar", pair2.getRight());
    }finally{__CLR4_1_2y5dy5dl3lqxv9x.R.flushNeeded();}}

    @Test
    public void testDefault() throws Exception {__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceStart(getClass().getName(),44264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xwf06uy5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y5dy5dl3lqxv9x.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testDefault",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44264,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xwf06uy5k() throws Exception{try{__CLR4_1_2y5dy5dl3lqxv9x.R.inc(44264);
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44265);final MutablePair<Integer, String> pair = new MutablePair<Integer, String>();
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44266);assertNull(pair.getLeft());
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44267);assertNull(pair.getRight());
    }finally{__CLR4_1_2y5dy5dl3lqxv9x.R.flushNeeded();}}
    
    @Test
    public void testMutate() throws Exception {__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceStart(getClass().getName(),44268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26qo56py5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y5dy5dl3lqxv9x.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testMutate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44268,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26qo56py5o() throws Exception{try{__CLR4_1_2y5dy5dl3lqxv9x.R.inc(44268);
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44269);final MutablePair<Integer, String> pair = new MutablePair<Integer, String>(0, "foo");
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44270);pair.setLeft(42);
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44271);pair.setRight("bar");
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44272);assertEquals(42, pair.getLeft().intValue());
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44273);assertEquals("bar", pair.getRight());
    }finally{__CLR4_1_2y5dy5dl3lqxv9x.R.flushNeeded();}}

    @Test
    public void testPairOf() throws Exception {__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceStart(getClass().getName(),44274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2e4t2tyy5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y5dy5dl3lqxv9x.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testPairOf",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44274,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2e4t2tyy5u() throws Exception{try{__CLR4_1_2y5dy5dl3lqxv9x.R.inc(44274);
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44275);final MutablePair<Integer, String> pair = MutablePair.of(0, "foo");
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44276);assertEquals(0, pair.getLeft().intValue());
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44277);assertEquals("foo", pair.getRight());
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44278);final MutablePair<Object, String> pair2 = MutablePair.of(null, "bar");
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44279);assertNull(pair2.getLeft());
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44280);assertEquals("bar", pair2.getRight());
    }finally{__CLR4_1_2y5dy5dl3lqxv9x.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceStart(getClass().getName(),44281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608y61();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y5dy5dl3lqxv9x.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44281,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608y61() throws Exception{try{__CLR4_1_2y5dy5dl3lqxv9x.R.inc(44281);
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44282);assertEquals(MutablePair.of(null, "foo"), MutablePair.of(null, "foo"));
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44283);assertFalse(MutablePair.of("foo", 0).equals(MutablePair.of("foo", null)));
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44284);assertFalse(MutablePair.of("foo", "bar").equals(MutablePair.of("xyz", "bar")));

        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44285);final MutablePair<String, String> p = MutablePair.of("foo", "bar");
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44286);assertTrue(p.equals(p));
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44287);assertFalse(p.equals(new Object()));
    }finally{__CLR4_1_2y5dy5dl3lqxv9x.R.flushNeeded();}}

    @Test
    public void testHashCode() throws Exception {__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceStart(getClass().getName(),44288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8y68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y5dy5dl3lqxv9x.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44288,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8y68() throws Exception{try{__CLR4_1_2y5dy5dl3lqxv9x.R.inc(44288);
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44289);assertEquals(MutablePair.of(null, "foo").hashCode(), MutablePair.of(null, "foo").hashCode());
    }finally{__CLR4_1_2y5dy5dl3lqxv9x.R.flushNeeded();}}

    @Test
    public void testToString() throws Exception {__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceStart(getClass().getName(),44290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidy6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y5dy5dl3lqxv9x.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44290,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidy6a() throws Exception{try{__CLR4_1_2y5dy5dl3lqxv9x.R.inc(44290);
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44291);assertEquals("(null,null)", MutablePair.of(null, null).toString());
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44292);assertEquals("(null,two)", MutablePair.of(null, "two").toString());
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44293);assertEquals("(one,null)", MutablePair.of("one", null).toString());
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44294);assertEquals("(one,two)", MutablePair.of("one", "two").toString());
    }finally{__CLR4_1_2y5dy5dl3lqxv9x.R.flushNeeded();}}

    @Test
    @SuppressWarnings("unchecked")
    public void testSerialization() throws Exception {__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceStart(getClass().getName(),44295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26m1on9y6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y5dy5dl3lqxv9x.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y5dy5dl3lqxv9x.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutablePairTest.testSerialization",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44295,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26m1on9y6f() throws Exception{try{__CLR4_1_2y5dy5dl3lqxv9x.R.inc(44295);
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44296);final MutablePair<Integer, String> origPair = MutablePair.of(0, "foo");
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44297);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44298);final ObjectOutputStream out = new ObjectOutputStream(baos);
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44299);out.writeObject(origPair);
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44300);final MutablePair<Integer, String> deserializedPair = (MutablePair<Integer, String>) new ObjectInputStream(
                new ByteArrayInputStream(baos.toByteArray())).readObject();
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44301);assertEquals(origPair, deserializedPair);
        __CLR4_1_2y5dy5dl3lqxv9x.R.inc(44302);assertEquals(origPair.hashCode(), deserializedPair.hashCode());
    }finally{__CLR4_1_2y5dy5dl3lqxv9x.R.flushNeeded();}}
}
