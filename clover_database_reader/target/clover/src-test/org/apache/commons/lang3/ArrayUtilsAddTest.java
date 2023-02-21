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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

/**
 * Tests ArrayUtils add methods.
 *
 * @version $Id$
 */
public class ArrayUtilsAddTest {static class __CLR4_1_2exrexrl3lqxt5h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,19749,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testJira567(){__CLR4_1_2exrexrl3lqxt5h.R.globalSliceStart(getClass().getName(),19359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ikczs3exr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2exrexrl3lqxt5h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2exrexrl3lqxt5h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testJira567",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19359,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ikczs3exr(){try{__CLR4_1_2exrexrl3lqxt5h.R.inc(19359);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19360);Number[] n;
        // Valid array construction
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19361);n = ArrayUtils.addAll(new Number[]{Integer.valueOf(1)}, new Long[]{Long.valueOf(2)});
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19362);assertEquals(2,n.length);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19363);assertEquals(Number.class,n.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19364);try {
            // Invalid - can't store Long in Integer array
               __CLR4_1_2exrexrl3lqxt5h.R.inc(19365);n = ArrayUtils.addAll(new Integer[]{Integer.valueOf(1)}, new Long[]{Long.valueOf(2)});
               __CLR4_1_2exrexrl3lqxt5h.R.inc(19366);fail("Should have generated IllegalArgumentException");
        } catch (final IllegalArgumentException expected) {
        }
    }finally{__CLR4_1_2exrexrl3lqxt5h.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayBoolean() {__CLR4_1_2exrexrl3lqxt5h.R.globalSliceStart(getClass().getName(),19367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21gqdwcexz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2exrexrl3lqxt5h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2exrexrl3lqxt5h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19367,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21gqdwcexz(){try{__CLR4_1_2exrexrl3lqxt5h.R.inc(19367);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19368);boolean[] newArray;
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19369);newArray = ArrayUtils.add((boolean[])null, false);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19370);assertTrue(Arrays.equals(new boolean[]{false}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19371);assertEquals(Boolean.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19372);newArray = ArrayUtils.add((boolean[])null, true);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19373);assertTrue(Arrays.equals(new boolean[]{true}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19374);assertEquals(Boolean.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19375);final boolean[] array1 = new boolean[]{true, false, true};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19376);newArray = ArrayUtils.add(array1, false);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19377);assertTrue(Arrays.equals(new boolean[]{true, false, true, false}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19378);assertEquals(Boolean.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_1_2exrexrl3lqxt5h.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayByte() {__CLR4_1_2exrexrl3lqxt5h.R.globalSliceStart(getClass().getName(),19379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dlqcvueyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2exrexrl3lqxt5h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2exrexrl3lqxt5h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19379,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dlqcvueyb(){try{__CLR4_1_2exrexrl3lqxt5h.R.inc(19379);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19380);byte[] newArray;
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19381);newArray = ArrayUtils.add((byte[])null, (byte)0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19382);assertTrue(Arrays.equals(new byte[]{0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19383);assertEquals(Byte.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19384);newArray = ArrayUtils.add((byte[])null, (byte)1);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19385);assertTrue(Arrays.equals(new byte[]{1}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19386);assertEquals(Byte.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19387);final byte[] array1 = new byte[]{1, 2, 3};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19388);newArray = ArrayUtils.add(array1, (byte)0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19389);assertTrue(Arrays.equals(new byte[]{1, 2, 3, 0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19390);assertEquals(Byte.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19391);newArray = ArrayUtils.add(array1, (byte)4);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19392);assertTrue(Arrays.equals(new byte[]{1, 2, 3, 4}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19393);assertEquals(Byte.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_1_2exrexrl3lqxt5h.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayChar() {__CLR4_1_2exrexrl3lqxt5h.R.globalSliceStart(getClass().getName(),19394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tkdikoeyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2exrexrl3lqxt5h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2exrexrl3lqxt5h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayChar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19394,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tkdikoeyq(){try{__CLR4_1_2exrexrl3lqxt5h.R.inc(19394);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19395);char[] newArray;
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19396);newArray = ArrayUtils.add((char[])null, (char)0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19397);assertTrue(Arrays.equals(new char[]{0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19398);assertEquals(Character.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19399);newArray = ArrayUtils.add((char[])null, (char)1);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19400);assertTrue(Arrays.equals(new char[]{1}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19401);assertEquals(Character.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19402);final char[] array1 = new char[]{1, 2, 3};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19403);newArray = ArrayUtils.add(array1, (char)0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19404);assertTrue(Arrays.equals(new char[]{1, 2, 3, 0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19405);assertEquals(Character.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19406);newArray = ArrayUtils.add(array1, (char)4);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19407);assertTrue(Arrays.equals(new char[]{1, 2, 3, 4}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19408);assertEquals(Character.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_1_2exrexrl3lqxt5h.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayDouble() {__CLR4_1_2exrexrl3lqxt5h.R.globalSliceStart(getClass().getName(),19409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ek9mlfez5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2exrexrl3lqxt5h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2exrexrl3lqxt5h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19409,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ek9mlfez5(){try{__CLR4_1_2exrexrl3lqxt5h.R.inc(19409);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19410);double[] newArray;
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19411);newArray = ArrayUtils.add((double[])null, 0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19412);assertTrue(Arrays.equals(new double[]{0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19413);assertEquals(Double.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19414);newArray = ArrayUtils.add((double[])null, 1);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19415);assertTrue(Arrays.equals(new double[]{1}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19416);assertEquals(Double.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19417);final double[] array1 = new double[]{1, 2, 3};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19418);newArray = ArrayUtils.add(array1, 0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19419);assertTrue(Arrays.equals(new double[]{1, 2, 3, 0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19420);assertEquals(Double.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19421);newArray = ArrayUtils.add(array1, 4);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19422);assertTrue(Arrays.equals(new double[]{1, 2, 3, 4}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19423);assertEquals(Double.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_1_2exrexrl3lqxt5h.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayFloat() {__CLR4_1_2exrexrl3lqxt5h.R.globalSliceStart(getClass().getName(),19424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r2wd0oezk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2exrexrl3lqxt5h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2exrexrl3lqxt5h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19424,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r2wd0oezk(){try{__CLR4_1_2exrexrl3lqxt5h.R.inc(19424);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19425);float[] newArray;
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19426);newArray = ArrayUtils.add((float[])null, 0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19427);assertTrue(Arrays.equals(new float[]{0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19428);assertEquals(Float.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19429);newArray = ArrayUtils.add((float[])null, 1);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19430);assertTrue(Arrays.equals(new float[]{1}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19431);assertEquals(Float.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19432);final float[] array1 = new float[]{1, 2, 3};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19433);newArray = ArrayUtils.add(array1, 0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19434);assertTrue(Arrays.equals(new float[]{1, 2, 3, 0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19435);assertEquals(Float.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19436);newArray = ArrayUtils.add(array1, 4);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19437);assertTrue(Arrays.equals(new float[]{1, 2, 3, 4}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19438);assertEquals(Float.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_1_2exrexrl3lqxt5h.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayInt() {__CLR4_1_2exrexrl3lqxt5h.R.globalSliceStart(getClass().getName(),19439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2blr1jfezz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2exrexrl3lqxt5h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2exrexrl3lqxt5h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayInt",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19439,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2blr1jfezz(){try{__CLR4_1_2exrexrl3lqxt5h.R.inc(19439);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19440);int[] newArray;
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19441);newArray = ArrayUtils.add((int[])null, 0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19442);assertTrue(Arrays.equals(new int[]{0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19443);assertEquals(Integer.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19444);newArray = ArrayUtils.add((int[])null, 1);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19445);assertTrue(Arrays.equals(new int[]{1}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19446);assertEquals(Integer.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19447);final int[] array1 = new int[]{1, 2, 3};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19448);newArray = ArrayUtils.add(array1, 0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19449);assertTrue(Arrays.equals(new int[]{1, 2, 3, 0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19450);assertEquals(Integer.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19451);newArray = ArrayUtils.add(array1, 4);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19452);assertTrue(Arrays.equals(new int[]{1, 2, 3, 4}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19453);assertEquals(Integer.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_1_2exrexrl3lqxt5h.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayLong() {__CLR4_1_2exrexrl3lqxt5h.R.globalSliceStart(getClass().getName(),19454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2haxq36f0e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2exrexrl3lqxt5h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2exrexrl3lqxt5h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19454,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2haxq36f0e(){try{__CLR4_1_2exrexrl3lqxt5h.R.inc(19454);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19455);long[] newArray;
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19456);newArray = ArrayUtils.add((long[])null, 0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19457);assertTrue(Arrays.equals(new long[]{0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19458);assertEquals(Long.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19459);newArray = ArrayUtils.add((long[])null, 1);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19460);assertTrue(Arrays.equals(new long[]{1}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19461);assertEquals(Long.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19462);final long[] array1 = new long[]{1, 2, 3};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19463);newArray = ArrayUtils.add(array1, 0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19464);assertTrue(Arrays.equals(new long[]{1, 2, 3, 0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19465);assertEquals(Long.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19466);newArray = ArrayUtils.add(array1, 4);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19467);assertTrue(Arrays.equals(new long[]{1, 2, 3, 4}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19468);assertEquals(Long.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_1_2exrexrl3lqxt5h.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayShort() {__CLR4_1_2exrexrl3lqxt5h.R.globalSliceStart(getClass().getName(),19469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tzmiwf0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2exrexrl3lqxt5h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2exrexrl3lqxt5h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19469,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tzmiwf0t(){try{__CLR4_1_2exrexrl3lqxt5h.R.inc(19469);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19470);short[] newArray;
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19471);newArray = ArrayUtils.add((short[])null, (short)0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19472);assertTrue(Arrays.equals(new short[]{0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19473);assertEquals(Short.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19474);newArray = ArrayUtils.add((short[])null, (short)1);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19475);assertTrue(Arrays.equals(new short[]{1}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19476);assertEquals(Short.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19477);final short[] array1 = new short[]{1, 2, 3};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19478);newArray = ArrayUtils.add(array1, (short)0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19479);assertTrue(Arrays.equals(new short[]{1, 2, 3, 0}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19480);assertEquals(Short.TYPE, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19481);newArray = ArrayUtils.add(array1, (short)4);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19482);assertTrue(Arrays.equals(new short[]{1, 2, 3, 4}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19483);assertEquals(Short.TYPE, newArray.getClass().getComponentType());
    }finally{__CLR4_1_2exrexrl3lqxt5h.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayObject() {__CLR4_1_2exrexrl3lqxt5h.R.globalSliceStart(getClass().getName(),19484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27lmt2nf18();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2exrexrl3lqxt5h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2exrexrl3lqxt5h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19484,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27lmt2nf18(){try{__CLR4_1_2exrexrl3lqxt5h.R.inc(19484);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19485);Object[] newArray;

        //show that not casting is okay
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19486);newArray = ArrayUtils.add((Object[])null, "a");
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19487);assertTrue(Arrays.equals(new String[]{"a"}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19488);assertTrue(Arrays.equals(new Object[]{"a"}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19489);assertEquals(String.class, newArray.getClass().getComponentType());

        //show that not casting to Object[] is okay and will assume String based on "a"
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19490);final String[] newStringArray = ArrayUtils.add(null, "a");
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19491);assertTrue(Arrays.equals(new String[]{"a"}, newStringArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19492);assertTrue(Arrays.equals(new Object[]{"a"}, newStringArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19493);assertEquals(String.class, newStringArray.getClass().getComponentType());

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19494);final String[] stringArray1 = new String[]{"a", "b", "c"};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19495);newArray = ArrayUtils.add(stringArray1, null);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19496);assertTrue(Arrays.equals(new String[]{"a", "b", "c", null}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19497);assertEquals(String.class, newArray.getClass().getComponentType());

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19498);newArray = ArrayUtils.add(stringArray1, "d");
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19499);assertTrue(Arrays.equals(new String[]{"a", "b", "c", "d"}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19500);assertEquals(String.class, newArray.getClass().getComponentType());

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19501);Number[] numberArray1 = new Number[]{Integer.valueOf(1), Double.valueOf(2)};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19502);newArray = ArrayUtils.add(numberArray1, Float.valueOf(3));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19503);assertTrue(Arrays.equals(new Number[]{Integer.valueOf(1), Double.valueOf(2), Float.valueOf(3)}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19504);assertEquals(Number.class, newArray.getClass().getComponentType());

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19505);numberArray1 = null;
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19506);newArray = ArrayUtils.add(numberArray1, Float.valueOf(3));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19507);assertTrue(Arrays.equals(new Float[]{Float.valueOf(3)}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19508);assertEquals(Float.class, newArray.getClass().getComponentType());
    }finally{__CLR4_1_2exrexrl3lqxt5h.R.flushNeeded();}}
    
    @Test
    public void testLANG571(){__CLR4_1_2exrexrl3lqxt5h.R.globalSliceStart(getClass().getName(),19509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2af53uef1x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2exrexrl3lqxt5h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2exrexrl3lqxt5h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testLANG571",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19509,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2af53uef1x(){try{__CLR4_1_2exrexrl3lqxt5h.R.inc(19509);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19510);final String[] stringArray=null;
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19511);final String aString=null;
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19512);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19513);@SuppressWarnings("unused")
            final
            String[] sa = ArrayUtils.add(stringArray, aString);
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19514);fail("Should have caused IllegalArgumentException");
        } catch (final IllegalArgumentException iae){
            //expected
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19515);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19516);@SuppressWarnings("unused")
            final
            String[] sa = ArrayUtils.add(stringArray, 0, aString);
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19517);fail("Should have caused IllegalArgumentException");
        } catch (final IllegalArgumentException iae){
            //expected
        }
    }finally{__CLR4_1_2exrexrl3lqxt5h.R.flushNeeded();}}

    @Test
    public void testAddObjectArrayToObjectArray() {__CLR4_1_2exrexrl3lqxt5h.R.globalSliceStart(getClass().getName(),19518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2taaeh1f26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2exrexrl3lqxt5h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2exrexrl3lqxt5h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectArrayToObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19518,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2taaeh1f26(){try{__CLR4_1_2exrexrl3lqxt5h.R.inc(19518);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19519);assertNull(ArrayUtils.addAll((Object[]) null, (Object[]) null));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19520);Object[] newArray;
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19521);final String[] stringArray1 = new String[]{"a", "b", "c"};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19522);final String[] stringArray2 = new String[]{"1", "2", "3"};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19523);newArray = ArrayUtils.addAll(stringArray1, (String[]) null);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19524);assertNotSame(stringArray1, newArray);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19525);assertTrue(Arrays.equals(stringArray1, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19526);assertTrue(Arrays.equals(new String[]{"a", "b", "c"}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19527);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19528);newArray = ArrayUtils.addAll(null, stringArray2);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19529);assertNotSame(stringArray2, newArray);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19530);assertTrue(Arrays.equals(stringArray2, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19531);assertTrue(Arrays.equals(new String[]{"1", "2", "3"}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19532);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19533);newArray = ArrayUtils.addAll(stringArray1, stringArray2);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19534);assertTrue(Arrays.equals(new String[]{"a", "b", "c", "1", "2", "3"}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19535);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19536);newArray = ArrayUtils.addAll(ArrayUtils.EMPTY_STRING_ARRAY, (String[]) null);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19537);assertTrue(Arrays.equals(ArrayUtils.EMPTY_STRING_ARRAY, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19538);assertTrue(Arrays.equals(new String[]{}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19539);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19540);newArray = ArrayUtils.addAll(null, ArrayUtils.EMPTY_STRING_ARRAY);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19541);assertTrue(Arrays.equals(ArrayUtils.EMPTY_STRING_ARRAY, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19542);assertTrue(Arrays.equals(new String[]{}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19543);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19544);newArray = ArrayUtils.addAll(ArrayUtils.EMPTY_STRING_ARRAY, ArrayUtils.EMPTY_STRING_ARRAY);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19545);assertTrue(Arrays.equals(ArrayUtils.EMPTY_STRING_ARRAY, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19546);assertTrue(Arrays.equals(new String[]{}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19547);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19548);final String[] stringArrayNull = new String []{null};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19549);newArray = ArrayUtils.addAll(stringArrayNull, stringArrayNull);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19550);assertTrue(Arrays.equals(new String[]{null, null}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19551);assertEquals(String.class, newArray.getClass().getComponentType());

        // boolean
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19552);assertTrue( Arrays.equals( new boolean[] { true, false, false, true },
            ArrayUtils.addAll( new boolean[] { true, false }, new boolean[] { false, true } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19553);assertTrue( Arrays.equals( new boolean[] { false, true },
            ArrayUtils.addAll( null, new boolean[] { false, true } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19554);assertTrue( Arrays.equals( new boolean[] { true, false },
            ArrayUtils.addAll( new boolean[] { true, false }, null ) ) );

        // char
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19555);assertTrue( Arrays.equals( new char[] { 'a', 'b', 'c', 'd' },
            ArrayUtils.addAll( new char[] { 'a', 'b' }, new char[] { 'c', 'd' } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19556);assertTrue( Arrays.equals( new char[] { 'c', 'd' },
            ArrayUtils.addAll( null, new char[] { 'c', 'd' } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19557);assertTrue( Arrays.equals( new char[] { 'a', 'b' },
            ArrayUtils.addAll( new char[] { 'a', 'b' }, null ) ) );

        // byte
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19558);assertTrue( Arrays.equals( new byte[] { (byte) 0, (byte) 1, (byte) 2, (byte) 3 },
            ArrayUtils.addAll( new byte[] { (byte) 0, (byte) 1 }, new byte[] { (byte) 2, (byte) 3 } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19559);assertTrue( Arrays.equals( new byte[] { (byte) 2, (byte) 3 },
            ArrayUtils.addAll( null, new byte[] { (byte) 2, (byte) 3 } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19560);assertTrue( Arrays.equals( new byte[] { (byte) 0, (byte) 1 },
            ArrayUtils.addAll( new byte[] { (byte) 0, (byte) 1 }, null ) ) );

        // short
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19561);assertTrue( Arrays.equals( new short[] { (short) 10, (short) 20, (short) 30, (short) 40 },
            ArrayUtils.addAll( new short[] { (short) 10, (short) 20 }, new short[] { (short) 30, (short) 40 } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19562);assertTrue( Arrays.equals( new short[] { (short) 30, (short) 40 },
            ArrayUtils.addAll( null, new short[] { (short) 30, (short) 40 } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19563);assertTrue( Arrays.equals( new short[] { (short) 10, (short) 20 },
            ArrayUtils.addAll( new short[] { (short) 10, (short) 20 }, null ) ) );

        // int
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19564);assertTrue( Arrays.equals( new int[] { 1, 1000, -1000, -1 },
            ArrayUtils.addAll( new int[] { 1, 1000 }, new int[] { -1000, -1 } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19565);assertTrue( Arrays.equals( new int[] { -1000, -1 },
            ArrayUtils.addAll( null, new int[] { -1000, -1 } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19566);assertTrue( Arrays.equals( new int[] { 1, 1000 },
            ArrayUtils.addAll( new int[] { 1, 1000 }, null ) ) );

        // long
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19567);assertTrue( Arrays.equals( new long[] { 1L, -1L, 1000L, -1000L },
            ArrayUtils.addAll( new long[] { 1L, -1L }, new long[] { 1000L, -1000L } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19568);assertTrue( Arrays.equals( new long[] { 1000L, -1000L },
            ArrayUtils.addAll( null, new long[] { 1000L, -1000L } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19569);assertTrue( Arrays.equals( new long[] { 1L, -1L },
            ArrayUtils.addAll( new long[] { 1L, -1L }, null ) ) );

        // float
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19570);assertTrue( Arrays.equals( new float[] { 10.5f, 10.1f, 1.6f, 0.01f },
            ArrayUtils.addAll( new float[] { 10.5f, 10.1f }, new float[] { 1.6f, 0.01f } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19571);assertTrue( Arrays.equals( new float[] { 1.6f, 0.01f },
            ArrayUtils.addAll( null, new float[] { 1.6f, 0.01f } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19572);assertTrue( Arrays.equals( new float[] { 10.5f, 10.1f },
            ArrayUtils.addAll( new float[] { 10.5f, 10.1f }, null ) ) );

        // double
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19573);assertTrue( Arrays.equals( new double[] { Math.PI, -Math.PI, 0, 9.99 },
            ArrayUtils.addAll( new double[] { Math.PI, -Math.PI }, new double[] { 0, 9.99 } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19574);assertTrue( Arrays.equals( new double[] { 0, 9.99 },
            ArrayUtils.addAll( null, new double[] { 0, 9.99 } ) ) );

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19575);assertTrue( Arrays.equals( new double[] { Math.PI, -Math.PI },
            ArrayUtils.addAll( new double[] { Math.PI, -Math.PI }, null ) ) );

    }finally{__CLR4_1_2exrexrl3lqxt5h.R.flushNeeded();}}

    @Test
    public void testAddObjectAtIndex() {__CLR4_1_2exrexrl3lqxt5h.R.globalSliceStart(getClass().getName(),19576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2en97vsf3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2exrexrl3lqxt5h.R.rethrow($CLV_t2$);}finally{__CLR4_1_2exrexrl3lqxt5h.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsAddTest.testAddObjectAtIndex",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),19576,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2en97vsf3s(){try{__CLR4_1_2exrexrl3lqxt5h.R.inc(19576);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19577);Object[] newArray;
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19578);newArray = ArrayUtils.add((Object[])null, 0, "a");
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19579);assertTrue(Arrays.equals(new String[]{"a"}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19580);assertTrue(Arrays.equals(new Object[]{"a"}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19581);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19582);final String[] stringArray1 = new String[]{"a", "b", "c"};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19583);newArray = ArrayUtils.add(stringArray1, 0, null);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19584);assertTrue(Arrays.equals(new String[]{null, "a", "b", "c"}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19585);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19586);newArray = ArrayUtils.add(stringArray1, 1, null);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19587);assertTrue(Arrays.equals(new String[]{"a", null, "b", "c"}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19588);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19589);newArray = ArrayUtils.add(stringArray1, 3, null);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19590);assertTrue(Arrays.equals(new String[]{"a", "b", "c", null}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19591);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19592);newArray = ArrayUtils.add(stringArray1, 3, "d");
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19593);assertTrue(Arrays.equals(new String[]{"a", "b", "c", "d"}, newArray));
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19594);assertEquals(String.class, newArray.getClass().getComponentType());
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19595);assertEquals(String.class, newArray.getClass().getComponentType());

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19596);final Object[] o = new Object[] {"1", "2", "4"};
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19597);final Object[] result = ArrayUtils.add(o, 2, "3");
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19598);final Object[] result2 = ArrayUtils.add(o, 3, "5");

        __CLR4_1_2exrexrl3lqxt5h.R.inc(19599);assertNotNull(result);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19600);assertEquals(4, result.length);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19601);assertEquals("1", result[0]);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19602);assertEquals("2", result[1]);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19603);assertEquals("3", result[2]);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19604);assertEquals("4", result[3]);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19605);assertNotNull(result2);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19606);assertEquals(4, result2.length);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19607);assertEquals("1", result2[0]);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19608);assertEquals("2", result2[1]);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19609);assertEquals("4", result2[2]);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19610);assertEquals("5", result2[3]);

        // boolean tests
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19611);boolean[] booleanArray = ArrayUtils.add( null, 0, true );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19612);assertTrue( Arrays.equals( new boolean[] { true }, booleanArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19613);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19614);booleanArray = ArrayUtils.add( null, -1, true );
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19615);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19616);booleanArray = ArrayUtils.add( new boolean[] { true }, 0, false);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19617);assertTrue( Arrays.equals( new boolean[] { false, true }, booleanArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19618);booleanArray = ArrayUtils.add( new boolean[] { false }, 1, true);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19619);assertTrue( Arrays.equals( new boolean[] { false, true }, booleanArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19620);booleanArray = ArrayUtils.add( new boolean[] { true, false }, 1, true);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19621);assertTrue( Arrays.equals( new boolean[] { true, true, false }, booleanArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19622);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19623);booleanArray = ArrayUtils.add( new boolean[] { true, false }, 4, true);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19624);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19625);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19626);booleanArray = ArrayUtils.add( new boolean[] { true, false }, -1, true);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19627);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // char tests
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19628);char[] charArray = ArrayUtils.add( (char[]) null, 0, 'a' );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19629);assertTrue( Arrays.equals( new char[] { 'a' }, charArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19630);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19631);charArray = ArrayUtils.add( (char[]) null, -1, 'a' );
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19632);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19633);charArray = ArrayUtils.add( new char[] { 'a' }, 0, 'b');
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19634);assertTrue( Arrays.equals( new char[] { 'b', 'a' }, charArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19635);charArray = ArrayUtils.add( new char[] { 'a', 'b' }, 0, 'c');
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19636);assertTrue( Arrays.equals( new char[] { 'c', 'a', 'b' }, charArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19637);charArray = ArrayUtils.add( new char[] { 'a', 'b' }, 1, 'k');
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19638);assertTrue( Arrays.equals( new char[] { 'a', 'k', 'b' }, charArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19639);charArray = ArrayUtils.add( new char[] { 'a', 'b', 'c' }, 1, 't');
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19640);assertTrue( Arrays.equals( new char[] { 'a', 't', 'b', 'c' }, charArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19641);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19642);charArray = ArrayUtils.add( new char[] { 'a', 'b' }, 4, 'c');
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19643);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19644);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19645);charArray = ArrayUtils.add( new char[] { 'a', 'b' }, -1, 'c');
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19646);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // short tests
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19647);short[] shortArray = ArrayUtils.add( new short[] { 1 }, 0, (short) 2);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19648);assertTrue( Arrays.equals( new short[] { 2, 1 }, shortArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19649);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19650);shortArray = ArrayUtils.add( (short[]) null, -1, (short) 2);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19651);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19652);shortArray = ArrayUtils.add( new short[] { 2, 6 }, 2, (short) 10);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19653);assertTrue( Arrays.equals( new short[] { 2, 6, 10 }, shortArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19654);shortArray = ArrayUtils.add( new short[] { 2, 6 }, 0, (short) -4);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19655);assertTrue( Arrays.equals( new short[] { -4, 2, 6 }, shortArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19656);shortArray = ArrayUtils.add( new short[] { 2, 6, 3 }, 2, (short) 1);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19657);assertTrue( Arrays.equals( new short[] { 2, 6, 1, 3 }, shortArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19658);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19659);shortArray = ArrayUtils.add( new short[] { 2, 6 }, 4, (short) 10);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19660);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19661);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19662);shortArray = ArrayUtils.add( new short[] { 2, 6 }, -1, (short) 10);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19663);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // byte tests
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19664);byte[] byteArray = ArrayUtils.add( new byte[] { 1 }, 0, (byte) 2);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19665);assertTrue( Arrays.equals( new byte[] { 2, 1 }, byteArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19666);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19667);byteArray = ArrayUtils.add( (byte[]) null, -1, (byte) 2);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19668);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19669);byteArray = ArrayUtils.add( new byte[] { 2, 6 }, 2, (byte) 3);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19670);assertTrue( Arrays.equals( new byte[] { 2, 6, 3 }, byteArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19671);byteArray = ArrayUtils.add( new byte[] { 2, 6 }, 0, (byte) 1);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19672);assertTrue( Arrays.equals( new byte[] { 1, 2, 6 }, byteArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19673);byteArray = ArrayUtils.add( new byte[] { 2, 6, 3 }, 2, (byte) 1);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19674);assertTrue( Arrays.equals( new byte[] { 2, 6, 1, 3 }, byteArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19675);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19676);byteArray = ArrayUtils.add( new byte[] { 2, 6 }, 4, (byte) 3);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19677);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19678);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19679);byteArray = ArrayUtils.add( new byte[] { 2, 6 }, -1, (byte) 3);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19680);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // int tests
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19681);int[] intArray = ArrayUtils.add( new int[] { 1 }, 0, 2);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19682);assertTrue( Arrays.equals( new int[] { 2, 1 }, intArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19683);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19684);intArray = ArrayUtils.add( (int[]) null, -1, 2);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19685);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19686);intArray = ArrayUtils.add( new int[] { 2, 6 }, 2, 10);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19687);assertTrue( Arrays.equals( new int[] { 2, 6, 10 }, intArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19688);intArray = ArrayUtils.add( new int[] { 2, 6 }, 0, -4);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19689);assertTrue( Arrays.equals( new int[] { -4, 2, 6 }, intArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19690);intArray = ArrayUtils.add( new int[] { 2, 6, 3 }, 2, 1);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19691);assertTrue( Arrays.equals( new int[] { 2, 6, 1, 3 }, intArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19692);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19693);intArray = ArrayUtils.add( new int[] { 2, 6 }, 4, 10);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19694);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19695);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19696);intArray = ArrayUtils.add( new int[] { 2, 6 }, -1, 10);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19697);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // long tests
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19698);long[] longArray = ArrayUtils.add( new long[] { 1L }, 0, 2L);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19699);assertTrue( Arrays.equals( new long[] { 2L, 1L }, longArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19700);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19701);longArray = ArrayUtils.add( (long[]) null, -1, 2L);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19702);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19703);longArray = ArrayUtils.add( new long[] { 2L, 6L }, 2, 10L);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19704);assertTrue( Arrays.equals( new long[] { 2L, 6L, 10L }, longArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19705);longArray = ArrayUtils.add( new long[] { 2L, 6L }, 0, -4L);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19706);assertTrue( Arrays.equals( new long[] { -4L, 2L, 6L }, longArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19707);longArray = ArrayUtils.add( new long[] { 2L, 6L, 3L }, 2, 1L);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19708);assertTrue( Arrays.equals( new long[] { 2L, 6L, 1L, 3L }, longArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19709);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19710);longArray = ArrayUtils.add( new long[] { 2L, 6L }, 4, 10L);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19711);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19712);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19713);longArray = ArrayUtils.add( new long[] { 2L, 6L }, -1, 10L);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19714);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // float tests
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19715);float[] floatArray = ArrayUtils.add( new float[] { 1.1f }, 0, 2.2f);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19716);assertTrue( Arrays.equals( new float[] { 2.2f, 1.1f }, floatArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19717);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19718);floatArray = ArrayUtils.add( (float[]) null, -1, 2.2f);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19719);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19720);floatArray = ArrayUtils.add( new float[] { 2.3f, 6.4f }, 2, 10.5f);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19721);assertTrue( Arrays.equals( new float[] { 2.3f, 6.4f, 10.5f }, floatArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19722);floatArray = ArrayUtils.add( new float[] { 2.6f, 6.7f }, 0, -4.8f);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19723);assertTrue( Arrays.equals( new float[] { -4.8f, 2.6f, 6.7f }, floatArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19724);floatArray = ArrayUtils.add( new float[] { 2.9f, 6.0f, 0.3f }, 2, 1.0f);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19725);assertTrue( Arrays.equals( new float[] { 2.9f, 6.0f, 1.0f, 0.3f }, floatArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19726);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19727);floatArray = ArrayUtils.add( new float[] { 2.3f, 6.4f }, 4, 10.5f);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19728);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19729);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19730);floatArray = ArrayUtils.add( new float[] { 2.3f, 6.4f }, -1, 10.5f);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19731);assertEquals("Index: -1, Length: 2", e.getMessage());
        }

        // double tests
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19732);double[] doubleArray = ArrayUtils.add( new double[] { 1.1 }, 0, 2.2);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19733);assertTrue( Arrays.equals( new double[] { 2.2, 1.1 }, doubleArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19734);try {
          __CLR4_1_2exrexrl3lqxt5h.R.inc(19735);doubleArray = ArrayUtils.add( (double[]) null, -1, 2.2);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19736);assertEquals("Index: -1, Length: 0", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19737);doubleArray = ArrayUtils.add( new double[] { 2.3, 6.4 }, 2, 10.5);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19738);assertTrue( Arrays.equals( new double[] { 2.3, 6.4, 10.5 }, doubleArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19739);doubleArray = ArrayUtils.add( new double[] { 2.6, 6.7 }, 0, -4.8);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19740);assertTrue( Arrays.equals( new double[] { -4.8, 2.6, 6.7 }, doubleArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19741);doubleArray = ArrayUtils.add( new double[] { 2.9, 6.0, 0.3 }, 2, 1.0);
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19742);assertTrue( Arrays.equals( new double[] { 2.9, 6.0, 1.0, 0.3 }, doubleArray ) );
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19743);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19744);doubleArray = ArrayUtils.add( new double[] { 2.3, 6.4 }, 4, 10.5);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19745);assertEquals("Index: 4, Length: 2", e.getMessage());
        }
        __CLR4_1_2exrexrl3lqxt5h.R.inc(19746);try {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19747);doubleArray = ArrayUtils.add( new double[] { 2.3, 6.4 }, -1, 10.5);
        } catch(final IndexOutOfBoundsException e) {
            __CLR4_1_2exrexrl3lqxt5h.R.inc(19748);assertEquals("Index: -1, Length: 2", e.getMessage());
        }
    }finally{__CLR4_1_2exrexrl3lqxt5h.R.flushNeeded();}}

}
