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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/**
 * <p>
 * A specialized {@link BackgroundInitializer} implementation that wraps a
 * {@code Callable} object.
 * </p>
 * <p>
 * An instance of this class is initialized with a {@code Callable} object when
 * it is constructed. The implementation of the {@link #initialize()} method
 * defined in the super class delegates to this {@code Callable} so that the
 * {@code Callable} is executed in the background thread.
 * </p>
 * <p>
 * The {@code java.util.concurrent.Callable} interface is a standard mechanism
 * of the JDK to define tasks to be executed by another thread. The {@code
 * CallableBackgroundInitializer} class allows combining this standard interface
 * with the background initializer API.
 * </p>
 * <p>
 * Usage of this class is very similar to the default usage pattern of the
 * {@link BackgroundInitializer} class: Just create an instance and provide the
 * {@code Callable} object to be executed, then call the initializer's
 * {@link #start()} method. This causes the {@code Callable} to be executed in
 * another thread. When the results of the {@code Callable} are needed the
 * initializer's {@link #get()} method can be called (which may block until
 * background execution is complete). The following code fragment shows a
 * typical usage example:
 *
 * <pre>
 * // a Callable that performs a complex computation
 * Callable&lt;Integer&gt; computationCallable = new MyComputationCallable();
 * // setup the background initializer
 * CallableBackgroundInitializer&lt;Integer&gt; initializer =
 *     new CallableBackgroundInitializer(computationCallable);
 * initializer.start();
 * // Now do some other things. Initialization runs in a parallel thread
 * ...
 * // Wait for the end of initialization and access the result
 * Integer result = initializer.get();
 * </pre>
 *
 * </p>
 *
 * @since 3.0
 * @version $Id$
 * @param <T> the type of the object managed by this initializer class
 */
public class CallableBackgroundInitializer<T> extends BackgroundInitializer<T> {public static class __CLR4_1_28dh8dhl3lqxsc8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,10867,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The Callable to be executed. */
    private final Callable<T> callable;

    /**
     * Creates a new instance of {@code CallableBackgroundInitializer} and sets
     * the {@code Callable} to be executed in a background thread.
     *
     * @param call the {@code Callable} (must not be <b>null</b>)
     * @throws IllegalArgumentException if the {@code Callable} is <b>null</b>
     */
    public CallableBackgroundInitializer(final Callable<T> call) {try{__CLR4_1_28dh8dhl3lqxsc8.R.inc(10853);
        __CLR4_1_28dh8dhl3lqxsc8.R.inc(10854);checkCallable(call);
        __CLR4_1_28dh8dhl3lqxsc8.R.inc(10855);callable = call;
    }finally{__CLR4_1_28dh8dhl3lqxsc8.R.flushNeeded();}}

    /**
     * Creates a new instance of {@code CallableBackgroundInitializer} and
     * initializes it with the {@code Callable} to be executed in a background
     * thread and the {@code ExecutorService} for managing the background
     * execution.
     *
     * @param call the {@code Callable} (must not be <b>null</b>)
     * @param exec an external {@code ExecutorService} to be used for task
     * execution
     * @throws IllegalArgumentException if the {@code Callable} is <b>null</b>
     */
    public CallableBackgroundInitializer(final Callable<T> call, final ExecutorService exec) {
        super(exec);__CLR4_1_28dh8dhl3lqxsc8.R.inc(10857);try{__CLR4_1_28dh8dhl3lqxsc8.R.inc(10856);
        __CLR4_1_28dh8dhl3lqxsc8.R.inc(10858);checkCallable(call);
        __CLR4_1_28dh8dhl3lqxsc8.R.inc(10859);callable = call;
    }finally{__CLR4_1_28dh8dhl3lqxsc8.R.flushNeeded();}}

    /**
     * Performs initialization in a background thread. This implementation
     * delegates to the {@code Callable} passed at construction time of this
     * object.
     *
     * @return the result of the initialization
     * @throws Exception if an error occurs
     */
    @Override
    protected T initialize() throws Exception {try{__CLR4_1_28dh8dhl3lqxsc8.R.inc(10860);
        __CLR4_1_28dh8dhl3lqxsc8.R.inc(10861);return callable.call();
    }finally{__CLR4_1_28dh8dhl3lqxsc8.R.flushNeeded();}}

    /**
     * Tests the passed in {@code Callable} and throws an exception if it is
     * undefined.
     *
     * @param call the object to check
     * @throws IllegalArgumentException if the {@code Callable} is <b>null</b>
     */
    private void checkCallable(final Callable<T> call) {try{__CLR4_1_28dh8dhl3lqxsc8.R.inc(10862);
        __CLR4_1_28dh8dhl3lqxsc8.R.inc(10863);if ((((call == null)&&(__CLR4_1_28dh8dhl3lqxsc8.R.iget(10864)!=0|true))||(__CLR4_1_28dh8dhl3lqxsc8.R.iget(10865)==0&false))) {{
            __CLR4_1_28dh8dhl3lqxsc8.R.inc(10866);throw new IllegalArgumentException("Callable must not be null!");
        }
    }}finally{__CLR4_1_28dh8dhl3lqxsc8.R.flushNeeded();}}
}
