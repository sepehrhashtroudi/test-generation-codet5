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
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.CompareToBuilder}.
 *
 * @version $Id$
 */
public class CompareToBuilderTest {static class __CLR4_1_2njcnjcl3lqxu8j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,31389,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------

    static class TestObject implements Comparable<TestObject> {
        private int a;
        public TestObject(final int a) {try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30504);
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30505);this.a = a;
        }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30506);
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30507);if ((((o == this)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30508)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30509)==0&false))) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(30510);return true;
            }
            }__CLR4_1_2njcnjcl3lqxu8j.R.inc(30511);if ((((!(o instanceof TestObject))&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30512)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30513)==0&false))) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(30514);return false;
            }
            }__CLR4_1_2njcnjcl3lqxu8j.R.inc(30515);final TestObject rhs = (TestObject) o;
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30516);return a == rhs.a;
        }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30517);
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30518);return a;
        }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

        public void setA(final int a) {try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30519);
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30520);this.a = a;
        }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

        public int getA() {try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30521);
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30522);return a;
        }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
        @Override
        public int compareTo(final TestObject rhs) {try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30523);
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30524);return (((a < rhs.a )&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30525)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30526)==0&false))? -1 : (((a > rhs.a )&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30527)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30528)==0&false))? +1 : 0;
        }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
    }

    static class TestSubObject extends TestObject {
        private int b;
        public TestSubObject() {
            super(0);__CLR4_1_2njcnjcl3lqxu8j.R.inc(30530);try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30529);
        }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
        public TestSubObject(final int a, final int b) {
            super(a);__CLR4_1_2njcnjcl3lqxu8j.R.inc(30532);try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30531);
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30533);this.b = b;
        }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
        @Override
        public boolean equals(final Object o) {try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30534);
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30535);if ((((o == this)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30536)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30537)==0&false))) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(30538);return true;
            }
            }__CLR4_1_2njcnjcl3lqxu8j.R.inc(30539);if ((((!(o instanceof TestSubObject))&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30540)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30541)==0&false))) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(30542);return false;
            }
            }__CLR4_1_2njcnjcl3lqxu8j.R.inc(30543);final TestSubObject rhs = (TestSubObject) o;
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30544);return super.equals(o) && b == rhs.b;
        }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
    }

    static class TestTransientSubObject extends TestObject {
        @SuppressWarnings("unused")
        private transient int t;
        public TestTransientSubObject(final int a, final int t) {
            super(a);__CLR4_1_2njcnjcl3lqxu8j.R.inc(30546);try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30545);
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30547);this.t = t;
        }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
    }
    
    @Test
    public void testReflectionCompare() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k5t1ptnkk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompare",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30548,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k5t1ptnkk(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30548);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30549);final TestObject o1 = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30550);final TestObject o2 = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30551);assertTrue(CompareToBuilder.reflectionCompare(o1, o1) == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30552);assertTrue(CompareToBuilder.reflectionCompare(o1, o2) == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30553);o2.setA(5);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30554);assertTrue(CompareToBuilder.reflectionCompare(o1, o2) < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30555);assertTrue(CompareToBuilder.reflectionCompare(o2, o1) > 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testReflectionCompareEx1() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30556);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22uvqm5nks();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,67,111,109,112,97,114,101,69,120,49,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30556,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22uvqm5nks(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30556);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30557);final TestObject o1 = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30558);CompareToBuilder.reflectionCompare(o1, null);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test(expected=ClassCastException.class)
    public void testReflectionCompareEx2() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_263vpemnkv();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,67,111,109,112,97,114,101,69,120,50,58,32,91,67,108,97,115,115,67,97,115,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ClassCastException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionCompareEx2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30559,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_263vpemnkv(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30559);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30560);final TestObject o1 = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30561);final Object o2 = new Object();
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30562);CompareToBuilder.reflectionCompare(o1, o2);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testReflectionHierarchyCompare() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ps4jccnkz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompare",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30563,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ps4jccnkz(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30563);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30564);testReflectionHierarchyCompare(false, null);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
    
    @Test
    public void testReflectionHierarchyCompareExcludeFields() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2svd703nl1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareExcludeFields",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30565,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2svd703nl1(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30565);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30566);final String[] excludeFields = new String[] { "b" };
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30567);testReflectionHierarchyCompare(true, excludeFields);
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30568);TestSubObject x;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30569);TestSubObject y;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30570);TestSubObject z;
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30571);x = new TestSubObject(1, 1);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30572);y = new TestSubObject(2, 1);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30573);z = new TestSubObject(3, 1);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30574);assertXYZCompareOrder(x, y, z, true, excludeFields);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30575);x = new TestSubObject(1, 3);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30576);y = new TestSubObject(2, 2);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30577);z = new TestSubObject(3, 1);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30578);assertXYZCompareOrder(x, y, z, true, excludeFields);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
    
    @Test
    public void testReflectionHierarchyCompareTransients() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d0ek8tnlf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testReflectionHierarchyCompareTransients",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30579,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d0ek8tnlf(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30579);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30580);testReflectionHierarchyCompare(true, null);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30581);TestTransientSubObject x;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30582);TestTransientSubObject y;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30583);TestTransientSubObject z;

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30584);x = new TestTransientSubObject(1, 1);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30585);y = new TestTransientSubObject(2, 2);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30586);z = new TestTransientSubObject(3, 3);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30587);assertXYZCompareOrder(x, y, z, true, null);
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30588);x = new TestTransientSubObject(1, 1);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30589);y = new TestTransientSubObject(1, 2);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30590);z = new TestTransientSubObject(1, 3);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30591);assertXYZCompareOrder(x, y, z, true, null);  
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
    
    private void assertXYZCompareOrder(final Object x, final Object y, final Object z, final boolean testTransients, final String[] excludeFields) {try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30592);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30593);assertTrue(0 == CompareToBuilder.reflectionCompare(x, x, testTransients, null, excludeFields));
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30594);assertTrue(0 == CompareToBuilder.reflectionCompare(y, y, testTransients, null, excludeFields));
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30595);assertTrue(0 == CompareToBuilder.reflectionCompare(z, z, testTransients, null, excludeFields));
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30596);assertTrue(0 > CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields));
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30597);assertTrue(0 > CompareToBuilder.reflectionCompare(x, z, testTransients, null, excludeFields));
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30598);assertTrue(0 > CompareToBuilder.reflectionCompare(y, z, testTransients, null, excludeFields));
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30599);assertTrue(0 < CompareToBuilder.reflectionCompare(y, x, testTransients, null, excludeFields));
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30600);assertTrue(0 < CompareToBuilder.reflectionCompare(z, x, testTransients, null, excludeFields));
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30601);assertTrue(0 < CompareToBuilder.reflectionCompare(z, y, testTransients, null, excludeFields));
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
    
    private void testReflectionHierarchyCompare(final boolean testTransients, final String[] excludeFields) {try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30602);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30603);final TestObject to1 = new TestObject(1);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30604);final TestObject to2 = new TestObject(2);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30605);final TestObject to3 = new TestObject(3);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30606);final TestSubObject tso1 = new TestSubObject(1, 1);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30607);final TestSubObject tso2 = new TestSubObject(2, 2);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30608);final TestSubObject tso3 = new TestSubObject(3, 3);
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30609);assertReflectionCompareContract(to1, to1, to1, false, excludeFields);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30610);assertReflectionCompareContract(to1, to2, to3, false, excludeFields);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30611);assertReflectionCompareContract(tso1, tso1, tso1, false, excludeFields);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30612);assertReflectionCompareContract(tso1, tso2, tso3, false, excludeFields);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30613);assertReflectionCompareContract("1", "2", "3", false, excludeFields);
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30614);assertTrue(0 != CompareToBuilder.reflectionCompare(tso1, new TestSubObject(1, 0), testTransients));
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30615);assertTrue(0 != CompareToBuilder.reflectionCompare(tso1, new TestSubObject(0, 1), testTransients));

        // root class
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30616);assertXYZCompareOrder(to1, to2, to3, true, null);
        // subclass  
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30617);assertXYZCompareOrder(tso1, tso2, tso3, true, null);  
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    /**
     * See "Effective Java" under "Consider Implementing Comparable".
     *  
     * @param x an object to compare 
     * @param y an object to compare
     * @param z an object to compare
     * @param testTransients Whether to include transients in the comparison
     * @param excludeFields fields to exclude
     */
    private void assertReflectionCompareContract(final Object x, final Object y, final Object z, final boolean testTransients, final String[] excludeFields) {try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30618);

        // signum
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30619);assertTrue(reflectionCompareSignum(x, y, testTransients, excludeFields) == -reflectionCompareSignum(y, x, testTransients, excludeFields));
        
        // transitive
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30620);if ((((CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields) > 0 
                && CompareToBuilder.reflectionCompare(y, z, testTransients, null, excludeFields) > 0)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30621)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30622)==0&false))){{
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30623);assertTrue(CompareToBuilder.reflectionCompare(x, z, testTransients, null, excludeFields) > 0);
        }
        
        // un-named
        }__CLR4_1_2njcnjcl3lqxu8j.R.inc(30624);if ((((CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields) == 0)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30625)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30626)==0&false))) {{
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30627);assertTrue(reflectionCompareSignum(x, z, testTransients, excludeFields) == -reflectionCompareSignum(y, z, testTransients, excludeFields));
        }
        
        // strongly recommended but not strictly required
        }__CLR4_1_2njcnjcl3lqxu8j.R.inc(30628);assertTrue(CompareToBuilder.reflectionCompare(x, y, testTransients) ==0 == EqualsBuilder.reflectionEquals(x, y, testTransients));
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
    
    /**
     * Returns the signum of the result of comparing x and y with
     * <code>CompareToBuilder.reflectionCompare</code>
     * 
     * @param lhs The "left-hand-side" of the comparison.
     * @param rhs The "right-hand-side" of the comparison.
     * @param testTransients Whether to include transients in the comparison
     * @param excludeFields fields to exclude
     * @return int The signum
     */
    private int reflectionCompareSignum(final Object lhs, final Object rhs, final boolean testTransients, final String[] excludeFields) {try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30629);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30630);return BigInteger.valueOf(CompareToBuilder.reflectionCompare(lhs, rhs, testTransients)).signum();
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
    
    @Test
    public void testAppendSuper() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cvyfiinmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testAppendSuper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30631,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cvyfiinmv(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30631);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30632);final TestObject o1 = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30633);final TestObject o2 = new TestObject(5);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30634);assertTrue(new CompareToBuilder().appendSuper(0).append(o1, o1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30635);assertTrue(new CompareToBuilder().appendSuper(0).append(o1, o2).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30636);assertTrue(new CompareToBuilder().appendSuper(0).append(o2, o1).toComparison() > 0);
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30637);assertTrue(new CompareToBuilder().appendSuper(-1).append(o1, o1).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30638);assertTrue(new CompareToBuilder().appendSuper(-1).append(o1, o2).toComparison() < 0);
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30639);assertTrue(new CompareToBuilder().appendSuper(1).append(o1, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30640);assertTrue(new CompareToBuilder().appendSuper(1).append(o1, o2).toComparison() > 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iogga0nn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30641,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iogga0nn5(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30641);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30642);final TestObject o1 = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30643);final TestObject o2 = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30644);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30645);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30646);o2.setA(5);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30647);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30648);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30649);assertTrue(new CompareToBuilder().append(o1, null).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30650);assertTrue(new CompareToBuilder().append((Object) null, (Object) null).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30651);assertTrue(new CompareToBuilder().append(null, o1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
    
    @Test
    public void testObjectBuild() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tvdhb0nng();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectBuild",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30652,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tvdhb0nng(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30652);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30653);final TestObject o1 = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30654);final TestObject o2 = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30655);assertEquals(Integer.valueOf(0), new CompareToBuilder().append(o1, o1).build());
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30656);assertEquals(Integer.valueOf(0), new CompareToBuilder().append(o1, o2).build());
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30657);o2.setA(5);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30658);assertTrue(new CompareToBuilder().append(o1, o2).build().intValue() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30659);assertTrue(new CompareToBuilder().append(o2, o1).build().intValue() > 0);
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30660);assertTrue(new CompareToBuilder().append(o1, null).build().intValue() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30661);assertEquals(Integer.valueOf(0), new CompareToBuilder().append((Object) null, (Object) null).build());
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30662);assertTrue(new CompareToBuilder().append(null, o1).build().intValue() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test(expected=ClassCastException.class)
    public void testObjectEx2() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qm10p7nnr();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,79,98,106,101,99,116,69,120,50,58,32,91,67,108,97,115,115,67,97,115,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ClassCastException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectEx2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30663,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qm10p7nnr(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30663);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30664);final TestObject o1 = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30665);final Object o2 = new Object();
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30666);new CompareToBuilder().append(o1, o2);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testObjectComparator() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30667);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24ni45qnnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparator",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30667,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24ni45qnnv(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30667);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30668);final String o1 = "Fred";
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30669);String o2 = "Fred";
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30670);assertTrue(new CompareToBuilder().append(o1, o1, String.CASE_INSENSITIVE_ORDER).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30671);assertTrue(new CompareToBuilder().append(o1, o2, String.CASE_INSENSITIVE_ORDER).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30672);o2 = "FRED";
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30673);assertTrue(new CompareToBuilder().append(o1, o2, String.CASE_INSENSITIVE_ORDER).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30674);assertTrue(new CompareToBuilder().append(o2, o1, String.CASE_INSENSITIVE_ORDER).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30675);o2 = "FREDA";
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30676);assertTrue(new CompareToBuilder().append(o1, o2, String.CASE_INSENSITIVE_ORDER).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30677);assertTrue(new CompareToBuilder().append(o2, o1, String.CASE_INSENSITIVE_ORDER).toComparison() > 0);
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30678);assertTrue(new CompareToBuilder().append(o1, null, String.CASE_INSENSITIVE_ORDER).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30679);assertTrue(new CompareToBuilder().append((Object) null, (Object) null, String.CASE_INSENSITIVE_ORDER).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30680);assertTrue(new CompareToBuilder().append(null, o1, String.CASE_INSENSITIVE_ORDER).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
    
    @Test
    public void testObjectComparatorNull() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ijcborno9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectComparatorNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30681,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ijcborno9(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30681);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30682);final String o1 = "Fred";
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30683);String o2 = "Fred";
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30684);assertTrue(new CompareToBuilder().append(o1, o1, null).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30685);assertTrue(new CompareToBuilder().append(o1, o2, null).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30686);o2 = "Zebra";
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30687);assertTrue(new CompareToBuilder().append(o1, o2, null).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30688);assertTrue(new CompareToBuilder().append(o2, o1, null).toComparison() > 0);
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30689);assertTrue(new CompareToBuilder().append(o1, null, null).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30690);assertTrue(new CompareToBuilder().append((Object) null, (Object) null, null).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30691);assertTrue(new CompareToBuilder().append(null, o1, null).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xsq9mznok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30692,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xsq9mznok(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30692);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30693);final long o1 = 1L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30694);final long o2 = 2L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30695);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30696);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30697);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30698);assertTrue(new CompareToBuilder().append(o1, Long.MAX_VALUE).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30699);assertTrue(new CompareToBuilder().append(Long.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30700);assertTrue(new CompareToBuilder().append(o1, Long.MIN_VALUE).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30701);assertTrue(new CompareToBuilder().append(Long.MIN_VALUE, o1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testInt() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30702);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28s3xd0nou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30702,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28s3xd0nou(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30702);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30703);final int o1 = 1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30704);final int o2 = 2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30705);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30706);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30707);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30708);assertTrue(new CompareToBuilder().append(o1, Integer.MAX_VALUE).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30709);assertTrue(new CompareToBuilder().append(Integer.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30710);assertTrue(new CompareToBuilder().append(o1, Integer.MIN_VALUE).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30711);assertTrue(new CompareToBuilder().append(Integer.MIN_VALUE, o1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testShort() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2exs2r3np4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30712,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2exs2r3np4(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30712);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30713);final short o1 = 1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30714);final short o2 = 2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30715);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30716);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30717);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30718);assertTrue(new CompareToBuilder().append(o1, Short.MAX_VALUE).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30719);assertTrue(new CompareToBuilder().append(Short.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30720);assertTrue(new CompareToBuilder().append(o1, Short.MIN_VALUE).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30721);assertTrue(new CompareToBuilder().append(Short.MIN_VALUE, o1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testChar() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d2kz0vnpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30722,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d2kz0vnpe(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30722);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30723);final char o1 = 1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30724);final char o2 = 2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30725);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30726);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30727);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30728);assertTrue(new CompareToBuilder().append(o1, Character.MAX_VALUE).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30729);assertTrue(new CompareToBuilder().append(Character.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30730);assertTrue(new CompareToBuilder().append(o1, Character.MIN_VALUE).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30731);assertTrue(new CompareToBuilder().append(Character.MIN_VALUE, o1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testByte() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30732);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22w26nznpo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30732,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22w26nznpo(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30732);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30733);final byte o1 = 1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30734);final byte o2 = 2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30735);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30736);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30737);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30738);assertTrue(new CompareToBuilder().append(o1, Byte.MAX_VALUE).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30739);assertTrue(new CompareToBuilder().append(Byte.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30740);assertTrue(new CompareToBuilder().append(o1, Byte.MIN_VALUE).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30741);assertTrue(new CompareToBuilder().append(Byte.MIN_VALUE, o1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testDouble() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23hfze2npy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30742,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23hfze2npy(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30742);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30743);final double o1 = 1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30744);final double o2 = 2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30745);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30746);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30747);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30748);assertTrue(new CompareToBuilder().append(o1, Double.MAX_VALUE).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30749);assertTrue(new CompareToBuilder().append(Double.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30750);assertTrue(new CompareToBuilder().append(o1, Double.MIN_VALUE).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30751);assertTrue(new CompareToBuilder().append(Double.MIN_VALUE, o1).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30752);assertTrue(new CompareToBuilder().append(Double.NaN, Double.NaN).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30753);assertTrue(new CompareToBuilder().append(Double.NaN, Double.MAX_VALUE).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30754);assertTrue(new CompareToBuilder().append(Double.POSITIVE_INFINITY, Double.MAX_VALUE).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30755);assertTrue(new CompareToBuilder().append(Double.NEGATIVE_INFINITY, Double.MIN_VALUE).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30756);assertTrue(new CompareToBuilder().append(o1, Double.NaN).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30757);assertTrue(new CompareToBuilder().append(Double.NaN, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30758);assertTrue(new CompareToBuilder().append(-0.0, 0.0).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30759);assertTrue(new CompareToBuilder().append(0.0, -0.0).toComparison() > 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testFloat() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tuf8q9nqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30760,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tuf8q9nqg(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30760);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30761);final float o1 = 1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30762);final float o2 = 2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30763);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30764);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30765);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30766);assertTrue(new CompareToBuilder().append(o1, Float.MAX_VALUE).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30767);assertTrue(new CompareToBuilder().append(Float.MAX_VALUE, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30768);assertTrue(new CompareToBuilder().append(o1, Float.MIN_VALUE).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30769);assertTrue(new CompareToBuilder().append(Float.MIN_VALUE, o1).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30770);assertTrue(new CompareToBuilder().append(Float.NaN, Float.NaN).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30771);assertTrue(new CompareToBuilder().append(Float.NaN, Float.MAX_VALUE).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30772);assertTrue(new CompareToBuilder().append(Float.POSITIVE_INFINITY, Float.MAX_VALUE).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30773);assertTrue(new CompareToBuilder().append(Float.NEGATIVE_INFINITY, Float.MIN_VALUE).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30774);assertTrue(new CompareToBuilder().append(o1, Float.NaN).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30775);assertTrue(new CompareToBuilder().append(Float.NaN, o1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30776);assertTrue(new CompareToBuilder().append(-0.0, 0.0).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30777);assertTrue(new CompareToBuilder().append(0.0, -0.0).toComparison() > 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testBoolean() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a9awn1nqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30778,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a9awn1nqy(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30778);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30779);final boolean o1 = true;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30780);final boolean o2 = false;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30781);assertTrue(new CompareToBuilder().append(o1, o1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30782);assertTrue(new CompareToBuilder().append(o2, o2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30783);assertTrue(new CompareToBuilder().append(o1, o2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30784);assertTrue(new CompareToBuilder().append(o2, o1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30785);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oi04a7nr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30785,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oi04a7nr5(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30785);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30786);final TestObject[] obj1 = new TestObject[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30787);obj1[0] = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30788);obj1[1] = new TestObject(5);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30789);final TestObject[] obj2 = new TestObject[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30790);obj2[0] = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30791);obj2[1] = new TestObject(5);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30792);final TestObject[] obj3 = new TestObject[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30793);obj3[0] = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30794);obj3[1] = new TestObject(5);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30795);obj3[2] = new TestObject(6);
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30796);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30797);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30798);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30799);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30800);obj1[1] = new TestObject(7);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30801);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30802);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30803);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30804);assertTrue(new CompareToBuilder().append((Object[]) null, (Object[]) null).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30805);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2if58i6nrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30806,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2if58i6nrq(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30806);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30807);final long[] obj1 = new long[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30808);obj1[0] = 5L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30809);obj1[1] = 6L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30810);final long[] obj2 = new long[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30811);obj2[0] = 5L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30812);obj2[1] = 6L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30813);final long[] obj3 = new long[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30814);obj3[0] = 5L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30815);obj3[1] = 6L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30816);obj3[2] = 7L;
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30817);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30818);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30819);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30820);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30821);obj1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30822);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30823);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30824);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30825);assertTrue(new CompareToBuilder().append((long[]) null, (long[]) null).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30826);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testIntArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28w0so3nsb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30827,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28w0so3nsb(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30827);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30828);final int[] obj1 = new int[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30829);obj1[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30830);obj1[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30831);final int[] obj2 = new int[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30832);obj2[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30833);obj2[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30834);final int[] obj3 = new int[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30835);obj3[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30836);obj3[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30837);obj3[2] = 7;

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30838);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30839);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30840);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30841);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30842);obj1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30843);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30844);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30845);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30846);assertTrue(new CompareToBuilder().append((int[]) null, (int[]) null).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30847);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testShortArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nqn45ynsw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30848,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nqn45ynsw(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30848);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30849);final short[] obj1 = new short[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30850);obj1[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30851);obj1[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30852);final short[] obj2 = new short[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30853);obj2[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30854);obj2[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30855);final short[] obj3 = new short[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30856);obj3[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30857);obj3[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30858);obj3[2] = 7;

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30859);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30860);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30861);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30862);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30863);obj1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30864);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30865);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30866);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30867);assertTrue(new CompareToBuilder().append((short[]) null, (short[]) null).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30868);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testCharArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w0bza0nth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30869,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w0bza0nth(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30869);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30870);final char[] obj1 = new char[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30871);obj1[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30872);obj1[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30873);final char[] obj2 = new char[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30874);obj2[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30875);obj2[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30876);final char[] obj3 = new char[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30877);obj3[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30878);obj3[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30879);obj3[2] = 7;

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30880);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30881);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30882);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30883);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30884);obj1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30885);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30886);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30887);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30888);assertTrue(new CompareToBuilder().append((char[]) null, (char[]) null).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30889);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testByteArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mhe7kqnu2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30890,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mhe7kqnu2(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30890);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30891);final byte[] obj1 = new byte[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30892);obj1[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30893);obj1[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30894);final byte[] obj2 = new byte[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30895);obj2[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30896);obj2[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30897);final byte[] obj3 = new byte[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30898);obj3[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30899);obj3[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30900);obj3[2] = 7;

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30901);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30902);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30903);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30904);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30905);obj1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30906);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30907);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30908);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30909);assertTrue(new CompareToBuilder().append((byte[]) null, (byte[]) null).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30910);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testDoubleArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m6ks4jnun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30911,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m6ks4jnun(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30911);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30912);final double[] obj1 = new double[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30913);obj1[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30914);obj1[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30915);final double[] obj2 = new double[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30916);obj2[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30917);obj2[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30918);final double[] obj3 = new double[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30919);obj3[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30920);obj3[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30921);obj3[2] = 7;

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30922);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30923);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30924);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30925);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30926);obj1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30927);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30928);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30929);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30930);assertTrue(new CompareToBuilder().append((double[]) null, (double[]) null).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30931);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testFloatArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2maw6iynv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30932,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2maw6iynv8(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30932);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30933);final float[] obj1 = new float[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30934);obj1[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30935);obj1[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30936);final float[] obj2 = new float[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30937);obj2[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30938);obj2[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30939);final float[] obj3 = new float[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30940);obj3[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30941);obj3[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30942);obj3[2] = 7;

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30943);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30944);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30945);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30946);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30947);obj1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30948);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30949);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30950);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30951);assertTrue(new CompareToBuilder().append((float[]) null, (float[]) null).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30952);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testBooleanArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21rzd0qnvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30953,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21rzd0qnvt(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30953);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30954);final boolean[] obj1 = new boolean[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30955);obj1[0] = true;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30956);obj1[1] = false;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30957);final boolean[] obj2 = new boolean[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30958);obj2[0] = true;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30959);obj2[1] = false;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30960);final boolean[] obj3 = new boolean[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30961);obj3[0] = true;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30962);obj3[1] = false;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30963);obj3[2] = true;

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30964);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30965);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30966);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30967);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30968);obj1[1] = true;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30969);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30970);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30971);assertTrue(new CompareToBuilder().append(obj1, null).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30972);assertTrue(new CompareToBuilder().append((boolean[]) null, (boolean[]) null).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30973);assertTrue(new CompareToBuilder().append(null, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testMultiLongArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2f7d7lpnwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30974,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2f7d7lpnwe(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30974);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30975);final long[][] array1 = new long[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30976);final long[][] array2 = new long[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30977);final long[][] array3 = new long[2][3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30978);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30979)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30980)==0&false)); ++i) {{
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(30981);for (int j = 0; (((j < array1[0].length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30982)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(30983)==0&false)); j++) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(30984);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(30985);array2[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(30986);array3[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_1_2njcnjcl3lqxu8j.R.inc(30987);array3[1][2] = 100;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30988);array3[1][2] = 100;
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30989);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30990);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30991);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30992);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30993);array1[1][1] = 200;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30994);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30995);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testMultiIntArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),30996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27ol03cnx0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiIntArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30996,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27ol03cnx0(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(30996);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30997);final int[][] array1 = new int[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30998);final int[][] array2 = new int[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(30999);final int[][] array3 = new int[2][3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31000);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31001)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31002)==0&false)); ++i) {{
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31003);for (int j = 0; (((j < array1[0].length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31004)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31005)==0&false)); j++) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31006);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31007);array2[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31008);array3[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_1_2njcnjcl3lqxu8j.R.inc(31009);array3[1][2] = 100;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31010);array3[1][2] = 100;
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31011);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31012);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31013);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31014);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31015);array1[1][1] = 200;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31016);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31017);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testMultiShortArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nu5uznxm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31018,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nu5uznxm(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31018);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31019);final short[][] array1 = new short[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31020);final short[][] array2 = new short[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31021);final short[][] array3 = new short[2][3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31022);for (short i = 0; (((i < array1.length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31023)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31024)==0&false)); ++i) {{
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31025);for (short j = 0; (((j < array1[0].length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31026)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31027)==0&false)); j++) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31028);array1[i][j] = (short)((i + 1) * (j + 1));
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31029);array2[i][j] = (short)((i + 1) * (j + 1));
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31030);array3[i][j] = (short)((i + 1) * (j + 1));
            }
        }}
        }__CLR4_1_2njcnjcl3lqxu8j.R.inc(31031);array3[1][2] = 100;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31032);array3[1][2] = 100;
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31033);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31034);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31035);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31036);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31037);array1[1][1] = 200;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31038);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31039);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testMultiCharArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25e9ml9ny8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31040,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25e9ml9ny8(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31040);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31041);final char[][] array1 = new char[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31042);final char[][] array2 = new char[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31043);final char[][] array3 = new char[2][3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31044);for (short i = 0; (((i < array1.length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31045)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31046)==0&false)); ++i) {{
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31047);for (short j = 0; (((j < array1[0].length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31048)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31049)==0&false)); j++) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31050);array1[i][j] = (char)((i + 1) * (j + 1));
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31051);array2[i][j] = (char)((i + 1) * (j + 1));
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31052);array3[i][j] = (char)((i + 1) * (j + 1));
            }
        }}
        }__CLR4_1_2njcnjcl3lqxu8j.R.inc(31053);array3[1][2] = 100;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31054);array3[1][2] = 100;
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31055);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31056);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31057);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31058);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31059);array1[1][1] = 200;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31060);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31061);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testMultiByteArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b548j5nyu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31062,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b548j5nyu(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31062);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31063);final byte[][] array1 = new byte[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31064);final byte[][] array2 = new byte[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31065);final byte[][] array3 = new byte[2][3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31066);for (byte i = 0; (((i < array1.length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31067)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31068)==0&false)); ++i) {{
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31069);for (byte j = 0; (((j < array1[0].length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31070)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31071)==0&false)); j++) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31072);array1[i][j] = (byte)((i + 1) * (j + 1));
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31073);array2[i][j] = (byte)((i + 1) * (j + 1));
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31074);array3[i][j] = (byte)((i + 1) * (j + 1));
            }
        }}
        }__CLR4_1_2njcnjcl3lqxu8j.R.inc(31075);array3[1][2] = 100;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31076);array3[1][2] = 100;
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31077);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31078);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31079);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31080);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31081);array1[1][1] = 127;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31082);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31083);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
    
    @Test
    public void testMultiFloatArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pnex57nzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiFloatArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31084,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pnex57nzg(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31084);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31085);final float[][] array1 = new float[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31086);final float[][] array2 = new float[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31087);final float[][] array3 = new float[2][3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31088);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31089)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31090)==0&false)); ++i) {{
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31091);for (int j = 0; (((j < array1[0].length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31092)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31093)==0&false)); j++) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31094);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31095);array2[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31096);array3[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_1_2njcnjcl3lqxu8j.R.inc(31097);array3[1][2] = 100;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31098);array3[1][2] = 100;
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31099);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31100);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31101);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31102);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31103);array1[1][1] = 127;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31104);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31105);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testMultiDoubleArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2radrtko02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiDoubleArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31106,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2radrtko02(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31106);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31107);final double[][] array1 = new double[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31108);final double[][] array2 = new double[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31109);final double[][] array3 = new double[2][3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31110);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31111)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31112)==0&false)); ++i) {{
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31113);for (int j = 0; (((j < array1[0].length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31114)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31115)==0&false)); j++) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31116);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31117);array2[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31118);array3[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_1_2njcnjcl3lqxu8j.R.inc(31119);array3[1][2] = 100;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31120);array3[1][2] = 100;
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31121);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31122);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31123);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31124);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31125);array1[1][1] = 127;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31126);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31127);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testMultiBooleanArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2efr9kxo0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMultiBooleanArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31128,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2efr9kxo0o(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31128);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31129);final boolean[][] array1 = new boolean[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31130);final boolean[][] array2 = new boolean[2][2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31131);final boolean[][] array3 = new boolean[2][3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31132);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31133)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31134)==0&false)); ++i) {{
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31135);for (int j = 0; (((j < array1[0].length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31136)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31137)==0&false)); j++) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31138);array1[i][j] = i == 1 ^ j == 1;
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31139);array2[i][j] = i == 1 ^ j == 1;
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31140);array3[i][j] = i == 1 ^ j == 1;
            }
        }}
        }__CLR4_1_2njcnjcl3lqxu8j.R.inc(31141);array3[1][2] = false;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31142);array3[1][2] = false;
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31143);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31144);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31145);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31146);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31147);array1[1][1] = true;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31148);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31149);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testRaggedArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22rmuioo1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testRaggedArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31150,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22rmuioo1a(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31150);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31151);final long array1[][] = new long[2][];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31152);final long array2[][] = new long[2][];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31153);final long array3[][] = new long[3][];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31154);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31155)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31156)==0&false)); ++i) {{
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31157);array1[i] = new long[2];
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31158);array2[i] = new long[2];
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31159);array3[i] = new long[3];
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31160);for (int j = 0; (((j < array1[i].length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31161)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31162)==0&false)); ++j) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31163);array1[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31164);array2[i][j] = (i + 1) * (j + 1);
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31165);array3[i][j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_1_2njcnjcl3lqxu8j.R.inc(31166);array3[1][2] = 100;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31167);array3[1][2] = 100;
        
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31168);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31169);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31170);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31171);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31172);array1[1][1] = 200;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31173);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31174);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testMixedArray() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qvks4po1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testMixedArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31175,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qvks4po1z(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31175);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31176);final Object array1[] = new Object[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31177);final Object array2[] = new Object[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31178);final Object array3[] = new Object[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31179);for (int i = 0; (((i < array1.length)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31180)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31181)==0&false)); ++i) {{
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31182);array1[i] = new long[2];
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31183);array2[i] = new long[2];
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31184);array3[i] = new long[3];
            __CLR4_1_2njcnjcl3lqxu8j.R.inc(31185);for (int j = 0; (((j < 2)&&(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31186)!=0|true))||(__CLR4_1_2njcnjcl3lqxu8j.R.iget(31187)==0&false)); ++j) {{
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31188);((long[]) array1[i])[j] = (i + 1) * (j + 1);
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31189);((long[]) array2[i])[j] = (i + 1) * (j + 1);
                __CLR4_1_2njcnjcl3lqxu8j.R.inc(31190);((long[]) array3[i])[j] = (i + 1) * (j + 1);
            }
        }}
        }__CLR4_1_2njcnjcl3lqxu8j.R.inc(31191);((long[]) array3[0])[2] = 1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31192);((long[]) array3[1])[2] = 1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31193);assertTrue(new CompareToBuilder().append(array1, array1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31194);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31195);assertTrue(new CompareToBuilder().append(array1, array3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31196);assertTrue(new CompareToBuilder().append(array3, array1).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31197);((long[]) array1[1])[1] = 200;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31198);assertTrue(new CompareToBuilder().append(array1, array2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31199);assertTrue(new CompareToBuilder().append(array2, array1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testObjectArrayHiddenByObject() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vcpt73o2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testObjectArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31200,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vcpt73o2o(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31200);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31201);final TestObject[] array1 = new TestObject[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31202);array1[0] = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31203);array1[1] = new TestObject(5);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31204);final TestObject[] array2 = new TestObject[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31205);array2[0] = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31206);array2[1] = new TestObject(5);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31207);final TestObject[] array3 = new TestObject[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31208);array3[0] = new TestObject(4);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31209);array3[1] = new TestObject(5);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31210);array3[2] = new TestObject(6);
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31211);final Object obj1 = array1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31212);final Object obj2 = array2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31213);final Object obj3 = array3;
        
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31214);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31215);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31216);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31217);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31218);array1[1] = new TestObject(7);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31219);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31220);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testLongArrayHiddenByObject() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pwc0mmo39();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testLongArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31221,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pwc0mmo39(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31221);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31222);final long[] array1 = new long[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31223);array1[0] = 5L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31224);array1[1] = 6L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31225);final long[] array2 = new long[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31226);array2[0] = 5L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31227);array2[1] = 6L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31228);final long[] array3 = new long[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31229);array3[0] = 5L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31230);array3[1] = 6L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31231);array3[2] = 7L;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31232);final Object obj1 = array1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31233);final Object obj2 = array2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31234);final Object obj3 = array3;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31235);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31236);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31237);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31238);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31239);array1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31240);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31241);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testIntArrayHiddenByObject() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b23hj1o3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testIntArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31242,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b23hj1o3u(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31242);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31243);final int[] array1 = new int[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31244);array1[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31245);array1[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31246);final int[] array2 = new int[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31247);array2[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31248);array2[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31249);final int[] array3 = new int[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31250);array3[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31251);array3[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31252);array3[2] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31253);final Object obj1 = array1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31254);final Object obj2 = array2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31255);final Object obj3 = array3;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31256);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31257);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31258);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31259);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31260);array1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31261);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31262);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testShortArrayHiddenByObject() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27gi80ao4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testShortArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31263,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27gi80ao4f(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31263);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31264);final short[] array1 = new short[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31265);array1[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31266);array1[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31267);final short[] array2 = new short[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31268);array2[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31269);array2[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31270);final short[] array3 = new short[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31271);array3[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31272);array3[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31273);array3[2] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31274);final Object obj1 = array1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31275);final Object obj2 = array2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31276);final Object obj3 = array3;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31277);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31278);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31279);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31280);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31281);array1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31282);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31283);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testCharArrayHiddenByObject() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i1ukfso50();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testCharArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31284,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i1ukfso50(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31284);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31285);final char[] array1 = new char[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31286);array1[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31287);array1[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31288);final char[] array2 = new char[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31289);array2[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31290);array2[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31291);final char[] array3 = new char[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31292);array3[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31293);array3[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31294);array3[2] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31295);final Object obj1 = array1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31296);final Object obj2 = array2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31297);final Object obj3 = array3;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31298);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31299);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31300);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31301);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31302);array1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31303);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31304);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testByteArrayHiddenByObject() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vn0kzqo5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testByteArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31305,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vn0kzqo5l(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31305);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31306);final byte[] array1 = new byte[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31307);array1[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31308);array1[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31309);final byte[] array2 = new byte[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31310);array2[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31311);array2[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31312);final byte[] array3 = new byte[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31313);array3[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31314);array3[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31315);array3[2] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31316);final Object obj1 = array1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31317);final Object obj2 = array2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31318);final Object obj3 = array3;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31319);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31320);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31321);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31322);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31323);array1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31324);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31325);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testDoubleArrayHiddenByObject() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x7e5j1o66();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testDoubleArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31326,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x7e5j1o66(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31326);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31327);final double[] array1 = new double[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31328);array1[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31329);array1[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31330);final double[] array2 = new double[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31331);array2[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31332);array2[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31333);final double[] array3 = new double[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31334);array3[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31335);array3[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31336);array3[2] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31337);final Object obj1 = array1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31338);final Object obj2 = array2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31339);final Object obj3 = array3;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31340);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31341);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31342);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31343);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31344);array1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31345);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31346);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testFloatArrayHiddenByObject() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2eda87qo6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testFloatArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31347,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2eda87qo6r(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31347);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31348);final float[] array1 = new float[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31349);array1[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31350);array1[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31351);final float[] array2 = new float[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31352);array2[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31353);array2[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31354);final float[] array3 = new float[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31355);array3[0] = 5;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31356);array3[1] = 6;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31357);array3[2] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31358);final Object obj1 = array1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31359);final Object obj2 = array2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31360);final Object obj3 = array3;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31361);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31362);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31363);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31364);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31365);array1[1] = 7;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31366);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31367);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}

    @Test
    public void testBooleanArrayHiddenByObject() {__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceStart(getClass().getName(),31368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zg9jjqo7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2njcnjcl3lqxu8j.R.rethrow($CLV_t2$);}finally{__CLR4_1_2njcnjcl3lqxu8j.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.CompareToBuilderTest.testBooleanArrayHiddenByObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31368,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zg9jjqo7c(){try{__CLR4_1_2njcnjcl3lqxu8j.R.inc(31368);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31369);final boolean[] array1 = new boolean[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31370);array1[0] = true;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31371);array1[1] = false;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31372);final boolean[] array2 = new boolean[2];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31373);array2[0] = true;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31374);array2[1] = false;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31375);final boolean[] array3 = new boolean[3];
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31376);array3[0] = true;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31377);array3[1] = false;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31378);array3[2] = true;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31379);final Object obj1 = array1;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31380);final Object obj2 = array2;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31381);final Object obj3 = array3;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31382);assertTrue(new CompareToBuilder().append(obj1, obj1).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31383);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() == 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31384);assertTrue(new CompareToBuilder().append(obj1, obj3).toComparison() < 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31385);assertTrue(new CompareToBuilder().append(obj3, obj1).toComparison() > 0);

        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31386);array1[1] = true;
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31387);assertTrue(new CompareToBuilder().append(obj1, obj2).toComparison() > 0);
        __CLR4_1_2njcnjcl3lqxu8j.R.inc(31388);assertTrue(new CompareToBuilder().append(obj2, obj1).toComparison() < 0);
    }finally{__CLR4_1_2njcnjcl3lqxu8j.R.flushNeeded();}}
  
 }
