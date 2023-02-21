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
package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.tuple.Pair;

/**
 * <p>Assists in implementing {@link Object#equals(Object)} methods.</p>
 *
 * <p> This class provides methods to build a good equals method for any
 * class. It follows rules laid out in
 * <a href="http://www.oracle.com/technetwork/java/effectivejava-136174.html">Effective Java</a>
 * , by Joshua Bloch. In particular the rule for comparing <code>doubles</code>,
 * <code>floats</code>, and arrays can be tricky. Also, making sure that
 * <code>equals()</code> and <code>hashCode()</code> are consistent can be
 * difficult.</p>
 *
 * <p>Two Objects that compare as equals must generate the same hash code,
 * but two Objects with the same hash code do not have to be equal.</p>
 *
 * <p>All relevant fields should be included in the calculation of equals.
 * Derived fields may be ignored. In particular, any field used in
 * generating a hash code must be used in the equals method, and vice
 * versa.</p>
 *
 * <p>Typical use for the code is as follows:</p>
 * <pre>
 * public boolean equals(Object obj) {
 *   if (obj == null) { return false; }
 *   if (obj == this) { return true; }
 *   if (obj.getClass() != getClass()) {
 *     return false;
 *   }
 *   MyClass rhs = (MyClass) obj;
 *   return new EqualsBuilder()
 *                 .appendSuper(super.equals(obj))
 *                 .append(field1, rhs.field1)
 *                 .append(field2, rhs.field2)
 *                 .append(field3, rhs.field3)
 *                 .isEquals();
 *  }
 * </pre>
 *
 * <p> Alternatively, there is a method that uses reflection to determine
 * the fields to test. Because these fields are usually private, the method,
 * <code>reflectionEquals</code>, uses <code>AccessibleObject.setAccessible</code> to
 * change the visibility of the fields. This will fail under a security
 * manager, unless the appropriate permissions are set up correctly. It is
 * also slower than testing explicitly.</p>
 *
 * <p> A typical invocation for this method would look like:</p>
 * <pre>
 * public boolean equals(Object obj) {
 *   return EqualsBuilder.reflectionEquals(this, obj);
 * }
 * </pre>
 *
 * @since 1.0
 * @version $Id$
 */
public class EqualsBuilder implements Builder<Boolean> {public static class __CLR4_1_26uu6uul3lqxs7a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,9327,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>
     * A registry of objects used by reflection methods to detect cyclical object references and avoid infinite loops.
     * </p>
     *
     * @since 3.0
     */
    private static final ThreadLocal<Set<Pair<IDKey, IDKey>>> REGISTRY = new ThreadLocal<Set<Pair<IDKey, IDKey>>>();

    /*
     * NOTE: we cannot store the actual objects in a HashSet, as that would use the very hashCode()
     * we are in the process of calculating.
     *
     * So we generate a one-to-one mapping from the original object to a new object.
     *
     * Now HashSet uses equals() to determine if two elements with the same hashcode really
     * are equal, so we also need to ensure that the replacement objects are only equal
     * if the original objects are identical.
     *
     * The original implementation (2.4 and before) used the System.indentityHashCode()
     * method - however this is not guaranteed to generate unique ids (e.g. LANG-459)
     *
     * We now use the IDKey helper class (adapted from org.apache.axis.utils.IDKey)
     * to disambiguate the duplicate ids.
     */

