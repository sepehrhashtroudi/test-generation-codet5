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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/**
 * <p>
 * A specialized {@link BackgroundInitializer} implementation that can deal with
 * multiple background initialization tasks.
 * </p>
 * <p>
 * This class has a similar purpose as {@link BackgroundInitializer}. However,
 * it is not limited to a single background initialization task. Rather it
 * manages an arbitrary number of {@code BackgroundInitializer} objects,
 * executes them, and waits until they are completely initialized. This is
 * useful for applications that have to perform multiple initialization tasks
 * that can run in parallel (i.e. that do not depend on each other). This class
 * takes care about the management of an {@code ExecutorService} and shares it
 * with the {@code BackgroundInitializer} objects it is responsible for; so the
 * using application need not bother with these details.
 * </p>
 * <p>
 * The typical usage scenario for {@code MultiBackgroundInitializer} is as
 * follows:
 * <ul>
 * <li>Create a new instance of the class. Optionally pass in a pre-configured
 * {@code ExecutorService}. Alternatively {@code MultiBackgroundInitializer} can
 * create a temporary {@code ExecutorService} and delete it after initialization
 * is complete.</li>
 * <li>Create specialized {@link BackgroundInitializer} objects for the
 * initialization tasks to be performed and add them to the {@code
 * MultiBackgroundInitializer} using the
 * {@link #addInitializer(String, BackgroundInitializer)} method.</li>
 * <li>After all initializers have been added, call the {@link #start()} method.
 * </li>
 * <li>When access to the result objects produced by the {@code
 * BackgroundInitializer} objects is needed call the {@link #get()} method. The
 * object returned here provides access to all result objects created during
 * initialization. It also stores information about exceptions that have
 * occurred.</li>
 * </ul>
 * </p>
 * <p>
 * {@code MultiBackgroundInitializer} starts a special controller task that
 * starts all {@code BackgroundInitializer} objects added to the instance.
 * Before the an initializer is started it is checked whether this initializer
 * already has an {@code ExecutorService} set. If this is the case, this {@code
 * ExecutorService} is used for running the background task. Otherwise the
 * current {@code ExecutorService} of this {@code MultiBackgroundInitializer} is
 * shared with the initializer.
 * </p>
 * <p>
 * The easiest way of using this class is to let it deal with the management of
 * an {@code ExecutorService} itself: If no external {@code ExecutorService} is
 * provided, the class creates a temporary {@code ExecutorService} (that is
 * capable of executing all background tasks in parallel) and destroys it at the
 * end of background processing.
 * </p>
 * <p>
 * Alternatively an external {@code ExecutorService} can be provided - either at
 * construction time or later by calling the
 * {@link #setExternalExecutor(ExecutorService)} method. In this case all
 * background tasks are scheduled at this external {@code ExecutorService}.
 * <strong>Important note:</strong> When using an external {@code
 * ExecutorService} be sure that the number of threads managed by the service is
 * large enough. Otherwise a deadlock can happen! This is the case in the
 * following scenario: {@code MultiBackgroundInitializer} starts a task that
 * starts all registered {@code BackgroundInitializer} objects and waits for
 * their completion. If for instance a single threaded {@code ExecutorService}
 * is used, none of the background tasks can be executed, and the task created
 * by {@code MultiBackgroundInitializer} waits forever.
 * </p>
 *
 * @since 3.0
 * @version $Id$
 */
