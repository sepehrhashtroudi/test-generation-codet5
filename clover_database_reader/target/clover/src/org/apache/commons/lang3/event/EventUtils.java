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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.reflect.MethodUtils;

/**
 * Provides some useful event-based utility methods.
 *
 * @since 3.0
 * @version $Id$
 */
public class EventUtils {public static class __CLR4_1_28n78n7l3lqxsdp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,11228,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Adds an event listener to the specified source.  This looks for an "add" method corresponding to the event
     * type (addActionListener, for example).
     * @param eventSource   the event source
     * @param listenerType  the event listener type
     * @param listener      the listener
     * @param <L>           the event listener type
     *
     * @throws IllegalArgumentException if the object doesn't support the listener type
     */
    public static <L> void addEventListener(final Object eventSource, final Class<L> listenerType, final L listener) {try{__CLR4_1_28n78n7l3lqxsdp.R.inc(11203);
        __CLR4_1_28n78n7l3lqxsdp.R.inc(11204);try {
            __CLR4_1_28n78n7l3lqxsdp.R.inc(11205);MethodUtils.invokeMethod(eventSource, "add" + listenerType.getSimpleName(), listener);
        } catch (final NoSuchMethodException e) {
            __CLR4_1_28n78n7l3lqxsdp.R.inc(11206);throw new IllegalArgumentException("Class " + eventSource.getClass().getName()
                    + " does not have a public add" + listenerType.getSimpleName()
                    + " method which takes a parameter of type " + listenerType.getName() + ".");
        } catch (final IllegalAccessException e) {
            __CLR4_1_28n78n7l3lqxsdp.R.inc(11207);throw new IllegalArgumentException("Class " + eventSource.getClass().getName()
                    + " does not have an accessible add" + listenerType.getSimpleName ()
                    + " method which takes a parameter of type " + listenerType.getName() + ".");
        } catch (final InvocationTargetException e) {
            __CLR4_1_28n78n7l3lqxsdp.R.inc(11208);throw new RuntimeException("Unable to add listener.", e.getCause());
        }
    }finally{__CLR4_1_28n78n7l3lqxsdp.R.flushNeeded();}}

    /**
     * Binds an event listener to a specific method on a specific object.
     *
     * @param <L>          the event listener type
     * @param target       the target object
     * @param methodName   the name of the method to be called
     * @param eventSource  the object which is generating events (JButton, JList, etc.)
     * @param listenerType the listener interface (ActionListener.class, SelectionListener.class, etc.)
     * @param eventTypes   the event types (method names) from the listener interface (if none specified, all will be
     *                     supported)
     */
    public static <L> void bindEventsToMethod(final Object target, final String methodName, final Object eventSource,
            final Class<L> listenerType, final String... eventTypes) {try{__CLR4_1_28n78n7l3lqxsdp.R.inc(11209);
        __CLR4_1_28n78n7l3lqxsdp.R.inc(11210);final L listener = listenerType.cast(Proxy.newProxyInstance(target.getClass().getClassLoader(),
                new Class[] { listenerType }, new EventBindingInvocationHandler(target, methodName, eventTypes)));
        __CLR4_1_28n78n7l3lqxsdp.R.inc(11211);addEventListener(eventSource, listenerType, listener);
    }finally{__CLR4_1_28n78n7l3lqxsdp.R.flushNeeded();}}

    private static class EventBindingInvocationHandler implements InvocationHandler {
        private final Object target;
        private final String methodName;
        private final Set<String> eventTypes;

        /**
         * Creates a new instance of {@code EventBindingInvocationHandler}.
         *
         * @param target the target object for method invocations
         * @param methodName the name of the method to be invoked
         * @param eventTypes the names of the supported event types
         */
        EventBindingInvocationHandler(final Object target, final String methodName, final String[] eventTypes) {try{__CLR4_1_28n78n7l3lqxsdp.R.inc(11212);
            __CLR4_1_28n78n7l3lqxsdp.R.inc(11213);this.target = target;
            __CLR4_1_28n78n7l3lqxsdp.R.inc(11214);this.methodName = methodName;
            __CLR4_1_28n78n7l3lqxsdp.R.inc(11215);this.eventTypes = new HashSet<String>(Arrays.asList(eventTypes));
        }finally{__CLR4_1_28n78n7l3lqxsdp.R.flushNeeded();}}

        /**
         * Handles a method invocation on the proxy object.
         *
         * @param proxy the proxy instance
         * @param method the method to be invoked
         * @param parameters the parameters for the method invocation
         * @return the result of the method call
         * @throws Throwable if an error occurs
         */
        @Override
        public Object invoke(final Object proxy, final Method method, final Object[] parameters) throws Throwable {try{__CLR4_1_28n78n7l3lqxsdp.R.inc(11216);
            __CLR4_1_28n78n7l3lqxsdp.R.inc(11217);if ((((eventTypes.isEmpty() || eventTypes.contains(method.getName()))&&(__CLR4_1_28n78n7l3lqxsdp.R.iget(11218)!=0|true))||(__CLR4_1_28n78n7l3lqxsdp.R.iget(11219)==0&false))) {{
                __CLR4_1_28n78n7l3lqxsdp.R.inc(11220);if ((((hasMatchingParametersMethod(method))&&(__CLR4_1_28n78n7l3lqxsdp.R.iget(11221)!=0|true))||(__CLR4_1_28n78n7l3lqxsdp.R.iget(11222)==0&false))) {{
                    __CLR4_1_28n78n7l3lqxsdp.R.inc(11223);return MethodUtils.invokeMethod(target, methodName, parameters);
                } }else {{
                    __CLR4_1_28n78n7l3lqxsdp.R.inc(11224);return MethodUtils.invokeMethod(target, methodName);
                }
            }}
            }__CLR4_1_28n78n7l3lqxsdp.R.inc(11225);return null;
        }finally{__CLR4_1_28n78n7l3lqxsdp.R.flushNeeded();}}

        /**
         * Checks whether a method for the passed in parameters can be found.
         *
         * @param method the listener method invoked
         * @return a flag whether the parameters could be matched
         */
        private boolean hasMatchingParametersMethod(final Method method) {try{__CLR4_1_28n78n7l3lqxsdp.R.inc(11226);
            __CLR4_1_28n78n7l3lqxsdp.R.inc(11227);return MethodUtils.getAccessibleMethod(target.getClass(), methodName, method.getParameterTypes()) != null;
        }finally{__CLR4_1_28n78n7l3lqxsdp.R.flushNeeded();}}
    }
}
