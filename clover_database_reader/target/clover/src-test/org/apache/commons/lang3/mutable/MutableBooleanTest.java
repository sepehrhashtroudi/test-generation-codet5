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
 * @since 2.2
 * @see MutableBoolean
 * @version $Id$
 */
public class MutableBooleanTest {static class __CLR4_1_2sfxsfxl3lqxurn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,36925,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testCompareTo() {__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceStart(getClass().getName(),36861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pz6vfvsfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sfxsfxl3lqxurn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testCompareTo",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36861,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pz6vfvsfx(){try{__CLR4_1_2sfxsfxl3lqxurn.R.inc(36861);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36862);final MutableBoolean mutBool = new MutableBoolean(false);

        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36863);assertEquals(0, mutBool.compareTo(new MutableBoolean(false)));
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36864);assertEquals(-1, mutBool.compareTo(new MutableBoolean(true)));
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36865);mutBool.setValue(true);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36866);assertEquals(+1, mutBool.compareTo(new MutableBoolean(false)));
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36867);assertEquals(0, mutBool.compareTo(new MutableBoolean(true)));
    }finally{__CLR4_1_2sfxsfxl3lqxurn.R.flushNeeded();}}
    
    @Test(expected=NullPointerException.class)
    public void testCompareToNull() {__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceStart(getClass().getName(),36868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g1nl0csg4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,101,84,111,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sfxsfxl3lqxurn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testCompareToNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36868,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g1nl0csg4(){try{__CLR4_1_2sfxsfxl3lqxurn.R.inc(36868);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36869);final MutableBoolean mutBool = new MutableBoolean(false);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36870);mutBool.compareTo(null);
    }finally{__CLR4_1_2sfxsfxl3lqxurn.R.flushNeeded();}}

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceStart(getClass().getName(),36871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lwxahesg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sfxsfxl3lqxurn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testConstructors",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36871,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lwxahesg7(){try{__CLR4_1_2sfxsfxl3lqxurn.R.inc(36871);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36872);assertFalse(new MutableBoolean().booleanValue());

        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36873);assertTrue(new MutableBoolean(true).booleanValue());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36874);assertFalse(new MutableBoolean(false).booleanValue());

        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36875);assertTrue(new MutableBoolean(Boolean.TRUE).booleanValue());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36876);assertFalse(new MutableBoolean(Boolean.FALSE).booleanValue());

    }finally{__CLR4_1_2sfxsfxl3lqxurn.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorNull() {__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceStart(getClass().getName(),36877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hqkc8asgd();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sfxsfxl3lqxurn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testConstructorNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36877,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hqkc8asgd(){try{__CLR4_1_2sfxsfxl3lqxurn.R.inc(36877);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36878);new MutableBoolean(null);
    }finally{__CLR4_1_2sfxsfxl3lqxurn.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceStart(getClass().getName(),36879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608sgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sfxsfxl3lqxurn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36879,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608sgf(){try{__CLR4_1_2sfxsfxl3lqxurn.R.inc(36879);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36880);final MutableBoolean mutBoolA = new MutableBoolean(false);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36881);final MutableBoolean mutBoolB = new MutableBoolean(false);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36882);final MutableBoolean mutBoolC = new MutableBoolean(true);

        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36883);assertTrue(mutBoolA.equals(mutBoolA));
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36884);assertTrue(mutBoolA.equals(mutBoolB));
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36885);assertTrue(mutBoolB.equals(mutBoolA));
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36886);assertTrue(mutBoolB.equals(mutBoolB));
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36887);assertFalse(mutBoolA.equals(mutBoolC));
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36888);assertFalse(mutBoolB.equals(mutBoolC));
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36889);assertTrue(mutBoolC.equals(mutBoolC));
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36890);assertFalse(mutBoolA.equals(null));
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36891);assertFalse(mutBoolA.equals(Boolean.FALSE));
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36892);assertFalse(mutBoolA.equals("false"));
    }finally{__CLR4_1_2sfxsfxl3lqxurn.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceStart(getClass().getName(),36893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22wnvh7sgt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sfxsfxl3lqxurn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testGetSet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36893,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22wnvh7sgt(){try{__CLR4_1_2sfxsfxl3lqxurn.R.inc(36893);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36894);assertFalse(new MutableBoolean().booleanValue());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36895);assertEquals(Boolean.FALSE, new MutableBoolean().getValue());
        
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36896);final MutableBoolean mutBool = new MutableBoolean(false);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36897);assertEquals(Boolean.FALSE, mutBool.toBoolean());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36898);assertFalse(mutBool.booleanValue());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36899);assertTrue(mutBool.isFalse());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36900);assertFalse(mutBool.isTrue());

        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36901);mutBool.setValue(Boolean.TRUE);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36902);assertEquals(Boolean.TRUE, mutBool.toBoolean());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36903);assertTrue(mutBool.booleanValue());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36904);assertFalse(mutBool.isFalse());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36905);assertTrue(mutBool.isTrue());

        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36906);mutBool.setValue(false);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36907);assertFalse(mutBool.booleanValue());

        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36908);mutBool.setValue(true);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36909);assertTrue(mutBool.booleanValue());

    }finally{__CLR4_1_2sfxsfxl3lqxurn.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testSetNull() {__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceStart(getClass().getName(),36910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hciyrisha();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sfxsfxl3lqxurn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testSetNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36910,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hciyrisha(){try{__CLR4_1_2sfxsfxl3lqxurn.R.inc(36910);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36911);final MutableBoolean mutBool = new MutableBoolean(false);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36912);mutBool.setValue(null);
    }finally{__CLR4_1_2sfxsfxl3lqxurn.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceStart(getClass().getName(),36913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8shd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sfxsfxl3lqxurn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36913,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8shd(){try{__CLR4_1_2sfxsfxl3lqxurn.R.inc(36913);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36914);final MutableBoolean mutBoolA = new MutableBoolean(false);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36915);final MutableBoolean mutBoolB = new MutableBoolean(false);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36916);final MutableBoolean mutBoolC = new MutableBoolean(true);

        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36917);assertEquals(mutBoolA.hashCode(), mutBoolA.hashCode());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36918);assertEquals(mutBoolA.hashCode(), mutBoolB.hashCode());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36919);assertFalse(mutBoolA.hashCode() == mutBoolC.hashCode());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36920);assertEquals(mutBoolA.hashCode(), Boolean.FALSE.hashCode());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36921);assertEquals(mutBoolC.hashCode(), Boolean.TRUE.hashCode());
    }finally{__CLR4_1_2sfxsfxl3lqxurn.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceStart(getClass().getName(),36922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidshm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sfxsfxl3lqxurn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sfxsfxl3lqxurn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableBooleanTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36922,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidshm(){try{__CLR4_1_2sfxsfxl3lqxurn.R.inc(36922);
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36923);assertEquals(Boolean.FALSE.toString(), new MutableBoolean(false).toString());
        __CLR4_1_2sfxsfxl3lqxurn.R.inc(36924);assertEquals(Boolean.TRUE.toString(), new MutableBoolean(true).toString());
    }finally{__CLR4_1_2sfxsfxl3lqxurn.R.flushNeeded();}}

}
