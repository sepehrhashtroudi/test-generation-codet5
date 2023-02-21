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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Utility library to provide helper methods for Java enums.</p>
 *
 * <p>#ThreadSafe#</p>
 *
 * @since 3.0
 * @version $Id$
 */
public class EnumUtils {public static class __CLR4_1_23np3npl3lqxru5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,4821,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final String NULL_ELEMENTS_NOT_PERMITTED = "null elements not permitted";
    private static final String CANNOT_STORE_S_S_VALUES_IN_S_BITS = "Cannot store %s %s values in %s bits";
    private static final String S_DOES_NOT_SEEM_TO_BE_AN_ENUM_TYPE = "%s does not seem to be an Enum type";
    private static final String ENUM_CLASS_MUST_BE_DEFINED = "EnumClass must be defined.";

    /**
     * This constructor is public to permit tools that require a JavaBean
     * instance to operate.
     */
    public EnumUtils() {try{__CLR4_1_23np3npl3lqxru5.R.inc(4741);
    }finally{__CLR4_1_23np3npl3lqxru5.R.flushNeeded();}}

    /**
     * <p>Gets the {@code Map} of enums by name.</p>
     *
     * <p>This method is useful when you need a map of enums by name.</p>
     *
     * @param <E> the type of the enumeration
     * @param enumClass  the class of the enum to query, not null
     * @return the modifiable map of enum names to enums, never null
     */
    public static <E extends Enum<E>> Map<String, E> getEnumMap(final Class<E> enumClass) {try{__CLR4_1_23np3npl3lqxru5.R.inc(4742);
        __CLR4_1_23np3npl3lqxru5.R.inc(4743);final Map<String, E> map = new LinkedHashMap<String, E>();
        __CLR4_1_23np3npl3lqxru5.R.inc(4744);for (final E e: enumClass.getEnumConstants()) {{
            __CLR4_1_23np3npl3lqxru5.R.inc(4745);map.put(e.name(), e);
        }
        }__CLR4_1_23np3npl3lqxru5.R.inc(4746);return map;
    }finally{__CLR4_1_23np3npl3lqxru5.R.flushNeeded();}}

    /**
     * <p>Gets the {@code List} of enums.</p>
     *
     * <p>This method is useful when you need a list of enums rather than an array.</p>
     *
     * @param <E> the type of the enumeration
     * @param enumClass  the class of the enum to query, not null
     * @return the modifiable list of enums, never null
     */
    public static <E extends Enum<E>> List<E> getEnumList(final Class<E> enumClass) {try{__CLR4_1_23np3npl3lqxru5.R.inc(4747);
        __CLR4_1_23np3npl3lqxru5.R.inc(4748);return new ArrayList<E>(Arrays.asList(enumClass.getEnumConstants()));
    }finally{__CLR4_1_23np3npl3lqxru5.R.flushNeeded();}}

    /**
     * <p>Checks if the specified name is a valid enum for the class.</p>
     *
     * <p>This method differs from {@link Enum#valueOf} in that checks if the name is
     * a valid enum without needing to catch the exception.</p>
     *
     * @param <E> the type of the enumeration
     * @param enumClass  the class of the enum to query, not null
     * @param enumName   the enum name, null returns false
     * @return true if the enum name is valid, otherwise false
     */
    public static <E extends Enum<E>> boolean isValidEnum(final Class<E> enumClass, final String enumName) {try{__CLR4_1_23np3npl3lqxru5.R.inc(4749);
        __CLR4_1_23np3npl3lqxru5.R.inc(4750);if ((((enumName == null)&&(__CLR4_1_23np3npl3lqxru5.R.iget(4751)!=0|true))||(__CLR4_1_23np3npl3lqxru5.R.iget(4752)==0&false))) {{
            __CLR4_1_23np3npl3lqxru5.R.inc(4753);return false;
        }
        }__CLR4_1_23np3npl3lqxru5.R.inc(4754);try {
            __CLR4_1_23np3npl3lqxru5.R.inc(4755);Enum.valueOf(enumClass, enumName);
            __CLR4_1_23np3npl3lqxru5.R.inc(4756);return true;
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_23np3npl3lqxru5.R.inc(4757);return false;
        }
    }finally{__CLR4_1_23np3npl3lqxru5.R.flushNeeded();}}

