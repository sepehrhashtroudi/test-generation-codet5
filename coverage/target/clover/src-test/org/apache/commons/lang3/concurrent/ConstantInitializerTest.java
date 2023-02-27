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
package org.apache.commons.lang3.concurrent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@code ConstantInitializer}.
 *
 * @version $Id$
 */
public class ConstantInitializerTest {static class __CLR4_1_2q9tq9tl3lqxukn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,34088,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the object managed by the initializer. */
    private static final Integer VALUE = 42;

    /** The initializer to be tested. */
    private ConstantInitializer<Integer> init;

    @Before
    public void setUp() throws Exception {try{__CLR4_1_2q9tq9tl3lqxukn.R.inc(34049);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34050);init = new ConstantInitializer<Integer>(VALUE);
    }finally{__CLR4_1_2q9tq9tl3lqxukn.R.flushNeeded();}}

    /**
     * Helper method for testing equals() and hashCode().
     *
     * @param obj the object to compare with the test instance
     * @param expected the expected result
     */
    private void checkEquals(final Object obj, final boolean expected) {try{__CLR4_1_2q9tq9tl3lqxukn.R.inc(34051);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34052);assertTrue("Wrong result of equals", expected == init.equals(obj));
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34053);if ((((obj != null)&&(__CLR4_1_2q9tq9tl3lqxukn.R.iget(34054)!=0|true))||(__CLR4_1_2q9tq9tl3lqxukn.R.iget(34055)==0&false))) {{
            __CLR4_1_2q9tq9tl3lqxukn.R.inc(34056);assertTrue("Not symmetric", expected == obj.equals(init));
            __CLR4_1_2q9tq9tl3lqxukn.R.inc(34057);if ((((expected)&&(__CLR4_1_2q9tq9tl3lqxukn.R.iget(34058)!=0|true))||(__CLR4_1_2q9tq9tl3lqxukn.R.iget(34059)==0&false))) {{
                __CLR4_1_2q9tq9tl3lqxukn.R.inc(34060);assertEquals("Different hash codes", init.hashCode(),
                        obj.hashCode());
            }
        }}
    }}finally{__CLR4_1_2q9tq9tl3lqxukn.R.flushNeeded();}}

    /**
     * Tests whether the correct object is returned.
     */
    @Test
    public void testGetObject() {__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceStart(getClass().getName(),34061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ejm016qa5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q9tq9tl3lqxukn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testGetObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34061,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ejm016qa5(){try{__CLR4_1_2q9tq9tl3lqxukn.R.inc(34061);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34062);assertEquals("Wrong object", VALUE, init.getObject());
    }finally{__CLR4_1_2q9tq9tl3lqxukn.R.flushNeeded();}}

    /**
     * Tests whether get() returns the correct object.
     */
    @Test
    public void testGet() throws ConcurrentException {__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceStart(getClass().getName(),34063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tpje3vqa7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q9tq9tl3lqxukn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testGet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34063,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tpje3vqa7() throws ConcurrentException{try{__CLR4_1_2q9tq9tl3lqxukn.R.inc(34063);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34064);assertEquals("Wrong object", VALUE, init.get());
    }finally{__CLR4_1_2q9tq9tl3lqxukn.R.flushNeeded();}}

    /**
     * Tests equals() if the expected result is true.
     */
    @Test
    public void testEqualsTrue() {__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceStart(getClass().getName(),34065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a7e92yqa9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q9tq9tl3lqxukn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testEqualsTrue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34065,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a7e92yqa9(){try{__CLR4_1_2q9tq9tl3lqxukn.R.inc(34065);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34066);checkEquals(init, true);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34067);ConstantInitializer<Integer> init2 = new ConstantInitializer<Integer>(
                Integer.valueOf(VALUE.intValue()));
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34068);checkEquals(init2, true);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34069);init = new ConstantInitializer<Integer>(null);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34070);init2 = new ConstantInitializer<Integer>(null);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34071);checkEquals(init2, true);
    }finally{__CLR4_1_2q9tq9tl3lqxukn.R.flushNeeded();}}

    /**
     * Tests equals() if the expected result is false.
     */
    @Test
    public void testEqualsFalse() {__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceStart(getClass().getName(),34072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2e5zr5zqag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q9tq9tl3lqxukn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testEqualsFalse",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34072,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2e5zr5zqag(){try{__CLR4_1_2q9tq9tl3lqxukn.R.inc(34072);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34073);ConstantInitializer<Integer> init2 = new ConstantInitializer<Integer>(
                null);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34074);checkEquals(init2, false);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34075);init2 = new ConstantInitializer<Integer>(VALUE + 1);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34076);checkEquals(init2, false);
    }finally{__CLR4_1_2q9tq9tl3lqxukn.R.flushNeeded();}}

    /**
     * Tests equals() with objects of other classes.
     */
    @Test
    public void testEqualsWithOtherObjects() {__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceStart(getClass().getName(),34077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25lhmwuqal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q9tq9tl3lqxukn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testEqualsWithOtherObjects",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34077,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25lhmwuqal(){try{__CLR4_1_2q9tq9tl3lqxukn.R.inc(34077);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34078);checkEquals(null, false);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34079);checkEquals(this, false);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34080);checkEquals(new ConstantInitializer<String>("Test"), false);
    }finally{__CLR4_1_2q9tq9tl3lqxukn.R.flushNeeded();}}

    /**
     * Tests the string representation.
     */
    @Test
    public void testToString() {__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceStart(getClass().getName(),34081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidqap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q9tq9tl3lqxukn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34081,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidqap(){try{__CLR4_1_2q9tq9tl3lqxukn.R.inc(34081);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34082);final String s = init.toString();
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34083);final Pattern pattern = Pattern
                .compile("ConstantInitializer@\\d+ \\[ object = " + VALUE
                        + " \\]");
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34084);assertTrue("Wrong string: " + s, pattern.matcher(s).matches());
    }finally{__CLR4_1_2q9tq9tl3lqxukn.R.flushNeeded();}}

    /**
     * Tests the string representation if the managed object is null.
     */
    @Test
    public void testToStringNull() {__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceStart(getClass().getName(),34085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jnvi3wqat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2q9tq9tl3lqxukn.R.rethrow($CLV_t2$);}finally{__CLR4_1_2q9tq9tl3lqxukn.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.concurrent.ConstantInitializerTest.testToStringNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34085,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jnvi3wqat(){try{__CLR4_1_2q9tq9tl3lqxukn.R.inc(34085);
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34086);final String s = new ConstantInitializer<Object>(null).toString();
        __CLR4_1_2q9tq9tl3lqxukn.R.inc(34087);assertTrue("Object not found: " + s, s.indexOf("object = null") > 0);
    }finally{__CLR4_1_2q9tq9tl3lqxukn.R.flushNeeded();}}
}
