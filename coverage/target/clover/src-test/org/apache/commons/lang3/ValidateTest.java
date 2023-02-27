/* $$ This file has been instrumented by Clover 4.1.2#20161011084623935 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.Validate}.
 *
 * @version $Id$
 */
public class ValidateTest  {static class __CLR4_1_2n63n63l3lqxu67{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,30504,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    //-----------------------------------------------------------------------
    @Test
    public void testIsTrue1() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2emedoun63();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsTrue1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30027,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2emedoun63(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30027);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30028);Validate.isTrue(true);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30029);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30030);Validate.isTrue(false);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30031);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30032);assertEquals("The validated expression is false", ex.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsTrue2() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hvechbn69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsTrue2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30033,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hvechbn69(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30033);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30034);Validate.isTrue(true, "MSG");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30035);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30036);Validate.isTrue(false, "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30037);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30038);assertEquals("MSG", ex.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsTrue3() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2l4eb9sn6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsTrue3",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30039,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2l4eb9sn6f(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30039);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30040);Validate.isTrue(true, "MSG", 6);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30041);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30042);Validate.isTrue(false, "MSG", 6);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30043);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30044);assertEquals("MSG", ex.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsTrue4() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2odea29n6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsTrue4",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30045,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2odea29n6l(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30045);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30046);Validate.isTrue(true, "MSG", 7);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30047);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30048);Validate.isTrue(false, "MSG", 7);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30049);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30050);assertEquals("MSG", ex.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testIsTrue5() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rme8uqn6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsTrue5",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30051,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rme8uqn6r(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30051);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30052);Validate.isTrue(true, "MSG", 7.4d);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30053);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30054);Validate.isTrue(false, "MSG", 7.4d);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30055);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30056);assertEquals("MSG", ex.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNotNull1() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27o8l2on6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotNull1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30057,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27o8l2on6x(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30057);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30058);Validate.notNull(new Object());
        __CLR4_1_2n63n63l3lqxu67.R.inc(30059);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30060);Validate.notNull(null);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30061);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30062);assertEquals("The validated object is null", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30063);final String str = "Hi";
        __CLR4_1_2n63n63l3lqxu67.R.inc(30064);final String testStr = Validate.notNull(str);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30065);assertSame(str, testStr);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotNull2() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24f8ma7n76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotNull2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30066,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24f8ma7n76(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30066);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30067);Validate.notNull(new Object(), "MSG");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30068);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30069);Validate.notNull(null, "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30070);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30071);assertEquals("MSG", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30072);final String str = "Hi";
        __CLR4_1_2n63n63l3lqxu67.R.inc(30073);final String testStr = Validate.notNull(str, "Message");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30074);assertSame(str, testStr);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyArray1() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vx37pnn7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyArray1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30075,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vx37pnn7f(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30075);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30076);Validate.notEmpty(new Object[] {null});
        __CLR4_1_2n63n63l3lqxu67.R.inc(30077);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30078);Validate.notEmpty((Object[]) null);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30079);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30080);assertEquals("The validated array is empty", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30081);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30082);Validate.notEmpty(new Object[0]);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30083);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30084);assertEquals("The validated array is empty", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30085);final String[] array = new String[] {"hi"};
        __CLR4_1_2n63n63l3lqxu67.R.inc(30086);final String[] test = Validate.notEmpty(array);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30087);assertSame(array, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyArray2() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2z636i4n7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyArray2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30088,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2z636i4n7s(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30088);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30089);Validate.notEmpty(new Object[] {null}, "MSG");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30090);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30091);Validate.notEmpty((Object[]) null, "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30092);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30093);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30094);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30095);Validate.notEmpty(new Object[0], "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30096);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30097);assertEquals("MSG", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30098);final String[] array = new String[] {"hi"};
        __CLR4_1_2n63n63l3lqxu67.R.inc(30099);final String[] test = Validate.notEmpty(array, "Message");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30100);assertSame(array, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyCollection1() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_277ye5qn85();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyCollection1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30101,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_277ye5qn85(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30101);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30102);final Collection<Integer> coll = new ArrayList<Integer>();
        __CLR4_1_2n63n63l3lqxu67.R.inc(30103);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30104);Validate.notEmpty((Collection<?>) null);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30105);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30106);assertEquals("The validated collection is empty", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30107);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30108);Validate.notEmpty(coll);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30109);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30110);assertEquals("The validated collection is empty", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30111);coll.add(Integer.valueOf(8));
        __CLR4_1_2n63n63l3lqxu67.R.inc(30112);Validate.notEmpty(coll);
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30113);final Collection<Integer> test = Validate.notEmpty(coll);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30114);assertSame(coll, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyCollection2() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2agycy7n8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyCollection2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30115,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2agycy7n8j(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30115);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30116);final Collection<Integer> coll = new ArrayList<Integer>();
        __CLR4_1_2n63n63l3lqxu67.R.inc(30117);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30118);Validate.notEmpty((Collection<?>) null, "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30119);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30120);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30121);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30122);Validate.notEmpty(coll, "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30123);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30124);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30125);coll.add(Integer.valueOf(8));
        __CLR4_1_2n63n63l3lqxu67.R.inc(30126);Validate.notEmpty(coll, "MSG");
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30127);final Collection<Integer> test = Validate.notEmpty(coll, "Message");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30128);assertSame(coll, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyMap1() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25fusg8n8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyMap1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30129,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25fusg8n8x(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30129);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30130);final Map<String, Integer> map = new HashMap<String, Integer>();
        __CLR4_1_2n63n63l3lqxu67.R.inc(30131);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30132);Validate.notEmpty((Map<?, ?>) null);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30133);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30134);assertEquals("The validated map is empty", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30135);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30136);Validate.notEmpty(map);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30137);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30138);assertEquals("The validated map is empty", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30139);map.put("ll", Integer.valueOf(8));
        __CLR4_1_2n63n63l3lqxu67.R.inc(30140);Validate.notEmpty(map);
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30141);final Map<String, Integer> test = Validate.notEmpty(map);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30142);assertSame(map, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyMap2() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28our8pn9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyMap2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30143,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28our8pn9b(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30143);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30144);final Map<String, Integer> map = new HashMap<String, Integer>();
        __CLR4_1_2n63n63l3lqxu67.R.inc(30145);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30146);Validate.notEmpty((Map<?, ?>) null, "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30147);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30148);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30149);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30150);Validate.notEmpty(map, "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30151);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30152);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30153);map.put("ll", Integer.valueOf(8));
        __CLR4_1_2n63n63l3lqxu67.R.inc(30154);Validate.notEmpty(map, "MSG");
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30155);final Map<String, Integer> test = Validate.notEmpty(map, "Message");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30156);assertSame(map, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyString1() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s16jy3n9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyString1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30157,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s16jy3n9p(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30157);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30158);Validate.notEmpty("hjl");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30159);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30160);Validate.notEmpty((String) null);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30161);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30162);assertEquals("The validated character sequence is empty", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30163);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30164);Validate.notEmpty("");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30165);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30166);assertEquals("The validated character sequence is empty", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30167);final String str = "Hi";
        __CLR4_1_2n63n63l3lqxu67.R.inc(30168);final String testStr = Validate.notEmpty(str);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30169);assertSame(str, testStr);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotEmptyString2() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30170);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2va6iqkna2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotEmptyString2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30170,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2va6iqkna2(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30170);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30171);Validate.notEmpty("a", "MSG");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30172);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30173);Validate.notEmpty((String) null, "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30174);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30175);assertEquals("MSG", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30176);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30177);Validate.notEmpty("", "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30178);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30179);assertEquals("MSG", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30180);final String str = "Hi";
        __CLR4_1_2n63n63l3lqxu67.R.inc(30181);final String testStr = Validate.notEmpty(str, "Message");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30182);assertSame(str, testStr);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankNullStringShouldThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rst3tdnaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankNullStringShouldThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30183,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rst3tdnaf(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30183);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30184);final String string = null;

        __CLR4_1_2n63n63l3lqxu67.R.inc(30185);try {
            //when
            __CLR4_1_2n63n63l3lqxu67.R.inc(30186);Validate.notBlank(string);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30187);fail("Expecting NullPointerException");
        } catch (final NullPointerException e) {
            //then
            __CLR4_1_2n63n63l3lqxu67.R.inc(30188);assertEquals("The validated character sequence is blank", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgNullStringShouldThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_296of10nal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgNullStringShouldThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30189,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_296of10nal(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30189);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30190);final String string = null;

        __CLR4_1_2n63n63l3lqxu67.R.inc(30191);try {
            //when
            __CLR4_1_2n63n63l3lqxu67.R.inc(30192);Validate.notBlank(string, "Message");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30193);fail("Expecting NullPointerException");
        } catch (final NullPointerException e) {
            //then
            __CLR4_1_2n63n63l3lqxu67.R.inc(30194);assertEquals("Message", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankEmptyStringShouldThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26l6strnar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankEmptyStringShouldThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30195,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26l6strnar(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30195);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30196);final String string = "";

        __CLR4_1_2n63n63l3lqxu67.R.inc(30197);try {
            //when
            __CLR4_1_2n63n63l3lqxu67.R.inc(30198);Validate.notBlank(string);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30199);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            __CLR4_1_2n63n63l3lqxu67.R.inc(30200);assertEquals("The validated character sequence is blank", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankBlankStringWithWhitespacesShouldThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pwsmnwnax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankBlankStringWithWhitespacesShouldThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30201,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pwsmnwnax(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30201);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30202);final String string = "   ";

        __CLR4_1_2n63n63l3lqxu67.R.inc(30203);try {
            //when
            __CLR4_1_2n63n63l3lqxu67.R.inc(30204);Validate.notBlank(string);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30205);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            __CLR4_1_2n63n63l3lqxu67.R.inc(30206);assertEquals("The validated character sequence is blank", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankBlankStringWithNewlinesShouldThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2f45l19nb3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankBlankStringWithNewlinesShouldThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30207,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2f45l19nb3(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30207);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30208);final String string = " \n \t \r \n ";

        __CLR4_1_2n63n63l3lqxu67.R.inc(30209);try {
            //when
            __CLR4_1_2n63n63l3lqxu67.R.inc(30210);Validate.notBlank(string);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30211);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            __CLR4_1_2n63n63l3lqxu67.R.inc(30212);assertEquals("The validated character sequence is blank", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgBlankStringShouldThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mmrlr1nb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgBlankStringShouldThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30213,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mmrlr1nb9(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30213);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30214);final String string = " \n \t \r \n ";

        __CLR4_1_2n63n63l3lqxu67.R.inc(30215);try {
            //when
            __CLR4_1_2n63n63l3lqxu67.R.inc(30216);Validate.notBlank(string, "Message");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30217);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            __CLR4_1_2n63n63l3lqxu67.R.inc(30218);assertEquals("Message", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgBlankStringWithWhitespacesShouldThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mvblb3nbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgBlankStringWithWhitespacesShouldThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30219,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mvblb3nbf(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30219);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30220);final String string = "   ";

        __CLR4_1_2n63n63l3lqxu67.R.inc(30221);try {
            //when
            __CLR4_1_2n63n63l3lqxu67.R.inc(30222);Validate.notBlank(string, "Message");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30223);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            __CLR4_1_2n63n63l3lqxu67.R.inc(30224);assertEquals("Message", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgEmptyStringShouldThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gnh5d6nbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgEmptyStringShouldThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30225,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gnh5d6nbl(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30225);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30226);final String string = "";

        __CLR4_1_2n63n63l3lqxu67.R.inc(30227);try {
            //when
            __CLR4_1_2n63n63l3lqxu67.R.inc(30228);Validate.notBlank(string, "Message");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30229);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            //then
            __CLR4_1_2n63n63l3lqxu67.R.inc(30230);assertEquals("Message", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankNotBlankStringShouldNotThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23vxy0inbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankNotBlankStringShouldNotThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30231,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23vxy0inbr(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30231);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30232);final String string = "abc";

        //when
        __CLR4_1_2n63n63l3lqxu67.R.inc(30233);Validate.notBlank(string);

        //then should not throw
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankNotBlankStringWithWhitespacesShouldNotThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xig860nbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankNotBlankStringWithWhitespacesShouldNotThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30234,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xig860nbu(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30234);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30235);final String string = "  abc   ";

        //when
        __CLR4_1_2n63n63l3lqxu67.R.inc(30236);Validate.notBlank(string);

        //then should not throw
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankNotBlankStringWithNewlinesShouldNotThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30237);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ycnj07nbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankNotBlankStringWithNewlinesShouldNotThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30237,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ycnj07nbx(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30237);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30238);final String string = " \n \t abc \r \n ";

        //when
        __CLR4_1_2n63n63l3lqxu67.R.inc(30239);Validate.notBlank(string);

        //then should not throw
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgNotBlankStringShouldNotThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n9we99nc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgNotBlankStringShouldNotThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30240,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n9we99nc0(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30240);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30241);final String string = "abc";

        //when
        __CLR4_1_2n63n63l3lqxu67.R.inc(30242);Validate.notBlank(string, "Message");

        //then should not throw
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgNotBlankStringWithWhitespacesShouldNotThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2miilz7nc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgNotBlankStringWithWhitespacesShouldNotThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30243,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2miilz7nc3(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30243);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30244);final String string = "  abc   ";

        //when
        __CLR4_1_2n63n63l3lqxu67.R.inc(30245);Validate.notBlank(string, "Message");

        //then should not throw
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankMsgNotBlankStringWithNewlinesShouldNotThrow() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jupicync6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankMsgNotBlankStringWithNewlinesShouldNotThrow",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30246,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jupicync6(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30246);
        //given
        __CLR4_1_2n63n63l3lqxu67.R.inc(30247);final String string = " \n \t abc \r \n ";

        //when
        __CLR4_1_2n63n63l3lqxu67.R.inc(30248);Validate.notBlank(string, "Message");

        //then should not throw
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNotBlankReturnValues1() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hwplfnc9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankReturnValues1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30249,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hwplfnc9(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30249);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30250);final String str = "Hi";
        __CLR4_1_2n63n63l3lqxu67.R.inc(30251);final String test = Validate.notBlank(str);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30252);assertSame(str, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    @Test
    public void testNotBlankReturnValues2() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23qwodwncd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNotBlankReturnValues2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30253,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23qwodwncd(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30253);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30254);final String str = "Hi";
        __CLR4_1_2n63n63l3lqxu67.R.inc(30255);final String test = Validate.notBlank(str, "Message");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30256);assertSame(str, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNoNullElementsArray1() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a835g0nch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNoNullElementsArray1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30257,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a835g0nch(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30257);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30258);String[] array = new String[] {"a", "b"};
        __CLR4_1_2n63n63l3lqxu67.R.inc(30259);Validate.noNullElements(array);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30260);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30261);Validate.noNullElements((Object[]) null);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30262);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30263);assertEquals("The validated object is null", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30264);array[1] = null;
        __CLR4_1_2n63n63l3lqxu67.R.inc(30265);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30266);Validate.noNullElements(array);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30267);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30268);assertEquals("The validated array contains null element at index: 1", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30269);array = new String[] {"a", "b"};
        __CLR4_1_2n63n63l3lqxu67.R.inc(30270);final String[] test = Validate.noNullElements(array);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30271);assertSame(array, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNoNullElementsArray2() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26z36njncw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNoNullElementsArray2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30272,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26z36njncw(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30272);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30273);String[] array = new String[] {"a", "b"};
        __CLR4_1_2n63n63l3lqxu67.R.inc(30274);Validate.noNullElements(array, "MSG");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30275);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30276);Validate.noNullElements((Object[]) null, "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30277);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30278);assertEquals("The validated object is null", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30279);array[1] = null;
        __CLR4_1_2n63n63l3lqxu67.R.inc(30280);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30281);Validate.noNullElements(array, "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30282);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30283);assertEquals("MSG", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30284);array = new String[] {"a", "b"};
        __CLR4_1_2n63n63l3lqxu67.R.inc(30285);final String[] test = Validate.noNullElements(array, "Message");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30286);assertSame(array, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testNoNullElementsCollection1() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2egl1ufndb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNoNullElementsCollection1",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30287,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2egl1ufndb(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30287);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30288);final List<String> coll = new ArrayList<String>();
        __CLR4_1_2n63n63l3lqxu67.R.inc(30289);coll.add("a");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30290);coll.add("b");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30291);Validate.noNullElements(coll);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30292);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30293);Validate.noNullElements((Collection<?>) null);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30294);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30295);assertEquals("The validated object is null", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30296);coll.set(1, null);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30297);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30298);Validate.noNullElements(coll);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30299);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30300);assertEquals("The validated collection contains null element at index: 1", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30301);coll.set(1, "b");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30302);final List<String> test = Validate.noNullElements(coll);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30303);assertSame(coll, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testNoNullElementsCollection2() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2b7l31ynds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testNoNullElementsCollection2",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30304,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2b7l31ynds(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30304);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30305);final List<String> coll = new ArrayList<String>();
        __CLR4_1_2n63n63l3lqxu67.R.inc(30306);coll.add("a");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30307);coll.add("b");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30308);Validate.noNullElements(coll, "MSG");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30309);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30310);Validate.noNullElements((Collection<?>) null, "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30311);fail("Expecting NullPointerException");
        } catch (final NullPointerException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30312);assertEquals("The validated object is null", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30313);coll.set(1, null);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30314);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30315);Validate.noNullElements(coll, "MSG");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30316);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30317);assertEquals("MSG", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30318);coll.set(1, "b");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30319);final List<String> test = Validate.noNullElements(coll, "Message");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30320);assertSame(coll, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hne9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30321,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hne9(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30321);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30322);assertNotNull(new Validate());
        __CLR4_1_2n63n63l3lqxu67.R.inc(30323);final Constructor<?>[] cons = Validate.class.getDeclaredConstructors();
        __CLR4_1_2n63n63l3lqxu67.R.inc(30324);assertEquals(1, cons.length);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30325);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2n63n63l3lqxu67.R.inc(30326);assertTrue(Modifier.isPublic(Validate.class.getModifiers()));
        __CLR4_1_2n63n63l3lqxu67.R.inc(30327);assertFalse(Modifier.isFinal(Validate.class.getModifiers()));
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testValidIndex_withMessage_array() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hbg71nneg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testValidIndex_withMessage_array",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30328,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hbg71nneg(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30328);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30329);final Object[] array = new Object[2];
        __CLR4_1_2n63n63l3lqxu67.R.inc(30330);Validate.validIndex(array, 0, "Broken: ");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30331);Validate.validIndex(array, 1, "Broken: ");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30332);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30333);Validate.validIndex(array, -1, "Broken: ");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30334);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30335);assertEquals("Broken: ", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30336);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30337);Validate.validIndex(array, 2, "Broken: ");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30338);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30339);assertEquals("Broken: ", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30340);final String[] strArray = new String[] {"Hi"};
        __CLR4_1_2n63n63l3lqxu67.R.inc(30341);final String[] test = Validate.noNullElements(strArray, "Message");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30342);assertSame(strArray, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    @Test
    public void testValidIndex_array() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q8ugndnev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testValidIndex_array",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30343,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q8ugndnev(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30343);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30344);final Object[] array = new Object[2];
        __CLR4_1_2n63n63l3lqxu67.R.inc(30345);Validate.validIndex(array, 0);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30346);Validate.validIndex(array, 1);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30347);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30348);Validate.validIndex(array, -1);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30349);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30350);assertEquals("The validated array index is invalid: -1", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30351);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30352);Validate.validIndex(array, 2);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30353);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30354);assertEquals("The validated array index is invalid: 2", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30355);final String[] strArray = new String[] {"Hi"};
        __CLR4_1_2n63n63l3lqxu67.R.inc(30356);final String[] test = Validate.noNullElements(strArray);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30357);assertSame(strArray, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testValidIndex_withMessage_collection() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uxhyxynfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testValidIndex_withMessage_collection",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30358,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uxhyxynfa(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30358);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30359);final Collection<String> coll = new ArrayList<String>();
        __CLR4_1_2n63n63l3lqxu67.R.inc(30360);coll.add(null);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30361);coll.add(null);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30362);Validate.validIndex(coll, 0, "Broken: ");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30363);Validate.validIndex(coll, 1, "Broken: ");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30364);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30365);Validate.validIndex(coll, -1, "Broken: ");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30366);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30367);assertEquals("Broken: ", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30368);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30369);Validate.validIndex(coll, 2, "Broken: ");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30370);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30371);assertEquals("Broken: ", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30372);final List<String> strColl = Arrays.asList(new String[] {"Hi"});
        __CLR4_1_2n63n63l3lqxu67.R.inc(30373);final List<String> test = Validate.validIndex(strColl, 0, "Message");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30374);assertSame(strColl, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    @Test
    public void testValidIndex_collection() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25clpq4nfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testValidIndex_collection",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30375,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25clpq4nfr(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30375);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30376);final Collection<String> coll = new ArrayList<String>();
        __CLR4_1_2n63n63l3lqxu67.R.inc(30377);coll.add(null);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30378);coll.add(null);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30379);Validate.validIndex(coll, 0);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30380);Validate.validIndex(coll, 1);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30381);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30382);Validate.validIndex(coll, -1);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30383);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30384);assertEquals("The validated collection index is invalid: -1", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30385);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30386);Validate.validIndex(coll, 2);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30387);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30388);assertEquals("The validated collection index is invalid: 2", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30389);final List<String> strColl = Arrays.asList(new String[] {"Hi"});
        __CLR4_1_2n63n63l3lqxu67.R.inc(30390);final List<String> test = Validate.validIndex(strColl, 0);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30391);assertSame(strColl, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    @Test
    public void testValidIndex_withMessage_charSequence() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_278emstng8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testValidIndex_withMessage_charSequence",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30392,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_278emstng8(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30392);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30393);final CharSequence str = "Hi";
        __CLR4_1_2n63n63l3lqxu67.R.inc(30394);Validate.validIndex(str, 0, "Broken: ");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30395);Validate.validIndex(str, 1, "Broken: ");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30396);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30397);Validate.validIndex(str, -1, "Broken: ");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30398);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30399);assertEquals("Broken: ", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30400);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30401);Validate.validIndex(str, 2, "Broken: ");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30402);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30403);assertEquals("Broken: ", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30404);final String input = "Hi";
        __CLR4_1_2n63n63l3lqxu67.R.inc(30405);final String test = Validate.validIndex(input, 0, "Message");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30406);assertSame(input, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    @Test
    public void testValidIndex_charSequence() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hqc2izngn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testValidIndex_charSequence",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30407,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hqc2izngn(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30407);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30408);final CharSequence str = "Hi";
        __CLR4_1_2n63n63l3lqxu67.R.inc(30409);Validate.validIndex(str, 0);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30410);Validate.validIndex(str, 1);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30411);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30412);Validate.validIndex(str, -1);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30413);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30414);assertEquals("The validated character sequence index is invalid: -1", ex.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30415);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30416);Validate.validIndex(str, 2);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30417);fail("Expecting IndexOutOfBoundsException");
        } catch (final IndexOutOfBoundsException ex) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30418);assertEquals("The validated character sequence index is invalid: 2", ex.getMessage());
        }
        
        __CLR4_1_2n63n63l3lqxu67.R.inc(30419);final String input = "Hi";
        __CLR4_1_2n63n63l3lqxu67.R.inc(30420);final String test = Validate.validIndex(input, 0);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30421);assertSame(input, test);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}
    
    @Test
    public void testMatchesPattern()
    {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ila4junh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testMatchesPattern",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30422,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ila4junh2(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30422);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30423);final CharSequence str = "hi";
        __CLR4_1_2n63n63l3lqxu67.R.inc(30424);Validate.matchesPattern(str, "[a-z]*");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30425);try
        {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30426);Validate.matchesPattern(str, "[0-9]*");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30427);fail("Expecting IllegalArgumentException");
        }
        catch (final IllegalArgumentException e)
        {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30428);assertEquals("The string hi does not match the pattern [0-9]*", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}
    
    @Test
    public void testMatchesPattern_withMessage()
    {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2y90ml4nh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testMatchesPattern_withMessage",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30429,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2y90ml4nh9(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30429);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30430);final CharSequence str = "hi";
        __CLR4_1_2n63n63l3lqxu67.R.inc(30431);Validate.matchesPattern(str, "[a-z]*", "Does not match");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30432);try
        {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30433);Validate.matchesPattern(str, "[0-9]*", "Does not match");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30434);fail("Expecting IllegalArgumentException");
        }
        catch (final IllegalArgumentException e)
        {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30435);assertEquals("Does not match", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}
    
    @Test
    public void testInclusiveBetween()
    {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kgan5hnhg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testInclusiveBetween",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30436,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kgan5hnhg(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30436);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30437);Validate.inclusiveBetween("a", "c", "b");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30438);Validate.inclusiveBetween(0, 2, 1);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30439);Validate.inclusiveBetween(0, 2, 2);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30440);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30441);Validate.inclusiveBetween(0, 5, 6);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30442);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30443);assertEquals("The value 6 is not in the specified inclusive range of 0 to 5", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}
    
    @Test
    public void testInclusiveBetween_withMessage()
    {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ttvbhlnho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testInclusiveBetween_withMessage",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30444,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ttvbhlnho(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30444);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30445);Validate.inclusiveBetween("a", "c", "b", "Error");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30446);Validate.inclusiveBetween(0, 2, 1, "Error");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30447);Validate.inclusiveBetween(0, 2, 2, "Error");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30448);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30449);Validate.inclusiveBetween(0, 5, 6, "Error");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30450);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30451);assertEquals("Error", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}
    
    @Test
    public void testExclusiveBetween()
    {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yuinelnhw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testExclusiveBetween",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30452,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yuinelnhw(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30452);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30453);Validate.exclusiveBetween("a", "c", "b");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30454);Validate.exclusiveBetween(0, 2, 1);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30455);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30456);Validate.exclusiveBetween(0, 5, 6);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30457);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30458);assertEquals("The value 6 is not in the specified exclusive range of 0 to 5", e.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30459);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30460);Validate.exclusiveBetween(0, 5, 5);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30461);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30462);assertEquals("The value 5 is not in the specified exclusive range of 0 to 5", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}
    
    @Test
    public void testExclusiveBetween_withMessage()
    {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2olg0v9ni7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testExclusiveBetween_withMessage",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30463,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2olg0v9ni7(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30463);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30464);Validate.exclusiveBetween("a", "c", "b", "Error");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30465);Validate.exclusiveBetween(0, 2, 1, "Error");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30466);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30467);Validate.exclusiveBetween(0, 5, 6, "Error");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30468);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30469);assertEquals("Error", e.getMessage());
        }
        __CLR4_1_2n63n63l3lqxu67.R.inc(30470);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30471);Validate.exclusiveBetween(0, 5, 5, "Error");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30472);fail("Expecting IllegalArgumentException");
        } catch (final IllegalArgumentException e) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30473);assertEquals("Error", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

    @Test
    public void testIsInstanceOf() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2je21o1nii();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsInstanceOf",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30474,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2je21o1nii(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30474);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30475);Validate.isInstanceOf(String.class, "hi");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30476);Validate.isInstanceOf(Integer.class, 1);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}
    
    @Test
    public void testIsInstanceOfExceptionMessage() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25ksbtznil();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsInstanceOfExceptionMessage",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30477,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25ksbtznil(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30477);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30478);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30479);Validate.isInstanceOf(List.class, "hi");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30480);fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30481);assertEquals("Expected type: java.util.List, actual: java.lang.String", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}
    
    @Test
    public void testIsInstanceOf_withMessage() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ncztrlniq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsInstanceOf_withMessage",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30482,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ncztrlniq(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30482);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30483);Validate.isInstanceOf(String.class, "hi", "Error");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30484);Validate.isInstanceOf(Integer.class, 1, "Error");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30485);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30486);Validate.isInstanceOf(List.class, "hi", "Error");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30487);fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30488);assertEquals("Error", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}
    
    @Test
    public void testIsAssignable() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_243to2cnix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsAssignable",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30489,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_243to2cnix(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30489);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30490);Validate.isAssignableFrom(CharSequence.class, String.class);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30491);Validate.isAssignableFrom(AbstractList.class, ArrayList.class);
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}
    
    @Test
    public void testIsAssignableExceptionMessage() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28hrlc4nj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsAssignableExceptionMessage",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30492,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28hrlc4nj0(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30492);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30493);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30494);Validate.isAssignableFrom(List.class, String.class);
            __CLR4_1_2n63n63l3lqxu67.R.inc(30495);fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30496);assertEquals("Cannot assign a java.lang.String to a java.util.List", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}
    
    @Test
    public void testIsAssignable_withMessage() {__CLR4_1_2n63n63l3lqxu67.R.globalSliceStart(getClass().getName(),30497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25ojm4unj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2n63n63l3lqxu67.R.rethrow($CLV_t2$);}finally{__CLR4_1_2n63n63l3lqxu67.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ValidateTest.testIsAssignable_withMessage",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),30497,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25ojm4unj5(){try{__CLR4_1_2n63n63l3lqxu67.R.inc(30497);
        __CLR4_1_2n63n63l3lqxu67.R.inc(30498);Validate.isAssignableFrom(CharSequence.class, String.class, "Error");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30499);Validate.isAssignableFrom(AbstractList.class, ArrayList.class, "Error");
        __CLR4_1_2n63n63l3lqxu67.R.inc(30500);try {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30501);Validate.isAssignableFrom(List.class, String.class, "Error");
            __CLR4_1_2n63n63l3lqxu67.R.inc(30502);fail("Expecting IllegalArgumentException");
        } catch(final IllegalArgumentException e) {
            __CLR4_1_2n63n63l3lqxu67.R.inc(30503);assertEquals("Error", e.getMessage());
        }
    }finally{__CLR4_1_2n63n63l3lqxu67.R.flushNeeded();}}

}
