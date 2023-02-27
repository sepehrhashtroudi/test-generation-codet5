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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.ArrayUtils}.
 *
 * @version $Id$
 */
public class ArrayUtilsTest  {static class __CLR4_1_2g5rg5rl3lqxthl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,22604,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),20943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hg5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20943,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hg5r(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(20943);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20944);assertNotNull(new ArrayUtils());
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20945);final Constructor<?>[] cons = ArrayUtils.class.getDeclaredConstructors();
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20946);assertEquals(1, cons.length);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20947);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20948);assertTrue(Modifier.isPublic(ArrayUtils.class.getModifiers()));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20949);assertFalse(Modifier.isFinal(ArrayUtils.class.getModifiers()));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testToString() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),20950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidg5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20950,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidg5y(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(20950);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20951);assertEquals("{}", ArrayUtils.toString(null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20952);assertEquals("{}", ArrayUtils.toString(new Object[0]));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20953);assertEquals("{}", ArrayUtils.toString(new String[0]));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20954);assertEquals("{<null>}", ArrayUtils.toString(new String[] {null}));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20955);assertEquals("{pink,blue}", ArrayUtils.toString(new String[] {"pink","blue"}));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20956);assertEquals("<empty>", ArrayUtils.toString(null, "<empty>"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20957);assertEquals("{}", ArrayUtils.toString(new Object[0], "<empty>"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20958);assertEquals("{}", ArrayUtils.toString(new String[0], "<empty>"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20959);assertEquals("{<null>}", ArrayUtils.toString(new String[] {null}, "<empty>"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20960);assertEquals("{pink,blue}", ArrayUtils.toString(new String[] {"pink","blue"}, "<empty>"));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testHashCode() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),20961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8g69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20961,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8g69(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(20961);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20962);final long[][] array1 = new long[][] {{2,5}, {4,5}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20963);final long[][] array2 = new long[][] {{2,5}, {4,6}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20964);assertTrue(ArrayUtils.hashCode(array1) == ArrayUtils.hashCode(array1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20965);assertFalse(ArrayUtils.hashCode(array1) == ArrayUtils.hashCode(array2));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20966);final Object[] array3 = new Object[] {new String(new char[] {'A', 'B'})};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20967);final Object[] array4 = new Object[] {"AB"};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20968);assertTrue(ArrayUtils.hashCode(array3) == ArrayUtils.hashCode(array3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20969);assertTrue(ArrayUtils.hashCode(array3) == ArrayUtils.hashCode(array4));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20970);final Object[] arrayA = new Object[] {new boolean[] {true, false}, new int[] {6, 7}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20971);final Object[] arrayB = new Object[] {new boolean[] {true, false}, new int[] {6, 7}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20972);assertTrue(ArrayUtils.hashCode(arrayB) == ArrayUtils.hashCode(arrayA));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void assertIsEquals(final Object array1, final Object array2, final Object array3) {try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(20973);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20974);assertTrue(ArrayUtils.isEquals(array1, array1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20975);assertTrue(ArrayUtils.isEquals(array2, array2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20976);assertTrue(ArrayUtils.isEquals(array3, array3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20977);assertFalse(ArrayUtils.isEquals(array1, array2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20978);assertFalse(ArrayUtils.isEquals(array2, array1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20979);assertFalse(ArrayUtils.isEquals(array1, array3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20980);assertFalse(ArrayUtils.isEquals(array3, array1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20981);assertFalse(ArrayUtils.isEquals(array1, array2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20982);assertFalse(ArrayUtils.isEquals(array2, array1));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testIsEquals() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),20983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26db4dag6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20983,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26db4dag6v(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(20983);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20984);final long[][] larray1 = new long[][]{{2, 5}, {4, 5}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20985);final long[][] larray2 = new long[][]{{2, 5}, {4, 6}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20986);final long[] larray3 = new long[]{2, 5};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20987);this.assertIsEquals(larray1, larray2, larray3);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20988);final int[][] iarray1 = new int[][]{{2, 5}, {4, 5}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20989);final int[][] iarray2 = new int[][]{{2, 5}, {4, 6}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20990);final int[] iarray3 = new int[]{2, 5};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20991);this.assertIsEquals(iarray1, iarray2, iarray3);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20992);final short[][] sarray1 = new short[][]{{2, 5}, {4, 5}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20993);final short[][] sarray2 = new short[][]{{2, 5}, {4, 6}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20994);final short[] sarray3 = new short[]{2, 5};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20995);this.assertIsEquals(sarray1, sarray2, sarray3);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20996);final float[][] farray1 = new float[][]{{2, 5}, {4, 5}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20997);final float[][] farray2 = new float[][]{{2, 5}, {4, 6}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20998);final float[] farray3 = new float[]{2, 5};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(20999);this.assertIsEquals(farray1, farray2, farray3);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21000);final double[][] darray1 = new double[][]{{2, 5}, {4, 5}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21001);final double[][] darray2 = new double[][]{{2, 5}, {4, 6}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21002);final double[] darray3 = new double[]{2, 5};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21003);this.assertIsEquals(darray1, darray2, darray3);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21004);final byte[][] byteArray1 = new byte[][]{{2, 5}, {4, 5}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21005);final byte[][] byteArray2 = new byte[][]{{2, 5}, {4, 6}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21006);final byte[] byteArray3 = new byte[]{2, 5};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21007);this.assertIsEquals(byteArray1, byteArray2, byteArray3);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21008);final char[][] charArray1 = new char[][]{{2, 5}, {4, 5}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21009);final char[][] charArray2 = new char[][]{{2, 5}, {4, 6}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21010);final char[] charArray3 = new char[]{2, 5};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21011);this.assertIsEquals(charArray1, charArray2, charArray3);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21012);final boolean[][] barray1 = new boolean[][]{{true, false}, {true, true}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21013);final boolean[][] barray2 = new boolean[][]{{true, false}, {true, false}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21014);final boolean[] barray3 = new boolean[]{false, true};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21015);this.assertIsEquals(barray1, barray2, barray3);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21016);final Object[] array3 = new Object[]{new String(new char[]{'A', 'B'})};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21017);final Object[] array4 = new Object[]{"AB"};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21018);assertTrue(ArrayUtils.isEquals(array3, array3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21019);assertTrue(ArrayUtils.isEquals(array3, array4));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21020);assertTrue(ArrayUtils.isEquals(null, null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21021);assertFalse(ArrayUtils.isEquals(null, array4));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * Tests generic array creation with parameters of same type.
     */
    @Test
    public void testArrayCreation()
    {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j74m7hg7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testArrayCreation",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21022,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j74m7hg7y(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21022);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21023);final String[] array = ArrayUtils.toArray("foo", "bar");
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21024);assertEquals(2, array.length);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21025);assertEquals("foo", array[0]);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21026);assertEquals("bar", array[1]);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    /**
     * Tests generic array creation with general return type.
     */
    @Test
    public void testArrayCreationWithGeneralReturnType()
    {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2l99tg3g83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testArrayCreationWithGeneralReturnType",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21027,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2l99tg3g83(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21027);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21028);final Object obj = ArrayUtils.toArray("foo", "bar");
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21029);assertTrue(obj instanceof String[]);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    /**
     * Tests generic array creation with parameters of common base type.
     */
    @Test
    public void testArrayCreationWithDifferentTypes()
    {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zq74dg86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testArrayCreationWithDifferentTypes",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21030,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zq74dg86(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21030);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21031);final Number[] array = ArrayUtils.<Number>toArray(Integer.valueOf(42), Double.valueOf(Math.PI));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21032);assertEquals(2, array.length);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21033);assertEquals(Integer.valueOf(42), array[0]);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21034);assertEquals(Double.valueOf(Math.PI), array[1]);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    /**
     * Tests generic array creation with generic type.
     */
    @Test
    public void testIndirectArrayCreation()
    {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yg1httg8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndirectArrayCreation",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21035,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yg1httg8b(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21035);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21036);final String[] array = toArrayPropagatingType("foo", "bar");
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21037);assertEquals(2, array.length);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21038);assertEquals("foo", array[0]);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21039);assertEquals("bar", array[1]);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    /**
     * Tests generic empty array creation with generic type.
     */
    @Test
    public void testEmptyArrayCreation()
    {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o59jvog8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testEmptyArrayCreation",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21040,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o59jvog8g(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21040);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21041);final String[] array = ArrayUtils.<String>toArray();
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21042);assertEquals(0, array.length);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    /**
     * Tests indirect generic empty array creation with generic type.
     */
    @Test
    public void testIndirectEmptyArrayCreation()
    {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zb2luag8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndirectEmptyArrayCreation",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21043,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zb2luag8j(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21043);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21044);final String[] array = ArrayUtilsTest.<String>toArrayPropagatingType();
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21045);assertEquals(0, array.length);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    private static <T> T[] toArrayPropagatingType(final T... items)
    {try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21046);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21047);return ArrayUtils.toArray(items);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testToMap() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27y2w2eg8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToMap",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21048,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27y2w2eg8o(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21048);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21049);Map<?, ?> map = ArrayUtils.toMap(new String[][] {{"foo", "bar"}, {"hello", "world"}});
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21050);assertEquals("bar", map.get("foo"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21051);assertEquals("world", map.get("hello"));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21052);assertEquals(null, ArrayUtils.toMap(null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21053);try {
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21054);ArrayUtils.toMap(new String[][] {{"foo", "bar"}, {"short"}});
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21055);fail("exception expected");
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21056);try {
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21057);ArrayUtils.toMap(new Object[] {new Object[] {"foo", "bar"}, "illegal type"});
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21058);fail("exception expected");
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21059);try {
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21060);ArrayUtils.toMap(new Object[] {new Object[] {"foo", "bar"}, null});
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21061);fail("exception expected");
        } catch (final IllegalArgumentException ex) {}
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21062);map = ArrayUtils.toMap(new Object[] {new Map.Entry<Object, Object>() {
            @Override
            public Object getKey() {try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21063);
                __CLR4_1_2g5rg5rl3lqxthl.R.inc(21064);return "foo";
            }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
            @Override
            public Object getValue() {try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21065);
                __CLR4_1_2g5rg5rl3lqxthl.R.inc(21066);return "bar";
            }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
            @Override
            public Object setValue(final Object value) {try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21067);
                __CLR4_1_2g5rg5rl3lqxthl.R.inc(21068);throw new UnsupportedOperationException();
            }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
            @Override
            public boolean equals(final Object o) {try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21069);
                __CLR4_1_2g5rg5rl3lqxthl.R.inc(21070);throw new UnsupportedOperationException();
            }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
            @Override
            public int hashCode() {try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21071);
                __CLR4_1_2g5rg5rl3lqxthl.R.inc(21072);throw new UnsupportedOperationException();
            }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
        }});
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21073);assertEquals("bar", map.get("foo"));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testClone() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2csyejyg9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testClone",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21074,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2csyejyg9e(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21074);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21075);assertArrayEquals(null, ArrayUtils.clone((Object[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21076);Object[] original1 = new Object[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21077);Object[] cloned1 = ArrayUtils.clone(original1);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21078);assertTrue(Arrays.equals(original1, cloned1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21079);assertTrue(original1 != cloned1);
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21080);final StringBuffer buf = new StringBuffer("pick");
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21081);original1 = new Object[] {buf, "a", new String[] {"stick"}};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21082);cloned1 = ArrayUtils.clone(original1);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21083);assertTrue(Arrays.equals(original1, cloned1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21084);assertTrue(original1 != cloned1);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21085);assertSame(original1[0], cloned1[0]);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21086);assertSame(original1[1], cloned1[1]);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21087);assertSame(original1[2], cloned1[2]);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testCloneBoolean() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rmt0kg9s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21088,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rmt0kg9s(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21088);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21089);assertEquals(null, ArrayUtils.clone((boolean[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21090);final boolean[] original = new boolean[] {true, false};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21091);final boolean[] cloned = ArrayUtils.clone(original);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21092);assertTrue(Arrays.equals(original, cloned));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21093);assertTrue(original != cloned);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testCloneLong() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s0c0b6g9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21094,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s0c0b6g9y(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21094);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21095);assertEquals(null, ArrayUtils.clone((long[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21096);final long[] original = new long[] {0L, 1L};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21097);final long[] cloned = ArrayUtils.clone(original);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21098);assertTrue(Arrays.equals(original, cloned));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21099);assertTrue(original != cloned);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testCloneInt() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2raqc3vga4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21100,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2raqc3vga4(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21100);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21101);assertEquals(null, ArrayUtils.clone((int[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21102);final int[] original = new int[] {5, 8};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21103);final int[] cloned = ArrayUtils.clone(original);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21104);assertTrue(Arrays.equals(original, cloned));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21105);assertTrue(original != cloned);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testCloneShort() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mg9ugogaa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21106,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mg9ugogaa(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21106);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21107);assertEquals(null, ArrayUtils.clone((short[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21108);final short[] original = new short[] {1, 4};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21109);final short[] cloned = ArrayUtils.clone(original);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21110);assertTrue(Arrays.equals(original, cloned));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21111);assertTrue(original != cloned);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testCloneChar() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iuz8cogag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21112,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iuz8cogag(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21112);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21113);assertEquals(null, ArrayUtils.clone((char[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21114);final char[] original = new char[] {'a', '4'};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21115);final char[] cloned = ArrayUtils.clone(original);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21116);assertTrue(Arrays.equals(original, cloned));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21117);assertTrue(original != cloned);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testCloneByte() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22wc2nugam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21118,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22wc2nugam(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21118);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21119);assertEquals(null, ArrayUtils.clone((byte[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21120);final byte[] original = new byte[] {1, 6};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21121);final byte[] cloned = ArrayUtils.clone(original);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21122);assertTrue(Arrays.equals(original, cloned));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21123);assertTrue(original != cloned);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testCloneDouble() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q3apgjgas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21124,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q3apgjgas(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21124);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21125);assertEquals(null, ArrayUtils.clone((double[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21126);final double[] original = new double[] {2.4d, 5.7d};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21127);final double[] cloned = ArrayUtils.clone(original);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21128);assertTrue(Arrays.equals(original, cloned));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21129);assertTrue(original != cloned);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testCloneFloat() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23smw14gay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testCloneFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21130,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23smw14gay(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21130);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21131);assertEquals(null, ArrayUtils.clone((float[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21132);final float[] original = new float[] {2.6f, 6.4f};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21133);final float[] cloned = ArrayUtils.clone(original);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21134);assertTrue(Arrays.equals(original, cloned));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21135);assertTrue(original != cloned);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testNullToEmptyBoolean() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tt5bnagb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21136,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tt5bnagb4(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21136);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21137);assertEquals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, ArrayUtils.nullToEmpty((boolean[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21138);final boolean[] original = new boolean[] {true, false};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21139);assertEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21140);final boolean[] empty = new boolean[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21141);final boolean[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21142);assertEquals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21143);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyLong() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27jx3j8gbc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21144,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27jx3j8gbc(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21144);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21145);assertEquals(ArrayUtils.EMPTY_LONG_ARRAY, ArrayUtils.nullToEmpty((long[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21146);final long[] original = new long[] {1L, 2L};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21147);assertEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21148);final long[] empty = new long[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21149);final long[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21150);assertEquals(ArrayUtils.EMPTY_LONG_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21151);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyInt() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21152);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22r4h3xgbk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21152,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22r4h3xgbk(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21152);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21153);assertEquals(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.nullToEmpty((int[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21154);final int[] original = new int[] {1, 2};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21155);assertEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21156);final int[] empty = new int[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21157);final int[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21158);assertEquals(ArrayUtils.EMPTY_INT_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21159);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyShort() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hb3kqygbs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21160,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hb3kqygbs(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21160);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21161);assertEquals(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.nullToEmpty((short[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21162);final short[] original = new short[] {1, 2};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21163);assertEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21164);final short[] empty = new short[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21165);final short[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21166);assertEquals(ArrayUtils.EMPTY_SHORT_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21167);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyChar() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vppwuigc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21168,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vppwuigc0(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21168);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21169);assertEquals(ArrayUtils.EMPTY_CHAR_ARRAY, ArrayUtils.nullToEmpty((char[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21170);final char[] original = new char[] {'a', 'b'};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21171);assertEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21172);final char[] empty = new char[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21173);final char[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21174);assertEquals(ArrayUtils.EMPTY_CHAR_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21175);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyByte() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21176);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ncqzfsgc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21176,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ncqzfsgc8(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21176);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21177);assertEquals(ArrayUtils.EMPTY_BYTE_ARRAY, ArrayUtils.nullToEmpty((byte[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21178);final byte[] original = new byte[] {0x0F, 0x0E};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21179);assertEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21180);final byte[] empty = new byte[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21181);final byte[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21182);assertEquals(ArrayUtils.EMPTY_BYTE_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21183);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyDouble() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28p4g9dgcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21184,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28p4g9dgcg(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21184);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21185);assertEquals(ArrayUtils.EMPTY_DOUBLE_ARRAY, ArrayUtils.nullToEmpty((double[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21186);final double[] original = new double[] {1L, 2L};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21187);assertEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21188);final double[] empty = new double[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21189);final double[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21190);assertEquals(ArrayUtils.EMPTY_DOUBLE_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21191);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyFloat() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28xt5qugco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21192,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28xt5qugco(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21192);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21193);assertEquals(ArrayUtils.EMPTY_FLOAT_ARRAY, ArrayUtils.nullToEmpty((float[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21194);final float[] original = new float[] {2.6f, 3.8f};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21195);assertEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21196);final float[] empty = new float[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21197);final float[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21198);assertEquals(ArrayUtils.EMPTY_FLOAT_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21199);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testNullToEmptyObject() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21200);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dgrzepgcw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21200,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dgrzepgcw(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21200);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21201);assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Object[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21202);final Object[] original = new Object[] {Boolean.TRUE, Boolean.FALSE};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21203);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21204);final Object[] empty = new Object[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21205);final Object[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21206);assertArrayEquals(ArrayUtils.EMPTY_OBJECT_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21207);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testNullToEmptyString() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22x3zhrgd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21208,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22x3zhrgd4(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21208);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21209);assertArrayEquals(ArrayUtils.EMPTY_STRING_ARRAY, ArrayUtils.nullToEmpty((String[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21210);final String[] original = new String[] {"abc", "def"};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21211);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21212);final String[] empty = new String[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21213);final String[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21214);assertArrayEquals(ArrayUtils.EMPTY_STRING_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21215);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testNullToEmptyBooleanObject() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27yol8rgdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyBooleanObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21216,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27yol8rgdc(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21216);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21217);assertArrayEquals(ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Boolean[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21218);final Boolean[] original = new Boolean[] {Boolean.TRUE, Boolean.FALSE};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21219);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21220);final Boolean[] empty = new Boolean[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21221);final Boolean[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21222);assertArrayEquals(ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21223);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyLongObject() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28b36g5gdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyLongObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21224,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28b36g5gdk(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21224);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21225);assertArrayEquals(ArrayUtils.EMPTY_LONG_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Long[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21226);@SuppressWarnings("boxing")
        final
        Long[] original = new Long[] {1L, 2L};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21227);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21228);final Long[] empty = new Long[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21229);final Long[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21230);assertArrayEquals(ArrayUtils.EMPTY_LONG_OBJECT_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21231);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyIntObject() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oqsk2kgds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyIntObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21232,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oqsk2kgds(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21232);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21233);assertArrayEquals(ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Integer[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21234);final Integer[] original = new Integer[] {1, 2};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21235);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21236);final Integer[] empty = new Integer[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21237);final Integer[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21238);assertArrayEquals(ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21239);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyShortObject() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2on0r9lge0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyShortObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21240,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2on0r9lge0(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21240);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21241);assertArrayEquals(ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Short[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21242);@SuppressWarnings("boxing")
        final
        Short[] original = new Short[] {1, 2};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21243);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21244);final Short[] empty = new Short[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21245);final Short[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21246);assertArrayEquals(ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21247);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyCharObject() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27nqonfge8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyCharObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21248,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27nqonfge8(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21248);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21249);assertArrayEquals(ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Character[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21250);final Character[] original = new Character[] {'a', 'b'};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21251);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21252);final Character[] empty = new Character[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21253);final Character[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21254);assertArrayEquals(ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21255);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyByteObject() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27teqavgeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyByteObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21256,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27teqavgeg(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21256);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21257);assertArrayEquals(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Byte[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21258);final Byte[] original = new Byte[] {0x0F, 0x0E};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21259);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21260);final Byte[] empty = new Byte[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21261);final Byte[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21262);assertArrayEquals(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21263);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyDoubleObject() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jpndjkgeo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyDoubleObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21264,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jpndjkgeo(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21264);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21265);assertArrayEquals(ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Double[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21266);final Double[] original = new Double[] {1D, 2D};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21267);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21268);final Double[] empty = new Double[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21269);final Double[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21270);assertArrayEquals(ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21271);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testNullToEmptyFloatObject() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hxnnc9gew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testNullToEmptyFloatObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21272,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hxnnc9gew(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21272);
        // Test null handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21273);assertArrayEquals(ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY, ArrayUtils.nullToEmpty((Float[]) null));
        // Test valid array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21274);final Float[] original = new Float[] {2.6f, 3.8f};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21275);assertArrayEquals(original, ArrayUtils.nullToEmpty(original));
        // Test empty array handling
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21276);final Float[] empty = new Float[]{};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21277);final Float[] result = ArrayUtils.nullToEmpty(empty);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21278);assertArrayEquals(ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY, result);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21279);assertTrue(empty != result);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    //-----------------------------------------------------------------------

    @Test
    public void testSubarrayObject() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gars35gf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21280,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gars35gf4(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21280);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21281);final Object[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21282);final Object[] objectArray = { "a", "b", "c", "d", "e", "f"};

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21283);assertEquals("0 start, mid end", "abcd",
            StringUtils.join(ArrayUtils.subarray(objectArray, 0, 4)));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21284);assertEquals("0 start, length end", "abcdef",
            StringUtils.join(ArrayUtils.subarray(objectArray, 0, objectArray.length)));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21285);assertEquals("mid start, mid end", "bcd",
            StringUtils.join(ArrayUtils.subarray(objectArray, 1, 4)));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21286);assertEquals("mid start, length end", "bcdef",
            StringUtils.join(ArrayUtils.subarray(objectArray, 1, objectArray.length)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21287);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21288);assertEquals("empty array", "",
            StringUtils.join(ArrayUtils.subarray(ArrayUtils.EMPTY_OBJECT_ARRAY, 1, 2)));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21289);assertEquals("start > end", "",
            StringUtils.join(ArrayUtils.subarray(objectArray, 4, 2)));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21290);assertEquals("start == end", "",
            StringUtils.join(ArrayUtils.subarray(objectArray, 3, 3)));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21291);assertEquals("start undershoot, normal end", "abcd",
            StringUtils.join(ArrayUtils.subarray(objectArray, -2, 4)));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21292);assertEquals("start overshoot, any end", "",
            StringUtils.join(ArrayUtils.subarray(objectArray, 33, 4)));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21293);assertEquals("normal start, end overshoot", "cdef",
            StringUtils.join(ArrayUtils.subarray(objectArray, 2, 33)));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21294);assertEquals("start undershoot, end overshoot", "abcdef",
            StringUtils.join(ArrayUtils.subarray(objectArray, -2, 12)));
            
        // array type tests
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21295);final Date[] dateArray = { new java.sql.Date(new Date().getTime()),
            new Date(), new Date(), new Date(), new Date() };

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21296);assertSame("Object type", Object.class,
            ArrayUtils.subarray(objectArray, 2, 4).getClass().getComponentType());
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21297);assertSame("java.util.Date type", java.util.Date.class,
            ArrayUtils.subarray(dateArray, 1, 4).getClass().getComponentType());
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21298);assertNotSame("java.sql.Date type", java.sql.Date.class,
            ArrayUtils.subarray(dateArray, 1, 4).getClass().getComponentType());
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21299);try {
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21300);@SuppressWarnings("unused")
            final
            java.sql.Date[] dummy = (java.sql.Date[])ArrayUtils.subarray(dateArray, 1,3);
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21301);fail("Invalid downcast");
        } catch (final ClassCastException e) {}
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testSubarrayLong() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bftxgygfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21302,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bftxgygfq(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21302);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21303);final long[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21304);final long[] array = { 999910, 999911, 999912, 999913, 999914, 999915 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21305);final long[] leftSubarray     = { 999910, 999911, 999912, 999913 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21306);final long[] midSubarray      = { 999911, 999912, 999913, 999914 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21307);final long[] rightSubarray    = { 999912, 999913, 999914, 999915 };

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21308);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21309);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21310);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21311);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21312);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21313);assertEquals("empty array", ArrayUtils.EMPTY_LONG_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_LONG_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21314);assertEquals("start > end", ArrayUtils.EMPTY_LONG_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21315);assertEquals("start == end", ArrayUtils.EMPTY_LONG_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21316);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21317);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_LONG_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21318);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21319);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21320);assertSame("empty array, object test",
            ArrayUtils.EMPTY_LONG_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_LONG_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21321);assertSame("start > end, object test",
            ArrayUtils.EMPTY_LONG_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21322);assertSame("start == end, object test",
            ArrayUtils.EMPTY_LONG_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21323);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_LONG_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21324);assertSame("long type", long.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testSubarrayInt() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22mlzvvggd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21325,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22mlzvvggd(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21325);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21326);final int[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21327);final int[] array = { 10, 11, 12, 13, 14, 15 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21328);final int[] leftSubarray  = { 10, 11, 12, 13 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21329);final int[] midSubarray   = { 11, 12, 13, 14 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21330);final int[] rightSubarray = { 12, 13, 14, 15 };


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21331);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21332);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21333);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21334);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21335);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21336);assertEquals("empty array", ArrayUtils.EMPTY_INT_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_INT_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21337);assertEquals("start > end", ArrayUtils.EMPTY_INT_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21338);assertEquals("start == end", ArrayUtils.EMPTY_INT_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21339);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21340);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_INT_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21341);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21342);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21343);assertSame("empty array, object test",
            ArrayUtils.EMPTY_INT_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_INT_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21344);assertSame("start > end, object test",
            ArrayUtils.EMPTY_INT_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21345);assertSame("start == end, object test",
            ArrayUtils.EMPTY_INT_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21346);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_INT_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21347);assertSame("int type", int.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testSubarrayShort() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w525bcgh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21348,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w525bcgh0(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21348);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21349);final short[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21350);final short[] array = { 10, 11, 12, 13, 14, 15 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21351);final short[] leftSubarray    = { 10, 11, 12, 13 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21352);final short[] midSubarray     = { 11, 12, 13, 14 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21353);final short[] rightSubarray   = { 12, 13, 14, 15 };


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21354);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21355);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21356);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21357);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21358);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21359);assertEquals("empty array", ArrayUtils.EMPTY_SHORT_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_SHORT_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21360);assertEquals("start > end", ArrayUtils.EMPTY_SHORT_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21361);assertEquals("start == end", ArrayUtils.EMPTY_SHORT_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21362);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21363);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_SHORT_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21364);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21365);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21366);assertSame("empty array, object test",
            ArrayUtils.EMPTY_SHORT_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_SHORT_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21367);assertSame("start > end, object test",
            ArrayUtils.EMPTY_SHORT_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21368);assertSame("start == end, object test",
            ArrayUtils.EMPTY_SHORT_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21369);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_SHORT_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21370);assertSame("short type", short.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testSubarrChar() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21371);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nnqc28ghn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21371,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nnqc28ghn(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21371);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21372);final char[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21373);final char[] array = { 'a', 'b', 'c', 'd', 'e', 'f' };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21374);final char[] leftSubarray     = { 'a', 'b', 'c', 'd', };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21375);final char[] midSubarray      = { 'b', 'c', 'd', 'e', };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21376);final char[] rightSubarray    = { 'c', 'd', 'e', 'f', };


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21377);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21378);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21379);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21380);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21381);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21382);assertEquals("empty array", ArrayUtils.EMPTY_CHAR_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_CHAR_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21383);assertEquals("start > end", ArrayUtils.EMPTY_CHAR_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21384);assertEquals("start == end", ArrayUtils.EMPTY_CHAR_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21385);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21386);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_CHAR_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21387);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21388);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21389);assertSame("empty array, object test",
            ArrayUtils.EMPTY_CHAR_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_CHAR_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21390);assertSame("start > end, object test",
            ArrayUtils.EMPTY_CHAR_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21391);assertSame("start == end, object test",
            ArrayUtils.EMPTY_CHAR_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21392);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_CHAR_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21393);assertSame("char type", char.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testSubarrayByte() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jgu5i2gia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21394,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jgu5i2gia(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21394);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21395);final byte[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21396);final byte[] array = { 10, 11, 12, 13, 14, 15 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21397);final byte[] leftSubarray     = { 10, 11, 12, 13 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21398);final byte[] midSubarray      = { 11, 12, 13, 14 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21399);final byte[] rightSubarray = { 12, 13, 14, 15 };


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21400);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21401);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21402);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21403);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21404);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21405);assertEquals("empty array", ArrayUtils.EMPTY_BYTE_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_BYTE_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21406);assertEquals("start > end", ArrayUtils.EMPTY_BYTE_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21407);assertEquals("start == end", ArrayUtils.EMPTY_BYTE_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21408);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21409);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_BYTE_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21410);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21411);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21412);assertSame("empty array, object test",
            ArrayUtils.EMPTY_BYTE_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_BYTE_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21413);assertSame("start > end, object test",
            ArrayUtils.EMPTY_BYTE_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21414);assertSame("start == end, object test",
            ArrayUtils.EMPTY_BYTE_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21415);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_BYTE_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21416);assertSame("byte type", byte.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testSubarrayDouble() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wkfu7xgix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21417,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wkfu7xgix(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21417);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21418);final double[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21419);final double[] array = { 10.123, 11.234, 12.345, 13.456, 14.567, 15.678 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21420);final double[] leftSubarray   = { 10.123, 11.234, 12.345, 13.456, };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21421);final double[] midSubarray    = { 11.234, 12.345, 13.456, 14.567, };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21422);final double[] rightSubarray  = { 12.345, 13.456, 14.567, 15.678 };


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21423);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21424);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21425);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21426);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21427);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21428);assertEquals("empty array", ArrayUtils.EMPTY_DOUBLE_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_DOUBLE_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21429);assertEquals("start > end", ArrayUtils.EMPTY_DOUBLE_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21430);assertEquals("start == end", ArrayUtils.EMPTY_DOUBLE_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21431);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21432);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_DOUBLE_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21433);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21434);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21435);assertSame("empty array, object test",
            ArrayUtils.EMPTY_DOUBLE_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_DOUBLE_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21436);assertSame("start > end, object test",
            ArrayUtils.EMPTY_DOUBLE_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21437);assertSame("start == end, object test",
            ArrayUtils.EMPTY_DOUBLE_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21438);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_DOUBLE_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21439);assertSame("double type", double.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testSubarrayFloat() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cn5660gjk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21440,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cn5660gjk(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21440);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21441);final float[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21442);final float[] array = { 10, 11, 12, 13, 14, 15 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21443);final float[] leftSubarray    = { 10, 11, 12, 13 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21444);final float[] midSubarray     = { 11, 12, 13, 14 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21445);final float[] rightSubarray   = { 12, 13, 14, 15 };


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21446);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21447);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21448);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21449);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21450);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21451);assertEquals("empty array", ArrayUtils.EMPTY_FLOAT_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_FLOAT_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21452);assertEquals("start > end", ArrayUtils.EMPTY_FLOAT_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21453);assertEquals("start == end", ArrayUtils.EMPTY_FLOAT_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21454);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21455);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_FLOAT_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21456);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21457);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21458);assertSame("empty array, object test",
            ArrayUtils.EMPTY_FLOAT_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_FLOAT_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21459);assertSame("start > end, object test",
            ArrayUtils.EMPTY_FLOAT_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21460);assertSame("start == end, object test",
            ArrayUtils.EMPTY_FLOAT_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21461);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_FLOAT_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21462);assertSame("float type", float.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testSubarrayBoolean() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2t4pabogk7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSubarrayBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21463,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2t4pabogk7(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21463);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21464);final boolean[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21465);final boolean[] array = { true, true, false, true, false, true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21466);final boolean[] leftSubarray  = { true, true, false, true  };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21467);final boolean[] midSubarray   = { true, false, true, false };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21468);final boolean[] rightSubarray = { false, true, false, true };


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21469);assertTrue("0 start, mid end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, 0, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21470);assertTrue("0 start, length end",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, 0, array.length)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21471);assertTrue("mid start, mid end",
            ArrayUtils.isEquals(midSubarray,
                ArrayUtils.subarray(array, 1, 5)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21472);assertTrue("mid start, length end",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, array.length)));


        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21473);assertNull("null input", ArrayUtils.subarray(nullArray, 0, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21474);assertEquals("empty array", ArrayUtils.EMPTY_BOOLEAN_ARRAY,
            ArrayUtils.subarray(ArrayUtils.EMPTY_BOOLEAN_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21475);assertEquals("start > end", ArrayUtils.EMPTY_BOOLEAN_ARRAY,
            ArrayUtils.subarray(array, 4, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21476);assertEquals("start == end", ArrayUtils.EMPTY_BOOLEAN_ARRAY,
            ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21477);assertTrue("start undershoot, normal end",
            ArrayUtils.isEquals(leftSubarray,
                ArrayUtils.subarray(array, -2, 4)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21478);assertEquals("start overshoot, any end",
            ArrayUtils.EMPTY_BOOLEAN_ARRAY,
                ArrayUtils.subarray(array, 33, 4));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21479);assertTrue("normal start, end overshoot",
            ArrayUtils.isEquals(rightSubarray,
                ArrayUtils.subarray(array, 2, 33)));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21480);assertTrue("start undershoot, end overshoot",
            ArrayUtils.isEquals(array,
                ArrayUtils.subarray(array, -2, 12)));

        // empty-return tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21481);assertSame("empty array, object test",
            ArrayUtils.EMPTY_BOOLEAN_ARRAY,
                ArrayUtils.subarray(ArrayUtils.EMPTY_BOOLEAN_ARRAY, 1, 2));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21482);assertSame("start > end, object test",
            ArrayUtils.EMPTY_BOOLEAN_ARRAY,
                ArrayUtils.subarray(array, 4, 1));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21483);assertSame("start == end, object test",
            ArrayUtils.EMPTY_BOOLEAN_ARRAY,
                ArrayUtils.subarray(array, 3, 3));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21484);assertSame("start overshoot, any end, object test",
            ArrayUtils.EMPTY_BOOLEAN_ARRAY,
                ArrayUtils.subarray(array, 8733, 4));

        // array type tests

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21485);assertSame("boolean type", boolean.class,
            ArrayUtils.subarray(array, 2, 4).getClass().getComponentType());

    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testSameLength() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lcrag5gku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLength",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21486,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lcrag5gku(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21486);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21487);final Object[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21488);final Object[] emptyArray = new Object[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21489);final Object[] oneArray = new Object[] {"pick"};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21490);final Object[] twoArray = new Object[] {"pick", "stick"};
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21491);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21492);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21493);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21494);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21495);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21496);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21497);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21498);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21499);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21500);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21501);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21502);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21503);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21504);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21505);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21506);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testSameLengthBoolean() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_249qj3lglf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21507,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_249qj3lglf(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21507);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21508);final boolean[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21509);final boolean[] emptyArray = new boolean[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21510);final boolean[] oneArray = new boolean[] {true};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21511);final boolean[] twoArray = new boolean[] {true, false};
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21512);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21513);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21514);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21515);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21516);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21517);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21518);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21519);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21520);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21521);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21522);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21523);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21524);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21525);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21526);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21527);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testSameLengthLong() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gbloe9gm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21528,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gbloe9gm0(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21528);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21529);final long[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21530);final long[] emptyArray = new long[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21531);final long[] oneArray = new long[] {0L};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21532);final long[] twoArray = new long[] {0L, 76L};
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21533);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21534);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21535);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21536);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21537);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21538);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21539);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21540);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21541);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21542);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21543);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21544);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21545);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21546);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21547);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21548);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testSameLengthInt() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a82o6ggml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21549,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a82o6ggml(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21549);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21550);final int[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21551);final int[] emptyArray = new int[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21552);final int[] oneArray = new int[] {4};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21553);final int[] twoArray = new int[] {5, 7};
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21554);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21555);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21556);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21557);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21558);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21559);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21560);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21561);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21562);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21563);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21564);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21565);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21566);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21567);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21568);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21569);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testSameLengthShort() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nvyz5ngn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21570,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nvyz5ngn6(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21570);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21571);final short[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21572);final short[] emptyArray = new short[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21573);final short[] oneArray = new short[] {4};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21574);final short[] twoArray = new short[] {6, 8};
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21575);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21576);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21577);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21578);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21579);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21580);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21581);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21582);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21583);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21584);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21585);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21586);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21587);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21588);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21589);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21590);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testSameLengthChar() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27u74x1gnr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21591,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27u74x1gnr(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21591);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21592);final char[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21593);final char[] emptyArray = new char[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21594);final char[] oneArray = new char[] {'f'};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21595);final char[] twoArray = new char[] {'d', 't'};
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21596);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21597);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21598);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21599);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21600);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21601);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21602);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21603);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21604);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21605);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21606);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21607);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21608);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21609);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21610);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21611);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testSameLengthByte() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nsualvgoc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21612,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nsualvgoc(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21612);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21613);final byte[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21614);final byte[] emptyArray = new byte[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21615);final byte[] oneArray = new byte[] {3};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21616);final byte[] twoArray = new byte[] {4, 6};
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21617);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21618);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21619);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21620);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21621);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21622);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21623);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21624);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21625);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21626);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21627);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21628);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21629);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21630);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21631);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21632);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testSameLengthDouble() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a5yaragox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21633,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a5yaragox(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21633);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21634);final double[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21635);final double[] emptyArray = new double[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21636);final double[] oneArray = new double[] {1.3d};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21637);final double[] twoArray = new double[] {4.5d, 6.3d};
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21638);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21639);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21640);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21641);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21642);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21643);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21644);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21645);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21646);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21647);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21648);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21649);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21650);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21651);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21652);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21653);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testSameLengthFloat() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kw8cbpgpi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameLengthFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21654,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kw8cbpgpi(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21654);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21655);final float[] nullArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21656);final float[] emptyArray = new float[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21657);final float[] oneArray = new float[] {2.5f};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21658);final float[] twoArray = new float[] {6.4f, 5.8f};
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21659);assertTrue(ArrayUtils.isSameLength(nullArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21660);assertTrue(ArrayUtils.isSameLength(nullArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21661);assertFalse(ArrayUtils.isSameLength(nullArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21662);assertFalse(ArrayUtils.isSameLength(nullArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21663);assertTrue(ArrayUtils.isSameLength(emptyArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21664);assertTrue(ArrayUtils.isSameLength(emptyArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21665);assertFalse(ArrayUtils.isSameLength(emptyArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21666);assertFalse(ArrayUtils.isSameLength(emptyArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21667);assertFalse(ArrayUtils.isSameLength(oneArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21668);assertFalse(ArrayUtils.isSameLength(oneArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21669);assertTrue(ArrayUtils.isSameLength(oneArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21670);assertFalse(ArrayUtils.isSameLength(oneArray, twoArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21671);assertFalse(ArrayUtils.isSameLength(twoArray, nullArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21672);assertFalse(ArrayUtils.isSameLength(twoArray, emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21673);assertFalse(ArrayUtils.isSameLength(twoArray, oneArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21674);assertTrue(ArrayUtils.isSameLength(twoArray, twoArray));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testSameType() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fxwlfdgq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testSameType",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21675,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fxwlfdgq3(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21675);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21676);try {
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21677);ArrayUtils.isSameType(null, null);
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21678);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21679);try {
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21680);ArrayUtils.isSameType(null, new Object[0]);
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21681);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21682);try {
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21683);ArrayUtils.isSameType(new Object[0], null);
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(21684);fail();
        } catch (final IllegalArgumentException ex) {}
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21685);assertTrue(ArrayUtils.isSameType(new Object[0], new Object[0]));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21686);assertFalse(ArrayUtils.isSameType(new String[0], new Object[0]));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21687);assertTrue(ArrayUtils.isSameType(new String[0][0], new String[0][0]));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21688);assertFalse(ArrayUtils.isSameType(new String[0], new String[0][0]));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21689);assertFalse(ArrayUtils.isSameType(new String[0][0], new String[0]));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testReverse() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q8om2xgqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverse",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21690,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q8om2xgqi(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21690);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21691);final StringBuffer str1 = new StringBuffer("pick");
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21692);final String str2 = "a";
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21693);final String[] str3 = new String[] {"stick"};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21694);final String str4 = "up";
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21695);Object[] array = new Object[] {str1, str2, str3};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21696);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21697);assertEquals(array[0], str3);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21698);assertEquals(array[1], str2);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21699);assertEquals(array[2], str1);
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21700);array = new Object[] {str1, str2, str3, str4};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21701);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21702);assertEquals(array[0], str4);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21703);assertEquals(array[1], str3);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21704);assertEquals(array[2], str2);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21705);assertEquals(array[3], str1);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21706);array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21707);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21708);assertArrayEquals(null, array);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testReverseLong() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ymavrngr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21709,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ymavrngr1(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21709);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21710);long[] array = new long[] {1L, 2L, 3L};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21711);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21712);assertEquals(array[0], 3L);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21713);assertEquals(array[1], 2L);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21714);assertEquals(array[2], 1L);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21715);array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21716);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21717);assertEquals(null, array);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testReverseInt() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bxba2igra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21718,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bxba2igra(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21718);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21719);int[] array = new int[] {1, 2, 3};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21720);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21721);assertEquals(array[0], 3);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21722);assertEquals(array[1], 2);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21723);assertEquals(array[2], 1);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21724);array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21725);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21726);assertEquals(null, array);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testReverseShort() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ox62fhgrj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21727,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ox62fhgrj(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21727);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21728);short[] array = new short[] {1, 2, 3};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21729);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21730);assertEquals(array[0], 3);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21731);assertEquals(array[1], 2);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21732);assertEquals(array[2], 1);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21733);array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21734);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21735);assertEquals(null, array);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testReverseChar() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2agi2gdgrs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21736,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2agi2gdgrs(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21736);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21737);char[] array = new char[] {'a', 'f', 'C'};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21738);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21739);assertEquals(array[0], 'C');
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21740);assertEquals(array[1], 'f');
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21741);assertEquals(array[2], 'a');

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21742);array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21743);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21744);assertEquals(null, array);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testReverseByte() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25i538hgs1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21745,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25i538hgs1(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21745);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21746);byte[] array = new byte[] {2, 3, 4};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21747);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21748);assertEquals(array[0], 4);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21749);assertEquals(array[1], 3);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21750);assertEquals(array[2], 2);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21751);array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21752);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21753);assertEquals(null, array);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testReverseDouble() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lv5ipkgsa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21754,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lv5ipkgsa(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21754);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21755);double[] array = new double[] {0.3d, 0.4d, 0.5d};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21756);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21757);assertEquals(array[0], 0.5d, 0.0d);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21758);assertEquals(array[1], 0.4d, 0.0d);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21759);assertEquals(array[2], 0.3d, 0.0d);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21760);array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21761);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21762);assertEquals(null, array);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testReverseFloat() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jv191vgsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21763,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jv191vgsj(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21763);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21764);float[] array = new float[] {0.3f, 0.4f, 0.5f};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21765);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21766);assertEquals(array[0], 0.5f, 0.0f);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21767);assertEquals(array[1], 0.4f, 0.0f);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21768);assertEquals(array[2], 0.3f, 0.0f);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21769);array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21770);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21771);assertEquals(null, array);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @Test
    public void testReverseBoolean() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25r0x9bgss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testReverseBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21772,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25r0x9bgss(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21772);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21773);boolean[] array = new boolean[] {false, false, true};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21774);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21775);assertTrue(array[0]);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21776);assertFalse(array[1]);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21777);assertFalse(array[2]);

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21778);array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21779);ArrayUtils.reverse(array);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21780);assertEquals(null, array);
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIndexOf() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2656tvigt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOf",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21781,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2656tvigt1(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21781);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21782);final Object[] array = new Object[] { "0", "1", "2", "3", null, "0" };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21783);assertEquals(-1, ArrayUtils.indexOf(null, null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21784);assertEquals(-1, ArrayUtils.indexOf(null, "0"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21785);assertEquals(-1, ArrayUtils.indexOf(new Object[0], "0"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21786);assertEquals(0, ArrayUtils.indexOf(array, "0"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21787);assertEquals(1, ArrayUtils.indexOf(array, "1"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21788);assertEquals(2, ArrayUtils.indexOf(array, "2"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21789);assertEquals(3, ArrayUtils.indexOf(array, "3"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21790);assertEquals(4, ArrayUtils.indexOf(array, null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21791);assertEquals(-1, ArrayUtils.indexOf(array, "notInArray"));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testIndexOfWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nmwdv0gtc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21792,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nmwdv0gtc(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21792);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21793);final Object[] array = new Object[] { "0", "1", "2", "3", null, "0" };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21794);assertEquals(-1, ArrayUtils.indexOf(null, null, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21795);assertEquals(-1, ArrayUtils.indexOf(new Object[0], "0", 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21796);assertEquals(-1, ArrayUtils.indexOf(null, "0", 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21797);assertEquals(5, ArrayUtils.indexOf(array, "0", 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21798);assertEquals(-1, ArrayUtils.indexOf(array, "1", 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21799);assertEquals(2, ArrayUtils.indexOf(array, "2", 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21800);assertEquals(3, ArrayUtils.indexOf(array, "3", 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21801);assertEquals(4, ArrayUtils.indexOf(array, null, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21802);assertEquals(-1, ArrayUtils.indexOf(array, "notInArray", 2));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21803);assertEquals(4, ArrayUtils.indexOf(array, null, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21804);assertEquals(-1, ArrayUtils.indexOf(array, null, 8));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21805);assertEquals(-1, ArrayUtils.indexOf(array, "0", 8));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOf() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27nbvncgtq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOf",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21806,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27nbvncgtq(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21806);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21807);final Object[] array = new Object[] { "0", "1", "2", "3", null, "0" };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21808);assertEquals(-1, ArrayUtils.lastIndexOf(null, null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21809);assertEquals(-1, ArrayUtils.lastIndexOf(null, "0"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21810);assertEquals(5, ArrayUtils.lastIndexOf(array, "0"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21811);assertEquals(1, ArrayUtils.lastIndexOf(array, "1"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21812);assertEquals(2, ArrayUtils.lastIndexOf(array, "2"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21813);assertEquals(3, ArrayUtils.lastIndexOf(array, "3"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21814);assertEquals(4, ArrayUtils.lastIndexOf(array, null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21815);assertEquals(-1, ArrayUtils.lastIndexOf(array, "notInArray"));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOfWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yzp3z6gu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21816,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yzp3z6gu0(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21816);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21817);final Object[] array = new Object[] { "0", "1", "2", "3", null, "0" };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21818);assertEquals(-1, ArrayUtils.lastIndexOf(null, null, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21819);assertEquals(-1, ArrayUtils.lastIndexOf(null, "0", 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21820);assertEquals(0, ArrayUtils.lastIndexOf(array, "0", 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21821);assertEquals(1, ArrayUtils.lastIndexOf(array, "1", 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21822);assertEquals(2, ArrayUtils.lastIndexOf(array, "2", 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21823);assertEquals(-1, ArrayUtils.lastIndexOf(array, "3", 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21824);assertEquals(-1, ArrayUtils.lastIndexOf(array, "3", -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21825);assertEquals(4, ArrayUtils.lastIndexOf(array, null, 5));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21826);assertEquals(-1, ArrayUtils.lastIndexOf(array, null, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21827);assertEquals(-1, ArrayUtils.lastIndexOf(array, "notInArray", 5));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21828);assertEquals(-1, ArrayUtils.lastIndexOf(array, null, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21829);assertEquals(5, ArrayUtils.lastIndexOf(array, "0", 88));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testContains() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2y9zhfsgue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContains",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21830,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2y9zhfsgue(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21830);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21831);final Object[] array = new Object[] { "0", "1", "2", "3", null, "0" };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21832);assertFalse(ArrayUtils.contains(null, null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21833);assertFalse(ArrayUtils.contains(null, "1"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21834);assertTrue(ArrayUtils.contains(array, "0"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21835);assertTrue(ArrayUtils.contains(array, "1"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21836);assertTrue(ArrayUtils.contains(array, "2"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21837);assertTrue(ArrayUtils.contains(array, "3"));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21838);assertTrue(ArrayUtils.contains(array, null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21839);assertFalse(ArrayUtils.contains(array, "notInArray"));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfLong() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m44bdyguo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21840,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m44bdyguo(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21840);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21841);long[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21842);assertEquals(-1, ArrayUtils.indexOf(array, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21843);array = new long[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21844);assertEquals(0, ArrayUtils.indexOf(array, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21845);assertEquals(1, ArrayUtils.indexOf(array, 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21846);assertEquals(2, ArrayUtils.indexOf(array, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21847);assertEquals(3, ArrayUtils.indexOf(array, 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21848);assertEquals(-1, ArrayUtils.indexOf(array, 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testIndexOfLongWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kv0hw0gux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfLongWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21849,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kv0hw0gux(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21849);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21850);long[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21851);assertEquals(-1, ArrayUtils.indexOf(array, 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21852);array = new long[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21853);assertEquals(4, ArrayUtils.indexOf(array, 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21854);assertEquals(-1, ArrayUtils.indexOf(array, 1, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21855);assertEquals(2, ArrayUtils.indexOf(array, 2, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21856);assertEquals(3, ArrayUtils.indexOf(array, 3, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21857);assertEquals(3, ArrayUtils.indexOf(array, 3, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21858);assertEquals(-1, ArrayUtils.indexOf(array, 99, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21859);assertEquals(-1, ArrayUtils.indexOf(array, 0, 6));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOfLong() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gw9ie4gv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21860,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gw9ie4gv8(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21860);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21861);long[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21862);assertEquals(-1, ArrayUtils.lastIndexOf(array, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21863);array = new long[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21864);assertEquals(4, ArrayUtils.lastIndexOf(array, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21865);assertEquals(1, ArrayUtils.lastIndexOf(array, 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21866);assertEquals(2, ArrayUtils.lastIndexOf(array, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21867);assertEquals(3, ArrayUtils.lastIndexOf(array, 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21868);assertEquals(-1, ArrayUtils.lastIndexOf(array, 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOfLongWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cbjznegvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfLongWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21869,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cbjznegvh(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21869);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21870);long[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21871);assertEquals(-1, ArrayUtils.lastIndexOf(array, 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21872);array = new long[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21873);assertEquals(0, ArrayUtils.lastIndexOf(array, 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21874);assertEquals(1, ArrayUtils.lastIndexOf(array, 1, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21875);assertEquals(2, ArrayUtils.lastIndexOf(array, 2, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21876);assertEquals(-1, ArrayUtils.lastIndexOf(array, 3, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21877);assertEquals(-1, ArrayUtils.lastIndexOf(array, 3, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21878);assertEquals(-1, ArrayUtils.lastIndexOf(array, 99, 4));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21879);assertEquals(4, ArrayUtils.lastIndexOf(array, 0, 88));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testContainsLong() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b5t3scgvs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21880,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b5t3scgvs(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21880);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21881);long[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21882);assertFalse(ArrayUtils.contains(array, 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21883);array = new long[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21884);assertTrue(ArrayUtils.contains(array, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21885);assertTrue(ArrayUtils.contains(array, 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21886);assertTrue(ArrayUtils.contains(array, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21887);assertTrue(ArrayUtils.contains(array, 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21888);assertFalse(ArrayUtils.contains(array, 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfInt() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w33ixtgw1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21889,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w33ixtgw1(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21889);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21890);int[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21891);assertEquals(-1, ArrayUtils.indexOf(array, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21892);array = new int[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21893);assertEquals(0, ArrayUtils.indexOf(array, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21894);assertEquals(1, ArrayUtils.indexOf(array, 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21895);assertEquals(2, ArrayUtils.indexOf(array, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21896);assertEquals(3, ArrayUtils.indexOf(array, 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21897);assertEquals(-1, ArrayUtils.indexOf(array, 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testIndexOfIntWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2co5aobgwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfIntWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21898,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2co5aobgwa(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21898);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21899);int[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21900);assertEquals(-1, ArrayUtils.indexOf(array, 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21901);array = new int[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21902);assertEquals(4, ArrayUtils.indexOf(array, 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21903);assertEquals(-1, ArrayUtils.indexOf(array, 1, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21904);assertEquals(2, ArrayUtils.indexOf(array, 2, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21905);assertEquals(3, ArrayUtils.indexOf(array, 3, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21906);assertEquals(3, ArrayUtils.indexOf(array, 3, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21907);assertEquals(-1, ArrayUtils.indexOf(array, 99, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21908);assertEquals(-1, ArrayUtils.indexOf(array, 0, 6));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOfInt() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_224p7vvgwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21909,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_224p7vvgwl(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21909);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21910);int[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21911);assertEquals(-1, ArrayUtils.lastIndexOf(array, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21912);array = new int[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21913);assertEquals(4, ArrayUtils.lastIndexOf(array, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21914);assertEquals(1, ArrayUtils.lastIndexOf(array, 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21915);assertEquals(2, ArrayUtils.lastIndexOf(array, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21916);assertEquals(3, ArrayUtils.lastIndexOf(array, 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21917);assertEquals(-1, ArrayUtils.lastIndexOf(array, 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOfIntWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fw8jorgwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfIntWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21918,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fw8jorgwu(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21918);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21919);int[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21920);assertEquals(-1, ArrayUtils.lastIndexOf(array, 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21921);array = new int[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21922);assertEquals(0, ArrayUtils.lastIndexOf(array, 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21923);assertEquals(1, ArrayUtils.lastIndexOf(array, 1, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21924);assertEquals(2, ArrayUtils.lastIndexOf(array, 2, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21925);assertEquals(-1, ArrayUtils.lastIndexOf(array, 3, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21926);assertEquals(-1, ArrayUtils.lastIndexOf(array, 3, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21927);assertEquals(-1, ArrayUtils.lastIndexOf(array, 99));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21928);assertEquals(4, ArrayUtils.lastIndexOf(array, 0, 88));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testContainsInt() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ruaorpgx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21929,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ruaorpgx5(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21929);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21930);int[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21931);assertFalse(ArrayUtils.contains(array, 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21932);array = new int[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21933);assertTrue(ArrayUtils.contains(array, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21934);assertTrue(ArrayUtils.contains(array, 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21935);assertTrue(ArrayUtils.contains(array, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21936);assertTrue(ArrayUtils.contains(array, 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21937);assertFalse(ArrayUtils.contains(array, 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfShort() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27wfuusgxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21938,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27wfuusgxe(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21938);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21939);short[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21940);assertEquals(-1, ArrayUtils.indexOf(array, (short) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21941);array = new short[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21942);assertEquals(0, ArrayUtils.indexOf(array, (short) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21943);assertEquals(1, ArrayUtils.indexOf(array, (short) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21944);assertEquals(2, ArrayUtils.indexOf(array, (short) 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21945);assertEquals(3, ArrayUtils.indexOf(array, (short) 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21946);assertEquals(-1, ArrayUtils.indexOf(array, (short) 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testIndexOfShortWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2exzi5egxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfShortWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21947,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2exzi5egxn(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21947);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21948);short[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21949);assertEquals(-1, ArrayUtils.indexOf(array, (short) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21950);array = new short[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21951);assertEquals(4, ArrayUtils.indexOf(array, (short) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21952);assertEquals(-1, ArrayUtils.indexOf(array, (short) 1, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21953);assertEquals(2, ArrayUtils.indexOf(array, (short) 2, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21954);assertEquals(3, ArrayUtils.indexOf(array, (short) 3, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21955);assertEquals(3, ArrayUtils.indexOf(array, (short) 3, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21956);assertEquals(-1, ArrayUtils.indexOf(array, (short) 99, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21957);assertEquals(-1, ArrayUtils.indexOf(array, (short) 0, 6));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOfShort() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bsv01ugxy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21958,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bsv01ugxy(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21958);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21959);short[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21960);assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21961);array = new short[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21962);assertEquals(4, ArrayUtils.lastIndexOf(array, (short) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21963);assertEquals(1, ArrayUtils.lastIndexOf(array, (short) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21964);assertEquals(2, ArrayUtils.lastIndexOf(array, (short) 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21965);assertEquals(3, ArrayUtils.lastIndexOf(array, (short) 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21966);assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOfShortWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lv27s8gy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfShortWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21967,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lv27s8gy7(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21967);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21968);short[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21969);assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21970);array = new short[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21971);assertEquals(0, ArrayUtils.lastIndexOf(array, (short) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21972);assertEquals(1, ArrayUtils.lastIndexOf(array, (short) 1, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21973);assertEquals(2, ArrayUtils.lastIndexOf(array, (short) 2, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21974);assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 3, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21975);assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 3, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21976);assertEquals(-1, ArrayUtils.lastIndexOf(array, (short) 99));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21977);assertEquals(4, ArrayUtils.lastIndexOf(array, (short) 0, 88));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testContainsShort() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nicl4egyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21978,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nicl4egyi(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21978);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21979);short[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21980);assertFalse(ArrayUtils.contains(array, (short) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21981);array = new short[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21982);assertTrue(ArrayUtils.contains(array, (short) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21983);assertTrue(ArrayUtils.contains(array, (short) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21984);assertTrue(ArrayUtils.contains(array, (short) 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21985);assertTrue(ArrayUtils.contains(array, (short) 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21986);assertFalse(ArrayUtils.contains(array, (short) 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfChar() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2or6x9wgyr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21987,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2or6x9wgyr(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21987);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21988);char[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21989);assertEquals(-1, ArrayUtils.indexOf(array, 'a'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21990);array = new char[] { 'a', 'b', 'c', 'd', 'a' };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21991);assertEquals(0, ArrayUtils.indexOf(array, 'a'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21992);assertEquals(1, ArrayUtils.indexOf(array, 'b'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21993);assertEquals(2, ArrayUtils.indexOf(array, 'c'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21994);assertEquals(3, ArrayUtils.indexOf(array, 'd'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21995);assertEquals(-1, ArrayUtils.indexOf(array, 'e'));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testIndexOfCharWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),21996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2of34aegz0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfCharWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),21996,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2of34aegz0(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(21996);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21997);char[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21998);assertEquals(-1, ArrayUtils.indexOf(array, 'a', 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(21999);array = new char[] { 'a', 'b', 'c', 'd', 'a' };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22000);assertEquals(4, ArrayUtils.indexOf(array, 'a', 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22001);assertEquals(-1, ArrayUtils.indexOf(array, 'b', 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22002);assertEquals(2, ArrayUtils.indexOf(array, 'c', 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22003);assertEquals(3, ArrayUtils.indexOf(array, 'd', 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22004);assertEquals(3, ArrayUtils.indexOf(array, 'd', -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22005);assertEquals(-1, ArrayUtils.indexOf(array, 'e', 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22006);assertEquals(-1, ArrayUtils.indexOf(array, 'a', 6));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOfChar() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tz1q9qgzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22007,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tz1q9qgzb(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22007);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22008);char[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22009);assertEquals(-1, ArrayUtils.lastIndexOf(array, 'a'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22010);array = new char[] { 'a', 'b', 'c', 'd', 'a' };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22011);assertEquals(4, ArrayUtils.lastIndexOf(array, 'a'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22012);assertEquals(1, ArrayUtils.lastIndexOf(array, 'b'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22013);assertEquals(2, ArrayUtils.lastIndexOf(array, 'c'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22014);assertEquals(3, ArrayUtils.lastIndexOf(array, 'd'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22015);assertEquals(-1, ArrayUtils.lastIndexOf(array, 'e'));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOfCharWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28rhd90gzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfCharWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22016,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28rhd90gzk(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22016);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22017);char[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22018);assertEquals(-1, ArrayUtils.lastIndexOf(array, 'a', 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22019);array = new char[] { 'a', 'b', 'c', 'd', 'a' };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22020);assertEquals(0, ArrayUtils.lastIndexOf(array, 'a', 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22021);assertEquals(1, ArrayUtils.lastIndexOf(array, 'b', 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22022);assertEquals(2, ArrayUtils.lastIndexOf(array, 'c', 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22023);assertEquals(-1, ArrayUtils.lastIndexOf(array, 'd', 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22024);assertEquals(-1, ArrayUtils.lastIndexOf(array, 'd', -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22025);assertEquals(-1, ArrayUtils.lastIndexOf(array, 'e'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22026);assertEquals(4, ArrayUtils.lastIndexOf(array, 'a', 88));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testContainsChar() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zblx3mgzv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22027,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zblx3mgzv(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22027);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22028);char[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22029);assertFalse(ArrayUtils.contains(array, 'b'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22030);array = new char[] { 'a', 'b', 'c', 'd', 'a' };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22031);assertTrue(ArrayUtils.contains(array, 'a'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22032);assertTrue(ArrayUtils.contains(array, 'b'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22033);assertTrue(ArrayUtils.contains(array, 'c'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22034);assertTrue(ArrayUtils.contains(array, 'd'));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22035);assertFalse(ArrayUtils.contains(array, 'e'));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfByte() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28sjrl2h04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22036,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28sjrl2h04(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22036);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22037);byte[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22038);assertEquals(-1, ArrayUtils.indexOf(array, (byte) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22039);array = new byte[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22040);assertEquals(0, ArrayUtils.indexOf(array, (byte) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22041);assertEquals(1, ArrayUtils.indexOf(array, (byte) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22042);assertEquals(2, ArrayUtils.indexOf(array, (byte) 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22043);assertEquals(3, ArrayUtils.indexOf(array, (byte) 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22044);assertEquals(-1, ArrayUtils.indexOf(array, (byte) 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testIndexOfByteWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i7jog4h0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfByteWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22045,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i7jog4h0d(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22045);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22046);byte[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22047);assertEquals(-1, ArrayUtils.indexOf(array, (byte) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22048);array = new byte[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22049);assertEquals(4, ArrayUtils.indexOf(array, (byte) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22050);assertEquals(-1, ArrayUtils.indexOf(array, (byte) 1, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22051);assertEquals(2, ArrayUtils.indexOf(array, (byte) 2, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22052);assertEquals(3, ArrayUtils.indexOf(array, (byte) 3, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22053);assertEquals(3, ArrayUtils.indexOf(array, (byte) 3, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22054);assertEquals(-1, ArrayUtils.indexOf(array, (byte) 99, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22055);assertEquals(-1, ArrayUtils.indexOf(array, (byte) 0, 6));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOfByte() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2e0ekkwh0o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22056,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2e0ekkwh0o(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22056);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22057);byte[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22058);assertEquals(-1, ArrayUtils.lastIndexOf(array, (byte) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22059);array = new byte[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22060);assertEquals(4, ArrayUtils.lastIndexOf(array, (byte) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22061);assertEquals(1, ArrayUtils.lastIndexOf(array, (byte) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22062);assertEquals(2, ArrayUtils.lastIndexOf(array, (byte) 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22063);assertEquals(3, ArrayUtils.lastIndexOf(array, (byte) 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22064);assertEquals(-1, ArrayUtils.lastIndexOf(array, (byte) 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOfByteWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ez0t3ah0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfByteWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22065,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ez0t3ah0x(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22065);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22066);byte[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22067);assertEquals(-1, ArrayUtils.lastIndexOf(array, (byte) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22068);array = new byte[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22069);assertEquals(0, ArrayUtils.lastIndexOf(array, (byte) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22070);assertEquals(1, ArrayUtils.lastIndexOf(array, (byte) 1, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22071);assertEquals(2, ArrayUtils.lastIndexOf(array, (byte) 2, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22072);assertEquals(-1, ArrayUtils.lastIndexOf(array, (byte) 3, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22073);assertEquals(-1, ArrayUtils.lastIndexOf(array, (byte) 3, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22074);assertEquals(-1, ArrayUtils.lastIndexOf(array, (byte) 99));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22075);assertEquals(4, ArrayUtils.lastIndexOf(array, (byte) 0, 88));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testContainsByte() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22076);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jquz6oh18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22076,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jquz6oh18(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22076);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22077);byte[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22078);assertFalse(ArrayUtils.contains(array, (byte) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22079);array = new byte[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22080);assertTrue(ArrayUtils.contains(array, (byte) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22081);assertTrue(ArrayUtils.contains(array, (byte) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22082);assertTrue(ArrayUtils.contains(array, (byte) 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22083);assertTrue(ArrayUtils.contains(array, (byte) 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22084);assertFalse(ArrayUtils.contains(array, (byte) 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @SuppressWarnings("cast")
    @Test
    public void testIndexOfDouble() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28jmma7h1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22085,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28jmma7h1h(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22085);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22086);double[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22087);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22088);array = new double[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22089);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22090);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22091);assertEquals(0, ArrayUtils.indexOf(array, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22092);assertEquals(1, ArrayUtils.indexOf(array, (double) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22093);assertEquals(2, ArrayUtils.indexOf(array, (double) 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22094);assertEquals(3, ArrayUtils.indexOf(array, (double) 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22095);assertEquals(3, ArrayUtils.indexOf(array, (double) 3, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22096);assertEquals(-1, ArrayUtils.indexOf(array, (double) 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testIndexOfDoubleTolerance() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a56gekh1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfDoubleTolerance",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22097,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a56gekh1t(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22097);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22098);double[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22099);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22100);array = new double[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22101);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22102);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22103);assertEquals(0, ArrayUtils.indexOf(array, (double) 0, (double) 0.3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22104);assertEquals(2, ArrayUtils.indexOf(array, (double) 2.2, (double) 0.35));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22105);assertEquals(3, ArrayUtils.indexOf(array, (double) 4.15, (double) 2.0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22106);assertEquals(1, ArrayUtils.indexOf(array, (double) 1.00001324, (double) 0.0001));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testIndexOfDoubleWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23bay05h23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfDoubleWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22107,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23bay05h23(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22107);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22108);double[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22109);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22110);array = new double[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22111);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22112);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22113);assertEquals(4, ArrayUtils.indexOf(array, (double) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22114);assertEquals(-1, ArrayUtils.indexOf(array, (double) 1, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22115);assertEquals(2, ArrayUtils.indexOf(array, (double) 2, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22116);assertEquals(3, ArrayUtils.indexOf(array, (double) 3, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22117);assertEquals(-1, ArrayUtils.indexOf(array, (double) 99, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22118);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, 6));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    @SuppressWarnings("cast")
    @Test
    public void testIndexOfDoubleWithStartIndexTolerance() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x0yn7uh2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfDoubleWithStartIndexTolerance",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22119,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x0yn7uh2f(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22119);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22120);double[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22121);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, 2, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22122);array = new double[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22123);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, 2, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22124);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22125);assertEquals(-1, ArrayUtils.indexOf(array, (double) 0, 99, (double) 0.3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22126);assertEquals(0, ArrayUtils.indexOf(array, (double) 0, 0, (double) 0.3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22127);assertEquals(4, ArrayUtils.indexOf(array, (double) 0, 3, (double) 0.3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22128);assertEquals(2, ArrayUtils.indexOf(array, (double) 2.2, 0, (double) 0.35));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22129);assertEquals(3, ArrayUtils.indexOf(array, (double) 4.15, 0, (double) 2.0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22130);assertEquals(1, ArrayUtils.indexOf(array, (double) 1.00001324, 0, (double) 0.0001));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22131);assertEquals(3, ArrayUtils.indexOf(array, (double) 4.15, -1, (double) 2.0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22132);assertEquals(1, ArrayUtils.indexOf(array, (double) 1.00001324, -300, (double) 0.0001));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testLastIndexOfDouble() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jy19evh2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22133,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jy19evh2t(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22133);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22134);double[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22135);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22136);array = new double[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22137);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22138);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22139);assertEquals(4, ArrayUtils.lastIndexOf(array, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22140);assertEquals(1, ArrayUtils.lastIndexOf(array, (double) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22141);assertEquals(2, ArrayUtils.lastIndexOf(array, (double) 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22142);assertEquals(3, ArrayUtils.lastIndexOf(array, (double) 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22143);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testLastIndexOfDoubleTolerance() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2da08oyh34();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfDoubleTolerance",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22144,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2da08oyh34(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22144);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22145);double[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22146);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22147);array = new double[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22148);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22149);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22150);assertEquals(4, ArrayUtils.lastIndexOf(array, (double) 0, (double) 0.3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22151);assertEquals(2, ArrayUtils.lastIndexOf(array, (double) 2.2, (double) 0.35));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22152);assertEquals(3, ArrayUtils.lastIndexOf(array, (double) 4.15, (double) 2.0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22153);assertEquals(1, ArrayUtils.lastIndexOf(array, (double) 1.00001324, (double) 0.0001));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testLastIndexOfDoubleWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_217dic1h3e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfDoubleWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22154,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_217dic1h3e(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22154);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22155);double[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22156);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22157);array = new double[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22158);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22159);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22160);assertEquals(0, ArrayUtils.lastIndexOf(array, (double) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22161);assertEquals(1, ArrayUtils.lastIndexOf(array, (double) 1, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22162);assertEquals(2, ArrayUtils.lastIndexOf(array, (double) 2, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22163);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 3, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22164);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 3, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22165);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 99));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22166);assertEquals(4, ArrayUtils.lastIndexOf(array, (double) 0, 88));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testLastIndexOfDoubleWithStartIndexTolerance() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v4wx64h3r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfDoubleWithStartIndexTolerance",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22167,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v4wx64h3r(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22167);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22168);double[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22169);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0, 2, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22170);array = new double[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22171);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 0, 2, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22172);array = new double[] { (double) 3 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22173);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 1, 0, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22174);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22175);assertEquals(4, ArrayUtils.lastIndexOf(array, (double) 0, 99, (double) 0.3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22176);assertEquals(0, ArrayUtils.lastIndexOf(array, (double) 0, 3, (double) 0.3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22177);assertEquals(2, ArrayUtils.lastIndexOf(array, (double) 2.2, 3, (double) 0.35));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22178);assertEquals(3, ArrayUtils.lastIndexOf(array, (double) 4.15, array.length, (double) 2.0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22179);assertEquals(1, ArrayUtils.lastIndexOf(array, (double) 1.00001324, array.length, (double) 0.0001));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22180);assertEquals(-1, ArrayUtils.lastIndexOf(array, (double) 4.15, -200, (double) 2.0));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testContainsDouble() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lw8du1h45();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22181,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lw8du1h45(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22181);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22182);double[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22183);assertFalse(ArrayUtils.contains(array, (double) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22184);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22185);assertTrue(ArrayUtils.contains(array, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22186);assertTrue(ArrayUtils.contains(array, (double) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22187);assertTrue(ArrayUtils.contains(array, (double) 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22188);assertTrue(ArrayUtils.contains(array, (double) 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22189);assertFalse(ArrayUtils.contains(array, (double) 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testContainsDoubleTolerance() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g30tg2h4e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsDoubleTolerance",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22190,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g30tg2h4e(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22190);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22191);double[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22192);assertFalse(ArrayUtils.contains(array, (double) 1, (double) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22193);array = new double[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22194);assertFalse(ArrayUtils.contains(array, (double) 4.0, (double) 0.33));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22195);assertFalse(ArrayUtils.contains(array, (double) 2.5, (double) 0.49));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22196);assertTrue(ArrayUtils.contains(array, (double) 2.5, (double) 0.50));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22197);assertTrue(ArrayUtils.contains(array, (double) 2.5, (double) 0.51));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @SuppressWarnings("cast")
    @Test
    public void testIndexOfFloat() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2y5clckh4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22198,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2y5clckh4m(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22198);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22199);float[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22200);assertEquals(-1, ArrayUtils.indexOf(array, (float) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22201);array = new float[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22202);assertEquals(-1, ArrayUtils.indexOf(array, (float) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22203);array = new float[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22204);assertEquals(0, ArrayUtils.indexOf(array, (float) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22205);assertEquals(1, ArrayUtils.indexOf(array, (float) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22206);assertEquals(2, ArrayUtils.indexOf(array, (float) 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22207);assertEquals(3, ArrayUtils.indexOf(array, (float) 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22208);assertEquals(-1, ArrayUtils.indexOf(array, (float) 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testIndexOfFloatWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mv7wxuh4x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfFloatWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22209,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mv7wxuh4x(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22209);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22210);float[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22211);assertEquals(-1, ArrayUtils.indexOf(array, (float) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22212);array = new float[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22213);assertEquals(-1, ArrayUtils.indexOf(array, (float) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22214);array = new float[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22215);assertEquals(4, ArrayUtils.indexOf(array, (float) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22216);assertEquals(-1, ArrayUtils.indexOf(array, (float) 1, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22217);assertEquals(2, ArrayUtils.indexOf(array, (float) 2, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22218);assertEquals(3, ArrayUtils.indexOf(array, (float) 3, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22219);assertEquals(3, ArrayUtils.indexOf(array, (float) 3, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22220);assertEquals(-1, ArrayUtils.indexOf(array, (float) 99, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22221);assertEquals(-1, ArrayUtils.indexOf(array, (float) 0, 6));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testLastIndexOfFloat() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2eg1qfyh5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22222,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2eg1qfyh5a(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22222);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22223);float[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22224);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22225);array = new float[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22226);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22227);array = new float[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22228);assertEquals(4, ArrayUtils.lastIndexOf(array, (float) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22229);assertEquals(1, ArrayUtils.lastIndexOf(array, (float) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22230);assertEquals(2, ArrayUtils.lastIndexOf(array, (float) 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22231);assertEquals(3, ArrayUtils.lastIndexOf(array, (float) 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22232);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testLastIndexOfFloatWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dxtszsh5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfFloatWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22233,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dxtszsh5l(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22233);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22234);float[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22235);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22236);array = new float[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22237);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22238);array = new float[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22239);assertEquals(0, ArrayUtils.lastIndexOf(array, (float) 0, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22240);assertEquals(1, ArrayUtils.lastIndexOf(array, (float) 1, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22241);assertEquals(2, ArrayUtils.lastIndexOf(array, (float) 2, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22242);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 3, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22243);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 3, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22244);assertEquals(-1, ArrayUtils.lastIndexOf(array, (float) 99));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22245);assertEquals(4, ArrayUtils.lastIndexOf(array, (float) 0, 88));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @SuppressWarnings("cast")
    @Test
    public void testContainsFloat() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2l9uqcyh5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22246,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2l9uqcyh5y(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22246);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22247);float[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22248);assertFalse(ArrayUtils.contains(array, (float) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22249);array = new float[] { 0, 1, 2, 3, 0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22250);assertTrue(ArrayUtils.contains(array, (float) 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22251);assertTrue(ArrayUtils.contains(array, (float) 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22252);assertTrue(ArrayUtils.contains(array, (float) 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22253);assertTrue(ArrayUtils.contains(array, (float) 3));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22254);assertFalse(ArrayUtils.contains(array, (float) 99));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIndexOfBoolean() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p2sid4h67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22255,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p2sid4h67(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22255);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22256);boolean[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22257);assertEquals(-1, ArrayUtils.indexOf(array, true));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22258);array = new boolean[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22259);assertEquals(-1, ArrayUtils.indexOf(array, true));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22260);array = new boolean[] { true, false, true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22261);assertEquals(0, ArrayUtils.indexOf(array, true));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22262);assertEquals(1, ArrayUtils.indexOf(array, false));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22263);array = new boolean[] { true, true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22264);assertEquals(-1, ArrayUtils.indexOf(array, false));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testIndexOfBooleanWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_276eusyh6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIndexOfBooleanWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22265,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_276eusyh6h(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22265);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22266);boolean[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22267);assertEquals(-1, ArrayUtils.indexOf(array, true, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22268);array = new boolean[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22269);assertEquals(-1, ArrayUtils.indexOf(array, true, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22270);array = new boolean[] { true, false, true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22271);assertEquals(2, ArrayUtils.indexOf(array, true, 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22272);assertEquals(-1, ArrayUtils.indexOf(array, false, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22273);assertEquals(1, ArrayUtils.indexOf(array, false, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22274);assertEquals(1, ArrayUtils.indexOf(array, false, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22275);array = new boolean[] { true, true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22276);assertEquals(-1, ArrayUtils.indexOf(array, false, 0));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22277);assertEquals(-1, ArrayUtils.indexOf(array, false, -1));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOfBoolean() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25rf4iah6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22278,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25rf4iah6u(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22278);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22279);boolean[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22280);assertEquals(-1, ArrayUtils.lastIndexOf(array, true));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22281);array = new boolean[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22282);assertEquals(-1, ArrayUtils.lastIndexOf(array, true));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22283);array = new boolean[] { true, false, true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22284);assertEquals(2, ArrayUtils.lastIndexOf(array, true));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22285);assertEquals(1, ArrayUtils.lastIndexOf(array, false));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22286);array = new boolean[] { true, true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22287);assertEquals(-1, ArrayUtils.lastIndexOf(array, false));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testLastIndexOfBooleanWithStartIndex() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2578tbwh74();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testLastIndexOfBooleanWithStartIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22288,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2578tbwh74(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22288);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22289);boolean[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22290);assertEquals(-1, ArrayUtils.lastIndexOf(array, true, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22291);array = new boolean[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22292);assertEquals(-1, ArrayUtils.lastIndexOf(array, true, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22293);array = new boolean[] { true, false, true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22294);assertEquals(2, ArrayUtils.lastIndexOf(array, true, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22295);assertEquals(0, ArrayUtils.lastIndexOf(array, true, 1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22296);assertEquals(1, ArrayUtils.lastIndexOf(array, false, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22297);assertEquals(-1, ArrayUtils.lastIndexOf(array, true, -1));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22298);array = new boolean[] { true, true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22299);assertEquals(-1, ArrayUtils.lastIndexOf(array, false, 2));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22300);assertEquals(-1, ArrayUtils.lastIndexOf(array, true, -1));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testContainsBoolean() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cquwlah7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testContainsBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22301,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cquwlah7h(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22301);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22302);boolean[] array = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22303);assertFalse(ArrayUtils.contains(array, true));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22304);array = new boolean[] { true, false, true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22305);assertTrue(ArrayUtils.contains(array, true));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22306);assertTrue(ArrayUtils.contains(array, false));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22307);array = new boolean[] { true, true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22308);assertTrue(ArrayUtils.contains(array, true));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22309);assertFalse(ArrayUtils.contains(array, false));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    // testToPrimitive/Object for boolean
    //  -----------------------------------------------------------------------
    @Test
    public void testToPrimitive_boolean() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2y21nreh7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22310,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2y21nreh7q(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22310);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22311);final Boolean[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22312);assertEquals(null, ArrayUtils.toPrimitive(b));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22313);assertSame(ArrayUtils.EMPTY_BOOLEAN_ARRAY, ArrayUtils.toPrimitive(new Boolean[0]));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22314);assertTrue(Arrays.equals(
            new boolean[] {true, false, true},
            ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, Boolean.FALSE, Boolean.TRUE}))
        );

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22315);try {
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(22316);ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, null});
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(22317);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testToPrimitive_boolean_boolean() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27mdep9h7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_boolean_boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22318,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27mdep9h7y(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22318);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22319);assertEquals(null, ArrayUtils.toPrimitive(null, false));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22320);assertSame(ArrayUtils.EMPTY_BOOLEAN_ARRAY, ArrayUtils.toPrimitive(new Boolean[0], false));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22321);assertTrue(Arrays.equals(
            new boolean[] {true, false, true},
            ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, Boolean.FALSE, Boolean.TRUE}, false))
        );
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22322);assertTrue(Arrays.equals(
            new boolean[] {true, false, false},
            ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, null, Boolean.FALSE}, false))
        );
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22323);assertTrue(Arrays.equals(
            new boolean[] {true, true, false},
            ArrayUtils.toPrimitive(new Boolean[] {Boolean.TRUE, null, Boolean.FALSE}, true))
        );
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testToObject_boolean() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2t4so9oh84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_boolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22324,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2t4so9oh84(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22324);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22325);final boolean[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22326);assertArrayEquals(null, ArrayUtils.toObject(b));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22327);assertSame(ArrayUtils.EMPTY_BOOLEAN_OBJECT_ARRAY, ArrayUtils.toObject(new boolean[0]));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22328);assertTrue(Arrays.equals(
            new Boolean[] {Boolean.TRUE, Boolean.FALSE, Boolean.TRUE},
            ArrayUtils.toObject(new boolean[] {true, false, true}))
        );
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    // testToPrimitive/Object for byte
    //  -----------------------------------------------------------------------
    @Test
    public void testToPrimitive_char() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22fm5cyh89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22329,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22fm5cyh89(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22329);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22330);final Character[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22331);assertEquals(null, ArrayUtils.toPrimitive(b));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22332);assertSame(ArrayUtils.EMPTY_CHAR_ARRAY, ArrayUtils.toPrimitive(new Character[0]));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22333);assertTrue(Arrays.equals(
            new char[] {Character.MIN_VALUE, Character.MAX_VALUE, '0'},
            ArrayUtils.toPrimitive(new Character[] {new Character(Character.MIN_VALUE), 
                new Character(Character.MAX_VALUE), new Character('0')}))
        );

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22334);try {
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(22335);ArrayUtils.toPrimitive(new Character[] {new Character(Character.MIN_VALUE), null});
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(22336);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testToPrimitive_char_char() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_263y4dbh8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_char_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22337,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_263y4dbh8h(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22337);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22338);final Character[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22339);assertEquals(null, ArrayUtils.toPrimitive(b, Character.MIN_VALUE));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22340);assertSame(ArrayUtils.EMPTY_CHAR_ARRAY, 
            ArrayUtils.toPrimitive(new Character[0], (char)0));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22341);assertTrue(Arrays.equals(
            new char[] {Character.MIN_VALUE, Character.MAX_VALUE, '0'},
            ArrayUtils.toPrimitive(new Character[] {new Character(Character.MIN_VALUE), 
                new Character(Character.MAX_VALUE), new Character('0')}, 
                Character.MIN_VALUE))
        );
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22342);assertTrue(Arrays.equals(
            new char[] {Character.MIN_VALUE, Character.MAX_VALUE, '0'},
            ArrayUtils.toPrimitive(new Character[] {new Character(Character.MIN_VALUE), null, 
                new Character('0')}, Character.MAX_VALUE))
        );
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testToObject_char() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_210sm8gh8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_char",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22343,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_210sm8gh8n(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22343);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22344);final char[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22345);assertArrayEquals(null, ArrayUtils.toObject(b));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22346);assertSame(ArrayUtils.EMPTY_CHARACTER_OBJECT_ARRAY, 
            ArrayUtils.toObject(new char[0]));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22347);assertTrue(Arrays.equals(
            new Character[] {new Character(Character.MIN_VALUE), 
                new Character(Character.MAX_VALUE), new Character('0')},
                ArrayUtils.toObject(new char[] {Character.MIN_VALUE, Character.MAX_VALUE, 
                '0'} ))
        );
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
    // testToPrimitive/Object for byte
    //  -----------------------------------------------------------------------
    @Test
    public void testToPrimitive_byte() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dj10bwh8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_byte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22348,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dj10bwh8s(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22348);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22349);final Byte[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22350);assertEquals(null, ArrayUtils.toPrimitive(b));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22351);assertSame(ArrayUtils.EMPTY_BYTE_ARRAY, ArrayUtils.toPrimitive(new Byte[0]));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22352);assertTrue(Arrays.equals(
            new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE, (byte)9999999},
            ArrayUtils.toPrimitive(new Byte[] {Byte.valueOf(Byte.MIN_VALUE), 
                Byte.valueOf(Byte.MAX_VALUE), Byte.valueOf((byte)9999999)}))
        );

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22353);try {
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(22354);ArrayUtils.toPrimitive(new Byte[] {Byte.valueOf(Byte.MIN_VALUE), null});
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(22355);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testToPrimitive_byte_byte() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25j7exrh90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_byte_byte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22356,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25j7exrh90(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22356);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22357);final Byte[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22358);assertEquals(null, ArrayUtils.toPrimitive(b, Byte.MIN_VALUE));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22359);assertSame(ArrayUtils.EMPTY_BYTE_ARRAY, 
            ArrayUtils.toPrimitive(new Byte[0], (byte)1));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22360);assertTrue(Arrays.equals(
            new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE, (byte)9999999},
            ArrayUtils.toPrimitive(new Byte[] {Byte.valueOf(Byte.MIN_VALUE), 
                Byte.valueOf(Byte.MAX_VALUE), Byte.valueOf((byte)9999999)}, 
                Byte.MIN_VALUE))
        );
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22361);assertTrue(Arrays.equals(
            new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE, (byte)9999999},
            ArrayUtils.toPrimitive(new Byte[] {Byte.valueOf(Byte.MIN_VALUE), null, 
                Byte.valueOf((byte)9999999)}, Byte.MAX_VALUE))
        );
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testToObject_byte() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2exujgeh96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_byte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22362,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2exujgeh96(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22362);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22363);final byte[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22364);assertArrayEquals(null, ArrayUtils.toObject(b));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22365);assertSame(ArrayUtils.EMPTY_BYTE_OBJECT_ARRAY, 
            ArrayUtils.toObject(new byte[0]));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22366);assertTrue(Arrays.equals(
            new Byte[] {Byte.valueOf(Byte.MIN_VALUE), 
                Byte.valueOf(Byte.MAX_VALUE), Byte.valueOf((byte)9999999)},
                ArrayUtils.toObject(new byte[] {Byte.MIN_VALUE, Byte.MAX_VALUE, 
                (byte)9999999}))
        );
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    // testToPrimitive/Object for short
    //  -----------------------------------------------------------------------
    @Test
    public void testToPrimitive_short() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2afsnj2h9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_short",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22367,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2afsnj2h9b(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22367);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22368);final Short[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22369);assertEquals(null, ArrayUtils.toPrimitive(b));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22370);assertSame(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.toPrimitive(new Short[0]));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22371);assertTrue(Arrays.equals(
            new short[] {Short.MIN_VALUE, Short.MAX_VALUE, (short)9999999},
            ArrayUtils.toPrimitive(new Short[] {Short.valueOf(Short.MIN_VALUE), 
                Short.valueOf(Short.MAX_VALUE), Short.valueOf((short)9999999)}))
        );

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22372);try {
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(22373);ArrayUtils.toPrimitive(new Short[] {Short.valueOf(Short.MIN_VALUE), null});
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(22374);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testToPrimitive_short_short() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23hz8zph9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_short_short",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22375,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23hz8zph9j(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22375);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22376);final Short[] s = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22377);assertEquals(null, ArrayUtils.toPrimitive(s, Short.MIN_VALUE));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22378);assertSame(ArrayUtils.EMPTY_SHORT_ARRAY, ArrayUtils.toPrimitive(new Short[0], 
        Short.MIN_VALUE));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22379);assertTrue(Arrays.equals(
            new short[] {Short.MIN_VALUE, Short.MAX_VALUE, (short)9999999},
            ArrayUtils.toPrimitive(new Short[] {Short.valueOf(Short.MIN_VALUE), 
                Short.valueOf(Short.MAX_VALUE), Short.valueOf((short)9999999)}, Short.MIN_VALUE))
        );
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22380);assertTrue(Arrays.equals(
            new short[] {Short.MIN_VALUE, Short.MAX_VALUE, (short)9999999},
            ArrayUtils.toPrimitive(new Short[] {Short.valueOf(Short.MIN_VALUE), null, 
                Short.valueOf((short)9999999)}, Short.MAX_VALUE))
        );
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testToObject_short() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xbmtcgh9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_short",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22381,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xbmtcgh9p(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22381);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22382);final short[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22383);assertArrayEquals(null, ArrayUtils.toObject(b));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22384);assertSame(ArrayUtils.EMPTY_SHORT_OBJECT_ARRAY, 
        ArrayUtils.toObject(new short[0]));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22385);assertTrue(Arrays.equals(
            new Short[] {Short.valueOf(Short.MIN_VALUE), Short.valueOf(Short.MAX_VALUE), 
                Short.valueOf((short)9999999)},
            ArrayUtils.toObject(new short[] {Short.MIN_VALUE, Short.MAX_VALUE, 
                (short)9999999}))
        );
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    //  testToPrimitive/Object for int
    //  -----------------------------------------------------------------------
     @Test
     public void testToPrimitive_int() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2659n1th9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22386,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2659n1th9u(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22386);
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22387);final Integer[] b = null;
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22388);assertEquals(null, ArrayUtils.toPrimitive(b));
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22389);assertSame(ArrayUtils.EMPTY_INT_ARRAY, ArrayUtils.toPrimitive(new Integer[0]));
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22390);assertTrue(Arrays.equals(
             new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Integer[] {Integer.valueOf(Integer.MIN_VALUE), 
                 Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(9999999)}))
         );

         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22391);try {
             __CLR4_1_2g5rg5rl3lqxthl.R.inc(22392);ArrayUtils.toPrimitive(new Integer[] {Integer.valueOf(Integer.MIN_VALUE), null});
             __CLR4_1_2g5rg5rl3lqxthl.R.inc(22393);fail();
         } catch (final NullPointerException ex) {}
     }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

     @Test
     public void testToPrimitive_int_int() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_233n8inha2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_int_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22394,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_233n8inha2(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22394);
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22395);final Long[] l = null;
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22396);assertEquals(null, ArrayUtils.toPrimitive(l, Integer.MIN_VALUE));
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22397);assertSame(ArrayUtils.EMPTY_INT_ARRAY, 
         ArrayUtils.toPrimitive(new Integer[0], 1));
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22398);assertTrue(Arrays.equals(
             new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Integer[] {Integer.valueOf(Integer.MIN_VALUE), 
                 Integer.valueOf(Integer.MAX_VALUE), Integer.valueOf(9999999)},1)));
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22399);assertTrue(Arrays.equals(
             new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Integer[] {Integer.valueOf(Integer.MIN_VALUE), 
                 null, Integer.valueOf(9999999)}, Integer.MAX_VALUE))
         );
     }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
     
    @Test
    public void testToPrimitive_intNull() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gg452wha8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_intNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22400,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gg452wha8(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22400);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22401);final Integer[] iArray = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22402);assertEquals(null, ArrayUtils.toPrimitive(iArray, Integer.MIN_VALUE));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    @Test
    public void testToObject_int() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xlh83nhab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_int",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22403,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xlh83nhab(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22403);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22404);final int[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22405);assertArrayEquals(null, ArrayUtils.toObject(b));
    
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22406);assertSame(
            ArrayUtils.EMPTY_INTEGER_OBJECT_ARRAY,
            ArrayUtils.toObject(new int[0]));
    
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22407);assertTrue(
            Arrays.equals(
                new Integer[] {
                    Integer.valueOf(Integer.MIN_VALUE),
                    Integer.valueOf(Integer.MAX_VALUE),
                    Integer.valueOf(9999999)},
            ArrayUtils.toObject(
                new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE, 9999999 })));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    //  testToPrimitive/Object for long
    //  -----------------------------------------------------------------------
     @Test
     public void testToPrimitive_long() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qleyo8hag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_long",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22408,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qleyo8hag(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22408);
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22409);final Long[] b = null;
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22410);assertEquals(null, ArrayUtils.toPrimitive(b));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22411);assertSame(ArrayUtils.EMPTY_LONG_ARRAY, 
            ArrayUtils.toPrimitive(new Long[0]));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22412);assertTrue(Arrays.equals(
             new long[] {Long.MIN_VALUE, Long.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Long[] {Long.valueOf(Long.MIN_VALUE), 
                 Long.valueOf(Long.MAX_VALUE), Long.valueOf(9999999)}))
         );

         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22413);try {
             __CLR4_1_2g5rg5rl3lqxthl.R.inc(22414);ArrayUtils.toPrimitive(new Long[] {Long.valueOf(Long.MIN_VALUE), null});
             __CLR4_1_2g5rg5rl3lqxthl.R.inc(22415);fail();
         } catch (final NullPointerException ex) {}
     }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

     @Test
     public void testToPrimitive_long_long() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wdmiu7hao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_long_long",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22416,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wdmiu7hao(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22416);
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22417);final Long[] l = null;
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22418);assertEquals(null, ArrayUtils.toPrimitive(l, Long.MIN_VALUE));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22419);assertSame(ArrayUtils.EMPTY_LONG_ARRAY, 
         ArrayUtils.toPrimitive(new Long[0], 1));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22420);assertTrue(Arrays.equals(
             new long[] {Long.MIN_VALUE, Long.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Long[] {Long.valueOf(Long.MIN_VALUE), 
                 Long.valueOf(Long.MAX_VALUE), Long.valueOf(9999999)},1)));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22421);assertTrue(Arrays.equals(
             new long[] {Long.MIN_VALUE, Long.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Long[] {Long.valueOf(Long.MIN_VALUE), 
                 null, Long.valueOf(9999999)}, Long.MAX_VALUE))
         );
     }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
     
    @Test
    public void testToObject_long() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p6lfjqhau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_long",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22422,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p6lfjqhau(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22422);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22423);final long[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22424);assertArrayEquals(null, ArrayUtils.toObject(b));
    
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22425);assertSame(
            ArrayUtils.EMPTY_LONG_OBJECT_ARRAY,
            ArrayUtils.toObject(new long[0]));
    
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22426);assertTrue(
            Arrays.equals(
                new Long[] {
                    Long.valueOf(Long.MIN_VALUE),
                    Long.valueOf(Long.MAX_VALUE),
                    Long.valueOf(9999999)},
            ArrayUtils.toObject(
                new long[] { Long.MIN_VALUE, Long.MAX_VALUE, 9999999 })));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    //  testToPrimitive/Object for float
    //  -----------------------------------------------------------------------
     @Test
     public void testToPrimitive_float() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ft42yqhaz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_float",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22427,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ft42yqhaz(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22427);
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22428);final Float[] b = null;
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22429);assertEquals(null, ArrayUtils.toPrimitive(b));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22430);assertSame(ArrayUtils.EMPTY_FLOAT_ARRAY, 
            ArrayUtils.toPrimitive(new Float[0]));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22431);assertTrue(Arrays.equals(
             new float[] {Float.MIN_VALUE, Float.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), 
                 Float.valueOf(Float.MAX_VALUE), Float.valueOf(9999999)}))
         );

         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22432);try {
             __CLR4_1_2g5rg5rl3lqxthl.R.inc(22433);ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), null});
             __CLR4_1_2g5rg5rl3lqxthl.R.inc(22434);fail();
         } catch (final NullPointerException ex) {}
     }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

     @Test
     public void testToPrimitive_float_float() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ykuykbhb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_float_float",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22435,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ykuykbhb7(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22435);
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22436);final Float[] l = null;
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22437);assertEquals(null, ArrayUtils.toPrimitive(l, Float.MIN_VALUE));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22438);assertSame(ArrayUtils.EMPTY_FLOAT_ARRAY, 
         ArrayUtils.toPrimitive(new Float[0], 1));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22439);assertTrue(Arrays.equals(
             new float[] {Float.MIN_VALUE, Float.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), 
                 Float.valueOf(Float.MAX_VALUE), Float.valueOf(9999999)},1)));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22440);assertTrue(Arrays.equals(
             new float[] {Float.MIN_VALUE, Float.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), 
                 null, Float.valueOf(9999999)}, Float.MAX_VALUE))
         );
     }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
     
    @Test
    public void testToObject_float() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bgki4whbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_float",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22441,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bgki4whbd(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22441);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22442);final float[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22443);assertArrayEquals(null, ArrayUtils.toObject(b));
    
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22444);assertSame(
            ArrayUtils.EMPTY_FLOAT_OBJECT_ARRAY,
            ArrayUtils.toObject(new float[0]));
    
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22445);assertTrue(
            Arrays.equals(
                new Float[] {
                    Float.valueOf(Float.MIN_VALUE),
                    Float.valueOf(Float.MAX_VALUE),
                    Float.valueOf(9999999)},
            ArrayUtils.toObject(
                new float[] { Float.MIN_VALUE, Float.MAX_VALUE, 9999999 })));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    //  testToPrimitive/Object for double
    //  -----------------------------------------------------------------------
     @Test
     public void testToPrimitive_double() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28u20e5hbi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_double",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22446,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28u20e5hbi(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22446);
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22447);final Double[] b = null;
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22448);assertEquals(null, ArrayUtils.toPrimitive(b));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22449);assertSame(ArrayUtils.EMPTY_DOUBLE_ARRAY, 
            ArrayUtils.toPrimitive(new Double[0]));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22450);assertTrue(Arrays.equals(
             new double[] {Double.MIN_VALUE, Double.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Double[] {Double.valueOf(Double.MIN_VALUE), 
                 Double.valueOf(Double.MAX_VALUE), Double.valueOf(9999999)}))
         );

         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22451);try {
             __CLR4_1_2g5rg5rl3lqxthl.R.inc(22452);ArrayUtils.toPrimitive(new Float[] {Float.valueOf(Float.MIN_VALUE), null});
             __CLR4_1_2g5rg5rl3lqxthl.R.inc(22453);fail();
         } catch (final NullPointerException ex) {}
     }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

     @Test
     public void testToPrimitive_double_double() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2y2zj5rhbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToPrimitive_double_double",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22454,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2y2zj5rhbq(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22454);
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22455);final Double[] l = null;
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22456);assertEquals(null, ArrayUtils.toPrimitive(l, Double.MIN_VALUE));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22457);assertSame(ArrayUtils.EMPTY_DOUBLE_ARRAY, 
         ArrayUtils.toPrimitive(new Double[0], 1));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22458);assertTrue(Arrays.equals(
             new double[] {Double.MIN_VALUE, Double.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Double[] {Double.valueOf(Double.MIN_VALUE), 
                 Double.valueOf(Double.MAX_VALUE), Double.valueOf(9999999)},1)));
         
         __CLR4_1_2g5rg5rl3lqxthl.R.inc(22459);assertTrue(Arrays.equals(
             new double[] {Double.MIN_VALUE, Double.MAX_VALUE, 9999999},
             ArrayUtils.toPrimitive(new Double[] {Double.valueOf(Double.MIN_VALUE), 
                 null, Double.valueOf(9999999)}, Double.MAX_VALUE))
         );
     }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
     
    @Test
    public void testToObject_double() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21svisrhbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testToObject_double",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22460,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21svisrhbw(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22460);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22461);final double[] b = null;
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22462);assertArrayEquals(null, ArrayUtils.toObject(b));
    
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22463);assertSame(
            ArrayUtils.EMPTY_DOUBLE_OBJECT_ARRAY,
            ArrayUtils.toObject(new double[0]));
    
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22464);assertTrue(
            Arrays.equals(
                new Double[] {
                    Double.valueOf(Double.MIN_VALUE),
                    Double.valueOf(Double.MAX_VALUE),
                    Double.valueOf(9999999)},
            ArrayUtils.toObject(
                new double[] { Double.MIN_VALUE, Double.MAX_VALUE, 9999999 })));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Test for {@link ArrayUtils#isEmpty(java.lang.Object[])}.
     */
    @Test
    public void testIsEmptyObject() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_255xyvdhc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsEmptyObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22465,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_255xyvdhc1(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22465);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22466);final Object[] emptyArray = new Object[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22467);final Object[] notEmptyArray = new Object[] { new String("Value") };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22468);assertTrue(ArrayUtils.isEmpty((Object[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22469);assertTrue(ArrayUtils.isEmpty(emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22470);assertFalse(ArrayUtils.isEmpty(notEmptyArray));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

    /**
     * Tests for {@link ArrayUtils#isEmpty(long[])},
     * {@link ArrayUtils#isEmpty(int[])},
     * {@link ArrayUtils#isEmpty(short[])},
     * {@link ArrayUtils#isEmpty(char[])},
     * {@link ArrayUtils#isEmpty(byte[])},
     * {@link ArrayUtils#isEmpty(double[])},
     * {@link ArrayUtils#isEmpty(float[])} and
     * {@link ArrayUtils#isEmpty(boolean[])}.
     */
    @Test
    public void testIsEmptyPrimitives() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21l4urghc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsEmptyPrimitives",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22471,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21l4urghc7(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22471);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22472);final long[] emptyLongArray = new long[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22473);final long[] notEmptyLongArray = new long[] { 1L };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22474);assertTrue(ArrayUtils.isEmpty((long[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22475);assertTrue(ArrayUtils.isEmpty(emptyLongArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22476);assertFalse(ArrayUtils.isEmpty(notEmptyLongArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22477);final int[] emptyIntArray = new int[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22478);final int[] notEmptyIntArray = new int[] { 1 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22479);assertTrue(ArrayUtils.isEmpty((int[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22480);assertTrue(ArrayUtils.isEmpty(emptyIntArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22481);assertFalse(ArrayUtils.isEmpty(notEmptyIntArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22482);final short[] emptyShortArray = new short[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22483);final short[] notEmptyShortArray = new short[] { 1 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22484);assertTrue(ArrayUtils.isEmpty((short[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22485);assertTrue(ArrayUtils.isEmpty(emptyShortArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22486);assertFalse(ArrayUtils.isEmpty(notEmptyShortArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22487);final char[] emptyCharArray = new char[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22488);final char[] notEmptyCharArray = new char[] { 1 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22489);assertTrue(ArrayUtils.isEmpty((char[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22490);assertTrue(ArrayUtils.isEmpty(emptyCharArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22491);assertFalse(ArrayUtils.isEmpty(notEmptyCharArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22492);final byte[] emptyByteArray = new byte[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22493);final byte[] notEmptyByteArray = new byte[] { 1 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22494);assertTrue(ArrayUtils.isEmpty((byte[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22495);assertTrue(ArrayUtils.isEmpty(emptyByteArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22496);assertFalse(ArrayUtils.isEmpty(notEmptyByteArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22497);final double[] emptyDoubleArray = new double[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22498);final double[] notEmptyDoubleArray = new double[] { 1.0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22499);assertTrue(ArrayUtils.isEmpty((double[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22500);assertTrue(ArrayUtils.isEmpty(emptyDoubleArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22501);assertFalse(ArrayUtils.isEmpty(notEmptyDoubleArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22502);final float[] emptyFloatArray = new float[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22503);final float[] notEmptyFloatArray = new float[] { 1.0F };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22504);assertTrue(ArrayUtils.isEmpty((float[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22505);assertTrue(ArrayUtils.isEmpty(emptyFloatArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22506);assertFalse(ArrayUtils.isEmpty(notEmptyFloatArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22507);final boolean[] emptyBooleanArray = new boolean[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22508);final boolean[] notEmptyBooleanArray = new boolean[] { true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22509);assertTrue(ArrayUtils.isEmpty((boolean[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22510);assertTrue(ArrayUtils.isEmpty(emptyBooleanArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22511);assertFalse(ArrayUtils.isEmpty(notEmptyBooleanArray));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    
   /**
     * Test for {@link ArrayUtils#isNotEmpty(java.lang.Object[])}.
     */
    @Test
    public void testIsNotEmptyObject() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26srg78hdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsNotEmptyObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22512,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26srg78hdc(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22512);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22513);final Object[] emptyArray = new Object[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22514);final Object[] notEmptyArray = new Object[] { new String("Value") };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22515);assertFalse(ArrayUtils.isNotEmpty((Object[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22516);assertFalse(ArrayUtils.isNotEmpty(emptyArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22517);assertTrue(ArrayUtils.isNotEmpty(notEmptyArray));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

   /**
     * Tests for {@link ArrayUtils#isNotEmpty(long[])},
     * {@link ArrayUtils#isNotEmpty(int[])},
     * {@link ArrayUtils#isNotEmpty(short[])},
     * {@link ArrayUtils#isNotEmpty(char[])},
     * {@link ArrayUtils#isNotEmpty(byte[])},
     * {@link ArrayUtils#isNotEmpty(double[])},
     * {@link ArrayUtils#isNotEmpty(float[])} and
     * {@link ArrayUtils#isNotEmpty(boolean[])}.
     */
    @Test
    public void testIsNotEmptyPrimitives() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24s8gcphdi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testIsNotEmptyPrimitives",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22518,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24s8gcphdi(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22518);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22519);final long[] emptyLongArray = new long[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22520);final long[] notEmptyLongArray = new long[] { 1L };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22521);assertFalse(ArrayUtils.isNotEmpty((long[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22522);assertFalse(ArrayUtils.isNotEmpty(emptyLongArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22523);assertTrue(ArrayUtils.isNotEmpty(notEmptyLongArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22524);final int[] emptyIntArray = new int[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22525);final int[] notEmptyIntArray = new int[] { 1 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22526);assertFalse(ArrayUtils.isNotEmpty((int[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22527);assertFalse(ArrayUtils.isNotEmpty(emptyIntArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22528);assertTrue(ArrayUtils.isNotEmpty(notEmptyIntArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22529);final short[] emptyShortArray = new short[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22530);final short[] notEmptyShortArray = new short[] { 1 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22531);assertFalse(ArrayUtils.isNotEmpty((short[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22532);assertFalse(ArrayUtils.isNotEmpty(emptyShortArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22533);assertTrue(ArrayUtils.isNotEmpty(notEmptyShortArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22534);final char[] emptyCharArray = new char[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22535);final char[] notEmptyCharArray = new char[] { 1 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22536);assertFalse(ArrayUtils.isNotEmpty((char[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22537);assertFalse(ArrayUtils.isNotEmpty(emptyCharArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22538);assertTrue(ArrayUtils.isNotEmpty(notEmptyCharArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22539);final byte[] emptyByteArray = new byte[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22540);final byte[] notEmptyByteArray = new byte[] { 1 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22541);assertFalse(ArrayUtils.isNotEmpty((byte[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22542);assertFalse(ArrayUtils.isNotEmpty(emptyByteArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22543);assertTrue(ArrayUtils.isNotEmpty(notEmptyByteArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22544);final double[] emptyDoubleArray = new double[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22545);final double[] notEmptyDoubleArray = new double[] { 1.0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22546);assertFalse(ArrayUtils.isNotEmpty((double[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22547);assertFalse(ArrayUtils.isNotEmpty(emptyDoubleArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22548);assertTrue(ArrayUtils.isNotEmpty(notEmptyDoubleArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22549);final float[] emptyFloatArray = new float[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22550);final float[] notEmptyFloatArray = new float[] { 1.0F };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22551);assertFalse(ArrayUtils.isNotEmpty((float[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22552);assertFalse(ArrayUtils.isNotEmpty(emptyFloatArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22553);assertTrue(ArrayUtils.isNotEmpty(notEmptyFloatArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22554);final boolean[] emptyBooleanArray = new boolean[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22555);final boolean[] notEmptyBooleanArray = new boolean[] { true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22556);assertFalse(ArrayUtils.isNotEmpty((boolean[])null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22557);assertFalse(ArrayUtils.isNotEmpty(emptyBooleanArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22558);assertTrue(ArrayUtils.isNotEmpty(notEmptyBooleanArray));
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}
    // ------------------------------------------------------------------------
    @Test
    public void testGetLength() {__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceStart(getClass().getName(),22559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rj0cxdhen();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2g5rg5rl3lqxthl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2g5rg5rl3lqxthl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsTest.testGetLength",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22559,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rj0cxdhen(){try{__CLR4_1_2g5rg5rl3lqxthl.R.inc(22559);
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22560);assertEquals(0, ArrayUtils.getLength(null));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22561);final Object[] emptyObjectArray = new Object[0];
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22562);final Object[] notEmptyObjectArray = new Object[] {"aValue"};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22563);assertEquals(0, ArrayUtils.getLength((Object[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22564);assertEquals(0, ArrayUtils.getLength(emptyObjectArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22565);assertEquals(1, ArrayUtils.getLength(notEmptyObjectArray));
 
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22566);final int[] emptyIntArray = new int[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22567);final int[] notEmptyIntArray = new int[] { 1 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22568);assertEquals(0, ArrayUtils.getLength((int[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22569);assertEquals(0, ArrayUtils.getLength(emptyIntArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22570);assertEquals(1, ArrayUtils.getLength(notEmptyIntArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22571);final short[] emptyShortArray = new short[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22572);final short[] notEmptyShortArray = new short[] { 1 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22573);assertEquals(0, ArrayUtils.getLength((short[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22574);assertEquals(0, ArrayUtils.getLength(emptyShortArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22575);assertEquals(1, ArrayUtils.getLength(notEmptyShortArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22576);final char[] emptyCharArray = new char[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22577);final char[] notEmptyCharArray = new char[] { 1 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22578);assertEquals(0, ArrayUtils.getLength((char[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22579);assertEquals(0, ArrayUtils.getLength(emptyCharArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22580);assertEquals(1, ArrayUtils.getLength(notEmptyCharArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22581);final byte[] emptyByteArray = new byte[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22582);final byte[] notEmptyByteArray = new byte[] { 1 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22583);assertEquals(0, ArrayUtils.getLength((byte[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22584);assertEquals(0, ArrayUtils.getLength(emptyByteArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22585);assertEquals(1, ArrayUtils.getLength(notEmptyByteArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22586);final double[] emptyDoubleArray = new double[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22587);final double[] notEmptyDoubleArray = new double[] { 1.0 };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22588);assertEquals(0, ArrayUtils.getLength((double[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22589);assertEquals(0, ArrayUtils.getLength(emptyDoubleArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22590);assertEquals(1, ArrayUtils.getLength(notEmptyDoubleArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22591);final float[] emptyFloatArray = new float[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22592);final float[] notEmptyFloatArray = new float[] { 1.0F };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22593);assertEquals(0, ArrayUtils.getLength((float[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22594);assertEquals(0, ArrayUtils.getLength(emptyFloatArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22595);assertEquals(1, ArrayUtils.getLength(notEmptyFloatArray));

        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22596);final boolean[] emptyBooleanArray = new boolean[] {};
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22597);final boolean[] notEmptyBooleanArray = new boolean[] { true };
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22598);assertEquals(0, ArrayUtils.getLength((boolean[]) null));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22599);assertEquals(0, ArrayUtils.getLength(emptyBooleanArray));
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22600);assertEquals(1, ArrayUtils.getLength(notEmptyBooleanArray));
        
        __CLR4_1_2g5rg5rl3lqxthl.R.inc(22601);try {
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(22602);ArrayUtils.getLength("notAnArray");
            __CLR4_1_2g5rg5rl3lqxthl.R.inc(22603);fail("IllegalArgumentException should have been thrown");
        } catch (final IllegalArgumentException e) {}
    }finally{__CLR4_1_2g5rg5rl3lqxthl.R.flushNeeded();}}

}
