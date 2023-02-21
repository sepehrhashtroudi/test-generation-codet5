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

import org.apache.commons.lang3.ObjectUtils;

/**
 * <p>
 * A very simple implementation of the {@link ConcurrentInitializer} interface
 * which always returns the same object.
 * </p>
 * <p>
 * An instance of this class is passed a reference to an object when it is
 * constructed. The {@link #get()} method just returns this object. No
 * synchronization is required.
 * </p>
 * <p>
 * This class is useful for instance for unit testing or in cases where a
 * specific object has to be passed to an object which expects a
 * {@link ConcurrentInitializer}.
 * </p>
 *
 * @since 3.0
 * @version $Id$
 * @param <T> the type of the object managed by this initializer
 */
public class ConstantInitializer<T> implements ConcurrentInitializer<T> {public static class __CLR4_1_28gn8gnl3lqxscr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,10990,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /** Constant for the format of the string representation. */
    private static final String FMT_TO_STRING = "ConstantInitializer@%d [ object = %s ]";

    /** Stores the managed object. */
    private final T object;

    /**
     * Creates a new instance of {@code ConstantInitializer} and initializes it
     * with the object to be managed. The {@code get()} method will always
     * return the object passed here. This class does not place any restrictions
     * on the object. It may be <b>null</b>, then {@code get()} will return
     * <b>null</b>, too.
     *
     * @param obj the object to be managed by this initializer
     */
    public ConstantInitializer(final T obj) {try{__CLR4_1_28gn8gnl3lqxscr.R.inc(10967);
        __CLR4_1_28gn8gnl3lqxscr.R.inc(10968);object = obj;
    }finally{__CLR4_1_28gn8gnl3lqxscr.R.flushNeeded();}}

    /**
     * Directly returns the object that was passed to the constructor. This is
     * the same object as returned by {@code get()}. However, this method does
     * not declare that it throws an exception.
     *
     * @return the object managed by this initializer
     */
    public final T getObject() {try{__CLR4_1_28gn8gnl3lqxscr.R.inc(10969);
        __CLR4_1_28gn8gnl3lqxscr.R.inc(10970);return object;
    }finally{__CLR4_1_28gn8gnl3lqxscr.R.flushNeeded();}}

    /**
     * Returns the object managed by this initializer. This implementation just
     * returns the object passed to the constructor.
     *
     * @return the object managed by this initializer
     * @throws ConcurrentException if an error occurs
     */
    @Override
    public T get() throws ConcurrentException {try{__CLR4_1_28gn8gnl3lqxscr.R.inc(10971);
        __CLR4_1_28gn8gnl3lqxscr.R.inc(10972);return getObject();
    }finally{__CLR4_1_28gn8gnl3lqxscr.R.flushNeeded();}}

    /**
     * Returns a hash code for this object. This implementation returns the hash
     * code of the managed object.
     *
     * @return a hash code for this object
     */
    @Override
    public int hashCode() {try{__CLR4_1_28gn8gnl3lqxscr.R.inc(10973);
        __CLR4_1_28gn8gnl3lqxscr.R.inc(10974);return (((getObject() != null )&&(__CLR4_1_28gn8gnl3lqxscr.R.iget(10975)!=0|true))||(__CLR4_1_28gn8gnl3lqxscr.R.iget(10976)==0&false))? getObject().hashCode() : 0;
    }finally{__CLR4_1_28gn8gnl3lqxscr.R.flushNeeded();}}

    /**
     * Compares this object with another one. This implementation returns
     * <b>true</b> if and only if the passed in object is an instance of
     * {@code ConstantInitializer} which refers to an object equals to the
     * object managed by this instance.
     *
     * @param obj the object to compare to
     * @return a flag whether the objects are equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_1_28gn8gnl3lqxscr.R.inc(10977);
        __CLR4_1_28gn8gnl3lqxscr.R.inc(10978);if ((((this == obj)&&(__CLR4_1_28gn8gnl3lqxscr.R.iget(10979)!=0|true))||(__CLR4_1_28gn8gnl3lqxscr.R.iget(10980)==0&false))) {{
            __CLR4_1_28gn8gnl3lqxscr.R.inc(10981);return true;
        }
        }__CLR4_1_28gn8gnl3lqxscr.R.inc(10982);if ((((!(obj instanceof ConstantInitializer<?>))&&(__CLR4_1_28gn8gnl3lqxscr.R.iget(10983)!=0|true))||(__CLR4_1_28gn8gnl3lqxscr.R.iget(10984)==0&false))) {{
            __CLR4_1_28gn8gnl3lqxscr.R.inc(10985);return false;
        }

        }__CLR4_1_28gn8gnl3lqxscr.R.inc(10986);final ConstantInitializer<?> c = (ConstantInitializer<?>) obj;
        __CLR4_1_28gn8gnl3lqxscr.R.inc(10987);return ObjectUtils.equals(getObject(), c.getObject());
    }finally{__CLR4_1_28gn8gnl3lqxscr.R.flushNeeded();}}

    /**
     * Returns a string representation for this object. This string also
     * contains a string representation of the object managed by this
     * initializer.
     *
     * @return a string for this object
     */
    @Override
    public String toString() {try{__CLR4_1_28gn8gnl3lqxscr.R.inc(10988);
        __CLR4_1_28gn8gnl3lqxscr.R.inc(10989);return String.format(FMT_TO_STRING, Integer.valueOf(System.identityHashCode(this)),
                String.valueOf(getObject()));
    }finally{__CLR4_1_28gn8gnl3lqxscr.R.flushNeeded();}}
}
