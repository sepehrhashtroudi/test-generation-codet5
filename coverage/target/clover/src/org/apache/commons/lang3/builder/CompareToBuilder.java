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
import java.util.Comparator;

import org.apache.commons.lang3.ArrayUtils;

/** 
 * Assists in implementing {@link java.lang.Comparable#compareTo(Object)} methods.
 *
 * It is consistent with <code>equals(Object)</code> and
 * <code>hashcode()</code> built with {@link EqualsBuilder} and
 * {@link HashCodeBuilder}.</p>
 *
 * <p>Two Objects that compare equal using <code>equals(Object)</code> should normally
 * also compare equal using <code>compareTo(Object)</code>.</p>
 *
 * <p>All relevant fields should be included in the calculation of the
 * comparison. Derived fields may be ignored. The same fields, in the same
 * order, should be used in both <code>compareTo(Object)</code> and
 * <code>equals(Object)</code>.</p>
 *
 * <p>To use this class write code as follows:</p>
 *
 * <pre>
 * public class MyClass {
 *   String field1;
 *   int field2;
 *   boolean field3;
 *
 *   ...
 *
 *   public int compareTo(Object o) {
 *     MyClass myClass = (MyClass) o;
 *     return new CompareToBuilder()
 *       .appendSuper(super.compareTo(o)
 *       .append(this.field1, myClass.field1)
 *       .append(this.field2, myClass.field2)
 *       .append(this.field3, myClass.field3)
 *       .toComparison();
 *   }
 * }
 * </pre>
 *
 * <p>Alternatively, there are {@link #reflectionCompare(Object, Object) reflectionCompare} methods that use
 * reflection to determine the fields to append. Because fields can be private,
 * <code>reflectionCompare</code> uses {@link java.lang.reflect.AccessibleObject#setAccessible(boolean)} to
 * bypass normal access control checks. This will fail under a security manager,
 * unless the appropriate permissions are set up correctly. It is also
 * slower than appending explicitly.</p>
 *
 * <p>A typical implementation of <code>compareTo(Object)</code> using
 * <code>reflectionCompare</code> looks like:</p>

 * <pre>
 * public int compareTo(Object o) {
 *   return CompareToBuilder.reflectionCompare(this, o);
 * }
 * </pre>
 *
 * @see java.lang.Comparable
 * @see java.lang.Object#equals(Object)
 * @see java.lang.Object#hashCode()
 * @see EqualsBuilder
 * @see HashCodeBuilder
 * @since 1.0
 * @version $Id$
 */
public class CompareToBuilder implements Builder<Integer> {public static class __CLR4_1_26hb6hbl3lqxs6e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,8886,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /**
     * Current state of the comparison as appended fields are checked.
     */
    private int comparison;

