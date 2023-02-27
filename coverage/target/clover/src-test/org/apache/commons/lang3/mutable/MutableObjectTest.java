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
package org.apache.commons.lang3.mutable;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit tests.
 * 
 * @version $Id$
 * @see MutableShort
 */
public class MutableObjectTest {static class __CLR4_1_2svgsvgl3lqxut4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,37465,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_1_2svgsvgl3lqxut4.R.globalSliceStart(getClass().getName(),37420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lwxahesvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2svgsvgl3lqxut4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2svgsvgl3lqxut4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableObjectTest.testConstructors",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37420,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lwxahesvg(){try{__CLR4_1_2svgsvgl3lqxut4.R.inc(37420);
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37421);assertEquals(null, new MutableObject<String>().getValue());
        
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37422);final Integer i = Integer.valueOf(6);
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37423);assertSame(i, new MutableObject<Integer>(i).getValue());
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37424);assertSame("HI", new MutableObject<String>("HI").getValue());
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37425);assertSame(null, new MutableObject<Object>(null).getValue());
    }finally{__CLR4_1_2svgsvgl3lqxut4.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_1_2svgsvgl3lqxut4.R.globalSliceStart(getClass().getName(),37426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22wnvh7svm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2svgsvgl3lqxut4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2svgsvgl3lqxut4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableObjectTest.testGetSet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37426,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22wnvh7svm(){try{__CLR4_1_2svgsvgl3lqxut4.R.inc(37426);
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37427);final MutableObject<String> mutNum = new MutableObject<String>();
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37428);assertEquals(null, new MutableObject<Object>().getValue());
        
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37429);mutNum.setValue("HELLO");
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37430);assertSame("HELLO", mutNum.getValue());
        
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37431);mutNum.setValue(null);
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37432);assertSame(null, mutNum.getValue());
    }finally{__CLR4_1_2svgsvgl3lqxut4.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_1_2svgsvgl3lqxut4.R.globalSliceStart(getClass().getName(),37433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608svt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2svgsvgl3lqxut4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2svgsvgl3lqxut4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableObjectTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37433,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608svt(){try{__CLR4_1_2svgsvgl3lqxut4.R.inc(37433);
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37434);final MutableObject<String> mutNumA = new MutableObject<String>("ALPHA");
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37435);final MutableObject<String> mutNumB = new MutableObject<String>("ALPHA");
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37436);final MutableObject<String> mutNumC = new MutableObject<String>("BETA");
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37437);final MutableObject<String> mutNumD = new MutableObject<String>(null);

        __CLR4_1_2svgsvgl3lqxut4.R.inc(37438);assertTrue(mutNumA.equals(mutNumA));
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37439);assertTrue(mutNumA.equals(mutNumB));
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37440);assertTrue(mutNumB.equals(mutNumA));
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37441);assertTrue(mutNumB.equals(mutNumB));
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37442);assertFalse(mutNumA.equals(mutNumC));
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37443);assertFalse(mutNumB.equals(mutNumC));
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37444);assertTrue(mutNumC.equals(mutNumC));
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37445);assertFalse(mutNumA.equals(mutNumD));
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37446);assertTrue(mutNumD.equals(mutNumD));
        
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37447);assertFalse(mutNumA.equals(null));
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37448);assertFalse(mutNumA.equals(new Object()));
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37449);assertFalse(mutNumA.equals("0"));
    }finally{__CLR4_1_2svgsvgl3lqxut4.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_1_2svgsvgl3lqxut4.R.globalSliceStart(getClass().getName(),37450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8swa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2svgsvgl3lqxut4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2svgsvgl3lqxut4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableObjectTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37450,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8swa(){try{__CLR4_1_2svgsvgl3lqxut4.R.inc(37450);
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37451);final MutableObject<String> mutNumA = new MutableObject<String>("ALPHA");
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37452);final MutableObject<String> mutNumB = new MutableObject<String>("ALPHA");
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37453);final MutableObject<String> mutNumC = new MutableObject<String>("BETA");
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37454);final MutableObject<String> mutNumD = new MutableObject<String>(null);

        __CLR4_1_2svgsvgl3lqxut4.R.inc(37455);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37456);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37457);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37458);assertFalse(mutNumA.hashCode() == mutNumD.hashCode());
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37459);assertTrue(mutNumA.hashCode() == "ALPHA".hashCode());
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37460);assertEquals(0, mutNumD.hashCode());
    }finally{__CLR4_1_2svgsvgl3lqxut4.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_1_2svgsvgl3lqxut4.R.globalSliceStart(getClass().getName(),37461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidswl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2svgsvgl3lqxut4.R.rethrow($CLV_t2$);}finally{__CLR4_1_2svgsvgl3lqxut4.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableObjectTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37461,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidswl(){try{__CLR4_1_2svgsvgl3lqxut4.R.inc(37461);
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37462);assertEquals("HI", new MutableObject<String>("HI").toString());
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37463);assertEquals("10.0", new MutableObject<Double>(Double.valueOf(10)).toString());
        __CLR4_1_2svgsvgl3lqxut4.R.inc(37464);assertEquals("null", new MutableObject<Object>(null).toString());
    }finally{__CLR4_1_2svgsvgl3lqxut4.R.flushNeeded();}}

}
