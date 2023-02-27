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
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.HashCodeBuilder}.
 * 
 * @version $Id$
 */
public class HashCodeBuilderTest {static class __CLR4_1_2ow6ow6l3lqxudh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,32558,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleA {
        ReflectionTestCycleB b;

        @Override
        public int hashCode() {try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32262);
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32263);return HashCodeBuilder.reflectionHashCode(this);
        }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}
    }

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleB {
        ReflectionTestCycleA a;

        @Override
        public int hashCode() {try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32264);
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32265);return HashCodeBuilder.reflectionHashCode(this);
        }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}
    }

    // -----------------------------------------------------------------------

    @Test(expected=IllegalArgumentException.class)
    public void testConstructorEx1() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rqgldpowa();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,69,120,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testConstructorEx1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32266,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rqgldpowa(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32266);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32267);new HashCodeBuilder(0, 0);
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testConstructorEx2() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uzgk66owc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,69,120,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testConstructorEx2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32268,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uzgk66owc(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32268);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32269);new HashCodeBuilder(2, 2);
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    static class TestObject {
        private int a;

        public TestObject(final int a) {try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32270);
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32271);this.a = a;
        }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32272);
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32273);if ((((o == this)&&(__CLR4_1_2ow6ow6l3lqxudh.R.iget(32274)!=0|true))||(__CLR4_1_2ow6ow6l3lqxudh.R.iget(32275)==0&false))) {{
                __CLR4_1_2ow6ow6l3lqxudh.R.inc(32276);return true;
            }
            }__CLR4_1_2ow6ow6l3lqxudh.R.inc(32277);if ((((!(o instanceof TestObject))&&(__CLR4_1_2ow6ow6l3lqxudh.R.iget(32278)!=0|true))||(__CLR4_1_2ow6ow6l3lqxudh.R.iget(32279)==0&false))) {{
                __CLR4_1_2ow6ow6l3lqxudh.R.inc(32280);return false;
            }
            }__CLR4_1_2ow6ow6l3lqxudh.R.inc(32281);final TestObject rhs = (TestObject) o;
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32282);return a == rhs.a;
        }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32283);
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32284);return a;
        }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

        public void setA(final int a) {try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32285);
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32286);this.a = a;
        }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

        public int getA() {try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32287);
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32288);return a;
        }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}
    }

    static class TestSubObject extends TestObject {
        private int b;

        @SuppressWarnings("unused")
        transient private int t;

        public TestSubObject() {
            super(0);__CLR4_1_2ow6ow6l3lqxudh.R.inc(32290);try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32289);
        }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

        public TestSubObject(final int a, final int b, final int t) {
            super(a);__CLR4_1_2ow6ow6l3lqxudh.R.inc(32292);try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32291);
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32293);this.b = b;
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32294);this.t = t;
        }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

        @Override
        public boolean equals(final Object o) {try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32295);
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32296);if ((((o == this)&&(__CLR4_1_2ow6ow6l3lqxudh.R.iget(32297)!=0|true))||(__CLR4_1_2ow6ow6l3lqxudh.R.iget(32298)==0&false))) {{
                __CLR4_1_2ow6ow6l3lqxudh.R.inc(32299);return true;
            }
            }__CLR4_1_2ow6ow6l3lqxudh.R.inc(32300);if ((((!(o instanceof TestSubObject))&&(__CLR4_1_2ow6ow6l3lqxudh.R.iget(32301)!=0|true))||(__CLR4_1_2ow6ow6l3lqxudh.R.iget(32302)==0&false))) {{
                __CLR4_1_2ow6ow6l3lqxudh.R.inc(32303);return false;
            }
            }__CLR4_1_2ow6ow6l3lqxudh.R.inc(32304);final TestSubObject rhs = (TestSubObject) o;
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32305);return super.equals(o) && b == rhs.b;
        }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

        @Override
        public int hashCode() {try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32306);
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32307);return b*17 + super.hashCode();
        }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    }

    @Test
    public void testReflectionHashCode() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xivefzoxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32308,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xivefzoxg(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32308);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32309);assertEquals(17 * 37, HashCodeBuilder.reflectionHashCode(new TestObject(0)));
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32310);assertEquals(17 * 37 + 123456, HashCodeBuilder.reflectionHashCode(new TestObject(123456)));
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testReflectionHierarchyHashCode() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21d7bzuoxj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32311,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21d7bzuoxj(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32311);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32312);assertEquals(17 * 37 * 37, HashCodeBuilder.reflectionHashCode(new TestSubObject(0, 0, 0)));
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32313);assertEquals(17 * 37 * 37 * 37, HashCodeBuilder.reflectionHashCode(new TestSubObject(0, 0, 0), true));
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32314);assertEquals((17 * 37 + 7890) * 37 + 123456, HashCodeBuilder.reflectionHashCode(new TestSubObject(123456, 7890,
                0)));
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32315);assertEquals(((17 * 37 + 7890) * 37 + 0) * 37 + 123456, HashCodeBuilder.reflectionHashCode(new TestSubObject(
                123456, 7890, 0), true));
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testReflectionHierarchyHashCodeEx1() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27l3jg2oxo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,72,105,101,114,97,114,99,104,121,72,97,115,104,67,111,100,101,69,120,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32316,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27l3jg2oxo(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32316);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32317);HashCodeBuilder.reflectionHashCode(0, 0, new TestSubObject(0, 0, 0), true);
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testReflectionHierarchyHashCodeEx2() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2au3i8joxq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,72,105,101,114,97,114,99,104,121,72,97,115,104,67,111,100,101,69,120,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHierarchyHashCodeEx2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32318,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2au3i8joxq(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32318);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32319);HashCodeBuilder.reflectionHashCode(2, 2, new TestSubObject(0, 0, 0), true);
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testReflectionHashCodeEx1() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gmxju5oxs();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,72,97,115,104,67,111,100,101,69,120,49,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32320,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gmxju5oxs(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32320);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32321);HashCodeBuilder.reflectionHashCode(0, 0, new TestObject(0), true);
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testReflectionHashCodeEx2() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jvximmoxu();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,72,97,115,104,67,111,100,101,69,120,50,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32322,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jvximmoxu(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32322);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32323);HashCodeBuilder.reflectionHashCode(2, 2, new TestObject(0), true);
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testReflectionHashCodeEx3() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n4xhf3oxw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,102,108,101,99,116,105,111,110,72,97,115,104,67,111,100,101,69,120,51,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeEx3",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32324,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n4xhf3oxw(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32324);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32325);HashCodeBuilder.reflectionHashCode(13, 19, null, true);
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testSuper() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28bo7cgoxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testSuper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32326,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28bo7cgoxy(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32326);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32327);final Object obj = new Object();
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32328);assertEquals(17 * 37 + 19 * 41 + obj.hashCode(), new HashCodeBuilder(17, 37).appendSuper(
                new HashCodeBuilder(19, 41).append(obj).toHashCode()).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testObject() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iogga0oy1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32329,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iogga0oy1(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32329);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32330);Object obj = null;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32331);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32332);obj = new Object();
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32333);assertEquals(17 * 37 + obj.hashCode(), new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}
    
    @Test
    public void testObjectBuild() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tvdhb0oy6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectBuild",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32334,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tvdhb0oy6(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32334);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32335);Object obj = null;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32336);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(obj).build().intValue());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32337);obj = new Object();
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32338);assertEquals(17 * 37 + obj.hashCode(), new HashCodeBuilder(17, 37).append(obj).build().intValue());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast") // cast is not really needed, keep for consistency
    public void testLong() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xsq9mzoyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32339,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xsq9mzoyb(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32339);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32340);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((long) 0L).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32341);assertEquals(17 * 37 + (int) (123456789L ^ 123456789L >> 32), new HashCodeBuilder(17, 37).append(
                (long) 123456789L).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast") // cast is not really needed, keep for consistency
    public void testInt() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28s3xd0oye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32342,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28s3xd0oye(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32342);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32343);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((int) 0).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32344);assertEquals(17 * 37 + 123456, new HashCodeBuilder(17, 37).append((int) 123456).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testShort() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2exs2r3oyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32345,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2exs2r3oyh(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32345);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32346);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((short) 0).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32347);assertEquals(17 * 37 + 12345, new HashCodeBuilder(17, 37).append((short) 12345).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testChar() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d2kz0voyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32348,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d2kz0voyk(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32348);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32349);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((char) 0).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32350);assertEquals(17 * 37 + 1234, new HashCodeBuilder(17, 37).append((char) 1234).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testByte() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22w26nzoyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32351,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22w26nzoyn(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32351);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32352);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((byte) 0).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32353);assertEquals(17 * 37 + 123, new HashCodeBuilder(17, 37).append((byte) 123).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast") // cast is not really needed, keep for consistency
    public void testDouble() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23hfze2oyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32354,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23hfze2oyq(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32354);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32355);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((double) 0d).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32356);final double d = 1234567.89;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32357);final long l = Double.doubleToLongBits(d);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32358);assertEquals(17 * 37 + (int) (l ^ l >> 32), new HashCodeBuilder(17, 37).append(d).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast") // cast is not really needed, keep for consistency
    public void testFloat() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tuf8q9oyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32359,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tuf8q9oyv(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32359);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32360);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((float) 0f).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32361);final float f = 1234.89f;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32362);final int i = Float.floatToIntBits(f);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32363);assertEquals(17 * 37 + i, new HashCodeBuilder(17, 37).append(f).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testBoolean() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32364);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a9awn1oz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32364,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a9awn1oz0(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32364);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32365);assertEquals(17 * 37 + 0, new HashCodeBuilder(17, 37).append(true).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32366);assertEquals(17 * 37 + 1, new HashCodeBuilder(17, 37).append(false).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oi04a7oz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32367,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oi04a7oz3(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32367);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32368);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((Object[]) null).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32369);final Object[] obj = new Object[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32370);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32371);obj[0] = new Object();
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32372);assertEquals((17 * 37 + obj[0].hashCode()) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32373);obj[1] = new Object();
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32374);assertEquals((17 * 37 + obj[0].hashCode()) * 37 + obj[1].hashCode(), new HashCodeBuilder(17, 37).append(obj)
                .toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testObjectArrayAsObject() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29jp1hcozb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testObjectArrayAsObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32375,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29jp1hcozb(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32375);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32376);final Object[] obj = new Object[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32377);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32378);obj[0] = new Object();
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32379);assertEquals((17 * 37 + obj[0].hashCode()) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32380);obj[1] = new Object();
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32381);assertEquals((17 * 37 + obj[0].hashCode()) * 37 + obj[1].hashCode(), new HashCodeBuilder(17, 37).append(
                (Object) obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2if58i6ozi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32382,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2if58i6ozi(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32382);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32383);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((long[]) null).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32384);final long[] obj = new long[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32385);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32386);obj[0] = 5L;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32387);final int h1 = (int) (5L ^ 5L >> 32);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32388);assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32389);obj[1] = 6L;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32390);final int h2 = (int) (6L ^ 6L >> 32);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32391);assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testLongArrayAsObject() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rqb7lpozs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testLongArrayAsObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32392,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rqb7lpozs(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32392);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32393);final long[] obj = new long[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32394);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32395);obj[0] = 5L;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32396);final int h1 = (int) (5L ^ 5L >> 32);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32397);assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32398);obj[1] = 6L;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32399);final int h2 = (int) (6L ^ 6L >> 32);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32400);assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testIntArray() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28w0so3p01();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32401,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28w0so3p01(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32401);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32402);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((int[]) null).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32403);final int[] obj = new int[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32404);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32405);obj[0] = 5;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32406);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32407);obj[1] = 6;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32408);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testIntArrayAsObject() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w79smsp09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testIntArrayAsObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32409,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w79smsp09(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32409);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32410);final int[] obj = new int[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32411);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32412);obj[0] = 5;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32413);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32414);obj[1] = 6;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32415);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testShortArray() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nqn45yp0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32416,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nqn45yp0g(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32416);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32417);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((short[]) null).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32418);final short[] obj = new short[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32419);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32420);obj[0] = (short) 5;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32421);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32422);obj[1] = (short) 6;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32423);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testShortArrayAsObject() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wd4yxzp0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testShortArrayAsObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32424,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wd4yxzp0o(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32424);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32425);final short[] obj = new short[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32426);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32427);obj[0] = (short) 5;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32428);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32429);obj[1] = (short) 6;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32430);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testCharArray() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w0bza0p0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32431,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w0bza0p0v(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32431);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32432);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((char[]) null).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32433);final char[] obj = new char[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32434);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32435);obj[0] = (char) 5;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32436);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32437);obj[1] = (char) 6;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32438);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testCharArrayAsObject() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2781zmfp13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testCharArrayAsObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32439,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2781zmfp13(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32439);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32440);final char[] obj = new char[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32441);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32442);obj[0] = (char) 5;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32443);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32444);obj[1] = (char) 6;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32445);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testByteArray() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mhe7kqp1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32446,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mhe7kqp1a(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32446);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32447);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((byte[]) null).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32448);final byte[] obj = new byte[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32449);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32450);obj[0] = (byte) 5;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32451);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32452);obj[1] = (byte) 6;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32453);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testByteArrayAsObject() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dljk1jp1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testByteArrayAsObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32454,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dljk1jp1i(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32454);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32455);final byte[] obj = new byte[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32456);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32457);obj[0] = (byte) 5;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32458);assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32459);obj[1] = (byte) 6;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32460);assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testDoubleArray() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32461);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m6ks4jp1p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32461,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m6ks4jp1p(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32461);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32462);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((double[]) null).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32463);final double[] obj = new double[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32464);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32465);obj[0] = 5.4d;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32466);final long l1 = Double.doubleToLongBits(5.4d);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32467);final int h1 = (int) (l1 ^ l1 >> 32);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32468);assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32469);obj[1] = 6.3d;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32470);final long l2 = Double.doubleToLongBits(6.3d);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32471);final int h2 = (int) (l2 ^ l2 >> 32);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32472);assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testDoubleArrayAsObject() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xh418yp21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testDoubleArrayAsObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32473,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xh418yp21(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32473);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32474);final double[] obj = new double[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32475);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32476);obj[0] = 5.4d;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32477);final long l1 = Double.doubleToLongBits(5.4d);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32478);final int h1 = (int) (l1 ^ l1 >> 32);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32479);assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32480);obj[1] = 6.3d;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32481);final long l2 = Double.doubleToLongBits(6.3d);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32482);final int h2 = (int) (l2 ^ l2 >> 32);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32483);assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testFloatArray() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2maw6iyp2c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32484,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2maw6iyp2c(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32484);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32485);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((float[]) null).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32486);final float[] obj = new float[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32487);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32488);obj[0] = 5.4f;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32489);final int h1 = Float.floatToIntBits(5.4f);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32490);assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32491);obj[1] = 6.3f;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32492);final int h2 = Float.floatToIntBits(6.3f);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32493);assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testFloatArrayAsObject() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_254hlvrp2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testFloatArrayAsObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32494,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_254hlvrp2m(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32494);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32495);final float[] obj = new float[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32496);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32497);obj[0] = 5.4f;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32498);final int h1 = Float.floatToIntBits(5.4f);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32499);assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32500);obj[1] = 6.3f;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32501);final int h2 = Float.floatToIntBits(6.3f);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32502);assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testBooleanArray() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21rzd0qp2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32503,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21rzd0qp2v(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32503);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32504);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((boolean[]) null).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32505);final boolean[] obj = new boolean[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32506);assertEquals((17 * 37 + 1) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32507);obj[0] = true;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32508);assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32509);obj[1] = false;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32510);assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testBooleanArrayAsObject() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lo037pp33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanArrayAsObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32511,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lo037pp33(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32511);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32512);final boolean[] obj = new boolean[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32513);assertEquals((17 * 37 + 1) * 37 + 1, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32514);obj[0] = true;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32515);assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32516);obj[1] = false;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32517);assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testBooleanMultiArray() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22cpwqlp3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testBooleanMultiArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32518,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22cpwqlp3a(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32518);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32519);final boolean[][] obj = new boolean[2][];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32520);assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32521);obj[0] = new boolean[0];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32522);assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32523);obj[0] = new boolean[1];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32524);assertEquals((17 * 37 + 1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32525);obj[0] = new boolean[2];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32526);assertEquals(((17 * 37 + 1) * 37 + 1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32527);obj[0][0] = true;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32528);assertEquals(((17 * 37 + 0) * 37 + 1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32529);obj[1] = new boolean[1];
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32530);assertEquals(((17 * 37 + 0) * 37 + 1) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    @Test
    public void testReflectionHashCodeExcludeFields() throws Exception {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2l6d9ap3n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionHashCodeExcludeFields",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32531,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2l6d9ap3n() throws Exception{try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32531);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32532);final TestObjectWithMultipleFields x = new TestObjectWithMultipleFields(1, 2, 3);

        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32533);assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x));

        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32534);assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, (String[]) null));
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32535);assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, new String[]{}));
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32536);assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, new String[]{"xxx"}));

        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32537);assertEquals((17 * 37 + 1) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, new String[]{"two"}));
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32538);assertEquals((17 * 37 + 1) * 37 + 2, HashCodeBuilder.reflectionHashCode(x, new String[]{"three"}));

        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32539);assertEquals(17 * 37 + 1, HashCodeBuilder.reflectionHashCode(x, new String[]{"two", "three"}));

        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32540);assertEquals(17, HashCodeBuilder.reflectionHashCode(x, new String[]{"one", "two", "three"}));
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32541);assertEquals(17, HashCodeBuilder.reflectionHashCode(x, new String[]{"one", "two", "three", "xxx"}));
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    static class TestObjectWithMultipleFields {
        @SuppressWarnings("unused")
        private int one = 0;

        @SuppressWarnings("unused")
        private int two = 0;

        @SuppressWarnings("unused")
        private int three = 0;

        public TestObjectWithMultipleFields(final int one, final int two, final int three) {try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32542);
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32543);this.one = one;
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32544);this.two = two;
            __CLR4_1_2ow6ow6l3lqxudh.R.inc(32545);this.three = three;
        }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}
    }

    /**
     * Test Objects pointing to each other.
     */
    @Test
    public void testReflectionObjectCycle() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_247qrvzp42();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testReflectionObjectCycle",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32546,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_247qrvzp42(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32546);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32547);final ReflectionTestCycleA a = new ReflectionTestCycleA();
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32548);final ReflectionTestCycleB b = new ReflectionTestCycleB();
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32549);a.b = b;
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32550);b.a = a;
        
        // Used to caused:
        // java.lang.StackOverflowError
        // at java.lang.ClassLoader.getCallerClassLoader(Native Method)
        // at java.lang.Class.getDeclaredFields(Class.java:992)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:373)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:349)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:155)
        // at
        // org.apache.commons.lang.builder.HashCodeBuilderTest$ReflectionTestCycleB.hashCode(HashCodeBuilderTest.java:53)
        // at org.apache.commons.lang.builder.HashCodeBuilder.append(HashCodeBuilder.java:422)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionAppend(HashCodeBuilder.java:383)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:349)
        // at org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode(HashCodeBuilder.java:155)
        // at
        // org.apache.commons.lang.builder.HashCodeBuilderTest$ReflectionTestCycleA.hashCode(HashCodeBuilderTest.java:42)
        // at org.apache.commons.lang.builder.HashCodeBuilder.append(HashCodeBuilder.java:422)

        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32551);a.hashCode();
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32552);assertNull(HashCodeBuilder.getRegistry());
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32553);b.hashCode();
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32554);assertNull(HashCodeBuilder.getRegistry());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

    /**
     * Ensures LANG-520 remains true
     */
    @Test
    public void testToHashCodeEqualsHashCode() {__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceStart(getClass().getName(),32555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2h7qx3dp4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ow6ow6l3lqxudh.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ow6ow6l3lqxudh.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.HashCodeBuilderTest.testToHashCodeEqualsHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32555,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2h7qx3dp4b(){try{__CLR4_1_2ow6ow6l3lqxudh.R.inc(32555);
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32556);final HashCodeBuilder hcb = new HashCodeBuilder(17, 37).append(new Object()).append('a');
        __CLR4_1_2ow6ow6l3lqxudh.R.inc(32557);assertEquals("hashCode() is no longer returning the same value as toHashCode() - see LANG-520", 
                     hcb.toHashCode(), hcb.hashCode());
    }finally{__CLR4_1_2ow6ow6l3lqxudh.R.flushNeeded();}}

}
