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
package org.apache.commons.lang3.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ClassUtils;

/**
 * <p> Utility reflection methods focused on constructors, modeled after
 * {@link MethodUtils}. </p>
 *
 * <h3>Known Limitations</h3> <h4>Accessing Public Constructors In A Default
 * Access Superclass</h4> <p>There is an issue when invoking public constructors
 * contained in a default access superclass. Reflection locates these
 * constructors fine and correctly assigns them as public. However, an
 * <code>IllegalAccessException</code> is thrown if the constructors is
 * invoked.</p>
 *
 * <p><code>ConstructorUtils</code> contains a workaround for this situation. It
 * will attempt to call <code>setAccessible</code> on this constructor. If this
 * call succeeds, then the method can be invoked as normal. This call will only
 * succeed when the application has sufficient security privileges. If this call
 * fails then a warning will be logged and the method may fail.</p>
 *
 * @since 2.5
 * @version $Id$
 */
public class ConstructorUtils {public static class __CLR4_1_2a6ia6il3lqxsih{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,13270,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>ConstructorUtils instances should NOT be constructed in standard
     * programming. Instead, the class should be used as
     * <code>ConstructorUtils.invokeConstructor(cls, args)</code>.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public ConstructorUtils() {
        super();__CLR4_1_2a6ia6il3lqxsih.R.inc(13195);try{__CLR4_1_2a6ia6il3lqxsih.R.inc(13194);
    }finally{__CLR4_1_2a6ia6il3lqxsih.R.flushNeeded();}}

    /**
     * <p>Returns a new instance of the specified class inferring the right constructor
     * from the types of the arguments.</p>
     * 
     * <p>This locates and calls a constructor.
     * The constructor signature must match the argument types by assignment compatibility.</p>
     *
     * @param <T> the type to be constructed
     * @param cls  the class to be constructed, not null
     * @param args  the array of arguments, null treated as empty
     * @return new instance of <code>cls</code>, not null
     *
     * @throws NoSuchMethodException if a matching constructor cannot be found
     * @throws IllegalAccessException if invocation is not permitted by security
     * @throws InvocationTargetException if an error occurs on invocation
     * @throws InstantiationException if an error occurs on instantiation
     * @see #invokeConstructor(java.lang.Class, java.lang.Object[], java.lang.Class[])
     */
    public static <T> T invokeConstructor(final Class<T> cls, Object... args)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {try{__CLR4_1_2a6ia6il3lqxsih.R.inc(13196);
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13197);if ((((args == null)&&(__CLR4_1_2a6ia6il3lqxsih.R.iget(13198)!=0|true))||(__CLR4_1_2a6ia6il3lqxsih.R.iget(13199)==0&false))) {{
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13200);args = ArrayUtils.EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_1_2a6ia6il3lqxsih.R.inc(13201);final Class<?> parameterTypes[] = ClassUtils.toClass(args);
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13202);return invokeConstructor(cls, args, parameterTypes);
    }finally{__CLR4_1_2a6ia6il3lqxsih.R.flushNeeded();}}

