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
 * Test the MutableTriple class.
 * @version $Id$
 */
public class MutableTripleTest {static class __CLR4_1_2y6ny6nl3lqxva8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,44360,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testBasic() throws Exception {__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceStart(getClass().getName(),44303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p2uf7hy6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y6ny6nl3lqxva8.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testBasic",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44303,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p2uf7hy6n() throws Exception{try{__CLR4_1_2y6ny6nl3lqxva8.R.inc(44303);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44304);final MutableTriple<Integer, String, Boolean> triple = new MutableTriple<Integer, String, Boolean>(0, "foo", Boolean.FALSE);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44305);assertEquals(0, triple.getLeft().intValue());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44306);assertEquals("foo", triple.getMiddle());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44307);assertEquals(Boolean.FALSE, triple.getRight());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44308);final MutableTriple<Object, String, String> triple2 = new MutableTriple<Object, String, String>(null, "bar", "hello");
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44309);assertNull(triple2.getLeft());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44310);assertEquals("bar", triple2.getMiddle());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44311);assertEquals("hello", triple2.getRight());
    }finally{__CLR4_1_2y6ny6nl3lqxva8.R.flushNeeded();}}

    @Test
    public void testDefault() throws Exception {__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceStart(getClass().getName(),44312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xwf06uy6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y6ny6nl3lqxva8.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testDefault",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44312,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xwf06uy6w() throws Exception{try{__CLR4_1_2y6ny6nl3lqxva8.R.inc(44312);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44313);final MutableTriple<Integer, String, Boolean> triple = new MutableTriple<Integer, String, Boolean>();
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44314);assertNull(triple.getLeft());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44315);assertNull(triple.getMiddle());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44316);assertNull(triple.getRight());
    }finally{__CLR4_1_2y6ny6nl3lqxva8.R.flushNeeded();}}
    
    @Test
    public void testMutate() throws Exception {__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceStart(getClass().getName(),44317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26qo56py71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y6ny6nl3lqxva8.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testMutate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44317,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26qo56py71() throws Exception{try{__CLR4_1_2y6ny6nl3lqxva8.R.inc(44317);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44318);final MutableTriple<Integer, String, Boolean> triple = new MutableTriple<Integer, String, Boolean>(0, "foo", Boolean.TRUE);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44319);triple.setLeft(42);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44320);triple.setMiddle("bar");
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44321);triple.setRight(Boolean.FALSE);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44322);assertEquals(42, triple.getLeft().intValue());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44323);assertEquals("bar", triple.getMiddle());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44324);assertEquals(Boolean.FALSE, triple.getRight());
    }finally{__CLR4_1_2y6ny6nl3lqxva8.R.flushNeeded();}}

    @Test
    public void testTripleOf() throws Exception {__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceStart(getClass().getName(),44325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27pm0a6y79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y6ny6nl3lqxva8.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testTripleOf",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44325,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27pm0a6y79() throws Exception{try{__CLR4_1_2y6ny6nl3lqxva8.R.inc(44325);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44326);final MutableTriple<Integer, String, Boolean> triple = MutableTriple.of(0, "foo", Boolean.TRUE);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44327);assertEquals(0, triple.getLeft().intValue());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44328);assertEquals("foo", triple.getMiddle());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44329);assertEquals(Boolean.TRUE, triple.getRight());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44330);final MutableTriple<Object, String, String> triple2 = MutableTriple.of(null, "bar", "hello");
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44331);assertNull(triple2.getLeft());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44332);assertEquals("bar", triple2.getMiddle());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44333);assertEquals("hello", triple2.getRight());
    }finally{__CLR4_1_2y6ny6nl3lqxva8.R.flushNeeded();}}

    @Test
    public void testEquals() throws Exception {__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceStart(getClass().getName(),44334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608y7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y6ny6nl3lqxva8.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44334,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608y7i() throws Exception{try{__CLR4_1_2y6ny6nl3lqxva8.R.inc(44334);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44335);assertEquals(MutableTriple.of(null, "foo", "baz"), MutableTriple.of(null, "foo", "baz"));
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44336);assertFalse(MutableTriple.of("foo", 0, Boolean.TRUE).equals(MutableTriple.of("foo", null, Boolean.TRUE)));
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44337);assertFalse(MutableTriple.of("foo", "bar", "baz").equals(MutableTriple.of("xyz", "bar", "baz")));
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44338);assertFalse(MutableTriple.of("foo", "bar", "baz").equals(MutableTriple.of("foo", "bar", "blo")));

        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44339);final MutableTriple<String, String, String> p = MutableTriple.of("foo", "bar", "baz");
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44340);assertTrue(p.equals(p));
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44341);assertFalse(p.equals(new Object()));
    }finally{__CLR4_1_2y6ny6nl3lqxva8.R.flushNeeded();}}

    @Test
    public void testHashCode() throws Exception {__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceStart(getClass().getName(),44342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8y7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y6ny6nl3lqxva8.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44342,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8y7q() throws Exception{try{__CLR4_1_2y6ny6nl3lqxva8.R.inc(44342);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44343);assertEquals(MutableTriple.of(null, "foo", "baz").hashCode(), MutableTriple.of(null, "foo", "baz").hashCode());
    }finally{__CLR4_1_2y6ny6nl3lqxva8.R.flushNeeded();}}

    @Test
    public void testToString() throws Exception {__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceStart(getClass().getName(),44344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidy7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y6ny6nl3lqxva8.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44344,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidy7s() throws Exception{try{__CLR4_1_2y6ny6nl3lqxva8.R.inc(44344);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44345);assertEquals("(null,null,null)", MutableTriple.of(null, null, null).toString());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44346);assertEquals("(null,two,null)", MutableTriple.of(null, "two", null).toString());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44347);assertEquals("(one,null,null)", MutableTriple.of("one", null, null).toString());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44348);assertEquals("(one,two,null)", MutableTriple.of("one", "two", null).toString());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44349);assertEquals("(null,two,three)", MutableTriple.of(null, "two", "three").toString());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44350);assertEquals("(one,null,three)", MutableTriple.of("one", null, "three").toString());
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44351);assertEquals("(one,two,three)", MutableTriple.of("one", "two", "three").toString());
    }finally{__CLR4_1_2y6ny6nl3lqxva8.R.flushNeeded();}}

    @Test
    @SuppressWarnings("unchecked")
    public void testSerialization() throws Exception {__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceStart(getClass().getName(),44352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26m1on9y80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2y6ny6nl3lqxva8.R.rethrow($CLV_t2$);}finally{__CLR4_1_2y6ny6nl3lqxva8.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.tuple.MutableTripleTest.testSerialization",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44352,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26m1on9y80() throws Exception{try{__CLR4_1_2y6ny6nl3lqxva8.R.inc(44352);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44353);final MutableTriple<Integer, String, Boolean> origTriple = MutableTriple.of(0, "foo", Boolean.TRUE);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44354);final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44355);final ObjectOutputStream out = new ObjectOutputStream(baos);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44356);out.writeObject(origTriple);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44357);final MutableTriple<Integer, String, Boolean> deserializedTriple = (MutableTriple<Integer, String, Boolean>) new ObjectInputStream(
                new ByteArrayInputStream(baos.toByteArray())).readObject();
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44358);assertEquals(origTriple, deserializedTriple);
        __CLR4_1_2y6ny6nl3lqxva8.R.inc(44359);assertEquals(origTriple.hashCode(), deserializedTriple.hashCode());
    }finally{__CLR4_1_2y6ny6nl3lqxva8.R.flushNeeded();}}
}

