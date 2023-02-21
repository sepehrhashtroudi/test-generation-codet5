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

package org.apache.commons.lang3;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Tests ArrayUtils remove and removeElement methods.
 * 
 * @version $Id$
 */
public class ArrayUtilsRemoveMultipleTest {static class __CLR4_1_2f8lf8ll3lqxt91{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,20579,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testRemoveAllObjectArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2f82h56f8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19749,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2f82h56f8l(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19749);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19750);Object[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19751);array = ArrayUtils.removeAll(new Object[] { "a" }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19752);assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19753);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19754);array = ArrayUtils.removeAll(new Object[] { "a", "b" }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19755);assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19756);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19757);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c" }, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19758);assertArrayEquals(new Object[] { "a" }, array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19759);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19760);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19761);assertArrayEquals(new Object[] { "a", "d" }, array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19762);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19763);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 0, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19764);assertArrayEquals(new Object[] { "b", "c" }, array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19765);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19766);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 0, 1, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19767);assertArrayEquals(new Object[] { "c" }, array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19768);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19769);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d", "e" }, 0, 1, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19770);assertArrayEquals(new Object[] { "c", "e" }, array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19771);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19772);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d", "e" }, 0, 2, 4);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19773);assertArrayEquals(new Object[] { "b", "d" }, array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19774);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19775);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 0, 1, 3, 0, 1, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19776);assertArrayEquals(new Object[] { "c" }, array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19777);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19778);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 2, 1, 0, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19779);assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19780);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19781);array = ArrayUtils.removeAll(new Object[] { "a", "b", "c", "d" }, 2, 0, 1, 3, 0, 2, 1, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19782);assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19783);assertEquals(Object.class, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllObjectArrayRemoveNone() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cwaidqf9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllObjectArrayRemoveNone",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19784,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cwaidqf9k(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19784);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19785);final Object[] array1 = new Object[] { "foo", "bar", "baz" };
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19786);final Object[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19787);assertNotSame(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19788);assertArrayEquals(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19789);assertEquals(Object.class, array2.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllObjectArrayNegativeIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lc4dt7f9q();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,79,98,106,101,99,116,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllObjectArrayNegativeIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19790,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lc4dt7f9q(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19790);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19791);ArrayUtils.removeAll(new Object[] { "a", "b" }, -1);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllObjectArrayOutOfBoundsIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25fqsxaf9s();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,79,98,106,101,99,116,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllObjectArrayOutOfBoundsIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19792,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25fqsxaf9s(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19792);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19793);ArrayUtils.removeAll(new Object[] { "a", "b" }, 2);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullObjectArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29g77kff9u();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,79,98,106,101,99,116,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19794,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29g77kff9u(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19794);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19795);ArrayUtils.remove((Object[]) null, 0);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllNumberArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jpoa4f9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNumberArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19796,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jpoa4f9w(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19796);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19797);final Number[] inarray = { Integer.valueOf(1), Long.valueOf(2L), Byte.valueOf((byte) 3) };
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19798);assertEquals(3, inarray.length);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19799);Number[] outarray;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19800);outarray = ArrayUtils.removeAll(inarray, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19801);assertArrayEquals(new Number[] { Integer.valueOf(1), Byte.valueOf((byte) 3) }, outarray);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19802);assertEquals(Number.class, outarray.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19803);outarray = ArrayUtils.removeAll(outarray, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19804);assertArrayEquals(new Number[] { Integer.valueOf(1) }, outarray);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19805);assertEquals(Number.class, outarray.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19806);outarray = ArrayUtils.removeAll(outarray, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19807);assertEquals(0, outarray.length);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19808);assertEquals(Number.class, outarray.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19809);outarray = ArrayUtils.removeAll(inarray, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19810);assertArrayEquals(new Number[] { Byte.valueOf((byte) 3) }, outarray);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19811);assertEquals(Number.class, outarray.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19812);outarray = ArrayUtils.removeAll(inarray, 0, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19813);assertArrayEquals(new Number[] { Long.valueOf(2L) }, outarray);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19814);assertEquals(Number.class, outarray.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19815);outarray = ArrayUtils.removeAll(inarray, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19816);assertArrayEquals(new Number[] { Integer.valueOf(1) }, outarray);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19817);assertEquals(Number.class, outarray.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllBooleanArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m5c5mlfai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllBooleanArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19818,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m5c5mlfai(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19818);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19819);boolean[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19820);array = ArrayUtils.removeAll(new boolean[] { true }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19821);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19822);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19823);array = ArrayUtils.removeAll(new boolean[] { true, false }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19824);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19825);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19826);array = ArrayUtils.removeAll(new boolean[] { true, false }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19827);assertTrue(Arrays.equals(new boolean[] { true }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19828);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19829);array = ArrayUtils.removeAll(new boolean[] { true, false, true }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19830);assertTrue(Arrays.equals(new boolean[] { true, true }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19831);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19832);array = ArrayUtils.removeAll(new boolean[] { true, false }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19833);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19834);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19835);array = ArrayUtils.removeAll(new boolean[] { true, false, false }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19836);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19837);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19838);array = ArrayUtils.removeAll(new boolean[] { true, false, false }, 0, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19839);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19840);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19841);array = ArrayUtils.removeAll(new boolean[] { true, false, false }, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19842);assertTrue(Arrays.equals(new boolean[] { true }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19843);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19844);array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true }, 0, 2, 4);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19845);assertTrue(Arrays.equals(new boolean[] { false, false }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19846);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19847);array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true }, 1, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19848);assertTrue(Arrays.equals(new boolean[] { true, true, true }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19849);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19850);array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true }, 1, 3, 4);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19851);assertTrue(Arrays.equals(new boolean[] { true, true }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19852);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19853);array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true, false, true }, 0, 2, 4, 6);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19854);assertTrue(Arrays.equals(new boolean[] { false, false, false }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19855);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19856);array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true, false, true }, 1, 3, 5);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19857);assertTrue(Arrays.equals(new boolean[] { true, true, true, true }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19858);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19859);array = ArrayUtils.removeAll(new boolean[] { true, false, true, false, true, false, true }, 0, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19860);assertTrue(Arrays.equals(new boolean[] { false, true, false, true }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19861);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllBooleanArrayRemoveNone() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21b61a7fbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllBooleanArrayRemoveNone",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19862,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21b61a7fbq(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19862);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19863);final boolean[] array1 = new boolean[] { true, false };
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19864);final boolean[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19865);assertNotSame(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19866);assertTrue(Arrays.equals(array1, array2));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19867);assertEquals(boolean.class, array2.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllBooleanArrayNegativeIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nk9i08fbw();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,66,111,111,108,101,97,110,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllBooleanArrayNegativeIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19868,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nk9i08fbw(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19868);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19869);ArrayUtils.removeAll(new boolean[] { true, false }, -1);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllBooleanArrayOutOfBoundsIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qgy3zvfby();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,66,111,111,108,101,97,110,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllBooleanArrayOutOfBoundsIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19870,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qgy3zvfby(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19870);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19871);ArrayUtils.removeAll(new boolean[] { true, false }, 2);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullBooleanArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wfvknefc0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,66,111,111,108,101,97,110,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullBooleanArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19872,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wfvknefc0(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19872);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19873);ArrayUtils.removeAll((boolean[]) null, 0);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllByteArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bd376bfc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19874,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bd376bfc2(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19874);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19875);byte[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19876);array = ArrayUtils.removeAll(new byte[] { 1 }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19877);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19878);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19879);array = ArrayUtils.removeAll(new byte[] { 1, 2 }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19880);assertTrue(Arrays.equals(new byte[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19881);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19882);array = ArrayUtils.removeAll(new byte[] { 1, 2 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19883);assertTrue(Arrays.equals(new byte[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19884);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19885);array = ArrayUtils.removeAll(new byte[] { 1, 2, 1 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19886);assertTrue(Arrays.equals(new byte[] { 1, 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19887);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19888);array = ArrayUtils.removeAll(new byte[] { 1, 2 }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19889);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19890);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19891);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3 }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19892);assertTrue(Arrays.equals(new byte[] { 3 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19893);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19894);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3 }, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19895);assertTrue(Arrays.equals(new byte[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19896);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19897);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3 }, 0, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19898);assertTrue(Arrays.equals(new byte[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19899);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19900);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3, 4, 5 }, 1, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19901);assertTrue(Arrays.equals(new byte[] { 1, 3, 5 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19902);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19903);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19904);assertTrue(Arrays.equals(new byte[] { 2, 4 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19905);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19906);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19907);assertTrue(Arrays.equals(new byte[] { 1, 3, 5, 7 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19908);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19909);array = ArrayUtils.removeAll(new byte[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19910);assertTrue(Arrays.equals(new byte[] { 2, 4, 6 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19911);assertEquals(Byte.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllByteArrayRemoveNone() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2noxl3rfd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllByteArrayRemoveNone",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19912,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2noxl3rfd4(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19912);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19913);final byte[] array1 = new byte[] { 1, 2 };
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19914);final byte[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19915);assertNotSame(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19916);assertArrayEquals(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19917);assertEquals(byte.class, array2.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllByteArrayNegativeIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24luabmfda();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,66,121,116,101,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllByteArrayNegativeIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19918,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24luabmfda(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19918);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19919);ArrayUtils.removeAll(new byte[] { 1, 2 }, -1);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllByteArrayOutOfBoundsIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2em5g4bfdc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,66,121,116,101,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllByteArrayOutOfBoundsIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19920,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2em5g4bfdc(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19920);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19921);ArrayUtils.removeAll(new byte[] { 1, 2 }, 2);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullByteArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q4wl8mfde();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,66,121,116,101,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19922,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q4wl8mfde(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19922);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19923);ArrayUtils.removeAll((byte[]) null, 0);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllCharArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rwh2apfdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19924,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rwh2apfdg(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19924);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19925);char[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19926);array = ArrayUtils.removeAll(new char[] { 'a' }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19927);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19928);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19929);array = ArrayUtils.removeAll(new char[] { 'a', 'b' }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19930);assertTrue(Arrays.equals(new char[] { 'b' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19931);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19932);array = ArrayUtils.removeAll(new char[] { 'a', 'b' }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19933);assertTrue(Arrays.equals(new char[] { 'a' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19934);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19935);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c' }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19936);assertTrue(Arrays.equals(new char[] { 'a', 'c' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19937);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19938);array = ArrayUtils.removeAll(new char[] { 'a', 'b' }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19939);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19940);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19941);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c' }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19942);assertTrue(Arrays.equals(new char[] { 'c' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19943);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19944);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c' }, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19945);assertTrue(Arrays.equals(new char[] { 'a' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19946);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19947);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c' }, 0, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19948);assertTrue(Arrays.equals(new char[] { 'b' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19949);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19950);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c', 'd', 'e' }, 1, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19951);assertTrue(Arrays.equals(new char[] { 'a', 'c', 'e' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19952);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19953);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c', 'd', 'e' }, 0, 2, 4);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19954);assertTrue(Arrays.equals(new char[] { 'b', 'd' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19955);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19956);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g' }, 1, 3, 5);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19957);assertTrue(Arrays.equals(new char[] { 'a', 'c', 'e', 'g' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19958);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19959);array = ArrayUtils.removeAll(new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g' }, 0, 2, 4, 6);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19960);assertTrue(Arrays.equals(new char[] { 'b', 'd', 'f' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19961);assertEquals(Character.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllCharArrayRemoveNone() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_233c291fei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllCharArrayRemoveNone",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19962,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_233c291fei(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19962);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19963);final char[] array1 = new char[] { 'a', 'b' };
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19964);final char[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19965);assertNotSame(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19966);assertArrayEquals(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19967);assertEquals(char.class, array2.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllCharArrayNegativeIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2isjnhwfeo();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,67,104,97,114,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllCharArrayNegativeIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19968,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2isjnhwfeo(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19968);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19969);ArrayUtils.removeAll(new char[] { 'a', 'b' }, -1);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllCharArrayOutOfBoundsIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19970);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22z052hfeq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,67,104,97,114,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllCharArrayOutOfBoundsIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19970,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22z052hfeq(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19970);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19971);ArrayUtils.removeAll(new char[] { 'a', 'b' }, 2);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullCharArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29liq48fes();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,67,104,97,114,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19972,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29liq48fes(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19972);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19973);ArrayUtils.removeAll((char[]) null, 0);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllDoubleArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),19974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_294gof8feu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllDoubleArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19974,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_294gof8feu(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(19974);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19975);double[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19976);array = ArrayUtils.removeAll(new double[] { 1 }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19977);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19978);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19979);array = ArrayUtils.removeAll(new double[] { 1, 2 }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19980);assertTrue(Arrays.equals(new double[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19981);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19982);array = ArrayUtils.removeAll(new double[] { 1, 2 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19983);assertTrue(Arrays.equals(new double[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19984);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19985);array = ArrayUtils.removeAll(new double[] { 1, 2, 1 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19986);assertTrue(Arrays.equals(new double[] { 1, 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19987);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19988);array = ArrayUtils.removeAll(new double[] { 1, 2 }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19989);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19990);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19991);array = ArrayUtils.removeAll(new double[] { 1, 2, 3 }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19992);assertTrue(Arrays.equals(new double[] { 3 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19993);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19994);array = ArrayUtils.removeAll(new double[] { 1, 2, 3 }, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19995);assertTrue(Arrays.equals(new double[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19996);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19997);array = ArrayUtils.removeAll(new double[] { 1, 2, 3 }, 0, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19998);assertTrue(Arrays.equals(new double[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(19999);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20000);array = ArrayUtils.removeAll(new double[] { 1, 2, 3, 4, 5 }, 1, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20001);assertTrue(Arrays.equals(new double[] { 1, 3, 5 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20002);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20003);array = ArrayUtils.removeAll(new double[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20004);assertTrue(Arrays.equals(new double[] { 2, 4 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20005);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20006);array = ArrayUtils.removeAll(new double[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20007);assertTrue(Arrays.equals(new double[] { 1, 3, 5, 7 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20008);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20009);array = ArrayUtils.removeAll(new double[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20010);assertTrue(Arrays.equals(new double[] { 2, 4, 6 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20011);assertEquals(Double.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllDoubleArrayRemoveNone() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hgwg80ffw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllDoubleArrayRemoveNone",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20012,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hgwg80ffw(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20012);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20013);final double[] array1 = new double[] { 1, 2 };
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20014);final double[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20015);assertNotSame(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20016);assertTrue(Arrays.equals(array1, array2));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20017);assertEquals(double.class, array2.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllDoubleArrayNegativeIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22y2jvdfg2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,68,111,117,98,108,101,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllDoubleArrayNegativeIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20018,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22y2jvdfg2(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20018);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20019);ArrayUtils.removeAll(new double[] { 1, 2 }, -1);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllDoubleArrayOutOfBoundsIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29jqme4fg4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,68,111,117,98,108,101,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllDoubleArrayOutOfBoundsIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20020,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29jqme4fg4(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20020);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20021);ArrayUtils.removeAll(new double[] { 1, 2 }, 2);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullDoubleArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xsqd4tfg6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,68,111,117,98,108,101,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullDoubleArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20022,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xsqd4tfg6(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20022);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20023);ArrayUtils.removeAll((double[]) null, 0);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllFloatArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wqz3zlfg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllFloatArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20024,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wqz3zlfg8(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20024);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20025);float[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20026);array = ArrayUtils.removeAll(new float[] { 1 }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20027);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20028);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20029);array = ArrayUtils.removeAll(new float[] { 1, 2 }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20030);assertTrue(Arrays.equals(new float[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20031);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20032);array = ArrayUtils.removeAll(new float[] { 1, 2 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20033);assertTrue(Arrays.equals(new float[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20034);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20035);array = ArrayUtils.removeAll(new float[] { 1, 2, 1 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20036);assertTrue(Arrays.equals(new float[] { 1, 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20037);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20038);array = ArrayUtils.removeAll(new float[] { 1, 2 }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20039);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20040);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20041);array = ArrayUtils.removeAll(new float[] { 1, 2, 3 }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20042);assertTrue(Arrays.equals(new float[] { 3 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20043);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20044);array = ArrayUtils.removeAll(new float[] { 1, 2, 3 }, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20045);assertTrue(Arrays.equals(new float[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20046);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20047);array = ArrayUtils.removeAll(new float[] { 1, 2, 3 }, 0, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20048);assertTrue(Arrays.equals(new float[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20049);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20050);array = ArrayUtils.removeAll(new float[] { 1, 2, 3, 4, 5 }, 1, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20051);assertTrue(Arrays.equals(new float[] { 1, 3, 5 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20052);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20053);array = ArrayUtils.removeAll(new float[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20054);assertTrue(Arrays.equals(new float[] { 2, 4 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20055);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20056);array = ArrayUtils.removeAll(new float[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20057);assertTrue(Arrays.equals(new float[] { 1, 3, 5, 7 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20058);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20059);array = ArrayUtils.removeAll(new float[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20060);assertTrue(Arrays.equals(new float[] { 2, 4, 6 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20061);assertEquals(Float.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllFloatArrayRemoveNone() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20062);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rbqir9fha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllFloatArrayRemoveNone",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20062,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rbqir9fha(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20062);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20063);final float[] array1 = new float[] { 1, 2 };
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20064);final float[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20065);assertNotSame(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20066);assertTrue(Arrays.equals(array1, array2));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20067);assertEquals(float.class, array2.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllFloatArrayNegativeIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22rgq58fhg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,70,108,111,97,116,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllFloatArrayNegativeIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20068,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22rgq58fhg(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20068);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20069);ArrayUtils.removeAll(new float[] { 1, 2 }, -1);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllFloatArrayOutOfBoundsIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n4r3qxfhi();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,70,108,111,97,116,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllFloatArrayOutOfBoundsIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20070,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n4r3qxfhi(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20070);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20071);ArrayUtils.removeAll(new float[] { 1, 2 }, 2);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullFloatArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26qyiqyfhk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,70,108,111,97,116,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullFloatArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20072,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26qyiqyfhk(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20072);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20073);ArrayUtils.removeAll((float[]) null, 0);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllIntArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g4ebgcfhm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllIntArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20074,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g4ebgcfhm(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20074);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20075);int[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20076);array = ArrayUtils.removeAll(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.EMPTY_INT_ARRAY);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20077);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20078);array = ArrayUtils.removeAll(new int[] { 1 }, ArrayUtils.EMPTY_INT_ARRAY);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20079);assertTrue(Arrays.equals(new int[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20080);array = ArrayUtils.removeAll(new int[] { 1 }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20081);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20082);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20083);array = ArrayUtils.removeAll(new int[] { 1, 2 }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20084);assertTrue(Arrays.equals(new int[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20085);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20086);array = ArrayUtils.removeAll(new int[] { 1, 2 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20087);assertTrue(Arrays.equals(new int[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20088);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20089);array = ArrayUtils.removeAll(new int[] { 1, 2, 1 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20090);assertTrue(Arrays.equals(new int[] { 1, 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20091);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20092);array = ArrayUtils.removeAll(new int[] { 1, 2 }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20093);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20094);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20095);array = ArrayUtils.removeAll(new int[] { 1, 2, 3 }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20096);assertTrue(Arrays.equals(new int[] { 3 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20097);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20098);array = ArrayUtils.removeAll(new int[] { 1, 2, 3 }, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20099);assertTrue(Arrays.equals(new int[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20100);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20101);array = ArrayUtils.removeAll(new int[] { 1, 2, 3 }, 0, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20102);assertTrue(Arrays.equals(new int[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20103);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20104);array = ArrayUtils.removeAll(new int[] { 1, 2, 3, 4, 5 }, 1, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20105);assertTrue(Arrays.equals(new int[] { 1, 3, 5 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20106);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20107);array = ArrayUtils.removeAll(new int[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20108);assertTrue(Arrays.equals(new int[] { 2, 4 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20109);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20110);array = ArrayUtils.removeAll(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20111);assertTrue(Arrays.equals(new int[] { 1, 3, 5, 7 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20112);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20113);array = ArrayUtils.removeAll(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20114);assertTrue(Arrays.equals(new int[] { 2, 4, 6 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20115);assertEquals(Integer.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllIntArrayRemoveNone() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xeacvsfis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllIntArrayRemoveNone",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20116,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xeacvsfis(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20116);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20117);final int[] array1 = new int[] { 1, 2 };
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20118);final int[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20119);assertNotSame(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20120);assertArrayEquals(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20121);assertEquals(int.class, array2.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllIntArrayNegativeIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gftzw1fiy();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,73,110,116,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllIntArrayNegativeIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20122,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gftzw1fiy(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20122);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20123);ArrayUtils.removeAll(new int[] { 1, 2 }, -1);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllIntArrayOutOfBoundsIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28ebn0sfj0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,73,110,116,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllIntArrayOutOfBoundsIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20124,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28ebn0sfj0(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20124);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20125);ArrayUtils.removeAll(new int[] { 1, 2 }, 2);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullIntArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o7epc3fj2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,73,110,116,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullIntArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20126,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o7epc3fj2(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20126);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20127);ArrayUtils.removeAll((int[]) null, 0);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllLongArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27au83rfj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20128,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27au83rfj4(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20128);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20129);long[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20130);array = ArrayUtils.removeAll(new long[] { 1 }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20131);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20132);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20133);array = ArrayUtils.removeAll(new long[] { 1, 2 }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20134);assertTrue(Arrays.equals(new long[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20135);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20136);array = ArrayUtils.removeAll(new long[] { 1, 2 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20137);assertTrue(Arrays.equals(new long[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20138);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20139);array = ArrayUtils.removeAll(new long[] { 1, 2, 1 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20140);assertTrue(Arrays.equals(new long[] { 1, 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20141);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20142);array = ArrayUtils.removeAll(new long[] { 1, 2 }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20143);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20144);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20145);array = ArrayUtils.removeAll(new long[] { 1, 2, 3 }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20146);assertTrue(Arrays.equals(new long[] { 3 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20147);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20148);array = ArrayUtils.removeAll(new long[] { 1, 2, 3 }, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20149);assertTrue(Arrays.equals(new long[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20150);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20151);array = ArrayUtils.removeAll(new long[] { 1, 2, 3 }, 0, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20152);assertTrue(Arrays.equals(new long[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20153);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20154);array = ArrayUtils.removeAll(new long[] { 1, 2, 3, 4, 5 }, 1, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20155);assertTrue(Arrays.equals(new long[] { 1, 3, 5 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20156);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20157);array = ArrayUtils.removeAll(new long[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20158);assertTrue(Arrays.equals(new long[] { 2, 4 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20159);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20160);array = ArrayUtils.removeAll(new long[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20161);assertTrue(Arrays.equals(new long[] { 1, 3, 5, 7 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20162);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20163);array = ArrayUtils.removeAll(new long[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20164);assertTrue(Arrays.equals(new long[] { 2, 4, 6 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20165);assertEquals(Long.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllLongArrayRemoveNone() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yvavt7fk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllLongArrayRemoveNone",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20166,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yvavt7fk6(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20166);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20167);final long[] array1 = new long[] { 1, 2 };
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20168);final long[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20169);assertNotSame(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20170);assertArrayEquals(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20171);assertEquals(long.class, array2.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllLongArrayNegativeIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gg7rxufkc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,76,111,110,103,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllLongArrayNegativeIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20172,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gg7rxufkc(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20172);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20173);ArrayUtils.removeAll(new long[] { 1, 2 }, -1);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllLongArrayOutOfBoundsIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ox85gxfke();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,76,111,110,103,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllLongArrayOutOfBoundsIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20174,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ox85gxfke(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20174);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20175);ArrayUtils.removeAll(new long[] { 1, 2 }, 2);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullLongArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2u75kb6fkg();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,76,111,110,103,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20176,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2u75kb6fkg(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20176);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20177);ArrayUtils.removeAll((long[]) null, 0);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllShortArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dak6pbfki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20178,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dak6pbfki(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20178);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20179);short[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20180);array = ArrayUtils.removeAll(new short[] { 1 }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20181);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20182);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20183);array = ArrayUtils.removeAll(new short[] { 1, 2 }, 0);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20184);assertTrue(Arrays.equals(new short[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20185);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20186);array = ArrayUtils.removeAll(new short[] { 1, 2 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20187);assertTrue(Arrays.equals(new short[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20188);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20189);array = ArrayUtils.removeAll(new short[] { 1, 2, 1 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20190);assertTrue(Arrays.equals(new short[] { 1, 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20191);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20192);array = ArrayUtils.removeAll(new short[] { 1, 2 }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20193);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20194);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20195);array = ArrayUtils.removeAll(new short[] { 1, 2, 3 }, 0, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20196);assertTrue(Arrays.equals(new short[] { 3 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20197);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20198);array = ArrayUtils.removeAll(new short[] { 1, 2, 3 }, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20199);assertTrue(Arrays.equals(new short[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20200);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20201);array = ArrayUtils.removeAll(new short[] { 1, 2, 3 }, 0, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20202);assertTrue(Arrays.equals(new short[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20203);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20204);array = ArrayUtils.removeAll(new short[] { 1, 2, 3, 4, 5 }, 1, 3);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20205);assertTrue(Arrays.equals(new short[] { 1, 3, 5 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20206);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20207);array = ArrayUtils.removeAll(new short[] { 1, 2, 3, 4, 5 }, 0, 2, 4);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20208);assertTrue(Arrays.equals(new short[] { 2, 4 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20209);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20210);array = ArrayUtils.removeAll(new short[] { 1, 2, 3, 4, 5, 6, 7 }, 1, 3, 5);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20211);assertTrue(Arrays.equals(new short[] { 1, 3, 5, 7 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20212);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20213);array = ArrayUtils.removeAll(new short[] { 1, 2, 3, 4, 5, 6, 7 }, 0, 2, 4, 6);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20214);assertTrue(Arrays.equals(new short[] { 2, 4, 6 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20215);assertEquals(Short.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveAllShortArrayRemoveNone() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b6gynfflk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllShortArrayRemoveNone",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20216,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b6gynfflk(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20216);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20217);final short[] array1 = new short[] { 1, 2 };
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20218);final short[] array2 = ArrayUtils.removeAll(array1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20219);assertNotSame(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20220);assertArrayEquals(array1, array2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20221);assertEquals(short.class, array2.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllShortArrayNegativeIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kurb0kflq();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,83,104,111,114,116,65,114,114,97,121,78,101,103,97,116,105,118,101,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllShortArrayNegativeIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20222,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kurb0kflq(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20222);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20223);ArrayUtils.removeAll(new short[] { 1, 2 }, -1, 0);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllShortArrayOutOfBoundsIndex() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ps43dzfls();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,83,104,111,114,116,65,114,114,97,121,79,117,116,79,102,66,111,117,110,100,115,73,110,100,101,120,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllShortArrayOutOfBoundsIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20224,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ps43dzfls(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20224);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20225);ArrayUtils.removeAll(new short[] { 1, 2 }, 2, 0);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAllNullShortArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vqja16flu();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,65,108,108,78,117,108,108,83,104,111,114,116,65,114,114,97,121,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveAllNullShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20226,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vqja16flu(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20226);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20227);ArrayUtils.removeAll((short[]) null, 0);
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveElementsObjectArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pgd69gflw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementsObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20228,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pgd69gflw(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20228);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20229);Object[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20230);array = ArrayUtils.removeElements((Object[]) null, "a");
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20231);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20232);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_OBJECT_ARRAY, "a");
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20233);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20234);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20235);array = ArrayUtils.removeElements(new Object[] { "a" }, "a");
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20236);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20237);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20238);array = ArrayUtils.removeElements(new Object[] { "a", "b" }, "a");
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20239);assertTrue(Arrays.equals(new Object[] { "b" }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20240);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20241);array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a");
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20242);assertTrue(Arrays.equals(new Object[] { "b", "a" }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20243);assertEquals(Object.class, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20244);array = ArrayUtils.removeElements((Object[]) null, "a", "b");
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20245);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20246);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_OBJECT_ARRAY, "a", "b");
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20247);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20248);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20249);array = ArrayUtils.removeElements(new Object[] { "a" }, "a", "b");
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20250);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20251);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20252);array = ArrayUtils.removeElements(new Object[] { "a", "b" }, "a", "c");
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20253);assertTrue(Arrays.equals(new Object[] { "b" }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20254);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20255);array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a");
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20256);assertTrue(Arrays.equals(new Object[] { "b", "a" }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20257);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20258);array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a", "b");
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20259);assertTrue(Arrays.equals(new Object[] { "a" }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20260);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20261);array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a", "a");
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20262);assertTrue(Arrays.equals(new Object[] { "b" }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20263);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20264);array = ArrayUtils.removeElements(new Object[] { "a", "b", "a" }, "a", "a", "a", "a");
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20265);assertTrue(Arrays.equals(new Object[] { "b" }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20266);assertEquals(Object.class, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveElementBooleanArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2l0d7gifmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementBooleanArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20267,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2l0d7gifmz(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20267);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20268);boolean[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20269);array = ArrayUtils.removeElements((boolean[]) null, true);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20270);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20271);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_BOOLEAN_ARRAY, true);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20272);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20273);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20274);array = ArrayUtils.removeElements(new boolean[] { true }, true);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20275);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20276);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20277);array = ArrayUtils.removeElements(new boolean[] { true, false }, true);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20278);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20279);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20280);array = ArrayUtils.removeElements(new boolean[] { true, false, true }, true);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20281);assertTrue(Arrays.equals(new boolean[] { false, true }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20282);assertEquals(Boolean.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20283);array = ArrayUtils.removeElements((boolean[]) null, true, false);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20284);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20285);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_BOOLEAN_ARRAY, true, false);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20286);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20287);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20288);array = ArrayUtils.removeElements(new boolean[] { true }, true, false);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20289);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20290);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20291);array = ArrayUtils.removeElements(new boolean[] { true, false }, true, false);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20292);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20293);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20294);array = ArrayUtils.removeElements(new boolean[] { true, false }, true, true);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20295);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20296);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20297);array = ArrayUtils.removeElements(new boolean[] { true, false, true }, true, false);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20298);assertTrue(Arrays.equals(new boolean[] { true }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20299);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20300);array = ArrayUtils.removeElements(new boolean[] { true, false, true }, true, true);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20301);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20302);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20303);array = ArrayUtils.removeElements(new boolean[] { true, false, true }, true, true, true, true);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20304);assertTrue(Arrays.equals(new boolean[] { false }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20305);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveElementByteArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sz2coefo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20306,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sz2coefo2(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20306);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20307);byte[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20308);array = ArrayUtils.removeElements((byte[]) null, (byte) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20309);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20310);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_BYTE_ARRAY, (byte) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20311);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20312);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20313);array = ArrayUtils.removeElements(new byte[] { 1 }, (byte) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20314);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20315);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20316);array = ArrayUtils.removeElements(new byte[] { 1, 2 }, (byte) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20317);assertTrue(Arrays.equals(new byte[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20318);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20319);array = ArrayUtils.removeElements(new byte[] { 1, 2, 1 }, (byte) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20320);assertTrue(Arrays.equals(new byte[] { 2, 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20321);assertEquals(Byte.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20322);array = ArrayUtils.removeElements((byte[]) null, (byte) 1, (byte) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20323);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20324);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_BYTE_ARRAY, (byte) 1, (byte) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20325);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20326);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20327);array = ArrayUtils.removeElements(new byte[] { 1 }, (byte) 1, (byte) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20328);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20329);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20330);array = ArrayUtils.removeElements(new byte[] { 1, 2 }, (byte) 1, (byte) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20331);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20332);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20333);array = ArrayUtils.removeElements(new byte[] { 1, 2 }, (byte) 1, (byte) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20334);assertTrue(Arrays.equals(new byte[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20335);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20336);array = ArrayUtils.removeElements(new byte[] { 1, 2, 1 }, (byte) 1, (byte) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20337);assertTrue(Arrays.equals(new byte[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20338);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20339);array = ArrayUtils.removeElements(new byte[] { 1, 2, 1 }, (byte) 1, (byte) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20340);assertTrue(Arrays.equals(new byte[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20341);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20342);array = ArrayUtils.removeElements(new byte[] { 1, 2, 1 }, (byte) 1, (byte) 1, (byte) 1, (byte) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20343);assertTrue(Arrays.equals(new byte[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20344);assertEquals(Byte.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveElementCharArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pinu6cfp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20345,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pinu6cfp5(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20345);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20346);char[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20347);array = ArrayUtils.removeElements((char[]) null, 'a');
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20348);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20349);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_CHAR_ARRAY, 'a');
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20350);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20351);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20352);array = ArrayUtils.removeElements(new char[] { 'a' }, 'a');
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20353);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20354);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20355);array = ArrayUtils.removeElements(new char[] { 'a', 'b' }, 'a');
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20356);assertTrue(Arrays.equals(new char[] { 'b' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20357);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20358);array = ArrayUtils.removeElements(new char[] { 'a', 'b', 'a' }, 'a');
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20359);assertTrue(Arrays.equals(new char[] { 'b', 'a' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20360);assertEquals(Character.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20361);array = ArrayUtils.removeElements((char[]) null, 'a', 'b');
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20362);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20363);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_CHAR_ARRAY, 'a', 'b');
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20364);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20365);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20366);array = ArrayUtils.removeElements(new char[] { 'a' }, 'a', 'b');
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20367);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20368);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20369);array = ArrayUtils.removeElements(new char[] { 'a', 'b' }, 'a', 'b');
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20370);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20371);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20372);array = ArrayUtils.removeElements(new char[] { 'a', 'b' }, 'a', 'a');
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20373);assertTrue(Arrays.equals(new char[] { 'b' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20374);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20375);array = ArrayUtils.removeElements(new char[] { 'a', 'b', 'a' }, 'a', 'b');
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20376);assertTrue(Arrays.equals(new char[] { 'a' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20377);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20378);array = ArrayUtils.removeElements(new char[] { 'a', 'b', 'a' }, 'a', 'a');
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20379);assertTrue(Arrays.equals(new char[] { 'b' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20380);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20381);array = ArrayUtils.removeElements(new char[] { 'a', 'b', 'a' }, 'a', 'a', 'a', 'a');
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20382);assertTrue(Arrays.equals(new char[] { 'b' }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20383);assertEquals(Character.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast")
    public void testRemoveElementDoubleArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_296456ffq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementDoubleArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20384,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_296456ffq8(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20384);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20385);double[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20386);array = ArrayUtils.removeElements((double[]) null, (double) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20387);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20388);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_DOUBLE_ARRAY, (double) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20389);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20390);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20391);array = ArrayUtils.removeElements(new double[] { 1 }, (double) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20392);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20393);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20394);array = ArrayUtils.removeElements(new double[] { 1, 2 }, (double) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20395);assertTrue(Arrays.equals(new double[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20396);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20397);array = ArrayUtils.removeElements(new double[] { 1, 2, 1 }, (double) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20398);assertTrue(Arrays.equals(new double[] { 2, 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20399);assertEquals(Double.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20400);array = ArrayUtils.removeElements((double[]) null, (double) 1, (double) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20401);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20402);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_DOUBLE_ARRAY, (double) 1, (double) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20403);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20404);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20405);array = ArrayUtils.removeElements(new double[] { 1 }, (double) 1, (double) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20406);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20407);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20408);array = ArrayUtils.removeElements(new double[] { 1, 2 }, (double) 1, (double) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20409);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20410);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20411);array = ArrayUtils.removeElements(new double[] { 1, 2 }, (double) 1, (double) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20412);assertTrue(Arrays.equals(new double[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20413);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20414);array = ArrayUtils.removeElements(new double[] { 1, 2, 1 }, (double) 1, (double) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20415);assertTrue(Arrays.equals(new double[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20416);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20417);array = ArrayUtils.removeElements(new double[] { 1, 2, 1 }, (double) 1, (double) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20418);assertTrue(Arrays.equals(new double[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20419);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20420);array = ArrayUtils.removeElements(new double[] { 1, 2, 1 }, (double) 1, (double) 1, (double) 1, (double) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20421);assertTrue(Arrays.equals(new double[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20422);assertEquals(Double.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast")
    public void testRemoveElementFloatArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2afcerafrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementFloatArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20423,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2afcerafrb(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20423);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20424);float[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20425);array = ArrayUtils.removeElements((float[]) null, (float) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20426);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20427);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_FLOAT_ARRAY, (float) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20428);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20429);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20430);array = ArrayUtils.removeElements(new float[] { 1 }, (float) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20431);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20432);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20433);array = ArrayUtils.removeElements(new float[] { 1, 2 }, (float) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20434);assertTrue(Arrays.equals(new float[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20435);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20436);array = ArrayUtils.removeElements(new float[] { 1, 2, 1 }, (float) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20437);assertTrue(Arrays.equals(new float[] { 2, 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20438);assertEquals(Float.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20439);array = ArrayUtils.removeElements((float[]) null, (float) 1, (float) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20440);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20441);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_FLOAT_ARRAY, (float) 1, (float) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20442);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20443);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20444);array = ArrayUtils.removeElements(new float[] { 1 }, (float) 1, (float) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20445);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20446);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20447);array = ArrayUtils.removeElements(new float[] { 1, 2 }, (float) 1, (float) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20448);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20449);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20450);array = ArrayUtils.removeElements(new float[] { 1, 2 }, (float) 1, (float) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20451);assertTrue(Arrays.equals(new float[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20452);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20453);array = ArrayUtils.removeElements(new float[] { 1, 2, 1 }, (float) 1, (float) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20454);assertTrue(Arrays.equals(new float[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20455);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20456);array = ArrayUtils.removeElements(new float[] { 1, 2, 1 }, (float) 1, (float) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20457);assertTrue(Arrays.equals(new float[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20458);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20459);array = ArrayUtils.removeElements(new float[] { 1, 2, 1 }, (float) 1, (float) 1, (float) 1, (float) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20460);assertTrue(Arrays.equals(new float[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20461);assertEquals(Float.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveElementIntArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k4x6rbfse();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementIntArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20462,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k4x6rbfse(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20462);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20463);int[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20464);array = ArrayUtils.removeElements((int[]) null, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20465);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20466);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_INT_ARRAY, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20467);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20468);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20469);array = ArrayUtils.removeElements(new int[] { 1 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20470);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20471);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20472);array = ArrayUtils.removeElements(new int[] { 1, 2 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20473);assertTrue(Arrays.equals(new int[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20474);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20475);array = ArrayUtils.removeElements(new int[] { 1, 2, 1 }, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20476);assertTrue(Arrays.equals(new int[] { 2, 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20477);assertEquals(Integer.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20478);array = ArrayUtils.removeElements((int[]) null, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20479);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20480);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_INT_ARRAY, 1, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20481);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20482);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20483);array = ArrayUtils.removeElements(new int[] { 1 }, 1, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20484);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20485);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20486);array = ArrayUtils.removeElements(new int[] { 1, 2 }, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20487);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20488);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20489);array = ArrayUtils.removeElements(new int[] { 1, 2 }, 1, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20490);assertTrue(Arrays.equals(new int[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20491);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20492);array = ArrayUtils.removeElements(new int[] { 1, 2, 1 }, 1, 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20493);assertTrue(Arrays.equals(new int[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20494);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20495);array = ArrayUtils.removeElements(new int[] { 1, 2, 1 }, 1, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20496);assertTrue(Arrays.equals(new int[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20497);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20498);array = ArrayUtils.removeElements(new int[] { 1, 2, 1 }, 1, 1, 1, 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20499);assertTrue(Arrays.equals(new int[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20500);assertEquals(Integer.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    @SuppressWarnings("cast")
    public void testRemoveElementLongArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2owtdlufth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20501,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2owtdlufth(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20501);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20502);long[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20503);array = ArrayUtils.removeElements((long[]) null, (long) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20504);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20505);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_LONG_ARRAY, (long) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20506);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20507);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20508);array = ArrayUtils.removeElements(new long[] { 1 }, (long) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20509);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20510);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20511);array = ArrayUtils.removeElements(new long[] { 1, 2 }, (long) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20512);assertTrue(Arrays.equals(new long[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20513);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20514);array = ArrayUtils.removeElements(new long[] { 1, 2, 1 }, (long) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20515);assertTrue(Arrays.equals(new long[] { 2, 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20516);assertEquals(Long.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20517);array = ArrayUtils.removeElements((long[]) null, (long) 1, (long) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20518);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20519);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_LONG_ARRAY, (long) 1, (long) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20520);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20521);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20522);array = ArrayUtils.removeElements(new long[] { 1 }, (long) 1, (long) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20523);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20524);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20525);array = ArrayUtils.removeElements(new long[] { 1, 2 }, (long) 1, (long) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20526);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20527);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20528);array = ArrayUtils.removeElements(new long[] { 1, 2 }, (long) 1, (long) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20529);assertTrue(Arrays.equals(new long[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20530);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20531);array = ArrayUtils.removeElements(new long[] { 1, 2, 1 }, (long) 1, (long) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20532);assertTrue(Arrays.equals(new long[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20533);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20534);array = ArrayUtils.removeElements(new long[] { 1, 2, 1 }, (long) 1, (long) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20535);assertTrue(Arrays.equals(new long[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20536);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20537);array = ArrayUtils.removeElements(new long[] { 1, 2, 1 }, (long) 1, (long) 1, (long) 1, (long) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20538);assertTrue(Arrays.equals(new long[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20539);assertEquals(Long.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

    @Test
    public void testRemoveElementShortArray() {__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceStart(getClass().getName(),20540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zex61ifuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2f8lf8ll3lqxt91.R.rethrow($CLV_t2$);}finally{__CLR4_1_2f8lf8ll3lqxt91.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest.testRemoveElementShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20540,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zex61ifuk(){try{__CLR4_1_2f8lf8ll3lqxt91.R.inc(20540);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20541);short[] array;
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20542);array = ArrayUtils.removeElements((short[]) null, (short) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20543);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20544);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_SHORT_ARRAY, (short) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20545);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20546);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20547);array = ArrayUtils.removeElements(new short[] { 1 }, (short) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20548);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20549);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20550);array = ArrayUtils.removeElements(new short[] { 1, 2 }, (short) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20551);assertTrue(Arrays.equals(new short[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20552);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20553);array = ArrayUtils.removeElements(new short[] { 1, 2, 1 }, (short) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20554);assertTrue(Arrays.equals(new short[] { 2, 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20555);assertEquals(Short.TYPE, array.getClass().getComponentType());

        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20556);array = ArrayUtils.removeElements((short[]) null, (short) 1, (short) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20557);assertNull(array);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20558);array = ArrayUtils.removeElements(ArrayUtils.EMPTY_SHORT_ARRAY, (short) 1, (short) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20559);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20560);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20561);array = ArrayUtils.removeElements(new short[] { 1 }, (short) 1, (short) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20562);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20563);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20564);array = ArrayUtils.removeElements(new short[] { 1, 2 }, (short) 1, (short) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20565);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20566);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20567);array = ArrayUtils.removeElements(new short[] { 1, 2 }, (short) 1, (short) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20568);assertTrue(Arrays.equals(new short[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20569);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20570);array = ArrayUtils.removeElements(new short[] { 1, 2, 1 }, (short) 1, (short) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20571);assertTrue(Arrays.equals(new short[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20572);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20573);array = ArrayUtils.removeElements(new short[] { 1, 2, 1 }, (short) 1, (short) 2);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20574);assertTrue(Arrays.equals(new short[] { 1 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20575);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20576);array = ArrayUtils.removeElements(new short[] { 1, 2, 1 }, (short) 1, (short) 1, (short) 1, (short) 1);
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20577);assertTrue(Arrays.equals(new short[] { 2 }, array));
        __CLR4_1_2f8lf8ll3lqxt91.R.inc(20578);assertEquals(Short.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2f8lf8ll3lqxt91.R.flushNeeded();}}

}
