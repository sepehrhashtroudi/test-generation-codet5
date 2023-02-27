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

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/**
 * <p>
 * An implementation of the {@code ThreadFactory} interface that provides some
 * configuration options for the threads it creates.
 * </p>
 * <p>
 * A {@code ThreadFactory} is used for instance by an {@code ExecutorService} to
 * create the threads it uses for executing tasks. In many cases users do not
 * have to care about a {@code ThreadFactory} because the default one used by an
 * {@code ExecutorService} will do. However, if there are special requirements
 * for the threads, a custom {@code ThreadFactory} has to be created.
 * </p>
 * <p>
 * This class provides some frequently needed configuration options for the
 * threads it creates. These are the following:
 * <ul>
 * <li>A name pattern for the threads created by this factory can be specified.
 * This is often useful if an application uses multiple executor services for
 * different purposes. If the names of the threads used by these services have
 * meaningful names, log output or exception traces can be much easier to read.
 * Naming patterns are <em>format strings</em> as used by the {@code
 * String.format()} method. The string can contain the place holder {@code %d}
 * which will be replaced by the number of the current thread ({@code
 * ThreadFactoryImpl} keeps a counter of the threads it has already created).
 * For instance, the naming pattern {@code "My %d. worker thread"} will result
 * in thread names like {@code "My 1. worker thread"}, {@code
 * "My 2. worker thread"} and so on.</li>
 * <li>A flag whether the threads created by this factory should be daemon
 * threads. This can impact the exit behavior of the current Java application
 * because the JVM shuts down if there are only daemon threads running.</li>
 * <li>The priority of the thread. Here an integer value can be provided. The
 * {@code java.lang.Thread} class defines constants for valid ranges of priority
 * values.</li>
 * <li>The {@code UncaughtExceptionHandler} for the thread. This handler is
 * called if an uncaught exception occurs within the thread.</li>
 * </ul>
 * </p>
 * <p>
 * {@code BasicThreadFactory} wraps another thread factory which actually
 * creates new threads. The configuration options are set on the threads created
 * by the wrapped thread factory. On construction time the factory to be wrapped
 * can be specified. If none is provided, a default {@code ThreadFactory} is
 * used.
 * </p>
 * <p>
 * Instances of {@code BasicThreadFactory} are not created directly, but the
 * nested {@code Builder} class is used for this purpose. Using the builder only
 * the configuration options an application is interested in need to be set. The
 * following example shows how a {@code BasicThreadFactory} is created and
 * installed in an {@code ExecutorService}:
 *
 * <pre>
 * // Create a factory that produces daemon threads with a naming pattern and
 * // a priority
 * BasicThreadFactory factory = new BasicThreadFactory.Builder()
 *     .namingPattern(&quot;workerthread-%d&quot;)
 *     .daemon(true)
 *     .priority(Thread.MAX_PRIORITY)
 *     .build();
 * // Create an executor service for single-threaded execution
 * ExecutorService exec = Executors.newSingleThreadExecutor(factory);
 * </pre>
 * </p>
 *
 * @since 3.0
 * @version $Id$
 */
public class BasicThreadFactory implements ThreadFactory {public static class __CLR4_1_28b78b7l3lqxsc4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,10853,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** A counter for the threads created by this factory. */
    private final AtomicLong threadCounter;

    /** Stores the wrapped factory. */
    private final ThreadFactory wrappedFactory;

    /** Stores the uncaught exception handler. */
    private final Thread.UncaughtExceptionHandler uncaughtExceptionHandler;

    /** Stores the naming pattern for newly created threads. */
    private final String namingPattern;

    /** Stores the priority. */
    private final Integer priority;

    /** Stores the daemon status flag. */
    private final Boolean daemonFlag;

