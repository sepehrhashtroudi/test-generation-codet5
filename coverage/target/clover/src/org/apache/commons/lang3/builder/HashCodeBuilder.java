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

/**
 * <p>
 * Assists in implementing {@link Object#hashCode()} methods.
 * </p>
 *
 * <p>
 * This class enables a good <code>hashCode</code> method to be built for any class. It follows the rules laid out in
 * the book <a href="http://www.oracle.com/technetwork/java/effectivejava-136174.html">Effective Java</a> by Joshua Bloch. Writing a
 * good <code>hashCode</code> method is actually quite difficult. This class aims to simplify the process.
 * </p>
 *
 * <p>
 * The following is the approach taken. When appending a data field, the current total is multiplied by the
 * multiplier then a relevant value
 * for that data type is added. For example, if the current hashCode is 17, and the multiplier is 37, then
 * appending the integer 45 will create a hashcode of 674, namely 17 * 37 + 45.
 * </p>
 *
 * <p>
 * All relevant fields from the object should be included in the <code>hashCode</code> method. Derived fields may be
 * excluded. In general, any field used in the <code>equals</code> method must be used in the <code>hashCode</code>
 * method.
 * </p>
 *
 * <p>
 * To use this class write code as follows:
 * </p>
 *
 * <pre>
 * public class Person {
 *   String name;
 *   int age;
 *   boolean smoker;
 *   ...
 *
 *   public int hashCode() {
 *     // you pick a hard-coded, randomly chosen, non-zero, odd number
 *     // ideally different for each class
 *     return new HashCodeBuilder(17, 37).
 *       append(name).
 *       append(age).
 *       append(smoker).
 *       toHashCode();
 *   }
 * }
 * </pre>
 *
 * <p>
 * If required, the superclass <code>hashCode()</code> can be added using {@link #appendSuper}.
 * </p>
 *
 * <p>
 * Alternatively, there is a method that uses reflection to determine the fields to test. Because these fields are
 * usually private, the method, <code>reflectionHashCode</code>, uses <code>AccessibleObject.setAccessible</code>
 * to change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions
 * are set up correctly. It is also slower than testing explicitly.
 * </p>
 *
 * <p>
 * A typical invocation for this method would look like:
 * </p>
 *
 * <pre>
 * public int hashCode() {
 *   return HashCodeBuilder.reflectionHashCode(this);
 * }
 * </pre>
 *
 * @since 1.0
 * @version $Id$
 */
