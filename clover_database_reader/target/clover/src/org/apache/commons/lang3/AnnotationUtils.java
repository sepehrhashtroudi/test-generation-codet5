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

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * <p>Helper methods for working with {@link Annotation} instances.</p>
 *
 * <p>This class contains various utility methods that make working with
 * annotations simpler.</p>
 *
 * <p>{@link Annotation} instances are always proxy objects; unfortunately
 * dynamic proxies cannot be depended upon to know how to implement certain
 * methods in the same manner as would be done by "natural" {@link Annotation}s.
 * The methods presented in this class can be used to avoid that possibility. It
 * is of course also possible for dynamic proxies to actually delegate their
 * e.g. {@link Annotation#equals(Object)}/{@link Annotation#hashCode()}/
 * {@link Annotation#toString()} implementations to {@link AnnotationUtils}.</p>
 *
 * <p>#ThreadSafe#</p>
 *
 * @since 3.0
 * @version $Id$
 */
public class AnnotationUtils {public static class __CLR4_1_200l3lqxr9x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,211,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * A style that prints annotations as recommended.
     */
    private static final ToStringStyle TO_STRING_STYLE = new ToStringStyle() {
        /** Serialization version */
        private static final long serialVersionUID = 1L;

        {try{__CLR4_1_200l3lqxr9x.R.inc(0);
            __CLR4_1_200l3lqxr9x.R.inc(1);setDefaultFullDetail(true);
            __CLR4_1_200l3lqxr9x.R.inc(2);setArrayContentDetail(true);
            __CLR4_1_200l3lqxr9x.R.inc(3);setUseClassName(true);
            __CLR4_1_200l3lqxr9x.R.inc(4);setUseShortClassName(true);
            __CLR4_1_200l3lqxr9x.R.inc(5);setUseIdentityHashCode(false);
            __CLR4_1_200l3lqxr9x.R.inc(6);setContentStart("(");
            __CLR4_1_200l3lqxr9x.R.inc(7);setContentEnd(")");
            __CLR4_1_200l3lqxr9x.R.inc(8);setFieldSeparator(", ");
            __CLR4_1_200l3lqxr9x.R.inc(9);setArrayStart("[");
            __CLR4_1_200l3lqxr9x.R.inc(10);setArrayEnd("]");
        }finally{__CLR4_1_200l3lqxr9x.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        protected String getShortClassName(final java.lang.Class<?> cls) {try{__CLR4_1_200l3lqxr9x.R.inc(11);
            __CLR4_1_200l3lqxr9x.R.inc(12);Class<? extends Annotation> annotationType = null;
            __CLR4_1_200l3lqxr9x.R.inc(13);for (final Class<?> iface : ClassUtils.getAllInterfaces(cls)) {{
                __CLR4_1_200l3lqxr9x.R.inc(14);if ((((Annotation.class.isAssignableFrom(iface))&&(__CLR4_1_200l3lqxr9x.R.iget(15)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(16)==0&false))) {{
                    __CLR4_1_200l3lqxr9x.R.inc(17);@SuppressWarnings("unchecked") // OK because we just checked the assignability
                    final
                    Class<? extends Annotation> found = (Class<? extends Annotation>) iface;
                    __CLR4_1_200l3lqxr9x.R.inc(18);annotationType = found;
                    __CLR4_1_200l3lqxr9x.R.inc(19);break;
                }
            }}
            }__CLR4_1_200l3lqxr9x.R.inc(20);return new StringBuilder((((annotationType == null )&&(__CLR4_1_200l3lqxr9x.R.iget(21)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(22)==0&false))? "" : annotationType.getName())
                    .insert(0, '@').toString();
        }finally{__CLR4_1_200l3lqxr9x.R.flushNeeded();}}

        /**
         * {@inheritDoc}
         */
        @Override
        protected void appendDetail(final StringBuffer buffer, final String fieldName, Object value) {try{__CLR4_1_200l3lqxr9x.R.inc(23);
            __CLR4_1_200l3lqxr9x.R.inc(24);if ((((value instanceof Annotation)&&(__CLR4_1_200l3lqxr9x.R.iget(25)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(26)==0&false))) {{
                __CLR4_1_200l3lqxr9x.R.inc(27);value = AnnotationUtils.toString((Annotation) value);
            }
            }__CLR4_1_200l3lqxr9x.R.inc(28);super.appendDetail(buffer, fieldName, value);
        }finally{__CLR4_1_200l3lqxr9x.R.flushNeeded();}}

    };

    /**
     * <p>{@code AnnotationUtils} instances should NOT be constructed in
     * standard programming. Instead, the class should be used statically.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public AnnotationUtils() {try{__CLR4_1_200l3lqxr9x.R.inc(29);
    }finally{__CLR4_1_200l3lqxr9x.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks if two annotations are equal using the criteria for equality
     * presented in the {@link Annotation#equals(Object)} API docs.</p>
     *
     * @param a1 the first Annotation to compare, {@code null} returns
     * {@code false} unless both are {@code null}
     * @param a2 the second Annotation to compare, {@code null} returns
     * {@code false} unless both are {@code null}
     * @return {@code true} if the two annotations are {@code equal} or both
     * {@code null}
     */
    public static boolean equals(final Annotation a1, final Annotation a2) {try{__CLR4_1_200l3lqxr9x.R.inc(30);
        __CLR4_1_200l3lqxr9x.R.inc(31);if ((((a1 == a2)&&(__CLR4_1_200l3lqxr9x.R.iget(32)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(33)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(34);return true;
        }
        }__CLR4_1_200l3lqxr9x.R.inc(35);if ((((a1 == null || a2 == null)&&(__CLR4_1_200l3lqxr9x.R.iget(36)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(37)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(38);return false;
        }
        }__CLR4_1_200l3lqxr9x.R.inc(39);final Class<? extends Annotation> type = a1.annotationType();
        __CLR4_1_200l3lqxr9x.R.inc(40);final Class<? extends Annotation> type2 = a2.annotationType();
        __CLR4_1_200l3lqxr9x.R.inc(41);Validate.notNull(type, "Annotation %s with null annotationType()", a1);
        __CLR4_1_200l3lqxr9x.R.inc(42);Validate.notNull(type2, "Annotation %s with null annotationType()", a2);
        __CLR4_1_200l3lqxr9x.R.inc(43);if ((((!type.equals(type2))&&(__CLR4_1_200l3lqxr9x.R.iget(44)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(45)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(46);return false;
        }
        }__CLR4_1_200l3lqxr9x.R.inc(47);try {
            __CLR4_1_200l3lqxr9x.R.inc(48);for (final Method m : type.getDeclaredMethods()) {{
                __CLR4_1_200l3lqxr9x.R.inc(49);if ((((m.getParameterTypes().length == 0
                        && isValidAnnotationMemberType(m.getReturnType()))&&(__CLR4_1_200l3lqxr9x.R.iget(50)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(51)==0&false))) {{
                    __CLR4_1_200l3lqxr9x.R.inc(52);final Object v1 = m.invoke(a1);
                    __CLR4_1_200l3lqxr9x.R.inc(53);final Object v2 = m.invoke(a2);
                    __CLR4_1_200l3lqxr9x.R.inc(54);if ((((!memberEquals(m.getReturnType(), v1, v2))&&(__CLR4_1_200l3lqxr9x.R.iget(55)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(56)==0&false))) {{
                        __CLR4_1_200l3lqxr9x.R.inc(57);return false;
                    }
                }}
            }}
        }} catch (final IllegalAccessException ex) {
            __CLR4_1_200l3lqxr9x.R.inc(58);return false;
        } catch (final InvocationTargetException ex) {
            __CLR4_1_200l3lqxr9x.R.inc(59);return false;
        }
        __CLR4_1_200l3lqxr9x.R.inc(60);return true;
    }finally{__CLR4_1_200l3lqxr9x.R.flushNeeded();}}

    /**
     * <p>Generate a hash code for the given annotation using the algorithm
     * presented in the {@link Annotation#hashCode()} API docs.</p>
     *
     * @param a the Annotation for a hash code calculation is desired, not
     * {@code null}
     * @return the calculated hash code
     * @throws RuntimeException if an {@code Exception} is encountered during
     * annotation member access
     * @throws IllegalStateException if an annotation method invocation returns
     * {@code null}
     */
    public static int hashCode(final Annotation a) {try{__CLR4_1_200l3lqxr9x.R.inc(61);
        __CLR4_1_200l3lqxr9x.R.inc(62);int result = 0;
        __CLR4_1_200l3lqxr9x.R.inc(63);final Class<? extends Annotation> type = a.annotationType();
        __CLR4_1_200l3lqxr9x.R.inc(64);for (final Method m : type.getDeclaredMethods()) {{
            __CLR4_1_200l3lqxr9x.R.inc(65);try {
                __CLR4_1_200l3lqxr9x.R.inc(66);final Object value = m.invoke(a);
                __CLR4_1_200l3lqxr9x.R.inc(67);if ((((value == null)&&(__CLR4_1_200l3lqxr9x.R.iget(68)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(69)==0&false))) {{
                    __CLR4_1_200l3lqxr9x.R.inc(70);throw new IllegalStateException(
                            String.format("Annotation method %s returned null", m));
                }
                }__CLR4_1_200l3lqxr9x.R.inc(71);result += hashMember(m.getName(), value);
            } catch (final RuntimeException ex) {
                __CLR4_1_200l3lqxr9x.R.inc(72);throw ex;
            } catch (final Exception ex) {
                __CLR4_1_200l3lqxr9x.R.inc(73);throw new RuntimeException(ex);
            }
        }
        }__CLR4_1_200l3lqxr9x.R.inc(74);return result;
    }finally{__CLR4_1_200l3lqxr9x.R.flushNeeded();}}

    /**
     * <p>Generate a string representation of an Annotation, as suggested by
     * {@link Annotation#toString()}.</p>
     *
     * @param a the annotation of which a string representation is desired
     * @return the standard string representation of an annotation, not
     * {@code null}
     */
    public static String toString(final Annotation a) {try{__CLR4_1_200l3lqxr9x.R.inc(75);
        __CLR4_1_200l3lqxr9x.R.inc(76);final ToStringBuilder builder = new ToStringBuilder(a, TO_STRING_STYLE);
        __CLR4_1_200l3lqxr9x.R.inc(77);for (final Method m : a.annotationType().getDeclaredMethods()) {{
            __CLR4_1_200l3lqxr9x.R.inc(78);if ((((m.getParameterTypes().length > 0)&&(__CLR4_1_200l3lqxr9x.R.iget(79)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(80)==0&false))) {{
                __CLR4_1_200l3lqxr9x.R.inc(81);continue; //wtf?
            }
            }__CLR4_1_200l3lqxr9x.R.inc(82);try {
                __CLR4_1_200l3lqxr9x.R.inc(83);builder.append(m.getName(), m.invoke(a));
            } catch (final RuntimeException ex) {
                __CLR4_1_200l3lqxr9x.R.inc(84);throw ex;
            } catch (final Exception ex) {
                __CLR4_1_200l3lqxr9x.R.inc(85);throw new RuntimeException(ex);
            }
        }
        }__CLR4_1_200l3lqxr9x.R.inc(86);return builder.build();
    }finally{__CLR4_1_200l3lqxr9x.R.flushNeeded();}}

    /**
     * <p>Checks if the specified type is permitted as an annotation member.</p>
     *
     * <p>The Java language specification only permits certain types to be used
     * in annotations. These include {@link String}, {@link Class}, primitive
     * types, {@link Annotation}, {@link Enum}, and single-dimensional arrays of
     * these types.</p>
     *
     * @param type the type to check, {@code null}
     * @return {@code true} if the type is a valid type to use in an annotation
     */
    public static boolean isValidAnnotationMemberType(Class<?> type) {try{__CLR4_1_200l3lqxr9x.R.inc(87);
        __CLR4_1_200l3lqxr9x.R.inc(88);if ((((type == null)&&(__CLR4_1_200l3lqxr9x.R.iget(89)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(90)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(91);return false;
        }
        }__CLR4_1_200l3lqxr9x.R.inc(92);if ((((type.isArray())&&(__CLR4_1_200l3lqxr9x.R.iget(93)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(94)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(95);type = type.getComponentType();
        }
        }__CLR4_1_200l3lqxr9x.R.inc(96);return type.isPrimitive() || type.isEnum() || type.isAnnotation()
                || String.class.equals(type) || Class.class.equals(type);
    }finally{__CLR4_1_200l3lqxr9x.R.flushNeeded();}}

    //besides modularity, this has the advantage of autoboxing primitives:
    /**
     * Helper method for generating a hash code for a member of an annotation.
     *
     * @param name the name of the member
     * @param value the value of the member
     * @return a hash code for this member
     */
    private static int hashMember(final String name, final Object value) {try{__CLR4_1_200l3lqxr9x.R.inc(97);
        __CLR4_1_200l3lqxr9x.R.inc(98);final int part1 = name.hashCode() * 127;
        __CLR4_1_200l3lqxr9x.R.inc(99);if ((((value.getClass().isArray())&&(__CLR4_1_200l3lqxr9x.R.iget(100)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(101)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(102);return part1 ^ arrayMemberHash(value.getClass().getComponentType(), value);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(103);if ((((value instanceof Annotation)&&(__CLR4_1_200l3lqxr9x.R.iget(104)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(105)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(106);return part1 ^ hashCode((Annotation) value);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(107);return part1 ^ value.hashCode();
    }finally{__CLR4_1_200l3lqxr9x.R.flushNeeded();}}

    /**
     * Helper method for checking whether two objects of the given type are
     * equal. This method is used to compare the parameters of two annotation
     * instances.
     *
     * @param type the type of the objects to be compared
     * @param o1 the first object
     * @param o2 the second object
     * @return a flag whether these objects are equal
     */
    private static boolean memberEquals(final Class<?> type, final Object o1, final Object o2) {try{__CLR4_1_200l3lqxr9x.R.inc(108);
        __CLR4_1_200l3lqxr9x.R.inc(109);if ((((o1 == o2)&&(__CLR4_1_200l3lqxr9x.R.iget(110)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(111)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(112);return true;
        }
        }__CLR4_1_200l3lqxr9x.R.inc(113);if ((((o1 == null || o2 == null)&&(__CLR4_1_200l3lqxr9x.R.iget(114)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(115)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(116);return false;
        }
        }__CLR4_1_200l3lqxr9x.R.inc(117);if ((((type.isArray())&&(__CLR4_1_200l3lqxr9x.R.iget(118)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(119)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(120);return arrayMemberEquals(type.getComponentType(), o1, o2);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(121);if ((((type.isAnnotation())&&(__CLR4_1_200l3lqxr9x.R.iget(122)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(123)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(124);return equals((Annotation) o1, (Annotation) o2);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(125);return o1.equals(o2);
    }finally{__CLR4_1_200l3lqxr9x.R.flushNeeded();}}

    /**
     * Helper method for comparing two objects of an array type.
     *
     * @param componentType the component type of the array
     * @param o1 the first object
     * @param o2 the second object
     * @return a flag whether these objects are equal
     */
    private static boolean arrayMemberEquals(final Class<?> componentType, final Object o1, final Object o2) {try{__CLR4_1_200l3lqxr9x.R.inc(126);
        __CLR4_1_200l3lqxr9x.R.inc(127);if ((((componentType.isAnnotation())&&(__CLR4_1_200l3lqxr9x.R.iget(128)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(129)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(130);return annotationArrayMemberEquals((Annotation[]) o1, (Annotation[]) o2);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(131);if ((((componentType.equals(Byte.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(132)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(133)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(134);return Arrays.equals((byte[]) o1, (byte[]) o2);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(135);if ((((componentType.equals(Short.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(136)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(137)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(138);return Arrays.equals((short[]) o1, (short[]) o2);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(139);if ((((componentType.equals(Integer.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(140)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(141)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(142);return Arrays.equals((int[]) o1, (int[]) o2);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(143);if ((((componentType.equals(Character.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(144)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(145)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(146);return Arrays.equals((char[]) o1, (char[]) o2);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(147);if ((((componentType.equals(Long.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(148)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(149)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(150);return Arrays.equals((long[]) o1, (long[]) o2);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(151);if ((((componentType.equals(Float.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(152)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(153)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(154);return Arrays.equals((float[]) o1, (float[]) o2);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(155);if ((((componentType.equals(Double.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(156)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(157)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(158);return Arrays.equals((double[]) o1, (double[]) o2);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(159);if ((((componentType.equals(Boolean.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(160)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(161)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(162);return Arrays.equals((boolean[]) o1, (boolean[]) o2);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(163);return Arrays.equals((Object[]) o1, (Object[]) o2);
    }finally{__CLR4_1_200l3lqxr9x.R.flushNeeded();}}

    /**
     * Helper method for comparing two arrays of annotations.
     *
     * @param a1 the first array
     * @param a2 the second array
     * @return a flag whether these arrays are equal
     */
    private static boolean annotationArrayMemberEquals(final Annotation[] a1, final Annotation[] a2) {try{__CLR4_1_200l3lqxr9x.R.inc(164);
        __CLR4_1_200l3lqxr9x.R.inc(165);if ((((a1.length != a2.length)&&(__CLR4_1_200l3lqxr9x.R.iget(166)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(167)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(168);return false;
        }
        }__CLR4_1_200l3lqxr9x.R.inc(169);for (int i = 0; (((i < a1.length)&&(__CLR4_1_200l3lqxr9x.R.iget(170)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(171)==0&false)); i++) {{
            __CLR4_1_200l3lqxr9x.R.inc(172);if ((((!equals(a1[i], a2[i]))&&(__CLR4_1_200l3lqxr9x.R.iget(173)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(174)==0&false))) {{
                __CLR4_1_200l3lqxr9x.R.inc(175);return false;
            }
        }}
        }__CLR4_1_200l3lqxr9x.R.inc(176);return true;
    }finally{__CLR4_1_200l3lqxr9x.R.flushNeeded();}}

    /**
     * Helper method for generating a hash code for an array.
     *
     * @param componentType the component type of the array
     * @param o the array
     * @return a hash code for the specified array
     */
    private static int arrayMemberHash(final Class<?> componentType, final Object o) {try{__CLR4_1_200l3lqxr9x.R.inc(177);
        __CLR4_1_200l3lqxr9x.R.inc(178);if ((((componentType.equals(Byte.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(179)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(180)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(181);return Arrays.hashCode((byte[]) o);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(182);if ((((componentType.equals(Short.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(183)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(184)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(185);return Arrays.hashCode((short[]) o);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(186);if ((((componentType.equals(Integer.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(187)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(188)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(189);return Arrays.hashCode((int[]) o);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(190);if ((((componentType.equals(Character.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(191)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(192)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(193);return Arrays.hashCode((char[]) o);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(194);if ((((componentType.equals(Long.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(195)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(196)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(197);return Arrays.hashCode((long[]) o);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(198);if ((((componentType.equals(Float.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(199)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(200)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(201);return Arrays.hashCode((float[]) o);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(202);if ((((componentType.equals(Double.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(203)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(204)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(205);return Arrays.hashCode((double[]) o);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(206);if ((((componentType.equals(Boolean.TYPE))&&(__CLR4_1_200l3lqxr9x.R.iget(207)!=0|true))||(__CLR4_1_200l3lqxr9x.R.iget(208)==0&false))) {{
            __CLR4_1_200l3lqxr9x.R.inc(209);return Arrays.hashCode((boolean[]) o);
        }
        }__CLR4_1_200l3lqxr9x.R.inc(210);return Arrays.hashCode((Object[]) o);
    }finally{__CLR4_1_200l3lqxr9x.R.flushNeeded();}}
}
