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
package org.apache.commons.lang3.concurrent;

import java.util.concurrent.atomic.AtomicReference;

/**
 * <p>
 * A specialized {@code ConcurrentInitializer} implementation which is similar
 * to {@link AtomicInitializer}, but ensures that the {@link #initialize()}
 * method is called only once.
 * </p>
 * <p>
 * As {@link AtomicInitializer} this class is based on atomic variables, so it
 * can create an object under concurrent access without synchronization.
 * However, it implements an additional check to guarantee that the
 * {@link #initialize()} method which actually creates the object cannot be
 * called multiple times.
 * </p>
 * <p>
 * Because of this additional check this implementation is slightly less
 * efficient than {@link AtomicInitializer}, but if the object creation in the
 * {@code initialize()} method is expensive or if multiple invocations of
 * {@code initialize()} are problematic, it is the better alternative.
 * </p>
 * <p>
 * From its semantics this class has the same properties as
 * {@link LazyInitializer}. It is a &quot;save&quot; implementation of the lazy
 * initializer pattern. Comparing both classes in terms of efficiency is
 * difficult because which one is faster depends on multiple factors. Because
 * {@code AtomicSafeInitializer} does not use synchronization at all it probably
 * outruns {@link LazyInitializer}, at least under low or moderate concurrent
 * access. Developers should run their own benchmarks on the expected target
 * platform to decide which implementation is suitable for their specific use
 * case.
 * </p>
 *
 * @since 3.0
 * @version $Id$
 * @param <T> the type of the object managed by this initializer class
 */
public abstract class AtomicSafeInitializer<T> implements
        ConcurrentInitializer<T> {public static class __CLR4_1_289b89bl3lqxsbp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,10713,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** A guard which ensures that initialize() is called only once. */
    private final AtomicReference<AtomicSafeInitializer<T>> factory =
            new AtomicReference<AtomicSafeInitializer<T>>();

    /** Holds the reference to the managed object. */
    private final AtomicReference<T> reference = new AtomicReference<T>();

    /**
     * Get (and initialize, if not initialized yet) the required object
     *
     * @return lazily initialized object
     * @throws ConcurrentException if the initialization of the object causes an
     * exception
     */
    @Override
    public final T get() throws ConcurrentException {try{__CLR4_1_289b89bl3lqxsbp.R.inc(10703);
        __CLR4_1_289b89bl3lqxsbp.R.inc(10704);T result;

        __CLR4_1_289b89bl3lqxsbp.R.inc(10705);while ((result = reference.get()) == null) {{
            __CLR4_1_289b89bl3lqxsbp.R.inc(10708);if ((((factory.compareAndSet(null, this))&&(__CLR4_1_289b89bl3lqxsbp.R.iget(10709)!=0|true))||(__CLR4_1_289b89bl3lqxsbp.R.iget(10710)==0&false))) {{
                __CLR4_1_289b89bl3lqxsbp.R.inc(10711);reference.set(initialize());
            }
        }}

        }__CLR4_1_289b89bl3lqxsbp.R.inc(10712);return result;
    }finally{__CLR4_1_289b89bl3lqxsbp.R.flushNeeded();}}

    /**
     * Creates and initializes the object managed by this
     * {@code AtomicInitializer}. This method is called by {@link #get()} when
     * the managed object is not available yet. An implementation can focus on
     * the creation of the object. No synchronization is needed, as this is
     * already handled by {@code get()}. This method is guaranteed to be called
     * only once.
     *
     * @return the managed data object
     * @throws ConcurrentException if an error occurs during object creation
     */
    protected abstract T initialize() throws ConcurrentException;
}
