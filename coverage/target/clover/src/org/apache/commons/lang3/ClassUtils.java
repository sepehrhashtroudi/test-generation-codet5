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

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;


/**
 * <p>Operates on classes without using reflection.</p>
 *
 * <p>This class handles invalid {@code null} inputs as best it can.
 * Each method documents its behaviour in more detail.</p>
 *
 * <p>The notion of a {@code canonical name} includes the human
 * readable name for the type, for example {@code int[]}. The
 * non-canonical method variants work with the JVM names, such as
 * {@code [I}. </p>
 *
 * @since 2.0
 * @version $Id$
 */
public class ClassUtils {public static class __CLR4_1_22kd2kdl3lqxrqu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,3796,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * The package separator character: <code>'&#x2e;' == {@value}</code>.
     */
    public static final char PACKAGE_SEPARATOR_CHAR = '.';

    /**
     * The package separator String: <code>"&#x2e;"</code>.
     */
    public static final String PACKAGE_SEPARATOR = String.valueOf(PACKAGE_SEPARATOR_CHAR);

    /**
     * The inner class separator character: <code>'$' == {@value}</code>.
     */
    public static final char INNER_CLASS_SEPARATOR_CHAR = '$';

    /**
     * The inner class separator String: {@code "$"}.
     */
    public static final String INNER_CLASS_SEPARATOR = String.valueOf(INNER_CLASS_SEPARATOR_CHAR);

