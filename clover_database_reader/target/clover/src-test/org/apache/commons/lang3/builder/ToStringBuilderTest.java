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
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Test;

/**
 * Unit tests for {@link org.apache.commons.lang3.builder.ToStringBuilder}.
 *
 * @version $Id$
 */
public class ToStringBuilderTest {static class __CLR4_1_2pfopfol3lqxuik{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,33442,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = base.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(base));

    /*
     * All tests should leave the registry empty. 
     */
    @After
    public void after(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(32964);
        __CLR4_1_2pfopfol3lqxuik.R.inc(32965);validateNullToStringStyleRegistry();
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testConstructorEx1() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),32966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rqgldppfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32966,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rqgldppfq(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(32966);
        __CLR4_1_2pfopfol3lqxuik.R.inc(32967);assertEquals("<null>", new ToStringBuilder(null).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testConstructorEx2() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),32968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uzgk66pfs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32968,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uzgk66pfs(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(32968);
        __CLR4_1_2pfopfol3lqxuik.R.inc(32969);assertEquals("<null>", new ToStringBuilder(null, null).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(32970);new ToStringBuilder(this.base, null).toString();
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testConstructorEx3() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),32971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2y8giynpfv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testConstructorEx3",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32971,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2y8giynpfv(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(32971);
        __CLR4_1_2pfopfol3lqxuik.R.inc(32972);assertEquals("<null>", new ToStringBuilder(null, null, null).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(32973);new ToStringBuilder(this.base, null, null).toString();
        __CLR4_1_2pfopfol3lqxuik.R.inc(32974);new ToStringBuilder(this.base, ToStringStyle.DEFAULT_STYLE, null).toString();
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testGetSetDefault() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),32975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2suvbbqpfz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testGetSetDefault",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32975,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2suvbbqpfz(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(32975);
        __CLR4_1_2pfopfol3lqxuik.R.inc(32976);try {
            __CLR4_1_2pfopfol3lqxuik.R.inc(32977);ToStringBuilder.setDefaultStyle(ToStringStyle.NO_FIELD_NAMES_STYLE);
            __CLR4_1_2pfopfol3lqxuik.R.inc(32978);assertSame(ToStringStyle.NO_FIELD_NAMES_STYLE, ToStringBuilder.getDefaultStyle());
        } finally {
            // reset for other tests
            __CLR4_1_2pfopfol3lqxuik.R.inc(32979);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
        }
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testSetDefaultEx() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),32980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21bbi7ppg4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,68,101,102,97,117,108,116,69,120,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testSetDefaultEx",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32980,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21bbi7ppg4(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(32980);
        __CLR4_1_2pfopfol3lqxuik.R.inc(32981);ToStringBuilder.setDefaultStyle(null);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testBlank() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),32982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s7z6qxpg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testBlank",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32982,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s7z6qxpg6(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(32982);
        __CLR4_1_2pfopfol3lqxuik.R.inc(32983);assertEquals(baseStr + "[]", new ToStringBuilder(base).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Test wrapper for int primitive.
     */
    @Test
    public void testReflectionInteger() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),32984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2c6vxrspg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionInteger",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32984,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2c6vxrspg8(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(32984);
        __CLR4_1_2pfopfol3lqxuik.R.inc(32985);assertEquals(baseStr + "[value=5]", ToStringBuilder.reflectionToString(base));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Test wrapper for char primitive.
     */
    @Test
    public void testReflectionCharacter() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),32986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qq5xcjpga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharacter",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32986,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qq5xcjpga(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(32986);
        __CLR4_1_2pfopfol3lqxuik.R.inc(32987);final Character c = new Character('A');
        __CLR4_1_2pfopfol3lqxuik.R.inc(32988);assertEquals(this.toBaseString(c) + "[value=A]", ToStringBuilder.reflectionToString(c));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Test wrapper for char boolean.
     */
    @Test
    public void testReflectionBoolean() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),32989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ikqfwupgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32989,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ikqfwupgd(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(32989);
        __CLR4_1_2pfopfol3lqxuik.R.inc(32990);Boolean b;
        __CLR4_1_2pfopfol3lqxuik.R.inc(32991);b = Boolean.TRUE;
        __CLR4_1_2pfopfol3lqxuik.R.inc(32992);assertEquals(this.toBaseString(b) + "[value=true]", ToStringBuilder.reflectionToString(b));
        __CLR4_1_2pfopfol3lqxuik.R.inc(32993);b = Boolean.FALSE;
        __CLR4_1_2pfopfol3lqxuik.R.inc(32994);assertEquals(this.toBaseString(b) + "[value=false]", ToStringBuilder.reflectionToString(b));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Create the same toString() as Object.toString().
     * @param o the object to create the string for.
     * @return a String in the Object.toString format.
     */
    private String toBaseString(final Object o) {try{__CLR4_1_2pfopfol3lqxuik.R.inc(32995);
        __CLR4_1_2pfopfol3lqxuik.R.inc(32996);return o.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(o));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    // Reflection Array tests

    //
    // Note on the following line of code repeated in the reflection array tests.
    //
    // assertReflectionArray("<null>", array);
    //
    // The expected value is not baseStr + "[<null>]" since array==null and is typed as Object.
    // The null array does not carry array type information.
    // If we added a primitive array type constructor and pile of associated methods,
    // then type declaring type information could be carried forward. IMHO, null is null.
    //
    // Gary Gregory - 2003-03-12 - ggregory@seagullsw.com
    //

    public void assertReflectionArray(final String expected, final Object actual) {try{__CLR4_1_2pfopfol3lqxuik.R.inc(32997);
        __CLR4_1_2pfopfol3lqxuik.R.inc(32998);if ((((actual == null)&&(__CLR4_1_2pfopfol3lqxuik.R.iget(32999)!=0|true))||(__CLR4_1_2pfopfol3lqxuik.R.iget(33000)==0&false))) {{
            // Until ToStringBuilder supports null objects.
            __CLR4_1_2pfopfol3lqxuik.R.inc(33001);return;
        }
        }__CLR4_1_2pfopfol3lqxuik.R.inc(33002);assertEquals(expected, ToStringBuilder.reflectionToString(actual));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33003);assertEquals(expected, ToStringBuilder.reflectionToString(actual, null));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33004);assertEquals(expected, ToStringBuilder.reflectionToString(actual, null, true));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33005);assertEquals(expected, ToStringBuilder.reflectionToString(actual, null, false));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionObjectArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26bs9d0pgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33006,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26bs9d0pgu(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33006);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33007);Object[] array = new Object[] { null, base, new int[] { 3, 6 } };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33008);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33009);assertEquals(baseStr + "[{<null>,5,{3,6}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33010);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33011);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionLongArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q77wbdph0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33012,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q77wbdph0(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33012);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33013);long[] array = new long[] { 1, 2, -3, 4 };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33014);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33015);assertEquals(baseStr + "[{1,2,-3,4}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33016);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33017);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionIntArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wlscqaph6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionIntArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33018,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wlscqaph6(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33018);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33019);int[] array = new int[] { 1, 2, -3, 4 };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33020);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33021);assertEquals(baseStr + "[{1,2,-3,4}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33022);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33023);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionShortArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24cb81rphc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33024,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24cb81rphc(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33024);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33025);short[] array = new short[] { 1, 2, -3, 4 };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33026);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33027);assertEquals(baseStr + "[{1,2,-3,4}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33028);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33029);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionyteArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s1me43phi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionyteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33030,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s1me43phi(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33030);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33031);byte[] array = new byte[] { 1, 2, -3, 4 };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33032);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33033);assertEquals(baseStr + "[{1,2,-3,4}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33034);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33035);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionCharArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o89bgtpho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33036,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o89bgtpho(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33036);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33037);char[] array = new char[] { 'A', '2', '_', 'D' };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33038);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33039);assertEquals(baseStr + "[{A,2,_,D}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33040);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33041);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionDoubleArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uobexephu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionDoubleArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33042,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uobexephu(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33042);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33043);double[] array = new double[] { 1.0, 2.9876, -3.00001, 4.3 };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33044);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33045);assertEquals(baseStr + "[{1.0,2.9876,-3.00001,4.3}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33046);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33047);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionFloatArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kn9j8hpi0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionFloatArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33048,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kn9j8hpi0(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33048);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33049);float[] array = new float[] { 1.0f, 2.9876f, -3.00001f, 4.3f };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33050);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33051);assertEquals(baseStr + "[{1.0,2.9876,-3.00001,4.3}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33052);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33053);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionBooleanArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26o468lpi6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBooleanArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33054,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26o468lpi6(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33054);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33055);boolean[] array = new boolean[] { true, false, false };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33056);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33057);assertEquals(baseStr + "[{true,false,false}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33058);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33059);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    // Reflection Array Array tests

    @Test
    public void testReflectionFloatArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21ochx6pic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionFloatArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33060,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21ochx6pic(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33060);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33061);float[][] array = new float[][] { { 1.0f, 2.29686f }, null, { Float.NaN } };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33062);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33063);assertEquals(baseStr + "[{{1.0,2.29686},<null>,{NaN}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33064);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33065);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}


    @Test
    public void testReflectionLongArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nye51cpii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionLongArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33066,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nye51cpii(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33066);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33067);long[][] array = new long[][] { { 1, 2 }, null, { 5 } };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33068);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33069);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33070);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33071);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionIntArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kvt8jdpio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionIntArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33072,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kvt8jdpio(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33072);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33073);int[][] array = new int[][] { { 1, 2 }, null, { 5 } };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33074);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33075);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33076);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33077);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionhortArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2t8icc3piu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionhortArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33078,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2t8icc3piu(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33078);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33079);short[][] array = new short[][] { { 1, 2 }, null, { 5 } };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33080);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33081);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33082);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33083);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionByteArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cqx1pwpj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionByteArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33084,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cqx1pwpj0(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33084);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33085);byte[][] array = new byte[][] { { 1, 2 }, null, { 5 } };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33086);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33087);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33088);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33089);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionCharArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pu6eaupj6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionCharArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33090,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pu6eaupj6(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33090);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33091);char[][] array = new char[][] { { 'A', 'B' }, null, { 'p' } };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33092);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33093);assertEquals(baseStr + "[{{A,B},<null>,{p}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33094);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33095);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionDoubleArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24m69cbpjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionDoubleArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33096,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24m69cbpjc(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33096);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33097);double[][] array = new double[][] { { 1.0, 2.29686 }, null, { Double.NaN } };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33098);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33099);assertEquals(baseStr + "[{{1.0,2.29686},<null>,{NaN}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33100);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33101);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionBooleanArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2e1qdaqpji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionBooleanArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33102,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2e1qdaqpji(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33102);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33103);boolean[][] array = new boolean[][] { { true, false }, null, { false } };
        __CLR4_1_2pfopfol3lqxuik.R.inc(33104);final String baseStr = this.toBaseString(array);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33105);assertEquals(baseStr + "[{{true,false},<null>,{false}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33106);assertEquals(baseStr + "[{{true,false},<null>,{false}}]", ToStringBuilder.reflectionToString(array));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33107);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33108);assertReflectionArray("<null>", array);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    // Reflection hierarchy tests
    @Test
    public void testReflectionHierarchyArrayList() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hlhll2pjp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionHierarchyArrayList",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33109,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hlhll2pjp(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33109);}finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testReflectionHierarchyArrayList() {
//         final List<Object> base = new ArrayList<Object>();
//         final String baseStr = this.toBaseString(base);
//         // note, the test data depends on the internal representation of the ArrayList, which may differ between JDK versions and vendors
//         final String expectedWithTransients = baseStr + "[elementData={<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>},size=0,modCount=0]";
//         final String toStringWithTransients = ToStringBuilder.reflectionToString(base, null, true);
//         if (!expectedWithTransients.equals(toStringWithTransients)) {
//             // representation different for IBM JDK 1.6.0, LANG-727
//             if (!("IBM Corporation".equals(SystemUtils.JAVA_VENDOR) && "1.6".equals(SystemUtils.JAVA_SPECIFICATION_VERSION))) {
//                 assertEquals(expectedWithTransients, toStringWithTransients);
//             }
//         }
//         final String expectedWithoutTransients = baseStr + "[size=0]";
//         final String toStringWithoutTransients = ToStringBuilder.reflectionToString(base, null, false);
//         if (!expectedWithoutTransients.equals(toStringWithoutTransients)) {
//             // representation different for IBM JDK 1.6.0, LANG-727
//             if (!("IBM Corporation".equals(SystemUtils.JAVA_VENDOR) && "1.6".equals(SystemUtils.JAVA_SPECIFICATION_VERSION))) {
//                 assertEquals(expectedWithoutTransients, toStringWithoutTransients);
//             }
//         }
//     }

    @Test
    public void testReflectionHierarchy() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dlswgxpjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionHierarchy",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33110,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dlswgxpjq(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33110);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33111);final ReflectionTestFixtureA baseA = new ReflectionTestFixtureA();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33112);String baseStr = this.toBaseString(baseA);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33113);assertEquals(baseStr + "[a=a]", ToStringBuilder.reflectionToString(baseA));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33114);assertEquals(baseStr + "[a=a]", ToStringBuilder.reflectionToString(baseA, null));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33115);assertEquals(baseStr + "[a=a]", ToStringBuilder.reflectionToString(baseA, null, false));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33116);assertEquals(baseStr + "[a=a,transientA=t]", ToStringBuilder.reflectionToString(baseA, null, true));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33117);assertEquals(baseStr + "[a=a]", ToStringBuilder.reflectionToString(baseA, null, false, null));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33118);assertEquals(baseStr + "[a=a]", ToStringBuilder.reflectionToString(baseA, null, false, Object.class));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33119);assertEquals(baseStr + "[a=a]", ToStringBuilder.reflectionToString(baseA, null, false, ReflectionTestFixtureA.class));

        __CLR4_1_2pfopfol3lqxuik.R.inc(33120);final ReflectionTestFixtureB baseB = new ReflectionTestFixtureB();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33121);baseStr = this.toBaseString(baseB);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33122);assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33123);assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33124);assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33125);assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null, false));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33126);assertEquals(baseStr + "[b=b,transientB=t,a=a,transientA=t]", ToStringBuilder.reflectionToString(baseB, null, true));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33127);assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null, false, null));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33128);assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null, false, Object.class));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33129);assertEquals(baseStr + "[b=b,a=a]", ToStringBuilder.reflectionToString(baseB, null, false, ReflectionTestFixtureA.class));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33130);assertEquals(baseStr + "[b=b]", ToStringBuilder.reflectionToString(baseB, null, false, ReflectionTestFixtureB.class));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    static class ReflectionTestFixtureA {
        @SuppressWarnings("unused")
        private final char a='a';
        @SuppressWarnings("unused")
        private transient char transientA='t';
    }

    static class ReflectionTestFixtureB extends ReflectionTestFixtureA {
        @SuppressWarnings("unused")
        private final char b='b';
        @SuppressWarnings("unused")
        private transient char transientB='t';
    }

    @Test
    public void testInnerClassReflection() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_229odyepkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testInnerClassReflection",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33131,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_229odyepkb(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33131);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33132);final Outer outer = new Outer();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33133);assertEquals(toBaseString(outer) + "[inner=" + toBaseString(outer.inner) + "[]]", outer.toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    static class Outer {
        Inner inner = new Inner();
        class Inner {
            @Override
            public String toString() {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33134);
                __CLR4_1_2pfopfol3lqxuik.R.inc(33135);return ToStringBuilder.reflectionToString(this);
            }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}
        }
        @Override
        public String toString() {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33136);
            __CLR4_1_2pfopfol3lqxuik.R.inc(33137);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}
    }

    // Reflection cycle tests

    /**
     * Test an array element pointing to its container.
     */
    @Test
    public void testReflectionArrayCycle() throws Exception {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aj3l4fpki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayCycle",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33138,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aj3l4fpki() throws Exception{try{__CLR4_1_2pfopfol3lqxuik.R.inc(33138);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33139);final Object[] objects = new Object[1];
        __CLR4_1_2pfopfol3lqxuik.R.inc(33140);objects[0] = objects;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33141);assertEquals(
            this.toBaseString(objects) + "[{" + this.toBaseString(objects) + "}]",
            ToStringBuilder.reflectionToString(objects));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Test an array element pointing to its container.
     */
    @Test
    public void testReflectionArrayCycleLevel2() throws Exception {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dti8xpkm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayCycleLevel2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33142,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dti8xpkm() throws Exception{try{__CLR4_1_2pfopfol3lqxuik.R.inc(33142);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33143);final Object[] objects = new Object[1];
        __CLR4_1_2pfopfol3lqxuik.R.inc(33144);final Object[] objectsLevel2 = new Object[1];
        __CLR4_1_2pfopfol3lqxuik.R.inc(33145);objects[0] = objectsLevel2;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33146);objectsLevel2[0] = objects;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33147);assertEquals(
            this.toBaseString(objects) + "[{{" + this.toBaseString(objects) + "}}]",
            ToStringBuilder.reflectionToString(objects));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33148);assertEquals(
            this.toBaseString(objectsLevel2) + "[{{" + this.toBaseString(objectsLevel2) + "}}]",
            ToStringBuilder.reflectionToString(objectsLevel2));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testReflectionArrayArrayCycle() throws Exception {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26cpqk0pkt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayArrayCycle",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33149,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26cpqk0pkt() throws Exception{try{__CLR4_1_2pfopfol3lqxuik.R.inc(33149);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33150);final Object[][] objects = new Object[2][2];
        __CLR4_1_2pfopfol3lqxuik.R.inc(33151);objects[0][0] = objects;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33152);objects[0][1] = objects;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33153);objects[1][0] = objects;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33154);objects[1][1] = objects;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33155);final String basicToString = this.toBaseString(objects);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33156);assertEquals(
            basicToString
                + "[{{"
                + basicToString
                + ","
                + basicToString
                + "},{"
                + basicToString
                + ","
                + basicToString
                + "}}]",
            ToStringBuilder.reflectionToString(objects));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleA {
        ReflectionTestCycleB b;

        @Override
        public String toString() {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33157);
            __CLR4_1_2pfopfol3lqxuik.R.inc(33158);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}
    }

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleB {
        ReflectionTestCycleA a;

        @Override
        public String toString() {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33159);
            __CLR4_1_2pfopfol3lqxuik.R.inc(33160);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}
    }

    /**
     * A reflection test fixture.
     */
    static class SimpleReflectionTestFixture {
        Object o;

        public SimpleReflectionTestFixture() {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33161);
        }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

        public SimpleReflectionTestFixture(final Object o) {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33162);
            __CLR4_1_2pfopfol3lqxuik.R.inc(33163);this.o = o;
        }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33164);
            __CLR4_1_2pfopfol3lqxuik.R.inc(33165);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}
    }

    private static class SelfInstanceVarReflectionTestFixture {
        @SuppressWarnings("unused")
        private final SelfInstanceVarReflectionTestFixture typeIsSelf;

        public SelfInstanceVarReflectionTestFixture() {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33166);
            __CLR4_1_2pfopfol3lqxuik.R.inc(33167);this.typeIsSelf = this;
        }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33168);
            __CLR4_1_2pfopfol3lqxuik.R.inc(33169);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}
      }

    private static class SelfInstanceTwoVarsReflectionTestFixture {
        @SuppressWarnings("unused")
        private final SelfInstanceTwoVarsReflectionTestFixture typeIsSelf;
        private final String otherType = "The Other Type";

        public SelfInstanceTwoVarsReflectionTestFixture() {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33170);
            __CLR4_1_2pfopfol3lqxuik.R.inc(33171);this.typeIsSelf = this;
        }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

        public String getOtherType(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33172);
            __CLR4_1_2pfopfol3lqxuik.R.inc(33173);return this.otherType;
        }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33174);
            __CLR4_1_2pfopfol3lqxuik.R.inc(33175);return ToStringBuilder.reflectionToString(this);
        }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}
      }


    /**
     * Test an Object pointing to itself, the simplest test.
     *
     * @throws Exception
     */
    @Test
    public void testSimpleReflectionObjectCycle() throws Exception {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28n0oldplk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testSimpleReflectionObjectCycle",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33176,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28n0oldplk() throws Exception{try{__CLR4_1_2pfopfol3lqxuik.R.inc(33176);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33177);final SimpleReflectionTestFixture simple = new SimpleReflectionTestFixture();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33178);simple.o = simple;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33179);assertEquals(this.toBaseString(simple) + "[o=" + this.toBaseString(simple) + "]", simple.toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Test a class that defines an ivar pointing to itself.
     *
     * @throws Exception
     */
    @Test
    public void testSelfInstanceVarReflectionObjectCycle() throws Exception {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uriy9bplo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testSelfInstanceVarReflectionObjectCycle",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33180,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uriy9bplo() throws Exception{try{__CLR4_1_2pfopfol3lqxuik.R.inc(33180);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33181);final SelfInstanceVarReflectionTestFixture test = new SelfInstanceVarReflectionTestFixture();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33182);assertEquals(this.toBaseString(test) + "[typeIsSelf=" + this.toBaseString(test) + "]", test.toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Test a class that defines an ivar pointing to itself.  This test was
     * created to show that handling cyclical object resulted in a missing endFieldSeparator call.
     *
     * @throws Exception
     */
    @Test
    public void testSelfInstanceTwoVarsReflectionObjectCycle() throws Exception {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wyfi9uplr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testSelfInstanceTwoVarsReflectionObjectCycle",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33183,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wyfi9uplr() throws Exception{try{__CLR4_1_2pfopfol3lqxuik.R.inc(33183);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33184);final SelfInstanceTwoVarsReflectionTestFixture test = new SelfInstanceTwoVarsReflectionTestFixture();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33185);assertEquals(this.toBaseString(test) + "[typeIsSelf=" + this.toBaseString(test) + ",otherType=" + test.getOtherType().toString() + "]", test.toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}


    /**
     * Test Objects pointing to each other.
     *
     * @throws Exception
     */
    @Test
    public void testReflectionObjectCycle() throws Exception {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_247qrvzplu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionObjectCycle",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33186,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_247qrvzplu() throws Exception{try{__CLR4_1_2pfopfol3lqxuik.R.inc(33186);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33187);final ReflectionTestCycleA a = new ReflectionTestCycleA();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33188);final ReflectionTestCycleB b = new ReflectionTestCycleB();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33189);a.b = b;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33190);b.a = a;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33191);assertEquals(
            this.toBaseString(a) + "[b=" + this.toBaseString(b) + "[a=" + this.toBaseString(a) + "]]",
            a.toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Test a nasty combination of arrays and Objects pointing to each other.
     * objects[0] -> SimpleReflectionTestFixture[ o -> objects ]
     *
     * @throws Exception
     */
    @Test
    public void testReflectionArrayAndObjectCycle() throws Exception {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hn0rrhpm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionArrayAndObjectCycle",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33192,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hn0rrhpm0() throws Exception{try{__CLR4_1_2pfopfol3lqxuik.R.inc(33192);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33193);final Object[] objects = new Object[1];
        __CLR4_1_2pfopfol3lqxuik.R.inc(33194);final SimpleReflectionTestFixture simple = new SimpleReflectionTestFixture(objects);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33195);objects[0] = simple;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33196);assertEquals(
            this.toBaseString(objects)
                + "[{"
                + this.toBaseString(simple)
                + "[o="
                + this.toBaseString(objects)
                + "]"
                + "}]",
            ToStringBuilder.reflectionToString(objects));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33197);assertEquals(
            this.toBaseString(simple)
                + "[o={"
                + this.toBaseString(simple)
                + "}]",
            ToStringBuilder.reflectionToString(simple));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    void validateNullToStringStyleRegistry() {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33198);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33199);final Map<Object, Object> registry = ToStringStyle.getRegistry();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33200);assertNull("Expected null, actual: "+registry, registry);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}
    //  End: Reflection cycle tests

    @Test
    public void testAppendSuper() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cvyfiipm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendSuper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33201,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cvyfiipm9(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33201);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33202);assertEquals(baseStr + "[]", new ToStringBuilder(base).appendSuper("Integer@8888[]").toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33203);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").toString());

        __CLR4_1_2pfopfol3lqxuik.R.inc(33204);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[]").append("a", "hello").toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33205);assertEquals(baseStr + "[<null>,a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").append("a", "hello").toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33206);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testAppendToString() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fa5fj5pmf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33207,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fa5fj5pmf(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33207);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33208);assertEquals(baseStr + "[]", new ToStringBuilder(base).appendToString("Integer@8888[]").toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33209);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).appendToString("Integer@8888[<null>]").toString());

        __CLR4_1_2pfopfol3lqxuik.R.inc(33210);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendToString("Integer@8888[]").append("a", "hello").toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33211);assertEquals(baseStr + "[<null>,a=hello]", new ToStringBuilder(base).appendToString("Integer@8888[<null>]").append("a", "hello").toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33212);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendToString(null).append("a", "hello").toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testObject() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iogga0pml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33213,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iogga0pml(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33213);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33214);final Integer i3 = Integer.valueOf(3);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33215);final Integer i4 = Integer.valueOf(4);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33216);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33217);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(i3).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33218);assertEquals(baseStr + "[a=<null>]", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33219);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33220);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33221);assertEquals(baseStr + "[a=<Integer>]", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33222);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), false).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33223);assertEquals(baseStr + "[a=[]]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), true).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33224);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), false).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33225);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), true).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33226);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33227);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}
    
    @Test
    public void testObjectBuild() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tvdhb0pn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectBuild",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33228,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tvdhb0pn0(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33228);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33229);final Integer i3 = Integer.valueOf(3);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33230);final Integer i4 = Integer.valueOf(4);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33231);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) null).build());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33232);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(i3).build());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33233);assertEquals(baseStr + "[a=<null>]", new ToStringBuilder(base).append("a", (Object) null).build());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33234);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", i3).build());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33235);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", i3).append("b", i4).build());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33236);assertEquals(baseStr + "[a=<Integer>]", new ToStringBuilder(base).append("a", i3, false).build());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33237);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), false).build());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33238);assertEquals(baseStr + "[a=[]]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), true).build());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33239);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), false).build());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33240);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), true).build());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33241);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", (Object) new String[0], false).build());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33242);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", (Object) new String[0], true).build());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xsq9mzpnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33243,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xsq9mzpnf(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33243);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33244);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(3L).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33245);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33246);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @SuppressWarnings("cast") // cast is not really needed, keep for consistency
    @Test
    public void testInt() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28s3xd0pnj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33247,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28s3xd0pnj(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33247);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33248);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append((int) 3).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33249);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", (int) 3).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33250);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", (int) 3).append("b", (int) 4).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testShort() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2exs2r3pnn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33251,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2exs2r3pnn(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33251);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33252);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append((short) 3).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33253);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", (short) 3).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33254);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", (short) 3).append("b", (short) 4).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testChar() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d2kz0vpnr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33255,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d2kz0vpnr(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33255);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33256);assertEquals(baseStr + "[A]", new ToStringBuilder(base).append((char) 65).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33257);assertEquals(baseStr + "[a=A]", new ToStringBuilder(base).append("a", (char) 65).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33258);assertEquals(baseStr + "[a=A,b=B]", new ToStringBuilder(base).append("a", (char) 65).append("b", (char) 66).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testByte() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22w26nzpnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33259,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22w26nzpnv(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33259);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33260);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append((byte) 3).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33261);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", (byte) 3).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33262);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", (byte) 3).append("b", (byte) 4).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testDouble() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23hfze2pnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33263,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23hfze2pnz(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33263);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33264);assertEquals(baseStr + "[3.2]", new ToStringBuilder(base).append((double) 3.2).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33265);assertEquals(baseStr + "[a=3.2]", new ToStringBuilder(base).append("a", (double) 3.2).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33266);assertEquals(baseStr + "[a=3.2,b=4.3]", new ToStringBuilder(base).append("a", (double) 3.2).append("b", (double) 4.3).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testFloat() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tuf8q9po3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33267,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tuf8q9po3(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33267);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33268);assertEquals(baseStr + "[3.2]", new ToStringBuilder(base).append((float) 3.2).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33269);assertEquals(baseStr + "[a=3.2]", new ToStringBuilder(base).append("a", (float) 3.2).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33270);assertEquals(baseStr + "[a=3.2,b=4.3]", new ToStringBuilder(base).append("a", (float) 3.2).append("b", (float) 4.3).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testBoolean() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33271);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a9awn1po7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33271,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a9awn1po7(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33271);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33272);assertEquals(baseStr + "[true]", new ToStringBuilder(base).append(true).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33273);assertEquals(baseStr + "[a=true]", new ToStringBuilder(base).append("a", true).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33274);assertEquals(baseStr + "[a=true,b=false]", new ToStringBuilder(base).append("a", true).append("b", false).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}


    @Test
    public void testObjectArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oi04a7pob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33275,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oi04a7pob(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33275);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33276);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33277);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33278);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33279);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33280);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33281);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2if58i6poi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33282,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2if58i6poi(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33282);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33283);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33284);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33285);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33286);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33287);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33288);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testIntArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28w0so3pop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testIntArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33289,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28w0so3pop(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33289);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33290);int[] array = new int[] {1, 2, -3, 4};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33291);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33292);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33293);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33294);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33295);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testShortArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nqn45ypow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33296,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nqn45ypow(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33296);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33297);short[] array = new short[] {1, 2, -3, 4};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33298);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33299);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33300);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33301);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33302);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testByteArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mhe7kqpp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33303,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mhe7kqpp3(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33303);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33304);byte[] array = new byte[] {1, 2, -3, 4};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33305);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33306);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33307);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33308);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33309);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testCharArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w0bza0ppa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33310,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w0bza0ppa(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33310);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33311);char[] array = new char[] {'A', '2', '_', 'D'};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33312);assertEquals(baseStr + "[{A,2,_,D}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33313);assertEquals(baseStr + "[{A,2,_,D}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33314);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33315);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33316);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testDoubleArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m6ks4jpph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testDoubleArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33317,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m6ks4jpph(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33317);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33318);double[] array = new double[] {1.0, 2.9876, -3.00001, 4.3};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33319);assertEquals(baseStr + "[{1.0,2.9876,-3.00001,4.3}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33320);assertEquals(baseStr + "[{1.0,2.9876,-3.00001,4.3}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33321);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33322);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33323);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testFloatArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2maw6iyppo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testFloatArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33324,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2maw6iyppo(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33324);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33325);float[] array = new float[] {1.0f, 2.9876f, -3.00001f, 4.3f};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33326);assertEquals(baseStr + "[{1.0,2.9876,-3.00001,4.3}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33327);assertEquals(baseStr + "[{1.0,2.9876,-3.00001,4.3}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33328);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33329);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33330);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testBooleanArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21rzd0qppv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testBooleanArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33331,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21rzd0qppv(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33331);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33332);boolean[] array = new boolean[] {true, false, false};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33333);assertEquals(baseStr + "[{true,false,false}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33334);assertEquals(baseStr + "[{true,false,false}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33335);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33336);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33337);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xbpkglpq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testLongArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33338,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xbpkglpq2(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33338);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33339);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33340);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33341);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33342);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33343);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33344);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testIntArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b9w6pwpq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testIntArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33345,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b9w6pwpq9(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33345);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33346);int[][] array = new int[][] {{1, 2}, null, {5}};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33347);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33348);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33349);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33350);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33351);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testShortArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zg7rgvpqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testShortArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33352,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zg7rgvpqg(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33352);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33353);short[][] array = new short[][] {{1, 2}, null, {5}};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33354);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33355);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33356);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33357);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33358);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testByteArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qhxe73pqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testByteArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33359,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qhxe73pqn(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33359);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33360);byte[][] array = new byte[][] {{1, 2}, null, {5}};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33361);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33362);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33363);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33364);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33365);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testCharArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33366);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vfxb73pqu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testCharArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33366,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vfxb73pqu(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33366);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33367);char[][] array = new char[][] {{'A', 'B'}, null, {'p'}};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33368);assertEquals(baseStr + "[{{A,B},<null>,{p}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33369);assertEquals(baseStr + "[{{A,B},<null>,{p}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33370);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33371);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33372);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testDoubleArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26vh4xipr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testDoubleArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33373,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26vh4xipr1(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33373);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33374);double[][] array = new double[][] {{1.0, 2.29686}, null, {Double.NaN}};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33375);assertEquals(baseStr + "[{{1.0,2.29686},<null>,{NaN}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33376);assertEquals(baseStr + "[{{1.0,2.29686},<null>,{NaN}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33377);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33378);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33379);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testFloatArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21qywvjpr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testFloatArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33380,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21qywvjpr8(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33380);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33381);float[][] array = new float[][] {{1.0f, 2.29686f}, null, {Float.NaN}};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33382);assertEquals(baseStr + "[{{1.0,2.29686},<null>,{NaN}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33383);assertEquals(baseStr + "[{{1.0,2.29686},<null>,{NaN}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33384);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33385);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33386);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testBooleanArrayArray() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2f2h80tprf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testBooleanArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33387,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2f2h80tprf(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33387);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33388);boolean[][] array = new boolean[][] {{true, false}, null, {false}};
        __CLR4_1_2pfopfol3lqxuik.R.inc(33389);assertEquals(baseStr + "[{{true,false},<null>,{false}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33390);assertEquals(baseStr + "[{{true,false},<null>,{false}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33391);array = null;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33392);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33393);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    @Test
    public void testObjectCycle() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dyh318prm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testObjectCycle",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33394,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dyh318prm(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33394);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33395);final ObjectCycle a = new ObjectCycle();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33396);final ObjectCycle b = new ObjectCycle();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33397);a.obj = b;
        __CLR4_1_2pfopfol3lqxuik.R.inc(33398);b.obj = a;

        __CLR4_1_2pfopfol3lqxuik.R.inc(33399);final String expected = toBaseString(a) + "[" + toBaseString(b) + "[" + toBaseString(a) + "]]";
        __CLR4_1_2pfopfol3lqxuik.R.inc(33400);assertEquals(expected, a.toString());
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    static class ObjectCycle {
        Object obj;

        @Override
        public String toString() {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33401);
            __CLR4_1_2pfopfol3lqxuik.R.inc(33402);return new ToStringBuilder(this).append(obj).toString();
        }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}
    }

    @Test
    public void testSimpleReflectionStatics() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ud4737prv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testSimpleReflectionStatics",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33403,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ud4737prv(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33403);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33404);final SimpleReflectionStaticFieldsFixture instance1 = new SimpleReflectionStaticFieldsFixture();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33405);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345]",
            ReflectionToStringBuilder.toString(instance1, null, false, true, SimpleReflectionStaticFieldsFixture.class));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33406);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345]",
            ReflectionToStringBuilder.toString(instance1, null, true, true, SimpleReflectionStaticFieldsFixture.class));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33407);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345]",
            this.toStringWithStatics(instance1, null, SimpleReflectionStaticFieldsFixture.class));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33408);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345]",
            this.toStringWithStatics(instance1, null, SimpleReflectionStaticFieldsFixture.class));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Tests ReflectionToStringBuilder.toString() for statics.
     */
    @Test
    public void testReflectionStatics() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ase6flps1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionStatics",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33409,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ase6flps1(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33409);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33410);final ReflectionStaticFieldsFixture instance1 = new ReflectionStaticFieldsFixture();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33411);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345,instanceString=instanceString,instanceInt=67890]",
            ReflectionToStringBuilder.toString(instance1, null, false, true, ReflectionStaticFieldsFixture.class));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33412);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345,staticTransientString=staticTransientString,staticTransientInt=54321,instanceString=instanceString,instanceInt=67890,transientString=transientString,transientInt=98765]",
            ReflectionToStringBuilder.toString(instance1, null, true, true, ReflectionStaticFieldsFixture.class));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33413);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345,instanceString=instanceString,instanceInt=67890]",
            this.toStringWithStatics(instance1, null, ReflectionStaticFieldsFixture.class));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33414);assertEquals(
            this.toBaseString(instance1) + "[staticString=staticString,staticInt=12345,instanceString=instanceString,instanceInt=67890]",
            this.toStringWithStatics(instance1, null, ReflectionStaticFieldsFixture.class));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Tests ReflectionToStringBuilder.toString() for statics.
     */
    @Test
    public void testInheritedReflectionStatics() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xfj72xps7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testInheritedReflectionStatics",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33415,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xfj72xps7(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33415);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33416);final InheritedReflectionStaticFieldsFixture instance1 = new InheritedReflectionStaticFieldsFixture();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33417);assertEquals(
            this.toBaseString(instance1) + "[staticString2=staticString2,staticInt2=67890]",
            ReflectionToStringBuilder.toString(instance1, null, false, true, InheritedReflectionStaticFieldsFixture.class));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33418);assertEquals(
            this.toBaseString(instance1) + "[staticString2=staticString2,staticInt2=67890,staticString=staticString,staticInt=12345]",
            ReflectionToStringBuilder.toString(instance1, null, false, true, SimpleReflectionStaticFieldsFixture.class));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33419);assertEquals(
            this.toBaseString(instance1) + "[staticString2=staticString2,staticInt2=67890,staticString=staticString,staticInt=12345]",
            this.toStringWithStatics(instance1, null, SimpleReflectionStaticFieldsFixture.class));
        __CLR4_1_2pfopfol3lqxuik.R.inc(33420);assertEquals(
            this.toBaseString(instance1) + "[staticString2=staticString2,staticInt2=67890,staticString=staticString,staticInt=12345]",
            this.toStringWithStatics(instance1, null, SimpleReflectionStaticFieldsFixture.class));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * <p>This method uses reflection to build a suitable
     * <code>toString</code> value which includes static fields.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run
     * under a security manager, if the permissions are not set up correctly.
     * It is also not as efficient as testing explicitly. </p>
     *
     * <p>Transient fields are not output.</p>
     *
     * <p>Superclass fields will be appended up to and including the specified superclass.
     * A null superclass is treated as <code>java.lang.Object</code>.</p>
     *
     * <p>If the style is <code>null</code>, the default
     * <code>ToStringStyle</code> is used.</p>
     *
     * @param object  the Object to be output
     * @param style  the style of the <code>toString</code> to create,
     *  may be <code>null</code>
     * @param reflectUpToClass  the superclass to reflect up to (inclusive),
     *  may be <code>null</code>
     * @return the String result
     * @throws IllegalArgumentException if the Object is <code>null</code>
     */
    public <T> String toStringWithStatics(final T object, final ToStringStyle style, final Class<? super T> reflectUpToClass) {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33421);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33422);return ReflectionToStringBuilder.toString(object, style, false, true, reflectUpToClass);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Tests ReflectionToStringBuilder setUpToClass().
     */
    @Test
    public void test_setUpToClass_valid() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jfw5hrpsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.test_setUpToClass_valid",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33423,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jfw5hrpsf(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33423);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33424);final Integer val = Integer.valueOf(5);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33425);final ReflectionToStringBuilder test = new ReflectionToStringBuilder(val);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33426);test.setUpToClass(Number.class);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33427);test.toString();
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Tests ReflectionToStringBuilder setUpToClass().
     */
    @Test(expected=IllegalArgumentException.class)
    public void test_setUpToClass_invalid() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2c7i6ycpsk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,115,101,116,85,112,84,111,67,108,97,115,115,95,105,110,118,97,108,105,100,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.test_setUpToClass_invalid",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33428,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2c7i6ycpsk(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33428);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33429);final Integer val = Integer.valueOf(5);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33430);final ReflectionToStringBuilder test = new ReflectionToStringBuilder(val);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33431);try {
            __CLR4_1_2pfopfol3lqxuik.R.inc(33432);test.setUpToClass(String.class);
        } finally {
            __CLR4_1_2pfopfol3lqxuik.R.inc(33433);test.toString();
        }
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Tests ReflectionToStringBuilder.toString() for statics.
     */
    class ReflectionStaticFieldsFixture {
        static final String staticString = "staticString";
        static final int staticInt = 12345;
        static final transient String staticTransientString = "staticTransientString";
        static final transient int staticTransientInt = 54321;
        String instanceString = "instanceString";
        int instanceInt = 67890;
        transient String transientString = "transientString";
        transient int transientInt = 98765;
    }

    /**
     * Test fixture for ReflectionToStringBuilder.toString() for statics.
     */
    class SimpleReflectionStaticFieldsFixture {
        static final String staticString = "staticString";
        static final int staticInt = 12345;
    }

    /**
     * Test fixture for ReflectionToStringBuilder.toString() for statics.
     */
    class InheritedReflectionStaticFieldsFixture extends SimpleReflectionStaticFieldsFixture {
        static final String staticString2 = "staticString2";
        static final int staticInt2 = 67890;
    }

    @Test
    public void testReflectionNull() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22l3kgbpsq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testReflectionNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33434,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22l3kgbpsq(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33434);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33435);assertEquals("<null>", ReflectionToStringBuilder.toString(null));
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

    /**
     * Points out failure to print anything from appendToString methods using MULTI_LINE_STYLE.
     * See issue LANG-372.
     */
    class MultiLineTestObject {
        Integer i = Integer.valueOf(31337);
        @Override
        public String toString() {try{__CLR4_1_2pfopfol3lqxuik.R.inc(33436);
            __CLR4_1_2pfopfol3lqxuik.R.inc(33437);return new ToStringBuilder(this).append("testInt", i).toString();
        }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}
    }

    @Test
    public void testAppendToStringUsingMultiLineStyle() {__CLR4_1_2pfopfol3lqxuik.R.globalSliceStart(getClass().getName(),33438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pmlq21psu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pfopfol3lqxuik.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pfopfol3lqxuik.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringBuilderTest.testAppendToStringUsingMultiLineStyle",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33438,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pmlq21psu(){try{__CLR4_1_2pfopfol3lqxuik.R.inc(33438);
        __CLR4_1_2pfopfol3lqxuik.R.inc(33439);final MultiLineTestObject obj = new MultiLineTestObject();
        __CLR4_1_2pfopfol3lqxuik.R.inc(33440);final ToStringBuilder testBuilder = new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                                          .appendToString(obj.toString());
        __CLR4_1_2pfopfol3lqxuik.R.inc(33441);assertEquals(testBuilder.toString().indexOf("testInt=31337"), -1);
    }finally{__CLR4_1_2pfopfol3lqxuik.R.flushNeeded();}}

}
