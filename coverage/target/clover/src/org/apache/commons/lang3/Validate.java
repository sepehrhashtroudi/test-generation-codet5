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

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * <p>This class assists in validating arguments. The validation methods are
 * based along the following principles:
 * <ul>
 *   <li>An invalid {@code null} argument causes a {@link NullPointerException}.</li>
 *   <li>A non-{@code null} argument causes an {@link IllegalArgumentException}.</li>
 *   <li>An invalid index into an array/collection/map/string causes an {@link IndexOutOfBoundsException}.</li>
 * </ul>
 *
 * <p>All exceptions messages are
 * <a href="http://docs.oracle.com/javase/1.5.0/docs/api/java/util/Formatter.html#syntax">format strings</a>
 * as defined by the Java platform. For example:</p>
 *
 * <pre>
 * Validate.isTrue(i > 0, "The value must be greater than zero: %d", i);
 * Validate.notNull(surname, "The surname must not be %s", null);
 * </pre>
 *
 * <p>#ThreadSafe#</p>
 * @version $Id$
 * @see java.lang.String#format(String, Object...)
 * @since 2.0
 */
public class Validate {public static class __CLR4_1_26bj6bjl3lqxs5f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,8399,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE =
        "The value %s is not in the specified exclusive range of %s to %s";
    private static final String DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE =
        "The value %s is not in the specified inclusive range of %s to %s";
    private static final String DEFAULT_MATCHES_PATTERN_EX = "The string %s does not match the pattern %s";
    private static final String DEFAULT_IS_NULL_EX_MESSAGE = "The validated object is null";
    private static final String DEFAULT_IS_TRUE_EX_MESSAGE = "The validated expression is false";
    private static final String DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE =
        "The validated array contains null element at index: %d";
    private static final String DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE =
        "The validated collection contains null element at index: %d";
    private static final String DEFAULT_NOT_BLANK_EX_MESSAGE = "The validated character sequence is blank";
    private static final String DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE = "The validated array is empty";
    private static final String DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE =
        "The validated character sequence is empty";
    private static final String DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE = "The validated collection is empty";
    private static final String DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE = "The validated map is empty";
    private static final String DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE = "The validated array index is invalid: %d";
    private static final String DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE =
        "The validated character sequence index is invalid: %d";
    private static final String DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE =
        "The validated collection index is invalid: %d";
    private static final String DEFAULT_VALID_STATE_EX_MESSAGE = "The validated state is false";
    private static final String DEFAULT_IS_ASSIGNABLE_EX_MESSAGE = "Cannot assign a %s to a %s";
    private static final String DEFAULT_IS_INSTANCE_OF_EX_MESSAGE = "Expected type: %s, actual: %s";

