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
package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests {@link org.apache.commons.lang3.builder.HashCodeBuilder} and
 * {@link org.apache.commons.lang3.builder.EqualsBuilderTest} to insure that equal
 * objects must have equal hash codes.
 * 
 * @version $Id$
 */
public class HashCodeBuilderAndEqualsBuilderTest {static class __CLR4_1_2ov2ov2l3lqxubo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,32262,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------

    private void testInteger(final boolean testTransients) {try{__CLR4_1_2ov2ov2l3lqxubo.R.inc(32222);
        __CLR4_1_2ov2ov2l3lqxubo.R.inc(32223);final Integer i1 = Integer.valueOf(12345);
        __CLR4_1_2ov2ov2l3lqxubo.R.inc(32224);final Integer i2 = Integer.valueOf(12345);
        __CLR4_1_2ov2ov2l3lqxubo.R.inc(32225);assertEqualsAndHashCodeContract(i1, i2, testTransients);
    }finally{__CLR4_1_2ov2ov2l3lqxubo.R.flushNeeded();}}

    @Test
    public void testInteger() {__CLR4_1_2ov2ov2l3lqxubo.R.globalSliceStart(getClass().getName(),32226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gn5es3ov6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ov2ov2l3lqxubo.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ov2ov2l3lqxubo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testInteger",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32226,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gn5es3ov6(){try{__CLR4_1_2ov2ov2l3lqxubo.R.inc(32226);
        __CLR4_1_2ov2ov2l3lqxubo.R.inc(32227);testInteger(false);
    }finally{__CLR4_1_2ov2ov2l3lqxubo.R.flushNeeded();}}

    @Test
    public void testIntegerWithTransients() {__CLR4_1_2ov2ov2l3lqxubo.R.globalSliceStart(getClass().getName(),32228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2558wkiov8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ov2ov2l3lqxubo.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ov2ov2l3lqxubo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testIntegerWithTransients",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32228,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2558wkiov8(){try{__CLR4_1_2ov2ov2l3lqxubo.R.inc(32228);
        __CLR4_1_2ov2ov2l3lqxubo.R.inc(32229);testInteger(true);
    }finally{__CLR4_1_2ov2ov2l3lqxubo.R.flushNeeded();}}

    @Test
    public void testFixture() {__CLR4_1_2ov2ov2l3lqxubo.R.globalSliceStart(getClass().getName(),32230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vuck1uova();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ov2ov2l3lqxubo.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ov2ov2l3lqxubo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testFixture",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32230,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vuck1uova(){try{__CLR4_1_2ov2ov2l3lqxubo.R.inc(32230);
        __CLR4_1_2ov2ov2l3lqxubo.R.inc(32231);testFixture(false);
    }finally{__CLR4_1_2ov2ov2l3lqxubo.R.flushNeeded();}}

    @Test
    public void testFixtureWithTransients() {__CLR4_1_2ov2ov2l3lqxubo.R.globalSliceStart(getClass().getName(),32232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hsq6erovc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ov2ov2l3lqxubo.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ov2ov2l3lqxubo.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest.testFixtureWithTransients",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32232,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hsq6erovc(){try{__CLR4_1_2ov2ov2l3lqxubo.R.inc(32232);
        __CLR4_1_2ov2ov2l3lqxubo.R.inc(32233);testFixture(true);
    }finally{__CLR4_1_2ov2ov2l3lqxubo.R.flushNeeded();}}

    private void testFixture(final boolean testTransients) {try{__CLR4_1_2ov2ov2l3lqxubo.R.inc(32234);
        __CLR4_1_2ov2ov2l3lqxubo.R.inc(32235);assertEqualsAndHashCodeContract(new TestFixture(2, 'c', "Test", (short) 2), new TestFixture(2, 'c', "Test", (short) 2), testTransients);
        __CLR4_1_2ov2ov2l3lqxubo.R.inc(32236);assertEqualsAndHashCodeContract(
            new AllTransientFixture(2, 'c', "Test", (short) 2),
            new AllTransientFixture(2, 'c', "Test", (short) 2),
            testTransients);
        __CLR4_1_2ov2ov2l3lqxubo.R.inc(32237);assertEqualsAndHashCodeContract(
            new SubTestFixture(2, 'c', "Test", (short) 2, "Same"),
            new SubTestFixture(2, 'c', "Test", (short) 2, "Same"),
            testTransients);
        __CLR4_1_2ov2ov2l3lqxubo.R.inc(32238);assertEqualsAndHashCodeContract(
            new SubAllTransientFixture(2, 'c', "Test", (short) 2, "Same"),
            new SubAllTransientFixture(2, 'c', "Test", (short) 2, "Same"),
            testTransients);
    }finally{__CLR4_1_2ov2ov2l3lqxubo.R.flushNeeded();}}