    /**
     * Maps primitive {@code Class}es to their corresponding wrapper {@code Class}.
     */
    private static final Map<Class<?>, Class<?>> primitiveWrapperMap = new HashMap<Class<?>, Class<?>>();
    static {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3325);
         __CLR4_1_22kd2kdl3lqxrqu.R.inc(3326);primitiveWrapperMap.put(Boolean.TYPE, Boolean.class);
         __CLR4_1_22kd2kdl3lqxrqu.R.inc(3327);primitiveWrapperMap.put(Byte.TYPE, Byte.class);
         __CLR4_1_22kd2kdl3lqxrqu.R.inc(3328);primitiveWrapperMap.put(Character.TYPE, Character.class);
         __CLR4_1_22kd2kdl3lqxrqu.R.inc(3329);primitiveWrapperMap.put(Short.TYPE, Short.class);
         __CLR4_1_22kd2kdl3lqxrqu.R.inc(3330);primitiveWrapperMap.put(Integer.TYPE, Integer.class);
         __CLR4_1_22kd2kdl3lqxrqu.R.inc(3331);primitiveWrapperMap.put(Long.TYPE, Long.class);
         __CLR4_1_22kd2kdl3lqxrqu.R.inc(3332);primitiveWrapperMap.put(Double.TYPE, Double.class);
         __CLR4_1_22kd2kdl3lqxrqu.R.inc(3333);primitiveWrapperMap.put(Float.TYPE, Float.class);
         __CLR4_1_22kd2kdl3lqxrqu.R.inc(3334);primitiveWrapperMap.put(Void.TYPE, Void.TYPE);
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * Maps wrapper {@code Class}es to their corresponding primitive types.
     */
    private static final Map<Class<?>, Class<?>> wrapperPrimitiveMap = new HashMap<Class<?>, Class<?>>();
    static {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3335);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3336);for (final Class<?> primitiveClass : primitiveWrapperMap.keySet()) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3337);final Class<?> wrapperClass = primitiveWrapperMap.get(primitiveClass);
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3338);if ((((!primitiveClass.equals(wrapperClass))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3339)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3340)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3341);wrapperPrimitiveMap.put(wrapperClass, primitiveClass);
            }
        }}
    }}finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * Maps a primitive class name to its corresponding abbreviation used in array class names.
     */
    private static final Map<String, String> abbreviationMap = new HashMap<String, String>();

    /**
     * Maps an abbreviation used in array class names to corresponding primitive class name.
     */
    private static final Map<String, String> reverseAbbreviationMap = new HashMap<String, String>();

    /**
     * Add primitive type abbreviation to maps of abbreviations.
     *
     * @param primitive Canonical name of primitive type
     * @param abbreviation Corresponding abbreviation of primitive type
     */
    private static void addAbbreviation(final String primitive, final String abbreviation) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3342);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3343);abbreviationMap.put(primitive, abbreviation);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3344);reverseAbbreviationMap.put(abbreviation, primitive);
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * Feed abbreviation maps
     */
    static {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3345);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3346);addAbbreviation("int", "I");
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3347);addAbbreviation("boolean", "Z");
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3348);addAbbreviation("float", "F");
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3349);addAbbreviation("long", "J");
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3350);addAbbreviation("short", "S");
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3351);addAbbreviation("byte", "B");
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3352);addAbbreviation("double", "D");
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3353);addAbbreviation("char", "C");
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>ClassUtils instances should NOT be constructed in standard programming.
     * Instead, the class should be used as
     * {@code ClassUtils.getShortClassName(cls)}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public ClassUtils() {
      super();__CLR4_1_22kd2kdl3lqxrqu.R.inc(3355);try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3354);
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    // Short class name
    // ----------------------------------------------------------------------
    /**
     * <p>Gets the class name minus the package name for an {@code Object}.</p>
     *
     * @param object  the class to get the short name for, may be null
     * @param valueIfNull  the value to return if null
     * @return the class name of the object without the package name, or the null value
     */
    public static String getShortClassName(final Object object, final String valueIfNull) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3356);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3357);if ((((object == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3358)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3359)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3360);return valueIfNull;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3361);return getShortClassName(object.getClass());
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Gets the class name minus the package name from a {@code Class}.</p>
     *
     * <p>Consider using the Java 5 API {@link Class#getSimpleName()} instead.
     * The one known difference is that this code will return {@code "Map.Entry"} while
     * the {@code java.lang.Class} variant will simply return {@code "Entry"}. </p>
     *
     * @param cls  the class to get the short name for.
     * @return the class name without the package name or an empty string
     */
    public static String getShortClassName(final Class<?> cls) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3362);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3363);if ((((cls == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3364)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3365)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3366);return StringUtils.EMPTY;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3367);return getShortClassName(cls.getName());
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Gets the class name minus the package name from a String.</p>
     *
     * <p>The string passed in is assumed to be a class name - it is not checked.</p>

     * <p>Note that this method differs from Class.getSimpleName() in that this will
     * return {@code "Map.Entry"} whilst the {@code java.lang.Class} variant will simply
     * return {@code "Entry"}. </p>
     *
     * @param className  the className to get the short name for
     * @return the class name of the class without the package name or an empty string
     */
    public static String getShortClassName(String className) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3368);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3369);if ((((StringUtils.isEmpty(className))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3370)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3371)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3372);return StringUtils.EMPTY;
        }

        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3373);final StringBuilder arrayPrefix = new StringBuilder();

        // Handle array encoding
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3374);if ((((className.startsWith("["))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3375)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3376)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3377);while ((((className.charAt(0) == '[')&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3378)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3379)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3380);className = className.substring(1);
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3381);arrayPrefix.append("[]");
            }
            // Strip Object type encoding
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3382);if ((((className.charAt(0) == 'L' && className.charAt(className.length() - 1) == ';')&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3383)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3384)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3385);className = className.substring(1, className.length() - 1);
            }

            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3386);if ((((reverseAbbreviationMap.containsKey(className))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3387)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3388)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3389);className = reverseAbbreviationMap.get(className);
            }
        }}

        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3390);final int lastDotIdx = className.lastIndexOf(PACKAGE_SEPARATOR_CHAR);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3391);final int innerIdx = className.indexOf(
                INNER_CLASS_SEPARATOR_CHAR, (((lastDotIdx == -1 )&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3392)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3393)==0&false))? 0 : lastDotIdx + 1);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3394);String out = className.substring(lastDotIdx + 1);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3395);if ((((innerIdx != -1)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3396)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3397)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3398);out = out.replace(INNER_CLASS_SEPARATOR_CHAR, PACKAGE_SEPARATOR_CHAR);
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3399);return out + arrayPrefix;
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Null-safe version of <code>aClass.getSimpleName()</code></p>
     *
     * @param cls the class for which to get the simple name.
     * @return the simple class name.
     * @since 3.0
     * @see Class#getSimpleName()
     */
    public static String getSimpleName(final Class<?> cls) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3400);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3401);if ((((cls == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3402)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3403)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3404);return StringUtils.EMPTY;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3405);return cls.getSimpleName();
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Null-safe version of <code>aClass.getSimpleName()</code></p>
     *
     * @param object the object for which to get the simple class name.
     * @param valueIfNull the value to return if <code>object</code> is <code>null</code>
     * @return the simple class name.
     * @since 3.0
     * @see Class#getSimpleName()
     */
    public static String getSimpleName(final Object object, final String valueIfNull) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3406);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3407);if ((((object == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3408)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3409)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3410);return valueIfNull;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3411);return getSimpleName(object.getClass());
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    // Package name
    // ----------------------------------------------------------------------
    /**
     * <p>Gets the package name of an {@code Object}.</p>
     *
     * @param object  the class to get the package name for, may be null
     * @param valueIfNull  the value to return if null
     * @return the package name of the object, or the null value
     */
    public static String getPackageName(final Object object, final String valueIfNull) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3412);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3413);if ((((object == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3414)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3415)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3416);return valueIfNull;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3417);return getPackageName(object.getClass());
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Gets the package name of a {@code Class}.</p>
     *
     * @param cls  the class to get the package name for, may be {@code null}.
     * @return the package name or an empty string
     */
    public static String getPackageName(final Class<?> cls) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3418);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3419);if ((((cls == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3420)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3421)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3422);return StringUtils.EMPTY;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3423);return getPackageName(cls.getName());
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Gets the package name from a {@code String}.</p>
     *
     * <p>The string passed in is assumed to be a class name - it is not checked.</p>
     * <p>If the class is unpackaged, return an empty string.</p>
     *
     * @param className  the className to get the package name for, may be {@code null}
     * @return the package name or an empty string
     */
    public static String getPackageName(String className) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3424);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3425);if ((((StringUtils.isEmpty(className))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3426)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3427)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3428);return StringUtils.EMPTY;
        }

        // Strip array encoding
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3429);while ((((className.charAt(0) == '[')&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3430)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3431)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3432);className = className.substring(1);
        }
        // Strip Object type encoding
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3433);if ((((className.charAt(0) == 'L' && className.charAt(className.length() - 1) == ';')&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3434)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3435)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3436);className = className.substring(1);
        }

        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3437);final int i = className.lastIndexOf(PACKAGE_SEPARATOR_CHAR);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3438);if ((((i == -1)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3439)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3440)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3441);return StringUtils.EMPTY;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3442);return className.substring(0, i);
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    // Superclasses/Superinterfaces
    // ----------------------------------------------------------------------
    /**
     * <p>Gets a {@code List} of superclasses for the given class.</p>
     *
     * @param cls  the class to look up, may be {@code null}
     * @return the {@code List} of superclasses in order going up from this one
     *  {@code null} if null input
     */
    public static List<Class<?>> getAllSuperclasses(final Class<?> cls) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3443);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3444);if ((((cls == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3445)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3446)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3447);return null;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3448);final List<Class<?>> classes = new ArrayList<Class<?>>();
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3449);Class<?> superclass = cls.getSuperclass();
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3450);while ((((superclass != null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3451)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3452)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3453);classes.add(superclass);
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3454);superclass = superclass.getSuperclass();
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3455);return classes;
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Gets a {@code List} of all interfaces implemented by the given
     * class and its superclasses.</p>
     *
     * <p>The order is determined by looking through each interface in turn as
     * declared in the source file and following its hierarchy up. Then each
     * superclass is considered in the same way. Later duplicates are ignored,
     * so the order is maintained.</p>
     *
     * @param cls  the class to look up, may be {@code null}
     * @return the {@code List} of interfaces in order,
     *  {@code null} if null input
     */
    public static List<Class<?>> getAllInterfaces(final Class<?> cls) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3456);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3457);if ((((cls == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3458)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3459)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3460);return null;
        }

        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3461);final LinkedHashSet<Class<?>> interfacesFound = new LinkedHashSet<Class<?>>();
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3462);getAllInterfaces(cls, interfacesFound);

        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3463);return new ArrayList<Class<?>>(interfacesFound);
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * Get the interfaces for the specified class.
     *
     * @param cls  the class to look up, may be {@code null}
     * @param interfacesFound the {@code Set} of interfaces for the class
     */
    private static void getAllInterfaces(Class<?> cls, final HashSet<Class<?>> interfacesFound) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3464);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3465);while ((((cls != null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3466)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3467)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3468);final Class<?>[] interfaces = cls.getInterfaces();

            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3469);for (final Class<?> i : interfaces) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3470);if ((((interfacesFound.add(i))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3471)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3472)==0&false))) {{
                    __CLR4_1_22kd2kdl3lqxrqu.R.inc(3473);getAllInterfaces(i, interfacesFound);
                }
            }}

            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3474);cls = cls.getSuperclass();
         }
     }}finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    // Convert list
    // ----------------------------------------------------------------------
    /**
     * <p>Given a {@code List} of class names, this method converts them into classes.</p>
     *
     * <p>A new {@code List} is returned. If the class name cannot be found, {@code null}
     * is stored in the {@code List}. If the class name in the {@code List} is
     * {@code null}, {@code null} is stored in the output {@code List}.</p>
     *
     * @param classNames  the classNames to change
     * @return a {@code List} of Class objects corresponding to the class names,
     *  {@code null} if null input
     * @throws ClassCastException if classNames contains a non String entry
     */
    public static List<Class<?>> convertClassNamesToClasses(final List<String> classNames) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3475);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3476);if ((((classNames == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3477)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3478)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3479);return null;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3480);final List<Class<?>> classes = new ArrayList<Class<?>>(classNames.size());
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3481);for (final String className : classNames) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3482);try {
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3483);classes.add(Class.forName(className));
            } catch (final Exception ex) {
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3484);classes.add(null);
            }
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3485);return classes;
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Given a {@code List} of {@code Class} objects, this method converts
     * them into class names.</p>
     *
     * <p>A new {@code List} is returned. {@code null} objects will be copied into
     * the returned list as {@code null}.</p>
     *
     * @param classes  the classes to change
     * @return a {@code List} of class names corresponding to the Class objects,
     *  {@code null} if null input
     * @throws ClassCastException if {@code classes} contains a non-{@code Class} entry
     */
    public static List<String> convertClassesToClassNames(final List<Class<?>> classes) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3486);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3487);if ((((classes == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3488)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3489)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3490);return null;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3491);final List<String> classNames = new ArrayList<String>(classes.size());
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3492);for (final Class<?> cls : classes) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3493);if ((((cls == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3494)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3495)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3496);classNames.add(null);
            } }else {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3497);classNames.add(cls.getName());
            }
        }}
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3498);return classNames;
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    // Is assignable
    // ----------------------------------------------------------------------
    /**
     * <p>Checks if an array of Classes can be assigned to another array of Classes.</p>
     *
     * <p>This method calls {@link #isAssignable(Class, Class) isAssignable} for each
     * Class pair in the input arrays. It can be used to check if a set of arguments
     * (the first parameter) are suitably compatible with a set of method parameter types
     * (the second parameter).</p>
     *
     * <p>Unlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this
     * method takes into account widenings of primitive classes and
     * {@code null}s.</p>
     *
     * <p>Primitive widenings allow an int to be assigned to a {@code long},
     * {@code float} or {@code double}. This method returns the correct
     * result for these cases.</p>
     *
     * <p>{@code Null} may be assigned to any reference type. This method will
     * return {@code true} if {@code null} is passed in and the toClass is
     * non-primitive.</p>
     *
     * <p>Specifically, this method tests whether the type represented by the
     * specified {@code Class} parameter can be converted to the type
     * represented by this {@code Class} object via an identity conversion
     * widening primitive or widening reference conversion. See
     * <em><a href="http://docs.oracle.com/javase/specs/">The Java Language Specification</a></em>,
     * sections 5.1.1, 5.1.2 and 5.1.4 for details.</p>
     *
     * <p><strong>Since Lang 3.0,</strong> this method will default behavior for
     * calculating assignability between primitive and wrapper types <em>corresponding
     * to the running Java version</em>; i.e. autoboxing will be the default
     * behavior in VMs running Java versions >= 1.5.</p>
     *
     * @param classArray  the array of Classes to check, may be {@code null}
     * @param toClassArray  the array of Classes to try to assign into, may be {@code null}
     * @return {@code true} if assignment possible
     */
    public static boolean isAssignable(final Class<?>[] classArray, final Class<?>... toClassArray) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3499);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3500);return isAssignable(classArray, toClassArray, SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_1_5));
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Checks if an array of Classes can be assigned to another array of Classes.</p>
     *
     * <p>This method calls {@link #isAssignable(Class, Class) isAssignable} for each
     * Class pair in the input arrays. It can be used to check if a set of arguments
     * (the first parameter) are suitably compatible with a set of method parameter types
     * (the second parameter).</p>
     *
     * <p>Unlike the {@link Class#isAssignableFrom(java.lang.Class)} method, this
     * method takes into account widenings of primitive classes and
     * {@code null}s.</p>
     *
     * <p>Primitive widenings allow an int to be assigned to a {@code long},
     * {@code float} or {@code double}. This method returns the correct
     * result for these cases.</p>
     *
     * <p>{@code Null} may be assigned to any reference type. This method will
     * return {@code true} if {@code null} is passed in and the toClass is
     * non-primitive.</p>
     *
     * <p>Specifically, this method tests whether the type represented by the
     * specified {@code Class} parameter can be converted to the type
     * represented by this {@code Class} object via an identity conversion
     * widening primitive or widening reference conversion. See
     * <em><a href="http://docs.oracle.com/javase/specs/">The Java Language Specification</a></em>,
     * sections 5.1.1, 5.1.2 and 5.1.4 for details.</p>
     *
     * @param classArray  the array of Classes to check, may be {@code null}
     * @param toClassArray  the array of Classes to try to assign into, may be {@code null}
     * @param autoboxing  whether to use implicit autoboxing/unboxing between primitives and wrappers
     * @return {@code true} if assignment possible
     */
    public static boolean isAssignable(Class<?>[] classArray, Class<?>[] toClassArray, final boolean autoboxing) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3501);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3502);if ((((ArrayUtils.isSameLength(classArray, toClassArray) == false)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3503)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3504)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3505);return false;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3506);if ((((classArray == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3507)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3508)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3509);classArray = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3510);if ((((toClassArray == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3511)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3512)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3513);toClassArray = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3514);for (int i = 0; (((i < classArray.length)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3515)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3516)==0&false)); i++) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3517);if ((((isAssignable(classArray[i], toClassArray[i], autoboxing) == false)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3518)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3519)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3520);return false;
            }
        }}
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3521);return true;
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * Returns whether the given {@code type} is a primitive or primitive wrapper ({@link Boolean}, {@link Byte}, {@link Character},
     * {@link Short}, {@link Integer}, {@link Long}, {@link Double}, {@link Float}).
     *
     * @param type
     *            The class to query or null.
     * @return true if the given {@code type} is a primitive or primitive wrapper ({@link Boolean}, {@link Byte}, {@link Character},
     *         {@link Short}, {@link Integer}, {@link Long}, {@link Double}, {@link Float}).
     * @since 3.1
     */
    public static boolean isPrimitiveOrWrapper(final Class<?> type) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3522);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3523);if ((((type == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3524)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3525)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3526);return false;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3527);return type.isPrimitive() || isPrimitiveWrapper(type);
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * Returns whether the given {@code type} is a primitive wrapper ({@link Boolean}, {@link Byte}, {@link Character}, {@link Short},
     * {@link Integer}, {@link Long}, {@link Double}, {@link Float}).
     *
     * @param type
     *            The class to query or null.
     * @return true if the given {@code type} is a primitive wrapper ({@link Boolean}, {@link Byte}, {@link Character}, {@link Short},
     *         {@link Integer}, {@link Long}, {@link Double}, {@link Float}).
     * @since 3.1
     */
    public static boolean isPrimitiveWrapper(final Class<?> type) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3528);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3529);return wrapperPrimitiveMap.containsKey(type);
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Checks if one {@code Class} can be assigned to a variable of
     * another {@code Class}.</p>
     *
     * <p>Unlike the {@link Class#isAssignableFrom(java.lang.Class)} method,
     * this method takes into account widenings of primitive classes and
     * {@code null}s.</p>
     *
     * <p>Primitive widenings allow an int to be assigned to a long, float or
     * double. This method returns the correct result for these cases.</p>
     *
     * <p>{@code Null} may be assigned to any reference type. This method
     * will return {@code true} if {@code null} is passed in and the
     * toClass is non-primitive.</p>
     *
     * <p>Specifically, this method tests whether the type represented by the
     * specified {@code Class} parameter can be converted to the type
     * represented by this {@code Class} object via an identity conversion
     * widening primitive or widening reference conversion. See
     * <em><a href="http://docs.oracle.com/javase/specs/">The Java Language Specification</a></em>,
     * sections 5.1.1, 5.1.2 and 5.1.4 for details.</p>
     *
     * <p><strong>Since Lang 3.0,</strong> this method will default behavior for
     * calculating assignability between primitive and wrapper types <em>corresponding
     * to the running Java version</em>; i.e. autoboxing will be the default
     * behavior in VMs running Java versions >= 1.5.</p>
     *
     * @param cls  the Class to check, may be null
     * @param toClass  the Class to try to assign into, returns false if null
     * @return {@code true} if assignment possible
     */
    public static boolean isAssignable(final Class<?> cls, final Class<?> toClass) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3530);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3531);return isAssignable(cls, toClass, SystemUtils.isJavaVersionAtLeast(JavaVersion.JAVA_1_5));
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Checks if one {@code Class} can be assigned to a variable of
     * another {@code Class}.</p>
     *
     * <p>Unlike the {@link Class#isAssignableFrom(java.lang.Class)} method,
     * this method takes into account widenings of primitive classes and
     * {@code null}s.</p>
     *
     * <p>Primitive widenings allow an int to be assigned to a long, float or
     * double. This method returns the correct result for these cases.</p>
     *
     * <p>{@code Null} may be assigned to any reference type. This method
     * will return {@code true} if {@code null} is passed in and the
     * toClass is non-primitive.</p>
     *
     * <p>Specifically, this method tests whether the type represented by the
     * specified {@code Class} parameter can be converted to the type
     * represented by this {@code Class} object via an identity conversion
     * widening primitive or widening reference conversion. See
     * <em><a href="http://docs.oracle.com/javase/specs/">The Java Language Specification</a></em>,
     * sections 5.1.1, 5.1.2 and 5.1.4 for details.</p>
     *
     * @param cls  the Class to check, may be null
     * @param toClass  the Class to try to assign into, returns false if null
     * @param autoboxing  whether to use implicit autoboxing/unboxing between primitives and wrappers
     * @return {@code true} if assignment possible
     */
    public static boolean isAssignable(Class<?> cls, final Class<?> toClass, final boolean autoboxing) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3532);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3533);if ((((toClass == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3534)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3535)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3536);return false;
        }
        // have to check for null, as isAssignableFrom doesn't
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3537);if ((((cls == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3538)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3539)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3540);return !toClass.isPrimitive();
        }
        //autoboxing:
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3541);if ((((autoboxing)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3542)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3543)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3544);if ((((cls.isPrimitive() && !toClass.isPrimitive())&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3545)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3546)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3547);cls = primitiveToWrapper(cls);
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3548);if ((((cls == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3549)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3550)==0&false))) {{
                    __CLR4_1_22kd2kdl3lqxrqu.R.inc(3551);return false;
                }
            }}
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3552);if ((((toClass.isPrimitive() && !cls.isPrimitive())&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3553)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3554)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3555);cls = wrapperToPrimitive(cls);
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3556);if ((((cls == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3557)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3558)==0&false))) {{
                    __CLR4_1_22kd2kdl3lqxrqu.R.inc(3559);return false;
                }
            }}
        }}
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3560);if ((((cls.equals(toClass))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3561)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3562)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3563);return true;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3564);if ((((cls.isPrimitive())&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3565)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3566)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3567);if ((((toClass.isPrimitive() == false)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3568)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3569)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3570);return false;
            }
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3571);if ((((Integer.TYPE.equals(cls))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3572)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3573)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3574);return Long.TYPE.equals(toClass)
                    || Float.TYPE.equals(toClass)
                    || Double.TYPE.equals(toClass);
            }
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3575);if ((((Long.TYPE.equals(cls))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3576)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3577)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3578);return Float.TYPE.equals(toClass)
                    || Double.TYPE.equals(toClass);
            }
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3579);if ((((Boolean.TYPE.equals(cls))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3580)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3581)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3582);return false;
            }
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3583);if ((((Double.TYPE.equals(cls))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3584)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3585)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3586);return false;
            }
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3587);if ((((Float.TYPE.equals(cls))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3588)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3589)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3590);return Double.TYPE.equals(toClass);
            }
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3591);if ((((Character.TYPE.equals(cls))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3592)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3593)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3594);return Integer.TYPE.equals(toClass)
                    || Long.TYPE.equals(toClass)
                    || Float.TYPE.equals(toClass)
                    || Double.TYPE.equals(toClass);
            }
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3595);if ((((Short.TYPE.equals(cls))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3596)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3597)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3598);return Integer.TYPE.equals(toClass)
                    || Long.TYPE.equals(toClass)
                    || Float.TYPE.equals(toClass)
                    || Double.TYPE.equals(toClass);
            }
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3599);if ((((Byte.TYPE.equals(cls))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3600)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3601)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3602);return Short.TYPE.equals(toClass)
                    || Integer.TYPE.equals(toClass)
                    || Long.TYPE.equals(toClass)
                    || Float.TYPE.equals(toClass)
                    || Double.TYPE.equals(toClass);
            }
            // should never get here
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3603);return false;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3604);return toClass.isAssignableFrom(cls);
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Converts the specified primitive Class object to its corresponding
     * wrapper Class object.</p>
     *
     * <p>NOTE: From v2.2, this method handles {@code Void.TYPE},
     * returning {@code Void.TYPE}.</p>
     *
     * @param cls  the class to convert, may be null
     * @return the wrapper class for {@code cls} or {@code cls} if
     * {@code cls} is not a primitive. {@code null} if null input.
     * @since 2.1
     */
    public static Class<?> primitiveToWrapper(final Class<?> cls) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3605);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3606);Class<?> convertedClass = cls;
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3607);if ((((cls != null && cls.isPrimitive())&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3608)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3609)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3610);convertedClass = primitiveWrapperMap.get(cls);
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3611);return convertedClass;
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Converts the specified array of primitive Class objects to an array of
     * its corresponding wrapper Class objects.</p>
     *
     * @param classes  the class array to convert, may be null or empty
     * @return an array which contains for each given class, the wrapper class or
     * the original class if class is not a primitive. {@code null} if null input.
     * Empty array if an empty array passed in.
     * @since 2.1
     */
    public static Class<?>[] primitivesToWrappers(final Class<?>... classes) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3612);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3613);if ((((classes == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3614)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3615)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3616);return null;
        }

        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3617);if ((((classes.length == 0)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3618)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3619)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3620);return classes;
        }

        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3621);final Class<?>[] convertedClasses = new Class[classes.length];
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3622);for (int i = 0; (((i < classes.length)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3623)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3624)==0&false)); i++) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3625);convertedClasses[i] = primitiveToWrapper(classes[i]);
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3626);return convertedClasses;
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Converts the specified wrapper class to its corresponding primitive
     * class.</p>
     *
     * <p>This method is the counter part of {@code primitiveToWrapper()}.
     * If the passed in class is a wrapper class for a primitive type, this
     * primitive type will be returned (e.g. {@code Integer.TYPE} for
     * {@code Integer.class}). For other classes, or if the parameter is
     * <b>null</b>, the return value is <b>null</b>.</p>
     *
     * @param cls the class to convert, may be <b>null</b>
     * @return the corresponding primitive type if {@code cls} is a
     * wrapper class, <b>null</b> otherwise
     * @see #primitiveToWrapper(Class)
     * @since 2.4
     */
    public static Class<?> wrapperToPrimitive(final Class<?> cls) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3627);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3628);return wrapperPrimitiveMap.get(cls);
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Converts the specified array of wrapper Class objects to an array of
     * its corresponding primitive Class objects.</p>
     *
     * <p>This method invokes {@code wrapperToPrimitive()} for each element
     * of the passed in array.</p>
     *
     * @param classes  the class array to convert, may be null or empty
     * @return an array which contains for each given class, the primitive class or
     * <b>null</b> if the original class is not a wrapper class. {@code null} if null input.
     * Empty array if an empty array passed in.
     * @see #wrapperToPrimitive(Class)
     * @since 2.4
     */
    public static Class<?>[] wrappersToPrimitives(final Class<?>... classes) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3629);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3630);if ((((classes == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3631)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3632)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3633);return null;
        }

        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3634);if ((((classes.length == 0)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3635)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3636)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3637);return classes;
        }

        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3638);final Class<?>[] convertedClasses = new Class[classes.length];
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3639);for (int i = 0; (((i < classes.length)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3640)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3641)==0&false)); i++) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3642);convertedClasses[i] = wrapperToPrimitive(classes[i]);
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3643);return convertedClasses;
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    // Inner class
    // ----------------------------------------------------------------------
    /**
     * <p>Is the specified class an inner class or static nested class.</p>
     *
     * @param cls  the class to check, may be null
     * @return {@code true} if the class is an inner or static nested class,
     *  false if not or {@code null}
     */
    public static boolean isInnerClass(final Class<?> cls) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3644);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3645);return cls != null && cls.getEnclosingClass() != null;
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    // Class loading
    // ----------------------------------------------------------------------
    /**
     * Returns the class represented by {@code className} using the
     * {@code classLoader}.  This implementation supports the syntaxes
     * "{@code java.util.Map.Entry[]}", "{@code java.util.Map$Entry[]}",
     * "{@code [Ljava.util.Map.Entry;}", and "{@code [Ljava.util.Map$Entry;}".
     *
     * @param classLoader  the class loader to use to load the class
     * @param className  the class name
     * @param initialize  whether the class must be initialized
     * @return the class represented by {@code className} using the {@code classLoader}
     * @throws ClassNotFoundException if the class is not found
     */
    public static Class<?> getClass(
            final ClassLoader classLoader, final String className, final boolean initialize) throws ClassNotFoundException {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3646);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3647);try {
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3648);Class<?> clazz;
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3649);if ((((abbreviationMap.containsKey(className))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3650)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3651)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3652);final String clsName = "[" + abbreviationMap.get(className);
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3653);clazz = Class.forName(clsName, initialize, classLoader).getComponentType();
            } }else {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3654);clazz = Class.forName(toCanonicalName(className), initialize, classLoader);
            }
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3655);return clazz;
        } catch (final ClassNotFoundException ex) {
            // allow path separators (.) as inner class name separators
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3656);final int lastDotIndex = className.lastIndexOf(PACKAGE_SEPARATOR_CHAR);

            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3657);if ((((lastDotIndex != -1)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3658)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3659)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3660);try {
                    __CLR4_1_22kd2kdl3lqxrqu.R.inc(3661);return getClass(classLoader, className.substring(0, lastDotIndex) +
                            INNER_CLASS_SEPARATOR_CHAR + className.substring(lastDotIndex + 1),
                            initialize);
                } catch (final ClassNotFoundException ex2) { // NOPMD
                    // ignore exception
                }
            }

            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3662);throw ex;
        }
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * Returns the (initialized) class represented by {@code className}
     * using the {@code classLoader}.  This implementation supports
     * the syntaxes "{@code java.util.Map.Entry[]}",
     * "{@code java.util.Map$Entry[]}", "{@code [Ljava.util.Map.Entry;}",
     * and "{@code [Ljava.util.Map$Entry;}".
     *
     * @param classLoader  the class loader to use to load the class
     * @param className  the class name
     * @return the class represented by {@code className} using the {@code classLoader}
     * @throws ClassNotFoundException if the class is not found
     */
    public static Class<?> getClass(final ClassLoader classLoader, final String className) throws ClassNotFoundException {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3663);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3664);return getClass(classLoader, className, true);
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * Returns the (initialized) class represented by {@code className}
     * using the current thread's context class loader. This implementation
     * supports the syntaxes "{@code java.util.Map.Entry[]}",
     * "{@code java.util.Map$Entry[]}", "{@code [Ljava.util.Map.Entry;}",
     * and "{@code [Ljava.util.Map$Entry;}".
     *
     * @param className  the class name
     * @return the class represented by {@code className} using the current thread's context class loader
     * @throws ClassNotFoundException if the class is not found
     */
    public static Class<?> getClass(final String className) throws ClassNotFoundException {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3665);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3666);return getClass(className, true);
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * Returns the class represented by {@code className} using the
     * current thread's context class loader. This implementation supports the
     * syntaxes "{@code java.util.Map.Entry[]}", "{@code java.util.Map$Entry[]}",
     * "{@code [Ljava.util.Map.Entry;}", and "{@code [Ljava.util.Map$Entry;}".
     *
     * @param className  the class name
     * @param initialize  whether the class must be initialized
     * @return the class represented by {@code className} using the current thread's context class loader
     * @throws ClassNotFoundException if the class is not found
     */
    public static Class<?> getClass(final String className, final boolean initialize) throws ClassNotFoundException {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3667);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3668);final ClassLoader contextCL = Thread.currentThread().getContextClassLoader();
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3669);final ClassLoader loader = (((contextCL == null )&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3670)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3671)==0&false))? ClassUtils.class.getClassLoader() : contextCL;
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3672);return getClass(loader, className, initialize);
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    // Public method
    // ----------------------------------------------------------------------
    /**
     * <p>Returns the desired Method much like {@code Class.getMethod}, however
     * it ensures that the returned Method is from a public class or interface and not
     * from an anonymous inner class. This means that the Method is invokable and
     * doesn't fall foul of Java bug
     * <a href="http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4071957">4071957</a>).
     *
     *  <code><pre>Set set = Collections.unmodifiableSet(...);
     *  Method method = ClassUtils.getPublicMethod(set.getClass(), "isEmpty",  new Class[0]);
     *  Object result = method.invoke(set, new Object[]);</pre></code>
     * </p>
     *
     * @param cls  the class to check, not null
     * @param methodName  the name of the method
     * @param parameterTypes  the list of parameters
     * @return the method
     * @throws NullPointerException if the class is null
     * @throws SecurityException if a security violation occurred
     * @throws NoSuchMethodException if the method is not found in the given class
     *  or if the metothod doen't conform with the requirements
     */
    public static Method getPublicMethod(final Class<?> cls, final String methodName, final Class<?>... parameterTypes)
            throws SecurityException, NoSuchMethodException {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3673);

        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3674);final Method declaredMethod = cls.getMethod(methodName, parameterTypes);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3675);if ((((Modifier.isPublic(declaredMethod.getDeclaringClass().getModifiers()))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3676)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3677)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3678);return declaredMethod;
        }

        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3679);final List<Class<?>> candidateClasses = new ArrayList<Class<?>>();
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3680);candidateClasses.addAll(getAllInterfaces(cls));
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3681);candidateClasses.addAll(getAllSuperclasses(cls));

        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3682);for (final Class<?> candidateClass : candidateClasses) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3683);if ((((!Modifier.isPublic(candidateClass.getModifiers()))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3684)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3685)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3686);continue;
            }
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3687);Method candidateMethod;
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3688);try {
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3689);candidateMethod = candidateClass.getMethod(methodName, parameterTypes);
            } catch (final NoSuchMethodException ex) {
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3690);continue;
            }
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3691);if ((((Modifier.isPublic(candidateMethod.getDeclaringClass().getModifiers()))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3692)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3693)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3694);return candidateMethod;
            }
        }}

        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3695);throw new NoSuchMethodException("Can't find a public method for " +
                methodName + " " + ArrayUtils.toString(parameterTypes));
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    // ----------------------------------------------------------------------
    /**
     * Converts a class name to a JLS style class name.
     *
     * @param className  the class name
     * @return the converted name
     */
    private static String toCanonicalName(String className) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3696);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3697);className = StringUtils.deleteWhitespace(className);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3698);if ((((className == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3699)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3700)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3701);throw new NullPointerException("className must not be null.");
        } }else {__CLR4_1_22kd2kdl3lqxrqu.R.inc(3702);if ((((className.endsWith("[]"))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3703)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3704)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3705);final StringBuilder classNameBuffer = new StringBuilder();
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3706);while ((((className.endsWith("[]"))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3707)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3708)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3709);className = className.substring(0, className.length() - 2);
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3710);classNameBuffer.append("[");
            }
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3711);final String abbreviation = abbreviationMap.get(className);
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3712);if ((((abbreviation != null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3713)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3714)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3715);classNameBuffer.append(abbreviation);
            } }else {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3716);classNameBuffer.append("L").append(className).append(";");
            }
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3717);className = classNameBuffer.toString();
        }
        }}__CLR4_1_22kd2kdl3lqxrqu.R.inc(3718);return className;
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Converts an array of {@code Object} in to an array of {@code Class} objects.
     * If any of these objects is null, a null element will be inserted into the array.</p>
     *
     * <p>This method returns {@code null} for a {@code null} input array.</p>
     *
     * @param array an {@code Object} array
     * @return a {@code Class} array, {@code null} if null array input
     * @since 2.4
     */
    public static Class<?>[] toClass(final Object... array) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3719);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3720);if ((((array == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3721)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3722)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3723);return null;
        } }else {__CLR4_1_22kd2kdl3lqxrqu.R.inc(3724);if ((((array.length == 0)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3725)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3726)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3727);return ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        }}__CLR4_1_22kd2kdl3lqxrqu.R.inc(3728);final Class<?>[] classes = new Class[array.length];
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3729);for (int i = 0; (((i < array.length)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3730)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3731)==0&false)); i++) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3732);classes[i] = (((array[i] == null )&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3733)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3734)==0&false))? null : array[i].getClass();
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3735);return classes;
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    // Short canonical name
    // ----------------------------------------------------------------------
    /**
     * <p>Gets the canonical name minus the package name for an {@code Object}.</p>
     *
     * @param object  the class to get the short name for, may be null
     * @param valueIfNull  the value to return if null
     * @return the canonical name of the object without the package name, or the null value
     * @since 2.4
     */
    public static String getShortCanonicalName(final Object object, final String valueIfNull) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3736);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3737);if ((((object == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3738)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3739)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3740);return valueIfNull;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3741);return getShortCanonicalName(object.getClass().getName());
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Gets the canonical name minus the package name from a {@code Class}.</p>
     *
     * @param cls  the class to get the short name for.
     * @return the canonical name without the package name or an empty string
     * @since 2.4
     */
    public static String getShortCanonicalName(final Class<?> cls) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3742);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3743);if ((((cls == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3744)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3745)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3746);return StringUtils.EMPTY;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3747);return getShortCanonicalName(cls.getName());
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Gets the canonical name minus the package name from a String.</p>
     *
     * <p>The string passed in is assumed to be a canonical name - it is not checked.</p>
     *
     * @param canonicalName  the class name to get the short name for
     * @return the canonical name of the class without the package name or an empty string
     * @since 2.4
     */
    public static String getShortCanonicalName(final String canonicalName) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3748);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3749);return ClassUtils.getShortClassName(getCanonicalName(canonicalName));
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    // Package name
    // ----------------------------------------------------------------------
    /**
     * <p>Gets the package name from the canonical name of an {@code Object}.</p>
     *
     * @param object  the class to get the package name for, may be null
     * @param valueIfNull  the value to return if null
     * @return the package name of the object, or the null value
     * @since 2.4
     */
    public static String getPackageCanonicalName(final Object object, final String valueIfNull) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3750);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3751);if ((((object == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3752)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3753)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3754);return valueIfNull;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3755);return getPackageCanonicalName(object.getClass().getName());
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Gets the package name from the canonical name of a {@code Class}.</p>
     *
     * @param cls  the class to get the package name for, may be {@code null}.
     * @return the package name or an empty string
     * @since 2.4
     */
    public static String getPackageCanonicalName(final Class<?> cls) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3756);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3757);if ((((cls == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3758)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3759)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3760);return StringUtils.EMPTY;
        }
        }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3761);return getPackageCanonicalName(cls.getName());
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Gets the package name from the canonical name. </p>
     *
     * <p>The string passed in is assumed to be a canonical name - it is not checked.</p>
     * <p>If the class is unpackaged, return an empty string.</p>
     *
     * @param canonicalName  the canonical name to get the package name for, may be {@code null}
     * @return the package name or an empty string
     * @since 2.4
     */
    public static String getPackageCanonicalName(final String canonicalName) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3762);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3763);return ClassUtils.getPackageName(getCanonicalName(canonicalName));
    }finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

    /**
     * <p>Converts a given name of class into canonical format.
     * If name of class is not a name of array class it returns
     * unchanged name.</p>
     * <p>Example:
     * <ul>
     * <li>{@code getCanonicalName("[I") = "int[]"}</li>
     * <li>{@code getCanonicalName("[Ljava.lang.String;") = "java.lang.String[]"}</li>
     * <li>{@code getCanonicalName("java.lang.String") = "java.lang.String"}</li>
     * </ul>
     * </p>
     *
     * @param className the name of class
     * @return canonical form of class name
     * @since 2.4
     */
    private static String getCanonicalName(String className) {try{__CLR4_1_22kd2kdl3lqxrqu.R.inc(3764);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3765);className = StringUtils.deleteWhitespace(className);
        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3766);if ((((className == null)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3767)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3768)==0&false))) {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3769);return null;
        } }else {{
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3770);int dim = 0;
            __CLR4_1_22kd2kdl3lqxrqu.R.inc(3771);while ((((className.startsWith("["))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3772)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3773)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3774);dim++;
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3775);className = className.substring(1);
            }
            }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3776);if ((((dim < 1)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3777)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3778)==0&false))) {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3779);return className;
            } }else {{
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3780);if ((((className.startsWith("L"))&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3781)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3782)==0&false))) {{
                    __CLR4_1_22kd2kdl3lqxrqu.R.inc(3783);className = className.substring(
                        1,
                        (((className.endsWith(";")
                            )&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3784)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3785)==0&false))? className.length() - 1
                            : className.length());
                } }else {{
                    __CLR4_1_22kd2kdl3lqxrqu.R.inc(3786);if ((((className.length() > 0)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3787)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3788)==0&false))) {{
                        __CLR4_1_22kd2kdl3lqxrqu.R.inc(3789);className = reverseAbbreviationMap.get(className.substring(0, 1));
                    }
                }}
                }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3790);final StringBuilder canonicalClassNameBuffer = new StringBuilder(className);
                __CLR4_1_22kd2kdl3lqxrqu.R.inc(3791);for (int i = 0; (((i < dim)&&(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3792)!=0|true))||(__CLR4_1_22kd2kdl3lqxrqu.R.iget(3793)==0&false)); i++) {{
                    __CLR4_1_22kd2kdl3lqxrqu.R.inc(3794);canonicalClassNameBuffer.append("[]");
                }
                }__CLR4_1_22kd2kdl3lqxrqu.R.inc(3795);return canonicalClassNameBuffer.toString();
            }
        }}
    }}finally{__CLR4_1_22kd2kdl3lqxrqu.R.flushNeeded();}}

}