    /**
     * Constructor. This class should not normally be instantiated.
     */
    public Validate() {
      super();__CLR4_1_26bj6bjl3lqxs5f.R.inc(8192);try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8191);
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // isTrue
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the argument condition is {@code true}; otherwise
     * throwing an exception with the specified message. This method is useful when
     * validating according to an arbitrary boolean expression, such as validating a
     * primitive number or using your own custom validation expression.</p>
     *
     * <pre>Validate.isTrue(i > 0.0, "The value must be greater than zero: %d", i);</pre>
     *
     * <p>For performance reasons, the long value is passed as a separate parameter and
     * appended to the exception message only in the case of an error.</p>
     *
     * @param expression  the boolean expression to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param value  the value to append to the message when invalid
     * @throws IllegalArgumentException if expression is {@code false}
     * @see #isTrue(boolean)
     * @see #isTrue(boolean, String, double)
     * @see #isTrue(boolean, String, Object...)
     */
    public static void isTrue(final boolean expression, final String message, final long value) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8193);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8194);if ((((expression == false)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8195)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8196)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8197);throw new IllegalArgumentException(String.format(message, Long.valueOf(value)));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the argument condition is {@code true}; otherwise
     * throwing an exception with the specified message. This method is useful when
     * validating according to an arbitrary boolean expression, such as validating a
     * primitive number or using your own custom validation expression.</p>
     *
     * <pre>Validate.isTrue(d > 0.0, "The value must be greater than zero: %s", d);</pre>
     *
     * <p>For performance reasons, the double value is passed as a separate parameter and
     * appended to the exception message only in the case of an error.</p>
     *
     * @param expression  the boolean expression to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param value  the value to append to the message when invalid
     * @throws IllegalArgumentException if expression is {@code false}
     * @see #isTrue(boolean)
     * @see #isTrue(boolean, String, long)
     * @see #isTrue(boolean, String, Object...)
     */
    public static void isTrue(final boolean expression, final String message, final double value) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8198);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8199);if ((((expression == false)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8200)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8201)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8202);throw new IllegalArgumentException(String.format(message, Double.valueOf(value)));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the argument condition is {@code true}; otherwise
     * throwing an exception with the specified message. This method is useful when
     * validating according to an arbitrary boolean expression, such as validating a
     * primitive number or using your own custom validation expression.</p>
     *
     * <pre>
     * Validate.isTrue(i >= min && i <= max, "The value must be between %d and %d", min, max);
     * Validate.isTrue(myObject.isOk(), "The object is not okay");</pre>
     *
     * @param expression  the boolean expression to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalArgumentException if expression is {@code false}
     * @see #isTrue(boolean)
     * @see #isTrue(boolean, String, long)
     * @see #isTrue(boolean, String, double)
     */
    public static void isTrue(final boolean expression, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8203);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8204);if ((((expression == false)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8205)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8206)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8207);throw new IllegalArgumentException(String.format(message, values));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the argument condition is {@code true}; otherwise
     * throwing an exception. This method is useful when validating according
     * to an arbitrary boolean expression, such as validating a
     * primitive number or using your own custom validation expression.</p>
     *
     * <pre>
     * Validate.isTrue(i > 0);
     * Validate.isTrue(myObject.isOk());</pre>
     *
     * <p>The message of the exception is &quot;The validated expression is
     * false&quot;.</p>
     *
     * @param expression  the boolean expression to check
     * @throws IllegalArgumentException if expression is {@code false}
     * @see #isTrue(boolean, String, long)
     * @see #isTrue(boolean, String, double)
     * @see #isTrue(boolean, String, Object...)
     */
    public static void isTrue(final boolean expression) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8208);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8209);if ((((expression == false)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8210)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8211)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8212);throw new IllegalArgumentException(DEFAULT_IS_TRUE_EX_MESSAGE);
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // notNull
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument is not {@code null};
     * otherwise throwing an exception.
     *
     * <pre>Validate.notNull(myObject, "The object must not be null");</pre>
     *
     * <p>The message of the exception is &quot;The validated object is
     * null&quot;.</p>
     *
     * @param <T> the object type
     * @param object  the object to check
     * @return the validated object (never {@code null} for method chaining)
     * @throws NullPointerException if the object is {@code null}
     * @see #notNull(Object, String, Object...)
     */
    public static <T> T notNull(final T object) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8213);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8214);return notNull(object, DEFAULT_IS_NULL_EX_MESSAGE);
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument is not {@code null};
     * otherwise throwing an exception with the specified message.
     *
     * <pre>Validate.notNull(myObject, "The object must not be null");</pre>
     *
     * @param <T> the object type
     * @param object  the object to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message
     * @return the validated object (never {@code null} for method chaining)
     * @throws NullPointerException if the object is {@code null}
     * @see #notNull(Object)
     */
    public static <T> T notNull(final T object, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8215);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8216);if ((((object == null)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8217)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8218)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8219);throw new NullPointerException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8220);return object;
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // notEmpty array
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument array is neither {@code null}
     * nor a length of zero (no elements); otherwise throwing an exception
     * with the specified message.
     *
     * <pre>Validate.notEmpty(myArray, "The array must not be empty");</pre>
     *
     * @param <T> the array type
     * @param array  the array to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated array (never {@code null} method for chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IllegalArgumentException if the array is empty
     * @see #notEmpty(Object[])
     */
    public static <T> T[] notEmpty(final T[] array, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8221);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8222);if ((((array == null)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8223)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8224)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8225);throw new NullPointerException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8226);if ((((array.length == 0)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8227)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8228)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8229);throw new IllegalArgumentException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8230);return array;
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument array is neither {@code null}
     * nor a length of zero (no elements); otherwise throwing an exception.
     *
     * <pre>Validate.notEmpty(myArray);</pre>
     *
     * <p>The message in the exception is &quot;The validated array is
     * empty&quot;.
     *
     * @param <T> the array type
     * @param array  the array to check, validated not null by this method
     * @return the validated array (never {@code null} method for chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IllegalArgumentException if the array is empty
     * @see #notEmpty(Object[], String, Object...)
     */
    public static <T> T[] notEmpty(final T[] array) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8231);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8232);return notEmpty(array, DEFAULT_NOT_EMPTY_ARRAY_EX_MESSAGE);
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // notEmpty collection
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument collection is neither {@code null}
     * nor a size of zero (no elements); otherwise throwing an exception
     * with the specified message.
     *
     * <pre>Validate.notEmpty(myCollection, "The collection must not be empty");</pre>
     *
     * @param <T> the collection type
     * @param collection  the collection to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated collection (never {@code null} method for chaining)
     * @throws NullPointerException if the collection is {@code null}
     * @throws IllegalArgumentException if the collection is empty
     * @see #notEmpty(Object[])
     */
    public static <T extends Collection<?>> T notEmpty(final T collection, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8233);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8234);if ((((collection == null)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8235)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8236)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8237);throw new NullPointerException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8238);if ((((collection.isEmpty())&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8239)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8240)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8241);throw new IllegalArgumentException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8242);return collection;
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument collection is neither {@code null}
     * nor a size of zero (no elements); otherwise throwing an exception.
     *
     * <pre>Validate.notEmpty(myCollection);</pre>
     *
     * <p>The message in the exception is &quot;The validated collection is
     * empty&quot;.</p>
     *
     * @param <T> the collection type
     * @param collection  the collection to check, validated not null by this method
     * @return the validated collection (never {@code null} method for chaining)
     * @throws NullPointerException if the collection is {@code null}
     * @throws IllegalArgumentException if the collection is empty
     * @see #notEmpty(Collection, String, Object...)
     */
    public static <T extends Collection<?>> T notEmpty(final T collection) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8243);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8244);return notEmpty(collection, DEFAULT_NOT_EMPTY_COLLECTION_EX_MESSAGE);
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // notEmpty map
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument map is neither {@code null}
     * nor a size of zero (no elements); otherwise throwing an exception
     * with the specified message.
     *
     * <pre>Validate.notEmpty(myMap, "The map must not be empty");</pre>
     *
     * @param <T> the map type
     * @param map  the map to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated map (never {@code null} method for chaining)
     * @throws NullPointerException if the map is {@code null}
     * @throws IllegalArgumentException if the map is empty
     * @see #notEmpty(Object[])
     */
    public static <T extends Map<?, ?>> T notEmpty(final T map, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8245);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8246);if ((((map == null)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8247)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8248)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8249);throw new NullPointerException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8250);if ((((map.isEmpty())&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8251)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8252)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8253);throw new IllegalArgumentException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8254);return map;
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument map is neither {@code null}
     * nor a size of zero (no elements); otherwise throwing an exception.
     *
     * <pre>Validate.notEmpty(myMap);</pre>
     *
     * <p>The message in the exception is &quot;The validated map is
     * empty&quot;.</p>
     *
     * @param <T> the map type
     * @param map  the map to check, validated not null by this method
     * @return the validated map (never {@code null} method for chaining)
     * @throws NullPointerException if the map is {@code null}
     * @throws IllegalArgumentException if the map is empty
     * @see #notEmpty(Map, String, Object...)
     */
    public static <T extends Map<?, ?>> T notEmpty(final T map) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8255);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8256);return notEmpty(map, DEFAULT_NOT_EMPTY_MAP_EX_MESSAGE);
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // notEmpty string
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument character sequence is
     * neither {@code null} nor a length of zero (no characters);
     * otherwise throwing an exception with the specified message.
     *
     * <pre>Validate.notEmpty(myString, "The string must not be empty");</pre>
     *
     * @param <T> the character sequence type
     * @param chars  the character sequence to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated character sequence (never {@code null} method for chaining)
     * @throws NullPointerException if the character sequence is {@code null}
     * @throws IllegalArgumentException if the character sequence is empty
     * @see #notEmpty(CharSequence)
     */
    public static <T extends CharSequence> T notEmpty(final T chars, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8257);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8258);if ((((chars == null)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8259)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8260)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8261);throw new NullPointerException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8262);if ((((chars.length() == 0)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8263)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8264)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8265);throw new IllegalArgumentException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8266);return chars;
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument character sequence is
     * neither {@code null} nor a length of zero (no characters);
     * otherwise throwing an exception with the specified message.
     *
     * <pre>Validate.notEmpty(myString);</pre>
     *
     * <p>The message in the exception is &quot;The validated
     * character sequence is empty&quot;.</p>
     *
     * @param <T> the character sequence type
     * @param chars  the character sequence to check, validated not null by this method
     * @return the validated character sequence (never {@code null} method for chaining)
     * @throws NullPointerException if the character sequence is {@code null}
     * @throws IllegalArgumentException if the character sequence is empty
     * @see #notEmpty(CharSequence, String, Object...)
     */
    public static <T extends CharSequence> T notEmpty(final T chars) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8267);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8268);return notEmpty(chars, DEFAULT_NOT_EMPTY_CHAR_SEQUENCE_EX_MESSAGE);
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // notBlank string
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument character sequence is
     * neither {@code null}, a length of zero (no characters), empty
     * nor whitespace; otherwise throwing an exception with the specified
     * message.
     *
     * <pre>Validate.notBlank(myString, "The string must not be blank");</pre>
     *
     * @param <T> the character sequence type
     * @param chars  the character sequence to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated character sequence (never {@code null} method for chaining)
     * @throws NullPointerException if the character sequence is {@code null}
     * @throws IllegalArgumentException if the character sequence is blank
     * @see #notBlank(CharSequence)
     *
     * @since 3.0
     */
    public static <T extends CharSequence> T notBlank(final T chars, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8269);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8270);if ((((chars == null)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8271)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8272)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8273);throw new NullPointerException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8274);if ((((StringUtils.isBlank(chars))&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8275)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8276)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8277);throw new IllegalArgumentException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8278);return chars;
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument character sequence is
     * neither {@code null}, a length of zero (no characters), empty
     * nor whitespace; otherwise throwing an exception.
     *
     * <pre>Validate.notBlank(myString);</pre>
     *
     * <p>The message in the exception is &quot;The validated character
     * sequence is blank&quot;.</p>
     *
     * @param <T> the character sequence type
     * @param chars  the character sequence to check, validated not null by this method
     * @return the validated character sequence (never {@code null} method for chaining)
     * @throws NullPointerException if the character sequence is {@code null}
     * @throws IllegalArgumentException if the character sequence is blank
     * @see #notBlank(CharSequence, String, Object...)
     *
     * @since 3.0
     */
    public static <T extends CharSequence> T notBlank(final T chars) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8279);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8280);return notBlank(chars, DEFAULT_NOT_BLANK_EX_MESSAGE);
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // noNullElements array
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument array is neither
     * {@code null} nor contains any elements that are {@code null};
     * otherwise throwing an exception with the specified message.
     *
     * <pre>Validate.noNullElements(myArray, "The array contain null at position %d");</pre>
     *
     * <p>If the array is {@code null}, then the message in the exception
     * is &quot;The validated object is null&quot;.</p>
     *
     * <p>If the array has a {@code null} element, then the iteration
     * index of the invalid element is appended to the {@code values}
     * argument.</p>
     *
     * @param <T> the array type
     * @param array  the array to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated array (never {@code null} method for chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IllegalArgumentException if an element is {@code null}
     * @see #noNullElements(Object[])
     */
    public static <T> T[] noNullElements(final T[] array, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8281);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8282);Validate.notNull(array);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8283);for (int i = 0; (((i < array.length)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8284)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8285)==0&false)); i++) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8286);if ((((array[i] == null)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8287)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8288)==0&false))) {{
                __CLR4_1_26bj6bjl3lqxs5f.R.inc(8289);final Object[] values2 = ArrayUtils.add(values, Integer.valueOf(i));
                __CLR4_1_26bj6bjl3lqxs5f.R.inc(8290);throw new IllegalArgumentException(String.format(message, values2));
            }
        }}
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8291);return array;
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument array is neither
     * {@code null} nor contains any elements that are {@code null};
     * otherwise throwing an exception.
     *
     * <pre>Validate.noNullElements(myArray);</pre>
     *
     * <p>If the array is {@code null}, then the message in the exception
     * is &quot;The validated object is null&quot;.</p>
     *
     * <p>If the array has a {@code null} element, then the message in the
     * exception is &quot;The validated array contains null element at index:
     * &quot followed by the index.</p>
     *
     * @param <T> the array type
     * @param array  the array to check, validated not null by this method
     * @return the validated array (never {@code null} method for chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IllegalArgumentException if an element is {@code null}
     * @see #noNullElements(Object[], String, Object...)
     */
    public static <T> T[] noNullElements(final T[] array) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8292);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8293);return noNullElements(array, DEFAULT_NO_NULL_ELEMENTS_ARRAY_EX_MESSAGE);
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // noNullElements iterable
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument iterable is neither
     * {@code null} nor contains any elements that are {@code null};
     * otherwise throwing an exception with the specified message.
     *
     * <pre>Validate.noNullElements(myCollection, "The collection contains null at position %d");</pre>
     *
     * <p>If the iterable is {@code null}, then the message in the exception
     * is &quot;The validated object is null&quot;.</p>
     *
     * <p>If the iterable has a {@code null} element, then the iteration
     * index of the invalid element is appended to the {@code values}
     * argument.</p>
     *
     * @param <T> the iterable type
     * @param iterable  the iterable to check, validated not null by this method
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated iterable (never {@code null} method for chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IllegalArgumentException if an element is {@code null}
     * @see #noNullElements(Iterable)
     */
    public static <T extends Iterable<?>> T noNullElements(final T iterable, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8294);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8295);Validate.notNull(iterable);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8296);int i = 0;
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8297);for (final Iterator<?> it = iterable.iterator(); (((it.hasNext())&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8298)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8299)==0&false)); i++) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8300);if ((((it.next() == null)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8301)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8302)==0&false))) {{
                __CLR4_1_26bj6bjl3lqxs5f.R.inc(8303);final Object[] values2 = ArrayUtils.addAll(values, Integer.valueOf(i));
                __CLR4_1_26bj6bjl3lqxs5f.R.inc(8304);throw new IllegalArgumentException(String.format(message, values2));
            }
        }}
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8305);return iterable;
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument iterable is neither
     * {@code null} nor contains any elements that are {@code null};
     * otherwise throwing an exception.
     *
     * <pre>Validate.noNullElements(myCollection);</pre>
     *
     * <p>If the iterable is {@code null}, then the message in the exception
     * is &quot;The validated object is null&quot;.</p>
     *
     * <p>If the array has a {@code null} element, then the message in the
     * exception is &quot;The validated iterable contains null element at index:
     * &quot followed by the index.</p>
     *
     * @param <T> the iterable type
     * @param iterable  the iterable to check, validated not null by this method
     * @return the validated iterable (never {@code null} method for chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IllegalArgumentException if an element is {@code null}
     * @see #noNullElements(Iterable, String, Object...)
     */
    public static <T extends Iterable<?>> T noNullElements(final T iterable) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8306);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8307);return noNullElements(iterable, DEFAULT_NO_NULL_ELEMENTS_COLLECTION_EX_MESSAGE);
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // validIndex array
    //---------------------------------------------------------------------------------

    /**
     * <p>Validates that the index is within the bounds of the argument
     * array; otherwise throwing an exception with the specified message.</p>
     *
     * <pre>Validate.validIndex(myArray, 2, "The array index is invalid: ");</pre>
     *
     * <p>If the array is {@code null}, then the message of the exception
     * is &quot;The validated object is null&quot;.</p>
     *
     * @param <T> the array type
     * @param array  the array to check, validated not null by this method
     * @param index  the index to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated array (never {@code null} for method chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IndexOutOfBoundsException if the index is invalid
     * @see #validIndex(Object[], int)
     *
     * @since 3.0
     */
    public static <T> T[] validIndex(final T[] array, final int index, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8308);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8309);Validate.notNull(array);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8310);if ((((index < 0 || index >= array.length)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8311)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8312)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8313);throw new IndexOutOfBoundsException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8314);return array;
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validates that the index is within the bounds of the argument
     * array; otherwise throwing an exception.</p>
     *
     * <pre>Validate.validIndex(myArray, 2);</pre>
     *
     * <p>If the array is {@code null}, then the message of the exception
     * is &quot;The validated object is null&quot;.</p>
     *
     * <p>If the index is invalid, then the message of the exception is
     * &quot;The validated array index is invalid: &quot; followed by the
     * index.</p>
     *
     * @param <T> the array type
     * @param array  the array to check, validated not null by this method
     * @param index  the index to check
     * @return the validated array (never {@code null} for method chaining)
     * @throws NullPointerException if the array is {@code null}
     * @throws IndexOutOfBoundsException if the index is invalid
     * @see #validIndex(Object[], int, String, Object...)
     *
     * @since 3.0
     */
    public static <T> T[] validIndex(final T[] array, final int index) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8315);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8316);return validIndex(array, index, DEFAULT_VALID_INDEX_ARRAY_EX_MESSAGE, Integer.valueOf(index));
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // validIndex collection
    //---------------------------------------------------------------------------------

    /**
     * <p>Validates that the index is within the bounds of the argument
     * collection; otherwise throwing an exception with the specified message.</p>
     *
     * <pre>Validate.validIndex(myCollection, 2, "The collection index is invalid: ");</pre>
     *
     * <p>If the collection is {@code null}, then the message of the
     * exception is &quot;The validated object is null&quot;.</p>
     *
     * @param <T> the collection type
     * @param collection  the collection to check, validated not null by this method
     * @param index  the index to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated collection (never {@code null} for chaining)
     * @throws NullPointerException if the collection is {@code null}
     * @throws IndexOutOfBoundsException if the index is invalid
     * @see #validIndex(Collection, int)
     *
     * @since 3.0
     */
    public static <T extends Collection<?>> T validIndex(final T collection, final int index, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8317);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8318);Validate.notNull(collection);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8319);if ((((index < 0 || index >= collection.size())&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8320)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8321)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8322);throw new IndexOutOfBoundsException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8323);return collection;
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validates that the index is within the bounds of the argument
     * collection; otherwise throwing an exception.</p>
     *
     * <pre>Validate.validIndex(myCollection, 2);</pre>
     *
     * <p>If the index is invalid, then the message of the exception
     * is &quot;The validated collection index is invalid: &quot;
     * followed by the index.</p>
     *
     * @param <T> the collection type
     * @param collection  the collection to check, validated not null by this method
     * @param index  the index to check
     * @return the validated collection (never {@code null} for method chaining)
     * @throws NullPointerException if the collection is {@code null}
     * @throws IndexOutOfBoundsException if the index is invalid
     * @see #validIndex(Collection, int, String, Object...)
     *
     * @since 3.0
     */
    public static <T extends Collection<?>> T validIndex(final T collection, final int index) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8324);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8325);return validIndex(collection, index, DEFAULT_VALID_INDEX_COLLECTION_EX_MESSAGE, Integer.valueOf(index));
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // validIndex string
    //---------------------------------------------------------------------------------

    /**
     * <p>Validates that the index is within the bounds of the argument
     * character sequence; otherwise throwing an exception with the
     * specified message.</p>
     *
     * <pre>Validate.validIndex(myStr, 2, "The string index is invalid: ");</pre>
     *
     * <p>If the character sequence is {@code null}, then the message
     * of the exception is &quot;The validated object is null&quot;.</p>
     *
     * @param <T> the character sequence type
     * @param chars  the character sequence to check, validated not null by this method
     * @param index  the index to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @return the validated character sequence (never {@code null} for method chaining)
     * @throws NullPointerException if the character sequence is {@code null}
     * @throws IndexOutOfBoundsException if the index is invalid
     * @see #validIndex(CharSequence, int)
     *
     * @since 3.0
     */
    public static <T extends CharSequence> T validIndex(final T chars, final int index, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8326);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8327);Validate.notNull(chars);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8328);if ((((index < 0 || index >= chars.length())&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8329)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8330)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8331);throw new IndexOutOfBoundsException(String.format(message, values));
        }
        }__CLR4_1_26bj6bjl3lqxs5f.R.inc(8332);return chars;
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validates that the index is within the bounds of the argument
     * character sequence; otherwise throwing an exception.</p>
     *
     * <pre>Validate.validIndex(myStr, 2);</pre>
     *
     * <p>If the character sequence is {@code null}, then the message
     * of the exception is &quot;The validated object is
     * null&quot;.</p>
     *
     * <p>If the index is invalid, then the message of the exception
     * is &quot;The validated character sequence index is invalid: &quot;
     * followed by the index.</p>
     *
     * @param <T> the character sequence type
     * @param chars  the character sequence to check, validated not null by this method
     * @param index  the index to check
     * @return the validated character sequence (never {@code null} for method chaining)
     * @throws NullPointerException if the character sequence is {@code null}
     * @throws IndexOutOfBoundsException if the index is invalid
     * @see #validIndex(CharSequence, int, String, Object...)
     *
     * @since 3.0
     */
    public static <T extends CharSequence> T validIndex(final T chars, final int index) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8333);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8334);return validIndex(chars, index, DEFAULT_VALID_INDEX_CHAR_SEQUENCE_EX_MESSAGE, Integer.valueOf(index));
    }finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // validState
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the stateful condition is {@code true}; otherwise
     * throwing an exception. This method is useful when validating according
     * to an arbitrary boolean expression, such as validating a
     * primitive number or using your own custom validation expression.</p>
     *
     * <pre>
     * Validate.validState(field > 0);
     * Validate.validState(this.isOk());</pre>
     *
     * <p>The message of the exception is &quot;The validated state is
     * false&quot;.</p>
     *
     * @param expression  the boolean expression to check
     * @throws IllegalStateException if expression is {@code false}
     * @see #validState(boolean, String, Object...)
     *
     * @since 3.0
     */
    public static void validState(final boolean expression) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8335);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8336);if ((((expression == false)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8337)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8338)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8339);throw new IllegalStateException(DEFAULT_VALID_STATE_EX_MESSAGE);
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the stateful condition is {@code true}; otherwise
     * throwing an exception with the specified message. This method is useful when
     * validating according to an arbitrary boolean expression, such as validating a
     * primitive number or using your own custom validation expression.</p>
     *
     * <pre>Validate.validState(this.isOk(), "The state is not OK: %s", myObject);</pre>
     *
     * @param expression  the boolean expression to check
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalStateException if expression is {@code false}
     * @see #validState(boolean)
     *
     * @since 3.0
     */
    public static void validState(final boolean expression, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8340);
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8341);if ((((expression == false)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8342)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8343)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8344);throw new IllegalStateException(String.format(message, values));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // matchesPattern
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument character sequence matches the specified regular
     * expression pattern; otherwise throwing an exception.</p>
     *
     * <pre>Validate.matchesPattern("hi", "[a-z]*");</pre>
     *
     * <p>The syntax of the pattern is the one used in the {@link Pattern} class.</p>
     *
     * @param input  the character sequence to validate, not null
     * @param pattern  the regular expression pattern, not null
     * @throws IllegalArgumentException if the character sequence does not match the pattern
     * @see #matchesPattern(CharSequence, String, String, Object...)
     *
     * @since 3.0
     */
    public static void matchesPattern(final CharSequence input, final String pattern) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8345);
        // TODO when breaking BC, consider returning input
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8346);if ((((Pattern.matches(pattern, input) == false)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8347)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8348)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8349);throw new IllegalArgumentException(String.format(DEFAULT_MATCHES_PATTERN_EX, input, pattern));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument character sequence matches the specified regular
     * expression pattern; otherwise throwing an exception with the specified message.</p>
     *
     * <pre>Validate.matchesPattern("hi", "[a-z]*", "%s does not match %s", "hi" "[a-z]*");</pre>
     *
     * <p>The syntax of the pattern is the one used in the {@link Pattern} class.</p>
     *
     * @param input  the character sequence to validate, not null
     * @param pattern  the regular expression pattern, not null
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalArgumentException if the character sequence does not match the pattern
     * @see #matchesPattern(CharSequence, String)
     *
     * @since 3.0
     */
    public static void matchesPattern(final CharSequence input, final String pattern, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8350);
        // TODO when breaking BC, consider returning input
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8351);if ((((Pattern.matches(pattern, input) == false)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8352)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8353)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8354);throw new IllegalArgumentException(String.format(message, values));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // inclusiveBetween
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument object fall between the two
     * inclusive values specified; otherwise, throws an exception.</p>
     *
     * <pre>Validate.inclusiveBetween(0, 2, 1);</pre>
     *
     * @param <T> the type of the argument object
     * @param start  the inclusive start value, not null
     * @param end  the inclusive end value, not null
     * @param value  the object to validate, not null
     * @throws IllegalArgumentException if the value falls outside the boundaries
     * @see #inclusiveBetween(Object, Object, Comparable, String, Object...)
     *
     * @since 3.0
     */
    public static <T> void inclusiveBetween(final T start, final T end, final Comparable<T> value) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8355);
        // TODO when breaking BC, consider returning value
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8356);if ((((value.compareTo(start) < 0 || value.compareTo(end) > 0)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8357)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8358)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8359);throw new IllegalArgumentException(String.format(DEFAULT_INCLUSIVE_BETWEEN_EX_MESSAGE, value, start, end));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument object fall between the two
     * inclusive values specified; otherwise, throws an exception with the
     * specified message.</p>
     *
     * <pre>Validate.inclusiveBetween(0, 2, 1, "Not in boundaries");</pre>
     *
     * @param <T> the type of the argument object
     * @param start  the inclusive start value, not null
     * @param end  the inclusive end value, not null
     * @param value  the object to validate, not null
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalArgumentException if the value falls outside the boundaries
     * @see #inclusiveBetween(Object, Object, Comparable)
     *
     * @since 3.0
     */
    public static <T> void inclusiveBetween(final T start, final T end, final Comparable<T> value, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8360);
        // TODO when breaking BC, consider returning value
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8361);if ((((value.compareTo(start) < 0 || value.compareTo(end) > 0)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8362)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8363)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8364);throw new IllegalArgumentException(String.format(message, values));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // exclusiveBetween
    //---------------------------------------------------------------------------------

    /**
     * <p>Validate that the specified argument object fall between the two
     * exclusive values specified; otherwise, throws an exception.</p>
     *
     * <pre>Validate.exclusiveBetween(0, 2, 1);</pre>
     *
     * @param <T> the type of the argument object
     * @param start  the exclusive start value, not null
     * @param end  the exclusive end value, not null
     * @param value  the object to validate, not null
     * @throws IllegalArgumentException if the value falls outside the boundaries
     * @see #exclusiveBetween(Object, Object, Comparable, String, Object...)
     *
     * @since 3.0
     */
    public static <T> void exclusiveBetween(final T start, final T end, final Comparable<T> value) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8365);
        // TODO when breaking BC, consider returning value
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8366);if ((((value.compareTo(start) <= 0 || value.compareTo(end) >= 0)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8367)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8368)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8369);throw new IllegalArgumentException(String.format(DEFAULT_EXCLUSIVE_BETWEEN_EX_MESSAGE, value, start, end));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the specified argument object fall between the two
     * exclusive values specified; otherwise, throws an exception with the
     * specified message.</p>
     *
     * <pre>Validate.exclusiveBetween(0, 2, 1, "Not in boundaries");</pre>
     *
     * @param <T> the type of the argument object
     * @param start  the exclusive start value, not null
     * @param end  the exclusive end value, not null
     * @param value  the object to validate, not null
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalArgumentException if the value falls outside the boundaries
     * @see #exclusiveBetween(Object, Object, Comparable)
     *
     * @since 3.0
     */
    public static <T> void exclusiveBetween(final T start, final T end, final Comparable<T> value, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8370);
        // TODO when breaking BC, consider returning value
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8371);if ((((value.compareTo(start) <= 0 || value.compareTo(end) >= 0)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8372)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8373)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8374);throw new IllegalArgumentException(String.format(message, values));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // isInstanceOf
    //---------------------------------------------------------------------------------

    /**
     * Validates that the argument is an instance of the specified class, if not throws an exception.
     *  
     * <p>This method is useful when validating according to an arbitrary class</p>
     *
     * <pre>Validate.isInstanceOf(OkClass.class, object);</pre>
     *
     * <p>The message of the exception is &quot;Expected type: {type}, actual: {obj_type}&quot;</p>
     *
     * @param type  the class the object must be validated against, not null
     * @param obj  the object to check, null throws an exception
     * @throws IllegalArgumentException if argument is not of specified class
     * @see #isInstanceOf(Class, Object, String, Object...)
     *
     * @since 3.0
     */
    public static void isInstanceOf(final Class<?> type, final Object obj) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8375);
        // TODO when breaking BC, consider returning obj
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8376);if ((((type.isInstance(obj) == false)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8377)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8378)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8379);throw new IllegalArgumentException(String.format(DEFAULT_IS_INSTANCE_OF_EX_MESSAGE, type.getName(),
                    (((obj == null )&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8380)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8381)==0&false))? "null" : obj.getClass().getName()));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * <p>Validate that the argument is an instance of the specified class; otherwise
     * throwing an exception with the specified message. This method is useful when
     * validating according to an arbitrary class</p>
     *
     * <pre>Validate.isInstanceOf(OkClass.classs, object, "Wrong class, object is of class %s",
     *   object.getClass().getName());</pre>
     *
     * @param type  the class the object must be validated against, not null
     * @param obj  the object to check, null throws an exception
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalArgumentException if argument is not of specified class
     * @see #isInstanceOf(Class, Object)
     *
     * @since 3.0
     */
    public static void isInstanceOf(final Class<?> type, final Object obj, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8382);
        // TODO when breaking BC, consider returning obj
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8383);if ((((type.isInstance(obj) == false)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8384)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8385)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8386);throw new IllegalArgumentException(String.format(message, values));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    // isAssignableFrom
    //---------------------------------------------------------------------------------

    /**
     * Validates that the argument can be converted to the specified class, if not, throws an exception.
     * 
     * <p>This method is useful when validating that there will be no casting errors.</p>
     *
     * <pre>Validate.isAssignableFrom(SuperClass.class, object.getClass());</pre>
     *
     * <p>The message format of the exception is &quot;Cannot assign {type} to {superType}&quot;</p>
     *
     * @param superType  the class the class must be validated against, not null
     * @param type  the class to check, not null
     * @throws IllegalArgumentException if type argument is not assignable to the specified superType
     * @see #isAssignableFrom(Class, Class, String, Object...)
     *
     * @since 3.0
     */
    public static void isAssignableFrom(final Class<?> superType, final Class<?> type) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8387);
        // TODO when breaking BC, consider returning type
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8388);if ((((superType.isAssignableFrom(type) == false)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8389)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8390)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8391);throw new IllegalArgumentException(String.format(DEFAULT_IS_ASSIGNABLE_EX_MESSAGE, (((type == null )&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8392)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8393)==0&false))? "null" : type.getName(),
                    superType.getName()));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}

    /**
     * Validates that the argument can be converted to the specified class, if not throws an exception.
     *  
     * <p>This method is useful when validating if there will be no casting errors.</p>
     *
     * <pre>Validate.isAssignableFrom(SuperClass.class, object.getClass());</pre>
     *
     * <p>The message of the exception is &quot;The validated object can not be converted to the&quot;
     * followed by the name of the class and &quot;class&quot;</p>
     *
     * @param superType  the class the class must be validated against, not null
     * @param type  the class to check, not null
     * @param message  the {@link String#format(String, Object...)} exception message if invalid, not null
     * @param values  the optional values for the formatted exception message, null array not recommended
     * @throws IllegalArgumentException if argument can not be converted to the specified class
     * @see #isAssignableFrom(Class, Class)
     */
    public static void isAssignableFrom(final Class<?> superType, final Class<?> type, final String message, final Object... values) {try{__CLR4_1_26bj6bjl3lqxs5f.R.inc(8394);
        // TODO when breaking BC, consider returning type
        __CLR4_1_26bj6bjl3lqxs5f.R.inc(8395);if ((((superType.isAssignableFrom(type) == false)&&(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8396)!=0|true))||(__CLR4_1_26bj6bjl3lqxs5f.R.iget(8397)==0&false))) {{
            __CLR4_1_26bj6bjl3lqxs5f.R.inc(8398);throw new IllegalArgumentException(String.format(message, values));
        }
    }}finally{__CLR4_1_26bj6bjl3lqxs5f.R.flushNeeded();}}
}
