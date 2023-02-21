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

package org.apache.commons.lang3.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Test class for StrLookup.
 *
 * @version $Id$
 */
public class StrLookupTest  {static class __CLR4_1_2v16v16l3lqxuz1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,40243,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testNoneLookup() {__CLR4_1_2v16v16l3lqxuz1.R.globalSliceStart(getClass().getName(),40218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bimi17v16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v16v16l3lqxuz1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v16v16l3lqxuz1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrLookupTest.testNoneLookup",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40218,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bimi17v16(){try{__CLR4_1_2v16v16l3lqxuz1.R.inc(40218);
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40219);assertEquals(null, StrLookup.noneLookup().lookup(null));
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40220);assertEquals(null, StrLookup.noneLookup().lookup(""));
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40221);assertEquals(null, StrLookup.noneLookup().lookup("any"));
    }finally{__CLR4_1_2v16v16l3lqxuz1.R.flushNeeded();}}

    @Test
    public void testSystemProperiesLookup() {__CLR4_1_2v16v16l3lqxuz1.R.globalSliceStart(getClass().getName(),40222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2izjbehv1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v16v16l3lqxuz1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v16v16l3lqxuz1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrLookupTest.testSystemProperiesLookup",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40222,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2izjbehv1a(){try{__CLR4_1_2v16v16l3lqxuz1.R.inc(40222);
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40223);assertEquals(System.getProperty("os.name"), StrLookup.systemPropertiesLookup().lookup("os.name"));
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40224);assertEquals(null, StrLookup.systemPropertiesLookup().lookup(""));
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40225);assertEquals(null, StrLookup.systemPropertiesLookup().lookup("other"));
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40226);try {
            __CLR4_1_2v16v16l3lqxuz1.R.inc(40227);StrLookup.systemPropertiesLookup().lookup(null);
            __CLR4_1_2v16v16l3lqxuz1.R.inc(40228);fail();
        } catch (final NullPointerException ex) {
            // expected
        }
    }finally{__CLR4_1_2v16v16l3lqxuz1.R.flushNeeded();}}

    @Test
    public void testMapLookup() {__CLR4_1_2v16v16l3lqxuz1.R.globalSliceStart(getClass().getName(),40229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xqi5orv1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v16v16l3lqxuz1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v16v16l3lqxuz1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrLookupTest.testMapLookup",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40229,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xqi5orv1h(){try{__CLR4_1_2v16v16l3lqxuz1.R.inc(40229);
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40230);final Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40231);map.put("key", "value");
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40232);map.put("number", Integer.valueOf(2));
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40233);assertEquals("value", StrLookup.mapLookup(map).lookup("key"));
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40234);assertEquals("2", StrLookup.mapLookup(map).lookup("number"));
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40235);assertEquals(null, StrLookup.mapLookup(map).lookup(null));
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40236);assertEquals(null, StrLookup.mapLookup(map).lookup(""));
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40237);assertEquals(null, StrLookup.mapLookup(map).lookup("other"));
    }finally{__CLR4_1_2v16v16l3lqxuz1.R.flushNeeded();}}

    @Test
    public void testMapLookup_nullMap() {__CLR4_1_2v16v16l3lqxuz1.R.globalSliceStart(getClass().getName(),40238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xe4fxdv1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v16v16l3lqxuz1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v16v16l3lqxuz1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrLookupTest.testMapLookup_nullMap",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40238,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xe4fxdv1q(){try{__CLR4_1_2v16v16l3lqxuz1.R.inc(40238);
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40239);final Map<String, ?> map = null;
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40240);assertEquals(null, StrLookup.mapLookup(map).lookup(null));
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40241);assertEquals(null, StrLookup.mapLookup(map).lookup(""));
        __CLR4_1_2v16v16l3lqxuz1.R.inc(40242);assertEquals(null, StrLookup.mapLookup(map).lookup("any"));
    }finally{__CLR4_1_2v16v16l3lqxuz1.R.flushNeeded();}}

}
