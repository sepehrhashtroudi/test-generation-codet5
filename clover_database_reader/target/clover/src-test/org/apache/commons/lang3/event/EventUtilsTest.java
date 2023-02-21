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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import javax.naming.event.ObjectChangeListener;

import org.junit.Test;

/**
 * @since 3.0
 * @version $Id$
 */
public class EventUtilsTest 
{static class __CLR4_1_2qnoqnol3lqxum3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,34645,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testConstructor() {__CLR4_1_2qnoqnol3lqxum3.R.globalSliceStart(getClass().getName(),34548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hqno();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qnoqnol3lqxum3.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qnoqnol3lqxum3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34548,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hqno(){try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34548);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34549);assertNotNull(new EventUtils());
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34550);final Constructor<?>[] cons = EventUtils.class.getDeclaredConstructors();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34551);assertEquals(1, cons.length);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34552);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34553);assertTrue(Modifier.isPublic(EventUtils.class.getModifiers()));
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34554);assertFalse(Modifier.isFinal(EventUtils.class.getModifiers()));
    }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}
    
    @Test
    public void testAddEventListener()
    {__CLR4_1_2qnoqnol3lqxum3.R.globalSliceStart(getClass().getName(),34555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_284izruqnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qnoqnol3lqxum3.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qnoqnol3lqxum3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testAddEventListener",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34555,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_284izruqnv(){try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34555);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34556);final PropertyChangeSource src = new PropertyChangeSource();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34557);final EventCountingInvociationHandler handler = new EventCountingInvociationHandler();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34558);final PropertyChangeListener listener = handler.createListener(PropertyChangeListener.class);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34559);assertEquals(0, handler.getEventCount("propertyChange"));
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34560);EventUtils.addEventListener(src, PropertyChangeListener.class, listener);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34561);assertEquals(0, handler.getEventCount("propertyChange"));
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34562);src.setProperty("newValue");
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34563);assertEquals(1, handler.getEventCount("propertyChange"));
    }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}

    @Test
    public void testAddEventListenerWithNoAddMethod()
    {__CLR4_1_2qnoqnol3lqxum3.R.globalSliceStart(getClass().getName(),34564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22tqqppqo4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qnoqnol3lqxum3.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qnoqnol3lqxum3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerWithNoAddMethod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34564,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22tqqppqo4(){try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34564);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34565);final PropertyChangeSource src = new PropertyChangeSource();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34566);final EventCountingInvociationHandler handler = new EventCountingInvociationHandler();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34567);final ObjectChangeListener listener = handler.createListener(ObjectChangeListener.class);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34568);try
        {
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34569);EventUtils.addEventListener(src, ObjectChangeListener.class, listener);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34570);fail("Should not be allowed to add a listener to an object that doesn't support it.");
        }
        catch (final IllegalArgumentException e)
        {
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34571);assertEquals("Class " + src.getClass().getName() + " does not have a public add" + ObjectChangeListener.class.getSimpleName() + " method which takes a parameter of type " + ObjectChangeListener.class.getName() + ".", e.getMessage());
        }
    }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}

    @Test
    public void testAddEventListenerThrowsException()
    {__CLR4_1_2qnoqnol3lqxum3.R.globalSliceStart(getClass().getName(),34572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2srgtwqqoc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qnoqnol3lqxum3.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qnoqnol3lqxum3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerThrowsException",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34572,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2srgtwqqoc(){try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34572);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34573);final ExceptionEventSource src = new ExceptionEventSource();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34574);try
        {
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34575);EventUtils.addEventListener(src, PropertyChangeListener.class, new PropertyChangeListener()
            {
                @Override
                public void propertyChange(final PropertyChangeEvent e)
                {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34576);
                    // Do nothing!
                }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}
            });
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34577);fail("Add method should have thrown an exception, so method should fail.");
        }
        catch (final RuntimeException e)
        {

        }
    }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}

    @Test
    public void testAddEventListenerWithPrivateAddMethod()
    {__CLR4_1_2qnoqnol3lqxum3.R.globalSliceStart(getClass().getName(),34578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d03lslqoi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qnoqnol3lqxum3.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qnoqnol3lqxum3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testAddEventListenerWithPrivateAddMethod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34578,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d03lslqoi(){try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34578);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34579);final PropertyChangeSource src = new PropertyChangeSource();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34580);final EventCountingInvociationHandler handler = new EventCountingInvociationHandler();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34581);final VetoableChangeListener listener = handler.createListener(VetoableChangeListener.class);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34582);try
        {
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34583);EventUtils.addEventListener(src, VetoableChangeListener.class, listener);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34584);fail("Should not be allowed to add a listener to an object that doesn't support it.");
        }
        catch (final IllegalArgumentException e)
        {
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34585);assertEquals("Class " + src.getClass().getName() + " does not have a public add" + VetoableChangeListener.class.getSimpleName() + " method which takes a parameter of type " + VetoableChangeListener.class.getName() + ".", e.getMessage());
        }
    }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}

    @Test
    public void testBindEventsToMethod()
    {__CLR4_1_2qnoqnol3lqxum3.R.globalSliceStart(getClass().getName(),34586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2seugwbqoq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qnoqnol3lqxum3.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qnoqnol3lqxum3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testBindEventsToMethod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34586,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2seugwbqoq(){try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34586);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34587);final PropertyChangeSource src = new PropertyChangeSource();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34588);final EventCounter counter = new EventCounter();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34589);EventUtils.bindEventsToMethod(counter, "eventOccurred", src, PropertyChangeListener.class);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34590);assertEquals(0, counter.getCount());
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34591);src.setProperty("newValue");
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34592);assertEquals(1, counter.getCount());
    }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}


    @Test
    public void testBindEventsToMethodWithEvent()
    {__CLR4_1_2qnoqnol3lqxum3.R.globalSliceStart(getClass().getName(),34593);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_217jfmfqox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qnoqnol3lqxum3.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qnoqnol3lqxum3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testBindEventsToMethodWithEvent",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34593,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_217jfmfqox(){try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34593);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34594);final PropertyChangeSource src = new PropertyChangeSource();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34595);final EventCounterWithEvent counter = new EventCounterWithEvent();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34596);EventUtils.bindEventsToMethod(counter, "eventOccurred", src, PropertyChangeListener.class);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34597);assertEquals(0, counter.getCount());
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34598);src.setProperty("newValue");
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34599);assertEquals(1, counter.getCount());
    }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}


    @Test
    public void testBindFilteredEventsToMethod()
    {__CLR4_1_2qnoqnol3lqxum3.R.globalSliceStart(getClass().getName(),34600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d34lcyqp4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2qnoqnol3lqxum3.R.rethrow($CLV_t2$);}finally{__CLR4_1_2qnoqnol3lqxum3.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.event.EventUtilsTest.testBindFilteredEventsToMethod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),34600,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d34lcyqp4(){try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34600);
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34601);final MultipleEventSource src = new MultipleEventSource();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34602);final EventCounter counter = new EventCounter();
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34603);EventUtils.bindEventsToMethod(counter, "eventOccurred", src, MultipleEventListener.class, "event1");
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34604);assertEquals(0, counter.getCount());
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34605);src.listeners.fire().event1(new PropertyChangeEvent(new Date(), "Day", Integer.valueOf(0), Integer.valueOf(1)));
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34606);assertEquals(1, counter.getCount());
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34607);src.listeners.fire().event2(new PropertyChangeEvent(new Date(), "Day", Integer.valueOf(1), Integer.valueOf(2)));
        __CLR4_1_2qnoqnol3lqxum3.R.inc(34608);assertEquals(1, counter.getCount());
    }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}

    public static interface MultipleEventListener
    {
        public void event1(PropertyChangeEvent e);

        public void event2(PropertyChangeEvent e);
    }

    public static class EventCounter
    {
        private int count;

        public void eventOccurred()
        {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34609);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34610);count++;
        }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}

        public int getCount()
        {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34611);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34612);return count;
        }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}
    }

    public static class EventCounterWithEvent
    {
        private int count;

        public void eventOccurred(final PropertyChangeEvent e)
        {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34613);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34614);count++;
        }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}

        public int getCount()
        {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34615);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34616);return count;
        }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}
    }


    private static class EventCountingInvociationHandler implements InvocationHandler
    {
        private final Map<String, Integer> eventCounts = new TreeMap<String, Integer>();

        public <L> L createListener(final Class<L> listenerType)
        {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34617);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34618);return listenerType.cast(Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                    new Class[]{listenerType},
                    this));
        }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}

        public int getEventCount(final String eventName)
        {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34619);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34620);final Integer count = eventCounts.get(eventName);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34621);return (((count == null )&&(__CLR4_1_2qnoqnol3lqxum3.R.iget(34622)!=0|true))||(__CLR4_1_2qnoqnol3lqxum3.R.iget(34623)==0&false))? 0 : count.intValue();
        }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}

        @Override
        public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable
        {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34624);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34625);final Integer count = eventCounts.get(method.getName());
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34626);if ((((count == null)&&(__CLR4_1_2qnoqnol3lqxum3.R.iget(34627)!=0|true))||(__CLR4_1_2qnoqnol3lqxum3.R.iget(34628)==0&false)))
            {{
                __CLR4_1_2qnoqnol3lqxum3.R.inc(34629);eventCounts.put(method.getName(), Integer.valueOf(1));
            }
            }else
            {{
                __CLR4_1_2qnoqnol3lqxum3.R.inc(34630);eventCounts.put(method.getName(), Integer.valueOf(count.intValue() + 1));
            }
            }__CLR4_1_2qnoqnol3lqxum3.R.inc(34631);return null;
        }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}
    }

    public static class MultipleEventSource
    {
        private final EventListenerSupport<MultipleEventListener> listeners = EventListenerSupport.create(MultipleEventListener.class);

        public void addMultipleEventListener(final MultipleEventListener listener)
        {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34632);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34633);listeners.addListener(listener);
        }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}
    }

    public static class ExceptionEventSource
    {
        public void addPropertyChangeListener(final PropertyChangeListener listener)
        {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34634);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34635);throw new RuntimeException();
        }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}
    }

    public static class PropertyChangeSource
    {
        private final EventListenerSupport<PropertyChangeListener> listeners = EventListenerSupport.create(PropertyChangeListener.class);

        private String property;

        public void setProperty(final String property)
        {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34636);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34637);final String oldValue = this.property;
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34638);this.property = property;
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34639);listeners.fire().propertyChange(new PropertyChangeEvent(this, "property", oldValue, property));
        }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}

        protected void addVetoableChangeListener(final VetoableChangeListener listener)
        {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34640);
            // Do nothing!
        }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}

        public void addPropertyChangeListener(final PropertyChangeListener listener)
        {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34641);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34642);listeners.addListener(listener);
        }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}

        public void removePropertyChangeListener(final PropertyChangeListener listener)
        {try{__CLR4_1_2qnoqnol3lqxum3.R.inc(34643);
            __CLR4_1_2qnoqnol3lqxum3.R.inc(34644);listeners.removeListener(listener);
        }finally{__CLR4_1_2qnoqnol3lqxum3.R.flushNeeded();}}
    }
}