    /**
     * <p>Constructor for CompareToBuilder.</p>
     *
     * <p>Starts off assuming that the objects are equal. Multiple calls are 
     * then made to the various append methods, followed by a call to 
     * {@link #toComparison} to get the result.</p>
     */
    public CompareToBuilder() {
        super();__CLR4_1_26hb6hbl3lqxs6e.R.inc(8400);try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8399);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8401);comparison = 0;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /** 
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>Transient members will be not be compared, as they are likely derived
     *     fields</li>
     * <li>Superclass fields will be compared</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either (but not both) parameters are
     *  <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     */
    public static int reflectionCompare(final Object lhs, final Object rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8402);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8403);return reflectionCompare(lhs, rhs, false, null);
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>If <code>compareTransients</code> is <code>true</code>,
     *     compares transient members.  Otherwise ignores them, as they
     *     are likely derived fields.</li>
     * <li>Superclass fields will be compared</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param compareTransients  whether to compare transient fields
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either <code>lhs</code> or <code>rhs</code>
     *  (but not both) is <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     */
    public static int reflectionCompare(final Object lhs, final Object rhs, final boolean compareTransients) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8404);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8405);return reflectionCompare(lhs, rhs, compareTransients, null);
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>If <code>compareTransients</code> is <code>true</code>,
     *     compares transient members.  Otherwise ignores them, as they
     *     are likely derived fields.</li>
     * <li>Superclass fields will be compared</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param excludeFields  Collection of String fields to exclude
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either <code>lhs</code> or <code>rhs</code>
     *  (but not both) is <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.2
     */
    public static int reflectionCompare(final Object lhs, final Object rhs, final Collection<String> excludeFields) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8406);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8407);return reflectionCompare(lhs, rhs, ReflectionToStringBuilder.toNoNullStringArray(excludeFields));
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>If <code>compareTransients</code> is <code>true</code>,
     *     compares transient members.  Otherwise ignores them, as they
     *     are likely derived fields.</li>
     * <li>Superclass fields will be compared</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param excludeFields  array of fields to exclude
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either <code>lhs</code> or <code>rhs</code>
     *  (but not both) is <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.2
     */
    public static int reflectionCompare(final Object lhs, final Object rhs, final String... excludeFields) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8408);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8409);return reflectionCompare(lhs, rhs, false, null, excludeFields);
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Compares two <code>Object</code>s via reflection.</p>
     *
     * <p>Fields can be private, thus <code>AccessibleObject.setAccessible</code>
     * is used to bypass normal access control checks. This will fail under a 
     * security manager unless the appropriate permissions are set.</p>
     *
     * <ul>
     * <li>Static fields will not be compared</li>
     * <li>If the <code>compareTransients</code> is <code>true</code>,
     *     compares transient members.  Otherwise ignores them, as they
     *     are likely derived fields.</li>
     * <li>Compares superclass fields up to and including <code>reflectUpToClass</code>.
     *     If <code>reflectUpToClass</code> is <code>null</code>, compares all superclass fields.</li>
     * </ul>
     *
     * <p>If both <code>lhs</code> and <code>rhs</code> are <code>null</code>,
     * they are considered equal.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param compareTransients  whether to compare transient fields
     * @param reflectUpToClass  last superclass for which fields are compared
     * @param excludeFields  fields to exclude
     * @return a negative integer, zero, or a positive integer as <code>lhs</code>
     *  is less than, equal to, or greater than <code>rhs</code>
     * @throws NullPointerException  if either <code>lhs</code> or <code>rhs</code>
     *  (but not both) is <code>null</code>
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.2 (2.0 as <code>reflectionCompare(Object, Object, boolean, Class)</code>)
     */
    public static int reflectionCompare(
        final Object lhs, 
        final Object rhs, 
        final boolean compareTransients, 
        final Class<?> reflectUpToClass, 
        final String... excludeFields) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8410);

        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8411);if ((((lhs == rhs)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8412)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8413)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8414);return 0;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8415);if ((((lhs == null || rhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8416)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8417)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8418);throw new NullPointerException();
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8419);Class<?> lhsClazz = lhs.getClass();
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8420);if ((((!lhsClazz.isInstance(rhs))&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8421)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8422)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8423);throw new ClassCastException();
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8424);final CompareToBuilder compareToBuilder = new CompareToBuilder();
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8425);reflectionAppend(lhs, rhs, lhsClazz, compareToBuilder, compareTransients, excludeFields);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8426);while ((((lhsClazz.getSuperclass() != null && lhsClazz != reflectUpToClass)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8427)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8428)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8429);lhsClazz = lhsClazz.getSuperclass();
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8430);reflectionAppend(lhs, rhs, lhsClazz, compareToBuilder, compareTransients, excludeFields);
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8431);return compareToBuilder.toComparison();
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Appends to <code>builder</code> the comparison of <code>lhs</code>
     * to <code>rhs</code> using the fields defined in <code>clazz</code>.</p>
     * 
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param clazz  <code>Class</code> that defines fields to be compared
     * @param builder  <code>CompareToBuilder</code> to append to
     * @param useTransients  whether to compare transient fields
     * @param excludeFields  fields to exclude
     */
    private static void reflectionAppend(
        final Object lhs,
        final Object rhs,
        final Class<?> clazz,
        final CompareToBuilder builder,
        final boolean useTransients,
        final String[] excludeFields) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8432);
        
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8433);final Field[] fields = clazz.getDeclaredFields();
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8434);AccessibleObject.setAccessible(fields, true);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8435);for (int i = 0; (((i < fields.length && builder.comparison == 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8436)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8437)==0&false)); i++) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8438);final Field f = fields[i];
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8439);if ((((!ArrayUtils.contains(excludeFields, f.getName())
                && (f.getName().indexOf('$') == -1)
                && (useTransients || !Modifier.isTransient(f.getModifiers()))
                && (!Modifier.isStatic(f.getModifiers())))&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8440)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8441)==0&false))) {{
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8442);try {
                    __CLR4_1_26hb6hbl3lqxs6e.R.inc(8443);builder.append(f.get(lhs), f.get(rhs));
                } catch (final IllegalAccessException e) {
                    // This can't happen. Would get a Security exception instead.
                    // Throw a runtime exception in case the impossible happens.
                    __CLR4_1_26hb6hbl3lqxs6e.R.inc(8444);throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }}
    }}finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Appends to the <code>builder</code> the <code>compareTo(Object)</code>
     * result of the superclass.</p>
     *
     * @param superCompareTo  result of calling <code>super.compareTo(Object)</code>
     * @return this - used to chain append calls
     * @since 2.0
     */
    public CompareToBuilder appendSuper(final int superCompareTo) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8445);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8446);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8447)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8448)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8449);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8450);comparison = superCompareTo;
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8451);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * <p>Appends to the <code>builder</code> the comparison of
     * two <code>Object</code>s.</p>
     *
     * <ol>
     * <li>Check if <code>lhs == rhs</code></li>
     * <li>Check if either <code>lhs</code> or <code>rhs</code> is <code>null</code>,
     *     a <code>null</code> object is less than a non-<code>null</code> object</li>
     * <li>Check the object contents</li>
     * </ol>
     * 
     * <p><code>lhs</code> must either be an array or implement {@link Comparable}.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @return this - used to chain append calls
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     */
    public CompareToBuilder append(final Object lhs, final Object rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8452);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8453);return append(lhs, rhs, null);
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the comparison of
     * two <code>Object</code>s.</p>
     *
     * <ol>
     * <li>Check if <code>lhs == rhs</code></li>
     * <li>Check if either <code>lhs</code> or <code>rhs</code> is <code>null</code>,
     *     a <code>null</code> object is less than a non-<code>null</code> object</li>
     * <li>Check the object contents</li>
     * </ol>
     *
     * <p>If <code>lhs</code> is an array, array comparison methods will be used.
     * Otherwise <code>comparator</code> will be used to compare the objects.
     * If <code>comparator</code> is <code>null</code>, <code>lhs</code> must
     * implement {@link Comparable} instead.</p>
     *
     * @param lhs  left-hand object
     * @param rhs  right-hand object
     * @param comparator  <code>Comparator</code> used to compare the objects,
     *  <code>null</code> means treat lhs as <code>Comparable</code>
     * @return this - used to chain append calls
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.0
     */
    public CompareToBuilder append(final Object lhs, final Object rhs, final Comparator<?> comparator) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8454);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8455);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8456)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8457)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8458);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8459);if ((((lhs == rhs)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8460)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8461)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8462);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8463);if ((((lhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8464)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8465)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8466);comparison = -1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8467);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8468);if ((((rhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8469)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8470)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8471);comparison = +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8472);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8473);if ((((lhs.getClass().isArray())&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8474)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8475)==0&false))) {{
            // switch on type of array, to dispatch to the correct handler
            // handles multi dimensional arrays
            // throws a ClassCastException if rhs is not the correct array type
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8476);if ((((lhs instanceof long[])&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8477)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8478)==0&false))) {{
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8479);append((long[]) lhs, (long[]) rhs);
            } }else {__CLR4_1_26hb6hbl3lqxs6e.R.inc(8480);if ((((lhs instanceof int[])&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8481)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8482)==0&false))) {{
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8483);append((int[]) lhs, (int[]) rhs);
            } }else {__CLR4_1_26hb6hbl3lqxs6e.R.inc(8484);if ((((lhs instanceof short[])&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8485)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8486)==0&false))) {{
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8487);append((short[]) lhs, (short[]) rhs);
            } }else {__CLR4_1_26hb6hbl3lqxs6e.R.inc(8488);if ((((lhs instanceof char[])&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8489)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8490)==0&false))) {{
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8491);append((char[]) lhs, (char[]) rhs);
            } }else {__CLR4_1_26hb6hbl3lqxs6e.R.inc(8492);if ((((lhs instanceof byte[])&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8493)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8494)==0&false))) {{
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8495);append((byte[]) lhs, (byte[]) rhs);
            } }else {__CLR4_1_26hb6hbl3lqxs6e.R.inc(8496);if ((((lhs instanceof double[])&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8497)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8498)==0&false))) {{
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8499);append((double[]) lhs, (double[]) rhs);
            } }else {__CLR4_1_26hb6hbl3lqxs6e.R.inc(8500);if ((((lhs instanceof float[])&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8501)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8502)==0&false))) {{
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8503);append((float[]) lhs, (float[]) rhs);
            } }else {__CLR4_1_26hb6hbl3lqxs6e.R.inc(8504);if ((((lhs instanceof boolean[])&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8505)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8506)==0&false))) {{
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8507);append((boolean[]) lhs, (boolean[]) rhs);
            } }else {{
                // not an array of primitives
                // throws a ClassCastException if rhs is not an array
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8508);append((Object[]) lhs, (Object[]) rhs, comparator);
            }
        }}}}}}}}} }else {{
            // the simple case, not an array, just test the element
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8509);if ((((comparator == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8510)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8511)==0&false))) {{
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8512);@SuppressWarnings("unchecked") // assume this can be done; if not throw CCE as per Javadoc
                final Comparable<Object> comparable = (Comparable<Object>) lhs;
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8513);comparison = comparable.compareTo(rhs);
            } }else {{
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8514);@SuppressWarnings("unchecked") // assume this can be done; if not throw CCE as per Javadoc
                final Comparator<Object> comparator2 = (Comparator<Object>) comparator;
                __CLR4_1_26hb6hbl3lqxs6e.R.inc(8515);comparison = comparator2.compare(lhs, rhs);
            }
        }}
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8516);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    //-------------------------------------------------------------------------
    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>long</code>s.
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final long lhs, final long rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8517);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8518);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8519)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8520)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8521);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8522);comparison = (((((lhs < rhs) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8523)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8524)==0&false))? -1 : (((((lhs > rhs) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8525)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8526)==0&false))? 1 : 0));
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8527);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>int</code>s.
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final int lhs, final int rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8528);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8529);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8530)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8531)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8532);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8533);comparison = (((((lhs < rhs) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8534)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8535)==0&false))? -1 : (((((lhs > rhs) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8536)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8537)==0&false))? 1 : 0));
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8538);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>short</code>s.
     * 
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final short lhs, final short rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8539);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8540);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8541)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8542)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8543);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8544);comparison = (((((lhs < rhs) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8545)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8546)==0&false))? -1 : (((((lhs > rhs) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8547)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8548)==0&false))? 1 : 0));
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8549);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>char</code>s.
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final char lhs, final char rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8550);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8551);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8552)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8553)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8554);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8555);comparison = (((((lhs < rhs) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8556)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8557)==0&false))? -1 : (((((lhs > rhs) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8558)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8559)==0&false))? 1 : 0));
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8560);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>byte</code>s.
     * 
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final byte lhs, final byte rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8561);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8562);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8563)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8564)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8565);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8566);comparison = (((((lhs < rhs) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8567)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8568)==0&false))? -1 : (((((lhs > rhs) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8569)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8570)==0&false))? 1 : 0));
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8571);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the comparison of
     * two <code>double</code>s.</p>
     *
     * <p>This handles NaNs, Infinities, and <code>-0.0</code>.</p>
     *
     * <p>It is compatible with the hash code generated by
     * <code>HashCodeBuilder</code>.</p>
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final double lhs, final double rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8572);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8573);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8574)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8575)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8576);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8577);comparison = Double.compare(lhs, rhs);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8578);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the comparison of
     * two <code>float</code>s.</p>
     *
     * <p>This handles NaNs, Infinities, and <code>-0.0</code>.</p>
     *
     * <p>It is compatible with the hash code generated by
     * <code>HashCodeBuilder</code>.</p>
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final float lhs, final float rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8579);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8580);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8581)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8582)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8583);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8584);comparison = Float.compare(lhs, rhs);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8585);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * Appends to the <code>builder</code> the comparison of
     * two <code>booleans</code>s.
     *
     * @param lhs  left-hand value
     * @param rhs  right-hand value
     * @return this - used to chain append calls
      */
    public CompareToBuilder append(final boolean lhs, final boolean rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8586);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8587);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8588)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8589)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8590);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8591);if ((((lhs == rhs)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8592)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8593)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8594);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8595);if ((((lhs == false)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8596)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8597)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8598);comparison = -1;
        } }else {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8599);comparison = +1;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8600);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>Object</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a short length array is less than a long length array</li>
     *  <li>Check array contents element by element using {@link #append(Object, Object, Comparator)}</li>
     * </ol>
     *
     * <p>This method will also will be called for the top level of multi-dimensional,
     * ragged, and multi-typed arrays.</p>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     */
    public CompareToBuilder append(final Object[] lhs, final Object[] rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8601);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8602);return append(lhs, rhs, null);
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}
    
    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>Object</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a short length array is less than a long length array</li>
     *  <li>Check array contents element by element using {@link #append(Object, Object, Comparator)}</li>
     * </ol>
     *
     * <p>This method will also will be called for the top level of multi-dimensional,
     * ragged, and multi-typed arrays.</p>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @param comparator  <code>Comparator</code> to use to compare the array elements,
     *  <code>null</code> means to treat <code>lhs</code> elements as <code>Comparable</code>.
     * @return this - used to chain append calls
     * @throws ClassCastException  if <code>rhs</code> is not assignment-compatible
     *  with <code>lhs</code>
     * @since 2.0
     */
    public CompareToBuilder append(final Object[] lhs, final Object[] rhs, final Comparator<?> comparator) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8603);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8604);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8605)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8606)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8607);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8608);if ((((lhs == rhs)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8609)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8610)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8611);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8612);if ((((lhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8613)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8614)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8615);comparison = -1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8616);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8617);if ((((rhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8618)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8619)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8620);comparison = +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8621);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8622);if ((((lhs.length != rhs.length)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8623)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8624)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8625);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8626)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8627)==0&false))? -1 : +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8628);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8629);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8630)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8631)==0&false)); i++) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8632);append(lhs[i], rhs[i], comparator);
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8633);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>long</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(long, long)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final long[] lhs, final long[] rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8634);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8635);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8636)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8637)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8638);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8639);if ((((lhs == rhs)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8640)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8641)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8642);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8643);if ((((lhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8644)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8645)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8646);comparison = -1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8647);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8648);if ((((rhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8649)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8650)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8651);comparison = +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8652);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8653);if ((((lhs.length != rhs.length)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8654)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8655)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8656);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8657)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8658)==0&false))? -1 : +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8659);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8660);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8661)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8662)==0&false)); i++) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8663);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8664);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>int</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(int, int)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final int[] lhs, final int[] rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8665);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8666);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8667)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8668)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8669);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8670);if ((((lhs == rhs)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8671)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8672)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8673);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8674);if ((((lhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8675)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8676)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8677);comparison = -1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8678);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8679);if ((((rhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8680)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8681)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8682);comparison = +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8683);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8684);if ((((lhs.length != rhs.length)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8685)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8686)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8687);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8688)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8689)==0&false))? -1 : +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8690);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8691);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8692)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8693)==0&false)); i++) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8694);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8695);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>short</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(short, short)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final short[] lhs, final short[] rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8696);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8697);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8698)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8699)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8700);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8701);if ((((lhs == rhs)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8702)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8703)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8704);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8705);if ((((lhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8706)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8707)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8708);comparison = -1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8709);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8710);if ((((rhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8711)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8712)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8713);comparison = +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8714);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8715);if ((((lhs.length != rhs.length)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8716)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8717)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8718);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8719)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8720)==0&false))? -1 : +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8721);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8722);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8723)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8724)==0&false)); i++) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8725);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8726);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>char</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(char, char)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final char[] lhs, final char[] rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8727);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8728);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8729)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8730)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8731);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8732);if ((((lhs == rhs)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8733)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8734)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8735);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8736);if ((((lhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8737)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8738)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8739);comparison = -1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8740);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8741);if ((((rhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8742)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8743)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8744);comparison = +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8745);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8746);if ((((lhs.length != rhs.length)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8747)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8748)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8749);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8750)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8751)==0&false))? -1 : +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8752);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8753);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8754)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8755)==0&false)); i++) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8756);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8757);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>byte</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(byte, byte)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final byte[] lhs, final byte[] rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8758);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8759);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8760)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8761)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8762);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8763);if ((((lhs == rhs)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8764)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8765)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8766);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8767);if ((((lhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8768)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8769)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8770);comparison = -1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8771);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8772);if ((((rhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8773)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8774)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8775);comparison = +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8776);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8777);if ((((lhs.length != rhs.length)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8778)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8779)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8780);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8781)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8782)==0&false))? -1 : +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8783);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8784);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8785)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8786)==0&false)); i++) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8787);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8788);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>double</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(double, double)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final double[] lhs, final double[] rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8789);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8790);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8791)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8792)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8793);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8794);if ((((lhs == rhs)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8795)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8796)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8797);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8798);if ((((lhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8799)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8800)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8801);comparison = -1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8802);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8803);if ((((rhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8804)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8805)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8806);comparison = +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8807);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8808);if ((((lhs.length != rhs.length)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8809)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8810)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8811);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8812)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8813)==0&false))? -1 : +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8814);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8815);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8816)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8817)==0&false)); i++) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8818);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8819);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>float</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(float, float)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final float[] lhs, final float[] rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8820);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8821);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8822)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8823)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8824);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8825);if ((((lhs == rhs)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8826)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8827)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8828);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8829);if ((((lhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8830)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8831)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8832);comparison = -1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8833);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8834);if ((((rhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8835)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8836)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8837);comparison = +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8838);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8839);if ((((lhs.length != rhs.length)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8840)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8841)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8842);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8843)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8844)==0&false))? -1 : +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8845);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8846);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8847)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8848)==0&false)); i++) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8849);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8850);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * <p>Appends to the <code>builder</code> the deep comparison of
     * two <code>boolean</code> arrays.</p>
     *
     * <ol>
     *  <li>Check if arrays are the same using <code>==</code></li>
     *  <li>Check if for <code>null</code>, <code>null</code> is less than non-<code>null</code></li>
     *  <li>Check array length, a shorter length array is less than a longer length array</li>
     *  <li>Check array contents element by element using {@link #append(boolean, boolean)}</li>
     * </ol>
     *
     * @param lhs  left-hand array
     * @param rhs  right-hand array
     * @return this - used to chain append calls
     */
    public CompareToBuilder append(final boolean[] lhs, final boolean[] rhs) {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8851);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8852);if ((((comparison != 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8853)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8854)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8855);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8856);if ((((lhs == rhs)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8857)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8858)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8859);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8860);if ((((lhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8861)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8862)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8863);comparison = -1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8864);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8865);if ((((rhs == null)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8866)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8867)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8868);comparison = +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8869);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8870);if ((((lhs.length != rhs.length)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8871)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8872)==0&false))) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8873);comparison = ((((lhs.length < rhs.length) )&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8874)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8875)==0&false))? -1 : +1;
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8876);return this;
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8877);for (int i = 0; (((i < lhs.length && comparison == 0)&&(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8878)!=0|true))||(__CLR4_1_26hb6hbl3lqxs6e.R.iget(8879)==0&false)); i++) {{
            __CLR4_1_26hb6hbl3lqxs6e.R.inc(8880);append(lhs[i], rhs[i]);
        }
        }__CLR4_1_26hb6hbl3lqxs6e.R.inc(8881);return this;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns a negative integer, a positive integer, or zero as
     * the <code>builder</code> has judged the "left-hand" side
     * as less than, greater than, or equal to the "right-hand"
     * side.
     * 
     * @return final comparison result
     * @see #build()
     */
    public int toComparison() {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8882);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8883);return comparison;
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}

    /**
     * Returns a negative Integer, a positive Integer, or zero as
     * the <code>builder</code> has judged the "left-hand" side
     * as less than, greater than, or equal to the "right-hand"
     * side.
     * 
     * @return final comparison result as an Integer
     * @see #toComparison()
     * @since 3.0
     */
    @Override
    public Integer build() {try{__CLR4_1_26hb6hbl3lqxs6e.R.inc(8884);
        __CLR4_1_26hb6hbl3lqxs6e.R.inc(8885);return Integer.valueOf(toComparison());
    }finally{__CLR4_1_26hb6hbl3lqxs6e.R.flushNeeded();}}
}

