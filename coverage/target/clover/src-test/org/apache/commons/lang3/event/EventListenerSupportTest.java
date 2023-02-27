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

package org.apache.commons.lang3.event;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Test;

/**
 * @since 3.0
 * @version $Id$
 */
public class EventListenerSupportTest 
{static class __CLR4_1_2ql2ql2l3lqxulu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,34548,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Test(expected=NullPointerException.class)
    public void testAddNullListener()
    {__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceStart(getClass().getName(),34454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ksxpvzql2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,65,100,100,78,117,108,108,76,105,115,116,101,110,101,114,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ql2ql2l3lqxulu.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testAddNullListener",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34454,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ksxpvzql2(){try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34454);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34455);final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34456);listenerSupport.addListener(null);
    }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testRemoveNullListener()
    {__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceStart(getClass().getName(),34457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p3lh7cql5();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,82,101,109,111,118,101,78,117,108,108,76,105,115,116,101,110,101,114,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ql2ql2l3lqxulu.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testRemoveNullListener",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34457,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p3lh7cql5(){try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34457);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34458);final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34459);listenerSupport.removeListener(null);
    }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}

    @Test
    public void testEventDispatchOrder() throws PropertyVetoException
    {__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceStart(getClass().getName(),34460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j1y2r7ql8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ql2ql2l3lqxulu.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testEventDispatchOrder",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34460,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j1y2r7ql8() throws PropertyVetoException{try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34460);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34461);final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34462);final List<VetoableChangeListener> calledListeners = new ArrayList<VetoableChangeListener>();

        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34463);final VetoableChangeListener listener1 = createListener(calledListeners);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34464);final VetoableChangeListener listener2 = createListener(calledListeners);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34465);listenerSupport.addListener(listener1);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34466);listenerSupport.addListener(listener2);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34467);listenerSupport.fire().vetoableChange(new PropertyChangeEvent(new Date(), "Day", 4, 5));
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34468);assertEquals(calledListeners.size(), 2);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34469);assertSame(calledListeners.get(0), listener1);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34470);assertSame(calledListeners.get(1), listener2);
    }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testCreateWithNonInterfaceParameter()
    {__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceStart(getClass().getName(),34471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tsw8eoqlj();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,87,105,116,104,78,111,110,73,110,116,101,114,102,97,99,101,80,97,114,97,109,101,116,101,114,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ql2ql2l3lqxulu.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testCreateWithNonInterfaceParameter",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34471,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tsw8eoqlj(){try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34471);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34472);EventListenerSupport.create(String.class);
    }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testCreateWithNullParameter()
    {__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceStart(getClass().getName(),34473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nax1sbqll();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,114,101,97,116,101,87,105,116,104,78,117,108,108,80,97,114,97,109,101,116,101,114,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ql2ql2l3lqxulu.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testCreateWithNullParameter",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34473,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nax1sbqll(){try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34473);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34474);EventListenerSupport.create(null);
    }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}

    @Test
    public void testRemoveListenerDuringEvent() throws PropertyVetoException
    {__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceStart(getClass().getName(),34475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bijiaeqln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ql2ql2l3lqxulu.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testRemoveListenerDuringEvent",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34475,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bijiaeqln() throws PropertyVetoException{try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34475);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34476);final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34477);for (int i = 0; (((i < 10)&&(__CLR4_1_2ql2ql2l3lqxulu.R.iget(34478)!=0|true))||(__CLR4_1_2ql2ql2l3lqxulu.R.iget(34479)==0&false)); ++i)
        {{
            __CLR4_1_2ql2ql2l3lqxulu.R.inc(34480);addDeregisterListener(listenerSupport);
        }
        }__CLR4_1_2ql2ql2l3lqxulu.R.inc(34481);assertEquals(listenerSupport.getListenerCount(), 10);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34482);listenerSupport.fire().vetoableChange(new PropertyChangeEvent(new Date(), "Day", 4, 5));
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34483);assertEquals(listenerSupport.getListenerCount(), 0);
    }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}

    @Test
    public void testGetListeners() {__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceStart(getClass().getName(),34484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2op2t5uqlw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ql2ql2l3lqxulu.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testGetListeners",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34484,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2op2t5uqlw(){try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34484);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34485);final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);

        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34486);final VetoableChangeListener[] listeners = listenerSupport.getListeners();
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34487);assertEquals(0, listeners.length);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34488);assertEquals(VetoableChangeListener.class, listeners.getClass().getComponentType());
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34489);final VetoableChangeListener[] empty = listeners;
        //for fun, show that the same empty instance is used 
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34490);assertSame(empty, listenerSupport.getListeners());

        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34491);final VetoableChangeListener listener1 = EasyMock.createNiceMock(VetoableChangeListener.class);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34492);listenerSupport.addListener(listener1);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34493);assertEquals(1, listenerSupport.getListeners().length);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34494);final VetoableChangeListener listener2 = EasyMock.createNiceMock(VetoableChangeListener.class);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34495);listenerSupport.addListener(listener2);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34496);assertEquals(2, listenerSupport.getListeners().length);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34497);listenerSupport.removeListener(listener1);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34498);assertEquals(1, listenerSupport.getListeners().length);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34499);listenerSupport.removeListener(listener2);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34500);assertSame(empty, listenerSupport.getListeners());
    }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}

    @Test
    public void testSerialization() throws IOException, ClassNotFoundException, PropertyVetoException {__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceStart(getClass().getName(),34501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26m1on9qmd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ql2ql2l3lqxulu.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testSerialization",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34501,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26m1on9qmd() throws IOException, ClassNotFoundException, PropertyVetoException{try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34501);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34502);final EventListenerSupport<VetoableChangeListener> listenerSupport = EventListenerSupport.create(VetoableChangeListener.class);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34503);listenerSupport.addListener(new VetoableChangeListener() {
            
            @Override
            public void vetoableChange(final PropertyChangeEvent e) {try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34504);
            }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}
        });
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34505);listenerSupport.addListener(EasyMock.createNiceMock(VetoableChangeListener.class));

        //serialize:
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34506);final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34507);final ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34508);objectOutputStream.writeObject(listenerSupport);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34509);objectOutputStream.close();

        //deserialize:
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34510);@SuppressWarnings("unchecked")
        final
        EventListenerSupport<VetoableChangeListener> deserializedListenerSupport = (EventListenerSupport<VetoableChangeListener>) new ObjectInputStream(
                new ByteArrayInputStream(outputStream.toByteArray())).readObject();

        //make sure we get a listener array back, of the correct component type, and that it contains only the serializable mock
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34511);final VetoableChangeListener[] listeners = deserializedListenerSupport.getListeners();
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34512);assertEquals(VetoableChangeListener.class, listeners.getClass().getComponentType());
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34513);assertEquals(1, listeners.length);

        //now verify that the mock still receives events; we can infer that the proxy was correctly reconstituted
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34514);final VetoableChangeListener listener = listeners[0];
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34515);final PropertyChangeEvent evt = new PropertyChangeEvent(new Date(), "Day", 7, 9);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34516);listener.vetoableChange(evt);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34517);EasyMock.replay(listener);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34518);deserializedListenerSupport.fire().vetoableChange(evt);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34519);EasyMock.verify(listener);

        //remove listener and verify we get an empty array of listeners
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34520);deserializedListenerSupport.removeListener(listener);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34521);assertEquals(0, deserializedListenerSupport.getListeners().length);
    }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}

    @Test
    public void testSubclassInvocationHandling() throws PropertyVetoException {__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceStart(getClass().getName(),34522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28gb1buqmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2ql2ql2l3lqxulu.R.rethrow($CLV_t2$);}finally{__CLR4_1_2ql2ql2l3lqxulu.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventListenerSupportTest.testSubclassInvocationHandling",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34522,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28gb1buqmy() throws PropertyVetoException{try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34522);

        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34523);@SuppressWarnings("serial")
        final
        EventListenerSupport<VetoableChangeListener> eventListenerSupport = new EventListenerSupport<VetoableChangeListener>(
                VetoableChangeListener.class) {
            @Override
            protected java.lang.reflect.InvocationHandler createInvocationHandler() {try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34524);
                __CLR4_1_2ql2ql2l3lqxulu.R.inc(34525);return new ProxyInvocationHandler() {
                    /**
                     * {@inheritDoc}
                     */
                    @Override
                    public Object invoke(final Object proxy, final Method method, final Object[] args)
                            throws Throwable {try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34526);
                        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34527);return ((("vetoableChange".equals(method.getName())
                                && "Hour".equals(((PropertyChangeEvent) args[0]).getPropertyName()) )&&(__CLR4_1_2ql2ql2l3lqxulu.R.iget(34528)!=0|true))||(__CLR4_1_2ql2ql2l3lqxulu.R.iget(34529)==0&false))? null
                                : super.invoke(proxy, method, args);
                    }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}
                };
            }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}
        };

        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34530);final VetoableChangeListener listener = EasyMock.createNiceMock(VetoableChangeListener.class);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34531);eventListenerSupport.addListener(listener);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34532);final Object source = new Date();
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34533);final PropertyChangeEvent ignore = new PropertyChangeEvent(source, "Hour", 5, 6);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34534);final PropertyChangeEvent respond = new PropertyChangeEvent(source, "Day", 6, 7);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34535);listener.vetoableChange(respond);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34536);EasyMock.replay(listener);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34537);eventListenerSupport.fire().vetoableChange(ignore);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34538);eventListenerSupport.fire().vetoableChange(respond);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34539);EasyMock.verify(listener);
    }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}

    private void addDeregisterListener(final EventListenerSupport<VetoableChangeListener> listenerSupport)
    {try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34540);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34541);listenerSupport.addListener(new VetoableChangeListener()
        {
            @Override
            public void vetoableChange(final PropertyChangeEvent e)
            {try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34542);
                __CLR4_1_2ql2ql2l3lqxulu.R.inc(34543);listenerSupport.removeListener(this);
            }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}
        });
    }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}

    private VetoableChangeListener createListener(final List<VetoableChangeListener> calledListeners)
    {try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34544);
        __CLR4_1_2ql2ql2l3lqxulu.R.inc(34545);return new VetoableChangeListener()
        {
            @Override
            public void vetoableChange(final PropertyChangeEvent e)
            {try{__CLR4_1_2ql2ql2l3lqxulu.R.inc(34546);
                __CLR4_1_2ql2ql2l3lqxulu.R.inc(34547);calledListeners.add(this);
            }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}
        };
    }finally{__CLR4_1_2ql2ql2l3lqxulu.R.flushNeeded();}}
}