public class MultiBackgroundInitializer
        extends
        BackgroundInitializer<MultiBackgroundInitializer.MultiBackgroundInitializerResults> {public static class __CLR4_1_28hm8hml3lqxsd1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,11070,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** A map with the child initializers. */
    private final Map<String, BackgroundInitializer<?>> childInitializers =
        new HashMap<String, BackgroundInitializer<?>>();

    /**
     * Creates a new instance of {@code MultiBackgroundInitializer}.
     */
    public MultiBackgroundInitializer() {
        super();__CLR4_1_28hm8hml3lqxsd1.R.inc(11003);try{__CLR4_1_28hm8hml3lqxsd1.R.inc(11002);
    }finally{__CLR4_1_28hm8hml3lqxsd1.R.flushNeeded();}}

    /**
     * Creates a new instance of {@code MultiBackgroundInitializer} and
     * initializes it with the given external {@code ExecutorService}.
     *
     * @param exec the {@code ExecutorService} for executing the background
     * tasks
     */
    public MultiBackgroundInitializer(final ExecutorService exec) {
        super(exec);__CLR4_1_28hm8hml3lqxsd1.R.inc(11005);try{__CLR4_1_28hm8hml3lqxsd1.R.inc(11004);
    }finally{__CLR4_1_28hm8hml3lqxsd1.R.flushNeeded();}}

    /**
     * Adds a new {@code BackgroundInitializer} to this object. When this
     * {@code MultiBackgroundInitializer} is started, the given initializer will
     * be processed. This method must not be called after {@link #start()} has
     * been invoked.
     *
     * @param name the name of the initializer (must not be <b>null</b>)
     * @param init the {@code BackgroundInitializer} to add (must not be
     * <b>null</b>)
     * @throws IllegalArgumentException if a required parameter is missing
     * @throws IllegalStateException if {@code start()} has already been called
     */
    public void addInitializer(final String name, final BackgroundInitializer<?> init) {try{__CLR4_1_28hm8hml3lqxsd1.R.inc(11006);
        __CLR4_1_28hm8hml3lqxsd1.R.inc(11007);if ((((name == null)&&(__CLR4_1_28hm8hml3lqxsd1.R.iget(11008)!=0|true))||(__CLR4_1_28hm8hml3lqxsd1.R.iget(11009)==0&false))) {{
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11010);throw new IllegalArgumentException(
                    "Name of child initializer must not be null!");
        }
        }__CLR4_1_28hm8hml3lqxsd1.R.inc(11011);if ((((init == null)&&(__CLR4_1_28hm8hml3lqxsd1.R.iget(11012)!=0|true))||(__CLR4_1_28hm8hml3lqxsd1.R.iget(11013)==0&false))) {{
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11014);throw new IllegalArgumentException(
                    "Child initializer must not be null!");
        }

        }__CLR4_1_28hm8hml3lqxsd1.R.inc(11015);synchronized (this) {
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11016);if ((((isStarted())&&(__CLR4_1_28hm8hml3lqxsd1.R.iget(11017)!=0|true))||(__CLR4_1_28hm8hml3lqxsd1.R.iget(11018)==0&false))) {{
                __CLR4_1_28hm8hml3lqxsd1.R.inc(11019);throw new IllegalStateException(
                        "addInitializer() must not be called after start()!");
            }
            }__CLR4_1_28hm8hml3lqxsd1.R.inc(11020);childInitializers.put(name, init);
        }
    }finally{__CLR4_1_28hm8hml3lqxsd1.R.flushNeeded();}}

    /**
     * Returns the number of tasks needed for executing all child {@code
     * BackgroundInitializer} objects in parallel. This implementation sums up
     * the required tasks for all child initializers (which is necessary if one
     * of the child initializers is itself a {@code MultiBackgroundInitializer}
     * ). Then it adds 1 for the control task that waits for the completion of
     * the children.
     *
     * @return the number of tasks required for background processing
     */
    @Override
    protected int getTaskCount() {try{__CLR4_1_28hm8hml3lqxsd1.R.inc(11021);
        __CLR4_1_28hm8hml3lqxsd1.R.inc(11022);int result = 1;

        __CLR4_1_28hm8hml3lqxsd1.R.inc(11023);for (final BackgroundInitializer<?> bi : childInitializers.values()) {{
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11024);result += bi.getTaskCount();
        }

        }__CLR4_1_28hm8hml3lqxsd1.R.inc(11025);return result;
    }finally{__CLR4_1_28hm8hml3lqxsd1.R.flushNeeded();}}

    /**
     * Creates the results object. This implementation starts all child {@code
     * BackgroundInitializer} objects. Then it collects their results and
     * creates a {@code MultiBackgroundInitializerResults} object with this
     * data. If a child initializer throws a checked exceptions, it is added to
     * the results object. Unchecked exceptions are propagated.
     *
     * @return the results object
     * @throws Exception if an error occurs
     */
    @Override
    protected MultiBackgroundInitializerResults initialize() throws Exception {try{__CLR4_1_28hm8hml3lqxsd1.R.inc(11026);
        __CLR4_1_28hm8hml3lqxsd1.R.inc(11027);Map<String, BackgroundInitializer<?>> inits;
        __CLR4_1_28hm8hml3lqxsd1.R.inc(11028);synchronized (this) {
            // create a snapshot to operate on
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11029);inits = new HashMap<String, BackgroundInitializer<?>>(
                    childInitializers);
        }

        // start the child initializers
        __CLR4_1_28hm8hml3lqxsd1.R.inc(11030);final ExecutorService exec = getActiveExecutor();
        __CLR4_1_28hm8hml3lqxsd1.R.inc(11031);for (final BackgroundInitializer<?> bi : inits.values()) {{
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11032);if ((((bi.getExternalExecutor() == null)&&(__CLR4_1_28hm8hml3lqxsd1.R.iget(11033)!=0|true))||(__CLR4_1_28hm8hml3lqxsd1.R.iget(11034)==0&false))) {{
                // share the executor service if necessary
                __CLR4_1_28hm8hml3lqxsd1.R.inc(11035);bi.setExternalExecutor(exec);
            }
            }__CLR4_1_28hm8hml3lqxsd1.R.inc(11036);bi.start();
        }

        // collect the results
        }__CLR4_1_28hm8hml3lqxsd1.R.inc(11037);final Map<String, Object> results = new HashMap<String, Object>();
        __CLR4_1_28hm8hml3lqxsd1.R.inc(11038);final Map<String, ConcurrentException> excepts = new HashMap<String, ConcurrentException>();
        __CLR4_1_28hm8hml3lqxsd1.R.inc(11039);for (final Map.Entry<String, BackgroundInitializer<?>> e : inits.entrySet()) {{
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11040);try {
                __CLR4_1_28hm8hml3lqxsd1.R.inc(11041);results.put(e.getKey(), e.getValue().get());
            } catch (final ConcurrentException cex) {
                __CLR4_1_28hm8hml3lqxsd1.R.inc(11042);excepts.put(e.getKey(), cex);
            }
        }

        }__CLR4_1_28hm8hml3lqxsd1.R.inc(11043);return new MultiBackgroundInitializerResults(inits, results, excepts);
    }finally{__CLR4_1_28hm8hml3lqxsd1.R.flushNeeded();}}

    /**
     * A data class for storing the results of the background initialization
     * performed by {@code MultiBackgroundInitializer}. Objects of this inner
     * class are returned by {@link MultiBackgroundInitializer#initialize()}.
     * They allow access to all result objects produced by the
     * {@link BackgroundInitializer} objects managed by the owning instance. It
     * is also possible to retrieve status information about single
     * {@link BackgroundInitializer}s, i.e. whether they completed normally or
     * caused an exception.
     */
    public static class MultiBackgroundInitializerResults {
        /** A map with the child initializers. */
        private final Map<String, BackgroundInitializer<?>> initializers;

        /** A map with the result objects. */
        private final Map<String, Object> resultObjects;

        /** A map with the exceptions. */
        private final Map<String, ConcurrentException> exceptions;

        /**
         * Creates a new instance of {@code MultiBackgroundInitializerResults}
         * and initializes it with maps for the {@code BackgroundInitializer}
         * objects, their result objects and the exceptions thrown by them.
         *
         * @param inits the {@code BackgroundInitializer} objects
         * @param results the result objects
         * @param excepts the exceptions
         */
        private MultiBackgroundInitializerResults(
                final Map<String, BackgroundInitializer<?>> inits,
                final Map<String, Object> results,
                final Map<String, ConcurrentException> excepts) {try{__CLR4_1_28hm8hml3lqxsd1.R.inc(11044);
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11045);initializers = inits;
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11046);resultObjects = results;
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11047);exceptions = excepts;
        }finally{__CLR4_1_28hm8hml3lqxsd1.R.flushNeeded();}}

        /**
         * Returns the {@code BackgroundInitializer} with the given name. If the
         * name cannot be resolved, an exception is thrown.
         *
         * @param name the name of the {@code BackgroundInitializer}
         * @return the {@code BackgroundInitializer} with this name
         * @throws NoSuchElementException if the name cannot be resolved
         */
        public BackgroundInitializer<?> getInitializer(final String name) {try{__CLR4_1_28hm8hml3lqxsd1.R.inc(11048);
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11049);return checkName(name);
        }finally{__CLR4_1_28hm8hml3lqxsd1.R.flushNeeded();}}

        /**
         * Returns the result object produced by the {@code
         * BackgroundInitializer} with the given name. This is the object
         * returned by the initializer's {@code initialize()} method. If this
         * {@code BackgroundInitializer} caused an exception, <b>null</b> is
         * returned. If the name cannot be resolved, an exception is thrown.
         *
         * @param name the name of the {@code BackgroundInitializer}
         * @return the result object produced by this {@code
         * BackgroundInitializer}
         * @throws NoSuchElementException if the name cannot be resolved
         */
        public Object getResultObject(final String name) {try{__CLR4_1_28hm8hml3lqxsd1.R.inc(11050);
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11051);checkName(name);
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11052);return resultObjects.get(name);
        }finally{__CLR4_1_28hm8hml3lqxsd1.R.flushNeeded();}}

        /**
         * Returns a flag whether the {@code BackgroundInitializer} with the
         * given name caused an exception.
         *
         * @param name the name of the {@code BackgroundInitializer}
         * @return a flag whether this initializer caused an exception
         * @throws NoSuchElementException if the name cannot be resolved
         */
        public boolean isException(final String name) {try{__CLR4_1_28hm8hml3lqxsd1.R.inc(11053);
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11054);checkName(name);
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11055);return exceptions.containsKey(name);
        }finally{__CLR4_1_28hm8hml3lqxsd1.R.flushNeeded();}}

        /**
         * Returns the {@code ConcurrentException} object that was thrown by the
         * {@code BackgroundInitializer} with the given name. If this
         * initializer did not throw an exception, the return value is
         * <b>null</b>. If the name cannot be resolved, an exception is thrown.
         *
         * @param name the name of the {@code BackgroundInitializer}
         * @return the exception thrown by this initializer
         * @throws NoSuchElementException if the name cannot be resolved
         */
        public ConcurrentException getException(final String name) {try{__CLR4_1_28hm8hml3lqxsd1.R.inc(11056);
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11057);checkName(name);
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11058);return exceptions.get(name);
        }finally{__CLR4_1_28hm8hml3lqxsd1.R.flushNeeded();}}

        /**
         * Returns a set with the names of all {@code BackgroundInitializer}
         * objects managed by the {@code MultiBackgroundInitializer}.
         *
         * @return an (unmodifiable) set with the names of the managed {@code
         * BackgroundInitializer} objects
         */
        public Set<String> initializerNames() {try{__CLR4_1_28hm8hml3lqxsd1.R.inc(11059);
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11060);return Collections.unmodifiableSet(initializers.keySet());
        }finally{__CLR4_1_28hm8hml3lqxsd1.R.flushNeeded();}}

        /**
         * Returns a flag whether the whole initialization was successful. This
         * is the case if no child initializer has thrown an exception.
         *
         * @return a flag whether the initialization was successful
         */
        public boolean isSuccessful() {try{__CLR4_1_28hm8hml3lqxsd1.R.inc(11061);
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11062);return exceptions.isEmpty();
        }finally{__CLR4_1_28hm8hml3lqxsd1.R.flushNeeded();}}

        /**
         * Checks whether an initializer with the given name exists. If not,
         * throws an exception. If it exists, the associated child initializer
         * is returned.
         *
         * @param name the name to check
         * @return the initializer with this name
         * @throws NoSuchElementException if the name is unknown
         */
        private BackgroundInitializer<?> checkName(final String name) {try{__CLR4_1_28hm8hml3lqxsd1.R.inc(11063);
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11064);final BackgroundInitializer<?> init = initializers.get(name);
            __CLR4_1_28hm8hml3lqxsd1.R.inc(11065);if ((((init == null)&&(__CLR4_1_28hm8hml3lqxsd1.R.iget(11066)!=0|true))||(__CLR4_1_28hm8hml3lqxsd1.R.iget(11067)==0&false))) {{
                __CLR4_1_28hm8hml3lqxsd1.R.inc(11068);throw new NoSuchElementException(
                        "No child initializer with name " + name);
            }

            }__CLR4_1_28hm8hml3lqxsd1.R.inc(11069);return init;
        }finally{__CLR4_1_28hm8hml3lqxsd1.R.flushNeeded();}}
    }
}