    /**
     * <p>Gets the enum for the class, returning {@code null} if not found.</p>
     *
     * <p>This method differs from {@link Enum#valueOf} in that it does not throw an exception
     * for an invalid enum name.</p>
     *
     * @param <E> the type of the enumeration
     * @param enumClass  the class of the enum to query, not null
     * @param enumName   the enum name, null returns null
     * @return the enum, null if not found
     */
    public static <E extends Enum<E>> E getEnum(final Class<E> enumClass, final String enumName) {try{__CLR4_1_23np3npl3lqxru5.R.inc(4758);
        __CLR4_1_23np3npl3lqxru5.R.inc(4759);if ((((enumName == null)&&(__CLR4_1_23np3npl3lqxru5.R.iget(4760)!=0|true))||(__CLR4_1_23np3npl3lqxru5.R.iget(4761)==0&false))) {{
            __CLR4_1_23np3npl3lqxru5.R.inc(4762);return null;
        }
        }__CLR4_1_23np3npl3lqxru5.R.inc(4763);try {
            __CLR4_1_23np3npl3lqxru5.R.inc(4764);return Enum.valueOf(enumClass, enumName);
        } catch (final IllegalArgumentException ex) {
            __CLR4_1_23np3npl3lqxru5.R.inc(4765);return null;
        }
    }finally{__CLR4_1_23np3npl3lqxru5.R.flushNeeded();}}

    /**
     * <p>Creates a long bit vector representation of the given subset of an Enum.</p>
     *
     * <p>This generates a value that is usable by {@link EnumUtils#processBitVector}.</p>
     *
     * <p>Do not use this method if you have more than 64 values in your Enum, as this
     * would create a value greater than a long can hold.</p>
     *
     * @param enumClass the class of the enum we are working with, not {@code null}
     * @param values    the values we want to convert, not {@code null}, neither containing {@code null}
     * @param <E>       the type of the enumeration
     * @return a long whose value provides a binary representation of the given set of enum values.
     * @throws NullPointerException if {@code enumClass} or {@code values} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class or has more than 64 values,
     *                                  or if any {@code values} {@code null}
     * @since 3.0.1
     * @see #generateBitVectors(Class, Iterable)
     */
    public static <E extends Enum<E>> long generateBitVector(final Class<E> enumClass, final Iterable<E> values) {try{__CLR4_1_23np3npl3lqxru5.R.inc(4766);
        __CLR4_1_23np3npl3lqxru5.R.inc(4767);checkBitVectorable(enumClass);
        __CLR4_1_23np3npl3lqxru5.R.inc(4768);Validate.notNull(values);
        __CLR4_1_23np3npl3lqxru5.R.inc(4769);long total = 0;
        __CLR4_1_23np3npl3lqxru5.R.inc(4770);for (final E constant : values) {{
            __CLR4_1_23np3npl3lqxru5.R.inc(4771);Validate.isTrue(constant != null, NULL_ELEMENTS_NOT_PERMITTED);
            __CLR4_1_23np3npl3lqxru5.R.inc(4772);total |= 1 << constant.ordinal();
        }
        }__CLR4_1_23np3npl3lqxru5.R.inc(4773);return total;
    }finally{__CLR4_1_23np3npl3lqxru5.R.flushNeeded();}}

    /**
     * <p>Creates a bit vector representation of the given subset of an Enum using as many {@code long}s as needed.</p>
     *
     * <p>This generates a value that is usable by {@link EnumUtils#processBitVectors}.</p>
     *
     * <p>Use this method if you have more than 64 values in your Enum.</p>
     *
     * @param enumClass the class of the enum we are working with, not {@code null}
     * @param values    the values we want to convert, not {@code null}, neither containing {@code null}
     * @param <E>       the type of the enumeration
     * @return a long[] whose values provide a binary representation of the given set of enum values
     *         with least significant digits rightmost.
     * @throws NullPointerException if {@code enumClass} or {@code values} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class, or if any {@code values} {@code null}
     * @since 3.2
     */
    public static <E extends Enum<E>> long[] generateBitVectors(final Class<E> enumClass, final Iterable<E> values) {try{__CLR4_1_23np3npl3lqxru5.R.inc(4774);
        __CLR4_1_23np3npl3lqxru5.R.inc(4775);asEnum(enumClass);
        __CLR4_1_23np3npl3lqxru5.R.inc(4776);Validate.notNull(values);
        __CLR4_1_23np3npl3lqxru5.R.inc(4777);final EnumSet<E> condensed = EnumSet.noneOf(enumClass);
        __CLR4_1_23np3npl3lqxru5.R.inc(4778);for (final E constant : values) {{
            __CLR4_1_23np3npl3lqxru5.R.inc(4779);Validate.isTrue(constant != null, NULL_ELEMENTS_NOT_PERMITTED);
            __CLR4_1_23np3npl3lqxru5.R.inc(4780);condensed.add(constant);
        }
        }__CLR4_1_23np3npl3lqxru5.R.inc(4781);final long[] result = new long[(enumClass.getEnumConstants().length - 1) / Long.SIZE + 1];
        __CLR4_1_23np3npl3lqxru5.R.inc(4782);for (final E value : condensed) {{
            __CLR4_1_23np3npl3lqxru5.R.inc(4783);result[value.ordinal() / Long.SIZE] |= 1 << (value.ordinal() % Long.SIZE);
        }
        }__CLR4_1_23np3npl3lqxru5.R.inc(4784);ArrayUtils.reverse(result);
        __CLR4_1_23np3npl3lqxru5.R.inc(4785);return result;
    }finally{__CLR4_1_23np3npl3lqxru5.R.flushNeeded();}}

