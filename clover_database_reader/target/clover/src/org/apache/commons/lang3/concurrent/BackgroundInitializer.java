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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * <p>
 * A class that allows complex initialization operations in a background task.
 * </p>
 * <p>
 * Applications often have to do some expensive initialization steps when they
 * are started, e.g. constructing a connection to a database, reading a
 * configuration file, etc. Doing these things in parallel can enhance
 * performance as the CPU load can be improved. However, when access to the
 * resources initialized in a background thread is actually required,
 * synchronization has to be performed to ensure that their initialization is
 * complete.
 * </p>
 * <p>
 * This abstract base class provides support for this use case. A concrete
 * subclass must implement the {@link #initialize()} method. Here an arbitrary
 * initialization can be implemented, and a result object can be returned. With
 * this method in place the basic usage of this class is as follows (where
 * {@code MyBackgroundInitializer} is a concrete subclass):
 *
 * <pre>
 * MyBackgroundInitializer initializer = new MyBackgroundInitializer();
 * initializer.start();
 * // Now do some other things. Initialization runs in a parallel thread
 * ...
 * // Wait for the end of initialization and access the result object
 * Object result = initializer.get();
 * </pre>
 *
 * </p>
 * <p>
 * After the construction of a {@code BackgroundInitializer} object its
 * {@link #start()} method has to be called. This starts the background
 * processing. The application can now continue to do other things. When it
 * needs access to the object produced by the {@code BackgroundInitializer} it
 * calls its {@link #get()} method. If initialization is already complete,
 * {@link #get()} returns the result object immediately. Otherwise it blocks
 * until the result object is fully constructed.
 * </p>
 * <p>
 * {@code BackgroundInitializer} is a thin wrapper around a {@code Future}
 * object and uses an {@code ExecutorService} for running the background
 * initialization task. It is possible to pass in an {@code ExecutorService} at
 * construction time or set one using {@code setExternalExecutor()} before
 * {@code start()} was called. Then this object is used to spawn the background
 * task. If no {@code ExecutorService} has been provided, {@code
 * BackgroundInitializer} creates a temporary {@code ExecutorService} and
 * destroys it when initialization is complete.
 * </p>
 * <p>
 * The methods provided by {@code BackgroundInitializer} provide for minimal
 * interaction with the wrapped {@code Future} object. It is also possible to
 * obtain the {@code Future} object directly. Then the enhanced functionality
 * offered by {@code Future} can be used, e.g. to check whether the background
 * operation is complete or to cancel the operation.
 * </p>
 *
 * @since 3.0
 * @version $Id$
 * @param <T> the type of the object managed by this initializer class
 */
public abstract class BackgroundInitializer<T> implements
        ConcurrentInitializer<T> {public static class __CLR4_1_289l89ll3lqxsbw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,10771,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** The external executor service for executing tasks. */
    private ExecutorService externalExecutor; // @GuardedBy("this")

    /** A reference to the executor service that is actually used. */
    private ExecutorService executor; // @GuardedBy("this")

    /** Stores the handle to the background task. */
    private Future<T> future;  // @GuardedBy("this")

    /**
     * Creates a new instance of {@code BackgroundInitializer}. No external
     * {@code ExecutorService} is used.
     */
    protected BackgroundInitializer() {
        this(null);__CLR4_1_289l89ll3lqxsbw.R.inc(10714);try{__CLR4_1_289l89ll3lqxsbw.R.inc(10713);
    }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}

    /**
     * Creates a new instance of {@code BackgroundInitializer} and initializes
     * it with the given {@code ExecutorService}. If the {@code ExecutorService}
     * is not null, the background task for initializing this object will be
     * scheduled at this service. Otherwise a new temporary {@code
     * ExecutorService} is created.
     *
     * @param exec an external {@code ExecutorService} to be used for task
     * execution
     */
    protected BackgroundInitializer(final ExecutorService exec) {try{__CLR4_1_289l89ll3lqxsbw.R.inc(10715);
        __CLR4_1_289l89ll3lqxsbw.R.inc(10716);setExternalExecutor(exec);
    }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}

    /**
     * Returns the external {@code ExecutorService} to be used by this class.
     *
     * @return the {@code ExecutorService}
     */
    public final synchronized ExecutorService getExternalExecutor() {try{__CLR4_1_289l89ll3lqxsbw.R.inc(10717);
        __CLR4_1_289l89ll3lqxsbw.R.inc(10718);return externalExecutor;
    }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}

    /**
     * Returns a flag whether this {@code BackgroundInitializer} has already
     * been started.
     *
     * @return a flag whether the {@link #start()} method has already been
     * called
     */
    public synchronized boolean isStarted() {try{__CLR4_1_289l89ll3lqxsbw.R.inc(10719);
        __CLR4_1_289l89ll3lqxsbw.R.inc(10720);return future != null;
    }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}

    /**
     * Sets an {@code ExecutorService} to be used by this class. The {@code
     * ExecutorService} passed to this method is used for executing the
     * background task. Thus it is possible to re-use an already existing
     * {@code ExecutorService} or to use a specially configured one. If no
     * {@code ExecutorService} is set, this instance creates a temporary one and
     * destroys it after background initialization is complete. Note that this
     * method must be called before {@link #start()}; otherwise an exception is
     * thrown.
     *
     * @param externalExecutor the {@code ExecutorService} to be used
     * @throws IllegalStateException if this initializer has already been
     * started
     */
    public final synchronized void setExternalExecutor(
            final ExecutorService externalExecutor) {try{__CLR4_1_289l89ll3lqxsbw.R.inc(10721);
        __CLR4_1_289l89ll3lqxsbw.R.inc(10722);if ((((isStarted())&&(__CLR4_1_289l89ll3lqxsbw.R.iget(10723)!=0|true))||(__CLR4_1_289l89ll3lqxsbw.R.iget(10724)==0&false))) {{
            __CLR4_1_289l89ll3lqxsbw.R.inc(10725);throw new IllegalStateException(
                    "Cannot set ExecutorService after start()!");
        }

        }__CLR4_1_289l89ll3lqxsbw.R.inc(10726);this.externalExecutor = externalExecutor;
    }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}

    /**
     * Starts the background initialization. With this method the initializer
     * becomes active and invokes the {@link #initialize()} method in a
     * background task. A {@code BackgroundInitializer} can be started exactly
     * once. The return value of this method determines whether the start was
     * successful: only the first invocation of this method returns <b>true</b>,
     * following invocations will return <b>false</b>.
     *
     * @return a flag whether the initializer could be started successfully
     */
    public synchronized boolean start() {try{__CLR4_1_289l89ll3lqxsbw.R.inc(10727);
        // Not yet started?
        __CLR4_1_289l89ll3lqxsbw.R.inc(10728);if ((((!isStarted())&&(__CLR4_1_289l89ll3lqxsbw.R.iget(10729)!=0|true))||(__CLR4_1_289l89ll3lqxsbw.R.iget(10730)==0&false))) {{

            // Determine the executor to use and whether a temporary one has to
            // be created
            __CLR4_1_289l89ll3lqxsbw.R.inc(10731);ExecutorService tempExec;
            __CLR4_1_289l89ll3lqxsbw.R.inc(10732);executor = getExternalExecutor();
            __CLR4_1_289l89ll3lqxsbw.R.inc(10733);if ((((executor == null)&&(__CLR4_1_289l89ll3lqxsbw.R.iget(10734)!=0|true))||(__CLR4_1_289l89ll3lqxsbw.R.iget(10735)==0&false))) {{
                __CLR4_1_289l89ll3lqxsbw.R.inc(10736);executor = tempExec = createExecutor();
            } }else {{
                __CLR4_1_289l89ll3lqxsbw.R.inc(10737);tempExec = null;
            }

            }__CLR4_1_289l89ll3lqxsbw.R.inc(10738);future = executor.submit(createTask(tempExec));

            __CLR4_1_289l89ll3lqxsbw.R.inc(10739);return true;
        }

        }__CLR4_1_289l89ll3lqxsbw.R.inc(10740);return false;
    }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}

    /**
     * Returns the result of the background initialization. This method blocks
     * until initialization is complete. If the background processing caused a
     * runtime exception, it is directly thrown by this method. Checked
     * exceptions, including {@code InterruptedException} are wrapped in a
     * {@link ConcurrentException}. Calling this method before {@link #start()}
     * was called causes an {@code IllegalStateException} exception to be
     * thrown.
     *
     * @return the object produced by this initializer
     * @throws ConcurrentException if a checked exception occurred during
     * background processing
     * @throws IllegalStateException if {@link #start()} has not been called
     */
    @Override
    public T get() throws ConcurrentException {try{__CLR4_1_289l89ll3lqxsbw.R.inc(10741);
        __CLR4_1_289l89ll3lqxsbw.R.inc(10742);try {
            __CLR4_1_289l89ll3lqxsbw.R.inc(10743);return getFuture().get();
        } catch (final ExecutionException execex) {
            __CLR4_1_289l89ll3lqxsbw.R.inc(10744);ConcurrentUtils.handleCause(execex);
            __CLR4_1_289l89ll3lqxsbw.R.inc(10745);return null; // should not be reached
        } catch (final InterruptedException iex) {
            // reset interrupted state
            __CLR4_1_289l89ll3lqxsbw.R.inc(10746);Thread.currentThread().interrupt();
            __CLR4_1_289l89ll3lqxsbw.R.inc(10747);throw new ConcurrentException(iex);
        }
    }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}

    /**
     * Returns the {@code Future} object that was created when {@link #start()}
     * was called. Therefore this method can only be called after {@code
     * start()}.
     *
     * @return the {@code Future} object wrapped by this initializer
     * @throws IllegalStateException if {@link #start()} has not been called
     */
    public synchronized Future<T> getFuture() {try{__CLR4_1_289l89ll3lqxsbw.R.inc(10748);
        __CLR4_1_289l89ll3lqxsbw.R.inc(10749);if ((((future == null)&&(__CLR4_1_289l89ll3lqxsbw.R.iget(10750)!=0|true))||(__CLR4_1_289l89ll3lqxsbw.R.iget(10751)==0&false))) {{
            __CLR4_1_289l89ll3lqxsbw.R.inc(10752);throw new IllegalStateException("start() must be called first!");
        }

        }__CLR4_1_289l89ll3lqxsbw.R.inc(10753);return future;
    }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}

    /**
     * Returns the {@code ExecutorService} that is actually used for executing
     * the background task. This method can be called after {@link #start()}
     * (before {@code start()} it returns <b>null</b>). If an external executor
     * was set, this is also the active executor. Otherwise this method returns
     * the temporary executor that was created by this object.
     *
     * @return the {@code ExecutorService} for executing the background task
     */
    protected synchronized final ExecutorService getActiveExecutor() {try{__CLR4_1_289l89ll3lqxsbw.R.inc(10754);
        __CLR4_1_289l89ll3lqxsbw.R.inc(10755);return executor;
    }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}

    /**
     * Returns the number of background tasks to be created for this
     * initializer. This information is evaluated when a temporary {@code
     * ExecutorService} is created. This base implementation returns 1. Derived
     * classes that do more complex background processing can override it. This
     * method is called from a synchronized block by the {@link #start()}
     * method. Therefore overriding methods should be careful with obtaining
     * other locks and return as fast as possible.
     *
     * @return the number of background tasks required by this initializer
     */
    protected int getTaskCount() {try{__CLR4_1_289l89ll3lqxsbw.R.inc(10756);
        __CLR4_1_289l89ll3lqxsbw.R.inc(10757);return 1;
    }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}

    /**
     * Performs the initialization. This method is called in a background task
     * when this {@code BackgroundInitializer} is started. It must be
     * implemented by a concrete subclass. An implementation is free to perform
     * arbitrary initialization. The object returned by this method can be
     * queried using the {@link #get()} method.
     *
     * @return a result object
     * @throws Exception if an error occurs
     */
    protected abstract T initialize() throws Exception;

    /**
     * Creates a task for the background initialization. The {@code Callable}
     * object returned by this method is passed to the {@code ExecutorService}.
     * This implementation returns a task that invokes the {@link #initialize()}
     * method. If a temporary {@code ExecutorService} is used, it is destroyed
     * at the end of the task.
     *
     * @param execDestroy the {@code ExecutorService} to be destroyed by the
     * task
     * @return a task for the background initialization
     */
    private Callable<T> createTask(final ExecutorService execDestroy) {try{__CLR4_1_289l89ll3lqxsbw.R.inc(10758);
        __CLR4_1_289l89ll3lqxsbw.R.inc(10759);return new InitializationTask(execDestroy);
    }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}

    /**
     * Creates the {@code ExecutorService} to be used. This method is called if
     * no {@code ExecutorService} was provided at construction time.
     *
     * @return the {@code ExecutorService} to be used
     */
    private ExecutorService createExecutor() {try{__CLR4_1_289l89ll3lqxsbw.R.inc(10760);
        __CLR4_1_289l89ll3lqxsbw.R.inc(10761);return Executors.newFixedThreadPool(getTaskCount());
    }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}

    private class InitializationTask implements Callable<T> {
        /** Stores the executor service to be destroyed at the end. */
        private final ExecutorService execFinally;

        /**
         * Creates a new instance of {@code InitializationTask} and initializes
         * it with the {@code ExecutorService} to be destroyed at the end.
         *
         * @param exec the {@code ExecutorService}
         */
        public InitializationTask(final ExecutorService exec) {try{__CLR4_1_289l89ll3lqxsbw.R.inc(10762);
            __CLR4_1_289l89ll3lqxsbw.R.inc(10763);execFinally = exec;
        }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}

        /**
         * Initiates initialization and returns the result.
         *
         * @return the result object
         * @throws Exception if an error occurs
         */
        @Override
        public T call() throws Exception {try{__CLR4_1_289l89ll3lqxsbw.R.inc(10764);
            __CLR4_1_289l89ll3lqxsbw.R.inc(10765);try {
                __CLR4_1_289l89ll3lqxsbw.R.inc(10766);return initialize();
            } finally {
                __CLR4_1_289l89ll3lqxsbw.R.inc(10767);if ((((execFinally != null)&&(__CLR4_1_289l89ll3lqxsbw.R.iget(10768)!=0|true))||(__CLR4_1_289l89ll3lqxsbw.R.iget(10769)==0&false))) {{
                    __CLR4_1_289l89ll3lqxsbw.R.inc(10770);execFinally.shutdown();
                }
            }}
        }finally{__CLR4_1_289l89ll3lqxsbw.R.flushNeeded();}}
    }
}
