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

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.mutable.MutableObject;

/**
 * Test class for StrSubstitutor.
 *
 * @version $Id$
 */
public class StrSubstitutorTest {static class __CLR4_1_2v57v57l3lqxuzt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,40647,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40363);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40364);values = new HashMap<String, String>();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40365);values.put("animal", "quick brown fox");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40366);values.put("target", "lazy dog");
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40367);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40368);values = null;
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests simple key replace.
     */
    @Test
    public void testReplaceSimple() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2olg085v5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceSimple",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40369,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2olg085v5d(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40369);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40370);doTestReplace("The quick brown fox jumps over the lazy dog.", "The ${animal} jumps over the ${target}.", true);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests simple key replace.
     */
    @Test
    public void testReplaceSolo() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yx4dm0v5f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceSolo",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40371,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yx4dm0v5f(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40371);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40372);doTestReplace("quick brown fox", "${animal}", false);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests replace with no variables.
     */
    @Test
    public void testReplaceNoVariables() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bee4pnv5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNoVariables",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40373,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bee4pnv5h(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40373);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40374);doTestNoReplace("The balloon arrived.");
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests replace with null.
     */
    @Test
    public void testReplaceNull() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bwevzkv5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40375,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bwevzkv5j(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40375);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40376);doTestNoReplace(null);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests replace with null.
     */
    @Test
    public void testReplaceEmpty() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40377);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jrkqkyv5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceEmpty",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40377,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jrkqkyv5l(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40377);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40378);doTestNoReplace("");
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests key replace changing map after initialization (not recommended).
     */
    @Test
    public void testReplaceChangedMap() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lm6vm7v5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceChangedMap",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40379,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lm6vm7v5n(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40379);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40380);final StrSubstitutor sub = new StrSubstitutor(values);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40381);values.put("target", "moon");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40382);assertEquals("The quick brown fox jumps over the moon.", sub.replace("The ${animal} jumps over the ${target}."));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests unknown key replace.
     */
    @Test
    public void testReplaceUnknownKey() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r9oayqv5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceUnknownKey",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40383,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r9oayqv5r(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40383);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40384);doTestReplace("The ${person} jumps over the lazy dog.", "The ${person} jumps over the ${target}.", true);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests adjacent keys.
     */
    @Test
    public void testReplaceAdjacentAtStart() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q6potqv5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceAdjacentAtStart",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40385,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q6potqv5t(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40385);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40386);values.put("code", "GBP");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40387);values.put("amount", "12.50");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40388);final StrSubstitutor sub = new StrSubstitutor(values);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40389);assertEquals("GBP12.50 charged", sub.replace("${code}${amount} charged"));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests adjacent keys.
     */
    @Test
    public void testReplaceAdjacentAtEnd() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40390);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xlm3pxv5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceAdjacentAtEnd",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40390,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xlm3pxv5y(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40390);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40391);values.put("code", "GBP");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40392);values.put("amount", "12.50");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40393);final StrSubstitutor sub = new StrSubstitutor(values);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40394);assertEquals("Amount is GBP12.50", sub.replace("Amount is ${code}${amount}"));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests simple recursive replace.
     */
    @Test
    public void testReplaceRecursive() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ufij87v63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceRecursive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40395,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ufij87v63(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40395);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40396);values.put("animal", "${critter}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40397);values.put("target", "${pet}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40398);values.put("pet", "${petCharacteristic} dog");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40399);values.put("petCharacteristic", "lazy");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40400);values.put("critter", "${critterSpeed} ${critterColor} ${critterType}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40401);values.put("critterSpeed", "quick");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40402);values.put("critterColor", "brown");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40403);values.put("critterType", "fox");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40404);doTestReplace("The quick brown fox jumps over the lazy dog.", "The ${animal} jumps over the ${target}.", true);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests escaping.
     */
    @Test
    public void testReplaceEscaping() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40405);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wode55v6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceEscaping",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40405,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wode55v6d(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40405);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40406);doTestReplace("The ${animal} jumps over the lazy dog.", "The $${animal} jumps over the ${target}.", true);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests escaping.
     */
    @Test
    public void testReplaceSoloEscaping() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_245nmiiv6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceSoloEscaping",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40407,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_245nmiiv6f(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40407);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40408);doTestReplace("${animal}", "$${animal}", false);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests complex escaping.
     */
    @Test
    public void testReplaceComplexEscaping() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25esozxv6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceComplexEscaping",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40409,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25esozxv6h(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40409);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40410);doTestReplace("The ${quick brown fox} jumps over the lazy dog.", "The $${${animal}} jumps over the ${target}.", true);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests when no prefix or suffix.
     */
    @Test
    public void testReplaceNoPrefixNoSuffix() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26ldpbmv6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNoPrefixNoSuffix",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40411,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26ldpbmv6j(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40411);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40412);doTestReplace("The animal jumps over the lazy dog.", "The animal jumps over the ${target}.", true);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests when no incomplete prefix.
     */
    @Test
    public void testReplaceIncompletePrefix() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrmnbbv6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceIncompletePrefix",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40413,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrmnbbv6l(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40413);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40414);doTestReplace("The {animal} jumps over the lazy dog.", "The {animal} jumps over the ${target}.", true);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests when prefix but no suffix.
     */
    @Test
    public void testReplacePrefixNoSuffix() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qo7z03v6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplacePrefixNoSuffix",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40415,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qo7z03v6n(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40415);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40416);doTestReplace("The ${animal jumps over the ${target} lazy dog.", "The ${animal jumps over the ${target} ${target}.", true);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests when suffix but no prefix.
     */
    @Test
    public void testReplaceNoPrefixSuffix() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vq3jubv6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceNoPrefixSuffix",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40417,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vq3jubv6p(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40417);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40418);doTestReplace("The animal} jumps over the lazy dog.", "The animal} jumps over the ${target}.", true);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests when no variable name.
     */
    @Test
    public void testReplaceEmptyKeys() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27kkhuiv6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceEmptyKeys",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40419,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27kkhuiv6r(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40419);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40420);doTestReplace("The ${} jumps over the lazy dog.", "The ${} jumps over the ${target}.", true);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests replace creates output same as input.
     */
    @Test
    public void testReplaceToIdentical() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wmtr4vv6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceToIdentical",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40421,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wmtr4vv6t(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40421);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40422);values.put("animal", "$${${thing}}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40423);values.put("thing", "animal");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40424);doTestReplace("The ${animal} jumps.", "The ${animal} jumps.", true);
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests a cyclic replace operation.
     * The cycle should be detected and cause an exception to be thrown.
     */
    @Test
    public void testCyclicReplacement() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kg8xo2v6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testCyclicReplacement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40425,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kg8xo2v6x(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40425);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40426);final Map<String, String> map = new HashMap<String, String>();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40427);map.put("animal", "${critter}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40428);map.put("target", "${pet}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40429);map.put("pet", "${petCharacteristic} dog");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40430);map.put("petCharacteristic", "lazy");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40431);map.put("critter", "${critterSpeed} ${critterColor} ${critterType}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40432);map.put("critterSpeed", "quick");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40433);map.put("critterColor", "brown");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40434);map.put("critterType", "${animal}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40435);final StrSubstitutor sub = new StrSubstitutor(map);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40436);try {
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40437);sub.replace("The ${animal} jumps over the ${target}.");
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40438);fail("Cyclic replacement was not detected!");
        } catch (final IllegalStateException ex) {
            // expected
        }
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests interpolation with weird boundary patterns.
     */
    @Test
    public void testReplaceWeirdPattens() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ai36rvv7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceWeirdPattens",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40439,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ai36rvv7b(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40439);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40440);doTestNoReplace("");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40441);doTestNoReplace("${}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40442);doTestNoReplace("${ }");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40443);doTestNoReplace("${\t}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40444);doTestNoReplace("${\n}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40445);doTestNoReplace("${\b}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40446);doTestNoReplace("${");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40447);doTestNoReplace("$}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40448);doTestNoReplace("}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40449);doTestNoReplace("${}$");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40450);doTestNoReplace("${${");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40451);doTestNoReplace("${${}}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40452);doTestNoReplace("${$${}}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40453);doTestNoReplace("${$$${}}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40454);doTestNoReplace("${$$${$}}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40455);doTestNoReplace("${${}}");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40456);doTestNoReplace("${${ }}");
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests simple key replace.
     */
    @Test
    public void testReplacePartialString_noReplace() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p5frudv7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplacePartialString_noReplace",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40457,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p5frudv7t(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40457);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40458);final StrSubstitutor sub = new StrSubstitutor();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40459);assertEquals("${animal} jumps", sub.replace("The ${animal} jumps over the ${target}.", 4, 15));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests whether a variable can be replaced in a variable name.
     */
    @Test
    public void testReplaceInVariable() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24do93ev7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceInVariable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40460,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24do93ev7w(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40460);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40461);values.put("animal.1", "fox");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40462);values.put("animal.2", "mouse");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40463);values.put("species", "2");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40464);final StrSubstitutor sub = new StrSubstitutor(values);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40465);sub.setEnableSubstitutionInVariables(true);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40466);assertEquals(
                "Wrong result (1)",
                "The mouse jumps over the lazy dog.",
                sub.replace("The ${animal.${species}} jumps over the ${target}."));
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40467);values.put("species", "1");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40468);assertEquals(
                "Wrong result (2)",
                "The fox jumps over the lazy dog.",
                sub.replace("The ${animal.${species}} jumps over the ${target}."));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests whether substitution in variable names is disabled per default.
     */
    @Test
    public void testReplaceInVariableDisabled() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21avorqv85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceInVariableDisabled",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40469,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21avorqv85(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40469);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40470);values.put("animal.1", "fox");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40471);values.put("animal.2", "mouse");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40472);values.put("species", "2");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40473);final StrSubstitutor sub = new StrSubstitutor(values);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40474);assertEquals(
                "Wrong result",
                "The ${animal.${species}} jumps over the lazy dog.",
                sub.replace("The ${animal.${species}} jumps over the ${target}."));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests complex and recursive substitution in variable names.
     */
    @Test
    public void testReplaceInVariableRecursive() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29lao22v8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testReplaceInVariableRecursive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40475,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29lao22v8b(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40475);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40476);values.put("animal.2", "brown fox");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40477);values.put("animal.1", "white mouse");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40478);values.put("color", "white");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40479);values.put("species.white", "1");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40480);values.put("species.brown", "2");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40481);final StrSubstitutor sub = new StrSubstitutor(values);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40482);sub.setEnableSubstitutionInVariables(true);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40483);assertEquals(
                "Wrong result",
                "The white mouse jumps over the lazy dog.",
                sub.replace("The ${animal.${species.${color}}} jumps over the ${target}."));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests protected.
     */
    @Test
    public void testResolveVariable() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22lfyu5v8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testResolveVariable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40484,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22lfyu5v8k(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40484);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40485);final StrBuilder builder = new StrBuilder("Hi ${name}!");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40486);final Map<String, String> map = new HashMap<String, String>();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40487);map.put("name", "commons");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40488);final StrSubstitutor sub = new StrSubstitutor(map) {
            @Override
            protected String resolveVariable(final String variableName, final StrBuilder buf, final int startPos, final int endPos) {try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40489);
                __CLR4_1_2v57v57l3lqxuzt.R.inc(40490);assertEquals("name", variableName);
                __CLR4_1_2v57v57l3lqxuzt.R.inc(40491);assertSame(builder, buf);
                __CLR4_1_2v57v57l3lqxuzt.R.inc(40492);assertEquals(3, startPos);
                __CLR4_1_2v57v57l3lqxuzt.R.inc(40493);assertEquals(10, endPos);
                __CLR4_1_2v57v57l3lqxuzt.R.inc(40494);return "jakarta";
            }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}
        };
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40495);sub.replaceIn(builder);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40496);assertEquals("Hi jakarta!", builder.toString());
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests constructor.
     */
    @Test
    public void testConstructorNoArgs() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r07ac3v8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testConstructorNoArgs",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40497,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r07ac3v8x(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40497);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40498);final StrSubstitutor sub = new StrSubstitutor();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40499);assertEquals("Hi ${name}", sub.replace("Hi ${name}"));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests constructor.
     */
    @Test
    public void testConstructorMapPrefixSuffix() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zhzgiv90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testConstructorMapPrefixSuffix",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40500,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zhzgiv90(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40500);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40501);final Map<String, String> map = new HashMap<String, String>();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40502);map.put("name", "commons");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40503);final StrSubstitutor sub = new StrSubstitutor(map, "<", ">");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40504);assertEquals("Hi < commons", sub.replace("Hi $< <name>"));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests constructor.
     */
    @Test
    public void testConstructorMapFull() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vfaw22v95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testConstructorMapFull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40505,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vfaw22v95(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40505);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40506);final Map<String, String> map = new HashMap<String, String>();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40507);map.put("name", "commons");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40508);final StrSubstitutor sub = new StrSubstitutor(map, "<", ">", '!');
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40509);assertEquals("Hi < commons", sub.replace("Hi !< <name>"));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests get set.
     */
    @Test
    public void testGetSetEscape() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rljkyuv9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testGetSetEscape",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40510,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rljkyuv9a(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40510);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40511);final StrSubstitutor sub = new StrSubstitutor();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40512);assertEquals('$', sub.getEscapeChar());
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40513);sub.setEscapeChar('<');
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40514);assertEquals('<', sub.getEscapeChar());
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests get set.
     */
    @Test
    public void testGetSetPrefix() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nx65zrv9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testGetSetPrefix",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40515,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nx65zrv9f(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40515);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40516);final StrSubstitutor sub = new StrSubstitutor();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40517);assertTrue(sub.getVariablePrefixMatcher() instanceof StrMatcher.StringMatcher);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40518);sub.setVariablePrefix('<');
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40519);assertTrue(sub.getVariablePrefixMatcher() instanceof StrMatcher.CharMatcher);

        __CLR4_1_2v57v57l3lqxuzt.R.inc(40520);sub.setVariablePrefix("<<");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40521);assertTrue(sub.getVariablePrefixMatcher() instanceof StrMatcher.StringMatcher);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40522);try {
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40523);sub.setVariablePrefix((String) null);
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40524);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40525);assertTrue(sub.getVariablePrefixMatcher() instanceof StrMatcher.StringMatcher);

        __CLR4_1_2v57v57l3lqxuzt.R.inc(40526);final StrMatcher matcher = StrMatcher.commaMatcher();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40527);sub.setVariablePrefixMatcher(matcher);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40528);assertSame(matcher, sub.getVariablePrefixMatcher());
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40529);try {
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40530);sub.setVariablePrefixMatcher((StrMatcher) null);
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40531);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40532);assertSame(matcher, sub.getVariablePrefixMatcher());
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests get set.
     */
    @Test
    public void testGetSetSuffix() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kxtrgqv9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testGetSetSuffix",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40533,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kxtrgqv9x(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40533);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40534);final StrSubstitutor sub = new StrSubstitutor();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40535);assertTrue(sub.getVariableSuffixMatcher() instanceof StrMatcher.StringMatcher);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40536);sub.setVariableSuffix('<');
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40537);assertTrue(sub.getVariableSuffixMatcher() instanceof StrMatcher.CharMatcher);

        __CLR4_1_2v57v57l3lqxuzt.R.inc(40538);sub.setVariableSuffix("<<");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40539);assertTrue(sub.getVariableSuffixMatcher() instanceof StrMatcher.StringMatcher);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40540);try {
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40541);sub.setVariableSuffix((String) null);
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40542);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40543);assertTrue(sub.getVariableSuffixMatcher() instanceof StrMatcher.StringMatcher);

        __CLR4_1_2v57v57l3lqxuzt.R.inc(40544);final StrMatcher matcher = StrMatcher.commaMatcher();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40545);sub.setVariableSuffixMatcher(matcher);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40546);assertSame(matcher, sub.getVariableSuffixMatcher());
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40547);try {
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40548);sub.setVariableSuffixMatcher((StrMatcher) null);
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40549);fail();
        } catch (final IllegalArgumentException ex) {
            // expected
        }
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40550);assertSame(matcher, sub.getVariableSuffixMatcher());
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests static.
     */
    @Test
    public void testStaticReplace() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i8womzvaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testStaticReplace",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40551,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i8womzvaf(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40551);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40552);final Map<String, String> map = new HashMap<String, String>();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40553);map.put("name", "commons");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40554);assertEquals("Hi commons!", StrSubstitutor.replace("Hi ${name}!", map));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests static.
     */
    @Test
    public void testStaticReplacePrefixSuffix() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ph59fivaj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testStaticReplacePrefixSuffix",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40555,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ph59fivaj(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40555);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40556);final Map<String, String> map = new HashMap<String, String>();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40557);map.put("name", "commons");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40558);assertEquals("Hi commons!", StrSubstitutor.replace("Hi <name>!", map, "<", ">"));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Tests interpolation with system properties.
     */
    @Test
    public void testStaticReplaceSystemProperties() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zbhs2lvan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testStaticReplaceSystemProperties",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40559,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zbhs2lvan(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40559);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40560);final StrBuilder buf = new StrBuilder();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40561);buf.append("Hi ").append(System.getProperty("user.name"));
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40562);buf.append(", you are working with ");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40563);buf.append(System.getProperty("os.name"));
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40564);buf.append(", your home directory is ");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40565);buf.append(System.getProperty("user.home")).append('.');
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40566);assertEquals(buf.toString(), StrSubstitutor.replaceSystemProperties("Hi ${user.name}, you are "
            + "working with ${os.name}, your home "
            + "directory is ${user.home}."));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    /**
     * Test the replace of a properties object
     */
    @Test
    public void testSubstituteDefaultProperties(){__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ce1o0hvav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testSubstituteDefaultProperties",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40567,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ce1o0hvav(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40567);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40568);final String org = "${doesnotwork}";
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40569);System.setProperty("doesnotwork", "It works!");

        // create a new Properties object with the System.getProperties as default
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40570);final Properties props = new Properties(System.getProperties());

        __CLR4_1_2v57v57l3lqxuzt.R.inc(40571);assertEquals("It works!", StrSubstitutor.replace(org, props));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}
    
    @Test
    public void testSamePrefixAndSuffix() {__CLR4_1_2v57v57l3lqxuzt.R.globalSliceStart(getClass().getName(),40572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wduvadvb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2v57v57l3lqxuzt.R.rethrow($CLV_t2$);}finally{__CLR4_1_2v57v57l3lqxuzt.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.StrSubstitutorTest.testSamePrefixAndSuffix",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),40572,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wduvadvb0(){try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40572);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40573);final Map<String, String> map = new HashMap<String, String>();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40574);map.put("greeting", "Hello");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40575);map.put(" there ", "XXX");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40576);map.put("name", "commons");
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40577);assertEquals("Hi commons!", StrSubstitutor.replace("Hi @name@!", map, "@", "@"));
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40578);assertEquals("Hello there commons!", StrSubstitutor.replace("@greeting@ there @name@!", map, "@", "@"));
    }finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void doTestReplace(final String expectedResult, final String replaceTemplate, final boolean substring) {try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40579);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40580);final String expectedShortResult = expectedResult.substring(1, expectedResult.length() - 1);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40581);final StrSubstitutor sub = new StrSubstitutor(values);

        // replace using String
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40582);assertEquals(expectedResult, sub.replace(replaceTemplate));
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40583);if ((((substring)&&(__CLR4_1_2v57v57l3lqxuzt.R.iget(40584)!=0|true))||(__CLR4_1_2v57v57l3lqxuzt.R.iget(40585)==0&false))) {{
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40586);assertEquals(expectedShortResult, sub.replace(replaceTemplate, 1, replaceTemplate.length() - 2));
        }

        // replace using char[]
        }__CLR4_1_2v57v57l3lqxuzt.R.inc(40587);final char[] chars = replaceTemplate.toCharArray();
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40588);assertEquals(expectedResult, sub.replace(chars));
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40589);if ((((substring)&&(__CLR4_1_2v57v57l3lqxuzt.R.iget(40590)!=0|true))||(__CLR4_1_2v57v57l3lqxuzt.R.iget(40591)==0&false))) {{
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40592);assertEquals(expectedShortResult, sub.replace(chars, 1, chars.length - 2));
        }

        // replace using StringBuffer
        }__CLR4_1_2v57v57l3lqxuzt.R.inc(40593);StringBuffer buf = new StringBuffer(replaceTemplate);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40594);assertEquals(expectedResult, sub.replace(buf));
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40595);if ((((substring)&&(__CLR4_1_2v57v57l3lqxuzt.R.iget(40596)!=0|true))||(__CLR4_1_2v57v57l3lqxuzt.R.iget(40597)==0&false))) {{
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40598);assertEquals(expectedShortResult, sub.replace(buf, 1, buf.length() - 2));
        }

        // replace using StrBuilder
        }__CLR4_1_2v57v57l3lqxuzt.R.inc(40599);StrBuilder bld = new StrBuilder(replaceTemplate);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40600);assertEquals(expectedResult, sub.replace(bld));
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40601);if ((((substring)&&(__CLR4_1_2v57v57l3lqxuzt.R.iget(40602)!=0|true))||(__CLR4_1_2v57v57l3lqxuzt.R.iget(40603)==0&false))) {{
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40604);assertEquals(expectedShortResult, sub.replace(bld, 1, bld.length() - 2));
        }

        // replace using object
        }__CLR4_1_2v57v57l3lqxuzt.R.inc(40605);final MutableObject<String> obj = new MutableObject<String>(replaceTemplate);  // toString returns template
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40606);assertEquals(expectedResult, sub.replace(obj));

        // replace in StringBuffer
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40607);buf = new StringBuffer(replaceTemplate);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40608);assertTrue(sub.replaceIn(buf));
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40609);assertEquals(expectedResult, buf.toString());
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40610);if ((((substring)&&(__CLR4_1_2v57v57l3lqxuzt.R.iget(40611)!=0|true))||(__CLR4_1_2v57v57l3lqxuzt.R.iget(40612)==0&false))) {{
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40613);buf = new StringBuffer(replaceTemplate);
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40614);assertTrue(sub.replaceIn(buf, 1, buf.length() - 2));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40615);assertEquals(expectedResult, buf.toString());  // expect full result as remainder is untouched
        }

        // replace in StrBuilder
        }__CLR4_1_2v57v57l3lqxuzt.R.inc(40616);bld = new StrBuilder(replaceTemplate);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40617);assertTrue(sub.replaceIn(bld));
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40618);assertEquals(expectedResult, bld.toString());
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40619);if ((((substring)&&(__CLR4_1_2v57v57l3lqxuzt.R.iget(40620)!=0|true))||(__CLR4_1_2v57v57l3lqxuzt.R.iget(40621)==0&false))) {{
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40622);bld = new StrBuilder(replaceTemplate);
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40623);assertTrue(sub.replaceIn(bld, 1, bld.length() - 2));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40624);assertEquals(expectedResult, bld.toString());  // expect full result as remainder is untouched
        }
    }}finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

    private void doTestNoReplace(final String replaceTemplate) {try{__CLR4_1_2v57v57l3lqxuzt.R.inc(40625);
        __CLR4_1_2v57v57l3lqxuzt.R.inc(40626);final StrSubstitutor sub = new StrSubstitutor(values);

        __CLR4_1_2v57v57l3lqxuzt.R.inc(40627);if ((((replaceTemplate == null)&&(__CLR4_1_2v57v57l3lqxuzt.R.iget(40628)!=0|true))||(__CLR4_1_2v57v57l3lqxuzt.R.iget(40629)==0&false))) {{
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40630);assertEquals(null, sub.replace((String) null));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40631);assertEquals(null, sub.replace((String) null, 0, 100));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40632);assertEquals(null, sub.replace((char[]) null));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40633);assertEquals(null, sub.replace((char[]) null, 0, 100));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40634);assertEquals(null, sub.replace((StringBuffer) null));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40635);assertEquals(null, sub.replace((StringBuffer) null, 0, 100));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40636);assertEquals(null, sub.replace((StrBuilder) null));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40637);assertEquals(null, sub.replace((StrBuilder) null, 0, 100));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40638);assertEquals(null, sub.replace((Object) null));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40639);assertFalse(sub.replaceIn((StringBuffer) null));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40640);assertFalse(sub.replaceIn((StringBuffer) null, 0, 100));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40641);assertFalse(sub.replaceIn((StrBuilder) null));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40642);assertFalse(sub.replaceIn((StrBuilder) null, 0, 100));
        } }else {{
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40643);assertEquals(replaceTemplate, sub.replace(replaceTemplate));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40644);final StrBuilder bld = new StrBuilder(replaceTemplate);
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40645);assertFalse(sub.replaceIn(bld));
            __CLR4_1_2v57v57l3lqxuzt.R.inc(40646);assertEquals(replaceTemplate, bld.toString());
        }
    }}finally{__CLR4_1_2v57v57l3lqxuzt.R.flushNeeded();}}

}