    /**
     * <p>Creates a long bit vector representation of the given array of Enum values.</p>
     *
     * <p>This generates a value that is usable by {@link EnumUtils#processBitVector}.</p>
     *
     * <p>Do not use this method if you have more than 64 values in your Enum, as this
     * would create a value greater than a long can hold.</p>
     *
     * @param enumClass the class of the enum we are working with, not {@code null}
     * @param values    the values we want to convert, not {@code null}
     * @param <E>       the type of the enumeration
     * @return a long whose value provides a binary representation of the given set of enum values.
     * @throws NullPointerException if {@code enumClass} or {@code values} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class or has more than 64 values
     * @since 3.0.1
     * @see #generateBitVectors(Class, Iterable)
     */
    public static <E extends Enum<E>> long generateBitVector(final Class<E> enumClass, final E... values) {try{__CLR4_1_23np3npl3lqxru5.R.inc(4786);
        __CLR4_1_23np3npl3lqxru5.R.inc(4787);Validate.noNullElements(values);
        __CLR4_1_23np3npl3lqxru5.R.inc(4788);return generateBitVector(enumClass, Arrays.<E> asList(values));
    }finally{__CLR4_1_23np3npl3lqxru5.R.flushNeeded();}}

    /**
     * <p>Creates a bit vector representation of the given subset of an Enum using as many {@code long}s as needed.</p>
     *
     * <p>This generates a value that is usable by {@link EnumUtils#processBitVectors}.</p>
     *
     * <p>Use this method if you have more than 64 values in your Enum.</p>
     *
     * @param enumClass the class of the enum we are working with, not {@code null}
     * @param values    the values we want to convert, not {@code null}, neither containing {@code null}
     * @param <E>       the type of the enumeration
     * @return a long[] whose values provide a binary representation of the given set of enum values
     *         with least significant digits rightmost.
     * @throws NullPointerException if {@code enumClass} or {@code values} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class, or if any {@code values} {@code null}
     * @since 3.2
     */
    public static <E extends Enum<E>> long[] generateBitVectors(final Class<E> enumClass, final E... values) {try{__CLR4_1_23np3npl3lqxru5.R.inc(4789);
        __CLR4_1_23np3npl3lqxru5.R.inc(4790);asEnum(enumClass);
        __CLR4_1_23np3npl3lqxru5.R.inc(4791);Validate.noNullElements(values);
        __CLR4_1_23np3npl3lqxru5.R.inc(4792);final EnumSet<E> condensed = EnumSet.noneOf(enumClass);
        __CLR4_1_23np3npl3lqxru5.R.inc(4793);Collections.addAll(condensed, values);
        __CLR4_1_23np3npl3lqxru5.R.inc(4794);final long[] result = new long[(enumClass.getEnumConstants().length - 1) / Long.SIZE + 1];
        __CLR4_1_23np3npl3lqxru5.R.inc(4795);for (final E value : condensed) {{
            __CLR4_1_23np3npl3lqxru5.R.inc(4796);result[value.ordinal() / Long.SIZE] |= 1 << (value.ordinal() % Long.SIZE);
        }
        }__CLR4_1_23np3npl3lqxru5.R.inc(4797);ArrayUtils.reverse(result);
        __CLR4_1_23np3npl3lqxru5.R.inc(4798);return result;
    }finally{__CLR4_1_23np3npl3lqxru5.R.flushNeeded();}}

    /**
     * <p>Convert a long value created by {@link EnumUtils#generateBitVector} into the set of
     * enum values that it represents.</p>
     *
     * <p>If you store this value, beware any changes to the enum that would affect ordinal values.</p>
     * @param enumClass the class of the enum we are working with, not {@code null}
     * @param value     the long value representation of a set of enum values
     * @param <E>       the type of the enumeration
     * @return a set of enum values
     * @throws NullPointerException if {@code enumClass} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class or has more than 64 values
     * @since 3.0.1
     */
    public static <E extends Enum<E>> EnumSet<E> processBitVector(final Class<E> enumClass, final long value) {try{__CLR4_1_23np3npl3lqxru5.R.inc(4799);
        __CLR4_1_23np3npl3lqxru5.R.inc(4800);checkBitVectorable(enumClass).getEnumConstants();
        __CLR4_1_23np3npl3lqxru5.R.inc(4801);return processBitVectors(enumClass, value);
    }finally{__CLR4_1_23np3npl3lqxru5.R.flushNeeded();}}