    /**
     * Asserts that if <code>lhs</code> equals <code>rhs</code> 
     * then their hash codes MUST be identical.
     * 
     * @param lhs The Left-Hand-Side of the equals test
     * @param rhs The Right-Hand-Side of the equals test
     * @param testTransients wether to test transient fields
     */
    private void assertEqualsAndHashCodeContract(final Object lhs, final Object rhs, final boolean testTransients) {try{__CLR4_1_2ov2ov2l3lqxubo.R.inc(32239);
        __CLR4_1_2ov2ov2l3lqxubo.R.inc(32240);if ((((EqualsBuilder.reflectionEquals(lhs, rhs, testTransients))&&(__CLR4_1_2ov2ov2l3lqxubo.R.iget(32241)!=0|true))||(__CLR4_1_2ov2ov2l3lqxubo.R.iget(32242)==0&false))) {{
            // test a couple of times for consistency.
            __CLR4_1_2ov2ov2l3lqxubo.R.inc(32243);assertEquals(HashCodeBuilder.reflectionHashCode(lhs, testTransients), HashCodeBuilder.reflectionHashCode(rhs, testTransients));
            __CLR4_1_2ov2ov2l3lqxubo.R.inc(32244);assertEquals(HashCodeBuilder.reflectionHashCode(lhs, testTransients), HashCodeBuilder.reflectionHashCode(rhs, testTransients));
            __CLR4_1_2ov2ov2l3lqxubo.R.inc(32245);assertEquals(HashCodeBuilder.reflectionHashCode(lhs, testTransients), HashCodeBuilder.reflectionHashCode(rhs, testTransients));
        }
    }}finally{__CLR4_1_2ov2ov2l3lqxubo.R.flushNeeded();}}

    static class TestFixture {
        int i;
        char c;
        String string;
        short s;

        TestFixture(final int i, final char c, final String string, final short s) {try{__CLR4_1_2ov2ov2l3lqxubo.R.inc(32246);
            __CLR4_1_2ov2ov2l3lqxubo.R.inc(32247);this.i = i;
            __CLR4_1_2ov2ov2l3lqxubo.R.inc(32248);this.c = c;
            __CLR4_1_2ov2ov2l3lqxubo.R.inc(32249);this.string = string;
            __CLR4_1_2ov2ov2l3lqxubo.R.inc(32250);this.s = s;
        }finally{__CLR4_1_2ov2ov2l3lqxubo.R.flushNeeded();}}
    }

    static class SubTestFixture extends TestFixture {
        transient String tString;

        SubTestFixture(final int i, final char c, final String string, final short s, final String tString) {
            super(i, c, string, s);__CLR4_1_2ov2ov2l3lqxubo.R.inc(32252);try{__CLR4_1_2ov2ov2l3lqxubo.R.inc(32251);
            __CLR4_1_2ov2ov2l3lqxubo.R.inc(32253);this.tString = tString;
        }finally{__CLR4_1_2ov2ov2l3lqxubo.R.flushNeeded();}}
    }

    static class AllTransientFixture {
        transient int i;
        transient char c;
        transient String string;
        transient short s;

        AllTransientFixture(final int i, final char c, final String string, final short s) {try{__CLR4_1_2ov2ov2l3lqxubo.R.inc(32254);
            __CLR4_1_2ov2ov2l3lqxubo.R.inc(32255);this.i = i;
            __CLR4_1_2ov2ov2l3lqxubo.R.inc(32256);this.c = c;
            __CLR4_1_2ov2ov2l3lqxubo.R.inc(32257);this.string = string;
            __CLR4_1_2ov2ov2l3lqxubo.R.inc(32258);this.s = s;
        }finally{__CLR4_1_2ov2ov2l3lqxubo.R.flushNeeded();}}
    }

    static class SubAllTransientFixture extends AllTransientFixture {
        transient String tString;

        SubAllTransientFixture(final int i, final char c, final String string, final short s, final String tString) {
            super(i, c, string, s);__CLR4_1_2ov2ov2l3lqxubo.R.inc(32260);try{__CLR4_1_2ov2ov2l3lqxubo.R.inc(32259);
            __CLR4_1_2ov2ov2l3lqxubo.R.inc(32261);this.tString = tString;
        }finally{__CLR4_1_2ov2ov2l3lqxubo.R.flushNeeded();}}
    }


}
