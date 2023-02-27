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

/**
 * <p>
 * This class provides a generic implementation of the lazy initialization
 * pattern.
 * </p>
 * <p>
 * Sometimes an application has to deal with an object only under certain
 * circumstances, e.g. when the user selects a specific menu item or if a
 * special event is received. If the creation of the object is costly or the
 * consumption of memory or other system resources is significant, it may make
 * sense to defer the creation of this object until it is really needed. This is
 * a use case for the lazy initialization pattern.
 * </p>
 * <p>
 * This abstract base class provides an implementation of the double-check idiom
 * for an instance field as discussed in Joshua Bloch's "Effective Java", 2nd
 * edition, item 71. The class already implements all necessary synchronization.
 * A concrete subclass has to implement the {@code initialize()} method, which
 * actually creates the wrapped data object.
 * </p>
 * <p>
 * As an usage example consider that we have a class {@code ComplexObject} whose
 * instantiation is a complex operation. In order to apply lazy initialization
 * to this class, a subclass of {@code LazyInitializer} has to be created:
 *
 * <pre>
 * public class ComplexObjectInitializer extends LazyInitializer&lt;ComplexObject&gt; {
 *     &#064;Override
 *     protected ComplexObject initialize() {
 *         return new ComplexObject();
 *     }
 * }
 * </pre>
 *
 * Access to the data object is provided through the {@code get()} method. So,
 * code that wants to obtain the {@code ComplexObject} instance would simply
 * look like this:
 *
 * <pre>
 * // Create an instance of the lazy initializer
 * ComplexObjectInitializer initializer = new ComplexObjectInitializer();
 * ...
 * // When the object is actually needed:
 * ComplexObject cobj = initializer.get();
 * </pre>
 *
 * </p>
 * <p>
 * If multiple threads call the {@code get()} method when the object has not yet
 * been created, they are blocked until initialization completes. The algorithm
 * guarantees that only a single instance of the wrapped object class is
 * created, which is passed to all callers. Once initialized, calls to the
 * {@code get()} method are pretty fast because no synchronization is needed
 * (only an access to a <b>volatile</b> member field).
 * </p>
 *
 * @since 3.0
 * @version $Id$
 * @param <T> the type of the object managed by this initializer class
 */
public abstract class LazyInitializer<T> implements ConcurrentInitializer<T> {public static class __CLR4_1_28ha8hal3lqxsct{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,11002,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Stores the managed object. */
    private volatile T object;

    /**
     * Returns the object wrapped by this instance. On first access the object
     * is created. After that it is cached and can be accessed pretty fast.
     *
     * @return the object initialized by this {@code LazyInitializer}
     * @throws ConcurrentException if an error occurred during initialization of
     * the object
     */
    @Override
    public T get() throws ConcurrentException {try{__CLR4_1_28ha8hal3lqxsct.R.inc(10990);
        // use a temporary variable to reduce the number of reads of the
        // volatile field
        __CLR4_1_28ha8hal3lqxsct.R.inc(10991);T result = object;

        __CLR4_1_28ha8hal3lqxsct.R.inc(10992);if ((((result == null)&&(__CLR4_1_28ha8hal3lqxsct.R.iget(10993)!=0|true))||(__CLR4_1_28ha8hal3lqxsct.R.iget(10994)==0&false))) {{
            __CLR4_1_28ha8hal3lqxsct.R.inc(10995);synchronized (this) {
                __CLR4_1_28ha8hal3lqxsct.R.inc(10996);result = object;
                __CLR4_1_28ha8hal3lqxsct.R.inc(10997);if ((((result == null)&&(__CLR4_1_28ha8hal3lqxsct.R.iget(10998)!=0|true))||(__CLR4_1_28ha8hal3lqxsct.R.iget(10999)==0&false))) {{
                    __CLR4_1_28ha8hal3lqxsct.R.inc(11000);object = result = initialize();
                }
            }}
        }

        }__CLR4_1_28ha8hal3lqxsct.R.inc(11001);return result;
    }finally{__CLR4_1_28ha8hal3lqxsct.R.flushNeeded();}}

    /**
     * Creates and initializes the object managed by this {@code
     * LazyInitializer}. This method is called by {@link #get()} when the object
     * is accessed for the first time. An implementation can focus on the
     * creation of the object. No synchronization is needed, as this is already
     * handled by {@code get()}.
     *
     * @return the managed data object
     * @throws ConcurrentException if an error occurs during object creation
     */
    protected abstract T initialize() throws ConcurrentException;
}