    /**
     * <p>Convert a {@code long[]} created by {@link EnumUtils#generateBitVectors} into the set of
     * enum values that it represents.</p>
     *
     * <p>If you store this value, beware any changes to the enum that would affect ordinal values.</p>
     * @param enumClass the class of the enum we are working with, not {@code null}
     * @param values     the long[] bearing the representation of a set of enum values, least significant digits rightmost, not {@code null}
     * @param <E>       the type of the enumeration
     * @return a set of enum values
     * @throws NullPointerException if {@code enumClass} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class
     * @since 3.2
     */
    public static <E extends Enum<E>> EnumSet<E> processBitVectors(final Class<E> enumClass, long... values) {try{__CLR4_1_23np3npl3lqxru5.R.inc(4802);
        __CLR4_1_23np3npl3lqxru5.R.inc(4803);final EnumSet<E> results = EnumSet.noneOf(asEnum(enumClass));
        __CLR4_1_23np3npl3lqxru5.R.inc(4804);values = ArrayUtils.clone(Validate.notNull(values));
        __CLR4_1_23np3npl3lqxru5.R.inc(4805);ArrayUtils.reverse(values);
        __CLR4_1_23np3npl3lqxru5.R.inc(4806);for (final E constant : enumClass.getEnumConstants()) {{
            __CLR4_1_23np3npl3lqxru5.R.inc(4807);final int block = constant.ordinal() / Long.SIZE;
            __CLR4_1_23np3npl3lqxru5.R.inc(4808);if ((((block < values.length && (values[block] & 1 << (constant.ordinal() % Long.SIZE)) != 0)&&(__CLR4_1_23np3npl3lqxru5.R.iget(4809)!=0|true))||(__CLR4_1_23np3npl3lqxru5.R.iget(4810)==0&false))) {{
                __CLR4_1_23np3npl3lqxru5.R.inc(4811);results.add(constant);
            }
        }}
        }__CLR4_1_23np3npl3lqxru5.R.inc(4812);return results;
    }finally{__CLR4_1_23np3npl3lqxru5.R.flushNeeded();}}

    /**
     * Validate that {@code enumClass} is compatible with representation in a {@code long}.
     * @param <E> the type of the enumeration
     * @param enumClass to check
     * @return {@code enumClass}
     * @throws NullPointerException if {@code enumClass} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class or has more than 64 values
     * @since 3.0.1
     */
    private static <E extends Enum<E>> Class<E> checkBitVectorable(final Class<E> enumClass) {try{__CLR4_1_23np3npl3lqxru5.R.inc(4813);
        __CLR4_1_23np3npl3lqxru5.R.inc(4814);final E[] constants = asEnum(enumClass).getEnumConstants();
        __CLR4_1_23np3npl3lqxru5.R.inc(4815);Validate.isTrue(constants.length <= Long.SIZE, CANNOT_STORE_S_S_VALUES_IN_S_BITS, constants.length,
            enumClass.getSimpleName(), Long.SIZE);

        __CLR4_1_23np3npl3lqxru5.R.inc(4816);return enumClass;
    }finally{__CLR4_1_23np3npl3lqxru5.R.flushNeeded();}}

    /**
     * Validate {@code enumClass}.
     * @param <E> the type of the enumeration
     * @param enumClass to check
     * @return {@code enumClass}
     * @throws NullPointerException if {@code enumClass} is {@code null}
     * @throws IllegalArgumentException if {@code enumClass} is not an enum class
     * @since 3.2
     */
    private static <E extends Enum<E>> Class<E> asEnum(final Class<E> enumClass) {try{__CLR4_1_23np3npl3lqxru5.R.inc(4817);
        __CLR4_1_23np3npl3lqxru5.R.inc(4818);Validate.notNull(enumClass, ENUM_CLASS_MUST_BE_DEFINED);
        __CLR4_1_23np3npl3lqxru5.R.inc(4819);Validate.isTrue(enumClass.isEnum(), S_DOES_NOT_SEEM_TO_BE_AN_ENUM_TYPE, enumClass);
        __CLR4_1_23np3npl3lqxru5.R.inc(4820);return enumClass;
    }finally{__CLR4_1_23np3npl3lqxru5.R.flushNeeded();}}
}
