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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.EqualsBuilder}.
 *
 * @version $Id$
 */
public class EqualsBuilderTest {static class __CLR4_1_2o9ko9kl3lqxubb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,32222,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------

    static class TestObject {
        private int a;
        public TestObject() {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31448);
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
        public TestObject(final int a) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31449);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31450);this.a = a;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31451);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31452);if ((((o == null)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31453)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31454)==0&false))) {{ __CLR4_1_2o9ko9kl3lqxubb.R.inc(31455);return false; }
            }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31456);if ((((o == this)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31457)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31458)==0&false))) {{ __CLR4_1_2o9ko9kl3lqxubb.R.inc(31459);return true; }
            }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31460);if ((((o.getClass() != getClass())&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31461)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31462)==0&false))) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31463);return false;
            }

            }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31464);final TestObject rhs = (TestObject) o;
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31465);return a == rhs.a;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31466);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31467);return a;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        public void setA(final int a) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31468);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31469);this.a = a;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        public int getA() {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31470);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31471);return a;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    }

    static class TestSubObject extends TestObject {
        private int b;
        public TestSubObject() {
            super(0);__CLR4_1_2o9ko9kl3lqxubb.R.inc(31473);try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31472);
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
        public TestSubObject(final int a, final int b) {
            super(a);__CLR4_1_2o9ko9kl3lqxubb.R.inc(31475);try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31474);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31476);this.b = b;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31477);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31478);if ((((o == null)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31479)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31480)==0&false))) {{ __CLR4_1_2o9ko9kl3lqxubb.R.inc(31481);return false; }
            }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31482);if ((((o == this)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31483)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31484)==0&false))) {{ __CLR4_1_2o9ko9kl3lqxubb.R.inc(31485);return true; }
            }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31486);if ((((o.getClass() != getClass())&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31487)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31488)==0&false))) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31489);return false;
            }

            }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31490);final TestSubObject rhs = (TestSubObject) o;
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31491);return super.equals(o) && b == rhs.b;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31492);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31493);return b *17 + super.hashCode();
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        public void setB(final int b) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31494);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31495);this.b = b;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        public int getB() {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31496);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31497);return b;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    }
    
    static class TestEmptySubObject extends TestObject {
        public TestEmptySubObject(final int a) {
            super(a);__CLR4_1_2o9ko9kl3lqxubb.R.inc(31499);try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31498);
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    }

    static class TestTSubObject extends TestObject {
        @SuppressWarnings("unused")
        private transient int t;
        public TestTSubObject(final int a, final int t) {
            super(a);__CLR4_1_2o9ko9kl3lqxubb.R.inc(31501);try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31500);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31502);this.t = t;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    }

    static class TestTTSubObject extends TestTSubObject {
        @SuppressWarnings("unused")
        private transient int tt;
        public TestTTSubObject(final int a, final int t, final int tt) {
            super(a, t);__CLR4_1_2o9ko9kl3lqxubb.R.inc(31504);try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31503);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31505);this.tt = tt;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    }

    static class TestTTLeafObject extends TestTTSubObject {
        @SuppressWarnings("unused")
        private final int leafValue;
        public TestTTLeafObject(final int a, final int t, final int tt, final int leafValue) {
            super(a, t, tt);__CLR4_1_2o9ko9kl3lqxubb.R.inc(31507);try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31506);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31508);this.leafValue = leafValue;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    }

    static class TestTSubObject2 extends TestObject {
        private transient int t;
        public TestTSubObject2(final int a, final int t) {
            super(a);__CLR4_1_2o9ko9kl3lqxubb.R.inc(31510);try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31509);
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
        public int getT() {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31511);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31512);return t;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
        public void setT(final int t) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31513);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31514);this.t = t;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    }

    @Test
    public void testReflectionEquals() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29weq0zobf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31515,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29weq0zobf(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31515);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31516);final TestObject o1 = new TestObject(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31517);final TestObject o2 = new TestObject(5);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31518);assertTrue(EqualsBuilder.reflectionEquals(o1, o1));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31519);assertTrue(!EqualsBuilder.reflectionEquals(o1, o2));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31520);o2.setA(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31521);assertTrue(EqualsBuilder.reflectionEquals(o1, o2));

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31522);assertTrue(!EqualsBuilder.reflectionEquals(o1, this));

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31523);assertTrue(!EqualsBuilder.reflectionEquals(o1, null));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31524);assertTrue(!EqualsBuilder.reflectionEquals(null, o2));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31525);assertTrue(EqualsBuilder.reflectionEquals((Object) null, (Object) null));
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    
    @Test
    public void testReflectionHierarchyEquals() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2t8ekwyobq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionHierarchyEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31526,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2t8ekwyobq(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31526);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31527);testReflectionHierarchyEquals(false);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31528);testReflectionHierarchyEquals(true);
        // Transients
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31529);assertTrue(EqualsBuilder.reflectionEquals(new TestTTLeafObject(1, 2, 3, 4), new TestTTLeafObject(1, 2, 3, 4), true));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31530);assertTrue(EqualsBuilder.reflectionEquals(new TestTTLeafObject(1, 2, 3, 4), new TestTTLeafObject(1, 2, 3, 4), false));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31531);assertTrue(!EqualsBuilder.reflectionEquals(new TestTTLeafObject(1, 0, 0, 4), new TestTTLeafObject(1, 2, 3, 4), true));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31532);assertTrue(!EqualsBuilder.reflectionEquals(new TestTTLeafObject(1, 2, 3, 4), new TestTTLeafObject(1, 2, 3, 0), true));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31533);assertTrue(!EqualsBuilder.reflectionEquals(new TestTTLeafObject(0, 2, 3, 4), new TestTTLeafObject(1, 2, 3, 4), true));
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    private void testReflectionHierarchyEquals(final boolean testTransients) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31534);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31535);final TestObject to1 = new TestObject(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31536);final TestObject to1Bis = new TestObject(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31537);final TestObject to1Ter = new TestObject(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31538);final TestObject to2 = new TestObject(5);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31539);final TestEmptySubObject teso = new TestEmptySubObject(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31540);final TestTSubObject ttso = new TestTSubObject(4, 1);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31541);final TestTTSubObject tttso = new TestTTSubObject(4, 1, 2);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31542);final TestTTLeafObject ttlo = new TestTTLeafObject(4, 1, 2, 3);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31543);final TestSubObject tso1 = new TestSubObject(1, 4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31544);final TestSubObject tso1bis = new TestSubObject(1, 4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31545);final TestSubObject tso1ter = new TestSubObject(1, 4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31546);final TestSubObject tso2 = new TestSubObject(2, 5);

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31547);testReflectionEqualsEquivalenceRelationship(to1, to1Bis, to1Ter, to2, new TestObject(), testTransients);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31548);testReflectionEqualsEquivalenceRelationship(tso1, tso1bis, tso1ter, tso2, new TestSubObject(), testTransients);

        // More sanity checks:

        // same values
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31549);assertTrue(EqualsBuilder.reflectionEquals(ttlo, ttlo, testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31550);assertTrue(EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(1, 10), testTransients));
        // same super values, diff sub values
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31551);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(1, 11), testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31552);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 11), new TestSubObject(1, 10), testTransients));
        // diff super values, same sub values
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31553);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(0, 10), new TestSubObject(1, 10), testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31554);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(1, 10), new TestSubObject(0, 10), testTransients));

        // mix super and sub types: equals
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31555);assertTrue(EqualsBuilder.reflectionEquals(to1, teso, testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31556);assertTrue(EqualsBuilder.reflectionEquals(teso, to1, testTransients));

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31557);assertTrue(EqualsBuilder.reflectionEquals(to1, ttso, false)); // Force testTransients = false for this assert
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31558);assertTrue(EqualsBuilder.reflectionEquals(ttso, to1, false)); // Force testTransients = false for this assert

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31559);assertTrue(EqualsBuilder.reflectionEquals(to1, tttso, false)); // Force testTransients = false for this assert
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31560);assertTrue(EqualsBuilder.reflectionEquals(tttso, to1, false)); // Force testTransients = false for this assert

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31561);assertTrue(EqualsBuilder.reflectionEquals(ttso, tttso, false)); // Force testTransients = false for this assert
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31562);assertTrue(EqualsBuilder.reflectionEquals(tttso, ttso, false)); // Force testTransients = false for this assert

        // mix super and sub types: NOT equals
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31563);assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(0), new TestEmptySubObject(1), testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31564);assertTrue(!EqualsBuilder.reflectionEquals(new TestEmptySubObject(1), new TestObject(0), testTransients));

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31565);assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(0), new TestTSubObject(1, 1), testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31566);assertTrue(!EqualsBuilder.reflectionEquals(new TestTSubObject(1, 1), new TestObject(0), testTransients));

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31567);assertTrue(!EqualsBuilder.reflectionEquals(new TestObject(1), new TestSubObject(0, 10), testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31568);assertTrue(!EqualsBuilder.reflectionEquals(new TestSubObject(0, 10), new TestObject(1), testTransients));

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31569);assertTrue(!EqualsBuilder.reflectionEquals(to1, ttlo));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31570);assertTrue(!EqualsBuilder.reflectionEquals(tso1, this));
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    /**
     * Equivalence relationship tests inspired by "Effective Java":
     * <ul>
     * <li>reflection</li>
     * <li>symmetry</li>
     * <li>transitive</li>
     * <li>consistency</li>
     * <li>non-null reference</li>
     * </ul>
     * @param to a TestObject
     * @param toBis a TestObject, equal to to and toTer
     * @param toTer Left hand side, equal to to and toBis
     * @param to2 a different TestObject
     * @param oToChange a TestObject that will be changed
     * @param testTransients whether to test transient instance variables 
     */
    private void testReflectionEqualsEquivalenceRelationship(
        final TestObject to,
        final TestObject toBis,
        final TestObject toTer,
        final TestObject to2,
        final TestObject oToChange,
        final boolean testTransients) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31571);

        // reflection test
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31572);assertTrue(EqualsBuilder.reflectionEquals(to, to, testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31573);assertTrue(EqualsBuilder.reflectionEquals(to2, to2, testTransients));

        // symmetry test
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31574);assertTrue(EqualsBuilder.reflectionEquals(to, toBis, testTransients) && EqualsBuilder.reflectionEquals(toBis, to, testTransients));

        // transitive test
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31575);assertTrue(
            EqualsBuilder.reflectionEquals(to, toBis, testTransients)
                && EqualsBuilder.reflectionEquals(toBis, toTer, testTransients)
                && EqualsBuilder.reflectionEquals(to, toTer, testTransients));

        // consistency test
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31576);oToChange.setA(to.getA());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31577);if ((((oToChange instanceof TestSubObject)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31578)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31579)==0&false))) {{
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31580);((TestSubObject) oToChange).setB(((TestSubObject) to).getB());
        }
        }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31581);assertTrue(EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31582);assertTrue(EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31583);oToChange.setA(to.getA() + 1);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31584);if ((((oToChange instanceof TestSubObject)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31585)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31586)==0&false))) {{
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31587);((TestSubObject) oToChange).setB(((TestSubObject) to).getB() + 1);
        }
        }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31588);assertTrue(!EqualsBuilder.reflectionEquals(oToChange, to, testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31589);assertTrue(!EqualsBuilder.reflectionEquals(oToChange, to, testTransients));

        // non-null reference test
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31590);assertTrue(!EqualsBuilder.reflectionEquals(to, null, testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31591);assertTrue(!EqualsBuilder.reflectionEquals(to2, null, testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31592);assertTrue(!EqualsBuilder.reflectionEquals(null, to, testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31593);assertTrue(!EqualsBuilder.reflectionEquals(null, to2, testTransients));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31594);assertTrue(EqualsBuilder.reflectionEquals((Object) null, (Object) null, testTransients));
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testSuper() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28bo7cgodn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testSuper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31595,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28bo7cgodn(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31595);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31596);final TestObject o1 = new TestObject(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31597);final TestObject o2 = new TestObject(5);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31598);assertTrue(new EqualsBuilder().appendSuper(true).append(o1, o1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31599);assertFalse(new EqualsBuilder().appendSuper(false).append(o1, o1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31600);assertFalse(new EqualsBuilder().appendSuper(true).append(o1, o2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31601);assertFalse(new EqualsBuilder().appendSuper(false).append(o1, o2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testObject() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iogga0odu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31602,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iogga0odu(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31602);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31603);final TestObject o1 = new TestObject(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31604);final TestObject o2 = new TestObject(5);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31605);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31606);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31607);o2.setA(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31608);assertTrue(new EqualsBuilder().append(o1, o2).isEquals());

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31609);assertTrue(!new EqualsBuilder().append(o1, this).isEquals());
        
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31610);assertTrue(!new EqualsBuilder().append(o1, null).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31611);assertTrue(!new EqualsBuilder().append(null, o2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31612);assertTrue(new EqualsBuilder().append((Object) null, (Object) null).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    
    @Test
    public void testObjectBuild() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tvdhb0oe5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectBuild",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31613,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tvdhb0oe5(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31613);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31614);final TestObject o1 = new TestObject(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31615);final TestObject o2 = new TestObject(5);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31616);assertEquals(Boolean.TRUE, new EqualsBuilder().append(o1, o1).build());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31617);assertEquals(Boolean.FALSE, new EqualsBuilder().append(o1, o2).build());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31618);o2.setA(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31619);assertEquals(Boolean.TRUE, new EqualsBuilder().append(o1, o2).build());

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31620);assertEquals(Boolean.FALSE, new EqualsBuilder().append(o1, this).build());
        
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31621);assertEquals(Boolean.FALSE, new EqualsBuilder().append(o1, null).build());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31622);assertEquals(Boolean.FALSE, new EqualsBuilder().append(null, o2).build());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31623);assertEquals(Boolean.TRUE, new EqualsBuilder().append((Object) null, (Object) null).build());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xsq9mzoeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31624,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xsq9mzoeg(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31624);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31625);final long o1 = 1L;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31626);final long o2 = 2L;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31627);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31628);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testInt() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28s3xd0oel();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31629,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28s3xd0oel(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31629);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31630);final int o1 = 1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31631);final int o2 = 2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31632);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31633);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testShort() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2exs2r3oeq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31634,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2exs2r3oeq(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31634);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31635);final short o1 = 1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31636);final short o2 = 2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31637);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31638);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testChar() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d2kz0voev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31639,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d2kz0voev(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31639);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31640);final char o1 = 1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31641);final char o2 = 2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31642);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31643);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testByte() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22w26nzof0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31644,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22w26nzof0(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31644);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31645);final byte o1 = 1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31646);final byte o2 = 2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31647);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31648);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testDouble() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23hfze2of5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31649,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23hfze2of5(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31649);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31650);final double o1 = 1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31651);final double o2 = 2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31652);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31653);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31654);assertTrue(!new EqualsBuilder().append(o1, Double.NaN).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31655);assertTrue(new EqualsBuilder().append(Double.NaN, Double.NaN).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31656);assertTrue(new EqualsBuilder().append(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testFloat() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tuf8q9ofd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31657,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tuf8q9ofd(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31657);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31658);final float o1 = 1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31659);final float o2 = 2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31660);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31661);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31662);assertTrue(!new EqualsBuilder().append(o1, Float.NaN).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31663);assertTrue(new EqualsBuilder().append(Float.NaN, Float.NaN).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31664);assertTrue(new EqualsBuilder().append(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testAccessors() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hde3s1ofl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testAccessors",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31665,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hde3s1ofl(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31665);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31666);final EqualsBuilder equalsBuilder = new EqualsBuilder();
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31667);assertTrue(equalsBuilder.isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31668);equalsBuilder.setEquals(true);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31669);assertTrue(equalsBuilder.isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31670);equalsBuilder.setEquals(false);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31671);assertFalse(equalsBuilder.isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testReset() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26jq2kcofs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testReset",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31672,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26jq2kcofs(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31672);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31673);final EqualsBuilder equalsBuilder = new EqualsBuilder();
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31674);assertTrue(equalsBuilder.isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31675);equalsBuilder.setEquals(false);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31676);assertFalse(equalsBuilder.isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31677);equalsBuilder.reset();
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31678);assertTrue(equalsBuilder.isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    
    @Test
    public void testBoolean() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a9awn1ofz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31679,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a9awn1ofz(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31679);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31680);final boolean o1 = true;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31681);final boolean o2 = false;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31682);assertTrue(new EqualsBuilder().append(o1, o1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31683);assertTrue(!new EqualsBuilder().append(o1, o2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oi04a7og4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31684,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oi04a7og4(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31684);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31685);TestObject[] obj1 = new TestObject[3];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31686);obj1[0] = new TestObject(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31687);obj1[1] = new TestObject(5);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31688);obj1[2] = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31689);TestObject[] obj2 = new TestObject[3];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31690);obj2[0] = new TestObject(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31691);obj2[1] = new TestObject(5);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31692);obj2[2] = null;
        
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31693);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31694);assertTrue(new EqualsBuilder().append(obj2, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31695);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31696);obj1[1].setA(6);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31697);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31698);obj1[1].setA(5);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31699);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31700);obj1[2] = obj1[1];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31701);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31702);obj1[2] = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31703);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
                       
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31704);obj2 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31705);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31706);obj1 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31707);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2if58i6ogs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31708,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2if58i6ogs(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31708);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31709);long[] obj1 = new long[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31710);obj1[0] = 5L;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31711);obj1[1] = 6L;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31712);long[] obj2 = new long[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31713);obj2[0] = 5L;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31714);obj2[1] = 6L;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31715);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31716);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31717);obj1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31718);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31719);obj2 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31720);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31721);obj1 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31722);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testIntArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28w0so3oh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31723,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28w0so3oh7(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31723);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31724);int[] obj1 = new int[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31725);obj1[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31726);obj1[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31727);int[] obj2 = new int[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31728);obj2[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31729);obj2[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31730);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31731);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31732);obj1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31733);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31734);obj2 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31735);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31736);obj1 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31737);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testShortArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nqn45yohm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31738,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nqn45yohm(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31738);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31739);short[] obj1 = new short[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31740);obj1[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31741);obj1[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31742);short[] obj2 = new short[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31743);obj2[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31744);obj2[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31745);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31746);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31747);obj1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31748);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31749);obj2 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31750);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31751);obj1 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31752);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testCharArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w0bza0oi1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31753,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w0bza0oi1(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31753);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31754);char[] obj1 = new char[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31755);obj1[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31756);obj1[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31757);char[] obj2 = new char[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31758);obj2[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31759);obj2[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31760);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31761);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31762);obj1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31763);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31764);obj2 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31765);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31766);obj1 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31767);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testByteArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mhe7kqoig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31768,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mhe7kqoig(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31768);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31769);byte[] obj1 = new byte[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31770);obj1[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31771);obj1[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31772);byte[] obj2 = new byte[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31773);obj2[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31774);obj2[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31775);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31776);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31777);obj1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31778);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31779);obj2 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31780);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31781);obj1 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31782);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testDoubleArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m6ks4joiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31783,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m6ks4joiv(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31783);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31784);double[] obj1 = new double[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31785);obj1[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31786);obj1[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31787);double[] obj2 = new double[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31788);obj2[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31789);obj2[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31790);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31791);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31792);obj1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31793);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31794);obj2 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31795);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31796);obj1 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31797);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testFloatArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2maw6iyoja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31798,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2maw6iyoja(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31798);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31799);float[] obj1 = new float[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31800);obj1[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31801);obj1[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31802);float[] obj2 = new float[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31803);obj2[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31804);obj2[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31805);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31806);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31807);obj1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31808);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31809);obj2 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31810);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31811);obj1 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31812);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testBooleanArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21rzd0qojp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31813,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21rzd0qojp(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31813);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31814);boolean[] obj1 = new boolean[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31815);obj1[0] = true;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31816);obj1[1] = false;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31817);boolean[] obj2 = new boolean[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31818);obj2[0] = true;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31819);obj2[1] = false;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31820);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31821);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31822);obj1[1] = true;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31823);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31824);obj2 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31825);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31826);obj1 = null;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31827);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testMultiLongArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2f7d7lpok4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31828,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2f7d7lpok4(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31828);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31829);final long[][] array1 = new long[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31830);final long[][] array2 = new long[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31831);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31832)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31833)==0&false)); ++i) {{
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31834);for (int j = 0; (((j < array1[0].length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31835)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31836)==0&false)); j++) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31837);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31838);array2[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31839);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31840);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31841);array1[1][1] = 0;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31842);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testMultiIntArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27ol03cokj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiIntArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31843,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27ol03cokj(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31843);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31844);final int[][] array1 = new int[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31845);final int[][] array2 = new int[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31846);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31847)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31848)==0&false)); ++i) {{
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31849);for (int j = 0; (((j < array1[0].length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31850)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31851)==0&false)); j++) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31852);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31853);array2[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31854);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31855);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31856);array1[1][1] = 0;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31857);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testMultiShortArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nu5uzoky();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31858,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nu5uzoky(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31858);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31859);final short[][] array1 = new short[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31860);final short[][] array2 = new short[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31861);for (short i = 0; (((i < array1.length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31862)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31863)==0&false)); ++i) {{
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31864);for (short j = 0; (((j < array1[0].length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31865)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31866)==0&false)); j++) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31867);array1[i][j] = i;
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31868);array2[i][j] = i;
            }
        }}
        }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31869);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31870);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31871);array1[1][1] = 0;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31872);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testMultiCharArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25e9ml9old();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31873,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25e9ml9old(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31873);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31874);final char[][] array1 = new char[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31875);final char[][] array2 = new char[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31876);for (char i = 0; (((i < array1.length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31877)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31878)==0&false)); ++i) {{
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31879);for (char j = 0; (((j < array1[0].length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31880)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31881)==0&false)); j++) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31882);array1[i][j] = i;
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31883);array2[i][j] = i;
            }
        }}
        }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31884);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31885);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31886);array1[1][1] = 0;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31887);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testMultiByteArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b548j5ols();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31888,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b548j5ols(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31888);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31889);final byte[][] array1 = new byte[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31890);final byte[][] array2 = new byte[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31891);for (byte i = 0; (((i < array1.length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31892)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31893)==0&false)); ++i) {{
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31894);for (byte j = 0; (((j < array1[0].length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31895)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31896)==0&false)); j++) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31897);array1[i][j] = i;
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31898);array2[i][j] = i;
            }
        }}
        }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31899);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31900);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31901);array1[1][1] = 0;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31902);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testMultiFloatArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pnex57om7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiFloatArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31903,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pnex57om7(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31903);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31904);final float[][] array1 = new float[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31905);final float[][] array2 = new float[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31906);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31907)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31908)==0&false)); ++i) {{
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31909);for (int j = 0; (((j < array1[0].length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31910)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31911)==0&false)); j++) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31912);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31913);array2[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31914);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31915);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31916);array1[1][1] = 0;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31917);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testMultiDoubleArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2radrtkomm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiDoubleArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31918,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2radrtkomm(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31918);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31919);final double[][] array1 = new double[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31920);final double[][] array2 = new double[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31921);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31922)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31923)==0&false)); ++i) {{
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31924);for (int j = 0; (((j < array1[0].length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31925)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31926)==0&false)); j++) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31927);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31928);array2[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31929);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31930);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31931);array1[1][1] = 0;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31932);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testMultiBooleanArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2efr9kxon1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMultiBooleanArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31933,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2efr9kxon1(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31933);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31934);final boolean[][] array1 = new boolean[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31935);final boolean[][] array2 = new boolean[2][2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31936);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31937)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31938)==0&false)); ++i) {{
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31939);for (int j = 0; (((j < array1[0].length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31940)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31941)==0&false)); j++) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31942);array1[i][j] = i == 1 || j == 1;
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31943);array2[i][j] = i == 1 || j == 1;
            }
        }}
        }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31944);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31945);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31946);array1[1][1] = false;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31947);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
        
        // compare 1 dim to 2.
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31948);final boolean[] array3 = new boolean[]{true, true};
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31949);assertFalse(new EqualsBuilder().append(array1, array3).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31950);assertFalse(new EqualsBuilder().append(array3, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31951);assertFalse(new EqualsBuilder().append(array2, array3).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31952);assertFalse(new EqualsBuilder().append(array3, array2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testRaggedArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22rmuioonl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testRaggedArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31953,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22rmuioonl(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31953);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31954);final long array1[][] = new long[2][];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31955);final long array2[][] = new long[2][];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31956);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31957)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31958)==0&false)); ++i) {{
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31959);array1[i] = new long[2];
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31960);array2[i] = new long[2];
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31961);for (int j = 0; (((j < array1[i].length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31962)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31963)==0&false)); ++j) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31964);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31965);array2[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31966);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31967);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31968);array1[1][1] = 0;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31969);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testMixedArray() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qvks4poo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testMixedArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31970,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qvks4poo2(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31970);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31971);final Object array1[] = new Object[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31972);final Object array2[] = new Object[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31973);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31974)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31975)==0&false)); ++i) {{
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31976);array1[i] = new long[2];
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31977);array2[i] = new long[2];
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(31978);for (int j = 0; (((j < 2)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31979)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(31980)==0&false)); ++j) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31981);((long[]) array1[i])[j] = (i + 1) * (j + 1);
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(31982);((long[]) array2[i])[j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_1_2o9ko9kl3lqxubb.R.inc(31983);assertTrue(new EqualsBuilder().append(array1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31984);assertTrue(new EqualsBuilder().append(array1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31985);((long[]) array1[1])[1] = 0;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31986);assertTrue(!new EqualsBuilder().append(array1, array2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testObjectArrayHiddenByObject() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),31987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vcpt73ooj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testObjectArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31987,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vcpt73ooj(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(31987);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31988);final TestObject[] array1 = new TestObject[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31989);array1[0] = new TestObject(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31990);array1[1] = new TestObject(5);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31991);final TestObject[] array2 = new TestObject[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31992);array2[0] = new TestObject(4);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31993);array2[1] = new TestObject(5);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31994);final Object obj1 = array1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31995);final Object obj2 = array2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31996);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31997);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31998);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(31999);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32000);array1[1].setA(6);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32001);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testLongArrayHiddenByObject() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),32002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pwc0mmooy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testLongArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32002,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pwc0mmooy(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32002);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32003);final long[] array1 = new long[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32004);array1[0] = 5L;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32005);array1[1] = 6L;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32006);final long[] array2 = new long[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32007);array2[0] = 5L;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32008);array2[1] = 6L;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32009);final Object obj1 = array1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32010);final Object obj2 = array2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32011);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32012);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32013);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32014);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32015);array1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32016);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testIntArrayHiddenByObject() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),32017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b23hj1opd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testIntArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32017,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b23hj1opd(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32017);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32018);final int[] array1 = new int[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32019);array1[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32020);array1[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32021);final int[] array2 = new int[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32022);array2[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32023);array2[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32024);final Object obj1 = array1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32025);final Object obj2 = array2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32026);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32027);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32028);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32029);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32030);array1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32031);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testShortArrayHiddenByObject() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),32032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27gi80aops();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testShortArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32032,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27gi80aops(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32032);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32033);final short[] array1 = new short[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32034);array1[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32035);array1[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32036);final short[] array2 = new short[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32037);array2[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32038);array2[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32039);final Object obj1 = array1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32040);final Object obj2 = array2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32041);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32042);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32043);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32044);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32045);array1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32046);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testCharArrayHiddenByObject() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),32047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i1ukfsoq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testCharArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32047,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i1ukfsoq7(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32047);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32048);final char[] array1 = new char[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32049);array1[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32050);array1[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32051);final char[] array2 = new char[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32052);array2[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32053);array2[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32054);final Object obj1 = array1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32055);final Object obj2 = array2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32056);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32057);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32058);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32059);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32060);array1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32061);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testByteArrayHiddenByObject() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),32062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vn0kzqoqm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testByteArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32062,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vn0kzqoqm(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32062);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32063);final byte[] array1 = new byte[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32064);array1[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32065);array1[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32066);final byte[] array2 = new byte[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32067);array2[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32068);array2[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32069);final Object obj1 = array1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32070);final Object obj2 = array2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32071);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32072);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32073);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32074);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32075);array1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32076);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testDoubleArrayHiddenByObject() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),32077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x7e5j1or1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testDoubleArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32077,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x7e5j1or1(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32077);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32078);final double[] array1 = new double[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32079);array1[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32080);array1[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32081);final double[] array2 = new double[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32082);array2[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32083);array2[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32084);final Object obj1 = array1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32085);final Object obj2 = array2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32086);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32087);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32088);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32089);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32090);array1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32091);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testFloatArrayHiddenByObject() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),32092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2eda87qorg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testFloatArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32092,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2eda87qorg(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32092);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32093);final float[] array1 = new float[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32094);array1[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32095);array1[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32096);final float[] array2 = new float[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32097);array2[0] = 5;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32098);array2[1] = 6;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32099);final Object obj1 = array1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32100);final Object obj2 = array2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32101);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32102);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32103);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32104);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32105);array1[1] = 7;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32106);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testBooleanArrayHiddenByObject() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),32107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zg9jjqorv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testBooleanArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32107,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zg9jjqorv(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32107);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32108);final boolean[] array1 = new boolean[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32109);array1[0] = true;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32110);array1[1] = false;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32111);final boolean[] array2 = new boolean[2];
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32112);array2[0] = true;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32113);array2[1] = false;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32114);final Object obj1 = array1;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32115);final Object obj2 = array2;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32116);assertTrue(new EqualsBuilder().append(obj1, obj1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32117);assertTrue(new EqualsBuilder().append(obj1, array1).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32118);assertTrue(new EqualsBuilder().append(obj1, obj2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32119);assertTrue(new EqualsBuilder().append(obj1, array2).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32120);array1[1] = true;
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32121);assertTrue(!new EqualsBuilder().append(obj1, obj2).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    
    public static class TestACanEqualB {
        private final int a;

        public TestACanEqualB(final int a) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32122);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32123);this.a = a;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32124);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32125);if ((((o == this)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(32126)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(32127)==0&false))) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(32128);return true;
            }
            }__CLR4_1_2o9ko9kl3lqxubb.R.inc(32129);if ((((o instanceof TestACanEqualB)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(32130)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(32131)==0&false))) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(32132);return this.a == ((TestACanEqualB) o).getA();
            }
            }__CLR4_1_2o9ko9kl3lqxubb.R.inc(32133);if ((((o instanceof TestBCanEqualA)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(32134)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(32135)==0&false))) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(32136);return this.a == ((TestBCanEqualA) o).getB();
            }
            }__CLR4_1_2o9ko9kl3lqxubb.R.inc(32137);return false;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32138);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32139);return a;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        public int getA() {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32140);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32141);return this.a;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    }

    public static class TestBCanEqualA {
        private final int b;

        public TestBCanEqualA(final int b) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32142);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32143);this.b = b;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32144);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32145);if ((((o == this)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(32146)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(32147)==0&false))) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(32148);return true;
            }
            }__CLR4_1_2o9ko9kl3lqxubb.R.inc(32149);if ((((o instanceof TestACanEqualB)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(32150)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(32151)==0&false))) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(32152);return this.b == ((TestACanEqualB) o).getA();
            }
            }__CLR4_1_2o9ko9kl3lqxubb.R.inc(32153);if ((((o instanceof TestBCanEqualA)&&(__CLR4_1_2o9ko9kl3lqxubb.R.iget(32154)!=0|true))||(__CLR4_1_2o9ko9kl3lqxubb.R.iget(32155)==0&false))) {{
                __CLR4_1_2o9ko9kl3lqxubb.R.inc(32156);return this.b == ((TestBCanEqualA) o).getB();
            }
            }__CLR4_1_2o9ko9kl3lqxubb.R.inc(32157);return false;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32158);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32159);return b;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        public int getB() {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32160);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32161);return this.b;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    }
    
    /**
     * Tests two instances of classes that can be equal and that are not "related". The two classes are not subclasses
     * of each other and do not share a parent aside from Object.
     * See http://issues.apache.org/bugzilla/show_bug.cgi?id=33069
     */
    @Test
    public void testUnrelatedClasses() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),32162);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pb7ywjote();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testUnrelatedClasses",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32162,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pb7ywjote(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32162);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32163);final Object[] x = new Object[]{new TestACanEqualB(1)};
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32164);final Object[] y = new Object[]{new TestBCanEqualA(1)};

        // sanity checks:
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32165);assertTrue(Arrays.equals(x, x));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32166);assertTrue(Arrays.equals(y, y));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32167);assertTrue(Arrays.equals(x, y));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32168);assertTrue(Arrays.equals(y, x));
        // real tests:
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32169);assertTrue(x[0].equals(x[0]));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32170);assertTrue(y[0].equals(y[0]));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32171);assertTrue(x[0].equals(y[0]));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32172);assertTrue(y[0].equals(x[0]));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32173);assertTrue(new EqualsBuilder().append(x, x).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32174);assertTrue(new EqualsBuilder().append(y, y).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32175);assertTrue(new EqualsBuilder().append(x, y).isEquals());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32176);assertTrue(new EqualsBuilder().append(y, x).isEquals());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    
    /**
     * Test from http://issues.apache.org/bugzilla/show_bug.cgi?id=33067
     */
    @Test
    public void testNpeForNullElement() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),32177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fgbl7gott();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testNpeForNullElement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32177,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fgbl7gott(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32177);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32178);final Object[] x1 = new Object[] { Integer.valueOf(1), null, Integer.valueOf(3) };
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32179);final Object[] x2 = new Object[] { Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3) };

        // causes an NPE in 2.0 according to:
        // http://issues.apache.org/bugzilla/show_bug.cgi?id=33067
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32180);new EqualsBuilder().append(x1, x2);
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    @Test
    public void testReflectionEqualsExcludeFields() throws Exception {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),32181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m0tny6otx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testReflectionEqualsExcludeFields",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32181,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m0tny6otx() throws Exception{try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32181);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32182);final TestObjectWithMultipleFields x1 = new TestObjectWithMultipleFields(1, 2, 3);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32183);final TestObjectWithMultipleFields x2 = new TestObjectWithMultipleFields(1, 3, 4);

        // not equal when including all fields
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32184);assertTrue(!EqualsBuilder.reflectionEquals(x1, x2));

        // doesn't barf on null, empty array, or non-existent field, but still tests as not equal
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32185);assertTrue(!EqualsBuilder.reflectionEquals(x1, x2, (String[]) null));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32186);assertTrue(!EqualsBuilder.reflectionEquals(x1, x2, new String[] {}));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32187);assertTrue(!EqualsBuilder.reflectionEquals(x1, x2, new String[] {"xxx"}));

        // not equal if only one of the differing fields excluded
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32188);assertTrue(!EqualsBuilder.reflectionEquals(x1, x2, new String[] {"two"}));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32189);assertTrue(!EqualsBuilder.reflectionEquals(x1, x2, new String[] {"three"}));

        // equal if both differing fields excluded
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32190);assertTrue(EqualsBuilder.reflectionEquals(x1, x2, new String[] {"two", "three"}));

        // still equal as long as both differing fields are among excluded
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32191);assertTrue(EqualsBuilder.reflectionEquals(x1, x2, new String[] {"one", "two", "three"}));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32192);assertTrue(EqualsBuilder.reflectionEquals(x1, x2, new String[] {"one", "two", "three", "xxx"}));
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    static class TestObjectWithMultipleFields {
        @SuppressWarnings("unused")
        private final TestObject one;
        @SuppressWarnings("unused")
        private final TestObject two;
        @SuppressWarnings("unused")
        private final TestObject three;

        public TestObjectWithMultipleFields(final int one, final int two, final int three) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32193);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32194);this.one = new TestObject(one);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32195);this.two = new TestObject(two);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32196);this.three = new TestObject(three);
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    }
    
    /**
     * Test cyclical object references which cause a StackOverflowException if
     * not handled properly. s. LANG-606
     */
    @Test
    public void testCyclicalObjectReferences() {__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceStart(getClass().getName(),32197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hbrvzwoud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o9ko9kl3lqxubb.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o9ko9kl3lqxubb.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.EqualsBuilderTest.testCyclicalObjectReferences",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32197,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hbrvzwoud(){try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32197);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32198);final TestObjectReference refX1 = new TestObjectReference(1);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32199);final TestObjectReference x1 = new TestObjectReference(1);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32200);x1.setObjectReference(refX1);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32201);refX1.setObjectReference(x1);

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32202);final TestObjectReference refX2 = new TestObjectReference(1);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32203);final TestObjectReference x2 = new TestObjectReference(1);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32204);x2.setObjectReference(refX2);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32205);refX2.setObjectReference(x2);

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32206);final TestObjectReference refX3 = new TestObjectReference(2);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32207);final TestObjectReference x3 = new TestObjectReference(2);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32208);x3.setObjectReference(refX3);
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32209);refX3.setObjectReference(x3);

        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32210);assertTrue(x1.equals(x2));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32211);assertNull(EqualsBuilder.getRegistry());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32212);assertFalse(x1.equals(x3));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32213);assertNull(EqualsBuilder.getRegistry());
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32214);assertFalse(x2.equals(x3));
        __CLR4_1_2o9ko9kl3lqxubb.R.inc(32215);assertNull(EqualsBuilder.getRegistry());
    }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

    static class TestObjectReference {
        @SuppressWarnings("unused")
        private TestObjectReference reference;
        @SuppressWarnings("unused")
        private final TestObject one;

        public TestObjectReference(final int one) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32216);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32217);this.one = new TestObject(one);
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        public void setObjectReference(final TestObjectReference reference) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32218);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32219);this.reference = reference;
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}

        @Override
        public boolean equals(final Object obj) {try{__CLR4_1_2o9ko9kl3lqxubb.R.inc(32220);
            __CLR4_1_2o9ko9kl3lqxubb.R.inc(32221);return EqualsBuilder.reflectionEquals(this, obj);
        }finally{__CLR4_1_2o9ko9kl3lqxubb.R.flushNeeded();}}
    }
}