    /**
     * Creates a new instance of {@code ThreadFactoryImpl} and configures it
     * from the specified {@code Builder} object.
     *
     * @param builder the {@code Builder} object
     */
    private BasicThreadFactory(final Builder builder) {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10771);
        __CLR4_1_28b78b7l3lqxsc4.R.inc(10772);if ((((builder.wrappedFactory == null)&&(__CLR4_1_28b78b7l3lqxsc4.R.iget(10773)!=0|true))||(__CLR4_1_28b78b7l3lqxsc4.R.iget(10774)==0&false))) {{
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10775);wrappedFactory = Executors.defaultThreadFactory();
        } }else {{
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10776);wrappedFactory = builder.wrappedFactory;
        }

        }__CLR4_1_28b78b7l3lqxsc4.R.inc(10777);namingPattern = builder.namingPattern;
        __CLR4_1_28b78b7l3lqxsc4.R.inc(10778);priority = builder.priority;
        __CLR4_1_28b78b7l3lqxsc4.R.inc(10779);daemonFlag = builder.daemonFlag;
        __CLR4_1_28b78b7l3lqxsc4.R.inc(10780);uncaughtExceptionHandler = builder.exceptionHandler;

        __CLR4_1_28b78b7l3lqxsc4.R.inc(10781);threadCounter = new AtomicLong();
    }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

    /**
     * Returns the wrapped {@code ThreadFactory}. This factory is used for
     * actually creating threads. This method never returns <b>null</b>. If no
     * {@code ThreadFactory} was passed when this object was created, a default
     * thread factory is returned.
     *
     * @return the wrapped {@code ThreadFactory}
     */
    public final ThreadFactory getWrappedFactory() {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10782);
        __CLR4_1_28b78b7l3lqxsc4.R.inc(10783);return wrappedFactory;
    }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

    /**
     * Returns the naming pattern for naming newly created threads. Result can
     * be <b>null</b> if no naming pattern was provided.
     *
     * @return the naming pattern
     */
    public final String getNamingPattern() {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10784);
        __CLR4_1_28b78b7l3lqxsc4.R.inc(10785);return namingPattern;
    }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

    /**
     * Returns the daemon flag. This flag determines whether newly created
     * threads should be daemon threads. If <b>true</b>, this factory object
     * calls {@code setDaemon(true)} on the newly created threads. Result can be
     * <b>null</b> if no daemon flag was provided at creation time.
     *
     * @return the daemon flag
     */
    public final Boolean getDaemonFlag() {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10786);
        __CLR4_1_28b78b7l3lqxsc4.R.inc(10787);return daemonFlag;
    }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

    /**
     * Returns the priority of the threads created by this factory. Result can
     * be <b>null</b> if no priority was specified.
     *
     * @return the priority for newly created threads
     */
    public final Integer getPriority() {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10788);
        __CLR4_1_28b78b7l3lqxsc4.R.inc(10789);return priority;
    }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

    /**
     * Returns the {@code UncaughtExceptionHandler} for the threads created by
     * this factory. Result can be <b>null</b> if no handler was provided.
     *
     * @return the {@code UncaughtExceptionHandler}
     */
    public final Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10790);
        __CLR4_1_28b78b7l3lqxsc4.R.inc(10791);return uncaughtExceptionHandler;
    }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

    /**
     * Returns the number of threads this factory has already created. This
     * class maintains an internal counter that is incremented each time the
     * {@link #newThread(Runnable)} method is invoked.
     *
     * @return the number of threads created by this factory
     */
    public long getThreadCount() {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10792);
        __CLR4_1_28b78b7l3lqxsc4.R.inc(10793);return threadCounter.get();
    }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

    /**
     * Creates a new thread. This implementation delegates to the wrapped
     * factory for creating the thread. Then, on the newly created thread the
     * corresponding configuration options are set.
     *
     * @param r the {@code Runnable} to be executed by the new thread
     * @return the newly created thread
     */
    @Override
    public Thread newThread(final Runnable r) {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10794);
        __CLR4_1_28b78b7l3lqxsc4.R.inc(10795);final Thread t = getWrappedFactory().newThread(r);
        __CLR4_1_28b78b7l3lqxsc4.R.inc(10796);initializeThread(t);

        __CLR4_1_28b78b7l3lqxsc4.R.inc(10797);return t;
    }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

    /**
     * Initializes the specified thread. This method is called by
     * {@link #newThread(Runnable)} after a new thread has been obtained from
     * the wrapped thread factory. It initializes the thread according to the
     * options set for this factory.
     *
     * @param t the thread to be initialized
     */
    private void initializeThread(final Thread t) {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10798);

        __CLR4_1_28b78b7l3lqxsc4.R.inc(10799);if ((((getNamingPattern() != null)&&(__CLR4_1_28b78b7l3lqxsc4.R.iget(10800)!=0|true))||(__CLR4_1_28b78b7l3lqxsc4.R.iget(10801)==0&false))) {{
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10802);final Long count = Long.valueOf(threadCounter.incrementAndGet());
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10803);t.setName(String.format(getNamingPattern(), count));
        }

        }__CLR4_1_28b78b7l3lqxsc4.R.inc(10804);if ((((getUncaughtExceptionHandler() != null)&&(__CLR4_1_28b78b7l3lqxsc4.R.iget(10805)!=0|true))||(__CLR4_1_28b78b7l3lqxsc4.R.iget(10806)==0&false))) {{
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10807);t.setUncaughtExceptionHandler(getUncaughtExceptionHandler());
        }

        }__CLR4_1_28b78b7l3lqxsc4.R.inc(10808);if ((((getPriority() != null)&&(__CLR4_1_28b78b7l3lqxsc4.R.iget(10809)!=0|true))||(__CLR4_1_28b78b7l3lqxsc4.R.iget(10810)==0&false))) {{
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10811);t.setPriority(getPriority().intValue());
        }

        }__CLR4_1_28b78b7l3lqxsc4.R.inc(10812);if ((((getDaemonFlag() != null)&&(__CLR4_1_28b78b7l3lqxsc4.R.iget(10813)!=0|true))||(__CLR4_1_28b78b7l3lqxsc4.R.iget(10814)==0&false))) {{
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10815);t.setDaemon(getDaemonFlag().booleanValue());
        }
    }}finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

    /**
     * <p>
     * A <em>builder</em> class for creating instances of {@code
     * BasicThreadFactory}.
     * </p>
     * <p>
     * Using this builder class instances of {@code BasicThreadFactory} can be
     * created and initialized. The class provides methods that correspond to
     * the configuration options supported by {@code BasicThreadFactory}. Method
     * chaining is supported. Refer to the documentation of {@code
     * BasicThreadFactory} for a usage example.
     * </p>
     *
     * @version $Id$
     */
    public static class Builder 
        implements org.apache.commons.lang3.builder.Builder<BasicThreadFactory> {
        
        /** The wrapped factory. */
        private ThreadFactory wrappedFactory;

        /** The uncaught exception handler. */
        private Thread.UncaughtExceptionHandler exceptionHandler;

        /** The naming pattern. */
        private String namingPattern;

        /** The priority. */
        private Integer priority;

        /** The daemon flag. */
        private Boolean daemonFlag;

        /**
         * Sets the {@code ThreadFactory} to be wrapped by the new {@code
         * BasicThreadFactory}.
         *
         * @param factory the wrapped {@code ThreadFactory} (must not be
         * <b>null</b>)
         * @return a reference to this {@code Builder}
         * @throws NullPointerException if the passed in {@code ThreadFactory}
         * is <b>null</b>
         */
        public Builder wrappedFactory(final ThreadFactory factory) {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10816);
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10817);if ((((factory == null)&&(__CLR4_1_28b78b7l3lqxsc4.R.iget(10818)!=0|true))||(__CLR4_1_28b78b7l3lqxsc4.R.iget(10819)==0&false))) {{
                __CLR4_1_28b78b7l3lqxsc4.R.inc(10820);throw new NullPointerException(
                        "Wrapped ThreadFactory must not be null!");
            }

            }__CLR4_1_28b78b7l3lqxsc4.R.inc(10821);wrappedFactory = factory;
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10822);return this;
        }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

        /**
         * Sets the naming pattern to be used by the new {@code
         * BasicThreadFactory}.
         *
         * @param pattern the naming pattern (must not be <b>null</b>)
         * @return a reference to this {@code Builder}
         * @throws NullPointerException if the naming pattern is <b>null</b>
         */
        public Builder namingPattern(final String pattern) {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10823);
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10824);if ((((pattern == null)&&(__CLR4_1_28b78b7l3lqxsc4.R.iget(10825)!=0|true))||(__CLR4_1_28b78b7l3lqxsc4.R.iget(10826)==0&false))) {{
                __CLR4_1_28b78b7l3lqxsc4.R.inc(10827);throw new NullPointerException(
                        "Naming pattern must not be null!");
            }

            }__CLR4_1_28b78b7l3lqxsc4.R.inc(10828);namingPattern = pattern;
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10829);return this;
        }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

        /**
         * Sets the daemon flag for the new {@code BasicThreadFactory}. If this
         * flag is set to <b>true</b> the new thread factory will create daemon
         * threads.
         *
         * @param f the value of the daemon flag
         * @return a reference to this {@code Builder}
         */
        public Builder daemon(final boolean f) {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10830);
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10831);daemonFlag = Boolean.valueOf(f);
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10832);return this;
        }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

        /**
         * Sets the priority for the threads created by the new {@code
         * BasicThreadFactory}.
         *
         * @param prio the priority
         * @return a reference to this {@code Builder}
         */
        public Builder priority(final int prio) {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10833);
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10834);priority = Integer.valueOf(prio);
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10835);return this;
        }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

        /**
         * Sets the uncaught exception handler for the threads created by the
         * new {@code BasicThreadFactory}.
         *
         * @param handler the {@code UncaughtExceptionHandler} (must not be
         * <b>null</b>)
         * @return a reference to this {@code Builder}
         * @throws NullPointerException if the exception handler is <b>null</b>
         */
        public Builder uncaughtExceptionHandler(
                final Thread.UncaughtExceptionHandler handler) {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10836);
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10837);if ((((handler == null)&&(__CLR4_1_28b78b7l3lqxsc4.R.iget(10838)!=0|true))||(__CLR4_1_28b78b7l3lqxsc4.R.iget(10839)==0&false))) {{
                __CLR4_1_28b78b7l3lqxsc4.R.inc(10840);throw new NullPointerException(
                        "Uncaught exception handler must not be null!");
            }

            }__CLR4_1_28b78b7l3lqxsc4.R.inc(10841);exceptionHandler = handler;
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10842);return this;
        }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

        /**
         * Resets this builder. All configuration options are set to default
         * values. Note: If the {@link #build()} method was called, it is not
         * necessary to call {@code reset()} explicitly because this is done
         * automatically.
         */
        public void reset() {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10843);
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10844);wrappedFactory = null;
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10845);exceptionHandler = null;
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10846);namingPattern = null;
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10847);priority = null;
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10848);daemonFlag = null;
        }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}

        /**
         * Creates a new {@code BasicThreadFactory} with all configuration
         * options that have been specified by calling methods on this builder.
         * After creating the factory {@link #reset()} is called.
         *
         * @return the new {@code BasicThreadFactory}
         */
        @Override
        public BasicThreadFactory build() {try{__CLR4_1_28b78b7l3lqxsc4.R.inc(10849);
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10850);final BasicThreadFactory factory = new BasicThreadFactory(this);
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10851);reset();
            __CLR4_1_28b78b7l3lqxsc4.R.inc(10852);return factory;
        }finally{__CLR4_1_28b78b7l3lqxsc4.R.flushNeeded();}}
    }
}
