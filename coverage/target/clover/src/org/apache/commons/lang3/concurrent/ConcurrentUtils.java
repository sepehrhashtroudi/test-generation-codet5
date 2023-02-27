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

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * An utility class providing functionality related to the {@code
 * java.util.concurrent} package.
 * </p>
 *
 * @since 3.0
 * @version $Id$
 */
public class ConcurrentUtils {public static class __CLR4_1_28e78e7l3lqxscm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,10967,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Private constructor so that no instances can be created. This class
     * contains only static utility methods.
     */
    private ConcurrentUtils() {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10879);
    }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

    /**
     * Inspects the cause of the specified {@code ExecutionException} and
     * creates a {@code ConcurrentException} with the checked cause if
     * necessary. This method performs the following checks on the cause of the
     * passed in exception:
     * <ul>
     * <li>If the passed in exception is <b>null</b> or the cause is
     * <b>null</b>, this method returns <b>null</b>.</li>
     * <li>If the cause is a runtime exception, it is directly thrown.</li>
     * <li>If the cause is an error, it is directly thrown, too.</li>
     * <li>In any other case the cause is a checked exception. The method then
     * creates a {@link ConcurrentException}, initializes it with the cause, and
     * returns it.</li>
     * </ul>
     *
     * @param ex the exception to be processed
     * @return a {@code ConcurrentException} with the checked cause
     */
    public static ConcurrentException extractCause(final ExecutionException ex) {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10880);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10881);if ((((ex == null || ex.getCause() == null)&&(__CLR4_1_28e78e7l3lqxscm.R.iget(10882)!=0|true))||(__CLR4_1_28e78e7l3lqxscm.R.iget(10883)==0&false))) {{
            __CLR4_1_28e78e7l3lqxscm.R.inc(10884);return null;
        }

        }__CLR4_1_28e78e7l3lqxscm.R.inc(10885);throwCause(ex);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10886);return new ConcurrentException(ex.getMessage(), ex.getCause());
    }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

    /**
     * Inspects the cause of the specified {@code ExecutionException} and
     * creates a {@code ConcurrentRuntimeException} with the checked cause if
     * necessary. This method works exactly like
     * {@link #extractCause(ExecutionException)}. The only difference is that
     * the cause of the specified {@code ExecutionException} is extracted as a
     * runtime exception. This is an alternative for client code that does not
     * want to deal with checked exceptions.
     *
     * @param ex the exception to be processed
     * @return a {@code ConcurrentRuntimeException} with the checked cause
     */
    public static ConcurrentRuntimeException extractCauseUnchecked(
            final ExecutionException ex) {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10887);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10888);if ((((ex == null || ex.getCause() == null)&&(__CLR4_1_28e78e7l3lqxscm.R.iget(10889)!=0|true))||(__CLR4_1_28e78e7l3lqxscm.R.iget(10890)==0&false))) {{
            __CLR4_1_28e78e7l3lqxscm.R.inc(10891);return null;
        }

        }__CLR4_1_28e78e7l3lqxscm.R.inc(10892);throwCause(ex);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10893);return new ConcurrentRuntimeException(ex.getMessage(), ex.getCause());
    }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

    /**
     * Handles the specified {@code ExecutionException}. This method calls
     * {@link #extractCause(ExecutionException)} for obtaining the cause of the
     * exception - which might already cause an unchecked exception or an error
     * being thrown. If the cause is a checked exception however, it is wrapped
     * in a {@code ConcurrentException}, which is thrown. If the passed in
     * exception is <b>null</b> or has no cause, the method simply returns
     * without throwing an exception.
     *
     * @param ex the exception to be handled
     * @throws ConcurrentException if the cause of the {@code
     * ExecutionException} is a checked exception
     */
    public static void handleCause(final ExecutionException ex)
            throws ConcurrentException {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10894);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10895);final ConcurrentException cex = extractCause(ex);

        __CLR4_1_28e78e7l3lqxscm.R.inc(10896);if ((((cex != null)&&(__CLR4_1_28e78e7l3lqxscm.R.iget(10897)!=0|true))||(__CLR4_1_28e78e7l3lqxscm.R.iget(10898)==0&false))) {{
            __CLR4_1_28e78e7l3lqxscm.R.inc(10899);throw cex;
        }
    }}finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

    /**
     * Handles the specified {@code ExecutionException} and transforms it into a
     * runtime exception. This method works exactly like
     * {@link #handleCause(ExecutionException)}, but instead of a
     * {@link ConcurrentException} it throws a
     * {@link ConcurrentRuntimeException}. This is an alternative for client
     * code that does not want to deal with checked exceptions.
     *
     * @param ex the exception to be handled
     * @throws ConcurrentRuntimeException if the cause of the {@code
     * ExecutionException} is a checked exception; this exception is then
     * wrapped in the thrown runtime exception
     */
    public static void handleCauseUnchecked(final ExecutionException ex) {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10900);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10901);final ConcurrentRuntimeException crex = extractCauseUnchecked(ex);

        __CLR4_1_28e78e7l3lqxscm.R.inc(10902);if ((((crex != null)&&(__CLR4_1_28e78e7l3lqxscm.R.iget(10903)!=0|true))||(__CLR4_1_28e78e7l3lqxscm.R.iget(10904)==0&false))) {{
            __CLR4_1_28e78e7l3lqxscm.R.inc(10905);throw crex;
        }
    }}finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

    /**
     * Tests whether the specified {@code Throwable} is a checked exception. If
     * not, an exception is thrown.
     *
     * @param ex the {@code Throwable} to check
     * @return a flag whether the passed in exception is a checked exception
     * @throws IllegalArgumentException if the {@code Throwable} is not a
     * checked exception
     */
    static Throwable checkedException(final Throwable ex) {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10906);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10907);if ((((ex != null && !(ex instanceof RuntimeException)
                && !(ex instanceof Error))&&(__CLR4_1_28e78e7l3lqxscm.R.iget(10908)!=0|true))||(__CLR4_1_28e78e7l3lqxscm.R.iget(10909)==0&false))) {{
            __CLR4_1_28e78e7l3lqxscm.R.inc(10910);return ex;
        } }else {{
            __CLR4_1_28e78e7l3lqxscm.R.inc(10911);throw new IllegalArgumentException("Not a checked exception: " + ex);
        }
    }}finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

    /**
     * Tests whether the cause of the specified {@code ExecutionException}
     * should be thrown and does it if necessary.
     *
     * @param ex the exception in question
     */
    private static void throwCause(final ExecutionException ex) {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10912);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10913);if ((((ex.getCause() instanceof RuntimeException)&&(__CLR4_1_28e78e7l3lqxscm.R.iget(10914)!=0|true))||(__CLR4_1_28e78e7l3lqxscm.R.iget(10915)==0&false))) {{
            __CLR4_1_28e78e7l3lqxscm.R.inc(10916);throw (RuntimeException) ex.getCause();
        }

        }__CLR4_1_28e78e7l3lqxscm.R.inc(10917);if ((((ex.getCause() instanceof Error)&&(__CLR4_1_28e78e7l3lqxscm.R.iget(10918)!=0|true))||(__CLR4_1_28e78e7l3lqxscm.R.iget(10919)==0&false))) {{
            __CLR4_1_28e78e7l3lqxscm.R.inc(10920);throw (Error) ex.getCause();
        }
    }}finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Invokes the specified {@code ConcurrentInitializer} and returns the
     * object produced by the initializer. This method just invokes the {@code
     * get()} method of the given {@code ConcurrentInitializer}. It is
     * <b>null</b>-safe: if the argument is <b>null</b>, result is also
     * <b>null</b>.
     *
     * @param <T> the type of the object produced by the initializer
     * @param initializer the {@code ConcurrentInitializer} to be invoked
     * @return the object managed by the {@code ConcurrentInitializer}
     * @throws ConcurrentException if the {@code ConcurrentInitializer} throws
     * an exception
     */
    public static <T> T initialize(final ConcurrentInitializer<T> initializer)
            throws ConcurrentException {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10921);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10922);return (((initializer != null )&&(__CLR4_1_28e78e7l3lqxscm.R.iget(10923)!=0|true))||(__CLR4_1_28e78e7l3lqxscm.R.iget(10924)==0&false))? initializer.get() : null;
    }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

    /**
     * Invokes the specified {@code ConcurrentInitializer} and transforms
     * occurring exceptions to runtime exceptions. This method works like
     * {@link #initialize(ConcurrentInitializer)}, but if the {@code
     * ConcurrentInitializer} throws a {@link ConcurrentException}, it is
     * caught, and the cause is wrapped in a {@link ConcurrentRuntimeException}.
     * So client code does not have to deal with checked exceptions.
     *
     * @param <T> the type of the object produced by the initializer
     * @param initializer the {@code ConcurrentInitializer} to be invoked
     * @return the object managed by the {@code ConcurrentInitializer}
     * @throws ConcurrentRuntimeException if the initializer throws an exception
     */
    public static <T> T initializeUnchecked(final ConcurrentInitializer<T> initializer) {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10925);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10926);try {
            __CLR4_1_28e78e7l3lqxscm.R.inc(10927);return initialize(initializer);
        } catch (final ConcurrentException cex) {
            __CLR4_1_28e78e7l3lqxscm.R.inc(10928);throw new ConcurrentRuntimeException(cex.getCause());
        }
    }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>
     * Puts a value in the specified {@code ConcurrentMap} if the key is not yet
     * present. This method works similar to the {@code putIfAbsent()} method of
     * the {@code ConcurrentMap} interface, but the value returned is different.
     * Basically, this method is equivalent to the following code fragment:
     *
     * <pre>
     * if (!map.containsKey(key)) {
     *     map.put(key, value);
     *     return value;
     * } else {
     *     return map.get(key);
     * }
     * </pre>
     *
     * except that the action is performed atomically. So this method always
     * returns the value which is stored in the map.
     * </p>
     * <p>
     * This method is <b>null</b>-safe: It accepts a <b>null</b> map as input
     * without throwing an exception. In this case the return value is
     * <b>null</b>, too.
     * </p>
     *
     * @param <K> the type of the keys of the map
     * @param <V> the type of the values of the map
     * @param map the map to be modified
     * @param key the key of the value to be added
     * @param value the value to be added
     * @return the value stored in the map after this operation
     */
    public static <K, V> V putIfAbsent(final ConcurrentMap<K, V> map, final K key, final V value) {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10929);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10930);if ((((map == null)&&(__CLR4_1_28e78e7l3lqxscm.R.iget(10931)!=0|true))||(__CLR4_1_28e78e7l3lqxscm.R.iget(10932)==0&false))) {{
            __CLR4_1_28e78e7l3lqxscm.R.inc(10933);return null;
        }

        }__CLR4_1_28e78e7l3lqxscm.R.inc(10934);final V result = map.putIfAbsent(key, value);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10935);return (((result != null )&&(__CLR4_1_28e78e7l3lqxscm.R.iget(10936)!=0|true))||(__CLR4_1_28e78e7l3lqxscm.R.iget(10937)==0&false))? result : value;
    }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

    /**
     * Checks if a concurrent map contains a key and creates a corresponding
     * value if not. This method first checks the presence of the key in the
     * given map. If it is already contained, its value is returned. Otherwise
     * the {@code get()} method of the passed in {@link ConcurrentInitializer}
     * is called. With the resulting object
     * {@link #putIfAbsent(ConcurrentMap, Object, Object)} is called. This
     * handles the case that in the meantime another thread has added the key to
     * the map. Both the map and the initializer can be <b>null</b>; in this
     * case this method simply returns <b>null</b>.
     *
     * @param <K> the type of the keys of the map
     * @param <V> the type of the values of the map
     * @param map the map to be modified
     * @param key the key of the value to be added
     * @param init the {@link ConcurrentInitializer} for creating the value
     * @return the value stored in the map after this operation; this may or may
     * not be the object created by the {@link ConcurrentInitializer}
     * @throws ConcurrentException if the initializer throws an exception
     */
    public static <K, V> V createIfAbsent(final ConcurrentMap<K, V> map, final K key,
            final ConcurrentInitializer<V> init) throws ConcurrentException {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10938);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10939);if ((((map == null || init == null)&&(__CLR4_1_28e78e7l3lqxscm.R.iget(10940)!=0|true))||(__CLR4_1_28e78e7l3lqxscm.R.iget(10941)==0&false))) {{
            __CLR4_1_28e78e7l3lqxscm.R.inc(10942);return null;
        }

        }__CLR4_1_28e78e7l3lqxscm.R.inc(10943);final V value = map.get(key);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10944);if ((((value == null)&&(__CLR4_1_28e78e7l3lqxscm.R.iget(10945)!=0|true))||(__CLR4_1_28e78e7l3lqxscm.R.iget(10946)==0&false))) {{
            __CLR4_1_28e78e7l3lqxscm.R.inc(10947);return putIfAbsent(map, key, init.get());
        }
        }__CLR4_1_28e78e7l3lqxscm.R.inc(10948);return value;
    }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

    /**
     * Checks if a concurrent map contains a key and creates a corresponding
     * value if not, suppressing checked exceptions. This method calls
     * {@code createIfAbsent()}. If a {@link ConcurrentException} is thrown, it
     * is caught and re-thrown as a {@link ConcurrentRuntimeException}.
     *
     * @param <K> the type of the keys of the map
     * @param <V> the type of the values of the map
     * @param map the map to be modified
     * @param key the key of the value to be added
     * @param init the {@link ConcurrentInitializer} for creating the value
     * @return the value stored in the map after this operation; this may or may
     * not be the object created by the {@link ConcurrentInitializer}
     * @throws ConcurrentRuntimeException if the initializer throws an exception
     */
    public static <K, V> V createIfAbsentUnchecked(final ConcurrentMap<K, V> map,
            final K key, final ConcurrentInitializer<V> init) {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10949);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10950);try {
            __CLR4_1_28e78e7l3lqxscm.R.inc(10951);return createIfAbsent(map, key, init);
        } catch (final ConcurrentException cex) {
            __CLR4_1_28e78e7l3lqxscm.R.inc(10952);throw new ConcurrentRuntimeException(cex.getCause());
        }
    }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>
     * Gets an implementation of <code>Future</code> that is immediately done
     * and returns the specified constant value.
     * </p>
     * <p>
     * This can be useful to return a simple constant immediately from the
     * concurrent processing, perhaps as part of avoiding nulls.
     * A constant future can also be useful in testing.
     * </p>
     *
     * @param <T> the type of the value used by this {@code Future} object
     * @param value  the constant value to return, may be null
     * @return an instance of Future that will return the value, never null
     */
    public static <T> Future<T> constantFuture(final T value) {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10953);
        __CLR4_1_28e78e7l3lqxscm.R.inc(10954);return new ConstantFuture<T>(value);
    }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

    /**
     * A specialized {@code Future} implementation which wraps a constant value.
     * @param <T> the type of the value wrapped by this class
     */
    static final class ConstantFuture<T> implements Future<T> {
        /** The constant value. */
        private final T value;

        /**
         * Creates a new instance of {@code ConstantFuture} and initializes it
         * with the constant value.
         *
         * @param value the value (may be <b>null</b>)
         */
        ConstantFuture(final T value) {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10955);
            __CLR4_1_28e78e7l3lqxscm.R.inc(10956);this.value = value;
        }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

        /**
         * {@inheritDoc} This implementation always returns <b>true</b> because
         * the constant object managed by this {@code Future} implementation is
         * always available.
         */
        @Override
        public boolean isDone() {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10957);
            __CLR4_1_28e78e7l3lqxscm.R.inc(10958);return true;
        }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

        /**
         * {@inheritDoc} This implementation just returns the constant value.
         */
        @Override
        public T get() {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10959);
            __CLR4_1_28e78e7l3lqxscm.R.inc(10960);return value;
        }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

        /**
         * {@inheritDoc} This implementation just returns the constant value; it
         * does not block, therefore the timeout has no meaning.
         */
        @Override
        public T get(final long timeout, final TimeUnit unit) {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10961);
            __CLR4_1_28e78e7l3lqxscm.R.inc(10962);return value;
        }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

        /**
         * {@inheritDoc} This implementation always returns <b>false</b>; there
         * is no background process which could be cancelled.
         */
        @Override
        public boolean isCancelled() {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10963);
            __CLR4_1_28e78e7l3lqxscm.R.inc(10964);return false;
        }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}

        /**
         * {@inheritDoc} The cancel operation is not supported. This
         * implementation always returns <b>false</b>.
         */
        @Override
        public boolean cancel(final boolean mayInterruptIfRunning) {try{__CLR4_1_28e78e7l3lqxscm.R.inc(10965);
            __CLR4_1_28e78e7l3lqxscm.R.inc(10966);return false;
        }finally{__CLR4_1_28e78e7l3lqxscm.R.flushNeeded();}}
    }

}
