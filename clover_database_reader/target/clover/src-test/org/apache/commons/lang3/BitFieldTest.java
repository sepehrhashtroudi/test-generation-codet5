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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Class to test BitField functionality
 *
 * @version $Id$
 */
public class BitFieldTest  {static class __CLR4_1_2hfwhfwl3lqxtit{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,22742,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final BitField bf_multi  = new BitField(0x3F80);
    private static final BitField bf_single = new BitField(0x4000);
    private static final BitField bf_zero = new BitField(0);

    /**
     * test the getValue() method
     */
    @Test
    public void testGetValue() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qcksmkhfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testGetValue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22604,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qcksmkhfw(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22604);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22605);assertEquals(bf_multi.getValue(-1), 127);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22606);assertEquals(bf_multi.getValue(0), 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22607);assertEquals(bf_single.getValue(-1), 1);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22608);assertEquals(bf_single.getValue(0), 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22609);assertEquals(bf_zero.getValue(-1), 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22610);assertEquals(bf_zero.getValue(0), 0);
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    /**
     * test the getShortValue() method
     */
    @Test
    public void testGetShortValue() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2x1l1c0hg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testGetShortValue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22611,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2x1l1c0hg3(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22611);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22612);assertEquals(bf_multi.getShortValue((short) - 1), (short) 127);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22613);assertEquals(bf_multi.getShortValue((short) 0), (short) 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22614);assertEquals(bf_single.getShortValue((short) - 1), (short) 1);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22615);assertEquals(bf_single.getShortValue((short) 0), (short) 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22616);assertEquals(bf_zero.getShortValue((short) -1), (short) 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22617);assertEquals(bf_zero.getShortValue((short) 0), (short) 0);
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    /**
     * test the getRawValue() method
     */
    @Test
    public void testGetRawValue() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29jelhwhga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testGetRawValue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22618,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29jelhwhga(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22618);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22619);assertEquals(bf_multi.getRawValue(-1), 0x3F80);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22620);assertEquals(bf_multi.getRawValue(0), 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22621);assertEquals(bf_single.getRawValue(-1), 0x4000);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22622);assertEquals(bf_single.getRawValue(0), 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22623);assertEquals(bf_zero.getRawValue(-1), 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22624);assertEquals(bf_zero.getRawValue(0), 0);
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    /**
     * test the getShortRawValue() method
     */
    @Test
    public void testGetShortRawValue() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2okjk6ghgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testGetShortRawValue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22625,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2okjk6ghgh(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22625);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22626);assertEquals(bf_multi.getShortRawValue((short) - 1), (short) 0x3F80);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22627);assertEquals(bf_multi.getShortRawValue((short) 0), (short) 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22628);assertEquals(bf_single.getShortRawValue((short) - 1), (short) 0x4000);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22629);assertEquals(bf_single.getShortRawValue((short) 0), (short) 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22630);assertEquals(bf_zero.getShortRawValue((short) -1), (short) 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22631);assertEquals(bf_zero.getShortRawValue((short) 0), (short) 0);
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    /**
     * test the isSet() method
     */
    @Test
    public void testIsSet() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gkxvrnhgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testIsSet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22632,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gkxvrnhgo(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22632);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22633);assertTrue(!bf_multi.isSet(0));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22634);assertTrue(!bf_zero.isSet(0));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22635);for (int j = 0x80; (((j <= 0x3F80)&&(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22636)!=0|true))||(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22637)==0&false)); j += 0x80) {{
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22638);assertTrue(bf_multi.isSet(j));
        }
        }__CLR4_1_2hfwhfwl3lqxtit.R.inc(22639);for (int j = 0x80; (((j <= 0x3F80)&&(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22640)!=0|true))||(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22641)==0&false)); j += 0x80) {{
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22642);assertTrue(!bf_zero.isSet(j));
        }
        }__CLR4_1_2hfwhfwl3lqxtit.R.inc(22643);assertTrue(!bf_single.isSet(0));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22644);assertTrue(bf_single.isSet(0x4000));
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    /**
     * test the isAllSet() method
     */
    @Test
    public void testIsAllSet() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oy2m70hh1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testIsAllSet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22645,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oy2m70hh1(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22645);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22646);for (int j = 0; (((j < 0x3F80)&&(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22647)!=0|true))||(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22648)==0&false)); j += 0x80) {{
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22649);assertTrue(!bf_multi.isAllSet(j));
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22650);assertTrue(bf_zero.isAllSet(j));
        }
        }__CLR4_1_2hfwhfwl3lqxtit.R.inc(22651);assertTrue(bf_multi.isAllSet(0x3F80));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22652);assertTrue(!bf_single.isAllSet(0));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22653);assertTrue(bf_single.isAllSet(0x4000));
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    /**
     * test the setValue() method
     */
    @Test
    public void testSetValue() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22654);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2asu22ghha();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testSetValue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22654,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2asu22ghha(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22654);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22655);for (int j = 0; (((j < 128)&&(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22656)!=0|true))||(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22657)==0&false)); j++) {{
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22658);assertEquals(bf_multi.getValue(bf_multi.setValue(0, j)), j);
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22659);assertEquals(bf_multi.setValue(0, j), j << 7);
        }
        }__CLR4_1_2hfwhfwl3lqxtit.R.inc(22660);for (int j = 0; (((j < 128)&&(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22661)!=0|true))||(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22662)==0&false)); j++) {{
          __CLR4_1_2hfwhfwl3lqxtit.R.inc(22663);assertEquals(bf_zero.getValue(bf_zero.setValue(0, j)), 0);
          __CLR4_1_2hfwhfwl3lqxtit.R.inc(22664);assertEquals(bf_zero.setValue(0, j), 0);
      }

        // verify that excess bits are stripped off
        }__CLR4_1_2hfwhfwl3lqxtit.R.inc(22665);assertEquals(bf_multi.setValue(0x3f80, 128), 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22666);for (int j = 0; (((j < 2)&&(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22667)!=0|true))||(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22668)==0&false)); j++) {{
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22669);assertEquals(bf_single.getValue(bf_single.setValue(0, j)), j);
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22670);assertEquals(bf_single.setValue(0, j), j << 14);
        }

        // verify that excess bits are stripped off
        }__CLR4_1_2hfwhfwl3lqxtit.R.inc(22671);assertEquals(bf_single.setValue(0x4000, 2), 0);
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    /**
     * test the setShortValue() method
     */
    @Test
    public void testSetShortValue() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g9q4cshhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testSetShortValue",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22672,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g9q4cshhs(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22672);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22673);for (int j = 0; (((j < 128)&&(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22674)!=0|true))||(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22675)==0&false)); j++) {{
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22676);assertEquals(bf_multi.getShortValue(bf_multi.setShortValue((short) 0, (short) j)), (short) j);
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22677);assertEquals(bf_multi.setShortValue((short) 0, (short) j), (short) (j << 7));
        }
        }__CLR4_1_2hfwhfwl3lqxtit.R.inc(22678);for (int j = 0; (((j < 128)&&(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22679)!=0|true))||(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22680)==0&false)); j++) {{
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22681);assertEquals(bf_zero.getShortValue(bf_zero.setShortValue((short) 0, (short) j)), (short) 0);
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22682);assertEquals(bf_zero.setShortValue((short) 0, (short) j), (short) 0);
        }

        // verify that excess bits are stripped off
        }__CLR4_1_2hfwhfwl3lqxtit.R.inc(22683);assertEquals(bf_multi.setShortValue((short) 0x3f80, (short) 128), (short) 0);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22684);for (int j = 0; (((j < 2)&&(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22685)!=0|true))||(__CLR4_1_2hfwhfwl3lqxtit.R.iget(22686)==0&false)); j++) {{
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22687);assertEquals(bf_single.getShortValue(bf_single.setShortValue((short) 0, (short) j)), (short) j);
            __CLR4_1_2hfwhfwl3lqxtit.R.inc(22688);assertEquals(bf_single.setShortValue((short) 0, (short) j), (short) (j << 14));
        }

        // verify that excess bits are stripped off
        }__CLR4_1_2hfwhfwl3lqxtit.R.inc(22689);assertEquals(bf_single.setShortValue((short) 0x4000, (short) 2), (short) 0);
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    @Test
    public void testByte() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22w26nzhia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22690,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22w26nzhia(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22690);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22691);assertEquals(0, new BitField(0).setByteBoolean((byte) 0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22692);assertEquals(1, new BitField(1).setByteBoolean((byte) 0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22693);assertEquals(2, new BitField(2).setByteBoolean((byte) 0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22694);assertEquals(4, new BitField(4).setByteBoolean((byte) 0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22695);assertEquals(8, new BitField(8).setByteBoolean((byte) 0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22696);assertEquals(16, new BitField(16).setByteBoolean((byte) 0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22697);assertEquals(32, new BitField(32).setByteBoolean((byte) 0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22698);assertEquals(64, new BitField(64).setByteBoolean((byte) 0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22699);assertEquals(-128, new BitField(128).setByteBoolean((byte) 0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22700);assertEquals(1, new BitField(0).setByteBoolean((byte) 1, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22701);assertEquals(0, new BitField(1).setByteBoolean((byte) 1, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22702);assertEquals(0, new BitField(2).setByteBoolean((byte) 2, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22703);assertEquals(0, new BitField(4).setByteBoolean((byte) 4, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22704);assertEquals(0, new BitField(8).setByteBoolean((byte) 8, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22705);assertEquals(0, new BitField(16).setByteBoolean((byte) 16, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22706);assertEquals(0, new BitField(32).setByteBoolean((byte) 32, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22707);assertEquals(0, new BitField(64).setByteBoolean((byte) 64, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22708);assertEquals(0, new BitField(128).setByteBoolean((byte) 128, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22709);assertEquals(-2, new BitField(1).setByteBoolean((byte) 255, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22710);final byte clearedBit = new BitField(0x40).setByteBoolean((byte) - 63, false);

        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22711);assertFalse(new BitField(0x40).isSet(clearedBit));
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    /**
     * test the clear() method
     */
    @Test
    public void testClear() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jlyl6qhiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testClear",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22712,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jlyl6qhiw(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22712);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22713);assertEquals(bf_multi.clear(-1), 0xFFFFC07F);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22714);assertEquals(bf_single.clear(-1), 0xFFFFBFFF);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22715);assertEquals(bf_zero.clear(-1), 0xFFFFFFFF);
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    /**
     * test the clearShort() method
     */
    @Test
    public void testClearShort() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ph5mdkhj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testClearShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22716,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ph5mdkhj0(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22716);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22717);assertEquals(bf_multi.clearShort((short) - 1), (short) 0xC07F);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22718);assertEquals(bf_single.clearShort((short) - 1), (short) 0xBFFF);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22719);assertEquals(bf_zero.clearShort((short) -1), (short) 0xFFFF);
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    /**
     * test the set() method
     */
    @Test
    public void testSet() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_243b3qvhj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testSet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22720,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_243b3qvhj4(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22720);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22721);assertEquals(bf_multi.set(0), 0x3F80);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22722);assertEquals(bf_single.set(0), 0x4000);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22723);assertEquals(bf_zero.set(0), 0);
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    /**
     * test the setShort() method
     */
    @Test
    public void testSetShort() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2maxlf7hj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testSetShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22724,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2maxlf7hj8(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22724);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22725);assertEquals(bf_multi.setShort((short) 0), (short) 0x3F80);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22726);assertEquals(bf_single.setShort((short) 0), (short) 0x4000);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22727);assertEquals(bf_zero.setShort((short) 0), (short) 0);
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    /**
     * test the setBoolean() method
     */
    @Test
    public void testSetBoolean() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29tknzhjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testSetBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22728,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29tknzhjc(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22728);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22729);assertEquals(bf_multi.set(0), bf_multi.setBoolean(0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22730);assertEquals(bf_single.set(0), bf_single.setBoolean(0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22731);assertEquals(bf_zero.set(0), bf_zero.setBoolean(0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22732);assertEquals(bf_multi.clear(-1), bf_multi.setBoolean(-1, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22733);assertEquals(bf_single.clear(-1), bf_single.setBoolean(-1, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22734);assertEquals(bf_zero.clear(-1), bf_zero.setBoolean(-1, false));
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

    /**
     * test the setShortBoolean() method
     */
    @Test
    public void testSetShortBoolean() {__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceStart(getClass().getName(),22735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ib8y1vhjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2hfwhfwl3lqxtit.R.rethrow($CLV_t2$);}finally{__CLR4_1_2hfwhfwl3lqxtit.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.BitFieldTest.testSetShortBoolean",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),22735,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ib8y1vhjj(){try{__CLR4_1_2hfwhfwl3lqxtit.R.inc(22735);
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22736);assertEquals(bf_multi.setShort((short) 0), bf_multi.setShortBoolean((short) 0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22737);assertEquals(bf_single.setShort((short) 0), bf_single.setShortBoolean((short) 0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22738);assertEquals(bf_zero.setShort((short) 0), bf_zero.setShortBoolean((short) 0, true));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22739);assertEquals(bf_multi.clearShort((short) - 1), bf_multi.setShortBoolean((short) - 1, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22740);assertEquals(bf_single.clearShort((short) - 1), bf_single.setShortBoolean((short) - 1, false));
        __CLR4_1_2hfwhfwl3lqxtit.R.inc(22741);assertEquals(bf_zero.clearShort((short) -1), bf_zero.setShortBoolean((short) -1, false));
    }finally{__CLR4_1_2hfwhfwl3lqxtit.R.flushNeeded();}}

}