public class HashCodeBuilder implements Builder<Integer> {public static class __CLR4_1_2773773l3lqxs81{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,9564,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * <p>
     * A registry of objects used by reflection methods to detect cyclical object references and avoid infinite loops.
     * </p>
     *
     * @since 2.3
     */
    private static final ThreadLocal<Set<IDKey>> REGISTRY = new ThreadLocal<Set<IDKey>>();

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
     * Returns the registry of objects being traversed by the reflection methods in the current thread.
     * </p>
     *
     * @return Set the registry of objects being traversed
     * @since 2.3
     */
    static Set<IDKey> getRegistry() {try{__CLR4_1_2773773l3lqxs81.R.inc(9327);
        __CLR4_1_2773773l3lqxs81.R.inc(9328);return REGISTRY.get();
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Returns <code>true</code> if the registry contains the given object. Used by the reflection methods to avoid
     * infinite loops.
     * </p>
     *
     * @param value
     *            The object to lookup in the registry.
     * @return boolean <code>true</code> if the registry contains the given object.
     * @since 2.3
     */
    static boolean isRegistered(final Object value) {try{__CLR4_1_2773773l3lqxs81.R.inc(9329);
        __CLR4_1_2773773l3lqxs81.R.inc(9330);final Set<IDKey> registry = getRegistry();
        __CLR4_1_2773773l3lqxs81.R.inc(9331);return registry != null && registry.contains(new IDKey(value));
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Appends the fields and values defined by the given object of the given <code>Class</code>.
     * </p>
     *
     * @param object
     *            the object to append details of
     * @param clazz
     *            the class to append details of
     * @param builder
     *            the builder to append to
     * @param useTransients
     *            whether to use transient fields
     * @param excludeFields
     *            Collection of String field names to exclude from use in calculation of hash code
     */
    private static void reflectionAppend(final Object object, final Class<?> clazz, final HashCodeBuilder builder, final boolean useTransients,
            final String[] excludeFields) {try{__CLR4_1_2773773l3lqxs81.R.inc(9332);
        __CLR4_1_2773773l3lqxs81.R.inc(9333);if ((((isRegistered(object))&&(__CLR4_1_2773773l3lqxs81.R.iget(9334)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9335)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9336);return;
        }
        }__CLR4_1_2773773l3lqxs81.R.inc(9337);try {
            __CLR4_1_2773773l3lqxs81.R.inc(9338);register(object);
            __CLR4_1_2773773l3lqxs81.R.inc(9339);final Field[] fields = clazz.getDeclaredFields();
            __CLR4_1_2773773l3lqxs81.R.inc(9340);AccessibleObject.setAccessible(fields, true);
            __CLR4_1_2773773l3lqxs81.R.inc(9341);for (final Field field : fields) {{
                __CLR4_1_2773773l3lqxs81.R.inc(9342);if ((((!ArrayUtils.contains(excludeFields, field.getName())
                    && (field.getName().indexOf('$') == -1)
                    && (useTransients || !Modifier.isTransient(field.getModifiers()))
                    && (!Modifier.isStatic(field.getModifiers())))&&(__CLR4_1_2773773l3lqxs81.R.iget(9343)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9344)==0&false))) {{
                    __CLR4_1_2773773l3lqxs81.R.inc(9345);try {
                        __CLR4_1_2773773l3lqxs81.R.inc(9346);final Object fieldValue = field.get(object);
                        __CLR4_1_2773773l3lqxs81.R.inc(9347);builder.append(fieldValue);
                    } catch (final IllegalAccessException e) {
                        // this can't happen. Would get a Security exception instead
                        // throw a runtime exception in case the impossible happens.
                        __CLR4_1_2773773l3lqxs81.R.inc(9348);throw new InternalError("Unexpected IllegalAccessException");
                    }
                }
            }}
        }} finally {
            __CLR4_1_2773773l3lqxs81.R.inc(9349);unregister(object);
        }
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * This method uses reflection to build a valid hash code.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the
     * <code>Object</code>.
     * </p>
     *
     * <p>
     * Static fields will not be tested. Superclass fields will be included.
     * </p>
     *
     * <p>
     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,
     * however this is not vital. Prime numbers are preferred, especially for the multiplier.
     * </p>
     *
     * @param initialNonZeroOddNumber
     *            a non-zero, odd number used as the initial value
     * @param multiplierNonZeroOddNumber
     *            a non-zero, odd number used as the multiplier
     * @param object
     *            the Object to create a <code>hashCode</code> for
     * @return int hash code
     * @throws IllegalArgumentException
     *             if the Object is <code>null</code>
     * @throws IllegalArgumentException
     *             if the number is zero or even
     */
    public static int reflectionHashCode(final int initialNonZeroOddNumber, final int multiplierNonZeroOddNumber, final Object object) {try{__CLR4_1_2773773l3lqxs81.R.inc(9350);
        __CLR4_1_2773773l3lqxs81.R.inc(9351);return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, false, null);
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * This method uses reflection to build a valid hash code.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * If the TestTransients parameter is set to <code>true</code>, transient members will be tested, otherwise they
     * are ignored, as they are likely derived fields, and not part of the value of the <code>Object</code>.
     * </p>
     *
     * <p>
     * Static fields will not be tested. Superclass fields will be included.
     * </p>
     *
     * <p>
     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,
     * however this is not vital. Prime numbers are preferred, especially for the multiplier.
     * </p>
     *
     * @param initialNonZeroOddNumber
     *            a non-zero, odd number used as the initial value
     * @param multiplierNonZeroOddNumber
     *            a non-zero, odd number used as the multiplier
     * @param object
     *            the Object to create a <code>hashCode</code> for
     * @param testTransients
     *            whether to include transient fields
     * @return int hash code
     * @throws IllegalArgumentException
     *             if the Object is <code>null</code>
     * @throws IllegalArgumentException
     *             if the number is zero or even
     */
    public static int reflectionHashCode(final int initialNonZeroOddNumber, final int multiplierNonZeroOddNumber, final Object object,
            final boolean testTransients) {try{__CLR4_1_2773773l3lqxs81.R.inc(9352);
        __CLR4_1_2773773l3lqxs81.R.inc(9353);return reflectionHashCode(initialNonZeroOddNumber, multiplierNonZeroOddNumber, object, testTransients, null);
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * This method uses reflection to build a valid hash code.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * If the TestTransients parameter is set to <code>true</code>, transient members will be tested, otherwise they
     * are ignored, as they are likely derived fields, and not part of the value of the <code>Object</code>.
     * </p>
     *
     * <p>
     * Static fields will not be included. Superclass fields will be included up to and including the specified
     * superclass. A null superclass is treated as java.lang.Object.
     * </p>
     *
     * <p>
     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,
     * however this is not vital. Prime numbers are preferred, especially for the multiplier.
     * </p>
     *
     * @param <T>
     *            the type of the object involved
     * @param initialNonZeroOddNumber
     *            a non-zero, odd number used as the initial value
     * @param multiplierNonZeroOddNumber
     *            a non-zero, odd number used as the multiplier
     * @param object
     *            the Object to create a <code>hashCode</code> for
     * @param testTransients
     *            whether to include transient fields
     * @param reflectUpToClass
     *            the superclass to reflect up to (inclusive), may be <code>null</code>
     * @param excludeFields
     *            array of field names to exclude from use in calculation of hash code
     * @return int hash code
     * @throws IllegalArgumentException
     *             if the Object is <code>null</code>
     * @throws IllegalArgumentException
     *             if the number is zero or even
     * @since 2.0
     */
    public static <T> int reflectionHashCode(final int initialNonZeroOddNumber, final int multiplierNonZeroOddNumber, final T object,
            final boolean testTransients, final Class<? super T> reflectUpToClass, final String... excludeFields) {try{__CLR4_1_2773773l3lqxs81.R.inc(9354);

        __CLR4_1_2773773l3lqxs81.R.inc(9355);if ((((object == null)&&(__CLR4_1_2773773l3lqxs81.R.iget(9356)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9357)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9358);throw new IllegalArgumentException("The object to build a hash code for must not be null");
        }
        }__CLR4_1_2773773l3lqxs81.R.inc(9359);final HashCodeBuilder builder = new HashCodeBuilder(initialNonZeroOddNumber, multiplierNonZeroOddNumber);
        __CLR4_1_2773773l3lqxs81.R.inc(9360);Class<?> clazz = object.getClass();
        __CLR4_1_2773773l3lqxs81.R.inc(9361);reflectionAppend(object, clazz, builder, testTransients, excludeFields);
        __CLR4_1_2773773l3lqxs81.R.inc(9362);while ((((clazz.getSuperclass() != null && clazz != reflectUpToClass)&&(__CLR4_1_2773773l3lqxs81.R.iget(9363)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9364)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9365);clazz = clazz.getSuperclass();
            __CLR4_1_2773773l3lqxs81.R.inc(9366);reflectionAppend(object, clazz, builder, testTransients, excludeFields);
        }
        }__CLR4_1_2773773l3lqxs81.R.inc(9367);return builder.toHashCode();
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * This method uses reflection to build a valid hash code.
     * </p>
     *
     * <p>
     * This constructor uses two hard coded choices for the constants needed to build a hash code.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <P>
     * If the TestTransients parameter is set to <code>true</code>, transient members will be tested, otherwise they
     * are ignored, as they are likely derived fields, and not part of the value of the <code>Object</code>.
     * </p>
     *
     * <p>
     * Static fields will not be tested. Superclass fields will be included.
     * </p>
     *
     * @param object
     *            the Object to create a <code>hashCode</code> for
     * @param testTransients
     *            whether to include transient fields
     * @return int hash code
     * @throws IllegalArgumentException
     *             if the object is <code>null</code>
     */
    public static int reflectionHashCode(final Object object, final boolean testTransients) {try{__CLR4_1_2773773l3lqxs81.R.inc(9368);
        __CLR4_1_2773773l3lqxs81.R.inc(9369);return reflectionHashCode(17, 37, object, testTransients, null);
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * This method uses reflection to build a valid hash code.
     * </p>
     *
     * <p>
     * This constructor uses two hard coded choices for the constants needed to build a hash code.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the
     * <code>Object</code>.
     * </p>
     *
     * <p>
     * Static fields will not be tested. Superclass fields will be included.
     * </p>
     *
     * @param object
     *            the Object to create a <code>hashCode</code> for
     * @param excludeFields
     *            Collection of String field names to exclude from use in calculation of hash code
     * @return int hash code
     * @throws IllegalArgumentException
     *             if the object is <code>null</code>
     */
    public static int reflectionHashCode(final Object object, final Collection<String> excludeFields) {try{__CLR4_1_2773773l3lqxs81.R.inc(9370);
        __CLR4_1_2773773l3lqxs81.R.inc(9371);return reflectionHashCode(object, ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    // -------------------------------------------------------------------------

    /**
     * <p>
     * This method uses reflection to build a valid hash code.
     * </p>
     *
     * <p>
     * This constructor uses two hard coded choices for the constants needed to build a hash code.
     * </p>
     *
     * <p>
     * It uses <code>AccessibleObject.setAccessible</code> to gain access to private fields. This means that it will
     * throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
     * also not as efficient as testing explicitly.
     * </p>
     *
     * <p>
     * Transient members will be not be used, as they are likely derived fields, and not part of the value of the
     * <code>Object</code>.
     * </p>
     *
     * <p>
     * Static fields will not be tested. Superclass fields will be included.
     * </p>
     *
     * @param object
     *            the Object to create a <code>hashCode</code> for
     * @param excludeFields
     *            array of field names to exclude from use in calculation of hash code
     * @return int hash code
     * @throws IllegalArgumentException
     *             if the object is <code>null</code>
     */
    public static int reflectionHashCode(final Object object, final String... excludeFields) {try{__CLR4_1_2773773l3lqxs81.R.inc(9372);
        __CLR4_1_2773773l3lqxs81.R.inc(9373);return reflectionHashCode(17, 37, object, false, null, excludeFields);
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Registers the given object. Used by the reflection methods to avoid infinite loops.
     * </p>
     *
     * @param value
     *            The object to register.
     */
    static void register(final Object value) {try{__CLR4_1_2773773l3lqxs81.R.inc(9374);
        __CLR4_1_2773773l3lqxs81.R.inc(9375);synchronized (HashCodeBuilder.class) {
            __CLR4_1_2773773l3lqxs81.R.inc(9376);if ((((getRegistry() == null)&&(__CLR4_1_2773773l3lqxs81.R.iget(9377)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9378)==0&false))) {{
                __CLR4_1_2773773l3lqxs81.R.inc(9379);REGISTRY.set(new HashSet<IDKey>());
            }
        }}
        __CLR4_1_2773773l3lqxs81.R.inc(9380);getRegistry().add(new IDKey(value));
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Unregisters the given object.
     * </p>
     *
     * <p>
     * Used by the reflection methods to avoid infinite loops.
     *
     * @param value
     *            The object to unregister.
     * @since 2.3
     */
    static void unregister(final Object value) {try{__CLR4_1_2773773l3lqxs81.R.inc(9381);
        __CLR4_1_2773773l3lqxs81.R.inc(9382);Set<IDKey> registry = getRegistry();
        __CLR4_1_2773773l3lqxs81.R.inc(9383);if ((((registry != null)&&(__CLR4_1_2773773l3lqxs81.R.iget(9384)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9385)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9386);registry.remove(new IDKey(value));
            __CLR4_1_2773773l3lqxs81.R.inc(9387);synchronized (HashCodeBuilder.class) {
                //read again
                __CLR4_1_2773773l3lqxs81.R.inc(9388);registry = getRegistry();
                __CLR4_1_2773773l3lqxs81.R.inc(9389);if ((((registry != null && registry.isEmpty())&&(__CLR4_1_2773773l3lqxs81.R.iget(9390)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9391)==0&false))) {{
                    __CLR4_1_2773773l3lqxs81.R.inc(9392);REGISTRY.remove();
                }
            }}
        }
    }}finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * Constant to use in building the hashCode.
     */
    private final int iConstant;

    /**
     * Running total of the hashCode.
     */
    private int iTotal = 0;

    /**
     * <p>
     * Uses two hard coded choices for the constants needed to build a <code>hashCode</code>.
     * </p>
     */
    public HashCodeBuilder() {try{__CLR4_1_2773773l3lqxs81.R.inc(9393);
        __CLR4_1_2773773l3lqxs81.R.inc(9394);iConstant = 37;
        __CLR4_1_2773773l3lqxs81.R.inc(9395);iTotal = 17;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,
     * however this is not vital.
     * </p>
     *
     * <p>
     * Prime numbers are preferred, especially for the multiplier.
     * </p>
     *
     * @param initialNonZeroOddNumber
     *            a non-zero, odd number used as the initial value
     * @param multiplierNonZeroOddNumber
     *            a non-zero, odd number used as the multiplier
     * @throws IllegalArgumentException
     *             if the number is zero or even
     */
    public HashCodeBuilder(final int initialNonZeroOddNumber, final int multiplierNonZeroOddNumber) {try{__CLR4_1_2773773l3lqxs81.R.inc(9396);
        __CLR4_1_2773773l3lqxs81.R.inc(9397);if ((((initialNonZeroOddNumber == 0)&&(__CLR4_1_2773773l3lqxs81.R.iget(9398)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9399)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9400);throw new IllegalArgumentException("HashCodeBuilder requires a non zero initial value");
        }
        }__CLR4_1_2773773l3lqxs81.R.inc(9401);if ((((initialNonZeroOddNumber % 2 == 0)&&(__CLR4_1_2773773l3lqxs81.R.iget(9402)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9403)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9404);throw new IllegalArgumentException("HashCodeBuilder requires an odd initial value");
        }
        }__CLR4_1_2773773l3lqxs81.R.inc(9405);if ((((multiplierNonZeroOddNumber == 0)&&(__CLR4_1_2773773l3lqxs81.R.iget(9406)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9407)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9408);throw new IllegalArgumentException("HashCodeBuilder requires a non zero multiplier");
        }
        }__CLR4_1_2773773l3lqxs81.R.inc(9409);if ((((multiplierNonZeroOddNumber % 2 == 0)&&(__CLR4_1_2773773l3lqxs81.R.iget(9410)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9411)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9412);throw new IllegalArgumentException("HashCodeBuilder requires an odd multiplier");
        }
        }__CLR4_1_2773773l3lqxs81.R.inc(9413);iConstant = multiplierNonZeroOddNumber;
        __CLR4_1_2773773l3lqxs81.R.inc(9414);iTotal = initialNonZeroOddNumber;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>boolean</code>.
     * </p>
     * <p>
     * This adds <code>1</code> when true, and <code>0</code> when false to the <code>hashCode</code>.
     * </p>
     * <p>
     * This is in contrast to the standard <code>java.lang.Boolean.hashCode</code> handling, which computes
     * a <code>hashCode</code> value of <code>1231</code> for <code>java.lang.Boolean</code> instances
     * that represent <code>true</code> or <code>1237</code> for <code>java.lang.Boolean</code> instances
     * that represent <code>false</code>.
     * </p>
     * <p>
     * This is in accordance with the <quote>Effective Java</quote> design.
     * </p>
     *
     * @param value
     *            the boolean to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final boolean value) {try{__CLR4_1_2773773l3lqxs81.R.inc(9415);
        __CLR4_1_2773773l3lqxs81.R.inc(9416);iTotal = iTotal * iConstant + ((((value )&&(__CLR4_1_2773773l3lqxs81.R.iget(9417)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9418)==0&false))? 0 : 1);
        __CLR4_1_2773773l3lqxs81.R.inc(9419);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>boolean</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final boolean[] array) {try{__CLR4_1_2773773l3lqxs81.R.inc(9420);
        __CLR4_1_2773773l3lqxs81.R.inc(9421);if ((((array == null)&&(__CLR4_1_2773773l3lqxs81.R.iget(9422)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9423)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9424);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_1_2773773l3lqxs81.R.inc(9425);for (final boolean element : array) {{
                __CLR4_1_2773773l3lqxs81.R.inc(9426);append(element);
            }
        }}
        }__CLR4_1_2773773l3lqxs81.R.inc(9427);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    // -------------------------------------------------------------------------

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>byte</code>.
     * </p>
     *
     * @param value
     *            the byte to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final byte value) {try{__CLR4_1_2773773l3lqxs81.R.inc(9428);
        __CLR4_1_2773773l3lqxs81.R.inc(9429);iTotal = iTotal * iConstant + value;
        __CLR4_1_2773773l3lqxs81.R.inc(9430);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    // -------------------------------------------------------------------------

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>byte</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final byte[] array) {try{__CLR4_1_2773773l3lqxs81.R.inc(9431);
        __CLR4_1_2773773l3lqxs81.R.inc(9432);if ((((array == null)&&(__CLR4_1_2773773l3lqxs81.R.iget(9433)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9434)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9435);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_1_2773773l3lqxs81.R.inc(9436);for (final byte element : array) {{
                __CLR4_1_2773773l3lqxs81.R.inc(9437);append(element);
            }
        }}
        }__CLR4_1_2773773l3lqxs81.R.inc(9438);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>char</code>.
     * </p>
     *
     * @param value
     *            the char to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final char value) {try{__CLR4_1_2773773l3lqxs81.R.inc(9439);
        __CLR4_1_2773773l3lqxs81.R.inc(9440);iTotal = iTotal * iConstant + value;
        __CLR4_1_2773773l3lqxs81.R.inc(9441);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>char</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final char[] array) {try{__CLR4_1_2773773l3lqxs81.R.inc(9442);
        __CLR4_1_2773773l3lqxs81.R.inc(9443);if ((((array == null)&&(__CLR4_1_2773773l3lqxs81.R.iget(9444)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9445)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9446);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_1_2773773l3lqxs81.R.inc(9447);for (final char element : array) {{
                __CLR4_1_2773773l3lqxs81.R.inc(9448);append(element);
            }
        }}
        }__CLR4_1_2773773l3lqxs81.R.inc(9449);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>double</code>.
     * </p>
     *
     * @param value
     *            the double to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final double value) {try{__CLR4_1_2773773l3lqxs81.R.inc(9450);
        __CLR4_1_2773773l3lqxs81.R.inc(9451);return append(Double.doubleToLongBits(value));
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>double</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final double[] array) {try{__CLR4_1_2773773l3lqxs81.R.inc(9452);
        __CLR4_1_2773773l3lqxs81.R.inc(9453);if ((((array == null)&&(__CLR4_1_2773773l3lqxs81.R.iget(9454)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9455)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9456);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_1_2773773l3lqxs81.R.inc(9457);for (final double element : array) {{
                __CLR4_1_2773773l3lqxs81.R.inc(9458);append(element);
            }
        }}
        }__CLR4_1_2773773l3lqxs81.R.inc(9459);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>float</code>.
     * </p>
     *
     * @param value
     *            the float to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final float value) {try{__CLR4_1_2773773l3lqxs81.R.inc(9460);
        __CLR4_1_2773773l3lqxs81.R.inc(9461);iTotal = iTotal * iConstant + Float.floatToIntBits(value);
        __CLR4_1_2773773l3lqxs81.R.inc(9462);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>float</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final float[] array) {try{__CLR4_1_2773773l3lqxs81.R.inc(9463);
        __CLR4_1_2773773l3lqxs81.R.inc(9464);if ((((array == null)&&(__CLR4_1_2773773l3lqxs81.R.iget(9465)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9466)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9467);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_1_2773773l3lqxs81.R.inc(9468);for (final float element : array) {{
                __CLR4_1_2773773l3lqxs81.R.inc(9469);append(element);
            }
        }}
        }__CLR4_1_2773773l3lqxs81.R.inc(9470);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for an <code>int</code>.
     * </p>
     *
     * @param value
     *            the int to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final int value) {try{__CLR4_1_2773773l3lqxs81.R.inc(9471);
        __CLR4_1_2773773l3lqxs81.R.inc(9472);iTotal = iTotal * iConstant + value;
        __CLR4_1_2773773l3lqxs81.R.inc(9473);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for an <code>int</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final int[] array) {try{__CLR4_1_2773773l3lqxs81.R.inc(9474);
        __CLR4_1_2773773l3lqxs81.R.inc(9475);if ((((array == null)&&(__CLR4_1_2773773l3lqxs81.R.iget(9476)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9477)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9478);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_1_2773773l3lqxs81.R.inc(9479);for (final int element : array) {{
                __CLR4_1_2773773l3lqxs81.R.inc(9480);append(element);
            }
        }}
        }__CLR4_1_2773773l3lqxs81.R.inc(9481);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>long</code>.
     * </p>
     *
     * @param value
     *            the long to add to the <code>hashCode</code>
     * @return this
     */
    // NOTE: This method uses >> and not >>> as Effective Java and
    //       Long.hashCode do. Ideally we should switch to >>> at
    //       some stage. There are backwards compat issues, so
    //       that will have to wait for the time being. cf LANG-342.
    public HashCodeBuilder append(final long value) {try{__CLR4_1_2773773l3lqxs81.R.inc(9482);
        __CLR4_1_2773773l3lqxs81.R.inc(9483);iTotal = iTotal * iConstant + ((int) (value ^ (value >> 32)));
        __CLR4_1_2773773l3lqxs81.R.inc(9484);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>long</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final long[] array) {try{__CLR4_1_2773773l3lqxs81.R.inc(9485);
        __CLR4_1_2773773l3lqxs81.R.inc(9486);if ((((array == null)&&(__CLR4_1_2773773l3lqxs81.R.iget(9487)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9488)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9489);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_1_2773773l3lqxs81.R.inc(9490);for (final long element : array) {{
                __CLR4_1_2773773l3lqxs81.R.inc(9491);append(element);
            }
        }}
        }__CLR4_1_2773773l3lqxs81.R.inc(9492);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for an <code>Object</code>.
     * </p>
     *
     * @param object
     *            the Object to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final Object object) {try{__CLR4_1_2773773l3lqxs81.R.inc(9493);
        __CLR4_1_2773773l3lqxs81.R.inc(9494);if ((((object == null)&&(__CLR4_1_2773773l3lqxs81.R.iget(9495)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9496)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9497);iTotal = iTotal * iConstant;

        } }else {{
            __CLR4_1_2773773l3lqxs81.R.inc(9498);if((((object.getClass().isArray())&&(__CLR4_1_2773773l3lqxs81.R.iget(9499)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9500)==0&false))) {{
                // 'Switch' on type of array, to dispatch to the correct handler
                // This handles multi dimensional arrays
                __CLR4_1_2773773l3lqxs81.R.inc(9501);if ((((object instanceof long[])&&(__CLR4_1_2773773l3lqxs81.R.iget(9502)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9503)==0&false))) {{
                    __CLR4_1_2773773l3lqxs81.R.inc(9504);append((long[]) object);
                } }else {__CLR4_1_2773773l3lqxs81.R.inc(9505);if ((((object instanceof int[])&&(__CLR4_1_2773773l3lqxs81.R.iget(9506)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9507)==0&false))) {{
                    __CLR4_1_2773773l3lqxs81.R.inc(9508);append((int[]) object);
                } }else {__CLR4_1_2773773l3lqxs81.R.inc(9509);if ((((object instanceof short[])&&(__CLR4_1_2773773l3lqxs81.R.iget(9510)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9511)==0&false))) {{
                    __CLR4_1_2773773l3lqxs81.R.inc(9512);append((short[]) object);
                } }else {__CLR4_1_2773773l3lqxs81.R.inc(9513);if ((((object instanceof char[])&&(__CLR4_1_2773773l3lqxs81.R.iget(9514)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9515)==0&false))) {{
                    __CLR4_1_2773773l3lqxs81.R.inc(9516);append((char[]) object);
                } }else {__CLR4_1_2773773l3lqxs81.R.inc(9517);if ((((object instanceof byte[])&&(__CLR4_1_2773773l3lqxs81.R.iget(9518)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9519)==0&false))) {{
                    __CLR4_1_2773773l3lqxs81.R.inc(9520);append((byte[]) object);
                } }else {__CLR4_1_2773773l3lqxs81.R.inc(9521);if ((((object instanceof double[])&&(__CLR4_1_2773773l3lqxs81.R.iget(9522)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9523)==0&false))) {{
                    __CLR4_1_2773773l3lqxs81.R.inc(9524);append((double[]) object);
                } }else {__CLR4_1_2773773l3lqxs81.R.inc(9525);if ((((object instanceof float[])&&(__CLR4_1_2773773l3lqxs81.R.iget(9526)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9527)==0&false))) {{
                    __CLR4_1_2773773l3lqxs81.R.inc(9528);append((float[]) object);
                } }else {__CLR4_1_2773773l3lqxs81.R.inc(9529);if ((((object instanceof boolean[])&&(__CLR4_1_2773773l3lqxs81.R.iget(9530)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9531)==0&false))) {{
                    __CLR4_1_2773773l3lqxs81.R.inc(9532);append((boolean[]) object);
                } }else {{
                    // Not an array of primitives
                    __CLR4_1_2773773l3lqxs81.R.inc(9533);append((Object[]) object);
                }
            }}}}}}}}} }else {{
                __CLR4_1_2773773l3lqxs81.R.inc(9534);iTotal = iTotal * iConstant + object.hashCode();
            }
        }}
        }__CLR4_1_2773773l3lqxs81.R.inc(9535);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for an <code>Object</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final Object[] array) {try{__CLR4_1_2773773l3lqxs81.R.inc(9536);
        __CLR4_1_2773773l3lqxs81.R.inc(9537);if ((((array == null)&&(__CLR4_1_2773773l3lqxs81.R.iget(9538)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9539)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9540);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_1_2773773l3lqxs81.R.inc(9541);for (final Object element : array) {{
                __CLR4_1_2773773l3lqxs81.R.inc(9542);append(element);
            }
        }}
        }__CLR4_1_2773773l3lqxs81.R.inc(9543);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>short</code>.
     * </p>
     *
     * @param value
     *            the short to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final short value) {try{__CLR4_1_2773773l3lqxs81.R.inc(9544);
        __CLR4_1_2773773l3lqxs81.R.inc(9545);iTotal = iTotal * iConstant + value;
        __CLR4_1_2773773l3lqxs81.R.inc(9546);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Append a <code>hashCode</code> for a <code>short</code> array.
     * </p>
     *
     * @param array
     *            the array to add to the <code>hashCode</code>
     * @return this
     */
    public HashCodeBuilder append(final short[] array) {try{__CLR4_1_2773773l3lqxs81.R.inc(9547);
        __CLR4_1_2773773l3lqxs81.R.inc(9548);if ((((array == null)&&(__CLR4_1_2773773l3lqxs81.R.iget(9549)!=0|true))||(__CLR4_1_2773773l3lqxs81.R.iget(9550)==0&false))) {{
            __CLR4_1_2773773l3lqxs81.R.inc(9551);iTotal = iTotal * iConstant;
        } }else {{
            __CLR4_1_2773773l3lqxs81.R.inc(9552);for (final short element : array) {{
                __CLR4_1_2773773l3lqxs81.R.inc(9553);append(element);
            }
        }}
        }__CLR4_1_2773773l3lqxs81.R.inc(9554);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Adds the result of super.hashCode() to this builder.
     * </p>
     *
     * @param superHashCode
     *            the result of calling <code>super.hashCode()</code>
     * @return this HashCodeBuilder, used to chain calls.
     * @since 2.0
     */
    public HashCodeBuilder appendSuper(final int superHashCode) {try{__CLR4_1_2773773l3lqxs81.R.inc(9555);
        __CLR4_1_2773773l3lqxs81.R.inc(9556);iTotal = iTotal * iConstant + superHashCode;
        __CLR4_1_2773773l3lqxs81.R.inc(9557);return this;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * Return the computed <code>hashCode</code>.
     * </p>
     *
     * @return <code>hashCode</code> based on the fields appended
     */
    public int toHashCode() {try{__CLR4_1_2773773l3lqxs81.R.inc(9558);
        __CLR4_1_2773773l3lqxs81.R.inc(9559);return iTotal;
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * Returns the computed <code>hashCode</code>.
     *
     * @return <code>hashCode</code> based on the fields appended
     *
     * @since 3.0
     */
    @Override
    public Integer build() {try{__CLR4_1_2773773l3lqxs81.R.inc(9560);
        __CLR4_1_2773773l3lqxs81.R.inc(9561);return Integer.valueOf(toHashCode());
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

    /**
     * <p>
     * The computed <code>hashCode</code> from toHashCode() is returned due to the likelihood
     * of bugs in mis-calling toHashCode() and the unlikeliness of it mattering what the hashCode for
     * HashCodeBuilder itself is.</p>
     *
     * @return <code>hashCode</code> based on the fields appended
     * @since 2.5
     */
    @Override
    public int hashCode() {try{__CLR4_1_2773773l3lqxs81.R.inc(9562);
        __CLR4_1_2773773l3lqxs81.R.inc(9563);return toHashCode();
    }finally{__CLR4_1_2773773l3lqxs81.R.flushNeeded();}}

}