    /**
     * <p>Returns a new instance of the specified class choosing the right constructor
     * from the list of parameter types.</p>
     * 
     * <p>This locates and calls a constructor.
     * The constructor signature must match the parameter types by assignment compatibility.</p>
     *
     * @param <T> the type to be constructed
     * @param cls  the class to be constructed, not null
     * @param args  the array of arguments, null treated as empty
     * @param parameterTypes  the array of parameter types, null treated as empty
     * @return new instance of <code>cls</code>, not null
     *
     * @throws NoSuchMethodException if a matching constructor cannot be found
     * @throws IllegalAccessException if invocation is not permitted by security
     * @throws InvocationTargetException if an error occurs on invocation
     * @throws InstantiationException if an error occurs on instantiation
     * @see Constructor#newInstance
     */
    public static <T> T invokeConstructor(final Class<T> cls, Object[] args, Class<?>[] parameterTypes)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {try{__CLR4_1_2a6ia6il3lqxsih.R.inc(13203);
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13204);if ((((parameterTypes == null)&&(__CLR4_1_2a6ia6il3lqxsih.R.iget(13205)!=0|true))||(__CLR4_1_2a6ia6il3lqxsih.R.iget(13206)==0&false))) {{
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13207);parameterTypes = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        }__CLR4_1_2a6ia6il3lqxsih.R.inc(13208);if ((((args == null)&&(__CLR4_1_2a6ia6il3lqxsih.R.iget(13209)!=0|true))||(__CLR4_1_2a6ia6il3lqxsih.R.iget(13210)==0&false))) {{
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13211);args = ArrayUtils.EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_1_2a6ia6il3lqxsih.R.inc(13212);final Constructor<T> ctor = getMatchingAccessibleConstructor(cls, parameterTypes);
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13213);if ((((ctor == null)&&(__CLR4_1_2a6ia6il3lqxsih.R.iget(13214)!=0|true))||(__CLR4_1_2a6ia6il3lqxsih.R.iget(13215)==0&false))) {{
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13216);throw new NoSuchMethodException(
                "No such accessible constructor on object: " + cls.getName());
        }
        }__CLR4_1_2a6ia6il3lqxsih.R.inc(13217);return ctor.newInstance(args);
    }finally{__CLR4_1_2a6ia6il3lqxsih.R.flushNeeded();}}

    /**
     * <p>Returns a new instance of the specified class inferring the right constructor
     * from the types of the arguments.</p>
     *
     * <p>This locates and calls a constructor.
     * The constructor signature must match the argument types exactly.</p>
     *
     * @param <T> the type to be constructed
     * @param cls  the class to be constructed, not null
     * @param args  the array of arguments, null treated as empty
     * @return new instance of <code>cls</code>, not null
     *
     * @throws NoSuchMethodException if a matching constructor cannot be found
     * @throws IllegalAccessException if invocation is not permitted by security
     * @throws InvocationTargetException if an error occurs on invocation
     * @throws InstantiationException if an error occurs on instantiation
     * @see #invokeExactConstructor(java.lang.Class, java.lang.Object[], java.lang.Class[])
     */
    public static <T> T invokeExactConstructor(final Class<T> cls, Object... args)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {try{__CLR4_1_2a6ia6il3lqxsih.R.inc(13218);
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13219);if ((((args == null)&&(__CLR4_1_2a6ia6il3lqxsih.R.iget(13220)!=0|true))||(__CLR4_1_2a6ia6il3lqxsih.R.iget(13221)==0&false))) {{
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13222);args = ArrayUtils.EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_1_2a6ia6il3lqxsih.R.inc(13223);final Class<?> parameterTypes[] = ClassUtils.toClass(args);
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13224);return invokeExactConstructor(cls, args, parameterTypes);
    }finally{__CLR4_1_2a6ia6il3lqxsih.R.flushNeeded();}}

    /**
     * <p>Returns a new instance of the specified class choosing the right constructor
     * from the list of parameter types.</p>
     *
     * <p>This locates and calls a constructor.
     * The constructor signature must match the parameter types exactly.</p>
     *
     * @param <T> the type to be constructed
     * @param cls  the class to be constructed, not null
     * @param args  the array of arguments, null treated as empty
     * @param parameterTypes  the array of parameter types, null treated as empty
     * @return new instance of <code>cls</code>, not null
     *
     * @throws NoSuchMethodException if a matching constructor cannot be found
     * @throws IllegalAccessException if invocation is not permitted by security
     * @throws InvocationTargetException if an error occurs on invocation
     * @throws InstantiationException if an error occurs on instantiation
     * @see Constructor#newInstance
     */
    public static <T> T invokeExactConstructor(final Class<T> cls, Object[] args,
            Class<?>[] parameterTypes) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {try{__CLR4_1_2a6ia6il3lqxsih.R.inc(13225);
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13226);if ((((args == null)&&(__CLR4_1_2a6ia6il3lqxsih.R.iget(13227)!=0|true))||(__CLR4_1_2a6ia6il3lqxsih.R.iget(13228)==0&false))) {{
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13229);args = ArrayUtils.EMPTY_OBJECT_ARRAY;
        }
        }__CLR4_1_2a6ia6il3lqxsih.R.inc(13230);if ((((parameterTypes == null)&&(__CLR4_1_2a6ia6il3lqxsih.R.iget(13231)!=0|true))||(__CLR4_1_2a6ia6il3lqxsih.R.iget(13232)==0&false))) {{
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13233);parameterTypes = ArrayUtils.EMPTY_CLASS_ARRAY;
        }
        }__CLR4_1_2a6ia6il3lqxsih.R.inc(13234);final Constructor<T> ctor = getAccessibleConstructor(cls, parameterTypes);
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13235);if ((((ctor == null)&&(__CLR4_1_2a6ia6il3lqxsih.R.iget(13236)!=0|true))||(__CLR4_1_2a6ia6il3lqxsih.R.iget(13237)==0&false))) {{
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13238);throw new NoSuchMethodException(
                "No such accessible constructor on object: "+ cls.getName());
        }
        }__CLR4_1_2a6ia6il3lqxsih.R.inc(13239);return ctor.newInstance(args);
    }finally{__CLR4_1_2a6ia6il3lqxsih.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Finds a constructor given a class and signature, checking accessibility.</p>
     * 
     * <p>This finds the constructor and ensures that it is accessible.
     * The constructor signature must match the parameter types exactly.</p>
     *
     * @param <T> the constructor type
     * @param cls  the class to find a constructor for, not null
     * @param parameterTypes  the array of parameter types, null treated as empty
     * @return the constructor, null if no matching accessible constructor found
     * @see Class#getConstructor
     * @see #getAccessibleConstructor(java.lang.reflect.Constructor)
     */
    public static <T> Constructor<T> getAccessibleConstructor(final Class<T> cls,
            final Class<?>... parameterTypes) {try{__CLR4_1_2a6ia6il3lqxsih.R.inc(13240);
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13241);try {
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13242);return getAccessibleConstructor(cls.getConstructor(parameterTypes));
        } catch (final NoSuchMethodException e) {
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13243);return null;
        }
    }finally{__CLR4_1_2a6ia6il3lqxsih.R.flushNeeded();}}

    /**
     * <p>Checks if the specified constructor is accessible.</p>
     * 
     * <p>This simply ensures that the constructor is accessible.</p>
     *
     * @param <T> the constructor type
     * @param ctor  the prototype constructor object, not null
     * @return the constructor, null if no matching accessible constructor found
     * @see java.lang.SecurityManager
     */
    public static <T> Constructor<T> getAccessibleConstructor(final Constructor<T> ctor) {try{__CLR4_1_2a6ia6il3lqxsih.R.inc(13244);
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13245);return (((MemberUtils.isAccessible(ctor)
                && Modifier.isPublic(ctor.getDeclaringClass().getModifiers()) )&&(__CLR4_1_2a6ia6il3lqxsih.R.iget(13246)!=0|true))||(__CLR4_1_2a6ia6il3lqxsih.R.iget(13247)==0&false))? ctor : null;
    }finally{__CLR4_1_2a6ia6il3lqxsih.R.flushNeeded();}}

    /**
     * <p>Finds an accessible constructor with compatible parameters.</p>
     * 
     * <p>This checks all the constructor and finds one with compatible parameters
     * This requires that every parameter is assignable from the given parameter types.
     * This is a more flexible search than the normal exact matching algorithm.</p>
     *
     * <p>First it checks if there is a constructor matching the exact signature.
     * If not then all the constructors of the class are checked to see if their
     * signatures are assignment compatible with the parameter types.
     * The first assignment compatible matching constructor is returned.</p>
     *
     * @param <T> the constructor type
     * @param cls  the class to find a constructor for, not null
     * @param parameterTypes find method with compatible parameters
     * @return the constructor, null if no matching accessible constructor found
     */
    public static <T> Constructor<T> getMatchingAccessibleConstructor(final Class<T> cls,
            final Class<?>... parameterTypes) {try{__CLR4_1_2a6ia6il3lqxsih.R.inc(13248);
        // see if we can find the constructor directly
        // most of the time this works and it's much faster
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13249);try {
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13250);final Constructor<T> ctor = cls.getConstructor(parameterTypes);
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13251);MemberUtils.setAccessibleWorkaround(ctor);
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13252);return ctor;
        } catch (final NoSuchMethodException e) { // NOPMD - Swallow
        }
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13253);Constructor<T> result = null;
        /*
         * (1) Class.getConstructors() is documented to return Constructor<T> so as
         * long as the array is not subsequently modified, everything's fine.
         */
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13254);final Constructor<?>[] ctors = cls.getConstructors();

        // return best match:
        __CLR4_1_2a6ia6il3lqxsih.R.inc(13255);for (Constructor<?> ctor : ctors) {{
            // compare parameters
            __CLR4_1_2a6ia6il3lqxsih.R.inc(13256);if ((((ClassUtils.isAssignable(parameterTypes, ctor.getParameterTypes(), true))&&(__CLR4_1_2a6ia6il3lqxsih.R.iget(13257)!=0|true))||(__CLR4_1_2a6ia6il3lqxsih.R.iget(13258)==0&false))) {{
                // get accessible version of constructor
                __CLR4_1_2a6ia6il3lqxsih.R.inc(13259);ctor = getAccessibleConstructor(ctor);
                __CLR4_1_2a6ia6il3lqxsih.R.inc(13260);if ((((ctor != null)&&(__CLR4_1_2a6ia6il3lqxsih.R.iget(13261)!=0|true))||(__CLR4_1_2a6ia6il3lqxsih.R.iget(13262)==0&false))) {{
                    __CLR4_1_2a6ia6il3lqxsih.R.inc(13263);MemberUtils.setAccessibleWorkaround(ctor);
                    __CLR4_1_2a6ia6il3lqxsih.R.inc(13264);if ((((result == null
                            || MemberUtils.compareParameterTypes(ctor.getParameterTypes(), result
                                    .getParameterTypes(), parameterTypes) < 0)&&(__CLR4_1_2a6ia6il3lqxsih.R.iget(13265)!=0|true))||(__CLR4_1_2a6ia6il3lqxsih.R.iget(13266)==0&false))) {{
                        // temporary variable for annotation, see comment above (1)
                        __CLR4_1_2a6ia6il3lqxsih.R.inc(13267);@SuppressWarnings("unchecked")
                        final
                        Constructor<T> constructor = (Constructor<T>)ctor;
                        __CLR4_1_2a6ia6il3lqxsih.R.inc(13268);result = constructor;
                    }
                }}
            }}
        }}
        }__CLR4_1_2a6ia6il3lqxsih.R.inc(13269);return result;
    }finally{__CLR4_1_2a6ia6il3lqxsih.R.flushNeeded();}}

}
