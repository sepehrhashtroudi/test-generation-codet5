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
package org.apache.commons.lang3;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import org.apache.commons.lang3.exception.CloneFailedException;
import org.apache.commons.lang3.mutable.MutableInt;

/**
 * <p>Operations on {@code Object}.</p>
 *
 * <p>This class tries to handle {@code null} input gracefully.
 * An exception will generally not be thrown for a {@code null} input.
 * Each method documents its behaviour in more detail.</p>
 *
 * <p>#ThreadSafe#</p>
 * @since 1.0
 * @version $Id$
 */
//@Immutable
public class ObjectUtils {public static class __CLR4_1_23vk3vkl3lqxrvm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,5237,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>Singleton used as a {@code null} placeholder where
     * {@code null} has another meaning.</p>
     *
     * <p>For example, in a {@code HashMap} the
     * {@link java.util.HashMap#get(java.lang.Object)} method returns
     * {@code null} if the {@code Map} contains {@code null} or if there
     * is no matching key. The {@code Null} placeholder can be used to
     * distinguish between these two cases.</p>
     *
     * <p>Another example is {@code Hashtable}, where {@code null}
     * cannot be stored.</p>
     *
     * <p>This instance is Serializable.</p>
     */
    public static final Null NULL = new Null();

    /**
     * <p>{@code ObjectUtils} instances should NOT be constructed in
     * standard programming. Instead, the static methods on the class should
     * be used, such as {@code ObjectUtils.defaultIfNull("a","b");}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public ObjectUtils() {
        super();__CLR4_1_23vk3vkl3lqxrvm.R.inc(5025);try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5024);
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    // Defaulting
    //-----------------------------------------------------------------------
    /**
     * <p>Returns a default value if the object passed is {@code null}.</p>
     *
     * <pre>
     * ObjectUtils.defaultIfNull(null, null)      = null
     * ObjectUtils.defaultIfNull(null, "")        = ""
     * ObjectUtils.defaultIfNull(null, "zz")      = "zz"
     * ObjectUtils.defaultIfNull("abc", *)        = "abc"
     * ObjectUtils.defaultIfNull(Boolean.TRUE, *) = Boolean.TRUE
     * </pre>
     *
     * @param <T> the type of the object
     * @param object  the {@code Object} to test, may be {@code null}
     * @param defaultValue  the default value to return, may be {@code null}
     * @return {@code object} if it is not {@code null}, defaultValue otherwise
     */
    public static <T> T defaultIfNull(final T object, final T defaultValue) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5026);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5027);return (((object != null )&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5028)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5029)==0&false))? object : defaultValue;
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * <p>Returns the first value in the array which is not {@code null}.
     * If all the values are {@code null} or the array is {@code null}
     * or empty then {@code null} is returned.</p>
     *
     * <pre>
     * ObjectUtils.firstNonNull(null, null)      = null
     * ObjectUtils.firstNonNull(null, "")        = ""
     * ObjectUtils.firstNonNull(null, null, "")  = ""
     * ObjectUtils.firstNonNull(null, "zz")      = "zz"
     * ObjectUtils.firstNonNull("abc", *)        = "abc"
     * ObjectUtils.firstNonNull(null, "xyz", *)  = "xyz"
     * ObjectUtils.firstNonNull(Boolean.TRUE, *) = Boolean.TRUE
     * ObjectUtils.firstNonNull()                = null
     * </pre>
     *
     * @param <T> the component type of the array
     * @param values  the values to test, may be {@code null} or empty
     * @return the first value from {@code values} which is not {@code null},
     *  or {@code null} if there are no non-null values
     * @since 3.0
     */
    public static <T> T firstNonNull(final T... values) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5030);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5031);if ((((values != null)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5032)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5033)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5034);for (final T val : values) {{
                __CLR4_1_23vk3vkl3lqxrvm.R.inc(5035);if ((((val != null)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5036)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5037)==0&false))) {{
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5038);return val;
                }
            }}
        }}
        }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5039);return null;
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    // Null-safe equals/hashCode
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two objects for equality, where either one or both
     * objects may be {@code null}.</p>
     *
     * <pre>
     * ObjectUtils.equals(null, null)                  = true
     * ObjectUtils.equals(null, "")                    = false
     * ObjectUtils.equals("", null)                    = false
     * ObjectUtils.equals("", "")                      = true
     * ObjectUtils.equals(Boolean.TRUE, null)          = false
     * ObjectUtils.equals(Boolean.TRUE, "true")        = false
     * ObjectUtils.equals(Boolean.TRUE, Boolean.TRUE)  = true
     * ObjectUtils.equals(Boolean.TRUE, Boolean.FALSE) = false
     * </pre>
     *
     * @param object1  the first object, may be {@code null}
     * @param object2  the second object, may be {@code null}
     * @return {@code true} if the values of both objects are the same
     */
    public static boolean equals(final Object object1, final Object object2) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5040);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5041);if ((((object1 == object2)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5042)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5043)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5044);return true;
        }
        }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5045);if ((((object1 == null || object2 == null)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5046)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5047)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5048);return false;
        }
        }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5049);return object1.equals(object2);
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * <p>Compares two objects for inequality, where either one or both
     * objects may be {@code null}.</p>
     *
     * <pre>
     * ObjectUtils.notEqual(null, null)                  = false
     * ObjectUtils.notEqual(null, "")                    = true
     * ObjectUtils.notEqual("", null)                    = true
     * ObjectUtils.notEqual("", "")                      = false
     * ObjectUtils.notEqual(Boolean.TRUE, null)          = true
     * ObjectUtils.notEqual(Boolean.TRUE, "true")        = true
     * ObjectUtils.notEqual(Boolean.TRUE, Boolean.TRUE)  = false
     * ObjectUtils.notEqual(Boolean.TRUE, Boolean.FALSE) = true
     * </pre>
     *
     * @param object1  the first object, may be {@code null}
     * @param object2  the second object, may be {@code null}
     * @return {@code false} if the values of both objects are the same
     */
    public static boolean notEqual(final Object object1, final Object object2) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5050);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5051);return ObjectUtils.equals(object1, object2) == false;
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * <p>Gets the hash code of an object returning zero when the
     * object is {@code null}.</p>
     *
     * <pre>
     * ObjectUtils.hashCode(null)   = 0
     * ObjectUtils.hashCode(obj)    = obj.hashCode()
     * </pre>
     *
     * @param obj  the object to obtain the hash code of, may be {@code null}
     * @return the hash code of the object, or zero if null
     * @since 2.1
     */
    public static int hashCode(final Object obj) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5052);
        // hashCode(Object) retained for performance, as hash code is often critical
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5053);return (((obj == null )&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5054)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5055)==0&false))? 0 : obj.hashCode();
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * <p>Gets the hash code for multiple objects.</p>
     * 
     * <p>This allows a hash code to be rapidly calculated for a number of objects.
     * The hash code for a single object is the <em>not</em> same as {@link #hashCode(Object)}.
     * The hash code for multiple objects is the same as that calculated by an
     * {@code ArrayList} containing the specified objects.</p>
     *
     * <pre>
     * ObjectUtils.hashCodeMulti()                 = 1
     * ObjectUtils.hashCodeMulti((Object[]) null)  = 1
     * ObjectUtils.hashCodeMulti(a)                = 31 + a.hashCode()
     * ObjectUtils.hashCodeMulti(a,b)              = (31 + a.hashCode()) * 31 + b.hashCode()
     * ObjectUtils.hashCodeMulti(a,b,c)            = ((31 + a.hashCode()) * 31 + b.hashCode()) * 31 + c.hashCode()
     * </pre>
     *
     * @param objects  the objects to obtain the hash code of, may be {@code null}
     * @return the hash code of the objects, or zero if null
     * @since 3.0
     */
    public static int hashCodeMulti(final Object... objects) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5056);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5057);int hash = 1;
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5058);if ((((objects != null)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5059)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5060)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5061);for (final Object object : objects) {{
                __CLR4_1_23vk3vkl3lqxrvm.R.inc(5062);hash = hash * 31 + ObjectUtils.hashCode(object);
            }
        }}
        }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5063);return hash;
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    // Identity ToString
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the toString that would be produced by {@code Object}
     * if a class did not override toString itself. {@code null}
     * will return {@code null}.</p>
     *
     * <pre>
     * ObjectUtils.identityToString(null)         = null
     * ObjectUtils.identityToString("")           = "java.lang.String@1e23"
     * ObjectUtils.identityToString(Boolean.TRUE) = "java.lang.Boolean@7fa"
     * </pre>
     *
     * @param object  the object to create a toString for, may be
     *  {@code null}
     * @return the default toString text, or {@code null} if
     *  {@code null} passed in
     */
    public static String identityToString(final Object object) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5064);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5065);if ((((object == null)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5066)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5067)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5068);return null;
        }
        }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5069);final StringBuffer buffer = new StringBuffer();
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5070);identityToString(buffer, object);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5071);return buffer.toString();
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * <p>Appends the toString that would be produced by {@code Object}
     * if a class did not override toString itself. {@code null}
     * will throw a NullPointerException for either of the two parameters. </p>
     *
     * <pre>
     * ObjectUtils.identityToString(buf, "")            = buf.append("java.lang.String@1e23"
     * ObjectUtils.identityToString(buf, Boolean.TRUE)  = buf.append("java.lang.Boolean@7fa"
     * ObjectUtils.identityToString(buf, Boolean.TRUE)  = buf.append("java.lang.Boolean@7fa")
     * </pre>
     *
     * @param buffer  the buffer to append to
     * @param object  the object to create a toString for
     * @since 2.4
     */
    public static void identityToString(final StringBuffer buffer, final Object object) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5072);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5073);if ((((object == null)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5074)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5075)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5076);throw new NullPointerException("Cannot get the toString of a null identity");
        }
        }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5077);buffer.append(object.getClass().getName())
              .append('@')
              .append(Integer.toHexString(System.identityHashCode(object)));
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    // ToString
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the {@code toString} of an {@code Object} returning
     * an empty string ("") if {@code null} input.</p>
     *
     * <pre>
     * ObjectUtils.toString(null)         = ""
     * ObjectUtils.toString("")           = ""
     * ObjectUtils.toString("bat")        = "bat"
     * ObjectUtils.toString(Boolean.TRUE) = "true"
     * </pre>
     *
     * @see StringUtils#defaultString(String)
     * @see String#valueOf(Object)
     * @param obj  the Object to {@code toString}, may be null
     * @return the passed in Object's toString, or {@code ""} if {@code null} input
     * @since 2.0
     */
    public static String toString(final Object obj) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5078);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5079);return (((obj == null )&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5080)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5081)==0&false))? "" : obj.toString();
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * <p>Gets the {@code toString} of an {@code Object} returning
     * a specified text if {@code null} input.</p>
     *
     * <pre>
     * ObjectUtils.toString(null, null)           = null
     * ObjectUtils.toString(null, "null")         = "null"
     * ObjectUtils.toString("", "null")           = ""
     * ObjectUtils.toString("bat", "null")        = "bat"
     * ObjectUtils.toString(Boolean.TRUE, "null") = "true"
     * </pre>
     *
     * @see StringUtils#defaultString(String,String)
     * @see String#valueOf(Object)
     * @param obj  the Object to {@code toString}, may be null
     * @param nullStr  the String to return if {@code null} input, may be null
     * @return the passed in Object's toString, or {@code nullStr} if {@code null} input
     * @since 2.0
     */
    public static String toString(final Object obj, final String nullStr) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5082);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5083);return (((obj == null )&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5084)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5085)==0&false))? nullStr : obj.toString();
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    // Comparable
    //-----------------------------------------------------------------------
    /**
     * <p>Null safe comparison of Comparables.</p>
     *
     * @param <T> type of the values processed by this method
     * @param values the set of comparable values, may be null
     * @return
     *  <ul>
     *   <li>If any objects are non-null and unequal, the lesser object.
     *   <li>If all objects are non-null and equal, the first.
     *   <li>If any of the comparables are null, the lesser of the non-null objects.
     *   <li>If all the comparables are null, null is returned.
     *  </ul>
     */
    public static <T extends Comparable<? super T>> T min(final T... values) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5086);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5087);T result = null;
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5088);if ((((values != null)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5089)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5090)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5091);for (final T value : values) {{
                __CLR4_1_23vk3vkl3lqxrvm.R.inc(5092);if ((((compare(value, result, true) < 0)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5093)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5094)==0&false))) {{
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5095);result = value;
                }
            }}
        }}
        }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5096);return result;
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * <p>Null safe comparison of Comparables.</p>
     *
     * @param <T> type of the values processed by this method
     * @param values the set of comparable values, may be null
     * @return
     *  <ul>
     *   <li>If any objects are non-null and unequal, the greater object.
     *   <li>If all objects are non-null and equal, the first.
     *   <li>If any of the comparables are null, the greater of the non-null objects.
     *   <li>If all the comparables are null, null is returned.
     *  </ul>
     */
    public static <T extends Comparable<? super T>> T max(final T... values) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5097);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5098);T result = null;
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5099);if ((((values != null)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5100)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5101)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5102);for (final T value : values) {{
                __CLR4_1_23vk3vkl3lqxrvm.R.inc(5103);if ((((compare(value, result, false) > 0)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5104)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5105)==0&false))) {{
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5106);result = value;
                }
            }}
        }}
        }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5107);return result;
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * <p>Null safe comparison of Comparables.
     * {@code null} is assumed to be less than a non-{@code null} value.</p>
     *
     * @param <T> type of the values processed by this method
     * @param c1  the first comparable, may be null
     * @param c2  the second comparable, may be null
     * @return a negative value if c1 < c2, zero if c1 = c2
     *  and a positive value if c1 > c2
     */
    public static <T extends Comparable<? super T>> int compare(final T c1, final T c2) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5108);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5109);return compare(c1, c2, false);
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * <p>Null safe comparison of Comparables.</p>
     *
     * @param <T> type of the values processed by this method
     * @param c1  the first comparable, may be null
     * @param c2  the second comparable, may be null
     * @param nullGreater if true {@code null} is considered greater
     *  than a non-{@code null} value or if false {@code null} is
     *  considered less than a Non-{@code null} value
     * @return a negative value if c1 < c2, zero if c1 = c2
     *  and a positive value if c1 > c2
     * @see java.util.Comparator#compare(Object, Object)
     */
    public static <T extends Comparable<? super T>> int compare(final T c1, final T c2, final boolean nullGreater) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5110);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5111);if ((((c1 == c2)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5112)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5113)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5114);return 0;
        } }else {__CLR4_1_23vk3vkl3lqxrvm.R.inc(5115);if ((((c1 == null)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5116)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5117)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5118);return (((nullGreater )&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5119)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5120)==0&false))? 1 : -1;
        } }else {__CLR4_1_23vk3vkl3lqxrvm.R.inc(5121);if ((((c2 == null)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5122)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5123)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5124);return (((nullGreater )&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5125)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5126)==0&false))? -1 : 1;
        }
        }}}__CLR4_1_23vk3vkl3lqxrvm.R.inc(5127);return c1.compareTo(c2);
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * Find the "best guess" middle value among comparables. If there is an even
     * number of total values, the lower of the two middle values will be returned.
     * @param <T> type of values processed by this method
     * @param items to compare
     * @return T at middle position
     * @throws NullPointerException if items is {@code null}
     * @throws IllegalArgumentException if items is empty or contains {@code null} values
     * @since 3.0.1
     */
    public static <T extends Comparable<? super T>> T median(final T... items) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5128);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5129);Validate.notEmpty(items);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5130);Validate.noNullElements(items);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5131);final TreeSet<T> sort = new TreeSet<T>();
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5132);Collections.addAll(sort, items);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5133);@SuppressWarnings("unchecked") //we know all items added were T instances
        final
        T result = (T) sort.toArray()[(sort.size() - 1) / 2];
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5134);return result;
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * Find the "best guess" middle value among comparables. If there is an even
     * number of total values, the lower of the two middle values will be returned.
     * @param <T> type of values processed by this method
     * @param comparator to use for comparisons
     * @param items to compare
     * @return T at middle position
     * @throws NullPointerException if items or comparator is {@code null}
     * @throws IllegalArgumentException if items is empty or contains {@code null} values
     * @since 3.0.1
     */
    public static <T> T median(final Comparator<T> comparator, final T... items) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5135);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5136);Validate.notEmpty(items, "null/empty items");
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5137);Validate.noNullElements(items);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5138);Validate.notNull(comparator, "null comparator");
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5139);final TreeSet<T> sort = new TreeSet<T>(comparator);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5140);Collections.addAll(sort, items);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5141);@SuppressWarnings("unchecked") //we know all items added were T instances
        final
        T result = (T) sort.toArray()[(sort.size() - 1) / 2];
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5142);return result;
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    // Mode
    //-----------------------------------------------------------------------
    /**
     * Find the most frequently occurring item.
     * 
     * @param <T> type of values processed by this method
     * @param items to check
     * @return most populous T, {@code null} if non-unique or no items supplied
     * @since 3.0.1
     */
    public static <T> T mode(final T... items) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5143);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5144);if ((((ArrayUtils.isNotEmpty(items))&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5145)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5146)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5147);final HashMap<T, MutableInt> occurrences = new HashMap<T, MutableInt>(items.length);
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5148);for (final T t : items) {{
                __CLR4_1_23vk3vkl3lqxrvm.R.inc(5149);final MutableInt count = occurrences.get(t);
                __CLR4_1_23vk3vkl3lqxrvm.R.inc(5150);if ((((count == null)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5151)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5152)==0&false))) {{
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5153);occurrences.put(t, new MutableInt(1));
                } }else {{
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5154);count.increment();
                }
            }}
            }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5155);T result = null;
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5156);int max = 0;
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5157);for (final Map.Entry<T, MutableInt> e : occurrences.entrySet()) {{
                __CLR4_1_23vk3vkl3lqxrvm.R.inc(5158);final int cmp = e.getValue().intValue();
                __CLR4_1_23vk3vkl3lqxrvm.R.inc(5159);if ((((cmp == max)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5160)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5161)==0&false))) {{
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5162);result = null;
                } }else {__CLR4_1_23vk3vkl3lqxrvm.R.inc(5163);if ((((cmp > max)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5164)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5165)==0&false))) {{
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5166);max = cmp;
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5167);result = e.getKey();
                }
            }}}
            }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5168);return result;
        }
        }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5169);return null;
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    // cloning
    //-----------------------------------------------------------------------
    /**
     * <p>Clone an object.</p>
     *
     * @param <T> the type of the object
     * @param obj  the object to clone, null returns null
     * @return the clone if the object implements {@link Cloneable} otherwise {@code null}
     * @throws CloneFailedException if the object is cloneable and the clone operation fails
     * @since 3.0
     */
    public static <T> T clone(final T obj) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5170);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5171);if ((((obj instanceof Cloneable)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5172)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5173)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5174);final Object result;
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5175);if ((((obj.getClass().isArray())&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5176)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5177)==0&false))) {{
                __CLR4_1_23vk3vkl3lqxrvm.R.inc(5178);final Class<?> componentType = obj.getClass().getComponentType();
                __CLR4_1_23vk3vkl3lqxrvm.R.inc(5179);if ((((!componentType.isPrimitive())&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5180)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5181)==0&false))) {{
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5182);result = ((Object[]) obj).clone();
                } }else {{
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5183);int length = Array.getLength(obj);
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5184);result = Array.newInstance(componentType, length);
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5185);while ((((length-- > 0)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5186)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5187)==0&false))) {{
                        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5188);Array.set(result, length, Array.get(obj, length));
                    }
                }}
            }} }else {{
                __CLR4_1_23vk3vkl3lqxrvm.R.inc(5189);try {
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5190);final Method clone = obj.getClass().getMethod("clone");
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5191);result = clone.invoke(obj);
                } catch (final NoSuchMethodException e) {
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5192);throw new CloneFailedException("Cloneable type "
                        + obj.getClass().getName()
                        + " has no clone method", e);
                } catch (final IllegalAccessException e) {
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5193);throw new CloneFailedException("Cannot clone Cloneable type "
                        + obj.getClass().getName(), e);
                } catch (final InvocationTargetException e) {
                    __CLR4_1_23vk3vkl3lqxrvm.R.inc(5194);throw new CloneFailedException("Exception cloning Cloneable type "
                        + obj.getClass().getName(), e.getCause());
                }
            }
            }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5195);@SuppressWarnings("unchecked") // OK because input is of type T
            final T checked = (T) result;
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5196);return checked;
        }

        }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5197);return null;
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * <p>Clone an object if possible.</p>
     *
     * <p>This method is similar to {@link #clone(Object)}, but will return the provided
     * instance as the return value instead of {@code null} if the instance
     * is not cloneable. This is more convenient if the caller uses different
     * implementations (e.g. of a service) and some of the implementations do not allow concurrent
     * processing or have state. In such cases the implementation can simply provide a proper
     * clone implementation and the caller's code does not have to change.</p>
     *
     * @param <T> the type of the object
     * @param obj  the object to clone, null returns null
     * @return the clone if the object implements {@link Cloneable} otherwise the object itself
     * @throws CloneFailedException if the object is cloneable and the clone operation fails
     * @since 3.0
     */
    public static <T> T cloneIfPossible(final T obj) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5198);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5199);final T clone = clone(obj);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5200);return (((clone == null )&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5201)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5202)==0&false))? obj : clone;
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    // Null
    //-----------------------------------------------------------------------
    /**
     * <p>Class used as a null placeholder where {@code null}
     * has another meaning.</p>
     *
     * <p>For example, in a {@code HashMap} the
     * {@link java.util.HashMap#get(java.lang.Object)} method returns
     * {@code null} if the {@code Map} contains {@code null} or if there is
     * no matching key. The {@code Null} placeholder can be used to distinguish
     * between these two cases.</p>
     *
     * <p>Another example is {@code Hashtable}, where {@code null}
     * cannot be stored.</p>
     */
    public static class Null implements Serializable {
        /**
         * Required for serialization support. Declare serialization compatibility with Commons Lang 1.0
         *
         * @see java.io.Serializable
         */
        private static final long serialVersionUID = 7092611880189329093L;

        /**
         * Restricted constructor - singleton.
         */
        Null() {
            super();__CLR4_1_23vk3vkl3lqxrvm.R.inc(5204);try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5203);
        }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

        /**
         * <p>Ensure singleton.</p>
         *
         * @return the singleton value
         */
        private Object readResolve() {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5205);
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5206);return ObjectUtils.NULL;
        }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}
    }


    // Constants (LANG-816):
    /*
        These methods ensure constants are not inlined by javac.
        For example, typically a developer might declare a constant like so:

            public final static int MAGIC_NUMBER = 5;

        Should a different jar file refer to this, and the MAGIC_NUMBER
        is changed a later date (e.g., MAGIC_NUMBER = 6), the different jar
        file will need to recompile itself.  This is because javac
        typically inlines the primitive or String constant directly into
        the bytecode, and removes the reference to the MAGIC_NUMBER field.

        To help the other jar (so that it does not need to recompile
        when constants are changed) the original developer can declare
        their constant using one of the CONST() utility methods, instead:

            public final static int MAGIC_NUMBER = CONST(5);
     */


    /**
     * This method returns the provided value unchanged.
     * This can prevent javac from inlining a constant
     * field, e.g.,
     *
     * <pre>
     *     public final static boolean MAGIC_FLAG = ObjectUtils.CONST(true);
     * </pre>
     *
     * This way any jars that refer to this field do not
     * have to recompile themselves if the field's value
     * changes at some future date.
     *
     * @param v the boolean value to return
     * @return the boolean v, unchanged
     */
    public static boolean CONST(final boolean v) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5207); __CLR4_1_23vk3vkl3lqxrvm.R.inc(5208);return v; }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * This method returns the provided value unchanged.
     * This can prevent javac from inlining a constant
     * field, e.g.,
     *
     * <pre>
     *     public final static byte MAGIC_BYTE = ObjectUtils.CONST((byte) 127);
     * </pre>
     *
     * This way any jars that refer to this field do not
     * have to recompile themselves if the field's value
     * changes at some future date.
     *
     * @param v the byte value to return
     * @return the byte v, unchanged
     */
    public static byte CONST(final byte v) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5209); __CLR4_1_23vk3vkl3lqxrvm.R.inc(5210);return v; }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * This method returns the provided value unchanged.
     * This can prevent javac from inlining a constant
     * field, e.g.,
     *
     * <pre>
     *     public final static byte MAGIC_BYTE = ObjectUtils.CONST_BYTE(127);
     * </pre>
     *
     * This way any jars that refer to this field do not
     * have to recompile themselves if the field's value
     * changes at some future date.
     *
     * @param v the byte literal (as an int) value to return
     * @throws IllegalArgumentException if the value passed to v
     *         is larger than a byte, that is, smaller than -128 or
     *         larger than 127.
     * @return the byte v, unchanged
     */
    public static byte CONST_BYTE(final int v) throws IllegalArgumentException {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5211);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5212);if ((((v < Byte.MIN_VALUE || v > Byte.MAX_VALUE)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5213)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5214)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5215);throw new IllegalArgumentException("Supplied value must be a valid byte literal between -128 and 127: [" + v + "]");
        }
        }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5216);return (byte) v;
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * This method returns the provided value unchanged.
     * This can prevent javac from inlining a constant
     * field, e.g.,
     *
     * <pre>
     *     public final static char MAGIC_CHAR = ObjectUtils.CONST('a');
     * </pre>
     *
     * This way any jars that refer to this field do not
     * have to recompile themselves if the field's value
     * changes at some future date.
     *
     * @param v the char value to return
     * @return the char v, unchanged
     */
    public static char CONST(final char v) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5217); __CLR4_1_23vk3vkl3lqxrvm.R.inc(5218);return v; }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * This method returns the provided value unchanged.
     * This can prevent javac from inlining a constant
     * field, e.g.,
     *
     * <pre>
     *     public final static short MAGIC_SHORT = ObjectUtils.CONST((short) 123);
     * </pre>
     *
     * This way any jars that refer to this field do not
     * have to recompile themselves if the field's value
     * changes at some future date.
     *
     * @param v the short value to return
     * @return the short v, unchanged
     */
    public static short CONST(final short v) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5219); __CLR4_1_23vk3vkl3lqxrvm.R.inc(5220);return v; }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * This method returns the provided value unchanged.
     * This can prevent javac from inlining a constant
     * field, e.g.,
     *
     * <pre>
     *     public final static short MAGIC_SHORT = ObjectUtils.CONST_SHORT(127);
     * </pre>
     *
     * This way any jars that refer to this field do not
     * have to recompile themselves if the field's value
     * changes at some future date.
     *
     * @param v the short literal (as an int) value to return
     * @throws IllegalArgumentException if the value passed to v
     *         is larger than a short, that is, smaller than -32768 or
     *         larger than 32767.
     * @return the byte v, unchanged
     */
    public static short CONST_SHORT(final int v) throws IllegalArgumentException {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5221);
        __CLR4_1_23vk3vkl3lqxrvm.R.inc(5222);if ((((v < Short.MIN_VALUE || v > Short.MAX_VALUE)&&(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5223)!=0|true))||(__CLR4_1_23vk3vkl3lqxrvm.R.iget(5224)==0&false))) {{
            __CLR4_1_23vk3vkl3lqxrvm.R.inc(5225);throw new IllegalArgumentException("Supplied value must be a valid byte literal between -32768 and 32767: [" + v + "]");
        }
        }__CLR4_1_23vk3vkl3lqxrvm.R.inc(5226);return (short) v;
    }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}


    /**
     * This method returns the provided value unchanged.
     * This can prevent javac from inlining a constant
     * field, e.g.,
     *
     * <pre>
     *     public final static int MAGIC_INT = ObjectUtils.CONST(123);
     * </pre>
     *
     * This way any jars that refer to this field do not
     * have to recompile themselves if the field's value
     * changes at some future date.
     *
     * @param v the int value to return
     * @return the int v, unchanged
     */
    public static int CONST(final int v) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5227); __CLR4_1_23vk3vkl3lqxrvm.R.inc(5228);return v; }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * This method returns the provided value unchanged.
     * This can prevent javac from inlining a constant
     * field, e.g.,
     *
     * <pre>
     *     public final static long MAGIC_LONG = ObjectUtils.CONST(123L);
     * </pre>
     *
     * This way any jars that refer to this field do not
     * have to recompile themselves if the field's value
     * changes at some future date.
     *
     * @param v the long value to return
     * @return the long v, unchanged
     */
    public static long CONST(final long v) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5229); __CLR4_1_23vk3vkl3lqxrvm.R.inc(5230);return v; }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * This method returns the provided value unchanged.
     * This can prevent javac from inlining a constant
     * field, e.g.,
     *
     * <pre>
     *     public final static float MAGIC_FLOAT = ObjectUtils.CONST(1.0f);
     * </pre>
     *
     * This way any jars that refer to this field do not
     * have to recompile themselves if the field's value
     * changes at some future date.
     *
     * @param v the float value to return
     * @return the float v, unchanged
     */
    public static float CONST(final float v) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5231); __CLR4_1_23vk3vkl3lqxrvm.R.inc(5232);return v; }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * This method returns the provided value unchanged.
     * This can prevent javac from inlining a constant
     * field, e.g.,
     *
     * <pre>
     *     public final static double MAGIC_DOUBLE = ObjectUtils.CONST(1.0);
     * </pre>
     *
     * This way any jars that refer to this field do not
     * have to recompile themselves if the field's value
     * changes at some future date.
     *
     * @param v the double value to return
     * @return the double v, unchanged
     */
    public static double CONST(final double v) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5233); __CLR4_1_23vk3vkl3lqxrvm.R.inc(5234);return v; }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

    /**
     * This method returns the provided value unchanged.
     * This can prevent javac from inlining a constant
     * field, e.g.,
     *
     * <pre>
     *     public final static String MAGIC_STRING = ObjectUtils.CONST("abc");
     * </pre>
     *
     * This way any jars that refer to this field do not
     * have to recompile themselves if the field's value
     * changes at some future date.
     *
     * @param <T> the Object type 
     * @param v the genericized Object value to return (typically a String).
     * @return the genericized Object v, unchanged (typically a String).
     */
    public static <T> T CONST(final T v) {try{__CLR4_1_23vk3vkl3lqxrvm.R.inc(5235); __CLR4_1_23vk3vkl3lqxrvm.R.inc(5236);return v; }finally{__CLR4_1_23vk3vkl3lqxrvm.R.flushNeeded();}}

}