    /**
     * <p>
     * Returns the registry of object pairs being traversed by the reflection
     * methods in the current thread.
     * </p>
     *
     * @return Set the registry of objects being traversed
     * @since 3.0
     */
    static Set<Pair<IDKey, IDKey>> getRegistry() {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(8886);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8887);return REGISTRY.get();
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>
     * Converters value pair into a register pair.
     * </p>
     *
     * @param lhs <code>this</code> object
     * @param rhs the other object
     *
     * @return the pair
     */
    static Pair<IDKey, IDKey> getRegisterPair(final Object lhs, final Object rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(8888);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8889);final IDKey left = new IDKey(lhs);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8890);final IDKey right = new IDKey(rhs);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8891);return Pair.of(left, right);
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>
     * Returns <code>true</code> if the registry contains the given object pair.
     * Used by the reflection methods to avoid infinite loops.
     * Objects might be swapped therefore a check is needed if the object pair
     * is registered in given or swapped order.
     * </p>
     *
     * @param lhs <code>this</code> object to lookup in registry
     * @param rhs the other object to lookup on registry
     * @return boolean <code>true</code> if the registry contains the given object.
     * @since 3.0
     */
    static boolean isRegistered(final Object lhs, final Object rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(8892);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8893);final Set<Pair<IDKey, IDKey>> registry = getRegistry();
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8894);final Pair<IDKey, IDKey> pair = getRegisterPair(lhs, rhs);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8895);final Pair<IDKey, IDKey> swappedPair = Pair.of(pair.getLeft(), pair.getRight());

        __CLR4_1_26uu6uul3lqxs7a.R.inc(8896);return registry != null
                && (registry.contains(pair) || registry.contains(swappedPair));
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>
     * Registers the given object pair.
     * Used by the reflection methods to avoid infinite loops.
     * </p>
     *
     * @param lhs <code>this</code> object to register
     * @param rhs the other object to register
     */
    static void register(final Object lhs, final Object rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(8897);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8898);synchronized (EqualsBuilder.class) {
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8899);if ((((getRegistry() == null)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8900)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8901)==0&false))) {{
                __CLR4_1_26uu6uul3lqxs7a.R.inc(8902);REGISTRY.set(new HashSet<Pair<IDKey, IDKey>>());
            }
        }}

        __CLR4_1_26uu6uul3lqxs7a.R.inc(8903);final Set<Pair<IDKey, IDKey>> registry = getRegistry();
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8904);final Pair<IDKey, IDKey> pair = getRegisterPair(lhs, rhs);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8905);registry.add(pair);
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>
     * Unregisters the given object pair.
     * </p>
     *
     * <p>
     * Used by the reflection methods to avoid infinite loops.
     *
     * @param lhs <code>this</code> object to unregister
     * @param rhs the other object to unregister
     * @since 3.0
     */
    static void unregister(final Object lhs, final Object rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(8906);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8907);Set<Pair<IDKey, IDKey>> registry = getRegistry();
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8908);if ((((registry != null)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8909)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8910)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8911);final Pair<IDKey, IDKey> pair = getRegisterPair(lhs, rhs);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8912);registry.remove(pair);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8913);synchronized (EqualsBuilder.class) {
                //read again
                __CLR4_1_26uu6uul3lqxs7a.R.inc(8914);registry = getRegistry();
                __CLR4_1_26uu6uul3lqxs7a.R.inc(8915);if ((((registry != null && registry.isEmpty())&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8916)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8917)==0&false))) {{
                    __CLR4_1_26uu6uul3lqxs7a.R.inc(8918);REGISTRY.remove();
                }
            }}
        }
    }}finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * If the fields tested are equals.
     * The default value is <code>true</code>.
     */
    private boolean isEquals = true;

    /**
     * <p>Constructor for EqualsBuilder.</p>
     *
     * <p>Starts off assuming that equals is <code>true</code>.</p>
     * @see Object#equals(Object)
     */
    public EqualsBuilder() {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(8919);
        // do nothing for now.
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    //-------------------------------------------------------------------------

    /**
     * <p>This method uses reflection to determine if the two <code>Object</code>s
     * are equal.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly.</p>
     *
     * <p>Transient members will be not be tested, as they are likely derived
     * fields, and not part of the value of the Object.</p>
     *
     * <p>Static fields will not be tested. Superclass fields will be included.</p>
     *
     * @param lhs  <code>this</code> object
     * @param rhs  the other object
     * @param excludeFields  Collection of String field names to exclude from testing
     * @return <code>true</code> if the two Objects have tested equals.
     */
    public static boolean reflectionEquals(final Object lhs, final Object rhs, final Collection<String> excludeFields) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(8920);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8921);return reflectionEquals(lhs, rhs, ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>This method uses reflection to determine if the two <code>Object</code>s
     * are equal.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly.</p>
     *
     * <p>Transient members will be not be tested, as they are likely derived
     * fields, and not part of the value of the Object.</p>
     *
     * <p>Static fields will not be tested. Superclass fields will be included.</p>
     *
     * @param lhs  <code>this</code> object
     * @param rhs  the other object
     * @param excludeFields  array of field names to exclude from testing
     * @return <code>true</code> if the two Objects have tested equals.
     */
    public static boolean reflectionEquals(final Object lhs, final Object rhs, final String... excludeFields) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(8922);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8923);return reflectionEquals(lhs, rhs, false, null, excludeFields);
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>This method uses reflection to determine if the two <code>Object</code>s
     * are equal.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly.</p>
     *
     * <p>If the TestTransients parameter is set to <code>true</code>, transient
     * members will be tested, otherwise they are ignored, as they are likely
     * derived fields, and not part of the value of the <code>Object</code>.</p>
     *
     * <p>Static fields will not be tested. Superclass fields will be included.</p>
     *
     * @param lhs  <code>this</code> object
     * @param rhs  the other object
     * @param testTransients  whether to include transient fields
     * @return <code>true</code> if the two Objects have tested equals.
     */
    public static boolean reflectionEquals(final Object lhs, final Object rhs, final boolean testTransients) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(8924);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8925);return reflectionEquals(lhs, rhs, testTransients, null);
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>This method uses reflection to determine if the two <code>Object</code>s
     * are equal.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run under
     * a security manager, if the permissions are not set up correctly. It is also
     * not as efficient as testing explicitly.</p>
     *
     * <p>If the testTransients parameter is set to <code>true</code>, transient
     * members will be tested, otherwise they are ignored, as they are likely
     * derived fields, and not part of the value of the <code>Object</code>.</p>
     *
     * <p>Static fields will not be included. Superclass fields will be appended
     * up to and including the specified superclass. A null superclass is treated
     * as java.lang.Object.</p>
     *
     * @param lhs  <code>this</code> object
     * @param rhs  the other object
     * @param testTransients  whether to include transient fields
     * @param reflectUpToClass  the superclass to reflect up to (inclusive),
     *  may be <code>null</code>
     * @param excludeFields  array of field names to exclude from testing
     * @return <code>true</code> if the two Objects have tested equals.
     * @since 2.0
     */
    public static boolean reflectionEquals(final Object lhs, final Object rhs, final boolean testTransients, final Class<?> reflectUpToClass,
            final String... excludeFields) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(8926);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8927);if ((((lhs == rhs)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8928)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8929)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8930);return true;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(8931);if ((((lhs == null || rhs == null)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8932)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8933)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8934);return false;
        }
        // Find the leaf class since there may be transients in the leaf
        // class or in classes between the leaf and root.
        // If we are not testing transients or a subclass has no ivars,
        // then a subclass can test equals to a superclass.
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(8935);final Class<?> lhsClass = lhs.getClass();
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8936);final Class<?> rhsClass = rhs.getClass();
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8937);Class<?> testClass;
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8938);if ((((lhsClass.isInstance(rhs))&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8939)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8940)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8941);testClass = lhsClass;
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8942);if ((((!rhsClass.isInstance(lhs))&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8943)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8944)==0&false))) {{
                // rhsClass is a subclass of lhsClass
                __CLR4_1_26uu6uul3lqxs7a.R.inc(8945);testClass = rhsClass;
            }
        }} }else {__CLR4_1_26uu6uul3lqxs7a.R.inc(8946);if ((((rhsClass.isInstance(lhs))&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8947)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8948)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8949);testClass = rhsClass;
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8950);if ((((!lhsClass.isInstance(rhs))&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8951)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8952)==0&false))) {{
                // lhsClass is a subclass of rhsClass
                __CLR4_1_26uu6uul3lqxs7a.R.inc(8953);testClass = lhsClass;
            }
        }} }else {{
            // The two classes are not related.
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8954);return false;
        }
        }}__CLR4_1_26uu6uul3lqxs7a.R.inc(8955);final EqualsBuilder equalsBuilder = new EqualsBuilder();
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8956);try {
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8957);reflectionAppend(lhs, rhs, testClass, equalsBuilder, testTransients, excludeFields);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8958);while ((((testClass.getSuperclass() != null && testClass != reflectUpToClass)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8959)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8960)==0&false))) {{
                __CLR4_1_26uu6uul3lqxs7a.R.inc(8961);testClass = testClass.getSuperclass();
                __CLR4_1_26uu6uul3lqxs7a.R.inc(8962);reflectionAppend(lhs, rhs, testClass, equalsBuilder, testTransients, excludeFields);
            }
        }} catch (final IllegalArgumentException e) {
            // In this case, we tried to test a subclass vs. a superclass and
            // the subclass has ivars or the ivars are transient and
            // we are testing transients.
            // If a subclass has ivars that we are trying to test them, we get an
            // exception and we know that the objects are not equal.
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8963);return false;
        }
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8964);return equalsBuilder.isEquals();
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Appends the fields and values defined by the given object of the
     * given Class.</p>
     *
     * @param lhs  the left hand object
     * @param rhs  the right hand object
     * @param clazz  the class to append details of
     * @param builder  the builder to append to
     * @param useTransients  whether to test transient fields
     * @param excludeFields  array of field names to exclude from testing
     */
    private static void reflectionAppend(
        final Object lhs,
        final Object rhs,
        final Class<?> clazz,
        final EqualsBuilder builder,
        final boolean useTransients,
        final String[] excludeFields) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(8965);

        __CLR4_1_26uu6uul3lqxs7a.R.inc(8966);if ((((isRegistered(lhs, rhs))&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8967)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8968)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8969);return;
        }

        }__CLR4_1_26uu6uul3lqxs7a.R.inc(8970);try {
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8971);register(lhs, rhs);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8972);final Field[] fields = clazz.getDeclaredFields();
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8973);AccessibleObject.setAccessible(fields, true);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8974);for (int i = 0; (((i < fields.length && builder.isEquals)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8975)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8976)==0&false)); i++) {{
                __CLR4_1_26uu6uul3lqxs7a.R.inc(8977);final Field f = fields[i];
                __CLR4_1_26uu6uul3lqxs7a.R.inc(8978);if ((((!ArrayUtils.contains(excludeFields, f.getName())
                    && (f.getName().indexOf('$') == -1)
                    && (useTransients || !Modifier.isTransient(f.getModifiers()))
                    && (!Modifier.isStatic(f.getModifiers())))&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8979)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8980)==0&false))) {{
                    __CLR4_1_26uu6uul3lqxs7a.R.inc(8981);try {
                        __CLR4_1_26uu6uul3lqxs7a.R.inc(8982);builder.append(f.get(lhs), f.get(rhs));
                    } catch (final IllegalAccessException e) {
                        //this can't happen. Would get a Security exception instead
                        //throw a runtime exception in case the impossible happens.
                        __CLR4_1_26uu6uul3lqxs7a.R.inc(8983);throw new InternalError("Unexpected IllegalAccessException");
                    }
                }
            }}
        }} finally {
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8984);unregister(lhs, rhs);
        }
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    //-------------------------------------------------------------------------

    /**
     * <p>Adds the result of <code>super.equals()</code> to this builder.</p>
     *
     * @param superEquals  the result of calling <code>super.equals()</code>
     * @return EqualsBuilder - used to chain calls.
     * @since 2.0
     */
    public EqualsBuilder appendSuper(final boolean superEquals) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(8985);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8986);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8987)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8988)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8989);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(8990);isEquals = superEquals;
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8991);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    //-------------------------------------------------------------------------

    /**
     * <p>Test if two <code>Object</code>s are equal using their
     * <code>equals</code> method.</p>
     *
     * @param lhs  the left hand object
     * @param rhs  the right hand object
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final Object lhs, final Object rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(8992);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(8993);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8994)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8995)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(8996);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(8997);if ((((lhs == rhs)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(8998)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(8999)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9000);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9001);if ((((lhs == null || rhs == null)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9002)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9003)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9004);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9005);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9006);final Class<?> lhsClass = lhs.getClass();
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9007);if ((((!lhsClass.isArray())&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9008)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9009)==0&false))) {{
            // The simple case, not an array, just test the element
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9010);isEquals = lhs.equals(rhs);
        } }else {__CLR4_1_26uu6uul3lqxs7a.R.inc(9011);if ((((lhs.getClass() != rhs.getClass())&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9012)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9013)==0&false))) {{
            // Here when we compare different dimensions, for example: a boolean[][] to a boolean[]
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9014);this.setEquals(false);
        }
        // 'Switch' on type of array, to dispatch to the correct handler
        // This handles multi dimensional arrays of the same depth
        }else {__CLR4_1_26uu6uul3lqxs7a.R.inc(9015);if ((((lhs instanceof long[])&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9016)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9017)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9018);append((long[]) lhs, (long[]) rhs);
        } }else {__CLR4_1_26uu6uul3lqxs7a.R.inc(9019);if ((((lhs instanceof int[])&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9020)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9021)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9022);append((int[]) lhs, (int[]) rhs);
        } }else {__CLR4_1_26uu6uul3lqxs7a.R.inc(9023);if ((((lhs instanceof short[])&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9024)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9025)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9026);append((short[]) lhs, (short[]) rhs);
        } }else {__CLR4_1_26uu6uul3lqxs7a.R.inc(9027);if ((((lhs instanceof char[])&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9028)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9029)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9030);append((char[]) lhs, (char[]) rhs);
        } }else {__CLR4_1_26uu6uul3lqxs7a.R.inc(9031);if ((((lhs instanceof byte[])&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9032)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9033)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9034);append((byte[]) lhs, (byte[]) rhs);
        } }else {__CLR4_1_26uu6uul3lqxs7a.R.inc(9035);if ((((lhs instanceof double[])&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9036)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9037)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9038);append((double[]) lhs, (double[]) rhs);
        } }else {__CLR4_1_26uu6uul3lqxs7a.R.inc(9039);if ((((lhs instanceof float[])&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9040)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9041)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9042);append((float[]) lhs, (float[]) rhs);
        } }else {__CLR4_1_26uu6uul3lqxs7a.R.inc(9043);if ((((lhs instanceof boolean[])&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9044)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9045)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9046);append((boolean[]) lhs, (boolean[]) rhs);
        } }else {{
            // Not an array of primitives
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9047);append((Object[]) lhs, (Object[]) rhs);
        }
        }}}}}}}}}}__CLR4_1_26uu6uul3lqxs7a.R.inc(9048);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>
     * Test if two <code>long</code> s are equal.
     * </p>
     *
     * @param lhs
     *                  the left hand <code>long</code>
     * @param rhs
     *                  the right hand <code>long</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final long lhs, final long rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9049);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9050);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9051)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9052)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9053);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9054);isEquals = (lhs == rhs);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9055);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Test if two <code>int</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>int</code>
     * @param rhs  the right hand <code>int</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final int lhs, final int rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9056);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9057);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9058)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9059)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9060);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9061);isEquals = (lhs == rhs);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9062);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Test if two <code>short</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>short</code>
     * @param rhs  the right hand <code>short</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final short lhs, final short rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9063);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9064);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9065)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9066)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9067);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9068);isEquals = (lhs == rhs);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9069);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Test if two <code>char</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>char</code>
     * @param rhs  the right hand <code>char</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final char lhs, final char rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9070);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9071);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9072)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9073)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9074);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9075);isEquals = (lhs == rhs);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9076);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Test if two <code>byte</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>byte</code>
     * @param rhs  the right hand <code>byte</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final byte lhs, final byte rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9077);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9078);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9079)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9080)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9081);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9082);isEquals = (lhs == rhs);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9083);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Test if two <code>double</code>s are equal by testing that the
     * pattern of bits returned by <code>doubleToLong</code> are equal.</p>
     *
     * <p>This handles NaNs, Infinities, and <code>-0.0</code>.</p>
     *
     * <p>It is compatible with the hash code generated by
     * <code>HashCodeBuilder</code>.</p>
     *
     * @param lhs  the left hand <code>double</code>
     * @param rhs  the right hand <code>double</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final double lhs, final double rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9084);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9085);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9086)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9087)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9088);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9089);return append(Double.doubleToLongBits(lhs), Double.doubleToLongBits(rhs));
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Test if two <code>float</code>s are equal byt testing that the
     * pattern of bits returned by doubleToLong are equal.</p>
     *
     * <p>This handles NaNs, Infinities, and <code>-0.0</code>.</p>
     *
     * <p>It is compatible with the hash code generated by
     * <code>HashCodeBuilder</code>.</p>
     *
     * @param lhs  the left hand <code>float</code>
     * @param rhs  the right hand <code>float</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final float lhs, final float rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9090);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9091);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9092)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9093)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9094);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9095);return append(Float.floatToIntBits(lhs), Float.floatToIntBits(rhs));
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Test if two <code>booleans</code>s are equal.</p>
     *
     * @param lhs  the left hand <code>boolean</code>
     * @param rhs  the right hand <code>boolean</code>
     * @return EqualsBuilder - used to chain calls.
      */
    public EqualsBuilder append(final boolean lhs, final boolean rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9096);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9097);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9098)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9099)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9100);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9101);isEquals = (lhs == rhs);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9102);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Performs a deep comparison of two <code>Object</code> arrays.</p>
     *
     * <p>This also will be called for the top level of
     * multi-dimensional, ragged, and multi-typed arrays.</p>
     *
     * @param lhs  the left hand <code>Object[]</code>
     * @param rhs  the right hand <code>Object[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final Object[] lhs, final Object[] rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9103);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9104);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9105)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9106)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9107);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9108);if ((((lhs == rhs)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9109)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9110)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9111);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9112);if ((((lhs == null || rhs == null)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9113)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9114)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9115);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9116);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9117);if ((((lhs.length != rhs.length)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9118)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9119)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9120);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9121);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9122);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9123)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9124)==0&false)); ++i) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9125);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9126);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>long</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(long, long)} is used.</p>
     *
     * @param lhs  the left hand <code>long[]</code>
     * @param rhs  the right hand <code>long[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final long[] lhs, final long[] rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9127);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9128);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9129)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9130)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9131);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9132);if ((((lhs == rhs)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9133)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9134)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9135);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9136);if ((((lhs == null || rhs == null)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9137)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9138)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9139);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9140);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9141);if ((((lhs.length != rhs.length)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9142)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9143)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9144);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9145);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9146);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9147)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9148)==0&false)); ++i) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9149);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9150);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>int</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(int, int)} is used.</p>
     *
     * @param lhs  the left hand <code>int[]</code>
     * @param rhs  the right hand <code>int[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final int[] lhs, final int[] rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9151);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9152);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9153)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9154)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9155);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9156);if ((((lhs == rhs)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9157)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9158)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9159);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9160);if ((((lhs == null || rhs == null)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9161)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9162)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9163);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9164);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9165);if ((((lhs.length != rhs.length)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9166)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9167)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9168);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9169);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9170);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9171)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9172)==0&false)); ++i) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9173);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9174);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>short</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(short, short)} is used.</p>
     *
     * @param lhs  the left hand <code>short[]</code>
     * @param rhs  the right hand <code>short[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final short[] lhs, final short[] rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9175);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9176);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9177)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9178)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9179);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9180);if ((((lhs == rhs)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9181)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9182)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9183);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9184);if ((((lhs == null || rhs == null)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9185)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9186)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9187);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9188);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9189);if ((((lhs.length != rhs.length)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9190)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9191)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9192);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9193);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9194);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9195)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9196)==0&false)); ++i) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9197);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9198);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>char</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(char, char)} is used.</p>
     *
     * @param lhs  the left hand <code>char[]</code>
     * @param rhs  the right hand <code>char[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final char[] lhs, final char[] rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9199);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9200);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9201)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9202)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9203);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9204);if ((((lhs == rhs)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9205)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9206)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9207);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9208);if ((((lhs == null || rhs == null)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9209)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9210)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9211);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9212);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9213);if ((((lhs.length != rhs.length)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9214)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9215)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9216);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9217);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9218);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9219)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9220)==0&false)); ++i) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9221);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9222);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>byte</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(byte, byte)} is used.</p>
     *
     * @param lhs  the left hand <code>byte[]</code>
     * @param rhs  the right hand <code>byte[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final byte[] lhs, final byte[] rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9223);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9224);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9225)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9226)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9227);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9228);if ((((lhs == rhs)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9229)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9230)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9231);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9232);if ((((lhs == null || rhs == null)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9233)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9234)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9235);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9236);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9237);if ((((lhs.length != rhs.length)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9238)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9239)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9240);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9241);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9242);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9243)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9244)==0&false)); ++i) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9245);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9246);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>double</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(double, double)} is used.</p>
     *
     * @param lhs  the left hand <code>double[]</code>
     * @param rhs  the right hand <code>double[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final double[] lhs, final double[] rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9247);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9248);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9249)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9250)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9251);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9252);if ((((lhs == rhs)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9253)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9254)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9255);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9256);if ((((lhs == null || rhs == null)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9257)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9258)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9259);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9260);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9261);if ((((lhs.length != rhs.length)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9262)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9263)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9264);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9265);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9266);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9267)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9268)==0&false)); ++i) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9269);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9270);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>float</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(float, float)} is used.</p>
     *
     * @param lhs  the left hand <code>float[]</code>
     * @param rhs  the right hand <code>float[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final float[] lhs, final float[] rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9271);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9272);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9273)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9274)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9275);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9276);if ((((lhs == rhs)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9277)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9278)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9279);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9280);if ((((lhs == null || rhs == null)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9281)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9282)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9283);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9284);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9285);if ((((lhs.length != rhs.length)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9286)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9287)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9288);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9289);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9290);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9291)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9292)==0&false)); ++i) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9293);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9294);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Deep comparison of array of <code>boolean</code>. Length and all
     * values are compared.</p>
     *
     * <p>The method {@link #append(boolean, boolean)} is used.</p>
     *
     * @param lhs  the left hand <code>boolean[]</code>
     * @param rhs  the right hand <code>boolean[]</code>
     * @return EqualsBuilder - used to chain calls.
     */
    public EqualsBuilder append(final boolean[] lhs, final boolean[] rhs) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9295);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9296);if ((((isEquals == false)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9297)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9298)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9299);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9300);if ((((lhs == rhs)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9301)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9302)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9303);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9304);if ((((lhs == null || rhs == null)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9305)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9306)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9307);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9308);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9309);if ((((lhs.length != rhs.length)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9310)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9311)==0&false))) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9312);this.setEquals(false);
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9313);return this;
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9314);for (int i = 0; (((i < lhs.length && isEquals)&&(__CLR4_1_26uu6uul3lqxs7a.R.iget(9315)!=0|true))||(__CLR4_1_26uu6uul3lqxs7a.R.iget(9316)==0&false)); ++i) {{
            __CLR4_1_26uu6uul3lqxs7a.R.inc(9317);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26uu6uul3lqxs7a.R.inc(9318);return this;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Returns <code>true</code> if the fields that have been checked
     * are all equal.</p>
     *
     * @return boolean
     */
    public boolean isEquals() {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9319);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9320);return this.isEquals;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * <p>Returns <code>true</code> if the fields that have been checked
     * are all equal.</p>
     *
     * @return <code>true</code> if all of the fields that have been checked
     *         are equal, <code>false</code> otherwise.
     *
     * @since 3.0
     */
    @Override
    public Boolean build() {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9321);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9322);return Boolean.valueOf(isEquals());
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * Sets the <code>isEquals</code> value.
     *
     * @param isEquals The value to set.
     * @since 2.1
     */
    protected void setEquals(final boolean isEquals) {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9323);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9324);this.isEquals = isEquals;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}

    /**
     * Reset the EqualsBuilder so you can use the same object again
     * @since 2.5
     */
    public void reset() {try{__CLR4_1_26uu6uul3lqxs7a.R.inc(9325);
        __CLR4_1_26uu6uul3lqxs7a.R.inc(9326);this.isEquals = true;
    }finally{__CLR4_1_26uu6uul3lqxs7a.R.flushNeeded();}}
}
